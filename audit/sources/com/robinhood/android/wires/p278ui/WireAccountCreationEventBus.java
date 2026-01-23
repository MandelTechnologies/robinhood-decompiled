package com.robinhood.android.wires.p278ui;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.DidLinkAccountRequestDto;

/* compiled from: WireAccountCreationEventBus.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WireAccountCreationEventBus;", "", "<init>", "()V", "accountCreationEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;", "getAccountCreationEventFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class WireAccountCreationEventBus {
    public static final int $stable = 8;
    private final SharedFlow2<DidLinkAccountRequestDto> accountCreationEventFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 6, null);

    public final SharedFlow2<DidLinkAccountRequestDto> getAccountCreationEventFlow() {
        return this.accountCreationEventFlow;
    }
}
