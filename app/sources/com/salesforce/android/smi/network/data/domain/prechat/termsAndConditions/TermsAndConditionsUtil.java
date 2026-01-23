package com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions;

import android.text.SpannableString;
import android.text.style.URLSpan;
import androidx.core.util.PatternsCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: TermsAndConditionsUtil.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f\u001a(\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007\u001a(\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007\u001a2\u0010\u0012\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f0\u000eH\u0007\"\u0018\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "TERMS_AND_CONDITIONS_REGEX", "", "TERMS_AND_CONDITIONS_KEY_DELIMITER_START", "TERMS_AND_CONDITIONS_KEY_DELIMITER_END", "TERMS_AND_CONDITIONS_URL_DELIMITER_START", "TERMS_AND_CONDITIONS_URL_DELIMITER_END", "createSpannableString", "Landroid/text/SpannableString;", "Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "parseTermsAndConditions", "", "Lkotlin/Pair;", AnnotatedPrivateKey.LABEL, "parseUrlsOnly", "parseFormattedLabel", "map", "data_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions.TermsAndConditionsUtilKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TermsAndConditionsUtil {
    private static final String TERMS_AND_CONDITIONS_KEY_DELIMITER_END = "]";
    private static final String TERMS_AND_CONDITIONS_KEY_DELIMITER_START = "[";
    private static final String TERMS_AND_CONDITIONS_REGEX = "\\[(.*?)\\]\\((.*?)\\)";
    private static final String TERMS_AND_CONDITIONS_URL_DELIMITER_END = ")";
    private static final String TERMS_AND_CONDITIONS_URL_DELIMITER_START = "(";
    private static final Logger logger = Logger.getLogger("TermsAndConditionsUtil");

    public static final SpannableString createSpannableString(TermsAndConditions termsAndConditions) {
        Intrinsics.checkNotNullParameter(termsAndConditions, "<this>");
        String label = termsAndConditions.getLabel();
        if (label == null) {
            return null;
        }
        Map<String, Tuples2<String, String>> termsAndConditions2 = parseTermsAndConditions(label);
        String formattedLabel = parseFormattedLabel(label, termsAndConditions2);
        Map mapPlus = MapsKt.plus(termsAndConditions2, parseUrlsOnly(formattedLabel));
        SpannableString spannableString = new SpannableString(formattedLabel);
        for (Tuples2 tuples2 : mapPlus.values()) {
            final String str = (String) tuples2.getSecond();
            URLSpan uRLSpan = new URLSpan(str) { // from class: com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions.TermsAndConditionsUtilKt$createSpannableString$1$urlSpan$1
            };
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) formattedLabel, (String) tuples2.getFirst(), 0, false, 6, (Object) null);
            if (iIndexOf$default != -1) {
                spannableString.setSpan(uRLSpan, iIndexOf$default, ((String) tuples2.getFirst()).length() + iIndexOf$default, 33);
            }
        }
        return spannableString;
    }

    public static final Map<String, Tuples2<String, String>> parseTermsAndConditions(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Matcher matcher = Pattern.compile(TERMS_AND_CONDITIONS_REGEX).matcher(label);
            while (matcher.find()) {
                String strGroup = matcher.group();
                Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
                String string2 = StringsKt.trim(StringsKt.substringBefore$default(StringsKt.substringAfter$default(strGroup, TERMS_AND_CONDITIONS_URL_DELIMITER_START, (String) null, 2, (Object) null), TERMS_AND_CONDITIONS_URL_DELIMITER_END, (String) null, 2, (Object) null)).toString();
                if (PatternsCompat.WEB_URL.matcher(string2).matches()) {
                    String strGroup2 = matcher.group();
                    String strGroup3 = matcher.group();
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "group(...)");
                    linkedHashMap.put(strGroup2, new Tuples2(StringsKt.substringBefore$default(StringsKt.substringAfter$default(strGroup3, TERMS_AND_CONDITIONS_KEY_DELIMITER_START, (String) null, 2, (Object) null), TERMS_AND_CONDITIONS_KEY_DELIMITER_END, (String) null, 2, (Object) null), string2));
                }
            }
            return linkedHashMap;
        } catch (Exception unused) {
            logger.log(Level.WARNING, "Error parsing terms and conditions from label: " + label + ".");
            return linkedHashMap;
        }
    }

    public static final Map<String, Tuples2<String, String>> parseUrlsOnly(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Matcher matcher = PatternsCompat.WEB_URL.matcher(label);
            while (matcher.find()) {
                linkedHashMap.put(matcher.group(), new Tuples2(matcher.group(), matcher.group()));
            }
            return linkedHashMap;
        } catch (Exception unused) {
            logger.log(Level.WARNING, "Error parsing web url from label: " + label + ".");
            return linkedHashMap;
        }
    }

    public static final String parseFormattedLabel(String str, Map<String, Tuples2<String, String>> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (str == null) {
            str = "";
        }
        String strReplace$default = str;
        for (Map.Entry<String, Tuples2<String, String>> entry : map.entrySet()) {
            strReplace$default = StringsKt.replace$default(strReplace$default, entry.getKey(), entry.getValue().getFirst(), false, 4, (Object) null);
        }
        return strReplace$default;
    }
}
