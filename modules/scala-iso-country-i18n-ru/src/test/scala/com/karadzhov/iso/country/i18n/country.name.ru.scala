package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object RussianLanguagePack extends CountryNameRU

class CountryNameRUSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(RussianLanguagePack.countryName(Country.Jamaica) === "Ямайка")
    assert(RussianLanguagePack.countryName(Country.Bulgaria) === "Болгария")
    assert(RussianLanguagePack.countryName(Country.Cambodia) === "Камбоджа")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(RussianLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("ru")))
  //   )
  // }

}
