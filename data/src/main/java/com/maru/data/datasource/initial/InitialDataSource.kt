package com.maru.data.datasource.initial

import com.maru.data.model.CoupleInfo
import com.maru.data.model.User
import com.maru.data.network.RegisterUserRequest
import kotlinx.coroutines.flow.Flow

interface InitialDataSource {

    interface Local {
        suspend fun saveSignInUserId(id: Int)
        suspend fun getSignedInUserId(): Flow<Int>
        suspend fun saveCoupleId(coupleId: Int)
        suspend fun getCoupleId(): Flow<Int>
    }

    interface Remote {
        suspend fun registerNewUser(user: RegisterUserRequest): Result<User>
        suspend fun getCodeById(id: Int): Result<String>
        suspend fun findUserByInviteCode(inviteCode: String): Result<User>
        suspend fun registerNewCouple(coupleInfo: CoupleInfo): Result<CoupleInfo>
        suspend fun findCoupleInfoById(id: Int): Result<CoupleInfo>
    }
}