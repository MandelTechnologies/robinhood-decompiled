package com.robinhood.android.options.portfolioriskanalyzer.components.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavDestinations;
import com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraph;
import com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleState;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsPortfolioRiskAnalyzerFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002JO\u0010\u0016\u001a\u00020\u00122@\u0010\u0017\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00120\u0019j\u0007`!¢\u0006\u0002\b\u001f¢\u0006\u0002\b\u001f¢\u0006\u0002\b 0\u0018H\u0017¢\u0006\u0002\u0010\"J\t\u0010#\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "fragmentDuxo", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentDuxo;", "getFragmentDuxo", "()Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentDuxo;", "fragmentDuxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "requireActivityOnBackPressed", "NavHostComposeContent", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-portfolio-risk-analyzer_externalDebug", "viewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerFragment extends BaseComposeNavHostFragment implements RegionGated {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: fragmentDuxo$delegate, reason: from kotlin metadata */
    private final Lazy fragmentDuxo = DuxosKt.duxo(this, OptionsPortfolioRiskAnalyzerFragmentDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$1(OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        optionsPortfolioRiskAnalyzerFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$2(OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        optionsPortfolioRiskAnalyzerFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionsPortfolioRiskAnalyzerFragmentDuxo getFragmentDuxo() {
        return (OptionsPortfolioRiskAnalyzerFragmentDuxo) this.fragmentDuxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C235101(null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$onCreate$1", m3645f = "OptionsPortfolioRiskAnalyzerFragment.kt", m3646l = {46}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$onCreate$1 */
    static final class C235101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C235101(Continuation<? super C235101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsPortfolioRiskAnalyzerFragment.this.new C235101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsPortfolioRiskAnalyzerFragmentViewState> stateFlow = OptionsPortfolioRiskAnalyzerFragment.this.getFragmentDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsPortfolioRiskAnalyzerFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Boolean boolBoxBoolean = boxing.boxBoolean(((OptionsPortfolioRiskAnalyzerFragmentViewState) obj).getInPortfolioRiskAnalyzerExperiment());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsPortfolioRiskAnalyzerFragment.this, null);
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

        /* compiled from: OptionsPortfolioRiskAnalyzerFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inPortfolioRiskAnalyzerExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$onCreate$1$2", m3645f = "OptionsPortfolioRiskAnalyzerFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!this.Z$0) {
                    this.this$0.requireActivityOnBackPressed();
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requireActivityOnBackPressed() {
        requireActivity().onBackPressed();
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(1717832121);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) != 16 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1717832121, i2, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment.NavHostComposeContent (OptionsPortfolioRiskAnalyzerFragment.kt:62)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getFragmentDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Parcelable args = INSTANCE.getArgs((Fragment) this);
            OptionsPortfolioRiskAnalyzer.WithAccountNumber argsWithAccountNumber = args instanceof OptionsPortfolioRiskAnalyzer.WithAccountNumber ? (OptionsPortfolioRiskAnalyzer.WithAccountNumber) args : null;
            if (argsWithAccountNumber == null && (argsWithAccountNumber = NavHostComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getArgsWithAccountNumber()) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionsPortfolioRiskAnalyzerFragment.NavHostComposeContent$lambda$1(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1916795761, true, new C235091(argsWithAccountNumber, this, NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0)), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsPortfolioRiskAnalyzerFragment.NavHostComposeContent$lambda$2(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$NavHostComposeContent$1 */
    static final class C235091 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OptionsPortfolioRiskAnalyzer.WithAccountNumber $argsWithAccountNumber;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ OptionsPortfolioRiskAnalyzerFragment this$0;

        C235091(OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber, OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment, NavHostController navHostController) {
            this.$argsWithAccountNumber = withAccountNumber;
            this.this$0 = optionsPortfolioRiskAnalyzerFragment;
            this.$navController = navHostController;
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
                ComposerKt.traceEventStart(1916795761, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment.NavHostComposeContent.<anonymous> (OptionsPortfolioRiskAnalyzerFragment.kt:68)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            OptionsPortfolioRiskAnalyzerNavDestinations optionsPortfolioRiskAnalyzerNavDestinations = OptionsPortfolioRiskAnalyzerNavDestinations.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$argsWithAccountNumber) | composer.changedInstance(this.this$0);
            final OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber = this.$argsWithAccountNumber;
            final OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$NavHostComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsPortfolioRiskAnalyzerFragment.C235091.invoke$lambda$4$lambda$3(withAccountNumber, optionsPortfolioRiskAnalyzerFragment, (NavGraphBuilder) obj, (NavHostController) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.persistentSetOf((Function2) objRememberedValue), optionsPortfolioRiskAnalyzerNavDestinations, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), modifierFillMaxSize$default, composer, (ComposableDestination.$stable << 6) | 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber, final OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment, NavGraphBuilder persistentSetOf, NavHostController controller) {
            Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
            Intrinsics.checkNotNullParameter(controller, "controller");
            OptionsPortfolioRiskAnalyzerNavGraph.optionsPortfolioRiskAnalyzerNavGraph(persistentSetOf, withAccountNumber, controller, new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$NavHostComposeContent$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionsPortfolioRiskAnalyzerFragment.C235091.invoke$lambda$4$lambda$3$lambda$0(optionsPortfolioRiskAnalyzerFragment);
                }
            }, new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$NavHostComposeContent$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsPortfolioRiskAnalyzerFragment.C235091.invoke$lambda$4$lambda$3$lambda$1(optionsPortfolioRiskAnalyzerFragment, (FragmentKey) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.fragment.OptionsPortfolioRiskAnalyzerFragment$NavHostComposeContent$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsPortfolioRiskAnalyzerFragment.C235091.invoke$lambda$4$lambda$3$lambda$2(optionsPortfolioRiskAnalyzerFragment, (FragmentKey) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$0(OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment) {
            optionsPortfolioRiskAnalyzerFragment.requireActivityOnBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$1(OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment, FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            com.robinhood.android.navigation.Navigator navigator = optionsPortfolioRiskAnalyzerFragment.getNavigator();
            Context contextRequireContext = optionsPortfolioRiskAnalyzerFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment, FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            com.robinhood.android.navigation.Navigator navigator = optionsPortfolioRiskAnalyzerFragment.getNavigator();
            Context contextRequireContext = optionsPortfolioRiskAnalyzerFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }

    private static final OptionsPortfolioRiskAnalyzerFragmentViewState NavHostComposeContent$lambda$0(SnapshotState4<OptionsPortfolioRiskAnalyzerFragmentViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragment;", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "<init>", "()V", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionsPortfolioRiskAnalyzerFragment, OptionsPortfolioRiskAnalyzer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionsPortfolioRiskAnalyzer);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionsPortfolioRiskAnalyzer getArgs(OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment) {
            return (OptionsPortfolioRiskAnalyzer) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionsPortfolioRiskAnalyzerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsPortfolioRiskAnalyzerFragment newInstance(OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer) {
            return (OptionsPortfolioRiskAnalyzerFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionsPortfolioRiskAnalyzer);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsPortfolioRiskAnalyzerFragment optionsPortfolioRiskAnalyzerFragment, OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionsPortfolioRiskAnalyzerFragment, optionsPortfolioRiskAnalyzer);
        }
    }
}
