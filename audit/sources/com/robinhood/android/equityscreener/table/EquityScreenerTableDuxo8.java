package com.robinhood.android.equityscreener.table;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equityscreener.table.EquityScreenerTableViewState;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityScreenerTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onWatchlistToggled$1$1", m3645f = "EquityScreenerTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onWatchlistToggled$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityScreenerTableDuxo8 extends ContinuationImpl7 implements Function2<EquityScreenerTableDataState, Continuation<? super EquityScreenerTableDataState>, Object> {
    final /* synthetic */ Instrument $instrument;
    final /* synthetic */ boolean $isInstrumentInUserLists;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityScreenerTableDuxo8(Instrument instrument, boolean z, Continuation<? super EquityScreenerTableDuxo8> continuation) {
        super(2, continuation);
        this.$instrument = instrument;
        this.$isInstrumentInUserLists = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityScreenerTableDuxo8 equityScreenerTableDuxo8 = new EquityScreenerTableDuxo8(this.$instrument, this.$isInstrumentInUserLists, continuation);
        equityScreenerTableDuxo8.L$0 = obj;
        return equityScreenerTableDuxo8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityScreenerTableDataState equityScreenerTableDataState, Continuation<? super EquityScreenerTableDataState> continuation) {
        return ((EquityScreenerTableDuxo8) create(equityScreenerTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EquityScreenerTableDataState equityScreenerTableDataState = (EquityScreenerTableDataState) this.L$0;
        Instrument instrument = this.$instrument;
        Intrinsics.checkNotNull(instrument);
        return EquityScreenerTableDataState.copy$default(equityScreenerTableDataState, null, null, null, null, null, null, new ComposeUiEvent(new EquityScreenerTableViewState.WatchlistToggleEvent(instrument, this.$isInstrumentInUserLists)), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }
}
