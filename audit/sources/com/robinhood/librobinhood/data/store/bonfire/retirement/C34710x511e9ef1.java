package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverInterstitialResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Retirement401kRolloverStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverInterstitialResponse;", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$retirement401kRolloverInterstitialEndpoint$1", m3645f = "Retirement401kRolloverStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$retirement401kRolloverInterstitialEndpoint$1 */
/* loaded from: classes13.dex */
final class C34710x511e9ef1 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super ApiRetirement401kRolloverInterstitialResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Retirement401kRolloverStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34710x511e9ef1(Retirement401kRolloverStore retirement401kRolloverStore, Continuation<? super C34710x511e9ef1> continuation) {
        super(2, continuation);
        this.this$0 = retirement401kRolloverStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34710x511e9ef1 c34710x511e9ef1 = new C34710x511e9ef1(this.this$0, continuation);
        c34710x511e9ef1.L$0 = obj;
        return c34710x511e9ef1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super ApiRetirement401kRolloverInterstitialResponse> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super ApiRetirement401kRolloverInterstitialResponse> continuation) {
        return ((C34710x511e9ef1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        String str2 = (String) tuples2.component2();
        RetirementApi retirementApi = this.this$0.retirementApi;
        this.label = 1;
        Object obj2 = retirementApi.get401kRolloverInterstitial(str, str2, this);
        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
    }
}
