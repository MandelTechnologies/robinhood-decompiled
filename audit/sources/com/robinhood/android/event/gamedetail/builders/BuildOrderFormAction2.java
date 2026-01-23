package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildOrderFormAction.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"createOpenOrderFormAction", "Lcom/robinhood/android/event/gamedetail/builders/BuildOrderFormAction;", "optionalSwapsAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildOrderFormActionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildOrderFormAction2 {
    public static final BuildOrderFormAction createOpenOrderFormAction(final Optional<FuturesAccount> optional, final UiEcEvent uiEcEvent) {
        Event event;
        final boolean zNeedsOnboarding = FuturesAccount2.needsOnboarding(optional);
        final String attestation = (uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) ? null : event.getAttestation();
        return new BuildOrderFormAction() { // from class: com.robinhood.android.event.gamedetail.builders.BuildOrderFormActionKt.createOpenOrderFormAction.1
            @Override // com.robinhood.android.event.gamedetail.builders.BuildOrderFormAction
            public final TradeButton.Action build(EventTradeOrderContext orderContext) {
                Event event2;
                Intrinsics.checkNotNullParameter(orderContext, "orderContext");
                eventId = null;
                UUID eventId = null;
                if (zNeedsOnboarding) {
                    UiEcEvent uiEcEvent2 = uiEcEvent;
                    if (uiEcEvent2 != null && (event2 = uiEcEvent2.getEvent()) != null) {
                        eventId = event2.getEventId();
                    }
                    return new TradeButton.Action.StartOnboarding(eventId);
                }
                if (attestation != null) {
                    Optional<FuturesAccount> optional2 = optional;
                    if (!FuturesAccount2.signedAttestation(optional2 != null ? optional2.getOrNull() : null, attestation)) {
                        return new TradeButton.Action.SignAttestation(attestation, orderContext);
                    }
                }
                return new TradeButton.Action.OpenOrderForm(orderContext);
            }
        };
    }
}
