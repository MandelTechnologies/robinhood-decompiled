package com.salesforce.android.smi.remote.internal.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: LocaleUtil.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\t*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/util/LocaleUtil;", "", "<init>", "()V", "Ljava/util/Locale;", "getCurrentLocale", "()Ljava/util/Locale;", "T", "", "", "Ljava/util/TreeMap;", "toCaseInsensitiveMap", "(Ljava/util/Map;)Ljava/util/TreeMap;", "currentLocale", "getLanguageTag", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "getLanguageTagOrDefault", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LocaleUtil {
    public static final LocaleUtil INSTANCE = new LocaleUtil();

    private LocaleUtil() {
    }

    private final Locale getCurrentLocale() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return locale;
    }

    public static /* synthetic */ String getLanguageTag$default(LocaleUtil localeUtil, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localeUtil.getCurrentLocale().toLanguageTag();
        }
        return localeUtil.getLanguageTag(map, str);
    }

    public final String getLanguageTag(Map<String, String> map, String currentLocale) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        TreeMap caseInsensitiveMap = toCaseInsensitiveMap(map);
        Object obj = caseInsensitiveMap.get(AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT);
        if (obj == null) {
            obj = null;
        }
        Object obj2 = (String) obj;
        Object obj3 = caseInsensitiveMap.get(currentLocale);
        if (obj3 != null) {
            obj2 = obj3;
        }
        return (String) obj2;
    }

    public static /* synthetic */ String getLanguageTagOrDefault$default(LocaleUtil localeUtil, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localeUtil.getCurrentLocale().toLanguageTag();
        }
        return localeUtil.getLanguageTagOrDefault(map, str);
    }

    public final String getLanguageTagOrDefault(Map<String, String> map, String defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String languageTag$default = getLanguageTag$default(this, map, null, 1, null);
        return languageTag$default == null ? defaultValue : languageTag$default;
    }

    private final <T> TreeMap<String, T> toCaseInsensitiveMap(Map<String, ? extends T> map) {
        TreeMap<String, T> treeMap = new TreeMap<>(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        treeMap.putAll(map);
        return treeMap;
    }
}
