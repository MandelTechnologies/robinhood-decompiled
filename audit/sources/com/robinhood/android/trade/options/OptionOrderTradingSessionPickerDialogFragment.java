package com.robinhood.android.trade.options;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.tradesettings.TradingSessionViewState;
import com.robinhood.android.equities.tradesettings.p120ui.TradingSessionBottomSheet5;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo4;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: OptionOrderTradingSessionPickerDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionPickerDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "OptionTradingSessionBottomSheet", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDuxo;Landroidx/compose/runtime/Composer;II)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-trade-options_externalDebug", "viewState", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderTradingSessionPickerDialogFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOrderTradingSessionPickerDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderMarketHours.values().length];
            try {
                iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(OptionOrderTradingSessionPickerDialogFragment optionOrderTradingSessionPickerDialogFragment, int i, Composer composer, int i2) {
        optionOrderTradingSessionPickerDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionTradingSessionBottomSheet$lambda$9(OptionOrderTradingSessionPickerDialogFragment optionOrderTradingSessionPickerDialogFragment, Modifier modifier, OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo, int i, int i2, Composer composer, int i3) {
        optionOrderTradingSessionPickerDialogFragment.OptionTradingSessionBottomSheet(modifier, optionOrderTradingSessionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
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

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-741274849);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741274849, i2, -1, "com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment.ComposeContent (OptionOrderTradingSessionPickerDialogFragment.kt:39)");
            }
            Screen screen = new Screen(Screen.Name.OPTION_ORDER_FORM, null, null, null, 14, null);
            Component component = new Component(Component.ComponentType.BOTTOM_SHEET, "trading_session_sheet", null, 4, null);
            String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getChainIdForLogging().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(string2, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), component, null, 37, null), ComposableLambda3.rememberComposableLambda(895688660, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(895688660, i3, -1, "com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment.ComposeContent.<anonymous> (OptionOrderTradingSessionPickerDialogFragment.kt:52)");
                    }
                    OptionOrderTradingSessionPickerDialogFragment.this.OptionTradingSessionBottomSheet(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null), null, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderTradingSessionPickerDialogFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OptionTradingSessionBottomSheet(Modifier modifier, OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo2;
        Modifier modifier3;
        final OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo3;
        Composer composer2;
        OptionOrderTradingSessionDuxo4 optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$1;
        boolean zChangedInstance;
        Object objRememberedValue;
        final OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo4;
        Composer composerStartRestartGroup = composer.startRestartGroup(314362789);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                optionOrderTradingSessionDuxo2 = optionOrderTradingSessionDuxo;
                int i5 = composerStartRestartGroup.changedInstance(optionOrderTradingSessionDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                optionOrderTradingSessionDuxo2 = optionOrderTradingSessionDuxo;
            }
            i3 |= i5;
        } else {
            optionOrderTradingSessionDuxo2 = optionOrderTradingSessionDuxo;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            optionOrderTradingSessionDuxo4 = optionOrderTradingSessionDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionOrderTradingSessionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$OptionTradingSessionBottomSheet$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$OptionTradingSessionBottomSheet$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    optionOrderTradingSessionDuxo3 = (OptionOrderTradingSessionDuxo) baseDuxo;
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(314362789, i3, -1, "com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment.OptionTradingSessionBottomSheet (OptionOrderTradingSessionPickerDialogFragment.kt:60)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionOrderTradingSessionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$1 = OptionTradingSessionBottomSheet$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                composer2.startReplaceGroup(1454940301);
                if (!(optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$1 instanceof OptionOrderTradingSessionDuxo4.Loaded)) {
                    OptionOrderTradingSessionDuxo4 optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$12 = OptionTradingSessionBottomSheet$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                    Intrinsics.checkNotNull(optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$12, "null cannot be cast to non-null type com.robinhood.android.trade.options.OptionOrderTradingSessionViewState.Loaded");
                    TradingSessionViewState tradingSessionViewState = ((OptionOrderTradingSessionDuxo4.Loaded) optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$12).getTradingSessionViewState();
                    TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.TRADE_FLOW;
                    TradeSettingsStore3.Options options = TradeSettingsStore3.Options.INSTANCE;
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChangedInstance3 = composer2.changedInstance(current2) | composer2.changedInstance(this) | composer2.changedInstance(optionOrderTradingSessionDuxo3);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function3() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return OptionOrderTradingSessionPickerDialogFragment.OptionTradingSessionBottomSheet$lambda$3$lambda$2(current2, this, optionOrderTradingSessionDuxo3, (TradeSettingsStore4) obj, (TradeSettingsStore3) obj2, (OrderMarketHours) obj3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Function3 function3 = (Function3) objRememberedValue3;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composer2.changedInstance(this);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOrderTradingSessionPickerDialogFragment.OptionTradingSessionBottomSheet$lambda$5$lambda$4(this.f$0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    TradingSessionBottomSheet5.TradingSessionComposable(tradingSessionViewState, tradeSettingsStore4, options, function3, (Function0) objRememberedValue4, modifier3, composer2, TradingSessionViewState.$stable | 48 | (TradeSettingsStore3.Options.$stable << 6) | ((i3 << 15) & 458752), 0);
                    composer2 = composer2;
                } else if (!Intrinsics.areEqual(optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$1, OptionOrderTradingSessionDuxo4.Loading.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                composer2.endReplaceGroup();
                OptionChain.UnderlyingType underlyingType = ((Args) INSTANCE.getArgs((Fragment) this)).getUnderlyingType();
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(optionOrderTradingSessionDuxo3) | composer2.changedInstance(this);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOrderTradingSessionPickerDialogFragment.OptionTradingSessionBottomSheet$lambda$8$lambda$7(optionOrderTradingSessionDuxo3, this, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Composer composer3 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(underlyingType, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer3, 0, 2);
                composerStartRestartGroup = composer3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                optionOrderTradingSessionDuxo4 = optionOrderTradingSessionDuxo3;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                modifier3 = modifier2;
            }
            optionOrderTradingSessionDuxo3 = optionOrderTradingSessionDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(optionOrderTradingSessionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composer2 = composerStartRestartGroup;
            final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
            optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$1 = OptionTradingSessionBottomSheet$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            composer2.startReplaceGroup(1454940301);
            if (!(optionOrderTradingSessionDuxo4OptionTradingSessionBottomSheet$lambda$1 instanceof OptionOrderTradingSessionDuxo4.Loaded)) {
            }
            composer2.endReplaceGroup();
            OptionChain.UnderlyingType underlyingType2 = ((Args) INSTANCE.getArgs((Fragment) this)).getUnderlyingType();
            composer2.startReplaceGroup(-1633490746);
            zChangedInstance = composer2.changedInstance(optionOrderTradingSessionDuxo3) | composer2.changedInstance(this);
            objRememberedValue = composer2.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOrderTradingSessionPickerDialogFragment.OptionTradingSessionBottomSheet$lambda$8$lambda$7(optionOrderTradingSessionDuxo3, this, (LifecycleResumePauseEffectScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
                composer2.endReplaceGroup();
                Composer composer32 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(underlyingType2, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer32, 0, 2);
                composerStartRestartGroup = composer32;
                if (ComposerKt.isTraceInProgress()) {
                }
                optionOrderTradingSessionDuxo4 = optionOrderTradingSessionDuxo3;
                modifier2 = modifier3;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderTradingSessionPickerDialogFragment.OptionTradingSessionBottomSheet$lambda$9(this.f$0, modifier2, optionOrderTradingSessionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionTradingSessionBottomSheet$lambda$3$lambda$2(EventLogger eventLogger, OptionOrderTradingSessionPickerDialogFragment optionOrderTradingSessionPickerDialogFragment, OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderMarketHours tradingSession) {
        String str;
        Intrinsics.checkNotNullParameter(tradeSettingsStore4, "<unused var>");
        Intrinsics.checkNotNullParameter(tradeSettingsStore3, "<unused var>");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        Screen screen = new Screen(Screen.Name.OPTION_TRADING_SESSION, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        int i = WhenMappings.$EnumSwitchMapping$0[tradingSession.ordinal()];
        if (i == 1) {
            str = "regular_hours";
        } else if (i == 2) {
            str = "non_regular";
        } else {
            str = "";
        }
        Component component = new Component(componentType, str, null, 4, null);
        Companion companion = INSTANCE;
        String string2 = ((Args) companion.getArgs((Fragment) optionOrderTradingSessionPickerDialogFragment)).getChainIdForLogging().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(string2, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), false, 41, null);
        optionOrderTradingSessionDuxo.onOrderTradingSessionChanged(((Args) companion.getArgs((Fragment) optionOrderTradingSessionPickerDialogFragment)).getUnderlyingType(), tradingSession);
        return Unit.INSTANCE;
    }

    private static final OptionOrderTradingSessionDuxo4 OptionTradingSessionBottomSheet$lambda$1(SnapshotState4<? extends OptionOrderTradingSessionDuxo4> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionTradingSessionBottomSheet$lambda$5$lambda$4(OptionOrderTradingSessionPickerDialogFragment optionOrderTradingSessionPickerDialogFragment) {
        optionOrderTradingSessionPickerDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult OptionTradingSessionBottomSheet$lambda$8$lambda$7(OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo, OptionOrderTradingSessionPickerDialogFragment optionOrderTradingSessionPickerDialogFragment, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = optionOrderTradingSessionDuxo.bind(((Args) INSTANCE.getArgs((Fragment) optionOrderTradingSessionPickerDialogFragment)).getUnderlyingType());
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment$OptionTradingSessionBottomSheet$lambda$8$lambda$7$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* compiled from: OptionOrderTradingSessionPickerDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionPickerDialogFragment$Args;", "Landroid/os/Parcelable;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "chainIdForLogging", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/util/UUID;)V", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getChainIdForLogging", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID chainIdForLogging;
        private final OptionChain.UnderlyingType underlyingType;

        /* compiled from: OptionOrderTradingSessionPickerDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(OptionChain.UnderlyingType.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionChain.UnderlyingType underlyingType, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                underlyingType = args.underlyingType;
            }
            if ((i & 2) != 0) {
                uuid = args.chainIdForLogging;
            }
            return args.copy(underlyingType, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getChainIdForLogging() {
            return this.chainIdForLogging;
        }

        public final Args copy(OptionChain.UnderlyingType underlyingType, UUID chainIdForLogging) {
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            Intrinsics.checkNotNullParameter(chainIdForLogging, "chainIdForLogging");
            return new Args(underlyingType, chainIdForLogging);
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
            return this.underlyingType == args.underlyingType && Intrinsics.areEqual(this.chainIdForLogging, args.chainIdForLogging);
        }

        public int hashCode() {
            return (this.underlyingType.hashCode() * 31) + this.chainIdForLogging.hashCode();
        }

        public String toString() {
            return "Args(underlyingType=" + this.underlyingType + ", chainIdForLogging=" + this.chainIdForLogging + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.underlyingType.name());
            dest.writeSerializable(this.chainIdForLogging);
        }

        public Args(OptionChain.UnderlyingType underlyingType, UUID chainIdForLogging) {
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            Intrinsics.checkNotNullParameter(chainIdForLogging, "chainIdForLogging");
            this.underlyingType = underlyingType;
            this.chainIdForLogging = chainIdForLogging;
        }

        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        public final UUID getChainIdForLogging() {
            return this.chainIdForLogging;
        }
    }

    /* compiled from: OptionOrderTradingSessionPickerDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionPickerDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionPickerDialogFragment;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionPickerDialogFragment$Args;", "<init>", "()V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOrderTradingSessionPickerDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOrderTradingSessionPickerDialogFragment optionOrderTradingSessionPickerDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOrderTradingSessionPickerDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOrderTradingSessionPickerDialogFragment newInstance(Args args) {
            return (OptionOrderTradingSessionPickerDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOrderTradingSessionPickerDialogFragment optionOrderTradingSessionPickerDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOrderTradingSessionPickerDialogFragment, args);
        }
    }
}
