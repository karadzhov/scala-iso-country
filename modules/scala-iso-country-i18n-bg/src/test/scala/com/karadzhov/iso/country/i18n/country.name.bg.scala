package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object BulgarianLanguagePack extends CountryNameBG

class CountryNameBGSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(BulgarianLanguagePack.countryName(Country.Jamaica) === "Ямайка")
    assert(BulgarianLanguagePack.countryName(Country.Bulgaria) === "България")
    assert(BulgarianLanguagePack.countryName(Country.Cambodia) === "Камбоджа")
  }

}
