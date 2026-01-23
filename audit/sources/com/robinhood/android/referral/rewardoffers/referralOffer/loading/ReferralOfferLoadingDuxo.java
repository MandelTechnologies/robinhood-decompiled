package com.robinhood.android.referral.rewardoffers.referralOffer.loading;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.growth.model.ErrorData;
import com.robinhood.android.growth.util.ErrorHandlingExtensions;
import com.robinhood.android.referral.rewardoffers.referralOffer.ReferralMultiSelectContactsExperiment;
import com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.referraloffer.ApiReferralOfferDetailsV2;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferDetails;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferDetails2;
import com.robinhood.prefs.Installation;
import com.robinhood.referral.api.RewardsApi;
import com.robinhood.utils.moshi.LazyMoshi;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: ReferralOfferLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingState;", "Lcom/robinhood/android/growth/model/ErrorData;", "Lcom/robinhood/android/udf/HasSavedState;", "rewardsApi", "Lcom/robinhood/referral/api/RewardsApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "installation", "Lcom/robinhood/prefs/Installation;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/referral/api/RewardsApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ReferralOfferLoadingDuxo extends BaseDuxo5<ReferralOfferLoadingState, ErrorData> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final Installation installation;
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
    public ReferralOfferLoadingDuxo(RewardsApi rewardsApi, ExperimentsStore experimentsStore, LazyMoshi moshi, Installation installation, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ReferralOfferLoadingState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(rewardsApi, "rewardsApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rewardsApi = rewardsApi;
        this.experimentsStore = experimentsStore;
        this.moshi = moshi;
        this.installation = installation;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C268941(null));
    }

    /* compiled from: ReferralOfferLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingDuxo$onCreate$1", m3645f = "ReferralOfferLoadingDuxo.kt", m3646l = {45, 85}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingDuxo$onCreate$1 */
    static final class C268941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C268941(Continuation<? super C268941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferLoadingDuxo.this.new C268941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
        
            if (r1 == r6) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object rewardOfferDetailsV2;
            ApiReferralOfferDetailsV2 apiReferralOfferDetailsV2;
            Object objAwait;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                ReferralOfferLoadingDuxo referralOfferLoadingDuxo = ReferralOfferLoadingDuxo.this;
                referralOfferLoadingDuxo.submit(ErrorHandlingExtensions.toErrorData(e, referralOfferLoadingDuxo.moshi));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Companion companion = ReferralOfferLoadingDuxo.INSTANCE;
                String str = ((ReferralOfferLoadingFragment.Args) companion.getArgs((HasSavedState) ReferralOfferLoadingDuxo.this)).isFromOnboarding() ? "onboarding" : null;
                RewardsApi rewardsApi = ReferralOfferLoadingDuxo.this.rewardsApi;
                String string2 = ((ReferralOfferLoadingFragment.Args) companion.getArgs((HasSavedState) ReferralOfferLoadingDuxo.this)).getOfferId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                UUID instrumentId = ((ReferralOfferLoadingFragment.Args) companion.getArgs((HasSavedState) ReferralOfferLoadingDuxo.this)).getInstrumentId();
                String strMo2745id = ReferralOfferLoadingDuxo.this.installation.mo2745id();
                this.label = 1;
                rewardOfferDetailsV2 = rewardsApi.getRewardOfferDetailsV2(string2, instrumentId, strMo2745id, str, this);
                if (rewardOfferDetailsV2 == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiReferralOfferDetailsV2 = (ApiReferralOfferDetailsV2) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait = obj;
                ReferralOfferLoadingDuxo referralOfferLoadingDuxo2 = ReferralOfferLoadingDuxo.this;
                referralOfferLoadingDuxo2.applyMutation(new AnonymousClass1(apiReferralOfferDetailsV2, (Boolean) objAwait, referralOfferLoadingDuxo2, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            rewardOfferDetailsV2 = obj;
            apiReferralOfferDetailsV2 = (ApiReferralOfferDetailsV2) rewardOfferDetailsV2;
            Single singleFirst = ExperimentsProvider.DefaultImpls.streamState$default(ReferralOfferLoadingDuxo.this.experimentsStore, new Experiment[]{ReferralMultiSelectContactsExperiment.INSTANCE}, false, null, 6, null).first(boxing.boxBoolean(false));
            Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
            this.L$0 = apiReferralOfferDetailsV2;
            this.label = 2;
            objAwait = RxAwait3.await(singleFirst, this);
        }

        /* compiled from: ReferralOfferLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingDuxo$onCreate$1$1", m3645f = "ReferralOfferLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.loading.ReferralOfferLoadingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ReferralOfferLoadingState, Continuation<? super ReferralOfferLoadingState>, Object> {
            final /* synthetic */ ApiReferralOfferDetailsV2 $response;
            final /* synthetic */ Boolean $variant;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ReferralOfferLoadingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiReferralOfferDetailsV2 apiReferralOfferDetailsV2, Boolean bool, ReferralOfferLoadingDuxo referralOfferLoadingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = apiReferralOfferDetailsV2;
                this.$variant = bool;
                this.this$0 = referralOfferLoadingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, this.$variant, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ReferralOfferLoadingState referralOfferLoadingState, Continuation<? super ReferralOfferLoadingState> continuation) {
                return ((AnonymousClass1) create(referralOfferLoadingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ReferralOfferLoadingState referralOfferLoadingState = (ReferralOfferLoadingState) this.L$0;
                ReferralOfferDetails uiModel = ReferralOfferDetails2.toUiModel(this.$response);
                Boolean bool = this.$variant;
                Intrinsics.checkNotNull(bool);
                boolean zBooleanValue = bool.booleanValue();
                Companion companion = ReferralOfferLoadingDuxo.INSTANCE;
                return referralOfferLoadingState.copy(new ReferralOfferLoadingResult(uiModel, zBooleanValue, ((ReferralOfferLoadingFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getInitialSource(), ((ReferralOfferLoadingFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getSource()));
            }
        }
    }

    /* compiled from: ReferralOfferLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingDuxo;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/loading/ReferralOfferLoadingFragment$Args;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReferralOfferLoadingDuxo, ReferralOfferLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReferralOfferLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ReferralOfferLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReferralOfferLoadingFragment.Args getArgs(ReferralOfferLoadingDuxo referralOfferLoadingDuxo) {
            return (ReferralOfferLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, referralOfferLoadingDuxo);
        }
    }
}
