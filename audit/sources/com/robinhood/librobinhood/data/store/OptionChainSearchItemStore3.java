package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p355ui.InstrumentPosition;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: OptionChainSearchItemStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByHoldingInstrumentPositions$1$1", m3645f = "OptionChainSearchItemStore.kt", m3646l = {101}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByHoldingInstrumentPositions$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionChainSearchItemStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    int label;
    final /* synthetic */ OptionChainSearchItemStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainSearchItemStore3(OptionChainSearchItemStore optionChainSearchItemStore, String str, Continuation<? super OptionChainSearchItemStore3> continuation) {
        super(2, continuation);
        this.this$0 = optionChainSearchItemStore;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainSearchItemStore3(this.this$0, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionChainSearchItemStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.instrumentPositionStore.refreshHoldingInstrumentPositionsForAccount(false, this.$accountNumber);
            Observable<List<InstrumentPosition>> holdingInstrumentPositionsForAccount = this.this$0.instrumentPositionStore.getHoldingInstrumentPositionsForAccount(this.$accountNumber);
            final OptionChainSearchItemStore optionChainSearchItemStore = this.this$0;
            Completable completableSwitchMapCompletable = holdingInstrumentPositionsForAccount.switchMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByHoldingInstrumentPositions$1$1.1
                @Override // io.reactivex.functions.Function
                public final CompletableSource apply(List<InstrumentPosition> instrumentPositions) {
                    Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = instrumentPositions.iterator();
                    while (it.hasNext()) {
                        UUID tradableChainId = ((InstrumentPosition) it.next()).getInstrument().getTradableChainId();
                        if (tradableChainId != null) {
                            arrayList.add(tradableChainId);
                        }
                    }
                    return OptionChainStore.pingOptionChainsCompletable$default(optionChainSearchItemStore.optionChainStore, arrayList, false, 2, null);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
            this.label = 1;
            if (RxAwait3.await(completableSwitchMapCompletable, this) == coroutine_suspended) {
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
