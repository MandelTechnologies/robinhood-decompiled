package com.robinhood.android.mcw.cashbalancedetails;

import android.net.Uri;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.section.HistorySection4;
import com.robinhood.android.common.history.p082ui.section.HistorySectionState;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment;
import com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsState;
import com.robinhood.android.mcw.contracts.CashBalanceDetailsKey;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CashBalanceDetailsFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$²\u0006\n\u0010%\u001a\u00020\u0007X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "hasBottomBar", "getHasBottomBar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsDuxo;", "getDuxo", "()Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Loaded", "vs", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View$Loaded;", "(Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View$Loaded;Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-mcw-cash-balance-details_externalDebug", "isMicrogramLoaded"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CashBalanceDetailsFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(McwRegionGate.INSTANCE);
    private final boolean hasBottomBar = true;
    private final Screen eventScreen = new Screen(Screen.Name.CASH_BALANCES_DETAILS_PAGE, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CashBalanceDetailsDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CashBalanceDetailsFragment cashBalanceDetailsFragment, int i, Composer composer, int i2) {
        cashBalanceDetailsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$1(CashBalanceDetailsFragment cashBalanceDetailsFragment, CashBalanceDetailsState.View.Loaded loaded, int i, Composer composer, int i2) {
        cashBalanceDetailsFragment.Loaded(loaded, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final CashBalanceDetailsDuxo getDuxo() {
        return (CashBalanceDetailsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-515341771);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-515341771, i2, -1, "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.ComposeContent (CashBalanceDetailsFragment.kt:57)");
            }
            CashBalanceDetailsState.View view = (CashBalanceDetailsState.View) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            if (!(view instanceof CashBalanceDetailsState.View.Loading)) {
                if (!(view instanceof CashBalanceDetailsState.View.Loaded)) {
                    throw new NoWhenBranchMatchedException();
                }
                Loaded((CashBalanceDetailsState.View.Loaded) view, composerStartRestartGroup, (i2 << 3) & 112);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CashBalanceDetailsFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void Loaded(final CashBalanceDetailsState.View.Loaded loaded, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1533630436);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533630436, i2, -1, "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded (CashBalanceDetailsFragment.kt:68)");
            }
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-790784729, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded.1
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
                        ComposerKt.traceEventStart(-790784729, i3, -1, "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded.<anonymous> (CashBalanceDetailsFragment.kt:71)");
                    }
                    Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE);
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final CashBalanceDetailsFragment cashBalanceDetailsFragment = CashBalanceDetailsFragment.this;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, ComposableLambda3.rememberComposableLambda(440772843, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded.1.1
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
                                ComposerKt.traceEventStart(440772843, i4, -1, "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded.<anonymous>.<anonymous> (CashBalanceDetailsFragment.kt:75)");
                            }
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(CashBalanceDetailsFragment3.INSTANCE.m2172x60e53485(), null, ComposableLambda3.rememberComposableLambda(1239069548, true, new C502781(cashBalanceDetailsFragment), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CashBalanceDetailsFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$Loaded$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C502781 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ CashBalanceDetailsFragment this$0;

                            C502781(CashBalanceDetailsFragment cashBalanceDetailsFragment) {
                                this.this$0 = cashBalanceDetailsFragment;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(CashBalanceDetailsFragment cashBalanceDetailsFragment) {
                                cashBalanceDetailsFragment.requireBaseActivity().onBackPressed();
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1239069548, i, -1, "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded.<anonymous>.<anonymous>.<anonymous> (CashBalanceDetailsFragment.kt:78)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final CashBalanceDetailsFragment cashBalanceDetailsFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$Loaded$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CashBalanceDetailsFragment.C216601.AnonymousClass1.C502781.invoke$lambda$1$lambda$0(cashBalanceDetailsFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1641778516, true, new AnonymousClass2(loaded, CashBalanceDetailsFragment.this), composer2, 54), null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(-535942922, true, new AnonymousClass3(scrollStateRememberScrollState, CashBalanceDetailsFragment.this, loaded), composer2, 54), composer2, 805306800, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CashBalanceDetailsFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$Loaded$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CashBalanceDetailsState.View.Loaded $vs;
                    final /* synthetic */ CashBalanceDetailsFragment this$0;

                    AnonymousClass2(CashBalanceDetailsState.View.Loaded loaded, CashBalanceDetailsFragment cashBalanceDetailsFragment) {
                        this.$vs = loaded;
                        this.this$0 = cashBalanceDetailsFragment;
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
                            ComposerKt.traceEventStart(-1641778516, i, -1, "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded.<anonymous>.<anonymous> (CashBalanceDetailsFragment.kt:83)");
                        }
                        final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                        Orientation orientation = Orientation.Horizontal;
                        String title = this.$vs.getData().getPrimaryCta().getTitle();
                        String title2 = this.$vs.getData().getSecondaryCta().getTitle();
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(this.$vs) | composer.changedInstance(this.this$0);
                        final CashBalanceDetailsState.View.Loaded loaded = this.$vs;
                        final CashBalanceDetailsFragment cashBalanceDetailsFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$Loaded$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CashBalanceDetailsFragment.C216601.AnonymousClass2.invoke$lambda$1$lambda$0(current, loaded, cashBalanceDetailsFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance2 = composer.changedInstance(current) | composer.changedInstance(this.$vs) | composer.changedInstance(this.this$0);
                        final CashBalanceDetailsState.View.Loaded loaded2 = this.$vs;
                        final CashBalanceDetailsFragment cashBalanceDetailsFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$Loaded$1$2$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CashBalanceDetailsFragment.C216601.AnonymousClass2.invoke$lambda$3$lambda$2(current, loaded2, cashBalanceDetailsFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, orientation, function0, title, false, null, false, (Function0) objRememberedValue2, title2, false, null, false, composer, 196608, 0, 59166);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, CashBalanceDetailsState.View.Loaded loaded, CashBalanceDetailsFragment cashBalanceDetailsFragment) {
                        EventLogger.DefaultImpls.logTap$default(eventLogger, loaded.getData().getPrimaryCta().getLoggingAction(), cashBalanceDetailsFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, loaded.getData().getPrimaryCta().getLoggingIdentifier(), null, 4, null), null, null, false, 56, null);
                        Navigator navigator = cashBalanceDetailsFragment.getNavigator();
                        android.content.Context contextRequireContext = cashBalanceDetailsFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(loaded.getData().getPrimaryCta().getDeeplink()), null, DeepLinkOrigin.Internal.INSTANCE, false, null, 52, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, CashBalanceDetailsState.View.Loaded loaded, CashBalanceDetailsFragment cashBalanceDetailsFragment) {
                        EventLogger.DefaultImpls.logTap$default(eventLogger, loaded.getData().getSecondaryCta().getLoggingAction(), cashBalanceDetailsFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, loaded.getData().getSecondaryCta().getLoggingIdentifier(), null, 4, null), null, null, false, 56, null);
                        Navigator navigator = cashBalanceDetailsFragment.getNavigator();
                        android.content.Context contextRequireContext = cashBalanceDetailsFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(loaded.getData().getSecondaryCta().getDeeplink()), Boolean.FALSE, DeepLinkOrigin.Internal.INSTANCE, false, NavigationType.PRESENT, 16, null);
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: CashBalanceDetailsFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$Loaded$1$3, reason: invalid class name */
                static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ ScrollState $scrollState;
                    final /* synthetic */ CashBalanceDetailsState.View.Loaded $vs;
                    final /* synthetic */ CashBalanceDetailsFragment this$0;

                    AnonymousClass3(ScrollState scrollState, CashBalanceDetailsFragment cashBalanceDetailsFragment, CashBalanceDetailsState.View.Loaded loaded) {
                        this.$scrollState = scrollState;
                        this.this$0 = cashBalanceDetailsFragment;
                        this.$vs = loaded;
                    }

                    private static final boolean invoke$lambda$5$lambda$1(SnapshotState<Boolean> snapshotState) {
                        return snapshotState.getValue().booleanValue();
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-535942922, i2, -1, "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded.<anonymous>.<anonymous> (CashBalanceDetailsFragment.kt:124)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), this.$scrollState, false, null, false, 14, null);
                        CashBalanceDetailsFragment cashBalanceDetailsFragment = this.this$0;
                        final CashBalanceDetailsState.View.Loaded loaded = this.$vs;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objRememberedValue == companion3.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composer.endReplaceGroup();
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
                        RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-mcw-cash-balances", null, 2, null);
                        String str = "{\"account_number\": \"" + ((CashBalanceDetailsKey) CashBalanceDetailsFragment.INSTANCE.getArgs((Fragment) cashBalanceDetailsFragment)).getAccountNumber() + "\"}";
                        FragmentManager childFragmentManager = cashBalanceDetailsFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        CashBalanceDetailsFragment3 cashBalanceDetailsFragment3 = CashBalanceDetailsFragment3.INSTANCE;
                        Function2<Composer, Integer, Unit> function2M2174xa95a3d57 = cashBalanceDetailsFragment3.m2174xa95a3d57();
                        composer.startReplaceGroup(5004770);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion3.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$Loaded$1$3$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CashBalanceDetailsFragment.C216601.AnonymousClass3.invoke$lambda$5$lambda$4$lambda$3(snapshotState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, childFragmentManager, modifierM21623defaultHorizontalPaddingrAjV9yQ, str, function2M2174xa95a3d57, (Function0) objRememberedValue2, null, false, null, composer, 221184, 448);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), composer, 0);
                        composer.startReplaceGroup(-286042973);
                        if (invoke$lambda$5$lambda$1(snapshotState)) {
                            HistorySection4.HistorySection(loaded.getHistoryState(), null, cashBalanceDetailsFragment3.m2173xb57d2b3a(), ComposableLambda3.rememberComposableLambda(-977943900, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$Loaded$1$3$1$2
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
                                        ComposerKt.traceEventStart(-977943900, i3, -1, "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashBalanceDetailsFragment.kt:143)");
                                    }
                                    HistoryRowsKt.DefaultHistoryFooter(null, StringResources_androidKt.stringResource(C21666R.string.mcw_cash_balance_details_history_footer_show_more, composer2, 0), loaded.getHistoryFooterKey(), composer2, 0, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), false, false, false, false, null, composer, HistorySectionState.$stable | 200064, 466);
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    private static final void invoke$lambda$5$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
                        snapshotState.setValue(Boolean.valueOf(z));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState) {
                        invoke$lambda$5$lambda$2(snapshotState, true);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CashBalanceDetailsFragment.Loaded$lambda$1(this.f$0, loaded, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CashBalanceDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsFragment;", "Lcom/robinhood/android/mcw/contracts/CashBalanceDetailsKey;", "<init>", "()V", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CashBalanceDetailsFragment, CashBalanceDetailsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CashBalanceDetailsKey cashBalanceDetailsKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, cashBalanceDetailsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CashBalanceDetailsKey getArgs(CashBalanceDetailsFragment cashBalanceDetailsFragment) {
            return (CashBalanceDetailsKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, cashBalanceDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CashBalanceDetailsFragment newInstance(CashBalanceDetailsKey cashBalanceDetailsKey) {
            return (CashBalanceDetailsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, cashBalanceDetailsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CashBalanceDetailsFragment cashBalanceDetailsFragment, CashBalanceDetailsKey cashBalanceDetailsKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, cashBalanceDetailsFragment, cashBalanceDetailsKey);
        }
    }
}
