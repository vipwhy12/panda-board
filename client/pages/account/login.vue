<template>
  <div class="flex align-items-center justify-content-center">
    <b-card style="width: 20vw;">
      <div class="mb-3">
        <label for="input-live">Email</label>
        <b-form-input
          id="input-live"
          v-model="email"
          placeholder="Enter your email"
          trim
        ></b-form-input>
      </div>

      <div class="mb-3">
        <label for="input-live">Password</label>
        <b-form-input
          id="input-live"
          v-model="password"
          type="password"
          placeholder="Enter your Password"
          trim
        ></b-form-input>
      </div>

      <b-btn variant="primary" class="w-100 mb-1" @click="login">로그인</b-btn>
      <nuxt-link to="/account/join">회원가입</nuxt-link>
    </b-card>
  </div>
</template>

<script>
export default {
  name: "LoginPage",
  data() {
    return {
      email: null,
      password: null,
    }
  },

  methods: {
    login() {
      if (!this.email?.trim()) {
        alert("이메일을 입력해주세요.")
        return
      }

      if (!this.password?.trim()) {
        alert("비밀번호를 입력해주세요.")
        return
      }

      this.$axios.post('/api/login', {
        email: this.email,
        password: this.password
      })
        .then(response => {
          console.log(response.data)
        })
        .finally(() => {

        })
    }
  }
}
</script>

<style scoped>

</style>
