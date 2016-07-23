* __({}–>nil)__ no code at all->code that employs nil
* __(nil->constant)__
* __(constant->constant+)__ a simple constant to a more complex constant
* __(constant->scalar)__ replacing a constant with a variable or an argument
* __(statement->statements)__ adding more unconditional statements.
* __(unconditional->if)__ splitting the execution path
* __(scalar->array)__
* __(array->container)__
* __(statement->recursion)__
* __(if->while)__
* __(expression->function)__ replacing an expression with a function or algorithm
* __(variable->assignment)__ replacing the value of a variable.