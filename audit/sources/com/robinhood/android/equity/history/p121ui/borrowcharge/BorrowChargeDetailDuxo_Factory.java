package com.robinhood.android.equity.history.p121ui.borrowcharge;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.BorrowChargeStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BorrowChargeDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo;", "borrowChargeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/BorrowChargeStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class BorrowChargeDetailDuxo_Factory implements Factory<BorrowChargeDetailDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BorrowChargeStore> borrowChargeStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BorrowChargeDetailStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BorrowChargeDetailDuxo_Factory create(Provider<BorrowChargeStore> provider, Provider<AccountProvider> provider2, Provider<SavedStateHandle> provider3, Provider<InstrumentStore> provider4, Provider<DuxoBundle> provider5, Provider<BorrowChargeDetailStateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final BorrowChargeDetailDuxo newInstance(BorrowChargeStore borrowChargeStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle, InstrumentStore instrumentStore, DuxoBundle duxoBundle, BorrowChargeDetailStateProvider borrowChargeDetailStateProvider) {
        return INSTANCE.newInstance(borrowChargeStore, accountProvider, savedStateHandle, instrumentStore, duxoBundle, borrowChargeDetailStateProvider);
    }

    public BorrowChargeDetailDuxo_Factory(Provider<BorrowChargeStore> borrowChargeStore, Provider<AccountProvider> accountProvider, Provider<SavedStateHandle> savedStateHandle, Provider<InstrumentStore> instrumentStore, Provider<DuxoBundle> duxoBundle, Provider<BorrowChargeDetailStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(borrowChargeStore, "borrowChargeStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.borrowChargeStore = borrowChargeStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
        this.instrumentStore = instrumentStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public BorrowChargeDetailDuxo get() {
        Companion companion = INSTANCE;
        BorrowChargeStore borrowChargeStore = this.borrowChargeStore.get();
        Intrinsics.checkNotNullExpressionValue(borrowChargeStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        BorrowChargeDetailStateProvider borrowChargeDetailStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(borrowChargeDetailStateProvider, "get(...)");
        return companion.newInstance(borrowChargeStore, accountProvider, savedStateHandle, instrumentStore, duxoBundle, borrowChargeDetailStateProvider);
    }

    /* compiled from: BorrowChargeDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo_Factory;", "borrowChargeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/BorrowChargeStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailStateProvider;", "newInstance", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo;", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BorrowChargeDetailDuxo_Factory create(Provider<BorrowChargeStore> borrowChargeStore, Provider<AccountProvider> accountProvider, Provider<SavedStateHandle> savedStateHandle, Provider<InstrumentStore> instrumentStore, Provider<DuxoBundle> duxoBundle, Provider<BorrowChargeDetailStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(borrowChargeStore, "borrowChargeStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new BorrowChargeDetailDuxo_Factory(borrowChargeStore, accountProvider, savedStateHandle, instrumentStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final BorrowChargeDetailDuxo newInstance(BorrowChargeStore borrowChargeStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle, InstrumentStore instrumentStore, DuxoBundle duxoBundle, BorrowChargeDetailStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(borrowChargeStore, "borrowChargeStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new BorrowChargeDetailDuxo(borrowChargeStore, accountProvider, savedStateHandle, instrumentStore, duxoBundle, stateProvider);
        }
    }
}
