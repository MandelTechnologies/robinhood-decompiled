package com.robinhood.android.futures.trade.p147ui.ordertype;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.futures.contracts.FuturesTradeActivityKey;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.p147ui.ordertype.FuturesOrderTypeFragment;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
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
import kotlin.reflect.KProperty;

/* compiled from: FuturesOrderTypeFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0002\u001f B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\r\u0010\u0016\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!²\u0006\n\u0010\"\u001a\u00020#X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDuxo;", "getDuxo", "()Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-futures-trade_externalDebug", "viewState", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FuturesOrderTypeFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(FuturesTradingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof FuturesOrderTypeFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FuturesOrderTypeDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FuturesOrderTypeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FuturesOrderTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeFragment$Callbacks;", "", "onOrderTypeSelected", "", "newOrderType", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "newOrderTrigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderTypeSelected(FuturesOrderType newOrderType, FuturesOrderTrigger newOrderTrigger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(FuturesOrderTypeFragment futuresOrderTypeFragment, int i, Composer composer, int i2) {
        futuresOrderTypeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FuturesOrderTypeDuxo getDuxo() {
        return (FuturesOrderTypeDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(8);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, requireBaseActivity().getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderTypeFragment.onStart$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(FuturesOrderTypeFragment futuresOrderTypeFragment, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        futuresOrderTypeFragment.getDuxo().setIsDay(overlay == DayNightOverlay.DAY);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1201056261);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201056261, i2, -1, "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment.ComposeContent (FuturesOrderTypeFragment.kt:57)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2111209552, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(2111209552, i3, -1, "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment.ComposeContent.<anonymous> (FuturesOrderTypeFragment.kt:61)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                    Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE);
                    final FuturesOrderTypeFragment futuresOrderTypeFragment = FuturesOrderTypeFragment.this;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, ComposableLambda3.rememberComposableLambda(227062548, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(227062548, i5, -1, "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment.ComposeContent.<anonymous>.<anonymous> (FuturesOrderTypeFragment.kt:66)");
                            }
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(FuturesOrderTypeFragment2.INSTANCE.getLambda$416601601$feature_futures_trade_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1408949931, true, new C501631(futuresOrderTypeFragment), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: FuturesOrderTypeFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$ComposeContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C501631 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ FuturesOrderTypeFragment this$0;

                            C501631(FuturesOrderTypeFragment futuresOrderTypeFragment) {
                                this.this$0 = futuresOrderTypeFragment;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
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
                                    ComposerKt.traceEventStart(-1408949931, i, -1, "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (FuturesOrderTypeFragment.kt:69)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final FuturesOrderTypeFragment futuresOrderTypeFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return FuturesOrderTypeFragment.C176461.AnonymousClass1.C501631.invoke$lambda$1$lambda$0(futuresOrderTypeFragment);
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

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(FuturesOrderTypeFragment futuresOrderTypeFragment) {
                                futuresOrderTypeFragment.requireBaseActivity().onBackPressed();
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-2093917089, true, new AnonymousClass2(FuturesOrderTypeFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 805306416, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: FuturesOrderTypeFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$ComposeContent$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<FuturesOrderTypeViewState> $viewState$delegate;
                    final /* synthetic */ FuturesOrderTypeFragment this$0;

                    AnonymousClass2(FuturesOrderTypeFragment futuresOrderTypeFragment, SnapshotState4<FuturesOrderTypeViewState> snapshotState4) {
                        this.this$0 = futuresOrderTypeFragment;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) throws Resources.NotFoundException {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:37:0x0171  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x0206  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x0296  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) throws Resources.NotFoundException {
                        int i2;
                        String string2;
                        String string3;
                        String string4;
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
                            ComposerKt.traceEventStart(-2093917089, i2, -1, "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment.ComposeContent.<anonymous>.<anonymous> (FuturesOrderTypeFragment.kt:75)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.systemBarsPadding(companion), 0.0f, 1, null), paddingValues);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierPadding, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                        final FuturesOrderTypeFragment futuresOrderTypeFragment = this.this$0;
                        SnapshotState4<FuturesOrderTypeViewState> snapshotState4 = this.$viewState$delegate;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
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
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_type_label, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                        BentoBaseRowState.Start.Drawable drawable = new BentoBaseRowState.Start.Drawable(FuturesOrderTypeFragment.ComposeContent$lambda$1(snapshotState4).getMarketOrder().getDrawable(), null, null, null, null, 30, null);
                        String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_market_order_label, composer, 0);
                        StringResource description = FuturesOrderTypeFragment.ComposeContent$lambda$1(snapshotState4).getMarketOrder().getDescription();
                        if (description != null) {
                            Resources resources = futuresOrderTypeFragment.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            CharSequence text = description.getText(resources);
                            string2 = text != null ? text.toString() : null;
                        }
                        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) drawable, strStringResource, string2, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(futuresOrderTypeFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FuturesOrderTypeFragment.C176461.AnonymousClass2.invoke$lambda$6$lambda$1$lambda$0(futuresOrderTypeFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        int i4 = BentoBaseRowState.$stable;
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, true, 0L, (Function0) objRememberedValue, composer, (i4 << 3) | 24576, 45);
                        BentoBaseRowState.Start.Drawable drawable2 = new BentoBaseRowState.Start.Drawable(FuturesOrderTypeFragment.ComposeContent$lambda$1(snapshotState4).getLimitOrder().getDrawable(), null, null, null, null, 30, null);
                        String strStringResource2 = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_limit_order_label, composer, 0);
                        StringResource description2 = FuturesOrderTypeFragment.ComposeContent$lambda$1(snapshotState4).getLimitOrder().getDescription();
                        if (description2 != null) {
                            Resources resources2 = futuresOrderTypeFragment.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                            CharSequence text2 = description2.getText(resources2);
                            string3 = text2 != null ? text2.toString() : null;
                        }
                        BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState((BentoBaseRowState.Start) drawable2, strStringResource2, string3, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(futuresOrderTypeFragment);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$ComposeContent$1$2$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FuturesOrderTypeFragment.C176461.AnonymousClass2.invoke$lambda$6$lambda$3$lambda$2(futuresOrderTypeFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState2, false, false, true, 0L, (Function0) objRememberedValue2, composer, (i4 << 3) | 24576, 45);
                        BentoBaseRowState.Start.Drawable drawable3 = new BentoBaseRowState.Start.Drawable(FuturesOrderTypeFragment.ComposeContent$lambda$1(snapshotState4).getStopOrder().getDrawable(), null, null, null, null, 30, null);
                        String strStringResource3 = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_stop_order_label, composer, 0);
                        StringResource description3 = FuturesOrderTypeFragment.ComposeContent$lambda$1(snapshotState4).getStopOrder().getDescription();
                        if (description3 != null) {
                            Resources resources3 = futuresOrderTypeFragment.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                            CharSequence text3 = description3.getText(resources3);
                            string4 = text3 != null ? text3.toString() : null;
                        }
                        BentoBaseRowState bentoBaseRowState3 = new BentoBaseRowState((BentoBaseRowState.Start) drawable3, strStringResource3, string4, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(futuresOrderTypeFragment);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$ComposeContent$1$2$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FuturesOrderTypeFragment.C176461.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4(futuresOrderTypeFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState3, false, false, true, 0L, (Function0) objRememberedValue3, composer, (i4 << 3) | 24576, 45);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$1$lambda$0(FuturesOrderTypeFragment futuresOrderTypeFragment) {
                        futuresOrderTypeFragment.getCallbacks().onOrderTypeSelected(FuturesOrderType.MARKET, FuturesOrderTrigger.IMMEDIATE);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$3$lambda$2(FuturesOrderTypeFragment futuresOrderTypeFragment) {
                        futuresOrderTypeFragment.getCallbacks().onOrderTypeSelected(FuturesOrderType.LIMIT, FuturesOrderTrigger.IMMEDIATE);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4(FuturesOrderTypeFragment futuresOrderTypeFragment) {
                        futuresOrderTypeFragment.getCallbacks().onOrderTypeSelected(FuturesOrderType.MARKET, FuturesOrderTrigger.STOP);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesOrderTypeFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesOrderTypeViewState ComposeContent$lambda$1(SnapshotState4<FuturesOrderTypeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: FuturesOrderTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeFragment;", "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData$OrderForm;", "<init>", "()V", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<FuturesOrderTypeFragment, FuturesTradeActivityKey.TradeData.OrderForm> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FuturesTradeActivityKey.TradeData.OrderForm getArgs(FuturesOrderTypeFragment futuresOrderTypeFragment) {
            return (FuturesTradeActivityKey.TradeData.OrderForm) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, futuresOrderTypeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FuturesOrderTypeFragment newInstance(FuturesTradeActivityKey.TradeData.OrderForm orderForm) {
            return (FuturesOrderTypeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, orderForm);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FuturesOrderTypeFragment futuresOrderTypeFragment, FuturesTradeActivityKey.TradeData.OrderForm orderForm) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, futuresOrderTypeFragment, orderForm);
        }
    }
}
