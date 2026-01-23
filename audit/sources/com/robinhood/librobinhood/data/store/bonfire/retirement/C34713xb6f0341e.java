package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUserInfoResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Retirement401kRolloverStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUserInfoResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$retirement401kRolloverUserInfoEndpoint$1", m3645f = "Retirement401kRolloverStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$retirement401kRolloverUserInfoEndpoint$1 */
/* loaded from: classes13.dex */
final class C34713xb6f0341e extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiRetirement401kRolloverUserInfoResponse>, Object> {
    int label;
    final /* synthetic */ Retirement401kRolloverStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34713xb6f0341e(Retirement401kRolloverStore retirement401kRolloverStore, Continuation<? super C34713xb6f0341e> continuation) {
        super(2, continuation);
        this.this$0 = retirement401kRolloverStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C34713xb6f0341e(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiRetirement401kRolloverUserInfoResponse> continuation) {
        return ((C34713xb6f0341e) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RetirementApi retirementApi = this.this$0.retirementApi;
        this.label = 1;
        Object obj2 = retirementApi.get401kRolloverUserInfo(this);
        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
    }
}
