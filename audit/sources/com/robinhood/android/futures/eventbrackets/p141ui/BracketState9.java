package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BracketState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketStateKt$rememberBracketState$2$1", m3645f = "BracketState.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketStateKt$rememberBracketState$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class BracketState9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BracketNavigationInfo3 $bracketNavigationState;
    final /* synthetic */ PagerState $horizontalPagerState;
    final /* synthetic */ int $initialRoundIndex;
    final /* synthetic */ SnapshotState<Integer> $latestScrolledToInitialIndexForBracket$delegate;
    final /* synthetic */ ScrollState $verticalScrollState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BracketState9(BracketNavigationInfo3 bracketNavigationInfo3, SnapshotState<Integer> snapshotState, PagerState pagerState, int i, ScrollState scrollState, Continuation<? super BracketState9> continuation) {
        super(2, continuation);
        this.$bracketNavigationState = bracketNavigationInfo3;
        this.$latestScrolledToInitialIndexForBracket$delegate = snapshotState;
        this.$horizontalPagerState = pagerState;
        this.$initialRoundIndex = i;
        this.$verticalScrollState = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BracketState9 bracketState9 = new BracketState9(this.$bracketNavigationState, this.$latestScrolledToInitialIndexForBracket$delegate, this.$horizontalPagerState, this.$initialRoundIndex, this.$verticalScrollState, continuation);
        bracketState9.L$0 = obj;
        return bracketState9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BracketState9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Integer numRememberBracketState$lambda$4 = BracketState8.rememberBracketState$lambda$4(this.$latestScrolledToInitialIndexForBracket$delegate);
            int key = this.$bracketNavigationState.getKey();
            if (numRememberBracketState$lambda$4 == null || numRememberBracketState$lambda$4.intValue() != key) {
                this.$latestScrolledToInitialIndexForBracket$delegate.setValue(boxing.boxInt(this.$bracketNavigationState.getKey()));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C172211(this.$horizontalPagerState, this.$initialRoundIndex, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C172222(this.$verticalScrollState, null), 3, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: BracketState.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketStateKt$rememberBracketState$2$1$1", m3645f = "BracketState.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketStateKt$rememberBracketState$2$1$1 */
    static final class C172211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PagerState $horizontalPagerState;
        final /* synthetic */ int $initialRoundIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172211(PagerState pagerState, int i, Continuation<? super C172211> continuation) {
            super(2, continuation);
            this.$horizontalPagerState = pagerState;
            this.$initialRoundIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C172211(this.$horizontalPagerState, this.$initialRoundIndex, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C172211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PagerState pagerState = this.$horizontalPagerState;
                int i2 = this.$initialRoundIndex;
                this.label = 1;
                if (PagerState.scrollToPage$default(pagerState, i2, 0.0f, this, 2, null) == coroutine_suspended) {
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

    /* compiled from: BracketState.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketStateKt$rememberBracketState$2$1$2", m3645f = "BracketState.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketStateKt$rememberBracketState$2$1$2 */
    static final class C172222 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScrollState $verticalScrollState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C172222(ScrollState scrollState, Continuation<? super C172222> continuation) {
            super(2, continuation);
            this.$verticalScrollState = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C172222(this.$verticalScrollState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C172222) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollState scrollState = this.$verticalScrollState;
                this.label = 1;
                if (scrollState.scrollTo(0, this) == coroutine_suspended) {
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
