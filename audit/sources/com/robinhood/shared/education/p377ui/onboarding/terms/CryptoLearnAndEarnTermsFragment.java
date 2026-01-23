package com.robinhood.shared.education.p377ui.onboarding.terms;

import android.os.Bundle;
import android.view.View;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.FragmentCryptoLearnAndEarnTermsBinding;
import com.robinhood.shared.education.p377ui.onboarding.terms.CryptoLearnAndEarnTermsUiEvent;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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

/* compiled from: CryptoLearnAndEarnTermsFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\t\u0010\u001b\u001a\u00020\u001cH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsDuxo;", "getDuxo", "()Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/shared/education/databinding/FragmentCryptoLearnAndEarnTermsBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/FragmentCryptoLearnAndEarnTermsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsUiEvent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoLearnAndEarnTermsFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoLearnAndEarnTermsFragment.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/FragmentCryptoLearnAndEarnTermsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CryptoLearnAndEarnTermsFragment() {
        super(C38790R.layout.fragment_crypto_learn_and_earn_terms);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, CryptoLearnAndEarnTermsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CryptoLearnAndEarnTermsFragment2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoLearnAndEarnTermsDuxo getDuxo() {
        return (CryptoLearnAndEarnTermsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentCryptoLearnAndEarnTermsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoLearnAndEarnTermsBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        RhTextView cryptoLearnAndEarnTermsText = getBinding().cryptoLearnAndEarnTermsText;
        Intrinsics.checkNotNullExpressionValue(cryptoLearnAndEarnTermsText, "cryptoLearnAndEarnTermsText");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(cryptoLearnAndEarnTermsText, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C389111(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C389122(null), 1, null);
    }

    /* compiled from: CryptoLearnAndEarnTermsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsFragment$onViewCreated$1", m3645f = "CryptoLearnAndEarnTermsFragment.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsFragment$onViewCreated$1 */
    static final class C389111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C389111(Continuation<? super C389111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLearnAndEarnTermsFragment.this.new C389111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C389111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoLearnAndEarnTermsViewState> stateFlow = CryptoLearnAndEarnTermsFragment.this.getDuxo().getStateFlow();
                final CryptoLearnAndEarnTermsFragment cryptoLearnAndEarnTermsFragment = CryptoLearnAndEarnTermsFragment.this;
                FlowCollector<? super CryptoLearnAndEarnTermsViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CryptoLearnAndEarnTermsViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CryptoLearnAndEarnTermsViewState cryptoLearnAndEarnTermsViewState, Continuation<? super Unit> continuation) {
                        FragmentCryptoLearnAndEarnTermsBinding binding = cryptoLearnAndEarnTermsFragment.getBinding();
                        CryptoLearnAndEarnTermsFragment cryptoLearnAndEarnTermsFragment2 = cryptoLearnAndEarnTermsFragment;
                        ShimmerLoadingView cryptoLearnAndEarnTermsLoading = binding.cryptoLearnAndEarnTermsLoading;
                        Intrinsics.checkNotNullExpressionValue(cryptoLearnAndEarnTermsLoading, "cryptoLearnAndEarnTermsLoading");
                        cryptoLearnAndEarnTermsLoading.setVisibility(cryptoLearnAndEarnTermsViewState.isLoadingViewVisible() ? 0 : 8);
                        RhTextView cryptoLearnAndEarnTermsText = binding.cryptoLearnAndEarnTermsText;
                        Intrinsics.checkNotNullExpressionValue(cryptoLearnAndEarnTermsText, "cryptoLearnAndEarnTermsText");
                        cryptoLearnAndEarnTermsText.setVisibility(cryptoLearnAndEarnTermsViewState.isDisclosureTextVisible() ? 0 : 8);
                        DisclosureContent disclosureContent = cryptoLearnAndEarnTermsViewState.getDisclosureContent();
                        if (disclosureContent != null) {
                            binding.cryptoLearnAndEarnTermsText.setText(disclosureContent.getContent());
                            RhToolbar rhToolbar = cryptoLearnAndEarnTermsFragment2.getRhToolbar();
                            if (rhToolbar != null) {
                                rhToolbar.setTitle(disclosureContent.getTitle());
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<CryptoLearnAndEarnTermsUiEvent> event) {
        EventConsumer<CryptoLearnAndEarnTermsUiEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof CryptoLearnAndEarnTermsUiEvent.ShowFailure) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m25407invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25407invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((CryptoLearnAndEarnTermsUiEvent.ShowFailure) event.getData()).getThrowable(), false, 2, null);
            }
        });
    }

    /* compiled from: CryptoLearnAndEarnTermsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsFragment$onViewCreated$2", m3645f = "CryptoLearnAndEarnTermsFragment.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsFragment$onViewCreated$2 */
    static final class C389122 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C389122(Continuation<? super C389122> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLearnAndEarnTermsFragment.this.new C389122(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C389122) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoLearnAndEarnTermsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.education.ui.onboarding.terms.CryptoLearnAndEarnTermsFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoLearnAndEarnTermsFragment $tmp0;

            AnonymousClass1(CryptoLearnAndEarnTermsFragment cryptoLearnAndEarnTermsFragment) {
                this.$tmp0 = cryptoLearnAndEarnTermsFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoLearnAndEarnTermsFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CryptoLearnAndEarnTermsUiEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C389122.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CryptoLearnAndEarnTermsUiEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(CryptoLearnAndEarnTermsFragment cryptoLearnAndEarnTermsFragment, Event event, Continuation continuation) {
            cryptoLearnAndEarnTermsFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoLearnAndEarnTermsFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoLearnAndEarnTermsFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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
    }

    /* compiled from: CryptoLearnAndEarnTermsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsFragment;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CryptoLearnAndEarnTermsFragment newInstance() {
            return new CryptoLearnAndEarnTermsFragment();
        }
    }
}
