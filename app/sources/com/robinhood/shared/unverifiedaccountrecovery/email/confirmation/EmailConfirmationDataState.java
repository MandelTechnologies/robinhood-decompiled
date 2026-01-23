package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailConfirmationDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDataState;", "", "args", "Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey;", "updatingInputOption", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;", "<init>", "(Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey;Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;)V", "getArgs", "()Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey;", "getUpdatingInputOption", "()Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmailConfirmationDataState {
    public static final int $stable = 8;
    private final EmailConfirmationFragmentKey args;
    private final EmailConfirmationInputOption updatingInputOption;

    public static /* synthetic */ EmailConfirmationDataState copy$default(EmailConfirmationDataState emailConfirmationDataState, EmailConfirmationFragmentKey emailConfirmationFragmentKey, EmailConfirmationInputOption emailConfirmationInputOption, int i, Object obj) {
        if ((i & 1) != 0) {
            emailConfirmationFragmentKey = emailConfirmationDataState.args;
        }
        if ((i & 2) != 0) {
            emailConfirmationInputOption = emailConfirmationDataState.updatingInputOption;
        }
        return emailConfirmationDataState.copy(emailConfirmationFragmentKey, emailConfirmationInputOption);
    }

    /* renamed from: component1, reason: from getter */
    public final EmailConfirmationFragmentKey getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final EmailConfirmationInputOption getUpdatingInputOption() {
        return this.updatingInputOption;
    }

    public final EmailConfirmationDataState copy(EmailConfirmationFragmentKey args, EmailConfirmationInputOption updatingInputOption) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new EmailConfirmationDataState(args, updatingInputOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailConfirmationDataState)) {
            return false;
        }
        EmailConfirmationDataState emailConfirmationDataState = (EmailConfirmationDataState) other;
        return Intrinsics.areEqual(this.args, emailConfirmationDataState.args) && this.updatingInputOption == emailConfirmationDataState.updatingInputOption;
    }

    public int hashCode() {
        int iHashCode = this.args.hashCode() * 31;
        EmailConfirmationInputOption emailConfirmationInputOption = this.updatingInputOption;
        return iHashCode + (emailConfirmationInputOption == null ? 0 : emailConfirmationInputOption.hashCode());
    }

    public String toString() {
        return "EmailConfirmationDataState(args=" + this.args + ", updatingInputOption=" + this.updatingInputOption + ")";
    }

    public EmailConfirmationDataState(EmailConfirmationFragmentKey args, EmailConfirmationInputOption emailConfirmationInputOption) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.args = args;
        this.updatingInputOption = emailConfirmationInputOption;
    }

    public final EmailConfirmationFragmentKey getArgs() {
        return this.args;
    }

    public final EmailConfirmationInputOption getUpdatingInputOption() {
        return this.updatingInputOption;
    }
}
