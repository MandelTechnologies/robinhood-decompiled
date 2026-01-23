package com.robinhood.shared.accountactivityexporter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.accountactivityexporter.AccountActivityExporterStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountActivityExporterDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDuxo;", "accountActivityExporterStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "stateProvider", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AccountActivityExporterDuxo_Factory implements Factory<AccountActivityExporterDuxo> {
    private final Provider<AccountActivityExporterStore> accountActivityExporterStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<AccountActivityExporterDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountActivityExporterDuxo_Factory create(Provider<AccountActivityExporterStore> provider, Provider<AccountActivityExporterDuxo3> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AccountActivityExporterDuxo newInstance(AccountActivityExporterStore accountActivityExporterStore, AccountActivityExporterDuxo3 accountActivityExporterDuxo3, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountActivityExporterStore, accountActivityExporterDuxo3, duxoBundle);
    }

    public AccountActivityExporterDuxo_Factory(Provider<AccountActivityExporterStore> accountActivityExporterStore, Provider<AccountActivityExporterDuxo3> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountActivityExporterStore, "accountActivityExporterStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountActivityExporterStore = accountActivityExporterStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AccountActivityExporterDuxo get() {
        Companion companion = INSTANCE;
        AccountActivityExporterStore accountActivityExporterStore = this.accountActivityExporterStore.get();
        Intrinsics.checkNotNullExpressionValue(accountActivityExporterStore, "get(...)");
        AccountActivityExporterDuxo3 accountActivityExporterDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountActivityExporterDuxo3, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountActivityExporterStore, accountActivityExporterDuxo3, duxoBundle);
    }

    /* compiled from: AccountActivityExporterDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDuxo_Factory;", "accountActivityExporterStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "stateProvider", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDuxo;", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountActivityExporterDuxo_Factory create(Provider<AccountActivityExporterStore> accountActivityExporterStore, Provider<AccountActivityExporterDuxo3> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountActivityExporterStore, "accountActivityExporterStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountActivityExporterDuxo_Factory(accountActivityExporterStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final AccountActivityExporterDuxo newInstance(AccountActivityExporterStore accountActivityExporterStore, AccountActivityExporterDuxo3 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountActivityExporterStore, "accountActivityExporterStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountActivityExporterDuxo(accountActivityExporterStore, stateProvider, duxoBundle);
        }
    }
}
