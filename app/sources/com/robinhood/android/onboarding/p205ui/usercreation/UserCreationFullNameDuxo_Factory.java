package com.robinhood.android.onboarding.p205ui.usercreation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.referral.AttributionManager;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.recaptcha.RecaptchaManager;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationFullNameDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "marketingOptInApi", "Lcom/robinhood/android/onboarding/ui/usercreation/MarketingOptInApi;", "hasOptInForMarketingEmails", "Lcom/robinhood/prefs/BooleanPreference;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class UserCreationFullNameDuxo_Factory implements Factory<UserCreationFullNameDuxo> {
    private final Provider<AppType> appType;
    private final Provider<AttributionManager> attributionManager;
    private final Provider<AuthManager> authManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<BooleanPreference> hasOptInForMarketingEmails;
    private final Provider<MarketingOptInApi> marketingOptInApi;
    private final Provider<RecaptchaManager> recaptchaManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final UserCreationFullNameDuxo_Factory create(Provider<UserStore> provider, Provider<AuthManager> provider2, Provider<RecaptchaManager> provider3, Provider<MarketingOptInApi> provider4, Provider<BooleanPreference> provider5, Provider<AttributionManager> provider6, Provider<AppType> provider7, Provider<DuxoBundle> provider8, Provider<SavedStateHandle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final UserCreationFullNameDuxo newInstance(UserStore userStore, AuthManager authManager, RecaptchaManager recaptchaManager, MarketingOptInApi marketingOptInApi, BooleanPreference booleanPreference, AttributionManager attributionManager, AppType appType, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(userStore, authManager, recaptchaManager, marketingOptInApi, booleanPreference, attributionManager, appType, duxoBundle, savedStateHandle);
    }

    public UserCreationFullNameDuxo_Factory(Provider<UserStore> userStore, Provider<AuthManager> authManager, Provider<RecaptchaManager> recaptchaManager, Provider<MarketingOptInApi> marketingOptInApi, Provider<BooleanPreference> hasOptInForMarketingEmails, Provider<AttributionManager> attributionManager, Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(recaptchaManager, "recaptchaManager");
        Intrinsics.checkNotNullParameter(marketingOptInApi, "marketingOptInApi");
        Intrinsics.checkNotNullParameter(hasOptInForMarketingEmails, "hasOptInForMarketingEmails");
        Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userStore = userStore;
        this.authManager = authManager;
        this.recaptchaManager = recaptchaManager;
        this.marketingOptInApi = marketingOptInApi;
        this.hasOptInForMarketingEmails = hasOptInForMarketingEmails;
        this.attributionManager = attributionManager;
        this.appType = appType;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public UserCreationFullNameDuxo get() {
        Companion companion = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        RecaptchaManager recaptchaManager = this.recaptchaManager.get();
        Intrinsics.checkNotNullExpressionValue(recaptchaManager, "get(...)");
        MarketingOptInApi marketingOptInApi = this.marketingOptInApi.get();
        Intrinsics.checkNotNullExpressionValue(marketingOptInApi, "get(...)");
        BooleanPreference booleanPreference = this.hasOptInForMarketingEmails.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        AttributionManager attributionManager = this.attributionManager.get();
        Intrinsics.checkNotNullExpressionValue(attributionManager, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(userStore, authManager, recaptchaManager, marketingOptInApi, booleanPreference, attributionManager, appType, duxoBundle, savedStateHandle);
    }

    /* compiled from: UserCreationFullNameDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo_Factory;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "marketingOptInApi", "Lcom/robinhood/android/onboarding/ui/usercreation/MarketingOptInApi;", "hasOptInForMarketingEmails", "Lcom/robinhood/prefs/BooleanPreference;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UserCreationFullNameDuxo_Factory create(Provider<UserStore> userStore, Provider<AuthManager> authManager, Provider<RecaptchaManager> recaptchaManager, Provider<MarketingOptInApi> marketingOptInApi, Provider<BooleanPreference> hasOptInForMarketingEmails, Provider<AttributionManager> attributionManager, Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(recaptchaManager, "recaptchaManager");
            Intrinsics.checkNotNullParameter(marketingOptInApi, "marketingOptInApi");
            Intrinsics.checkNotNullParameter(hasOptInForMarketingEmails, "hasOptInForMarketingEmails");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new UserCreationFullNameDuxo_Factory(userStore, authManager, recaptchaManager, marketingOptInApi, hasOptInForMarketingEmails, attributionManager, appType, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final UserCreationFullNameDuxo newInstance(UserStore userStore, AuthManager authManager, RecaptchaManager recaptchaManager, MarketingOptInApi marketingOptInApi, BooleanPreference hasOptInForMarketingEmails, AttributionManager attributionManager, AppType appType, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(recaptchaManager, "recaptchaManager");
            Intrinsics.checkNotNullParameter(marketingOptInApi, "marketingOptInApi");
            Intrinsics.checkNotNullParameter(hasOptInForMarketingEmails, "hasOptInForMarketingEmails");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new UserCreationFullNameDuxo(userStore, authManager, recaptchaManager, marketingOptInApi, hasOptInForMarketingEmails, attributionManager, appType, duxoBundle, savedStateHandle);
        }
    }
}
