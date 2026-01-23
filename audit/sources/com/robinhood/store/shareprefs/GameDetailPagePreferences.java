package com.robinhood.store.shareprefs;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: GameDetailPagePreferences.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;", "", "observeAmericanOddsChanges", "Lkotlinx/coroutines/flow/Flow;", "", "getAmericanOddsPref", "setAmericanOddsPref", "", "value", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface GameDetailPagePreferences {
    boolean getAmericanOddsPref();

    Flow<Boolean> observeAmericanOddsChanges();

    void setAmericanOddsPref(boolean value);
}
