package com.robinhood.shared.unverifiedaccountrecovery.email;

import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UarEmailUpdateVerificationViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationViewState;", "", "sendingInput", "", "sendInputSuccessEvent", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "Lcom/robinhood/models/api/pathfinder/contexts/CtaAction;", "sendInputErrorEvent", "", "<init>", "(ZLcom/robinhood/compose/duxo/ComposeUiEvent;Lcom/robinhood/compose/duxo/ComposeUiEvent;)V", "getSendingInput", "()Z", "getSendInputSuccessEvent", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "getSendInputErrorEvent", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UarEmailUpdateVerificationViewState {
    public static final int $stable = ComposeUiEvent.$stable;
    private final ComposeUiEvent<Throwable> sendInputErrorEvent;
    private final ComposeUiEvent<CtaAction> sendInputSuccessEvent;
    private final boolean sendingInput;

    public UarEmailUpdateVerificationViewState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UarEmailUpdateVerificationViewState copy$default(UarEmailUpdateVerificationViewState uarEmailUpdateVerificationViewState, boolean z, ComposeUiEvent composeUiEvent, ComposeUiEvent composeUiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uarEmailUpdateVerificationViewState.sendingInput;
        }
        if ((i & 2) != 0) {
            composeUiEvent = uarEmailUpdateVerificationViewState.sendInputSuccessEvent;
        }
        if ((i & 4) != 0) {
            composeUiEvent2 = uarEmailUpdateVerificationViewState.sendInputErrorEvent;
        }
        return uarEmailUpdateVerificationViewState.copy(z, composeUiEvent, composeUiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final ComposeUiEvent<CtaAction> component2() {
        return this.sendInputSuccessEvent;
    }

    public final ComposeUiEvent<Throwable> component3() {
        return this.sendInputErrorEvent;
    }

    public final UarEmailUpdateVerificationViewState copy(boolean sendingInput, ComposeUiEvent<CtaAction> sendInputSuccessEvent, ComposeUiEvent<Throwable> sendInputErrorEvent) {
        return new UarEmailUpdateVerificationViewState(sendingInput, sendInputSuccessEvent, sendInputErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UarEmailUpdateVerificationViewState)) {
            return false;
        }
        UarEmailUpdateVerificationViewState uarEmailUpdateVerificationViewState = (UarEmailUpdateVerificationViewState) other;
        return this.sendingInput == uarEmailUpdateVerificationViewState.sendingInput && Intrinsics.areEqual(this.sendInputSuccessEvent, uarEmailUpdateVerificationViewState.sendInputSuccessEvent) && Intrinsics.areEqual(this.sendInputErrorEvent, uarEmailUpdateVerificationViewState.sendInputErrorEvent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.sendingInput) * 31;
        ComposeUiEvent<CtaAction> composeUiEvent = this.sendInputSuccessEvent;
        int iHashCode2 = (iHashCode + (composeUiEvent == null ? 0 : composeUiEvent.hashCode())) * 31;
        ComposeUiEvent<Throwable> composeUiEvent2 = this.sendInputErrorEvent;
        return iHashCode2 + (composeUiEvent2 != null ? composeUiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "UarEmailUpdateVerificationViewState(sendingInput=" + this.sendingInput + ", sendInputSuccessEvent=" + this.sendInputSuccessEvent + ", sendInputErrorEvent=" + this.sendInputErrorEvent + ")";
    }

    public UarEmailUpdateVerificationViewState(boolean z, ComposeUiEvent<CtaAction> composeUiEvent, ComposeUiEvent<Throwable> composeUiEvent2) {
        this.sendingInput = z;
        this.sendInputSuccessEvent = composeUiEvent;
        this.sendInputErrorEvent = composeUiEvent2;
    }

    public /* synthetic */ UarEmailUpdateVerificationViewState(boolean z, ComposeUiEvent composeUiEvent, ComposeUiEvent composeUiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : composeUiEvent, (i & 4) != 0 ? null : composeUiEvent2);
    }

    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final ComposeUiEvent<CtaAction> getSendInputSuccessEvent() {
        return this.sendInputSuccessEvent;
    }

    public final ComposeUiEvent<Throwable> getSendInputErrorEvent() {
        return this.sendInputErrorEvent;
    }
}
