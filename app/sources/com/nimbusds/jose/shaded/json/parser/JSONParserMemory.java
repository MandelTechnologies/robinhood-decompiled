package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;

/* loaded from: classes27.dex */
abstract class JSONParserMemory extends JSONParserBase {
    protected int len;

    protected abstract void extractString(int i, int i2);

    protected abstract void extractStringTrim(int i, int i2);

    protected abstract int indexOf(char c, int i);

    public JSONParserMemory(int i) {
        super(i);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    protected void readNQString(boolean[] zArr) throws IOException {
        int i = this.pos;
        skipNQString(zArr);
        extractStringTrim(i, this.pos);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    protected Object readNumber(boolean[] zArr) throws ParseException, IOException {
        int i = this.pos;
        read();
        skipDigits();
        char c = this.f1204c;
        if (c != '.' && c != 'E' && c != 'e') {
            skipSpace();
            char c2 = this.f1204c;
            if (c2 >= 0 && c2 < '~' && !zArr[c2] && c2 != 26) {
                skipNQString(zArr);
                extractStringTrim(i, this.pos);
                if (!this.acceptNonQuote) {
                    throw new ParseException(this.pos, 1, this.f1207xs);
                }
                return this.f1207xs;
            }
            extractStringTrim(i, this.pos);
            return parseNumber(this.f1207xs);
        }
        if (c == '.') {
            read();
            skipDigits();
        }
        char c3 = this.f1204c;
        if (c3 != 'E' && c3 != 'e') {
            skipSpace();
            char c4 = this.f1204c;
            if (c4 >= 0 && c4 < '~' && !zArr[c4] && c4 != 26) {
                skipNQString(zArr);
                extractStringTrim(i, this.pos);
                if (!this.acceptNonQuote) {
                    throw new ParseException(this.pos, 1, this.f1207xs);
                }
                return this.f1207xs;
            }
            extractStringTrim(i, this.pos);
            return extractFloat();
        }
        this.f1205sb.append('E');
        read();
        char c5 = this.f1204c;
        if (c5 == '+' || c5 == '-' || (c5 >= '0' && c5 <= '9')) {
            this.f1205sb.append(c5);
            read();
            skipDigits();
            skipSpace();
            char c6 = this.f1204c;
            if (c6 >= 0 && c6 < '~' && !zArr[c6] && c6 != 26) {
                skipNQString(zArr);
                extractStringTrim(i, this.pos);
                if (!this.acceptNonQuote) {
                    throw new ParseException(this.pos, 1, this.f1207xs);
                }
                return this.f1207xs;
            }
            extractStringTrim(i, this.pos);
            return extractFloat();
        }
        skipNQString(zArr);
        extractStringTrim(i, this.pos);
        if (!this.acceptNonQuote) {
            throw new ParseException(this.pos, 1, this.f1207xs);
        }
        if (!this.acceptLeadinZero) {
            checkLeadinZero();
        }
        return this.f1207xs;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    protected void readString() throws ParseException, IOException {
        if (!this.acceptSimpleQuote && this.f1204c == '\'') {
            if (this.acceptNonQuote) {
                readNQString(JSONParserBase.stopAll);
                return;
            }
            throw new ParseException(this.pos, 0, Character.valueOf(this.f1204c));
        }
        int iIndexOf = indexOf(this.f1204c, this.pos + 1);
        if (iIndexOf == -1) {
            throw new ParseException(this.len, 3, null);
        }
        extractString(this.pos + 1, iIndexOf);
        if (this.f1207xs.indexOf(92) == -1) {
            checkControleChar();
            this.pos = iIndexOf;
            read();
        } else {
            this.f1205sb.clear();
            readString2();
        }
    }
}
