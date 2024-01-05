package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object PortugueseLanguagePack extends CountryNamePT

class CountryNamePTSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(PortugueseLanguagePack.countryName(Country.Jamaica) === "Jamaica")
    assert(PortugueseLanguagePack.countryName(Country.Bulgaria) === "Bulgária")
    assert(PortugueseLanguagePack.countryName(Country.Cambodia) === "Camboja")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(PortugueseLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("pt")))
  //   )
  // }

}
