package com.robinhood.android.indexes.store;

import com.robinhood.android.indexes.prefs.IndexAccountNumberPref;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "Lcom/robinhood/store/Store;", "indexAccountNumberPref", "Lcom/robinhood/prefs/StringPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/store/StoreBundle;)V", "streamActiveAccountNumber", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "", "setActiveAccountNumber", "", "accountNumber", "lib-store-indexes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexAccountSwitcherStore extends Store {
    private final StringPreference indexAccountNumberPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexAccountSwitcherStore(@IndexAccountNumberPref StringPreference indexAccountNumberPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(indexAccountNumberPref, "indexAccountNumberPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.indexAccountNumberPref = indexAccountNumberPref;
    }

    public final Observable<Optional<String>> streamActiveAccountNumber() {
        return this.indexAccountNumberPref.changes();
    }

    public final void setActiveAccountNumber(String accountNumber) {
        this.indexAccountNumberPref.set(accountNumber);
    }
}
