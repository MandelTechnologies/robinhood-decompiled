package com.robinhood.android.advisory.history.fee;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.store.advisory.AdvisoryFeeStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFeeDetailsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDuxo;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryFeeStore", "Lcom/robinhood/store/advisory/AdvisoryFeeStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AdvisoryFeeDetailsDuxo_Factory implements Factory<AdvisoryFeeDetailsDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AdvisoryFeeStore> advisoryFeeStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AdvisoryFeeDetailsDuxo_Factory create(Provider<SavedStateHandle> provider, Provider<AccountProvider> provider2, Provider<AdvisoryFeeStore> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AdvisoryFeeDetailsDuxo newInstance(SavedStateHandle savedStateHandle, AccountProvider accountProvider, AdvisoryFeeStore advisoryFeeStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(savedStateHandle, accountProvider, advisoryFeeStore, duxoBundle);
    }

    public AdvisoryFeeDetailsDuxo_Factory(Provider<SavedStateHandle> savedStateHandle, Provider<AccountProvider> accountProvider, Provider<AdvisoryFeeStore> advisoryFeeStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisoryFeeStore, "advisoryFeeStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.accountProvider = accountProvider;
        this.advisoryFeeStore = advisoryFeeStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AdvisoryFeeDetailsDuxo get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AdvisoryFeeStore advisoryFeeStore = this.advisoryFeeStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryFeeStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(savedStateHandle, accountProvider, advisoryFeeStore, duxoBundle);
    }

    /* compiled from: AdvisoryFeeDetailsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDuxo_Factory;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryFeeStore", "Lcom/robinhood/store/advisory/AdvisoryFeeStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDuxo;", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryFeeDetailsDuxo_Factory create(Provider<SavedStateHandle> savedStateHandle, Provider<AccountProvider> accountProvider, Provider<AdvisoryFeeStore> advisoryFeeStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(advisoryFeeStore, "advisoryFeeStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AdvisoryFeeDetailsDuxo_Factory(savedStateHandle, accountProvider, advisoryFeeStore, duxoBundle);
        }

        @JvmStatic
        public final AdvisoryFeeDetailsDuxo newInstance(SavedStateHandle savedStateHandle, AccountProvider accountProvider, AdvisoryFeeStore advisoryFeeStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(advisoryFeeStore, "advisoryFeeStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AdvisoryFeeDetailsDuxo(savedStateHandle, accountProvider, advisoryFeeStore, duxoBundle);
        }
    }
}
