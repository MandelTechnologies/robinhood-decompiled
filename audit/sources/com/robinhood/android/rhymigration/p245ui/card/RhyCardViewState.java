package com.robinhood.android.rhymigration.p245ui.card;

import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyCardViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/card/RhyCardViewState;", "", "primaryButtonLoading", "", "secondaryButtonLoading", "success", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RhyCardPreference;", "error", "", "<init>", "(ZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getPrimaryButtonLoading", "()Z", "getSecondaryButtonLoading", "getSuccess", "()Lcom/robinhood/udf/UiEvent;", "getError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyCardViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;
    private final boolean primaryButtonLoading;
    private final boolean secondaryButtonLoading;
    private final UiEvent<MinervaAccountStore.RhyCardPreference> success;

    public RhyCardViewState() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyCardViewState copy$default(RhyCardViewState rhyCardViewState, boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rhyCardViewState.primaryButtonLoading;
        }
        if ((i & 2) != 0) {
            z2 = rhyCardViewState.secondaryButtonLoading;
        }
        if ((i & 4) != 0) {
            uiEvent = rhyCardViewState.success;
        }
        if ((i & 8) != 0) {
            uiEvent2 = rhyCardViewState.error;
        }
        return rhyCardViewState.copy(z, z2, uiEvent, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPrimaryButtonLoading() {
        return this.primaryButtonLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSecondaryButtonLoading() {
        return this.secondaryButtonLoading;
    }

    public final UiEvent<MinervaAccountStore.RhyCardPreference> component3() {
        return this.success;
    }

    public final UiEvent<Throwable> component4() {
        return this.error;
    }

    public final RhyCardViewState copy(boolean primaryButtonLoading, boolean secondaryButtonLoading, UiEvent<MinervaAccountStore.RhyCardPreference> success, UiEvent<Throwable> error) {
        return new RhyCardViewState(primaryButtonLoading, secondaryButtonLoading, success, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyCardViewState)) {
            return false;
        }
        RhyCardViewState rhyCardViewState = (RhyCardViewState) other;
        return this.primaryButtonLoading == rhyCardViewState.primaryButtonLoading && this.secondaryButtonLoading == rhyCardViewState.secondaryButtonLoading && Intrinsics.areEqual(this.success, rhyCardViewState.success) && Intrinsics.areEqual(this.error, rhyCardViewState.error);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.primaryButtonLoading) * 31) + Boolean.hashCode(this.secondaryButtonLoading)) * 31;
        UiEvent<MinervaAccountStore.RhyCardPreference> uiEvent = this.success;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.error;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "RhyCardViewState(primaryButtonLoading=" + this.primaryButtonLoading + ", secondaryButtonLoading=" + this.secondaryButtonLoading + ", success=" + this.success + ", error=" + this.error + ")";
    }

    public RhyCardViewState(boolean z, boolean z2, UiEvent<MinervaAccountStore.RhyCardPreference> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.primaryButtonLoading = z;
        this.secondaryButtonLoading = z2;
        this.success = uiEvent;
        this.error = uiEvent2;
    }

    public /* synthetic */ RhyCardViewState(boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2);
    }

    public final boolean getPrimaryButtonLoading() {
        return this.primaryButtonLoading;
    }

    public final boolean getSecondaryButtonLoading() {
        return this.secondaryButtonLoading;
    }

    public final UiEvent<MinervaAccountStore.RhyCardPreference> getSuccess() {
        return this.success;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }
}
