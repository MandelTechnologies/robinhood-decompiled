package com.robinhood.android.crypto.tab.p093ui.education;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.engagement.cryptoEducationTrading.CryptoEducationTradingEligibilityStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeEducationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDuxo;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "educationLessonStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "cryptoEducationTradingEligibilityStore", "Lcom/robinhood/android/engagement/cryptoEducationTrading/CryptoEducationTradingEligibilityStore;", "completedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoHomeEducationDuxo_Factory implements Factory<CryptoHomeEducationDuxo> {
    private final Provider<AppType> appType;
    private final Provider<StringPreference> completedEducationLessonsPref;
    private final Provider<CryptoEducationTradingEligibilityStore> cryptoEducationTradingEligibilityStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EducationLessonsStore> educationLessonStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<CryptoHomeEducationDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomeEducationDuxo_Factory create(Provider<AppType> provider, Provider<EducationLessonsStore> provider2, Provider<RegionGateProvider> provider3, Provider<CryptoEducationTradingEligibilityStore> provider4, Provider<StringPreference> provider5, Provider<DuxoBundle> provider6, Provider<CryptoHomeEducationDuxo3> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CryptoHomeEducationDuxo newInstance(AppType appType, EducationLessonsStore educationLessonsStore, RegionGateProvider regionGateProvider, CryptoEducationTradingEligibilityStore cryptoEducationTradingEligibilityStore, StringPreference stringPreference, DuxoBundle duxoBundle, CryptoHomeEducationDuxo3 cryptoHomeEducationDuxo3) {
        return INSTANCE.newInstance(appType, educationLessonsStore, regionGateProvider, cryptoEducationTradingEligibilityStore, stringPreference, duxoBundle, cryptoHomeEducationDuxo3);
    }

    public CryptoHomeEducationDuxo_Factory(Provider<AppType> appType, Provider<EducationLessonsStore> educationLessonStore, Provider<RegionGateProvider> regionGateProvider, Provider<CryptoEducationTradingEligibilityStore> cryptoEducationTradingEligibilityStore, Provider<StringPreference> completedEducationLessonsPref, Provider<DuxoBundle> duxoBundle, Provider<CryptoHomeEducationDuxo3> stateProvider) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(educationLessonStore, "educationLessonStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(cryptoEducationTradingEligibilityStore, "cryptoEducationTradingEligibilityStore");
        Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.appType = appType;
        this.educationLessonStore = educationLessonStore;
        this.regionGateProvider = regionGateProvider;
        this.cryptoEducationTradingEligibilityStore = cryptoEducationTradingEligibilityStore;
        this.completedEducationLessonsPref = completedEducationLessonsPref;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoHomeEducationDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        EducationLessonsStore educationLessonsStore = this.educationLessonStore.get();
        Intrinsics.checkNotNullExpressionValue(educationLessonsStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        CryptoEducationTradingEligibilityStore cryptoEducationTradingEligibilityStore = this.cryptoEducationTradingEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoEducationTradingEligibilityStore, "get(...)");
        StringPreference stringPreference = this.completedEducationLessonsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoHomeEducationDuxo3 cryptoHomeEducationDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeEducationDuxo3, "get(...)");
        return companion.newInstance(appType, educationLessonsStore, regionGateProvider, cryptoEducationTradingEligibilityStore, stringPreference, duxoBundle, cryptoHomeEducationDuxo3);
    }

    /* compiled from: CryptoHomeEducationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDuxo_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "educationLessonStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "cryptoEducationTradingEligibilityStore", "Lcom/robinhood/android/engagement/cryptoEducationTrading/CryptoEducationTradingEligibilityStore;", "completedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationStateProvider;", "newInstance", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomeEducationDuxo_Factory create(Provider<AppType> appType, Provider<EducationLessonsStore> educationLessonStore, Provider<RegionGateProvider> regionGateProvider, Provider<CryptoEducationTradingEligibilityStore> cryptoEducationTradingEligibilityStore, Provider<StringPreference> completedEducationLessonsPref, Provider<DuxoBundle> duxoBundle, Provider<CryptoHomeEducationDuxo3> stateProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(educationLessonStore, "educationLessonStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(cryptoEducationTradingEligibilityStore, "cryptoEducationTradingEligibilityStore");
            Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoHomeEducationDuxo_Factory(appType, educationLessonStore, regionGateProvider, cryptoEducationTradingEligibilityStore, completedEducationLessonsPref, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final CryptoHomeEducationDuxo newInstance(AppType appType, EducationLessonsStore educationLessonStore, RegionGateProvider regionGateProvider, CryptoEducationTradingEligibilityStore cryptoEducationTradingEligibilityStore, StringPreference completedEducationLessonsPref, DuxoBundle duxoBundle, CryptoHomeEducationDuxo3 stateProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(educationLessonStore, "educationLessonStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(cryptoEducationTradingEligibilityStore, "cryptoEducationTradingEligibilityStore");
            Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoHomeEducationDuxo(appType, educationLessonStore, regionGateProvider, cryptoEducationTradingEligibilityStore, completedEducationLessonsPref, duxoBundle, stateProvider);
        }
    }
}
