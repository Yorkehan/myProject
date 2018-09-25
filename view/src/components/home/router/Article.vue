<template>
  <div>
    <div id="content" class="site-content" style="transform: none;">
      <ArticleDetail></ArticleDetail>
      <ArticleDetailSidebar></ArticleDetailSidebar>
    </div>
    <div class="clear"></div>
  </div>
</template>

<script>

    import ArticleDetail from "../../article/ArticleDetail";
    import ArticleDetailSidebar from "../../sidebar/ArticleDetailSidebar";
    export default {
        name: "Article",
      components: {ArticleDetail, ArticleDetailSidebar},
    }
</script>

<style scoped>

</style>
