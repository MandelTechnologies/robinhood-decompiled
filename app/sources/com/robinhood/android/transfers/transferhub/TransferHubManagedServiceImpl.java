package com.robinhood.android.transfers.transferhub;

import com.robinhood.transfers.hub.contracts.TransferHubDisplayLogicContainer;
import com.robinhood.transfers.hub.contracts.TransferHubItemClickIdentifier;
import com.robinhood.transfers.hub.contracts.TransferHubManagedService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferHubManagedServiceImpl.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005J\u0014\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\fR+\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubManagedServiceImpl;", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;", "<init>", "()V", "duxoEventHandler", "Lkotlin/Function1;", "Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;", "Lkotlin/ParameterName;", "name", "identifier", "", "appLoadedHandler", "Lkotlin/Function0;", "displayLogicContainer", "Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "appLoaded", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataForDisplayLogic", "setDataForDisplayLogic", "(Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferHubItemSelected", "(Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setHandler", "handler", "setAppLoadedCallback", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferHubManagedServiceImpl implements TransferHubManagedService {
    public static final int $stable = 8;
    private Function0<Unit> appLoadedHandler;
    private TransferHubDisplayLogicContainer displayLogicContainer = new TransferHubDisplayLogicContainer(false, false, false, false, 4, (DefaultConstructorMarker) null);
    private Function1<? super TransferHubItemClickIdentifier, Unit> duxoEventHandler;

    @Override // com.robinhood.transfers.hub.contracts.TransferHubManagedService
    public Object appLoaded(Continuation<? super Unit> continuation) {
        Function0<Unit> function0 = this.appLoadedHandler;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.hub.contracts.TransferHubManagedService
    public Object getDataForDisplayLogic(Continuation<? super TransferHubDisplayLogicContainer> continuation) {
        return this.displayLogicContainer;
    }

    @Override // com.robinhood.transfers.hub.contracts.TransferHubManagedService
    public Object setDataForDisplayLogic(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer, Continuation<? super Unit> continuation) {
        this.displayLogicContainer = transferHubDisplayLogicContainer;
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.hub.contracts.TransferHubManagedService
    public Object transferHubItemSelected(TransferHubItemClickIdentifier transferHubItemClickIdentifier, Continuation<? super Unit> continuation) {
        Function1<? super TransferHubItemClickIdentifier, Unit> function1 = this.duxoEventHandler;
        if (function1 != null) {
            function1.invoke(transferHubItemClickIdentifier);
        }
        return Unit.INSTANCE;
    }

    public final void setHandler(Function1<? super TransferHubItemClickIdentifier, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.duxoEventHandler = handler;
    }

    public final void setAppLoadedCallback(Function0<Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.appLoadedHandler = handler;
    }
}
