import 'dart:math';


Shape shapeFactory (String type) {
  if (type == 'circle') return Circle(2);
  if (type == 'Square') return Square(10);
  throw 'Can\'t create $type';
}

abstract class Shape {
  factory Shape(String type) {
    if (type == 'circle') return Circle(2);
    if (type == 'square') return Square(2);
    throw 'Can\'t create $type.';
  }
  num get area;
}

class Circle implements Shape {
  final num radius;

  Circle(this.radius);

  num get area => pi * pow(radius, 2);
}

class Square implements Shape {
  final num side;

  Square(this.side);

  num get area => pow(side, 2);
}

void main(){
  // final circle = Circle(21);
  // final square = Square(12);
  // print(circle.area);
  // print(square.area);

  final circles = Shape('circle');
  final squares = Shape('square');
  print(circles.area);
  print(squares.area);
}