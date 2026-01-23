package com.robinhood.android.common.recurring.assetSelection;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.RecurringInvestmentCategory;
import com.robinhood.recurring.models.RecurringInvestmentCategory2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: RecurringAssetCategorySelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u0001:\u0003456B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\r\u0010+\u001a\u00020(H\u0017¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020(2\u0006\u00102\u001a\u000203H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u00060\u001fj\u0002` 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00067²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "duxo", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getEventDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Content", "viewState", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionViewState;", "(Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionViewState;Landroidx/compose/runtime/Composer;I)V", "onSelectAssetCategory", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/recurring/models/RecurringInvestmentSelection;", "Callbacks", "Args", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringAssetCategorySelectionFragment extends GenericComposeFragment {
    public EventLogger eventLogger;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringAssetCategorySelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RecurringAssetCategorySelectionDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final Screen screen = new Screen(Screen.Name.RECURRING_ASSET_TYPE_SELECTION, null, null, null, 14, null);

    /* compiled from: RecurringAssetCategorySelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Callbacks;", "", "assetCategorySelected", "", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/recurring/models/RecurringInvestmentSelection;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void assetCategorySelected(RecurringInvestmentCategory2 category);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RecurringAssetCategorySelectionFragment recurringAssetCategorySelectionFragment, int i, Composer composer, int i2) {
        recurringAssetCategorySelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(RecurringAssetCategorySelectionFragment recurringAssetCategorySelectionFragment, RecurringAssetCategorySelectionViewState recurringAssetCategorySelectionViewState, int i, Composer composer, int i2) {
        recurringAssetCategorySelectionFragment.Content(recurringAssetCategorySelectionViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final RhyGlobalLoggingContext getRhyGlobalLoggingContext() {
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext;
        if (rhyGlobalLoggingContext != null) {
            return rhyGlobalLoggingContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyGlobalLoggingContext");
        return null;
    }

    public final void setRhyGlobalLoggingContext(RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "<set-?>");
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
    }

    private final RecurringAssetCategorySelectionDuxo getDuxo() {
        return (RecurringAssetCategorySelectionDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Context getEventContext() {
        RecurringContext.ScheduleFrequency scheduleFrequency = RecurringContext.ScheduleFrequency.PAYCHECK;
        RecurringContext.AssetType assetType = RecurringContext.AssetType.BROKERAGE_CASH;
        Companion companion = INSTANCE;
        String str = null;
        Screen screen = null;
        String str2 = null;
        RecurringContext recurringContext = new RecurringContext(null, ((Args) companion.getArgs((Fragment) this)).getLoggingEntryPoint(), ((Args) companion.getArgs((Fragment) this)).getSource(), scheduleFrequency, RecurringContext.RecurringFundsSource.DIRECT_DEPOSIT, 0.0d, assetType, null, 0.0d, null, null, 1953, null);
        return new Context(0, 0, 0, null, null, null, null, null, 0, str, null, null, screen, str2, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, RhyGlobalLoggingContext.rhyContext$default(getRhyGlobalLoggingContext(), RHYContext.ProductArea.CASH_ACCOUNTS, null, null, 6, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -2049, -1, -1, -1, 16383, null);
    }

    private final UserInteractionEventDescriptor getEventDescriptor() {
        return new UserInteractionEventDescriptor(null, this.screen, null, getEventContext(), null, null, 53, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getRhyGlobalLoggingContext().refresh();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(127070523);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127070523, i2, -1, "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment.ComposeContent (RecurringAssetCategorySelectionFragment.kt:70)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(getEventDescriptor(), ComposableLambda3.rememberComposableLambda(-686953936, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-686953936, i3, -1, "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment.ComposeContent.<anonymous> (RecurringAssetCategorySelectionFragment.kt:75)");
                    }
                    final RecurringAssetCategorySelectionFragment recurringAssetCategorySelectionFragment = RecurringAssetCategorySelectionFragment.this;
                    final SnapshotState4<RecurringAssetCategorySelectionViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1126364229, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1126364229, i4, -1, "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment.ComposeContent.<anonymous>.<anonymous> (RecurringAssetCategorySelectionFragment.kt:76)");
                            }
                            recurringAssetCategorySelectionFragment.Content(RecurringAssetCategorySelectionFragment.ComposeContent$lambda$0(snapshotState4), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Content(final RecurringAssetCategorySelectionViewState recurringAssetCategorySelectionViewState, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(796086208);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(recurringAssetCategorySelectionViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(796086208, i2, -1, "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment.Content (RecurringAssetCategorySelectionFragment.kt:82)");
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), getEventDescriptor(), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            SweepsStatus sweepsStatus = recurringAssetCategorySelectionViewState.getSweepsStatus();
            BigDecimal retirementMatchRate = recurringAssetCategorySelectionViewState.getRetirementMatchRate();
            Money retirementRemainingToLimit = recurringAssetCategorySelectionViewState.getRetirementRemainingToLimit();
            Money retirementRemainingToLimit2 = recurringAssetCategorySelectionViewState.getRetirementRemainingToLimit();
            String brokerageAccountNumber = recurringAssetCategorySelectionViewState.getBrokerageAccountNumber();
            String rothIraAccountNumber = recurringAssetCategorySelectionViewState.getRothIraAccountNumber();
            String traditionalIraAccountNumber = recurringAssetCategorySelectionViewState.getTraditionalIraAccountNumber();
            boolean hasGoldSubscription = recurringAssetCategorySelectionViewState.getHasGoldSubscription();
            boolean brokerageCashOptionEnabled = recurringAssetCategorySelectionViewState.getBrokerageCashOptionEnabled();
            boolean retirementCashOptionEnabled = recurringAssetCategorySelectionViewState.getRetirementCashOptionEnabled();
            boolean investmentOptionEnabled = recurringAssetCategorySelectionViewState.getInvestmentOptionEnabled();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RecurringAssetCategorySelectionFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            RecurringAssetCategorySelectionV2Composable7.RecurringAssetCategorySelectionV2Composable(sweepsStatus, retirementMatchRate, retirementRemainingToLimit, retirementRemainingToLimit2, brokerageAccountNumber, rothIraAccountNumber, traditionalIraAccountNumber, hasGoldSubscription, brokerageCashOptionEnabled, retirementCashOptionEnabled, investmentOptionEnabled, (Function1) ((KFunction) objRememberedValue), modifierAutoLogEvents$default, composer2, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringAssetCategorySelectionFragment.Content$lambda$3(this.f$0, recurringAssetCategorySelectionViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringAssetCategorySelectionViewState ComposeContent$lambda$0(SnapshotState4<RecurringAssetCategorySelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectAssetCategory(RecurringInvestmentCategory2 category) {
        UserInteractionEventData.Action action;
        if (category instanceof RecurringInvestmentCategory.Investments) {
            action = UserInteractionEventData.Action.RECURRING_SELECT_INVESTMENTS;
        } else if (category instanceof RecurringInvestmentCategory.BrokerageCash) {
            action = UserInteractionEventData.Action.RECURRING_SELECT_BROKERAGE_CASH;
        } else if (category instanceof RecurringInvestmentCategory.RothIra) {
            action = UserInteractionEventData.Action.RECURRING_SELECT_ROTH_IRA;
        } else if (category instanceof RecurringInvestmentCategory.TraditionalIra) {
            action = UserInteractionEventData.Action.RECURRING_SELECT_TRADITIONAL_IRA;
        } else {
            if (!(category instanceof RecurringInvestmentCategory2.RetirementSetUp)) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.RECURRING_SELECT_RETIREMENT_SIGN_UP;
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), action, this.screen, null, null, getEventContext(), false, 44, null);
        getCallbacks().assetCategorySelected(category);
    }

    /* compiled from: RecurringAssetCategorySelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Args;", "Landroid/os/Parcelable;", "userSweepEligible", "", "loggingEntryPoint", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "source", "", "brokerageCashOptionEnabled", "retirementCashOptionEnabled", "investmentOptionEnabled", "<init>", "(ZLcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Ljava/lang/String;ZZZ)V", "getUserSweepEligible", "()Z", "getLoggingEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "getSource", "()Ljava/lang/String;", "getBrokerageCashOptionEnabled", "getRetirementCashOptionEnabled", "getInvestmentOptionEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean brokerageCashOptionEnabled;
        private final boolean investmentOptionEnabled;
        private final RecurringContext.EntryPoint loggingEntryPoint;
        private final boolean retirementCashOptionEnabled;
        private final String source;
        private final boolean userSweepEligible;

        /* compiled from: RecurringAssetCategorySelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                RecurringContext.EntryPoint entryPointValueOf = RecurringContext.EntryPoint.valueOf(parcel.readString());
                boolean z5 = true;
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Args(z4, entryPointValueOf, string2, z5, z2, z3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, RecurringContext.EntryPoint entryPoint, String str, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.userSweepEligible;
            }
            if ((i & 2) != 0) {
                entryPoint = args.loggingEntryPoint;
            }
            if ((i & 4) != 0) {
                str = args.source;
            }
            if ((i & 8) != 0) {
                z2 = args.brokerageCashOptionEnabled;
            }
            if ((i & 16) != 0) {
                z3 = args.retirementCashOptionEnabled;
            }
            if ((i & 32) != 0) {
                z4 = args.investmentOptionEnabled;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            return args.copy(z, entryPoint, str, z2, z5, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUserSweepEligible() {
            return this.userSweepEligible;
        }

        /* renamed from: component2, reason: from getter */
        public final RecurringContext.EntryPoint getLoggingEntryPoint() {
            return this.loggingEntryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getBrokerageCashOptionEnabled() {
            return this.brokerageCashOptionEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getRetirementCashOptionEnabled() {
            return this.retirementCashOptionEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getInvestmentOptionEnabled() {
            return this.investmentOptionEnabled;
        }

        public final Args copy(boolean userSweepEligible, RecurringContext.EntryPoint loggingEntryPoint, String source, boolean brokerageCashOptionEnabled, boolean retirementCashOptionEnabled, boolean investmentOptionEnabled) {
            Intrinsics.checkNotNullParameter(loggingEntryPoint, "loggingEntryPoint");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(userSweepEligible, loggingEntryPoint, source, brokerageCashOptionEnabled, retirementCashOptionEnabled, investmentOptionEnabled);
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
            return this.userSweepEligible == args.userSweepEligible && this.loggingEntryPoint == args.loggingEntryPoint && Intrinsics.areEqual(this.source, args.source) && this.brokerageCashOptionEnabled == args.brokerageCashOptionEnabled && this.retirementCashOptionEnabled == args.retirementCashOptionEnabled && this.investmentOptionEnabled == args.investmentOptionEnabled;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.userSweepEligible) * 31) + this.loggingEntryPoint.hashCode()) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.brokerageCashOptionEnabled)) * 31) + Boolean.hashCode(this.retirementCashOptionEnabled)) * 31) + Boolean.hashCode(this.investmentOptionEnabled);
        }

        public String toString() {
            return "Args(userSweepEligible=" + this.userSweepEligible + ", loggingEntryPoint=" + this.loggingEntryPoint + ", source=" + this.source + ", brokerageCashOptionEnabled=" + this.brokerageCashOptionEnabled + ", retirementCashOptionEnabled=" + this.retirementCashOptionEnabled + ", investmentOptionEnabled=" + this.investmentOptionEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.userSweepEligible ? 1 : 0);
            dest.writeString(this.loggingEntryPoint.name());
            dest.writeString(this.source);
            dest.writeInt(this.brokerageCashOptionEnabled ? 1 : 0);
            dest.writeInt(this.retirementCashOptionEnabled ? 1 : 0);
            dest.writeInt(this.investmentOptionEnabled ? 1 : 0);
        }

        public Args(boolean z, RecurringContext.EntryPoint loggingEntryPoint, String source, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(loggingEntryPoint, "loggingEntryPoint");
            Intrinsics.checkNotNullParameter(source, "source");
            this.userSweepEligible = z;
            this.loggingEntryPoint = loggingEntryPoint;
            this.source = source;
            this.brokerageCashOptionEnabled = z2;
            this.retirementCashOptionEnabled = z3;
            this.investmentOptionEnabled = z4;
        }

        public final boolean getUserSweepEligible() {
            return this.userSweepEligible;
        }

        public final RecurringContext.EntryPoint getLoggingEntryPoint() {
            return this.loggingEntryPoint;
        }

        public /* synthetic */ Args(boolean z, RecurringContext.EntryPoint entryPoint, String str, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, entryPoint, (i & 4) != 0 ? "" : str, z2, z3, z4);
        }

        public final String getSource() {
            return this.source;
        }

        public final boolean getBrokerageCashOptionEnabled() {
            return this.brokerageCashOptionEnabled;
        }

        public final boolean getRetirementCashOptionEnabled() {
            return this.retirementCashOptionEnabled;
        }

        public final boolean getInvestmentOptionEnabled() {
            return this.investmentOptionEnabled;
        }
    }

    /* compiled from: RecurringAssetCategorySelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringAssetCategorySelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringAssetCategorySelectionFragment recurringAssetCategorySelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringAssetCategorySelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringAssetCategorySelectionFragment newInstance(Args args) {
            return (RecurringAssetCategorySelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringAssetCategorySelectionFragment recurringAssetCategorySelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringAssetCategorySelectionFragment, args);
        }
    }
}
