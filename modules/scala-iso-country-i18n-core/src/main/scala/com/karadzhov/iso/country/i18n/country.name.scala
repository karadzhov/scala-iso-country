package com.karadzhov.iso.country.i18n

import com.karadzhov.iso.country.Country
import com.karadzhov.iso.country.Country._
import com.karadzhov.iso.country.Country.{Nauru => NauruCountry}

trait CountryName {

  def countryName(a: Country): String = a match {
    case Afghanistan                         => afghanistan
    case AlandIslands                        => alandIslands
    case Albania                             => albania
    case Algeria                             => algeria
    case AmericanSamoa                       => americanSamoa
    case Andorra                             => andorra
    case Angola                              => angola
    case Anguilla                            => anguilla
    case Antarctica                          => antarctica
    case AntiguaAndBarbuda                   => antiguaAndBarbuda
    case Argentina                           => argentina
    case Armenia                             => armenia
    case Aruba                               => aruba
    case Australia                           => australia
    case Austria                             => austria
    case Azerbaijan                          => azerbaijan
    case Bahamas                             => bahamas
    case Bahrain                             => bahrain
    case Bangladesh                          => bangladesh
    case Barbados                            => barbados
    case Belarus                             => belarus
    case Belgium                             => belgium
    case Belize                              => belize
    case Benin                               => benin
    case Bermuda                             => bermuda
    case Bhutan                              => bhutan
    case Bolivia                             => bolivia
    case BosniaAndHerzegovina                => bosniaAndHerzegovina
    case Botswana                            => botswana
    case BouvetIsland                        => bouvetIsland
    case Brazil                              => brazil
    case BritishIndianOceanTerritory         => britishIndianOceanTerritory
    case BritishVirginIslands                => britishVirginIslands
    case Brunei                              => brunei
    case Bulgaria                            => bulgaria
    case BurkinaFaso                         => burkinaFaso
    case Burundi                             => burundi
    case Cambodia                            => cambodia
    case Cameroon                            => cameroon
    case Canada                              => canada
    case CapeVerde                           => capeVerde
    case CaribbeanNetherlands                => caribbeanNetherlands
    case CaymanIslands                       => caymanIslands
    case CentralAfricanRepublic              => centralAfricanRepublic
    case Chad                                => chad
    case Chile                               => chile
    case China                               => china
    case ChristmasIsland                     => christmasIsland
    case CocosIslands                        => cocosIslands
    case Colombia                            => colombia
    case Comoros                             => comoros
    case CongoBrazzaville                    => congoBrazzaville
    case CongoKinshasa                       => congoKinshasa
    case CookIslands                         => cookIslands
    case CostaRica                           => costaRica
    case CoteDivoire                         => coteDivoire
    case Croatia                             => croatia
    case Cuba                                => cuba
    case Curacao                             => curacao
    case Cyprus                              => cyprus
    case Czechia                             => czechia
    case Denmark                             => denmark
    case Djibouti                            => djibouti
    case Dominica                            => dominica
    case DominicanRepublic                   => dominicanRepublic
    case Ecuador                             => ecuador
    case Egypt                               => egypt
    case ElSalvador                          => elSalvador
    case EquatorialGuinea                    => equatorialGuinea
    case Eritrea                             => eritrea
    case Estonia                             => estonia
    case Eswatini                            => eswatini
    case Ethiopia                            => ethiopia
    case FalklandIslands                     => falklandIslands
    case FaroeIslands                        => faroeIslands
    case Fiji                                => fiji
    case Finland                             => finland
    case France                              => france
    case FrenchGuiana                        => frenchGuiana
    case FrenchPolynesia                     => frenchPolynesia
    case FrenchSouthernTerritories           => frenchSouthernTerritories
    case Gabon                               => gabon
    case Gambia                              => gambia
    case Georgia                             => georgia
    case Germany                             => germany
    case Ghana                               => ghana
    case Gibraltar                           => gibraltar
    case Greece                              => greece
    case Greenland                           => greenland
    case Grenada                             => grenada
    case Guadeloupe                          => guadeloupe
    case Guam                                => guam
    case Guatemala                           => guatemala
    case Guernsey                            => guernsey
    case Guinea                              => guinea
    case GuineaBissau                        => guineaBissau
    case Guyana                              => guyana
    case Haiti                               => haiti
    case HeardAndMcDonaldIslands             => heardAndMcDonaldIslands
    case Honduras                            => honduras
    case HongKong                            => hongKong
    case Hungary                             => hungary
    case Iceland                             => iceland
    case India                               => india
    case Indonesia                           => indonesia
    case Iran                                => iran
    case Iraq                                => iraq
    case Ireland                             => ireland
    case IsleOfMan                           => isleOfMan
    case Israel                              => israel
    case Italy                               => italy
    case Jamaica                             => jamaica
    case Japan                               => japan
    case Jersey                              => jersey
    case Jordan                              => jordan
    case Kazakhstan                          => kazakhstan
    case Kenya                               => kenya
    case Kiribati                            => kiribati
    case Kuwait                              => kuwait
    case Kyrgyzstan                          => kyrgyzstan
    case Laos                                => laos
    case Latvia                              => latvia
    case Lebanon                             => lebanon
    case Lesotho                             => lesotho
    case Liberia                             => liberia
    case Libya                               => libya
    case Liechtenstein                       => liechtenstein
    case Lithuania                           => lithuania
    case Luxembourg                          => luxembourg
    case Macao                               => macao
    case Madagascar                          => madagascar
    case Malawi                              => malawi
    case Malaysia                            => malaysia
    case Maldives                            => maldives
    case Mali                                => mali
    case Malta                               => malta
    case MarshallIslands                     => marshallIslands
    case Martinique                          => martinique
    case Mauritania                          => mauritania
    case Mauritius                           => mauritius
    case Mayotte                             => mayotte
    case Mexico                              => mexico
    case Micronesia                          => micronesia
    case Moldova                             => moldova
    case Monaco                              => monaco
    case Mongolia                            => mongolia
    case Montenegro                          => montenegro
    case Montserrat                          => montserrat
    case Morocco                             => morocco
    case Mozambique                          => mozambique
    case Myanmar                             => myanmar
    case Namibia                             => namibia
    case NauruCountry                        => nauruCountry
    case Nepal                               => nepal
    case Netherlands                         => netherlands
    case NewCaledonia                        => newCaledonia
    case NewZealand                          => newZealand
    case Nicaragua                           => nicaragua
    case Niger                               => niger
    case Nigeria                             => nigeria
    case Niue                                => niue
    case NorfolkIsland                       => norfolkIsland
    case NorthKorea                          => northKorea
    case NorthMacedonia                      => northMacedonia
    case NorthernMarianaIslands              => northernMarianaIslands
    case Norway                              => norway
    case Oman                                => oman
    case Pakistan                            => pakistan
    case Palau                               => palau
    case PalestinianTerritories              => palestinianTerritories
    case Panama                              => panama
    case PapuaNewGuinea                      => papuaNewGuinea
    case Paraguay                            => paraguay
    case Peru                                => peru
    case Philippines                         => philippines
    case PitcairnIslands                     => pitcairnIslands
    case Poland                              => poland
    case Portugal                            => portugal
    case PuertoRico                          => puertoRico
    case Qatar                               => qatar
    case Reunion                             => reunion
    case Romania                             => romania
    case Russia                              => russia
    case Rwanda                              => rwanda
    case SaintBarthelemy                     => saintBarthelemy
    case SaintHelena                         => saintHelena
    case SaintKittsAndNevis                  => saintKittsAndNevis
    case SaintLucia                          => saintLucia
    case SaintMartin                         => saintMartin
    case SaintPierreAndMiquelon              => saintPierreAndMiquelon
    case SaintVincentAndTheGrenadines        => saintVincentAndTheGrenadines
    case Samoa                               => samoa
    case SanMarino                           => sanMarino
    case SaoTomeAndPrincipe                  => saoTomeAndPrincipe
    case SaudiArabia                         => saudiArabia
    case Senegal                             => senegal
    case Serbia                              => serbia
    case Seychelles                          => seychelles
    case SierraLeone                         => sierraLeone
    case Singapore                           => singapore
    case SintMaarten                         => sintMaarten
    case Slovakia                            => slovakia
    case Slovenia                            => slovenia
    case SolomonIslands                      => solomonIslands
    case Somalia                             => somalia
    case SouthAfrica                         => southAfrica
    case SouthGeorgiaAndSouthSandwichIslands => southGeorgiaAndSouthSandwichIslands
    case SouthKorea                          => southKorea
    case SouthSudan                          => southSudan
    case Spain                               => spain
    case SriLanka                            => sriLanka
    case Sudan                               => sudan
    case Suriname                            => suriname
    case SvalbardAndJanMayen                 => svalbardAndJanMayen
    case Sweden                              => sweden
    case Switzerland                         => switzerland
    case Syria                               => syria
    case Taiwan                              => taiwan
    case Tajikistan                          => tajikistan
    case Tanzania                            => tanzania
    case Thailand                            => thailand
    case TimorLeste                          => timorLeste
    case Togo                                => togo
    case Tokelau                             => tokelau
    case Tonga                               => tonga
    case TrinidadAndTobago                   => trinidadAndTobago
    case Tunisia                             => tunisia
    case Turkey                              => turkey
    case Turkmenistan                        => turkmenistan
    case TurksAndCaicosIslands               => turksAndCaicosIslands
    case Tuvalu                              => tuvalu
    case Uganda                              => uganda
    case Ukraine                             => ukraine
    case UnitedArabEmirates                  => unitedArabEmirates
    case UnitedKingdom                       => unitedKingdom
    case UnitedStates                        => unitedStates
    case UnitedStatesOutlyingIslands         => unitedStatesOutlyingIslands
    case UnitedStatesVirginIslands           => unitedStatesVirginIslands
    case Uruguay                             => uruguay
    case Uzbekistan                          => uzbekistan
    case Vanuatu                             => vanuatu
    case VaticanCity                         => vaticanCity
    case Venezuela                           => venezuela
    case Vietnam                             => vietnam
    case WallisAndFutuna                     => wallisAndFutuna
    case WesternSahara                       => westernSahara
    case Yemen                               => yemen
    case Zambia                              => zambia
    case Zimbabwe                            => zimbabwe
  }

  def afghanistan: String

  def alandIslands: String

  def albania: String

  def algeria: String

  def americanSamoa: String

  def andorra: String

  def angola: String

  def anguilla: String

  def antarctica: String

  def antiguaAndBarbuda: String

  def argentina: String

  def armenia: String

  def aruba: String

  def australia: String

  def austria: String

  def azerbaijan: String

  def bahamas: String

  def bahrain: String

  def bangladesh: String

  def barbados: String

  def belarus: String

  def belgium: String

  def belize: String

  def benin: String

  def bermuda: String

  def bhutan: String

  def bolivia: String

  def bosniaAndHerzegovina: String

  def botswana: String

  def bouvetIsland: String

  def brazil: String

  def britishIndianOceanTerritory: String

  def britishVirginIslands: String

  def brunei: String

  def bulgaria: String

  def burkinaFaso: String

  def burundi: String

  def cambodia: String

  def cameroon: String

  def canada: String

  def capeVerde: String

  def caribbeanNetherlands: String

  def caymanIslands: String

  def centralAfricanRepublic: String

  def chad: String

  def chile: String

  def china: String

  def christmasIsland: String

  def cocosIslands: String

  def colombia: String

  def comoros: String

  def congoBrazzaville: String

  def congoKinshasa: String

  def cookIslands: String

  def costaRica: String

  def coteDivoire: String

  def croatia: String

  def cuba: String

  def curacao: String

  def cyprus: String

  def czechia: String

  def denmark: String

  def djibouti: String

  def dominica: String

  def dominicanRepublic: String

  def ecuador: String

  def egypt: String

  def elSalvador: String

  def equatorialGuinea: String

  def eritrea: String

  def estonia: String

  def eswatini: String

  def ethiopia: String

  def falklandIslands: String

  def faroeIslands: String

  def fiji: String

  def finland: String

  def france: String

  def frenchGuiana: String

  def frenchPolynesia: String

  def frenchSouthernTerritories: String

  def gabon: String

  def gambia: String

  def georgia: String

  def germany: String

  def ghana: String

  def gibraltar: String

  def greece: String

  def greenland: String

  def grenada: String

  def guadeloupe: String

  def guam: String

  def guatemala: String

  def guernsey: String

  def guinea: String

  def guineaBissau: String

  def guyana: String

  def haiti: String

  def heardAndMcDonaldIslands: String

  def honduras: String

  def hongKong: String

  def hungary: String

  def iceland: String

  def india: String

  def indonesia: String

  def iran: String

  def iraq: String

  def ireland: String

  def isleOfMan: String

  def israel: String

  def italy: String

  def jamaica: String

  def japan: String

  def jersey: String

  def jordan: String

  def kazakhstan: String

  def kenya: String

  def kiribati: String

  def kuwait: String

  def kyrgyzstan: String

  def laos: String

  def latvia: String

  def lebanon: String

  def lesotho: String

  def liberia: String

  def libya: String

  def liechtenstein: String

  def lithuania: String

  def luxembourg: String

  def macao: String

  def madagascar: String

  def malawi: String

  def malaysia: String

  def maldives: String

  def mali: String

  def malta: String

  def marshallIslands: String

  def martinique: String

  def mauritania: String

  def mauritius: String

  def mayotte: String

  def mexico: String

  def micronesia: String

  def moldova: String

  def monaco: String

  def mongolia: String

  def montenegro: String

  def montserrat: String

  def morocco: String

  def mozambique: String

  def myanmar: String

  def namibia: String

  def nauruCountry: String

  def nepal: String

  def netherlands: String

  def newCaledonia: String

  def newZealand: String

  def nicaragua: String

  def niger: String

  def nigeria: String

  def niue: String

  def norfolkIsland: String

  def northKorea: String

  def northMacedonia: String

  def northernMarianaIslands: String

  def norway: String

  def oman: String

  def pakistan: String

  def palau: String

  def palestinianTerritories: String

  def panama: String

  def papuaNewGuinea: String

  def paraguay: String

  def peru: String

  def philippines: String

  def pitcairnIslands: String

  def poland: String

  def portugal: String

  def puertoRico: String

  def qatar: String

  def reunion: String

  def romania: String

  def russia: String

  def rwanda: String

  def saintBarthelemy: String

  def saintHelena: String

  def saintKittsAndNevis: String

  def saintLucia: String

  def saintMartin: String

  def saintPierreAndMiquelon: String

  def saintVincentAndTheGrenadines: String

  def samoa: String

  def sanMarino: String

  def saoTomeAndPrincipe: String

  def saudiArabia: String

  def senegal: String

  def serbia: String

  def seychelles: String

  def sierraLeone: String

  def singapore: String

  def sintMaarten: String

  def slovakia: String

  def slovenia: String

  def solomonIslands: String

  def somalia: String

  def southAfrica: String

  def southGeorgiaAndSouthSandwichIslands: String

  def southKorea: String

  def southSudan: String

  def spain: String

  def sriLanka: String

  def sudan: String

  def suriname: String

  def svalbardAndJanMayen: String

  def sweden: String

  def switzerland: String

  def syria: String

  def taiwan: String

  def tajikistan: String

  def tanzania: String

  def thailand: String

  def timorLeste: String

  def togo: String

  def tokelau: String

  def tonga: String

  def trinidadAndTobago: String

  def tunisia: String

  def turkey: String

  def turkmenistan: String

  def turksAndCaicosIslands: String

  def tuvalu: String

  def uganda: String

  def ukraine: String

  def unitedArabEmirates: String

  def unitedKingdom: String

  def unitedStates: String

  def unitedStatesOutlyingIslands: String

  def unitedStatesVirginIslands: String

  def uruguay: String

  def uzbekistan: String

  def vanuatu: String

  def vaticanCity: String

  def venezuela: String

  def vietnam: String

  def wallisAndFutuna: String

  def westernSahara: String

  def yemen: String

  def zambia: String

  def zimbabwe: String

}
