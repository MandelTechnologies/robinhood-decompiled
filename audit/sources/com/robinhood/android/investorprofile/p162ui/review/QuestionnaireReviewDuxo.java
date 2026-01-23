package com.robinhood.android.investorprofile.p162ui.review;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.investorprofile.p162ui.review.QuestionnaireReviewEvent;
import com.robinhood.android.investorprofile.p162ui.review.QuestionnaireReviewFragment;
import com.robinhood.android.questionnaire.api.ReviewQueryParams;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.questionnaire.QuestionnaireStore;
import com.singular.sdk.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: QuestionnaireReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewViewState;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "questionnaireStore", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/questionnaire/QuestionnaireStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onConfirm", "questionAnswers", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class QuestionnaireReviewDuxo extends BaseDuxo5<QuestionnaireReviewViewState, QuestionnaireReviewEvent> implements HasSavedState {
    private final QuestionnaireStore questionnaireStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionnaireReviewDuxo(QuestionnaireStore questionnaireStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new QuestionnaireReviewViewState(null, false, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(questionnaireStore, "questionnaireStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.questionnaireStore = questionnaireStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: QuestionnaireReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1 */
    static final class C198481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C198481(Continuation<? super C198481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C198481 c198481 = QuestionnaireReviewDuxo.this.new C198481(continuation);
            c198481.L$0 = obj;
            return c198481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C198481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: QuestionnaireReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1$1", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ QuestionnaireReviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(QuestionnaireReviewDuxo questionnaireReviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = questionnaireReviewDuxo;
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
                    QuestionnaireStore questionnaireStore = this.this$0.questionnaireStore;
                    Companion companion = QuestionnaireReviewDuxo.INSTANCE;
                    Flow flowM28818catch = FlowKt.m28818catch(questionnaireStore.streamQuestionnaireReview(new ReviewQueryParams(((QuestionnaireReviewFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getContext(), ((QuestionnaireReviewFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getReviewPageType(), ((QuestionnaireReviewFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getApplicationId(), ((QuestionnaireReviewFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber())), new C502371(this.this$0, null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM28818catch, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: QuestionnaireReviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1$1$1", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502371 extends ContinuationImpl7 implements Function3<FlowCollector<? super UiQuestionnaireReview>, Throwable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ QuestionnaireReviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502371(QuestionnaireReviewDuxo questionnaireReviewDuxo, Continuation<? super C502371> continuation) {
                    super(3, continuation);
                    this.this$0 = questionnaireReviewDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super UiQuestionnaireReview> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    C502371 c502371 = new C502371(this.this$0, continuation);
                    c502371.L$0 = th;
                    return c502371.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new QuestionnaireReviewEvent.Error((Throwable) this.L$0));
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: QuestionnaireReviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "reviewPage", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1$1$2", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiQuestionnaireReview, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ QuestionnaireReviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(QuestionnaireReviewDuxo questionnaireReviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = questionnaireReviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiQuestionnaireReview uiQuestionnaireReview, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(uiQuestionnaireReview, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: QuestionnaireReviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1$1$2$1", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onStart$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C502381 extends ContinuationImpl7 implements Function2<QuestionnaireReviewViewState, Continuation<? super QuestionnaireReviewViewState>, Object> {
                    final /* synthetic */ UiQuestionnaireReview $reviewPage;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502381(UiQuestionnaireReview uiQuestionnaireReview, Continuation<? super C502381> continuation) {
                        super(2, continuation);
                        this.$reviewPage = uiQuestionnaireReview;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502381 c502381 = new C502381(this.$reviewPage, continuation);
                        c502381.L$0 = obj;
                        return c502381;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(QuestionnaireReviewViewState questionnaireReviewViewState, Continuation<? super QuestionnaireReviewViewState> continuation) {
                        return ((C502381) create(questionnaireReviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return QuestionnaireReviewViewState.copy$default((QuestionnaireReviewViewState) this.L$0, this.$reviewPage, false, 2, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502381((UiQuestionnaireReview) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(QuestionnaireReviewDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C198481(null));
    }

    /* compiled from: QuestionnaireReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onConfirm$1", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onConfirm$1 */
    static final class C198471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<UiQuestionnaireReview.QuestionAnswer> $questionAnswers;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C198471(List<UiQuestionnaireReview.QuestionAnswer> list, Continuation<? super C198471> continuation) {
            super(2, continuation);
            this.$questionAnswers = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuestionnaireReviewDuxo.this.new C198471(this.$questionAnswers, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C198471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: QuestionnaireReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onConfirm$1$1", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onConfirm$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<QuestionnaireReviewViewState, Continuation<? super QuestionnaireReviewViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QuestionnaireReviewViewState questionnaireReviewViewState, Continuation<? super QuestionnaireReviewViewState> continuation) {
                return ((AnonymousClass1) create(questionnaireReviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return QuestionnaireReviewViewState.copy$default((QuestionnaireReviewViewState) this.L$0, null, true, 1, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    QuestionnaireReviewDuxo.this.applyMutation(new AnonymousClass1(null));
                    QuestionnaireStore questionnaireStore = QuestionnaireReviewDuxo.this.questionnaireStore;
                    Companion companion = QuestionnaireReviewDuxo.INSTANCE;
                    String context = ((QuestionnaireReviewFragment.Args) companion.getArgs((HasSavedState) QuestionnaireReviewDuxo.this)).getContext();
                    List<UiQuestionnaireReview.QuestionAnswer> list = this.$questionAnswers;
                    String accountNumber = ((QuestionnaireReviewFragment.Args) companion.getArgs((HasSavedState) QuestionnaireReviewDuxo.this)).getAccountNumber();
                    this.label = 1;
                    if (questionnaireStore.confirmAnswers(context, list, accountNumber, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                QuestionnaireReviewDuxo questionnaireReviewDuxo = QuestionnaireReviewDuxo.this;
                questionnaireReviewDuxo.applyMutation(new AnonymousClass2(questionnaireReviewDuxo, null));
            } catch (Exception e) {
                QuestionnaireReviewDuxo.this.applyMutation(new AnonymousClass3(null));
                QuestionnaireReviewDuxo.this.submit(new QuestionnaireReviewEvent.Error(e));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: QuestionnaireReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onConfirm$1$2", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onConfirm$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<QuestionnaireReviewViewState, Continuation<? super QuestionnaireReviewViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ QuestionnaireReviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(QuestionnaireReviewDuxo questionnaireReviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = questionnaireReviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QuestionnaireReviewViewState questionnaireReviewViewState, Continuation<? super QuestionnaireReviewViewState> continuation) {
                return ((AnonymousClass2) create(questionnaireReviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                QuestionnaireReviewViewState questionnaireReviewViewState = (QuestionnaireReviewViewState) this.L$0;
                QuestionnaireReviewDuxo questionnaireReviewDuxo = this.this$0;
                UiQuestionnaireReview reviewPage = questionnaireReviewViewState.getReviewPage();
                questionnaireReviewDuxo.submit(new QuestionnaireReviewEvent.Confirmed(reviewPage != null ? reviewPage.getRedirectUrl() : null));
                return QuestionnaireReviewViewState.copy$default(questionnaireReviewViewState, null, false, 1, null);
            }
        }

        /* compiled from: QuestionnaireReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onConfirm$1$3", m3645f = "QuestionnaireReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewDuxo$onConfirm$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<QuestionnaireReviewViewState, Continuation<? super QuestionnaireReviewViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QuestionnaireReviewViewState questionnaireReviewViewState, Continuation<? super QuestionnaireReviewViewState> continuation) {
                return ((AnonymousClass3) create(questionnaireReviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return QuestionnaireReviewViewState.copy$default((QuestionnaireReviewViewState) this.L$0, null, false, 1, null);
            }
        }
    }

    public final void onConfirm(List<UiQuestionnaireReview.QuestionAnswer> questionAnswers) {
        Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C198471(questionAnswers, null), 3, null);
    }

    /* compiled from: QuestionnaireReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewDuxo;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<QuestionnaireReviewDuxo, QuestionnaireReviewFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public QuestionnaireReviewFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (QuestionnaireReviewFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public QuestionnaireReviewFragment.Args getArgs(QuestionnaireReviewDuxo questionnaireReviewDuxo) {
            return (QuestionnaireReviewFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, questionnaireReviewDuxo);
        }
    }
}
