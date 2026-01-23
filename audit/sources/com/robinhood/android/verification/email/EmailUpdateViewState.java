package com.robinhood.android.verification.email;

import com.robinhood.android.common.util.Validation;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailUpdateViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0019\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0006HÆ\u0003J\u001d\u0010\u001a\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003Jc\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R%\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailUpdateViewState;", "", "isConsentedToDisclosure", "", "isLoading", "submitEmailSuccessOrErrorEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/utils/Either;", "", "", "verificationWorkflowEvent", "Lkotlin/Pair;", "Ljava/util/UUID;", "emailInput", "<init>", "(ZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;)V", "()Z", "getSubmitEmailSuccessOrErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "getVerificationWorkflowEvent", "getEmailInput", "()Ljava/lang/String;", "isInputValid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EmailUpdateViewState {
    public static final int $stable = 8;
    private final String emailInput;
    private final boolean isConsentedToDisclosure;
    private final boolean isInputValid;
    private final boolean isLoading;
    private final UiEvent<Either<String, Throwable>> submitEmailSuccessOrErrorEvent;
    private final UiEvent<Tuples2<UUID, Boolean>> verificationWorkflowEvent;

    public EmailUpdateViewState() {
        this(false, false, null, null, null, 31, null);
    }

    public static /* synthetic */ EmailUpdateViewState copy$default(EmailUpdateViewState emailUpdateViewState, boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailUpdateViewState.isConsentedToDisclosure;
        }
        if ((i & 2) != 0) {
            z2 = emailUpdateViewState.isLoading;
        }
        if ((i & 4) != 0) {
            uiEvent = emailUpdateViewState.submitEmailSuccessOrErrorEvent;
        }
        if ((i & 8) != 0) {
            uiEvent2 = emailUpdateViewState.verificationWorkflowEvent;
        }
        if ((i & 16) != 0) {
            str = emailUpdateViewState.emailInput;
        }
        String str2 = str;
        UiEvent uiEvent3 = uiEvent;
        return emailUpdateViewState.copy(z, z2, uiEvent3, uiEvent2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsConsentedToDisclosure() {
        return this.isConsentedToDisclosure;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Either<String, Throwable>> component3() {
        return this.submitEmailSuccessOrErrorEvent;
    }

    public final UiEvent<Tuples2<UUID, Boolean>> component4() {
        return this.verificationWorkflowEvent;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEmailInput() {
        return this.emailInput;
    }

    public final EmailUpdateViewState copy(boolean isConsentedToDisclosure, boolean isLoading, UiEvent<Either<String, Throwable>> submitEmailSuccessOrErrorEvent, UiEvent<Tuples2<UUID, Boolean>> verificationWorkflowEvent, String emailInput) {
        Intrinsics.checkNotNullParameter(emailInput, "emailInput");
        return new EmailUpdateViewState(isConsentedToDisclosure, isLoading, submitEmailSuccessOrErrorEvent, verificationWorkflowEvent, emailInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailUpdateViewState)) {
            return false;
        }
        EmailUpdateViewState emailUpdateViewState = (EmailUpdateViewState) other;
        return this.isConsentedToDisclosure == emailUpdateViewState.isConsentedToDisclosure && this.isLoading == emailUpdateViewState.isLoading && Intrinsics.areEqual(this.submitEmailSuccessOrErrorEvent, emailUpdateViewState.submitEmailSuccessOrErrorEvent) && Intrinsics.areEqual(this.verificationWorkflowEvent, emailUpdateViewState.verificationWorkflowEvent) && Intrinsics.areEqual(this.emailInput, emailUpdateViewState.emailInput);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isConsentedToDisclosure) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Either<String, Throwable>> uiEvent = this.submitEmailSuccessOrErrorEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Tuples2<UUID, Boolean>> uiEvent2 = this.verificationWorkflowEvent;
        return ((iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + this.emailInput.hashCode();
    }

    public String toString() {
        return "EmailUpdateViewState(isConsentedToDisclosure=" + this.isConsentedToDisclosure + ", isLoading=" + this.isLoading + ", submitEmailSuccessOrErrorEvent=" + this.submitEmailSuccessOrErrorEvent + ", verificationWorkflowEvent=" + this.verificationWorkflowEvent + ", emailInput=" + this.emailInput + ")";
    }

    public EmailUpdateViewState(boolean z, boolean z2, UiEvent<Either<String, Throwable>> uiEvent, UiEvent<Tuples2<UUID, Boolean>> uiEvent2, String emailInput) {
        Intrinsics.checkNotNullParameter(emailInput, "emailInput");
        this.isConsentedToDisclosure = z;
        this.isLoading = z2;
        this.submitEmailSuccessOrErrorEvent = uiEvent;
        this.verificationWorkflowEvent = uiEvent2;
        this.emailInput = emailInput;
        this.isInputValid = Validation.INSTANCE.isEmailValid(emailInput);
    }

    public final boolean isConsentedToDisclosure() {
        return this.isConsentedToDisclosure;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Either<String, Throwable>> getSubmitEmailSuccessOrErrorEvent() {
        return this.submitEmailSuccessOrErrorEvent;
    }

    public final UiEvent<Tuples2<UUID, Boolean>> getVerificationWorkflowEvent() {
        return this.verificationWorkflowEvent;
    }

    public /* synthetic */ EmailUpdateViewState(boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2, (i & 16) != 0 ? "" : str);
    }

    public final String getEmailInput() {
        return this.emailInput;
    }

    /* renamed from: isInputValid, reason: from getter */
    public final boolean getIsInputValid() {
        return this.isInputValid;
    }
}
