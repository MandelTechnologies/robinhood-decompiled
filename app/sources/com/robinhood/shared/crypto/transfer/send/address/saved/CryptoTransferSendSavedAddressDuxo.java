package com.robinhood.shared.crypto.transfer.send.address.saved;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiSavedAddresses;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment;
import com.robinhood.shared.crypto.transfer.send.address.SanitizeCryptoAddress;
import com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressEvent;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001)B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018J\u0016\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\u001cJ\u0006\u0010%\u001a\u00020\u001cJ\u0010\u0010&\u001a\u00020\u001cH\u0081@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressViewState;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Args;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "scanTooltipSavedAddressesShownBeforePref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressStateProvider;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;Lcom/robinhood/prefs/BooleanPreference;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "assetCurrencyCode", "", "getAssetCurrencyCode", "()Ljava/lang/String;", "onCreate", "", "changeAddress", PlaceTypes.ADDRESS, "deleteSavedAddress", "id", "Ljava/util/UUID;", "currencyCode", "makeScanTooltipSavedAddressesDisappear", "markScanTooltipSavedAddressesAsSeen", "showAllRecentAddresses", "fetchAddressLists", "fetchAddressLists$feature_crypto_transfer_externalDebug", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendSavedAddressDuxo extends BaseDuxo3<CryptoTransferSendSavedAddressDataState, CryptoTransferSendSavedAddressViewState, CryptoTransferSendSavedAddressEvent> implements HasArgs<CryptoTransferSendAddressFragment.Args> {
    private final CryptoSavedAddressesStore cryptoSavedAddressesStore;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference scanTooltipSavedAddressesShownBeforePref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoTransferSendAddressFragment.Args getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoTransferSendAddressFragment.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoTransferSendSavedAddressDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoTransferSendSavedAddressStateProvider stateProvider, CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, @ScanTooltipSavedAddressesShownBeforePref BooleanPreference scanTooltipSavedAddressesShownBeforePref) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(scanTooltipSavedAddressesShownBeforePref, "scanTooltipSavedAddressesShownBeforePref");
        Companion companion = INSTANCE;
        UiCurrencyPair uiCurrencyPair = ((CryptoTransferSendAddressFragment.Args) companion.getArgs(savedStateHandle)).getUiCurrencyPair();
        String previouslySavedAddress = ((CryptoTransferSendAddressFragment.Args) companion.getArgs(savedStateHandle)).getPreviouslySavedAddress();
        boolean z = false;
        super(new CryptoTransferSendSavedAddressDataState(scanTooltipSavedAddressesShownBeforePref.get(), z, ((CryptoTransferSendAddressFragment.Args) companion.getArgs(savedStateHandle)).getMaxAddressLength(), false, null, null, previouslySavedAddress, uiCurrencyPair, false, null, null, 1840, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
        this.scanTooltipSavedAddressesShownBeforePref = scanTooltipSavedAddressesShownBeforePref;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAssetCurrencyCode() {
        return ((CryptoTransferSendAddressFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getUiCurrencyPair().getAssetCurrency().getApiCode();
    }

    /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1 */
    static final class C382501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C382501(Continuation<? super C382501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C382501 c382501 = CryptoTransferSendSavedAddressDuxo.this.new C382501(continuation);
            c382501.L$0 = obj;
            return c382501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C382501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {56}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSendSavedAddressDuxo;
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
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow cachedTransferConfigForCurrency$default = CryptoTransfersStore.getCachedTransferConfigForCurrency$default(this.this$0.cryptoTransfersStore, ((CryptoTransferSendAddressFragment.Args) CryptoTransferSendSavedAddressDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getUiCurrencyPair().getAssetCurrency(), null, 2, null);
                    C507121 c507121 = new C507121(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(cachedTransferConfigForCurrency$default, c507121, this) == coroutine_suspended) {
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

            /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$1$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507121 extends ContinuationImpl7 implements Function2<CryptoTransferConfig, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507121(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super C507121> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSendSavedAddressDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507121 c507121 = new C507121(this.this$0, continuation);
                    c507121.L$0 = obj;
                    return c507121;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferConfig cryptoTransferConfig, Continuation<? super Unit> continuation) {
                    return ((C507121) create(cryptoTransferConfig, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$1$1$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507131 extends ContinuationImpl7 implements Function2<CryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState>, Object> {
                    final /* synthetic */ CryptoTransferConfig $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507131(CryptoTransferConfig cryptoTransferConfig, Continuation<? super C507131> continuation) {
                        super(2, continuation);
                        this.$it = cryptoTransferConfig;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507131 c507131 = new C507131(this.$it, continuation);
                        c507131.L$0 = obj;
                        return c507131;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState> continuation) {
                        return ((C507131) create(cryptoTransferSendSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferSendSavedAddressDataState.copy$default((CryptoTransferSendSavedAddressDataState) this.L$0, false, false, 0, false, null, null, null, null, false, this.$it, null, 1535, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507131((CryptoTransferConfig) this.L$0, null));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoTransferSendSavedAddressDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoTransferSendSavedAddressDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CryptoTransferSendSavedAddressDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(CryptoTransferSendSavedAddressDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$2", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSendSavedAddressDuxo;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo = this.this$0;
                    this.label = 1;
                    if (cryptoTransferSendSavedAddressDuxo.fetchAddressLists$feature_crypto_transfer_externalDebug(this) == coroutine_suspended) {
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
        }

        /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$3", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSendSavedAddressDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<ApiSavedAddresses> flowStreamCachedSavedAddresses = this.this$0.cryptoSavedAddressesStore.streamCachedSavedAddresses(this.this$0.getAssetCurrencyCode());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamCachedSavedAddresses, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "latest", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$3$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiSavedAddresses, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSendSavedAddressDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiSavedAddresses apiSavedAddresses, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(apiSavedAddresses, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$3$1$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507141 extends ContinuationImpl7 implements Function2<CryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState>, Object> {
                    final /* synthetic */ ApiSavedAddresses $latest;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507141(ApiSavedAddresses apiSavedAddresses, Continuation<? super C507141> continuation) {
                        super(2, continuation);
                        this.$latest = apiSavedAddresses;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507141 c507141 = new C507141(this.$latest, continuation);
                        c507141.L$0 = obj;
                        return c507141;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState> continuation) {
                        return ((C507141) create(cryptoTransferSendSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferSendSavedAddressDataState.copy$default((CryptoTransferSendSavedAddressDataState) this.L$0, false, false, 0, false, this.$latest, null, null, null, false, null, null, 2031, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507141((ApiSavedAddresses) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$4", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSendSavedAddressDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<ApiSavedAddresses> flowStreamCachedRecentAddresses = this.this$0.cryptoSavedAddressesStore.streamCachedRecentAddresses(this.this$0.getAssetCurrencyCode());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamCachedRecentAddresses, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "latest", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$4$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiSavedAddresses, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSendSavedAddressDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiSavedAddresses apiSavedAddresses, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(apiSavedAddresses, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$4$1$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$onCreate$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507151 extends ContinuationImpl7 implements Function2<CryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState>, Object> {
                    final /* synthetic */ ApiSavedAddresses $latest;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507151(ApiSavedAddresses apiSavedAddresses, Continuation<? super C507151> continuation) {
                        super(2, continuation);
                        this.$latest = apiSavedAddresses;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507151 c507151 = new C507151(this.$latest, continuation);
                        c507151.L$0 = obj;
                        return c507151;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState> continuation) {
                        return ((C507151) create(cryptoTransferSendSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferSendSavedAddressDataState.copy$default((CryptoTransferSendSavedAddressDataState) this.L$0, false, false, 0, false, null, this.$latest, null, null, false, null, null, 2015, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507151((ApiSavedAddresses) this.L$0, null));
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
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C382501(null));
    }

    /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$changeAddress$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$changeAddress$1 */
    static final class C382451 extends ContinuationImpl7 implements Function2<CryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState>, Object> {
        final /* synthetic */ String $sanitizedAddress;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C382451(String str, Continuation<? super C382451> continuation) {
            super(2, continuation);
            this.$sanitizedAddress = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C382451 c382451 = new C382451(this.$sanitizedAddress, continuation);
            c382451.L$0 = obj;
            return c382451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState> continuation) {
            return ((C382451) create(cryptoTransferSendSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendSavedAddressDataState.copy$default((CryptoTransferSendSavedAddressDataState) this.L$0, false, false, 0, false, null, null, null, null, false, null, this.$sanitizedAddress, 1023, null);
        }
    }

    public final void changeAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        applyMutation(new C382451(SanitizeCryptoAddress.sanitizeCryptoAddress(address), null));
    }

    /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$deleteSavedAddress$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$deleteSavedAddress$1 */
    static final class C382461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $currencyCode;
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C382461(String str, UUID uuid, Continuation<? super C382461> continuation) {
            super(2, continuation);
            this.$currencyCode = str;
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferSendSavedAddressDuxo.this.new C382461(this.$currencyCode, this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C382461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoSavedAddressesStore cryptoSavedAddressesStore = CryptoTransferSendSavedAddressDuxo.this.cryptoSavedAddressesStore;
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
                CryptoTransferSendSavedAddressDuxo.this.cryptoSavedAddressesStore.refreshSavedAddresses(CryptoTransferSendSavedAddressDuxo.this.getAssetCurrencyCode());
                CryptoTransferSendSavedAddressDuxo.this.cryptoSavedAddressesStore.refreshRecentAddresses(CryptoTransferSendSavedAddressDuxo.this.getAssetCurrencyCode());
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                CryptoTransferSendSavedAddressDuxo.this.submit(CryptoTransferSendSavedAddressEvent.DeleteSavedAddressAlertError.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteSavedAddress(UUID id, String currencyCode) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C382461(currencyCode, id, null), 3, null);
    }

    /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$makeScanTooltipSavedAddressesDisappear$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$makeScanTooltipSavedAddressesDisappear$1 */
    static final class C382491 extends ContinuationImpl7 implements Function2<CryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C382491(Continuation<? super C382491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C382491 c382491 = new C382491(continuation);
            c382491.L$0 = obj;
            return c382491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState> continuation) {
            return ((C382491) create(cryptoTransferSendSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendSavedAddressDataState.copy$default((CryptoTransferSendSavedAddressDataState) this.L$0, true, false, 0, false, null, null, null, null, false, null, null, 2046, null);
        }
    }

    public final void makeScanTooltipSavedAddressesDisappear() {
        applyMutation(new C382491(null));
    }

    public final void markScanTooltipSavedAddressesAsSeen() {
        this.scanTooltipSavedAddressesShownBeforePref.set(true);
    }

    /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$showAllRecentAddresses$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$showAllRecentAddresses$1 */
    static final class C382511 extends ContinuationImpl7 implements Function2<CryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C382511(Continuation<? super C382511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C382511 c382511 = new C382511(continuation);
            c382511.L$0 = obj;
            return c382511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState> continuation) {
            return ((C382511) create(cryptoTransferSendSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendSavedAddressDataState.copy$default((CryptoTransferSendSavedAddressDataState) this.L$0, false, false, 0, false, null, null, null, null, true, null, null, 1791, null);
        }
    }

    public final void showAllRecentAddresses() {
        applyMutation(new C382511(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAddressLists$feature_crypto_transfer_externalDebug(Continuation<? super Unit> continuation) {
        CryptoTransferSendSavedAddressDuxo2 cryptoTransferSendSavedAddressDuxo2;
        CryptoTransferSendSavedAddressDuxo6 cryptoTransferSendSavedAddressDuxo6;
        if (continuation instanceof CryptoTransferSendSavedAddressDuxo2) {
            cryptoTransferSendSavedAddressDuxo2 = (CryptoTransferSendSavedAddressDuxo2) continuation;
            int i = cryptoTransferSendSavedAddressDuxo2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cryptoTransferSendSavedAddressDuxo2.label = i - Integer.MIN_VALUE;
            } else {
                cryptoTransferSendSavedAddressDuxo2 = new CryptoTransferSendSavedAddressDuxo2(this, continuation);
            }
        }
        Object obj = cryptoTransferSendSavedAddressDuxo2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cryptoTransferSendSavedAddressDuxo2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTransferSendSavedAddressDuxo3 cryptoTransferSendSavedAddressDuxo3 = new CryptoTransferSendSavedAddressDuxo3(this, null);
                cryptoTransferSendSavedAddressDuxo2.label = 1;
                if (CoroutineScope2.coroutineScope(cryptoTransferSendSavedAddressDuxo3, cryptoTransferSendSavedAddressDuxo2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            cryptoTransferSendSavedAddressDuxo6 = new CryptoTransferSendSavedAddressDuxo6(null);
        } catch (Throwable th) {
            try {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                submit(CryptoTransferSendSavedAddressEvent.FetchAddressListsError.INSTANCE);
                cryptoTransferSendSavedAddressDuxo6 = new CryptoTransferSendSavedAddressDuxo6(null);
            } catch (Throwable th2) {
                applyMutation(new CryptoTransferSendSavedAddressDuxo6(null));
                throw th2;
            }
        }
        applyMutation(cryptoTransferSendSavedAddressDuxo6);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferSendSavedAddressDuxo, CryptoTransferSendAddressFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferSendAddressFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTransferSendAddressFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferSendAddressFragment.Args getArgs(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo) {
            return (CryptoTransferSendAddressFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferSendSavedAddressDuxo);
        }
    }
}
