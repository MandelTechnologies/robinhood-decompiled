package com.robinhood.shared.crypto.transfer.send.address.base;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment;
import com.robinhood.shared.crypto.transfer.send.address.SanitizeCryptoAddress;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoTransferSendAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Args;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "changeAddress", PlaceTypes.ADDRESS, "", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendAddressDuxo extends BaseDuxo4<CryptoTransferSendAddressViewState> implements HasArgs<CryptoTransferSendAddressFragment.Args> {
    private final CryptoTransfersStore cryptoTransfersStore;
    private final SavedStateHandle savedStateHandle;

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
    public CryptoTransferSendAddressDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, AppType appType, CryptoTransfersStore cryptoTransfersStore) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Companion companion = INSTANCE;
        UiCurrencyPair uiCurrencyPair = ((CryptoTransferSendAddressFragment.Args) companion.getArgs(savedStateHandle)).getUiCurrencyPair();
        super(new CryptoTransferSendAddressViewState(appType, ((CryptoTransferSendAddressFragment.Args) companion.getArgs(savedStateHandle)).getMaxAddressLength(), ((CryptoTransferSendAddressFragment.Args) companion.getArgs(savedStateHandle)).getPreviouslySavedAddress(), uiCurrencyPair, null, null, 48, null), duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.cryptoTransfersStore = cryptoTransfersStore;
    }

    /* compiled from: CryptoTransferSendAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressDuxo$onCreate$1", m3645f = "CryptoTransferSendAddressDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressDuxo$onCreate$1 */
    static final class C381371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C381371(Continuation<? super C381371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferSendAddressDuxo.this.new C381371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C381371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow cachedTransferConfigForCurrency$default = CryptoTransfersStore.getCachedTransferConfigForCurrency$default(CryptoTransferSendAddressDuxo.this.cryptoTransfersStore, ((CryptoTransferSendAddressFragment.Args) CryptoTransferSendAddressDuxo.INSTANCE.getArgs((HasSavedState) CryptoTransferSendAddressDuxo.this)).getUiCurrencyPair().getAssetCurrency(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTransferSendAddressDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(cachedTransferConfigForCurrency$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTransferSendAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressDuxo$onCreate$1$1", m3645f = "CryptoTransferSendAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferConfig, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTransferSendAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSendAddressDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoTransferConfig cryptoTransferConfig, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoTransferConfig, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTransferSendAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressDuxo$onCreate$1$1$1", m3645f = "CryptoTransferSendAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507091 extends ContinuationImpl7 implements Function2<CryptoTransferSendAddressViewState, Continuation<? super CryptoTransferSendAddressViewState>, Object> {
                final /* synthetic */ CryptoTransferConfig $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507091(CryptoTransferConfig cryptoTransferConfig, Continuation<? super C507091> continuation) {
                    super(2, continuation);
                    this.$it = cryptoTransferConfig;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507091 c507091 = new C507091(this.$it, continuation);
                    c507091.L$0 = obj;
                    return c507091;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferSendAddressViewState cryptoTransferSendAddressViewState, Continuation<? super CryptoTransferSendAddressViewState> continuation) {
                    return ((C507091) create(cryptoTransferSendAddressViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTransferSendAddressViewState.copy$default((CryptoTransferSendAddressViewState) this.L$0, null, 0, null, null, null, this.$it, 31, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507091((CryptoTransferConfig) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C381371(null));
    }

    /* compiled from: CryptoTransferSendAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressDuxo$changeAddress$1", m3645f = "CryptoTransferSendAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressDuxo$changeAddress$1 */
    static final class C381361 extends ContinuationImpl7 implements Function2<CryptoTransferSendAddressViewState, Continuation<? super CryptoTransferSendAddressViewState>, Object> {
        final /* synthetic */ String $sanitizedAddress;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C381361(String str, Continuation<? super C381361> continuation) {
            super(2, continuation);
            this.$sanitizedAddress = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C381361 c381361 = new C381361(this.$sanitizedAddress, continuation);
            c381361.L$0 = obj;
            return c381361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendAddressViewState cryptoTransferSendAddressViewState, Continuation<? super CryptoTransferSendAddressViewState> continuation) {
            return ((C381361) create(cryptoTransferSendAddressViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendAddressViewState.copy$default((CryptoTransferSendAddressViewState) this.L$0, null, 0, null, null, this.$sanitizedAddress, null, 47, null);
        }
    }

    public final void changeAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        applyMutation(new C381361(SanitizeCryptoAddress.sanitizeCryptoAddress(address), null));
    }

    /* compiled from: CryptoTransferSendAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferSendAddressDuxo, CryptoTransferSendAddressFragment.Args> {
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
        public CryptoTransferSendAddressFragment.Args getArgs(CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo) {
            return (CryptoTransferSendAddressFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferSendAddressDuxo);
        }
    }
}
