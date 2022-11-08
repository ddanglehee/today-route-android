package com.maru.data.datasource.route

import com.maru.data.model.Route
import com.maru.data.model.SimpleRoute
import java.io.File

interface RouteDataSource {

    suspend fun getRouteOfMonth(year: Int, month: Int): Result<List<SimpleRoute>>
    suspend fun getRouteById(routeId: Int): Result<Route>
    suspend fun saveNewRoute(
        date: String,
        zoomLevel: Double,
        title: String,
        contents: String,
        location: String,
        fileList: List<File>,
        geoCoordList: List<List<Double>>
    ): Result<Unit>
}