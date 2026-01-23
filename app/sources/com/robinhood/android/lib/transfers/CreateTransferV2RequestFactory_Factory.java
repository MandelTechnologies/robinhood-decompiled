package com.robinhood.android.lib.transfers;

import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.stripe.StripeStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2RequestFactory_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB.\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory;", "refIdFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/lib/transfers/TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreateTransferV2RequestFactory_Factory implements Factory<CreateTransferV2RequestFactory> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RefIdFactory<TransferData>> refIdFactory;
    private final Provider<StripeStore> stripeStore;

    @JvmStatic
    public static final CreateTransferV2RequestFactory_Factory create(Provider<RefIdFactory<TransferData>> provider, Provider<StripeStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final CreateTransferV2RequestFactory newInstance(RefIdFactory<TransferData> refIdFactory, StripeStore stripeStore) {
        return INSTANCE.newInstance(refIdFactory, stripeStore);
    }

    public CreateTransferV2RequestFactory_Factory(Provider<RefIdFactory<TransferData>> refIdFactory, Provider<StripeStore> stripeStore) {
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        this.refIdFactory = refIdFactory;
        this.stripeStore = stripeStore;
    }

    @Override // javax.inject.Provider
    public CreateTransferV2RequestFactory get() {
        Companion companion = INSTANCE;
        RefIdFactory<TransferData> refIdFactory = this.refIdFactory.get();
        Intrinsics.checkNotNullExpressionValue(refIdFactory, "get(...)");
        StripeStore stripeStore = this.stripeStore.get();
        Intrinsics.checkNotNullExpressionValue(stripeStore, "get(...)");
        return companion.newInstance(refIdFactory, stripeStore);
    }

    /* compiled from: CreateTransferV2RequestFactory_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J#\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory_Factory;", "refIdFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/lib/transfers/TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "newInstance", "Lcom/robinhood/android/lib/transfers/CreateTransferV2RequestFactory;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreateTransferV2RequestFactory_Factory create(Provider<RefIdFactory<TransferData>> refIdFactory, Provider<StripeStore> stripeStore) {
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            return new CreateTransferV2RequestFactory_Factory(refIdFactory, stripeStore);
        }

        @JvmStatic
        public final CreateTransferV2RequestFactory newInstance(RefIdFactory<TransferData> refIdFactory, StripeStore stripeStore) {
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            return new CreateTransferV2RequestFactory(refIdFactory, stripeStore);
        }
    }
}
