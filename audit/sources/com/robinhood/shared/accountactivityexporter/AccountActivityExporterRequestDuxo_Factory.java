package com.robinhood.shared.accountactivityexporter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.store.accountactivityexporter.AccountActivityExporterStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AccountActivityExporterRequestDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "accountActivityExporterStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AccountActivityExporterRequestDuxo_Factory implements Factory<AccountActivityExporterRequestDuxo> {
    private final Provider<AccountActivityExporterStore> accountActivityExporterStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<AccountActivityExporterRequestDuxo4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountActivityExporterRequestDuxo_Factory create(Provider<AccountProvider> provider, Provider<AccountActivityExporterStore> provider2, Provider<Clock> provider3, Provider<AccountActivityExporterRequestDuxo4> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final AccountActivityExporterRequestDuxo newInstance(AccountProvider accountProvider, AccountActivityExporterStore accountActivityExporterStore, Clock clock, AccountActivityExporterRequestDuxo4 accountActivityExporterRequestDuxo4, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, accountActivityExporterStore, clock, accountActivityExporterRequestDuxo4, duxoBundle);
    }

    public AccountActivityExporterRequestDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AccountActivityExporterStore> accountActivityExporterStore, Provider<Clock> clock, Provider<AccountActivityExporterRequestDuxo4> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountActivityExporterStore, "accountActivityExporterStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.accountActivityExporterStore = accountActivityExporterStore;
        this.clock = clock;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AccountActivityExporterRequestDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountActivityExporterStore accountActivityExporterStore = this.accountActivityExporterStore.get();
        Intrinsics.checkNotNullExpressionValue(accountActivityExporterStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        AccountActivityExporterRequestDuxo4 accountActivityExporterRequestDuxo4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountActivityExporterRequestDuxo4, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, accountActivityExporterStore, clock, accountActivityExporterRequestDuxo4, duxoBundle);
    }

    /* compiled from: AccountActivityExporterRequestDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "accountActivityExporterStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo_Factory;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo;", "newInstance", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;Lj$/time/Clock;Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo;", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountActivityExporterRequestDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AccountActivityExporterStore> accountActivityExporterStore, Provider<Clock> clock, Provider<AccountActivityExporterRequestDuxo4> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountActivityExporterStore, "accountActivityExporterStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountActivityExporterRequestDuxo_Factory(accountProvider, accountActivityExporterStore, clock, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final AccountActivityExporterRequestDuxo newInstance(AccountProvider accountProvider, AccountActivityExporterStore accountActivityExporterStore, Clock clock, AccountActivityExporterRequestDuxo4 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountActivityExporterStore, "accountActivityExporterStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountActivityExporterRequestDuxo(accountProvider, accountActivityExporterStore, clock, stateProvider, duxoBundle);
        }
    }
}
