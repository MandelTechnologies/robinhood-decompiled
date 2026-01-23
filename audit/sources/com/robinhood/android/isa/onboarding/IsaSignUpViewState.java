package com.robinhood.android.isa.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: IsaSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/IsaSignUpViewState;", "", "isCtaLoading", "", "pageConfigs", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/isa/onboarding/PageConfig;", "<init>", "(ZLkotlinx/collections/immutable/PersistentList;)V", "()Z", "getPageConfigs", "()Lkotlinx/collections/immutable/PersistentList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaSignUpViewState {
    public static final int $stable = 0;
    private final boolean isCtaLoading;
    private final ImmutableList3<PageConfig> pageConfigs;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IsaSignUpViewState copy$default(IsaSignUpViewState isaSignUpViewState, boolean z, ImmutableList3 immutableList3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = isaSignUpViewState.isCtaLoading;
        }
        if ((i & 2) != 0) {
            immutableList3 = isaSignUpViewState.pageConfigs;
        }
        return isaSignUpViewState.copy(z, immutableList3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCtaLoading() {
        return this.isCtaLoading;
    }

    public final ImmutableList3<PageConfig> component2() {
        return this.pageConfigs;
    }

    public final IsaSignUpViewState copy(boolean isCtaLoading, ImmutableList3<PageConfig> pageConfigs) {
        Intrinsics.checkNotNullParameter(pageConfigs, "pageConfigs");
        return new IsaSignUpViewState(isCtaLoading, pageConfigs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaSignUpViewState)) {
            return false;
        }
        IsaSignUpViewState isaSignUpViewState = (IsaSignUpViewState) other;
        return this.isCtaLoading == isaSignUpViewState.isCtaLoading && Intrinsics.areEqual(this.pageConfigs, isaSignUpViewState.pageConfigs);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isCtaLoading) * 31) + this.pageConfigs.hashCode();
    }

    public String toString() {
        return "IsaSignUpViewState(isCtaLoading=" + this.isCtaLoading + ", pageConfigs=" + this.pageConfigs + ")";
    }

    public IsaSignUpViewState(boolean z, ImmutableList3<PageConfig> pageConfigs) {
        Intrinsics.checkNotNullParameter(pageConfigs, "pageConfigs");
        this.isCtaLoading = z;
        this.pageConfigs = pageConfigs;
    }

    public /* synthetic */ IsaSignUpViewState(boolean z, ImmutableList3 immutableList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, immutableList3);
    }

    public final boolean isCtaLoading() {
        return this.isCtaLoading;
    }

    public final ImmutableList3<PageConfig> getPageConfigs() {
        return this.pageConfigs;
    }
}
