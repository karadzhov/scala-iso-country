package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object ArabicLanguagePack extends CountryNameAR

class CountryNameARSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(ArabicLanguagePack.countryName(Country.Jamaica) === "جامايكا")
    assert(ArabicLanguagePack.countryName(Country.Bulgaria) === "بلغاريا")
    assert(ArabicLanguagePack.countryName(Country.Cambodia) === "كمبوديا")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(ArabicLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("ar")))
  //   )
  // }

}
