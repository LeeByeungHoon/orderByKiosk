<template>

    <v-data-table
        :headers="headers"
        :items="showOrderList"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ShowOrderListView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            showOrderList : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/showOrderLists'))

            temp.data._embedded.showOrderLists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.showOrderList = temp.data._embedded.showOrderLists;
        },
        methods: {
        }
    }
</script>

