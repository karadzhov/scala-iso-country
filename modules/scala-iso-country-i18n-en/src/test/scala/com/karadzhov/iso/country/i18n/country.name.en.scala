package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object EnglishLanguagePack extends CountryNameEN

class CountryNameENSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating country names" should "return the correct translation" in {
    assert(EnglishLanguagePack.countryName(Country.Jamaica) === "Jamaica")
    assert(EnglishLanguagePack.countryName(Country.Bulgaria) === "Bulgaria")
    assert(EnglishLanguagePack.countryName(Country.Cambodia) === "Cambodia")
  }

}
