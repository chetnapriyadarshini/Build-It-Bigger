# Build It Bigger — Gradle Build Flavors + Google Cloud Endpoints (Android)

An Android joke-telling app built primarily to demonstrate advanced Gradle configuration: multi-module project structure, free and paid build flavors, library factoring, Google Cloud Endpoints backend, and AdMob ad integration.

---

## Overview

The app itself is a simple joke dispenser — but the engineering focus is the build system and architecture. This project demonstrates how to structure a production Android app with separate modules, configure variant-specific behaviour via Gradle build flavors, and connect to a backend server powered by Google Cloud Endpoints.

---

## Technical Focus Areas

| Area | Implementation |
|---|---|
| **Build variants** | Free flavor (with ads) and Paid flavor (ad-free) via Gradle productFlavors |
| **Multi-module structure** | Functionality factored into reusable Android library modules |
| **Backend** | Google Cloud Endpoints development server supplies joke content via REST |
| **Ad integration** | AdMob banner and interstitial ads in free flavor only |
| **Gradle tasks** | Custom Gradle tasks for build automation |
| **Testing** | Instrumented tests covering paid/free flavor behaviour |

---

## Project Structure

```
Build-It-Bigger/
└── FinalProject/
    ├── app/                    # Main Android app (free + paid flavors)
    ├── jokes/                  # Java library — joke content
    ├── backend/                # Google Cloud Endpoints server
    └── androidjokes/           # Android library — joke display UI
```

---

## Setup

```bash
git clone https://github.com/chetnapriyadarshini/Build-It-Bigger.git
```

Open `FinalProject/` in Android Studio. Select the `free` or `paid` build variant from the Build Variants panel to build the respective app flavor.

---

## Context

Forked from the Udacity Android Developer Nanodegree (ud867) course. The `FinalProject/` folder contains the completed implementation demonstrating all required Gradle engineering concepts.

---

## Contact

Created by [@chetnapriyadarshini](https://github.com/chetnapriyadarshini)
