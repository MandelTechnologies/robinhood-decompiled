package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationViewState;", "", "email", "", "showRevealFullEmailCta", "", "updatingInputOption", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;)V", "getEmail", "()Ljava/lang/String;", "getShowRevealFullEmailCta", "()Z", "getUpdatingInputOption", "()Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;", "isSendingUserInput", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmailConfirmationViewState {
    public static final int $stable = 0;
    private final String email;
    private final boolean isSendingUserInput;
    private final boolean showRevealFullEmailCta;
    private final EmailConfirmationInputOption updatingInputOption;

    public static /* synthetic */ EmailConfirmationViewState copy$default(EmailConfirmationViewState emailConfirmationViewState, String str, boolean z, EmailConfirmationInputOption emailConfirmationInputOption, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailConfirmationViewState.email;
        }
        if ((i & 2) != 0) {
            z = emailConfirmationViewState.showRevealFullEmailCta;
        }
        if ((i & 4) != 0) {
            emailConfirmationInputOption = emailConfirmationViewState.updatingInputOption;
        }
        return emailConfirmationViewState.copy(str, z, emailConfirmationInputOption);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowRevealFullEmailCta() {
        return this.showRevealFullEmailCta;
    }

    /* renamed from: component3, reason: from getter */
    public final EmailConfirmationInputOption getUpdatingInputOption() {
        return this.updatingInputOption;
    }

    public final EmailConfirmationViewState copy(String email, boolean showRevealFullEmailCta, EmailConfirmationInputOption updatingInputOption) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new EmailConfirmationViewState(email, showRevealFullEmailCta, updatingInputOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailConfirmationViewState)) {
            return false;
        }
        EmailConfirmationViewState emailConfirmationViewState = (EmailConfirmationViewState) other;
        return Intrinsics.areEqual(this.email, emailConfirmationViewState.email) && this.showRevealFullEmailCta == emailConfirmationViewState.showRevealFullEmailCta && this.updatingInputOption == emailConfirmationViewState.updatingInputOption;
    }

    public int hashCode() {
        int iHashCode = ((this.email.hashCode() * 31) + Boolean.hashCode(this.showRevealFullEmailCta)) * 31;
        EmailConfirmationInputOption emailConfirmationInputOption = this.updatingInputOption;
        return iHashCode + (emailConfirmationInputOption == null ? 0 : emailConfirmationInputOption.hashCode());
    }

    public String toString() {
        return "EmailConfirmationViewState(email=" + this.email + ", showRevealFullEmailCta=" + this.showRevealFullEmailCta + ", updatingInputOption=" + this.updatingInputOption + ")";
    }

    public EmailConfirmationViewState(String email, boolean z, EmailConfirmationInputOption emailConfirmationInputOption) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
        this.showRevealFullEmailCta = z;
        this.updatingInputOption = emailConfirmationInputOption;
        this.isSendingUserInput = emailConfirmationInputOption != null;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getShowRevealFullEmailCta() {
        return this.showRevealFullEmailCta;
    }

    public final EmailConfirmationInputOption getUpdatingInputOption() {
        return this.updatingInputOption;
    }

    /* renamed from: isSendingUserInput, reason: from getter */
    public final boolean getIsSendingUserInput() {
        return this.isSendingUserInput;
    }
}
