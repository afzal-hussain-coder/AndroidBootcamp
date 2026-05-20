# 🚀 Modern Android Bootcamp

# 📅 Day 1 — Jetpack Compose Basics + State Management

---

# 📱 Project Built

## Profile Card App

## 📸 Day 1 Output

<p align="center">
  <img src="./screenshots/day1_ui.jpeg" width="250"/>
</p>

### Features
- Gradient Background
- Card UI
- Button Click Action
- State Change
- Dynamic UI Update

---

# 🧠 Concepts Learned

---

# 1️⃣ What is Jetpack Compose?

Jetpack Compose is a modern Android UI toolkit used to build UI without XML.

### Old Android UI
```text
XML + Activity/Fragment
```

### Modern Android UI
```text
Compose Functions
```

### Benefits
- Less code
- Faster UI development
- Reactive UI
- Easy state management

---

# 2️⃣ What is @Composable?

```kotlin
@Composable
fun MyScreen() {
}
```

### Explanation
`@Composable` tells Compose compiler that this function creates UI.

### Important Point
- UI in Compose is created using functions
- Every screen is a composable function

---

# 3️⃣ What is State?

State is data that changes over time.

Example:
- Counter value
- User name
- Loading state

---

# 4️⃣ What is remember?

```kotlin
remember { mutableStateOf() }
```

### Explanation
`remember` stores value in memory during recomposition.

Without remember:
- value resets again and again

---

# 5️⃣ What is mutableStateOf?

```kotlin
mutableStateOf("Android Learner")
```

### Explanation
Creates observable state.

When value changes:
- Compose automatically updates UI

---

# 6️⃣ What is Recomposition?

### Flow
```text
State Change
   ↓
Compose Detects Change
   ↓
UI Rebuild
```

### Explanation
Compose redraws only affected UI automatically.

---

# 7️⃣ What is Box Layout?

```kotlin
Box()
```

### Purpose
Used to stack UI components on top of each other.

Example:
- Background + Content
- Overlay UI

---

# 8️⃣ What is Column?

```kotlin
Column()
```

### Purpose
Arranges items vertically.

Example:
- Text
- Button
- Image

---

# 9️⃣ What is Spacer?

```kotlin
Spacer(modifier = Modifier.height(10.dp))
```

### Purpose
Creates spacing between UI components.

---

# 🔟 What is Modifier?

Modifier is used to decorate or customize composables.

Example:
```kotlin
Modifier
    .fillMaxSize()
    .padding(20.dp)
```

### Common Modifiers
| Modifier | Purpose |
|---|---|
| fillMaxSize | full screen |
| padding | spacing |
| background | background color |
| height | set height |
| width | set width |

---

# 🎨 What is Brush.verticalGradient?

Used to create gradient background.

Example:
```kotlin
Brush.verticalGradient()
```

---

# 🧪 What I Practiced

- Compose UI
- State Management
- Dynamic Text Update
- Layout Design
- Button Click Handling

---

# 🔥 Git Commands Learned

```bash
git add .
git commit -m "Day 1 - Compose State UI"
git push
```

---

# 🎯 Day 1 Outcome

After Day 1:
- Learned Compose Basics
- Learned State Management
- Understood Recomposition
- Built First Compose UI
- Pushed Project to GitHub

---

# 🚀 Tomorrow Learning (Day 2)

- MVVM
- ViewModel
- StateFlow
- UI State
- Architecture Basics
