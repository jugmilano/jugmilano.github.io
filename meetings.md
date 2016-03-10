---
layout: archive
---
<div id="main" class="inner">
	<section class="clearfix">
		<h2 class="post-title">I prossimi incontri del JUG</h2>
		<p>
		<ul>
			{% capture found %}{{"false"}}{% endcapture %}
			{% for post in site.posts %}
			
				{% capture nowunix %}{{'now' | date: '%s'}}{% endcapture %}
				{% capture posttime %}{{post.meetingdate | date: '%s'}}{% endcapture %}
				{% if posttime >= nowunix %}
					{% capture found %}{{"true"}}{% endcapture %}
					<li>
						<a href="{{ post.url }}">
							<h3><b>{{ post.meetingdate | date:"%d %B %Y" }}</b></h3>
						</a>
						{% if post.description %}
							<p><span style="font-size:22px; font-weight:bold"><a href="{{ post.url }}">{{ post.description }}</a></span></p>
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
			{% for post in site.posts %}
				{% capture nowunix %}{{'now' | date: '%s'}}{% endcapture %}
				{% capture posttime %}{{post.meetingdate | date: '%s'}}{% endcapture %}
				{% if posttime < nowunix %}
					<li>
						<a href="{{ post.url }}">
							<h3><b>{{ post.meetingdate | date:"%d %B %Y" }}</b></h3>
						</a>
						{% if post.description %}
							<p><span style="font-size:22px; font-weight:bold"><a href="{{ post.url }}">{{ post.description }}</a></span></p>
						{% endif %}
					</li>
				{% endif %}
			{% endfor %}
		</ul>
		</p>
	</section>
</div>
