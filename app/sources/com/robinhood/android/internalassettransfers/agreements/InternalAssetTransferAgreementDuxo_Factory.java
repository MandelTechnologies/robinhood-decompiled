package com.robinhood.android.internalassettransfers.agreements;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferAgreementDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDuxo;", "agreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/agreements/AgreementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InternalAssetTransferAgreementDuxo_Factory implements Factory<InternalAssetTransferAgreementDuxo> {
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InternalAssetTransferAgreementStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InternalAssetTransferAgreementDuxo_Factory create(Provider<AgreementsStore> provider, Provider<DuxoBundle> provider2, Provider<InternalAssetTransferAgreementStateProvider> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final InternalAssetTransferAgreementDuxo newInstance(AgreementsStore agreementsStore, DuxoBundle duxoBundle, InternalAssetTransferAgreementStateProvider internalAssetTransferAgreementStateProvider) {
        return INSTANCE.newInstance(agreementsStore, duxoBundle, internalAssetTransferAgreementStateProvider);
    }

    public InternalAssetTransferAgreementDuxo_Factory(Provider<AgreementsStore> agreementsStore, Provider<DuxoBundle> duxoBundle, Provider<InternalAssetTransferAgreementStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.agreementsStore = agreementsStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public InternalAssetTransferAgreementDuxo get() {
        Companion companion = INSTANCE;
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        InternalAssetTransferAgreementStateProvider internalAssetTransferAgreementStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransferAgreementStateProvider, "get(...)");
        return companion.newInstance(agreementsStore, duxoBundle, internalAssetTransferAgreementStateProvider);
    }

    /* compiled from: InternalAssetTransferAgreementDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDuxo_Factory;", "agreementsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/agreements/AgreementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementStateProvider;", "newInstance", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDuxo;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternalAssetTransferAgreementDuxo_Factory create(Provider<AgreementsStore> agreementsStore, Provider<DuxoBundle> duxoBundle, Provider<InternalAssetTransferAgreementStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new InternalAssetTransferAgreementDuxo_Factory(agreementsStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final InternalAssetTransferAgreementDuxo newInstance(AgreementsStore agreementsStore, DuxoBundle duxoBundle, InternalAssetTransferAgreementStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new InternalAssetTransferAgreementDuxo(agreementsStore, duxoBundle, stateProvider);
        }
    }
}
