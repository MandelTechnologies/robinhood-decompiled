package com.robinhood.shared.crypto.transfer.unified;

import androidx.compose.foundation.pager.PagerState;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferUnifiedComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$4$1", m3645f = "CryptoTransferUnifiedComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$4$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferUnifiedComposable7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoTransferUnifiedViewState.Screen $activeScreen;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransferUnifiedComposable7(CoroutineScope coroutineScope, PagerState pagerState, CryptoTransferUnifiedViewState.Screen screen, Continuation<? super CryptoTransferUnifiedComposable7> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$pagerState = pagerState;
        this.$activeScreen = screen;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoTransferUnifiedComposable7(this.$scope, this.$pagerState, this.$activeScreen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoTransferUnifiedComposable7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CryptoTransferUnifiedComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$4$1$1", m3645f = "CryptoTransferUnifiedComposable.kt", m3646l = {155}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoTransferUnifiedViewState.Screen $activeScreen;
        final /* synthetic */ PagerState $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagerState pagerState, CryptoTransferUnifiedViewState.Screen screen, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pagerState = pagerState;
            this.$activeScreen = screen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$pagerState, this.$activeScreen, continuation);
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
                PagerState pagerState = this.$pagerState;
                int index = this.$activeScreen.getIndex();
                this.label = 1;
                if (PagerState.scrollToPage$default(pagerState, index, 0.0f, this, 2, null) == coroutine_suspended) {
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
            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass1(this.$pagerState, this.$activeScreen, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
