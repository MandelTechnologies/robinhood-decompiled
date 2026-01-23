package com.robinhood.store.shareprefs;

import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RealGameDetailPagePreferences.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/RealGameDetailPagePreferences;", "Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;", "americanOddsPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;)V", "observeAmericanOddsChanges", "Lkotlinx/coroutines/flow/Flow;", "", "getAmericanOddsPref", "setAmericanOddsPref", "", "value", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RealGameDetailPagePreferences implements GameDetailPagePreferences {
    private final BooleanPreference americanOddsPref;

    public RealGameDetailPagePreferences(@AmericanOddsPreference BooleanPreference americanOddsPref) {
        Intrinsics.checkNotNullParameter(americanOddsPref, "americanOddsPref");
        this.americanOddsPref = americanOddsPref;
    }

    @Override // com.robinhood.store.shareprefs.GameDetailPagePreferences
    public Flow<Boolean> observeAmericanOddsChanges() {
        return Context7.buffer$default(RxConvert.asFlow(this.americanOddsPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
    }

    @Override // com.robinhood.store.shareprefs.GameDetailPagePreferences
    public boolean getAmericanOddsPref() {
        return this.americanOddsPref.get();
    }

    @Override // com.robinhood.store.shareprefs.GameDetailPagePreferences
    public void setAmericanOddsPref(boolean value) {
        this.americanOddsPref.set(value);
    }
}
