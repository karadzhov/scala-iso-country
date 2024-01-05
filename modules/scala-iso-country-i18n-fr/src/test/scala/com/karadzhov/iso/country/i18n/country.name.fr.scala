package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object FrenchLanguagePack extends CountryNameFR

class CountryNameFRSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(FrenchLanguagePack.countryName(Country.Jamaica) === "Jamaïque")
    assert(FrenchLanguagePack.countryName(Country.Bulgaria) === "Bulgarie")
    assert(FrenchLanguagePack.countryName(Country.Cambodia) === "Cambodge")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(FrenchLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("fr")))
  //   )
  // }

}
