package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.android.indexes.models.p159db.Index;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "Lkotlin/Pair;", "", "indexes", "", "Lcom/robinhood/android/indexes/models/db/Index;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$indexUnderlyingIdToNamesFlow$3", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$indexUnderlyingIdToNamesFlow$3 */
/* loaded from: classes11.dex */
final class C23611x566933c7 extends ContinuationImpl7 implements Function2<List<? extends Index>, Continuation<? super Map<UUID, ? extends Tuples2<? extends String, ? extends String>>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    C23611x566933c7(Continuation<? super C23611x566933c7> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C23611x566933c7 c23611x566933c7 = new C23611x566933c7(continuation);
        c23611x566933c7.L$0 = obj;
        return c23611x566933c7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Index> list, Continuation<? super Map<UUID, ? extends Tuples2<? extends String, ? extends String>>> continuation) {
        return invoke2((List<Index>) list, (Continuation<? super Map<UUID, Tuples2<String, String>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Index> list, Continuation<? super Map<UUID, Tuples2<String, String>>> continuation) {
        return ((C23611x566933c7) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<Index> list = (List) this.L$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Index index : list) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(index.getId(), Tuples4.m3642to(index.getSimpleName(), index.getSymbol()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }
}
