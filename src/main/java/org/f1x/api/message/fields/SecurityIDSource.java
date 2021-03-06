/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.api.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum SecurityIDSource implements org.f1x.api.message.types.StringEnum {
	CUSIP("1"),
	SEDOL("2"),
	QUIK("3"),
	ISIN_NUMBER("4"),
	RIC_CODE("5"),
	ISO_CURRENCY_CODE("6"),
	ISO_COUNTRY_CODE("7"),
	EXCHANGE_SYMBOL("8"),
	CONSOLIDATED_TAPE_ASSOCIATION("9"),
	BLOOMBERG_SYMBOL("A"),
	WERTPAPIER("B"),
	DUTCH("C"),
	VALOREN("D"),
	SICOVAM("E"),
	BELGIAN("F"),
	COMMON("G"),
	CLEARING_HOUSE_CLEARING_ORGANIZATION("H"),
	ISDA_FPML_PRODUCT_SPECIFICATION("I"),
	OPTIONS_PRICE_REPORTING_AUTHORITY("J");

	private final String code;

	SecurityIDSource (String code) {
		this.code  = code;
		bytes = code.getBytes();
	}

	public String getCode() { return code; }

	private final byte[] bytes;
	public byte[] getBytes() { return bytes; }


	public static SecurityIDSource parse(String s) {
		switch(s) {
			case "1" : return CUSIP;
			case "2" : return SEDOL;
			case "3" : return QUIK;
			case "4" : return ISIN_NUMBER;
			case "5" : return RIC_CODE;
			case "6" : return ISO_CURRENCY_CODE;
			case "7" : return ISO_COUNTRY_CODE;
			case "8" : return EXCHANGE_SYMBOL;
			case "9" : return CONSOLIDATED_TAPE_ASSOCIATION;
			case "A" : return BLOOMBERG_SYMBOL;
			case "B" : return WERTPAPIER;
			case "C" : return DUTCH;
			case "D" : return VALOREN;
			case "E" : return SICOVAM;
			case "F" : return BELGIAN;
			case "G" : return COMMON;
			case "H" : return CLEARING_HOUSE_CLEARING_ORGANIZATION;
			case "I" : return ISDA_FPML_PRODUCT_SPECIFICATION;
			case "J" : return OPTIONS_PRICE_REPORTING_AUTHORITY;
		}
		return null;
	}

}