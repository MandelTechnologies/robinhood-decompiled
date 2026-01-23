package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.p226ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.p226ui.DirectDepositPaycheckRecurringInvestmentsConfirmationFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.SinglesKt;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "paycheckInvestmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "getEquitySymbol", "Lio/reactivex/Single;", "", "instrumentId", "Ljava/util/UUID;", "getCryptoSymbol", "Companion", "feature-lib-recurring-paycheck-dd-onboarding-confirmation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo extends OldBaseDuxo<DirectDepositPaycheckRecurringInvestmentsConfirmationViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CurrencyPairStore currencyPairStore;
    private final InstrumentStore instrumentStore;
    private final PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo(CurrencyPairStore currencyPairStore, InstrumentStore instrumentStore, PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, SavedStateHandle savedStateHandle) {
        super(new DirectDepositPaycheckRecurringInvestmentsConfirmationViewState(((DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Args) INSTANCE.getArgs(savedStateHandle)).getDirectDepositSource(), null, null, 6, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "paycheckInvestmentScheduleStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.currencyPairStore = currencyPairStore;
        this.instrumentStore = instrumentStore;
        this.paycheckInvestmentScheduleStore = paycheckInvestmentScheduleStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Single<R> singleFlatMap = this.paycheckInvestmentScheduleStore.getPaycheckInvestmentScheduleByIdQuery().asObservable(((DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getPaycheckInvestmentScheduleId()).firstOrError().flatMap(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.onStart.1

            /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo$onStart$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApiAssetType.values().length];
                    try {
                        iArr[ApiAssetType.EQUITY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<UiPaycheckInvestmentSchedule, String>> apply(final UiPaycheckInvestmentSchedule paycheckInvestmentSchedule) {
                Single singleMapToOptional;
                Intrinsics.checkNotNullParameter(paycheckInvestmentSchedule, "paycheckInvestmentSchedule");
                UUID instrumentId = paycheckInvestmentSchedule.getInvestmentTarget().getInstrumentId();
                Intrinsics.checkNotNull(instrumentId);
                int i = WhenMappings.$EnumSwitchMapping$0[paycheckInvestmentSchedule.getInvestmentTarget().getTargetType().ordinal()];
                if (i == 1) {
                    singleMapToOptional = SinglesKt.mapToOptional(DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.this.getEquitySymbol(instrumentId));
                } else if (i == 2) {
                    singleMapToOptional = SinglesKt.mapToOptional(DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.this.getCryptoSymbol(instrumentId));
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("This flow doesn't support tokenized stocks");
                    }
                    singleMapToOptional = Single.just(Optional2.INSTANCE);
                }
                return singleMapToOptional.map(new Function() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.onStart.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<UiPaycheckInvestmentSchedule, String> apply(Optional<String> optional) {
                        Intrinsics.checkNotNullParameter(optional, "<destruct>");
                        return Tuples4.m3642to(paycheckInvestmentSchedule, optional.component1());
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo directDepositPaycheckRecurringInvestmentsConfirmationDuxo, Tuples2 tuples2) {
        final UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule = (UiPaycheckInvestmentSchedule) tuples2.component1();
        final String str = (String) tuples2.component2();
        directDepositPaycheckRecurringInvestmentsConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.onStart$lambda$1$lambda$0(uiPaycheckInvestmentSchedule, str, (DirectDepositPaycheckRecurringInvestmentsConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositPaycheckRecurringInvestmentsConfirmationViewState onStart$lambda$1$lambda$0(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule, String str, DirectDepositPaycheckRecurringInvestmentsConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectDepositPaycheckRecurringInvestmentsConfirmationViewState.copy$default(applyMutation, null, uiPaycheckInvestmentSchedule, str, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<String> getEquitySymbol(UUID instrumentId) {
        this.instrumentStore.refresh(true, instrumentId);
        Single<String> singleFirstOrError = this.instrumentStore.getInstrument(instrumentId).map(new DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo2(new PropertyReference1Impl() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.getEquitySymbol.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Instrument) obj).getSymbol();
            }
        })).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<String> getCryptoSymbol(UUID instrumentId) {
        this.currencyPairStore.refresh(true, instrumentId);
        Single<String> singleFirstOrError = this.currencyPairStore.streamCurrencyPair(instrumentId).map(new DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo2(new PropertyReference1Impl() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.getCryptoSymbol.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((UiCurrencyPair) obj).getDisplaySymbol();
            }
        })).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Args;", "<init>", "()V", "feature-lib-recurring-paycheck-dd-onboarding-confirmation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo, DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Args getArgs(DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo directDepositPaycheckRecurringInvestmentsConfirmationDuxo) {
            return (DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, directDepositPaycheckRecurringInvestmentsConfirmationDuxo);
        }
    }
}
