package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object ItalianLanguagePack extends CountryNameIT

class CountryNameITSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(ItalianLanguagePack.countryName(Country.Jamaica) === "Giamaica")
    assert(ItalianLanguagePack.countryName(Country.Bulgaria) === "Bulgaria")
    assert(ItalianLanguagePack.countryName(Country.Cambodia) === "Cambogia")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(ItalianLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("it")))
  //   )
  // }

}
