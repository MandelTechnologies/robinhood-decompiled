package com.robinhood.android.equityadvancedorder.utils;

import com.robinhood.models.p320db.MarketHours;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: MarketHours.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0006\u001a\u00020\u0004*\u0004\u0018\u00010\u0002¨\u0006\u0007"}, m3636d2 = {"getRegularHoursCloseTime", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/MarketHours;", "getRegularHoursCloseTimeString", "", "getExtendedHoursCloseTime", "getExtendedHoursCloseTimeString", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.utils.MarketHoursKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class MarketHours3 {
    public static final StringResource getRegularHoursCloseTime(MarketHours marketHours) {
        return StringResource.INSTANCE.invoke(getRegularHoursCloseTimeString(marketHours));
    }

    public static final String getRegularHoursCloseTimeString(MarketHours marketHours) {
        Instant regularClosesAt;
        String str;
        return (marketHours == null || (regularClosesAt = marketHours.getRegularClosesAt()) == null || (str = InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format((InstantFormatter) regularClosesAt)) == null) ? "" : str;
    }

    public static final StringResource getExtendedHoursCloseTime(MarketHours marketHours) {
        return StringResource.INSTANCE.invoke(getExtendedHoursCloseTimeString(marketHours));
    }

    public static final String getExtendedHoursCloseTimeString(MarketHours marketHours) {
        Instant extendedClosesAt;
        String str;
        return (marketHours == null || (extendedClosesAt = marketHours.getExtendedClosesAt()) == null || (str = InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format((InstantFormatter) extendedClosesAt)) == null) ? "" : str;
    }
}
