package com.robinhood.android.isa.isatransfer;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.store.isa.IsaTransferStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaTransferDetailUseCase_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransfer/IsaTransferDetailUseCase_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/isa/isatransfer/IsaTransferDetailUseCase;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "isaTransferStore", "Lcom/robinhood/store/isa/IsaTransferStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-isa-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaTransferDetailUseCase_Factory implements Factory<IsaTransferDetailUseCase> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<IsaTransferStore> isaTransferStore;

    @JvmStatic
    public static final IsaTransferDetailUseCase_Factory create(Provider<AccountProvider> provider, Provider<IsaTransferStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final IsaTransferDetailUseCase newInstance(AccountProvider accountProvider, IsaTransferStore isaTransferStore) {
        return INSTANCE.newInstance(accountProvider, isaTransferStore);
    }

    public IsaTransferDetailUseCase_Factory(Provider<AccountProvider> accountProvider, Provider<IsaTransferStore> isaTransferStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(isaTransferStore, "isaTransferStore");
        this.accountProvider = accountProvider;
        this.isaTransferStore = isaTransferStore;
    }

    @Override // javax.inject.Provider
    public IsaTransferDetailUseCase get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        IsaTransferStore isaTransferStore = this.isaTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(isaTransferStore, "get(...)");
        return companion.newInstance(accountProvider, isaTransferStore);
    }

    /* compiled from: IsaTransferDetailUseCase_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransfer/IsaTransferDetailUseCase_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/isa/isatransfer/IsaTransferDetailUseCase_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "isaTransferStore", "Lcom/robinhood/store/isa/IsaTransferStore;", "newInstance", "Lcom/robinhood/android/isa/isatransfer/IsaTransferDetailUseCase;", "lib-isa-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IsaTransferDetailUseCase_Factory create(Provider<AccountProvider> accountProvider, Provider<IsaTransferStore> isaTransferStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(isaTransferStore, "isaTransferStore");
            return new IsaTransferDetailUseCase_Factory(accountProvider, isaTransferStore);
        }

        @JvmStatic
        public final IsaTransferDetailUseCase newInstance(AccountProvider accountProvider, IsaTransferStore isaTransferStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(isaTransferStore, "isaTransferStore");
            return new IsaTransferDetailUseCase(accountProvider, isaTransferStore);
        }
    }
}
