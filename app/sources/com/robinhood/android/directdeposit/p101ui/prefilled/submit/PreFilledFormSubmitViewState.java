package com.robinhood.android.directdeposit.p101ui.prefilled.submit;

import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormSubmitViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitViewState;", "", "routingDetails", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "fullName", "", "routingDetailsError", "Lcom/robinhood/udf/UiEvent;", "", "isSubmitLoading", "", "formSubmitted", "", "formSubmitError", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getRoutingDetails", "()Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "getFullName", "()Ljava/lang/String;", "getRoutingDetailsError", "()Lcom/robinhood/udf/UiEvent;", "()Z", "getFormSubmitted", "getFormSubmitError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class PreFilledFormSubmitViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> formSubmitError;
    private final UiEvent<Unit> formSubmitted;
    private final String fullName;
    private final boolean isSubmitLoading;
    private final AccountRoutingDetailsStore.RoutingDetails routingDetails;
    private final UiEvent<Throwable> routingDetailsError;

    public PreFilledFormSubmitViewState() {
        this(null, null, null, false, null, null, 63, null);
    }

    public static /* synthetic */ PreFilledFormSubmitViewState copy$default(PreFilledFormSubmitViewState preFilledFormSubmitViewState, AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent uiEvent, boolean z, UiEvent uiEvent2, UiEvent uiEvent3, int i, Object obj) {
        if ((i & 1) != 0) {
            routingDetails = preFilledFormSubmitViewState.routingDetails;
        }
        if ((i & 2) != 0) {
            str = preFilledFormSubmitViewState.fullName;
        }
        if ((i & 4) != 0) {
            uiEvent = preFilledFormSubmitViewState.routingDetailsError;
        }
        if ((i & 8) != 0) {
            z = preFilledFormSubmitViewState.isSubmitLoading;
        }
        if ((i & 16) != 0) {
            uiEvent2 = preFilledFormSubmitViewState.formSubmitted;
        }
        if ((i & 32) != 0) {
            uiEvent3 = preFilledFormSubmitViewState.formSubmitError;
        }
        UiEvent uiEvent4 = uiEvent2;
        UiEvent uiEvent5 = uiEvent3;
        return preFilledFormSubmitViewState.copy(routingDetails, str, uiEvent, z, uiEvent4, uiEvent5);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    public final UiEvent<Throwable> component3() {
        return this.routingDetailsError;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSubmitLoading() {
        return this.isSubmitLoading;
    }

    public final UiEvent<Unit> component5() {
        return this.formSubmitted;
    }

    public final UiEvent<Throwable> component6() {
        return this.formSubmitError;
    }

    public final PreFilledFormSubmitViewState copy(AccountRoutingDetailsStore.RoutingDetails routingDetails, String fullName, UiEvent<Throwable> routingDetailsError, boolean isSubmitLoading, UiEvent<Unit> formSubmitted, UiEvent<Throwable> formSubmitError) {
        return new PreFilledFormSubmitViewState(routingDetails, fullName, routingDetailsError, isSubmitLoading, formSubmitted, formSubmitError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreFilledFormSubmitViewState)) {
            return false;
        }
        PreFilledFormSubmitViewState preFilledFormSubmitViewState = (PreFilledFormSubmitViewState) other;
        return Intrinsics.areEqual(this.routingDetails, preFilledFormSubmitViewState.routingDetails) && Intrinsics.areEqual(this.fullName, preFilledFormSubmitViewState.fullName) && Intrinsics.areEqual(this.routingDetailsError, preFilledFormSubmitViewState.routingDetailsError) && this.isSubmitLoading == preFilledFormSubmitViewState.isSubmitLoading && Intrinsics.areEqual(this.formSubmitted, preFilledFormSubmitViewState.formSubmitted) && Intrinsics.areEqual(this.formSubmitError, preFilledFormSubmitViewState.formSubmitError);
    }

    public int hashCode() {
        AccountRoutingDetailsStore.RoutingDetails routingDetails = this.routingDetails;
        int iHashCode = (routingDetails == null ? 0 : routingDetails.hashCode()) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.routingDetailsError;
        int iHashCode3 = (((iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.isSubmitLoading)) * 31;
        UiEvent<Unit> uiEvent2 = this.formSubmitted;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Throwable> uiEvent3 = this.formSubmitError;
        return iHashCode4 + (uiEvent3 != null ? uiEvent3.hashCode() : 0);
    }

    public String toString() {
        return "PreFilledFormSubmitViewState(routingDetails=" + this.routingDetails + ", fullName=" + this.fullName + ", routingDetailsError=" + this.routingDetailsError + ", isSubmitLoading=" + this.isSubmitLoading + ", formSubmitted=" + this.formSubmitted + ", formSubmitError=" + this.formSubmitError + ")";
    }

    public PreFilledFormSubmitViewState(AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent<Throwable> uiEvent, boolean z, UiEvent<Unit> uiEvent2, UiEvent<Throwable> uiEvent3) {
        this.routingDetails = routingDetails;
        this.fullName = str;
        this.routingDetailsError = uiEvent;
        this.isSubmitLoading = z;
        this.formSubmitted = uiEvent2;
        this.formSubmitError = uiEvent3;
    }

    public /* synthetic */ PreFilledFormSubmitViewState(AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent uiEvent, boolean z, UiEvent uiEvent2, UiEvent uiEvent3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : routingDetails, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : uiEvent3);
    }

    public final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final UiEvent<Throwable> getRoutingDetailsError() {
        return this.routingDetailsError;
    }

    public final boolean isSubmitLoading() {
        return this.isSubmitLoading;
    }

    public final UiEvent<Unit> getFormSubmitted() {
        return this.formSubmitted;
    }

    public final UiEvent<Throwable> getFormSubmitError() {
        return this.formSubmitError;
    }
}
