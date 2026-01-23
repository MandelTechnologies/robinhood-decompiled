package com.robinhood.shared.education.p377ui.onboarding.terms;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.staticcontent.store.disclosure.RealDisclosureStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLearnAndEarnTermsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsDuxo;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "disclosureStore", "Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoLearnAndEarnTermsDuxo_Factory implements Factory<CryptoLearnAndEarnTermsDuxo> {
    private final Provider<AppType> appType;
    private final Provider<RealDisclosureStore> disclosureStore;
    private final Provider<DuxoBundle> duxoBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoLearnAndEarnTermsDuxo_Factory create(Provider<AppType> provider, Provider<RealDisclosureStore> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CryptoLearnAndEarnTermsDuxo newInstance(AppType appType, RealDisclosureStore realDisclosureStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(appType, realDisclosureStore, duxoBundle);
    }

    public CryptoLearnAndEarnTermsDuxo_Factory(Provider<AppType> appType, Provider<RealDisclosureStore> disclosureStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.appType = appType;
        this.disclosureStore = disclosureStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoLearnAndEarnTermsDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        RealDisclosureStore realDisclosureStore = this.disclosureStore.get();
        Intrinsics.checkNotNullExpressionValue(realDisclosureStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(appType, realDisclosureStore, duxoBundle);
    }

    /* compiled from: CryptoLearnAndEarnTermsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsDuxo_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "disclosureStore", "Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/education/ui/onboarding/terms/CryptoLearnAndEarnTermsDuxo;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoLearnAndEarnTermsDuxo_Factory create(Provider<AppType> appType, Provider<RealDisclosureStore> disclosureStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoLearnAndEarnTermsDuxo_Factory(appType, disclosureStore, duxoBundle);
        }

        @JvmStatic
        public final CryptoLearnAndEarnTermsDuxo newInstance(AppType appType, RealDisclosureStore disclosureStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(disclosureStore, "disclosureStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoLearnAndEarnTermsDuxo(appType, disclosureStore, duxoBundle);
        }
    }
}
