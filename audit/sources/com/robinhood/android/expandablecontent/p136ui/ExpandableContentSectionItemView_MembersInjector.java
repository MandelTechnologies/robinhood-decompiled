package com.robinhood.android.expandablecontent.p136ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpandableContentSectionItemView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "markwon", "Lio/noties/markwon/Markwon;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-expandable-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ExpandableContentSectionItemView_MembersInjector implements MembersInjector<ExpandableContentSectionItemView> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManager;
    private final Provider<ImageLoader> imageLoader;
    private final Provider<Markwon> markwon;

    @JvmStatic
    public static final MembersInjector<ExpandableContentSectionItemView> create(Provider<AuthManager> provider, Provider<Markwon> provider2, Provider<ImageLoader> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAuthManager(ExpandableContentSectionItemView expandableContentSectionItemView, AuthManager authManager) {
        INSTANCE.injectAuthManager(expandableContentSectionItemView, authManager);
    }

    @JvmStatic
    public static final void injectImageLoader(ExpandableContentSectionItemView expandableContentSectionItemView, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(expandableContentSectionItemView, imageLoader);
    }

    @JvmStatic
    public static final void injectMarkwon(ExpandableContentSectionItemView expandableContentSectionItemView, Markwon markwon) {
        INSTANCE.injectMarkwon(expandableContentSectionItemView, markwon);
    }

    public ExpandableContentSectionItemView_MembersInjector(Provider<AuthManager> authManager, Provider<Markwon> markwon, Provider<ImageLoader> imageLoader) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.authManager = authManager;
        this.markwon = markwon;
        this.imageLoader = imageLoader;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ExpandableContentSectionItemView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion.injectAuthManager(instance, authManager);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion.injectMarkwon(instance, markwon);
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion.injectImageLoader(instance, imageLoader);
    }

    /* compiled from: ExpandableContentSectionItemView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "markwon", "Lio/noties/markwon/Markwon;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "injectAuthManager", "", "instance", "injectMarkwon", "injectImageLoader", "lib-expandable-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ExpandableContentSectionItemView> create(Provider<AuthManager> authManager, Provider<Markwon> markwon, Provider<ImageLoader> imageLoader) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            return new ExpandableContentSectionItemView_MembersInjector(authManager, markwon, imageLoader);
        }

        @JvmStatic
        public final void injectAuthManager(ExpandableContentSectionItemView instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }

        @JvmStatic
        public final void injectMarkwon(ExpandableContentSectionItemView instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectImageLoader(ExpandableContentSectionItemView instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }
    }
}
