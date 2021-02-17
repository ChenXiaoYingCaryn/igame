<template>
  <div class="container">
    <p>login</p>

    <div class="form-box">
      <div class="box-base login-box" :class="showSign?'retate-sign':''">
        <login-form></login-form>
        <div class="change-box to-sign">
          <div class="change-sign" @click="updateRotate">去注册</div>
        </div>
      </div>

      <div class="box-base sign-box" :class="showSign?'retate-login':''">
        <sign-form></sign-form>
        <div class="change-box to-login">
          <div class="change-login" @click="updateRotate">去登录</div>
        </div>
      </div>
    </div>
  </div>

</template>

<script>
import loginForm from '../components/login/login-form.vue'
import SignForm from '../components/login/sign-form.vue'
export default {
  components: { loginForm, SignForm },
  name: 'login',
  data () {
    return {
      showLogin: true,
      showSign: false
    }
  },
  methods: {
    updateRotate () {
      this.showLogin = !this.showLogin
      this.showSign = !this.showSign
    }
  }
}
</script>

<style scoped>
* {
    padding: 0px;
    margin: 0px;
}

.container {
  height: 100%;
  width: 100%;
  position: relative;
  background: url("../../img/gaming2.jpg") center center / cover no-repeat fixed;
}

/* 毛玻璃特效 */
.form-box::before {
  content: '';
  position: absolute;
  top: 0; bottom: 0; left: 0; right: 0;
  z-index: -1;
  margin: -30px;
  filter: blur(10px);
  background: url("../../img/gaming2.jpg") center center / cover no-repeat fixed;

}

.form-box {
  position: absolute;
  overflow: hidden;
  top: 50%;
  left: 50%;
  height: 350px;
  width: 600px;
  border-radius: 10px;
  margin-top: -150px;
  margin-left: -300px;
  box-shadow: 0px 0px 10px rgba(17, 39, 59, 0.5);
  z-index: 1;
}

/* 跳转按钮背景色 */
.form-box:hover .to-sign {
  height: 200px;
  background-color:rgba(255, 255, 255, 1);
}

.form-box:hover .to-login {
  height: 200px;
  background-color: rgba(17, 39, 59, 1);
}

/* 框内背景色 */
.form-box:hover .login-box{
  background-color:  rgba(17, 39, 59, 0.8);
}

.form-box:hover .sign-box {
  background-color:  rgba(255, 255, 255, 0.8);
}

.box-base {
  position: absolute;
  height: 100%;
  width: 100%;
  transition: .5s;
  transform-origin: 0 100%;
}

.sign-box {
  transform: rotate(90deg);
}

.change-box {
  position: absolute;
  height: 0px;
  width: 100%;
  transition: .5s;
}

/* 跳转按钮图形绘制 */
.to-login {
  top: 0;
  clip-path: polygon(0 0, 0 50%, 40% 0);
}

.to-sign {
  bottom: 0;
  clip-path: polygon(100% 50%, 60% 100%, 100% 100%);
}

.change-sign {
  position: absolute;
  bottom: 30px;
  right: 40px;
  font-size: 20px;
  color: rgba(17, 39, 59, 0.5);
  cursor: pointer;
}

.change-login {
  position: absolute;
  top: 20px;
  left: 40px;
  font-size: 20px;
  color: rgba(255, 255, 255, 0.5);
  cursor: pointer;
}

.retate-sign {
  transform: rotate(-90deg);
}

.retate-login {
  transform: rotate(0deg);
}

/* 深度选择器，父组件中改变子组件的元素 */
.form-box:hover >>> .el-input__inner {
  background-color: aliceblue;
}

.form-box:hover >>> .el-button{
  background-color: #409EFF;
}

.form-box:hover .sign-box >>> .title {
  color: rgba(17, 39, 59, 0.5);
  text-shadow: 0px 0px 7px rgba(0, 0, 0, .8);
}

.form-box:hover .login-box >>> .title {
  text-shadow: 0px 0px 7px rgba(255, 255, 255, .8);
}

.el-form-item >>> .el-input__inner {
  background-color: transparent;
}
</style>
