package com.robinhood.android.common.onboarding.p085ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.librobinhood.data.store.UserInfoStore;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAgreementFragmentSingletons_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "agreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/agreements/AgreementsStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "markwon", "Lio/noties/markwon/Markwon;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BaseAgreementFragmentSingletons_Factory implements Factory<BaseAgreementFragmentSingletons> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BrokerageResourceManager> brokerageResourceManager;
    private final Provider<ContentRenderer> contentRenderer;
    private final Provider<Markwon> markwon;
    private final Provider<UserInfoStore> userInfoStore;

    @JvmStatic
    public static final BaseAgreementFragmentSingletons_Factory create(Provider<AgreementsStore> provider, Provider<AnalyticsLogger> provider2, Provider<BrokerageResourceManager> provider3, Provider<ContentRenderer> provider4, Provider<Markwon> provider5, Provider<UserInfoStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final BaseAgreementFragmentSingletons newInstance(AgreementsStore agreementsStore, AnalyticsLogger analyticsLogger, BrokerageResourceManager brokerageResourceManager, ContentRenderer contentRenderer, Markwon markwon, UserInfoStore userInfoStore) {
        return INSTANCE.newInstance(agreementsStore, analyticsLogger, brokerageResourceManager, contentRenderer, markwon, userInfoStore);
    }

    public BaseAgreementFragmentSingletons_Factory(Provider<AgreementsStore> agreementsStore, Provider<AnalyticsLogger> analytics, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<ContentRenderer> contentRenderer, Provider<Markwon> markwon, Provider<UserInfoStore> userInfoStore) {
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
        this.agreementsStore = agreementsStore;
        this.analytics = analytics;
        this.brokerageResourceManager = brokerageResourceManager;
        this.contentRenderer = contentRenderer;
        this.markwon = markwon;
        this.userInfoStore = userInfoStore;
    }

    @Override // javax.inject.Provider
    public BaseAgreementFragmentSingletons get() {
        Companion companion = INSTANCE;
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager.get();
        Intrinsics.checkNotNullExpressionValue(brokerageResourceManager, "get(...)");
        ContentRenderer contentRenderer = this.contentRenderer.get();
        Intrinsics.checkNotNullExpressionValue(contentRenderer, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        UserInfoStore userInfoStore = this.userInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(userInfoStore, "get(...)");
        return companion.newInstance(agreementsStore, analyticsLogger, brokerageResourceManager, contentRenderer, markwon, userInfoStore);
    }

    /* compiled from: BaseAgreementFragmentSingletons_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons_Factory;", "agreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/agreements/AgreementsStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "markwon", "Lio/noties/markwon/Markwon;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "newInstance", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BaseAgreementFragmentSingletons_Factory create(Provider<AgreementsStore> agreementsStore, Provider<AnalyticsLogger> analytics, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<ContentRenderer> contentRenderer, Provider<Markwon> markwon, Provider<UserInfoStore> userInfoStore) {
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
            return new BaseAgreementFragmentSingletons_Factory(agreementsStore, analytics, brokerageResourceManager, contentRenderer, markwon, userInfoStore);
        }

        @JvmStatic
        public final BaseAgreementFragmentSingletons newInstance(AgreementsStore agreementsStore, AnalyticsLogger analytics, BrokerageResourceManager brokerageResourceManager, ContentRenderer contentRenderer, Markwon markwon, UserInfoStore userInfoStore) {
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
            return new BaseAgreementFragmentSingletons(agreementsStore, analytics, brokerageResourceManager, contentRenderer, markwon, userInfoStore);
        }
    }
}
