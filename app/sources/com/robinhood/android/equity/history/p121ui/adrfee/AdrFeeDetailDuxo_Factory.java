package com.robinhood.android.equity.history.p121ui.adrfee;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.librobinhood.data.store.AdrFeeStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdrFeeDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo;", "adrFeeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AdrFeeStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AdrFeeDetailDuxo_Factory implements Factory<AdrFeeDetailDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AdrFeeStore> adrFeeStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AdrFeeDetailStateProvider> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AdrFeeDetailDuxo_Factory create(Provider<AdrFeeStore> provider, Provider<AccountProvider> provider2, Provider<StaticContentStore> provider3, Provider<DuxoBundle> provider4, Provider<SavedStateHandle> provider5, Provider<AdrFeeDetailStateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final AdrFeeDetailDuxo newInstance(AdrFeeStore adrFeeStore, AccountProvider accountProvider, StaticContentStore staticContentStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AdrFeeDetailStateProvider adrFeeDetailStateProvider) {
        return INSTANCE.newInstance(adrFeeStore, accountProvider, staticContentStore, duxoBundle, savedStateHandle, adrFeeDetailStateProvider);
    }

    public AdrFeeDetailDuxo_Factory(Provider<AdrFeeStore> adrFeeStore, Provider<AccountProvider> accountProvider, Provider<StaticContentStore> staticContentStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<AdrFeeDetailStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.adrFeeStore = adrFeeStore;
        this.accountProvider = accountProvider;
        this.staticContentStore = staticContentStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public AdrFeeDetailDuxo get() {
        Companion companion = INSTANCE;
        AdrFeeStore adrFeeStore = this.adrFeeStore.get();
        Intrinsics.checkNotNullExpressionValue(adrFeeStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AdrFeeDetailStateProvider adrFeeDetailStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(adrFeeDetailStateProvider, "get(...)");
        return companion.newInstance(adrFeeStore, accountProvider, staticContentStore, duxoBundle, savedStateHandle, adrFeeDetailStateProvider);
    }

    /* compiled from: AdrFeeDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo_Factory;", "adrFeeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AdrFeeStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailStateProvider;", "newInstance", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo;", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdrFeeDetailDuxo_Factory create(Provider<AdrFeeStore> adrFeeStore, Provider<AccountProvider> accountProvider, Provider<StaticContentStore> staticContentStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<AdrFeeDetailStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new AdrFeeDetailDuxo_Factory(adrFeeStore, accountProvider, staticContentStore, duxoBundle, savedStateHandle, stateProvider);
        }

        @JvmStatic
        public final AdrFeeDetailDuxo newInstance(AdrFeeStore adrFeeStore, AccountProvider accountProvider, StaticContentStore staticContentStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AdrFeeDetailStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new AdrFeeDetailDuxo(adrFeeStore, accountProvider, staticContentStore, duxoBundle, savedStateHandle, stateProvider);
        }
    }
}
