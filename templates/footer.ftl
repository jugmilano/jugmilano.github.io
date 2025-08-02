<footer id="footer" class="clearfix">
  <p>&nbsp;</p><p>&nbsp;</p>
  <div class="inner clearfix">
    <div class="col col-1">
      <nav>
        <ul>
          <#include "links.ftl">
        </ul>
      </nav>
      <p class="copyright">&#169;  {{ site.time | date: '%Y' }}  ${config.site_user_name}</p><p>&nbsp;</p>
    </div>
    
    <div class="col col-2">
		<#include "social.ftl">
    </div>
    <a href="#header" class="back-to-top">Back to Top</a>
  </div>
</footer>
