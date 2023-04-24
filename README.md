# Dagger-Hilt 🗡️

[![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=24)

Application designed and based on the tutorial from Philipp Lackner:
https://www.youtube.com/@PhilippLackner/playlists.

## Features ✨

- Dagger-Hilt

Basic use of the dagger-hilt library in simple examples.

## Project Milestones

### Annotations
- @HiltAndroidApp
- @HiltViewModel
- @AndroidEntryPoint
- @Module
- @InstallIn(SingletonComponent::class)
- @Binds
- @Provides
- @Singleton
- @Named("someUniqueName")

You can also use:
- @InstallIn(ActivityComponent::class)
- @InstallIn(ViewModelComponent::class)
- @InstallIn(ActivityRetainedComponent::class)
- @InstallIn(ServiceComponent::class)

Injecting into constructor
- @Inject constructor

## Overview

The application is just a basic example for practicing the most used dagger-hilt annotations.