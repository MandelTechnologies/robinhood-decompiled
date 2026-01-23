package com.robinhood.shared.education.p377ui.lessons.standard;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.ImageLoader;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonStandardFooterParentView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView;", "markwon", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EducationLessonStandardFooterParentView_MembersInjector implements MembersInjector<EducationLessonStandardFooterParentView> {
    private final Provider<ImageLoader> imageLoader;
    private final Provider<Markwon> markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EducationLessonStandardFooterParentView> create(Provider<Markwon> provider, Provider<ImageLoader> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectImageLoader(EducationLessonStandardFooterParentView educationLessonStandardFooterParentView, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(educationLessonStandardFooterParentView, imageLoader);
    }

    @JvmStatic
    public static final void injectMarkwon(EducationLessonStandardFooterParentView educationLessonStandardFooterParentView, Markwon markwon) {
        INSTANCE.injectMarkwon(educationLessonStandardFooterParentView, markwon);
    }

    public EducationLessonStandardFooterParentView_MembersInjector(Provider<Markwon> markwon, Provider<ImageLoader> imageLoader) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.markwon = markwon;
        this.imageLoader = imageLoader;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EducationLessonStandardFooterParentView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion.injectMarkwon(instance, markwon);
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion.injectImageLoader(instance, imageLoader);
    }

    /* compiled from: EducationLessonStandardFooterParentView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView;", "markwon", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "injectMarkwon", "", "instance", "injectImageLoader", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EducationLessonStandardFooterParentView> create(Provider<Markwon> markwon, Provider<ImageLoader> imageLoader) {
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            return new EducationLessonStandardFooterParentView_MembersInjector(markwon, imageLoader);
        }

        @JvmStatic
        public final void injectMarkwon(EducationLessonStandardFooterParentView instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectImageLoader(EducationLessonStandardFooterParentView instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }
    }
}
