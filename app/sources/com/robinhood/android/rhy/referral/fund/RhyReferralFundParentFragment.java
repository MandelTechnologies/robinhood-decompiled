package com.robinhood.android.rhy.referral.fund;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.referral.fund.celebration.RhyReferralFundCelebrationFragment;
import com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationFragment;
import com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectFragment;
import com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferContract;
import com.robinhood.android.transfers.contracts.TransferResult;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RhyReferralFundParentFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\t\u0010#\u001a\u00020$H\u0096\u0001R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000e0\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/RhyReferralFundParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectFragment$Callbacks;", "Lcom/robinhood/android/rhy/referral/fund/celebration/RhyReferralFundCelebrationFragment$Callbacks;", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashFragment$Callbacks;", "<init>", "()V", "transferFundsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/Transfer;", "kotlin.jvm.PlatformType", "createIavLauncher", "Landroid/content/Intent;", "<set-?>", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "pendingTransferConfiguration", "getPendingTransferConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "setPendingTransferConfiguration", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "pendingTransferConfiguration$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onTransferFundingAmountClicked", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "onTransferAddFundingSource", "onCelebrationDone", "onTransferSkipClicked", "onClickContinue", "onIneligibleToFund", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralFundParentFragment extends BaseFragment implements RegionGated, RhyReferralFundSelectFragment.Callbacks, RhyReferralFundCelebrationFragment.Callbacks, RhyReferralFundSplashFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyReferralFundParentFragment.class, "pendingTransferConfiguration", "getPendingTransferConfiguration()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", 0))};
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final ActivityResultLauncher<Intent> createIavLauncher;

    /* renamed from: pendingTransferConfiguration$delegate, reason: from kotlin metadata */
    private final Interfaces3 pendingTransferConfiguration;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> transferFundsLauncher;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RhyReferralFundParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TransferContract(new Function0() { // from class: com.robinhood.android.rhy.referral.fund.RhyReferralFundParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.rhy.referral.fund.RhyReferralFundParentFragment$transferFundsLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransferResult transferResult) {
                if (transferResult instanceof TransferResult.Completed) {
                    this.this$0.replaceFragment(new RhyReferralFundCelebrationFragment());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.transferFundsLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.rhy.referral.fund.RhyReferralFundParentFragment$createIavLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                TransferConfiguration pendingTransferConfiguration;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() != -1 || (pendingTransferConfiguration = this.this$0.getPendingTransferConfiguration()) == null) {
                    return;
                }
                this.this$0.onTransferFundingAmountClicked(pendingTransferConfiguration);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.createIavLauncher = activityResultLauncherRegisterForActivityResult2;
        this.pendingTransferConfiguration = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferConfiguration getPendingTransferConfiguration() {
        return (TransferConfiguration) this.pendingTransferConfiguration.getValue(this, $$delegatedProperties[0]);
    }

    private final void setPendingTransferConfiguration(TransferConfiguration transferConfiguration) {
        this.pendingTransferConfiguration.setValue(this, $$delegatedProperties[0], transferConfiguration);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, new RhyReferralFundSplashFragment());
        }
    }

    @Override // com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectFragment.Callbacks
    public void onTransferFundingAmountClicked(TransferConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        NavigationActivityResultContract3.launch$default(this.transferFundsLauncher, new Transfer(configuration), null, false, 6, null);
    }

    @Override // com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectFragment.Callbacks
    public void onTransferAddFundingSource(TransferConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        setPendingTransferConfiguration(configuration);
        ActivityResultLauncher<Intent> activityResultLauncher = this.createIavLauncher;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new CreateIavRelationshipIntentKey(IavSource.RHY_REFERRAL_ONBOARDING, TransferDirection.DEPOSIT, null, null, false, true, null, null, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null), null, false, 12, null));
    }

    @Override // com.robinhood.android.rhy.referral.fund.celebration.RhyReferralFundCelebrationFragment.Callbacks
    public void onCelebrationDone() {
        replaceFragment(new RhyReferralFundConfirmationFragment());
    }

    @Override // com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectFragment.Callbacks
    public void onTransferSkipClicked() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment.Callbacks
    public void onClickContinue() {
        replaceFragment(new RhyReferralFundSelectFragment());
    }

    @Override // com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment.Callbacks
    public void onIneligibleToFund() {
        Navigator navigator = getNavigator();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, fragmentActivityRequireActivity, new TabLinkIntentKey.McDuckling(null, false, null, 7, null), null, false, 12, null);
        intentCreateIntent$default.setFlags(268468224);
        startActivity(intentCreateIntent$default);
    }
}
