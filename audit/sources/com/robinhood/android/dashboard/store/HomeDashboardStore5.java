package com.robinhood.android.dashboard.store;

import com.robinhood.models.home.HomeState2;
import com.robinhood.models.home.api.ApiHomeState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: HomeDashboardStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/home/api/ApiHomeState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.store.HomeDashboardStore$homeStateEndpoint$2", m3645f = "HomeDashboardStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.store.HomeDashboardStore$homeStateEndpoint$2, reason: use source file name */
/* loaded from: classes2.dex */
final class HomeDashboardStore5 extends ContinuationImpl7 implements Function2<Response<ApiHomeState>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeDashboardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeDashboardStore5(HomeDashboardStore homeDashboardStore, Continuation<? super HomeDashboardStore5> continuation) {
        super(2, continuation);
        this.this$0 = homeDashboardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeDashboardStore5 homeDashboardStore5 = new HomeDashboardStore5(this.this$0, continuation);
        homeDashboardStore5.L$0 = obj;
        return homeDashboardStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiHomeState> response, Continuation<? super Unit> continuation) {
        return ((HomeDashboardStore5) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiHomeState apiHomeState = (ApiHomeState) ((Response) this.L$0).body();
        if (apiHomeState != null) {
            this.this$0.homeStateDao.insert(HomeState2.toDbModel(apiHomeState));
        }
        return Unit.INSTANCE;
    }
}
