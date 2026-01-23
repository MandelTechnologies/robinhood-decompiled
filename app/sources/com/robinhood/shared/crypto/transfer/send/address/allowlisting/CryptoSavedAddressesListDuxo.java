package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.transfer.ApiSavedAddresses;
import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListEvent;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoSavedAddressesListDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002\u001c\u001dB1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDataState;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo$InitArgs;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "deleteSavedAddress", "id", "Ljava/util/UUID;", "currencyCode", "", "InitArgs", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoSavedAddressesListDuxo extends BaseDuxo3<CryptoSavedAddressesListDataState, CryptoSavedAddressesListViewState, CryptoSavedAddressesListEvent> implements HasArgs<InitArgs> {
    private final CryptoSavedAddressesStore cryptoSavedAddressesStore;
    private final CurrencyPairV2Store currencyPairV2Store;
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
    public CryptoSavedAddressesListDuxo(DuxoBundle duxoBundle, CryptoSavedAddressesListStateProvider stateProvider, SavedStateHandle savedStateHandle, CryptoSavedAddressesStore cryptoSavedAddressesStore, CurrencyPairV2Store currencyPairV2Store) {
        super(new CryptoSavedAddressesListDataState(((InitArgs) INSTANCE.getArgs(savedStateHandle)).getCurrencyPairId(), null, null, null, 2, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        this.savedStateHandle = savedStateHandle;
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
        this.currencyPairV2Store = currencyPairV2Store;
    }

    /* compiled from: CryptoSavedAddressesListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1 */
    static final class C381201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C381201(Continuation<? super C381201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C381201 c381201 = CryptoSavedAddressesListDuxo.this.new C381201(continuation);
            c381201.L$0 = obj;
            return c381201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C381201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoSavedAddressesListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$1", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoSavedAddressesListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoSavedAddressesListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<AllowlistStatus> flowStreamAllowlistStatus = this.this$0.cryptoSavedAddressesStore.streamAllowlistStatus();
                        C507061 c507061 = new C507061(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowStreamAllowlistStatus, c507061, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    if (!Throwables.isNetworkRelated(th)) {
                        throw th;
                    }
                    this.this$0.submit(new CryptoSavedAddressesListEvent.Error(th));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoSavedAddressesListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "allowlistStatus", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$1$1", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507061 extends ContinuationImpl7 implements Function2<AllowlistStatus, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoSavedAddressesListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507061(CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, Continuation<? super C507061> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoSavedAddressesListDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507061 c507061 = new C507061(this.this$0, continuation);
                    c507061.L$0 = obj;
                    return c507061;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AllowlistStatus allowlistStatus, Continuation<? super Unit> continuation) {
                    return ((C507061) create(allowlistStatus, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoSavedAddressesListDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$1$1$1", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507071 extends ContinuationImpl7 implements Function2<CryptoSavedAddressesListDataState, Continuation<? super CryptoSavedAddressesListDataState>, Object> {
                    final /* synthetic */ AllowlistStatus $allowlistStatus;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507071(AllowlistStatus allowlistStatus, Continuation<? super C507071> continuation) {
                        super(2, continuation);
                        this.$allowlistStatus = allowlistStatus;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507071 c507071 = new C507071(this.$allowlistStatus, continuation);
                        c507071.L$0 = obj;
                        return c507071;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoSavedAddressesListDataState cryptoSavedAddressesListDataState, Continuation<? super CryptoSavedAddressesListDataState> continuation) {
                        return ((C507071) create(cryptoSavedAddressesListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoSavedAddressesListDataState.copy$default((CryptoSavedAddressesListDataState) this.L$0, null, null, this.$allowlistStatus, null, 11, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507071((AllowlistStatus) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoSavedAddressesListDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoSavedAddressesListDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoSavedAddressesListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoSavedAddressesListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoSavedAddressesListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Flow<String> flowFlowOf;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UUID currencyPairId = ((InitArgs) CryptoSavedAddressesListDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getCurrencyPairId();
                    if (currencyPairId != null) {
                        final Flow flowOnEach = FlowKt.onEach(this.this$0.currencyPairV2Store.streamCurrencyPairFlow(currencyPairId), new AnonymousClass1(this.this$0, null));
                        flowFlowOf = new Flow<String>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        String apiCode = ((UiCurrencyPair) obj).getAssetCurrency().getApiCode();
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(apiCode, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                                Object objCollect = flowOnEach.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }
                        };
                    } else {
                        flowFlowOf = FlowKt.flowOf((Object) null);
                    }
                    Flow flowTransformLatest = FlowKt.transformLatest(flowFlowOf, new C38117x3822ca26(null, this.this$0));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: CryptoSavedAddressesListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$1", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoSavedAddressesListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoSavedAddressesListDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoSavedAddressesListDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$1$1", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507081 extends ContinuationImpl7 implements Function2<CryptoSavedAddressesListDataState, Continuation<? super CryptoSavedAddressesListDataState>, Object> {
                    final /* synthetic */ UiCurrencyPair $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507081(UiCurrencyPair uiCurrencyPair, Continuation<? super C507081> continuation) {
                        super(2, continuation);
                        this.$it = uiCurrencyPair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507081 c507081 = new C507081(this.$it, continuation);
                        c507081.L$0 = obj;
                        return c507081;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoSavedAddressesListDataState cryptoSavedAddressesListDataState, Continuation<? super CryptoSavedAddressesListDataState> continuation) {
                        return ((C507081) create(cryptoSavedAddressesListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoSavedAddressesListDataState.copy$default((CryptoSavedAddressesListDataState) this.L$0, null, this.$it, null, null, 13, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507081((UiCurrencyPair) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: CryptoSavedAddressesListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "latest", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$4", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<ApiSavedAddresses, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoSavedAddressesListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoSavedAddressesListDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiSavedAddresses apiSavedAddresses, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(apiSavedAddresses, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoSavedAddressesListDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$4$1", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$onCreate$1$2$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoSavedAddressesListDataState, Continuation<? super CryptoSavedAddressesListDataState>, Object> {
                    final /* synthetic */ ApiSavedAddresses $latest;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ApiSavedAddresses apiSavedAddresses, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$latest = apiSavedAddresses;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$latest, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoSavedAddressesListDataState cryptoSavedAddressesListDataState, Continuation<? super CryptoSavedAddressesListDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoSavedAddressesListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoSavedAddressesListDataState.copy$default((CryptoSavedAddressesListDataState) this.L$0, null, null, null, this.$latest, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ApiSavedAddresses) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C381201(null));
    }

    /* compiled from: CryptoSavedAddressesListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$deleteSavedAddress$1", m3645f = "CryptoSavedAddressesListDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo$deleteSavedAddress$1 */
    static final class C381191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $currencyCode;
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C381191(String str, UUID uuid, Continuation<? super C381191> continuation) {
            super(2, continuation);
            this.$currencyCode = str;
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoSavedAddressesListDuxo.this.new C381191(this.$currencyCode, this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C381191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoSavedAddressesStore cryptoSavedAddressesStore = CryptoSavedAddressesListDuxo.this.cryptoSavedAddressesStore;
                    String str = this.$currencyCode;
                    UUID uuid = this.$id;
                    this.label = 1;
                    if (cryptoSavedAddressesStore.deleteSavedAddress(str, uuid, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoSavedAddressesListDuxo.this.cryptoSavedAddressesStore.refreshSavedAddresses(CryptoSavedAddressesStore.INSTANCE.getALL_CURRENCIES_KEY());
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                CryptoSavedAddressesListDuxo.this.submit(CryptoSavedAddressesListEvent.DeleteSavedAddressError.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteSavedAddress(UUID id, String currencyCode) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C381191(currencyCode, id, null), 3, null);
    }

    /* compiled from: CryptoSavedAddressesListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo$InitArgs;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID currencyPairId;

        /* compiled from: CryptoSavedAddressesListDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.currencyPairId;
            }
            return initArgs.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final InitArgs copy(UUID currencyPairId) {
            return new InitArgs(currencyPairId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.currencyPairId, ((InitArgs) other).currencyPairId);
        }

        public int hashCode() {
            UUID uuid = this.currencyPairId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "InitArgs(currencyPairId=" + this.currencyPairId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
        }

        public InitArgs(UUID uuid) {
            this.currencyPairId = uuid;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }

    /* compiled from: CryptoSavedAddressesListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo$InitArgs;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoSavedAddressesListDuxo, InitArgs> {
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
        public InitArgs getArgs(CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoSavedAddressesListDuxo);
        }
    }
}
