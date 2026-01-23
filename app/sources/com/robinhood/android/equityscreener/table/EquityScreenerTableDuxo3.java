package com.robinhood.android.equityscreener.table;

import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityScreenerTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onStart$4$1", m3645f = "EquityScreenerTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onStart$4$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityScreenerTableDuxo3 extends ContinuationImpl7 implements Function2<EquityScreenerTableDataState, Continuation<? super EquityScreenerTableDataState>, Object> {
    final /* synthetic */ Map<UUID, List<UUID>> $listMemberships;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EquityScreenerTableDuxo3(Map<UUID, ? extends List<UUID>> map, Continuation<? super EquityScreenerTableDuxo3> continuation) {
        super(2, continuation);
        this.$listMemberships = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityScreenerTableDuxo3 equityScreenerTableDuxo3 = new EquityScreenerTableDuxo3(this.$listMemberships, continuation);
        equityScreenerTableDuxo3.L$0 = obj;
        return equityScreenerTableDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityScreenerTableDataState equityScreenerTableDataState, Continuation<? super EquityScreenerTableDataState> continuation) {
        return ((EquityScreenerTableDuxo3) create(equityScreenerTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EquityScreenerTableDataState equityScreenerTableDataState = (EquityScreenerTableDataState) this.L$0;
        Map<UUID, List<UUID>> map = this.$listMemberships;
        Intrinsics.checkNotNull(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((Map.Entry) it.next()).getKey(), boxing.boxBoolean(!((List) r1.getValue()).isEmpty()));
        }
        return EquityScreenerTableDataState.copy$default(equityScreenerTableDataState, null, null, null, null, null, linkedHashMap, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }
}
