class ExcerciseModule:
    
    def __init__(self, n, d=""):
        self.name = n
        self.desc = d
        self.partList = []


    def addDescripton(self, txt):
        self.desc = txt

    def addParts(self, bodyPart):
        (self.partList).append(bodyPart)

    def getModule(self):
        parts = "Body Parts:"
        for x in self.partList:
            parts = parts + " " + x
        print(self.name + "\n" + "Description: " + self.desc + "\n" + parts, sep="\n")

    

print("running")
test = ExcerciseModule("Pull-Ups")
test.addDescripton("Pull yourself up")
test.addParts("Arms")
test.addParts("Back")
test.addParts("Shoulders")
test.getModule()

