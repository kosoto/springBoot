<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="https://d3js.org/d3.v4.min.js"></script>
 <!-- Random number generator -->
 <script src="https://cdnjs.cloudflare.com/ajax/libs/seedrandom/2.4.3/lib/alea.min.js"></script>
 <!-- d3-cloud library -->
 <script src="js/d3.layout.cloud.js"></script>
</head>
<body>
	<div id="cloud-container"></div>
	<script src="js/wordCloud.js"></script>
	<script type="text/javascript">
		WordCloud({
			container : '#cloud-container',
			data : 'json/dummy.json'
		});
	</script>
</body>
</html>