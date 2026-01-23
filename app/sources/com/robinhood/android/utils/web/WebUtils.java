package com.robinhood.android.utils.web;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.widget.Toast;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.http.HttpUrls2;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: WebUtils.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\n\u001a\u00020\u000bH\u0007J&\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\b\u001a\u00020\u000b2\b\b\u0003\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000bJ\n\u0010\u000f\u001a\u00020\r*\u00020\tJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\f\u0010\u0011\u001a\u00020\t*\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/utils/web/WebUtils;", "", "<init>", "()V", "createUrlIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "url", "Lokhttp3/HttpUrl;", "toolbarColorAttr", "", "viewUrl", "", "", "requiresLocalization", "viewPotentiallyUnsafeUrl", "toSafeRedirectUrl", "toLocalizedUrl", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "toLocalizedUrl$lib_utils_web_externalDebug", "handleUrl", "WebUtilsEntryPoint", "Region", "Language", "lib-utils-web_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WebUtils {
    public static final WebUtils INSTANCE = new WebUtils();

    /* compiled from: WebUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/utils/web/WebUtils$WebUtilsEntryPoint;", "", "userLocalityPref", "Lcom/robinhood/prefs/StringPreference;", "getUserLocalityPref", "()Lcom/robinhood/prefs/StringPreference;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Lcom/robinhood/utils/RhProcessLifecycleOwner;", "lib-utils-web_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public interface WebUtilsEntryPoint {
        RhProcessLifecycleOwner getRhProcessLifecycleOwner();

        @UserLocalityPref
        StringPreference getUserLocalityPref();
    }

    public final HttpUrl toLocalizedUrl(HttpUrl httpUrl, Context context) {
        ComponentCallbacks2 componentCallbacks2;
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        String str = ((WebUtilsEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).getUserLocalityPref().get();
        CountryCode instance = str != null ? CountryCode.INSTANCE.parseInstance(str) : null;
        return instance != null ? toLocalizedUrl$lib_utils_web_externalDebug(httpUrl, instance) : httpUrl;
    }

    public final boolean viewUrl(Context context, HttpUrl url, int toolbarColorAttr) {
        ComponentCallbacks2 componentCallbacks2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        ((WebUtilsEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).getRhProcessLifecycleOwner().useExtendedTimeout();
        Intent intentCreateUrlIntent = createUrlIntent(context, toLocalizedUrl(url, context), toolbarColorAttr);
        if (!(context instanceof Activity)) {
            intentCreateUrlIntent.addFlags(268435456);
        }
        try {
            context.startActivity(intentCreateUrlIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, C31367R.string.general_error_intent_no_browser_found, 1).show();
            return false;
        } catch (SecurityException unused2) {
            PackageManager packageManager = context.getPackageManager();
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intentCreateUrlIntent, 65536);
            if (resolveInfoResolveActivity != null) {
                CharSequence charSequenceLoadLabel = resolveInfoResolveActivity.loadLabel(packageManager);
                Intrinsics.checkNotNullExpressionValue(charSequenceLoadLabel, "loadLabel(...)");
                String string2 = context.getString(C31367R.string.general_error_external_app_crash, charSequenceLoadLabel);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Toast.makeText(context, string2, 1).show();
                return false;
            }
            Toast.makeText(context, C31367R.string.general_error_intent_no_browser_found, 1).show();
            return false;
        }
    }

    private WebUtils() {
    }

    private final Intent createUrlIntent(Context context, HttpUrl url, int toolbarColorAttr) {
        Intent intent = new Intent("android.intent.action.VIEW", HttpUrl2.toAndroidUri(url));
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        Integer themeColorOrNull = ThemeColors.getThemeColorOrNull(context, toolbarColorAttr);
        intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", themeColorOrNull != null ? themeColorOrNull.intValue() : context.getColor(C20690R.color.mobius_prime));
        intent.putExtras(bundle);
        return intent;
    }

    public static /* synthetic */ boolean viewUrl$default(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = C20690R.attr.colorPrimary;
        }
        return viewUrl(context, str, i);
    }

    @JvmStatic
    public static final boolean viewUrl(Context context, String url, int toolbarColorAttr) {
        if (context == null || url == null) {
            return false;
        }
        return INSTANCE.viewUrl(context, HttpUrl.INSTANCE.get(url), toolbarColorAttr);
    }

    public static /* synthetic */ boolean viewUrl$default(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = C20690R.attr.colorPrimary;
        }
        return viewUrl(context, i, i2);
    }

    @JvmStatic
    public static final boolean viewUrl(Context context, int url, int toolbarColorAttr) {
        return viewUrl(context, context != null ? context.getString(url) : null, toolbarColorAttr);
    }

    public static /* synthetic */ boolean viewUrl$default(WebUtils webUtils, Context context, HttpUrl httpUrl, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = C20690R.attr.colorPrimary;
        }
        return webUtils.viewUrl(context, httpUrl, i);
    }

    public final boolean requiresLocalization(HttpUrl httpUrl) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        if (HttpUrls2.isRobinhoodDotCom(httpUrl)) {
            if (!StringsKt.startsWith$default(httpUrl.encodedPath(), "/support", false, 2, (Object) null) && !StringsKt.startsWith$default(httpUrl.encodedPath(), "/learn", false, 2, (Object) null)) {
                String strEncodedPath = httpUrl.encodedPath();
                int length = strEncodedPath.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        if (strEncodedPath.charAt(length) != '/') {
                            charSequenceSubSequence = strEncodedPath.subSequence(0, length + 1);
                            break;
                        }
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                }
                charSequenceSubSequence = "";
                if (Intrinsics.areEqual(charSequenceSubSequence.toString(), "/l/privacy")) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean viewPotentiallyUnsafeUrl(Context context, HttpUrl url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        return viewUrl$default(this, context, toSafeRedirectUrl(url), 0, 4, null);
    }

    private final HttpUrl toSafeRedirectUrl(HttpUrl httpUrl) {
        return HttpUrls2.isRobinhoodDotCom(httpUrl) ? httpUrl : HttpUrl.INSTANCE.get("https://redirect.robinhood.com/").newBuilder().addQueryParameter("url", httpUrl.getUrl()).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpUrl toLocalizedUrl$lib_utils_web_externalDebug(HttpUrl httpUrl, CountryCode countryCode) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String str = "";
        int i = 0;
        if (HttpUrls2.isRobinhoodDotCom(httpUrl)) {
            String strEncodedPath = httpUrl.encodedPath();
            int length = strEncodedPath.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (strEncodedPath.charAt(length) != '/') {
                        charSequenceSubSequence = strEncodedPath.subSequence(0, length + 1);
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
                charSequenceSubSequence = "";
                if (Intrinsics.areEqual(charSequenceSubSequence.toString(), "/l/privacy")) {
                    return toLocalizedUrl$lib_utils_web_externalDebug(HttpUrl.INSTANCE.get("https://robinhood.com/support/articles/privacy-policy"), countryCode);
                }
            } else {
                charSequenceSubSequence = "";
                if (Intrinsics.areEqual(charSequenceSubSequence.toString(), "/l/privacy")) {
                }
            }
        }
        if (!requiresLocalization(httpUrl)) {
            return httpUrl;
        }
        EnumEntries<Region> entries = Region.getEntries();
        if (entries == null || !entries.isEmpty()) {
            Iterator<Region> it = entries.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getSegment(), CollectionsKt.firstOrNull((List) httpUrl.pathSegments()))) {
                    return httpUrl;
                }
            }
        }
        if (Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedStates.INSTANCE)) {
            str = Region.f5044US.getSegment() + "/" + Language.f5040EN.getSegment();
        } else if (Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            str = Region.f5042GB.getSegment() + "/" + Language.f5040EN.getSegment();
        } else if (Intrinsics.areEqual(countryCode, CountryCode.Supported.Singapore.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.HongKongSARChina.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Indonesia.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Malaysia.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Taiwan.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Thailand.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Vietnam.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.India.INSTANCE)) {
            str = Region.f5043SG.getSegment() + "/" + Language.f5040EN.getSegment();
        } else if (Intrinsics.areEqual(countryCode, CountryCode.Supported.Austria.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Belgium.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Bulgaria.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Croatia.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Cyprus.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Czechia.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Denmark.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Estonia.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Finland.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.France.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Germany.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Greece.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Hungary.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Iceland.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Ireland.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Italy.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Latvia.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Liechtenstein.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Lithuania.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Luxembourg.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Malta.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Netherlands.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Norway.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Poland.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Portugal.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Romania.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Slovakia.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Slovenia.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Spain.INSTANCE) || Intrinsics.areEqual(countryCode, CountryCode.Supported.Sweden.INSTANCE)) {
            str = Region.f5041EU.getSegment() + "/" + Language.f5040EN.getSegment();
        } else if (!(countryCode instanceof CountryCode.Unsupported)) {
            throw new NoWhenBranchMatchedException();
        }
        HttpUrl.Builder builderAddPathSegments = new HttpUrl.Builder().scheme(httpUrl.getScheme()).host(httpUrl.getHost()).addPathSegments(str);
        Iterator<T> it2 = httpUrl.pathSegments().iterator();
        while (it2.hasNext()) {
            builderAddPathSegments.addPathSegments((String) it2.next());
        }
        for (Object obj : httpUrl.queryParameterNames()) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            builderAddPathSegments.addQueryParameter((String) obj, httpUrl.queryParameterValue(i));
            i = i3;
        }
        builderAddPathSegments.fragment(httpUrl.getFragment());
        return builderAddPathSegments.build();
    }

    public final boolean handleUrl(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            if (requiresLocalization(HttpUrl.INSTANCE.get(url))) {
                return viewUrl$default(context, url, 0, 4, (Object) null);
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/utils/web/WebUtils$Region;", "", "segment", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSegment", "()Ljava/lang/String;", CountryCode.COUNTRY_CODE_US, CountryCode.COUNTRY_CODE_GB, CountryCode.COUNTRY_CODE_SG, "EU", "lib-utils-web_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Region {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Region[] $VALUES;
        private final String segment;

        /* renamed from: US */
        public static final Region f5044US = new Region(CountryCode.COUNTRY_CODE_US, 0, "us");

        /* renamed from: GB */
        public static final Region f5042GB = new Region(CountryCode.COUNTRY_CODE_GB, 1, "gb");

        /* renamed from: SG */
        public static final Region f5043SG = new Region(CountryCode.COUNTRY_CODE_SG, 2, "sg");

        /* renamed from: EU */
        public static final Region f5041EU = new Region("EU", 3, "eu");

        private static final /* synthetic */ Region[] $values() {
            return new Region[]{f5044US, f5042GB, f5043SG, f5041EU};
        }

        public static EnumEntries<Region> getEntries() {
            return $ENTRIES;
        }

        private Region(String str, int i, String str2) {
            this.segment = str2;
        }

        public final String getSegment() {
            return this.segment;
        }

        static {
            Region[] regionArr$values = $values();
            $VALUES = regionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(regionArr$values);
        }

        public static Region valueOf(String str) {
            return (Region) Enum.valueOf(Region.class, str);
        }

        public static Region[] values() {
            return (Region[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/utils/web/WebUtils$Language;", "", "segment", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSegment", "()Ljava/lang/String;", "EN", "lib-utils-web_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Language {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Language[] $VALUES;

        /* renamed from: EN */
        public static final Language f5040EN = new Language("EN", 0, "en");
        private final String segment;

        private static final /* synthetic */ Language[] $values() {
            return new Language[]{f5040EN};
        }

        public static EnumEntries<Language> getEntries() {
            return $ENTRIES;
        }

        private Language(String str, int i, String str2) {
            this.segment = str2;
        }

        public final String getSegment() {
            return this.segment;
        }

        static {
            Language[] languageArr$values = $values();
            $VALUES = languageArr$values;
            $ENTRIES = EnumEntries2.enumEntries(languageArr$values);
        }

        public static Language valueOf(String str) {
            return (Language) Enum.valueOf(Language.class, str);
        }

        public static Language[] values() {
            return (Language[]) $VALUES.clone();
        }
    }
}
