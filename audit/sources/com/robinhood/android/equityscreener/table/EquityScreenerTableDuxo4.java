package com.robinhood.android.equityscreener.table;

import com.plaid.internal.EnumC7081g;
import com.robinhood.equityscreener.models.LocalScreenerMetadata;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityScreenerTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onStart$6$1", m3645f = "EquityScreenerTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onStart$6$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityScreenerTableDuxo4 extends ContinuationImpl7 implements Function2<EquityScreenerTableDataState, Continuation<? super EquityScreenerTableDataState>, Object> {
    final /* synthetic */ LocalScreenerMetadata $localScreenerData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityScreenerTableDuxo4(LocalScreenerMetadata localScreenerMetadata, Continuation<? super EquityScreenerTableDuxo4> continuation) {
        super(2, continuation);
        this.$localScreenerData = localScreenerMetadata;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityScreenerTableDuxo4 equityScreenerTableDuxo4 = new EquityScreenerTableDuxo4(this.$localScreenerData, continuation);
        equityScreenerTableDuxo4.L$0 = obj;
        return equityScreenerTableDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityScreenerTableDataState equityScreenerTableDataState, Continuation<? super EquityScreenerTableDataState> continuation) {
        return ((EquityScreenerTableDuxo4) create(equityScreenerTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EquityScreenerTableDataState.copy$default((EquityScreenerTableDataState) this.L$0, null, this.$localScreenerData.getScreener(), null, null, boxing.boxBoolean(this.$localScreenerData.isDraft()), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, null);
    }
}
