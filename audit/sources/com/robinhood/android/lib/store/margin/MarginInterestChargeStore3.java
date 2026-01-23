package com.robinhood.android.lib.store.margin;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiMarginInterestCharge;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginInterestChargeStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiMarginInterestCharge;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginInterestChargeStore$refresh$1$1", m3645f = "MarginInterestChargeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.store.margin.MarginInterestChargeStore$refresh$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginInterestChargeStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiMarginInterestCharge>>, Object> {
    final /* synthetic */ String $cursor;
    int label;
    final /* synthetic */ MarginInterestChargeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginInterestChargeStore3(MarginInterestChargeStore marginInterestChargeStore, String str, Continuation<? super MarginInterestChargeStore3> continuation) {
        super(2, continuation);
        this.this$0 = marginInterestChargeStore;
        this.$cursor = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginInterestChargeStore3(this.this$0, this.$cursor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiMarginInterestCharge>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiMarginInterestCharge>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiMarginInterestCharge>> continuation) {
        return ((MarginInterestChargeStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Brokeback brokeback = this.this$0.brokeback;
        String str = this.$cursor;
        this.label = 1;
        Object marginInterestCharges = brokeback.getMarginInterestCharges(str, this);
        return marginInterestCharges == coroutine_suspended ? coroutine_suspended : marginInterestCharges;
    }
}
