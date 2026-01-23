package com.robinhood.android.options.history.detail.order;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpan2;
import androidx.compose.foundation.lazy.grid.LazyGridSpan3;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.views.OptionsMultilegBidAskView;
import com.robinhood.android.common.options.views.OptionsStrategyBidAskView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.p153ui.BaseDetailFragment;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOrderDetailFragmentKey;
import com.robinhood.android.options.history.detail.C23086R;
import com.robinhood.android.options.history.detail.databinding.FragmentOptionOrderDetailBinding;
import com.robinhood.android.options.history.detail.order.OptionOrderDetailViewState;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionOrderDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u0015\u0010&\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0007¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0007¢\u0006\u0002\u0010'J/\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0003¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010'J\t\u00104\u001a\u000200H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020706X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "bindings", "Lcom/robinhood/android/options/history/detail/databinding/FragmentOptionOrderDetailBinding;", "getBindings", "()Lcom/robinhood/android/options/history/detail/databinding/FragmentOptionOrderDetailBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStart", "onStop", "refreshUi", "state", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState;", "ComposeContent", "(Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState;Landroidx/compose/runtime/Composer;I)V", "ComposeFooterContent", "ButtonContents", "text", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "loading", "", "ButtonContents-FNF3uiM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JZLandroidx/compose/runtime/Composer;I)V", "BidAskView", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOrderDetailFragment extends BaseDetailFragment implements SupportBreadcrumbTracker2, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOrderDetailFragment.class, "bindings", "getBindings()Lcom/robinhood/android/options/history/detail/databinding/FragmentOptionOrderDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BidAskView$lambda$38(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState, int i, Composer composer, int i2) {
        optionOrderDetailFragment.BidAskView(optionOrderDetailViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonContents_FNF3uiM$lambda$26(OptionOrderDetailFragment optionOrderDetailFragment, String str, TextStyle textStyle, long j, boolean z, int i, Composer composer, int i2) {
        optionOrderDetailFragment.m16924ButtonContentsFNF3uiM(str, textStyle, j, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$17(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState, int i, Composer composer, int i2) {
        optionOrderDetailFragment.ComposeContent(optionOrderDetailViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeFooterContent$lambda$25(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState, int i, Composer composer, int i2) {
        optionOrderDetailFragment.ComposeFooterContent(optionOrderDetailViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public OptionOrderDetailFragment() {
        super(C23086R.layout.fragment_option_order_detail);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, OptionOrderDetailFragment$bindings$2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, OptionOrderDetailDuxo.class);
    }

    private final FragmentOptionOrderDetailBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionOrderDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOrderDetailDuxo getDuxo() {
        return (OptionOrderDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((OptionOrderDetailFragmentKey) INSTANCE.getArgs((Fragment) this)).getOptionOrderId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        return Breadcrumbs2.createBreadcrumb(this, SupportBreadcrumbType.INVESTING_OPTIONS_ORDER, ((OptionOrderDetailFragmentKey) INSTANCE.getArgs((Fragment) this)).getOptionOrderId());
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C231371(null), 1, null);
    }

    /* compiled from: OptionOrderDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$onViewCreated$1", m3645f = "OptionOrderDetailFragment.kt", m3646l = {114}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$onViewCreated$1 */
    static final class C231371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231371(Continuation<? super C231371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDetailFragment.this.new C231371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<Optional<? extends OptionOrderDetailViewState>> stateFlow = OptionOrderDetailFragment.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OptionOrderDetailViewState>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionOrderDetailViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderDetailFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                        /* JADX WARN: Multi-variable type inference failed */
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
                                Object orNull = ((Optional) obj).getOrNull();
                                if (orNull != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionOrderDetailFragment.this);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionOrderDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$onViewCreated$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ OptionOrderDetailFragment $tmp0;

            AnonymousClass2(OptionOrderDetailFragment optionOrderDetailFragment) {
                this.$tmp0 = optionOrderDetailFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, OptionOrderDetailFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(OptionOrderDetailViewState optionOrderDetailViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$refreshUi = C231371.invokeSuspend$refreshUi(this.$tmp0, optionOrderDetailViewState, continuation);
                return objInvokeSuspend$refreshUi == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$refreshUi : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((OptionOrderDetailViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$refreshUi(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState, Continuation continuation) throws Resources.NotFoundException {
            optionOrderDetailFragment.refreshUi(optionOrderDetailViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() throws Resources.NotFoundException {
        super.onResume();
        OptionOrderDetailViewState orNull = getDuxo().getStateFlow().getValue().getOrNull();
        if (orNull != null) {
            refreshUi(orNull);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OptionOrderDetailDuxo duxo = getDuxo();
        OptionOrderDetailViewState orNull = getDuxo().getStateFlow().getValue().getOrNull();
        duxo.logAppear(orNull != null ? orNull.getOptionOrderDetailContext() : null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        OptionOrderDetailDuxo duxo = getDuxo();
        OptionOrderDetailViewState orNull = getDuxo().getStateFlow().getValue().getOrNull();
        duxo.logDisappear(orNull != null ? orNull.getOptionOrderDetailContext() : null);
    }

    public final void refreshUi(final OptionOrderDetailViewState state) throws Resources.NotFoundException {
        ScarletManager scarletManager;
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        setAccountNumber(state.getAccountNumber());
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            StringResource statusText = state.getStatusText();
            CharSequence text2 = null;
            if (statusText != null) {
                Resources resources = rhToolbar.getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = statusText.getText(resources);
            } else {
                text = null;
            }
            rhToolbar.setTitle(text);
            StringResource accountText = state.getAccountText();
            if (accountText != null) {
                Resources resources2 = rhToolbar.getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                text2 = accountText.getText(resources2);
            }
            rhToolbar.setSubtitle(text2);
        }
        getExpandedToolbarTitleTxt().setText(state.getTitle());
        getExpandedToolbarTitleTxt().setMaxLines(2);
        TextView expandedToolbarSubtitleTxt = getExpandedToolbarSubtitleTxt();
        TextViewsKt.setVisibilityText(expandedToolbarSubtitleTxt, state.getSubtitle());
        TextViewsKt.setTextAppearanceAttr(expandedToolbarSubtitleTxt, state.getSubtitleTextAppearanceAttr());
        TextView expandedToolbarTitleTxt = getExpandedToolbarTitleTxt();
        expandedToolbarTitleTxt.setPadding(expandedToolbarTitleTxt.getPaddingLeft(), (int) ViewsKt.getDimension(expandedToolbarTitleTxt, C13997R.dimen.rds_spacing_default), expandedToolbarTitleTxt.getPaddingRight(), expandedToolbarTitleTxt.getPaddingBottom());
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            scarletManager = getScarletManager();
        }
        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
        ComposeView root = getBindings().getRoot();
        root.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        root.setContent(ComposableLambda3.composableLambdaInstance(1746512022, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$refreshUi$4$1
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
                    ComposerKt.traceEventStart(1746512022, i, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.refreshUi.<anonymous>.<anonymous> (OptionOrderDetailFragment.kt:164)");
                }
                Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                final OptionOrderDetailFragment optionOrderDetailFragment = this;
                final OptionOrderDetailViewState optionOrderDetailViewState = state;
                BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(-813693880, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$refreshUi$4$1.1
                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-813693880, i2, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.refreshUi.<anonymous>.<anonymous>.<anonymous> (OptionOrderDetailFragment.kt:165)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        OptionOrderDetailFragment optionOrderDetailFragment2 = optionOrderDetailFragment;
                        OptionOrderDetailViewState optionOrderDetailViewState2 = optionOrderDetailViewState;
                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        optionOrderDetailFragment2.ComposeContent(optionOrderDetailViewState2, composer2, 0);
                        composer2.endNode();
                        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(companion, null, false, 3, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWrapContentHeight$default);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        optionOrderDetailFragment2.ComposeFooterContent(optionOrderDetailViewState2, composer2, 0);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    public final void ComposeContent(final OptionOrderDetailViewState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1773719024);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1773719024, i2, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ComposeContent (OptionOrderDetailFragment.kt:179)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15(state, this, (LazyGridScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 48, 0, 1020);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderDetailFragment.ComposeContent$lambda$17(this.f$0, state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$16$lambda$15(final OptionOrderDetailViewState optionOrderDetailViewState, final OptionOrderDetailFragment optionOrderDetailFragment, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$4((LazyGridSpan2) obj);
            }
        }, null, ComposableLambda3.composableLambdaInstance(1097202876, true, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$ComposeContent$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                invoke(lazyGridItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1097202876, i, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (OptionOrderDetailFragment.kt:185)");
                }
                this.this$0.BidAskView(optionOrderDetailViewState, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 5, null);
        LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$5((LazyGridSpan2) obj);
            }
        }, null, ComposableSingletons$OptionOrderDetailFragmentKt.INSTANCE.m2227xd6fcaaca(), 5, null);
        Iterator<OptionOrderDetailViewState.InfoItem> it = optionOrderDetailViewState.getInfoItems().iterator();
        while (it.hasNext()) {
            LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$6((LazyGridSpan2) obj);
                }
            }, null, ComposableLambda3.composableLambdaInstance(-2049647078, true, new OptionOrderDetailFragment$ComposeContent$1$1$5(it.next(), optionOrderDetailFragment, optionOrderDetailViewState)), 5, null);
        }
        List<OptionOrderDetailViewState.LegRow> legRows = optionOrderDetailViewState.getLegRows();
        if (legRows != null) {
            Function1 function1 = new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$10$lambda$7((LazyGridSpan2) obj);
                }
            };
            ComposableSingletons$OptionOrderDetailFragmentKt composableSingletons$OptionOrderDetailFragmentKt = ComposableSingletons$OptionOrderDetailFragmentKt.INSTANCE;
            LazyGridScope.item$default(LazyVerticalGrid, null, function1, null, composableSingletons$OptionOrderDetailFragmentKt.m2228x7738c5d9(), 5, null);
            LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$10$lambda$8((LazyGridSpan2) obj);
                }
            }, null, composableSingletons$OptionOrderDetailFragmentKt.m2226x3fe886f7(), 5, null);
            Iterator<OptionOrderDetailViewState.LegRow> it2 = legRows.iterator();
            while (it2.hasNext()) {
                LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$10$lambda$9((LazyGridSpan2) obj);
                    }
                }, null, ComposableLambda3.composableLambdaInstance(-1942433817, true, new OptionOrderDetailFragment$ComposeContent$1$1$6$4(it2.next(), optionOrderDetailFragment)), 5, null);
            }
        }
        LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$11((LazyGridSpan2) obj);
            }
        }, null, ComposableSingletons$OptionOrderDetailFragmentKt.INSTANCE.m2225x17015cde(), 5, null);
        Iterator<OptionOrderDetailViewState.ActionRow> it3 = optionOrderDetailViewState.getActionRows().iterator();
        while (it3.hasNext()) {
            LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$12((LazyGridSpan2) obj);
                }
            }, null, ComposableLambda3.composableLambdaInstance(-1195467901, true, new OptionOrderDetailFragment$ComposeContent$1$1$9(it3.next(), optionOrderDetailFragment, optionOrderDetailViewState)), 5, null);
        }
        LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$13((LazyGridSpan2) obj);
            }
        }, null, ComposableSingletons$OptionOrderDetailFragmentKt.INSTANCE.getLambda$805758179$feature_options_history_detail_externalDebug(), 5, null);
        if (optionOrderDetailViewState.getDocumentDownloadIntentKey() != null) {
            LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderDetailFragment.ComposeContent$lambda$16$lambda$15$lambda$14((LazyGridSpan2) obj);
                }
            }, null, ComposableLambda3.composableLambdaInstance(-799070975, true, new OptionOrderDetailFragment$ComposeContent$1$1$12(optionOrderDetailViewState, optionOrderDetailFragment)), 5, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$4(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$5(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$6(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$10$lambda$7(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$10$lambda$8(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$10$lambda$9(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$11(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$12(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$13(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSpan ComposeContent$lambda$16$lambda$15$lambda$14(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
    }

    public final void ComposeFooterContent(final OptionOrderDetailViewState state, Composer composer, final int i) {
        int i2;
        Row6 row6;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i3;
        int i4;
        Modifier.Companion companion2;
        BentoTheme bentoTheme2;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(52439211);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(52439211, i2, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ComposeFooterContent (OptionOrderDetailFragment.kt:364)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme3.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Row6 row62 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1266033854);
            if (state.getShowCancelButton()) {
                i4 = 0;
                row6 = row62;
                companion = companion3;
                Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(Row5.weight$default(row62, companion3, 1.0f, false, 2, null), 0.0f, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary().m21717getMinHeightD9Ej5fM(), 1, null);
                RoundedCornerShape RoundedCornerShape = RoundedCornerShape2.RoundedCornerShape(50);
                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), Color.m6705copywmQWz5c$default(bentoTheme3.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null));
                i3 = i7;
                bentoTheme = bentoTheme3;
                ButtonColors buttonColorsM5542buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5542buttonColorsro_MJ88(Color.INSTANCE.m6725getTransparent0d7_KjU(), bentoTheme3.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 6, 12);
                PaddingValues contentPadding = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary().getContentPadding();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(state);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOrderDetailFragment.ComposeFooterContent$lambda$24$lambda$19$lambda$18(this.f$0, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.Button((Function0) objRememberedValue, modifierM5155defaultMinSizeVpY3zN4$default, false, null, null, RoundedCornerShape, borderStrokeM4886BorderStrokecXLIe8U, buttonColorsM5542buttonColorsro_MJ88, contentPadding, ComposableLambda3.rememberComposableLambda(1196389274, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$ComposeFooterContent$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 Button, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i8 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1196389274, i8, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ComposeFooterContent.<anonymous>.<anonymous> (OptionOrderDetailFragment.kt:392)");
                        }
                        this.this$0.m16924ButtonContentsFNF3uiM(StringResources_androidKt.stringResource(C18359R.string.order_detail_cancel_action, composer2, 0), ((Styles) composer2.consume(Styles2.getLocalStyles())).getButton(composer2, 0).getSecondary().getTextStyle(), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), state.getCancelButtonLoading(), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805330944, 12);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                row6 = row62;
                companion = companion3;
                bentoTheme = bentoTheme3;
                i3 = i7;
                i4 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1266080847);
            if (state.getShowReplaceButton()) {
                Modifier modifierM5155defaultMinSizeVpY3zN4$default2 = SizeKt.m5155defaultMinSizeVpY3zN4$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, i4).getPrimary().m21717getMinHeightD9Ej5fM(), 1, null);
                RoundedCornerShape RoundedCornerShape2 = RoundedCornerShape2.RoundedCornerShape(50);
                BentoTheme bentoTheme4 = bentoTheme;
                int i8 = i3;
                companion2 = companion;
                bentoTheme2 = bentoTheme;
                i5 = i3;
                ButtonColors buttonColorsM5542buttonColorsro_MJ882 = ButtonDefaults.INSTANCE.m5542buttonColorsro_MJ88(bentoTheme4.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), bentoTheme4.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 12);
                PaddingValues contentPadding2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, i4).getPrimary().getContentPadding();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(state);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOrderDetailFragment.ComposeFooterContent$lambda$24$lambda$21$lambda$20(this.f$0, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                i6 = 1;
                ButtonKt.Button((Function0) objRememberedValue2, modifierM5155defaultMinSizeVpY3zN4$default2, false, null, null, RoundedCornerShape2, null, buttonColorsM5542buttonColorsro_MJ882, contentPadding2, ComposableLambda3.rememberComposableLambda(-1133217711, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$ComposeFooterContent$1$4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 Button, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i9 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1133217711, i9, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ComposeFooterContent.<anonymous>.<anonymous> (OptionOrderDetailFragment.kt:423)");
                        }
                        this.this$0.m16924ButtonContentsFNF3uiM(StringResources_androidKt.stringResource(C11048R.string.option_order_replace_order_label, composer3, 0), ((Styles) composer3.consume(Styles2.getLocalStyles())).getButton(composer3, 0).getPrimary().getTextStyle(), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), state.getReplaceButtonLoading(), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 806903808, 12);
                composerStartRestartGroup = composer2;
            } else {
                companion2 = companion;
                bentoTheme2 = bentoTheme;
                i5 = i3;
                i6 = 1;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1266127276);
            if (state.getPlaceOrderAgainIntentKey() != null && state.getPlaceAgainCtaStr() != null) {
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, i6, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.OPTION_ORDER_DETAIL, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, state.getOptionOrderDetailContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1048577, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, state.getPlaceAgainComponentIdentifier(), null, 4, null), null, 37, null), false, false, false, true, false, null, 110, null);
                String placeAgainCtaStr = state.getPlaceAgainCtaStr();
                long jM21425getFg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(state);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOrderDetailFragment.ComposeFooterContent$lambda$24$lambda$23$lambda$22(this.f$0, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer3 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, placeAgainCtaStr, modifierAutoLogEvents$default, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, false, null, composer3, 0, 0, 8056);
                composerStartRestartGroup = composer3;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderDetailFragment.ComposeFooterContent$lambda$25(this.f$0, state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeFooterContent$lambda$24$lambda$19$lambda$18(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState) {
        OptionOrderDetailDuxo duxo = optionOrderDetailFragment.getDuxo();
        UiOptionOrder uiOptionOrder = optionOrderDetailViewState.getUiOptionOrder();
        android.content.Context contextRequireContext = optionOrderDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        duxo.onCancelClicked(uiOptionOrder, contextRequireContext, optionOrderDetailViewState.getOptionOrderDetailContext());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeFooterContent$lambda$24$lambda$21$lambda$20(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState) {
        OptionOrderDetailDuxo duxo = optionOrderDetailFragment.getDuxo();
        Navigator navigator = optionOrderDetailFragment.getNavigator();
        android.content.Context contextRequireContext = optionOrderDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        duxo.onReplaceClicked(navigator, contextRequireContext, optionOrderDetailViewState.getUiOptionOrder(), optionOrderDetailViewState.getOptionOrderDetailContext());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeFooterContent$lambda$24$lambda$23$lambda$22(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailViewState optionOrderDetailViewState) {
        Navigator navigator = optionOrderDetailFragment.getNavigator();
        android.content.Context contextRequireContext = optionOrderDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, optionOrderDetailViewState.getPlaceOrderAgainIntentKey(), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ButtonContents-FNF3uiM, reason: not valid java name */
    public final void m16924ButtonContentsFNF3uiM(final String str, final TextStyle textStyle, final long j, final boolean z, Composer composer, final int i) {
        int i2;
        TextStyle textStyle2;
        Composer composerStartRestartGroup = composer.startRestartGroup(958146405);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            textStyle2 = textStyle;
            i2 |= composerStartRestartGroup.changed(textStyle2) ? 32 : 16;
        } else {
            textStyle2 = textStyle;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(958146405, i2, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.ButtonContents (OptionOrderDetailFragment.kt:468)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-212925034);
                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5151S, j, composerStartRestartGroup, (i2 & 896) | 48, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-212751186);
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(j), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textStyle2, composerStartRestartGroup, (i2 & 14) | 817889280 | (i2 & 896), (i2 << 6) & 7168, 7546);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderDetailFragment.ButtonContents_FNF3uiM$lambda$26(this.f$0, str, textStyle, j, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InflateParams"})
    public final void BidAskView(final OptionOrderDetailViewState optionOrderDetailViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1260257866);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionOrderDetailViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1260257866, i2, -1, "com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment.BidAskView (OptionOrderDetailFragment.kt:488)");
            }
            composerStartRestartGroup.startReplaceGroup(72973144);
            Modifier modifierM5146paddingqDBjuR0$default = (optionOrderDetailViewState.getShowMultilegBidAskView() || optionOrderDetailViewState.getShowSingleLegBidAskView()) ? PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE;
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (optionOrderDetailViewState.getShowSingleLegBidAskView()) {
                composerStartRestartGroup.startReplaceGroup(-1523560803);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOrderDetailFragment.BidAskView$lambda$37$lambda$29$lambda$28((android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(optionOrderDetailViewState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOrderDetailFragment.BidAskView$lambda$37$lambda$32$lambda$31(optionOrderDetailViewState, (OptionsStrategyBidAskView) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView(function1, modifierFillMaxWidth$default, (Function1) objRememberedValue2, composerStartRestartGroup, 54, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (optionOrderDetailViewState.getShowMultilegBidAskView()) {
                composerStartRestartGroup.startReplaceGroup(-1522840611);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objRememberedValue3 == companion3.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOrderDetailFragment.BidAskView$lambda$37$lambda$34$lambda$33((android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function1 function12 = (Function1) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(optionOrderDetailViewState);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion3.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOrderDetailFragment.BidAskView$lambda$37$lambda$36$lambda$35(optionOrderDetailViewState, (OptionsMultilegBidAskView) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView(function12, modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue4, composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1522032410);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailFragment$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderDetailFragment.BidAskView$lambda$38(this.f$0, optionOrderDetailViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsStrategyBidAskView BidAskView$lambda$37$lambda$29$lambda$28(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C11303R.layout.include_option_strategy_bid_ask_view, (ViewGroup) null, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.common.options.views.OptionsStrategyBidAskView");
        OptionsStrategyBidAskView optionsStrategyBidAskView = (OptionsStrategyBidAskView) viewInflate;
        View viewFindViewById = optionsStrategyBidAskView.findViewById(C11303R.id.bid_ask_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(8);
        return optionsStrategyBidAskView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BidAskView$lambda$37$lambda$32$lambda$31(OptionOrderDetailViewState optionOrderDetailViewState, OptionsStrategyBidAskView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OptionQuote optionQuote = optionOrderDetailViewState.getOptionQuote();
        if (optionQuote != null) {
            it.bind(optionQuote);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsMultilegBidAskView BidAskView$lambda$37$lambda$34$lambda$33(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C11303R.layout.include_option_multileg_bid_ask_view, (ViewGroup) null, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.common.options.views.OptionsMultilegBidAskView");
        return (OptionsMultilegBidAskView) viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BidAskView$lambda$37$lambda$36$lambda$35(OptionOrderDetailViewState optionOrderDetailViewState, OptionsMultilegBidAskView multilegView) {
        Intrinsics.checkNotNullParameter(multilegView, "multilegView");
        if (optionOrderDetailViewState.getLimitPrice() != null && optionOrderDetailViewState.getOptionQuote() != null) {
            multilegView.bind(new OptionsMultilegBidAskView.State(optionOrderDetailViewState.getOptionQuote(), optionOrderDetailViewState.getLimitPrice()));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOrderDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailFragment;", "Lcom/robinhood/android/options/contracts/OptionOrderDetailFragmentKey;", "<init>", "()V", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionOrderDetailFragment, OptionOrderDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionOrderDetailFragmentKey optionOrderDetailFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionOrderDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionOrderDetailFragmentKey getArgs(OptionOrderDetailFragment optionOrderDetailFragment) {
            return (OptionOrderDetailFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionOrderDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOrderDetailFragment newInstance(OptionOrderDetailFragmentKey optionOrderDetailFragmentKey) {
            return (OptionOrderDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionOrderDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOrderDetailFragment optionOrderDetailFragment, OptionOrderDetailFragmentKey optionOrderDetailFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionOrderDetailFragment, optionOrderDetailFragmentKey);
        }
    }
}
