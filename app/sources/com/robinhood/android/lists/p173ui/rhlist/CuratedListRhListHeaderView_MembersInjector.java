package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.ImageLoader;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListRhListHeaderView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListHeaderView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListHeaderView;", "imageLoader", "Ljavax/inject/Provider;", "Lcom/robinhood/android/rhimage/ImageLoader;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CuratedListRhListHeaderView_MembersInjector implements MembersInjector<CuratedListRhListHeaderView> {
    private final Provider<ImageLoader> imageLoader;
    private final Provider<Markwon> markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CuratedListRhListHeaderView> create(Provider<ImageLoader> provider, Provider<Markwon> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectImageLoader(CuratedListRhListHeaderView curatedListRhListHeaderView, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(curatedListRhListHeaderView, imageLoader);
    }

    @JvmStatic
    public static final void injectMarkwon(CuratedListRhListHeaderView curatedListRhListHeaderView, Markwon markwon) {
        INSTANCE.injectMarkwon(curatedListRhListHeaderView, markwon);
    }

    public CuratedListRhListHeaderView_MembersInjector(Provider<ImageLoader> imageLoader, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.imageLoader = imageLoader;
        this.markwon = markwon;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CuratedListRhListHeaderView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion.injectImageLoader(instance, imageLoader);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion.injectMarkwon(instance, markwon);
    }

    /* compiled from: CuratedListRhListHeaderView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListHeaderView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListHeaderView;", "imageLoader", "Ljavax/inject/Provider;", "Lcom/robinhood/android/rhimage/ImageLoader;", "markwon", "Lio/noties/markwon/Markwon;", "injectImageLoader", "", "instance", "injectMarkwon", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CuratedListRhListHeaderView> create(Provider<ImageLoader> imageLoader, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new CuratedListRhListHeaderView_MembersInjector(imageLoader, markwon);
        }

        @JvmStatic
        public final void injectImageLoader(CuratedListRhListHeaderView instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }

        @JvmStatic
        public final void injectMarkwon(CuratedListRhListHeaderView instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }
    }
}
