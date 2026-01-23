package com.robinhood.librobinhood.data.store;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: CryptoDetailIacHeroCardInvalidator.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;", "", "<init>", "()V", "trigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/librobinhood/data/store/CardsToInvalidate;", "streamInvalidationTrigger", "Lkotlinx/coroutines/flow/Flow;", "invalidateIacHeroCard", "", "cardIdentifiers", "", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoDetailIacHeroCardInvalidator {
    private final SharedFlow2<CardsToInvalidate> trigger = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);

    public final Flow<CardsToInvalidate> streamInvalidationTrigger() {
        return FlowKt.asSharedFlow(this.trigger);
    }

    public final Object invalidateIacHeroCard(Set<String> set, Continuation<? super Unit> continuation) {
        Object objEmit = this.trigger.emit(new CardsToInvalidate(set), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }
}
