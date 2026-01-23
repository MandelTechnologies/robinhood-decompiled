package com.robinhood.android.optionschain.sbschain.table;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.models.p320db.OptionInstrument;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$1$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C24536x225670a4 extends ContinuationImpl7 implements Function3<FlowCollector<? super Object>, List<? extends OptionInstrument>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24536x225670a4(Continuation continuation, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo) {
        super(3, continuation);
        this.this$0 = optionSideBySideChainTableDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Object> flowCollector, List<? extends OptionInstrument> list, Continuation<? super Unit> continuation) {
        C24536x225670a4 c24536x225670a4 = new C24536x225670a4(continuation, this.this$0);
        c24536x225670a4.L$0 = flowCollector;
        c24536x225670a4.L$1 = list;
        return c24536x225670a4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Observable<?> observableEmpty;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List list = (List) this.L$1;
            if (!list.isEmpty()) {
                OptionQuoteStore optionQuoteStore = this.this$0.optionQuoteStore;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OptionInstrument) it.next()).getId());
                }
                observableEmpty = optionQuoteStore.pollQuotes(arrayList);
            } else {
                observableEmpty = Observable.empty();
            }
            Intrinsics.checkNotNull(observableEmpty);
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableEmpty), Integer.MAX_VALUE, null, 2, null);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowBuffer$default, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
