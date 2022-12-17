<template>
  <div class="flex align-items-center justify-content-center">
    <b-card style="width: 25vw;">
      <div class="mb-3">
        <label for="input-live">Email</label>
        <b-input-group>
          <template #append>
            <b-btn variant="secondary" @click="checkEmail">중복확인</b-btn>
          </template>
          <b-form-input
            id="input-live"
            v-model="member.email"
            placeholder="Enter your Email"
            trim/>
        </b-input-group>
      </div>

      <div class="mb-3">
        <label for="input-live">Password</label>
        <b-form-input
          id="input-live"
          v-model="member.password"
          type="password"
          placeholder="Enter your Password"
          class="mb-2"
          trim/>
        <b-form-input
          id="input-live"
          v-model="member.passwordConfirm"
          aria-describedby="input-live-help input-live-feedback"
          placeholder="Repeat your Password"
          trim/>

<!--        <b-form-invalid-feedback id="input-live-feedback">-->
<!--          Enter at least 3 letters-->
<!--        </b-form-invalid-feedback>-->
      </div>

      <b-btn variant="primary" class="w-100 mb-1">회원 가입</b-btn>
    </b-card>
  </div>
</template>

<script>
export default {
  name: "JoinPage",
  data() {
    return {
      member: {
        email: null,
        password: null,
        passwordConfirm: null,

      }
    }
  },

  computed: {

  },

  methods: {
    checkEmail() {
      this.$axios.get("/api/check/email", {
        params: {
          email: this.member.email
        }
      }).then(response => {

      })
    },

    join() {
      this.$axios.post("/api/join", this.member)
        .then(response => {
          console.log(response.data)
        })
        .catch(error => {
          console.error(error)
        })
        .finally(() => {

        })
    }
  }
}
</script>

<style scoped>

</style>
