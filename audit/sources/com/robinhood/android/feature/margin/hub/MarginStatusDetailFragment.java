package com.robinhood.android.feature.margin.hub;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment;
import com.robinhood.android.feature.margin.hub.MarginStatusDetailState3;
import com.robinhood.android.feature.margin.hub.composables.MarginStatusDetailComposable;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginStatusDetailView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.margin.contracts.MarginInvestingSettingsKey;
import com.robinhood.android.margin.contracts.MarginStatusDetailFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: MarginStatusDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/BuyingPowerHubAction;", "getCallbacks", "()Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-margin-hub_externalDebug", "viewState", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarginStatusDetailFragment extends GenericComposeFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginStatusDetailFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(LeveredMarginRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MarginStatusDetailDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SduiActionHandler.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SduiActionHandler) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(MarginStatusDetailFragment marginStatusDetailFragment, int i, Composer composer, int i2) {
        marginStatusDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final MarginStatusDetailDuxo getDuxo() {
        return (MarginStatusDetailDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SduiActionHandler<BuyingPowerHubAction> getCallbacks() {
        return (SduiActionHandler) this.callbacks.getValue(this, $$delegatedProperties[0]);
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-1631289874);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1631289874, i2, -1, "com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment.ComposeContent (MarginStatusDetailFragment.kt:48)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-859844942, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-859844942, i3, -1, "com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment.ComposeContent.<anonymous> (MarginStatusDetailFragment.kt:52)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(MarginStatusDetailFragment2.INSTANCE.getLambda$269523743$feature_margin_hub_externalDebug(), null, ComposableLambda3.rememberComposableLambda(930593907, true, new AnonymousClass1(MarginStatusDetailFragment.this), composer2, 54), ComposableLambda3.rememberComposableLambda(-1330808236, true, new AnonymousClass2(snapshotState4CollectAsStateWithLifecycle, MarginStatusDetailFragment.this), composer2, 54), null, false, false, AppBarType.DEFAULT, null, 0L, null, composer2, 12586374, 0, 1906);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: MarginStatusDetailFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ MarginStatusDetailFragment this$0;

                    AnonymousClass1(MarginStatusDetailFragment marginStatusDetailFragment) {
                        this.this$0 = marginStatusDetailFragment;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(MarginStatusDetailFragment marginStatusDetailFragment) {
                        BaseActivity baseActivity = marginStatusDetailFragment.getBaseActivity();
                        if (baseActivity != null) {
                            baseActivity.onBackPressed();
                        }
                        return Unit.INSTANCE;
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
                            ComposerKt.traceEventStart(930593907, i, -1, "com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment.ComposeContent.<anonymous>.<anonymous> (MarginStatusDetailFragment.kt:54)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final MarginStatusDetailFragment marginStatusDetailFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MarginStatusDetailFragment.C168361.AnonymousClass1.invoke$lambda$1$lambda$0(marginStatusDetailFragment);
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

                /* compiled from: MarginStatusDetailFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$ComposeContent$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<MarginStatusDetailState3> $viewState$delegate;
                    final /* synthetic */ MarginStatusDetailFragment this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(SnapshotState4<? extends MarginStatusDetailState3> snapshotState4, MarginStatusDetailFragment marginStatusDetailFragment) {
                        this.$viewState$delegate = snapshotState4;
                        this.this$0 = marginStatusDetailFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                        invoke(row5, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1330808236, i, -1, "com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment.ComposeContent.<anonymous>.<anonymous> (MarginStatusDetailFragment.kt:56)");
                        }
                        MarginStatusDetailState3 marginStatusDetailState3ComposeContent$lambda$0 = MarginStatusDetailFragment.ComposeContent$lambda$0(this.$viewState$delegate);
                        final MarginStatusDetailState3.Loaded loaded = marginStatusDetailState3ComposeContent$lambda$0 instanceof MarginStatusDetailState3.Loaded ? (MarginStatusDetailState3.Loaded) marginStatusDetailState3ComposeContent$lambda$0 : null;
                        if (loaded != null) {
                            final MarginStatusDetailFragment marginStatusDetailFragment = this.this$0;
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.SETTINGS_24);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "margin_settings_button", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(marginStatusDetailFragment) | composer.changedInstance(loaded);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MarginStatusDetailFragment.C168361.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(marginStatusDetailFragment, loaded);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(MarginStatusDetailFragment marginStatusDetailFragment, MarginStatusDetailState3.Loaded loaded) {
                        Navigator navigator = marginStatusDetailFragment.getNavigator();
                        Context contextRequireContext = marginStatusDetailFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new MarginInvestingSettingsKey(loaded.getMarginStatusDetailResponse().getAccountNumber(), false), null, false, null, null, 60, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1848593795, true, new C168372(snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginStatusDetailFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginStatusDetailState3 ComposeContent$lambda$0(SnapshotState4<? extends MarginStatusDetailState3> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: MarginStatusDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$ComposeContent$2 */
    static final class C168372 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<MarginStatusDetailState3> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C168372(SnapshotState4<? extends MarginStatusDetailState3> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i2 = (composer.changed(contentPadding) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1848593795, i2, -1, "com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment.ComposeContent.<anonymous> (MarginStatusDetailFragment.kt:88)");
            }
            MarginStatusDetailState3 marginStatusDetailState3ComposeContent$lambda$0 = MarginStatusDetailFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            if (marginStatusDetailState3ComposeContent$lambda$0 instanceof MarginStatusDetailState3.Failure) {
                composer.startReplaceGroup(-1386962707);
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, contentPadding);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(MarginStatusDetailFragment.this);
                final MarginStatusDetailFragment marginStatusDetailFragment = MarginStatusDetailFragment.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$ComposeContent$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginStatusDetailFragment.C168372.invoke$lambda$1$lambda$0(marginStatusDetailFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(modifierPadding, (Function0) objRememberedValue, 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composer.endReplaceGroup();
            } else if (marginStatusDetailState3ComposeContent$lambda$0 instanceof MarginStatusDetailState3.Loading) {
                composer.startReplaceGroup(1617836047);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, contentPadding), 0.0f, 1, null), false, composer, 0, 2);
                composer.endReplaceGroup();
            } else {
                if (!(marginStatusDetailState3ComposeContent$lambda$0 instanceof MarginStatusDetailState3.Loaded)) {
                    composer.startReplaceGroup(1617825617);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1386446867);
                MarginStatusDetailState3 marginStatusDetailState3ComposeContent$lambda$02 = MarginStatusDetailFragment.ComposeContent$lambda$0(this.$viewState$delegate);
                Intrinsics.checkNotNull(marginStatusDetailState3ComposeContent$lambda$02, "null cannot be cast to non-null type com.robinhood.android.feature.margin.hub.MarginStatusDetailViewState.Loaded");
                MarginStatusDetailView.Success marginStatusDetailResponse = ((MarginStatusDetailState3.Loaded) marginStatusDetailState3ComposeContent$lambda$02).getMarginStatusDetailResponse();
                String entryPoint = ((MarginStatusDetailFragmentKey) MarginStatusDetailFragment.INSTANCE.getArgs((Fragment) MarginStatusDetailFragment.this)).getEntryPoint();
                SduiActionHandler callbacks = MarginStatusDetailFragment.this.getCallbacks();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(callbacks);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new MarginStatusDetailFragment4(callbacks);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                MarginStatusDetailComposable.MarginStatusDetailComposable(marginStatusDetailResponse, entryPoint, new MarginStatusDetailFragment5((Function1) ((KFunction) objRememberedValue2)), PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer, 0, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MarginStatusDetailFragment marginStatusDetailFragment) {
            marginStatusDetailFragment.getDuxo().onResume();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MarginStatusDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailFragment;", "Lcom/robinhood/android/margin/contracts/MarginStatusDetailFragmentKey;", "<init>", "()V", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MarginStatusDetailFragment, MarginStatusDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MarginStatusDetailFragmentKey marginStatusDetailFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, marginStatusDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MarginStatusDetailFragmentKey getArgs(MarginStatusDetailFragment marginStatusDetailFragment) {
            return (MarginStatusDetailFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, marginStatusDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginStatusDetailFragment newInstance(MarginStatusDetailFragmentKey marginStatusDetailFragmentKey) {
            return (MarginStatusDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, marginStatusDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginStatusDetailFragment marginStatusDetailFragment, MarginStatusDetailFragmentKey marginStatusDetailFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, marginStatusDetailFragment, marginStatusDetailFragmentKey);
        }
    }
}
