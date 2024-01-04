package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object GermanLanguagePack extends CountryNameDE

class CountryNameDESuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(GermanLanguagePack.countryName(Country.Jamaica) === "Jamaika")
    assert(GermanLanguagePack.countryName(Country.Bulgaria) === "Bulgarien")
    assert(GermanLanguagePack.countryName(Country.Cambodia) === "Kambodscha")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(GermanLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("de")))
  //   )
  // }

}
