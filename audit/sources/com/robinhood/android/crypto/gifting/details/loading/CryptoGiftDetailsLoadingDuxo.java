package com.robinhood.android.crypto.gifting.details.loading;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.crypto.gifting.CryptoGiftingApi;
import com.robinhood.android.crypto.gifting.details.loading.CryptoGiftDetailsLoadingDuxo;
import com.robinhood.android.crypto.gifting.details.loading.CryptoGiftDetailsLoadingFragment;
import com.robinhood.android.growth.util.ErrorHandlingExtensions;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.bonfire.cryptogifting.ApiCryptoGiftDetails;
import com.robinhood.models.p355ui.bonfire.cryptogifting.CryptoGiftDetails2;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoGiftDetailsLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/loading/CryptoGiftDetailsLoadingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/crypto/gifting/details/loading/CryptoGiftDetailsLoadingState;", "Lcom/robinhood/android/udf/HasSavedState;", "cryptoGiftingApi", "Lcom/robinhood/android/api/crypto/gifting/CryptoGiftingApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/crypto/gifting/CryptoGiftingApi;Lcom/robinhood/utils/moshi/LazyMoshi;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoGiftDetailsLoadingDuxo extends OldBaseDuxo<CryptoGiftDetailsLoadingState> implements HasSavedState {
    private final CryptoGiftingApi cryptoGiftingApi;
    private final LazyMoshi moshi;
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
    public CryptoGiftDetailsLoadingDuxo(CryptoGiftingApi cryptoGiftingApi, LazyMoshi moshi, SavedStateHandle savedStateHandle) {
        super(new CryptoGiftDetailsLoadingState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(cryptoGiftingApi, "cryptoGiftingApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cryptoGiftingApi = cryptoGiftingApi;
        this.moshi = moshi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C129111(null));
    }

    /* compiled from: CryptoGiftDetailsLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.gifting.details.loading.CryptoGiftDetailsLoadingDuxo$onCreate$1", m3645f = "CryptoGiftDetailsLoadingDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.gifting.details.loading.CryptoGiftDetailsLoadingDuxo$onCreate$1 */
    static final class C129111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129111(Continuation<? super C129111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoGiftDetailsLoadingDuxo.this.new C129111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoGiftingApi cryptoGiftingApi = CryptoGiftDetailsLoadingDuxo.this.cryptoGiftingApi;
                    UUID giftId = ((CryptoGiftDetailsLoadingFragment.Args) CryptoGiftDetailsLoadingDuxo.INSTANCE.getArgs((HasSavedState) CryptoGiftDetailsLoadingDuxo.this)).getGiftId();
                    this.label = 1;
                    obj = cryptoGiftingApi.getCryptoGiftDetails(giftId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                final ApiCryptoGiftDetails apiCryptoGiftDetails = (ApiCryptoGiftDetails) obj;
                CryptoGiftDetailsLoadingDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.gifting.details.loading.CryptoGiftDetailsLoadingDuxo$onCreate$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoGiftDetailsLoadingDuxo.C129111.invokeSuspend$lambda$0(apiCryptoGiftDetails, (CryptoGiftDetailsLoadingState) obj2);
                    }
                });
            } catch (Throwable th) {
                final CryptoGiftDetailsLoadingDuxo cryptoGiftDetailsLoadingDuxo = CryptoGiftDetailsLoadingDuxo.this;
                cryptoGiftDetailsLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.gifting.details.loading.CryptoGiftDetailsLoadingDuxo$onCreate$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoGiftDetailsLoadingDuxo.C129111.invokeSuspend$lambda$1(th, cryptoGiftDetailsLoadingDuxo, (CryptoGiftDetailsLoadingState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoGiftDetailsLoadingState invokeSuspend$lambda$0(ApiCryptoGiftDetails apiCryptoGiftDetails, CryptoGiftDetailsLoadingState cryptoGiftDetailsLoadingState) {
            return cryptoGiftDetailsLoadingState.copy(Either2.asLeft(CryptoGiftDetails2.toUiModel(apiCryptoGiftDetails)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoGiftDetailsLoadingState invokeSuspend$lambda$1(Throwable th, CryptoGiftDetailsLoadingDuxo cryptoGiftDetailsLoadingDuxo, CryptoGiftDetailsLoadingState cryptoGiftDetailsLoadingState) {
            return cryptoGiftDetailsLoadingState.copy(Either2.asRight(new UiEvent(ErrorHandlingExtensions.toErrorData(th, cryptoGiftDetailsLoadingDuxo.moshi))));
        }
    }

    /* compiled from: CryptoGiftDetailsLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/loading/CryptoGiftDetailsLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/crypto/gifting/details/loading/CryptoGiftDetailsLoadingDuxo;", "Lcom/robinhood/android/crypto/gifting/details/loading/CryptoGiftDetailsLoadingFragment$Args;", "<init>", "()V", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoGiftDetailsLoadingDuxo, CryptoGiftDetailsLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoGiftDetailsLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoGiftDetailsLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoGiftDetailsLoadingFragment.Args getArgs(CryptoGiftDetailsLoadingDuxo cryptoGiftDetailsLoadingDuxo) {
            return (CryptoGiftDetailsLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoGiftDetailsLoadingDuxo);
        }
    }
}
