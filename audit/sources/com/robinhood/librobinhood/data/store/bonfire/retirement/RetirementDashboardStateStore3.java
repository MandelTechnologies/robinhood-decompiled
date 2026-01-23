package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementDashboardState;
import com.robinhood.android.models.retirement.dao.RetirementDashboardStateDao;
import com.robinhood.android.models.retirement.p194db.RetirementDashboardState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementDashboardStateStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementDashboardState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementDashboardStateStore$retirementDashboardStateEndpoint$2", m3645f = "RetirementDashboardStateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementDashboardStateStore$retirementDashboardStateEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RetirementDashboardStateStore3 extends ContinuationImpl7 implements Function2<ApiRetirementDashboardState, Continuation<? super Unit>, Object> {
    final /* synthetic */ RetirementDashboardStateDao $retirementDashboardStateDao;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementDashboardStateStore3(RetirementDashboardStateDao retirementDashboardStateDao, Continuation<? super RetirementDashboardStateStore3> continuation) {
        super(2, continuation);
        this.$retirementDashboardStateDao = retirementDashboardStateDao;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementDashboardStateStore3 retirementDashboardStateStore3 = new RetirementDashboardStateStore3(this.$retirementDashboardStateDao, continuation);
        retirementDashboardStateStore3.L$0 = obj;
        return retirementDashboardStateStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRetirementDashboardState apiRetirementDashboardState, Continuation<? super Unit> continuation) {
        return ((RetirementDashboardStateStore3) create(apiRetirementDashboardState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$retirementDashboardStateDao.insert((RetirementDashboardStateDao) RetirementDashboardState2.toDbModel((ApiRetirementDashboardState) this.L$0));
        return Unit.INSTANCE;
    }
}
