class Bicycle {
  int cadence;
  int _speed = 0; // creating a private field.
  int gear;

  Bicycle(this.cadence, this.gear); // class constructor

  @override // overriding the string default method.
  String toString() => 'Bicycle: $_speed mph';

  int get speed => _speed; // private field _speed getter.

  void applyBrake(int decrement) {
    _speed -= decrement;
  }

  void speedUp(int increment) {
    _speed += increment;
  }
}

void main() {
  var bike = Bicycle(2, 1); // Creating an instance of the class.
  print(bike);
}
