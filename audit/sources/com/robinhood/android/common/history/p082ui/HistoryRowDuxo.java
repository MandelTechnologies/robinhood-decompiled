package com.robinhood.android.common.history.p082ui;

import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015J\b\u0010\u0019\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u00150\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/common/history/ui/HistoryRowDataState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "historyTransactionStore", "Ldagger/Lazy;", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "minervaTransactionFormatters", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/base/BackupWithholdingStore;Ldagger/Lazy;Ldagger/Lazy;Landroid/view/View;)V", "targetRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "setTarget", "", "event", "onResume", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class HistoryRowDuxo extends ViewDuxo<HistoryRowDataState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final BackupWithholdingStore backupWithholdingStore;
    private final Lazy<HistoryTransactionStore> historyTransactionStore;
    private final Lazy<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters;
    private final BehaviorRelay<Optional<StatefulHistoryEvent<HistoryEvent>>> targetRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryRowDuxo(AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, Lazy<HistoryTransactionStore> historyTransactionStore, Lazy<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters, View hostView) {
        super(hostView, new HistoryRowDataState(null, null, 3, null), null, 4, null);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.historyTransactionStore = historyTransactionStore;
        this.minervaTransactionFormatters = minervaTransactionFormatters;
        BehaviorRelay<Optional<StatefulHistoryEvent<HistoryEvent>>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.targetRelay = behaviorRelayCreateDefault;
    }

    public final void setTarget(final StatefulHistoryEvent<? extends HistoryEvent> event) {
        this.targetRelay.accept(Optional3.asOptional(event));
        applyMutation(new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryRowDuxo.setTarget$lambda$0(event, (HistoryRowDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryRowDataState setTarget$lambda$0(StatefulHistoryEvent statefulHistoryEvent, HistoryRowDataState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return HistoryRowDataState.copy$default(applyMutation, null, statefulHistoryEvent, 1, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, HistoryRowDuxoStreamSummary.streamSummary(this.accountProvider, this.backupWithholdingStore, this.historyTransactionStore, this.minervaTransactionFormatters, this.targetRelay), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryRowDuxo.onResume$lambda$2(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(HistoryRowDuxo historyRowDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final TransactionSummary transactionSummary = (TransactionSummary) optional.component1();
        historyRowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryRowDuxo.onResume$lambda$2$lambda$1(transactionSummary, (HistoryRowDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryRowDataState onResume$lambda$2$lambda$1(TransactionSummary transactionSummary, HistoryRowDataState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return HistoryRowDataState.copy$default(applyMutation, transactionSummary, null, 2, null);
    }
}
