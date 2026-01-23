package com.robinhood.android.common.onboarding.p085ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.librobinhood.data.store.UserInfoStore;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAgreementFragmentSingletons.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "markwon", "Lio/noties/markwon/Markwon;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lcom/robinhood/contentful/markdown/ContentRenderer;Lio/noties/markwon/Markwon;Lcom/robinhood/librobinhood/data/store/UserInfoStore;)V", "getAgreementsStore", "()Lcom/robinhood/android/agreements/AgreementsStore;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "getBrokerageResourceManager", "()Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "getContentRenderer", "()Lcom/robinhood/contentful/markdown/ContentRenderer;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "getUserInfoStore", "()Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BaseAgreementFragmentSingletons {
    private final AgreementsStore agreementsStore;
    private final AnalyticsLogger analytics;
    private final BrokerageResourceManager brokerageResourceManager;
    private final ContentRenderer contentRenderer;
    private final Markwon markwon;
    private final UserInfoStore userInfoStore;

    public BaseAgreementFragmentSingletons(AgreementsStore agreementsStore, AnalyticsLogger analytics, BrokerageResourceManager brokerageResourceManager, ContentRenderer contentRenderer, Markwon markwon, UserInfoStore userInfoStore) {
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

    public final AgreementsStore getAgreementsStore() {
        return this.agreementsStore;
    }

    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }

    public final BrokerageResourceManager getBrokerageResourceManager() {
        return this.brokerageResourceManager;
    }

    public final ContentRenderer getContentRenderer() {
        return this.contentRenderer;
    }

    public final Markwon getMarkwon() {
        return this.markwon;
    }

    public final UserInfoStore getUserInfoStore() {
        return this.userInfoStore;
    }
}
