import Vue from 'vue'
import VueRouter from 'vue-router'

const home = () => import('../views/home.vue')
const login = () => import('../views/login.vue')
const about = () => import('../views/about.vue')
const mark = () => import('../views/mark.vue')

Vue.use(VueRouter)

export default new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: '',
      component: login
    },
    {
      path: '/about',
      name: 'about',
      component: about
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
      path: '/home',
      name: 'home',
      component: home
    },
    {
      path: '/mark',
      name: 'mark',
      component: mark
    }
  ]
})
