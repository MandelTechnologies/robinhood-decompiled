package com.robinhood.android.lib.futures.trade;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StreamMarketSessionChangeStateUseCase.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toUiSession", "Lcom/robinhood/android/lib/futures/trade/Session;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "lib-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.futures.trade.StreamMarketSessionChangeStateUseCaseKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class StreamMarketSessionChangeStateUseCase2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Session toUiSession(FuturesTradingHours.Session session) {
        if (session != null) {
            return new Session(session.getStartTime(), session.getEndTime());
        }
        return null;
    }
}
