package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import java.util.Locale
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object EnglishLanguagePack extends CountryNameEN

class CountryNameENSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(EnglishLanguagePack.countryName(Country.Jamaica) === "Jamaica")
    assert(EnglishLanguagePack.countryName(Country.Bulgaria) === "Bulgaria")
    assert(EnglishLanguagePack.countryName(Country.Cambodia) === "Cambodia")
  }

  "country names" should "be aligned with the JVM country names" in {
    Country.values.foreach(cc =>
      assert(EnglishLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("en")))
    )
  }

}
