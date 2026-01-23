package com.robinhood.shared.crypto.transfer.enrollment.resolution;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentResolutionComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "title", "", "subtitle", "lottieAsset", "Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset;)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLottieAsset", "()Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset;", "infoUrl", "getInfoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "LottieAsset", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EnrollmentResolutionState {
    public static final int $stable = 8;
    private final AppType appType;
    private final LottieAsset lottieAsset;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ EnrollmentResolutionState copy$default(EnrollmentResolutionState enrollmentResolutionState, AppType appType, String str, String str2, LottieAsset lottieAsset, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = enrollmentResolutionState.appType;
        }
        if ((i & 2) != 0) {
            str = enrollmentResolutionState.title;
        }
        if ((i & 4) != 0) {
            str2 = enrollmentResolutionState.subtitle;
        }
        if ((i & 8) != 0) {
            lottieAsset = enrollmentResolutionState.lottieAsset;
        }
        return enrollmentResolutionState.copy(appType, str, str2, lottieAsset);
    }

    /* renamed from: component1, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final LottieAsset getLottieAsset() {
        return this.lottieAsset;
    }

    public final EnrollmentResolutionState copy(AppType appType, String title, String subtitle, LottieAsset lottieAsset) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(lottieAsset, "lottieAsset");
        return new EnrollmentResolutionState(appType, title, subtitle, lottieAsset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollmentResolutionState)) {
            return false;
        }
        EnrollmentResolutionState enrollmentResolutionState = (EnrollmentResolutionState) other;
        return this.appType == enrollmentResolutionState.appType && Intrinsics.areEqual(this.title, enrollmentResolutionState.title) && Intrinsics.areEqual(this.subtitle, enrollmentResolutionState.subtitle) && Intrinsics.areEqual(this.lottieAsset, enrollmentResolutionState.lottieAsset);
    }

    public int hashCode() {
        return (((((this.appType.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.lottieAsset.hashCode();
    }

    public String toString() {
        return "EnrollmentResolutionState(appType=" + this.appType + ", title=" + this.title + ", subtitle=" + this.subtitle + ", lottieAsset=" + this.lottieAsset + ")";
    }

    public EnrollmentResolutionState(AppType appType, String title, String subtitle, LottieAsset lottieAsset) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(lottieAsset, "lottieAsset");
        this.appType = appType;
        this.title = title;
        this.subtitle = subtitle;
        this.lottieAsset = lottieAsset;
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final LottieAsset getLottieAsset() {
        return this.lottieAsset;
    }

    public final String getInfoUrl() {
        if (this.appType == AppType.RHC) {
            return "https://robinhood.com/eu/en/support/articles/crypto-transfers/";
        }
        return "https://robinhood.com/us/en/support/articles/crypto-transfers/";
    }

    /* compiled from: EnrollmentResolutionComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset;", "", "Url", "Raw", "Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset$Raw;", "Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset$Url;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface LottieAsset {

        /* compiled from: EnrollmentResolutionComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset$Url;", "Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset;", "light", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "dark", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Lcom/robinhood/shared/remote/assets/LottieUrl;)V", "getLight", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getDark", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Url implements LottieAsset {
            public static final int $stable = 0;
            private final LottieUrl dark;
            private final LottieUrl light;

            public static /* synthetic */ Url copy$default(Url url, LottieUrl lottieUrl, LottieUrl lottieUrl2, int i, Object obj) {
                if ((i & 1) != 0) {
                    lottieUrl = url.light;
                }
                if ((i & 2) != 0) {
                    lottieUrl2 = url.dark;
                }
                return url.copy(lottieUrl, lottieUrl2);
            }

            /* renamed from: component1, reason: from getter */
            public final LottieUrl getLight() {
                return this.light;
            }

            /* renamed from: component2, reason: from getter */
            public final LottieUrl getDark() {
                return this.dark;
            }

            public final Url copy(LottieUrl light, LottieUrl dark) {
                Intrinsics.checkNotNullParameter(light, "light");
                Intrinsics.checkNotNullParameter(dark, "dark");
                return new Url(light, dark);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Url)) {
                    return false;
                }
                Url url = (Url) other;
                return this.light == url.light && this.dark == url.dark;
            }

            public int hashCode() {
                return (this.light.hashCode() * 31) + this.dark.hashCode();
            }

            public String toString() {
                return "Url(light=" + this.light + ", dark=" + this.dark + ")";
            }

            public Url(LottieUrl light, LottieUrl dark) {
                Intrinsics.checkNotNullParameter(light, "light");
                Intrinsics.checkNotNullParameter(dark, "dark");
                this.light = light;
                this.dark = dark;
            }

            public final LottieUrl getLight() {
                return this.light;
            }

            public final LottieUrl getDark() {
                return this.dark;
            }
        }

        /* compiled from: EnrollmentResolutionComposable.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset$Raw;", "Lcom/robinhood/shared/crypto/transfer/enrollment/resolution/EnrollmentResolutionState$LottieAsset;", "light", "", "dark", "<init>", "(II)V", "getLight", "()I", "getDark", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Raw implements LottieAsset {
            public static final int $stable = 0;
            private final int dark;
            private final int light;

            public static /* synthetic */ Raw copy$default(Raw raw, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = raw.light;
                }
                if ((i3 & 2) != 0) {
                    i2 = raw.dark;
                }
                return raw.copy(i, i2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getLight() {
                return this.light;
            }

            /* renamed from: component2, reason: from getter */
            public final int getDark() {
                return this.dark;
            }

            public final Raw copy(int light, int dark) {
                return new Raw(light, dark);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Raw)) {
                    return false;
                }
                Raw raw = (Raw) other;
                return this.light == raw.light && this.dark == raw.dark;
            }

            public int hashCode() {
                return (Integer.hashCode(this.light) * 31) + Integer.hashCode(this.dark);
            }

            public String toString() {
                return "Raw(light=" + this.light + ", dark=" + this.dark + ")";
            }

            public Raw(int i, int i2) {
                this.light = i;
                this.dark = i2;
            }

            public final int getLight() {
                return this.light;
            }

            public final int getDark() {
                return this.dark;
            }
        }
    }
}
