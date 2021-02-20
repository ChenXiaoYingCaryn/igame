import Vue from 'vue'
import VueRouter from 'vue-router'

const home = () => import('../views/home.vue')
const login = () => import('../views/login.vue')
const test = () => import('../views/test.vue')
const marking = () => import('../views/marking.vue')

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
      path: '/test',
      name: 'test',
      component: test
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
      path: '/marking',
      name: 'marking',
      component: marking
    }
  ]
})
