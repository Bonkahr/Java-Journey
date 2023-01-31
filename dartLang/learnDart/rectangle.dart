import 'dart:math';

class Rectangle {
  int width;
  int height;
  Point origin;

  Rectangle({this.origin = const Point(0, 0), this.height = 0, this.width = 0});

  @override
  String toString() =>
      'Origin: (${origin.x}, ${origin.y}), width: $width, height: $height';
}

void main() {
  var point = Point(10, 10);
  final rectangle = Rectangle(origin: point, width: 100, height: 100);
  print(rectangle);
  print(Rectangle(width: 100, origin: point));
  print(Rectangle());
}
