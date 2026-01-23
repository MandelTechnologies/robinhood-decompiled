package com.nimbusds.jose.shaded.json.parser;

import com.nimbusds.jose.shaded.json.writer.JsonReader;
import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
import com.plaid.internal.EnumC7081g;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes27.dex */
abstract class JSONParserBase {
    protected static boolean[] stopAll;
    protected static boolean[] stopArray;
    protected static boolean[] stopKey;
    protected static boolean[] stopValue;
    protected static boolean[] stopX;
    protected final boolean acceptLeadinZero;
    protected final boolean acceptNaN;
    protected final boolean acceptNonQuote;
    protected final boolean acceptSimpleQuote;
    protected final boolean acceptUselessComma;
    JsonReader base;

    /* renamed from: c */
    protected char f1204c;
    protected final boolean checkTaillingData;
    protected final boolean checkTaillingSpace;
    protected final boolean ignoreControlChar;
    private String lastKey;
    protected int pos;
    protected final boolean reject127;

    /* renamed from: sb */
    protected final MSB f1205sb = new MSB(15);
    protected final boolean unrestictBigDigit;
    protected final boolean useHiPrecisionFloat;
    protected final boolean useIntegerStorage;

    /* renamed from: xo */
    protected Object f1206xo;

    /* renamed from: xs */
    protected String f1207xs;

    protected abstract void read() throws IOException;

    protected abstract void readNQString(boolean[] zArr) throws IOException;

    protected abstract void readNoEnd() throws ParseException, IOException;

    protected abstract Object readNumber(boolean[] zArr) throws ParseException, IOException;

    abstract void readS() throws IOException;

    protected abstract void readString() throws ParseException, IOException;

    static {
        boolean[] zArr = new boolean[EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE];
        stopAll = zArr;
        boolean[] zArr2 = new boolean[EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE];
        stopArray = zArr2;
        boolean[] zArr3 = new boolean[EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE];
        stopKey = zArr3;
        boolean[] zArr4 = new boolean[EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE];
        stopValue = zArr4;
        boolean[] zArr5 = new boolean[EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE];
        stopX = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public JSONParserBase(int i) {
        this.acceptNaN = (i & 4) > 0;
        this.acceptNonQuote = (i & 2) > 0;
        this.acceptSimpleQuote = (i & 1) > 0;
        this.ignoreControlChar = (i & 8) > 0;
        this.useIntegerStorage = (i & 16) > 0;
        this.acceptLeadinZero = (i & 32) > 0;
        this.acceptUselessComma = (i & 64) > 0;
        this.useHiPrecisionFloat = (i & 128) > 0;
        this.checkTaillingData = (i & 768) != 768;
        this.checkTaillingSpace = (i & 512) == 0;
        this.reject127 = (i & 1024) > 0;
        this.unrestictBigDigit = (i & 2048) > 0;
    }

    public void checkControleChar() throws ParseException {
        if (this.ignoreControlChar) {
            return;
        }
        int length = this.f1207xs.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = this.f1207xs.charAt(i);
            if (cCharAt >= 0) {
                if (cCharAt <= 31) {
                    throw new ParseException(this.pos + i, 0, Character.valueOf(cCharAt));
                }
                if (cCharAt == 127 && this.reject127) {
                    throw new ParseException(this.pos + i, 0, Character.valueOf(cCharAt));
                }
            }
        }
    }

    public void checkLeadinZero() throws ParseException {
        int length = this.f1207xs.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.f1207xs.equals("00")) {
                throw new ParseException(this.pos, 6, this.f1207xs);
            }
            return;
        }
        char cCharAt = this.f1207xs.charAt(0);
        char cCharAt2 = this.f1207xs.charAt(1);
        if (cCharAt != '-') {
            if (cCharAt == '0' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                throw new ParseException(this.pos, 6, this.f1207xs);
            }
            return;
        }
        char cCharAt3 = this.f1207xs.charAt(2);
        if (cCharAt2 == '0' && cCharAt3 >= '0' && cCharAt3 <= '9') {
            throw new ParseException(this.pos, 6, this.f1207xs);
        }
    }

    protected Number extractFloat() throws ParseException, NumberFormatException {
        if (!this.acceptLeadinZero) {
            checkLeadinZero();
        }
        try {
            if (!this.useHiPrecisionFloat) {
                return Float.valueOf(Float.parseFloat(this.f1207xs));
            }
            if (this.f1207xs.length() > 18) {
                BigDecimal bigDecimal = new BigDecimal(this.f1207xs);
                if (this.unrestictBigDigit) {
                    return bigDecimal;
                }
                double d = Double.parseDouble(this.f1207xs);
                return String.valueOf(d).equals(this.f1207xs) ? Double.valueOf(d) : bigDecimal;
            }
            return Double.valueOf(Double.parseDouble(this.f1207xs));
        } catch (NumberFormatException unused) {
            throw new ParseException(this.pos, 1, this.f1207xs);
        }
    }

    protected <T> T parse(JsonReaderI<T> jsonReaderI) throws ParseException {
        this.pos = -1;
        try {
            read();
            T t = (T) readFirst(jsonReaderI);
            if (this.checkTaillingData) {
                if (!this.checkTaillingSpace) {
                    skipSpace();
                }
                if (this.f1204c != 26) {
                    throw new ParseException(this.pos - 1, 1, Character.valueOf(this.f1204c));
                }
            }
            this.f1207xs = null;
            this.f1206xo = null;
            return t;
        } catch (IOException e) {
            throw new ParseException(this.pos, e);
        }
    }

    protected Number parseNumber(String str) throws ParseException {
        int i;
        int i2;
        int length = str.length();
        boolean z = false;
        if (str.charAt(0) == '-') {
            if (!this.acceptLeadinZero && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.pos, 6, str);
            }
            i = 20;
            i2 = 1;
        } else {
            if (!this.acceptLeadinZero && length >= 2 && str.charAt(0) == '0') {
                throw new ParseException(this.pos, 6, str);
            }
            i = 19;
            i2 = 0;
        }
        int i3 = i2;
        if (length >= i) {
            if (length > i) {
                return new BigInteger(str, 10);
            }
            length--;
            z = true;
        }
        long jCharAt = 0;
        while (i2 < length) {
            jCharAt = (jCharAt * 10) + ('0' - str.charAt(i2));
            i2++;
        }
        if (z) {
            if (jCharAt <= -922337203685477580L) {
                if (jCharAt >= -922337203685477580L) {
                    if (i3 != 0) {
                    }
                }
                return new BigInteger(str, 10);
            }
            jCharAt = (jCharAt * 10) + ('0' - str.charAt(i2));
        }
        if (i3 != 0) {
            if (this.useIntegerStorage && jCharAt >= -2147483648L) {
                return Integer.valueOf((int) jCharAt);
            }
            return Long.valueOf(jCharAt);
        }
        long j = -jCharAt;
        if (this.useIntegerStorage && j <= 2147483647L) {
            return Integer.valueOf((int) j);
        }
        return Long.valueOf(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r4 == ':') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r4 == ']') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r4 == '}') goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r7.acceptUselessComma == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r7.pos, 0, java.lang.Character.valueOf(r7.f1204c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        return r8.convert(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r7.pos, 0, java.lang.Character.valueOf(r7.f1204c));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected <T> T readArray(JsonReaderI<T> jsonReaderI) throws ParseException, IOException {
        Object objCreateArray = jsonReaderI.createArray();
        if (this.f1204c != '[') {
            throw new RuntimeException("Internal Error");
        }
        read();
        if (this.f1204c == ',' && !this.acceptUselessComma) {
            throw new ParseException(this.pos, 0, Character.valueOf(this.f1204c));
        }
        while (true) {
            boolean z = false;
            while (true) {
                char c = this.f1204c;
                if (c != '\t' && c != '\n' && c != '\r') {
                    if (c == 26) {
                        throw new ParseException(this.pos - 1, 3, "EOF");
                    }
                    if (c != ' ') {
                        if (c != ',') {
                            break;
                        }
                        if (z && !this.acceptUselessComma) {
                            throw new ParseException(this.pos, 0, Character.valueOf(this.f1204c));
                        }
                        read();
                        z = true;
                    }
                }
                read();
            }
            jsonReaderI.addValue(objCreateArray, readMain(jsonReaderI, stopArray));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r3.pos, 0, java.lang.Character.valueOf(r3.f1204c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fd, code lost:
    
        r0 = readNumber(com.nimbusds.jose.shaded.json.parser.JSONParserBase.stopX);
        r3.f1206xo = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
    
        return r4.convert(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected <T> T readFirst(JsonReaderI<T> jsonReaderI) throws ParseException, IOException {
        while (true) {
            char c = this.f1204c;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        readString();
                        return jsonReaderI.convert(this.f1207xs);
                    case '-':
                        break;
                    case 'N':
                        readNQString(stopX);
                        if (!this.acceptNaN) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        if ("NaN".equals(this.f1207xs)) {
                            return jsonReaderI.convert(Float.valueOf(Float.NaN));
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        return jsonReaderI.convert(this.f1207xs);
                    case '[':
                        return (T) readArray(jsonReaderI);
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        readNQString(stopX);
                        if ("false".equals(this.f1207xs)) {
                            return jsonReaderI.convert(Boolean.FALSE);
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        return jsonReaderI.convert(this.f1207xs);
                    case 'n':
                        readNQString(stopX);
                        if ("null".equals(this.f1207xs)) {
                            return null;
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        return jsonReaderI.convert(this.f1207xs);
                    case 't':
                        readNQString(stopX);
                        if ("true".equals(this.f1207xs)) {
                            return jsonReaderI.convert(Boolean.TRUE);
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        return jsonReaderI.convert(this.f1207xs);
                    case '{':
                        return (T) readObject(jsonReaderI);
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                readNQString(stopX);
                                if (!this.acceptNonQuote) {
                                    throw new ParseException(this.pos, 1, this.f1207xs);
                                }
                                return jsonReaderI.convert(this.f1207xs);
                        }
                }
            }
            read();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r2.pos, 0, java.lang.Character.valueOf(r2.f1204c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
    
        return readNumber(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object readMain(JsonReaderI<?> jsonReaderI, boolean[] zArr) throws ParseException, IOException {
        while (true) {
            char c = this.f1204c;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        readString();
                        return this.f1207xs;
                    case '-':
                        break;
                    case 'N':
                        readNQString(zArr);
                        if (!this.acceptNaN) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        if ("NaN".equals(this.f1207xs)) {
                            return Float.valueOf(Float.NaN);
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        return this.f1207xs;
                    case '[':
                        return readArray(jsonReaderI.startArray(this.lastKey));
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        readNQString(zArr);
                        if ("false".equals(this.f1207xs)) {
                            return Boolean.FALSE;
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        return this.f1207xs;
                    case 'n':
                        readNQString(zArr);
                        if ("null".equals(this.f1207xs)) {
                            return null;
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        return this.f1207xs;
                    case 't':
                        readNQString(zArr);
                        if ("true".equals(this.f1207xs)) {
                            return Boolean.TRUE;
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                        return this.f1207xs;
                    case '{':
                        return readObject(jsonReaderI.startObject(this.lastKey));
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                readNQString(zArr);
                                if (!this.acceptNonQuote) {
                                    throw new ParseException(this.pos, 1, this.f1207xs);
                                }
                                return this.f1207xs;
                        }
                }
            }
            read();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r12.pos, 0, java.lang.Character.valueOf(r12.f1204c));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected <T> T readObject(JsonReaderI<T> jsonReaderI) throws ParseException, IOException {
        if (this.f1204c != '{') {
            throw new RuntimeException("Internal Error");
        }
        Object objCreateObject = jsonReaderI.createObject();
        boolean z = false;
        while (true) {
            read();
            char c = this.f1204c;
            if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                if (c != ',') {
                    if (c == ':' || c == '[' || c == ']' || c == '{') {
                        break;
                    }
                    if (c == '}') {
                        if (z && !this.acceptUselessComma) {
                            throw new ParseException(this.pos, 0, Character.valueOf(this.f1204c));
                        }
                        read();
                        return jsonReaderI.convert(objCreateObject);
                    }
                    if (c == '\"' || c == '\'') {
                        readString();
                    } else {
                        readNQString(stopKey);
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f1207xs);
                        }
                    }
                    String str = this.f1207xs;
                    skipSpace();
                    char c2 = this.f1204c;
                    if (c2 != ':') {
                        if (c2 == 26) {
                            throw new ParseException(this.pos - 1, 3, null);
                        }
                        throw new ParseException(this.pos - 1, 0, Character.valueOf(this.f1204c));
                    }
                    readNoEnd();
                    this.lastKey = str;
                    jsonReaderI.setValue(objCreateObject, str, readMain(jsonReaderI, stopValue));
                    this.lastKey = null;
                    skipSpace();
                    char c3 = this.f1204c;
                    if (c3 == '}') {
                        read();
                        return jsonReaderI.convert(objCreateObject);
                    }
                    if (c3 == 26) {
                        throw new ParseException(this.pos - 1, 3, null);
                    }
                    if (c3 != ',') {
                        throw new ParseException(this.pos - 1, 1, Character.valueOf(this.f1204c));
                    }
                } else if (z && !this.acceptUselessComma) {
                    throw new ParseException(this.pos, 0, Character.valueOf(this.f1204c));
                }
                z = true;
            }
        }
    }

    protected void readString2() throws ParseException, IOException {
        char c = this.f1204c;
        while (true) {
            read();
            char c2 = this.f1204c;
            if (c2 == '\"' || c2 == '\'') {
                if (c == c2) {
                    read();
                    this.f1207xs = this.f1205sb.toString();
                    return;
                }
                this.f1205sb.append(c2);
            } else if (c2 == '\\') {
                read();
                char c3 = this.f1204c;
                if (c3 == '\"') {
                    this.f1205sb.append('\"');
                } else if (c3 == '\'') {
                    this.f1205sb.append('\'');
                } else if (c3 == '/') {
                    this.f1205sb.append('/');
                } else if (c3 == '\\') {
                    this.f1205sb.append('\\');
                } else if (c3 == 'b') {
                    this.f1205sb.append('\b');
                } else if (c3 == 'f') {
                    this.f1205sb.append('\f');
                } else if (c3 == 'n') {
                    this.f1205sb.append('\n');
                } else if (c3 == 'r') {
                    this.f1205sb.append('\r');
                } else if (c3 == 'x') {
                    this.f1205sb.append(readUnicode(2));
                } else if (c3 == 't') {
                    this.f1205sb.append('\t');
                } else if (c3 == 'u') {
                    this.f1205sb.append(readUnicode(4));
                }
            } else if (c2 != 127) {
                switch (c2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        if (!this.ignoreControlChar) {
                            throw new ParseException(this.pos, 0, Character.valueOf(this.f1204c));
                        }
                        continue;
                    case 26:
                        throw new ParseException(this.pos - 1, 3, null);
                }
                this.f1205sb.append(c2);
            } else if (this.ignoreControlChar) {
                continue;
            } else {
                if (this.reject127) {
                    throw new ParseException(this.pos, 0, Character.valueOf(this.f1204c));
                }
                this.f1205sb.append(c2);
            }
        }
    }

    protected char readUnicode(int i) throws ParseException, IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 * 16;
            read();
            char c = this.f1204c;
            if (c <= '9' && c >= '0') {
                i2 = c - '0';
            } else if (c <= 'F' && c >= 'A') {
                i2 = c - '7';
            } else {
                if (c < 'a' || c > 'f') {
                    if (c == 26) {
                        throw new ParseException(this.pos, 3, "EOF");
                    }
                    throw new ParseException(this.pos, 4, Character.valueOf(this.f1204c));
                }
                i2 = c - 'W';
            }
            i3 = i5 + i2;
        }
        return (char) i3;
    }

    protected void skipDigits() throws IOException {
        while (true) {
            char c = this.f1204c;
            if (c < '0' || c > '9') {
                return;
            } else {
                readS();
            }
        }
    }

    protected void skipNQString(boolean[] zArr) throws IOException {
        while (true) {
            char c = this.f1204c;
            if (c == 26) {
                return;
            }
            if (c >= 0 && c < '~' && zArr[c]) {
                return;
            } else {
                readS();
            }
        }
    }

    protected void skipSpace() throws IOException {
        while (true) {
            char c = this.f1204c;
            if (c > ' ' || c == 26) {
                return;
            } else {
                readS();
            }
        }
    }

    public static class MSB {

        /* renamed from: b */
        char[] f1208b;

        /* renamed from: p */
        int f1209p = -1;

        public MSB(int i) {
            this.f1208b = new char[i];
        }

        public void append(char c) {
            int i = this.f1209p + 1;
            this.f1209p = i;
            char[] cArr = this.f1208b;
            if (cArr.length <= i) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f1208b = cArr2;
            }
            this.f1208b[this.f1209p] = c;
        }

        public String toString() {
            return new String(this.f1208b, 0, this.f1209p + 1);
        }

        public void clear() {
            this.f1209p = -1;
        }
    }
}
