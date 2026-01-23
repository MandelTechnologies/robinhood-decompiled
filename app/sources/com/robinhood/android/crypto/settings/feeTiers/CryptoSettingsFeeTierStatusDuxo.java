package com.robinhood.android.crypto.settings.feeTiers;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider2;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoSettingsFeeTierStatusDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusDataState;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState;", "cryptoFeeTierPreferencesProvider", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferencesProvider;", "stateProvider", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferencesProvider;Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoSettingsFeeTierStatusDuxo extends BaseDuxo<CryptoSettingsFeeTierStatusDataState, CryptoSettingsFeeTierStatusViewState> {
    public static final int $stable = 8;
    private final CryptoFeeTierPreferencesProvider cryptoFeeTierPreferencesProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoSettingsFeeTierStatusDuxo(CryptoFeeTierPreferencesProvider cryptoFeeTierPreferencesProvider, CryptoSettingsFeeTierStatusDuxo2 stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoSettingsFeeTierStatusDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoFeeTierPreferencesProvider, "cryptoFeeTierPreferencesProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoFeeTierPreferencesProvider = cryptoFeeTierPreferencesProvider;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C130111(null));
    }

    /* compiled from: CryptoSettingsFeeTierStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusDuxo$onCreate$1", m3645f = "CryptoSettingsFeeTierStatusDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusDuxo$onCreate$1 */
    static final class C130111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C130111(Continuation<? super C130111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C130111 c130111 = CryptoSettingsFeeTierStatusDuxo.this.new C130111(continuation);
            c130111.L$0 = obj;
            return c130111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C130111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CryptoFeeTierPreferencesProvider2> flowStreamCryptoFeeTierPreferences = CryptoSettingsFeeTierStatusDuxo.this.cryptoFeeTierPreferencesProvider.streamCryptoFeeTierPreferences((CoroutineScope) this.L$0);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoSettingsFeeTierStatusDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoFeeTierPreferences, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoSettingsFeeTierStatusDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "feeTierPreferences", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusDuxo$onCreate$1$1", m3645f = "CryptoSettingsFeeTierStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoFeeTierPreferencesProvider2, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoSettingsFeeTierStatusDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoSettingsFeeTierStatusDuxo cryptoSettingsFeeTierStatusDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoSettingsFeeTierStatusDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoFeeTierPreferencesProvider2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoSettingsFeeTierStatusDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusDuxo$onCreate$1$1$1", m3645f = "CryptoSettingsFeeTierStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497421 extends ContinuationImpl7 implements Function2<CryptoSettingsFeeTierStatusDataState, Continuation<? super CryptoSettingsFeeTierStatusDataState>, Object> {
                final /* synthetic */ CryptoFeeTierPreferencesProvider2 $feeTierPreferences;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497421(CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2, Continuation<? super C497421> continuation) {
                    super(2, continuation);
                    this.$feeTierPreferences = cryptoFeeTierPreferencesProvider2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497421 c497421 = new C497421(this.$feeTierPreferences, continuation);
                    c497421.L$0 = obj;
                    return c497421;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoSettingsFeeTierStatusDataState cryptoSettingsFeeTierStatusDataState, Continuation<? super CryptoSettingsFeeTierStatusDataState> continuation) {
                    return ((C497421) create(cryptoSettingsFeeTierStatusDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CryptoSettingsFeeTierStatusDataState) this.L$0).copy(this.$feeTierPreferences);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497421((CryptoFeeTierPreferencesProvider2) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
