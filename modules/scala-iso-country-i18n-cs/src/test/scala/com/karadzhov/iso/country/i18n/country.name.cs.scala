package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object CzechLanguagePack extends CountryNameCS

class CountryNameCSSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(CzechLanguagePack.countryName(Country.Jamaica) === "Jamajka")
    assert(CzechLanguagePack.countryName(Country.Bulgaria) === "Bulharsko")
    assert(CzechLanguagePack.countryName(Country.Cambodia) === "Kambodža")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(CzechLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("cs")))
  //   )
  // }

}
