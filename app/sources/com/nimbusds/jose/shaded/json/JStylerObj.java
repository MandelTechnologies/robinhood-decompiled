package com.nimbusds.jose.shaded.json;

import java.io.IOException;

/* loaded from: classes27.dex */
class JStylerObj {
    public static final Escape4Web ESCAPE4Web;
    public static final EscapeLT ESCAPE_LT;
    public static final MPAgressive MP_AGGRESIVE;
    public static final MPSimple MP_SIMPLE;
    public static final MPTrue MP_TRUE;

    public interface MustProtect {
        boolean mustBeProtect(String str);
    }

    public interface StringProtector {
        void escape(String str, Appendable appendable);
    }

    public static boolean isSpace(char c) {
        return c == '\r' || c == '\n' || c == '\t' || c == ' ';
    }

    public static boolean isSpecial(char c) {
        return c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '\"';
    }

    public static boolean isSpecialChar(char c) {
        return c == '\b' || c == '\f' || c == '\n';
    }

    public static boolean isSpecialClose(char c) {
        return c == '}' || c == ']' || c == ',' || c == ':';
    }

    public static boolean isUnicode(char c) {
        if (c >= 0 && c <= 31) {
            return true;
        }
        if (c < 127 || c > 159) {
            return c >= 8192 && c <= 8447;
        }
        return true;
    }

    static {
        MP_SIMPLE = new MPSimple();
        MP_TRUE = new MPTrue();
        MP_AGGRESIVE = new MPAgressive();
        ESCAPE_LT = new EscapeLT();
        ESCAPE4Web = new Escape4Web();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MPTrue implements MustProtect {
        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public boolean mustBeProtect(String str) {
            return true;
        }

        private MPTrue() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MPSimple implements MustProtect {
        private MPSimple() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public boolean mustBeProtect(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char cCharAt = str.charAt(0);
            if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-') {
                return true;
            }
            for (int i = 0; i < length; i++) {
                char cCharAt2 = str.charAt(i);
                if (JStylerObj.isSpace(cCharAt2) || JStylerObj.isSpecial(cCharAt2) || JStylerObj.isSpecialChar(cCharAt2) || JStylerObj.isUnicode(cCharAt2)) {
                    return true;
                }
            }
            return JStylerObj.isKeyword(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MPAgressive implements MustProtect {
        private MPAgressive() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public boolean mustBeProtect(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char cCharAt = str.charAt(0);
            if (JStylerObj.isSpecial(cCharAt) || JStylerObj.isUnicode(cCharAt)) {
                return true;
            }
            for (int i = 1; i < length; i++) {
                char cCharAt2 = str.charAt(i);
                if (JStylerObj.isSpecialClose(cCharAt2) || JStylerObj.isUnicode(cCharAt2)) {
                    return true;
                }
            }
            if (JStylerObj.isKeyword(str)) {
                return true;
            }
            char cCharAt3 = str.charAt(0);
            if ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '-') {
                int i2 = 1;
                while (i2 < length) {
                    cCharAt3 = str.charAt(i2);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
                if (cCharAt3 == '.') {
                    i2++;
                }
                while (i2 < length) {
                    cCharAt3 = str.charAt(i2);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
                if (cCharAt3 == 'E' || cCharAt3 == 'e') {
                    int i3 = i2 + 1;
                    if (i3 == length) {
                        return false;
                    }
                    char cCharAt4 = str.charAt(i3);
                    if (cCharAt4 == '+' || cCharAt4 == '-') {
                        i2 += 2;
                        str.charAt(i2);
                    } else {
                        i2 = i3;
                    }
                }
                if (i2 == length) {
                    return false;
                }
                while (i2 < length) {
                    char cCharAt5 = str.charAt(i2);
                    if (cCharAt5 < '0' || cCharAt5 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean isKeyword(String str) {
        if (str.length() < 3) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'n') {
            return str.equals("null");
        }
        if (cCharAt == 't') {
            return str.equals("true");
        }
        if (cCharAt == 'f') {
            return str.equals("false");
        }
        if (cCharAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class EscapeLT implements StringProtector {
        private EscapeLT() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.StringProtector
        public void escape(String str, Appendable appendable) throws IOException {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\f') {
                        if (cCharAt != '\r') {
                            if (cCharAt != '\"') {
                                if (cCharAt == '\\') {
                                    appendable.append("\\\\");
                                } else {
                                    switch (cCharAt) {
                                        case '\b':
                                            appendable.append("\\b");
                                            break;
                                        case '\t':
                                            appendable.append("\\t");
                                            break;
                                        case '\n':
                                            appendable.append("\\n");
                                            break;
                                        default:
                                            if ((cCharAt >= 0 && cCharAt <= 31) || ((cCharAt >= 127 && cCharAt <= 159) || (cCharAt >= 8192 && cCharAt <= 8447))) {
                                                appendable.append("\\u");
                                                appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\f') & 15));
                                                appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\b') & 15));
                                                appendable.append("0123456789ABCDEF".charAt((cCharAt >> 4) & 15));
                                                appendable.append("0123456789ABCDEF".charAt(cCharAt & 15));
                                                break;
                                            } else {
                                                appendable.append(cCharAt);
                                                break;
                                            }
                                    }
                                }
                            } else {
                                appendable.append("\\\"");
                            }
                        } else {
                            appendable.append("\\r");
                        }
                    } else {
                        appendable.append("\\f");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Escape4Web implements StringProtector {
        private Escape4Web() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.StringProtector
        public void escape(String str, Appendable appendable) throws IOException {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\f') {
                        if (cCharAt != '\r') {
                            if (cCharAt != '\"') {
                                if (cCharAt != '/') {
                                    if (cCharAt == '\\') {
                                        appendable.append("\\\\");
                                    } else {
                                        switch (cCharAt) {
                                            case '\b':
                                                appendable.append("\\b");
                                                break;
                                            case '\t':
                                                appendable.append("\\t");
                                                break;
                                            case '\n':
                                                appendable.append("\\n");
                                                break;
                                            default:
                                                if ((cCharAt >= 0 && cCharAt <= 31) || ((cCharAt >= 127 && cCharAt <= 159) || (cCharAt >= 8192 && cCharAt <= 8447))) {
                                                    appendable.append("\\u");
                                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\f') & 15));
                                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\b') & 15));
                                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> 4) & 15));
                                                    appendable.append("0123456789ABCDEF".charAt(cCharAt & 15));
                                                    break;
                                                } else {
                                                    appendable.append(cCharAt);
                                                    break;
                                                }
                                        }
                                    }
                                } else {
                                    appendable.append("\\/");
                                }
                            } else {
                                appendable.append("\\\"");
                            }
                        } else {
                            appendable.append("\\r");
                        }
                    } else {
                        appendable.append("\\f");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }
}
