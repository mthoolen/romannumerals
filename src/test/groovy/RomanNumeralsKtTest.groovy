import nl.codesquad.kata.RomanNumerals
import spock.lang.Specification

class RomanNumeralsKtTest extends Specification {

    def "Convert a number into the roman counterpart"() {
        expect:
        new RomanNumerals().convert(number) == roman

        where:
        number | roman
        1      | "I"
        2      | "II"
        5      | "V"
        10     | "X"
        50     | "L"
        100    | "C"
        500    | "D"
        1000   | "M"
        6      | "VI"
        7      | "VII"
        8      | "VIII"
        15     | "XV"
        16     | "XVI"
        115    | "CXV"
        1015   | "MXV"
        4      | "IV"
        9      | "IX"
        40     | "XL"
        90     | "XC"
        400    | "CD"
        900    | "CM"
        41     | "XLI"
    }
}
