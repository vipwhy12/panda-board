<template>
  <div>
    <b-table id="board-table" :fields="fields" :items="computedRows">
      <template #cell(title)="{item}">
        <nuxt-link :to="`/board/${item.id}`">{{ item.title }}</nuxt-link>
      </template>
    </b-table>
    <div class="d-flex justify-content-center">
      <b-pagination
        v-model="pagination.currentPage"
        :total-rows="pagination.total"
        :per-page="pagination.perPage"
        aria-controls="board-table"/>
    </div>
  </div>
</template>

<script>
export default {
  name: "BoardIndex",
  data() {
    return {
      pagination: {
        currentPage: 1,
        perPage: 20,
        totalPages: 0,
        total: 0,
      },
      fields: [
        {key: 'no', label: '번호', thStyle: {width: '5rem'}},
        {key: 'title', label: '제목'},
        {key: 'userName', label: '작성자', thStyle: {width: '7rem'}},
        {key: 'date', label: '날짜', thStyle: {width: '7rem'}},
      ],
      rows: [
        {id: 1, title: '제목', userName: '채현', date: '2022-12-17'}
      ]
    }
  },

  computed: {
    computedRows() {
      return this.rows.map((row, index) => {
        row.no = index
        return row
      })
    }
  },

  created() {
    // this.getBoardList()
  },

  methods: {
    getBoardList() {
      this.$axios.get("/api/board")
        .then(response => {
          console.log(response.data)
        })
        .catch(error => console.error(error))
        .finally(() => {
        })
    }
  }
}
</script>

<style scoped>

</style>
