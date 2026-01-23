package com.robinhood.android.deeplink;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.analytics.DeeplinkEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.Experiment;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u001c\u001a\u0002H\u001d\"\u0018\b\u0000\u0010\u001d*\b\u0012\u0004\u0012\u0002H\u001d0\u001e*\b\u0012\u0004\u0012\u0002H\u001d0\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001d0!2\u0006\u0010\"\u001a\u0002H\u001dH&¢\u0006\u0002\u0010#J=\u0010$\u001a\u0002H\u001d\"\u0018\b\u0000\u0010\u001d*\b\u0012\u0004\u0012\u0002H\u001d0\u001e*\b\u0012\u0004\u0012\u0002H\u001d0\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001d0%2\u0006\u0010\"\u001a\u0002H\u001dH&¢\u0006\u0002\u0010&J+\u0010'\u001a\u00020\t2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010+\u001a\u00020\tH&¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\u00020\t2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!H&J\u0014\u0010.\u001a\u00020\t2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030%H&J\b\u0010/\u001a\u000200H&J\u0012\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\tH&J\u001b\u00102\u001a\b\u0012\u0004\u0012\u0002000)2\u0006\u00103\u001a\u00020\u000bH&¢\u0006\u0002\u00104J\u0010\u00105\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u001b\u00106\u001a\b\u0012\u0004\u0012\u0002000)2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u00104J\b\u00107\u001a\u00020\tH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/deeplink/DeeplinkContext;", "", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "requiresBackingActivity", "", "uri", "Landroid/net/Uri;", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/analytics/DeeplinkEventLogger;ZLandroid/net/Uri;Lcom/robinhood/android/navigation/DeepLinkOrigin;)V", "getContext", "()Landroid/content/Context;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "getEventLogger", "()Lcom/robinhood/analytics/DeeplinkEventLogger;", "getRequiresBackingActivity", "()Z", "getUri", "()Landroid/net/Uri;", "getDeepLinkOrigin", "()Lcom/robinhood/android/navigation/DeepLinkOrigin;", "getExperimentVariant", "V", "Lcom/robinhood/enums/RhEnum;", "", "experiment", "Lcom/robinhood/experiments/Experiment;", "defaultVariant", "(Lcom/robinhood/experiments/Experiment;Ljava/lang/Enum;)Ljava/lang/Enum;", "getDeviceIdExperimentVariant", "Lcom/robinhood/experiments/DeviceIdExperiment;", "(Lcom/robinhood/experiments/DeviceIdExperiment;Ljava/lang/Enum;)Ljava/lang/Enum;", "getRegionGateState", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "([Lcom/robinhood/android/regiongate/RegionGate;Z)Z", "getExperimentState", "getDeviceIdExperimentState", "getMainIntent", "Landroid/content/Intent;", "requiresMainActivity", "handleMalformedUri", WebsocketGatewayConstants.DATA_KEY, "(Landroid/net/Uri;)[Landroid/content/Intent;", "isSupported", "redirectGetIntents", "isLoggedIn", "lib-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.DeeplinkContext, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class DeeplinkTarget2 {
    private final Context context;
    private final DeepLinkOrigin deepLinkOrigin;
    private final DeeplinkEventLogger eventLogger;
    private final Navigator navigator;
    private final boolean requiresBackingActivity;
    private final Uri uri;

    public abstract boolean getDeviceIdExperimentState(DeviceIdExperiment<?> experiment);

    /* JADX WARN: Incorrect return type in method signature: <V:Ljava/lang/Enum<TV;>;:Lcom/robinhood/enums/RhEnum<TV;>;>(Lcom/robinhood/experiments/DeviceIdExperiment<TV;>;TV;)TV; */
    public abstract Enum getDeviceIdExperimentVariant(DeviceIdExperiment experiment, Enum defaultVariant);

    public abstract boolean getExperimentState(Experiment<?> experiment);

    /* JADX WARN: Incorrect return type in method signature: <V:Ljava/lang/Enum<TV;>;:Lcom/robinhood/enums/RhEnum<TV;>;>(Lcom/robinhood/experiments/Experiment<TV;>;TV;)TV; */
    public abstract Enum getExperimentVariant(Experiment experiment, Enum defaultVariant);

    public abstract Intent getMainIntent();

    public abstract Intent getMainIntent(boolean requiresMainActivity);

    public abstract boolean getRegionGateState(RegionGate[] regionGates, boolean z);

    public abstract Intent[] handleMalformedUri(Uri data);

    public abstract boolean isLoggedIn();

    public abstract boolean isSupported(Uri uri);

    public abstract Intent[] redirectGetIntents(Uri uri);

    public DeeplinkTarget2(Context context, Navigator navigator, DeeplinkEventLogger eventLogger, boolean z, Uri uri, DeepLinkOrigin deepLinkOrigin) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
        this.context = context;
        this.navigator = navigator;
        this.eventLogger = eventLogger;
        this.requiresBackingActivity = z;
        this.uri = uri;
        this.deepLinkOrigin = deepLinkOrigin;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Navigator getNavigator() {
        return this.navigator;
    }

    public final DeeplinkEventLogger getEventLogger() {
        return this.eventLogger;
    }

    public final boolean getRequiresBackingActivity() {
        return this.requiresBackingActivity;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final DeepLinkOrigin getDeepLinkOrigin() {
        return this.deepLinkOrigin;
    }

    public static /* synthetic */ boolean getRegionGateState$default(DeeplinkTarget2 deeplinkTarget2, RegionGate[] regionGateArr, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRegionGateState");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return deeplinkTarget2.getRegionGateState(regionGateArr, z);
    }
}
