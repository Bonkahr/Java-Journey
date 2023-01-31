import 'dart:io';

void main(){
  print('Enter your name');
  String? name = stdin.readLineSync();
  print('Hello $name, How are you?');

  print('How old are you?');
  String? age = stdin.readLineSync();
  print(age);
}