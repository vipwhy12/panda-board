<template>

</template>

<script>
export default {
  name: 'IndexPage',
  middleware({ store, redirect }) {
    redirect("/board")
  },
}
</script>
