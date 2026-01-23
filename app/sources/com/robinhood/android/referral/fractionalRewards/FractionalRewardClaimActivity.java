package com.robinhood.android.referral.fractionalRewards;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.data.ReferralLaunchMode;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.referral.PostClaimUpsellDialogActivity;
import com.robinhood.android.referral.contracts.FractionalRewardClaim;
import com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressFragment;
import com.robinhood.android.referral.fractionalRewards.claimPreview.FractionalRewardClaimInfo;
import com.robinhood.android.referral.fractionalRewards.claimPreview.FractionalRewardClaimPreviewFragment;
import com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionFragment;
import com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadedState;
import com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment;
import com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoFragment;
import com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment;
import com.robinhood.models.p355ui.ClaimableInstrument;
import com.robinhood.models.p355ui.FractionalRewardInfo;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionalRewardClaimActivity.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001#B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0016J\u0018\u0010\"\u001a\u00020\r2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/FractionalRewardClaimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Callbacks;", "Lcom/robinhood/android/referral/fractionalRewards/rewardInfo/FractionalRewardInfoFragment$Callbacks;", "Lcom/robinhood/android/referral/fractionalRewards/instrumentSelection/FractionalRewardInstrumentSelectionFragment$Callbacks;", "Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewFragment$Callbacks;", "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressFragment$Callbacks;", "Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Callbacks;", "<init>", "()V", "shouldPromptForLockscreen", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRewardInfoLoaded", "viewState", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadedState;", "onActionButtonClicked", "onInstrumentSelectionConfirmed", "instrument", "Lcom/robinhood/models/ui/ClaimableInstrument;", "rewardInfo", "Lcom/robinhood/models/ui/FractionalRewardInfo;", "onClaimPreviewCompleted", "claimInfo", "Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimInfo;", "onRewardClaimed", "result", "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "upsellAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onClaimFlowFinished", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FractionalRewardClaimActivity extends BaseActivity implements FractionalRewardLoadingFragment.Callbacks, FractionalRewardInfoFragment.Callbacks, FractionalRewardInstrumentSelectionFragment.Callbacks, FractionalRewardClaimPreviewFragment.Callbacks, FractionalRewardClaimInProgressFragment.Callbacks, FractionalRewardClaimConfirmationFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public FractionalRewardClaimActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !((FractionalRewardClaim) INSTANCE.getExtras((Activity) this)).getIsFromRhfOnboarding();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, FractionalRewardLoadingFragment.INSTANCE.newInstance((Parcelable) new FractionalRewardLoadingFragment.Args(((FractionalRewardClaim) INSTANCE.getExtras((Activity) this)).getRewardId())));
        }
    }

    @Override // com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment.Callbacks
    public void onRewardInfoLoaded(FractionalRewardLoadedState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        replaceFragmentWithoutBackStack(FractionalRewardInfoFragment.INSTANCE.newInstance((Parcelable) viewState));
    }

    @Override // com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoFragment.Callbacks
    public void onActionButtonClicked(FractionalRewardLoadedState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        replaceFragment(FractionalRewardInstrumentSelectionFragment.INSTANCE.newInstance((Parcelable) new FractionalRewardInstrumentSelectionFragment.Args(viewState.getRewardInfo())));
    }

    @Override // com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionFragment.Callbacks
    public void onInstrumentSelectionConfirmed(ClaimableInstrument instrument, FractionalRewardInfo rewardInfo) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
        replaceFragment(FractionalRewardClaimPreviewFragment.INSTANCE.newInstance((Parcelable) new FractionalRewardClaimInfo(rewardInfo.getRewardId(), rewardInfo.getRewardAmount(), rewardInfo.getFormattedRewardAmount(), instrument.getId(), instrument.getName(), instrument.getMarketPrice())));
    }

    @Override // com.robinhood.android.referral.fractionalRewards.claimPreview.FractionalRewardClaimPreviewFragment.Callbacks
    public void onClaimPreviewCompleted(FractionalRewardClaimInfo claimInfo) {
        Intrinsics.checkNotNullParameter(claimInfo, "claimInfo");
        new ReplaceFragmentBuilder((FractionalRewardClaimInProgressFragment) FractionalRewardClaimInProgressFragment.INSTANCE.newInstance((Parcelable) new FractionalRewardClaimInProgressFragment.Args(claimInfo.getRewardId(), claimInfo.getInstrumentId()))).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    @Override // com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressFragment.Callbacks
    public void onRewardClaimed(UiRewardCertificateInfo result, GenericAlertContent<? extends GenericAction> upsellAlertContent) {
        Intrinsics.checkNotNullParameter(result, "result");
        new ReplaceFragmentBuilder((FractionalRewardClaimConfirmationFragment) FractionalRewardClaimConfirmationFragment.INSTANCE.newInstance((Parcelable) new FractionalRewardClaimConfirmationFragment.Args(result, upsellAlertContent, null, 4, null))).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    @Override // com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment.Callbacks
    public void onClaimFlowFinished(GenericAlertContent<? extends GenericAction> upsellAlertContent) {
        if (upsellAlertContent != null) {
            startActivity(PostClaimUpsellDialogActivity.INSTANCE.getIntentWithExtras((Context) this, (Parcelable) new PostClaimUpsellDialogActivity.Extras(ReferralLaunchMode.INSTANCE.normal(ReferralLaunchMode.SOURCE_POST_STOCK_CLAIM_PROMPT), upsellAlertContent)));
        }
        setResult(-1, new Intent().putExtra(FractionalRewardClaim.INTENT_DATA_SHOWN_REFERRAL_DIALOG, true));
        finish();
    }

    /* compiled from: FractionalRewardClaimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/FractionalRewardClaimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/referral/fractionalRewards/FractionalRewardClaimActivity;", "Lcom/robinhood/android/referral/contracts/FractionalRewardClaim;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<FractionalRewardClaimActivity, FractionalRewardClaim> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public FractionalRewardClaim getExtras(FractionalRewardClaimActivity fractionalRewardClaimActivity) {
            return (FractionalRewardClaim) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, fractionalRewardClaimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, FractionalRewardClaim fractionalRewardClaim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, fractionalRewardClaim);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, FractionalRewardClaim fractionalRewardClaim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, fractionalRewardClaim);
        }
    }
}
