package com.robinhood.android.tradingtrends.p264ui.details;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.Overscroll4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.equities.contracts.tradingtrends.TradingTrendsDetailsContract;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSection;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionDuxo;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import com.robinhood.android.tradingtrends.p264ui.details.TradingTrendsDetailsFragment;
import com.robinhood.android.tradingtrends.p264ui.details.table.TradingTrendsTableComposableKt;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradingTrendsDetailsFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\r\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "getTradingTrendsDetailsLogging", "()Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "setTradingTrendsDetailsLogging", "(Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;)V", "sectionDuxo", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDuxo;", "getSectionDuxo", "()Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDuxo;", "sectionDuxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDestroy", "Companion", "lib-trading-trends_externalDebug", "sectionViewState", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "segmentSelected", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TradingTrendsDetailsFragment extends GenericComposeFragment {
    private static final String HOST = "trading_trends";
    private static final String INSTRUMENT_ID = "instrument_id";
    private static final String SCHEME = "robinhood";

    /* renamed from: sectionDuxo$delegate, reason: from kotlin metadata */
    private final Lazy sectionDuxo = DuxosKt.duxo(this, TradingTrendsChartSectionDuxo.class);
    public TradingTrendsDetailsLogging tradingTrendsDetailsLogging;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(TradingTrendsDetailsFragment tradingTrendsDetailsFragment, int i, Composer composer, int i2) {
        tradingTrendsDetailsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    @SuppressLint({"MissingSuperCall"})
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
    }

    public final TradingTrendsDetailsLogging getTradingTrendsDetailsLogging() {
        TradingTrendsDetailsLogging tradingTrendsDetailsLogging = this.tradingTrendsDetailsLogging;
        if (tradingTrendsDetailsLogging != null) {
            return tradingTrendsDetailsLogging;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tradingTrendsDetailsLogging");
        return null;
    }

    public final void setTradingTrendsDetailsLogging(TradingTrendsDetailsLogging tradingTrendsDetailsLogging) {
        Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "<set-?>");
        this.tradingTrendsDetailsLogging = tradingTrendsDetailsLogging;
    }

    /* compiled from: TradingTrendsDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsFragment;", "Lcom/robinhood/android/equities/contracts/tradingtrends/TradingTrendsDetailsContract$Key;", "<init>", "()V", "SCHEME", "", "HOST", "INSTRUMENT_ID", "supportsDeepLink", "", "uri", "instrumentId", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TradingTrendsDetailsFragment, TradingTrendsDetailsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(TradingTrendsDetailsContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TradingTrendsDetailsContract.Key getArgs(TradingTrendsDetailsFragment tradingTrendsDetailsFragment) {
            return (TradingTrendsDetailsContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, tradingTrendsDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TradingTrendsDetailsFragment newInstance(TradingTrendsDetailsContract.Key key) {
            return (TradingTrendsDetailsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TradingTrendsDetailsFragment tradingTrendsDetailsFragment, TradingTrendsDetailsContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, tradingTrendsDetailsFragment, key);
        }

        public final boolean supportsDeepLink(String uri, String instrumentId) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Uri uri2 = Uri.parse(uri);
            return Intrinsics.areEqual(uri2.getScheme(), TradingTrendsDetailsFragment.SCHEME) && Intrinsics.areEqual(uri2.getHost(), TradingTrendsDetailsFragment.HOST) && Intrinsics.areEqual(uri2.getQueryParameter(TradingTrendsDetailsFragment.INSTRUMENT_ID), instrumentId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradingTrendsChartSectionDuxo getSectionDuxo() {
        return (TradingTrendsChartSectionDuxo) this.sectionDuxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TradingTrendsChartSectionDuxo sectionDuxo = getSectionDuxo();
        Companion companion = INSTANCE;
        sectionDuxo.bind(((TradingTrendsDetailsContract.Key) companion.getArgs((Fragment) this)).getInstrumentId(), true, ((TradingTrendsDetailsContract.Key) companion.getArgs((Fragment) this)).getInitialType());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-75010692);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-75010692, i2, -1, "com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment.ComposeContent (TradingTrendsDetailsFragment.kt:77)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getSectionDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(((TradingTrendsDetailsContract.Key) INSTANCE.getArgs((Fragment) this)).getInitialType(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            View viewRequireView = requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(viewRequireView)), null, ComposableLambda3.rememberComposableLambda(-510333394, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-510333394, i3, -1, "com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment.ComposeContent.<anonymous> (TradingTrendsDetailsFragment.kt:83)");
                    }
                    TradingTrendsDetailsLogging tradingTrendsDetailsLogging = TradingTrendsDetailsFragment.this.getTradingTrendsDetailsLogging();
                    Companion companion = TradingTrendsDetailsFragment.INSTANCE;
                    String instrumentId = ((TradingTrendsDetailsContract.Key) companion.getArgs((Fragment) TradingTrendsDetailsFragment.this)).getInstrumentId();
                    String strComposeContent$lambda$2 = TradingTrendsDetailsFragment.ComposeContent$lambda$2(snapshotState);
                    if (strComposeContent$lambda$2 == null) {
                        strComposeContent$lambda$2 = "";
                    }
                    tradingTrendsDetailsLogging.detailsPageOpen(strComposeContent$lambda$2, instrumentId);
                    ProvidedValue[] providedValueArr = {LocalNavigator.getLocalNavigator().provides(TradingTrendsDetailsFragment.this.getNavigator()), Overscroll4.getLocalOverscrollFactory().provides(null)};
                    final TradingTrendsDetailsFragment tradingTrendsDetailsFragment = TradingTrendsDetailsFragment.this;
                    final SnapshotState<String> snapshotState2 = snapshotState;
                    final SnapshotState4<TradingTrendsChartSectionState3> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(-496676114, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i4) {
                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-496676114, i4, -1, "com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment.ComposeContent.<anonymous>.<anonymous> (TradingTrendsDetailsFragment.kt:91)");
                            }
                            Screen.Name name = Screen.Name.TRADING_TRENDS;
                            String strComposeContent$lambda$22 = TradingTrendsDetailsFragment.ComposeContent$lambda$2(snapshotState2);
                            if (strComposeContent$lambda$22 == null) {
                                strComposeContent$lambda$22 = "";
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(name, ((TradingTrendsDetailsContract.Key) TradingTrendsDetailsFragment.INSTANCE.getArgs((Fragment) tradingTrendsDetailsFragment)).getInstrumentId(), strComposeContent$lambda$22, null, 8, null), null, null, null, null, 61, null);
                            final TradingTrendsDetailsFragment tradingTrendsDetailsFragment2 = tradingTrendsDetailsFragment;
                            final SnapshotState<String> snapshotState3 = snapshotState2;
                            final SnapshotState4<TradingTrendsChartSectionState3> snapshotState42 = snapshotState4;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1805632921, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i5) {
                                    if ((i5 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1805632921, i5, -1, "com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (TradingTrendsDetailsFragment.kt:100)");
                                    }
                                    TradingTrendsTableComposableKt.TradingTrendsTableComposable(((TradingTrendsDetailsContract.Key) TradingTrendsDetailsFragment.INSTANCE.getArgs((Fragment) tradingTrendsDetailsFragment2)).getInstrumentId(), TradingTrendsDetailsFragment.ComposeContent$lambda$2(snapshotState3), ComposableLambda3.rememberComposableLambda(542451302, true, new C505901(tradingTrendsDetailsFragment2, snapshotState42, snapshotState3), composer5, 54), null, null, composer5, 384, 24);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: TradingTrendsDetailsFragment.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment$ComposeContent$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C505901 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ SnapshotState4<TradingTrendsChartSectionState3> $sectionViewState$delegate;
                                    final /* synthetic */ SnapshotState<String> $segmentSelected$delegate;
                                    final /* synthetic */ TradingTrendsDetailsFragment this$0;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    C505901(TradingTrendsDetailsFragment tradingTrendsDetailsFragment, SnapshotState4<? extends TradingTrendsChartSectionState3> snapshotState4, SnapshotState<String> snapshotState) {
                                        this.this$0 = tradingTrendsDetailsFragment;
                                        this.$sectionViewState$delegate = snapshotState4;
                                        this.$segmentSelected$delegate = snapshotState;
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
                                            ComposerKt.traceEventStart(542451302, i, -1, "com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradingTrendsDetailsFragment.kt:104)");
                                        }
                                        String instrumentId = ((TradingTrendsDetailsContract.Key) TradingTrendsDetailsFragment.INSTANCE.getArgs((Fragment) this.this$0)).getInstrumentId();
                                        TradingTrendsChartSectionState3 tradingTrendsChartSectionState3ComposeContent$lambda$0 = TradingTrendsDetailsFragment.ComposeContent$lambda$0(this.$sectionViewState$delegate);
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                                        final TradingTrendsDetailsFragment tradingTrendsDetailsFragment = this.this$0;
                                        final SnapshotState<String> snapshotState = this.$segmentSelected$delegate;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment$ComposeContent$1$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return TradingTrendsDetailsFragment.C300001.AnonymousClass1.C505891.C505901.invoke$lambda$1$lambda$0(tradingTrendsDetailsFragment, snapshotState, (String) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        TradingTrendsChartSection.TradingTrendsChartSection(instrumentId, tradingTrendsChartSectionState3ComposeContent$lambda$0, null, (Function1) objRememberedValue, null, composer, 0, 20);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(TradingTrendsDetailsFragment tradingTrendsDetailsFragment, SnapshotState snapshotState, String segment) {
                                        Intrinsics.checkNotNullParameter(segment, "segment");
                                        TradingTrendsDetailsFragment.ComposeContent$lambda$3(snapshotState, segment);
                                        tradingTrendsDetailsFragment.getSectionDuxo().onSegmentSelected(segment);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer4, 54), composer4, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                    String instrumentId2 = ((TradingTrendsDetailsContract.Key) companion.getArgs((Fragment) TradingTrendsDetailsFragment.this)).getInstrumentId();
                    composer3.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer3.changedInstance(TradingTrendsDetailsFragment.this);
                    TradingTrendsDetailsFragment tradingTrendsDetailsFragment2 = TradingTrendsDetailsFragment.this;
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new TradingTrendsDetailsFragment2(tradingTrendsDetailsFragment2, null);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(instrumentId2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.details.TradingTrendsDetailsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingTrendsDetailsFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradingTrendsChartSectionState3 ComposeContent$lambda$0(SnapshotState4<? extends TradingTrendsChartSectionState3> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ComposeContent$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$3(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getTradingTrendsDetailsLogging().detailsPageClosed();
        super.onDestroy();
    }
}
