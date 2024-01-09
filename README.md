# NewsApp

NewsApp is an Android application that allows users to read the latest news articles from various sources. The app uses the NewsAPI to fetch news data and provides features like viewing headlines, searching for specific news, and saving favorite articles.

## Features

- View Top Headlines: Browse the latest news headlines.
- Search News: Search for news articles based on specific queries.
- Save Favorites: Save your favorite articles for later reading.
- Offline Support: View previously fetched articles even without an internet connection.

## Technologies Used

- Android Studio
- Kotlin
- Retrofit for API communication
- Room Database for local data storage
- ViewModel and LiveData for UI updates
- Glide for image loading

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/NewsApp.git

    Open the project in Android Studio.

    Build and run the app on an emulator or physical device.

API Key Setup

The app uses the NewsAPI, and you need to obtain an API key. Follow these steps:

    Visit NewsAPI and sign up for an account.

    Obtain your API key.

    In the Constants class (util/Constants.kt), replace the API_KEY value with your actual API key.

    kotlin

    const val API_KEY = "your-api-key"

## Screenshots and GIFs

![App Screenshot](https://github.com/fahaddhabib/news-app/blob/master/screenshots/newsapp.jpg)

Contributing

If you would like to contribute to the project, feel free to fork the repository, create a new branch, and submit a pull request.
License

This project is licensed under the MIT License.
Acknowledgments

Thanks to NewsAPI for providing the news data.
