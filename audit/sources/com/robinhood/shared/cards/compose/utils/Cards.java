package com.robinhood.shared.cards.compose.utils;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.NotificationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cards.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"notificationContext", "Lcom/robinhood/rosetta/eventlogging/NotificationContext;", "Lcom/robinhood/models/card/db/Card;", "getNotificationContext", "(Lcom/robinhood/models/card/db/Card;)Lcom/robinhood/rosetta/eventlogging/NotificationContext;", "lib-cards-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.cards.compose.utils.CardsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Cards {
    public static final NotificationContext getNotificationContext(Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        String type2 = card.getType();
        int serverValue = card.getCategory().getServerValue();
        boolean fixed = card.getFixed();
        String loadId = card.getLoadId();
        String cardId = card.getCardId();
        String title = card.getTitle();
        String message = card.getMessage();
        String deeplinkUri = card.getDeeplinkUri();
        if (deeplinkUri == null) {
            deeplinkUri = "";
        }
        return new NotificationContext(type2, serverValue, fixed, loadId, cardId, title, message, deeplinkUri, null, null, 768, null);
    }
}
