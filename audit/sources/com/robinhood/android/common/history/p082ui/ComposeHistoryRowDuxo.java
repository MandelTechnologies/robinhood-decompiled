package com.robinhood.android.common.history.p082ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.logging.CrashReporter;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeHistoryRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BM\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u001c0\u001bj\u0002`\u001dH\u0000¢\u0006\u0002\b\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u001c0\u001bj\u0002`\u001dJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/ComposeHistoryRowDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/history/ui/HistoryRowDataState;", "Lcom/robinhood/android/common/history/ui/HistoryRowViewState;", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "historyTransactionStore", "Ldagger/Lazy;", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "minervaTransactionFormatters", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/store/base/BackupWithholdingStore;Ldagger/Lazy;Ldagger/Lazy;Lcom/robinhood/android/udf/DuxoBundle;)V", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "streamSummary", "Lio/reactivex/Observable;", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "event", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "streamSummary$lib_history_row_externalDebug", "setTarget", "Lio/reactivex/disposables/Disposable;", "logTap", "", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposeHistoryRowDuxo extends BaseDuxo<HistoryRowDataState, HistoryRowViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AnalyticsLogger analytics;
    private final BackupWithholdingStore backupWithholdingStore;
    private final HistoryNavigator historyNavigator;
    private final Lazy<HistoryTransactionStore> historyTransactionStore;
    private final Lazy<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters;

    public final HistoryNavigator getHistoryNavigator() {
        return this.historyNavigator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeHistoryRowDuxo(HistoryNavigator historyNavigator, AccountProvider accountProvider, AnalyticsLogger analytics, BackupWithholdingStore backupWithholdingStore, Lazy<HistoryTransactionStore> historyTransactionStore, Lazy<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters, DuxoBundle duxoBundle) {
        super(new HistoryRowDataState(null, null, 3, null), HistoryRowDataState2.getHistoryRowStateProvider(), duxoBundle);
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
    }

    public final Observable<TransactionSummary> streamSummary$lib_history_row_externalDebug(StatefulHistoryEvent<? extends HistoryEvent> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return HistoryRowDuxoStreamSummary.streamSummaryForEvent(event, this.accountProvider, this.backupWithholdingStore, this.historyTransactionStore, this.minervaTransactionFormatters);
    }

    public final Disposable setTarget(StatefulHistoryEvent<? extends HistoryEvent> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ScopedObservable.subscribeKotlin$default(bind(streamSummary$lib_history_row_externalDebug(event), DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()), new Function1() { // from class: com.robinhood.android.common.history.ui.ComposeHistoryRowDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposeHistoryRowDuxo.setTarget$lambda$0(this.f$0, (TransactionSummary) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.history.ui.ComposeHistoryRowDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposeHistoryRowDuxo.setTarget$lambda$1((Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTarget$lambda$0(ComposeHistoryRowDuxo composeHistoryRowDuxo, TransactionSummary summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        composeHistoryRowDuxo.applyMutation(new ComposeHistoryRowDuxo2(summary, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTarget$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        return Unit.INSTANCE;
    }

    public final void logTap(TransactionReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        AnalyticsLogger analyticsLogger = this.analytics;
        String strName = reference.getSourceType().name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_TITLE_HISTORY, lowerCase, reference.getSourceId().toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
    }
}
