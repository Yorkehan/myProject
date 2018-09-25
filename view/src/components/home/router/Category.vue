<template>
  <div>
  <div id="content" class="site-content" style="transform: none;">
    <Content></Content>
    <ArticleSidebar></ArticleSidebar>
  </div>
    <div class="clear"></div>
  </div>
</template>

<script>
  import Content from '../Content'
  import ArticleSidebar from "../../sidebar/ArticleDetailSidebar";
    export default {
        name: "Category",
      components: { Content,ArticleSidebar},
    }
</script>

<style scoped>

</style>
