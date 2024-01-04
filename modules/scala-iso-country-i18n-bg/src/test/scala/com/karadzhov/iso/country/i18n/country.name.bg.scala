package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import java.util.Locale
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object BulgarianLanguagePack extends CountryNameBG

class CountryNameBGSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(BulgarianLanguagePack.countryName(Country.Jamaica) === "Ямайка")
    assert(BulgarianLanguagePack.countryName(Country.Bulgaria) === "България")
    assert(BulgarianLanguagePack.countryName(Country.Cambodia) === "Камбоджа")
  }

  "country names" should "be aligned with the JVM country names" in {
    Country.values.foreach(cc =>
      assert(BulgarianLanguagePack.countryName(cc) === new Locale("", cc.entryName).getDisplayCountry(new Locale("bg")))
    )
  }

}
