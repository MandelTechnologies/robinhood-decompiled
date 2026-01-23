package com.robinhood.android.crypto.tab.p093ui.news.fragment;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoNewsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsStateProvider;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoNewsDuxo_Factory implements Factory<CryptoNewsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EducationLessonsStore> educationLessonsStore;
    private final Provider<NewsFeedElementStore> newsFeedElementStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<CryptoNewsDuxo4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoNewsDuxo_Factory create(Provider<CryptoNewsDuxo4> provider, Provider<EducationLessonsStore> provider2, Provider<NewsFeedElementStore> provider3, Provider<QuoteStore> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoNewsDuxo newInstance(CryptoNewsDuxo4 cryptoNewsDuxo4, EducationLessonsStore educationLessonsStore, NewsFeedElementStore newsFeedElementStore, QuoteStore quoteStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(cryptoNewsDuxo4, educationLessonsStore, newsFeedElementStore, quoteStore, duxoBundle);
    }

    public CryptoNewsDuxo_Factory(Provider<CryptoNewsDuxo4> stateProvider, Provider<EducationLessonsStore> educationLessonsStore, Provider<NewsFeedElementStore> newsFeedElementStore, Provider<QuoteStore> quoteStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(newsFeedElementStore, "newsFeedElementStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.educationLessonsStore = educationLessonsStore;
        this.newsFeedElementStore = newsFeedElementStore;
        this.quoteStore = quoteStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoNewsDuxo get() {
        Companion companion = INSTANCE;
        CryptoNewsDuxo4 cryptoNewsDuxo4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoNewsDuxo4, "get(...)");
        EducationLessonsStore educationLessonsStore = this.educationLessonsStore.get();
        Intrinsics.checkNotNullExpressionValue(educationLessonsStore, "get(...)");
        NewsFeedElementStore newsFeedElementStore = this.newsFeedElementStore.get();
        Intrinsics.checkNotNullExpressionValue(newsFeedElementStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(cryptoNewsDuxo4, educationLessonsStore, newsFeedElementStore, quoteStore, duxoBundle);
    }

    /* compiled from: CryptoNewsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsStateProvider;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoNewsDuxo_Factory create(Provider<CryptoNewsDuxo4> stateProvider, Provider<EducationLessonsStore> educationLessonsStore, Provider<NewsFeedElementStore> newsFeedElementStore, Provider<QuoteStore> quoteStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
            Intrinsics.checkNotNullParameter(newsFeedElementStore, "newsFeedElementStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoNewsDuxo_Factory(stateProvider, educationLessonsStore, newsFeedElementStore, quoteStore, duxoBundle);
        }

        @JvmStatic
        public final CryptoNewsDuxo newInstance(CryptoNewsDuxo4 stateProvider, EducationLessonsStore educationLessonsStore, NewsFeedElementStore newsFeedElementStore, QuoteStore quoteStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
            Intrinsics.checkNotNullParameter(newsFeedElementStore, "newsFeedElementStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoNewsDuxo(stateProvider, educationLessonsStore, newsFeedElementStore, quoteStore, duxoBundle);
        }
    }
}
