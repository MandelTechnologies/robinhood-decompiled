package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.sweep.api.SweepApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiSweep;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SweepStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiSweep;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SweepStore$refresh$2$1", m3645f = "SweepStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.SweepStore$refresh$2$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SweepStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiSweep>>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ SweepStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepStore3(SweepStore sweepStore, String str, Continuation<? super SweepStore3> continuation) {
        super(2, continuation);
        this.this$0 = sweepStore;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SweepStore3(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiSweep>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiSweep>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiSweep>> continuation) {
        return ((SweepStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SweepApi sweepApi = this.this$0.sweepApi;
        String str = this.$it;
        this.label = 1;
        Object sweeps = sweepApi.getSweeps(str, this);
        return sweeps == coroutine_suspended ? coroutine_suspended : sweeps;
    }
}
