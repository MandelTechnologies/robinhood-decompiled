package com.robinhood.android.referral.rewardoffers.offersList;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOffersViewState3;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.RewardOffersStore;
import com.robinhood.librobinhood.data.store.RewardOffersStore2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RewardOffersDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDataState;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersViewState;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "rewardOffersStore", "Lcom/robinhood/librobinhood/data/store/RewardOffersStore;", "stateProvider", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RewardOffersStore;Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "getRewardOffersLandingScreen", "initialSource", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewardOfferDetails", "rewardOfferId", "Ljava/util/UUID;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RewardOffersDuxo extends BaseDuxo3<RewardOffersDataState, RewardOffersViewState, RewardOffersViewState3> implements HasSavedState {
    private final RewardOffersStore rewardOffersStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RewardOffersDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersDuxo", m3645f = "RewardOffersDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "getRewardOfferDetails")
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersDuxo$getRewardOfferDetails$1 */
    static final class C267971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C267971(Continuation<? super C267971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardOffersDuxo.this.getRewardOfferDetails(null, null, this);
        }
    }

    /* compiled from: RewardOffersDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersDuxo", m3645f = "RewardOffersDuxo.kt", m3646l = {44}, m3647m = "getRewardOffersLandingScreen")
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersDuxo$getRewardOffersLandingScreen$1 */
    static final class C267981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C267981(Continuation<? super C267981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardOffersDuxo.this.getRewardOffersLandingScreen(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardOffersDuxo(RewardOffersStore rewardOffersStore, RewardOffersStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RewardOffersDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rewardOffersStore, "rewardOffersStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rewardOffersStore = rewardOffersStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: RewardOffersDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDuxo;", "Lcom/robinhood/android/referral/contracts/RewardOfferIntentKey$Platform;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RewardOffersDuxo, RewardOfferIntentKey.Platform> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardOfferIntentKey.Platform getArgs(SavedStateHandle savedStateHandle) {
            return (RewardOfferIntentKey.Platform) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardOfferIntentKey.Platform getArgs(RewardOffersDuxo rewardOffersDuxo) {
            return (RewardOfferIntentKey.Platform) DuxoCompanion.DefaultImpls.getArgs(this, rewardOffersDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C267991(null));
    }

    /* compiled from: RewardOffersDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersDuxo$onCreate$1", m3645f = "RewardOffersDuxo.kt", m3646l = {36, 38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersDuxo$onCreate$1 */
    static final class C267991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C267991(Continuation<? super C267991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardOffersDuxo.this.new C267991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C267991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (r1.getRewardOffersLandingScreen(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r3.getRewardOfferDetails(r1, r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Companion companion = RewardOffersDuxo.INSTANCE;
                UUID rewardOfferId = ((RewardOfferIntentKey.Platform) companion.getArgs((HasSavedState) RewardOffersDuxo.this)).getRewardOfferId();
                if (rewardOfferId == null) {
                    RewardOffersDuxo rewardOffersDuxo = RewardOffersDuxo.this;
                    String initialSource = ((RewardOfferIntentKey.Platform) companion.getArgs((HasSavedState) rewardOffersDuxo)).getInitialSource();
                    this.label = 1;
                } else {
                    RewardOffersDuxo rewardOffersDuxo2 = RewardOffersDuxo.this;
                    String initialSource2 = ((RewardOfferIntentKey.Platform) companion.getArgs((HasSavedState) rewardOffersDuxo2)).getInitialSource();
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRewardOffersLandingScreen(String str, Continuation<? super Unit> continuation) {
        C267981 c267981;
        Object objM28550constructorimpl;
        if (continuation instanceof C267981) {
            c267981 = (C267981) continuation;
            int i = c267981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c267981.label = i - Integer.MIN_VALUE;
            } else {
                c267981 = new C267981(continuation);
            }
        }
        Object rewardOffersLandingScreen = c267981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c267981.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(rewardOffersLandingScreen);
                Result.Companion companion = Result.INSTANCE;
                RewardOffersStore rewardOffersStore = this.rewardOffersStore;
                c267981.label = 1;
                rewardOffersLandingScreen = rewardOffersStore.getRewardOffersLandingScreen(str, c267981);
                if (rewardOffersLandingScreen == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(rewardOffersLandingScreen);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((RewardOffersStore2) rewardOffersLandingScreen);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            RewardOffersStore2 rewardOffersStore2 = (RewardOffersStore2) objM28550constructorimpl;
            if (rewardOffersStore2 instanceof RewardOffersStore2.ReferralOfferDetails) {
                RewardOffersStore2.ReferralOfferDetails referralOfferDetails = (RewardOffersStore2.ReferralOfferDetails) rewardOffersStore2;
                submit(new RewardOffersViewState3.ShowReferralOffer(referralOfferDetails.getOfferId(), referralOfferDetails.getInitialSource(), referralOfferDetails.getSource()));
            } else if (rewardOffersStore2 instanceof RewardOffersStore2.NoAccess) {
                submit(RewardOffersViewState3.FinishFlow.INSTANCE);
            } else {
                applyMutation(new RewardOffersDuxo3(rewardOffersStore2, null));
            }
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            submit(new RewardOffersViewState3.LoadingError(thM28553exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRewardOfferDetails(UUID uuid, String str, Continuation<? super Unit> continuation) {
        C267971 c267971;
        Object objM28550constructorimpl;
        if (continuation instanceof C267971) {
            c267971 = (C267971) continuation;
            int i = c267971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c267971.label = i - Integer.MIN_VALUE;
            } else {
                c267971 = new C267971(continuation);
            }
        }
        Object rewardOfferDetails = c267971.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c267971.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(rewardOfferDetails);
                Result.Companion companion = Result.INSTANCE;
                RewardOffersStore rewardOffersStore = this.rewardOffersStore;
                c267971.label = 1;
                rewardOfferDetails = rewardOffersStore.getRewardOfferDetails(uuid, str, c267971);
                if (rewardOfferDetails == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(rewardOfferDetails);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((RewardOffersStore2.RewardOfferDetails) rewardOfferDetails);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            applyMutation(new RewardOffersDuxo2((RewardOffersStore2.RewardOfferDetails) objM28550constructorimpl, null));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            submit(new RewardOffersViewState3.LoadingError(thM28553exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
