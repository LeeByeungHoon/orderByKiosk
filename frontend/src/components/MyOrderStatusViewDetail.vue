<template>

    <v-card outlined>
        <v-card-title>
            MyOrderStatus # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="MenuName" v-model="item.menuName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Price" v-model="item.price" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="TableNo" v-model="item.tableNo" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="OrderDt" v-model="item.orderDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="OrderId" v-model="item.orderId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="CookingDt" v-model="item.cookingDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="OrderStatus" v-model="item.orderStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="CookingStatus" v-model="item.cookingStatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MyOrderStatusViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/myOrderStatuses/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

