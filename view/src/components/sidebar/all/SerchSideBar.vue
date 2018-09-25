<template>
  <aside class="widget widget_search">
    <div class="searchbar">
      <form method="get" id="searchform1" action="http://blog.liuyanzhao.com/search">
                        <span> <input type="text" value="" name="query" id="s1" placeholder="输入搜索内容" required="">
                            <button type="submit" id="searchsubmit1">搜索</button>
                        </span>
      </form>
    </div>
    <div class="clear"></div>
  </aside>
</template>

<script>
    export default {
        name: "SerchSideBar"
    }
</script>

<style scoped>

</style>
