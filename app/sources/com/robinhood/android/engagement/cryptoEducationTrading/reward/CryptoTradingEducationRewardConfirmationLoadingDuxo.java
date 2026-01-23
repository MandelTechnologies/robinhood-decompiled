package com.robinhood.android.engagement.cryptoEducationTrading.reward;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.engagement.cryptoEducationTrading.api.EducationRewardsConfirmationApi;
import com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiFractionalRewardClaimConfirmationResponse;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo2;
import com.robinhood.utils.Either2;
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

/* compiled from: CryptoTradingEducationRewardConfirmationLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationState;", "Lcom/robinhood/android/udf/HasSavedState;", "educationRewardsConfirmationApi", "Lcom/robinhood/android/engagement/cryptoEducationTrading/api/EducationRewardsConfirmationApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/engagement/cryptoEducationTrading/api/EducationRewardsConfirmationApi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-crypto-education-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CryptoTradingEducationRewardConfirmationLoadingDuxo extends BaseDuxo4<CryptoTradingEducationRewardConfirmationState> implements HasSavedState {
    private final EducationRewardsConfirmationApi educationRewardsConfirmationApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTradingEducationRewardConfirmationLoadingDuxo(EducationRewardsConfirmationApi educationRewardsConfirmationApi, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new CryptoTradingEducationRewardConfirmationState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(educationRewardsConfirmationApi, "educationRewardsConfirmationApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.educationRewardsConfirmationApi = educationRewardsConfirmationApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C145091(null), 3, null);
    }

    /* compiled from: CryptoTradingEducationRewardConfirmationLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingDuxo$onCreate$1", m3645f = "CryptoTradingEducationRewardConfirmationLoadingDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingDuxo$onCreate$1 */
    static final class C145091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145091(Continuation<? super C145091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTradingEducationRewardConfirmationLoadingDuxo.this.new C145091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EducationRewardsConfirmationApi educationRewardsConfirmationApi = CryptoTradingEducationRewardConfirmationLoadingDuxo.this.educationRewardsConfirmationApi;
                    String source = ((CryptoTradingEducationRewardConfirmationLoadingFragment.Args) CryptoTradingEducationRewardConfirmationLoadingDuxo.INSTANCE.getArgs((HasSavedState) CryptoTradingEducationRewardConfirmationLoadingDuxo.this)).getSource();
                    this.label = 1;
                    obj = educationRewardsConfirmationApi.getEducationRewardsConfirmationCard(source, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoTradingEducationRewardConfirmationLoadingDuxo.this.applyMutation(new AnonymousClass1((ApiFractionalRewardClaimConfirmationResponse) obj, null));
            } catch (Exception e) {
                CryptoTradingEducationRewardConfirmationLoadingDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTradingEducationRewardConfirmationLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingDuxo$onCreate$1$1", m3645f = "CryptoTradingEducationRewardConfirmationLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTradingEducationRewardConfirmationState, Continuation<? super CryptoTradingEducationRewardConfirmationState>, Object> {
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
            public final Object invoke(CryptoTradingEducationRewardConfirmationState cryptoTradingEducationRewardConfirmationState, Continuation<? super CryptoTradingEducationRewardConfirmationState> continuation) {
                return ((AnonymousClass1) create(cryptoTradingEducationRewardConfirmationState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CryptoTradingEducationRewardConfirmationState) this.L$0).copy(Either2.asLeft(UiRewardCertificateInfo2.toUiModel(this.$response)), this.$response.getPost_claim_alert());
            }
        }

        /* compiled from: CryptoTradingEducationRewardConfirmationLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingDuxo$onCreate$1$2", m3645f = "CryptoTradingEducationRewardConfirmationLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.engagement.cryptoEducationTrading.reward.CryptoTradingEducationRewardConfirmationLoadingDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoTradingEducationRewardConfirmationState, Continuation<? super CryptoTradingEducationRewardConfirmationState>, Object> {
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
            public final Object invoke(CryptoTradingEducationRewardConfirmationState cryptoTradingEducationRewardConfirmationState, Continuation<? super CryptoTradingEducationRewardConfirmationState> continuation) {
                return ((AnonymousClass2) create(cryptoTradingEducationRewardConfirmationState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoTradingEducationRewardConfirmationState.copy$default((CryptoTradingEducationRewardConfirmationState) this.L$0, Either2.asRight(this.$error), null, 2, null);
            }
        }
    }

    /* compiled from: CryptoTradingEducationRewardConfirmationLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationLoadingDuxo;", "Lcom/robinhood/android/engagement/cryptoEducationTrading/reward/CryptoTradingEducationRewardConfirmationLoadingFragment$Args;", "<init>", "()V", "feature-crypto-education-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTradingEducationRewardConfirmationLoadingDuxo, CryptoTradingEducationRewardConfirmationLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTradingEducationRewardConfirmationLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTradingEducationRewardConfirmationLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTradingEducationRewardConfirmationLoadingFragment.Args getArgs(CryptoTradingEducationRewardConfirmationLoadingDuxo cryptoTradingEducationRewardConfirmationLoadingDuxo) {
            return (CryptoTradingEducationRewardConfirmationLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTradingEducationRewardConfirmationLoadingDuxo);
        }
    }
}
