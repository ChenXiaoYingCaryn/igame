import Vue from 'vue'
import VueRouter from 'vue-router'
import home from '../views/home.vue' 
// import topNav from '../components/topNav.vue'
// import functionNav from '../components/functionNav.vue'

Vue.use(VueRouter)

const router = new VueRouter({
  routes: [
    {path: '/', redirect:'/home'},
    {path: '/home', name: "home", component: home}
    // {path: '/', component: topNav},
    // {path: '/', component: functionNav}
  ]
})

export default router
