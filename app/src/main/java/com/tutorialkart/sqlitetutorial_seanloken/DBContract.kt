package com.tutorialkart.sqlitetutorial_seanloken

import android.provider.BaseColumns

class DBContract {
    class UserEntry : BaseColumns {
        companion object {
            val TABLE_NAME = "users"
            val COLUMN_USER_ID = "userid"
            val COLUMN_NAME = "name"
            val COLUMN_AGE = "age"
        }
    }
}