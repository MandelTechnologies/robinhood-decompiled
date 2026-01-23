package com.robinhood.android.equityscreener.table;

import com.plaid.internal.EnumC7081g;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityScreenerTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onStart$1$1", m3645f = "EquityScreenerTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityScreenerTableDuxo2 extends ContinuationImpl7 implements Function2<EquityScreenerTableDataState, Continuation<? super EquityScreenerTableDataState>, Object> {
    final /* synthetic */ ScanResultResponse $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityScreenerTableDuxo2(ScanResultResponse scanResultResponse, Continuation<? super EquityScreenerTableDuxo2> continuation) {
        super(2, continuation);
        this.$response = scanResultResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityScreenerTableDuxo2 equityScreenerTableDuxo2 = new EquityScreenerTableDuxo2(this.$response, continuation);
        equityScreenerTableDuxo2.L$0 = obj;
        return equityScreenerTableDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityScreenerTableDataState equityScreenerTableDataState, Continuation<? super EquityScreenerTableDataState> continuation) {
        return ((EquityScreenerTableDuxo2) create(equityScreenerTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EquityScreenerTableDataState.copy$default((EquityScreenerTableDataState) this.L$0, null, null, this.$response, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }
}
