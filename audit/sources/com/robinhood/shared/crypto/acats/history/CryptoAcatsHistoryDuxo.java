package com.robinhood.shared.crypto.acats.history;

import androidx.lifecycle.SavedStateHandle;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailRequestDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailResponseDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoService;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryEvent;
import com.robinhood.shared.crypto.contracts.CryptoAcatsHistoryFragmentKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoAcatsHistoryDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryViewState;", "Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/contracts/CryptoAcatsHistoryFragmentKey;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cryptoService", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoService;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoService;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoAcatsHistoryDuxo extends BaseDuxo5<CryptoAcatsHistoryViewState, CryptoAcatsHistoryEvent> implements HasArgs<CryptoAcatsHistoryFragmentKey> {
    public static final int $stable = 8;
    private final CryptoService cryptoService;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoAcatsHistoryFragmentKey getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoAcatsHistoryFragmentKey) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoAcatsHistoryDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoService cryptoService) {
        super(new CryptoAcatsHistoryViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        this.savedStateHandle = savedStateHandle;
        this.cryptoService = cryptoService;
    }

    /* compiled from: CryptoAcatsHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryDuxo$onCreate$1", m3645f = "CryptoAcatsHistoryDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryDuxo$onCreate$1 */
    static final class C375481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C375481(Continuation<? super C375481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoAcatsHistoryDuxo.this.new C375481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C375481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoAcatsHistoryDuxo cryptoAcatsHistoryDuxo = CryptoAcatsHistoryDuxo.this;
                    String string2 = ((CryptoAcatsHistoryFragmentKey) cryptoAcatsHistoryDuxo.getArgs(cryptoAcatsHistoryDuxo.getSavedStateHandle())).getMigrationId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    CryptoMigrationsDetailRequestDto cryptoMigrationsDetailRequestDto = new CryptoMigrationsDetailRequestDto(string2);
                    CryptoService cryptoService = CryptoAcatsHistoryDuxo.this.cryptoService;
                    this.label = 1;
                    obj = cryptoService.CryptoMigrationsDetail(cryptoMigrationsDetailRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoAcatsHistoryDuxo.this.applyMutation(new AnonymousClass1((CryptoMigrationsDetailResponseDto) obj, null));
            } catch (Exception e) {
                CryptoAcatsHistoryDuxo.this.submit(new CryptoAcatsHistoryEvent.Error(e));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoAcatsHistoryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryDuxo$onCreate$1$1", m3645f = "CryptoAcatsHistoryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoAcatsHistoryViewState, Continuation<? super CryptoAcatsHistoryViewState>, Object> {
            final /* synthetic */ CryptoMigrationsDetailResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = cryptoMigrationsDetailResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoAcatsHistoryViewState cryptoAcatsHistoryViewState, Continuation<? super CryptoAcatsHistoryViewState> continuation) {
                return ((AnonymousClass1) create(cryptoAcatsHistoryViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CryptoAcatsHistoryViewState) this.L$0).copy(this.$response);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C375481(null));
    }
}
