package com.robinhood.android.referral.rewardclaims;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.referral.contracts.RewardClaim;
import com.robinhood.android.referral.rewardclaims.RewardClaimingFragment;
import com.robinhood.android.referral.rewardclaims.RewardLoadingFragment;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardClaimingActivity.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardclaims/RewardClaimingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/referral/rewardclaims/RewardLoadingFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRewardInfoLoaded", "rewardInfo", "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RewardClaimingActivity extends BaseActivity implements RewardLoadingFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public RewardClaimingActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            RewardLoadingFragment.Companion companion = RewardLoadingFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new RewardLoadingFragment.Args(((RewardClaim) companion2.getExtras((Activity) this)).getRewardType(), ((RewardClaim) companion2.getExtras((Activity) this)).getRewardId())));
        }
    }

    @Override // com.robinhood.android.referral.rewardclaims.RewardLoadingFragment.Callbacks
    public void onRewardInfoLoaded(UiRewardCertificateInfo rewardInfo) {
        Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
        RewardClaimingFragment.Companion companion = RewardClaimingFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new RewardClaimingFragment.Args(((RewardClaim) companion2.getExtras((Activity) this)).getRewardType(), ((RewardClaim) companion2.getExtras((Activity) this)).getRewardId(), rewardInfo)));
    }

    /* compiled from: RewardClaimingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardclaims/RewardClaimingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/referral/rewardclaims/RewardClaimingActivity;", "Lcom/robinhood/android/referral/contracts/RewardClaim;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RewardClaimingActivity, RewardClaim> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RewardClaim getExtras(RewardClaimingActivity rewardClaimingActivity) {
            return (RewardClaim) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, rewardClaimingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RewardClaim rewardClaim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, rewardClaim);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RewardClaim rewardClaim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, rewardClaim);
        }
    }
}
