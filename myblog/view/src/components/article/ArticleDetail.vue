<template>
  <div id="primary" class="content-area">
    <main id="main" class="site-main" role="main">
      <article class="post">
        <header class="entry-header">
          <h1 class="entry-title">{{articleDetailVo.articleCustom.articleTitle}}</h1>
        </header><!-- .entry-header -->
        <div class="entry-content">
          <div class="single-content" v-html=articleDetailVo.articleCustom.articleContent>
          <div class="s-weixin">
            <ul class="weimg1">
              <li><strong>微信</strong></li>
              <li>赶快加我聊天吧</li>
              <li><img src=""></li>
            </ul>
            <ul class="weimg2">
              <li><strong>博客交流群</strong></li>
              <li>海纳百川，大家来水</li>
              <li><img src="" alt="weinxin"></li>
            </ul>
            <div class="clear"></div>
          </div>
          <div class="clear"></div>
          <div id="social">
            <div class="social-main">
                                    <span class="like">
                                        <a href="javascript:;" data-action="ding" data-id="1" title="点赞" class="favorite" onclick="increaseLikeCount()">
                                            <i class="fa fa-thumbs-up"></i>赞
                                            <i class="count" id="count-24">0</i>
                                        </a>
                                    </span>
              <div class="shang-p">
                <div class="shang-empty">
                  <span></span>
                </div>
                <span class="shang-s">
                                              <a onclick="PaymentUtils.show();" style="cursor:pointer">赏</a>
                                        </span>
              </div>
              <div class="share-sd">
                                        <span class="share-s" style="margin-top: 25px!important;">
                                            <a href="javascript:void(0)" id="share-s" title="分享">
                                                <i class="fa fa-share-alt"></i>分享
                                            </a>
                                        </span>
                <div id="share">
                  <ul class="bdsharebuttonbox bdshare-button-style0-16" data-bd-bind="1531040174280">
                    <li><a title="更多" class="bds_more fa fa-plus-square" data-cmd="more" onclick="return false;" href="http://blog.liuyanzhao.com/article/24#"></a></li>
                    <li><a title="分享到QQ空间" class="fa fa-qq" data-cmd="qzone" onclick="return false;" href="http://blog.liuyanzhao.com/article/24#"></a></li>
                    <li><a title="分享到新浪微博" class="fa fa-weibo" data-cmd="tsina" onclick="return false;" href="http://blog.liuyanzhao.com/article/24#"></a></li>
                    <li><a title="分享到腾讯微博" class="fa fa-pinterest-square" data-cmd="tqq" onclick="return false;" href="http://blog.liuyanzhao.com/article/24#"></a></li>
                    <li><a title="分享到人人网" class="fa fa-renren" data-cmd="renren" onclick="return false;" href="http://blog.liuyanzhao.com/article/24#"></a></li>
                    <li><a title="分享到微信" class="fa fa-weixin" data-cmd="weixin" onclick="return false;" href="http://blog.liuyanzhao.com/article/24#"></a></li>
                  </ul>
                </div>
              </div>
              <div class="clear"></div>
            </div>
          </div>

          <footer class="single-footer">
            <ul class="single-meta">
              <li class="comment">
                <a href="http://blog.liuyanzhao.com/article/24#comments" rel="external nofollow">
                  <i class="fa fa-comment-o"></i>
                  <i class="comment-count">0</i>
                </a>
              </li>
              <li class="views">
                <i class="fa fa-eye"></i> <span class="articleViewCount">16</span>
                views
              </li>
              <li class="r-hide">
                <a href="javascript:pr()" title="侧边栏">
                  <i class="fa fa-caret-left"></i>
                  <i class="fa fa-caret-right"></i>
                </a>
              </li>
            </ul>
            <ul id="fontsize">
              <li>A+</li>
            </ul>
            <div class="single-cat-tag">
              <div class="single-cat">所属分类：
                <a href="http://blog.liuyanzhao.com/category/10">
                  计算机科学</a>
                <a href="http://blog.liuyanzhao.com/category/11">
                  数据结构和算法</a>
              </div>
            </div>
          </footer><!-- .entry-footer -->


          <div class="clear"></div>
        </div><!-- .entry-content -->
        </div>
      </article><!-- #post -->

      <div class="single-tag">
        <ul class="" data-wow-delay="0.3s">
          <li>
            <a href="http://blog.liuyanzhao.com/tag/6" rel="tag" style="background:#666666">
              计算机网络</a>
          </li>
        </ul>
      </div>
      <div class="authorbio wow fadeInUp">
        <img alt="言曌" src="" class="avatar avatar-64 photo" height="64" width="64">
        <ul class="postinfo">
          <li></li>
          <li><strong>版权声明：</strong>本站原创文章，于2017-10-08，由
            <strong>
              言曌</strong>
            发表。
          </li>
          <li class="reprinted"><strong>转载请注明：</strong>
            <a href="http://blog.liuyanzhao.com/article/24" rel="bookmark" title="本文固定链接 /article/24">
              三次握手和四次挥手 | 风吟博客</a>
          </li>
        </ul>
        <div class="clear"></div>
      </div>
      <div id="single-widget">
        <div class="wow fadeInUp" data-wow-delay="0.3s">
          <aside id="related_post-2" class="widget">
            <h3 class="widget-title">
              <span class="s-icon"></span>相关文章
            </h3>
            <div id="related_post_widget">
              <ul>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/24">三次握手和四次挥手</a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/23">史上最清晰的红黑树讲解</a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/17">数据表的垂直拆分和水平拆分</a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/16">MySQL存储引擎－－MyISAM与InnoDB区别</a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/13">sql语句分为三类(DML,DDL,DCL)-介绍</a>
                </li>
              </ul>
            </div>
            <div class="clear"></div>
          </aside>
          <aside id="hot_post-8" class="widget hot_post">
            <h3 class="widget-title"><span class="s-icon"></span>猜你喜欢</h3>
            <div id="hot_post_widget">
              <ul>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/17">
                    数据表的垂直拆分和水平拆分</a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/16">
                    MySQL存储引擎－－MyISAM与InnoDB区别</a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/8">
                    Mybatis高级映射多对多查询</a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/15">
                    JSP 中 forward 转发 和 sendRedirect 重定向的区别</a>
                </li>
                <li>
                  <a href="http://blog.liuyanzhao.com/article/13">
                    sql语句分为三类(DML,DDL,DCL)-介绍</a>
                </li>
              </ul>
            </div>
            <div class="clear"></div>
          </aside>
        </div>
        <div class="clear"></div>
      </div>
      <nav class="nav-single">
        <a href="http://blog.liuyanzhao.com/article/1" rel="next">
                            <span class="meta-nav">
                                <span class="post-nav">上一篇
                                 <i class="fa fa-angle-left"></i>
                                </span>
                                <br>[转载]SpringMVC中使用Interceptor拦截器</span>
        </a>
        <span class="meta-nav">
                                <span class="post-nav">
                                    没有了<br>
                                </span>已是最后文章
                             </span>
        <div class="clear"></div>
      </nav>
      <div class="scroll-comments"></div>
      <div id="comments" class="comments-area">
        <div id="respond" class="comment-respond">
          <h3 id="reply-title" class="comment-reply-title"><span id="reply-title-word">发表评论</span>
            <a rel="nofollow" id="cancel-comment-reply-link" href="http://blog.liuyanzhao.com/article/24#respond" style="">取消回复</a>
          </h3>
          <form id="comment_form" method="post">
            <p class="comment-form-comment">
              <textarea id="comment" name="commentContent" rows="4" tabindex="1" required=""></textarea>
            </p>
            <div id="comment-author-info">
              <input type="hidden" name="commentPid" value="0">
              <input type="hidden" name="commentPname" value="">
              <input type="hidden" name="commentRole" value="0">
              <p class="comment-form-author">
                <label for="author_name">
                  昵称<span class="required">*</span>
                </label>
                <input type="text" name="commentAuthorName" id="author_name" class="" value="" tabindex="2" required="">
              </p>
              <p class="comment-form-email">
                <label for="author_email">
                  邮箱<span class="required">*</span>
                </label>
                <input type="email" name="commentAuthorEmail" id="author_email" class="" value="" tabindex="3" required="">
              </p>
              <p class="comment-form-url">
                <label for="author_url">网址</label>
                <input type="url" name="commentAuthorUrl" id="author_url" class="" value="" tabindex="4">
              </p>
            </div>
            <div class="clear"></div>
            <p class="form-submit">
              <input id="submit" name="submit" type="submit" tabindex="5" value="提交评论">
              <input type="hidden" name="commentArticleId" value="24" id="article_id">
              <input type="hidden" name="commentPid" id="comment_pid" value="0">
            </p>
          </form>
        </div>

        <ol class="comment-list">
        </ol>
      </div>
    </main>
    <!-- .site-main -->
  </div>
</template>

<script>
    export default {
        name: "Description",
      data(){
        return{
          articleDetailVo:''
        }
      },
      created(){
        const articleId=localStorage.getItem("articleId");
        this.$axios.post("/api/article/"+articleId).then((articleData)=>{
          this.articleDetailVo=articleData.data;
          console.log(this.articleDetailVo);
        })
      }
    }
</script>

<style scoped>

</style>
