package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object ChineseLanguagePack extends CountryNameZH

class CountryNameZHSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(ChineseLanguagePack.countryName(Country.Jamaica) === "牙买加")
    assert(ChineseLanguagePack.countryName(Country.Bulgaria) === "保加利亚")
    assert(ChineseLanguagePack.countryName(Country.Cambodia) === "柬埔寨")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(ChineseLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("zh")))
  //   )
  // }

}
