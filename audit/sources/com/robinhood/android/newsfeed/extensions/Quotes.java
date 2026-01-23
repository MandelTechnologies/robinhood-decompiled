package com.robinhood.android.newsfeed.extensions;

import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.models.p320db.Quote;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: Quotes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"direction", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "Lcom/robinhood/models/db/Quote;", "getDirection", "(Lcom/robinhood/models/db/Quote;)Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "feature-lib-newsfeed_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeed.extensions.QuotesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Quotes {
    public static final DirectionOverlay getDirection(Quote quote) {
        if (quote == null || quote.getTodaysPercentChange().compareTo(BigDecimal.ZERO) >= 0) {
            return DirectionOverlay.POSITIVE;
        }
        return DirectionOverlay.NEGATIVE;
    }
}
