package com.robinhood.android.isa.onboarding;

import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaSignUpComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/ValueProp;", "", "lottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "headerResId", "", "subtitleResId", "disclosureResId", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;III)V", "getLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getHeaderResId", "()I", "getSubtitleResId", "getDisclosureResId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final /* data */ class ValueProp {
    private final int disclosureResId;
    private final int headerResId;
    private final LottieUrl lottieUrl;
    private final int subtitleResId;

    public static /* synthetic */ ValueProp copy$default(ValueProp valueProp, LottieUrl lottieUrl, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lottieUrl = valueProp.lottieUrl;
        }
        if ((i4 & 2) != 0) {
            i = valueProp.headerResId;
        }
        if ((i4 & 4) != 0) {
            i2 = valueProp.subtitleResId;
        }
        if ((i4 & 8) != 0) {
            i3 = valueProp.disclosureResId;
        }
        return valueProp.copy(lottieUrl, i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final LottieUrl getLottieUrl() {
        return this.lottieUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeaderResId() {
        return this.headerResId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSubtitleResId() {
        return this.subtitleResId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDisclosureResId() {
        return this.disclosureResId;
    }

    public final ValueProp copy(LottieUrl lottieUrl, int headerResId, int subtitleResId, int disclosureResId) {
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        return new ValueProp(lottieUrl, headerResId, subtitleResId, disclosureResId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValueProp)) {
            return false;
        }
        ValueProp valueProp = (ValueProp) other;
        return this.lottieUrl == valueProp.lottieUrl && this.headerResId == valueProp.headerResId && this.subtitleResId == valueProp.subtitleResId && this.disclosureResId == valueProp.disclosureResId;
    }

    public int hashCode() {
        return (((((this.lottieUrl.hashCode() * 31) + Integer.hashCode(this.headerResId)) * 31) + Integer.hashCode(this.subtitleResId)) * 31) + Integer.hashCode(this.disclosureResId);
    }

    public String toString() {
        return "ValueProp(lottieUrl=" + this.lottieUrl + ", headerResId=" + this.headerResId + ", subtitleResId=" + this.subtitleResId + ", disclosureResId=" + this.disclosureResId + ")";
    }

    public ValueProp(LottieUrl lottieUrl, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        this.lottieUrl = lottieUrl;
        this.headerResId = i;
        this.subtitleResId = i2;
        this.disclosureResId = i3;
    }

    public final LottieUrl getLottieUrl() {
        return this.lottieUrl;
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
