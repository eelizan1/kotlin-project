# Kotlin Playground

A collection of small Kotlin exercises covering language basics — variables, conditions, loops and ranges, functions, and classes.

## Structure

```
src/main/kotlin/
├── Main.kt                        # Entry point
├── com/kotlinplayground/
│   ├── HelloKotlin.kt
│   ├── HelloKotlinFile.kt
│   ├── basics/                    # Variables, conditions, loops/ranges, labels & return
│   ├── classes/                   # Class examples (incl. Java interop with Car.java)
│   └── functions/                 # Function examples
```

## Requirements

- JDK 8+
- No local Gradle install needed — use the included wrapper (`./gradlew`)

## Running

```bash
./gradlew run
```

## Testing

```bash
./gradlew test
```
