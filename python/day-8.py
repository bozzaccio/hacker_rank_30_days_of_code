# Enter your code here. Read input from STDIN. Print output to STDOUT
# read how many contact the user want to add
n = int(input())
i = 0
address_book = {}

# add the contact to the address book
while i < n:
    username, phone_number = input().split()
    address_book[username] = phone_number
    i += 1

try:
    while True:
        searched_name = input()
        
        if searched_name is None:
            break

        if (searched_name not in address_book):
            print("Not found")
        else:
            result = searched_name + "=" + address_book[searched_name]
            print(result)

except EOFError as e:
    exit
