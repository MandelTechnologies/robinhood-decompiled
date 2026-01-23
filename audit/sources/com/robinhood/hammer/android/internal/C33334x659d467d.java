package com.robinhood.hammer.android.internal;

import android.app.Activity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.hammer.core.internal.DynamicInjector;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityDynamicInjectionModule_ProvideDynamicActivityInjectorFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\rB.\u0012%\u0010\u0005\u001a!\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\t0\u0007¢\u0006\u0002\b\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R-\u0010\u0005\u001a!\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\t0\u0007¢\u0006\u0002\b\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/hammer/android/internal/ActivityDynamicInjectionModule_ProvideDynamicActivityInjectorFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/hammer/core/internal/DynamicInjector;", "Landroid/app/Activity;", "Lkotlin/jvm/JvmSuppressWildcards;", "injectors", "Ljavax/inject/Provider;", "", "", "Ldagger/MembersInjector;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.internal.ActivityDynamicInjectionModule_ProvideDynamicActivityInjectorFactory */
/* loaded from: classes20.dex */
public final class C33334x659d467d implements Factory<DynamicInjector<Activity>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Map<String, MembersInjector<? extends Activity>>> injectors;

    @JvmStatic
    public static final C33334x659d467d create(Provider<Map<String, MembersInjector<? extends Activity>>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final DynamicInjector<Activity> provideDynamicActivityInjector(Map<String, MembersInjector<? extends Activity>> map) {
        return INSTANCE.provideDynamicActivityInjector(map);
    }

    public C33334x659d467d(Provider<Map<String, MembersInjector<? extends Activity>>> injectors) {
        Intrinsics.checkNotNullParameter(injectors, "injectors");
        this.injectors = injectors;
    }

    @Override // javax.inject.Provider
    public DynamicInjector<Activity> get() {
        Companion companion = INSTANCE;
        Map<String, MembersInjector<? extends Activity>> map = this.injectors.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        return companion.provideDynamicActivityInjector(map);
    }

    /* compiled from: ActivityDynamicInjectionModule_ProvideDynamicActivityInjectorFactory.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052%\u0010\u0006\u001a!\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\b¢\u0006\u0002\b\f0\u0007H\u0007J4\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\f2\u001f\u0010\u0006\u001a\u001b\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\b¢\u0006\u0002\b\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/hammer/android/internal/ActivityDynamicInjectionModule_ProvideDynamicActivityInjectorFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/hammer/android/internal/ActivityDynamicInjectionModule_ProvideDynamicActivityInjectorFactory;", "injectors", "Ljavax/inject/Provider;", "", "", "Ldagger/MembersInjector;", "Landroid/app/Activity;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideDynamicActivityInjector", "Lcom/robinhood/hammer/core/internal/DynamicInjector;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.hammer.android.internal.ActivityDynamicInjectionModule_ProvideDynamicActivityInjectorFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C33334x659d467d create(Provider<Map<String, MembersInjector<? extends Activity>>> injectors) {
            Intrinsics.checkNotNullParameter(injectors, "injectors");
            return new C33334x659d467d(injectors);
        }

        @JvmStatic
        public final DynamicInjector<Activity> provideDynamicActivityInjector(Map<String, MembersInjector<? extends Activity>> injectors) {
            Intrinsics.checkNotNullParameter(injectors, "injectors");
            Object objCheckNotNull = Preconditions.checkNotNull(DynamicInjectionModules.INSTANCE.provideDynamicActivityInjector(injectors), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (DynamicInjector) objCheckNotNull;
        }
    }
}
