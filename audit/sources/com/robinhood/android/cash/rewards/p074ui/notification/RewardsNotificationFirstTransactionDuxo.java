package com.robinhood.android.cash.rewards.p074ui.notification;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.rewards.p074ui.notification.RewardsNotificationFirstTransactionDuxo;
import com.robinhood.android.cash.rewards.p074ui.notification.RewardsNotificationFirstTransactionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.MerchantStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.mcduckling.CardReward2;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.RoundupCardReward;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p320db.mcduckling.p321ui.UiMerchant;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsNotificationFirstTransactionDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "merchantStore", "Lcom/robinhood/librobinhood/data/store/MerchantStore;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/librobinhood/data/store/MerchantStore;Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsNotificationFirstTransactionDuxo extends OldBaseDuxo<RewardsNotificationFirstTransactionViewState> implements HasSavedState {
    private final CardTransactionStore cardTransactionStore;
    private final CurrencyPairStore currencyPairStore;
    private final InstrumentStore instrumentStore;
    private final MerchantStore merchantStore;
    private final RoundupEnrollmentStore roundupEnrollmentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardsNotificationFirstTransactionDuxo(CardTransactionStore cardTransactionStore, MerchantStore merchantStore, RoundupEnrollmentStore roundupEnrollmentStore, InstrumentStore instrumentStore, CurrencyPairStore currencyPairStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(merchantStore, "merchantStore");
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RewardsNotificationFirstTransactionViewState(((RewardsNotificationFirstTransactionFragment.Args) companion.getArgs(savedStateHandle)).getRhsContent(), ((RewardsNotificationFirstTransactionFragment.Args) companion.getArgs(savedStateHandle)).getRhcContent(), null, null, null, null, 60, null), null, 2, 0 == true ? 1 : 0);
        this.cardTransactionStore = cardTransactionStore;
        this.merchantStore = merchantStore;
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.instrumentStore = instrumentStore;
        this.currencyPairStore = currencyPairStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        CardTransactionStore cardTransactionStore = this.cardTransactionStore;
        CardTransaction.Status status = CardTransaction.Status.SETTLED;
        Companion companion = INSTANCE;
        cardTransactionStore.refresh(status, ((RewardsNotificationFirstTransactionFragment.Args) companion.getArgs((HasSavedState) this)).getTransactionId(), true);
        Observable<R> observableSwitchMap = this.cardTransactionStore.streamTransaction(status, ((RewardsNotificationFirstTransactionFragment.Args) companion.getArgs((HasSavedState) this)).getTransactionId()).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo.onStart.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CardTransaction it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getMerchantId() != null;
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<CardTransaction, UiMerchant>> apply(final CardTransaction cardTransaction) {
                Intrinsics.checkNotNullParameter(cardTransaction, "cardTransaction");
                UUID merchantId = cardTransaction.getMerchantId();
                Intrinsics.checkNotNull(merchantId);
                RewardsNotificationFirstTransactionDuxo.this.merchantStore.refreshMerchant(merchantId, true);
                return RewardsNotificationFirstTransactionDuxo.this.merchantStore.streamMerchant(merchantId).map(new Function() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo.onStart.2.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<CardTransaction, UiMerchant> apply(UiMerchant uiMerchant) {
                        Intrinsics.checkNotNullParameter(uiMerchant, "uiMerchant");
                        return new Tuples2<>(cardTransaction, uiMerchant);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsNotificationFirstTransactionDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.roundupEnrollmentStore.stream().distinctUntilChanged().switchMap(new C101934());
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsNotificationFirstTransactionDuxo.onStart$lambda$3(this.f$0, (Security) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RewardsNotificationFirstTransactionDuxo rewardsNotificationFirstTransactionDuxo, Tuples2 tuples2) {
        Object first = tuples2.getFirst();
        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type com.robinhood.models.db.mcduckling.SettledCardTransaction");
        final SettledCardTransaction settledCardTransaction = (SettledCardTransaction) first;
        Object second = tuples2.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "<get-second>(...)");
        final UiMerchant uiMerchant = (UiMerchant) second;
        rewardsNotificationFirstTransactionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsNotificationFirstTransactionDuxo.onStart$lambda$1$lambda$0(settledCardTransaction, uiMerchant, (RewardsNotificationFirstTransactionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsNotificationFirstTransactionViewState onStart$lambda$1$lambda$0(SettledCardTransaction settledCardTransaction, UiMerchant uiMerchant, RewardsNotificationFirstTransactionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RoundupCardReward roundupReward = CardReward2.getRoundupReward(settledCardTransaction.getRewards());
        return RewardsNotificationFirstTransactionViewState.copy$default(applyMutation, null, null, roundupReward != null ? roundupReward.getRoundupAmount() : null, uiMerchant.getAggregateMerchant().getName(), null, null, 51, null);
    }

    /* compiled from: RewardsNotificationFirstTransactionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo$onStart$4 */
    static final class C101934<T, R> implements Function {

        /* compiled from: RewardsNotificationFirstTransactionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo$onStart$4$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RoundupInvestmentType.values().length];
                try {
                    iArr[RoundupInvestmentType.STOCK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RoundupInvestmentType.CRYPTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C101934() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends Security> apply(final RoundupEnrollment roundupEnrollment) {
            Intrinsics.checkNotNullParameter(roundupEnrollment, "roundupEnrollment");
            RewardsNotificationFirstTransactionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo$onStart$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsNotificationFirstTransactionDuxo.C101934.apply$lambda$0(roundupEnrollment, (RewardsNotificationFirstTransactionViewState) obj);
                }
            });
            RoundupInvestmentType investmentType = roundupEnrollment.getInvestmentType();
            UUID investmentAssetId = roundupEnrollment.getInvestmentAssetId();
            int i = WhenMappings.$EnumSwitchMapping$0[investmentType.ordinal()];
            if (i == 1) {
                RewardsNotificationFirstTransactionDuxo.this.instrumentStore.refresh(true, investmentAssetId);
                return RewardsNotificationFirstTransactionDuxo.this.instrumentStore.getInstrument(investmentAssetId);
            }
            if (i == 2) {
                RewardsNotificationFirstTransactionDuxo.this.currencyPairStore.refresh(true, investmentAssetId);
                return RewardsNotificationFirstTransactionDuxo.this.currencyPairStore.streamCurrencyPair(investmentAssetId);
            }
            return Observable.empty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsNotificationFirstTransactionViewState apply$lambda$0(RoundupEnrollment roundupEnrollment, RewardsNotificationFirstTransactionViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsNotificationFirstTransactionViewState.copy$default(applyMutation, null, null, null, null, null, roundupEnrollment.getInvestmentType(), 31, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RewardsNotificationFirstTransactionDuxo rewardsNotificationFirstTransactionDuxo, final Security security) {
        rewardsNotificationFirstTransactionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationFirstTransactionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsNotificationFirstTransactionDuxo.onStart$lambda$3$lambda$2(security, (RewardsNotificationFirstTransactionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsNotificationFirstTransactionViewState onStart$lambda$3$lambda$2(Security security, RewardsNotificationFirstTransactionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsNotificationFirstTransactionViewState.copy$default(applyMutation, null, null, null, null, security.getDisplaySymbol(), null, 47, null);
    }

    /* compiled from: RewardsNotificationFirstTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionDuxo;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionFragment$Args;", "<init>", "()V", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RewardsNotificationFirstTransactionDuxo, RewardsNotificationFirstTransactionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardsNotificationFirstTransactionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RewardsNotificationFirstTransactionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardsNotificationFirstTransactionFragment.Args getArgs(RewardsNotificationFirstTransactionDuxo rewardsNotificationFirstTransactionDuxo) {
            return (RewardsNotificationFirstTransactionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, rewardsNotificationFirstTransactionDuxo);
        }
    }
}
