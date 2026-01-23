package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.optionschain.sbschain.table.util.AnimateScrollToCenterQuote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$2$2$scrollToQuote$1$1$1", m3645f = "OptionSideBySideChainTable.kt", m3646l = {459}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$2$2$scrollToQuote$1$1$1 */
/* loaded from: classes11.dex */
final class C24605x8af3c52e extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Integer $quoteIndex;
    final /* synthetic */ SnapshotState4<Integer> $scrollQuoteToTableCenterOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24605x8af3c52e(LazyListState lazyListState, Integer num, SnapshotState4<Integer> snapshotState4, Continuation<? super C24605x8af3c52e> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$quoteIndex = num;
        this.$scrollQuoteToTableCenterOffset$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24605x8af3c52e(this.$lazyListState, this.$quoteIndex, this.$scrollQuoteToTableCenterOffset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24605x8af3c52e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$lazyListState;
            Integer num = this.$quoteIndex;
            int iInvoke$lambda$70$lambda$69$lambda$26 = OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$26(this.$scrollQuoteToTableCenterOffset$delegate);
            this.label = 1;
            if (AnimateScrollToCenterQuote.animateScrollToCenterQuote(lazyListState, num, iInvoke$lambda$70$lambda$69$lambda$26, this) == coroutine_suspended) {
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
