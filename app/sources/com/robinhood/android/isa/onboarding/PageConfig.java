package com.robinhood.android.isa.onboarding;

import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/PageConfig;", "", "lightLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "darkLottieUrl", "headerResId", "", "subtitleResId", "disclosureResId", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Lcom/robinhood/shared/remote/assets/LottieUrl;III)V", "getLightLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getDarkLottieUrl", "getHeaderResId", "()I", "getSubtitleResId", "getDisclosureResId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PageConfig {
    public static final int $stable = 0;
    private final LottieUrl darkLottieUrl;
    private final int disclosureResId;
    private final int headerResId;
    private final LottieUrl lightLottieUrl;
    private final int subtitleResId;

    public static /* synthetic */ PageConfig copy$default(PageConfig pageConfig, LottieUrl lottieUrl, LottieUrl lottieUrl2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lottieUrl = pageConfig.lightLottieUrl;
        }
        if ((i4 & 2) != 0) {
            lottieUrl2 = pageConfig.darkLottieUrl;
        }
        if ((i4 & 4) != 0) {
            i = pageConfig.headerResId;
        }
        if ((i4 & 8) != 0) {
            i2 = pageConfig.subtitleResId;
        }
        if ((i4 & 16) != 0) {
            i3 = pageConfig.disclosureResId;
        }
        int i5 = i3;
        int i6 = i;
        return pageConfig.copy(lottieUrl, lottieUrl2, i6, i2, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final LottieUrl getLightLottieUrl() {
        return this.lightLottieUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final LottieUrl getDarkLottieUrl() {
        return this.darkLottieUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeaderResId() {
        return this.headerResId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSubtitleResId() {
        return this.subtitleResId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDisclosureResId() {
        return this.disclosureResId;
    }

    public final PageConfig copy(LottieUrl lightLottieUrl, LottieUrl darkLottieUrl, int headerResId, int subtitleResId, int disclosureResId) {
        Intrinsics.checkNotNullParameter(lightLottieUrl, "lightLottieUrl");
        Intrinsics.checkNotNullParameter(darkLottieUrl, "darkLottieUrl");
        return new PageConfig(lightLottieUrl, darkLottieUrl, headerResId, subtitleResId, disclosureResId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageConfig)) {
            return false;
        }
        PageConfig pageConfig = (PageConfig) other;
        return this.lightLottieUrl == pageConfig.lightLottieUrl && this.darkLottieUrl == pageConfig.darkLottieUrl && this.headerResId == pageConfig.headerResId && this.subtitleResId == pageConfig.subtitleResId && this.disclosureResId == pageConfig.disclosureResId;
    }

    public int hashCode() {
        return (((((((this.lightLottieUrl.hashCode() * 31) + this.darkLottieUrl.hashCode()) * 31) + Integer.hashCode(this.headerResId)) * 31) + Integer.hashCode(this.subtitleResId)) * 31) + Integer.hashCode(this.disclosureResId);
    }

    public String toString() {
        return "PageConfig(lightLottieUrl=" + this.lightLottieUrl + ", darkLottieUrl=" + this.darkLottieUrl + ", headerResId=" + this.headerResId + ", subtitleResId=" + this.subtitleResId + ", disclosureResId=" + this.disclosureResId + ")";
    }

    public PageConfig(LottieUrl lightLottieUrl, LottieUrl darkLottieUrl, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(lightLottieUrl, "lightLottieUrl");
        Intrinsics.checkNotNullParameter(darkLottieUrl, "darkLottieUrl");
        this.lightLottieUrl = lightLottieUrl;
        this.darkLottieUrl = darkLottieUrl;
        this.headerResId = i;
        this.subtitleResId = i2;
        this.disclosureResId = i3;
    }

    public final LottieUrl getLightLottieUrl() {
        return this.lightLottieUrl;
    }

    public final LottieUrl getDarkLottieUrl() {
        return this.darkLottieUrl;
    }

    public final int getHeaderResId() {
        return this.headerResId;
    }

    public final int getSubtitleResId() {
        return this.subtitleResId;
    }

    public final int getDisclosureResId() {
        return this.disclosureResId;
    }
}
