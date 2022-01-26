class ISBNumber(val isbn: String) extends AnyVal:
    def shortNumber = isbn.replace("I-", "")

print(ISBNumber("I-122345").shortNumber)