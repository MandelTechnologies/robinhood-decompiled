package com.robinhood.shared.crypto.staking.staking.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingEvent;
import com.robinhood.shared.crypto.staking.staking.utils.ErrorHandlingUtils;
import com.robinhood.shared.crypto.staking.staking.utils.StakingCrashReporter;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoStakingOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002\u0018\u0019B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDataState;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo$InitArgs;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "acceptStakingEnrollment", "InitArgs", "Companion", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingOnboardingDuxo extends BaseDuxo3<CryptoStakingOnboardingDataState, CryptoStakingOnboardingViewState, CryptoStakingOnboardingEvent> implements HasArgs<InitArgs> {
    private final CryptoStakingStore cryptoStakingStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStakingOnboardingDuxo(CurrencyPairV2Store currencyPairStore, CryptoStakingStore cryptoStakingStore, SavedStateHandle savedStateHandle, CryptoStakingOnboardingStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoStakingOnboardingDataState(null, null, false, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.currencyPairStore = currencyPairStore;
        this.cryptoStakingStore = cryptoStakingStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: CryptoStakingOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1 */
    static final class C378521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C378521(Continuation<? super C378521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C378521 c378521 = CryptoStakingOnboardingDuxo.this.new C378521(continuation);
            c378521.L$0 = obj;
            return c378521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoStakingOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoStakingOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoStakingOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoStakingOnboardingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$1", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506891 extends ContinuationImpl7 implements Function2<CryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C506891(Continuation<? super C506891> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506891 c506891 = new C506891(continuation);
                    c506891.L$0 = obj;
                    return c506891;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoStakingOnboardingDataState cryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState> continuation) {
                    return ((C506891) create(cryptoStakingOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoStakingOnboardingDataState.copy$default((CryptoStakingOnboardingDataState) this.L$0, null, null, false, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506891(null));
                    Flow flowM28818catch = FlowKt.m28818catch(this.this$0.currencyPairStore.streamCurrencyPairFlow(((InitArgs) CryptoStakingOnboardingDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getCurrencyPairId()), new AnonymousClass2(this.this$0, null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM28818catch, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: CryptoStakingOnboardingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$2", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super UiCurrencyPair>, Throwable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoStakingOnboardingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(3, continuation);
                    this.this$0 = cryptoStakingOnboardingDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super UiCurrencyPair> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = th;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoStakingOnboardingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$2$1", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C506901 extends ContinuationImpl7 implements Function2<CryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState>, Object> {
                    final /* synthetic */ Throwable $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C506901(Throwable th, Continuation<? super C506901> continuation) {
                        super(2, continuation);
                        this.$it = th;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C506901 c506901 = new C506901(this.$it, continuation);
                        c506901.L$0 = obj;
                        return c506901;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoStakingOnboardingDataState cryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState> continuation) {
                        return ((C506901) create(cryptoStakingOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoStakingOnboardingDataState.copy$default((CryptoStakingOnboardingDataState) this.L$0, null, this.$it, false, 5, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506901((Throwable) this.L$0, null));
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: CryptoStakingOnboardingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$3", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoStakingOnboardingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoStakingOnboardingDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoStakingOnboardingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$3$1", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$onCreate$1$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C506911 extends ContinuationImpl7 implements Function2<CryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState>, Object> {
                    final /* synthetic */ UiCurrencyPair $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C506911(UiCurrencyPair uiCurrencyPair, Continuation<? super C506911> continuation) {
                        super(2, continuation);
                        this.$it = uiCurrencyPair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C506911 c506911 = new C506911(this.$it, continuation);
                        c506911.L$0 = obj;
                        return c506911;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoStakingOnboardingDataState cryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState> continuation) {
                        return ((C506911) create(cryptoStakingOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoStakingOnboardingDataState.copy$default((CryptoStakingOnboardingDataState) this.L$0, this.$it, null, false, 6, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506911((UiCurrencyPair) this.L$0, null));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(CryptoStakingOnboardingDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C378521(null));
    }

    /* compiled from: CryptoStakingOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$acceptStakingEnrollment$1", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$acceptStakingEnrollment$1 */
    static final class C378511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C378511(Continuation<? super C378511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingOnboardingDuxo.this.new C378511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoStakingOnboardingDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoStakingStore cryptoStakingStore = CryptoStakingOnboardingDuxo.this.cryptoStakingStore;
                    this.label = 1;
                    if (cryptoStakingStore.updateStakingAgreementSetting(true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoStakingOnboardingDuxo.this.applyMutation(new AnonymousClass2(null));
                CryptoStakingOnboardingDuxo.this.submit(CryptoStakingOnboardingEvent.Continue.INSTANCE);
            } catch (Throwable th) {
                ErrorHandlingUtils.throwIfCancellation(th);
                if (!Throwables.isNetworkRelated(th)) {
                    StakingCrashReporter.logNonFatal$default(StakingCrashReporter.INSTANCE, th, "onboarding", "accept_enrollment", null, null, 24, null);
                }
                CryptoStakingOnboardingDuxo.this.applyMutation(new AnonymousClass3(null));
                CryptoStakingOnboardingDuxo.this.submit(new CryptoStakingOnboardingEvent.Error(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoStakingOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$acceptStakingEnrollment$1$1", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$acceptStakingEnrollment$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingOnboardingDataState cryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState> continuation) {
                return ((AnonymousClass1) create(cryptoStakingOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingOnboardingDataState.copy$default((CryptoStakingOnboardingDataState) this.L$0, null, null, true, 3, null);
            }
        }

        /* compiled from: CryptoStakingOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$acceptStakingEnrollment$1$2", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$acceptStakingEnrollment$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingOnboardingDataState cryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState> continuation) {
                return ((AnonymousClass2) create(cryptoStakingOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingOnboardingDataState.copy$default((CryptoStakingOnboardingDataState) this.L$0, null, null, false, 3, null);
            }
        }

        /* compiled from: CryptoStakingOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$acceptStakingEnrollment$1$3", m3645f = "CryptoStakingOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo$acceptStakingEnrollment$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingOnboardingDataState cryptoStakingOnboardingDataState, Continuation<? super CryptoStakingOnboardingDataState> continuation) {
                return ((AnonymousClass3) create(cryptoStakingOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingOnboardingDataState.copy$default((CryptoStakingOnboardingDataState) this.L$0, null, null, false, 3, null);
            }
        }
    }

    public final void acceptStakingEnrollment() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C378511(null), 3, null);
    }

    /* compiled from: CryptoStakingOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo$InitArgs;", "Landroid/os/Parcelable;", "onboardingPage", "Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;", "currencyPairId", "Ljava/util/UUID;", "receiptUuid", "entryPointIdentifier", "", "<init>", "(Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "getOnboardingPage", "()Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;", "getCurrencyPairId", "()Ljava/util/UUID;", "getReceiptUuid", "getEntryPointIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final String entryPointIdentifier;
        private final StakingConfig.OnboardingPage onboardingPage;
        private final UUID receiptUuid;

        /* compiled from: CryptoStakingOnboardingDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((StakingConfig.OnboardingPage) parcel.readParcelable(InitArgs.class.getClassLoader()), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, StakingConfig.OnboardingPage onboardingPage, UUID uuid, UUID uuid2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                onboardingPage = initArgs.onboardingPage;
            }
            if ((i & 2) != 0) {
                uuid = initArgs.currencyPairId;
            }
            if ((i & 4) != 0) {
                uuid2 = initArgs.receiptUuid;
            }
            if ((i & 8) != 0) {
                str = initArgs.entryPointIdentifier;
            }
            return initArgs.copy(onboardingPage, uuid, uuid2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final StakingConfig.OnboardingPage getOnboardingPage() {
            return this.onboardingPage;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getReceiptUuid() {
            return this.receiptUuid;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        public final InitArgs copy(StakingConfig.OnboardingPage onboardingPage, UUID currencyPairId, UUID receiptUuid, String entryPointIdentifier) {
            Intrinsics.checkNotNullParameter(onboardingPage, "onboardingPage");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new InitArgs(onboardingPage, currencyPairId, receiptUuid, entryPointIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.onboardingPage, initArgs.onboardingPage) && Intrinsics.areEqual(this.currencyPairId, initArgs.currencyPairId) && Intrinsics.areEqual(this.receiptUuid, initArgs.receiptUuid) && Intrinsics.areEqual(this.entryPointIdentifier, initArgs.entryPointIdentifier);
        }

        public int hashCode() {
            int iHashCode = ((this.onboardingPage.hashCode() * 31) + this.currencyPairId.hashCode()) * 31;
            UUID uuid = this.receiptUuid;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.entryPointIdentifier;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "InitArgs(onboardingPage=" + this.onboardingPage + ", currencyPairId=" + this.currencyPairId + ", receiptUuid=" + this.receiptUuid + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.onboardingPage, flags);
            dest.writeSerializable(this.currencyPairId);
            dest.writeSerializable(this.receiptUuid);
            dest.writeString(this.entryPointIdentifier);
        }

        public InitArgs(StakingConfig.OnboardingPage onboardingPage, UUID currencyPairId, UUID uuid, String str) {
            Intrinsics.checkNotNullParameter(onboardingPage, "onboardingPage");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.onboardingPage = onboardingPage;
            this.currencyPairId = currencyPairId;
            this.receiptUuid = uuid;
            this.entryPointIdentifier = str;
        }

        public final StakingConfig.OnboardingPage getOnboardingPage() {
            return this.onboardingPage;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final UUID getReceiptUuid() {
            return this.receiptUuid;
        }

        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }
    }

    /* compiled from: CryptoStakingOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo$InitArgs;", "<init>", "()V", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoStakingOnboardingDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoStakingOnboardingDuxo);
        }
    }
}
