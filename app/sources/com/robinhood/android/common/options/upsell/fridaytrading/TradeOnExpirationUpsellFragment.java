package com.robinhood.android.common.options.upsell.fridaytrading;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.databinding.FragmentTradeOnExpirationUpsellBinding;
import com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.OptionsEligibilityContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TradeOnExpirationUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003LMNB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020<H\u0016J\b\u0010>\u001a\u00020<H\u0016J\u001a\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u00020EH\u0016J\t\u0010F\u001a\u00020EH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u000206X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u000206X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseScrollableFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "getOptionSettingsStore", "()Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "setOptionSettingsStore", "(Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;)V", "bindings", "Lcom/robinhood/android/common/options/databinding/FragmentTradeOnExpirationUpsellBinding;", "getBindings", "()Lcom/robinhood/android/common/options/databinding/FragmentTradeOnExpirationUpsellBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "callbacks", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Callbacks;", "callbacks$delegate", "primaryButtonStringRes", "", "getPrimaryButtonStringRes", "()Ljava/lang/Integer;", "secondaryButtonStringRes", "getSecondaryButtonStringRes", "onResume", "", "onPrimaryBtnClicked", "onSecondaryBtnClicked", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TradeOnExpirationUpsellFragment extends BaseScrollableFragment implements AutoLoggableFragment, RegionGated {
    public static final String TRADE_ON_EXPIRATION_UPSELL_SCREEN_NAME = "options_upgrade_from_l0_trade_on_expiration_upsell";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AccountProvider accountProvider;
    public AnalyticsLogger analytics;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public ExperimentsStore experimentsStore;
    public OptionSettingsStore optionSettingsStore;
    private final int primaryButtonStringRes;
    private final String screenName;
    private final int secondaryButtonStringRes;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TradeOnExpirationUpsellFragment.class, "bindings", "getBindings()Lcom/robinhood/android/common/options/databinding/FragmentTradeOnExpirationUpsellBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TradeOnExpirationUpsellFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TradeOnExpirationUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Callbacks;", "", "onContinueTradeOnExpiration", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueTradeOnExpiration();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    public TradeOnExpirationUpsellFragment() {
        super(C11303R.layout.fragment_trade_on_expiration_upsell);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, TradeOnExpirationUpsellFragment2.INSTANCE);
        this.screenName = TRADE_ON_EXPIRATION_UPSELL_SCREEN_NAME;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof TradeOnExpirationUpsellFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.primaryButtonStringRes = C11303R.string.trade_on_expiration_upsell_button_positive;
        this.secondaryButtonStringRes = C11303R.string.trade_on_expiration_upsell_button_negative;
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final OptionSettingsStore getOptionSettingsStore() {
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore;
        if (optionSettingsStore != null) {
            return optionSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionSettingsStore");
        return null;
    }

    public final void setOptionSettingsStore(OptionSettingsStore optionSettingsStore) {
        Intrinsics.checkNotNullParameter(optionSettingsStore, "<set-?>");
        this.optionSettingsStore = optionSettingsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentTradeOnExpirationUpsellBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTradeOnExpirationUpsellBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.OPTION_ONBOARDING_UPSELL_TRADE_ON_EXPIRATION, null, getScreenName(), null, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        String string2;
        Screen eventScreen = getEventScreen();
        Companion companion = INSTANCE;
        String eligibilitySource = ((Args) companion.getArgs((Fragment) this)).getEligibilitySource();
        if (eligibilitySource == null) {
            eligibilitySource = "";
        }
        OptionsEligibilityContext optionsEligibilityContext = new OptionsEligibilityContext(eligibilitySource, null, 2, 0 == true ? 1 : 0);
        UUID refId = ((Args) companion.getArgs((Fragment) this)).getRefId();
        return new UserInteractionEventData(null, eventScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionsEligibilityContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionOnboardingContext(null, null, (refId == null || (string2 = refId.toString()) == null) ? "" : string2, null, 11, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1025, -1, -65, 16383, null), null, null, 109, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getPrimaryButtonStringRes() {
        return Integer.valueOf(this.primaryButtonStringRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getSecondaryButtonStringRes() {
        return Integer.valueOf(this.secondaryButtonStringRes);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String accountNumber = ((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        if (accountNumber != null) {
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getAccountProvider().streamAccount(accountNumber)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeOnExpirationUpsellFragment.onResume$lambda$0(this.f$0, (Account) obj);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C115052(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(TradeOnExpirationUpsellFragment tradeOnExpirationUpsellFragment, Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        RhTextView rhTextView = tradeOnExpirationUpsellFragment.getBindings().tradeOnExpirationTitle;
        Resources resources = tradeOnExpirationUpsellFragment.getResources();
        int i = C11303R.string.trade_on_expiration_upsell_title_with_account_info;
        StringResource inSentence = AccountDisplayNames.getDisplayName(account).getWithAccount().getInSentence();
        Resources resources2 = tradeOnExpirationUpsellFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView.setText(resources.getString(i, inSentence.getText(resources2)));
        return Unit.INSTANCE;
    }

    /* compiled from: TradeOnExpirationUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$onResume$2", m3645f = "TradeOnExpirationUpsellFragment.kt", m3646l = {102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$onResume$2 */
    static final class C115052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C115052(Continuation<? super C115052> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeOnExpirationUpsellFragment.this.new C115052(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(TradeOnExpirationUpsellFragment.this.getExperimentsStore(), new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TradeOnExpirationUpsellFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: TradeOnExpirationUpsellFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMember", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$onResume$2$1", m3645f = "TradeOnExpirationUpsellFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$onResume$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ TradeOnExpirationUpsellFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TradeOnExpirationUpsellFragment tradeOnExpirationUpsellFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = tradeOnExpirationUpsellFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    LinearLayout tradeOnExpirationRow2 = this.this$0.getBindings().tradeOnExpirationRow2;
                    Intrinsics.checkNotNullExpressionValue(tradeOnExpirationRow2, "tradeOnExpirationRow2");
                    tradeOnExpirationRow2.setVisibility(8);
                    this.this$0.getBindings().tradeOnExpirationIcon3.setText(this.this$0.getString(C11048R.string.general_label_two));
                } else {
                    LinearLayout tradeOnExpirationRow22 = this.this$0.getBindings().tradeOnExpirationRow2;
                    Intrinsics.checkNotNullExpressionValue(tradeOnExpirationRow22, "tradeOnExpirationRow2");
                    tradeOnExpirationRow22.setVisibility(0);
                    this.this$0.getBindings().tradeOnExpirationIcon3.setText(this.this$0.getString(C11048R.string.general_label_three));
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onPrimaryBtnClicked() {
        Observable<String> observableJust;
        getPrimaryBtn().setLoading(true);
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), getScreenName(), AnalyticsStrings.BUTTON_OPTION_UPGRADE_FRIDAY_TRADING_ENABLE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        String accountNumber = ((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        if (accountNumber == null) {
            observableJust = getAccountProvider().streamIndividualAccountNumber();
        } else {
            observableJust = Observable.just(accountNumber);
        }
        Completable completableSwitchMapCompletable = observableJust.switchMapCompletable(new Function() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment.onPrimaryBtnClicked.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(String accountNumber2) {
                Intrinsics.checkNotNullParameter(accountNumber2, "accountNumber");
                return TradeOnExpirationUpsellFragment.this.getOptionSettingsStore().toggleFridayTradingCompletable(accountNumber2, true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(completableSwitchMapCompletable), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeOnExpirationUpsellFragment.onPrimaryBtnClicked$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeOnExpirationUpsellFragment.onPrimaryBtnClicked$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPrimaryBtnClicked$lambda$1(TradeOnExpirationUpsellFragment tradeOnExpirationUpsellFragment) {
        tradeOnExpirationUpsellFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_OPTION_UPGRADE_FRIDAY_TRADING_ENABLE_SUCCESS);
        tradeOnExpirationUpsellFragment.getCallbacks().onContinueTradeOnExpiration();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPrimaryBtnClicked$lambda$2(TradeOnExpirationUpsellFragment tradeOnExpirationUpsellFragment, Throwable throwable) {
        Throwable th;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        tradeOnExpirationUpsellFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_OPTION_UPGRADE_FRIDAY_TRADING_ENABLE_FAILURE);
        if (Throwables.isConnectivityException(throwable)) {
            th = throwable;
        } else {
            th = throwable;
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
        }
        AbsErrorHandler.handleError$default(tradeOnExpirationUpsellFragment.requireBaseActivity().getActivityErrorHandler(), th, false, 2, null);
        tradeOnExpirationUpsellFragment.getPrimaryBtn().setLoading(false);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onSecondaryBtnClicked() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), getScreenName(), AnalyticsStrings.BUTTON_OPTION_UPGRADE_FRIDAY_TRADING_DISABLE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        getCallbacks().onContinueTradeOnExpiration();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int iM26675plusqWd6VVo;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (isInTabFragment()) {
            iM26675plusqWd6VVo = InsetSides.INSTANCE.m26683getTopXedK2Rk();
        } else {
            InsetSides.Companion companion = InsetSides.INSTANCE;
            iM26675plusqWd6VVo = InsetSides.m26675plusqWd6VVo(companion.m26683getTopXedK2Rk(), companion.m26679getBottomXedK2Rk());
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, iM26675plusqWd6VVo);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.FragmentContainerLayout.LayoutParams");
        ((FragmentContainerLayout.LayoutParams) layoutParams).setUnderneathToolbar(true);
        getBindings().tradeOnExpirationSubtitle.setText(getResources().getString(C11303R.string.trade_on_expiration_upsell_subtitle, "3:30 PM"));
        getBindings().tradeOnExpirationRow.setPrimaryText(getResources().getString(C11303R.string.trade_on_expiration_upsell_bullet_1, "4:00 PM"));
        getBindings().tradeOnExpirationRow.setSecondaryText(getResources().getString(C11303R.string.trade_on_expiration_upsell_body_1, "3:30 PM"));
    }

    /* compiled from: TradeOnExpirationUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "eligibilitySource", "refId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getEligibilitySource", "getRefId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String eligibilitySource;
        private final UUID refId;

        /* compiled from: TradeOnExpirationUpsellFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = args.eligibilitySource;
            }
            if ((i & 4) != 0) {
                uuid = args.refId;
            }
            return args.copy(str, str2, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEligibilitySource() {
            return this.eligibilitySource;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        public final Args copy(String accountNumber, String eligibilitySource, UUID refId) {
            return new Args(accountNumber, eligibilitySource, refId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.eligibilitySource, args.eligibilitySource) && Intrinsics.areEqual(this.refId, args.refId);
        }

        public int hashCode() {
            String str = this.accountNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.eligibilitySource;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UUID uuid = this.refId;
            return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", eligibilitySource=" + this.eligibilitySource + ", refId=" + this.refId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.eligibilitySource);
            dest.writeSerializable(this.refId);
        }

        public Args(String str, String str2, UUID uuid) {
            this.accountNumber = str;
            this.eligibilitySource = str2;
            this.refId = uuid;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getEligibilitySource() {
            return this.eligibilitySource;
        }

        public final UUID getRefId() {
            return this.refId;
        }
    }

    /* compiled from: TradeOnExpirationUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Args;", "<init>", "()V", "TRADE_ON_EXPIRATION_UPSELL_SCREEN_NAME", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TradeOnExpirationUpsellFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(TradeOnExpirationUpsellFragment tradeOnExpirationUpsellFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, tradeOnExpirationUpsellFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TradeOnExpirationUpsellFragment newInstance(Args args) {
            return (TradeOnExpirationUpsellFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TradeOnExpirationUpsellFragment tradeOnExpirationUpsellFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, tradeOnExpirationUpsellFragment, args);
        }
    }
}
