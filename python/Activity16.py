class car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer= manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer,self.make,"is moving")
    def stop(self):
        print(self.manufacturer,self.model,"is stopped")

p1 = car("Maruti","Ritz",2012,"manual","gray")
p2 = car("Toyota","Innova",2015,"auto","white")
p3 = car("Isuzu","Mux",2019,"auto","silver")
p1.accelerate()
p3.accelerate()
p2.stop()


