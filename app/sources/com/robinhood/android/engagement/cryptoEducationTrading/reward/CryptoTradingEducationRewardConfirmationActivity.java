package com.robinhood.android.engagement.cryptoEducationTrading.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.referral.contracts.CryptoLearnAndEarnRewardsClaimIntentKey;
import com.robinhood.android.referral.contracts.FractionalRewardClaim;
import com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradingEducationRewardConfirmationActivity.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationLoadingFragment$Callbacks;", "Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRewardClaimed", "result", "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "upsellAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onClaimFlowFinished", "Companion", "feature-crypto-education-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CryptoTradingEducationRewardConfirmationActivity extends BaseActivity implements CryptoTradingEducationRewardConfirmationLoadingFragment.Callbacks, FractionalRewardClaimConfirmationFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public CryptoTradingEducationRewardConfirmationActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initEdgeToEdge(true);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            CryptoTradingEducationRewardConfirmationLoadingFragment.Companion companion = CryptoTradingEducationRewardConfirmationLoadingFragment.INSTANCE;
            String source = ((CryptoLearnAndEarnRewardsClaimIntentKey) INSTANCE.getExtras((Activity) this)).getSource();
            if (source == null) {
                source = "unknown";
            }
            setFragment(i, companion.newInstance((Parcelable) new CryptoTradingEducationRewardConfirmationLoadingFragment.Args(source)));
        }
    }

    @Override // com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingFragment.Callbacks
    public void onRewardClaimed(UiRewardCertificateInfo result, GenericAlertContent<? extends GenericAction> upsellAlertContent) {
        Intrinsics.checkNotNullParameter(result, "result");
        new ReplaceFragmentBuilder((FractionalRewardClaimConfirmationFragment) FractionalRewardClaimConfirmationFragment.INSTANCE.newInstance((Parcelable) new FractionalRewardClaimConfirmationFragment.Args(result, upsellAlertContent, Color.JET))).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    @Override // com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment.Callbacks
    public void onClaimFlowFinished(GenericAlertContent<? extends GenericAction> upsellAlertContent) {
        setResult(-1, new Intent().putExtra(FractionalRewardClaim.INTENT_DATA_SHOWN_REFERRAL_DIALOG, true));
        finish();
    }

    /* compiled from: CryptoTradingEducationRewardConfirmationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationActivity;", "Lcom/robinhood/android/referral/contracts/CryptoLearnAndEarnRewardsClaimIntentKey;", "<init>", "()V", "feature-crypto-education-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CryptoTradingEducationRewardConfirmationActivity, CryptoLearnAndEarnRewardsClaimIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CryptoLearnAndEarnRewardsClaimIntentKey getExtras(CryptoTradingEducationRewardConfirmationActivity cryptoTradingEducationRewardConfirmationActivity) {
            return (CryptoLearnAndEarnRewardsClaimIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, cryptoTradingEducationRewardConfirmationActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoLearnAndEarnRewardsClaimIntentKey cryptoLearnAndEarnRewardsClaimIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, cryptoLearnAndEarnRewardsClaimIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CryptoLearnAndEarnRewardsClaimIntentKey cryptoLearnAndEarnRewardsClaimIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, cryptoLearnAndEarnRewardsClaimIntentKey);
        }
    }
}
