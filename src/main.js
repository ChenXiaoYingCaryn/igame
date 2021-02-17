import Vue from 'vue'
import igame from './igame.vue'
import './plugins/element.js'
import router from './router'

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(igame)
}).$mount('#app')
