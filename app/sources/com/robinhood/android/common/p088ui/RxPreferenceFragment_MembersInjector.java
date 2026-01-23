package com.robinhood.android.common.p088ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxPreferenceFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RxPreferenceFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/ui/RxPreferenceFragment;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RxPreferenceFragment_MembersInjector implements MembersInjector<RxPreferenceFragment> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RxPreferenceFragment> create(Provider<DispatcherProvider> provider, Provider<RxGlobalErrorHandler> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectDispatcherProvider(RxPreferenceFragment rxPreferenceFragment, DispatcherProvider dispatcherProvider) {
        INSTANCE.injectDispatcherProvider(rxPreferenceFragment, dispatcherProvider);
    }

    @JvmStatic
    public static final void injectRxGlobalErrorHandler(RxPreferenceFragment rxPreferenceFragment, RxGlobalErrorHandler rxGlobalErrorHandler) {
        INSTANCE.injectRxGlobalErrorHandler(rxPreferenceFragment, rxGlobalErrorHandler);
    }

    public RxPreferenceFragment_MembersInjector(Provider<DispatcherProvider> dispatcherProvider, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.dispatcherProvider = dispatcherProvider;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RxPreferenceFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion.injectDispatcherProvider(instance, dispatcherProvider);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion.injectRxGlobalErrorHandler(instance, rxGlobalErrorHandler);
    }

    /* compiled from: RxPreferenceFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RxPreferenceFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/ui/RxPreferenceFragment;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "injectDispatcherProvider", "", "instance", "injectRxGlobalErrorHandler", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RxPreferenceFragment> create(Provider<DispatcherProvider> dispatcherProvider, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RxPreferenceFragment_MembersInjector(dispatcherProvider, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final void injectDispatcherProvider(RxPreferenceFragment instance, DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            instance.setDispatcherProvider$lib_common_externalRelease(dispatcherProvider);
        }

        @JvmStatic
        public final void injectRxGlobalErrorHandler(RxPreferenceFragment instance, RxGlobalErrorHandler rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            instance.setRxGlobalErrorHandler$lib_common_externalRelease(rxGlobalErrorHandler);
        }
    }
}
