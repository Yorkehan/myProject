<template>
  <div id="sidebar" class="widget-area all-sidebar" style="position: relative; overflow: visible; box-sizing: border-box; min-height: 1px;">
    <AboutSiteSideBar></AboutSiteSideBar>
    <SiteProfileSideBar></SiteProfileSideBar>
    <HotArticleSideBar></HotArticleSideBar>
    <AllTagsSideBar></AllTagsSideBar>
    <RandomArticleSideBar></RandomArticleSideBar>
    <RecentCommentsSideBar></RecentCommentsSideBar>
  </div>
</template>

<script>
    import AboutSiteSideBar from "./all/AboutSiteSideBar";
    import SiteProfileSideBar from "./all/SiteProfileSideBar";
    import HotArticleSideBar from "./all/HotArticleSideBar";
    import AllTagsSideBar from "./all/AllTagsSideBar";
    import RandomArticleSideBar from "./all/RandomArticleSideBar";
    import RecentCommentsSideBar from "./all/RecentCommentsSideBar";
    export default {
        name: "Sidebar",
      components: {
        RecentCommentsSideBar,
        RandomArticleSideBar, AllTagsSideBar, HotArticleSideBar, SiteProfileSideBar, AboutSiteSideBar}
    }
</script>

<style scoped>

</style>
