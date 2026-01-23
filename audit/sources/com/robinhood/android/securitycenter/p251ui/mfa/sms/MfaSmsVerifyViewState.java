package com.robinhood.android.securitycenter.p251ui.mfa.sms;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaSmsVerifyViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyViewState;", "", "isLoading", "", "showChangeNumberButton", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ZZLcom/robinhood/utils/resource/StringResource;)V", "()Z", "getShowChangeNumberButton", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MfaSmsVerifyViewState {
    public static final int $stable = StringResource.$stable;
    private final boolean isLoading;
    private final boolean showChangeNumberButton;
    private final StringResource subtitle;

    public static /* synthetic */ MfaSmsVerifyViewState copy$default(MfaSmsVerifyViewState mfaSmsVerifyViewState, boolean z, boolean z2, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mfaSmsVerifyViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = mfaSmsVerifyViewState.showChangeNumberButton;
        }
        if ((i & 4) != 0) {
            stringResource = mfaSmsVerifyViewState.subtitle;
        }
        return mfaSmsVerifyViewState.copy(z, z2, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowChangeNumberButton() {
        return this.showChangeNumberButton;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final MfaSmsVerifyViewState copy(boolean isLoading, boolean showChangeNumberButton, StringResource subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new MfaSmsVerifyViewState(isLoading, showChangeNumberButton, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaSmsVerifyViewState)) {
            return false;
        }
        MfaSmsVerifyViewState mfaSmsVerifyViewState = (MfaSmsVerifyViewState) other;
        return this.isLoading == mfaSmsVerifyViewState.isLoading && this.showChangeNumberButton == mfaSmsVerifyViewState.showChangeNumberButton && Intrinsics.areEqual(this.subtitle, mfaSmsVerifyViewState.subtitle);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.showChangeNumberButton)) * 31) + this.subtitle.hashCode();
    }

    public String toString() {
        return "MfaSmsVerifyViewState(isLoading=" + this.isLoading + ", showChangeNumberButton=" + this.showChangeNumberButton + ", subtitle=" + this.subtitle + ")";
    }

    public MfaSmsVerifyViewState(boolean z, boolean z2, StringResource subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.isLoading = z;
        this.showChangeNumberButton = z2;
        this.subtitle = subtitle;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowChangeNumberButton() {
        return this.showChangeNumberButton;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }
}
