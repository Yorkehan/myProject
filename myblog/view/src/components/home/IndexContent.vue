<template>
  <div>
  <div id="content" class="site-content" style="transform: none;">
      <Content></Content>
      <IndexSidebar></IndexSidebar>
  </div>
  <div class="clear"></div>
  <div class="links-box">
    <div id="links">
      <ul class="lx7">
        <li class="link-f link-name">
          <a href="http://codergroup.cn/" target="_blank">
            开发者社区</a>
        </li>
      </ul>
      <ul class="lx7">
        <li class="link-f link-name">
          <a href="http://liuyanzhao.com/" target="_blank">
            言曌博客</a>
        </li>
      </ul>
      <div class="clear"></div>
    </div>
  </div>
  </div>
</template>

<script>
    import IndexSidebar from "../sidebar/IndexSidebar";
    import Content from "./Content";
    export default {
        name: "PageContent",
      components: {Content, IndexSidebar}
    }
</script>

<style scoped>

</style>
