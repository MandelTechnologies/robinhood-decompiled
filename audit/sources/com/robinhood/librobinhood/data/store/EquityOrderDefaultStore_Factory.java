package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderDefaultStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB.\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "defaultOrderConfigurationPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "Lkotlin/jvm/JvmSuppressWildcards;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityOrderDefaultStore_Factory implements Factory<EquityOrderDefaultStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EnumPreference<DefaultableOrderConfiguration>> defaultOrderConfigurationPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EquityOrderDefaultStore_Factory create(Provider<EnumPreference<DefaultableOrderConfiguration>> provider, Provider<StoreBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final EquityOrderDefaultStore newInstance(EnumPreference<DefaultableOrderConfiguration> enumPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(enumPreference, storeBundle);
    }

    public EquityOrderDefaultStore_Factory(Provider<EnumPreference<DefaultableOrderConfiguration>> defaultOrderConfigurationPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(defaultOrderConfigurationPref, "defaultOrderConfigurationPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.defaultOrderConfigurationPref = defaultOrderConfigurationPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EquityOrderDefaultStore get() {
        Companion companion = INSTANCE;
        EnumPreference<DefaultableOrderConfiguration> enumPreference = this.defaultOrderConfigurationPref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(enumPreference, storeBundle);
    }

    /* compiled from: EquityOrderDefaultStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J#\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore_Factory;", "defaultOrderConfigurationPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "Lkotlin/jvm/JvmSuppressWildcards;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityOrderDefaultStore_Factory create(Provider<EnumPreference<DefaultableOrderConfiguration>> defaultOrderConfigurationPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(defaultOrderConfigurationPref, "defaultOrderConfigurationPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityOrderDefaultStore_Factory(defaultOrderConfigurationPref, storeBundle);
        }

        @JvmStatic
        public final EquityOrderDefaultStore newInstance(EnumPreference<DefaultableOrderConfiguration> defaultOrderConfigurationPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(defaultOrderConfigurationPref, "defaultOrderConfigurationPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityOrderDefaultStore(defaultOrderConfigurationPref, storeBundle);
        }
    }
}
