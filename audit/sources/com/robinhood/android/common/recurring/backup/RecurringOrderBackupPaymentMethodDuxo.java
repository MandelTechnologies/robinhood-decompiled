package com.robinhood.android.common.recurring.backup;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringOrderBackupPaymentMethodDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0014J\u0006\u0010 \u001a\u00020\u0014J\u0006\u0010!\u001a\u00020\u0014J\u0012\u0010\"\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00180\u00180\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "continueButtonRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "applyToOthersRelay", "selectedRelationshipIdRelay", "Ljava/util/UUID;", "removeBackupRelay", "onStart", "onResume", "setSelectedRelationship", "relationship", "Lcom/robinhood/models/db/AchRelationship;", "removeBackupRelationship", "updateInvestmentSchedule", "applyBackupToOtherSchedules", "setSelectedRelationshipById", "relationshipId", "logRelationshipSelected", "context", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderBackupPaymentMethodDuxo extends OldBaseDuxo<RecurringOrderBackupPaymentMethodViewState> implements HasSavedState {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
    private final PublishRelay<Unit> applyToOthersRelay;
    private final PublishRelay<Unit> continueButtonRelay;
    private final EventLogger eventLogger;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final PublishRelay<Unit> removeBackupRelay;
    private final SavedStateHandle savedStateHandle;
    private final PublishRelay<UUID> selectedRelationshipIdRelay;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringOrderBackupPaymentMethodDuxo(AchRelationshipStore achRelationshipStore, TraderInvestmentScheduleStore investmentScheduleStore, AccountProvider accountProvider, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        super(new RecurringOrderBackupPaymentMethodViewState(null, null, null, null, null, null, null, null, null, null, 1023, null), null, 2, null);
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.achRelationshipStore = achRelationshipStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<Unit> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.continueButtonRelay = publishRelayCreate;
        PublishRelay<Unit> publishRelayCreate2 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate2, "create(...)");
        this.applyToOthersRelay = publishRelayCreate2;
        PublishRelay<UUID> publishRelayCreate3 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate3, "create(...)");
        this.selectedRelationshipIdRelay = publishRelayCreate3;
        PublishRelay<Unit> publishRelayCreate4 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate4, "create(...)");
        this.removeBackupRelay = publishRelayCreate4;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        final InvestmentSchedule investmentSchedule = (InvestmentSchedule) getSavedStateHandle().get("schedule");
        final String str = (String) getSavedStateHandle().get(RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE);
        Observable observableDistinctUntilChanged = Observables.INSTANCE.combineLatest(this.selectedRelationshipIdRelay, getStates()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onStart$lambda$2(this.f$0, (Tuples2) obj);
            }
        });
        setSelectedRelationshipById(investmentSchedule != null ? investmentSchedule.getAchRelationshipId() : null);
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onStart$lambda$3(investmentSchedule, str, (RecurringOrderBackupPaymentMethodViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(RecurringOrderBackupPaymentMethodDuxo recurringOrderBackupPaymentMethodDuxo, Tuples2 tuples2) {
        UUID uuid = (UUID) tuples2.component1();
        RecurringOrderBackupPaymentMethodViewState recurringOrderBackupPaymentMethodViewState = (RecurringOrderBackupPaymentMethodViewState) tuples2.component2();
        List<AchRelationship> achRelationships = recurringOrderBackupPaymentMethodViewState.getAchRelationships();
        ArrayList arrayList = new ArrayList();
        for (Object obj : achRelationships) {
            if (Intrinsics.areEqual(((AchRelationship) obj).getId(), uuid)) {
                arrayList.add(obj);
            }
        }
        final AchRelationship achRelationship = (AchRelationship) CollectionsKt.firstOrNull((List) arrayList);
        recurringOrderBackupPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return RecurringOrderBackupPaymentMethodDuxo.onStart$lambda$2$lambda$1(achRelationship, (RecurringOrderBackupPaymentMethodViewState) obj2);
            }
        });
        recurringOrderBackupPaymentMethodDuxo.logRelationshipSelected(recurringOrderBackupPaymentMethodViewState.getLoggingContext());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderBackupPaymentMethodViewState onStart$lambda$2$lambda$1(AchRelationship achRelationship, RecurringOrderBackupPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, null, null, achRelationship, null, null, null, null, null, null, null, 1019, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderBackupPaymentMethodViewState onStart$lambda$3(InvestmentSchedule investmentSchedule, String str, RecurringOrderBackupPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (str == null) {
            str = "";
        }
        return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, investmentSchedule, null, null, null, null, null, null, null, null, str, HttpStatusCode.BAD_GATEWAY_502, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.achRelationshipStore.refresh(false);
        this.investmentScheduleStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getLinkedRelationshipsByState(SetsKt.setOf((Object[]) new ApiAchRelationship.State[]{ApiAchRelationship.State.NEW, ApiAchRelationship.State.APPROVED})), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$5(this.f$0, (List) obj);
            }
        });
        Observable observableSwitchMapSingle = this.continueButtonRelay.switchMap(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RecurringOrderBackupPaymentMethodViewState> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RecurringOrderBackupPaymentMethodDuxo.this.getStates();
            }
        }).distinctUntilChanged((Function<? super R, K>) new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final AchRelationship apply(RecurringOrderBackupPaymentMethodViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getSelectedRelationship();
            }
        }).switchMapSingle(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends RecurringOrderBackupPaymentMethodViewState> apply(final RecurringOrderBackupPaymentMethodViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                InvestmentSchedule investmentSchedule = state.getInvestmentSchedule();
                UUID id = investmentSchedule != null ? investmentSchedule.getId() : null;
                if (id != null) {
                    TraderInvestmentScheduleStore traderInvestmentScheduleStore = RecurringOrderBackupPaymentMethodDuxo.this.investmentScheduleStore;
                    ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER;
                    AchRelationship selectedRelationship = state.getSelectedRelationship();
                    return TraderInvestmentScheduleStore.updateInvestmentSchedule$default(traderInvestmentScheduleStore, id, null, null, sourceOfFunds, null, null, null, null, selectedRelationship != null ? selectedRelationship.getId() : null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null).map(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.4.1
                        @Override // io.reactivex.functions.Function
                        public final RecurringOrderBackupPaymentMethodViewState apply(InvestmentSchedule it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return state;
                        }
                    });
                }
                return Single.just(state);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$8(this.f$0, (RecurringOrderBackupPaymentMethodViewState) obj);
            }
        });
        Observable<R> observableSwitchMap = this.accountProvider.streamIndividualAccount().switchMap(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<InvestmentSchedule>> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                return RecurringOrderBackupPaymentMethodDuxo.this.investmentScheduleStore.getStreamBuyingPowerInvestmentSchedulesWithoutBackup().asObservable(account.getAccountNumber());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$10(this.f$0, (List) obj);
            }
        });
        Completable completableSwitchMapCompletable = this.applyToOthersRelay.flatMap(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.8
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RecurringOrderBackupPaymentMethodViewState> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RecurringOrderBackupPaymentMethodDuxo.this.getStates();
            }
        }).distinctUntilChanged().switchMapCompletable(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.9
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(RecurringOrderBackupPaymentMethodViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                AchRelationship selectedRelationship = state.getSelectedRelationship();
                UUID id = selectedRelationship != null ? selectedRelationship.getId() : null;
                Intrinsics.checkNotNull(id);
                TraderInvestmentScheduleStore traderInvestmentScheduleStore = RecurringOrderBackupPaymentMethodDuxo.this.investmentScheduleStore;
                List<InvestmentSchedule> buyingPowerSchedulesWithoutBackup = state.getBuyingPowerSchedulesWithoutBackup();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buyingPowerSchedulesWithoutBackup, 10));
                Iterator<T> it = buyingPowerSchedulesWithoutBackup.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InvestmentSchedule) it.next()).getId());
                }
                return traderInvestmentScheduleStore.bulkUpdateInvestmentSchedule(arrayList, true, id).doOnComplete(new AnonymousClass2(RecurringOrderBackupPaymentMethodDuxo.this)).doOnError(new AnonymousClass3(RecurringOrderBackupPaymentMethodDuxo.this));
            }

            /* compiled from: RecurringOrderBackupPaymentMethodDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$onResume$9$2, reason: invalid class name */
            static final class AnonymousClass2 implements Action {
                final /* synthetic */ RecurringOrderBackupPaymentMethodDuxo this$0;

                AnonymousClass2(RecurringOrderBackupPaymentMethodDuxo recurringOrderBackupPaymentMethodDuxo) {
                    this.this$0 = recurringOrderBackupPaymentMethodDuxo;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$onResume$9$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RecurringOrderBackupPaymentMethodDuxo.C116619.AnonymousClass2.run$lambda$0((RecurringOrderBackupPaymentMethodViewState) obj);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RecurringOrderBackupPaymentMethodViewState run$lambda$0(RecurringOrderBackupPaymentMethodViewState applyMutation) {
                    Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                    return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, RecurringOrderBackupPaymentMethodViewState.PromptState.Seen.INSTANCE, null, 759, null);
                }
            }

            /* compiled from: RecurringOrderBackupPaymentMethodDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$onResume$9$3, reason: invalid class name */
            static final class AnonymousClass3<T> implements Consumer {
                final /* synthetic */ RecurringOrderBackupPaymentMethodDuxo this$0;

                AnonymousClass3(RecurringOrderBackupPaymentMethodDuxo recurringOrderBackupPaymentMethodDuxo) {
                    this.this$0 = recurringOrderBackupPaymentMethodDuxo;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(final Throwable th) {
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$onResume$9$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RecurringOrderBackupPaymentMethodDuxo.C116619.AnonymousClass3.accept$lambda$0(th, (RecurringOrderBackupPaymentMethodViewState) obj);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RecurringOrderBackupPaymentMethodViewState accept$lambda$0(Throwable th, RecurringOrderBackupPaymentMethodViewState applyMutation) {
                    Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                    return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), null, null, null, RecurringOrderBackupPaymentMethodViewState.PromptState.Seen.INSTANCE, null, 751, null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        Observable observableSwitchMapSingle2 = this.removeBackupRelay.flatMap(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.10
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RecurringOrderBackupPaymentMethodViewState> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RecurringOrderBackupPaymentMethodDuxo.this.getStates();
            }
        }).distinctUntilChanged().switchMapSingle(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo.onResume.11
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends InvestmentSchedule> apply(RecurringOrderBackupPaymentMethodViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                InvestmentSchedule investmentSchedule = state.getInvestmentSchedule();
                UUID id = investmentSchedule != null ? investmentSchedule.getId() : null;
                if (id != null) {
                    return TraderInvestmentScheduleStore.updateInvestmentScheduleBackup$default(RecurringOrderBackupPaymentMethodDuxo.this.investmentScheduleStore, id, ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER, null, null, 4, null);
                }
                Single singleJust = Single.just(state.getInvestmentSchedule());
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle2, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$12(this.f$0, (InvestmentSchedule) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(RecurringOrderBackupPaymentMethodDuxo recurringOrderBackupPaymentMethodDuxo, final List achRelationships) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        recurringOrderBackupPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$5$lambda$4(achRelationships, (RecurringOrderBackupPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderBackupPaymentMethodViewState onResume$lambda$5$lambda$4(List list, RecurringOrderBackupPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, null, list, null, null, null, null, null, null, null, null, 1021, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(RecurringOrderBackupPaymentMethodDuxo recurringOrderBackupPaymentMethodDuxo, RecurringOrderBackupPaymentMethodViewState recurringOrderBackupPaymentMethodViewState) {
        if (recurringOrderBackupPaymentMethodViewState.getShowPrompt()) {
            recurringOrderBackupPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$8$lambda$6((RecurringOrderBackupPaymentMethodViewState) obj);
                }
            });
        } else if (!Intrinsics.areEqual(recurringOrderBackupPaymentMethodViewState.getPromptState(), RecurringOrderBackupPaymentMethodViewState.PromptState.Pending.INSTANCE)) {
            recurringOrderBackupPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$8$lambda$7((RecurringOrderBackupPaymentMethodViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderBackupPaymentMethodViewState onResume$lambda$8$lambda$6(RecurringOrderBackupPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, RecurringOrderBackupPaymentMethodViewState.PromptState.Pending.INSTANCE, null, 735, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderBackupPaymentMethodViewState onResume$lambda$8$lambda$7(RecurringOrderBackupPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, 1015, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(RecurringOrderBackupPaymentMethodDuxo recurringOrderBackupPaymentMethodDuxo, final List list) {
        recurringOrderBackupPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$10$lambda$9(list, (RecurringOrderBackupPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderBackupPaymentMethodViewState onResume$lambda$10$lambda$9(List list, RecurringOrderBackupPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, null, null, null, null, null, null, null, list, null, null, 895, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(RecurringOrderBackupPaymentMethodDuxo recurringOrderBackupPaymentMethodDuxo, InvestmentSchedule investmentSchedule) {
        recurringOrderBackupPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodDuxo.onResume$lambda$12$lambda$11((RecurringOrderBackupPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderBackupPaymentMethodViewState onResume$lambda$12$lambda$11(RecurringOrderBackupPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderBackupPaymentMethodViewState.copy$default(applyMutation, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, 959, null);
    }

    public final void setSelectedRelationship(AchRelationship relationship) {
        UUID id;
        if (relationship == null || (id = relationship.getId()) == null) {
            return;
        }
        this.selectedRelationshipIdRelay.accept(id);
    }

    public final void removeBackupRelationship() {
        this.removeBackupRelay.accept(Unit.INSTANCE);
    }

    public final void updateInvestmentSchedule() {
        this.continueButtonRelay.accept(Unit.INSTANCE);
    }

    public final void applyBackupToOtherSchedules() {
        this.applyToOthersRelay.accept(Unit.INSTANCE);
    }

    private final void setSelectedRelationshipById(UUID relationshipId) {
        if (relationshipId != null) {
            this.selectedRelationshipIdRelay.accept(relationshipId);
        }
    }

    private final void logRelationshipSelected(RecurringContext context) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.SELECT_PAYMENT_METHOD, new Screen(Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD, null, null, null, 14, null), new Component(Component.ComponentType.RECURRING_PAYMENT_METHOD_ROW, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }
}
