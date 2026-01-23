package com.robinhood.android.crypto.p094ui.detail.description;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoDescriptionStore;
import com.robinhood.librobinhood.data.store.MarketDataProxyStore;
import com.robinhood.models.crypto.p314db.CryptoDescription;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.Flow;
import md_server_proxy.service.p483v1.FundamentalDto;

/* compiled from: CryptoDescriptionDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0016\u0017B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDataState;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "InitArgs", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoDescriptionDuxo extends BaseDuxo<CryptoDescriptionDataState, CryptoDescriptionViewState> implements HasArgs<InitArgs> {
    private final CryptoDescriptionStore cryptoDescriptionStore;
    private final MarketDataProxyStore marketDataProxyStore;
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
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDescriptionDuxo(DuxoBundle duxoBundle, CryptoDescriptionDataState2 stateProvider, SavedStateHandle savedStateHandle, CryptoDescriptionStore cryptoDescriptionStore, MarketDataProxyStore marketDataProxyStore) {
        super(new CryptoDescriptionDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoDescriptionStore, "cryptoDescriptionStore");
        Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
        this.savedStateHandle = savedStateHandle;
        this.cryptoDescriptionStore = cryptoDescriptionStore;
        this.marketDataProxyStore = marketDataProxyStore;
    }

    /* compiled from: CryptoDescriptionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1", m3645f = "CryptoDescriptionDuxo.kt", m3646l = {37, 43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1 */
    static final class C133461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C133461(Continuation<? super C133461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDescriptionDuxo.this.new C133461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C133461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
        
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
                InitArgs initArgs = (InitArgs) CryptoDescriptionDuxo.INSTANCE.getArgs((HasArgs) CryptoDescriptionDuxo.this);
                if (initArgs instanceof InitArgs.Crypto) {
                    Flow<CryptoDescription> flowFetchCryptoDescription = CryptoDescriptionDuxo.this.cryptoDescriptionStore.fetchCryptoDescription(((InitArgs.Crypto) initArgs).getCurrencyPairId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDescriptionDuxo.this, null);
                    this.label = 1;
                } else if (initArgs instanceof InitArgs.Tokenized) {
                    Flow<FundamentalDto> flowFetchFundamentals = CryptoDescriptionDuxo.this.marketDataProxyStore.fetchFundamentals(((InitArgs.Tokenized) initArgs).getCurrencyPairId());
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoDescriptionDuxo.this, null);
                    this.label = 2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoDescriptionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoDescription", "Lcom/robinhood/models/crypto/db/CryptoDescription;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1$1", m3645f = "CryptoDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoDescription, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDescriptionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDescriptionDuxo cryptoDescriptionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDescriptionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoDescription cryptoDescription, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoDescription, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDescriptionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1$1$1", m3645f = "CryptoDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497831 extends ContinuationImpl7 implements Function2<CryptoDescriptionDataState, Continuation<? super CryptoDescriptionDataState>, Object> {
                final /* synthetic */ CryptoDescription $cryptoDescription;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497831(CryptoDescription cryptoDescription, Continuation<? super C497831> continuation) {
                    super(2, continuation);
                    this.$cryptoDescription = cryptoDescription;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497831 c497831 = new C497831(this.$cryptoDescription, continuation);
                    c497831.L$0 = obj;
                    return c497831;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDescriptionDataState cryptoDescriptionDataState, Continuation<? super CryptoDescriptionDataState> continuation) {
                    return ((C497831) create(cryptoDescriptionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDescriptionDataState.copy$default((CryptoDescriptionDataState) this.L$0, this.$cryptoDescription, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497831((CryptoDescription) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: CryptoDescriptionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "fundamental", "Lmd_server_proxy/service/v1/FundamentalDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1$2", m3645f = "CryptoDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FundamentalDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDescriptionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoDescriptionDuxo cryptoDescriptionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDescriptionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FundamentalDto fundamentalDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(fundamentalDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDescriptionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1$2$1", m3645f = "CryptoDescriptionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoDescriptionDataState, Continuation<? super CryptoDescriptionDataState>, Object> {
                final /* synthetic */ FundamentalDto $fundamental;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FundamentalDto fundamentalDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$fundamental = fundamentalDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fundamental, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDescriptionDataState cryptoDescriptionDataState, Continuation<? super CryptoDescriptionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoDescriptionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDescriptionDataState.copy$default((CryptoDescriptionDataState) this.L$0, null, this.$fundamental, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((FundamentalDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C133461(null));
    }

    /* compiled from: CryptoDescriptionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs;", "Landroid/os/Parcelable;", "<init>", "()V", "Crypto", "Tokenized", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs$Crypto;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs$Tokenized;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class InitArgs implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ InitArgs(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InitArgs() {
        }

        /* compiled from: CryptoDescriptionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs$Crypto;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Crypto extends InitArgs {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Crypto> CREATOR = new Creator();
            private final UUID currencyPairId;

            /* compiled from: CryptoDescriptionDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Crypto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Crypto createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Crypto((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Crypto[] newArray(int i) {
                    return new Crypto[i];
                }
            }

            public static /* synthetic */ Crypto copy$default(Crypto crypto2, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = crypto2.currencyPairId;
                }
                return crypto2.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }

            public final Crypto copy(UUID currencyPairId) {
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                return new Crypto(currencyPairId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Crypto) && Intrinsics.areEqual(this.currencyPairId, ((Crypto) other).currencyPairId);
            }

            public int hashCode() {
                return this.currencyPairId.hashCode();
            }

            public String toString() {
                return "Crypto(currencyPairId=" + this.currencyPairId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.currencyPairId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Crypto(UUID currencyPairId) {
                super(null);
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                this.currencyPairId = currencyPairId;
            }

            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }
        }

        /* compiled from: CryptoDescriptionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs$Tokenized;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Tokenized extends InitArgs {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Tokenized> CREATOR = new Creator();
            private final UUID currencyPairId;

            /* compiled from: CryptoDescriptionDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Tokenized> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Tokenized createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Tokenized((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Tokenized[] newArray(int i) {
                    return new Tokenized[i];
                }
            }

            public static /* synthetic */ Tokenized copy$default(Tokenized tokenized, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = tokenized.currencyPairId;
                }
                return tokenized.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }

            public final Tokenized copy(UUID currencyPairId) {
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                return new Tokenized(currencyPairId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Tokenized) && Intrinsics.areEqual(this.currencyPairId, ((Tokenized) other).currencyPairId);
            }

            public int hashCode() {
                return this.currencyPairId.hashCode();
            }

            public String toString() {
                return "Tokenized(currencyPairId=" + this.currencyPairId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.currencyPairId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tokenized(UUID currencyPairId) {
                super(null);
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                this.currencyPairId = currencyPairId;
            }

            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }
        }
    }

    /* compiled from: CryptoDescriptionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo$InitArgs;", "<init>", "()V", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoDescriptionDuxo, InitArgs> {
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
        public InitArgs getArgs(CryptoDescriptionDuxo cryptoDescriptionDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoDescriptionDuxo);
        }
    }
}
