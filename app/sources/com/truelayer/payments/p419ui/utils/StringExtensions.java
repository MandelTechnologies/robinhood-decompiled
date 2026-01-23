package com.truelayer.payments.p419ui.utils;

import android.icu.text.Normalizer2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: StringExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\n\u001a\u00020\u0006*\u00020\u0006H\u0000\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m3636d2 = {"NON_NFKD_MAP", "", "", "getNON_NFKD_MAP", "()Ljava/util/Map;", "capitalise", "", "locale", "Ljava/util/Locale;", "searchNormalize", "searchNormalizeLowercase", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.utils.StringExtensionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class StringExtensions {
    private static final Map<Character, Character> NON_NFKD_MAP;

    public static final String capitalise(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.titlecase(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static /* synthetic */ String capitalise$default(String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        }
        return capitalise(str, locale);
    }

    public static final String searchNormalize(String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Normalizer2 nFKDInstance = Normalizer2.getNFKDInstance();
        String strNormalize = nFKDInstance != null ? nFKDInstance.normalize(str) : null;
        if (strNormalize != null) {
            StringBuilder sb = new StringBuilder();
            int length = strNormalize.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = strNormalize.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || CharsKt.isWhitespace(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (string2 != null) {
                ArrayList arrayList = new ArrayList(string2.length());
                for (int i2 = 0; i2 < string2.length(); i2++) {
                    char cCharAt2 = string2.charAt(i2);
                    Character ch = NON_NFKD_MAP.get(Character.valueOf(cCharAt2));
                    if (ch != null) {
                        cCharAt2 = ch.charValue();
                    }
                    arrayList.add(Character.valueOf(cCharAt2));
                }
                String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
                if (strJoinToString$default != null) {
                    return strJoinToString$default;
                }
            }
        }
        return str;
    }

    public static final String searchNormalizeLowercase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = searchNormalize(str).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    static {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put((char) 385, 'B');
        mapCreateMapBuilder.put((char) 7553, 'd');
        mapCreateMapBuilder.put((char) 7557, 'l');
        mapCreateMapBuilder.put((char) 7561, 'r');
        mapCreateMapBuilder.put((char) 651, 'v');
        mapCreateMapBuilder.put((char) 7565, 'x');
        mapCreateMapBuilder.put((char) 7555, 'g');
        mapCreateMapBuilder.put((char) 401, 'F');
        mapCreateMapBuilder.put((char) 409, 'k');
        mapCreateMapBuilder.put((char) 413, 'N');
        mapCreateMapBuilder.put((char) 544, 'N');
        mapCreateMapBuilder.put((char) 421, 'p');
        Character chValueOf = Character.valueOf(Matrix.MATRIX_TYPE_ZERO);
        mapCreateMapBuilder.put((char) 548, chValueOf);
        mapCreateMapBuilder.put((char) 294, 'H');
        mapCreateMapBuilder.put((char) 429, 't');
        mapCreateMapBuilder.put((char) 437, chValueOf);
        mapCreateMapBuilder.put((char) 564, 'l');
        mapCreateMapBuilder.put((char) 572, 'c');
        mapCreateMapBuilder.put((char) 576, 'z');
        mapCreateMapBuilder.put((char) 322, 'l');
        mapCreateMapBuilder.put((char) 580, Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT));
        Character chValueOf2 = Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT);
        mapCreateMapBuilder.put((char) 11360, chValueOf2);
        mapCreateMapBuilder.put((char) 584, 'J');
        mapCreateMapBuilder.put((char) 42826, 'O');
        mapCreateMapBuilder.put((char) 588, Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR));
        mapCreateMapBuilder.put((char) 42834, 'P');
        mapCreateMapBuilder.put((char) 42838, 'Q');
        mapCreateMapBuilder.put((char) 42842, Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR));
        mapCreateMapBuilder.put((char) 42846, 'V');
        mapCreateMapBuilder.put((char) 608, 'g');
        mapCreateMapBuilder.put((char) 485, 'g');
        mapCreateMapBuilder.put((char) 11364, Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR));
        mapCreateMapBuilder.put((char) 358, 'T');
        mapCreateMapBuilder.put((char) 616, 'i');
        mapCreateMapBuilder.put((char) 11366, 't');
        mapCreateMapBuilder.put((char) 620, 'l');
        mapCreateMapBuilder.put((char) 7534, 'f');
        mapCreateMapBuilder.put((char) 7559, 'n');
        mapCreateMapBuilder.put((char) 7538, 'r');
        mapCreateMapBuilder.put((char) 11380, 'v');
        mapCreateMapBuilder.put((char) 7542, 'z');
        mapCreateMapBuilder.put((char) 11384, 'e');
        mapCreateMapBuilder.put((char) 636, 'r');
        mapCreateMapBuilder.put((char) 7935, 'y');
        mapCreateMapBuilder.put((char) 42817, 'k');
        mapCreateMapBuilder.put((char) 386, 'B');
        mapCreateMapBuilder.put((char) 7558, 'm');
        mapCreateMapBuilder.put((char) 648, 't');
        mapCreateMapBuilder.put((char) 394, 'D');
        mapCreateMapBuilder.put((char) 7566, 'z');
        mapCreateMapBuilder.put((char) 273, 'd');
        mapCreateMapBuilder.put((char) 656, 'z');
        mapCreateMapBuilder.put((char) 402, 'f');
        mapCreateMapBuilder.put((char) 7574, 'i');
        mapCreateMapBuilder.put((char) 410, 'l');
        mapCreateMapBuilder.put((char) 414, 'n');
        mapCreateMapBuilder.put((char) 7560, 'p');
        mapCreateMapBuilder.put((char) 672, 'q');
        mapCreateMapBuilder.put((char) 430, 'T');
        mapCreateMapBuilder.put((char) 434, 'V');
        mapCreateMapBuilder.put((char) 438, 'z');
        mapCreateMapBuilder.put((char) 571, 'C');
        mapCreateMapBuilder.put((char) 575, 's');
        mapCreateMapBuilder.put((char) 321, chValueOf2);
        mapCreateMapBuilder.put((char) 579, 'B');
        mapCreateMapBuilder.put((char) 42821, 'k');
        mapCreateMapBuilder.put((char) 583, 'e');
        mapCreateMapBuilder.put((char) 42825, 'l');
        mapCreateMapBuilder.put((char) 587, 'q');
        mapCreateMapBuilder.put((char) 42829, 'o');
        mapCreateMapBuilder.put((char) 591, 'y');
        mapCreateMapBuilder.put((char) 42833, 'p');
        mapCreateMapBuilder.put((char) 595, 'b');
        mapCreateMapBuilder.put((char) 42837, 'p');
        mapCreateMapBuilder.put((char) 599, 'd');
        mapCreateMapBuilder.put((char) 42841, 'q');
        mapCreateMapBuilder.put((char) 216, 'O');
        mapCreateMapBuilder.put((char) 11363, 'P');
        mapCreateMapBuilder.put((char) 11367, 'H');
        mapCreateMapBuilder.put((char) 619, 'l');
        mapCreateMapBuilder.put((char) 7533, 'd');
        mapCreateMapBuilder.put((char) 7537, 'p');
        mapCreateMapBuilder.put((char) 627, 'n');
        mapCreateMapBuilder.put((char) 7541, 't');
        mapCreateMapBuilder.put((char) 7569, 'd');
        mapCreateMapBuilder.put((char) 248, 'o');
        mapCreateMapBuilder.put((char) 11390, 'S');
        mapCreateMapBuilder.put((char) 7549, 'p');
        mapCreateMapBuilder.put((char) 11391, chValueOf);
        mapCreateMapBuilder.put((char) 387, 'b');
        mapCreateMapBuilder.put((char) 391, 'C');
        mapCreateMapBuilder.put((char) 7552, 'b');
        mapCreateMapBuilder.put((char) 649, 'u');
        mapCreateMapBuilder.put((char) 395, 'D');
        mapCreateMapBuilder.put((char) 7567, 'a');
        mapCreateMapBuilder.put((char) 657, 'z');
        mapCreateMapBuilder.put((char) 272, 'D');
        mapCreateMapBuilder.put((char) 403, 'G');
        mapCreateMapBuilder.put((char) 7554, 'f');
        mapCreateMapBuilder.put((char) 407, 'I');
        mapCreateMapBuilder.put((char) 669, 'j');
        mapCreateMapBuilder.put((char) 415, 'O');
        mapCreateMapBuilder.put((char) 11372, 'z');
        mapCreateMapBuilder.put((char) 427, 't');
        mapCreateMapBuilder.put((char) 435, 'Y');
        mapCreateMapBuilder.put((char) 566, 't');
        mapCreateMapBuilder.put((char) 570, 'A');
        mapCreateMapBuilder.put((char) 574, 'T');
        mapCreateMapBuilder.put((char) 42816, 'K');
        mapCreateMapBuilder.put((char) 7562, 's');
        mapCreateMapBuilder.put((char) 42820, 'K');
        mapCreateMapBuilder.put((char) 582, 'E');
        mapCreateMapBuilder.put((char) 42824, chValueOf2);
        mapCreateMapBuilder.put((char) 42828, 'O');
        mapCreateMapBuilder.put((char) 590, 'Y');
        mapCreateMapBuilder.put((char) 42832, 'P');
        mapCreateMapBuilder.put((char) 42836, 'P');
        mapCreateMapBuilder.put((char) 598, 'd');
        mapCreateMapBuilder.put((char) 42840, 'Q');
        mapCreateMapBuilder.put((char) 11362, chValueOf2);
        mapCreateMapBuilder.put((char) 614, 'h');
        mapCreateMapBuilder.put((char) 11379, 'w');
        mapCreateMapBuilder.put((char) 11370, 'k');
        mapCreateMapBuilder.put((char) 7532, 'b');
        mapCreateMapBuilder.put((char) 11374, 'M');
        mapCreateMapBuilder.put((char) 7536, 'n');
        mapCreateMapBuilder.put((char) 626, 'n');
        mapCreateMapBuilder.put((char) 7570, 'e');
        mapCreateMapBuilder.put((char) 7540, 's');
        mapCreateMapBuilder.put((char) 11386, 'o');
        mapCreateMapBuilder.put((char) 11371, chValueOf);
        mapCreateMapBuilder.put((char) 638, 'r');
        mapCreateMapBuilder.put((char) 384, 'b');
        mapCreateMapBuilder.put((char) 642, 's');
        mapCreateMapBuilder.put((char) 7556, 'k');
        mapCreateMapBuilder.put((char) 392, 'c');
        mapCreateMapBuilder.put((char) 396, 'd');
        mapCreateMapBuilder.put((char) 42818, 'K');
        mapCreateMapBuilder.put((char) 7577, 'u');
        mapCreateMapBuilder.put((char) 408, 'K');
        mapCreateMapBuilder.put((char) 7564, 'v');
        mapCreateMapBuilder.put((char) 545, 'd');
        mapCreateMapBuilder.put((char) 11377, 'v');
        mapCreateMapBuilder.put((char) 549, 'z');
        mapCreateMapBuilder.put((char) 420, 'P');
        mapCreateMapBuilder.put((char) 295, 'h');
        mapCreateMapBuilder.put((char) 428, 'T');
        mapCreateMapBuilder.put((char) 565, 'n');
        mapCreateMapBuilder.put((char) 436, 'y');
        mapCreateMapBuilder.put((char) 11378, 'W');
        mapCreateMapBuilder.put((char) 573, chValueOf2);
        mapCreateMapBuilder.put((char) 42819, 'k');
        mapCreateMapBuilder.put((char) 585, 'j');
        mapCreateMapBuilder.put((char) 42827, 'o');
        mapCreateMapBuilder.put((char) 589, 'r');
        mapCreateMapBuilder.put((char) 42835, 'p');
        mapCreateMapBuilder.put((char) 597, 'c');
        mapCreateMapBuilder.put((char) 42839, 'q');
        mapCreateMapBuilder.put((char) 11368, 'h');
        mapCreateMapBuilder.put((char) 42843, 'r');
        mapCreateMapBuilder.put((char) 42847, 'v');
        mapCreateMapBuilder.put((char) 11361, 'l');
        mapCreateMapBuilder.put((char) 11365, 'a');
        mapCreateMapBuilder.put((char) 484, 'G');
        mapCreateMapBuilder.put((char) 359, 't');
        mapCreateMapBuilder.put((char) 11369, 'K');
        mapCreateMapBuilder.put((char) 621, 'l');
        mapCreateMapBuilder.put((char) 7535, 'm');
        mapCreateMapBuilder.put((char) 625, 'm');
        mapCreateMapBuilder.put((char) 7539, 'r');
        mapCreateMapBuilder.put((char) 637, 'r');
        mapCreateMapBuilder.put((char) 7934, 'Y');
        NON_NFKD_MAP = MapsKt.build(mapCreateMapBuilder);
    }

    public static final Map<Character, Character> getNON_NFKD_MAP() {
        return NON_NFKD_MAP;
    }
}
