package com.robinhood.utils.extensions;

import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import p479j$.time.Instant;
import p479j$.time.OffsetDateTime;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\f\u0010\n\u001a\u0011\u0010\r\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0002\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"", "nullIfEmpty", "(Ljava/lang/String;)Ljava/lang/String;", "unbreakable", "Ljava/util/UUID;", "toUuid", "(Ljava/lang/String;)Ljava/util/UUID;", "toUuidOrNull", "", "isHelpCenterUrl", "(Ljava/lang/String;)Z", "isSnacksUrl", "isLearnUrl", "fromE164ToNanpPhoneNumber", "j$/time/Instant", "safeToInstant", "(Ljava/lang/String;)Lj$/time/Instant;", "", "maxLength", "truncateWithEllipses", "(Ljava/lang/String;I)Ljava/lang/String;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class StringsKt {
    public static final String nullIfEmpty(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final String unbreakable(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.replace$default(str, PlaceholderUtils.XXShortPlaceholderText, " ", false, 4, (Object) null);
    }

    public static final UUID toUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "0000-0000")) {
            return new UUID(0L, 0L);
        }
        UUID uuidFromString = UUID.fromString(str);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        return uuidFromString;
    }

    public static final UUID toUuidOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return toUuid(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final boolean isHelpCenterUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        return httpUrl != null && Intrinsics.areEqual(httpUrl.topPrivateDomain(), DeepLinkPath.URL_BASE) && httpUrl.pathSegments().contains("support");
    }

    public static final boolean isSnacksUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        return httpUrl != null && Intrinsics.areEqual(httpUrl.topPrivateDomain(), DeepLinkPath.URL_BASE) && kotlin.text.StringsKt.contains$default((CharSequence) httpUrl.getHost(), (CharSequence) "snacks", false, 2, (Object) null);
    }

    public static final boolean isLearnUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        return httpUrl != null && Intrinsics.areEqual(httpUrl.topPrivateDomain(), DeepLinkPath.URL_BASE) && kotlin.text.StringsKt.contains$default((CharSequence) httpUrl.getHost(), (CharSequence) "learn", false, 2, (Object) null);
    }

    public static final String fromE164ToNanpPhoneNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(2, 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(5, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strSubstring3 = str.substring(8);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        return "(" + strSubstring + ") " + (strSubstring2 + "-" + strSubstring3);
    }

    public static final Instant safeToInstant(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (kotlin.text.StringsKt.endsWith$default((CharSequence) str, Matrix.MATRIX_TYPE_ZERO, false, 2, (Object) null)) {
            Instant instant = Instant.parse(str);
            Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
            return instant;
        }
        if (new Regex(".*[+-]\\d{4}$").matches(str)) {
            Instant instant2 = OffsetDateTime.parse(new Regex("([+-])(\\d{2})(\\d{2})$").replace(str, "$1$2:$3")).toInstant();
            Intrinsics.checkNotNull(instant2);
            return instant2;
        }
        Instant instant3 = OffsetDateTime.parse(str).toInstant();
        Intrinsics.checkNotNullExpressionValue(instant3, "toInstant(...)");
        return instant3;
    }

    public static final String truncateWithEllipses(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() < i) {
            return str;
        }
        return kotlin.text.StringsKt.trim(kotlin.text.StringsKt.take(str, i)).toString() + "…";
    }
}
