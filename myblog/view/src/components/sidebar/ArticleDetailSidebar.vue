<template>
  <div id="sidebar" class="widget-area all-sidebar" style="position: relative; overflow: visible; box-sizing: border-box; min-height: 1px;">
    <SerchSideBar></SerchSideBar>
    <HotArticleSideBar></HotArticleSideBar>
    <AllTagsSideBar></AllTagsSideBar>
    <RandomArticleSideBar></RandomArticleSideBar>
  </div>
</template>

<script>
    import SerchSideBar from "./all/SerchSideBar";
    import HotArticleSideBar from "./all/HotArticleSideBar";
    import RandomArticleSideBar from "./all/RandomArticleSideBar";
    import AllTagsSideBar from "./all/AllTagsSideBar";
    export default {
        name: "DescriptionSidebar",
      components: {AllTagsSideBar, RandomArticleSideBar, HotArticleSideBar, SerchSideBar}
    }
</script>

<style scoped>

</style>
