package com.robinhood.android.directipo.p106ui.allocation;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.rhimage.ImageLoader;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoAllocationClarityCardHookView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/directipo/ui/allocation/DirectIpoAllocationClarityCardHookView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/directipo/ui/allocation/DirectIpoAllocationClarityCardHookView;", "navigator", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-direct-ipo-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectIpoAllocationClarityCardHookView_MembersInjector implements MembersInjector<DirectIpoAllocationClarityCardHookView> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ImageLoader> imageLoader;
    private final Provider<Markwon> markwon;
    private final Provider<Navigator> navigator;

    @JvmStatic
    public static final MembersInjector<DirectIpoAllocationClarityCardHookView> create(Provider<Navigator> provider, Provider<ImageLoader> provider2, Provider<Markwon> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectImageLoader(DirectIpoAllocationClarityCardHookView directIpoAllocationClarityCardHookView, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(directIpoAllocationClarityCardHookView, imageLoader);
    }

    @JvmStatic
    public static final void injectMarkwon(DirectIpoAllocationClarityCardHookView directIpoAllocationClarityCardHookView, Markwon markwon) {
        INSTANCE.injectMarkwon(directIpoAllocationClarityCardHookView, markwon);
    }

    @JvmStatic
    public static final void injectNavigator(DirectIpoAllocationClarityCardHookView directIpoAllocationClarityCardHookView, Navigator navigator) {
        INSTANCE.injectNavigator(directIpoAllocationClarityCardHookView, navigator);
    }

    public DirectIpoAllocationClarityCardHookView_MembersInjector(Provider<Navigator> navigator, Provider<ImageLoader> imageLoader, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.navigator = navigator;
        this.imageLoader = imageLoader;
        this.markwon = markwon;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoAllocationClarityCardHookView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion.injectImageLoader(instance, imageLoader);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion.injectMarkwon(instance, markwon);
    }

    /* compiled from: DirectIpoAllocationClarityCardHookView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/directipo/ui/allocation/DirectIpoAllocationClarityCardHookView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/directipo/ui/allocation/DirectIpoAllocationClarityCardHookView;", "navigator", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "markwon", "Lio/noties/markwon/Markwon;", "injectNavigator", "", "instance", "injectImageLoader", "injectMarkwon", "feature-lib-direct-ipo-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DirectIpoAllocationClarityCardHookView> create(Provider<Navigator> navigator, Provider<ImageLoader> imageLoader, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new DirectIpoAllocationClarityCardHookView_MembersInjector(navigator, imageLoader, markwon);
        }

        @JvmStatic
        public final void injectNavigator(DirectIpoAllocationClarityCardHookView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectImageLoader(DirectIpoAllocationClarityCardHookView instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }

        @JvmStatic
        public final void injectMarkwon(DirectIpoAllocationClarityCardHookView instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }
    }
}
