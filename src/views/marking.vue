<template>
  <div class="containers">
    <top-nav></top-nav>
    <div class="wrapper">
      <!-- 顶部图片 -->
      <div class="banner">
        <div class="top-img"></div>
      </div>
      <div class="content">
        <!-- 评分系统 -->
        <div class="indent">
        </div>
        <!-- 相关视频 -->
        <div class="related-vedio"></div>
        <!-- 评价列表 -->
        <div class="review-list"></div>
        <!-- 推荐游戏 -->
        <div class="recommendations"></div>
      </div>
      <div class="footer"></div>
    </div>
  </div>
</template>

<script>
import topNav from '../components/topNav.vue'
export default {
  components: { topNav },
  name: 'marking',
  data () {
    return {
    }
  }
}
</script>

<style scoped>
.containers {
  background-color: #302f2d;
  width: 100%;
  height: 1000px;
}

.banner {
  position: relative;
  z-index: 1;
}

.top-img {
  width: 100%;
  height: 440px;
  background-position: top center;
  background-repeat: no-repeat;
  background-size: cover;
  background-image: url(../components/marking/marking-img/guigu.jpg);
  box-shadow:0 0 1px 1px #232322 inset;
}
/*第二种方案
  .top-img::before{
  content: '';
  display: block;
  position: absolute;
  top: 0; bottom: 0; left: 0; right: 0;
  width: 100%;
  height: 440px;
  background-position: center center;
  background-repeat: no-repeat;
  background-size: cover;
  background-image:  url(../components/marking/marking-img/lss.jpg);
  z-index: -1;
  filter: blur(8px);
} */

</style>
