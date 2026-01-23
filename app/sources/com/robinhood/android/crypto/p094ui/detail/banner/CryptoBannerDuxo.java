package com.robinhood.android.crypto.p094ui.detail.banner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.crypto.p094ui.detail.banner.CryptoBannerDataState;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import com.robinhood.models.crypto.p314db.Cryptobility;
import com.robinhood.models.serverdriven.p347db.BannerComponent;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0018\u0019B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo$InitArgs;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerStateProvider;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerStateProvider;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptobilityStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "InitArgs", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoBannerDuxo extends BaseDuxo<CryptoBannerDataState, CryptoBannerViewState> implements HasArgs<InitArgs> {
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptobilityStore cryptobilityStore;
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
    public CryptoBannerDuxo(DuxoBundle duxoBundle, CryptoBannerDuxo3 stateProvider, CryptoAccountProvider cryptoAccountProvider, CryptobilityStore cryptobilityStore, CryptoExperimentsStore cryptoExperimentsStore, SavedStateHandle savedStateHandle) {
        super(new CryptoBannerDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptobilityStore = cryptobilityStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C133001(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C133012(null));
    }

    /* compiled from: CryptoBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$1", m3645f = "CryptoBannerDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$1 */
    static final class C133001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C133001(Continuation<? super C133001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoBannerDuxo.this.new C133001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C133001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptobilityStore cryptobilityStore = CryptoBannerDuxo.this.cryptobilityStore;
                CryptoBannerDuxo cryptoBannerDuxo = CryptoBannerDuxo.this;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(cryptobilityStore.pollCryptobility(((InitArgs) cryptoBannerDuxo.getArgs(cryptoBannerDuxo.getSavedStateHandle())).getCurrencyPairId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoBannerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptobility", "Lcom/robinhood/models/crypto/db/Cryptobility;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$1$1", m3645f = "CryptoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Cryptobility, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoBannerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoBannerDuxo cryptoBannerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoBannerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Cryptobility cryptobility, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptobility, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoBannerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$1$1$1", m3645f = "CryptoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497801 extends ContinuationImpl7 implements Function2<CryptoBannerDataState, Continuation<? super CryptoBannerDataState>, Object> {
                final /* synthetic */ Cryptobility $cryptobility;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoBannerDuxo this$0;

                /* compiled from: CryptoBannerDuxo.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$1$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CryptoBannerType.values().length];
                        try {
                            iArr[CryptoBannerType.TRADE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CryptoBannerType.PERPETUALS.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497801(CryptoBannerDuxo cryptoBannerDuxo, Cryptobility cryptobility, Continuation<? super C497801> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoBannerDuxo;
                    this.$cryptobility = cryptobility;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497801 c497801 = new C497801(this.this$0, this.$cryptobility, continuation);
                    c497801.L$0 = obj;
                    return c497801;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoBannerDataState cryptoBannerDataState, Continuation<? super CryptoBannerDataState> continuation) {
                    return ((C497801) create(cryptoBannerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    BannerComponent banner;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoBannerDataState cryptoBannerDataState = (CryptoBannerDataState) this.L$0;
                    CryptoBannerDuxo cryptoBannerDuxo = this.this$0;
                    int i = WhenMappings.$EnumSwitchMapping$0[((InitArgs) cryptoBannerDuxo.getArgs(cryptoBannerDuxo.getSavedStateHandle())).getBannerType().ordinal()];
                    if (i == 1) {
                        Cryptobility cryptobility = this.$cryptobility;
                        if (cryptobility != null) {
                            banner = cryptobility.getBanner();
                        }
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Cryptobility cryptobility2 = this.$cryptobility;
                        banner = cryptobility2 != null ? cryptobility2.getPerpetualsBanner() : null;
                    }
                    return CryptoBannerDataState.copy$default(cryptoBannerDataState, banner, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Cryptobility cryptobility = (Cryptobility) this.L$0;
                CryptoBannerDuxo cryptoBannerDuxo = this.this$0;
                cryptoBannerDuxo.applyMutation(new C497801(cryptoBannerDuxo, cryptobility, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$2", m3645f = "CryptoBannerDuxo.kt", m3646l = {83}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$2 */
    static final class C133012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C133012(Continuation<? super C133012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoBannerDuxo.this.new C133012(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C133012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((InitArgs) CryptoBannerDuxo.INSTANCE.getArgs((HasArgs) CryptoBannerDuxo.this)).getBannerType() == CryptoBannerType.TRADE) {
                    Flow flowTransformLatest = FlowKt.transformLatest(CryptoBannerDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C13298xe1f0e926(null, CryptoBannerDuxo.this));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoBannerDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$2$2", m3645f = "CryptoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoBannerDataState.IacBannerState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoBannerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoBannerDuxo cryptoBannerDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoBannerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoBannerDataState.IacBannerState iacBannerState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(iacBannerState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoBannerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$2$2$1", m3645f = "CryptoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoBannerDataState, Continuation<? super CryptoBannerDataState>, Object> {
                final /* synthetic */ CryptoBannerDataState.IacBannerState $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoBannerDataState.IacBannerState iacBannerState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = iacBannerState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoBannerDataState cryptoBannerDataState, Continuation<? super CryptoBannerDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoBannerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoBannerDataState.copy$default((CryptoBannerDataState) this.L$0, null, this.$it, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((CryptoBannerDataState.IacBannerState) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo$InitArgs;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "bannerType", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerType;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getBannerType", "()Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final CryptoBannerType bannerType;
        private final UUID currencyPairId;

        /* compiled from: CryptoBannerDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable(), CryptoBannerType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, CryptoBannerType cryptoBannerType, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.currencyPairId;
            }
            if ((i & 2) != 0) {
                cryptoBannerType = initArgs.bannerType;
            }
            return initArgs.copy(uuid, cryptoBannerType);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoBannerType getBannerType() {
            return this.bannerType;
        }

        public final InitArgs copy(UUID currencyPairId, CryptoBannerType bannerType) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(bannerType, "bannerType");
            return new InitArgs(currencyPairId, bannerType);
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
            return Intrinsics.areEqual(this.currencyPairId, initArgs.currencyPairId) && this.bannerType == initArgs.bannerType;
        }

        public int hashCode() {
            return (this.currencyPairId.hashCode() * 31) + this.bannerType.hashCode();
        }

        public String toString() {
            return "InitArgs(currencyPairId=" + this.currencyPairId + ", bannerType=" + this.bannerType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.bannerType.name());
        }

        public InitArgs(UUID currencyPairId, CryptoBannerType bannerType) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(bannerType, "bannerType");
            this.currencyPairId = currencyPairId;
            this.bannerType = bannerType;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final CryptoBannerType getBannerType() {
            return this.bannerType;
        }
    }

    /* compiled from: CryptoBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo$InitArgs;", "<init>", "()V", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoBannerDuxo, InitArgs> {
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
        public InitArgs getArgs(CryptoBannerDuxo cryptoBannerDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoBannerDuxo);
        }
    }
}
