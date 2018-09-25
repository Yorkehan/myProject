<template>
  <ul id="scroll">
    <li class="log log-no">
      <a class="log-button" title="文章目录"><i class="fa fa-bars"></i></a>
      <div class="log-prompt" style="display: none;">
        <div class="log-arrow">文章目录</div></div></li>
    <li>
      <a class="scroll-h" title="返回顶部"><i class="fa fa-angle-up"></i></a>
    </li>
    <li><a class="scroll-b" title="转到底部"><i class="fa fa-angle-down"></i></a></li>
  </ul>
</template>

<script>
    export default {
        name: "Scroll"
    }
</script>

<style scoped>

</style>
