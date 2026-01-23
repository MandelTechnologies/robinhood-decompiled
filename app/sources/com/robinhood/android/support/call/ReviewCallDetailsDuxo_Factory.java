package com.robinhood.android.support.call;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.librobinhood.data.store.SupportInquiryStore;
import com.robinhood.librobinhood.data.store.SupportPhoneIssueStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewCallDetailsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo;", "staticContentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/StaticContentStore;", "supportInquiryStore", "Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;", "supportPhoneIssueStore", "Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "stateProvider", "Lcom/robinhood/android/support/call/ReviewCallDetailsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ReviewCallDetailsDuxo_Factory implements Factory<ReviewCallDetailsDuxo> {
    private final Provider<AuthManager> authManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ProfileInfoStore> profileInfoStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ReviewCallDetailsStateProvider> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;
    private final Provider<SupportInquiryStore> supportInquiryStore;
    private final Provider<SupportPhoneIssueStore> supportPhoneIssueStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ReviewCallDetailsDuxo_Factory create(Provider<StaticContentStore> provider, Provider<SupportInquiryStore> provider2, Provider<SupportPhoneIssueStore> provider3, Provider<ProfileInfoStore> provider4, Provider<AuthManager> provider5, Provider<ReviewCallDetailsStateProvider> provider6, Provider<DuxoBundle> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final ReviewCallDetailsDuxo newInstance(StaticContentStore staticContentStore, SupportInquiryStore supportInquiryStore, SupportPhoneIssueStore supportPhoneIssueStore, ProfileInfoStore profileInfoStore, AuthManager authManager, ReviewCallDetailsStateProvider reviewCallDetailsStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(staticContentStore, supportInquiryStore, supportPhoneIssueStore, profileInfoStore, authManager, reviewCallDetailsStateProvider, duxoBundle, savedStateHandle);
    }

    public ReviewCallDetailsDuxo_Factory(Provider<StaticContentStore> staticContentStore, Provider<SupportInquiryStore> supportInquiryStore, Provider<SupportPhoneIssueStore> supportPhoneIssueStore, Provider<ProfileInfoStore> profileInfoStore, Provider<AuthManager> authManager, Provider<ReviewCallDetailsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(supportInquiryStore, "supportInquiryStore");
        Intrinsics.checkNotNullParameter(supportPhoneIssueStore, "supportPhoneIssueStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.staticContentStore = staticContentStore;
        this.supportInquiryStore = supportInquiryStore;
        this.supportPhoneIssueStore = supportPhoneIssueStore;
        this.profileInfoStore = profileInfoStore;
        this.authManager = authManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public ReviewCallDetailsDuxo get() {
        Companion companion = INSTANCE;
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        SupportInquiryStore supportInquiryStore = this.supportInquiryStore.get();
        Intrinsics.checkNotNullExpressionValue(supportInquiryStore, "get(...)");
        SupportPhoneIssueStore supportPhoneIssueStore = this.supportPhoneIssueStore.get();
        Intrinsics.checkNotNullExpressionValue(supportPhoneIssueStore, "get(...)");
        ProfileInfoStore profileInfoStore = this.profileInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(profileInfoStore, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        ReviewCallDetailsStateProvider reviewCallDetailsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(reviewCallDetailsStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(staticContentStore, supportInquiryStore, supportPhoneIssueStore, profileInfoStore, authManager, reviewCallDetailsStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: ReviewCallDetailsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo_Factory;", "staticContentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/StaticContentStore;", "supportInquiryStore", "Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;", "supportPhoneIssueStore", "Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "stateProvider", "Lcom/robinhood/android/support/call/ReviewCallDetailsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ReviewCallDetailsDuxo_Factory create(Provider<StaticContentStore> staticContentStore, Provider<SupportInquiryStore> supportInquiryStore, Provider<SupportPhoneIssueStore> supportPhoneIssueStore, Provider<ProfileInfoStore> profileInfoStore, Provider<AuthManager> authManager, Provider<ReviewCallDetailsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(supportInquiryStore, "supportInquiryStore");
            Intrinsics.checkNotNullParameter(supportPhoneIssueStore, "supportPhoneIssueStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ReviewCallDetailsDuxo_Factory(staticContentStore, supportInquiryStore, supportPhoneIssueStore, profileInfoStore, authManager, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final ReviewCallDetailsDuxo newInstance(StaticContentStore staticContentStore, SupportInquiryStore supportInquiryStore, SupportPhoneIssueStore supportPhoneIssueStore, ProfileInfoStore profileInfoStore, AuthManager authManager, ReviewCallDetailsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(supportInquiryStore, "supportInquiryStore");
            Intrinsics.checkNotNullParameter(supportPhoneIssueStore, "supportPhoneIssueStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ReviewCallDetailsDuxo(staticContentStore, supportInquiryStore, supportPhoneIssueStore, profileInfoStore, authManager, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
