package com.robinhood.shared.portfolio.lists.p391ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.models.api.CuratedListObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CuratedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends PositionsV2>>, List<? extends CuratedListObjectType>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CuratedListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, CuratedListDuxo curatedListDuxo, String str) {
        super(3, continuation);
        this.this$0 = curatedListDuxo;
        this.$accountNumber$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends PositionsV2>> flowCollector, List<? extends CuratedListObjectType> list, Continuation<? super Unit> continuation) {
        CuratedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1 curatedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1 = new CuratedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0, this.$accountNumber$inlined);
        curatedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        curatedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1.L$1 = list;
        return curatedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flowStreamPositionItemsForInstrumentTypes$default = PositionsV2Store.streamPositionItemsForInstrumentTypes$default(this.this$0.positionsV2Store, this.$accountNumber$inlined, CuratedListDuxo6.toPositionInstrumentTypes((List) this.L$1), PositionsLocation.HOME_TAB, null, 8, null);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowStreamPositionItemsForInstrumentTypes$default, this) == coroutine_suspended) {
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
