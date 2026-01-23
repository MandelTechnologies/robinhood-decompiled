package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/IndexRowItemDataState;", "indexUnderlyingIdToAggregateOptionPositions", "", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "indexUnderlyingIdToNames", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$indexUnderlyingsRowDataStateFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$indexUnderlyingsRowDataStateFlow$1 */
/* loaded from: classes11.dex */
final class C23612xa8310bd3 extends ContinuationImpl7 implements Function3<Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>, Map<UUID, ? extends Tuples2<? extends String, ? extends String>>, Continuation<? super List<? extends IndexRowItemDataState>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    C23612xa8310bd3(Continuation<? super C23612xa8310bd3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>> map, Map<UUID, ? extends Tuples2<? extends String, ? extends String>> map2, Continuation<? super List<? extends IndexRowItemDataState>> continuation) {
        return invoke2((Map<UUID, ? extends List<UiAggregateOptionPositionFull>>) map, (Map<UUID, Tuples2<String, String>>) map2, (Continuation<? super List<IndexRowItemDataState>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<UUID, ? extends List<UiAggregateOptionPositionFull>> map, Map<UUID, Tuples2<String, String>> map2, Continuation<? super List<IndexRowItemDataState>> continuation) {
        C23612xa8310bd3 c23612xa8310bd3 = new C23612xa8310bd3(continuation);
        c23612xa8310bd3.L$0 = map;
        c23612xa8310bd3.L$1 = map2;
        return c23612xa8310bd3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Map map = (Map) this.L$0;
            Map map2 = (Map) this.L$1;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                UUID uuid = (UUID) entry.getKey();
                List list = (List) entry.getValue();
                Tuples2 tuples2 = (Tuples2) map2.get(uuid);
                IndexRowItemDataState indexRowItemDataState = tuples2 == null ? null : new IndexRowItemDataState(uuid, list, (String) tuples2.getFirst(), (String) tuples2.getSecond());
                if (indexRowItemDataState != null) {
                    arrayList.add(indexRowItemDataState);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
