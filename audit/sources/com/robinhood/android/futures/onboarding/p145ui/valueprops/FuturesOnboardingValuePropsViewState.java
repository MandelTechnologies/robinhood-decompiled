package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import futures_onboarding_value_props.proto.p463v1.PageDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: FuturesOnboardingValuePropsDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsViewState;", "", "isLoading", "", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lfutures_onboarding_value_props/proto/v1/PageDto;", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;)V", "()Z", "getPages", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesOnboardingValuePropsViewState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final ImmutableList<PageDto> pages;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesOnboardingValuePropsViewState copy$default(FuturesOnboardingValuePropsViewState futuresOnboardingValuePropsViewState, boolean z, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = futuresOnboardingValuePropsViewState.isLoading;
        }
        if ((i & 2) != 0) {
            immutableList = futuresOnboardingValuePropsViewState.pages;
        }
        return futuresOnboardingValuePropsViewState.copy(z, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ImmutableList<PageDto> component2() {
        return this.pages;
    }

    public final FuturesOnboardingValuePropsViewState copy(boolean isLoading, ImmutableList<PageDto> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new FuturesOnboardingValuePropsViewState(isLoading, pages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOnboardingValuePropsViewState)) {
            return false;
        }
        FuturesOnboardingValuePropsViewState futuresOnboardingValuePropsViewState = (FuturesOnboardingValuePropsViewState) other;
        return this.isLoading == futuresOnboardingValuePropsViewState.isLoading && Intrinsics.areEqual(this.pages, futuresOnboardingValuePropsViewState.pages);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + this.pages.hashCode();
    }

    public String toString() {
        return "FuturesOnboardingValuePropsViewState(isLoading=" + this.isLoading + ", pages=" + this.pages + ")";
    }

    public FuturesOnboardingValuePropsViewState(boolean z, ImmutableList<PageDto> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.isLoading = z;
        this.pages = pages;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ImmutableList<PageDto> getPages() {
        return this.pages;
    }
}
