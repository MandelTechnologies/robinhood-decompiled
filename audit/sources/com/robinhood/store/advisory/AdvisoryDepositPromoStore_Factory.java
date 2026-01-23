package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryDepositPromoStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore;", "advisoryService", "Ljavax/inject/Provider;", "Ladvisory/proto/v1/AdvisoryService;", "dismissedDepositPromosPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AdvisoryDepositPromoStore_Factory implements Factory<AdvisoryDepositPromoStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvisoryService> advisoryService;
    private final Provider<StringToBooleanMapPreference> dismissedDepositPromosPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AdvisoryDepositPromoStore_Factory create(Provider<AdvisoryService> provider, Provider<StringToBooleanMapPreference> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AdvisoryDepositPromoStore newInstance(AdvisoryService advisoryService, StringToBooleanMapPreference stringToBooleanMapPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(advisoryService, stringToBooleanMapPreference, storeBundle);
    }

    public AdvisoryDepositPromoStore_Factory(Provider<AdvisoryService> advisoryService, Provider<StringToBooleanMapPreference> dismissedDepositPromosPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(dismissedDepositPromosPref, "dismissedDepositPromosPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.dismissedDepositPromosPref = dismissedDepositPromosPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public AdvisoryDepositPromoStore get() {
        Companion companion = INSTANCE;
        AdvisoryService advisoryService = this.advisoryService.get();
        Intrinsics.checkNotNullExpressionValue(advisoryService, "get(...)");
        StringToBooleanMapPreference stringToBooleanMapPreference = this.dismissedDepositPromosPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(advisoryService, stringToBooleanMapPreference, storeBundle);
    }

    /* compiled from: AdvisoryDepositPromoStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore_Factory;", "advisoryService", "Ljavax/inject/Provider;", "Ladvisory/proto/v1/AdvisoryService;", "dismissedDepositPromosPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryDepositPromoStore_Factory create(Provider<AdvisoryService> advisoryService, Provider<StringToBooleanMapPreference> dismissedDepositPromosPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(dismissedDepositPromosPref, "dismissedDepositPromosPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvisoryDepositPromoStore_Factory(advisoryService, dismissedDepositPromosPref, storeBundle);
        }

        @JvmStatic
        public final AdvisoryDepositPromoStore newInstance(AdvisoryService advisoryService, StringToBooleanMapPreference dismissedDepositPromosPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(dismissedDepositPromosPref, "dismissedDepositPromosPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvisoryDepositPromoStore(advisoryService, dismissedDepositPromosPref, storeBundle);
        }
    }
}
