package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicatorConfigRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;

/* compiled from: AdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicatorConfigRequest;", "", "<unused var>"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$postAdvancedChartConfigEndpoint$2", m3645f = "AdvancedChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$postAdvancedChartConfigEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AdvancedChartStore7 extends ContinuationImpl7 implements Function3<Tuples2<? extends ApiTechnicalIndicatorConfigRequest, ? extends Long>, Unit, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedChartStore7(AdvancedChartStore advancedChartStore, Continuation<? super AdvancedChartStore7> continuation) {
        super(3, continuation);
        this.this$0 = advancedChartStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiTechnicalIndicatorConfigRequest, ? extends Long> tuples2, Unit unit, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ApiTechnicalIndicatorConfigRequest, Long>) tuples2, unit, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiTechnicalIndicatorConfigRequest, Long> tuples2, Unit unit, Continuation<? super Unit> continuation) {
        AdvancedChartStore7 advancedChartStore7 = new AdvancedChartStore7(this.this$0, continuation);
        advancedChartStore7.L$0 = tuples2;
        return advancedChartStore7.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Endpoint.DefaultImpls.refresh$default(this.this$0.getAdvancedChartConfigEndpoint, boxing.boxLong(((Number) ((Tuples2) this.L$0).component2()).longValue()), true, null, 4, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
