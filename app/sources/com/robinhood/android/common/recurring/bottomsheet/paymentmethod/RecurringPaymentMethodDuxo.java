package com.robinhood.android.common.recurring.bottomsheet.paymentmethod;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.money.Currencies;
import java.util.Currency;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringPaymentMethodDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u0013J\u0006\u0010 \u001a\u00020\u0013J\b\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "onRowClicked", "row", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "clearSelectedRow", "logAddAccountRowTap", "context", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "logSelectPaymentMethod", "paymentMethod", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "logDismiss", "logAddAccountSuccess", "getLoggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringPaymentMethodDuxo extends OldBaseDuxo<RecurringPaymentMethodViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final CryptoBuyingPowerStore cryptoBuyingPowerStore;
    private final EventLogger eventLogger;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringPaymentMethodDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecurringPaymentMethodDuxo(AchRelationshipStore achRelationshipStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, CryptoBuyingPowerStore cryptoBuyingPowerStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RecurringPaymentMethodViewState(((RecurringPaymentMethodBottomSheetArgs) companion.getArgs(savedStateHandle)).getShowPaymentMethodAnnotation(), null, null, ((RecurringPaymentMethodBottomSheetArgs) companion.getArgs(savedStateHandle)).isCrypto(), ((RecurringPaymentMethodBottomSheetArgs) companion.getArgs(savedStateHandle)).isBackup(), null, null, ((RecurringPaymentMethodBottomSheetArgs) companion.getArgs(savedStateHandle)).getLoggingContext(), false, 358, null), null, 2, null);
        this.achRelationshipStore = achRelationshipStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.cryptoBuyingPowerStore = cryptoBuyingPowerStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPaymentMethodViewState onCreate$lambda$0(RecurringPaymentMethodDuxo recurringPaymentMethodDuxo, RecurringPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        AchRelationship achRelationship = ((RecurringPaymentMethodBottomSheetArgs) INSTANCE.getArgs((HasSavedState) recurringPaymentMethodDuxo)).getAchRelationship();
        Intrinsics.checkNotNull(achRelationship);
        return RecurringPaymentMethodViewState.copy$default(applyMutation, false, new RecurringPaymentMethodBottomSheet.Row.AchRelationship(achRelationship, false), null, false, false, null, null, null, false, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPaymentMethodViewState onCreate$lambda$1(RecurringPaymentMethodDuxo recurringPaymentMethodDuxo, RecurringPaymentMethodViewState applyMutation) {
        RecurringPaymentMethodBottomSheet.Row equityBuyingPower;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (((RecurringPaymentMethodBottomSheetArgs) INSTANCE.getArgs((HasSavedState) recurringPaymentMethodDuxo)).isCrypto()) {
            equityBuyingPower = new RecurringPaymentMethodBottomSheet.Row.CryptoBuyingPower(null, 1, null);
        } else {
            equityBuyingPower = new RecurringPaymentMethodBottomSheet.Row.EquityBuyingPower(null, 1, null);
        }
        return RecurringPaymentMethodViewState.copy$default(applyMutation, false, equityBuyingPower, null, false, false, null, null, null, false, 509, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        ApiInvestmentSchedule.SourceOfFunds paymentMethod = ((RecurringPaymentMethodBottomSheetArgs) INSTANCE.getArgs((HasSavedState) this)).getPaymentMethod();
        int i = paymentMethod == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paymentMethod.ordinal()];
        if (i != -1) {
            if (i == 1) {
                applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringPaymentMethodDuxo.onCreate$lambda$0(this.f$0, (RecurringPaymentMethodViewState) obj);
                    }
                });
            } else if (i == 2) {
                applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringPaymentMethodDuxo.onCreate$lambda$1(this.f$0, (RecurringPaymentMethodViewState) obj);
                    }
                });
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("not supported");
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        AchRelationshipStore.refresh$default(this.achRelationshipStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getLinkedAchRelationships(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringPaymentMethodDuxo.onResume$lambda$3(this.f$0, (List) obj);
            }
        });
        Companion companion = INSTANCE;
        if (((RecurringPaymentMethodBottomSheetArgs) companion.getArgs((HasSavedState) this)).isBackup()) {
            return;
        }
        if (((RecurringPaymentMethodBottomSheetArgs) companion.getArgs((HasSavedState) this)).isCrypto()) {
            CryptoBuyingPowerStore cryptoBuyingPowerStore = this.cryptoBuyingPowerStore;
            Currency currency = Currencies.USD;
            String currencyCode = currency.getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            cryptoBuyingPowerStore.refresh(false, currencyCode);
            CryptoBuyingPowerStore cryptoBuyingPowerStore2 = this.cryptoBuyingPowerStore;
            String currencyCode2 = currency.getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode2, "getCurrencyCode(...)");
            LifecycleHost.DefaultImpls.bind$default(this, asObservable(cryptoBuyingPowerStore2.streamBuyingPowerForCrypto(currencyCode2)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringPaymentMethodDuxo.onResume$lambda$5(this.f$0, (CryptoBuyingPower) obj);
                }
            });
            return;
        }
        UUID instrumentId = ((RecurringPaymentMethodBottomSheetArgs) companion.getArgs((HasSavedState) this)).getInstrumentId();
        if (instrumentId != null) {
            this.instrumentBuyingPowerStore.refreshIndividualAccount(false, instrumentId);
            LifecycleHost.DefaultImpls.bind$default(this, this.instrumentBuyingPowerStore.getStreamIndividualAccountBuyingPowerForInstrument().asObservable(instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringPaymentMethodDuxo.onResume$lambda$7(this.f$0, (InstrumentBuyingPower) obj);
                }
            });
        } else {
            applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringPaymentMethodDuxo.onResume$lambda$8((RecurringPaymentMethodViewState) obj);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(RecurringPaymentMethodDuxo recurringPaymentMethodDuxo, final List relationships) {
        Intrinsics.checkNotNullParameter(relationships, "relationships");
        recurringPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringPaymentMethodDuxo.onResume$lambda$3$lambda$2(relationships, (RecurringPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPaymentMethodViewState onResume$lambda$3$lambda$2(List list, RecurringPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringPaymentMethodViewState.copy$default(applyMutation, false, null, list, false, false, null, null, null, false, 507, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(RecurringPaymentMethodDuxo recurringPaymentMethodDuxo, final CryptoBuyingPower cryptoBuyingPower) {
        Intrinsics.checkNotNullParameter(cryptoBuyingPower, "cryptoBuyingPower");
        recurringPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringPaymentMethodDuxo.onResume$lambda$5$lambda$4(cryptoBuyingPower, (RecurringPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPaymentMethodViewState onResume$lambda$5$lambda$4(CryptoBuyingPower cryptoBuyingPower, RecurringPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringPaymentMethodViewState.copy$default(applyMutation, false, null, null, false, false, null, cryptoBuyingPower.getBuyingPower(), null, false, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(RecurringPaymentMethodDuxo recurringPaymentMethodDuxo, final InstrumentBuyingPower instrumentBuyingPower) {
        Intrinsics.checkNotNullParameter(instrumentBuyingPower, "instrumentBuyingPower");
        recurringPaymentMethodDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringPaymentMethodDuxo.onResume$lambda$7$lambda$6(instrumentBuyingPower, (RecurringPaymentMethodViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPaymentMethodViewState onResume$lambda$7$lambda$6(InstrumentBuyingPower instrumentBuyingPower, RecurringPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringPaymentMethodViewState.copy$default(applyMutation, false, null, null, false, false, instrumentBuyingPower.getBuyingPowerAmount(), null, null, false, 479, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPaymentMethodViewState onResume$lambda$8(RecurringPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringPaymentMethodViewState.copy$default(applyMutation, false, null, null, false, false, null, null, null, true, 255, null);
    }

    public final void onRowClicked(final RecurringPaymentMethodBottomSheet.Row row) {
        Intrinsics.checkNotNullParameter(row, "row");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringPaymentMethodDuxo.onRowClicked$lambda$9(row, this, (RecurringPaymentMethodViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPaymentMethodViewState onRowClicked$lambda$9(RecurringPaymentMethodBottomSheet.Row row, RecurringPaymentMethodDuxo recurringPaymentMethodDuxo, RecurringPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if ((row instanceof RecurringPaymentMethodBottomSheet.Row.AchRelationship) || (row instanceof RecurringPaymentMethodBottomSheet.Row.CryptoBuyingPower) || (row instanceof RecurringPaymentMethodBottomSheet.Row.EquityBuyingPower) || (row instanceof RecurringPaymentMethodBottomSheet.Row.GenericBuyingPower)) {
            ApiInvestmentSchedule.SourceOfFunds paymentMethod = row.getPaymentMethod();
            Intrinsics.checkNotNull(paymentMethod);
            recurringPaymentMethodDuxo.logSelectPaymentMethod(paymentMethod, applyMutation.getLoggingContext());
            return RecurringPaymentMethodViewState.copy$default(applyMutation, false, row, null, false, false, null, null, null, false, 509, null);
        }
        if (Intrinsics.areEqual(row, RecurringPaymentMethodBottomSheet.Row.AddAccount.INSTANCE)) {
            recurringPaymentMethodDuxo.logAddAccountRowTap(applyMutation.getLoggingContext());
            return RecurringPaymentMethodViewState.copy$default(applyMutation, false, null, null, false, false, null, null, null, false, 511, null);
        }
        return RecurringPaymentMethodViewState.copy$default(applyMutation, false, null, null, false, false, null, null, null, false, 511, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPaymentMethodViewState clearSelectedRow$lambda$10(RecurringPaymentMethodViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringPaymentMethodViewState.copy$default(applyMutation, false, null, null, false, false, null, null, null, false, 509, null);
    }

    public final void clearSelectedRow() {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringPaymentMethodDuxo.clearSelectedRow$lambda$10((RecurringPaymentMethodViewState) obj);
            }
        });
    }

    public final void logAddAccountRowTap(RecurringContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.ADD_PAYMENT_METHOD, getLoggingScreen(), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 44, null);
    }

    public final void logSelectPaymentMethod(ApiInvestmentSchedule.SourceOfFunds paymentMethod, RecurringContext context) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(context, "context");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.SELECT_PAYMENT_METHOD, getLoggingScreen(), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, RecurringContext.copy$default(context, null, null, null, null, Recurring2.toProtobuf(paymentMethod), 0.0d, null, null, 0.0d, null, null, 2031, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 44, null);
    }

    public final void logDismiss() {
        EventLogger.DefaultImpls.logDisappear$default(this.eventLogger, UserInteractionEventData.Action.DISMISS, getLoggingScreen(), null, null, null, 28, null);
    }

    public final void logAddAccountSuccess() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.ADD_PAYMENT_METHOD_SUCCESS, new Screen(Screen.Name.RECURRING_PAYMENT_METHOD, null, null, null, 14, null), new Component(Component.ComponentType.ADD_ACCOUNT, null, null, 6, null), null, null, false, 56, null);
    }

    private final Screen getLoggingScreen() {
        Screen.Name name;
        if (((RecurringPaymentMethodBottomSheetArgs) INSTANCE.getArgs((HasSavedState) this)).isBackup()) {
            name = Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD;
        } else {
            name = Screen.Name.RECURRING_PAYMENT_METHOD;
        }
        return new Screen(name, null, null, null, 14, null);
    }

    /* compiled from: RecurringPaymentMethodDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodDuxo;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheetArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringPaymentMethodDuxo, RecurringPaymentMethodBottomSheetArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringPaymentMethodBottomSheetArgs getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringPaymentMethodBottomSheetArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringPaymentMethodBottomSheetArgs getArgs(RecurringPaymentMethodDuxo recurringPaymentMethodDuxo) {
            return (RecurringPaymentMethodBottomSheetArgs) DuxoCompanion.DefaultImpls.getArgs(this, recurringPaymentMethodDuxo);
        }
    }
}
