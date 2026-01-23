package com.robinhood.android.referral.fractionalRewards.claimInProgress;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.api.bonfire.ApiFractionalRewardClaimConfirmationResponse;
import com.robinhood.models.api.bonfire.ApiFractionalRewardClaimRequest;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo2;
import com.robinhood.referral.api.RewardsApi;
import com.robinhood.utils.Either2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FractionalRewardClaimInProgressDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressState;", "Lcom/robinhood/android/udf/HasSavedState;", "rewardsApi", "Lcom/robinhood/referral/api/RewardsApi;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/referral/api/RewardsApi;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FractionalRewardClaimInProgressDuxo extends BaseDuxo4<FractionalRewardClaimInProgressState> implements HasSavedState {
    private final CardManager cardManager;
    private final RewardsApi rewardsApi;
    private final SavedStateHandle savedStateHandle;
    private final BaseSortingHatStore sortingHatStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FractionalRewardClaimInProgressDuxo(RewardsApi rewardsApi, CardManager cardManager, BaseSortingHatStore sortingHatStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new FractionalRewardClaimInProgressState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rewardsApi = rewardsApi;
        this.cardManager = cardManager;
        this.sortingHatStore = sortingHatStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C266681(null));
    }

    /* compiled from: FractionalRewardClaimInProgressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressDuxo$onCreate$1", m3645f = "FractionalRewardClaimInProgressDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressDuxo$onCreate$1 */
    static final class C266681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C266681(Continuation<? super C266681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FractionalRewardClaimInProgressDuxo.this.new C266681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RewardsApi rewardsApi = FractionalRewardClaimInProgressDuxo.this.rewardsApi;
                    Companion companion = FractionalRewardClaimInProgressDuxo.INSTANCE;
                    UUID rewardId = ((FractionalRewardClaimInProgressFragment.Args) companion.getArgs((HasSavedState) FractionalRewardClaimInProgressDuxo.this)).getRewardId();
                    ApiFractionalRewardClaimRequest apiFractionalRewardClaimRequest = new ApiFractionalRewardClaimRequest(((FractionalRewardClaimInProgressFragment.Args) companion.getArgs((HasSavedState) FractionalRewardClaimInProgressDuxo.this)).getInstrumentId());
                    this.label = 1;
                    obj = rewardsApi.claimFractionalReward(rewardId, apiFractionalRewardClaimRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FractionalRewardClaimInProgressDuxo.this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
                FractionalRewardClaimInProgressDuxo.this.cardManager.invalidateCardsBestEffort();
                FractionalRewardClaimInProgressDuxo.this.applyMutation(new AnonymousClass1((ApiFractionalRewardClaimConfirmationResponse) obj, null));
            } catch (Exception e) {
                FractionalRewardClaimInProgressDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: FractionalRewardClaimInProgressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressDuxo$onCreate$1$1", m3645f = "FractionalRewardClaimInProgressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FractionalRewardClaimInProgressState, Continuation<? super FractionalRewardClaimInProgressState>, Object> {
            final /* synthetic */ ApiFractionalRewardClaimConfirmationResponse $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiFractionalRewardClaimConfirmationResponse apiFractionalRewardClaimConfirmationResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = apiFractionalRewardClaimConfirmationResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FractionalRewardClaimInProgressState fractionalRewardClaimInProgressState, Continuation<? super FractionalRewardClaimInProgressState> continuation) {
                return ((AnonymousClass1) create(fractionalRewardClaimInProgressState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((FractionalRewardClaimInProgressState) this.L$0).copy(Either2.asLeft(UiRewardCertificateInfo2.toUiModel(this.$response)), this.$response.getPost_claim_alert());
            }
        }

        /* compiled from: FractionalRewardClaimInProgressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressDuxo$onCreate$1$2", m3645f = "FractionalRewardClaimInProgressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.fractionalRewards.claimInProgress.FractionalRewardClaimInProgressDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FractionalRewardClaimInProgressState, Continuation<? super FractionalRewardClaimInProgressState>, Object> {
            final /* synthetic */ Exception $error;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$error = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$error, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FractionalRewardClaimInProgressState fractionalRewardClaimInProgressState, Continuation<? super FractionalRewardClaimInProgressState> continuation) {
                return ((AnonymousClass2) create(fractionalRewardClaimInProgressState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FractionalRewardClaimInProgressState.copy$default((FractionalRewardClaimInProgressState) this.L$0, Either2.asRight(this.$error), null, 2, null);
            }
        }
    }

    /* compiled from: FractionalRewardClaimInProgressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressDuxo;", "Lcom/robinhood/android/referral/fractionalRewards/claimInProgress/FractionalRewardClaimInProgressFragment$Args;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FractionalRewardClaimInProgressDuxo, FractionalRewardClaimInProgressFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FractionalRewardClaimInProgressFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (FractionalRewardClaimInProgressFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FractionalRewardClaimInProgressFragment.Args getArgs(FractionalRewardClaimInProgressDuxo fractionalRewardClaimInProgressDuxo) {
            return (FractionalRewardClaimInProgressFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, fractionalRewardClaimInProgressDuxo);
        }
    }
}
