package com.robinhood.android.dashboard.store;

import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.models.home.HomeAccountSwitcher2;
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
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/home/api/ApiHomeAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.store.HomeDashboardStore$accountSwitcherEndpoint$2", m3645f = "HomeDashboardStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.store.HomeDashboardStore$accountSwitcherEndpoint$2, reason: use source file name */
/* loaded from: classes2.dex */
final class HomeDashboardStore3 extends ContinuationImpl7 implements Function2<Response<ApiHomeAccountSwitcher>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeDashboardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeDashboardStore3(HomeDashboardStore homeDashboardStore, Continuation<? super HomeDashboardStore3> continuation) {
        super(2, continuation);
        this.this$0 = homeDashboardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeDashboardStore3 homeDashboardStore3 = new HomeDashboardStore3(this.this$0, continuation);
        homeDashboardStore3.L$0 = obj;
        return homeDashboardStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiHomeAccountSwitcher> response, Continuation<? super Unit> continuation) {
        return ((HomeDashboardStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        HomeAccountSwitcher dbModel;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiHomeAccountSwitcher apiHomeAccountSwitcher = (ApiHomeAccountSwitcher) ((Response) this.L$0).body();
        if (apiHomeAccountSwitcher != null && (dbModel = HomeAccountSwitcher2.toDbModel(apiHomeAccountSwitcher)) != null) {
            HomeDashboardStore homeDashboardStore = this.this$0;
            homeDashboardStore.activeAccountSwitcher.setValue(dbModel);
            homeDashboardStore.clearActiveDashboardIfStale(dbModel);
        }
        return Unit.INSTANCE;
    }
}
