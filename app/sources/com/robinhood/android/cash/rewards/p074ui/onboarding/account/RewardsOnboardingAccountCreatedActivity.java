package com.robinhood.android.cash.rewards.p074ui.onboarding.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.onboarding.account.RewardsOnboardingAccountApprovedFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.account.RewardsOnboardingApplicationSubmittingFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardsOnboardingAccountCreatedActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindViewState", "state", "Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedViewState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOnboardingAccountCreatedActivity extends BaseActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

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

    public RewardsOnboardingAccountCreatedActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RewardsOnboardingAccountCreatedDuxo.class);
    }

    private final RewardsOnboardingAccountCreatedDuxo getDuxo() {
        return (RewardsOnboardingAccountCreatedDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowHomeEnabled(false);
        }
        setFragment(C10176R.id.fragment_container, RewardsOnboardingApplicationSubmittingFragment.INSTANCE.newInstance((Parcelable) new RewardsOnboardingApplicationSubmittingFragment.Args(((LegacyIntentKey.RoundupRewardsAccountCreated) INSTANCE.getExtras((Activity) this)).getType())));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, getDuxo().getStates(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C102411(this));
    }

    /* compiled from: RewardsOnboardingAccountCreatedActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.account.RewardsOnboardingAccountCreatedActivity$onStart$1 */
    /* synthetic */ class C102411 extends FunctionReferenceImpl implements Function1<RewardsOnboardingAccountCreatedViewState, Unit> {
        C102411(Object obj) {
            super(1, obj, RewardsOnboardingAccountCreatedActivity.class, "bindViewState", "bindViewState(Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RewardsOnboardingAccountCreatedViewState rewardsOnboardingAccountCreatedViewState) {
            invoke2(rewardsOnboardingAccountCreatedViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RewardsOnboardingAccountCreatedViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RewardsOnboardingAccountCreatedActivity) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(RewardsOnboardingAccountCreatedViewState state) {
        Boolean boolConsume;
        Fragment fragmentNewInstance;
        UiEvent<Boolean> showBrokerageAccountCreatedFragmentUiEvent = state.getShowBrokerageAccountCreatedFragmentUiEvent();
        if (showBrokerageAccountCreatedFragmentUiEvent == null || (boolConsume = showBrokerageAccountCreatedFragmentUiEvent.consume()) == null) {
            return;
        }
        if (boolConsume.booleanValue()) {
            fragmentNewInstance = RewardsOnboardingAccountApprovedFragment.INSTANCE.newInstance((Parcelable) new RewardsOnboardingAccountApprovedFragment.Args(((LegacyIntentKey.RoundupRewardsAccountCreated) INSTANCE.getExtras((Activity) this)).getType()));
        } else {
            fragmentNewInstance = RewardsOnboardingAccountReviewFragment.INSTANCE.newInstance();
        }
        replaceFragment(fragmentNewInstance);
    }

    /* compiled from: RewardsOnboardingAccountCreatedActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RoundupRewardsAccountCreated;", "<init>", "()V", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RewardsOnboardingAccountCreatedActivity, LegacyIntentKey.RoundupRewardsAccountCreated> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.RoundupRewardsAccountCreated getExtras(RewardsOnboardingAccountCreatedActivity rewardsOnboardingAccountCreatedActivity) {
            return (LegacyIntentKey.RoundupRewardsAccountCreated) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, rewardsOnboardingAccountCreatedActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RoundupRewardsAccountCreated roundupRewardsAccountCreated) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, roundupRewardsAccountCreated);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.RoundupRewardsAccountCreated roundupRewardsAccountCreated) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, roundupRewardsAccountCreated);
        }
    }
}
