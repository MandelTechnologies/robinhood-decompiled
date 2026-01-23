package com.robinhood.android.beneficiaries.p067ui.introflow;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryType;
import com.robinhood.android.beneficiaries.p067ui.introflow.BeneficiaryIntroFlowEvent;
import com.robinhood.android.beneficiaries.p067ui.introflow.agreement.BeneficiaryAgreementFragment;
import com.robinhood.android.beneficiaries.p067ui.introflow.info.BeneficiaryInfoFragment;
import com.robinhood.android.beneficiaries.p067ui.introflow.role.BeneficiaryRoleFragment;
import com.robinhood.android.beneficiaries.p067ui.introflow.type.BeneficiaryTypeFragment;
import com.robinhood.android.beneficiaries.p067ui.trustflow.loading.BeneficiaryTrustLoadingFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.Set;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BeneficiaryIntroFlowFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003-./B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0001H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0016J\t\u0010&\u001a\u00020'H\u0096\u0001R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/beneficiaries/ui/introflow/info/BeneficiaryInfoFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/introflow/role/BeneficiaryRoleFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/introflow/type/BeneficiaryTypeFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "navigateToFragmentFromLoading", "fragment", "beneficiaryInfoButtonClicked", "beneficiaryAgreementButtonClicked", "beneficiaryRoleClicked", "beneficiaryRole", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "beneficiaryItemClicked", "beneficiaryType", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryIntroFlowFragment extends BaseFragment implements RegionGated, BeneficiaryInfoFragment.Callbacks, BeneficiaryAgreementFragment.Callbacks, BeneficiaryRoleFragment.Callbacks, BeneficiaryTypeFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryIntroFlowFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryIntroFlowFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Callbacks;", "", "beneficiaryIntroFlowComplete", "", "beneficiaryIntroFlowResult", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void beneficiaryIntroFlowComplete(BeneficiaryIntroFlowResult beneficiaryIntroFlowResult);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public BeneficiaryIntroFlowFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, BeneficiaryIntroFlowDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryIntroFlowDuxo getDuxo() {
        return (BeneficiaryIntroFlowDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, new BeneficiaryTrustLoadingFragment());
        }
    }

    /* compiled from: BeneficiaryIntroFlowFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1", m3645f = "BeneficiaryIntroFlowFragment.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1 */
    static final class C97531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C97531(Continuation<? super C97531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryIntroFlowFragment.this.new C97531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryIntroFlowFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1$1", m3645f = "BeneficiaryIntroFlowFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<BeneficiaryIntroFlowEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BeneficiaryIntroFlowFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryIntroFlowFragment beneficiaryIntroFlowFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryIntroFlowFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<BeneficiaryIntroFlowEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                EventConsumer eventConsumer2;
                EventConsumer eventConsumer3;
                EventConsumer eventConsumer4;
                EventConsumer eventConsumer5;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final BeneficiaryIntroFlowFragment beneficiaryIntroFlowFragment = this.this$0;
                    if ((event.getData() instanceof BeneficiaryIntroFlowEvent.NavigateToInfoScreen) && (eventConsumer5 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer5.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11407invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11407invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                beneficiaryIntroFlowFragment.navigateToFragmentFromLoading((BeneficiaryInfoFragment) BeneficiaryInfoFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryInfoFragment.Args(((BeneficiaryIntroFlowEvent.NavigateToInfoScreen) event.getData()).getInfoViewModel())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryIntroFlowFragment beneficiaryIntroFlowFragment2 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryIntroFlowEvent.NavigateToAgreementScreen) && (eventConsumer4 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer4.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11408invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11408invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                beneficiaryIntroFlowFragment2.navigateToFragmentFromLoading((BeneficiaryAgreementFragment) BeneficiaryAgreementFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryAgreementFragment.Args(((BeneficiaryIntroFlowEvent.NavigateToAgreementScreen) event.getData()).getAgreementViewModel())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryIntroFlowFragment beneficiaryIntroFlowFragment3 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryIntroFlowEvent.NavigateToTypeScreen) && (eventConsumer3 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer3.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11409invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11409invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                beneficiaryIntroFlowFragment3.navigateToFragmentFromLoading((BeneficiaryTypeFragment) BeneficiaryTypeFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryTypeFragment.Args(((BeneficiaryIntroFlowEvent.NavigateToTypeScreen) event.getData()).getBeneficiaryTypeViewModel())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryIntroFlowFragment beneficiaryIntroFlowFragment4 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryIntroFlowEvent.NavigateToRoleScreen) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11410invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11410invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                beneficiaryIntroFlowFragment4.navigateToFragmentFromLoading((BeneficiaryRoleFragment) BeneficiaryRoleFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryRoleFragment.Args(((BeneficiaryIntroFlowEvent.NavigateToRoleScreen) event.getData()).getBeneficiaryRoleViewModel())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryIntroFlowFragment beneficiaryIntroFlowFragment5 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryIntroFlowEvent.CompleteIntroFlow) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11411invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11411invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BeneficiaryIntroFlowEvent.CompleteIntroFlow completeIntroFlow = (BeneficiaryIntroFlowEvent.CompleteIntroFlow) event.getData();
                                beneficiaryIntroFlowFragment5.getCallbacks().beneficiaryIntroFlowComplete(new BeneficiaryIntroFlowResult(completeIntroFlow.getBeneficiaryType(), completeIntroFlow.getBeneficiaryRole(), completeIntroFlow.getSignedAgreementTypes(), completeIntroFlow.getAgreementViewModel()));
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<BeneficiaryIntroFlowEvent>> eventFlow = BeneficiaryIntroFlowFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BeneficiaryIntroFlowFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C97531(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToFragmentFromLoading(BaseFragment fragment) {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        int size = fragments.size();
        for (int i = 0; i < size; i++) {
            if (fragments.get(i) instanceof BeneficiaryTrustLoadingFragment) {
                replaceFragmentWithoutAnimationAndBackStack(fragment);
                return;
            }
        }
        replaceFragment(fragment);
    }

    @Override // com.robinhood.android.beneficiaries.ui.introflow.info.BeneficiaryInfoFragment.Callbacks
    public void beneficiaryInfoButtonClicked() {
        getDuxo().beneficiaryInfoButtonClicked();
    }

    @Override // com.robinhood.android.beneficiaries.ui.introflow.agreement.BeneficiaryAgreementFragment.Callbacks
    public void beneficiaryAgreementButtonClicked() {
        getDuxo().beneficiaryAgreementButtonClicked();
    }

    @Override // com.robinhood.android.beneficiaries.ui.introflow.role.BeneficiaryRoleFragment.Callbacks
    public void beneficiaryRoleClicked(BeneficiaryRole beneficiaryRole) {
        Intrinsics.checkNotNullParameter(beneficiaryRole, "beneficiaryRole");
        getDuxo().beneficiaryRoleSelected(beneficiaryRole);
    }

    @Override // com.robinhood.android.beneficiaries.ui.introflow.type.BeneficiaryTypeFragment.Callbacks
    public void beneficiaryItemClicked(BeneficiaryType beneficiaryType) {
        Intrinsics.checkNotNullParameter(beneficiaryType, "beneficiaryType");
        getDuxo().beneficiaryTypeSelected(beneficiaryType);
    }

    /* compiled from: BeneficiaryIntroFlowFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: BeneficiaryIntroFlowFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.accountNumber, ((Args) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public Args(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: BeneficiaryIntroFlowFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryIntroFlowFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BeneficiaryIntroFlowFragment beneficiaryIntroFlowFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryIntroFlowFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryIntroFlowFragment newInstance(Args args) {
            return (BeneficiaryIntroFlowFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryIntroFlowFragment beneficiaryIntroFlowFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryIntroFlowFragment, args);
        }
    }
}
