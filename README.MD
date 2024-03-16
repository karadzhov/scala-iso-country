## scala-iso-country [![Continuous integration](https://github.com/karadzhov/scala-iso-country/actions/workflows/release.yml/badge.svg)](https://github.com/karadzhov/scala-iso-country/actions/workflows/release.yml) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.karadzhov/scala-iso-country-core_2.12/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.karadzhov/scala-iso-country-core_2.12)

scala-iso-country is a minimalistic library compatible with Scala, Scala.js and Scala Native. It simplifies the representation of ISO 3166-1 alpha-2 countries using [Enumeratum](https://github.com/lloydmeta/enumeratum) and provides translations of country names into various languages.

### SBT

To get started with SBT add the following to your build.sbt file:

#### Enum without translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-core" % "0.4.0"
```

#### Enum + Arabic translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-ar" % "0.4.0"
```

#### Enum + Bulgarian translations 
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-bg" % "0.4.0"
```

#### Enum + Czech translations 
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-cs" % "0.4.0"
```

#### Enum + German translations 
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-de" % "0.4.0"
```

#### Enum + English translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-en" % "0.4.0"
```

#### Enum + Spanish translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-es" % "0.4.0"
```

#### Enum + French translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-fr" % "0.4.0"
```

#### Enum + Hindi translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-hi" % "0.4.0"
```

#### Enum + Italian translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-it" % "0.4.0"
```

#### Enum + Polish translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-pl" % "0.4.0"
```

#### Enum + Portuguese translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-pt" % "0.4.0"
```

#### Enum + Russian translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-ru" % "0.4.0"
```

#### Enum + Chinese translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-country-i18n-zh" % "0.4.0"
```

## Sample

```scala
import com.karadzhov.iso.country.Country
import com.karadzhov.iso.country.i18n.CountryNameDE

Country.values
// Vector(Country.Afghanistan, Country.AlandIslands, Country.Albania...)

Country.Jamaica.entryName
// "JM"

Country.withNameOption("JM")
// Some(Country.Jamaica)

Country.withNameOption("AA")
// None

object GermanLanguagePack extends CountryNameDE

GermanLanguagePack.countryName(Country.Cambodia)
// "Kambodscha"

```