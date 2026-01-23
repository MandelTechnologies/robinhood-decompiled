package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$8$1", m3645f = "AccountSelectorComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$8$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ Function1<Function1<? super Integer, Unit>, Unit> $scrollToTabRequestor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectorComposableKt$AccountSelectorComposable$8$1(Function1<? super Function1<? super Integer, Unit>, Unit> function1, CoroutineScope coroutineScope, PagerState pagerState, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$8$1> continuation) {
        super(2, continuation);
        this.$scrollToTabRequestor = function1;
        this.$coroutineScope = coroutineScope;
        this.$pagerState = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$8$1(this.$scrollToTabRequestor, this.$coroutineScope, this.$pagerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<Function1<? super Integer, Unit>, Unit> function1 = this.$scrollToTabRequestor;
        if (function1 != null) {
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final PagerState pagerState = this.$pagerState;
            function1.invoke(new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$8$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AccountSelectorComposableKt$AccountSelectorComposable$8$1.invokeSuspend$lambda$0(coroutineScope, pagerState, ((Integer) obj2).intValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope, PagerState pagerState, int i) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountSelectorComposableKt$AccountSelectorComposable$8$1$1$1(pagerState, i, null), 3, null);
        return Unit.INSTANCE;
    }
}
