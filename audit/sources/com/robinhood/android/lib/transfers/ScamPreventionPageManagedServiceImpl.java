package com.robinhood.android.lib.transfers;

import com.robinhood.udf.UiEvent;
import com.robinhood.wiretransfers.contracts.ScamPreventionButtonType;
import com.robinhood.wiretransfers.contracts.ScamPreventionPageManagedService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScamPreventionPageManagedServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/ScamPreventionPageManagedServiceImpl;", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService;", "scamPreventionEventBus", "Lcom/robinhood/android/lib/transfers/ScamPreventionEventBus;", "<init>", "(Lcom/robinhood/android/lib/transfers/ScamPreventionEventBus;)V", "bottomSelectedCallback", "Lkotlin/Function1;", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;", "", "setBottomSelectedCallback", "handler", "buttonSelected", "selectionType", "(Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ScamPreventionPageManagedServiceImpl implements ScamPreventionPageManagedService {
    private Function1<? super ScamPreventionButtonType, Unit> bottomSelectedCallback;
    private final ScamPreventionEventBus scamPreventionEventBus;

    public ScamPreventionPageManagedServiceImpl(ScamPreventionEventBus scamPreventionEventBus) {
        Intrinsics.checkNotNullParameter(scamPreventionEventBus, "scamPreventionEventBus");
        this.scamPreventionEventBus = scamPreventionEventBus;
    }

    public final void setBottomSelectedCallback(Function1<? super ScamPreventionButtonType, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.bottomSelectedCallback = handler;
    }

    @Override // com.robinhood.wiretransfers.contracts.ScamPreventionPageManagedService
    public Object buttonSelected(ScamPreventionButtonType scamPreventionButtonType, Continuation<? super Unit> continuation) {
        this.scamPreventionEventBus.setScamPreventionContinueButtonEvent(new UiEvent<>(scamPreventionButtonType));
        Function1<? super ScamPreventionButtonType, Unit> function1 = this.bottomSelectedCallback;
        if (function1 != null) {
            function1.invoke(scamPreventionButtonType);
        }
        return Unit.INSTANCE;
    }
}
