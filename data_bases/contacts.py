import sqlite3

data_base = sqlite3.connect('contacts.sqlite')
data_base.execute('CREATE TABLE IF NOT EXISTS contacts(name Text, '
                  'phone INTEGER, email TEXT)')
data_base.execute(
    "INSERT INTO contacts(name, phone, email)VALUES('JAMES', 1234567, "
    "'james@gmail.com')")
data_base.execute(
    "INSERT INTO contacts(name, phone, email)VALUES('Daniel', 09876543, "
    "'daniel@gmail.com')")

cursor = data_base.cursor()
cursor.execute("SELECT * FROM contacts")

print(cursor.fetchall())
for name, phone, email in cursor:
    print(f'Name: {name}, Phone: {phone} Email: {email}')
    print('*' * 80)

cursor.close()
data_base.close()
