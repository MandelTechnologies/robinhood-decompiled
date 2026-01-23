package com.robinhood.android.common.history.p082ui;

import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HistoryRowDuxoStreamSummary.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0000\u001a^\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u001c\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00110\u0001H\u0000¨\u0006\u0013"}, m3636d2 = {"streamSummaryForEvent", "Lio/reactivex/Observable;", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "event", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "historyTransactionStore", "Ldagger/Lazy;", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "minervaTransactionFormatters", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "streamSummary", "Lcom/robinhood/utils/Optional;", "eventRelay", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.HistoryRowDuxoStreamSummaryKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryRowDuxoStreamSummary {
    public static final Observable<TransactionSummary> streamSummaryForEvent(final StatefulHistoryEvent<? extends HistoryEvent> event, AccountProvider accountProvider, final BackupWithholdingStore backupWithholdingStore, Lazy<HistoryTransactionStore> historyTransactionStore, final Lazy<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
        Observable<Optional<String>> observable = accountProvider.getIndividualAccountNumber().toObservable();
        Observable observableStartWith = ObservablesKt.toOptionals(historyTransactionStore.get().fromHistoryEvent(event.getHistoryEvent())).subscribeOn(Schedulers.m3346io()).startWith((Observable) Optional2.INSTANCE);
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observable);
        Intrinsics.checkNotNull(observableStartWith);
        Observable observableSwitchMap = observables.combineLatest(observable, observableStartWith).switchMap(new Function() { // from class: com.robinhood.android.common.history.ui.HistoryRowDuxoStreamSummaryKt$streamSummaryForEvent$withholdingAmountObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingAmount>> apply(Tuples2<? extends Optional<String>, ? extends Optional<? extends MinervaTransaction>> tuples2) {
                Tuples2<String, List<UUID>> backupWithholdingParams;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Optional<String> optionalComponent1 = tuples2.component1();
                Optional<? extends MinervaTransaction> optionalComponent2 = tuples2.component2();
                String orNull = optionalComponent1.getOrNull();
                if (orNull != null) {
                    BackupWithholdingStore backupWithholdingStore2 = backupWithholdingStore;
                    MinervaTransaction orNull2 = optionalComponent2.getOrNull();
                    Observable<Optional<WithholdingAmount>> observablePollWithholdingAmount = (orNull2 == null || (backupWithholdingParams = MinervaTransactions.getBackupWithholdingParams(orNull2, orNull)) == null) ? null : backupWithholdingStore2.pollWithholdingAmount(backupWithholdingParams);
                    if (observablePollWithholdingAmount != null) {
                        return observablePollWithholdingAmount;
                    }
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNull(observableSwitchMap);
        Observable observableCombineLatest = Observable.combineLatest(observableStartWith, observableSwitchMap, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.history.ui.HistoryRowDuxoStreamSummaryKt$streamSummaryForEvent$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) Tuples4.m3642to((MinervaTransaction) ((Optional) t1).component1(), (WithholdingAmount) ((Optional) t2).component1());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<TransactionSummary> observableDistinctUntilChanged = observableCombineLatest.subscribeOn(Schedulers.m3346io()).map(new Function() { // from class: com.robinhood.android.common.history.ui.HistoryRowDuxoStreamSummaryKt.streamSummaryForEvent.2
            @Override // io.reactivex.functions.Function
            public final TransactionSummary apply(Tuples2<? extends MinervaTransaction, WithholdingAmount> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                MinervaTransaction minervaTransactionComponent1 = tuples2.component1();
                WithholdingAmount withholdingAmountComponent2 = tuples2.component2();
                AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter = minervaTransactionFormatters.get();
                Intrinsics.checkNotNullExpressionValue(aggregatedHistoryTransactionFormatter, "get(...)");
                AggregatedHistoryTransactionFormatter aggregatedHistoryTransactionFormatter2 = aggregatedHistoryTransactionFormatter;
                if (minervaTransactionComponent1 != null) {
                    return aggregatedHistoryTransactionFormatter2.getSummary(minervaTransactionComponent1, withholdingAmountComponent2);
                }
                return aggregatedHistoryTransactionFormatter2.getPlaceholderSummary(event.getHistoryEvent());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public static final Observable<Optional<TransactionSummary>> streamSummary(final AccountProvider accountProvider, final BackupWithholdingStore backupWithholdingStore, final Lazy<HistoryTransactionStore> historyTransactionStore, final Lazy<AggregatedHistoryTransactionFormatter> minervaTransactionFormatters, Observable<Optional<StatefulHistoryEvent<HistoryEvent>>> eventRelay) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(minervaTransactionFormatters, "minervaTransactionFormatters");
        Intrinsics.checkNotNullParameter(eventRelay, "eventRelay");
        Observable observableSwitchMap = eventRelay.distinctUntilChanged().replay(1).refCount().switchMap(new Function() { // from class: com.robinhood.android.common.history.ui.HistoryRowDuxoStreamSummaryKt.streamSummary.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<TransactionSummary>> apply(Optional<? extends StatefulHistoryEvent<? extends HistoryEvent>> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                StatefulHistoryEvent<? extends HistoryEvent> statefulHistoryEventComponent1 = optional.component1();
                if (statefulHistoryEventComponent1 != null) {
                    return HistoryRowDuxoStreamSummary.streamSummaryForEvent(statefulHistoryEventComponent1, accountProvider, backupWithholdingStore, historyTransactionStore, minervaTransactionFormatters).map(new Function() { // from class: com.robinhood.android.common.history.ui.HistoryRowDuxoStreamSummaryKt.streamSummary.1.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<TransactionSummary> apply(TransactionSummary it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Optional3.asOptional(it);
                        }
                    });
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
