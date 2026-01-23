package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.models.p320db.Position;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00042\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/EquityRowItemDataState;", "equityUnderlyingIdToAggregateOptionPositions", "", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "equityUnderlyingIdToEquityPosition", "Lcom/robinhood/models/db/Position;", "equityUnderlyingIdToNames", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$equityUnderlyingsRowDataStateFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$equityUnderlyingsRowDataStateFlow$1 */
/* loaded from: classes11.dex */
final class C23610x980de512 extends ContinuationImpl7 implements Function4<Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>, Map<UUID, ? extends Position>, Map<UUID, ? extends Tuples2<? extends String, ? extends String>>, Continuation<? super List<? extends EquityRowItemDataState>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    C23610x980de512(Continuation<? super C23610x980de512> continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>> map, Map<UUID, ? extends Position> map2, Map<UUID, ? extends Tuples2<? extends String, ? extends String>> map3, Continuation<? super List<? extends EquityRowItemDataState>> continuation) {
        return invoke2((Map<UUID, ? extends List<UiAggregateOptionPositionFull>>) map, (Map<UUID, Position>) map2, (Map<UUID, Tuples2<String, String>>) map3, (Continuation<? super List<EquityRowItemDataState>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<UUID, ? extends List<UiAggregateOptionPositionFull>> map, Map<UUID, Position> map2, Map<UUID, Tuples2<String, String>> map3, Continuation<? super List<EquityRowItemDataState>> continuation) {
        C23610x980de512 c23610x980de512 = new C23610x980de512(continuation);
        c23610x980de512.L$0 = map;
        c23610x980de512.L$1 = map2;
        c23610x980de512.L$2 = map3;
        return c23610x980de512.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Map map = (Map) this.L$0;
            Map map2 = (Map) this.L$1;
            Map map3 = (Map) this.L$2;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                UUID uuid = (UUID) entry.getKey();
                List list = (List) entry.getValue();
                Position position = (Position) map2.get(uuid);
                Tuples2 tuples2 = (Tuples2) map3.get(uuid);
                EquityRowItemDataState equityRowItemDataState = tuples2 == null ? null : new EquityRowItemDataState(uuid, list, (String) tuples2.getFirst(), (String) tuples2.getSecond(), position);
                if (equityRowItemDataState != null) {
                    arrayList.add(equityRowItemDataState);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
