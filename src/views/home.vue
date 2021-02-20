<template>
    <div class="home">
        <!-- 导航栏 -->
        <top-nav></top-nav>
        <functionNav></functionNav>

        <!-- 轮播图 -->
        <div class="block">
            <!-- <span class="demonstration">默认 Hover 指示器触发</span> -->
            <el-carousel height="600px">
                <el-carousel-item v-for="item in bannerBox" :key="item.id">
                    <!-- <h3 class="small">{{ item }}</h3> -->
                    <img v-bind:src="item.url" width="100%">
                </el-carousel-item>
            </el-carousel>
        </div>

        <!-- 热门游戏推荐 -->
        <hot-game></hot-game>

        <!-- 专区 -->
        <special></special>
        <special></special>
        <special></special>


        <!-- 资讯专栏 -->
        <info></info>
    </div>
</template>

<script>
import functionNav from '../components/functionNav.vue'
import topNav from '../components/topNav'
import TopNav from '../components/topNav.vue'
// import hotGame from '../components/hotGame.vue'
import HotGame from '../components/hotGame.vue'
// import FunctionNav from '../components/functionNav.vue'
import special from '../components/special.vue'
import info from '../components/info.vue'

export default {
    name: 'home',
    components:{ functionNav, topNav, TopNav, HotGame, special, info},
    data(){
        return{
            bannerBox:[
                {id:0,url:require("../assets/picture/1.jpg")},
                {id:1,url:require("../assets/picture/2.jpg")},
                {id:2,url:require("../assets/picture/3.jpg")},
                {id:3,url:require("../assets/picture/4.jpg")},
            ]
        }
    }
}
</script>

<style scoped>
  .home{
      width: 100%;
      margin: 0 auto;
      background-color: #302F2D;
  }
  .el-carousel-item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
  }

  .el-carousel-item:nth-child(2n) {
     background-color: #99a9bf;
  }
  
  .el-carousel-item:nth-child(2n+1) {
     background-color: #d3dce6;
  }
</style>