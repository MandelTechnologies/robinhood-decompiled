package com.robinhood.android.gold.downgrade;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDowngradeLoadingState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingState;", "", "originalContext", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "ineligibleToDowngradeEvent", "Lcom/robinhood/udf/UiEvent;", "", "errorEvent", "", "<init>", "(Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getOriginalContext", "()Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "getIneligibleToDowngradeEvent", "()Lcom/robinhood/udf/UiEvent;", "getErrorEvent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldDowngradeLoadingState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> errorEvent;
    private final UiEvent<Unit> ineligibleToDowngradeEvent;
    private final GoldDowngradeContext originalContext;

    public GoldDowngradeLoadingState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoldDowngradeLoadingState copy$default(GoldDowngradeLoadingState goldDowngradeLoadingState, GoldDowngradeContext goldDowngradeContext, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            goldDowngradeContext = goldDowngradeLoadingState.originalContext;
        }
        if ((i & 2) != 0) {
            uiEvent = goldDowngradeLoadingState.ineligibleToDowngradeEvent;
        }
        if ((i & 4) != 0) {
            uiEvent2 = goldDowngradeLoadingState.errorEvent;
        }
        return goldDowngradeLoadingState.copy(goldDowngradeContext, uiEvent, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final GoldDowngradeContext getOriginalContext() {
        return this.originalContext;
    }

    public final UiEvent<Unit> component2() {
        return this.ineligibleToDowngradeEvent;
    }

    public final UiEvent<Throwable> component3() {
        return this.errorEvent;
    }

    public final GoldDowngradeLoadingState copy(GoldDowngradeContext originalContext, UiEvent<Unit> ineligibleToDowngradeEvent, UiEvent<Throwable> errorEvent) {
        return new GoldDowngradeLoadingState(originalContext, ineligibleToDowngradeEvent, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldDowngradeLoadingState)) {
            return false;
        }
        GoldDowngradeLoadingState goldDowngradeLoadingState = (GoldDowngradeLoadingState) other;
        return Intrinsics.areEqual(this.originalContext, goldDowngradeLoadingState.originalContext) && Intrinsics.areEqual(this.ineligibleToDowngradeEvent, goldDowngradeLoadingState.ineligibleToDowngradeEvent) && Intrinsics.areEqual(this.errorEvent, goldDowngradeLoadingState.errorEvent);
    }

    public int hashCode() {
        GoldDowngradeContext goldDowngradeContext = this.originalContext;
        int iHashCode = (goldDowngradeContext == null ? 0 : goldDowngradeContext.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.ineligibleToDowngradeEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.errorEvent;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "GoldDowngradeLoadingState(originalContext=" + this.originalContext + ", ineligibleToDowngradeEvent=" + this.ineligibleToDowngradeEvent + ", errorEvent=" + this.errorEvent + ")";
    }

    public GoldDowngradeLoadingState(GoldDowngradeContext goldDowngradeContext, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.originalContext = goldDowngradeContext;
        this.ineligibleToDowngradeEvent = uiEvent;
        this.errorEvent = uiEvent2;
    }

    public /* synthetic */ GoldDowngradeLoadingState(GoldDowngradeContext goldDowngradeContext, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : goldDowngradeContext, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2);
    }

    public final GoldDowngradeContext getOriginalContext() {
        return this.originalContext;
    }

    public final UiEvent<Unit> getIneligibleToDowngradeEvent() {
        return this.ineligibleToDowngradeEvent;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }
}
