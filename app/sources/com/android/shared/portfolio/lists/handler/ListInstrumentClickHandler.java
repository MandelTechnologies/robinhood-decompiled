package com.android.shared.portfolio.lists.handler;

import android.content.Context;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.models.api.CuratedListObjectType;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: ListInstrumentClickHandler.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J^\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0014"}, m3636d2 = {"Lcom/android/shared/portfolio/lists/handler/ListInstrumentClickHandler;", "", "onClick", "", "instrumentId", "Ljava/util/UUID;", "objectType", "Lcom/robinhood/models/api/CuratedListObjectType;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "optionStrategyCode", "", "watchlistItems", "", "", "accountNumber", "lib-lists-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface ListInstrumentClickHandler {
    void onClick(UUID instrumentId, CuratedListObjectType objectType, Navigator navigator, Context context, PerformanceLogger performanceLogger, String optionStrategyCode, Map<CuratedListObjectType, ? extends List<UUID>> watchlistItems, String accountNumber);
}
