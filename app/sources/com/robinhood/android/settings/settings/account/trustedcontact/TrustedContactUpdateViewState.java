package com.robinhood.android.settings.settings.account.trustedcontact;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactUpdateViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateViewState;", "", "loading", "", "submittable", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent;", "initializeInternationalInfoEvent", "Lcom/robinhood/android/common/util/InternationalInfo;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(ZZLcom/robinhood/models/ui/identi/UiAddress;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getLoading", "()Z", "getSubmittable", "getAddress", "()Lcom/robinhood/models/ui/identi/UiAddress;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "getInitializeInternationalInfoEvent", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "showAddressInput", "getShowAddressInput", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrustedContactUpdateViewState {
    public static final int $stable = 8;
    private final UiAddress address;
    private final CountryCode.Supported countryCode;
    private final UiEvent<TrustedContactUpdateViewState2> event;
    private final UiEvent<InternationalInfo> initializeInternationalInfoEvent;
    private final boolean loading;
    private final boolean submittable;

    public TrustedContactUpdateViewState() {
        this(false, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ TrustedContactUpdateViewState copy$default(TrustedContactUpdateViewState trustedContactUpdateViewState, boolean z, boolean z2, UiAddress uiAddress, UiEvent uiEvent, UiEvent uiEvent2, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 1) != 0) {
            z = trustedContactUpdateViewState.loading;
        }
        if ((i & 2) != 0) {
            z2 = trustedContactUpdateViewState.submittable;
        }
        if ((i & 4) != 0) {
            uiAddress = trustedContactUpdateViewState.address;
        }
        if ((i & 8) != 0) {
            uiEvent = trustedContactUpdateViewState.event;
        }
        if ((i & 16) != 0) {
            uiEvent2 = trustedContactUpdateViewState.initializeInternationalInfoEvent;
        }
        if ((i & 32) != 0) {
            supported = trustedContactUpdateViewState.countryCode;
        }
        UiEvent uiEvent3 = uiEvent2;
        CountryCode.Supported supported2 = supported;
        return trustedContactUpdateViewState.copy(z, z2, uiAddress, uiEvent, uiEvent3, supported2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSubmittable() {
        return this.submittable;
    }

    /* renamed from: component3, reason: from getter */
    public final UiAddress getAddress() {
        return this.address;
    }

    public final UiEvent<TrustedContactUpdateViewState2> component4() {
        return this.event;
    }

    public final UiEvent<InternationalInfo> component5() {
        return this.initializeInternationalInfoEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final TrustedContactUpdateViewState copy(boolean loading, boolean submittable, UiAddress address, UiEvent<TrustedContactUpdateViewState2> event, UiEvent<InternationalInfo> initializeInternationalInfoEvent, CountryCode.Supported countryCode) {
        return new TrustedContactUpdateViewState(loading, submittable, address, event, initializeInternationalInfoEvent, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustedContactUpdateViewState)) {
            return false;
        }
        TrustedContactUpdateViewState trustedContactUpdateViewState = (TrustedContactUpdateViewState) other;
        return this.loading == trustedContactUpdateViewState.loading && this.submittable == trustedContactUpdateViewState.submittable && Intrinsics.areEqual(this.address, trustedContactUpdateViewState.address) && Intrinsics.areEqual(this.event, trustedContactUpdateViewState.event) && Intrinsics.areEqual(this.initializeInternationalInfoEvent, trustedContactUpdateViewState.initializeInternationalInfoEvent) && Intrinsics.areEqual(this.countryCode, trustedContactUpdateViewState.countryCode);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.loading) * 31) + Boolean.hashCode(this.submittable)) * 31;
        UiAddress uiAddress = this.address;
        int iHashCode2 = (iHashCode + (uiAddress == null ? 0 : uiAddress.hashCode())) * 31;
        UiEvent<TrustedContactUpdateViewState2> uiEvent = this.event;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<InternationalInfo> uiEvent2 = this.initializeInternationalInfoEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        CountryCode.Supported supported = this.countryCode;
        return iHashCode4 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "TrustedContactUpdateViewState(loading=" + this.loading + ", submittable=" + this.submittable + ", address=" + this.address + ", event=" + this.event + ", initializeInternationalInfoEvent=" + this.initializeInternationalInfoEvent + ", countryCode=" + this.countryCode + ")";
    }

    public TrustedContactUpdateViewState(boolean z, boolean z2, UiAddress uiAddress, UiEvent<TrustedContactUpdateViewState2> uiEvent, UiEvent<InternationalInfo> uiEvent2, CountryCode.Supported supported) {
        this.loading = z;
        this.submittable = z2;
        this.address = uiAddress;
        this.event = uiEvent;
        this.initializeInternationalInfoEvent = uiEvent2;
        this.countryCode = supported;
    }

    public /* synthetic */ TrustedContactUpdateViewState(boolean z, boolean z2, UiAddress uiAddress, UiEvent uiEvent, UiEvent uiEvent2, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : uiAddress, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : supported);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getSubmittable() {
        return this.submittable;
    }

    public final UiAddress getAddress() {
        return this.address;
    }

    public final UiEvent<TrustedContactUpdateViewState2> getEvent() {
        return this.event;
    }

    public final UiEvent<InternationalInfo> getInitializeInternationalInfoEvent() {
        return this.initializeInternationalInfoEvent;
    }

    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final boolean getShowAddressInput() {
        return Intrinsics.areEqual(this.countryCode, CountryCode.Supported.UnitedStates.INSTANCE);
    }
}
