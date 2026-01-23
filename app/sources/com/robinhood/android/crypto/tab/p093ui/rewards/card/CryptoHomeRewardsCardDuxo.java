package com.robinhood.android.crypto.tab.p093ui.rewards.card;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.rewards.models.p394db.RewardsSummary;
import com.robinhood.shared.rewards.store.RewardsSummaryStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoHomeRewardsCardDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/CryptoHomeRewardsCardDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/CryptoHomeRewardsCardDataState;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/CryptoHomeRewardsCardViewState;", "rewardsSummaryStore", "Lcom/robinhood/shared/rewards/store/RewardsSummaryStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/CryptoHomeRewardsCardStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/rewards/store/RewardsSummaryStore;Lcom/robinhood/android/crypto/tab/ui/rewards/card/CryptoHomeRewardsCardStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeRewardsCardDuxo extends BaseDuxo<CryptoHomeRewardsCardDataState, CryptoHomeRewardsCardViewState> {
    public static final int $stable = 8;
    private final RewardsSummaryStore rewardsSummaryStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeRewardsCardDuxo(RewardsSummaryStore rewardsSummaryStore, CryptoHomeRewardsCardStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoHomeRewardsCardDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rewardsSummaryStore, "rewardsSummaryStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rewardsSummaryStore = rewardsSummaryStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C132141(null), 3, null);
    }

    /* compiled from: CryptoHomeRewardsCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.card.CryptoHomeRewardsCardDuxo$onStart$1", m3645f = "CryptoHomeRewardsCardDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.CryptoHomeRewardsCardDuxo$onStart$1 */
    static final class C132141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132141(Continuation<? super C132141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeRewardsCardDuxo.this.new C132141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<RewardsSummary> flowStream = CryptoHomeRewardsCardDuxo.this.rewardsSummaryStore.stream();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeRewardsCardDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStream, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeRewardsCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "rewardsSummary", "Lcom/robinhood/shared/rewards/models/db/RewardsSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.card.CryptoHomeRewardsCardDuxo$onStart$1$1", m3645f = "CryptoHomeRewardsCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.CryptoHomeRewardsCardDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RewardsSummary, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeRewardsCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeRewardsCardDuxo cryptoHomeRewardsCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeRewardsCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RewardsSummary rewardsSummary, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(rewardsSummary, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeRewardsCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/CryptoHomeRewardsCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.card.CryptoHomeRewardsCardDuxo$onStart$1$1$1", m3645f = "CryptoHomeRewardsCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.CryptoHomeRewardsCardDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497611 extends ContinuationImpl7 implements Function2<CryptoHomeRewardsCardDataState, Continuation<? super CryptoHomeRewardsCardDataState>, Object> {
                final /* synthetic */ RewardsSummary $rewardsSummary;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497611(RewardsSummary rewardsSummary, Continuation<? super C497611> continuation) {
                    super(2, continuation);
                    this.$rewardsSummary = rewardsSummary;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497611 c497611 = new C497611(this.$rewardsSummary, continuation);
                    c497611.L$0 = obj;
                    return c497611;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeRewardsCardDataState cryptoHomeRewardsCardDataState, Continuation<? super CryptoHomeRewardsCardDataState> continuation) {
                    return ((C497611) create(cryptoHomeRewardsCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CryptoHomeRewardsCardDataState) this.L$0).copy(this.$rewardsSummary);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497611((RewardsSummary) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
