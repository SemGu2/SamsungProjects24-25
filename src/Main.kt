fun main() {
    val student:Student? = Student()
    student?.let{ it ->
        it.hi()
        it.bye()
        it.name = "123"
    }
    student?.apply {
        hi()
        bye()
    }

    //run
    val stringStudent = Student().run {
        hi()
        bye()
        lastName //return
    }
    println(stringStudent)

    //with
    val nameStudent = with(Student()){
        bye()
        name //return
    }
    println(nameStudent)

    //also
    val StudentQQ = Student().also { st ->
        st.hi()
        st.bye()
        st.name = "111"
    }
    println(StudentQQ.name)
}