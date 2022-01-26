def employeeName [A <: Employee](emp: A) = println(emp.name)
employeeName(Internal("Paul"))
employeeName(FreeLancer("John"))
employeeName(Customer("Peter"))