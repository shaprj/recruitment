package com.shaprj.test.recruitment.recruitment.api.employee

import com.shaprj.test.recruitment.recruitment.common.Position

class RecruiterRequest() {
    lateinit var name: String
    lateinit var lastName: String
    var age: Int = 0
    lateinit var position: Position
}
