package com.robinhood.android.wires.p278ui;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.DidLinkAccountRequestDto;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.WireAccountCreationService;

/* compiled from: RealWireAccountCreationService.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/RealWireAccountCreationService;", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/WireAccountCreationService;", "wireAccountCreationEventBus", "Lcom/robinhood/android/wires/ui/WireAccountCreationEventBus;", "<init>", "(Lcom/robinhood/android/wires/ui/WireAccountCreationEventBus;)V", "DidLinkAccount", "", "request", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;", "(Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RealWireAccountCreationService implements WireAccountCreationService {
    public static final int $stable = 8;
    private final WireAccountCreationEventBus wireAccountCreationEventBus;

    public Object DidLinkAccount(Request<DidLinkAccountRequestDto> request, Continuation<? super Response<Unit>> continuation) {
        return WireAccountCreationService.DefaultImpls.DidLinkAccount(this, request, continuation);
    }

    public RealWireAccountCreationService(WireAccountCreationEventBus wireAccountCreationEventBus) {
        Intrinsics.checkNotNullParameter(wireAccountCreationEventBus, "wireAccountCreationEventBus");
        this.wireAccountCreationEventBus = wireAccountCreationEventBus;
    }

    @Override // microgram.contracts.money_movement.wire_account_creation.proto.p502v1.WireAccountCreationService
    public Object DidLinkAccount(DidLinkAccountRequestDto didLinkAccountRequestDto, Continuation<? super Unit> continuation) {
        Object objEmit = this.wireAccountCreationEventBus.getAccountCreationEventFlow().emit(didLinkAccountRequestDto, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }
}
