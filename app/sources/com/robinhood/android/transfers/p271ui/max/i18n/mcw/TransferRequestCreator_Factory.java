package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferRequestCreator_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB<\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;", "refIdFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "paymentInstrumentApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferRequestCreator_Factory implements Factory<TransferRequestCreator> {
    private final Provider<PaymentInstrumentBonfireApi> paymentInstrumentApi;
    private final Provider<RefIdFactory<TransferData>> refIdFactory;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TransferRequestCreator_Factory create(Provider<RefIdFactory<TransferData>> provider, Provider<PaymentInstrumentBonfireApi> provider2, Provider<TransfersBonfireApi> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final TransferRequestCreator newInstance(RefIdFactory<TransferData> refIdFactory, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, TransfersBonfireApi transfersBonfireApi) {
        return INSTANCE.newInstance(refIdFactory, paymentInstrumentBonfireApi, transfersBonfireApi);
    }

    public TransferRequestCreator_Factory(Provider<RefIdFactory<TransferData>> refIdFactory, Provider<PaymentInstrumentBonfireApi> paymentInstrumentApi, Provider<TransfersBonfireApi> transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        Intrinsics.checkNotNullParameter(paymentInstrumentApi, "paymentInstrumentApi");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        this.refIdFactory = refIdFactory;
        this.paymentInstrumentApi = paymentInstrumentApi;
        this.transfersBonfireApi = transfersBonfireApi;
    }

    @Override // javax.inject.Provider
    public TransferRequestCreator get() {
        Companion companion = INSTANCE;
        RefIdFactory<TransferData> refIdFactory = this.refIdFactory.get();
        Intrinsics.checkNotNullExpressionValue(refIdFactory, "get(...)");
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentApi.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentBonfireApi, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        return companion.newInstance(refIdFactory, paymentInstrumentBonfireApi, transfersBonfireApi);
    }

    /* compiled from: TransferRequestCreator_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J+\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator_Factory;", "refIdFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "paymentInstrumentApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "newInstance", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferRequestCreator_Factory create(Provider<RefIdFactory<TransferData>> refIdFactory, Provider<PaymentInstrumentBonfireApi> paymentInstrumentApi, Provider<TransfersBonfireApi> transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            Intrinsics.checkNotNullParameter(paymentInstrumentApi, "paymentInstrumentApi");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            return new TransferRequestCreator_Factory(refIdFactory, paymentInstrumentApi, transfersBonfireApi);
        }

        @JvmStatic
        public final TransferRequestCreator newInstance(RefIdFactory<TransferData> refIdFactory, PaymentInstrumentBonfireApi paymentInstrumentApi, TransfersBonfireApi transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            Intrinsics.checkNotNullParameter(paymentInstrumentApi, "paymentInstrumentApi");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            return new TransferRequestCreator(refIdFactory, paymentInstrumentApi, transfersBonfireApi);
        }
    }
}
