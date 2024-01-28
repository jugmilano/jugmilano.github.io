<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
		<#include "head.ftl">
		<title>${content.title} | ${content.description}</title>
	</head>
	<body class="post">
		<!--[if lt IE 7]>
            <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
        <![endif]-->
    	<div id="wrapper" class="clearfix">
    		<#include "header.ftl">
    		<div id="main" class="inner">
                <hgroup>
                    <h2 class="post-title fadeInUp animated">${content.title}</h2>
                    <p class="date"><span>${content.meetingdate?string.@jugmilanomeetingdate}</span></p>
                </hgroup>

                <div style="text-align:center"><h2>${content.description}</h2></div>
<br/>
L'incontro si terrà ${content.meetingdate?string.@jugmilanomeetingdate}
<#if content.location??>
 presso ${content.location}
</#if>
<#if content.map??>
<a target="_blank" href="${content.map}">(mappa)</a>
</#if>
<#if content.address??>
 in ${content.address}
</#if>
<#if content.thanks??>
 ${content.thanks}
</#if>
.
<br/>

<#if content.schedule??>
<div style="font-weight:bold">Programma</div>
<p>${content.schedule}</p>
</#if>

<!-- here was formspree -->

<#if content.miscdetails??>
<p>
<div id="miscdetails" style="text-align: justify">
${content.miscdetails}
</div>
</p>
</#if>

<p>
<div id="abstract">
<span style="font-weight:bold">Abstract dell'intervento: </span>
<br/>
${content.abstract!""}
</div>
</p>

<p>
<div id="bio">
A cura di <span style="font-weight:bold">${content.speaker!""}:</span>
<br/>
${content.bio!""}
</div>
</p>

      </div> <!-- #wrapper -->
		<#include "footer.ftl">
		<#include "script.ftl">
 	</body>
 </html>
