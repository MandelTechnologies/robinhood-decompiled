package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Instrument;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: EquityTradingSessionChangedStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Instrument;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$2$1$instrument$1", m3645f = "EquityTradingSessionChangedStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$2$1$instrument$1 */
/* loaded from: classes13.dex */
final class C33836x687d6e5a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Instrument>, Object> {
    final /* synthetic */ UUID $instrumentId;
    final /* synthetic */ EquityTradingSessionChangedStore $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33836x687d6e5a(EquityTradingSessionChangedStore equityTradingSessionChangedStore, UUID uuid, Continuation<? super C33836x687d6e5a> continuation) {
        super(2, continuation);
        this.$this_runCatching = equityTradingSessionChangedStore;
        this.$instrumentId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C33836x687d6e5a(this.$this_runCatching, this.$instrumentId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Instrument> continuation) {
        return ((C33836x687d6e5a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Observable<Instrument> instrument = this.$this_runCatching.instrumentStore.getInstrument(this.$instrumentId);
        this.label = 1;
        Object objAwaitFirst = RxAwait3.awaitFirst(instrument, this);
        return objAwaitFirst == coroutine_suspended ? coroutine_suspended : objAwaitFirst;
    }
}
