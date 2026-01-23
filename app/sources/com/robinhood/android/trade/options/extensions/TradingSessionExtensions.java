package com.robinhood.android.trade.options.extensions;

import com.robinhood.android.trade.options.C29757R;
import com.robinhood.models.p320db.IndexOptionsExtendedHours;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: TradingSessionExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/models/db/MarketHours;", "Lcom/robinhood/utils/resource/StringResource;", "getRegularHoursDetailText", "(Lcom/robinhood/models/db/MarketHours;)Lcom/robinhood/utils/resource/StringResource;", "getCurbHoursDetailText", "j$/time/Instant", "curbClosesAtWithDefault", "(Lcom/robinhood/models/db/MarketHours;)Lj$/time/Instant;", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.extensions.TradingSessionExtensionsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingSessionExtensions {
    public static final StringResource getRegularHoursDetailText(MarketHours marketHours) {
        String str;
        Instant indexOptionNon0DteClosesAt;
        String str2;
        Instant regularOpensAt;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C29757R.string.options_order_trading_session_time_range_label;
        String str3 = "";
        if (marketHours == null || (regularOpensAt = marketHours.getRegularOpensAt()) == null || (str = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) regularOpensAt)) == null) {
            str = "";
        }
        if (marketHours != null && (indexOptionNon0DteClosesAt = marketHours.getIndexOptionNon0DteClosesAt()) != null && (str2 = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) indexOptionNon0DteClosesAt)) != null) {
            str3 = str2;
        }
        return companion.invoke(i, str, str3);
    }

    public static final StringResource getCurbHoursDetailText(MarketHours marketHours) {
        String str;
        Instant instantCurbClosesAtWithDefault;
        String str2;
        Instant regularOpensAt;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C29757R.string.options_order_trading_session_time_range_label;
        String str3 = "";
        if (marketHours == null || (regularOpensAt = marketHours.getRegularOpensAt()) == null || (str = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) regularOpensAt)) == null) {
            str = "";
        }
        if (marketHours != null && (instantCurbClosesAtWithDefault = curbClosesAtWithDefault(marketHours)) != null && (str2 = InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) instantCurbClosesAtWithDefault)) != null) {
            str3 = str2;
        }
        return companion.invoke(i, str, str3);
    }

    public static final Instant curbClosesAtWithDefault(MarketHours marketHours) {
        Intrinsics.checkNotNullParameter(marketHours, "<this>");
        IndexOptionsExtendedHours indexOptionsExtendedHours = marketHours.getIndexOptionsExtendedHours();
        if ((indexOptionsExtendedHours != null ? indexOptionsExtendedHours.getCurbClosesAt() : null) != null) {
            IndexOptionsExtendedHours indexOptionsExtendedHours2 = marketHours.getIndexOptionsExtendedHours();
            if (indexOptionsExtendedHours2 != null) {
                return indexOptionsExtendedHours2.getCurbClosesAt();
            }
            return null;
        }
        Instant regularHoursOpensAt = marketHours.getRegularHoursOpensAt();
        if (regularHoursOpensAt == null) {
            return null;
        }
        return regularHoursOpensAt.plusSeconds(27000L);
    }
}
