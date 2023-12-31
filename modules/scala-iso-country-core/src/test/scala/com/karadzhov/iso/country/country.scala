package com.karadzhov.iso.country

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

class CountrySpec extends AnyFlatSpec with TypeCheckedTripleEquals {

  "parsing correct string value" should "return some country object" in {
    assert(Country.withNameOption("JM") === Some(Country.Jamaica))
  }

  "parsing incorrect string value" should "return no object" in {
    assert(Country.withNameOption("AA") === None)
  }

  "entryName" should "return the country code" in {
    assert(Country.Jamaica.entryName === "JM")
  }

}
