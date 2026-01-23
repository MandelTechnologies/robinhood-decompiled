package com.robinhood.shared.crypto.transfer.send.address.saved;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetEvent;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SaveAddressBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetViewState;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetEvent;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "saveAddress", PlaceTypes.ADDRESS, "", "currencyCode", "nickname", "handleSaveAddressError", "Lcom/robinhood/utils/resource/StringResource;", "t", "", "handleSaveAddressError$feature_crypto_transfer_externalDebug", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SaveAddressBottomSheetDuxo extends BaseDuxo5<SaveAddressBottomSheetViewState, SaveAddressBottomSheetEvent> {
    public static final int $stable = 8;
    private final CryptoSavedAddressesStore cryptoSavedAddressesStore;

    /* compiled from: SaveAddressBottomSheetDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorResponse3.ErrorCode.values().length];
            try {
                iArr[ErrorResponse3.ErrorCode.INVALID_JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.MISSING_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.MISSING_CURRENCY_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.MISSING_NICKNAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.INVALID_CURRENCY_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.INVALID_NICKNAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.NICKNAME_ALREADY_EXISTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.ADDRESS_ALREADY_SAVED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.INVALID_WITHDRAWAL_ADDRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveAddressBottomSheetDuxo(CryptoSavedAddressesStore cryptoSavedAddressesStore, DuxoBundle duxoBundle) {
        super(new SaveAddressBottomSheetViewState(false, false, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C382531(null));
    }

    /* compiled from: SaveAddressBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$onCreate$1", m3645f = "SaveAddressBottomSheetDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$onCreate$1 */
    static final class C382531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C382531(Continuation<? super C382531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SaveAddressBottomSheetDuxo.this.new C382531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C382531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<AllowlistStatus> flowStreamAllowlistStatus = SaveAddressBottomSheetDuxo.this.cryptoSavedAddressesStore.streamAllowlistStatus();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SaveAddressBottomSheetDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamAllowlistStatus, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SaveAddressBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$onCreate$1$1", m3645f = "SaveAddressBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AllowlistStatus, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SaveAddressBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SaveAddressBottomSheetDuxo saveAddressBottomSheetDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = saveAddressBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AllowlistStatus allowlistStatus, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(allowlistStatus, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SaveAddressBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$onCreate$1$1$1", m3645f = "SaveAddressBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507161 extends ContinuationImpl7 implements Function2<SaveAddressBottomSheetViewState, Continuation<? super SaveAddressBottomSheetViewState>, Object> {
                final /* synthetic */ AllowlistStatus $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507161(AllowlistStatus allowlistStatus, Continuation<? super C507161> continuation) {
                    super(2, continuation);
                    this.$it = allowlistStatus;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507161 c507161 = new C507161(this.$it, continuation);
                    c507161.L$0 = obj;
                    return c507161;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SaveAddressBottomSheetViewState saveAddressBottomSheetViewState, Continuation<? super SaveAddressBottomSheetViewState> continuation) {
                    return ((C507161) create(saveAddressBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SaveAddressBottomSheetViewState.copy$default((SaveAddressBottomSheetViewState) this.L$0, false, this.$it.isAllowlistEnabled(), 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507161((AllowlistStatus) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: SaveAddressBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$saveAddress$1", m3645f = "SaveAddressBottomSheetDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$saveAddress$1 */
    static final class C382541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $address;
        final /* synthetic */ String $currencyCode;
        final /* synthetic */ String $nickname;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C382541(String str, String str2, String str3, Continuation<? super C382541> continuation) {
            super(2, continuation);
            this.$address = str;
            this.$currencyCode = str2;
            this.$nickname = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SaveAddressBottomSheetDuxo.this.new C382541(this.$address, this.$currencyCode, this.$nickname, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C382541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SaveAddressBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$saveAddress$1$1", m3645f = "SaveAddressBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$saveAddress$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SaveAddressBottomSheetViewState, Continuation<? super SaveAddressBottomSheetViewState>, Object> {
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
            public final Object invoke(SaveAddressBottomSheetViewState saveAddressBottomSheetViewState, Continuation<? super SaveAddressBottomSheetViewState> continuation) {
                return ((AnonymousClass1) create(saveAddressBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SaveAddressBottomSheetViewState.copy$default((SaveAddressBottomSheetViewState) this.L$0, true, false, 2, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SaveAddressBottomSheetDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoSavedAddressesStore cryptoSavedAddressesStore = SaveAddressBottomSheetDuxo.this.cryptoSavedAddressesStore;
                    String str = this.$address;
                    String str2 = this.$currencyCode;
                    String str3 = this.$nickname;
                    this.label = 1;
                    if (cryptoSavedAddressesStore.createSavedAddress(str, str2, str3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SaveAddressBottomSheetDuxo.this.cryptoSavedAddressesStore.refreshSavedAddresses(this.$currencyCode);
                SaveAddressBottomSheetDuxo.this.cryptoSavedAddressesStore.refreshRecentAddresses(this.$currencyCode);
                SaveAddressBottomSheetDuxo.this.submit(SaveAddressBottomSheetEvent.Success.INSTANCE);
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                SaveAddressBottomSheetDuxo.this.submit(new SaveAddressBottomSheetEvent.Error(SaveAddressBottomSheetDuxo.this.handleSaveAddressError$feature_crypto_transfer_externalDebug(th)));
                SaveAddressBottomSheetDuxo.this.applyMutation(new AnonymousClass2(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SaveAddressBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$saveAddress$1$2", m3645f = "SaveAddressBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetDuxo$saveAddress$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SaveAddressBottomSheetViewState, Continuation<? super SaveAddressBottomSheetViewState>, Object> {
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
            public final Object invoke(SaveAddressBottomSheetViewState saveAddressBottomSheetViewState, Continuation<? super SaveAddressBottomSheetViewState> continuation) {
                return ((AnonymousClass2) create(saveAddressBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SaveAddressBottomSheetViewState.copy$default((SaveAddressBottomSheetViewState) this.L$0, false, false, 2, null);
            }
        }
    }

    public final void saveAddress(String address, String currencyCode, String nickname) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C382541(address, currencyCode, nickname, null), 3, null);
    }

    public final StringResource handleSaveAddressError$feature_crypto_transfer_externalDebug(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
        ErrorResponse3 errorResponse3 = errorResponseExtractErrorResponse instanceof ErrorResponse3 ? (ErrorResponse3) errorResponseExtractErrorResponse : null;
        ErrorResponse3.ErrorCode error_code = errorResponse3 != null ? errorResponse3.getError_code() : null;
        switch (error_code == null ? -1 : WhenMappings.$EnumSwitchMapping$0[error_code.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return StringResource.INSTANCE.invoke(errorResponse3.getError_message());
            default:
                return StringResource.INSTANCE.invoke(C37934R.string.crypto_save_address_generic_error, new Object[0]);
        }
    }
}
