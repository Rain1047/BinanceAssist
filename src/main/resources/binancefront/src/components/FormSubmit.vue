<template>
  <div class="form">
    <h3>表单提交示例</h3>
    <form @submit.prevent="submitForm">
      <div class="form-item">
        <label>姓名：</label>
        <input v-model="name" type="text" required>
      </div>
      <div class="form-item">
        <label>年龄：</label>
        <input v-model.number="age" type="number" required>
      </div>
      <div class="form-item">
        <label>邮箱：</label>
        <input v-model.trim="email" type="email" required>
      </div>
      <div class="form-item">
        <label>爱好：</label>
        <input v-model.lazy="hobby" type="text">
      </div>
      <button type="submit">提交</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      name: '',
      age: '',
      email: '',
      hobby: ''
    }
  },
  methods: {
    submitForm() {
      // 将表单数据转化为json格式
      let formData = JSON.stringify(this.$data);
      
      // 发送表单数据到后端接口
      axios.post('/api/form', formData)
        .then(res => {
          console.log(res.data);
          alert('提交成功');
        })
        .catch(err => {
          console.log(err);
          alert('提交失败');
        })
    }
  }
}
</script>

<style scoped>

</style>
