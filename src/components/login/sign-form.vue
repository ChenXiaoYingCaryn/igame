<template>
  <div>
    <div class="title">注册</div>
    <el-form  class="sign-rule-form" :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="auto" label-position="right">
      <el-form-item prop="uname">
          <el-input type="text" placeholder="用户名" v-model="ruleForm.uname" maxlength="20" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item prop="upassword">
        <el-input type="password" placeholder="密码" v-model="ruleForm.upassword" maxlength="20" autocomplete="off" show-password></el-input>
      </el-form-item>
      <el-form-item prop="upass">
        <el-input type="password" placeholder="确认密码" v-model="ruleForm.upass" maxlength="20" autocomplete="off" show-password></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  name: 'sign-form',
  data () {
    var validateUname = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入用户名'))
      } else {
        if (this.ruleForm.checkUname !== '') {
          this.$refs.ruleForm.validateField('checkUname')
        }
        callback()
      }
    }
    var validateUpassword = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入密码'))
      } else {
        callback()
      }
    }
    var validateUpass = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请再次输入密码'))
      } else if (value !== this.ruleForm.upassword) {
        callback(new Error('两次输入的密码不一致哦!'))
      } else {
        callback()
      }
    }
    return {
      ruleForm: {
        uname: '',
        upassword: '',
        upass: ''
      },
      rules: {
        uname: [
          { validator: validateUname, trigger: 'blur' }
        ],
        upassword: [
          { validator: validateUpassword, trigger: 'blur' }
        ],
        upass: [
          { validator: validateUpass, trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    submitForm (formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          alert('提交成功!')
        } else {
          console.log('提交失败!!')
          return false
        }
      })
    }
  }
}
</script>

<style scoped>
.title {
  margin: 30px auto;
  font-size: 30px;
  text-align: center;
  color: white;
}
.sign-rule-form {
  margin: 0 20%;
  text-align: center;
}
.sign-rule-form .el-button {
  background-color: Transparent;
}
.el-form-item >>> .el-input__inner {
  background-color: transparent;
}
</style>
