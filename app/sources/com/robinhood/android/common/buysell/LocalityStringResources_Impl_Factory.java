package com.robinhood.android.common.buysell;

import android.content.res.Resources;
import com.robinhood.android.common.buysell.LocalityStringResources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.stringscodegen.runtime.StringsCodegenRuntimeManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalityStringResources_Impl_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/buysell/LocalityStringResources_Impl_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/buysell/LocalityStringResources$Impl;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "runtimeManager", "Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-buy-sell-helper_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LocalityStringResources_Impl_Factory implements Factory<LocalityStringResources.Impl> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Resources> resources;
    private final Provider<StringsCodegenRuntimeManager> runtimeManager;

    @JvmStatic
    public static final LocalityStringResources_Impl_Factory create(Provider<Resources> provider, Provider<StringsCodegenRuntimeManager> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final LocalityStringResources.Impl newInstance(Resources resources, StringsCodegenRuntimeManager stringsCodegenRuntimeManager) {
        return INSTANCE.newInstance(resources, stringsCodegenRuntimeManager);
    }

    public LocalityStringResources_Impl_Factory(Provider<Resources> resources, Provider<StringsCodegenRuntimeManager> runtimeManager) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(runtimeManager, "runtimeManager");
        this.resources = resources;
        this.runtimeManager = runtimeManager;
    }

    @Override // javax.inject.Provider
    public LocalityStringResources.Impl get() {
        Companion companion = INSTANCE;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        StringsCodegenRuntimeManager stringsCodegenRuntimeManager = this.runtimeManager.get();
        Intrinsics.checkNotNullExpressionValue(stringsCodegenRuntimeManager, "get(...)");
        return companion.newInstance(resources, stringsCodegenRuntimeManager);
    }

    /* compiled from: LocalityStringResources_Impl_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/buysell/LocalityStringResources_Impl_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/buysell/LocalityStringResources_Impl_Factory;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "runtimeManager", "Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;", "newInstance", "Lcom/robinhood/android/common/buysell/LocalityStringResources$Impl;", "lib-buy-sell-helper_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LocalityStringResources_Impl_Factory create(Provider<Resources> resources, Provider<StringsCodegenRuntimeManager> runtimeManager) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(runtimeManager, "runtimeManager");
            return new LocalityStringResources_Impl_Factory(resources, runtimeManager);
        }

        @JvmStatic
        public final LocalityStringResources.Impl newInstance(Resources resources, StringsCodegenRuntimeManager runtimeManager) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(runtimeManager, "runtimeManager");
            return new LocalityStringResources.Impl(resources, runtimeManager);
        }
    }
}
