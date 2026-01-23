package com.robinhood.android.cash.rewards.p074ui.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.notification.RewardsNotificationFirstTransactionFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContentLoadingFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.utils.extensions.Activity;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsNotificationFirstTransactionActivity.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J,\u0010\u0010\u001a\u00020\r2\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014`\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContentLoadingFragment$Callbacks;", "<init>", "()V", RewardsNotificationFirstTransactionActivity.EXTRA_TRANSACTION_ID, "Ljava/util/UUID;", "getTransactionId", "()Ljava/util/UUID;", "transactionId$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onLoadContentSuccess", "contentMap", "Ljava/util/HashMap;", "", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "Lkotlin/collections/HashMap;", "onLoadContentFailed", "throwable", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsNotificationFirstTransactionActivity extends BaseActivity implements RegionGated, RewardsOnboardingContentLoadingFragment.Callbacks {
    private static final String EXTRA_TRANSACTION_ID = "transactionId";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: transactionId$delegate, reason: from kotlin metadata */
    private final Lazy transactionId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RewardsNotificationFirstTransactionActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.transactionId = Activity.intentExtra(this, EXTRA_TRANSACTION_ID);
    }

    private final UUID getTransactionId() {
        return (UUID) this.transactionId.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C10176R.id.fragment_container, RewardsOnboardingContentLoadingFragment.INSTANCE.newInstance((Parcelable) new RewardsOnboardingContentLoadingFragment.Args(RewardsOnboardingContent.ContentfulType.FIRST_TRANSACTION)));
        }
    }

    @Override // com.robinhood.android.cash.rewards.ui.onboarding.content.RewardsOnboardingContentLoadingFragment.Callbacks
    public void onLoadContentSuccess(HashMap<String, RewardsOnboardingContent> contentMap) {
        Intrinsics.checkNotNullParameter(contentMap, "contentMap");
        RewardsOnboardingContent rewardsOnboardingContent = contentMap.get(RewardsOnboardingContent.FIRST_TRANSACTION_CONTENT_RHS);
        RewardsOnboardingContent rewardsOnboardingContent2 = contentMap.get(RewardsOnboardingContent.FIRST_TRANSACTION_CONTENT_RHC);
        RewardsNotificationFirstTransactionFragment.Companion companion = RewardsNotificationFirstTransactionFragment.INSTANCE;
        UUID transactionId = getTransactionId();
        Intrinsics.checkNotNull(rewardsOnboardingContent);
        Intrinsics.checkNotNull(rewardsOnboardingContent2);
        replaceFragmentWithoutAnimation(companion.newInstance((Parcelable) new RewardsNotificationFirstTransactionFragment.Args(transactionId, rewardsOnboardingContent, rewardsOnboardingContent2)));
    }

    @Override // com.robinhood.android.cash.rewards.ui.onboarding.content.RewardsOnboardingContentLoadingFragment.Callbacks
    public void onLoadContentFailed(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), throwable, false, 2, null);
    }

    /* compiled from: RewardsNotificationFirstTransactionActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsFirstTransaction;", "<init>", "()V", "EXTRA_TRANSACTION_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.RoundupRewardsFirstTransaction> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RoundupRewardsFirstTransaction key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) RewardsNotificationFirstTransactionActivity.class);
            intent.putExtra(RewardsNotificationFirstTransactionActivity.EXTRA_TRANSACTION_ID, key.getTransactionId());
            return intent;
        }
    }
}
