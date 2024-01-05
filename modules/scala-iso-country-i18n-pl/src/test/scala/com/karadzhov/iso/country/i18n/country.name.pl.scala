package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object PolishLanguagePack extends CountryNamePL

class CountryNamePLSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(PolishLanguagePack.countryName(Country.Jamaica) === "Jamajka")
    assert(PolishLanguagePack.countryName(Country.Bulgaria) === "Bułgaria")
    assert(PolishLanguagePack.countryName(Country.Cambodia) === "Kambodża")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(PolishLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("pl")))
  //   )
  // }

}
