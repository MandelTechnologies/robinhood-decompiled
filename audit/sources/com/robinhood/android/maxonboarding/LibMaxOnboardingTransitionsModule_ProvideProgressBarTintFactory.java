package com.robinhood.android.maxonboarding;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/maxonboarding/LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-max-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory implements Factory<StylePropertyTransition<?, ?>> {
    private final Provider<Resources> resources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory create(Provider<Resources> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final StylePropertyTransition<?, ?> provideProgressBarTint(Resources resources) {
        return INSTANCE.provideProgressBarTint(resources);
    }

    public LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory(Provider<Resources> resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // javax.inject.Provider
    public StylePropertyTransition<?, ?> get() {
        Companion companion = INSTANCE;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        return companion.provideProgressBarTint(resources);
    }

    /* compiled from: LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001d\u0010\t\u001a\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0002\b\u000b2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/maxonboarding/LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/maxonboarding/LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "provideProgressBarTint", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "feature-lib-max-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory create(Provider<Resources> resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new LibMaxOnboardingTransitionsModule_ProvideProgressBarTintFactory(resources);
        }

        @JvmStatic
        public final StylePropertyTransition<?, ?> provideProgressBarTint(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Object objCheckNotNull = Preconditions.checkNotNull(LibMaxOnboardingTransitionsModule.INSTANCE.provideProgressBarTint(resources), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (StylePropertyTransition) objCheckNotNull;
        }
    }
}
