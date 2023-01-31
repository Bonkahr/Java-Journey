import 'dart:html';

void main() {
  print('hello there');
  print(printNumber(67));
  print(strings('James'));
}

double printNumber(int myNumber) {
  if (myNumber < 40) {
    return myNumber % 5;
  }
  return myNumber / 5;
}

String strings(String name) {
  if (name.length < 1) {
    return 'Name too small';
  }
  return '$name, is a cool name';
}

void learn() {
  String name = 'Daniel';
  int age = 30;
  String birthPlace = 'Nairobi';
  String sex = 'Male';

}