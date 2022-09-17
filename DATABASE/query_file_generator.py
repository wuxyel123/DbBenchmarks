#Generate a simple txt file with queries to be executed
import random
def main():
    #Number of queries to be generated
    num = 1000
    with open('insertQueries.txt', 'w') as f:
        for i in range(1,num):
            print("Insert file generation Step: ", i," of ", num)
            f.write("insert into users (user_id,username,password,lastName,firstName,address,city,nation,zip_code) values (%d,'username','pwd','lastName','firstName','address','city','nation','000000')\n" % i)

    with open('selectQueries.txt', 'w') as f:
        for i in range(1,num):
            #generate a random number between 1 and num
            rand = random.randint(1,num)
            print("Select file generation Step: ", i," of ", num)
            f.write("select * from users where user_id=%d \n"%rand)

if __name__ == '__main__':
    main()
