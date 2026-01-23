package com.robinhood.android.retirement.p239ui.signup.rewards;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnRewardResponse;
import com.robinhood.android.retirement.contracts.RetirementLearnAndEarnReward;
import com.robinhood.android.retirement.p239ui.signup.rewards.RetirementLearnAndEarnRewardViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementLearnAndEarnRewardDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0011\u0012B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState;", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardDuxo$NetworkErrorEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "NetworkErrorEvent", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementLearnAndEarnRewardDuxo extends BaseDuxo5<RetirementLearnAndEarnRewardViewState, NetworkErrorEvent> implements HasSavedState {
    private final RetirementApi retirementApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementLearnAndEarnRewardDuxo(RetirementApi retirementApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(RetirementLearnAndEarnRewardViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.retirementApi = retirementApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C272561(null));
    }

    /* compiled from: RetirementLearnAndEarnRewardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardDuxo$onCreate$1", m3645f = "RetirementLearnAndEarnRewardDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardDuxo$onCreate$1 */
    static final class C272561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C272561(Continuation<? super C272561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272561 c272561 = RetirementLearnAndEarnRewardDuxo.this.new C272561(continuation);
            c272561.L$0 = obj;
            return c272561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementLearnAndEarnRewardDuxo retirementLearnAndEarnRewardDuxo = RetirementLearnAndEarnRewardDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    RetirementApi retirementApi = retirementLearnAndEarnRewardDuxo.retirementApi;
                    UUID rewardId = ((RetirementLearnAndEarnReward) RetirementLearnAndEarnRewardDuxo.INSTANCE.getArgs((HasSavedState) retirementLearnAndEarnRewardDuxo)).getRewardId();
                    this.label = 1;
                    obj = retirementApi.getLearnAndEarnReward(rewardId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiRetirementLearnAndEarnRewardResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            RetirementLearnAndEarnRewardDuxo retirementLearnAndEarnRewardDuxo2 = RetirementLearnAndEarnRewardDuxo.this;
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                retirementLearnAndEarnRewardDuxo2.applyMutation(new RetirementLearnAndEarnRewardDuxo2((ApiRetirementLearnAndEarnRewardResponse) objM28550constructorimpl, null));
            } else {
                retirementLearnAndEarnRewardDuxo2.submit(NetworkErrorEvent.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RetirementLearnAndEarnRewardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardDuxo$NetworkErrorEvent;", "", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NetworkErrorEvent {
        public static final int $stable = 0;
        public static final NetworkErrorEvent INSTANCE = new NetworkErrorEvent();

        private NetworkErrorEvent() {
        }
    }

    /* compiled from: RetirementLearnAndEarnRewardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardDuxo;", "Lcom/robinhood/android/retirement/contracts/RetirementLearnAndEarnReward;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementLearnAndEarnRewardDuxo, RetirementLearnAndEarnReward> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementLearnAndEarnReward getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementLearnAndEarnReward) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementLearnAndEarnReward getArgs(RetirementLearnAndEarnRewardDuxo retirementLearnAndEarnRewardDuxo) {
            return (RetirementLearnAndEarnReward) DuxoCompanion.DefaultImpls.getArgs(this, retirementLearnAndEarnRewardDuxo);
        }
    }
}
