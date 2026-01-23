package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.ApiProfileAccountBreakdown;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: ProfileAccountBreakdownStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiProfileAccountBreakdown;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ProfileAccountBreakdownStore$endpoint$1", m3645f = "ProfileAccountBreakdownStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.ProfileAccountBreakdownStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ProfileAccountBreakdownStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Response<ApiProfileAccountBreakdown>>, Object> {
    int label;
    final /* synthetic */ ProfileAccountBreakdownStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileAccountBreakdownStore2(ProfileAccountBreakdownStore profileAccountBreakdownStore, Continuation<? super ProfileAccountBreakdownStore2> continuation) {
        super(2, continuation);
        this.this$0 = profileAccountBreakdownStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAccountBreakdownStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Response<ApiProfileAccountBreakdown>> continuation) {
        return ((ProfileAccountBreakdownStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BonfireApi bonfireApi = this.this$0.bonfireApi;
        this.label = 1;
        Object profileAccountBreakdown = bonfireApi.getProfileAccountBreakdown(this);
        return profileAccountBreakdown == coroutine_suspended ? coroutine_suspended : profileAccountBreakdown;
    }
}
