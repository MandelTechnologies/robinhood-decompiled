package com.robinhood.android.history.p153ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.history.p153ui.RhyAchTransferDetailDuxo;
import com.robinhood.android.history.p153ui.RhyAchTransferDetailFragment;
import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransferIraInfo;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyAchTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "rhyTransferIraInfoStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transferId", "Ljava/util/UUID;", "onResume", "", "cancelTransfer", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class RhyAchTransferDetailDuxo extends OldBaseDuxo<RhyAchTransferDetailViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final PaymentTransferStore paymentTransferStore;
    private final RhyTransferIraInfoStore rhyTransferIraInfoStore;
    private final SavedStateHandle savedStateHandle;
    private final UUID transferId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyAchTransferDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountType.values().length];
            try {
                iArr2[AccountType.RHS_ROTH_IRA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AccountType.RHS_ROTH_IRA_INHERITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccountType.RHS_TRADITIONAL_IRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccountType.RHS_TRADITIONAL_IRA_INHERITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyAchTransferDetailDuxo(AchRelationshipStore achRelationshipStore, PaymentTransferStore paymentTransferStore, RhyTransferIraInfoStore rhyTransferIraInfoStore, SavedStateHandle savedStateHandle) {
        super(new RhyAchTransferDetailViewState(null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(rhyTransferIraInfoStore, "rhyTransferIraInfoStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.achRelationshipStore = achRelationshipStore;
        this.paymentTransferStore = paymentTransferStore;
        this.rhyTransferIraInfoStore = rhyTransferIraInfoStore;
        this.savedStateHandle = savedStateHandle;
        this.transferId = ((RhyAchTransferDetailFragment.Args) INSTANCE.getArgs(getSavedStateHandle())).getTransferId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable observableSwitchMap = PaymentTransferStore.getPaymentTransfer$default(this.paymentTransferStore, this.transferId, false, 2, null).switchMap(new Function() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$onResume$$inlined$switchMap$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RhyAchTransferDetailDuxo$onResume$$inlined$switchMap$1<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(final T t) {
                Observable<Optional<ApiRhyTransferIraInfo>> observableStreamContributionInfo;
                Observable<R> observableJust;
                Intrinsics.checkNotNullParameter(t, "t");
                PaymentTransfer paymentTransfer = (PaymentTransfer) t;
                ApiPaymentTransferDetails details = paymentTransfer.getDetails();
                Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiAchTransfer");
                ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = (ApiPaymentTransferDetails.ApiAchTransfer) details;
                int i = RhyAchTransferDetailDuxo.WhenMappings.$EnumSwitchMapping$1[paymentTransfer.getOriginatingAccountType().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    int i2 = RhyAchTransferDetailDuxo.WhenMappings.$EnumSwitchMapping$0[apiAchTransfer.getDirection().ordinal()];
                    if (i2 == 1) {
                        observableStreamContributionInfo = this.this$0.rhyTransferIraInfoStore.streamContributionInfo(this.this$0.transferId);
                    } else if (i2 == 2) {
                        observableStreamContributionInfo = this.this$0.rhyTransferIraInfoStore.streamDistributionInfo(this.this$0.transferId);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    observableStreamContributionInfo = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNullExpressionValue(observableStreamContributionInfo, "just(...)");
                }
                Observables observables = Observables.INSTANCE;
                if (paymentTransfer.getIsOwner()) {
                    observableJust = this.this$0.achRelationshipStore.getAchRelationship(apiAchTransfer.getAchRelationshipId()).map(new Function() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$onResume$lambda$1$$inlined$fetchAdditionalDataIfOwner$1
                        @Override // io.reactivex.functions.Function
                        public final Optional<T> apply(T it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Optional3.asOptional(it);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.functions.Function
                        public /* bridge */ /* synthetic */ Object apply(Object obj) {
                            return apply((PaymentTransfers<T, R>) obj);
                        }
                    });
                    Intrinsics.checkNotNull(observableJust);
                } else {
                    observableJust = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNull(observableJust);
                }
                return observables.combineLatest(observableJust, observableStreamContributionInfo).map(new Function() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$onResume$$inlined$switchMap$1.1
                    @Override // io.reactivex.functions.Function
                    public final R apply(Tuples2<? extends Optional<? extends AchRelationship>, ? extends Optional<? extends ApiRhyTransferIraInfo>> u) {
                        Intrinsics.checkNotNullParameter(u, "u");
                        Object obj = t;
                        Intrinsics.checkNotNull(obj);
                        Tuples2<? extends Optional<? extends AchRelationship>, ? extends Optional<? extends ApiRhyTransferIraInfo>> tuples2 = u;
                        Optional<? extends AchRelationship> optionalComponent1 = tuples2.component1();
                        return (R) new Tuples3((PaymentTransfer) obj, optionalComponent1.getOrNull(), tuples2.component2());
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAchTransferDetailDuxo.onResume$lambda$4(this.f$0, (Tuples3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(RhyAchTransferDetailDuxo rhyAchTransferDetailDuxo, Tuples3 tuples3) {
        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
        final PaymentTransfer paymentTransfer = (PaymentTransfer) tuples3.component1();
        final AchRelationship achRelationship = (AchRelationship) tuples3.component2();
        final Optional optional = (Optional) tuples3.component3();
        rhyAchTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAchTransferDetailDuxo.onResume$lambda$4$lambda$3(paymentTransfer, achRelationship, optional, (RhyAchTransferDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAchTransferDetailViewState onResume$lambda$4$lambda$3(PaymentTransfer paymentTransfer, AchRelationship achRelationship, Optional optional, RhyAchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ApiPaymentTransferDetails details = paymentTransfer.getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiAchTransfer");
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = (ApiPaymentTransferDetails.ApiAchTransfer) details;
        ApiRhyTransferIraInfo apiRhyTransferIraInfo = (ApiRhyTransferIraInfo) optional.getOrNull();
        return RhyAchTransferDetailViewState.copy$default(applyMutation, paymentTransfer, apiAchTransfer, achRelationship, apiRhyTransferIraInfo != null ? apiRhyTransferIraInfo.getRows() : null, false, null, null, 112, null);
    }

    public final void cancelTransfer() {
        applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAchTransferDetailDuxo.cancelTransfer$lambda$5((RhyAchTransferDetailViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, CompletableDelay2.minTimeInFlight$default(this.paymentTransferStore.cancelTransfer(this.transferId), 1000L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAchTransferDetailDuxo.cancelTransfer$lambda$7(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAchTransferDetailDuxo.cancelTransfer$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAchTransferDetailViewState cancelTransfer$lambda$5(RhyAchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyAchTransferDetailViewState.copy$default(applyMutation, null, null, null, null, true, null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$7(RhyAchTransferDetailDuxo rhyAchTransferDetailDuxo) {
        rhyAchTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAchTransferDetailDuxo.cancelTransfer$lambda$7$lambda$6((RhyAchTransferDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAchTransferDetailViewState cancelTransfer$lambda$7$lambda$6(RhyAchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyAchTransferDetailViewState.copy$default(applyMutation, null, null, null, null, false, new UiEvent(Unit.INSTANCE), null, 79, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$9(RhyAchTransferDetailDuxo rhyAchTransferDetailDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhyAchTransferDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.RhyAchTransferDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAchTransferDetailDuxo.cancelTransfer$lambda$9$lambda$8(throwable, (RhyAchTransferDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAchTransferDetailViewState cancelTransfer$lambda$9$lambda$8(Throwable th, RhyAchTransferDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyAchTransferDetailViewState.copy$default(applyMutation, null, null, null, null, false, null, new UiEvent(th), 47, null);
    }

    /* compiled from: RhyAchTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailDuxo;", "Lcom/robinhood/android/history/ui/RhyAchTransferDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhyAchTransferDetailDuxo, RhyAchTransferDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyAchTransferDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RhyAchTransferDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyAchTransferDetailFragment.Args getArgs(RhyAchTransferDetailDuxo rhyAchTransferDetailDuxo) {
            return (RhyAchTransferDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, rhyAchTransferDetailDuxo);
        }
    }
}
