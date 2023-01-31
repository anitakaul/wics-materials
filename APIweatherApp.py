import requests

# 1. make api key into a string
apiKey= '8ef257c3d948ead6db20e66823605d71'

#2. Find a way to fetch the API. For this we download a library called requests

# MAC- pip3 install requests
#Windows pip install requests

#add your import to the top

#3. Get User input and print
userInput= input("Enter a city: ")
print(userInput)

#make sure you are in the correct folder 
#run your program to check
#MAC- python3 weatherapp.py
#Windows python weatherapp.py


#4. use requests to get the data
weatherData= requests.get(f"https://api.openweathermap.org/data/2.5/weather?q={userInput}&units=imperial&APPID={apiKey}")

#check status
print(weatherData.status_code)

#print EVERYTHING (just for funzies)
print(weatherData.json())
#json is just a format where data is transmitted. It'll look really ugly

#if your code is wrong, there will be a 404 error
#handle this error
if weatherData.json()['cod'] == '404':
    print("No City Found")
else:
    #get weather data and temp data
    #the weather is in the weather array at index 0 in the main section
    weather = weatherData.json()['weather'][0]['description']
    temp = round(weatherData.json()['main']['temp'])

    #print
    print(f"The weather in {userInput} is: {weather}")
    print(f"The temperature in {userInput} is: {temp}ºF")
    
    #that's all! try different cities or putting in different list values