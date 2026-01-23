package com.robinhood.android.optionschain.sbschain;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.extensions.Instants2;
import com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteBottomSheetFragment;
import com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarHelper;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.lists.options.OptionsListsQuickAddFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionchain.OptionChainExpirationPageCallbacks;
import com.robinhood.android.options.contracts.InternalOptionChainFragmentKey;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.OptionChainActivity;
import com.robinhood.android.optionschain.OptionChainListView9;
import com.robinhood.android.optionschain.OptionChainTransparentStatusBar;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainEvent;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment;
import com.robinhood.android.optionschain.sbschain.table.BidAskCellDisableType;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0005R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010=\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010;0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010?\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010;0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006K²\u0006\f\u0010J\u001a\u00020I8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "", "dismissSelloutSnackbarPermanently", "showDiscoverZeroDteBottomSheet", "j$/time/Instant", "selloutTime", "showSelloutWarningSnackbar", "(Lj$/time/Instant;)V", "showAutoDismissableSelloutSnackbar", "showSelloutWarningSnackbarConditionally", "dismissSelloutWarningSnackbar", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "optionChainSettingsFragmentKey", "openChainSettings", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "turnOnTradeOnExpirationSetting", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "selloutWarningSnackbar", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "contractPcoSnackbar", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo;", "duxo", "Lcom/robinhood/android/optionchain/OptionChainExpirationPageCallbacks;", "expirationPageCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getExpirationPageCallbacks", "()Lcom/robinhood/android/optionchain/OptionChainExpirationPageCallbacks;", "expirationPageCallbacks", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "pricingSettingsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "optionOrderLauncher", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment;", "getOptionsListsQuickAddFragment", "()Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment;", "optionsListsQuickAddFragment", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Companion", "", "statusBarPaddingPx", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainFragment extends GenericComposeFragment implements OptionDiscoverZeroDteBottomSheetFragment.Callbacks, AutoLoggableFragment {
    public Clock clock;
    private RdsSnackbar contractPcoSnackbar;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionSideBySideChainDuxo.class);

    /* renamed from: expirationPageCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 expirationPageCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionChainExpirationPageCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionChainExpirationPageCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final ActivityResultLauncher<Intent> optionOrderLauncher;
    private final ActivityResultLauncher<Intent> pricingSettingsLauncher;
    private RdsSnackbar selloutWarningSnackbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionSideBySideChainFragment.class, "expirationPageCallbacks", "getExpirationPageCallbacks()Lcom/robinhood/android/optionchain/OptionChainExpirationPageCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Screen quickAddAnalyticsScreen = new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(OptionSideBySideChainFragment optionSideBySideChainFragment, int i, Composer composer, int i2) {
        optionSideBySideChainFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public OptionSideBySideChainFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$pricingSettingsLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    Intent data = result.getData();
                    Serializable serializableExtra = data != null ? data.getSerializableExtra(ReturnedData.EXTRA_RETURNED_DATA) : null;
                    if (serializableExtra == null || !(serializableExtra instanceof OptionSettings.DefaultPricingSetting)) {
                        return;
                    }
                    this.this$0.getDuxo().setDefaultPricingSetting((OptionSettings.DefaultPricingSetting) serializableExtra);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.pricingSettingsLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$optionOrderLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.requireActivity().setResult(-1);
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.optionOrderLauncher = activityResultLauncherRegisterForActivityResult2;
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionsListsQuickAddFragment getOptionsListsQuickAddFragment() {
        Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag(OptionChainActivity.QUICK_ADD_TAG);
        Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.robinhood.android.lists.options.OptionsListsQuickAddFragment");
        return (OptionsListsQuickAddFragment) fragmentFindFragmentByTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionSideBySideChainDuxo getDuxo() {
        return (OptionSideBySideChainDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionChainExpirationPageCallbacks getExpirationPageCallbacks() {
        return (OptionChainExpirationPageCallbacks) this.expirationPageCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    private static final int ComposeContent$lambda$0(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(8);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Flow<Integer> flowFlowOf;
        Composer composerStartRestartGroup = composer.startRestartGroup(1302123219);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1302123219, i2, -1, "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment.ComposeContent (OptionSideBySideChainFragment.kt:100)");
            }
            FragmentActivity activity = getActivity();
            OptionChainActivity optionChainActivity = activity instanceof OptionChainActivity ? (OptionChainActivity) activity : null;
            if (optionChainActivity == null || (flowFlowOf = optionChainActivity.statusBarTopPaddingFlow$feature_options_chain_externalDebug()) == null) {
                flowFlowOf = FlowKt.flowOf(0);
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1677817480, true, new C244401(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(flowFlowOf, 0, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 48, 14)))), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OptionSideBySideChainFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$ComposeContent$1 */
    static final class C244401 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ float $statusBarPaddingDp;

        /* compiled from: OptionSideBySideChainFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$ComposeContent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C244401(float f) {
            this.$statusBarPaddingDp = f;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1677817480, i, -1, "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment.ComposeContent.<anonymous> (OptionSideBySideChainFragment.kt:105)");
            }
            Companion companion = OptionSideBySideChainFragment.INSTANCE;
            UUID equityInstrumentId = ((InternalOptionChainFragmentKey) companion.getArgs((Fragment) OptionSideBySideChainFragment.this)).getEquityInstrumentId();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, this.$statusBarPaddingDp, 0.0f, 0.0f, 13, null);
            boolean inSbsChainPerfExperiment = ((InternalOptionChainFragmentKey) companion.getArgs((Fragment) OptionSideBySideChainFragment.this)).getInSbsChainPerfExperiment();
            OptionSideBySideChainDuxo duxo = OptionSideBySideChainFragment.this.getDuxo();
            OptionSideBySideChainFragment optionSideBySideChainFragment = OptionSideBySideChainFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(optionSideBySideChainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OptionSideBySideChainFragment$ComposeContent$1$1$1(optionSideBySideChainFragment);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            OptionSideBySideChainFragment optionSideBySideChainFragment2 = OptionSideBySideChainFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(optionSideBySideChainFragment2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new OptionSideBySideChainFragment$ComposeContent$1$2$1(optionSideBySideChainFragment2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            OptionSideBySideChainDuxo duxo2 = OptionSideBySideChainFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(duxo2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new OptionSideBySideChainFragment$ComposeContent$1$3$1(duxo2);
                composer.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue3;
            composer.endReplaceGroup();
            OptionSideBySideChainFragment optionSideBySideChainFragment3 = OptionSideBySideChainFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(optionSideBySideChainFragment3);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new OptionSideBySideChainFragment$ComposeContent$1$4$1(optionSideBySideChainFragment3);
                composer.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue4;
            composer.endReplaceGroup();
            OptionSideBySideChainFragment optionSideBySideChainFragment4 = OptionSideBySideChainFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(optionSideBySideChainFragment4);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new OptionSideBySideChainFragment$ComposeContent$1$5$1(optionSideBySideChainFragment4);
                composer.updateRememberedValue(objRememberedValue5);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(OptionSideBySideChainFragment.this);
            final OptionSideBySideChainFragment optionSideBySideChainFragment5 = OptionSideBySideChainFragment.this;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainFragment.C244401.invoke$lambda$6$lambda$5(optionSideBySideChainFragment5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function0 function0 = (Function0) objRememberedValue6;
            composer.endReplaceGroup();
            Function1 function1 = (Function1) kFunction;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composer.changedInstance(OptionSideBySideChainFragment.this);
            final OptionSideBySideChainFragment optionSideBySideChainFragment6 = OptionSideBySideChainFragment.this;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionSideBySideChainFragment.C244401.invoke$lambda$10$lambda$9(optionSideBySideChainFragment6, (OptionLegBundle) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            Function1 function12 = (Function1) objRememberedValue7;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composer.changedInstance(OptionSideBySideChainFragment.this);
            final OptionSideBySideChainFragment optionSideBySideChainFragment7 = OptionSideBySideChainFragment.this;
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainFragment.C244401.invoke$lambda$12$lambda$11(optionSideBySideChainFragment7);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            Function0 function02 = (Function0) objRememberedValue8;
            composer.endReplaceGroup();
            Function0 function03 = (Function0) kFunction2;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composer.changedInstance(OptionSideBySideChainFragment.this);
            final OptionSideBySideChainFragment optionSideBySideChainFragment8 = OptionSideBySideChainFragment.this;
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionSideBySideChainFragment.C244401.invoke$lambda$14$lambda$13(optionSideBySideChainFragment8, (Intent) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            Function1 function13 = (Function1) objRememberedValue9;
            composer.endReplaceGroup();
            Function0 function04 = (Function0) kFunction3;
            Function1 function14 = (Function1) kFunction4;
            Function0 function05 = (Function0) kFunction5;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance10 = composer.changedInstance(OptionSideBySideChainFragment.this);
            final OptionSideBySideChainFragment optionSideBySideChainFragment9 = OptionSideBySideChainFragment.this;
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new Function3() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$ComposeContent$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return OptionSideBySideChainFragment.C244401.invoke$lambda$16$lambda$15(optionSideBySideChainFragment9, ((Boolean) obj).booleanValue(), (OptionLegBundle) obj2, (BidAskCellDisableType) obj3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceGroup();
            OptionSideBySideChainComposableKt.OptionSideBySideChainComposable(equityInstrumentId, inSbsChainPerfExperiment, function0, function1, function12, function02, duxo, function03, function13, function04, function14, function05, modifierM5146paddingqDBjuR0$default, (Function3) objRememberedValue10, composer, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(OptionSideBySideChainFragment optionSideBySideChainFragment) {
            optionSideBySideChainFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(OptionSideBySideChainFragment optionSideBySideChainFragment, OptionLegBundle optionLegBundle) {
            int i;
            OptionConfigurationBundle optionConfigurationBundle;
            RdsSnackbar rdsSnackbar;
            RdsSnackbar rdsSnackbar2 = optionSideBySideChainFragment.contractPcoSnackbar;
            if (rdsSnackbar2 != null && rdsSnackbar2.isShown() && (rdsSnackbar = optionSideBySideChainFragment.contractPcoSnackbar) != null) {
                rdsSnackbar.dismiss();
            }
            OrderSide optionSide = (optionLegBundle == null || (optionConfigurationBundle = optionLegBundle.getOptionConfigurationBundle()) == null) ? null : optionConfigurationBundle.getOptionSide();
            int i2 = optionSide == null ? -1 : WhenMappings.$EnumSwitchMapping$0[optionSide.ordinal()];
            if (i2 == -1) {
                return Unit.INSTANCE;
            }
            if (i2 == 1) {
                i = C24135R.string.option_side_by_side_chain_server_pco_buy_error_msg;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C24135R.string.option_side_by_side_chain_server_pco_sell_error_msg;
            }
            final RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(optionSideBySideChainFragment.getRootView(), i, -2);
            RdsSnackbar.setAction$default(rdsSnackbarMake, optionSideBySideChainFragment.getString(C11048R.string.general_label_dismiss), false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$ComposeContent$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionSideBySideChainFragment.C244401.invoke$lambda$10$lambda$9$lambda$8$lambda$7(rdsSnackbarMake);
                }
            }, 14, (Object) null);
            rdsSnackbarMake.show();
            optionSideBySideChainFragment.contractPcoSnackbar = rdsSnackbarMake;
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(RdsSnackbar rdsSnackbar) {
            rdsSnackbar.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$16$lambda$15(OptionSideBySideChainFragment optionSideBySideChainFragment, boolean z, OptionLegBundle optionLegBundle, BidAskCellDisableType bidAskCellDisableType) {
            if (optionLegBundle != null) {
                Resources resources = optionSideBySideChainFragment.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                OptionStrategySecurity optionStrategySecurity = new OptionStrategySecurity(resources, optionLegBundle.getOptionInstrument(), optionLegBundle.getOptionConfigurationBundle().getOptionSide(), optionLegBundle.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain());
                if (z) {
                    optionSideBySideChainFragment.dismissSelloutSnackbarPermanently();
                    OptionsListsQuickAddFragment.removeFromOptionsWatchlist$default(optionSideBySideChainFragment.getOptionsListsQuickAddFragment(), optionStrategySecurity, OptionSideBySideChainFragment.quickAddAnalyticsScreen, null, 4, null);
                } else if (bidAskCellDisableType != BidAskCellDisableType.PCO_NO_WATCHLIST) {
                    optionSideBySideChainFragment.dismissSelloutSnackbarPermanently();
                    OptionsListsQuickAddFragment.addToOptionsWatchlist$default(optionSideBySideChainFragment.getOptionsListsQuickAddFragment(), optionStrategySecurity, OptionSideBySideChainFragment.quickAddAnalyticsScreen, null, 4, null);
                } else {
                    RdsSnackbar.INSTANCE.make(optionSideBySideChainFragment.getRootView(), C24135R.string.option_watchlist_add_remove_pco_error_message, 0).show();
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13(OptionSideBySideChainFragment optionSideBySideChainFragment, Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            optionSideBySideChainFragment.optionOrderLauncher.launch(intent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(OptionSideBySideChainFragment optionSideBySideChainFragment) {
            FragmentActivity fragmentActivityRequireActivity = optionSideBySideChainFragment.requireActivity();
            OptionChainActivity optionChainActivity = fragmentActivityRequireActivity instanceof OptionChainActivity ? (OptionChainActivity) fragmentActivityRequireActivity : null;
            if (optionChainActivity != null) {
                optionChainActivity.m2298xeb990de5();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        OptionChainActivity optionChainActivity = fragmentActivityRequireActivity instanceof OptionChainActivity ? (OptionChainActivity) fragmentActivityRequireActivity : null;
        getDuxo().m2329x75a36e64(optionChainActivity != null ? optionChainActivity.m2297x96713971() : false);
        if (savedInstanceState != null) {
            getDuxo().logFragmentRecreated();
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C244411(optionChainActivity, this, null));
    }

    /* compiled from: OptionSideBySideChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onCreate$1", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onCreate$1 */
    static final class C244411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionChainActivity $activity;
        int label;
        final /* synthetic */ OptionSideBySideChainFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C244411(OptionChainActivity optionChainActivity, OptionSideBySideChainFragment optionSideBySideChainFragment, Continuation<? super C244411> continuation) {
            super(2, continuation);
            this.$activity = optionChainActivity;
            this.this$0 = optionSideBySideChainFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C244411(this.$activity, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Flow<Boolean> flowChainNuxSearchDismissedFlow$feature_options_chain_externalDebug;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionChainActivity optionChainActivity = this.$activity;
                if (optionChainActivity != null && (flowChainNuxSearchDismissedFlow$feature_options_chain_externalDebug = optionChainActivity.chainNuxSearchDismissedFlow$feature_options_chain_externalDebug()) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowChainNuxSearchDismissedFlow$feature_options_chain_externalDebug, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionSideBySideChainFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dismissed", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onCreate$1$1", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionSideBySideChainFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainFragment optionSideBySideChainFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainFragment;
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
                    this.this$0.getDuxo().setNuxSearchDismissed(this.Z$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), OptionChainTransparentStatusBar.INSTANCE, null, 2, null);
        BaseFragment.collectDuxoState$default(this, null, new C244421(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C244432(null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C244443(null), 3, null);
    }

    /* compiled from: OptionSideBySideChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1 */
    static final class C244421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C244421(Continuation<? super C244421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C244421 c244421 = OptionSideBySideChainFragment.this.new C244421(continuation);
            c244421.L$0 = obj;
            return c244421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowFilterNotNull = FlowKt.filterNotNull(OptionSideBySideChainFragment.this.getDuxo().getEventFlow());
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flowFilterNotNull, OptionSideBySideChainFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(flowFilterNotNull, OptionSideBySideChainFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(flowFilterNotNull, OptionSideBySideChainFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionSideBySideChainFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$1", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Event<OptionSideBySideChainEvent>> $eventFlow;
            int label;
            final /* synthetic */ OptionSideBySideChainFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<Event<OptionSideBySideChainEvent>> flow, OptionSideBySideChainFragment optionSideBySideChainFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = optionSideBySideChainFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$eventFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Event<OptionSideBySideChainEvent>> flow = this.$eventFlow;
                    final OptionSideBySideChainFragment optionSideBySideChainFragment = this.this$0;
                    FlowCollector<? super Event<OptionSideBySideChainEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment.onViewCreated.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<OptionSideBySideChainEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<OptionSideBySideChainEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<OptionSideBySideChainEvent> eventConsumerInvoke;
                            final OptionSideBySideChainFragment optionSideBySideChainFragment2 = optionSideBySideChainFragment;
                            if ((event.getData() instanceof OptionSideBySideChainEvent.EnableTradeOnExpirationSuccess) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m17230invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m17230invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ViewGroup rootView = optionSideBySideChainFragment2.getRootView();
                                        final OptionSideBySideChainFragment optionSideBySideChainFragment3 = optionSideBySideChainFragment2;
                                        OptionDiscoverZeroDteSnackbarHelper.showDiscoverZeroDteSnackbar(rootView, new Function0<Unit>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                Navigator navigator = optionSideBySideChainFragment3.getNavigator();
                                                Context contextRequireContext = optionSideBySideChainFragment3.requireContext();
                                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                                Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_OPTIONS_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
                                            }
                                        }, new Function0<Unit>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$1$1$1$2
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }
                                        });
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
        }

        /* compiled from: OptionSideBySideChainFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$2", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Event<OptionSideBySideChainEvent>> $eventFlow;
            int label;
            final /* synthetic */ OptionSideBySideChainFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<Event<OptionSideBySideChainEvent>> flow, OptionSideBySideChainFragment optionSideBySideChainFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = optionSideBySideChainFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$eventFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Event<OptionSideBySideChainEvent>> flow = this.$eventFlow;
                    final OptionSideBySideChainFragment optionSideBySideChainFragment = this.this$0;
                    FlowCollector<? super Event<OptionSideBySideChainEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment.onViewCreated.1.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<OptionSideBySideChainEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<OptionSideBySideChainEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<OptionSideBySideChainEvent> eventConsumerInvoke;
                            final OptionSideBySideChainFragment optionSideBySideChainFragment2 = optionSideBySideChainFragment;
                            if ((event.getData() instanceof OptionSideBySideChainEvent.EnableTradeOnExpirationFailure) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m17231invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m17231invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AbsErrorHandler.handleError$default(optionSideBySideChainFragment2.getActivityErrorHandler(), ((OptionSideBySideChainEvent.EnableTradeOnExpirationFailure) event.getData()).getThrowable(), false, 2, null);
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
        }

        /* compiled from: OptionSideBySideChainFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$3", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Event<OptionSideBySideChainEvent>> $eventFlow;
            int label;
            final /* synthetic */ OptionSideBySideChainFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Flow<Event<OptionSideBySideChainEvent>> flow, OptionSideBySideChainFragment optionSideBySideChainFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = optionSideBySideChainFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$eventFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Event<OptionSideBySideChainEvent>> flow = this.$eventFlow;
                    final OptionSideBySideChainFragment optionSideBySideChainFragment = this.this$0;
                    FlowCollector<? super Event<OptionSideBySideChainEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment.onViewCreated.1.3.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<OptionSideBySideChainEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<OptionSideBySideChainEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<OptionSideBySideChainEvent> eventConsumerInvoke;
                            final OptionSideBySideChainFragment optionSideBySideChainFragment2 = optionSideBySideChainFragment;
                            if ((event.getData() instanceof OptionSideBySideChainEvent.ShowDiscoverZeroDteBottomSheet) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$1$3$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m17232invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m17232invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        optionSideBySideChainFragment2.showDiscoverZeroDteBottomSheet();
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
        }
    }

    /* compiled from: OptionSideBySideChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {250}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2 */
    static final class C244432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C244432(Continuation<? super C244432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainFragment.this.new C244432(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionSideBySideChainViewState> stateFlow = OptionSideBySideChainFragment.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples3<? extends OptionChainExpirationDateState, ? extends Boolean, ? extends Boolean>>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples3<? extends OptionChainExpirationDateState, ? extends Boolean, ? extends Boolean>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {54}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                OptionSideBySideChainViewState optionSideBySideChainViewState = (OptionSideBySideChainViewState) obj;
                                OptionChainExpirationDateState selectedExpirationPage = optionSideBySideChainViewState.getSelectedExpirationPage();
                                Tuples3 tuples3 = selectedExpirationPage != null ? new Tuples3(selectedExpirationPage, boxing.boxBoolean(optionSideBySideChainViewState.isOnTodayTab()), boxing.boxBoolean(optionSideBySideChainViewState.isSelloutSnackbarDismissalExperimentEnabled())) : null;
                                if (tuples3 != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionSideBySideChainFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionSideBySideChainFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2$2", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples3<? extends OptionChainExpirationDateState, ? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionSideBySideChainFragment optionSideBySideChainFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends OptionChainExpirationDateState, ? extends Boolean, ? extends Boolean> tuples3, Continuation<? super Unit> continuation) {
                return invoke2((Tuples3<OptionChainExpirationDateState, Boolean, Boolean>) tuples3, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples3<OptionChainExpirationDateState, Boolean, Boolean> tuples3, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainFragment.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2$2$1", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $isOnToday;
                final /* synthetic */ boolean $isSelloutSnackbarDismissalExperimentEnabled;
                final /* synthetic */ OptionChainExpirationDateState $selectedExpirationPage;
                int label;
                final /* synthetic */ OptionSideBySideChainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainFragment optionSideBySideChainFragment, OptionChainExpirationDateState optionChainExpirationDateState, boolean z, boolean z2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainFragment;
                    this.$selectedExpirationPage = optionChainExpirationDateState;
                    this.$isOnToday = z;
                    this.$isSelloutSnackbarDismissalExperimentEnabled = z2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$selectedExpirationPage, this.$isOnToday, this.$isSelloutSnackbarDismissalExperimentEnabled, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.getExpirationPageCallbacks().setSelectedExpirationPage(this.$selectedExpirationPage);
                        if (!this.$isOnToday && this.$isSelloutSnackbarDismissalExperimentEnabled) {
                            RdsSnackbar rdsSnackbar = this.this$0.selloutWarningSnackbar;
                            if (rdsSnackbar != null) {
                                rdsSnackbar.dismiss();
                            }
                            this.this$0.selloutWarningSnackbar = null;
                            this.this$0.getDuxo().cancelSnackbarTimer();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples3 tuples3 = (Tuples3) this.L$0;
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.getLifecycleScope(), Dispatchers.getMain(), null, new AnonymousClass1(this.this$0, (OptionChainExpirationDateState) tuples3.component1(), ((Boolean) tuples3.component2()).booleanValue(), ((Boolean) tuples3.component3()).booleanValue(), null), 2, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$3", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$3 */
    static final class C244443 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C244443(Continuation<? super C244443> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainFragment.this.new C244443(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244443) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionSideBySideChainViewState> stateFlow = OptionSideBySideChainFragment.this.getDuxo().getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionSideBySideChainEvent>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionSideBySideChainEvent> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                OptionSideBySideChainEvent initialExpirationPageScrollingEvent = ((OptionSideBySideChainViewState) obj).getInitialExpirationPageScrollingEvent();
                                if (initialExpirationPageScrollingEvent != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(initialExpirationPageScrollingEvent, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, 1);
                final OptionSideBySideChainFragment optionSideBySideChainFragment = OptionSideBySideChainFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment.onViewCreated.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((OptionSideBySideChainEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(OptionSideBySideChainEvent optionSideBySideChainEvent, Continuation<? super Unit> continuation) {
                        optionSideBySideChainFragment.getDuxo().submit(optionSideBySideChainEvent);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowTake.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteBottomSheetFragment.Callbacks
    public void turnOnTradeOnExpirationSetting() {
        getDuxo().turnOnTradeOnExpirationSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissSelloutSnackbarPermanently() {
        dismissSelloutWarningSnackbar();
        getDuxo().markSelloutSnackbarDismissedOrElapsed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDiscoverZeroDteBottomSheet() {
        OptionDiscoverZeroDteBottomSheetFragment.Companion companion = OptionDiscoverZeroDteBottomSheetFragment.INSTANCE;
        boolean zIsEtfSupported = getDuxo().getStateFlow().getValue().isEtfSupported();
        UiOptionChain uiOptionChain = (UiOptionChain) CollectionsKt.firstOrNull((List) ((InternalOptionChainFragmentKey) INSTANCE.getArgs((Fragment) this)).getUiOptionChains());
        OptionDiscoverZeroDteBottomSheetFragment optionDiscoverZeroDteBottomSheetFragmentNewInstance = companion.newInstance(new OptionDiscoverZeroDteBottomSheetFragment.Args(zIsEtfSupported, uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null, getDuxo().getStateFlow().getValue().getInSelloutImprovementExperiment(), getDuxo().getStateFlow().getValue().isMemberPdtRevampV1()));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        optionDiscoverZeroDteBottomSheetFragmentNewInstance.show(childFragmentManager, "discoverZeroDte");
    }

    private final void showSelloutWarningSnackbar(Instant selloutTime) {
        int i;
        if (getDuxo().getStateFlow().getValue().getInSelloutImprovementExperiment()) {
            i = C24135R.string.friday_trading_sellout_alert_snackbar_sellout_improvement;
        } else {
            i = C24135R.string.friday_trading_sellout_alert_snackbar;
        }
        RdsSnackbar rdsSnackbar = this.selloutWarningSnackbar;
        if (rdsSnackbar == null || !rdsSnackbar.isShown()) {
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            ViewGroup rootView = getRootView();
            String string2 = getString(i, Instants2.toEasternTimeString(selloutTime));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            final RdsSnackbar rdsSnackbarMake = companion.make(rootView, string2, -2);
            RdsSnackbar.setAction$default(rdsSnackbarMake, getString(C11048R.string.general_label_dismiss), false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionSideBySideChainFragment.showSelloutWarningSnackbar$lambda$4$lambda$3(rdsSnackbarMake);
                }
            }, 14, (Object) null);
            rdsSnackbarMake.show();
            this.selloutWarningSnackbar = rdsSnackbarMake;
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C244462(selloutTime, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSelloutWarningSnackbar$lambda$4$lambda$3(RdsSnackbar rdsSnackbar) {
        rdsSnackbar.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: OptionSideBySideChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$showSelloutWarningSnackbar$2", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$showSelloutWarningSnackbar$2 */
    static final class C244462 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Instant $selloutTime;
        int label;
        final /* synthetic */ OptionSideBySideChainFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C244462(Instant instant, OptionSideBySideChainFragment optionSideBySideChainFragment, Continuation<? super C244462> continuation) {
            super(2, continuation);
            this.$selloutTime = instant;
            this.this$0 = optionSideBySideChainFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C244462(this.$selloutTime, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long epochMilli = this.$selloutTime.toEpochMilli() - Instant.now(this.this$0.getClock()).toEpochMilli();
                if (epochMilli > 0) {
                    this.label = 1;
                    if (DelayKt.delay(epochMilli, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RdsSnackbar rdsSnackbar = this.this$0.selloutWarningSnackbar;
            if (rdsSnackbar != null) {
                rdsSnackbar.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    private final void showAutoDismissableSelloutSnackbar(Instant selloutTime) {
        RdsSnackbar rdsSnackbar = this.selloutWarningSnackbar;
        if (rdsSnackbar == null || !rdsSnackbar.isShown()) {
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            ViewGroup rootView = getRootView();
            String string2 = getString(C24135R.string.friday_trading_sellout_alert_snackbar, Instants2.toEasternTimeString(selloutTime));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            final RdsSnackbar rdsSnackbarMake = companion.make(rootView, string2, 0);
            rdsSnackbarMake.setCustomDuration(OptionChainListView9.SELLOUT_SNACKBAR_DISPLAY_DURATION_MS);
            RdsSnackbar.setAction$default(rdsSnackbarMake, getString(C11048R.string.general_label_dismiss), false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionSideBySideChainFragment.showAutoDismissableSelloutSnackbar$lambda$7$lambda$5(this.f$0, rdsSnackbarMake);
                }
            }, 14, (Object) null);
            rdsSnackbarMake.addDismissCallback(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainFragment.showAutoDismissableSelloutSnackbar$lambda$7$lambda$6(this.f$0, rdsSnackbarMake, (RdsSnackbar) obj, ((Integer) obj2).intValue());
                }
            });
            rdsSnackbarMake.show();
            getDuxo().startSelloutSnackbarTimer();
            this.selloutWarningSnackbar = rdsSnackbarMake;
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C244452(selloutTime, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAutoDismissableSelloutSnackbar$lambda$7$lambda$5(OptionSideBySideChainFragment optionSideBySideChainFragment, RdsSnackbar rdsSnackbar) {
        optionSideBySideChainFragment.getDuxo().markSelloutSnackbarDismissedOrElapsed();
        optionSideBySideChainFragment.getDuxo().cancelSnackbarTimer();
        rdsSnackbar.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAutoDismissableSelloutSnackbar$lambda$7$lambda$6(OptionSideBySideChainFragment optionSideBySideChainFragment, RdsSnackbar rdsSnackbar, RdsSnackbar rdsSnackbar2, int i) {
        if (i == 0) {
            optionSideBySideChainFragment.getDuxo().markSelloutSnackbarDismissedOrElapsed();
            rdsSnackbar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionSideBySideChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$showAutoDismissableSelloutSnackbar$2", m3645f = "OptionSideBySideChainFragment.kt", m3646l = {349}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment$showAutoDismissableSelloutSnackbar$2 */
    static final class C244452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Instant $selloutTime;
        int label;
        final /* synthetic */ OptionSideBySideChainFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C244452(Instant instant, OptionSideBySideChainFragment optionSideBySideChainFragment, Continuation<? super C244452> continuation) {
            super(2, continuation);
            this.$selloutTime = instant;
            this.this$0 = optionSideBySideChainFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C244452(this.$selloutTime, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long epochMilli = this.$selloutTime.toEpochMilli() - Instant.now(this.this$0.getClock()).toEpochMilli();
                if (epochMilli > 0) {
                    this.label = 1;
                    if (DelayKt.delay(epochMilli, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RdsSnackbar rdsSnackbar = this.this$0.selloutWarningSnackbar;
            if (rdsSnackbar != null) {
                rdsSnackbar.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSelloutWarningSnackbarConditionally(Instant selloutTime) {
        if (getDuxo().getStateFlow().getValue().isSelloutSnackbarDismissalExperimentEnabled()) {
            showAutoDismissableSelloutSnackbar(selloutTime);
        } else {
            showSelloutWarningSnackbar(selloutTime);
        }
    }

    private final void dismissSelloutWarningSnackbar() {
        OptionSideBySideChainViewState value = getDuxo().getStateFlow().getValue();
        if (value.isOnTodayTab() && value.isSelloutSnackbarDismissalExperimentEnabled()) {
            getDuxo().cancelSnackbarTimer();
            RdsSnackbar rdsSnackbar = this.selloutWarningSnackbar;
            if (rdsSnackbar != null) {
                rdsSnackbar.dismiss();
            }
            this.selloutWarningSnackbar = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openChainSettings(FragmentKey optionChainSettingsFragmentKey) {
        dismissSelloutSnackbarPermanently();
        ActivityResultLauncher<Intent> activityResultLauncher = this.pricingSettingsLauncher;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, optionChainSettingsFragmentKey, false, false, false, null, false, true, false, false, false, null, false, 8052, null));
    }

    /* compiled from: OptionSideBySideChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainFragment;", "Lcom/robinhood/android/options/contracts/InternalOptionChainFragmentKey;", "<init>", "()V", "quickAddAnalyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionSideBySideChainFragment, InternalOptionChainFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InternalOptionChainFragmentKey getArgs(OptionSideBySideChainFragment optionSideBySideChainFragment) {
            return (InternalOptionChainFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionSideBySideChainFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionSideBySideChainFragment newInstance(InternalOptionChainFragmentKey internalOptionChainFragmentKey) {
            return (OptionSideBySideChainFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, internalOptionChainFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionSideBySideChainFragment optionSideBySideChainFragment, InternalOptionChainFragmentKey internalOptionChainFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionSideBySideChainFragment, internalOptionChainFragmentKey);
        }
    }
}
