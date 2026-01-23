package com.robinhood.android.equitydetail.p123ui.chartIntervals;

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
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equities.contracts.InstrumentChartIntervalsKey;
import com.robinhood.android.equitydetail.p123ui.chartIntervals.InstrumentChartIntervalsDialogFragment;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentChartIntervalsDialogFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDuxo;", "getDuxo", "()Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getScreenEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-equity-detail_externalDebug", "viewState", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentChartIntervalsDialogFragment extends GenericComposeBottomSheetDialogFragment implements AutoLoggableFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InstrumentChartIntervalsDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(InstrumentChartIntervalsDialogFragment instrumentChartIntervalsDialogFragment, int i, Composer composer, int i2) {
        instrumentChartIntervalsDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* compiled from: InstrumentChartIntervalsDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDialogFragment;", "Lcom/robinhood/android/equities/contracts/InstrumentChartIntervalsKey;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<InstrumentChartIntervalsDialogFragment, InstrumentChartIntervalsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public InstrumentChartIntervalsDialogFragment createDialogFragment(InstrumentChartIntervalsKey instrumentChartIntervalsKey) {
            return (InstrumentChartIntervalsDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, instrumentChartIntervalsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InstrumentChartIntervalsKey getArgs(InstrumentChartIntervalsDialogFragment instrumentChartIntervalsDialogFragment) {
            return (InstrumentChartIntervalsKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, instrumentChartIntervalsDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InstrumentChartIntervalsDialogFragment newInstance(InstrumentChartIntervalsKey instrumentChartIntervalsKey) {
            return (InstrumentChartIntervalsDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, instrumentChartIntervalsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InstrumentChartIntervalsDialogFragment instrumentChartIntervalsDialogFragment, InstrumentChartIntervalsKey instrumentChartIntervalsKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, instrumentChartIntervalsDialogFragment, instrumentChartIntervalsKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstrumentChartIntervalsDuxo getDuxo() {
        return (InstrumentChartIntervalsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return ((InstrumentChartIntervalsKey) INSTANCE.getArgs((Fragment) this)).getScreen();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return new Component(Component.ComponentType.BOTTOM_SHEET, "custom-interval-menu", null, 4, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1523817559);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1523817559, i2, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDialogFragment.ComposeContent (InstrumentChartIntervalsDialogFragment.kt:39)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, ((InstrumentChartIntervalsKey) INSTANCE.getArgs((Fragment) this)).getScreen(), null, null, getScreenEventComponent(), null, 45, null), ComposableLambda3.rememberComposableLambda(197400276, true, new C154561(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentChartIntervalsDialogFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InstrumentChartIntervalsDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDialogFragment$ComposeContent$1 */
    static final class C154561 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<InstrumentChartIntervalsStateProvider3> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C154561(SnapshotState4<? extends InstrumentChartIntervalsStateProvider3> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(197400276, i, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDialogFragment.ComposeContent.<anonymous> (InstrumentChartIntervalsDialogFragment.kt:47)");
            }
            boolean candlesticks = ((InstrumentChartIntervalsKey) InstrumentChartIntervalsDialogFragment.INSTANCE.getArgs((Fragment) InstrumentChartIntervalsDialogFragment.this)).getCandlesticks();
            InstrumentChartIntervalsStateProvider3 instrumentChartIntervalsStateProvider3ComposeContent$lambda$0 = InstrumentChartIntervalsDialogFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(InstrumentChartIntervalsDialogFragment.this);
            final InstrumentChartIntervalsDialogFragment instrumentChartIntervalsDialogFragment = InstrumentChartIntervalsDialogFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstrumentChartIntervalsDialogFragment.C154561.invoke$lambda$1$lambda$0(instrumentChartIntervalsDialogFragment, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            InstrumentChartIntervalsComposable.InstrumentChartIntervalsComposable(candlesticks, instrumentChartIntervalsStateProvider3ComposeContent$lambda$0, (Function1) objRememberedValue, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(InstrumentChartIntervalsDialogFragment instrumentChartIntervalsDialogFragment, String intervalId) {
            Intrinsics.checkNotNullParameter(intervalId, "intervalId");
            instrumentChartIntervalsDialogFragment.getDuxo().onIntervalSelected(intervalId);
            instrumentChartIntervalsDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentChartIntervalsStateProvider3 ComposeContent$lambda$0(SnapshotState4<? extends InstrumentChartIntervalsStateProvider3> snapshotState4) {
        return snapshotState4.getValue();
    }
}
