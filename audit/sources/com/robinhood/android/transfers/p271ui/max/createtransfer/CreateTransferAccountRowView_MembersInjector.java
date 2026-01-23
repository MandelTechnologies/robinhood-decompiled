package com.robinhood.android.transfers.p271ui.max.createtransfer;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.bonfire.TransferLimitsStore;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferAccountRowView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView;", "transfersBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateTransferAccountRowView_MembersInjector implements MembersInjector<CreateTransferAccountRowView> {
    private final Provider<LazyMoshi> moshi;
    private final Provider<RxFactory> rxFactory;
    private final Provider<TransferLimitsStore> transferLimitsStore;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CreateTransferAccountRowView> create(Provider<TransfersBonfireApi> provider, Provider<TransferLimitsStore> provider2, Provider<LazyMoshi> provider3, Provider<RxFactory> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectMoshi(CreateTransferAccountRowView createTransferAccountRowView, LazyMoshi lazyMoshi) {
        INSTANCE.injectMoshi(createTransferAccountRowView, lazyMoshi);
    }

    @JvmStatic
    public static final void injectRxFactory(CreateTransferAccountRowView createTransferAccountRowView, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(createTransferAccountRowView, rxFactory);
    }

    @JvmStatic
    public static final void injectTransferLimitsStore(CreateTransferAccountRowView createTransferAccountRowView, TransferLimitsStore transferLimitsStore) {
        INSTANCE.injectTransferLimitsStore(createTransferAccountRowView, transferLimitsStore);
    }

    @JvmStatic
    public static final void injectTransfersBonfireApi(CreateTransferAccountRowView createTransferAccountRowView, TransfersBonfireApi transfersBonfireApi) {
        INSTANCE.injectTransfersBonfireApi(createTransferAccountRowView, transfersBonfireApi);
    }

    public CreateTransferAccountRowView_MembersInjector(Provider<TransfersBonfireApi> transfersBonfireApi, Provider<TransferLimitsStore> transferLimitsStore, Provider<LazyMoshi> moshi, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.transfersBonfireApi = transfersBonfireApi;
        this.transferLimitsStore = transferLimitsStore;
        this.moshi = moshi;
        this.rxFactory = rxFactory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreateTransferAccountRowView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        companion.injectTransfersBonfireApi(instance, transfersBonfireApi);
        TransferLimitsStore transferLimitsStore = this.transferLimitsStore.get();
        Intrinsics.checkNotNullExpressionValue(transferLimitsStore, "get(...)");
        companion.injectTransferLimitsStore(instance, transferLimitsStore);
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        companion.injectMoshi(instance, lazyMoshi);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion.injectRxFactory(instance, rxFactory);
    }

    /* compiled from: CreateTransferAccountRowView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView;", "transfersBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "injectTransfersBonfireApi", "", "instance", "injectTransferLimitsStore", "injectMoshi", "injectRxFactory", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CreateTransferAccountRowView> create(Provider<TransfersBonfireApi> transfersBonfireApi, Provider<TransferLimitsStore> transferLimitsStore, Provider<LazyMoshi> moshi, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new CreateTransferAccountRowView_MembersInjector(transfersBonfireApi, transferLimitsStore, moshi, rxFactory);
        }

        @JvmStatic
        public final void injectTransfersBonfireApi(CreateTransferAccountRowView instance, TransfersBonfireApi transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            instance.setTransfersBonfireApi(transfersBonfireApi);
        }

        @JvmStatic
        public final void injectTransferLimitsStore(CreateTransferAccountRowView instance, TransferLimitsStore transferLimitsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            instance.setTransferLimitsStore(transferLimitsStore);
        }

        @JvmStatic
        public final void injectMoshi(CreateTransferAccountRowView instance, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            instance.setMoshi(moshi);
        }

        @JvmStatic
        public final void injectRxFactory(CreateTransferAccountRowView instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }
    }
}
