package com.robinhood.shared.unverifiedaccountrecovery.phone;

import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UarSmsMfaEnrollPhoneInputViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputViewState;", "", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "sendingInput", "", "sendInputErrorEvent", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "<init>", "(Lcom/robinhood/android/common/util/InternationalInfo;ZLcom/robinhood/compose/duxo/ComposeUiEvent;)V", "getInternationalInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "getSendingInput", "()Z", "getSendInputErrorEvent", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UarSmsMfaEnrollPhoneInputViewState {
    public static final int $stable = ComposeUiEvent.$stable | InternationalInfo.$stable;
    private final InternationalInfo internationalInfo;
    private final ComposeUiEvent<Throwable> sendInputErrorEvent;
    private final boolean sendingInput;

    public UarSmsMfaEnrollPhoneInputViewState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UarSmsMfaEnrollPhoneInputViewState copy$default(UarSmsMfaEnrollPhoneInputViewState uarSmsMfaEnrollPhoneInputViewState, InternationalInfo internationalInfo, boolean z, ComposeUiEvent composeUiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            internationalInfo = uarSmsMfaEnrollPhoneInputViewState.internationalInfo;
        }
        if ((i & 2) != 0) {
            z = uarSmsMfaEnrollPhoneInputViewState.sendingInput;
        }
        if ((i & 4) != 0) {
            composeUiEvent = uarSmsMfaEnrollPhoneInputViewState.sendInputErrorEvent;
        }
        return uarSmsMfaEnrollPhoneInputViewState.copy(internationalInfo, z, composeUiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final InternationalInfo getInternationalInfo() {
        return this.internationalInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final ComposeUiEvent<Throwable> component3() {
        return this.sendInputErrorEvent;
    }

    public final UarSmsMfaEnrollPhoneInputViewState copy(InternationalInfo internationalInfo, boolean sendingInput, ComposeUiEvent<Throwable> sendInputErrorEvent) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        return new UarSmsMfaEnrollPhoneInputViewState(internationalInfo, sendingInput, sendInputErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UarSmsMfaEnrollPhoneInputViewState)) {
            return false;
        }
        UarSmsMfaEnrollPhoneInputViewState uarSmsMfaEnrollPhoneInputViewState = (UarSmsMfaEnrollPhoneInputViewState) other;
        return Intrinsics.areEqual(this.internationalInfo, uarSmsMfaEnrollPhoneInputViewState.internationalInfo) && this.sendingInput == uarSmsMfaEnrollPhoneInputViewState.sendingInput && Intrinsics.areEqual(this.sendInputErrorEvent, uarSmsMfaEnrollPhoneInputViewState.sendInputErrorEvent);
    }

    public int hashCode() {
        int iHashCode = ((this.internationalInfo.hashCode() * 31) + Boolean.hashCode(this.sendingInput)) * 31;
        ComposeUiEvent<Throwable> composeUiEvent = this.sendInputErrorEvent;
        return iHashCode + (composeUiEvent == null ? 0 : composeUiEvent.hashCode());
    }

    public String toString() {
        return "UarSmsMfaEnrollPhoneInputViewState(internationalInfo=" + this.internationalInfo + ", sendingInput=" + this.sendingInput + ", sendInputErrorEvent=" + this.sendInputErrorEvent + ")";
    }

    public UarSmsMfaEnrollPhoneInputViewState(InternationalInfo internationalInfo, boolean z, ComposeUiEvent<Throwable> composeUiEvent) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        this.internationalInfo = internationalInfo;
        this.sendingInput = z;
        this.sendInputErrorEvent = composeUiEvent;
    }

    public final InternationalInfo getInternationalInfo() {
        return this.internationalInfo;
    }

    public /* synthetic */ UarSmsMfaEnrollPhoneInputViewState(InternationalInfo internationalInfo, boolean z, ComposeUiEvent composeUiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, CountryCode.Supported.UnitedStates.INSTANCE, 1, null) : internationalInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : composeUiEvent);
    }

    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final ComposeUiEvent<Throwable> getSendInputErrorEvent() {
        return this.sendInputErrorEvent;
    }
}
