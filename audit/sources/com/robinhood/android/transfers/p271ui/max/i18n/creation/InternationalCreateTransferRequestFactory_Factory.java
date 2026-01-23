package com.robinhood.android.transfers.p271ui.max.i18n.creation;

import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalCreateTransferRequestFactory_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BJ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "ukTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/UkTransferRequestCreator;", "sgTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/SgTransferRequestCreator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InternationalCreateTransferRequestFactory_Factory implements Factory<InternationalCreateTransferRequestFactory> {
    private final Provider<RefIdFactory<InternationalCreateTransferRequestFactory.TransferData>> refIdFactory;
    private final Provider<SgTransferRequestCreator> sgTransferRequestCreator;
    private final Provider<UkTransferRequestCreator> ukTransferRequestCreator;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InternationalCreateTransferRequestFactory_Factory create(Provider<UserStore> provider, Provider<RefIdFactory<InternationalCreateTransferRequestFactory.TransferData>> provider2, Provider<UkTransferRequestCreator> provider3, Provider<SgTransferRequestCreator> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final InternationalCreateTransferRequestFactory newInstance(UserStore userStore, RefIdFactory<InternationalCreateTransferRequestFactory.TransferData> refIdFactory, UkTransferRequestCreator ukTransferRequestCreator, SgTransferRequestCreator sgTransferRequestCreator) {
        return INSTANCE.newInstance(userStore, refIdFactory, ukTransferRequestCreator, sgTransferRequestCreator);
    }

    public InternationalCreateTransferRequestFactory_Factory(Provider<UserStore> userStore, Provider<RefIdFactory<InternationalCreateTransferRequestFactory.TransferData>> refIdFactory, Provider<UkTransferRequestCreator> ukTransferRequestCreator, Provider<SgTransferRequestCreator> sgTransferRequestCreator) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        Intrinsics.checkNotNullParameter(ukTransferRequestCreator, "ukTransferRequestCreator");
        Intrinsics.checkNotNullParameter(sgTransferRequestCreator, "sgTransferRequestCreator");
        this.userStore = userStore;
        this.refIdFactory = refIdFactory;
        this.ukTransferRequestCreator = ukTransferRequestCreator;
        this.sgTransferRequestCreator = sgTransferRequestCreator;
    }

    @Override // javax.inject.Provider
    public InternationalCreateTransferRequestFactory get() {
        Companion companion = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        RefIdFactory<InternationalCreateTransferRequestFactory.TransferData> refIdFactory = this.refIdFactory.get();
        Intrinsics.checkNotNullExpressionValue(refIdFactory, "get(...)");
        UkTransferRequestCreator ukTransferRequestCreator = this.ukTransferRequestCreator.get();
        Intrinsics.checkNotNullExpressionValue(ukTransferRequestCreator, "get(...)");
        SgTransferRequestCreator sgTransferRequestCreator = this.sgTransferRequestCreator.get();
        Intrinsics.checkNotNullExpressionValue(sgTransferRequestCreator, "get(...)");
        return companion.newInstance(userStore, refIdFactory, ukTransferRequestCreator, sgTransferRequestCreator);
    }

    /* compiled from: InternationalCreateTransferRequestFactory_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory_Factory;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "ukTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/UkTransferRequestCreator;", "sgTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/SgTransferRequestCreator;", "newInstance", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternationalCreateTransferRequestFactory_Factory create(Provider<UserStore> userStore, Provider<RefIdFactory<InternationalCreateTransferRequestFactory.TransferData>> refIdFactory, Provider<UkTransferRequestCreator> ukTransferRequestCreator, Provider<SgTransferRequestCreator> sgTransferRequestCreator) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            Intrinsics.checkNotNullParameter(ukTransferRequestCreator, "ukTransferRequestCreator");
            Intrinsics.checkNotNullParameter(sgTransferRequestCreator, "sgTransferRequestCreator");
            return new InternationalCreateTransferRequestFactory_Factory(userStore, refIdFactory, ukTransferRequestCreator, sgTransferRequestCreator);
        }

        @JvmStatic
        public final InternationalCreateTransferRequestFactory newInstance(UserStore userStore, RefIdFactory<InternationalCreateTransferRequestFactory.TransferData> refIdFactory, UkTransferRequestCreator ukTransferRequestCreator, SgTransferRequestCreator sgTransferRequestCreator) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            Intrinsics.checkNotNullParameter(ukTransferRequestCreator, "ukTransferRequestCreator");
            Intrinsics.checkNotNullParameter(sgTransferRequestCreator, "sgTransferRequestCreator");
            return new InternationalCreateTransferRequestFactory(userStore, refIdFactory, ukTransferRequestCreator, sgTransferRequestCreator);
        }
    }
}
