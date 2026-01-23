package com.robinhood.hammer.android.viewmodel;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.hammer.android.viewmodel.BaseViewModelComponent;
import com.robinhood.hammer.android.viewmodel.DefaultViewModelComponent;
import dagger.internal.Factory;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HammerViewModelFactoryCreator_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001d\u0010\u0006\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n0\u0004\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0002\b\n0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0006\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "componentFactories", "", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "keySet", "", "defaultViewModelComponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class HammerViewModelFactoryCreator_Factory implements Factory<HammerViewModelFactoryCreator> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> application;
    private final Provider<Map<String, BaseViewModelComponent.Factory>> componentFactories;
    private final Provider<DefaultViewModelComponent.Factory> defaultViewModelComponentFactory;
    private final Provider<Set<String>> keySet;

    @JvmStatic
    public static final HammerViewModelFactoryCreator_Factory create(Provider<Application> provider, Provider<Map<String, BaseViewModelComponent.Factory>> provider2, Provider<Set<String>> provider3, Provider<DefaultViewModelComponent.Factory> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final HammerViewModelFactoryCreator newInstance(Application application, Map<String, BaseViewModelComponent.Factory> map, Set<String> set, DefaultViewModelComponent.Factory factory) {
        return INSTANCE.newInstance(application, map, set, factory);
    }

    public HammerViewModelFactoryCreator_Factory(Provider<Application> application, Provider<Map<String, BaseViewModelComponent.Factory>> componentFactories, Provider<Set<String>> keySet, Provider<DefaultViewModelComponent.Factory> defaultViewModelComponentFactory) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(componentFactories, "componentFactories");
        Intrinsics.checkNotNullParameter(keySet, "keySet");
        Intrinsics.checkNotNullParameter(defaultViewModelComponentFactory, "defaultViewModelComponentFactory");
        this.application = application;
        this.componentFactories = componentFactories;
        this.keySet = keySet;
        this.defaultViewModelComponentFactory = defaultViewModelComponentFactory;
    }

    @Override // javax.inject.Provider
    public HammerViewModelFactoryCreator get() {
        Companion companion = INSTANCE;
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        Map<String, BaseViewModelComponent.Factory> map = this.componentFactories.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        Set<String> set = this.keySet.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        DefaultViewModelComponent.Factory factory = this.defaultViewModelComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        return companion.newInstance(application, map, set, factory);
    }

    /* compiled from: HammerViewModelFactoryCreator_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001d\u0010\t\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r0\u00072\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\r0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0007JD\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator_Factory;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "componentFactories", "", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "keySet", "", "defaultViewModelComponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "newInstance", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HammerViewModelFactoryCreator_Factory create(Provider<Application> application, Provider<Map<String, BaseViewModelComponent.Factory>> componentFactories, Provider<Set<String>> keySet, Provider<DefaultViewModelComponent.Factory> defaultViewModelComponentFactory) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(componentFactories, "componentFactories");
            Intrinsics.checkNotNullParameter(keySet, "keySet");
            Intrinsics.checkNotNullParameter(defaultViewModelComponentFactory, "defaultViewModelComponentFactory");
            return new HammerViewModelFactoryCreator_Factory(application, componentFactories, keySet, defaultViewModelComponentFactory);
        }

        @JvmStatic
        public final HammerViewModelFactoryCreator newInstance(Application application, Map<String, BaseViewModelComponent.Factory> componentFactories, Set<String> keySet, DefaultViewModelComponent.Factory defaultViewModelComponentFactory) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(componentFactories, "componentFactories");
            Intrinsics.checkNotNullParameter(keySet, "keySet");
            Intrinsics.checkNotNullParameter(defaultViewModelComponentFactory, "defaultViewModelComponentFactory");
            return new HammerViewModelFactoryCreator(application, componentFactories, keySet, defaultViewModelComponentFactory);
        }
    }
}
