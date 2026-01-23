package com.robinhood.android.doc.p109ui.splash;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadSplashFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DocUploadSplashFragment_MembersInjector implements MembersInjector<DocUploadSplashFragment> {
    private final Provider<Markwon> markwon;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DocUploadSplashFragment> create(Provider<BaseFragmentSingletons> provider, Provider<Markwon> provider2, Provider<RhProcessLifecycleOwner> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectMarkwon(DocUploadSplashFragment docUploadSplashFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(docUploadSplashFragment, markwon);
    }

    @JvmStatic
    public static final void injectRhProcessLifecycleOwner(DocUploadSplashFragment docUploadSplashFragment, Lazy<RhProcessLifecycleOwner> lazy) {
        INSTANCE.injectRhProcessLifecycleOwner(docUploadSplashFragment, lazy);
    }

    public DocUploadSplashFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.singletons = singletons;
        this.markwon = markwon;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DocUploadSplashFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
        Lazy<RhProcessLifecycleOwner> lazy = DoubleCheck.lazy(this.rhProcessLifecycleOwner);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        companion2.injectRhProcessLifecycleOwner(instance, lazy);
    }

    /* compiled from: DocUploadSplashFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\bH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J#\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\u0013H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "Lkotlin/jvm/JvmSuppressWildcards;", "injectMarkwon", "", "instance", "injectRhProcessLifecycleOwner", "Ldagger/Lazy;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DocUploadSplashFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new DocUploadSplashFragment_MembersInjector(singletons, markwon, rhProcessLifecycleOwner);
        }

        @JvmStatic
        public final void injectMarkwon(DocUploadSplashFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectRhProcessLifecycleOwner(DocUploadSplashFragment instance, Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            instance.setRhProcessLifecycleOwner(rhProcessLifecycleOwner);
        }
    }
}
