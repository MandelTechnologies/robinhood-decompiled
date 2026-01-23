package com.robinhood.android.eventcontracts.sharedeventui.trade;

import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: CheckTradabilityUseCase.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JÁ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\u00142!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00050\u001428\u0010\u001b\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\u001cH\u0086\u0002¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;", "", "<init>", "()V", "invoke", "", "contractId", "Ljava/util/UUID;", "side", "Lrosetta/mainst/SideDto;", "positionEffect", "Lrosetta/mainst/PositionEffectDto;", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "optionalSwapAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "isMarketOpen", "", "onStartTrade", "Lkotlin/Function1;", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "Lkotlin/ParameterName;", "name", "orderContext", "onStartOnboarding", "eventId", "onShowAttestation", "Lkotlin/Function2;", "", "attestationType", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CheckTradabilityUseCase {
    public static final int $stable = 0;

    public final void invoke(UUID contractId, SideDto side, PositionEffectDto positionEffect, UiEcEvent uiEvent, Optional<FuturesAccount> optionalSwapAccount, boolean isMarketOpen, Function1<? super EventTradeOrderContext, Unit> onStartTrade, Function1<? super UUID, Unit> onStartOnboarding, Function2<? super String, ? super EventTradeOrderContext, Unit> onShowAttestation) {
        Event event;
        UUID eventId;
        Event event2;
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(optionalSwapAccount, "optionalSwapAccount");
        Intrinsics.checkNotNullParameter(onStartTrade, "onStartTrade");
        Intrinsics.checkNotNullParameter(onStartOnboarding, "onStartOnboarding");
        Intrinsics.checkNotNullParameter(onShowAttestation, "onShowAttestation");
        FuturesAccount orNull = optionalSwapAccount.getOrNull();
        String attestation = (uiEvent == null || (event2 = uiEvent.getEvent()) == null) ? null : event2.getAttestation();
        if (orNull == null) {
            if (uiEvent == null || (event = uiEvent.getEvent()) == null || (eventId = event.getEventId()) == null) {
                return;
            }
            onStartOnboarding.invoke(eventId);
            return;
        }
        if (attestation != null && !FuturesAccount2.signedAttestation(orNull, attestation)) {
            onShowAttestation.invoke(attestation, isMarketOpen ? new EventTradeOrderContext(contractId, side, positionEffect) : null);
        } else {
            onStartTrade.invoke(new EventTradeOrderContext(contractId, side, positionEffect));
        }
    }
}
