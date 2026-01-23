package com.robinhood.android.event.detail.builders;

import android.os.Parcelable;
import com.robinhood.android.event.detail.duel.DuelEventContractUiDetail;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.sharedeventui.PriceUtils;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: BuildEventContractUiDetail.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001aT\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¨\u0006\u0012"}, m3636d2 = {"buildDuelEventContractUiDetail", "Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "fundamental", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;", "quote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "deltas", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "showPriceAsPercent", "", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.builders.BuildEventContractUiDetailKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildEventContractUiDetail {
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DuelEventContractUiDetail buildDuelEventContractUiDetail(EventContract contract, Point point, Chart<? extends Parcelable> chart, EventFundamental eventFundamental, EventQuote eventQuote, ImmutableList<Delta> deltas, boolean z) {
        BigDecimal lastTradePrice;
        String str;
        BigDecimal lastTradePrice2;
        Object next;
        String value;
        String ecPrice;
        Integer openInterest;
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(deltas, "deltas");
        String ecPrice2 = null;
        String str2 = (point != null || eventFundamental == null || (openInterest = eventFundamental.getOpenInterest()) == null) ? null : Formats.getIntegerFormat().format(Integer.valueOf(openInterest.intValue()));
        String displayShortName = contract.getDisplayShortName();
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String imageUrl = contract.getImageUrl();
        DayNightColor dayNightColor = DayNightColor2.getDayNightColor(contract);
        String tertiaryText = contract.getTertiaryText();
        if (point == null) {
            if (eventQuote != null && (lastTradePrice = eventQuote.getLastTradePrice()) != null) {
                ecPrice2 = PriceUtils.formatEcPrice(lastTradePrice, z);
            }
            str = ecPrice2;
        } else {
            if ((chart != null ? chart.getLegend_data() : null) != null) {
                List<ChartLegendItem> list = chart.getLegend_data().get(String.valueOf(point.getX()));
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((ChartLegendItem) next).getId(), contract.getContractId().toString())) {
                            break;
                        }
                    }
                    ChartLegendItem chartLegendItem = (ChartLegendItem) next;
                    if (chartLegendItem != null && (value = chartLegendItem.getValue()) != null && (ecPrice = PriceUtils.formatEcPrice(value, z)) != null) {
                        str = ecPrice;
                    }
                }
                if (eventQuote != null && (lastTradePrice2 = eventQuote.getLastTradePrice()) != null) {
                    ecPrice2 = PriceUtils.formatEcPrice(lastTradePrice2, z);
                }
            }
            str = ecPrice2;
        }
        return new DuelEventContractUiDetail(tertiaryText, displayShortName, str3, imageUrl, dayNightColor, str, deltas);
    }
}
