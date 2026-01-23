package com.robinhood.android;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScarletAppInitializedListener_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB6\u0012\u001f\u0010\u0003\u001a\u001b\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R'\u0010\u0003\u001a\u001b\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/ScarletAppInitializedListener_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/ScarletAppInitializedListener;", "transitions", "Ljavax/inject/Provider;", "", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "resources", "Landroid/content/res/Resources;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ScarletAppInitializedListener_Factory implements Factory<ScarletAppInitializedListener> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Resources> resources;
    private final Provider<Set<StylePropertyTransition<?, ?>>> transitions;

    @JvmStatic
    public static final ScarletAppInitializedListener_Factory create(Provider<Set<StylePropertyTransition<?, ?>>> provider, Provider<Resources> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final ScarletAppInitializedListener newInstance(Set<StylePropertyTransition<?, ?>> set, Resources resources) {
        return INSTANCE.newInstance(set, resources);
    }

    public ScarletAppInitializedListener_Factory(Provider<Set<StylePropertyTransition<?, ?>>> transitions, Provider<Resources> resources) {
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.transitions = transitions;
        this.resources = resources;
    }

    @Override // javax.inject.Provider
    public ScarletAppInitializedListener get() {
        Companion companion = INSTANCE;
        Set<StylePropertyTransition<?, ?>> set = this.transitions.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        return companion.newInstance(set, resources);
    }

    /* compiled from: ScarletAppInitializedListener_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\u001f\u0010\u0006\u001a\u001b\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J+\u0010\r\u001a\u00020\u000e2\u0019\u0010\u0006\u001a\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/ScarletAppInitializedListener_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/ScarletAppInitializedListener_Factory;", "transitions", "Ljavax/inject/Provider;", "", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "resources", "Landroid/content/res/Resources;", "newInstance", "Lcom/robinhood/android/ScarletAppInitializedListener;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ScarletAppInitializedListener_Factory create(Provider<Set<StylePropertyTransition<?, ?>>> transitions, Provider<Resources> resources) {
            Intrinsics.checkNotNullParameter(transitions, "transitions");
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new ScarletAppInitializedListener_Factory(transitions, resources);
        }

        @JvmStatic
        public final ScarletAppInitializedListener newInstance(Set<StylePropertyTransition<?, ?>> transitions, Resources resources) {
            Intrinsics.checkNotNullParameter(transitions, "transitions");
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new ScarletAppInitializedListener(transitions, resources);
        }
    }
}
