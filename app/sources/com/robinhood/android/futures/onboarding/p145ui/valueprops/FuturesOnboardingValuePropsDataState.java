package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import futures_onboarding_value_props.proto.p463v1.PageDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import microgram.android.Monitoring;

/* compiled from: FuturesOnboardingValuePropsDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDataState;", "", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lfutures_onboarding_value_props/proto/v1/PageDto;", "microgramState", "Lmicrogram/android/MicrogramState;", "isInExperimentForType", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lmicrogram/android/MicrogramState;Z)V", "getPages", "()Lkotlinx/collections/immutable/ImmutableList;", "getMicrogramState", "()Lmicrogram/android/MicrogramState;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesOnboardingValuePropsDataState {
    public static final int $stable = 8;
    private final boolean isInExperimentForType;
    private final Monitoring microgramState;
    private final ImmutableList<PageDto> pages;

    public FuturesOnboardingValuePropsDataState() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesOnboardingValuePropsDataState copy$default(FuturesOnboardingValuePropsDataState futuresOnboardingValuePropsDataState, ImmutableList immutableList, Monitoring monitoring, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = futuresOnboardingValuePropsDataState.pages;
        }
        if ((i & 2) != 0) {
            monitoring = futuresOnboardingValuePropsDataState.microgramState;
        }
        if ((i & 4) != 0) {
            z = futuresOnboardingValuePropsDataState.isInExperimentForType;
        }
        return futuresOnboardingValuePropsDataState.copy(immutableList, monitoring, z);
    }

    public final ImmutableList<PageDto> component1() {
        return this.pages;
    }

    /* renamed from: component2, reason: from getter */
    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsInExperimentForType() {
        return this.isInExperimentForType;
    }

    public final FuturesOnboardingValuePropsDataState copy(ImmutableList<PageDto> pages, Monitoring microgramState, boolean isInExperimentForType) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(microgramState, "microgramState");
        return new FuturesOnboardingValuePropsDataState(pages, microgramState, isInExperimentForType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOnboardingValuePropsDataState)) {
            return false;
        }
        FuturesOnboardingValuePropsDataState futuresOnboardingValuePropsDataState = (FuturesOnboardingValuePropsDataState) other;
        return Intrinsics.areEqual(this.pages, futuresOnboardingValuePropsDataState.pages) && Intrinsics.areEqual(this.microgramState, futuresOnboardingValuePropsDataState.microgramState) && this.isInExperimentForType == futuresOnboardingValuePropsDataState.isInExperimentForType;
    }

    public int hashCode() {
        return (((this.pages.hashCode() * 31) + this.microgramState.hashCode()) * 31) + Boolean.hashCode(this.isInExperimentForType);
    }

    public String toString() {
        return "FuturesOnboardingValuePropsDataState(pages=" + this.pages + ", microgramState=" + this.microgramState + ", isInExperimentForType=" + this.isInExperimentForType + ")";
    }

    public FuturesOnboardingValuePropsDataState(ImmutableList<PageDto> pages, Monitoring microgramState, boolean z) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(microgramState, "microgramState");
        this.pages = pages;
        this.microgramState = microgramState;
        this.isInExperimentForType = z;
    }

    public /* synthetic */ FuturesOnboardingValuePropsDataState(ImmutableList immutableList, Monitoring monitoring, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList, (i & 2) != 0 ? Monitoring.Loading.INSTANCE : monitoring, (i & 4) != 0 ? false : z);
    }

    public final ImmutableList<PageDto> getPages() {
        return this.pages;
    }

    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    public final boolean isInExperimentForType() {
        return this.isInExperimentForType;
    }
}
