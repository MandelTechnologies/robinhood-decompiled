package com.robinhood.android.dashboardpill;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: DashboardPillData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010#J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u0010#J\u0012\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b2\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u00104Jâ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b7\u0010#J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\b\u0007\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bE\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bH\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bI\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bJ\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bK\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bL\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bM\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bN\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bO\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bQ\u00100R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bR\u0010#R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010C\u001a\u0004\bS\u0010#R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u00104¨\u0006V"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/DashboardPillData;", "", "j$/time/Instant", "targetTimestamp", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "visualStyle", "", "isPulsing", "", "loggingIdentifier", "text", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "iconAsset", "completionText", "completionIconAsset", "lottieUrlLight", "lottieUrlDark", "bgLottieUrlLight", "bgLottieUrlDark", "borderLottieUrlLight", "borderLottieUrlDark", "Lcom/robinhood/android/navigation/keys/IntentKey;", "defaultNavigationKey", "actionUrl", "pillIdentifier", "showNotificationDot", "<init>", "(Lj$/time/Instant;Lcom/robinhood/android/dashboardpill/VisualStyle;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/IntentKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/android/dashboardpill/VisualStyle;", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component16", "component17", "component18", "()Ljava/lang/Boolean;", "copy", "(Lj$/time/Instant;Lcom/robinhood/android/dashboardpill/VisualStyle;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/IntentKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/dashboardpill/DashboardPillData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getTargetTimestamp", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "getVisualStyle", "Z", "Ljava/lang/String;", "getLoggingIdentifier", "getText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIconAsset", "getCompletionText", "getCompletionIconAsset", "getLottieUrlLight", "getLottieUrlDark", "getBgLottieUrlLight", "getBgLottieUrlDark", "getBorderLottieUrlLight", "getBorderLottieUrlDark", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getDefaultNavigationKey", "getActionUrl", "getPillIdentifier", "Ljava/lang/Boolean;", "getShowNotificationDot", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardPillData {
    public static final int $stable = 8;
    private final String actionUrl;
    private final String bgLottieUrlDark;
    private final String bgLottieUrlLight;
    private final String borderLottieUrlDark;
    private final String borderLottieUrlLight;
    private final ServerToBentoAssetMapper2 completionIconAsset;
    private final String completionText;
    private final IntentKey defaultNavigationKey;
    private final ServerToBentoAssetMapper2 iconAsset;
    private final boolean isPulsing;
    private final String loggingIdentifier;
    private final String lottieUrlDark;
    private final String lottieUrlLight;
    private final String pillIdentifier;
    private final Boolean showNotificationDot;
    private final Instant targetTimestamp;
    private final String text;
    private final DashboardPillData4 visualStyle;

    public static /* synthetic */ DashboardPillData copy$default(DashboardPillData dashboardPillData, Instant instant, DashboardPillData4 dashboardPillData4, boolean z, String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str3, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, String str4, String str5, String str6, String str7, String str8, String str9, IntentKey intentKey, String str10, String str11, Boolean bool, int i, Object obj) {
        Boolean bool2;
        String str12;
        Instant instant2 = (i & 1) != 0 ? dashboardPillData.targetTimestamp : instant;
        DashboardPillData4 dashboardPillData42 = (i & 2) != 0 ? dashboardPillData.visualStyle : dashboardPillData4;
        boolean z2 = (i & 4) != 0 ? dashboardPillData.isPulsing : z;
        String str13 = (i & 8) != 0 ? dashboardPillData.loggingIdentifier : str;
        String str14 = (i & 16) != 0 ? dashboardPillData.text : str2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = (i & 32) != 0 ? dashboardPillData.iconAsset : serverToBentoAssetMapper2;
        String str15 = (i & 64) != 0 ? dashboardPillData.completionText : str3;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = (i & 128) != 0 ? dashboardPillData.completionIconAsset : serverToBentoAssetMapper22;
        String str16 = (i & 256) != 0 ? dashboardPillData.lottieUrlLight : str4;
        String str17 = (i & 512) != 0 ? dashboardPillData.lottieUrlDark : str5;
        String str18 = (i & 1024) != 0 ? dashboardPillData.bgLottieUrlLight : str6;
        String str19 = (i & 2048) != 0 ? dashboardPillData.bgLottieUrlDark : str7;
        String str20 = (i & 4096) != 0 ? dashboardPillData.borderLottieUrlLight : str8;
        String str21 = (i & 8192) != 0 ? dashboardPillData.borderLottieUrlDark : str9;
        Instant instant3 = instant2;
        IntentKey intentKey2 = (i & 16384) != 0 ? dashboardPillData.defaultNavigationKey : intentKey;
        String str22 = (i & 32768) != 0 ? dashboardPillData.actionUrl : str10;
        String str23 = (i & 65536) != 0 ? dashboardPillData.pillIdentifier : str11;
        if ((i & 131072) != 0) {
            str12 = str23;
            bool2 = dashboardPillData.showNotificationDot;
        } else {
            bool2 = bool;
            str12 = str23;
        }
        return dashboardPillData.copy(instant3, dashboardPillData42, z2, str13, str14, serverToBentoAssetMapper23, str15, serverToBentoAssetMapper24, str16, str17, str18, str19, str20, str21, intentKey2, str22, str12, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getTargetTimestamp() {
        return this.targetTimestamp;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLottieUrlDark() {
        return this.lottieUrlDark;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBgLottieUrlLight() {
        return this.bgLottieUrlLight;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBgLottieUrlDark() {
        return this.bgLottieUrlDark;
    }

    /* renamed from: component13, reason: from getter */
    public final String getBorderLottieUrlLight() {
        return this.borderLottieUrlLight;
    }

    /* renamed from: component14, reason: from getter */
    public final String getBorderLottieUrlDark() {
        return this.borderLottieUrlDark;
    }

    /* renamed from: component15, reason: from getter */
    public final IntentKey getDefaultNavigationKey() {
        return this.defaultNavigationKey;
    }

    /* renamed from: component16, reason: from getter */
    public final String getActionUrl() {
        return this.actionUrl;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPillIdentifier() {
        return this.pillIdentifier;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getShowNotificationDot() {
        return this.showNotificationDot;
    }

    /* renamed from: component2, reason: from getter */
    public final DashboardPillData4 getVisualStyle() {
        return this.visualStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPulsing() {
        return this.isPulsing;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component6, reason: from getter */
    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCompletionText() {
        return this.completionText;
    }

    /* renamed from: component8, reason: from getter */
    public final ServerToBentoAssetMapper2 getCompletionIconAsset() {
        return this.completionIconAsset;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLottieUrlLight() {
        return this.lottieUrlLight;
    }

    public final DashboardPillData copy(Instant targetTimestamp, DashboardPillData4 visualStyle, boolean isPulsing, String loggingIdentifier, String text, ServerToBentoAssetMapper2 iconAsset, String completionText, ServerToBentoAssetMapper2 completionIconAsset, String lottieUrlLight, String lottieUrlDark, String bgLottieUrlLight, String bgLottieUrlDark, String borderLottieUrlLight, String borderLottieUrlDark, IntentKey defaultNavigationKey, String actionUrl, String pillIdentifier, Boolean showNotificationDot) {
        Intrinsics.checkNotNullParameter(visualStyle, "visualStyle");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new DashboardPillData(targetTimestamp, visualStyle, isPulsing, loggingIdentifier, text, iconAsset, completionText, completionIconAsset, lottieUrlLight, lottieUrlDark, bgLottieUrlLight, bgLottieUrlDark, borderLottieUrlLight, borderLottieUrlDark, defaultNavigationKey, actionUrl, pillIdentifier, showNotificationDot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardPillData)) {
            return false;
        }
        DashboardPillData dashboardPillData = (DashboardPillData) other;
        return Intrinsics.areEqual(this.targetTimestamp, dashboardPillData.targetTimestamp) && Intrinsics.areEqual(this.visualStyle, dashboardPillData.visualStyle) && this.isPulsing == dashboardPillData.isPulsing && Intrinsics.areEqual(this.loggingIdentifier, dashboardPillData.loggingIdentifier) && Intrinsics.areEqual(this.text, dashboardPillData.text) && this.iconAsset == dashboardPillData.iconAsset && Intrinsics.areEqual(this.completionText, dashboardPillData.completionText) && this.completionIconAsset == dashboardPillData.completionIconAsset && Intrinsics.areEqual(this.lottieUrlLight, dashboardPillData.lottieUrlLight) && Intrinsics.areEqual(this.lottieUrlDark, dashboardPillData.lottieUrlDark) && Intrinsics.areEqual(this.bgLottieUrlLight, dashboardPillData.bgLottieUrlLight) && Intrinsics.areEqual(this.bgLottieUrlDark, dashboardPillData.bgLottieUrlDark) && Intrinsics.areEqual(this.borderLottieUrlLight, dashboardPillData.borderLottieUrlLight) && Intrinsics.areEqual(this.borderLottieUrlDark, dashboardPillData.borderLottieUrlDark) && Intrinsics.areEqual(this.defaultNavigationKey, dashboardPillData.defaultNavigationKey) && Intrinsics.areEqual(this.actionUrl, dashboardPillData.actionUrl) && Intrinsics.areEqual(this.pillIdentifier, dashboardPillData.pillIdentifier) && Intrinsics.areEqual(this.showNotificationDot, dashboardPillData.showNotificationDot);
    }

    public int hashCode() {
        Instant instant = this.targetTimestamp;
        int iHashCode = (((((((instant == null ? 0 : instant.hashCode()) * 31) + this.visualStyle.hashCode()) * 31) + Boolean.hashCode(this.isPulsing)) * 31) + this.loggingIdentifier.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.iconAsset;
        int iHashCode3 = (iHashCode2 + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31;
        String str2 = this.completionText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = this.completionIconAsset;
        int iHashCode5 = (iHashCode4 + (serverToBentoAssetMapper22 == null ? 0 : serverToBentoAssetMapper22.hashCode())) * 31;
        String str3 = this.lottieUrlLight;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lottieUrlDark;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bgLottieUrlLight;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bgLottieUrlDark;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.borderLottieUrlLight;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.borderLottieUrlDark;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        IntentKey intentKey = this.defaultNavigationKey;
        int iHashCode12 = (iHashCode11 + (intentKey == null ? 0 : intentKey.hashCode())) * 31;
        String str9 = this.actionUrl;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pillIdentifier;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.showNotificationDot;
        return iHashCode14 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "DashboardPillData(targetTimestamp=" + this.targetTimestamp + ", visualStyle=" + this.visualStyle + ", isPulsing=" + this.isPulsing + ", loggingIdentifier=" + this.loggingIdentifier + ", text=" + this.text + ", iconAsset=" + this.iconAsset + ", completionText=" + this.completionText + ", completionIconAsset=" + this.completionIconAsset + ", lottieUrlLight=" + this.lottieUrlLight + ", lottieUrlDark=" + this.lottieUrlDark + ", bgLottieUrlLight=" + this.bgLottieUrlLight + ", bgLottieUrlDark=" + this.bgLottieUrlDark + ", borderLottieUrlLight=" + this.borderLottieUrlLight + ", borderLottieUrlDark=" + this.borderLottieUrlDark + ", defaultNavigationKey=" + this.defaultNavigationKey + ", actionUrl=" + this.actionUrl + ", pillIdentifier=" + this.pillIdentifier + ", showNotificationDot=" + this.showNotificationDot + ")";
    }

    public DashboardPillData(Instant instant, DashboardPillData4 visualStyle, boolean z, String loggingIdentifier, String str, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, String str3, String str4, String str5, String str6, String str7, String str8, IntentKey intentKey, String str9, String str10, Boolean bool) {
        Intrinsics.checkNotNullParameter(visualStyle, "visualStyle");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.targetTimestamp = instant;
        this.visualStyle = visualStyle;
        this.isPulsing = z;
        this.loggingIdentifier = loggingIdentifier;
        this.text = str;
        this.iconAsset = serverToBentoAssetMapper2;
        this.completionText = str2;
        this.completionIconAsset = serverToBentoAssetMapper22;
        this.lottieUrlLight = str3;
        this.lottieUrlDark = str4;
        this.bgLottieUrlLight = str5;
        this.bgLottieUrlDark = str6;
        this.borderLottieUrlLight = str7;
        this.borderLottieUrlDark = str8;
        this.defaultNavigationKey = intentKey;
        this.actionUrl = str9;
        this.pillIdentifier = str10;
        this.showNotificationDot = bool;
    }

    public /* synthetic */ DashboardPillData(Instant instant, DashboardPillData4 dashboardPillData4, boolean z, String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str3, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, String str4, String str5, String str6, String str7, String str8, String str9, IntentKey intentKey, String str10, String str11, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, dashboardPillData4, z, str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : serverToBentoAssetMapper2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : serverToBentoAssetMapper22, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : intentKey, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (i & 131072) != 0 ? null : bool);
    }

    public final Instant getTargetTimestamp() {
        return this.targetTimestamp;
    }

    public final DashboardPillData4 getVisualStyle() {
        return this.visualStyle;
    }

    public final boolean isPulsing() {
        return this.isPulsing;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final String getText() {
        return this.text;
    }

    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    public final String getCompletionText() {
        return this.completionText;
    }

    public final ServerToBentoAssetMapper2 getCompletionIconAsset() {
        return this.completionIconAsset;
    }

    public final String getLottieUrlLight() {
        return this.lottieUrlLight;
    }

    public final String getLottieUrlDark() {
        return this.lottieUrlDark;
    }

    public final String getBgLottieUrlLight() {
        return this.bgLottieUrlLight;
    }

    public final String getBgLottieUrlDark() {
        return this.bgLottieUrlDark;
    }

    public final String getBorderLottieUrlLight() {
        return this.borderLottieUrlLight;
    }

    public final String getBorderLottieUrlDark() {
        return this.borderLottieUrlDark;
    }

    public final IntentKey getDefaultNavigationKey() {
        return this.defaultNavigationKey;
    }

    public final String getActionUrl() {
        return this.actionUrl;
    }

    public final String getPillIdentifier() {
        return this.pillIdentifier;
    }

    public final Boolean getShowNotificationDot() {
        return this.showNotificationDot;
    }
}
