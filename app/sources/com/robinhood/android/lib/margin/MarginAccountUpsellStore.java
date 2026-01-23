package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.prefs.MarginAccountUpsellLastSeen;
import com.robinhood.prefs.LongPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginAccountUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;", "Lcom/robinhood/store/Store;", "lastSeenMarginAccountUpsell", "Lcom/robinhood/prefs/LongPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/store/StoreBundle;)V", "getLastSeenMarginAccountUpsell", "()Lcom/robinhood/prefs/LongPreference;", "setLastSeenMarginAccountUpsell", "(Lcom/robinhood/prefs/LongPreference;)V", "showMarginAccountUpsell", "", "Companion", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginAccountUpsellStore extends Store {
    public static final long RESET_INTERVAL = 2592000000L;
    private LongPreference lastSeenMarginAccountUpsell;

    public final LongPreference getLastSeenMarginAccountUpsell() {
        return this.lastSeenMarginAccountUpsell;
    }

    public final void setLastSeenMarginAccountUpsell(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.lastSeenMarginAccountUpsell = longPreference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginAccountUpsellStore(@MarginAccountUpsellLastSeen LongPreference lastSeenMarginAccountUpsell, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(lastSeenMarginAccountUpsell, "lastSeenMarginAccountUpsell");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.lastSeenMarginAccountUpsell = lastSeenMarginAccountUpsell;
    }

    public final boolean showMarginAccountUpsell() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long orNull = this.lastSeenMarginAccountUpsell.getOrNull();
        return orNull == null || jCurrentTimeMillis - orNull.longValue() >= 2592000000L;
    }
}
