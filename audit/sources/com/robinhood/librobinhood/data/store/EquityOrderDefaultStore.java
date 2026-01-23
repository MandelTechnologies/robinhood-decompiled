package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.prefs.DefaultOrderConfigurationPref;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderDefaultStore.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "Lcom/robinhood/store/Store;", "defaultOrderConfigurationPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/store/StoreBundle;)V", "setDefaultToDollarBased", "", "getDefaultOrderConfiguration", "setDefaultOrderConfiguration", "orderConfiguration", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EquityOrderDefaultStore extends Store {
    private final EnumPreference<DefaultableOrderConfiguration> defaultOrderConfigurationPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderDefaultStore(@DefaultOrderConfigurationPref EnumPreference<DefaultableOrderConfiguration> defaultOrderConfigurationPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(defaultOrderConfigurationPref, "defaultOrderConfigurationPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.defaultOrderConfigurationPref = defaultOrderConfigurationPref;
    }

    public final void setDefaultToDollarBased() {
        this.defaultOrderConfigurationPref.set(DefaultableOrderConfiguration.DOLLAR);
    }

    public final DefaultableOrderConfiguration getDefaultOrderConfiguration() {
        return (DefaultableOrderConfiguration) this.defaultOrderConfigurationPref.get();
    }

    public final void setDefaultOrderConfiguration(DefaultableOrderConfiguration orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        this.defaultOrderConfigurationPref.set(orderConfiguration);
    }
}
