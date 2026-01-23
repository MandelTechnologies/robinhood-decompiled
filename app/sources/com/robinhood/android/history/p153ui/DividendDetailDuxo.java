package com.robinhood.android.history.p153ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.history.p153ui.DividendDetailFragment;
import com.robinhood.android.history.p153ui.DividendDetailViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.DividendStore;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p355ui.UiDividend;
import com.robinhood.models.p355ui.UiInstrumentDripSettings;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.datetime.ZoneIds;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function6;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZonedDateTime;

/* compiled from: DividendDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fBA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u001b0\u001b0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/history/ui/DividendDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/history/ui/DividendDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "dividendStore", "Lcom/robinhood/librobinhood/data/store/DividendStore;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "dripSettingsStore", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/librobinhood/data/store/DividendStore;Lcom/robinhood/librobinhood/data/store/DocumentStore;Lcom/robinhood/librobinhood/data/store/DripSettingsStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "uiDividendStream", "Lio/reactivex/Observable;", "Lcom/robinhood/models/ui/UiDividend;", "kotlin.jvm.PlatformType", "accountNumberStream", "", "onCreate", "", "onStart", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DividendDetailDuxo extends OldBaseDuxo<DividendDetailViewState> implements HasSavedState {
    private final Observable<String> accountNumberStream;
    private final AccountProvider accountProvider;
    private final BackupWithholdingStore backupWithholdingStore;
    private final DividendStore dividendStore;
    private final DocumentStore documentStore;
    private final DripSettingsStore dripSettingsStore;
    private final OrderStore orderStore;
    private final SavedStateHandle savedStateHandle;
    private final Observable<UiDividend> uiDividendStream;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public DividendDetailDuxo(AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, DividendStore dividendStore, DocumentStore documentStore, DripSettingsStore dripSettingsStore, OrderStore orderStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(dividendStore, "dividendStore");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(dripSettingsStore, "dripSettingsStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        super(new DividendDetailViewState(null, objArr, 3, 0 == true ? 1 : 0), objArr2, 2, 0 == true ? 1 : 0);
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.dividendStore = dividendStore;
        this.documentStore = documentStore;
        this.dripSettingsStore = dripSettingsStore;
        this.orderStore = orderStore;
        this.savedStateHandle = savedStateHandle;
        Observable<UiDividend> observableRefCount = dividendStore.getDividend(((DividendDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDividendId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.uiDividendStream = observableRefCount;
        Observable<String> observableRefCount2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$accountNumberStream$1
            @Override // io.reactivex.functions.Function
            public final String apply(UiDividend it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getDividend().getAccountNumber();
            }
        }).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount2, "refCount(...)");
        this.accountNumberStream = observableRefCount2;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.orderStore.refresh(false);
        this.dividendStore.refresh(true);
        Observables observables = Observables.INSTANCE;
        ObservableSource observableSourceSwitchMap = this.accountNumberStream.switchMap(new Function() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return DividendDetailDuxo.this.dripSettingsStore.shouldShowDripHistoryUpsell(accountNumber).toObservable();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMap, "switchMap(...)");
        Observable observableDistinctUntilChanged = observables.combineLatest(observableSourceSwitchMap, this.accountNumberStream).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DividendDetailDuxo.onCreate$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DividendDetailDuxo dividendDetailDuxo, Tuples2 tuples2) {
        Boolean bool = (Boolean) tuples2.component1();
        final String str = (String) tuples2.component2();
        if (bool.booleanValue()) {
            dividendDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DividendDetailDuxo.onCreate$lambda$1$lambda$0(str, (DividendDetailViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DividendDetailViewState onCreate$lambda$1$lambda$0(String str, DividendDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DividendDetailViewState.copy$default(applyMutation, null, new UiEvent(str), 1, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.orderStore.refresh(false);
        this.dividendStore.refresh(true);
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        ObservableSource observableSourceSwitchMap = this.accountNumberStream.switchMap(new Function() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$onStart$accountStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return this.this$0.accountProvider.streamAccount(accountNumber);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.accountNumberStream, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DividendDetailDuxo.onStart$lambda$2(this.f$0, (String) obj);
            }
        });
        ObservableSource observableSourceSwitchMap2 = this.uiDividendStream.switchMap(new Function() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$onStart$documentStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Document>> apply(UiDividend dividend) {
                Instant updatedAt;
                ZonedDateTime zonedDateTimeAtZone;
                Intrinsics.checkNotNullParameter(dividend, "dividend");
                Order order = dividend.getOrder();
                LocalDate localDateMo3459a = (order == null || (updatedAt = order.getUpdatedAt()) == null || (zonedDateTimeAtZone = updatedAt.atZone(ZoneIds.INSTANCE.getNEW_YORK())) == null) ? null : zonedDateTimeAtZone.mo3459a();
                if (localDateMo3459a != null) {
                    return this.this$0.documentStore.getTradeConfirms(dividend.getDividend().getAccountNumber(), localDateMo3459a);
                }
                Observable observableJust = Observable.just(CollectionsKt.emptyList());
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Observable observableRefCount = this.accountNumberStream.switchMap(new Function() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$onStart$shouldShowDripStatusStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return this.this$0.dripSettingsStore.shouldShowDripStatusButton(accountNumber);
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableSwitchMap = Observables.INSTANCE.combineLatest(observableRefCount, this.accountNumberStream).switchMap(new Function() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$onStart$instrumentSettingsStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<UiInstrumentDripSettings>> apply(Tuples2<Boolean, String> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Boolean boolComponent1 = tuples2.component1();
                final String strComponent2 = tuples2.component2();
                if (boolComponent1.booleanValue()) {
                    Observable observable = this.this$0.uiDividendStream;
                    final DividendDetailDuxo dividendDetailDuxo = this.this$0;
                    return observable.switchMap(new Function() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$onStart$instrumentSettingsStream$1.1
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends Optional<UiInstrumentDripSettings>> apply(UiDividend uiDividend) {
                            Intrinsics.checkNotNullParameter(uiDividend, "uiDividend");
                            DripSettingsStore dripSettingsStore = dividendDetailDuxo.dripSettingsStore;
                            String str = strComponent2;
                            Intrinsics.checkNotNull(str);
                            return dripSettingsStore.streamInstrumentSettings(str, uiDividend.getDividend().getInstrument());
                        }
                    });
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        ObservableSource observableSourceSwitchMap3 = this.uiDividendStream.switchMap(new Function() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$onStart$backupWithholdingObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingAmount>> apply(UiDividend uiDividend) {
                Intrinsics.checkNotNullParameter(uiDividend, "uiDividend");
                return this.this$0.backupWithholdingStore.pollWithholdingAmount(new Tuples2<>(uiDividend.getDividend().getAccountNumber(), CollectionsKt.listOf(uiDividend.getDividend().getCashDividendId())));
            }
        });
        Observable<UiDividend> observable = this.uiDividendStream;
        Intrinsics.checkNotNull(observableSourceSwitchMap);
        Intrinsics.checkNotNull(observableSourceSwitchMap2);
        Intrinsics.checkNotNull(observableSwitchMap);
        Intrinsics.checkNotNull(observableSourceSwitchMap3);
        Observable observableCombineLatest = Observable.combineLatest(observable, observableSourceSwitchMap, observableSourceSwitchMap2, observableRefCount, observableSwitchMap, observableSourceSwitchMap3, new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$onStart$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                return (R) new DividendDetailViewState.RequiredPageState((UiDividend) t1, (Account) t2, (List) t3, ((Boolean) t4).booleanValue(), (UiInstrumentDripSettings) ((Optional) t5).component1(), (WithholdingAmount) ((Optional) t6).component1());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…1, t2, t3, t4, t5, t6) })");
        LifecycleHost.DefaultImpls.bind$default(this, observableCombineLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DividendDetailDuxo.onStart$lambda$5(this.f$0, (DividendDetailViewState.RequiredPageState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(DividendDetailDuxo dividendDetailDuxo, String str) {
        DripSettingsStore dripSettingsStore = dividendDetailDuxo.dripSettingsStore;
        Intrinsics.checkNotNull(str);
        DripSettingsStore.refreshForAccount$default(dripSettingsStore, false, str, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(DividendDetailDuxo dividendDetailDuxo, final DividendDetailViewState.RequiredPageState requiredPageState) {
        Intrinsics.checkNotNullParameter(requiredPageState, "requiredPageState");
        dividendDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.DividendDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DividendDetailDuxo.onStart$lambda$5$lambda$4(requiredPageState, (DividendDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DividendDetailViewState onStart$lambda$5$lambda$4(DividendDetailViewState.RequiredPageState requiredPageState, DividendDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DividendDetailViewState.copy$default(applyMutation, requiredPageState, null, 2, null);
    }

    /* compiled from: DividendDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/DividendDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/DividendDetailDuxo;", "Lcom/robinhood/android/history/ui/DividendDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DividendDetailDuxo, DividendDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DividendDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DividendDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DividendDetailFragment.Args getArgs(DividendDetailDuxo dividendDetailDuxo) {
            return (DividendDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, dividendDetailDuxo);
        }
    }
}
