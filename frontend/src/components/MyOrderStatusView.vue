<template>

    <v-data-table
        :headers="headers"
        :items="myOrderStatus"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MyOrderStatusView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "menuName", value: "menuName" },
                { text: "price", value: "price" },
                { text: "tableNo", value: "tableNo" },
                { text: "orderDt", value: "orderDt" },
                { text: "orderId", value: "orderId" },
                { text: "cookingDt", value: "cookingDt" },
                { text: "orderStatus", value: "orderStatus" },
                { text: "cookingStatus", value: "cookingStatus" },
            ],
            myOrderStatus : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/myOrderStatuses'))

            temp.data._embedded.myOrderStatuses.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.myOrderStatus = temp.data._embedded.myOrderStatuses;
        },
        methods: {
        }
    }
</script>

