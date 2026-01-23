package com.robinhood.android.event.detail.builders;

import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: BuildTopAppBarPrimaryText.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0005"}, m3636d2 = {"buildTopAppBarPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "quote1", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "quote2", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.builders.BuildTopAppBarPrimaryTextKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildTopAppBarPrimaryText {
    public static final StringResource buildTopAppBarPrimaryText(EventQuote eventQuote, EventQuote eventQuote2) {
        BigDecimal lastTradePrice;
        BigDecimal lastTradePrice2;
        String strPriceInCents = (eventQuote == null || (lastTradePrice2 = eventQuote.getLastTradePrice()) == null) ? null : BigDecimals2.priceInCents(lastTradePrice2);
        String strPriceInCents2 = (eventQuote2 == null || (lastTradePrice = eventQuote2.getLastTradePrice()) == null) ? null : BigDecimals2.priceInCents(lastTradePrice);
        if (strPriceInCents == null || strPriceInCents2 == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C16095R.string.event_detail_top_app_bar_primary_text, strPriceInCents, strPriceInCents2);
    }
}
