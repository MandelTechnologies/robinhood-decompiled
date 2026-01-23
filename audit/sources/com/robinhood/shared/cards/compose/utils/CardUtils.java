package com.robinhood.shared.cards.compose.utils;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.cards.compose.C37374R;
import kotlin.Metadata;

/* compiled from: CardUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/cards/compose/utils/CardUtils;", "", "<init>", "()V", "getIconId", "", "icon", "", "lib-cards-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CardUtils {
    public static final int $stable = 0;
    public static final CardUtils INSTANCE = new CardUtils();

    private CardUtils() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int getIconId(String icon) {
        if (icon != null) {
            switch (icon.hashCode()) {
                case -1983962715:
                    if (icon.equals(Card.Icon.ALERT_FILLED)) {
                        return C20690R.drawable.ic_rds_alert_filled_16dp;
                    }
                    break;
                case -1257240475:
                    if (icon.equals(Card.Icon.CORPORATE)) {
                        return C37374R.drawable.ic_cards_corporate;
                    }
                    break;
                case -1177318867:
                    if (icon.equals("account")) {
                        return C37374R.drawable.ic_cards_account;
                    }
                    break;
                case -819951495:
                    if (icon.equals(Card.Icon.VERIFY)) {
                        return C37374R.drawable.ic_cards_thumbprint;
                    }
                    break;
                case -786681338:
                    if (icon.equals(Card.Icon.PAYMENT)) {
                        return C20690R.drawable.ic_rds_payment_16dp;
                    }
                    break;
                case 3739:
                    if (icon.equals("up")) {
                        return C37374R.drawable.ic_cards_trendup;
                    }
                    break;
                case 3016252:
                    if (icon.equals("bank")) {
                        return C20690R.drawable.ic_rds_banking_24dp;
                    }
                    break;
                case 3020035:
                    if (icon.equals(Card.Icon.BELL)) {
                        return C37374R.drawable.ic_cards_bell;
                    }
                    break;
                case 3089570:
                    if (icon.equals("down")) {
                        return C37374R.drawable.ic_cards_trenddown;
                    }
                    break;
                case 3377875:
                    if (icon.equals("news")) {
                        return C37374R.drawable.ic_cards_news;
                    }
                    break;
                case 3540562:
                    if (icon.equals(Card.Icon.STAR)) {
                        return C37374R.drawable.svg_ic_card_star;
                    }
                    break;
                case 92899676:
                    if (icon.equals("alert")) {
                        return C37374R.drawable.ic_cards_alert;
                    }
                    break;
                case 94755854:
                    if (icon.equals(Card.Icon.CLOCK)) {
                        return C37374R.drawable.ic_cards_clock;
                    }
                    break;
                case 106006350:
                    if (icon.equals(Card.Icon.ORDER)) {
                        return C20690R.drawable.ic_rds_order_24dp;
                    }
                    break;
                case 156781895:
                    if (icon.equals(Card.Icon.ANNOUNCEMENT)) {
                        return C37374R.drawable.ic_cards_announcement;
                    }
                    break;
                case 364269551:
                    if (icon.equals(Card.Icon.DIVIDEND)) {
                        return C37374R.drawable.ic_cards_dividends;
                    }
                    break;
                case 686099231:
                    if (icon.equals(Card.Icon.LIGHTBULB)) {
                        return C37374R.drawable.ic_cards_lightbulb;
                    }
                    break;
            }
        }
        return C37374R.drawable.ic_cards_bell;
    }
}
