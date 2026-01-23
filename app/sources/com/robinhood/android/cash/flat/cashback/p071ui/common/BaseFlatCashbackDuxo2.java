package com.robinhood.android.cash.flat.cashback.p071ui.common;

import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: BaseFlatCashbackDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "T", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.common.BaseFlatCashbackDuxo$loadContent$2$1", m3645f = "BaseFlatCashbackDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.common.BaseFlatCashbackDuxo$loadContent$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class BaseFlatCashbackDuxo2<T> extends ContinuationImpl7 implements Function2<BaseFlatCashbackDataState<T>, Continuation<? super BaseFlatCashbackDataState<T>>, Object> {
    final /* synthetic */ ProductMarketingContent $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseFlatCashbackDuxo2(ProductMarketingContent productMarketingContent, Continuation<? super BaseFlatCashbackDuxo2> continuation) {
        super(2, continuation);
        this.$it = productMarketingContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseFlatCashbackDuxo2 baseFlatCashbackDuxo2 = new BaseFlatCashbackDuxo2(this.$it, continuation);
        baseFlatCashbackDuxo2.L$0 = obj;
        return baseFlatCashbackDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseFlatCashbackDataState<T> baseFlatCashbackDataState, Continuation<? super BaseFlatCashbackDataState<T>> continuation) {
        return ((BaseFlatCashbackDuxo2) create(baseFlatCashbackDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BaseFlatCashbackDataState.copy$default((BaseFlatCashbackDataState) this.L$0, this.$it, null, null, 6, null);
    }
}
