package com.robinhood.android.redesigninvesting.highlights.p231ui;

import com.robinhood.android.redesigninvesting.highlights.HighlightsManager;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HighlightsCardDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardDataState;", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardViewState;", "highlightsManager", "Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager;", "stateProvider", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager;Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lkotlinx/coroutines/Job;", "card", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard;", "lib-highlights-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class HighlightsCardDuxo extends BaseDuxo<HighlightsCardDataState, HighlightsCardViewState> {
    public static final int $stable = 8;
    private final HighlightsManager highlightsManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightsCardDuxo(HighlightsManager highlightsManager, HighlightsCardDuxo3 stateProvider, DuxoBundle duxoBundle) {
        super(new HighlightsCardDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(highlightsManager, "highlightsManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.highlightsManager = highlightsManager;
    }

    /* compiled from: HighlightsCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCardDuxo$bind$1", m3645f = "HighlightsCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCardDuxo$bind$1 */
    static final class C264831 extends ContinuationImpl7 implements Function2<HighlightsCardDataState, Continuation<? super HighlightsCardDataState>, Object> {
        final /* synthetic */ HighlightCard $card;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C264831(HighlightCard highlightCard, Continuation<? super C264831> continuation) {
            super(2, continuation);
            this.$card = highlightCard;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264831 c264831 = new C264831(this.$card, continuation);
            c264831.L$0 = obj;
            return c264831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HighlightsCardDataState highlightsCardDataState, Continuation<? super HighlightsCardDataState> continuation) {
            return ((C264831) create(highlightsCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((HighlightsCardDataState) this.L$0).copy(this.$card);
        }
    }

    public final Job bind(HighlightCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        applyMutation(new C264831(card, null));
        return getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C264842(card, this, null));
    }

    /* compiled from: HighlightsCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCardDuxo$bind$2", m3645f = "HighlightsCardDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCardDuxo$bind$2 */
    static final class C264842 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HighlightCard $card;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HighlightsCardDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C264842(HighlightCard highlightCard, HighlightsCardDuxo highlightsCardDuxo, Continuation<? super C264842> continuation) {
            super(2, continuation);
            this.$card = highlightCard;
            this.this$0 = highlightsCardDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264842 c264842 = new C264842(this.$card, this.this$0, continuation);
            c264842.L$0 = obj;
            return c264842;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C264842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                HighlightCard highlightCard = this.$card;
                if (highlightCard instanceof HighlightCard.RealHighlightCard) {
                    Flow<HighlightCard> flowStreamHighlight = this.this$0.highlightsManager.streamHighlight(coroutineScope, ((HighlightCard.RealHighlightCard) this.$card).getId(), ((HighlightCard.RealHighlightCard) this.$card).getType());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamHighlight, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (!Intrinsics.areEqual(highlightCard, HighlightCard.Empty.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: HighlightsCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCardDuxo$bind$2$1", m3645f = "HighlightsCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCardDuxo$bind$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HighlightCard, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HighlightsCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HighlightsCardDuxo highlightsCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = highlightsCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HighlightCard highlightCard, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(highlightCard, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: HighlightsCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCardDuxo$bind$2$1$1", m3645f = "HighlightsCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCardDuxo$bind$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504931 extends ContinuationImpl7 implements Function2<HighlightsCardDataState, Continuation<? super HighlightsCardDataState>, Object> {
                final /* synthetic */ HighlightCard $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504931(HighlightCard highlightCard, Continuation<? super C504931> continuation) {
                    super(2, continuation);
                    this.$it = highlightCard;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504931 c504931 = new C504931(this.$it, continuation);
                    c504931.L$0 = obj;
                    return c504931;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(HighlightsCardDataState highlightsCardDataState, Continuation<? super HighlightsCardDataState> continuation) {
                    return ((C504931) create(highlightsCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((HighlightsCardDataState) this.L$0).copy(this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504931((HighlightCard) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
