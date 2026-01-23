package com.robinhood.librobinhood.data.store.sheriff;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.SecureStringPreference;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecretCodeStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore;", "sheriff", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Sheriff;", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "secretCodePref", "Lcom/robinhood/prefs/SecureStringPreference;", "secretCodeLastUpdatedPref", "Lcom/robinhood/prefs/LongPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-sheriff_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SecretCodeStore_Factory implements Factory<SecretCodeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LongPreference> secretCodeLastUpdatedPref;
    private final Provider<SecureStringPreference> secretCodePref;
    private final Provider<Sheriff> sheriff;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TrustedDeviceIdPref> trustedDeviceIdPref;

    @JvmStatic
    public static final SecretCodeStore_Factory create(Provider<Sheriff> provider, Provider<TrustedDeviceIdPref> provider2, Provider<SecureStringPreference> provider3, Provider<LongPreference> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final SecretCodeStore newInstance(Sheriff sheriff, TrustedDeviceIdPref trustedDeviceIdPref, SecureStringPreference secureStringPreference, LongPreference longPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(sheriff, trustedDeviceIdPref, secureStringPreference, longPreference, storeBundle);
    }

    public SecretCodeStore_Factory(Provider<Sheriff> sheriff, Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<SecureStringPreference> secretCodePref, Provider<LongPreference> secretCodeLastUpdatedPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(secretCodePref, "secretCodePref");
        Intrinsics.checkNotNullParameter(secretCodeLastUpdatedPref, "secretCodeLastUpdatedPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.sheriff = sheriff;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.secretCodePref = secretCodePref;
        this.secretCodeLastUpdatedPref = secretCodeLastUpdatedPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public SecretCodeStore get() {
        Companion companion = INSTANCE;
        Sheriff sheriff = this.sheriff.get();
        Intrinsics.checkNotNullExpressionValue(sheriff, "get(...)");
        TrustedDeviceIdPref trustedDeviceIdPref = this.trustedDeviceIdPref.get();
        Intrinsics.checkNotNullExpressionValue(trustedDeviceIdPref, "get(...)");
        SecureStringPreference secureStringPreference = this.secretCodePref.get();
        Intrinsics.checkNotNullExpressionValue(secureStringPreference, "get(...)");
        LongPreference longPreference = this.secretCodeLastUpdatedPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(sheriff, trustedDeviceIdPref, secureStringPreference, longPreference, storeBundle);
    }

    /* compiled from: SecretCodeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore_Factory;", "sheriff", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Sheriff;", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "secretCodePref", "Lcom/robinhood/prefs/SecureStringPreference;", "secretCodeLastUpdatedPref", "Lcom/robinhood/prefs/LongPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore;", "lib-store-sheriff_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SecretCodeStore_Factory create(Provider<Sheriff> sheriff, Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<SecureStringPreference> secretCodePref, Provider<LongPreference> secretCodeLastUpdatedPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            Intrinsics.checkNotNullParameter(secretCodePref, "secretCodePref");
            Intrinsics.checkNotNullParameter(secretCodeLastUpdatedPref, "secretCodeLastUpdatedPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new SecretCodeStore_Factory(sheriff, trustedDeviceIdPref, secretCodePref, secretCodeLastUpdatedPref, storeBundle);
        }

        @JvmStatic
        public final SecretCodeStore newInstance(Sheriff sheriff, TrustedDeviceIdPref trustedDeviceIdPref, SecureStringPreference secretCodePref, LongPreference secretCodeLastUpdatedPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            Intrinsics.checkNotNullParameter(secretCodePref, "secretCodePref");
            Intrinsics.checkNotNullParameter(secretCodeLastUpdatedPref, "secretCodeLastUpdatedPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new SecretCodeStore(sheriff, trustedDeviceIdPref, secretCodePref, secretCodeLastUpdatedPref, storeBundle);
        }
    }
}
