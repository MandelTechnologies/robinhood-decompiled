package com.robinhood.android.referral.fractionalRewards.loading;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiFractionalRewardInfo;
import com.robinhood.models.p355ui.FractionalRewardInfo4;
import com.robinhood.referral.api.RewardsApi;
import com.robinhood.udf.UiEvent;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FractionalRewardLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDataState;", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rewardsApi", "Lcom/robinhood/referral/api/RewardsApi;", "stateProvider", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/referral/api/RewardsApi;Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "copyError", "throwable", "", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FractionalRewardLoadingDuxo extends BaseDuxo<FractionalRewardLoadingDataState, FractionalRewardLoadingViewState> implements HasSavedState {
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
    public FractionalRewardLoadingDuxo(RewardsApi rewardsApi, FractionalRewardLoadingStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new FractionalRewardLoadingDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rewardsApi = rewardsApi;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: FractionalRewardLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingDuxo$onCreate$1", m3645f = "FractionalRewardLoadingDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingDuxo$onCreate$1 */
    static final class C266961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C266961(Continuation<? super C266961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FractionalRewardLoadingDuxo.this.new C266961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RewardsApi rewardsApi = FractionalRewardLoadingDuxo.this.rewardsApi;
                    UUID rewardId = ((FractionalRewardLoadingFragment.Args) FractionalRewardLoadingDuxo.INSTANCE.getArgs((HasSavedState) FractionalRewardLoadingDuxo.this)).getRewardId();
                    this.label = 1;
                    obj = rewardsApi.getFractionalRewardInfo(rewardId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FractionalRewardLoadingDuxo.this.applyMutation(new AnonymousClass1((ApiFractionalRewardInfo) obj, null));
            } catch (Throwable th) {
                FractionalRewardLoadingDuxo.this.copyError(th);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: FractionalRewardLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingDuxo$onCreate$1$1", m3645f = "FractionalRewardLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FractionalRewardLoadingDataState, Continuation<? super FractionalRewardLoadingDataState>, Object> {
            final /* synthetic */ ApiFractionalRewardInfo $rewardInfo;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiFractionalRewardInfo apiFractionalRewardInfo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$rewardInfo = apiFractionalRewardInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$rewardInfo, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FractionalRewardLoadingDataState fractionalRewardLoadingDataState, Continuation<? super FractionalRewardLoadingDataState> continuation) {
                return ((AnonymousClass1) create(fractionalRewardLoadingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FractionalRewardLoadingDataState.copy$default((FractionalRewardLoadingDataState) this.L$0, null, FractionalRewardInfo4.toUiModel(this.$rewardInfo), 1, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C266961(null), 3, null);
    }

    /* compiled from: FractionalRewardLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingDuxo$copyError$1", m3645f = "FractionalRewardLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingDuxo$copyError$1 */
    static final class C266951 extends ContinuationImpl7 implements Function2<FractionalRewardLoadingDataState, Continuation<? super FractionalRewardLoadingDataState>, Object> {
        final /* synthetic */ Throwable $throwable;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266951(Throwable th, Continuation<? super C266951> continuation) {
            super(2, continuation);
            this.$throwable = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C266951 c266951 = new C266951(this.$throwable, continuation);
            c266951.L$0 = obj;
            return c266951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FractionalRewardLoadingDataState fractionalRewardLoadingDataState, Continuation<? super FractionalRewardLoadingDataState> continuation) {
            return ((C266951) create(fractionalRewardLoadingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FractionalRewardLoadingDataState.copy$default((FractionalRewardLoadingDataState) this.L$0, new UiEvent(this.$throwable), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyError(Throwable throwable) {
        applyMutation(new C266951(throwable, null));
    }

    /* compiled from: FractionalRewardLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDuxo;", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Args;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FractionalRewardLoadingDuxo, FractionalRewardLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FractionalRewardLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (FractionalRewardLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FractionalRewardLoadingFragment.Args getArgs(FractionalRewardLoadingDuxo fractionalRewardLoadingDuxo) {
            return (FractionalRewardLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, fractionalRewardLoadingDuxo);
        }
    }
}
