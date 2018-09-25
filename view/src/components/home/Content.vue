<template>
  <div id="primary" class="content-area">
    <main id="main" class="site-main" role="main" v-for="inda in indexData">

      <article class="post type-post">
        <figure class="thumbnail">
          <!--<a href="http://blog.liuyanzhao.com/article/24">-->
          <router-link v-bind:to="'/article/'+inda.articleCustom.articleId">
            <img v-on:click="setArticleID(inda.articleCustom.articleId)" width="280" height="210" src="http://blogcdn.liuyanzhao.com/img/thumbnail/random/img_24.jpg" class="attachment-content size-content wp-post-image" alt="三次握手和四次挥手">
          </router-link>
          <!--</a>-->
          <span class="cat">
                                <a href="">
                                        {{inda.categoryCustomList[inda.categoryCustomList.length-1].categoryName}}
                                </a>
                            </span>
        </figure>

        <header class="entry-header">
          <h2 class="entry-title">
            <!--<a href="http://blog.liuyanzhao.com/article/24" rel="bookmark">-->
            <router-link v-bind:to="'/article/'+inda.articleCustom.articleId">
              {{inda.articleCustom.articleTitle}}
            </router-link>
          </h2>
        </header>

        <div class="entry-content">
          <div class="archive-content">
            三次握手是什么？TCP是面向连接的，无论哪一方向另一方发送数据之前，都必须先在双方之间建立一条连接。在TCP/IP协议中，TCP协议提供可靠的连接服务，连接是通过三次握手进行初始化的。三次握手的目的是......
          </div>
          <span class="title-l"></span>
          <span class="new-icon">
                                    </span>
          <span class="entry-meta">
                                    <span class="date">
                                        2017年10月08日
                                    &nbsp;&nbsp;
                                    </span>
                                    <span class="views">
                                        <i class="fa fa-eye"></i>
                                            7 views
                                    </span>
                                    <span class="comment">&nbsp;&nbsp;
                                        <a href="http://blog.liuyanzhao.com/article/24#comments" rel="external nofollow">
                                          <i class="fa fa-comment-o"></i>

                                                    发表评论
                                                </a>
                                    </span>
                                </span>
          <div class="clear"></div>
        </div><!-- .entry-content -->

        <span class="entry-more">
                                <!--<a href="http://blog.liuyanzhao.com/article/24" rel="bookmark">-->
            <router-link v-bind:to="'/article/'+inda.articleCustom.articleId">
                                    阅读全文
              <!--</a>-->
            </router-link>
                            </span>
      </article>
    </main>

    <nav class="navigation pagination" role="navigation">
      <div class="nav-links">
        <a class="page-numbers current"  v-on:click="nextPage(1)">1</a>
        <router-link class="page-numbers" v-bind:to="'/p/'+2">2</router-link>
        <a class="page-numbers" href="/p/3">3</a>
        <a class="page-numbers" href="http://blog.liuyanzhao.com/p/2">
          <span class="fa fa-angle-right"></span>
        </a>
      </div>
    </nav>
  </div>
</template>

<script>
  import {mapState} from 'vuex'
  export default {
      name: "Content",
      data(){
        return{
          indexData:''
        }
      },
      created(){
        const id=this.$route.params.pageNum;
        this.$axios.post("/api/").then((viewdata)=>{
          this.indexData=viewdata.data;
          console.log(id);
        })
      },

    computed:mapState({
      articleId:state => state.articleId
    }),
      methods:{
        setArticleID:function (articleId) {
          this.$store.commit('setArticleId',articleId);
          localStorage.setItem("articleId", articleId);
        },
        nextPage:function (pageNum) {
          this.$axios.post("/api/p/2").then((viewdata)=>{
            this.indexData=viewdata.data;
          })
        }
      }
    }
</script>

<style scoped>

</style>
