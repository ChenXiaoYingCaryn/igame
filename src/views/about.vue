<template>

  <div class="container">
    <div class="content">
      <div class="info"></div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'about'
}
</script>

<style scoped>
.container {
  background: url("../../img/gaming.jpg") center center / cover no-repeat fixed;
  width: 100%;
  height: 100%;
  padding: 0;
  margin: 0;
}

.content {
  height: 400px;
  width: 600px;
  word-break: break-all;
  z-index: 10;
  position: absolute;
  top: 50%;
  left: 50%;
  /* margin-top: -200px;
  margin-left: -300px; */
  overflow: hidden;
}

.content:before {
  content: '';
  background: url("../../img/gaming.jpg") center center / cover no-repeat fixed;
  filter: blur(10px);
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  z-index: -1;
  margin: -30px;
}

.info {
  padding: 40px;
  color: #fff;
}
</style>
