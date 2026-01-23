package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.models.p320db.Instrument;
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
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "Lkotlin/Pair;", "", "instruments", "", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$equityUnderlyingIdToNamesFlow$3", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$equityUnderlyingIdToNamesFlow$3 */
/* loaded from: classes11.dex */
final class C23609xfcea8486 extends ContinuationImpl7 implements Function2<List<? extends Instrument>, Continuation<? super Map<UUID, ? extends Tuples2<? extends String, ? extends String>>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    C23609xfcea8486(Continuation<? super C23609xfcea8486> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C23609xfcea8486 c23609xfcea8486 = new C23609xfcea8486(continuation);
        c23609xfcea8486.L$0 = obj;
        return c23609xfcea8486;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Instrument> list, Continuation<? super Map<UUID, ? extends Tuples2<? extends String, ? extends String>>> continuation) {
        return invoke2((List<Instrument>) list, (Continuation<? super Map<UUID, Tuples2<String, String>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Instrument> list, Continuation<? super Map<UUID, Tuples2<String, String>>> continuation) {
        return ((C23609xfcea8486) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<Instrument> list = (List) this.L$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Instrument instrument : list) {
            String simpleName = instrument.getSimpleName();
            if (simpleName == null) {
                simpleName = instrument.getSymbol();
            }
            Tuples2 tuples2M3642to = Tuples4.m3642to(instrument.getId(), Tuples4.m3642to(simpleName, instrument.getSymbol()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }
}
