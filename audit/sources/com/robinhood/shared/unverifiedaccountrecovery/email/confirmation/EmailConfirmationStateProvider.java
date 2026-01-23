package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailConfirmationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDataState;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationViewState;", "<init>", "()V", "reduce", "dataState", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationStateProvider implements StateProvider<EmailConfirmationDataState, EmailConfirmationViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EmailConfirmationViewState reduce(EmailConfirmationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EmailConfirmationFragmentKey args = dataState.getArgs();
        if (args instanceof EmailConfirmationFragmentKey.ObfuscatedEmailV3) {
            return new EmailConfirmationViewState(((UserViewStatePageContext.ObfuscatedEmailV3) ((EmailConfirmationFragmentKey.ObfuscatedEmailV3) args).getUserViewState().getTypeContext()).getContext().getObfuscatedEmail(), true, dataState.getUpdatingInputOption());
        }
        if (!(args instanceof EmailConfirmationFragmentKey.ShowFullEmailV3)) {
            throw new NoWhenBranchMatchedException();
        }
        return new EmailConfirmationViewState(((UserViewStatePageContext.ShowFullEmailV3) ((EmailConfirmationFragmentKey.ShowFullEmailV3) args).getUserViewState().getTypeContext()).getContext().getFullEmail(), false, dataState.getUpdatingInputOption());
    }
}
