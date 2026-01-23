package com.robinhood.android.challenge.verification.dialog;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChallengeDialogHelper.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper;", "", "<init>", "()V", "showDialog", "", "fragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "dialogInfo", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogInfo;", "onPositiveButtonClicked", "", "delegate", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper$PositiveButtonClickDelegate;", "id", "", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeButtonClicked", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper$NegativeButtonClickDelegate;", "PositiveButtonClickDelegate", "NegativeButtonClickDelegate", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChallengeDialogHelper {
    public static final int $stable = 0;

    /* compiled from: ChallengeDialogHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper$NegativeButtonClickDelegate;", "", "onAttemptsExhaustedNegativeButtonClick", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface NegativeButtonClickDelegate {
        void onAttemptsExhaustedNegativeButtonClick();
    }

    /* compiled from: ChallengeDialogHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper$PositiveButtonClickDelegate;", "", "onTimeoutPositiveButtonClick", "", "passthroughArgs", "Landroid/os/Bundle;", "onAttemptsExhaustedPositiveButtonClick", "onUarLogoutConfirmationPositiveButtonClick", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface PositiveButtonClickDelegate {
        void onAttemptsExhaustedPositiveButtonClick(Bundle passthroughArgs);

        void onTimeoutPositiveButtonClick(Bundle passthroughArgs);

        void onUarLogoutConfirmationPositiveButtonClick(Bundle passthroughArgs);
    }

    public final void showDialog(BaseFragment fragment, ChallengeDialogInfo dialogInfo) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(dialogInfo, "dialogInfo");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder title = companion.create(fragmentActivityRequireActivity).setTitle(dialogInfo.getTitle(), new Object[0]);
        StringResource message = dialogInfo.getMessage();
        Resources resources = fragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = title.setMessage(message.getText(resources)).setUseDesignSystemOverlay(true);
        if (dialogInfo.getId() != null) {
            useDesignSystemOverlay.setId(dialogInfo.getId().intValue());
        }
        if (dialogInfo.getPositiveButton() != null) {
            useDesignSystemOverlay.setPositiveButton(dialogInfo.getPositiveButton().intValue(), new Object[0]);
        }
        if (dialogInfo.getNegativeButton() != null) {
            useDesignSystemOverlay.setNegativeButton(dialogInfo.getNegativeButton().intValue(), new Object[0]);
        }
        if (dialogInfo.getTheme() != null) {
            useDesignSystemOverlay.setTheme(dialogInfo.getTheme().intValue());
            useDesignSystemOverlay.setUseDesignSystemOverlay(false);
        }
        Bundle passThroughArgs = dialogInfo.getPassThroughArgs();
        if (passThroughArgs != null) {
            useDesignSystemOverlay.setPassthroughArgs(passThroughArgs);
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, childFragmentManager, dialogInfo.getTag(), false, 4, null);
    }

    public final boolean onPositiveButtonClicked(PositiveButtonClickDelegate delegate, int id, Bundle passthroughArgs) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (id == C10497R.id.dialog_id_challenge_response_timeout) {
            delegate.onTimeoutPositiveButtonClick(passthroughArgs);
            return true;
        }
        if (id == C10497R.id.dialog_id_challenge_response_attempts_exhausted) {
            delegate.onAttemptsExhaustedPositiveButtonClick(passthroughArgs);
            return true;
        }
        if (id != C39076R.id.dialog_id_uar_log_out_confirm) {
            return false;
        }
        delegate.onUarLogoutConfirmationPositiveButtonClick(passthroughArgs);
        return true;
    }

    public final boolean onNegativeButtonClicked(NegativeButtonClickDelegate delegate, int id) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (id != C10497R.id.dialog_id_challenge_response_attempts_exhausted) {
            return false;
        }
        delegate.onAttemptsExhaustedNegativeButtonClick();
        return true;
    }
}
