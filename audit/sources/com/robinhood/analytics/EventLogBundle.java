package com.robinhood.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.robinhood.prefs.Installation;
import com.robinhood.rosetta.converters.platform.AppInfo2;
import com.robinhood.rosetta.eventlogging.Application;
import com.robinhood.rosetta.eventlogging.Device;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.animation.Animators;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventLogBundle.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010$\u001a\u00020%H\u0007J\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00068"}, m3636d2 = {"Lcom/robinhood/analytics/EventLogBundle;", "", "context", "Landroid/content/Context;", "resources", "Landroid/content/res/Resources;", "adIdProvider", "Lcom/robinhood/analytics/AdIdProvider;", "installation", "Lcom/robinhood/prefs/Installation;", "platform", "", "versionName", "applicationId", "versionCode", "", "buildVariant", "Lcom/robinhood/utils/buildconfig/BuildVariant;", "<init>", "(Landroid/content/Context;Landroid/content/res/Resources;Lcom/robinhood/analytics/AdIdProvider;Lcom/robinhood/prefs/Installation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/robinhood/utils/buildconfig/BuildVariant;)V", "getContext", "()Landroid/content/Context;", "getResources", "()Landroid/content/res/Resources;", "getAdIdProvider", "()Lcom/robinhood/analytics/AdIdProvider;", "getInstallation", "()Lcom/robinhood/prefs/Installation;", "getPlatform", "()Ljava/lang/String;", "getVersionName", "getApplicationId", "getVersionCode", "()J", "getBuildVariant", "()Lcom/robinhood/utils/buildconfig/BuildVariant;", "createApplication", "Lcom/robinhood/rosetta/eventlogging/Application;", "createDevice", "Lcom/robinhood/rosetta/eventlogging/Device;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EventLogBundle {
    private final AdIdProvider adIdProvider;
    private final String applicationId;
    private final BuildVariant buildVariant;
    private final Context context;
    private final Installation installation;
    private final String platform;
    private final Resources resources;
    private final long versionCode;
    private final String versionName;

    public static /* synthetic */ EventLogBundle copy$default(EventLogBundle eventLogBundle, Context context, Resources resources, AdIdProvider adIdProvider, Installation installation, String str, String str2, String str3, long j, BuildVariant buildVariant, int i, Object obj) {
        if ((i & 1) != 0) {
            context = eventLogBundle.context;
        }
        if ((i & 2) != 0) {
            resources = eventLogBundle.resources;
        }
        if ((i & 4) != 0) {
            adIdProvider = eventLogBundle.adIdProvider;
        }
        if ((i & 8) != 0) {
            installation = eventLogBundle.installation;
        }
        if ((i & 16) != 0) {
            str = eventLogBundle.platform;
        }
        if ((i & 32) != 0) {
            str2 = eventLogBundle.versionName;
        }
        if ((i & 64) != 0) {
            str3 = eventLogBundle.applicationId;
        }
        if ((i & 128) != 0) {
            j = eventLogBundle.versionCode;
        }
        if ((i & 256) != 0) {
            buildVariant = eventLogBundle.buildVariant;
        }
        BuildVariant buildVariant2 = buildVariant;
        long j2 = j;
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        AdIdProvider adIdProvider2 = adIdProvider;
        return eventLogBundle.copy(context, resources, adIdProvider2, installation, str6, str4, str5, j2, buildVariant2);
    }

    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final Resources getResources() {
        return this.resources;
    }

    /* renamed from: component3, reason: from getter */
    public final AdIdProvider getAdIdProvider() {
        return this.adIdProvider;
    }

    /* renamed from: component4, reason: from getter */
    public final Installation getInstallation() {
        return this.installation;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component8, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component9, reason: from getter */
    public final BuildVariant getBuildVariant() {
        return this.buildVariant;
    }

    public final EventLogBundle copy(Context context, Resources resources, AdIdProvider adIdProvider, Installation installation, String platform, String versionName, String applicationId, long versionCode, BuildVariant buildVariant) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(buildVariant, "buildVariant");
        return new EventLogBundle(context, resources, adIdProvider, installation, platform, versionName, applicationId, versionCode, buildVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventLogBundle)) {
            return false;
        }
        EventLogBundle eventLogBundle = (EventLogBundle) other;
        return Intrinsics.areEqual(this.context, eventLogBundle.context) && Intrinsics.areEqual(this.resources, eventLogBundle.resources) && Intrinsics.areEqual(this.adIdProvider, eventLogBundle.adIdProvider) && Intrinsics.areEqual(this.installation, eventLogBundle.installation) && Intrinsics.areEqual(this.platform, eventLogBundle.platform) && Intrinsics.areEqual(this.versionName, eventLogBundle.versionName) && Intrinsics.areEqual(this.applicationId, eventLogBundle.applicationId) && this.versionCode == eventLogBundle.versionCode && this.buildVariant == eventLogBundle.buildVariant;
    }

    public int hashCode() {
        return (((((((((((((((this.context.hashCode() * 31) + this.resources.hashCode()) * 31) + this.adIdProvider.hashCode()) * 31) + this.installation.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.versionName.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + Long.hashCode(this.versionCode)) * 31) + this.buildVariant.hashCode();
    }

    public String toString() {
        return "EventLogBundle(context=" + this.context + ", resources=" + this.resources + ", adIdProvider=" + this.adIdProvider + ", installation=" + this.installation + ", platform=" + this.platform + ", versionName=" + this.versionName + ", applicationId=" + this.applicationId + ", versionCode=" + this.versionCode + ", buildVariant=" + this.buildVariant + ")";
    }

    public EventLogBundle(Context context, Resources resources, AdIdProvider adIdProvider, Installation installation, String platform, String versionName, String applicationId, long j, BuildVariant buildVariant) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(buildVariant, "buildVariant");
        this.context = context;
        this.resources = resources;
        this.adIdProvider = adIdProvider;
        this.installation = installation;
        this.platform = platform;
        this.versionName = versionName;
        this.applicationId = applicationId;
        this.versionCode = j;
        this.buildVariant = buildVariant;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Resources getResources() {
        return this.resources;
    }

    public final AdIdProvider getAdIdProvider() {
        return this.adIdProvider;
    }

    public final Installation getInstallation() {
        return this.installation;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final BuildVariant getBuildVariant() {
        return this.buildVariant;
    }

    @SuppressLint({"LocaleGetDefaultNoCategory"})
    public final Application createApplication() {
        Locale locale = Locale.getDefault();
        String str = this.applicationId;
        int i = (int) this.versionCode;
        String language = locale.getLanguage();
        String str2 = language == null ? "n/a" : language;
        String country = locale.getCountry();
        return new Application(this.versionName, str, i, country == null ? "n/a" : country, str2, AppInfo2.toProtobuf(this.buildVariant), null, null, null, null, 960, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Device createDevice() {
        String str;
        String str2;
        DisplayMetrics displayMetrics = this.resources.getDisplayMetrics();
        String str3 = displayMetrics.widthPixels + " x " + displayMetrics.heightPixels;
        Configuration configuration = this.resources.getConfiguration();
        String str4 = configuration.screenWidthDp + " x " + configuration.screenHeightDp;
        String strMo2745id = this.installation.mo2745id();
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = str5.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str = lowerCase == null ? "n/a" : lowerCase;
        }
        String str6 = Build.MODEL;
        if (str6 != null) {
            Locale ROOT2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
            String lowerCase2 = str6.toLowerCase(ROOT2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            str2 = lowerCase2 == null ? "n/a" : lowerCase2;
        }
        return new Device(this.platform, strMo2745id, null, String.valueOf(Build.VERSION.SDK_INT), str, str2, str3, null, String.valueOf(this.resources.getConfiguration().fontScale), null, null, null, null, null, null, !Animators.INSTANCE.animationsEnabled(this.context), ContextSystemServices.getAccessibilityManager(this.context).isTouchExplorationEnabled(), 0, null, null, null, str4, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2195836, 511, null);
    }
}
