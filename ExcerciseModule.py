class ExcerciseModule:
    name = ""
    desc = ""
    partList = []

    def __init__(self, name):
        self.name = name

    def addDescripton(self, txt):
        self.desc = txt

    def addParts(self, bodyPart):
        self.partList.append(bodyParts)

    def getModule(self):
        return self.name + "\n" + "Description: " + self.desc + "\n" + "Body Parts: " + self.partList

print("Hello World")
test = ExerciseModule(input("Enter exercise name: "))
test.addDescription(input("Enter exercise description: "))
