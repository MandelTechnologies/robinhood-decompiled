package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.api.creditcard.XsellApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CreditCardStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/store/creditcard/CreditCardStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "identityId", "Lcom/robinhood/android/api/creditcard/CreditCardApi;", "creditCardApi", "Lcom/robinhood/android/api/creditcard/XsellApi;", "xsellApi", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreditCardStore_Factory implements Factory<CreditCardStore> {
    private final Provider<Clock> clock;
    private final Provider<StringPreference> creditApplicationId;
    private final Provider<CreditCardApi> creditCardApi;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<StringPreference> identityId;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UserStore> userStore;
    private final Provider<XsellApi> xsellApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreditCardStore_Factory create(Provider<StringPreference> provider, Provider<StringPreference> provider2, Provider<CreditCardApi> provider3, Provider<XsellApi> provider4, Provider<ExperimentsStore> provider5, Provider<UserStore> provider6, Provider<Clock> provider7, Provider<StoreBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CreditCardStore newInstance(StringPreference stringPreference, StringPreference stringPreference2, CreditCardApi creditCardApi, XsellApi xsellApi, ExperimentsStore experimentsStore, UserStore userStore, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(stringPreference, stringPreference2, creditCardApi, xsellApi, experimentsStore, userStore, clock, storeBundle);
    }

    public CreditCardStore_Factory(Provider<StringPreference> creditApplicationId, Provider<StringPreference> identityId, Provider<CreditCardApi> creditCardApi, Provider<XsellApi> xsellApi, Provider<ExperimentsStore> experimentsStore, Provider<UserStore> userStore, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        Intrinsics.checkNotNullParameter(creditCardApi, "creditCardApi");
        Intrinsics.checkNotNullParameter(xsellApi, "xsellApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.creditApplicationId = creditApplicationId;
        this.identityId = identityId;
        this.creditCardApi = creditCardApi;
        this.xsellApi = xsellApi;
        this.experimentsStore = experimentsStore;
        this.userStore = userStore;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CreditCardStore get() {
        Companion companion = INSTANCE;
        StringPreference stringPreference = this.creditApplicationId.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.identityId.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        CreditCardApi creditCardApi = this.creditCardApi.get();
        Intrinsics.checkNotNullExpressionValue(creditCardApi, "get(...)");
        XsellApi xsellApi = this.xsellApi.get();
        Intrinsics.checkNotNullExpressionValue(xsellApi, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(stringPreference, stringPreference2, creditCardApi, xsellApi, experimentsStore, userStore, clock, storeBundle);
    }

    /* compiled from: CreditCardStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0015\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JO\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/store/creditcard/CreditCardStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "identityId", "Lcom/robinhood/android/api/creditcard/CreditCardApi;", "creditCardApi", "Lcom/robinhood/android/api/creditcard/XsellApi;", "xsellApi", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/lib/store/creditcard/CreditCardStore_Factory;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "newInstance", "(Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/api/creditcard/CreditCardApi;Lcom/robinhood/android/api/creditcard/XsellApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/store/user/UserStore;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "lib-store-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreditCardStore_Factory create(Provider<StringPreference> creditApplicationId, Provider<StringPreference> identityId, Provider<CreditCardApi> creditCardApi, Provider<XsellApi> xsellApi, Provider<ExperimentsStore> experimentsStore, Provider<UserStore> userStore, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            Intrinsics.checkNotNullParameter(creditCardApi, "creditCardApi");
            Intrinsics.checkNotNullParameter(xsellApi, "xsellApi");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CreditCardStore_Factory(creditApplicationId, identityId, creditCardApi, xsellApi, experimentsStore, userStore, clock, storeBundle);
        }

        @JvmStatic
        public final CreditCardStore newInstance(StringPreference creditApplicationId, StringPreference identityId, CreditCardApi creditCardApi, XsellApi xsellApi, ExperimentsStore experimentsStore, UserStore userStore, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            Intrinsics.checkNotNullParameter(creditCardApi, "creditCardApi");
            Intrinsics.checkNotNullParameter(xsellApi, "xsellApi");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CreditCardStore(creditApplicationId, identityId, creditCardApi, xsellApi, experimentsStore, userStore, clock, storeBundle);
        }
    }
}
