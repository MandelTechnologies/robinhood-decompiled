package com.robinhood.android.settings.p254ui.recurring.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import com.robinhood.android.settings.p254ui.recurring.detail.InvestmentScheduleSettingsDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.ScheduleAlertStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.ScheduleAlert;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p355ui.recurring.UiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001?BY\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020 ¢\u0006\u0004\b+\u0010\"J\r\u0010,\u001a\u00020 ¢\u0006\u0004\b,\u0010\"J\r\u0010-\u001a\u00020 ¢\u0006\u0004\b-\u0010\"J\r\u0010.\u001a\u00020 ¢\u0006\u0004\b.\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00105R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "investmentScheduleEventStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/ScheduleAlertStore;", "scheduleAlertStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/store/base/InvestmentScheduleEventStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/data/store/ScheduleAlertStore;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$State;", "state", "Lio/reactivex/Single;", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "setInvestmentScheduleState", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$State;)Lio/reactivex/Single;", "", "onStart", "()V", "", "selected", "toggleInvestmentSchedule", "(Z)V", "j$/time/LocalDate", RecurringDatePickerActivity.ARG_SELECTED_DATE, "setNextDate", "(Lj$/time/LocalDate;)V", "logNextOrderDateRowTap", "logNextOrderDateChanged", "logNextOrderDatePickerDismiss", "logPauseButtonTap", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "Lcom/robinhood/librobinhood/data/store/ScheduleAlertStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Ljava/util/UUID;", "getInvestmentScheduleId", "()Ljava/util/UUID;", "investmentScheduleId", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestmentScheduleSettingsDuxo extends OldBaseDuxo<InvestmentScheduleSettingsState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final EventLogger eventLogger;
    private final InvestmentScheduleEventStore investmentScheduleEventStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;
    private final ScheduleAlertStore scheduleAlertStore;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestmentScheduleSettingsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.State.values().length];
            try {
                iArr[ApiInvestmentSchedule.State.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.State.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.State.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentScheduleSettingsDuxo(AchRelationshipStore achRelationshipStore, CryptoQuoteStore cryptoQuoteStore, DirectDepositRelationshipStore directDepositRelationshipStore, EventLogger eventLogger, TraderInvestmentScheduleStore investmentScheduleStore, InvestmentScheduleEventStore investmentScheduleEventStore, QuoteStore quoteStore, UnifiedAccountStore unifiedAccountStore, ScheduleAlertStore scheduleAlertStore, SavedStateHandle savedStateHandle) {
        super(new InvestmentScheduleSettingsState(((InvestmentScheduleSettingsArgs) INSTANCE.getArgs(savedStateHandle)).getFromInsights(), null, null, null, null, null, null, null, false, null, null, null, 4094, null), null, 2, null);
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(scheduleAlertStore, "scheduleAlertStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.achRelationshipStore = achRelationshipStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.eventLogger = eventLogger;
        this.investmentScheduleStore = investmentScheduleStore;
        this.investmentScheduleEventStore = investmentScheduleEventStore;
        this.quoteStore = quoteStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.scheduleAlertStore = scheduleAlertStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getInvestmentScheduleId() {
        return ((InvestmentScheduleSettingsArgs) INSTANCE.getArgs((HasSavedState) this)).getInvestmentScheduleId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.investmentScheduleStore.refresh(false, getInvestmentScheduleId());
        Observable<UiInvestmentSchedule> observableRefCount = this.investmentScheduleStore.getStreamUiInvestmentSchedule().asObservable(getInvestmentScheduleId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable<R> map = observableRefCount.map(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiInvestmentSchedule uiInvestmentSchedule = (UiInvestmentSchedule) it;
                return Optional3.asOptional(!uiInvestmentSchedule.isCrypto() ? uiInvestmentSchedule.getInvestmentTarget().getInstrumentId() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InvestmentScheduleSettingsDuxo$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).switchMap(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Quote> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return InvestmentScheduleSettingsDuxo.this.quoteStore.getStreamQuote().asObservable(instrumentId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$2(this.f$0, (Quote) obj);
            }
        });
        Observable<R> map2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiInvestmentSchedule uiInvestmentSchedule = (UiInvestmentSchedule) it;
                return Optional3.asOptional(uiInvestmentSchedule.isCrypto() ? uiInvestmentSchedule.getInvestmentTarget().getInstrumentId() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InvestmentScheduleSettingsDuxo$onStart$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableSwitchMap2 = ObservablesKt.filterIsPresent(map2).switchMap(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo.onStart.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CryptoQuote> apply(UUID currencyPairId) {
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                return InvestmentScheduleSettingsDuxo.this.cryptoQuoteStore.getStreamCryptoQuote().asObservable(new CryptoQuoteStore.CryptoQuoteArgs(currencyPairId, null, null, 6, null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$5(this.f$0, (CryptoQuote) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$7(this.f$0, (UiInvestmentSchedule) obj);
            }
        });
        Observable<R> observableSwitchMapMaybe = observableRefCount.switchMapMaybe(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo.onStart.8
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends ScheduleAlert> apply(UiInvestmentSchedule schedule) {
                Intrinsics.checkNotNullParameter(schedule, "schedule");
                return InvestmentScheduleSettingsDuxo.this.scheduleAlertStore.streamScheduleAlert(InvestmentScheduleSettingsDuxo.this.getInvestmentScheduleId(), schedule.getAccountNumber());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapMaybe, "switchMapMaybe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapMaybe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$9(this.f$0, (ScheduleAlert) obj);
            }
        });
        InvestmentScheduleEventStore.DefaultImpls.refresh$default(this.investmentScheduleEventStore, false, null, 2, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C2845110(null));
        Observable<R> observableSwitchMap3 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo.onStart.11
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends AchRelationship> apply(UiInvestmentSchedule investmentSchedule) {
                Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
                UUID achRelationshipId = investmentSchedule.getAchRelationshipId();
                if (achRelationshipId != null) {
                    return InvestmentScheduleSettingsDuxo.this.achRelationshipStore.getAchRelationship(achRelationshipId);
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$11(this.f$0, (AchRelationship) obj);
            }
        });
        Observable<R> observableSwitchMap4 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo.onStart.13
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DirectDepositRelationship> apply(UiInvestmentSchedule investmentSchedule) {
                Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
                UUID directDepositRelationshipId = investmentSchedule.getDirectDepositRelationshipId();
                if (directDepositRelationshipId != null) {
                    return InvestmentScheduleSettingsDuxo.this.directDepositRelationshipStore.getDirectDepositRelationship(directDepositRelationshipId);
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$13(this.f$0, (DirectDepositRelationship) obj);
            }
        });
        UnifiedAccountStore.refresh$default(this.unifiedAccountStore, false, 1, null);
        Observable<R> observableFlatMap = observableRefCount.flatMap(new Function() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo.onStart.15
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<UnifiedAccountV2>> apply(UiInvestmentSchedule investmentSchedule) {
                Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
                return InvestmentScheduleSettingsDuxo.this.unifiedAccountStore.streamAccount(investmentSchedule.getAccountNumber());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(observableFlatMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$15(this.f$0, (UnifiedAccountV2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final Quote quote) {
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$2$lambda$1(quote, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState onStart$lambda$2$lambda$1(Quote quote, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, null, null, null, null, quote, null, null, false, null, null, null, 4063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final CryptoQuote cryptoQuote) {
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$5$lambda$4(cryptoQuote, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState onStart$lambda$5$lambda$4(CryptoQuote cryptoQuote, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, null, cryptoQuote, null, null, null, null, null, false, null, null, null, 4091, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final UiInvestmentSchedule uiInvestmentSchedule) {
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$7$lambda$6(uiInvestmentSchedule, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState onStart$lambda$7$lambda$6(UiInvestmentSchedule uiInvestmentSchedule, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, uiInvestmentSchedule, null, null, null, null, null, null, false, null, null, null, 4093, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final ScheduleAlert scheduleAlert) {
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$9$lambda$8(scheduleAlert, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState onStart$lambda$9$lambda$8(ScheduleAlert scheduleAlert, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, null, null, null, null, null, null, scheduleAlert, false, null, null, null, 3967, null);
    }

    /* compiled from: InvestmentScheduleSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$onStart$10", m3645f = "InvestmentScheduleSettingsDuxo.kt", m3646l = {112}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$onStart$10 */
    static final class C2845110 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2845110(Continuation<? super C2845110> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentScheduleSettingsDuxo.this.new C2845110(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2845110) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<UiInvestmentScheduleEvent>> flowStreamInvestmentScheduleEventBySchedule = InvestmentScheduleSettingsDuxo.this.investmentScheduleEventStore.streamInvestmentScheduleEventBySchedule(InvestmentScheduleSettingsDuxo.this.getInvestmentScheduleId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InvestmentScheduleSettingsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamInvestmentScheduleEventBySchedule, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InvestmentScheduleSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "events", "", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$onStart$10$1", m3645f = "InvestmentScheduleSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$onStart$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiInvestmentScheduleEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestmentScheduleSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = investmentScheduleSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiInvestmentScheduleEvent> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiInvestmentScheduleEvent>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiInvestmentScheduleEvent> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final InvestmentScheduleSettingsState invokeSuspend$lambda$0(List list, InvestmentScheduleSettingsState investmentScheduleSettingsState) {
                return InvestmentScheduleSettingsState.copy$default(investmentScheduleSettingsState, false, null, null, null, null, null, list, null, false, null, null, null, 4031, null);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final List list = (List) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$onStart$10$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return InvestmentScheduleSettingsDuxo.C2845110.AnonymousClass1.invokeSuspend$lambda$0(list, (InvestmentScheduleSettingsState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$11(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final AchRelationship achRelationship) {
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$11$lambda$10(achRelationship, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState onStart$lambda$11$lambda$10(AchRelationship achRelationship, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, null, null, null, null, null, null, null, false, achRelationship, null, null, 3583, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$13(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final DirectDepositRelationship directDepositRelationship) {
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$13$lambda$12(directDepositRelationship, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState onStart$lambda$13$lambda$12(DirectDepositRelationship directDepositRelationship, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, null, null, null, null, null, null, null, false, null, directDepositRelationship, null, 3071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$15(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final UnifiedAccountV2 unifiedAccount) {
        Intrinsics.checkNotNullParameter(unifiedAccount, "unifiedAccount");
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.onStart$lambda$15$lambda$14(unifiedAccount, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState onStart$lambda$15$lambda$14(UnifiedAccountV2 unifiedAccountV2, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, null, null, null, null, null, null, null, false, null, null, unifiedAccountV2, 2047, null);
    }

    public final void toggleInvestmentSchedule(final boolean selected) {
        LifecycleHost.DefaultImpls.bind$default(this, setInvestmentScheduleState(selected ? ApiInvestmentSchedule.State.ACTIVE : ApiInvestmentSchedule.State.PAUSED), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.toggleInvestmentSchedule$lambda$17(this.f$0, selected, (InvestmentSchedule) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.toggleInvestmentSchedule$lambda$19(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleInvestmentSchedule$lambda$17(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final boolean z, InvestmentSchedule it) {
        Intrinsics.checkNotNullParameter(it, "it");
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.toggleInvestmentSchedule$lambda$17$lambda$16(z, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState toggleInvestmentSchedule$lambda$17$lambda$16(boolean z, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, z, null, null, null, 3831, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleInvestmentSchedule$lambda$19(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.toggleInvestmentSchedule$lambda$19$lambda$18(t, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState toggleInvestmentSchedule$lambda$19$lambda$18(Throwable th, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, null, null, null, new UiEvent(th), null, null, null, false, null, null, null, 4079, null);
    }

    public final void setNextDate(LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        LifecycleHost.DefaultImpls.bind$default(this, TraderInvestmentScheduleStore.updateUiInvestmentSchedule$default(this.investmentScheduleStore, getInvestmentScheduleId(), null, null, null, null, null, null, selectedDate, null, 382, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.setNextDate$lambda$21(this.f$0, (UiInvestmentSchedule) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setNextDate$lambda$21(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo, final UiInvestmentSchedule schedule) {
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        investmentScheduleSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsDuxo.setNextDate$lambda$21$lambda$20(schedule, (InvestmentScheduleSettingsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentScheduleSettingsState setNextDate$lambda$21$lambda$20(UiInvestmentSchedule uiInvestmentSchedule, InvestmentScheduleSettingsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestmentScheduleSettingsState.copy$default(applyMutation, false, uiInvestmentSchedule, null, null, null, null, null, null, false, null, null, null, 4093, null);
    }

    private final Single<InvestmentSchedule> setInvestmentScheduleState(ApiInvestmentSchedule.State state) {
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1 || i == 2) {
            return TraderInvestmentScheduleStore.updateInvestmentSchedule$default(this.investmentScheduleStore, getInvestmentScheduleId(), state, null, null, null, null, null, null, null, 508, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("to delete schedules, call cancelInvestmentSchedule() instead");
    }

    public final void logNextOrderDateRowTap() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.RECURRING_DETAIL;
        String string2 = getInvestmentScheduleId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_CALENDAR_DATE_PICKER, new Screen(name, null, string2, null, 10, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, null, false, 56, null);
    }

    public final void logNextOrderDateChanged() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.RECURRING_DETAIL;
        String string2 = getInvestmentScheduleId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(name, null, string2, null, 10, null);
        Component component = new Component(Component.ComponentType.CALENDAR_DATE_PICKER, null, null, 6, null);
        Component component2 = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SET_RECURRING_NEXT_ORDER_DATE, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), new ComponentHierarchy(component, component2, null, null, null, 30, null), null, false, 48, null);
    }

    public final void logNextOrderDatePickerDismiss() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.RECURRING_DETAIL;
        String string2 = getInvestmentScheduleId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(name, null, string2, null, 10, null);
        Component component = new Component(Component.ComponentType.CALENDAR_DATE_PICKER, null, null, 6, null);
        Component component2 = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), new ComponentHierarchy(component, component2, null, null, null, 30, null), null, false, 48, null);
    }

    public final void logPauseButtonTap() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.RECURRING_DETAIL;
        String string2 = getInvestmentScheduleId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.PAUSE_RECURRING_INVESTMENT, new Screen(name, null, string2, null, 10, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    /* compiled from: InvestmentScheduleSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsArgs;", "<init>", "()V", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestmentScheduleSettingsDuxo, InvestmentScheduleSettingsArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestmentScheduleSettingsArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestmentScheduleSettingsArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestmentScheduleSettingsArgs getArgs(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo) {
            return (InvestmentScheduleSettingsArgs) DuxoCompanion.DefaultImpls.getArgs(this, investmentScheduleSettingsDuxo);
        }
    }
}
