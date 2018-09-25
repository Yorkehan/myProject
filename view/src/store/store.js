import Vue from 'vue'
import vuex from 'vuex'
Vue.use(vuex);

export default new vuex.Store({
  state:{
    articleId:''
  },
  mutations:{
    "setArticleId": function(state ,  articleId) {
      state.articleId = articleId
    }
  },
  getters: {
    "getArticleId": function(state) {
      console.log('获取', state.articleId);
      return state.articleId
    }
  },
  actions: {
    "setArticleId": function(state, articleId) {
      console.log('获取', state.articleId);
      store.commit("setArticleId", articleId)
    }
  }
});
