package com.robinhood.android.supportchat;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mediaservice.RedirectImageLoader;
import com.robinhood.targetbackend.Endpoint;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatImageViewerFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatImageViewerFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/supportchat/SupportChatImageViewerFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "redirectImageLoader", "Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SupportChatImageViewerFragment_MembersInjector implements MembersInjector<SupportChatImageViewerFragment> {
    private final Provider<Endpoint> endpoint;
    private final Provider<RedirectImageLoader> redirectImageLoader;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SupportChatImageViewerFragment> create(Provider<BaseFragmentSingletons> provider, Provider<Endpoint> provider2, Provider<RedirectImageLoader> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectEndpoint(SupportChatImageViewerFragment supportChatImageViewerFragment, Endpoint endpoint) {
        INSTANCE.injectEndpoint(supportChatImageViewerFragment, endpoint);
    }

    @JvmStatic
    public static final void injectRedirectImageLoader(SupportChatImageViewerFragment supportChatImageViewerFragment, RedirectImageLoader redirectImageLoader) {
        INSTANCE.injectRedirectImageLoader(supportChatImageViewerFragment, redirectImageLoader);
    }

    public SupportChatImageViewerFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<Endpoint> endpoint, Provider<RedirectImageLoader> redirectImageLoader) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(redirectImageLoader, "redirectImageLoader");
        this.singletons = singletons;
        this.endpoint = endpoint;
        this.redirectImageLoader = redirectImageLoader;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SupportChatImageViewerFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        companion2.injectEndpoint(instance, endpoint);
        RedirectImageLoader redirectImageLoader = this.redirectImageLoader.get();
        Intrinsics.checkNotNullExpressionValue(redirectImageLoader, "get(...)");
        companion2.injectRedirectImageLoader(instance, redirectImageLoader);
    }

    /* compiled from: SupportChatImageViewerFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatImageViewerFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/supportchat/SupportChatImageViewerFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "redirectImageLoader", "Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "injectEndpoint", "", "instance", "injectRedirectImageLoader", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SupportChatImageViewerFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<Endpoint> endpoint, Provider<RedirectImageLoader> redirectImageLoader) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(redirectImageLoader, "redirectImageLoader");
            return new SupportChatImageViewerFragment_MembersInjector(singletons, endpoint, redirectImageLoader);
        }

        @JvmStatic
        public final void injectEndpoint(SupportChatImageViewerFragment instance, Endpoint endpoint) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            instance.setEndpoint(endpoint);
        }

        @JvmStatic
        public final void injectRedirectImageLoader(SupportChatImageViewerFragment instance, RedirectImageLoader redirectImageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(redirectImageLoader, "redirectImageLoader");
            instance.setRedirectImageLoader(redirectImageLoader);
        }
    }
}
