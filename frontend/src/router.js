
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManagementManager from "./components/listers/OrderOrderManagementCards"
import OrderOrderManagementDetail from "./components/listers/OrderOrderManagementDetail"

import CookCookingManagementManager from "./components/listers/CookCookingManagementCards"
import CookCookingManagementDetail from "./components/listers/CookCookingManagementDetail"

import TableTableManagementManager from "./components/listers/TableTableManagementCards"
import TableTableManagementDetail from "./components/listers/TableTableManagementDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orderManagements',
                name: 'OrderOrderManagementManager',
                component: OrderOrderManagementManager
            },
            {
                path: '/orders/orderManagements/:id',
                name: 'OrderOrderManagementDetail',
                component: OrderOrderManagementDetail
            },

            {
                path: '/cooks/cookingManagements',
                name: 'CookCookingManagementManager',
                component: CookCookingManagementManager
            },
            {
                path: '/cooks/cookingManagements/:id',
                name: 'CookCookingManagementDetail',
                component: CookCookingManagementDetail
            },

            {
                path: '/tables/tableManagements',
                name: 'TableTableManagementManager',
                component: TableTableManagementManager
            },
            {
                path: '/tables/tableManagements/:id',
                name: 'TableTableManagementDetail',
                component: TableTableManagementDetail
            },




    ]
})
