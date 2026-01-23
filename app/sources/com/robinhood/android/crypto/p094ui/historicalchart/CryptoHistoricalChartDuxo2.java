package com.robinhood.android.crypto.p094ui.historicalchart;

import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartComposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CryptoHistoricalChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$2$2$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {94, 95}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$2$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHistoricalChartDuxo2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $$this$launch;
    final /* synthetic */ HistoricalChartComposable $chartMode;
    final /* synthetic */ UUID $currencyPairId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoHistoricalChartDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHistoricalChartDuxo2(CoroutineScope coroutineScope, CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, UUID uuid, HistoricalChartComposable historicalChartComposable, Continuation<? super CryptoHistoricalChartDuxo2> continuation) {
        super(2, continuation);
        this.$$this$launch = coroutineScope;
        this.this$0 = cryptoHistoricalChartDuxo;
        this.$currencyPairId = uuid;
        this.$chartMode = historicalChartComposable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHistoricalChartDuxo2 cryptoHistoricalChartDuxo2 = new CryptoHistoricalChartDuxo2(this.$$this$launch, this.this$0, this.$currencyPairId, this.$chartMode, continuation);
        cryptoHistoricalChartDuxo2.L$0 = obj;
        return cryptoHistoricalChartDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return ((CryptoHistoricalChartDuxo2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (r1.emit(r15, r14) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            EnumEntries<DisplaySpan> entries = DisplaySpan.getEntries();
            ArrayList arrayList = new ArrayList();
            for (DisplaySpan displaySpan : entries) {
                if (!CryptoHistoricalChartDuxo6.isExcludedPreFetchDisplaySpan(displaySpan)) {
                    arrayList.add(displaySpan);
                }
            }
            CoroutineScope coroutineScope = this.$$this$launch;
            CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo = this.this$0;
            UUID uuid = this.$currencyPairId;
            HistoricalChartComposable historicalChartComposable = this.$chartMode;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoHistoricalChartDuxo3(cryptoHistoricalChartDuxo, uuid, (DisplaySpan) it.next(), historicalChartComposable, null), 3, null));
                cryptoHistoricalChartDuxo = cryptoHistoricalChartDuxo;
                uuid = uuid;
                historicalChartComposable = historicalChartComposable;
            }
            this.L$0 = flowCollector;
            this.label = 1;
            if (Await2.awaitAll(arrayList2, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        Unit unit = Unit.INSTANCE;
        this.L$0 = null;
        this.label = 2;
    }
}
