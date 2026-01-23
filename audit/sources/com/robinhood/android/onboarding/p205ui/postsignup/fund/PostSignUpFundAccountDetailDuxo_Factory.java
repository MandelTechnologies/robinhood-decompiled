package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpFundAccountDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDuxo;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "applicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "fundAccountStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "stateProvider", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PostSignUpFundAccountDetailDuxo_Factory implements Factory<PostSignUpFundAccountDetailDuxo> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<DirectIpoApi> api;
    private final Provider<UserApplicationStore> applicationStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FundAccountScreenStore> fundAccountStore;
    private final Provider<PostSignUpFundAccountDetailState4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PostSignUpFundAccountDetailDuxo_Factory create(Provider<AnalyticsLogger> provider, Provider<DirectIpoApi> provider2, Provider<UserApplicationStore> provider3, Provider<FundAccountScreenStore> provider4, Provider<PostSignUpFundAccountDetailState4> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final PostSignUpFundAccountDetailDuxo newInstance(AnalyticsLogger analyticsLogger, DirectIpoApi directIpoApi, UserApplicationStore userApplicationStore, FundAccountScreenStore fundAccountScreenStore, PostSignUpFundAccountDetailState4 postSignUpFundAccountDetailState4, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(analyticsLogger, directIpoApi, userApplicationStore, fundAccountScreenStore, postSignUpFundAccountDetailState4, duxoBundle);
    }

    public PostSignUpFundAccountDetailDuxo_Factory(Provider<AnalyticsLogger> analytics, Provider<DirectIpoApi> api, Provider<UserApplicationStore> applicationStore, Provider<FundAccountScreenStore> fundAccountStore, Provider<PostSignUpFundAccountDetailState4> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
        Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.analytics = analytics;
        this.api = api;
        this.applicationStore = applicationStore;
        this.fundAccountStore = fundAccountStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PostSignUpFundAccountDetailDuxo get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        DirectIpoApi directIpoApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(directIpoApi, "get(...)");
        UserApplicationStore userApplicationStore = this.applicationStore.get();
        Intrinsics.checkNotNullExpressionValue(userApplicationStore, "get(...)");
        FundAccountScreenStore fundAccountScreenStore = this.fundAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(fundAccountScreenStore, "get(...)");
        PostSignUpFundAccountDetailState4 postSignUpFundAccountDetailState4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(postSignUpFundAccountDetailState4, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(analyticsLogger, directIpoApi, userApplicationStore, fundAccountScreenStore, postSignUpFundAccountDetailState4, duxoBundle);
    }

    /* compiled from: PostSignUpFundAccountDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDuxo_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "applicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "fundAccountStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "stateProvider", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDuxo;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PostSignUpFundAccountDetailDuxo_Factory create(Provider<AnalyticsLogger> analytics, Provider<DirectIpoApi> api, Provider<UserApplicationStore> applicationStore, Provider<FundAccountScreenStore> fundAccountStore, Provider<PostSignUpFundAccountDetailState4> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
            Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PostSignUpFundAccountDetailDuxo_Factory(analytics, api, applicationStore, fundAccountStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final PostSignUpFundAccountDetailDuxo newInstance(AnalyticsLogger analytics, DirectIpoApi api, UserApplicationStore applicationStore, FundAccountScreenStore fundAccountStore, PostSignUpFundAccountDetailState4 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
            Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PostSignUpFundAccountDetailDuxo(analytics, api, applicationStore, fundAccountStore, stateProvider, duxoBundle);
        }
    }
}
