package com.robinhood.android.cash.transaction.p079ui.forcepost;

import android.app.PendingIntent;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tasks.Task;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.transaction.p079ui.forcepost.ForcePostDuxo;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ForcePostDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "rhySuvManger", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/history/HistoryTransactionStore;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "isGetPushTokenizeRequestInFlight", "", "onStart", "", "viewToken", "updateGooglePayData", "getPushTokenizeEvent", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ForcePostDuxo extends OldBaseDuxo<ForcePostViewState> implements HasSavedState {
    private final GooglePayManager googlePayManager;
    private final HistoryTransactionStore historyTransactionStore;
    private boolean isGetPushTokenizeRequestInFlight;
    private final PaymentCardStore paymentCardStore;
    private final RhySuvManger rhySuvManger;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ForcePostDuxo(HistoryTransactionStore historyTransactionStore, PaymentCardStore paymentCardStore, RhySuvManger rhySuvManger, GooglePayManager googlePayManager, SavedStateHandle savedStateHandle) {
        super(new ForcePostViewState(null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.historyTransactionStore = historyTransactionStore;
        this.paymentCardStore = paymentCardStore;
        this.rhySuvManger = rhySuvManger;
        this.googlePayManager = googlePayManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable<U> observableCast = this.historyTransactionStore.fromReference(((LegacyDialogFragmentKey.ForcePostBottomSheet) INSTANCE.getArgs((HasSavedState) this)).getTransactionReference()).cast(MinervaTransaction.FromCard.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable map = observableCast.map(new Function() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((MinervaTransaction.FromCard) it).getEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ForcePostDuxo$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(map);
        Observable map2 = observableFilterIsPresent.map(new Function() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CardTransaction) it).getCardId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ForcePostDuxo$onStart$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map2).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$onStart$paymentStream$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends PaymentCard> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.paymentCardStore.streamCard(it);
            }
        });
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableSwitchMap);
        Observable observableDistinctUntilChanged = observables.combineLatest(observableFilterIsPresent, observableSwitchMap, this.paymentCardStore.streamActiveRhyCard()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.onStart$lambda$3(this.f$0, (Tuples3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(ForcePostDuxo forcePostDuxo, Tuples3 tuples3) {
        final CardTransaction cardTransaction = (CardTransaction) tuples3.component1();
        final PaymentCard paymentCard = (PaymentCard) tuples3.component2();
        final PaymentCard paymentCard2 = (PaymentCard) tuples3.component3();
        forcePostDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.onStart$lambda$3$lambda$2(cardTransaction, paymentCard, paymentCard2, (ForcePostViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForcePostViewState onStart$lambda$3$lambda$2(CardTransaction cardTransaction, PaymentCard paymentCard, PaymentCard paymentCard2, ForcePostViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ForcePostViewState.copy$default(applyMutation, cardTransaction, paymentCard, paymentCard2, null, null, null, false, 120, null);
    }

    public final void viewToken() {
        ScopedSingle scopedSingleBind$default;
        Single<Task<PendingIntent>> singleViewToken = this.googlePayManager.viewToken();
        if (singleViewToken == null || (scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(this, singleViewToken, (LifecycleEvent) null, 1, (Object) null)) == null) {
            return;
        }
        scopedSingleBind$default.subscribeKotlin();
    }

    public final void updateGooglePayData() {
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.googlePayManager.listTokens(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.updateGooglePayData$lambda$5(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.updateGooglePayData$lambda$7(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$5(ForcePostDuxo forcePostDuxo, final List tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        forcePostDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.updateGooglePayData$lambda$5$lambda$4(tokenList, (ForcePostViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForcePostViewState updateGooglePayData$lambda$5$lambda$4(List list, ForcePostViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ForcePostViewState.copy$default(applyMutation, null, null, null, list, null, null, false, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$7(ForcePostDuxo forcePostDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        forcePostDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.updateGooglePayData$lambda$7$lambda$6((ForcePostViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForcePostViewState updateGooglePayData$lambda$7$lambda$6(ForcePostViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ForcePostViewState.copy$default(applyMutation, null, null, null, null, null, null, false, 119, null);
    }

    public final void getPushTokenizeEvent() {
        if (this.isGetPushTokenizeRequestInFlight) {
            return;
        }
        Single<PushTokenizeRequest> singleDoOnSubscribe = this.rhySuvManger.getPushTokenizeEvent().doOnSubscribe(new C104591());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.getPushTokenizeEvent$lambda$10(this.f$0, (PushTokenizeRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.getPushTokenizeEvent$lambda$13(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: ForcePostDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$getPushTokenizeEvent$1 */
    static final class C104591<T> implements Consumer {
        C104591() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            ForcePostDuxo.this.isGetPushTokenizeRequestInFlight = true;
            ForcePostDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$getPushTokenizeEvent$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ForcePostDuxo.C104591.accept$lambda$0((ForcePostViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ForcePostViewState accept$lambda$0(ForcePostViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return ForcePostViewState.copy$default(applyMutation, null, null, null, null, null, null, true, 63, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$10(ForcePostDuxo forcePostDuxo, final PushTokenizeRequest pushTokenizeRequest) {
        forcePostDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.getPushTokenizeEvent$lambda$10$lambda$8(pushTokenizeRequest, (ForcePostViewState) obj);
            }
        });
        forcePostDuxo.isGetPushTokenizeRequestInFlight = false;
        forcePostDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.getPushTokenizeEvent$lambda$10$lambda$9((ForcePostViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForcePostViewState getPushTokenizeEvent$lambda$10$lambda$8(PushTokenizeRequest pushTokenizeRequest, ForcePostViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ForcePostViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(pushTokenizeRequest), null, false, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForcePostViewState getPushTokenizeEvent$lambda$10$lambda$9(ForcePostViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ForcePostViewState.copy$default(applyMutation, null, null, null, null, null, null, false, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$13(ForcePostDuxo forcePostDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof VerificationRequiredException) {
            forcePostDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ForcePostDuxo.getPushTokenizeEvent$lambda$13$lambda$11(error, (ForcePostViewState) obj);
                }
            });
        }
        forcePostDuxo.isGetPushTokenizeRequestInFlight = false;
        forcePostDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForcePostDuxo.getPushTokenizeEvent$lambda$13$lambda$12((ForcePostViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForcePostViewState getPushTokenizeEvent$lambda$13$lambda$11(Throwable th, ForcePostViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ForcePostViewState.copy$default(applyMutation, null, null, null, null, null, new UiEvent(th), false, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForcePostViewState getPushTokenizeEvent$lambda$13$lambda$12(ForcePostViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ForcePostViewState.copy$default(applyMutation, null, null, null, null, null, null, false, 63, null);
    }

    /* compiled from: ForcePostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ForcePostBottomSheet;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ForcePostDuxo, LegacyDialogFragmentKey.ForcePostBottomSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.ForcePostBottomSheet getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyDialogFragmentKey.ForcePostBottomSheet) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.ForcePostBottomSheet getArgs(ForcePostDuxo forcePostDuxo) {
            return (LegacyDialogFragmentKey.ForcePostBottomSheet) DuxoCompanion.DefaultImpls.getArgs(this, forcePostDuxo);
        }
    }
}
