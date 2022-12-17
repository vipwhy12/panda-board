<template>
  <div id="app" class="container">
    <Header class="mb-3"/>
    <Nuxt class="px-3" style="height: calc(100% - 5rem);"/>
  </div>
</template>

<script>
import Header from "~/components/layouts/Header";

export default {
  name: "default",
  components: {Header}
}
</script>

<style scoped>

</style>
