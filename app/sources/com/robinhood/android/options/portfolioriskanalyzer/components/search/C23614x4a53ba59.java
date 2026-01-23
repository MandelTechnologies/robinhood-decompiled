package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a2\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "uiAggregateOptionPositionFulls"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$underlyingIdToAggregateOptionPositionsFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$underlyingIdToAggregateOptionPositionsFlow$1 */
/* loaded from: classes11.dex */
final class C23614x4a53ba59 extends ContinuationImpl7 implements Function2<List<? extends UiAggregateOptionPositionFull>, Continuation<? super Tuples2<? extends Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>, ? extends Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    C23614x4a53ba59(Continuation<? super C23614x4a53ba59> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C23614x4a53ba59 c23614x4a53ba59 = new C23614x4a53ba59(continuation);
        c23614x4a53ba59.L$0 = obj;
        return c23614x4a53ba59;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UiAggregateOptionPositionFull> list, Continuation<? super Tuples2<? extends Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>, ? extends Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>>> continuation) {
        return invoke2((List<UiAggregateOptionPositionFull>) list, (Continuation<? super Tuples2<? extends Map<UUID, ? extends List<UiAggregateOptionPositionFull>>, ? extends Map<UUID, ? extends List<UiAggregateOptionPositionFull>>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UiAggregateOptionPositionFull> list, Continuation<? super Tuples2<? extends Map<UUID, ? extends List<UiAggregateOptionPositionFull>>, ? extends Map<UUID, ? extends List<UiAggregateOptionPositionFull>>>> continuation) {
        return ((C23614x4a53ba59) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<UiAggregateOptionPositionFull> list = (List) this.L$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (UiAggregateOptionPositionFull uiAggregateOptionPositionFull : list) {
            UUID singleEquityUnderlyingId = uiAggregateOptionPositionFull.getUiOptionChain().getSingleEquityUnderlyingId();
            if (singleEquityUnderlyingId != null) {
                Object arrayList = linkedHashMap.get(singleEquityUnderlyingId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(singleEquityUnderlyingId, arrayList);
                }
                boxing.boxBoolean(((List) arrayList).add(uiAggregateOptionPositionFull));
            }
            UUID indexUnderlyingId = uiAggregateOptionPositionFull.getUiOptionChain().getIndexUnderlyingId();
            if (indexUnderlyingId != null) {
                Object arrayList2 = linkedHashMap2.get(indexUnderlyingId);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(indexUnderlyingId, arrayList2);
                }
                boxing.boxBoolean(((List) arrayList2).add(uiAggregateOptionPositionFull));
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry.getKey(), CollectionsKt.toList((Iterable) entry.getValue()));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap4.put(entry2.getKey(), CollectionsKt.toList((Iterable) entry2.getValue()));
        }
        return Tuples4.m3642to(linkedHashMap3, linkedHashMap4);
    }
}
