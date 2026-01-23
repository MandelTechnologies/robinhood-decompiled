package com.robinhood.android.portfolio.pnlhub;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
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
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equities.contracts.PnlHubContract;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnlhub.PnlHubFragment;
import com.robinhood.android.portfolio.pnlhub.p216ui.PnlHubComposable5;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: PnlHubFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\r\u0010\u001f\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010 R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00060\u0016j\u0002`\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo;", "getDuxo", "()Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onBackPressed", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-profit-and-loss-hub_externalDebug", "viewState", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PnlHubFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PnlHubDuxo.class);
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$2$lambda$1(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(PnlHubFragment pnlHubFragment, int i, Composer composer, int i2) {
        pnlHubFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PnlHubDuxo getDuxo() {
        return (PnlHubDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.PROFIT_AND_LOSS_HUB, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, new Screen(null, null, ((PnlHubContract.Key) INSTANCE.getArgs((Fragment) this)).getSource(), null, 11, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getDuxo().handleBackPress$feature_profit_and_loss_hub_externalDebug()) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-879051602);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-879051602, i2, -1, "com.robinhood.android.portfolio.pnlhub.PnlHubFragment.ComposeContent (PnlHubFragment.kt:60)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(PnlHubFragment.ComposeContent$lambda$2$lambda$1((SheetValue) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(627779865, true, new C257711(ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue, composerStartRestartGroup, 54, 0), this, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PnlHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1 */
    static final class C257711 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SheetState $bottomSheetState;
        final /* synthetic */ SnapshotState4<PnlHubViewState> $viewState$delegate;
        final /* synthetic */ PnlHubFragment this$0;

        /* JADX WARN: Multi-variable type inference failed */
        C257711(SheetState sheetState, PnlHubFragment pnlHubFragment, SnapshotState4<? extends PnlHubViewState> snapshotState4) {
            this.$bottomSheetState = sheetState;
            this.this$0 = pnlHubFragment;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0296  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x02d3  */
        /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            PnlHubViewState pnlHubViewState;
            boolean zChangedInstance;
            final PnlHubFragment pnlHubFragment;
            Object objRememberedValue;
            boolean zChangedInstance2;
            Flow<Boolean> flow;
            PnlHubDuxo duxo;
            boolean zChangedInstance3;
            Object objRememberedValue2;
            PnlHubDuxo duxo2;
            boolean zChangedInstance4;
            Object objRememberedValue3;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(627779865, i, -1, "com.robinhood.android.portfolio.pnlhub.PnlHubFragment.ComposeContent.<anonymous> (PnlHubFragment.kt:74)");
            }
            PnlHubViewState pnlHubViewStateComposeContent$lambda$0 = PnlHubFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            SheetState sheetState = this.$bottomSheetState;
            Flow<Boolean> refreshTradeItemsFlow = this.this$0.getDuxo().getRefreshTradeItemsFlow();
            BaseActivity baseActivityRequireBaseActivity = this.this$0.requireBaseActivity();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(baseActivityRequireBaseActivity);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new PnlHubFragment2(baseActivityRequireBaseActivity);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue4);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment2 = this.this$0;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubFragment.C257711.invoke$lambda$2$lambda$1(pnlHubFragment2, (PnlHubAssetClass) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function1 function1 = (Function1) objRememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment3 = this.this$0;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubFragment.C257711.invoke$lambda$4$lambda$3(pnlHubFragment3, (PnlHubDataState2) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function1 function12 = (Function1) objRememberedValue6;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment4 = this.this$0;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubFragment.C257711.invoke$lambda$6$lambda$5(pnlHubFragment4, (PnlHubTradeDetailSettings) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            Function1 function13 = (Function1) objRememberedValue7;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment5 = this.this$0;
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance9 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlHubFragment.C257711.invoke$lambda$8$lambda$7(pnlHubFragment5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            Function0 function02 = (Function0) objRememberedValue8;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance10 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment6 = this.this$0;
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChangedInstance10 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubFragment.C257711.invoke$lambda$10$lambda$9(pnlHubFragment6, (DisplaySpan) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            Function1 function14 = (Function1) objRememberedValue9;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance11 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment7 = this.this$0;
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChangedInstance11 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PnlHubFragment.C257711.invoke$lambda$12$lambda$11(pnlHubFragment7, (String) obj, (List) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            Function2 function2 = (Function2) objRememberedValue10;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance12 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment8 = this.this$0;
            Object objRememberedValue11 = composer.rememberedValue();
            if (zChangedInstance12 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlHubFragment.C257711.invoke$lambda$14$lambda$13(pnlHubFragment8);
                    }
                };
                composer.updateRememberedValue(objRememberedValue11);
            }
            Function0 function03 = (Function0) objRememberedValue11;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance13 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment9 = this.this$0;
            Object objRememberedValue12 = composer.rememberedValue();
            if (zChangedInstance13 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubFragment.C257711.invoke$lambda$16$lambda$15(pnlHubFragment9, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue12);
            }
            Function1 function15 = (Function1) objRememberedValue12;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance14 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment10 = this.this$0;
            Object objRememberedValue13 = composer.rememberedValue();
            if (zChangedInstance14 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue13 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubFragment.C257711.invoke$lambda$18$lambda$17(pnlHubFragment10, (Instant) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue13);
            }
            Function1 function16 = (Function1) objRememberedValue13;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance15 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment11 = this.this$0;
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance15) {
                pnlHubViewState = pnlHubViewStateComposeContent$lambda$0;
            } else {
                pnlHubViewState = pnlHubViewStateComposeContent$lambda$0;
                if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                }
                Function0 function04 = (Function0) objRememberedValue14;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                zChangedInstance = composer.changedInstance(this.this$0);
                pnlHubFragment = this.this$0;
                objRememberedValue = composer.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PnlHubFragment.C257711.invoke$lambda$22$lambda$21(pnlHubFragment, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function17 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                zChangedInstance2 = composer.changedInstance(this.this$0);
                final PnlHubFragment pnlHubFragment12 = this.this$0;
                Object objRememberedValue15 = composer.rememberedValue();
                if (zChangedInstance2) {
                    flow = refreshTradeItemsFlow;
                    if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    }
                    Function2 function22 = (Function2) objRememberedValue15;
                    composer.endReplaceGroup();
                    duxo = this.this$0.getDuxo();
                    composer.startReplaceGroup(5004770);
                    zChangedInstance3 = composer.changedInstance(duxo);
                    objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new PnlHubFragment3(duxo);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    Function0 function05 = (Function0) ((KFunction) objRememberedValue2);
                    duxo2 = this.this$0.getDuxo();
                    composer.startReplaceGroup(5004770);
                    zChangedInstance4 = composer.changedInstance(duxo2);
                    objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new PnlHubFragment4(duxo2);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    PnlHubViewState pnlHubViewState2 = pnlHubViewState;
                    PnlHubComposable5.PnlHubComposable(pnlHubViewState2, sheetState, flow, function0, function1, function12, function13, function02, function14, function2, function03, function15, function16, function04, function17, function22, function05, (Function0) ((KFunction) objRememberedValue3), null, composer, 0, 0, 262144);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                flow = refreshTradeItemsFlow;
                objRememberedValue15 = new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PnlHubFragment.C257711.invoke$lambda$24$lambda$23(pnlHubFragment12, (String) obj, (List) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue15);
                Function2 function222 = (Function2) objRememberedValue15;
                composer.endReplaceGroup();
                duxo = this.this$0.getDuxo();
                composer.startReplaceGroup(5004770);
                zChangedInstance3 = composer.changedInstance(duxo);
                objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance3) {
                    objRememberedValue2 = new PnlHubFragment3(duxo);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Function0 function052 = (Function0) ((KFunction) objRememberedValue2);
                duxo2 = this.this$0.getDuxo();
                composer.startReplaceGroup(5004770);
                zChangedInstance4 = composer.changedInstance(duxo2);
                objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance4) {
                    objRememberedValue3 = new PnlHubFragment4(duxo2);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                PnlHubViewState pnlHubViewState22 = pnlHubViewState;
                PnlHubComposable5.PnlHubComposable(pnlHubViewState22, sheetState, flow, function0, function1, function12, function13, function02, function14, function2, function03, function15, function16, function04, function17, function222, function052, (Function0) ((KFunction) objRememberedValue3), null, composer, 0, 0, 262144);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            objRememberedValue14 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PnlHubFragment.C257711.invoke$lambda$20$lambda$19(pnlHubFragment11);
                }
            };
            composer.updateRememberedValue(objRememberedValue14);
            Function0 function042 = (Function0) objRememberedValue14;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            zChangedInstance = composer.changedInstance(this.this$0);
            pnlHubFragment = this.this$0;
            objRememberedValue = composer.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubFragment.C257711.invoke$lambda$22$lambda$21(pnlHubFragment, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function172 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            zChangedInstance2 = composer.changedInstance(this.this$0);
            final PnlHubFragment pnlHubFragment122 = this.this$0;
            Object objRememberedValue152 = composer.rememberedValue();
            if (zChangedInstance2) {
            }
            objRememberedValue152 = new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubFragment$ComposeContent$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubFragment.C257711.invoke$lambda$24$lambda$23(pnlHubFragment122, (String) obj, (List) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue152);
            Function2 function2222 = (Function2) objRememberedValue152;
            composer.endReplaceGroup();
            duxo = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            zChangedInstance3 = composer.changedInstance(duxo);
            objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance3) {
            }
            composer.endReplaceGroup();
            Function0 function0522 = (Function0) ((KFunction) objRememberedValue2);
            duxo2 = this.this$0.getDuxo();
            composer.startReplaceGroup(5004770);
            zChangedInstance4 = composer.changedInstance(duxo2);
            objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance4) {
            }
            composer.endReplaceGroup();
            PnlHubViewState pnlHubViewState222 = pnlHubViewState;
            PnlHubComposable5.PnlHubComposable(pnlHubViewState222, sheetState, flow, function0, function1, function12, function13, function02, function14, function2, function03, function15, function16, function042, function172, function2222, function0522, (Function0) ((KFunction) objRememberedValue3), null, composer, 0, 0, 262144);
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(PnlHubFragment pnlHubFragment, PnlHubAssetClass it) {
            Intrinsics.checkNotNullParameter(it, "it");
            pnlHubFragment.getDuxo().onAssetClassSelected$feature_profit_and_loss_hub_externalDebug(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(PnlHubFragment pnlHubFragment, PnlHubDataState2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            pnlHubFragment.getDuxo().m2376xbd65bbc4(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(PnlHubFragment pnlHubFragment, PnlHubTradeDetailSettings it) {
            Intrinsics.checkNotNullParameter(it, "it");
            pnlHubFragment.getDuxo().onTradeDetailSettingsSave(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(PnlHubFragment pnlHubFragment) {
            pnlHubFragment.getDuxo().onTradeDetailSettingsBannerDismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(PnlHubFragment pnlHubFragment, DisplaySpan span) {
            Intrinsics.checkNotNullParameter(span, "span");
            pnlHubFragment.getDuxo().onSpanSelected(span);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(PnlHubFragment pnlHubFragment, String groupId, List assetClasses) {
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
            pnlHubFragment.getDuxo().onGroupToggled(groupId, assetClasses);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13(PnlHubFragment pnlHubFragment) {
            pnlHubFragment.getDuxo().onShowAllButtonClicked();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$16$lambda$15(PnlHubFragment pnlHubFragment, boolean z) {
            pnlHubFragment.getDuxo().onChartVisibilityChanged(z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$17(PnlHubFragment pnlHubFragment, Instant it) {
            Intrinsics.checkNotNullParameter(it, "it");
            pnlHubFragment.getDuxo().updateTradeItemsLastRefreshedTimestamp(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$20$lambda$19(PnlHubFragment pnlHubFragment) {
            pnlHubFragment.getDuxo().onDismissErrorDialog();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$22$lambda$21(PnlHubFragment pnlHubFragment, boolean z) {
            pnlHubFragment.getDuxo().updateDebouncedLoadingSpinner(z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$24$lambda$23(PnlHubFragment pnlHubFragment, String groupId, List assetClasses) {
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
            pnlHubFragment.getDuxo().onScroll(groupId, assetClasses);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PnlHubViewState ComposeContent$lambda$0(SnapshotState4<? extends PnlHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: PnlHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubFragment;", "Lcom/robinhood/android/equities/contracts/PnlHubContract$Key;", "<init>", "()V", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PnlHubFragment, PnlHubContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PnlHubContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PnlHubContract.Key getArgs(PnlHubFragment pnlHubFragment) {
            return (PnlHubContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pnlHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PnlHubFragment newInstance(PnlHubContract.Key key) {
            return (PnlHubFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PnlHubFragment pnlHubFragment, PnlHubContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pnlHubFragment, key);
        }
    }
}
