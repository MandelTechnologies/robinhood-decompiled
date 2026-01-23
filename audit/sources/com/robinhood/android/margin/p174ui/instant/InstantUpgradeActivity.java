package com.robinhood.android.margin.p174ui.instant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeAgreementFragment;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementAgreementFragment;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementSplashFragment;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeSplashFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.InstantDepositRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: InstantUpgradeActivity.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u00015B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001fH\u0016J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0016H\u0016J\b\u0010,\u001a\u00020\u001fH\u0016J\b\u0010-\u001a\u00020\u001fH\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J\t\u0010/\u001a\u00020(H\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashFragment$Callbacks;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$Callbacks;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeAgreementFragment$Callbacks;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementFragment$Callbacks;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "<set-?>", "", "accountNumberUrl", "getAccountNumberUrl", "()Ljava/lang/String;", "setAccountNumberUrl", "(Ljava/lang/String;)V", "accountNumberUrl$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "displaySplashScreen", "isRetirementAccount", "", "onUpgradeNowClicked", "onLearnMoreClicked", "referralUrl", "onActivateClicked", "onNoThanksClicked", "onAgreementAccepted", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class InstantUpgradeActivity extends BaseActivity implements RegionGated, InstantUpgradeSplashFragment.Callbacks, InstantUpgradeRetirementSplashFragment.Callbacks, InstantUpgradeAgreementFragment.Callbacks, InstantUpgradeRetirementAgreementFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: accountNumberUrl$delegate, reason: from kotlin metadata */
    private final Interfaces3 accountNumberUrl;
    public AccountProvider accountProvider;
    public AnalyticsLogger analytics;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(InstantUpgradeActivity.class, "accountNumberUrl", "getAccountNumberUrl()Ljava/lang/String;", 0))};

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

    public InstantUpgradeActivity() {
        super(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        this.$$delegate_0 = new RegionGated2(InstantDepositRegionGate.INSTANCE);
        this.accountNumberUrl = BindSavedState2.savedString(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final String getAccountNumberUrl() {
        return (String) this.accountNumberUrl.getValue(this, $$delegatedProperties[0]);
    }

    private final void setAccountNumberUrl(String str) {
        this.accountNumberUrl.setValue(this, $$delegatedProperties[0], str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(final Bundle savedInstanceState) {
        Observable<Account> observableStreamIndividualAccount;
        super.onCreate(savedInstanceState);
        LottieUrl.INSTANT_BOLT.prefetch(this);
        String accountNumber = ((LegacyIntentKey.InstantUpgrade) INSTANCE.getExtras((Activity) this)).getAccountNumber();
        if (accountNumber != null) {
            observableStreamIndividualAccount = getAccountProvider().streamAccount(accountNumber);
        } else {
            observableStreamIndividualAccount = getAccountProvider().streamIndividualAccount();
        }
        Observable<Account> observableTake = observableStreamIndividualAccount.take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeActivity.onCreate$lambda$0(this.f$0, savedInstanceState, (Account) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(InstantUpgradeActivity instantUpgradeActivity, Bundle bundle, Account account) {
        instantUpgradeActivity.setAccountNumberUrl(account.getUrl());
        if (account.isMargin()) {
            instantUpgradeActivity.finish();
        }
        boolean z = account.getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH || account.getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL;
        if (bundle == null) {
            instantUpgradeActivity.displaySplashScreen(z);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFragment() instanceof InstantUpgradeConfirmationFragment) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    private final void displaySplashScreen(boolean isRetirementAccount) {
        Fragment fragmentNewInstance;
        if (isRetirementAccount) {
            fragmentNewInstance = InstantUpgradeRetirementSplashFragment.INSTANCE.newInstance();
        } else {
            fragmentNewInstance = InstantUpgradeSplashFragment.INSTANCE.newInstance();
        }
        setFragment(C11048R.id.fragment_container, fragmentNewInstance);
    }

    @Override // com.robinhood.android.margin.ui.instant.InstantUpgradeSplashFragment.Callbacks
    public void onUpgradeNowClicked() {
        replaceFragment(InstantUpgradeAgreementFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.margin.ui.instant.InstantUpgradeSplashFragment.Callbacks
    public void onLearnMoreClicked(String referralUrl) {
        Intrinsics.checkNotNullParameter(referralUrl, "referralUrl");
        replaceFragment(InstantUpgradeInfoFragment.INSTANCE.newInstance(referralUrl));
    }

    @Override // com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment.Callbacks
    public void onActivateClicked() {
        replaceFragment(InstantUpgradeRetirementAgreementFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment.Callbacks
    public void onNoThanksClicked() {
        finish();
    }

    @Override // com.robinhood.android.margin.ui.instant.InstantUpgradeAgreementFragment.Callbacks, com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementFragment.Callbacks
    public void onAgreementAccepted() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_ROBINHOOD_INSTANT, AnalyticsStrings.BUTTON_UPGRADE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        replaceFragment(InstantUpgradeConfirmationFragment.INSTANCE.newInstance(getAccountNumberUrl()));
    }

    /* compiled from: InstantUpgradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$InstantUpgrade;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<InstantUpgradeActivity, LegacyIntentKey.InstantUpgrade> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.InstantUpgrade getExtras(InstantUpgradeActivity instantUpgradeActivity) {
            return (LegacyIntentKey.InstantUpgrade) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, instantUpgradeActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.InstantUpgrade instantUpgrade) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, instantUpgrade);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.InstantUpgrade instantUpgrade) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, instantUpgrade);
        }
    }
}
