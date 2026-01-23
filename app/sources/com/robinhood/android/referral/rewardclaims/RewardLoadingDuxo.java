package com.robinhood.android.referral.rewardclaims;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.growth.util.ErrorHandlingExtensions;
import com.robinhood.android.referral.rewardclaims.RewardLoadingFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.bonfire.ApiRewardInfoResponse;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo2;
import com.robinhood.referral.api.RewardsApi;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either2;
import com.robinhood.utils.moshi.LazyMoshi;
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

/* compiled from: RewardLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardclaims/RewardLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/referral/rewardclaims/RewardLoadingState;", "Lcom/robinhood/android/udf/HasSavedState;", "rewardsApi", "Lcom/robinhood/referral/api/RewardsApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/referral/api/RewardsApi;Lcom/robinhood/utils/moshi/LazyMoshi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RewardLoadingDuxo extends BaseDuxo4<RewardLoadingState> implements HasSavedState {
    private final LazyMoshi moshi;
    private final RewardsApi rewardsApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardLoadingDuxo(RewardsApi rewardsApi, LazyMoshi moshi, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new RewardLoadingState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rewardsApi = rewardsApi;
        this.moshi = moshi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C267831(null));
    }

    /* compiled from: RewardLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardclaims.RewardLoadingDuxo$onCreate$1", m3645f = "RewardLoadingDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardclaims.RewardLoadingDuxo$onCreate$1 */
    static final class C267831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C267831(Continuation<? super C267831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardLoadingDuxo.this.new C267831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C267831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RewardsApi rewardsApi = RewardLoadingDuxo.this.rewardsApi;
                    Companion companion = RewardLoadingDuxo.INSTANCE;
                    String rewardType = ((RewardLoadingFragment.Args) companion.getArgs((HasSavedState) RewardLoadingDuxo.this)).getRewardType();
                    UUID rewardId = ((RewardLoadingFragment.Args) companion.getArgs((HasSavedState) RewardLoadingDuxo.this)).getRewardId();
                    this.label = 1;
                    obj = rewardsApi.getRewardInfoOrError(rewardType, rewardId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                RewardLoadingDuxo.this.applyMutation(new AnonymousClass1((ApiRewardInfoResponse) obj, null));
            } catch (Exception e) {
                RewardLoadingDuxo rewardLoadingDuxo = RewardLoadingDuxo.this;
                rewardLoadingDuxo.applyMutation(new AnonymousClass2(e, rewardLoadingDuxo, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RewardLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardclaims/RewardLoadingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardclaims.RewardLoadingDuxo$onCreate$1$1", m3645f = "RewardLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.rewardclaims.RewardLoadingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RewardLoadingState, Continuation<? super RewardLoadingState>, Object> {
            final /* synthetic */ ApiRewardInfoResponse $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiRewardInfoResponse apiRewardInfoResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = apiRewardInfoResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RewardLoadingState rewardLoadingState, Continuation<? super RewardLoadingState> continuation) {
                return ((AnonymousClass1) create(rewardLoadingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((RewardLoadingState) this.L$0).copy(Either2.asLeft(UiRewardCertificateInfo2.toUiModel(this.$response)));
            }
        }

        /* compiled from: RewardLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardclaims/RewardLoadingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardclaims.RewardLoadingDuxo$onCreate$1$2", m3645f = "RewardLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.rewardclaims.RewardLoadingDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<RewardLoadingState, Continuation<? super RewardLoadingState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f4880$e;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RewardLoadingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, RewardLoadingDuxo rewardLoadingDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4880$e = exc;
                this.this$0 = rewardLoadingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4880$e, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RewardLoadingState rewardLoadingState, Continuation<? super RewardLoadingState> continuation) {
                return ((AnonymousClass2) create(rewardLoadingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((RewardLoadingState) this.L$0).copy(Either2.asRight(new UiEvent(ErrorHandlingExtensions.toErrorData(this.f4880$e, this.this$0.moshi))));
            }
        }
    }

    /* compiled from: RewardLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardclaims/RewardLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/referral/rewardclaims/RewardLoadingDuxo;", "Lcom/robinhood/android/referral/rewardclaims/RewardLoadingFragment$Args;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RewardLoadingDuxo, RewardLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RewardLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardLoadingFragment.Args getArgs(RewardLoadingDuxo rewardLoadingDuxo) {
            return (RewardLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, rewardLoadingDuxo);
        }
    }
}
