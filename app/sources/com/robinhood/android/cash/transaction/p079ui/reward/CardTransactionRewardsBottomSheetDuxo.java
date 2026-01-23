package com.robinhood.android.cash.transaction.p079ui.reward;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.transaction.p079ui.reward.CardTransactionRewardsBottomSheetDuxo;
import com.robinhood.android.cash.transaction.p079ui.reward.CardTransactionRewardsBottomSheetFragment;
import com.robinhood.android.cash.transaction.p079ui.reward.CardTransactionRewardsBottomSheetViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.RhyRewardStore;
import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.models.p320db.mcduckling.MerchantCardReward;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CardTransactionRewardsBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyRewardStore", "Lcom/robinhood/librobinhood/data/store/RhyRewardStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyRewardStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CardTransactionRewardsBottomSheetDuxo extends OldBaseDuxo<CardTransactionRewardsBottomSheetViewState> implements HasSavedState {
    private final RhyRewardStore rhyRewardStore;
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
    public CardTransactionRewardsBottomSheetDuxo(RhyRewardStore rhyRewardStore, SavedStateHandle savedStateHandle) {
        super(new CardTransactionRewardsBottomSheetViewState.Loading(((CardTransactionRewardsBottomSheetFragment.Args) INSTANCE.getArgs(savedStateHandle)).getRewards()), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(rhyRewardStore, "rhyRewardStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhyRewardStore = rhyRewardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.rhyRewardStore.refresh(true);
        getLifecycleScope().launchWhenStarted(new C104661(null));
    }

    /* compiled from: CardTransactionRewardsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetDuxo$onStart$1", m3645f = "CardTransactionRewardsBottomSheetDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetDuxo$onStart$1 */
    static final class C104661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C104661(Continuation<? super C104661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardTransactionRewardsBottomSheetDuxo.this.new C104661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C104661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006a -> B:14:0x006d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Collection arrayList;
            CardTransactionRewardsBottomSheetDuxo cardTransactionRewardsBottomSheetDuxo;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<MerchantCardReward> rewards = ((CardTransactionRewardsBottomSheetFragment.Args) CardTransactionRewardsBottomSheetDuxo.INSTANCE.getArgs((HasSavedState) CardTransactionRewardsBottomSheetDuxo.this)).getRewards();
                CardTransactionRewardsBottomSheetDuxo cardTransactionRewardsBottomSheetDuxo2 = CardTransactionRewardsBottomSheetDuxo.this;
                arrayList = new ArrayList();
                cardTransactionRewardsBottomSheetDuxo = cardTransactionRewardsBottomSheetDuxo2;
                it = rewards.iterator();
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                arrayList = (Collection) this.L$1;
                cardTransactionRewardsBottomSheetDuxo = (CardTransactionRewardsBottomSheetDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                MerchantReward merchantReward = (MerchantReward) obj;
                if (merchantReward != null) {
                    arrayList.add(merchantReward);
                }
                if (it.hasNext()) {
                    MerchantCardReward merchantCardReward = (MerchantCardReward) it.next();
                    RhyRewardStore rhyRewardStore = cardTransactionRewardsBottomSheetDuxo.rhyRewardStore;
                    UUID merchantRewardId = merchantCardReward.getMerchantRewardId();
                    Intrinsics.checkNotNull(merchantRewardId);
                    Observable<MerchantReward> observableStreamMerchantReward = rhyRewardStore.streamMerchantReward(merchantRewardId);
                    this.L$0 = cardTransactionRewardsBottomSheetDuxo;
                    this.L$1 = arrayList;
                    this.L$2 = it;
                    this.label = 1;
                    obj = RxAwait3.awaitFirstOrNull(observableStreamMerchantReward, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    MerchantReward merchantReward2 = (MerchantReward) obj;
                    if (merchantReward2 != null) {
                    }
                    if (it.hasNext()) {
                        final List list = (List) arrayList;
                        CardTransactionRewardsBottomSheetDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetDuxo$onStart$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return CardTransactionRewardsBottomSheetDuxo.C104661.invokeSuspend$lambda$1(list, (CardTransactionRewardsBottomSheetViewState) obj2);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardTransactionRewardsBottomSheetViewState invokeSuspend$lambda$1(List list, CardTransactionRewardsBottomSheetViewState cardTransactionRewardsBottomSheetViewState) {
            return new CardTransactionRewardsBottomSheetViewState.Loaded(list);
        }
    }

    /* compiled from: CardTransactionRewardsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetDuxo;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Args;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CardTransactionRewardsBottomSheetDuxo, CardTransactionRewardsBottomSheetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardTransactionRewardsBottomSheetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CardTransactionRewardsBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardTransactionRewardsBottomSheetFragment.Args getArgs(CardTransactionRewardsBottomSheetDuxo cardTransactionRewardsBottomSheetDuxo) {
            return (CardTransactionRewardsBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cardTransactionRewardsBottomSheetDuxo);
        }
    }
}
