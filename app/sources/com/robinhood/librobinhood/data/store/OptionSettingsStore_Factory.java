package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.OptionSettingsDao;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSettingsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0082\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0017\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSettingsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionSettingsDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "sideBySideBidAskPriceLabelTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "Lkotlin/jvm/JvmSuppressWildcards;", "sbsBidAskPriceLabelNuxShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionSettingsStore_Factory implements Factory<OptionSettingsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OptionSettingsDao> dao;
    private final Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionsApi> optionsApi;
    private final Provider<BooleanPreference> sbsBidAskPriceLabelNuxShownPref;
    private final Provider<EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType>> sideBySideBidAskPriceLabelTypePref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionSettingsStore_Factory create(Provider<StoreBundle> provider, Provider<OptionSettingsDao> provider2, Provider<OptionsApi> provider3, Provider<OptionAccountSwitcherStore> provider4, Provider<OptionInstrumentStore> provider5, Provider<OptionMarketHoursStore> provider6, Provider<EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType>> provider7, Provider<BooleanPreference> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final OptionSettingsStore newInstance(StoreBundle storeBundle, OptionSettingsDao optionSettingsDao, OptionsApi optionsApi, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType> enumPreference, BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(storeBundle, optionSettingsDao, optionsApi, optionAccountSwitcherStore, optionInstrumentStore, optionMarketHoursStore, enumPreference, booleanPreference);
    }

    public OptionSettingsStore_Factory(Provider<StoreBundle> storeBundle, Provider<OptionSettingsDao> dao, Provider<OptionsApi> optionsApi, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType>> sideBySideBidAskPriceLabelTypePref, Provider<BooleanPreference> sbsBidAskPriceLabelNuxShownPref) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(sideBySideBidAskPriceLabelTypePref, "sideBySideBidAskPriceLabelTypePref");
        Intrinsics.checkNotNullParameter(sbsBidAskPriceLabelNuxShownPref, "sbsBidAskPriceLabelNuxShownPref");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.sideBySideBidAskPriceLabelTypePref = sideBySideBidAskPriceLabelTypePref;
        this.sbsBidAskPriceLabelNuxShownPref = sbsBidAskPriceLabelNuxShownPref;
    }

    @Override // javax.inject.Provider
    public OptionSettingsStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        OptionSettingsDao optionSettingsDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsDao, "get(...)");
        OptionsApi optionsApi = this.optionsApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsApi, "get(...)");
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(optionAccountSwitcherStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType> enumPreference = this.sideBySideBidAskPriceLabelTypePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        BooleanPreference booleanPreference = this.sbsBidAskPriceLabelNuxShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(storeBundle, optionSettingsDao, optionsApi, optionAccountSwitcherStore, optionInstrumentStore, optionMarketHoursStore, enumPreference, booleanPreference);
    }

    /* compiled from: OptionSettingsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0083\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0017\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JS\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSettingsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionSettingsDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "sideBySideBidAskPriceLabelTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "Lkotlin/jvm/JvmSuppressWildcards;", "sbsBidAskPriceLabelNuxShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionSettingsStore_Factory create(Provider<StoreBundle> storeBundle, Provider<OptionSettingsDao> dao, Provider<OptionsApi> optionsApi, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType>> sideBySideBidAskPriceLabelTypePref, Provider<BooleanPreference> sbsBidAskPriceLabelNuxShownPref) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(sideBySideBidAskPriceLabelTypePref, "sideBySideBidAskPriceLabelTypePref");
            Intrinsics.checkNotNullParameter(sbsBidAskPriceLabelNuxShownPref, "sbsBidAskPriceLabelNuxShownPref");
            return new OptionSettingsStore_Factory(storeBundle, dao, optionsApi, optionAccountSwitcherStore, optionInstrumentStore, optionMarketHoursStore, sideBySideBidAskPriceLabelTypePref, sbsBidAskPriceLabelNuxShownPref);
        }

        @JvmStatic
        public final OptionSettingsStore newInstance(StoreBundle storeBundle, OptionSettingsDao dao, OptionsApi optionsApi, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, EnumPreference<OptionChainSettingsSideBySideBidAskPriceLabelType> sideBySideBidAskPriceLabelTypePref, BooleanPreference sbsBidAskPriceLabelNuxShownPref) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(sideBySideBidAskPriceLabelTypePref, "sideBySideBidAskPriceLabelTypePref");
            Intrinsics.checkNotNullParameter(sbsBidAskPriceLabelNuxShownPref, "sbsBidAskPriceLabelNuxShownPref");
            return new OptionSettingsStore(storeBundle, dao, optionsApi, optionAccountSwitcherStore, optionInstrumentStore, optionMarketHoursStore, sideBySideBidAskPriceLabelTypePref, sbsBidAskPriceLabelNuxShownPref);
        }
    }
}
