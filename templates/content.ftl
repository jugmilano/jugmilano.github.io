<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
		<#include "head.ftl">
		<title>${content.title}</title>
	</head>
	
	<body class="home">
		<!--[if lt IE 7]>
            <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
        <![endif]-->
    	<div id="wrapper" class="clearfix">
    		<#include "header.ftl">
    		<div id="main" class="inner">
				<section class="clearfix">
    			${content.body}
    			</section>
   			</div>
 		</div> <!-- #wrapper -->
 		<#include "footer.ftl">
 		<#include "script.ftl">
 	</body>
 </html>