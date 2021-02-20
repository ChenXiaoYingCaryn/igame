<template>
    <div class="functionNav">
        <div class="functionNavContent">
            <div class="menuList">
                <a href="#"><span>手游</span></a>
                <a href="#"><span>网游</span></a>
                <a href="#"><span>主机游戏</span></a>
                <a href="#"><span>所有游戏</span></a>
            </div>

            <div class="search">
                <el-input
                    placeholder="请输入内容"
                    prefix-icon="el-icon-search"
                    v-model="input2"
                    maxlength="1">
                </el-input>
            </div>

            <div class="login">
                <a href="#"><span>登录 / 注册</span></a>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "functionNav",
}
</script>

<style scoped>
    .functionNavContent{
        background-color:#232322;
        width: 100%;
        height: 60px;
        margin: 0 auto;
        display: grid;
        grid-template-columns: 2fr 2fr 1fr;
        padding: 10px 0;
        /* place-items: center center; */
    }
    .menuList{
        /* background-color: snow; */
        display: grid;
        grid-template-columns: 1fr 1fr 1fr 1fr;
        place-items: center center;
    }
    .menuList a span{
        color: darkgoldenrod;
        font-weight: 800;
    }
    .search{
        display: grid;
        place-items: center center;
        margin: 0 20px;
    }
    .login{
        display: grid;
        place-items: center center;
    }
    .login span{
        color:silver;
        padding: 4px 8px;
        border: silver solid 2px;
        border-radius: 20px;
        font-weight: 800;
    }

</style>