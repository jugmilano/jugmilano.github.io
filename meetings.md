---
layout: archive
---
<div id="main" class="inner">
	<section class="clearfix">
		<h2 class="post-title">I prossimi incontri del JUG</h2>
		<p>
		<ul>
			{% capture found %}{{"false"}}{% endcapture %}
			{% for page in site.posts %}
			
				{% capture nowunix %}{{'now' | date: '%s'}}{% endcapture %}
				{% capture posttime %}{{page.meetingdate | date: '%s'}}{% endcapture %}
				{% if posttime >= nowunix %}
					{% capture found %}{{"true"}}{% endcapture %}
					<li>
						<a href="{{ page.url }}">
							<h3><b>{% include formatted_date.html %}</b></h3>
						</a>
						{% if page.description %}
							<p><span style="font-size:22px; font-weight:bold"><a href="{{ page.url }}">{{ page.description }}</a></span></p>
						{% endif %}
					</li>
				{% endif %}
			{% endfor %}
			{% if found == "false"%}
				<br/><span style="font-size:22px">Stiamo organizzando il prossimo meeting.<br/>Iscriviti alla nostra <a href="/#contact">mailing list</a> per rimanere aggiornato!</span>
				<h3>&nbsp;</h3>
			{% endif %}
		</ul>
		</p>
		
		<p><br/>
		<h2 class="post-title">Gli scorsi incontri del JUG</h2>
		<ul>
			{% for page in site.posts %}
				{% capture nowunix %}{{'now' | date: '%s'}}{% endcapture %}
				{% capture posttime %}{{page.meetingdate | date: '%s'}}{% endcapture %}
				{% if posttime < nowunix %}
					<li>
						<a href="{{ page.url }}">
							<h3><b>{% include formatted_date.html %}</b></h3>
						</a>
						{% if page.description %}
							<p><span style="font-size:22px; font-weight:bold"><a href="{{ page.url }}">{{ page.description }}</a></span></p>
						{% endif %}
					</li>
				{% endif %}
			{% endfor %}
		</ul>
		</p>
	</section>
</div>
