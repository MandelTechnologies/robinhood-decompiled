package com.robinhood.store.advisory;

import advisory.proto.p008v1.GetTaxLossHarvestDashboardRequestDto;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: TaxLossHarvestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardRequestDto;", AnalyticsStrings.TAB_NAV_TAB_BAR_DASHBOARD, "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.TaxLossHarvestStore$dashboardEndpoint$2", m3645f = "TaxLossHarvestStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class TaxLossHarvestStore$dashboardEndpoint$2 extends ContinuationImpl7 implements Function3<GetTaxLossHarvestDashboardRequestDto, TaxLossHarvestDashboard, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ TaxLossHarvestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxLossHarvestStore$dashboardEndpoint$2(TaxLossHarvestStore taxLossHarvestStore, Continuation<? super TaxLossHarvestStore$dashboardEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = taxLossHarvestStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(GetTaxLossHarvestDashboardRequestDto getTaxLossHarvestDashboardRequestDto, TaxLossHarvestDashboard taxLossHarvestDashboard, Continuation<? super Unit> continuation) {
        TaxLossHarvestStore$dashboardEndpoint$2 taxLossHarvestStore$dashboardEndpoint$2 = new TaxLossHarvestStore$dashboardEndpoint$2(this.this$0, continuation);
        taxLossHarvestStore$dashboardEndpoint$2.L$0 = getTaxLossHarvestDashboardRequestDto;
        taxLossHarvestStore$dashboardEndpoint$2.L$1 = taxLossHarvestDashboard;
        return taxLossHarvestStore$dashboardEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GetTaxLossHarvestDashboardRequestDto getTaxLossHarvestDashboardRequestDto = (GetTaxLossHarvestDashboardRequestDto) this.L$0;
            TaxLossHarvestDashboard taxLossHarvestDashboard = (TaxLossHarvestDashboard) this.L$1;
            StateFlow2 stateFlow2 = (StateFlow2) this.this$0.taxLossHarvestDashboardFlow.get(getTaxLossHarvestDashboardRequestDto.getYear());
            if (stateFlow2 != null) {
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, taxLossHarvestDashboard));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
