package com.robinhood.shared.common.singular;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SingularManagedSdk_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/SingularManagedSdk_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/common/singular/SingularManagedSdk;", "singularSdkWrapper", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "rootScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SingularManagedSdk_Factory implements Factory<SingularManagedSdk> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> rootScope;
    private final Provider<SingularSdkWrapper> singularSdkWrapper;

    @JvmStatic
    public static final SingularManagedSdk_Factory create(Provider<SingularSdkWrapper> provider, Provider<CoroutineScope> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final SingularManagedSdk newInstance(SingularSdkWrapper singularSdkWrapper, CoroutineScope coroutineScope) {
        return INSTANCE.newInstance(singularSdkWrapper, coroutineScope);
    }

    public SingularManagedSdk_Factory(Provider<SingularSdkWrapper> singularSdkWrapper, Provider<CoroutineScope> rootScope) {
        Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.singularSdkWrapper = singularSdkWrapper;
        this.rootScope = rootScope;
    }

    @Override // javax.inject.Provider
    public SingularManagedSdk get() {
        Companion companion = INSTANCE;
        SingularSdkWrapper singularSdkWrapper = this.singularSdkWrapper.get();
        Intrinsics.checkNotNullExpressionValue(singularSdkWrapper, "get(...)");
        CoroutineScope coroutineScope = this.rootScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.newInstance(singularSdkWrapper, coroutineScope);
    }

    /* compiled from: SingularManagedSdk_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/SingularManagedSdk_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/common/singular/SingularManagedSdk_Factory;", "singularSdkWrapper", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "rootScope", "Lkotlinx/coroutines/CoroutineScope;", "newInstance", "Lcom/robinhood/shared/common/singular/SingularManagedSdk;", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SingularManagedSdk_Factory create(Provider<SingularSdkWrapper> singularSdkWrapper, Provider<CoroutineScope> rootScope) {
            Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
            Intrinsics.checkNotNullParameter(rootScope, "rootScope");
            return new SingularManagedSdk_Factory(singularSdkWrapper, rootScope);
        }

        @JvmStatic
        public final SingularManagedSdk newInstance(SingularSdkWrapper singularSdkWrapper, CoroutineScope rootScope) {
            Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
            Intrinsics.checkNotNullParameter(rootScope, "rootScope");
            return new SingularManagedSdk(singularSdkWrapper, rootScope);
        }
    }
}
