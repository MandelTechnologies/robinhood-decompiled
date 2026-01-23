package com.robinhood.android.challenge.verification.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.challenge.verification.ChallengeVerificationDataState;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogInfo;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.utils.data.LogoutType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultPositiveButtonClickDelegate.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/dialog/DefaultPositiveButtonClickDelegate;", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper$PositiveButtonClickDelegate;", "fragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lcom/robinhood/android/common/ui/BaseFragment;Lcom/robinhood/android/common/cx/SupportEmailHandler;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/navigation/Navigator;)V", "getFragment", "()Lcom/robinhood/android/common/ui/BaseFragment;", "getSupportEmailHandler", "()Lcom/robinhood/android/common/cx/SupportEmailHandler;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "onTimeoutPositiveButtonClick", "", "passthroughArgs", "Landroid/os/Bundle;", "onAttemptsExhaustedPositiveButtonClick", "onUarLogoutConfirmationPositiveButtonClick", "sendEmail", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPositiveButtonClickDelegate implements ChallengeDialogHelper.PositiveButtonClickDelegate {
    public static final int $stable = 8;
    private final AuthManager authManager;
    private final BaseFragment fragment;
    private final Navigator navigator;
    private final SupportEmailHandler supportEmailHandler;

    public DefaultPositiveButtonClickDelegate(BaseFragment fragment, SupportEmailHandler supportEmailHandler, AuthManager authManager, Navigator navigator) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.fragment = fragment;
        this.supportEmailHandler = supportEmailHandler;
        this.authManager = authManager;
        this.navigator = navigator;
    }

    public final BaseFragment getFragment() {
        return this.fragment;
    }

    public final SupportEmailHandler getSupportEmailHandler() {
        return this.supportEmailHandler;
    }

    public final AuthManager getAuthManager() {
        return this.authManager;
    }

    public final Navigator getNavigator() {
        return this.navigator;
    }

    @Override // com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper.PositiveButtonClickDelegate
    public void onTimeoutPositiveButtonClick(Bundle passthroughArgs) {
        this.fragment.requireActivity().finish();
    }

    @Override // com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper.PositiveButtonClickDelegate
    public void onAttemptsExhaustedPositiveButtonClick(Bundle passthroughArgs) {
        sendEmail(this.fragment);
        this.fragment.requireActivity().finish();
    }

    @Override // com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper.PositiveButtonClickDelegate
    public void onUarLogoutConfirmationPositiveButtonClick(Bundle passthroughArgs) {
        Intrinsics.checkNotNull(passthroughArgs);
        Parcelable parcelable = passthroughArgs.getParcelable(ChallengeVerificationDataState.DIALOG_PASSTHROUGH_BUNDLE);
        Intrinsics.checkNotNull(parcelable);
        ChallengeDialogInfo.StartUar startUar = (ChallengeDialogInfo.StartUar) parcelable;
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AuthManager.DefaultImpls.initiateLogout$default(this.authManager, contextRequireContext, LogoutType.OTHER, null, false, CollectionsKt.listOf((Object[]) new Intent[]{Navigator.DefaultImpls.createIntent$default(this.navigator, contextRequireContext, new Login(startUar.getUsername(), null, false, 6, null), null, false, 12, null), Navigator.DefaultImpls.createIntentForFragment$default(this.navigator, contextRequireContext, new ContactSupportFragmentKey.Uar(startUar.getUsername(), startUar.getChallengeType(), this.fragment.getScreenName()), false, false, false, null, false, true, false, false, false, null, false, 7028, null)}), "uar_logout_confirmation", 12, null);
    }

    private final void sendEmail(BaseFragment fragment) {
        if (this.authManager.isLoggedIn()) {
            SupportEmailHandler supportEmailHandler = this.supportEmailHandler;
            Context contextRequireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            fragment.startActivity(SupportEmailHandler.getPathfinderEmailIntent$default(supportEmailHandler, contextRequireContext, null, 2, null));
            return;
        }
        SupportEmailHandler supportEmailHandler2 = this.supportEmailHandler;
        Context contextRequireContext2 = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        SupportEmailHandler.handleExternalSupportLink$default(supportEmailHandler2, contextRequireContext2, null, 2, null);
    }
}
