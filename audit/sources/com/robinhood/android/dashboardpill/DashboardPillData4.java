package com.robinhood.android.dashboardpill;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: DashboardPillData.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nJ\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/VisualStyle;", "", "isCrypto", "", "Standard", "Gold", "Rhc", "Crypto", "CryptoLive", "Market", "Custom", "Lcom/robinhood/android/dashboardpill/VisualStyle$Crypto;", "Lcom/robinhood/android/dashboardpill/VisualStyle$CryptoLive;", "Lcom/robinhood/android/dashboardpill/VisualStyle$Custom;", "Lcom/robinhood/android/dashboardpill/VisualStyle$Gold;", "Lcom/robinhood/android/dashboardpill/VisualStyle$Market;", "Lcom/robinhood/android/dashboardpill/VisualStyle$Rhc;", "Lcom/robinhood/android/dashboardpill/VisualStyle$Standard;", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboardpill.VisualStyle, reason: use source file name */
/* loaded from: classes2.dex */
public interface DashboardPillData4 {
    boolean isCrypto();

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/VisualStyle$Standard;", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "<init>", "()V", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.VisualStyle$Standard */
    public static final class Standard implements DashboardPillData4 {
        public static final int $stable = 0;
        public static final Standard INSTANCE = new Standard();

        private Standard() {
        }

        @Override // com.robinhood.android.dashboardpill.DashboardPillData4
        public boolean isCrypto() {
            return DefaultImpls.isCrypto(this);
        }
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/VisualStyle$Gold;", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "<init>", "()V", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.VisualStyle$Gold */
    public static final class Gold implements DashboardPillData4 {
        public static final int $stable = 0;
        public static final Gold INSTANCE = new Gold();

        private Gold() {
        }

        @Override // com.robinhood.android.dashboardpill.DashboardPillData4
        public boolean isCrypto() {
            return DefaultImpls.isCrypto(this);
        }
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/VisualStyle$Rhc;", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "<init>", "()V", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.VisualStyle$Rhc */
    public static final class Rhc implements DashboardPillData4 {
        public static final int $stable = 0;
        public static final Rhc INSTANCE = new Rhc();

        private Rhc() {
        }

        @Override // com.robinhood.android.dashboardpill.DashboardPillData4
        public boolean isCrypto() {
            return DefaultImpls.isCrypto(this);
        }
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/VisualStyle$Crypto;", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "<init>", "()V", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.VisualStyle$Crypto */
    public static final class Crypto implements DashboardPillData4 {
        public static final int $stable = 0;
        public static final Crypto INSTANCE = new Crypto();

        private Crypto() {
        }

        @Override // com.robinhood.android.dashboardpill.DashboardPillData4
        public boolean isCrypto() {
            return DefaultImpls.isCrypto(this);
        }
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/VisualStyle$CryptoLive;", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "<init>", "()V", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.VisualStyle$CryptoLive */
    public static final class CryptoLive implements DashboardPillData4 {
        public static final int $stable = 0;
        public static final CryptoLive INSTANCE = new CryptoLive();

        private CryptoLive() {
        }

        @Override // com.robinhood.android.dashboardpill.DashboardPillData4
        public boolean isCrypto() {
            return DefaultImpls.isCrypto(this);
        }
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/VisualStyle$Market;", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "<init>", "()V", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.VisualStyle$Market */
    public static final class Market implements DashboardPillData4 {
        public static final int $stable = 0;
        public static final Market INSTANCE = new Market();

        private Market() {
        }

        @Override // com.robinhood.android.dashboardpill.DashboardPillData4
        public boolean isCrypto() {
            return DefaultImpls.isCrypto(this);
        }
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/VisualStyle$Custom;", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "textColor", "Lrh_server_driven_ui/v1/ThemedColorDto;", "notificationDotColor", "pulseColor", "backgroundColor", "overlayColor", "borderColor", "<init>", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "getTextColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getNotificationDotColor", "getPulseColor", "getBackgroundColor", "getOverlayColor", "getBorderColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.VisualStyle$Custom, reason: from toString */
    public static final /* data */ class Custom implements DashboardPillData4 {
        public static final int $stable = 8;
        private final ThemedColorDto backgroundColor;
        private final ThemedColorDto borderColor;
        private final ThemedColorDto notificationDotColor;
        private final ThemedColorDto overlayColor;
        private final ThemedColorDto pulseColor;
        private final ThemedColorDto textColor;

        public static /* synthetic */ Custom copy$default(Custom custom, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, ThemedColorDto themedColorDto5, ThemedColorDto themedColorDto6, int i, Object obj) {
            if ((i & 1) != 0) {
                themedColorDto = custom.textColor;
            }
            if ((i & 2) != 0) {
                themedColorDto2 = custom.notificationDotColor;
            }
            if ((i & 4) != 0) {
                themedColorDto3 = custom.pulseColor;
            }
            if ((i & 8) != 0) {
                themedColorDto4 = custom.backgroundColor;
            }
            if ((i & 16) != 0) {
                themedColorDto5 = custom.overlayColor;
            }
            if ((i & 32) != 0) {
                themedColorDto6 = custom.borderColor;
            }
            ThemedColorDto themedColorDto7 = themedColorDto5;
            ThemedColorDto themedColorDto8 = themedColorDto6;
            return custom.copy(themedColorDto, themedColorDto2, themedColorDto3, themedColorDto4, themedColorDto7, themedColorDto8);
        }

        /* renamed from: component1, reason: from getter */
        public final ThemedColorDto getTextColor() {
            return this.textColor;
        }

        /* renamed from: component2, reason: from getter */
        public final ThemedColorDto getNotificationDotColor() {
            return this.notificationDotColor;
        }

        /* renamed from: component3, reason: from getter */
        public final ThemedColorDto getPulseColor() {
            return this.pulseColor;
        }

        /* renamed from: component4, reason: from getter */
        public final ThemedColorDto getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final ThemedColorDto getOverlayColor() {
            return this.overlayColor;
        }

        /* renamed from: component6, reason: from getter */
        public final ThemedColorDto getBorderColor() {
            return this.borderColor;
        }

        public final Custom copy(ThemedColorDto textColor, ThemedColorDto notificationDotColor, ThemedColorDto pulseColor, ThemedColorDto backgroundColor, ThemedColorDto overlayColor, ThemedColorDto borderColor) {
            return new Custom(textColor, notificationDotColor, pulseColor, backgroundColor, overlayColor, borderColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return Intrinsics.areEqual(this.textColor, custom.textColor) && Intrinsics.areEqual(this.notificationDotColor, custom.notificationDotColor) && Intrinsics.areEqual(this.pulseColor, custom.pulseColor) && Intrinsics.areEqual(this.backgroundColor, custom.backgroundColor) && Intrinsics.areEqual(this.overlayColor, custom.overlayColor) && Intrinsics.areEqual(this.borderColor, custom.borderColor);
        }

        public int hashCode() {
            ThemedColorDto themedColorDto = this.textColor;
            int iHashCode = (themedColorDto == null ? 0 : themedColorDto.hashCode()) * 31;
            ThemedColorDto themedColorDto2 = this.notificationDotColor;
            int iHashCode2 = (iHashCode + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31;
            ThemedColorDto themedColorDto3 = this.pulseColor;
            int iHashCode3 = (iHashCode2 + (themedColorDto3 == null ? 0 : themedColorDto3.hashCode())) * 31;
            ThemedColorDto themedColorDto4 = this.backgroundColor;
            int iHashCode4 = (iHashCode3 + (themedColorDto4 == null ? 0 : themedColorDto4.hashCode())) * 31;
            ThemedColorDto themedColorDto5 = this.overlayColor;
            int iHashCode5 = (iHashCode4 + (themedColorDto5 == null ? 0 : themedColorDto5.hashCode())) * 31;
            ThemedColorDto themedColorDto6 = this.borderColor;
            return iHashCode5 + (themedColorDto6 != null ? themedColorDto6.hashCode() : 0);
        }

        public String toString() {
            return "Custom(textColor=" + this.textColor + ", notificationDotColor=" + this.notificationDotColor + ", pulseColor=" + this.pulseColor + ", backgroundColor=" + this.backgroundColor + ", overlayColor=" + this.overlayColor + ", borderColor=" + this.borderColor + ")";
        }

        public Custom(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, ThemedColorDto themedColorDto5, ThemedColorDto themedColorDto6) {
            this.textColor = themedColorDto;
            this.notificationDotColor = themedColorDto2;
            this.pulseColor = themedColorDto3;
            this.backgroundColor = themedColorDto4;
            this.overlayColor = themedColorDto5;
            this.borderColor = themedColorDto6;
        }

        public /* synthetic */ Custom(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, ThemedColorDto themedColorDto5, ThemedColorDto themedColorDto6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(themedColorDto, themedColorDto2, themedColorDto3, themedColorDto4, (i & 16) != 0 ? null : themedColorDto5, (i & 32) != 0 ? null : themedColorDto6);
        }

        @Override // com.robinhood.android.dashboardpill.DashboardPillData4
        public boolean isCrypto() {
            return DefaultImpls.isCrypto(this);
        }

        public final ThemedColorDto getTextColor() {
            return this.textColor;
        }

        public final ThemedColorDto getNotificationDotColor() {
            return this.notificationDotColor;
        }

        public final ThemedColorDto getPulseColor() {
            return this.pulseColor;
        }

        public final ThemedColorDto getBackgroundColor() {
            return this.backgroundColor;
        }

        public final ThemedColorDto getOverlayColor() {
            return this.overlayColor;
        }

        public final ThemedColorDto getBorderColor() {
            return this.borderColor;
        }
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.VisualStyle$DefaultImpls */
    public static final class DefaultImpls {
        public static boolean isCrypto(DashboardPillData4 dashboardPillData4) {
            return CollectionsKt.listOf((Object[]) new DashboardPillData4[]{Crypto.INSTANCE, CryptoLive.INSTANCE}).contains(dashboardPillData4);
        }
    }
}
