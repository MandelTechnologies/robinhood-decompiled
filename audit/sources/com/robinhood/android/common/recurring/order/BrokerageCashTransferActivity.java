package com.robinhood.android.common.recurring.order;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment;
import com.robinhood.android.common.recurring.trade.RecurringOrderFragment;
import com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrokerageCashTransferActivity.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/order/BrokerageCashTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Callbacks;", "<init>", "()V", "orderConfigurationRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "kotlin.jvm.PlatformType", "orderConfiguration", "isReviewing", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showOrderConfiguration", "showRecurringOrder", "onBackPressed", "startOrderConfigurationSelection", "accountNumber", "", "editRecurringOrder", "setRecurringOrderConfiguration", "onReviewingStateChanged", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BrokerageCashTransferActivity extends BaseActivity implements RecurringOrderParentFragment.Callbacks {
    private boolean isReviewing;
    private RecurringOrderConfiguration orderConfiguration;
    private final BehaviorRelay<RecurringOrderConfiguration> orderConfigurationRelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void editRecurringOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void startOrderConfigurationSelection(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    public BrokerageCashTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
        BehaviorRelay<RecurringOrderConfiguration> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.orderConfigurationRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            showRecurringOrder(((LegacyIntentKey.RecurringBrokerageCashTransfer) INSTANCE.getExtras((Activity) this)).getConfiguration());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(this.orderConfigurationRelay), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C116931(this));
    }

    /* compiled from: BrokerageCashTransferActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.order.BrokerageCashTransferActivity$onResume$1 */
    /* synthetic */ class C116931 extends FunctionReferenceImpl implements Function1<RecurringOrderConfiguration, Unit> {
        C116931(Object obj) {
            super(1, obj, BrokerageCashTransferActivity.class, "showOrderConfiguration", "showOrderConfiguration(Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderConfiguration recurringOrderConfiguration) {
            invoke2(recurringOrderConfiguration);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringOrderConfiguration p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BrokerageCashTransferActivity) this.receiver).showOrderConfiguration(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOrderConfiguration(RecurringOrderConfiguration orderConfiguration) {
        if (isStateSaved() || Intrinsics.areEqual(this.orderConfiguration, orderConfiguration)) {
            return;
        }
        this.orderConfiguration = orderConfiguration;
        showRecurringOrder(orderConfiguration);
    }

    private final void showRecurringOrder(RecurringOrderConfiguration orderConfiguration) {
        popEntireFragmentBackstack();
        setFragment(C11048R.id.fragment_container, (RecurringOrderParentFragment) RecurringOrderParentFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderParentFragment.Args(new InvestmentTarget(null, null, ApiAssetType.BROKERAGE_CASH), orderConfiguration, "BrokerageCashTransferActivity")));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        super.onBackPressed();
        Fragment currentFragment = getCurrentFragment();
        Fragment fragment = (currentFragment == null || (childFragmentManager = currentFragment.getChildFragmentManager()) == null || (fragments = childFragmentManager.getFragments()) == null) ? null : (Fragment) CollectionsKt.firstOrNull((List) fragments);
        if ((fragment instanceof RecurringOrderScheduleFragment) || (fragment instanceof RecurringOrderParentFragment) || (fragment instanceof RecurringOrderFragment) || (fragment instanceof RecurringCreationFlowParentFragment)) {
            if (this.isReviewing) {
                super.onBackPressed();
                return;
            } else {
                finish();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void setRecurringOrderConfiguration(RecurringOrderConfiguration orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        if (Intrinsics.areEqual(this.orderConfiguration, orderConfiguration)) {
            popEntireFragmentBackstack();
        } else {
            this.orderConfigurationRelay.accept(orderConfiguration);
        }
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void onReviewingStateChanged(boolean isReviewing) {
        this.isReviewing = isReviewing;
    }

    /* compiled from: BrokerageCashTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/order/BrokerageCashTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/common/recurring/order/BrokerageCashTransferActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RecurringBrokerageCashTransfer;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<BrokerageCashTransferActivity, LegacyIntentKey.RecurringBrokerageCashTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.RecurringBrokerageCashTransfer getExtras(BrokerageCashTransferActivity brokerageCashTransferActivity) {
            return (LegacyIntentKey.RecurringBrokerageCashTransfer) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, brokerageCashTransferActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RecurringBrokerageCashTransfer recurringBrokerageCashTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, recurringBrokerageCashTransfer);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.RecurringBrokerageCashTransfer recurringBrokerageCashTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, recurringBrokerageCashTransfer);
        }
    }
}
