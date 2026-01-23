package com.robinhood.android.pathfinder.corepages.reviewagreement;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.brokeragecontent.BrokerageResource;
import com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.models.api.pathfinder.contexts.CtaType;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.common.agreementview.RdsAgreementView;
import com.robinhood.shared.pathfinder.corepages.C39352R;
import com.robinhood.shared.pathfinder.corepages.databinding.ReviewAgreementFragmentBinding;
import com.robinhood.shared.support.contracts.pathfinder.ReviewAgreementFragmentKey;
import com.robinhood.staticcontent.model.Agreement;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ReviewAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/shared/pathfinder/corepages/databinding/ReviewAgreementFragmentBinding;", "getBindings", "()Lcom/robinhood/shared/pathfinder/corepages/databinding/ReviewAgreementFragmentBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAgreementAccepted", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", "onAgreementRecorded", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ReviewAgreementFragment extends BaseAgreementFragment {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReviewAgreementFragment.class, "bindings", "getBindings()Lcom/robinhood/shared/pathfinder/corepages/databinding/ReviewAgreementFragmentBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment
    public void onAgreementRecorded() {
    }

    public ReviewAgreementFragment() {
        super(C39352R.layout.review_agreement_fragment);
        this.duxo = DuxosKt.duxo(this, ReviewAgreementDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, ReviewAgreementFragment3.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewAgreementDuxo getDuxo() {
        return (ReviewAgreementDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewAgreementFragmentBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ReviewAgreementFragmentBinding) value;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        RichText heading = ((UserViewStatePageContext.ReviewAgreement) ((ReviewAgreementFragmentKey) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext().getHeading();
        toolbar.setTitle(heading != null ? heading.getText() : null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C253511(null), 1, null);
    }

    /* compiled from: ReviewAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1", m3645f = "ReviewAgreementFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1 */
    static final class C253511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C253511(Continuation<? super C253511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253511 c253511 = ReviewAgreementFragment.this.new C253511(continuation);
            c253511.L$0 = obj;
            return c253511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ReviewAgreementFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$1", m3645f = "ReviewAgreementFragment.kt", m3646l = {45}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ReviewAgreementFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReviewAgreementFragment reviewAgreementFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = reviewAgreementFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<ReviewAgreementViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "ReviewAgreementFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    Boolean boolBoxBoolean = boxing.boxBoolean(((ReviewAgreementViewState) obj).getSendingInput());
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
                    };
                    final ReviewAgreementFragment reviewAgreementFragment = this.this$0;
                    FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment.onViewCreated.1.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            reviewAgreementFragment.getBindings().baseAgreementView.updateAcceptButtonLoading(z);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ReviewAgreementFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ReviewAgreementFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(ReviewAgreementFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(ReviewAgreementFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ReviewAgreementFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$2", m3645f = "ReviewAgreementFragment.kt", m3646l = {53}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ReviewAgreementFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ReviewAgreementFragment reviewAgreementFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = reviewAgreementFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<ReviewAgreementViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends String>>() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "ReviewAgreementFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    List<String> additionalCheckboxes = ((ReviewAgreementViewState) obj).getContext().getAdditionalCheckboxes();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(additionalCheckboxes, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    final ReviewAgreementFragment reviewAgreementFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment.onViewCreated.1.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<String>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<String> list, Continuation<? super Unit> continuation) {
                            reviewAgreementFragment.getAgreementView().setAdditionalCheckboxes(list);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: ReviewAgreementFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$3", m3645f = "ReviewAgreementFragment.kt", m3646l = {67}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ReviewAgreementFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ReviewAgreementFragment reviewAgreementFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = reviewAgreementFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<ReviewAgreementViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<AgreementInfo>() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$3$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "ReviewAgreementFragment.kt", m3646l = {56}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    ReviewAgreementViewState reviewAgreementViewState = (ReviewAgreementViewState) obj;
                                    AgreementInfo agreementInfo = new AgreementInfo(reviewAgreementViewState.getContext().getContentfulId(), reviewAgreementViewState.getContext().getAgreementType(), reviewAgreementViewState.getContext().getAgreementTitle());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(agreementInfo, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super AgreementInfo> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    final ReviewAgreementFragment reviewAgreementFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment.onViewCreated.1.3.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((AgreementInfo) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(AgreementInfo agreementInfo, Continuation<? super Unit> continuation) {
                            final String contentfulId = agreementInfo.getContentfulId();
                            String agreementType = agreementInfo.getAgreementType();
                            String agreementTitle = agreementInfo.getAgreementTitle();
                            if (agreementType != null && !StringsKt.isBlank(agreementType)) {
                                ReviewAgreementFragment reviewAgreementFragment2 = reviewAgreementFragment;
                                if (agreementTitle == null) {
                                    agreementTitle = "";
                                }
                                BaseAgreementFragment.loadIdentiAgreement$default(reviewAgreementFragment2, agreementType, false, agreementTitle, 2, null);
                            } else if (contentfulId != null && !StringsKt.isBlank(contentfulId)) {
                                BaseAgreementFragment.loadBrokerageAgreement$default(reviewAgreementFragment, new BrokerageResource<Agreement>() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment.onViewCreated.1.3.2.1
                                    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
                                    public String getUkContentfulId() {
                                        return null;
                                    }

                                    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
                                    public String getSgContentfulId() {
                                        return BrokerageResource.DefaultImpls.getSgContentfulId(this);
                                    }

                                    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
                                    /* renamed from: getContentfulId, reason: from getter */
                                    public String get$contentfulId() {
                                        return contentfulId;
                                    }
                                }, false, 2, null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: ReviewAgreementFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$4", m3645f = "ReviewAgreementFragment.kt", m3646l = {82}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ReviewAgreementFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ReviewAgreementFragment reviewAgreementFragment, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = reviewAgreementFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final ReviewAgreementFragment reviewAgreementFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment.onViewCreated.1.4.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<ReviewAgreementEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<ReviewAgreementEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<ReviewAgreementEvent> eventConsumerInvoke;
                            final ReviewAgreementFragment reviewAgreementFragment2 = reviewAgreementFragment;
                            if ((event.getData() instanceof ReviewAgreementEvent.SendInputErrorEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementFragment$onViewCreated$1$4$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m17535invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m17535invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ReviewAgreementEvent.SendInputErrorEvent sendInputErrorEvent = (ReviewAgreementEvent.SendInputErrorEvent) event.getData();
                                        reviewAgreementFragment2.getAgreementView().reset();
                                        if (!AbsErrorHandler.handleError$default(reviewAgreementFragment2.getActivityErrorHandler(), sendInputErrorEvent.getError(), false, 2, null)) {
                                            throw sendInputErrorEvent.getError();
                                        }
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseAgreementFragment, com.robinhood.shared.common.agreementview.RdsAgreementView.OnAgreementAcceptedListener
    public void onAgreementAccepted(RdsAgreementView view) {
        CtaAction action;
        Intrinsics.checkNotNullParameter(view, "view");
        CtaType primaryCta = getDuxo().getStateFlow().getValue().getContext().getPrimaryCta();
        String target = (primaryCta == null || (action = primaryCta.getAction()) == null) ? null : action.getTarget();
        if (target != null) {
            getDuxo().sendInput(target);
        }
    }

    /* compiled from: ReviewAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/ReviewAgreementFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ReviewAgreementFragment, ReviewAgreementFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ReviewAgreementFragmentKey reviewAgreementFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, reviewAgreementFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ReviewAgreementFragmentKey getArgs(ReviewAgreementFragment reviewAgreementFragment) {
            return (ReviewAgreementFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, reviewAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReviewAgreementFragment newInstance(ReviewAgreementFragmentKey reviewAgreementFragmentKey) {
            return (ReviewAgreementFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, reviewAgreementFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReviewAgreementFragment reviewAgreementFragment, ReviewAgreementFragmentKey reviewAgreementFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, reviewAgreementFragment, reviewAgreementFragmentKey);
        }
    }
}
