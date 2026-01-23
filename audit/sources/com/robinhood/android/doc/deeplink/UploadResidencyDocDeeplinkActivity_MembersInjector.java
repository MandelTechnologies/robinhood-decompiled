package com.robinhood.android.doc.deeplink;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadResidencyDocDeeplinkActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/doc/deeplink/UploadResidencyDocDeeplinkActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/doc/deeplink/UploadResidencyDocDeeplinkActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "residencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class UploadResidencyDocDeeplinkActivity_MembersInjector implements MembersInjector<UploadResidencyDocDeeplinkActivity> {
    private final Provider<CryptoResidencyDocumentStore> residencyDocumentStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<UploadResidencyDocDeeplinkActivity> create(Provider<BaseActivitySingletons> provider, Provider<CryptoResidencyDocumentStore> provider2, Provider<RxFactory> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectResidencyDocumentStore(UploadResidencyDocDeeplinkActivity uploadResidencyDocDeeplinkActivity, CryptoResidencyDocumentStore cryptoResidencyDocumentStore) {
        INSTANCE.injectResidencyDocumentStore(uploadResidencyDocDeeplinkActivity, cryptoResidencyDocumentStore);
    }

    @JvmStatic
    public static final void injectRxFactory(UploadResidencyDocDeeplinkActivity uploadResidencyDocDeeplinkActivity, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(uploadResidencyDocDeeplinkActivity, rxFactory);
    }

    public UploadResidencyDocDeeplinkActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<CryptoResidencyDocumentStore> residencyDocumentStore, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(residencyDocumentStore, "residencyDocumentStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.singletons = singletons;
        this.residencyDocumentStore = residencyDocumentStore;
        this.rxFactory = rxFactory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UploadResidencyDocDeeplinkActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.residencyDocumentStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoResidencyDocumentStore, "get(...)");
        companion2.injectResidencyDocumentStore(instance, cryptoResidencyDocumentStore);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(instance, rxFactory);
    }

    /* compiled from: UploadResidencyDocDeeplinkActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/deeplink/UploadResidencyDocDeeplinkActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/doc/deeplink/UploadResidencyDocDeeplinkActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "residencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "injectResidencyDocumentStore", "", "instance", "injectRxFactory", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<UploadResidencyDocDeeplinkActivity> create(Provider<BaseActivitySingletons> singletons, Provider<CryptoResidencyDocumentStore> residencyDocumentStore, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(residencyDocumentStore, "residencyDocumentStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new UploadResidencyDocDeeplinkActivity_MembersInjector(singletons, residencyDocumentStore, rxFactory);
        }

        @JvmStatic
        public final void injectResidencyDocumentStore(UploadResidencyDocDeeplinkActivity instance, CryptoResidencyDocumentStore residencyDocumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(residencyDocumentStore, "residencyDocumentStore");
            instance.setResidencyDocumentStore(residencyDocumentStore);
        }

        @JvmStatic
        public final void injectRxFactory(UploadResidencyDocDeeplinkActivity instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }
    }
}
