package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object SpanishLanguagePack extends CountryNameES

class CountryNameESSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(SpanishLanguagePack.countryName(Country.Jamaica) === "Jamaica")
    assert(SpanishLanguagePack.countryName(Country.Bulgaria) === "Bulgaria")
    assert(SpanishLanguagePack.countryName(Country.Cambodia) === "Camboya")
  }

  // Scala Native throws exception during linking
  // "country names" should "be aligned with the JVM country names" in {
  //   Country.values.foreach(cc =>
  //     assert(SpanishLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("es")))
  //   )
  // }

}
