<template>
  <div id="page" class="site" style="transform: none;">
    <PageHeader></PageHeader>
    <router-view></router-view>
    <PageFooter></PageFooter>
    <Scroll></Scroll>
  </div>
</template>

<script>
import PageHeader from '../public/PageHeader'
import Content from './IndexContent'
import PageFooter from '../public/PageFooter'
import Scroll from "../public/Scroll";



    export default {
      name: "Index",
      components: {Scroll, Content,PageHeader,PageFooter},
    }
</script>

<style scoped>

</style>
