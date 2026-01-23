package com.robinhood.android.udf;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OldBaseDuxo_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0011*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\u0011B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/udf/OldBaseDuxo_MembersInjector;", "VS", "", "Ldagger/MembersInjector;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OldBaseDuxo_MembersInjector<VS> implements MembersInjector<OldBaseDuxo<VS>> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final <VS> MembersInjector<OldBaseDuxo<VS>> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final <VS> void injectDispatcherProvider(OldBaseDuxo<VS> oldBaseDuxo, DispatcherProvider dispatcherProvider) {
        INSTANCE.injectDispatcherProvider(oldBaseDuxo, dispatcherProvider);
    }

    @JvmStatic
    public static final <VS> void injectRxFactory(OldBaseDuxo<VS> oldBaseDuxo, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(oldBaseDuxo, rxFactory);
    }

    @JvmStatic
    public static final <VS> void injectRxGlobalErrorHandler(OldBaseDuxo<VS> oldBaseDuxo, RxGlobalErrorHandler rxGlobalErrorHandler) {
        INSTANCE.injectRxGlobalErrorHandler(oldBaseDuxo, rxGlobalErrorHandler);
    }

    public OldBaseDuxo_MembersInjector(Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OldBaseDuxo<VS> instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion.injectDispatcherProvider(instance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion.injectRxFactory(instance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion.injectRxGlobalErrorHandler(instance, rxGlobalErrorHandler);
    }

    /* compiled from: OldBaseDuxo_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0007J(\u0010\u000f\u001a\u00020\u0010\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\b\u001a\u00020\nH\u0007J(\u0010\u0012\u001a\u00020\u0010\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\u0013\u001a\u00020\u0010\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/udf/OldBaseDuxo_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "VS", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "injectDispatcherProvider", "", "instance", "injectRxFactory", "injectRxGlobalErrorHandler", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <VS> MembersInjector<OldBaseDuxo<VS>> create(Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new OldBaseDuxo_MembersInjector(dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final <VS> void injectDispatcherProvider(OldBaseDuxo<VS> instance, DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            instance.setDispatcherProvider(dispatcherProvider);
        }

        @JvmStatic
        public final <VS> void injectRxFactory(OldBaseDuxo<VS> instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }

        @JvmStatic
        public final <VS> void injectRxGlobalErrorHandler(OldBaseDuxo<VS> instance, RxGlobalErrorHandler rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            instance.setRxGlobalErrorHandler(rxGlobalErrorHandler);
        }
    }
}
