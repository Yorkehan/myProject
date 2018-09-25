import Vue from 'vue'
import Router from 'vue-router'
import vuex from "vuex";

import Index from '../components/home/Index'
import Article from '../components/home/router/Article'
import Category from '../components/home/router/Category'
import Tag from '../components/home/router/Tag'
import IndexContent from '../components/home/IndexContent'

Vue.use(Router);
export default new Router({
  routes: [
    {
      path: '/',
      name: 'Index',
      component: Index,
      children: [
        {
          path: '/',
          name: 'IndexContent',
          component: IndexContent,
        },
        {
          path: '/p/:pageNum',
          name: 'IndexContent',
          component: IndexContent,
        },
        {
          path: '/category/:id',
          name: 'Category',
          component: Category
        },
        {
          path:'/article/:id',
          name:'Article',
          component: Article
        },
        {
          path:'/tag/:id',
          name:'Tag',
          component: Tag
        },
      ]

    },
  ]
})




