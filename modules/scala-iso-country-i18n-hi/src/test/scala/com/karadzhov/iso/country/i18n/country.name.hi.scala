package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object HindiLanguagePack extends CountryNameHI

class CountryNameHISuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(HindiLanguagePack.countryName(Country.Jamaica) === "जमैका")
    assert(HindiLanguagePack.countryName(Country.Bulgaria) === "बुल्गारिया")
    assert(HindiLanguagePack.countryName(Country.Cambodia) === "कंबोडिया")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(HindiLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("hi")))
  //   )
  // }

}
