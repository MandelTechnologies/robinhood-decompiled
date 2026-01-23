package com.robinhood.android.dashboard.store;

import com.robinhood.android.home.api.HomeApi;
import com.robinhood.models.home.api.ApiHomeAccountSwitcher;
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
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/home/api/ApiHomeAccountSwitcher;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.store.HomeDashboardStore$accountSwitcherEndpoint$1", m3645f = "HomeDashboardStore.kt", m3646l = {89}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.store.HomeDashboardStore$accountSwitcherEndpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class HomeDashboardStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Response<ApiHomeAccountSwitcher>>, Object> {
    int label;
    final /* synthetic */ HomeDashboardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeDashboardStore2(HomeDashboardStore homeDashboardStore, Continuation<? super HomeDashboardStore2> continuation) {
        super(2, continuation);
        this.this$0 = homeDashboardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeDashboardStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Response<ApiHomeAccountSwitcher>> continuation) {
        return ((HomeDashboardStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        HomeApi homeApi = this.this$0.homeApi;
        this.label = 1;
        Object homeAccountSwitcher = homeApi.getHomeAccountSwitcher(this);
        return homeAccountSwitcher == coroutine_suspended ? coroutine_suspended : homeAccountSwitcher;
    }
}
