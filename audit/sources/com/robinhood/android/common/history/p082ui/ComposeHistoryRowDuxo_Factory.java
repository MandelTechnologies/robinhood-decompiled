package com.robinhood.android.common.history.p082ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.store.base.BackupWithholdingStore;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeHistoryRowDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016Bs\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\u0004\u0012\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u000e0\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo;", "historyNavigator", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "Lkotlin/jvm/JvmSuppressWildcards;", "minervaTransactionFormatters", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ComposeHistoryRowDuxo_Factory implements Factory<ComposeHistoryRowDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<HistoryNavigator> historyNavigator;
    private final Provider<HistoryTransactionStore> historyTransactionStore;
    private final Provider<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ComposeHistoryRowDuxo_Factory create(Provider<HistoryNavigator> provider, Provider<AccountProvider> provider2, Provider<AnalyticsLogger> provider3, Provider<BackupWithholdingStore> provider4, Provider<HistoryTransactionStore> provider5, Provider<AggregatedHistoryTransactionFormatter> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final ComposeHistoryRowDuxo newInstance(HistoryNavigator historyNavigator, AccountProvider accountProvider, AnalyticsLogger analyticsLogger, BackupWithholdingStore backupWithholdingStore, Lazy<HistoryTransactionStore> lazy, Lazy<AggregatedHistoryTransactionFormatter> lazy2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(historyNavigator, accountProvider, analyticsLogger, backupWithholdingStore, lazy, lazy2, duxoBundle);
    }

    public ComposeHistoryRowDuxo_Factory(Provider<HistoryNavigator> historyNavigator, Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<HistoryTransactionStore> historyTransactionStore, Provider<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.historyNavigator = historyNavigator;
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.backupWithholdingStore = backupWithholdingStore;
        this.historyTransactionStore = historyTransactionStore;
        this.minervaTransactionFormatters = minervaTransactionFormatters;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public ComposeHistoryRowDuxo get() {
        Companion companion = INSTANCE;
        HistoryNavigator historyNavigator = this.historyNavigator.get();
        Intrinsics.checkNotNullExpressionValue(historyNavigator, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        Lazy<HistoryTransactionStore> lazy = DoubleCheck.lazy(this.historyTransactionStore);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<AggregatedHistoryTransactionFormatter> lazy2 = DoubleCheck.lazy(this.minervaTransactionFormatters);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(historyNavigator, accountProvider, analyticsLogger, backupWithholdingStore, lazy, lazy2, duxoBundle);
    }

    /* compiled from: ComposeHistoryRowDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jt\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u00072\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00110\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0007JV\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u00182\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00110\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo_Factory;", "historyNavigator", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "Lkotlin/jvm/JvmSuppressWildcards;", "minervaTransactionFormatters", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo;", "Ldagger/Lazy;", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ComposeHistoryRowDuxo_Factory create(Provider<HistoryNavigator> historyNavigator, Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<HistoryTransactionStore> historyTransactionStore, Provider<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
            Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new ComposeHistoryRowDuxo_Factory(historyNavigator, accountProvider, analytics, backupWithholdingStore, historyTransactionStore, minervaTransactionFormatters, duxoBundle);
        }

        @JvmStatic
        public final ComposeHistoryRowDuxo newInstance(HistoryNavigator historyNavigator, AccountProvider accountProvider, AnalyticsLogger analytics, BackupWithholdingStore backupWithholdingStore, Lazy<HistoryTransactionStore> historyTransactionStore, Lazy<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
            Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new ComposeHistoryRowDuxo(historyNavigator, accountProvider, analytics, backupWithholdingStore, historyTransactionStore, minervaTransactionFormatters, duxoBundle);
        }
    }
}
