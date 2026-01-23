package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringSetPreference;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionTradeSettingsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "optionOrderTradingSessionPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToStringMapPreference;", "optionTradingSessionPickerExtendedHoursNewTagPref", "Lcom/robinhood/prefs/StringSetPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionTradeSettingsStore_Factory implements Factory<OptionTradeSettingsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<StringToStringMapPreference> optionOrderTradingSessionPref;
    private final Provider<StringSetPreference> optionTradingSessionPickerExtendedHoursNewTagPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionTradeSettingsStore_Factory create(Provider<StringToStringMapPreference> provider, Provider<StringSetPreference> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final OptionTradeSettingsStore newInstance(StringToStringMapPreference stringToStringMapPreference, StringSetPreference stringSetPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(stringToStringMapPreference, stringSetPreference, storeBundle);
    }

    public OptionTradeSettingsStore_Factory(Provider<StringToStringMapPreference> optionOrderTradingSessionPref, Provider<StringSetPreference> optionTradingSessionPickerExtendedHoursNewTagPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(optionOrderTradingSessionPref, "optionOrderTradingSessionPref");
        Intrinsics.checkNotNullParameter(optionTradingSessionPickerExtendedHoursNewTagPref, "optionTradingSessionPickerExtendedHoursNewTagPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionOrderTradingSessionPref = optionOrderTradingSessionPref;
        this.optionTradingSessionPickerExtendedHoursNewTagPref = optionTradingSessionPickerExtendedHoursNewTagPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OptionTradeSettingsStore get() {
        Companion companion = INSTANCE;
        StringToStringMapPreference stringToStringMapPreference = this.optionOrderTradingSessionPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToStringMapPreference, "get(...)");
        StringSetPreference stringSetPreference = this.optionTradingSessionPickerExtendedHoursNewTagPref.get();
        Intrinsics.checkNotNullExpressionValue(stringSetPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(stringToStringMapPreference, stringSetPreference, storeBundle);
    }

    /* compiled from: OptionTradeSettingsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore_Factory;", "optionOrderTradingSessionPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToStringMapPreference;", "optionTradingSessionPickerExtendedHoursNewTagPref", "Lcom/robinhood/prefs/StringSetPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionTradeSettingsStore_Factory create(Provider<StringToStringMapPreference> optionOrderTradingSessionPref, Provider<StringSetPreference> optionTradingSessionPickerExtendedHoursNewTagPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(optionOrderTradingSessionPref, "optionOrderTradingSessionPref");
            Intrinsics.checkNotNullParameter(optionTradingSessionPickerExtendedHoursNewTagPref, "optionTradingSessionPickerExtendedHoursNewTagPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionTradeSettingsStore_Factory(optionOrderTradingSessionPref, optionTradingSessionPickerExtendedHoursNewTagPref, storeBundle);
        }

        @JvmStatic
        public final OptionTradeSettingsStore newInstance(StringToStringMapPreference optionOrderTradingSessionPref, StringSetPreference optionTradingSessionPickerExtendedHoursNewTagPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(optionOrderTradingSessionPref, "optionOrderTradingSessionPref");
            Intrinsics.checkNotNullParameter(optionTradingSessionPickerExtendedHoursNewTagPref, "optionTradingSessionPickerExtendedHoursNewTagPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionTradeSettingsStore(optionOrderTradingSessionPref, optionTradingSessionPickerExtendedHoursNewTagPref, storeBundle);
        }
    }
}
