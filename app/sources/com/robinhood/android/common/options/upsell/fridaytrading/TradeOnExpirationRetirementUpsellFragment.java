package com.robinhood.android.common.options.upsell.fridaytrading;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsetsSize4;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment;
import com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.OptionsEligibilityContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TradeOnExpirationRetirementUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002WXB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010M\u001a\u00020NH\u0016J\r\u0010O\u001a\u00020NH\u0017¢\u0006\u0002\u0010PJ\t\u0010Q\u001a\u00020%H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020+X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109R+\u0010=\u001a\u00020%2\u0006\u0010<\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b=\u0010'\"\u0004\b>\u0010?R+\u0010B\u001a\u00020%2\u0006\u0010<\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010A\u001a\u0004\bC\u0010'\"\u0004\bD\u0010?R#\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bI\u0010JR\u0018\u0010R\u001a\b\u0012\u0004\u0012\u00020T0SX\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Y²\u0006\n\u0010Z\u001a\u00020[X\u008a\u0084\u0002²\u0006\f\u0010\\\u001a\u0004\u0018\u00010HX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "getAccountDisplayNameStore", "()Lcom/robinhood/android/account/AccountDisplayNameStore;", "setAccountDisplayNameStore", "(Lcom/robinhood/android/account/AccountDisplayNameStore;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "getOptionSettingsStore", "()Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "setOptionSettingsStore", "(Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "screenName", "", "getScreenName", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "callbacks", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "isPrimaryButtonLoading", "setPrimaryButtonLoading", "(Z)V", "isPrimaryButtonLoading$delegate", "Landroidx/compose/runtime/MutableState;", "showDayTradeBullet", "getShowDayTradeBullet", "setShowDayTradeBullet", "showDayTradeBullet$delegate", "accountDisplayNameFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/account/strings/DisplayName;", "getAccountDisplayNameFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "accountDisplayNameFlow$delegate", "Lkotlin/Lazy;", "onStart", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-lib-options_externalDebug", "dividerOpacity", "", "displayNameState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TradeOnExpirationRetirementUpsellFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated {
    public AccountDisplayNameStore accountDisplayNameStore;
    public AccountProvider accountProvider;
    public AnalyticsLogger analytics;
    public ExperimentsStore experimentsStore;
    public OptionSettingsStore optionSettingsStore;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TradeOnExpirationRetirementUpsellFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;
    private final String screenName = TradeOnExpirationUpsellFragment.TRADE_ON_EXPIRATION_UPSELL_SCREEN_NAME;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(TradeOnExpirationUpsellFragment.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof TradeOnExpirationUpsellFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: isPrimaryButtonLoading$delegate, reason: from kotlin metadata */
    private final SnapshotState isPrimaryButtonLoading = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: showDayTradeBullet$delegate, reason: from kotlin metadata */
    private final SnapshotState showDayTradeBullet = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* renamed from: accountDisplayNameFlow$delegate, reason: from kotlin metadata */
    private final Lazy accountDisplayNameFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeOnExpirationRetirementUpsellFragment.accountDisplayNameFlow_delegate$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, int i, Composer composer, int i2) {
        tradeOnExpirationRetirementUpsellFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ComposeContent$lambda$3(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayName ComposeContent$lambda$5(SnapshotState4<DisplayName> snapshotState4) {
        return snapshotState4.getValue();
    }

    public final AccountDisplayNameStore getAccountDisplayNameStore() {
        AccountDisplayNameStore accountDisplayNameStore = this.accountDisplayNameStore;
        if (accountDisplayNameStore != null) {
            return accountDisplayNameStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountDisplayNameStore");
        return null;
    }

    public final void setAccountDisplayNameStore(AccountDisplayNameStore accountDisplayNameStore) {
        Intrinsics.checkNotNullParameter(accountDisplayNameStore, "<set-?>");
        this.accountDisplayNameStore = accountDisplayNameStore;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    /* compiled from: TradeOnExpirationRetirementUpsellFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$ComposeContent$2 */
    static final class C115002 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ long $backgroundColor;
        final /* synthetic */ SnapshotState4<DisplayName> $displayNameState$delegate;
        final /* synthetic */ SnapshotState4<Float> $dividerOpacity$delegate;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ TradeOnExpirationRetirementUpsellFragment this$0;

        C115002(ScrollState scrollState, TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, long j, SnapshotState4<DisplayName> snapshotState4, SnapshotState4<Float> snapshotState42) {
            this.$scrollState = scrollState;
            this.this$0 = tradeOnExpirationRetirementUpsellFragment;
            this.$backgroundColor = j;
            this.$displayNameState$delegate = snapshotState4;
            this.$dividerOpacity$delegate = snapshotState42;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            DisplayName.Variants withAccount;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1551737484, i, -1, "com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment.ComposeContent.<anonymous> (TradeOnExpirationRetirementUpsellFragment.kt:158)");
            }
            ScrollState scrollState = this.$scrollState;
            final TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment = this.this$0;
            long j = this.$backgroundColor;
            SnapshotState4<DisplayName> snapshotState4 = this.$displayNameState$delegate;
            SnapshotState4<Float> snapshotState42 = this.$dividerOpacity$delegate;
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            WindowInsets.Companion companion4 = WindowInsets.INSTANCE;
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(WindowInsetsSize4.windowInsetsTopHeight(modifierFillMaxWidth$default, WindowInsets_androidKt.getSafeContent(companion4, composer, 6)), j, null, 2, null), composer, 0);
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(300)), j, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ContentScale inside = ContentScale.INSTANCE.getInside();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            ImageKt.Image(PainterResources_androidKt.painterResource(C11303R.drawable.svg_trade_on_expiration_retirement, composer, 0), (String) null, Scale2.scale(boxScopeInstance.align(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM()), companion2.getCenter()), 2.0f), (Alignment) null, inside, 0.0f, (ColorFilter) null, composer, 24624, 104);
            composer.endNode();
            DisplayName displayNameComposeContent$lambda$5 = TradeOnExpirationRetirementUpsellFragment.ComposeContent$lambda$5(snapshotState4);
            StringResource inSentence = (displayNameComposeContent$lambda$5 == null || (withAccount = displayNameComposeContent$lambda$5.getWithAccount()) == null) ? null : withAccount.getInSentence();
            composer.startReplaceGroup(-87306735);
            CharSequence text = inSentence == null ? null : StringResources6.getText(inSentence, composer, StringResource.$stable);
            composer.endReplaceGroup();
            String string2 = text != null ? text.toString() : null;
            composer.startReplaceGroup(-87307956);
            if (string2 == null) {
                string2 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_default_account_name, composer, 0);
            }
            composer.endReplaceGroup();
            String to24HourTime$default = DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null);
            String to24HourTime$default2 = DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_title_with_account_info, new Object[]{string2}, composer, 0), PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_subtitle, new Object[]{to24HourTime$default}, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8188);
            String strStringResource = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_1, new Object[]{to24HourTime$default2}, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_1, new Object[]{to24HourTime$default}, composer, 0);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DOT_24;
            BentoValuePropRow2.Icon icon = new BentoValuePropRow2.Icon(serverToBentoAssetMapper2, null, 2, null);
            BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Center;
            int i3 = BentoValuePropRow2.Icon.$stable;
            BentoValuePropRow3.BentoValuePropRow(strStringResource, strStringResource2, icon, bentoValuePropRow, (Modifier) null, composer, (i3 << 6) | 3072, 16);
            composer.startReplaceGroup(-87244223);
            if (tradeOnExpirationRetirementUpsellFragment.getShowDayTradeBullet()) {
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_2, composer, 0), StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_2, composer, 0), new BentoValuePropRow2.Icon(serverToBentoAssetMapper2, null, 2, null), bentoValuePropRow, (Modifier) null, composer, (i3 << 6) | 3072, 16);
            }
            composer.endReplaceGroup();
            BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_3, composer, 0), StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_3, composer, 0), new BentoValuePropRow2.Icon(serverToBentoAssetMapper2, null, 2, null), bentoValuePropRow, (Modifier) null, composer, (i3 << 6) | 3072, 16);
            composer.endNode();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(Alpha.alpha(companion, TradeOnExpirationRetirementUpsellFragment.ComposeContent$lambda$3(snapshotState42)), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), 0.0f, composer, 0, 4);
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
            String strStringResource3 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_button_positive, composer, 0);
            boolean zIsPrimaryButtonLoading = tradeOnExpirationRetirementUpsellFragment.isPrimaryButtonLoading();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(tradeOnExpirationRetirementUpsellFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$ComposeContent$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeOnExpirationRetirementUpsellFragment.C115002.invoke$lambda$8$lambda$5$lambda$4(tradeOnExpirationRetirementUpsellFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource3, modifierM5143paddingVpY3zN4, null, null, false, zIsPrimaryButtonLoading, null, null, null, null, false, null, composer, 0, 0, 8120);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(tradeOnExpirationRetirementUpsellFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$ComposeContent$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeOnExpirationRetirementUpsellFragment.C115002.invoke$lambda$8$lambda$7$lambda$6(tradeOnExpirationRetirementUpsellFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_button_negative, composer, 0), WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(companion4, composer, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM())), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$5$lambda$4(final TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment) {
            Observable<String> observableJust;
            tradeOnExpirationRetirementUpsellFragment.setPrimaryButtonLoading(true);
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(tradeOnExpirationRetirementUpsellFragment.getAnalytics(), tradeOnExpirationRetirementUpsellFragment.getScreenName(), AnalyticsStrings.BUTTON_OPTION_UPGRADE_FRIDAY_TRADING_ENABLE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            String accountNumber = ((Args) TradeOnExpirationRetirementUpsellFragment.INSTANCE.getArgs((Fragment) tradeOnExpirationRetirementUpsellFragment)).getAccountNumber();
            if (accountNumber == null) {
                observableJust = tradeOnExpirationRetirementUpsellFragment.getAccountProvider().streamIndividualAccountNumber();
            } else {
                observableJust = Observable.just(accountNumber);
            }
            Completable completableSwitchMapCompletable = observableJust.switchMapCompletable(new Function() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$ComposeContent$2$1$2$1$1
                @Override // io.reactivex.functions.Function
                public final CompletableSource apply(String accountNumber2) {
                    Intrinsics.checkNotNullParameter(accountNumber2, "accountNumber");
                    return tradeOnExpirationRetirementUpsellFragment.getOptionSettingsStore().toggleFridayTradingCompletable(accountNumber2, true);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
            LifecycleHost.DefaultImpls.bind$default(tradeOnExpirationRetirementUpsellFragment, CompletablesAndroid.observeOnMainThread(completableSwitchMapCompletable), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$ComposeContent$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeOnExpirationRetirementUpsellFragment.C115002.invoke$lambda$8$lambda$5$lambda$4$lambda$2(tradeOnExpirationRetirementUpsellFragment);
                }
            }, new Function1() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$ComposeContent$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeOnExpirationRetirementUpsellFragment.C115002.invoke$lambda$8$lambda$5$lambda$4$lambda$3(tradeOnExpirationRetirementUpsellFragment, (Throwable) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$5$lambda$4$lambda$2(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment) {
            tradeOnExpirationRetirementUpsellFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_OPTION_UPGRADE_FRIDAY_TRADING_ENABLE_SUCCESS);
            tradeOnExpirationRetirementUpsellFragment.getCallbacks().onContinueTradeOnExpiration();
            tradeOnExpirationRetirementUpsellFragment.setPrimaryButtonLoading(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$5$lambda$4$lambda$3(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, Throwable throwable) {
            Throwable th;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            tradeOnExpirationRetirementUpsellFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_OPTION_UPGRADE_FRIDAY_TRADING_ENABLE_FAILURE);
            if (Throwables.isConnectivityException(throwable)) {
                th = throwable;
            } else {
                th = throwable;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            }
            AbsErrorHandler.handleError$default(tradeOnExpirationRetirementUpsellFragment.requireBaseActivity().getActivityErrorHandler(), th, false, 2, null);
            tradeOnExpirationRetirementUpsellFragment.setPrimaryButtonLoading(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(tradeOnExpirationRetirementUpsellFragment.getAnalytics(), tradeOnExpirationRetirementUpsellFragment.getScreenName(), AnalyticsStrings.BUTTON_OPTION_UPGRADE_FRIDAY_TRADING_DISABLE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            tradeOnExpirationRetirementUpsellFragment.getCallbacks().onContinueTradeOnExpiration();
            return Unit.INSTANCE;
        }
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
        return new UserInteractionEventData(null, eventScreen, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionsEligibilityContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionOnboardingContext(null, null, (refId == null || (string2 = refId.toString()) == null) ? "" : string2, null, 11, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1025, -1, -65, 16383, null), null, null, 109, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradeOnExpirationUpsellFragment.Callbacks getCallbacks() {
        return (TradeOnExpirationUpsellFragment.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPrimaryButtonLoading() {
        return ((Boolean) this.isPrimaryButtonLoading.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPrimaryButtonLoading(boolean z) {
        this.isPrimaryButtonLoading.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowDayTradeBullet() {
        return ((Boolean) this.showDayTradeBullet.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowDayTradeBullet(boolean z) {
        this.showDayTradeBullet.setValue(Boolean.valueOf(z));
    }

    private final StateFlow<DisplayName> getAccountDisplayNameFlow() {
        return (StateFlow) this.accountDisplayNameFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow accountDisplayNameFlow_delegate$lambda$0(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment) {
        AccountDisplayNameStore accountDisplayNameStore = tradeOnExpirationRetirementUpsellFragment.getAccountDisplayNameStore();
        String accountNumber = ((Args) INSTANCE.getArgs((Fragment) tradeOnExpirationRetirementUpsellFragment)).getAccountNumber();
        if (accountNumber == null) {
            accountNumber = "";
        }
        return accountDisplayNameStore.displayNameStateFlow(accountNumber, tradeOnExpirationRetirementUpsellFragment.getLifecycleScope());
    }

    /* compiled from: TradeOnExpirationRetirementUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$onStart$1", m3645f = "TradeOnExpirationRetirementUpsellFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$onStart$1 */
    static final class C115021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C115021(Continuation<? super C115021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeOnExpirationRetirementUpsellFragment.this.new C115021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(TradeOnExpirationRetirementUpsellFragment.this.getExperimentsStore(), new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TradeOnExpirationRetirementUpsellFragment.this, null);
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

        /* compiled from: TradeOnExpirationRetirementUpsellFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMember", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$onStart$1$1", m3645f = "TradeOnExpirationRetirementUpsellFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ TradeOnExpirationRetirementUpsellFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = tradeOnExpirationRetirementUpsellFragment;
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
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.setShowDayTradeBullet(!this.Z$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C115021(null), 3, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-272034657);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-272034657, i2, -1, "com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment.ComposeContent (TradeOnExpirationRetirementUpsellFragment.kt:132)");
            }
            SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            long jade = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJade();
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(TradeOnExpirationRetirementUpsellFragment.ComposeContent$lambda$2$lambda$1(scrollStateRememberScrollState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jade);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new TradeOnExpirationRetirementUpsellFragment2(systemUiControllerRememberSystemUiController, jade, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1551737484, true, new C115002(scrollStateRememberScrollState, this, jade, FlowExtKt.collectAsStateWithLifecycle(getAccountDisplayNameFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7), snapshotState4), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeOnExpirationRetirementUpsellFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ComposeContent$lambda$2$lambda$1(ScrollState scrollState) {
        return (scrollState.getValue() == scrollState.getMaxValue() || scrollState.getMaxValue() == Integer.MAX_VALUE) ? 0.0f : 1.0f;
    }

    /* compiled from: TradeOnExpirationRetirementUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "eligibilitySource", "refId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getEligibilitySource", "getRefId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String eligibilitySource;
        private final UUID refId;

        /* compiled from: TradeOnExpirationRetirementUpsellFragment.kt */
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

    /* compiled from: TradeOnExpirationRetirementUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment$Args;", "<init>", "()V", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TradeOnExpirationRetirementUpsellFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, tradeOnExpirationRetirementUpsellFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TradeOnExpirationRetirementUpsellFragment newInstance(Args args) {
            return (TradeOnExpirationRetirementUpsellFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, tradeOnExpirationRetirementUpsellFragment, args);
        }
    }
}
