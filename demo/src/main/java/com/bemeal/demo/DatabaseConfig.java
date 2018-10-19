package com.bemeal.demo;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages="com.bemeal.demo.mapper")
@ComponentScan(basePackages="com.bemeal.demo") //없어도 됨
public class DatabaseConfig {
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean(); //final로 수정 불가로 만들기
		sqlSessionFactory.setDataSource(dataSource);
		PathMatchingResourcePatternResolver rs = new PathMatchingResourcePatternResolver();
		sqlSessionFactory.setMapperLocations(rs.getResources("classpath:com/bemeal/demo/mapper/*.xml"));
		return sqlSessionFactory.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sf) {
		final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sf);
		return sqlSessionTemplate; 
	}
}








