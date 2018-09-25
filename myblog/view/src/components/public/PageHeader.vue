<template>
  <div>
    <header id="masthead" class="site-header">
    <nav id="top-header">
      <div class="top-nav">
        <div class="user-login">
          <a href="http://blog.liuyanzhao.com/admin">登录</a>
        </div>
        <div class="menu-topmenu-container">
          <ul id="menu-topmenu" class="top-menu">
            <li class="menu-item">
              <a href="http://codergroup.cn/">
                <i class=""></i>
                <span class="font-text">欢迎访问开发者社区&nbsp;</span>&nbsp;
              </a>
            </li>
            <li class="menu-item">
              <a href="http://blog.liuyanzhao.com/applyLink">
                <i class="fa fa-link"></i>
                <span class="font-text">申请友链&nbsp;</span>&nbsp;
              </a>
            </li>
            <li class="menu-item">
            </li>
            <li class="menu-item">
              <a href="http://blog.liuyanzhao.com/articleFile">
                <i class="fa-list-alt fa"></i>
                <span class="font-text">文章归档&nbsp;</span>&nbsp;
              </a>
            </li>
            <li class="menu-item">
            </li>
            <li class="menu-item">
              <a href="http://blog.liuyanzhao.com/aboutSite">
                <i class="fa fa-info"></i>
                <span class="font-text">关于本站&nbsp;</span>&nbsp;
              </a>
            </li>
          </ul>
        </div>
      </div>
    </nav><!-- #top-header -->
    <div id="menu-box">
      <div id="top-menu">
                <span class="nav-search">
                    <i class="fa fa-search"></i>
                </span>
        <div class="logo-site"><h1 class="site-title">
          <a href="http://blog.liuyanzhao.com/" title="风吟博客">风吟博客</a>
        </h1>
          <p class="site-description">莫问收获，但问耕耘。</p>
        </div><!-- .logo-site -->
        <div id="site-nav-wrap">
          <div id="sidr-close">
            <a href="http://blog.liuyanzhao.com/#sidr-close" class="toggle-sidr-close">×</a>
          </div>
          <nav id="site-nav" class="main-nav">
            <a href="http://blog.liuyanzhao.com/#sidr-main" id="navigation-toggle" class="bars">
              <i class="fa fa-bars"></i>
            </a>
            <div class="menu-pcmenu-container">
              <ul id="menu-pcmenu" class="down-menu nav-menu">

                <li>
                  <router-link to="/">
                    <i class="fa-home fa"></i>
                    <span class="font-text">首页</span>
                  </router-link>
                </li>

                <li>
                  <!--<a href="http://blog.liuyanzhao.com/category/1" class="sf-with-ul">-->
                  <router-link to="/category/1">
                    <i class="fa fa-coffee"></i>
                    <span class="font-text">Java&nbsp;</span>
                  </router-link>
                <!--  </a>-->
                  <ul class="sub-menu">
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/2" target="_blank">Java基础</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/3" target="_blank">Core Java</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/4" target="_blank">多线程并发编程</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/5" target="_blank">Sockets和IO</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/6" target="_blank">设计模式和反射</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/7" target="_blank">JVM</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/8" target="_blank">JavaWeb</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/9" target="_blank">Java框架</a>
                    </li>
                  </ul>
                </li>
                <li>
                  <router-link to="/category/2">
                    <i class="fa fa-cubes"></i>
                    <span class="font-text">计算机科学&nbsp;</span>
                  </router-link>
                  <ul class="sub-menu">
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/11" target="_blank">数据结构和算法</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/12" target="_blank">操作系统</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/13" target="_blank">数据库</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/14" target="_blank">计算机网络</a>
                    </li>
                  </ul>
                </li>
                <li>
                  <router-link to="/category/3">
                    <i class="fa-snowflake-o fa"></i>
                    <span class="font-text">其他技术&nbsp;</span>
                  </router-link>
                  <ul class="sub-menu">
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/16" target="_blank">消息服务</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/17" target="_blank">缓存服务</a>
                    </li>
                    <li>
                      <a href="http://blog.liuyanzhao.com/category/18" target="_blank">负载均衡</a>
                    </li>
                  </ul>
                </li>
                <li>
                  <a href="https://liuyanzhao.com/">
                    <i class="fa fa-heart"></i>
                    <span class="font-text">言曌博客&nbsp;</span>
                  </a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/message">
                    <i class="fa fa-comment"></i>
                    <span class="font-text">留言板&nbsp;</span>
                  </a>
                </li>
              </ul>
            </div>
          </nav>
        </div>
        <div class="clear"></div>
      </div><!-- #top-menu -->
    </div><!-- #menu-box -->
  </header><!-- #masthead -->
    <div id="search-main">
      <div class="searchbar">
        <form method="get" id="searchform" action="http://blog.liuyanzhao.com/search">
                <span>
                    <input type="text" value="" name="query" id="s" placeholder="输入搜索内容" required="">
                    <button type="submit" id="searchsubmit">搜索</button>
                </span>
        </form>
      </div>
      <div class="clear"></div>
    </div>
    <nav class="breadcrumb">
      <div class="bull"><i class="fa fa-volume-up"></i></div>
      <div id="scrolldiv">
        <div class="scrolltext">
          <ul style="margin-top: 0px;">


            <li class="scrolltext-title">
              <a href="http://blog.liuyanzhao.com/notice/1" rel="bookmark">本站下载地址</a>
            </li><li class="scrolltext-title">
            <a href="http://blog.liuyanzhao.com/notice/2" rel="bookmark">后台测试密码已修改，请在本地测试</a>
          </li></ul>
        </div>
      </div>
    </nav>
  </div>

</template>

<script>
    export default {
      name: "PageHeader",
    }
</script>

<style scoped>

</style>
