package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.OptionOrderFilterDao;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderFilterStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionOrderFilterDao;", "globalChainOrderSidePref", "Lcom/robinhood/prefs/StringPreference;", "globalChainContractTypePref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionOrderFilterStore_Factory implements Factory<OptionOrderFilterStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OptionOrderFilterDao> dao;
    private final Provider<StringPreference> globalChainContractTypePref;
    private final Provider<StringPreference> globalChainOrderSidePref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionOrderFilterStore_Factory create(Provider<StoreBundle> provider, Provider<OptionOrderFilterDao> provider2, Provider<StringPreference> provider3, Provider<StringPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OptionOrderFilterStore newInstance(StoreBundle storeBundle, OptionOrderFilterDao optionOrderFilterDao, StringPreference stringPreference, StringPreference stringPreference2) {
        return INSTANCE.newInstance(storeBundle, optionOrderFilterDao, stringPreference, stringPreference2);
    }

    public OptionOrderFilterStore_Factory(Provider<StoreBundle> storeBundle, Provider<OptionOrderFilterDao> dao, Provider<StringPreference> globalChainOrderSidePref, Provider<StringPreference> globalChainContractTypePref) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(globalChainOrderSidePref, "globalChainOrderSidePref");
        Intrinsics.checkNotNullParameter(globalChainContractTypePref, "globalChainContractTypePref");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.globalChainOrderSidePref = globalChainOrderSidePref;
        this.globalChainContractTypePref = globalChainContractTypePref;
    }

    @Override // javax.inject.Provider
    public OptionOrderFilterStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        OptionOrderFilterDao optionOrderFilterDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderFilterDao, "get(...)");
        StringPreference stringPreference = this.globalChainOrderSidePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.globalChainContractTypePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        return companion.newInstance(storeBundle, optionOrderFilterDao, stringPreference, stringPreference2);
    }

    /* compiled from: OptionOrderFilterStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionOrderFilterDao;", "globalChainOrderSidePref", "Lcom/robinhood/prefs/StringPreference;", "globalChainContractTypePref", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionOrderFilterStore_Factory create(Provider<StoreBundle> storeBundle, Provider<OptionOrderFilterDao> dao, Provider<StringPreference> globalChainOrderSidePref, Provider<StringPreference> globalChainContractTypePref) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(globalChainOrderSidePref, "globalChainOrderSidePref");
            Intrinsics.checkNotNullParameter(globalChainContractTypePref, "globalChainContractTypePref");
            return new OptionOrderFilterStore_Factory(storeBundle, dao, globalChainOrderSidePref, globalChainContractTypePref);
        }

        @JvmStatic
        public final OptionOrderFilterStore newInstance(StoreBundle storeBundle, OptionOrderFilterDao dao, StringPreference globalChainOrderSidePref, StringPreference globalChainContractTypePref) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(globalChainOrderSidePref, "globalChainOrderSidePref");
            Intrinsics.checkNotNullParameter(globalChainContractTypePref, "globalChainContractTypePref");
            return new OptionOrderFilterStore(storeBundle, dao, globalChainOrderSidePref, globalChainContractTypePref);
        }
    }
}
