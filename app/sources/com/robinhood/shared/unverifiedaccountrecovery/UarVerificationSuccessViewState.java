package com.robinhood.shared.unverifiedaccountrecovery;

import com.robinhood.compose.duxo.ComposeUiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UarVerificationSuccessViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarVerificationSuccessViewState;", "", "sendingInput", "", "sendInputError", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "<init>", "(ZLcom/robinhood/compose/duxo/ComposeUiEvent;)V", "getSendingInput", "()Z", "getSendInputError", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UarVerificationSuccessViewState {
    public static final int $stable = ComposeUiEvent.$stable;
    private final ComposeUiEvent<Throwable> sendInputError;
    private final boolean sendingInput;

    /* JADX WARN: Multi-variable type inference failed */
    public UarVerificationSuccessViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UarVerificationSuccessViewState copy$default(UarVerificationSuccessViewState uarVerificationSuccessViewState, boolean z, ComposeUiEvent composeUiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uarVerificationSuccessViewState.sendingInput;
        }
        if ((i & 2) != 0) {
            composeUiEvent = uarVerificationSuccessViewState.sendInputError;
        }
        return uarVerificationSuccessViewState.copy(z, composeUiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final ComposeUiEvent<Throwable> component2() {
        return this.sendInputError;
    }

    public final UarVerificationSuccessViewState copy(boolean sendingInput, ComposeUiEvent<Throwable> sendInputError) {
        return new UarVerificationSuccessViewState(sendingInput, sendInputError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UarVerificationSuccessViewState)) {
            return false;
        }
        UarVerificationSuccessViewState uarVerificationSuccessViewState = (UarVerificationSuccessViewState) other;
        return this.sendingInput == uarVerificationSuccessViewState.sendingInput && Intrinsics.areEqual(this.sendInputError, uarVerificationSuccessViewState.sendInputError);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.sendingInput) * 31;
        ComposeUiEvent<Throwable> composeUiEvent = this.sendInputError;
        return iHashCode + (composeUiEvent == null ? 0 : composeUiEvent.hashCode());
    }

    public String toString() {
        return "UarVerificationSuccessViewState(sendingInput=" + this.sendingInput + ", sendInputError=" + this.sendInputError + ")";
    }

    public UarVerificationSuccessViewState(boolean z, ComposeUiEvent<Throwable> composeUiEvent) {
        this.sendingInput = z;
        this.sendInputError = composeUiEvent;
    }

    public /* synthetic */ UarVerificationSuccessViewState(boolean z, ComposeUiEvent composeUiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : composeUiEvent);
    }

    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final ComposeUiEvent<Throwable> getSendInputError() {
        return this.sendInputError;
    }
}
