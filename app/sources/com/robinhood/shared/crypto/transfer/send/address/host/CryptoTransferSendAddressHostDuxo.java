package com.robinhood.shared.crypto.transfer.send.address.host;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.prefs.HasSeenAllowlistPrimerPref;
import com.robinhood.models.api.transfer.ApiAllowlistingStatus;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment;
import com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostEvent;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoTransferSendAddressHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001.BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020#J\u0017\u0010(\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*H\u0001¢\u0006\u0002\b+J\r\u0010,\u001a\u00020#H\u0000¢\u0006\u0002\b-R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDataState;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Args;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "hasSeenAllowlistPrimerPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostStateProvider;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/prefs/BooleanPreference;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "", "wasInitialWarningSheetShown", "getWasInitialWarningSheetShown", "()Z", "setWasInitialWarningSheetShown", "(Z)V", "onCreate", "", "acknowledgeProtectionSheet", PlaceTypes.ADDRESS, "", "markAllowlistPrimerAsSeen", "showInterstitialIfNecessary", "allowlistStatus", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;", "showInterstitialIfNecessary$feature_crypto_transfer_externalDebug", "showWarningSheetIfNecessary", "showWarningSheetIfNecessary$feature_crypto_transfer_externalDebug", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendAddressHostDuxo extends BaseDuxo3<CryptoTransferSendAddressHostDataState, CryptoTransferSendAddressHostViewState, CryptoTransferSendAddressHostEvent> implements HasArgs<CryptoTransferSendAddressFragment.Args> {
    private static final String INITIAL_WARNING_SHOWN_KEY = "initial_warning_shown";
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoSavedAddressesStore cryptoSavedAddressesStore;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final BooleanPreference hasSeenAllowlistPrimerPref;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransferSendAddressHostDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, AppType appType, CryptoTransferSendAddressHostStateProvider stateProvider, CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, CryptoExperimentsStore cryptoExperimentsStore, @HasSeenAllowlistPrimerPref BooleanPreference hasSeenAllowlistPrimerPref) {
        super(new CryptoTransferSendAddressHostDataState(appType, ((CryptoTransferSendAddressFragment.Args) INSTANCE.getArgs(savedStateHandle)).getUseSavedAddressesFlow(), null, null, false, 12, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(hasSeenAllowlistPrimerPref, "hasSeenAllowlistPrimerPref");
        this.savedStateHandle = savedStateHandle;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.hasSeenAllowlistPrimerPref = hasSeenAllowlistPrimerPref;
    }

    private final boolean getWasInitialWarningSheetShown() {
        Boolean bool = (Boolean) getSavedStateHandle().get(INITIAL_WARNING_SHOWN_KEY);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void setWasInitialWarningSheetShown(boolean z) {
        getSavedStateHandle().set(INITIAL_WARNING_SHOWN_KEY, Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (((CryptoTransferSendAddressFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getUseSavedAddressesFlow()) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C381561(null));
        }
    }

    /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1", m3645f = "CryptoTransferSendAddressHostDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1 */
    static final class C381561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C381561(Continuation<? super C381561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferSendAddressHostDuxo.this.new C381561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C381561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1$1", m3645f = "CryptoTransferSendAddressHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoTransferSendAddressHostDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSendAddressHostDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1$1$1", m3645f = "CryptoTransferSendAddressHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507101 extends ContinuationImpl7 implements Function2<CryptoTransferSendAddressHostDataState, Continuation<? super CryptoTransferSendAddressHostDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507101(boolean z, Continuation<? super C507101> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507101 c507101 = new C507101(this.$it, continuation);
                    c507101.L$0 = obj;
                    return c507101;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferSendAddressHostDataState cryptoTransferSendAddressHostDataState, Continuation<? super CryptoTransferSendAddressHostDataState> continuation) {
                    return ((C507101) create(cryptoTransferSendAddressHostDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTransferSendAddressHostDataState.copy$default((CryptoTransferSendAddressHostDataState) this.L$0, null, false, boxing.boxBoolean(this.$it), null, false, 27, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507101(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.onEach(CryptoTransferSendAddressHostDuxo.this.cryptoExperimentsStore.streamCryptoTransfersAddressAllowlistingExperiment(), new AnonymousClass1(CryptoTransferSendAddressHostDuxo.this, null)), new C38153x49453422(null, CryptoTransferSendAddressHostDuxo.this)));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoTransferSendAddressHostDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "allowlistStatus", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1$3", m3645f = "CryptoTransferSendAddressHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<AllowlistStatus, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTransferSendAddressHostDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSendAddressHostDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AllowlistStatus allowlistStatus, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(allowlistStatus, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1$3$1", m3645f = "CryptoTransferSendAddressHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferSendAddressHostDataState, Continuation<? super CryptoTransferSendAddressHostDataState>, Object> {
                final /* synthetic */ AllowlistStatus $allowlistStatus;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AllowlistStatus allowlistStatus, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$allowlistStatus = allowlistStatus;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowlistStatus, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferSendAddressHostDataState cryptoTransferSendAddressHostDataState, Continuation<? super CryptoTransferSendAddressHostDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoTransferSendAddressHostDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoTransferSendAddressHostDataState cryptoTransferSendAddressHostDataState = (CryptoTransferSendAddressHostDataState) this.L$0;
                    AllowlistStatus allowlistStatus = this.$allowlistStatus;
                    boolean z = false;
                    if (allowlistStatus != null && allowlistStatus.isAllowlistEnabled()) {
                        z = true;
                    }
                    return CryptoTransferSendAddressHostDataState.copy$default(cryptoTransferSendAddressHostDataState, null, false, null, boxing.boxBoolean(z), false, 23, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AllowlistStatus allowlistStatus = (AllowlistStatus) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1(allowlistStatus, null));
                    this.this$0.m2787x3500f16e(allowlistStatus);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$acknowledgeProtectionSheet$1", m3645f = "CryptoTransferSendAddressHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$acknowledgeProtectionSheet$1 */
    static final class C381541 extends ContinuationImpl7 implements Function2<CryptoTransferSendAddressHostDataState, Continuation<? super CryptoTransferSendAddressHostDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C381541(Continuation<? super C381541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C381541 c381541 = new C381541(continuation);
            c381541.L$0 = obj;
            return c381541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendAddressHostDataState cryptoTransferSendAddressHostDataState, Continuation<? super CryptoTransferSendAddressHostDataState> continuation) {
            return ((C381541) create(cryptoTransferSendAddressHostDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendAddressHostDataState.copy$default((CryptoTransferSendAddressHostDataState) this.L$0, null, false, null, null, true, 15, null);
        }
    }

    /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$acknowledgeProtectionSheet$2", m3645f = "CryptoTransferSendAddressHostDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$acknowledgeProtectionSheet$2 */
    static final class C381552 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $address;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C381552(String str, Continuation<? super C381552> continuation) {
            super(2, continuation);
            this.$address = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferSendAddressHostDuxo.this.new C381552(this.$address, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C381552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoTransfersStore cryptoTransfersStore = CryptoTransferSendAddressHostDuxo.this.cryptoTransfersStore;
                    Currency assetCurrency = ((CryptoTransferSendAddressFragment.Args) CryptoTransferSendAddressHostDuxo.INSTANCE.getArgs((HasSavedState) CryptoTransferSendAddressHostDuxo.this)).getUiCurrencyPair().getAssetCurrency();
                    String str = this.$address;
                    this.label = 1;
                    obj = cryptoTransfersStore.getSupportNetworksCo(assetCurrency, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoTransferSendAddressHostDuxo.this.submit(new CryptoTransferSendAddressHostEvent.Continue(this.$address, (ApiCryptoSupportedNetworks) obj));
                cryptoTransferSendAddressHostDuxo = CryptoTransferSendAddressHostDuxo.this;
                anonymousClass1 = new AnonymousClass1(null);
            } catch (Throwable th) {
                try {
                    if (!Throwables.isNetworkRelated(th)) {
                        throw th;
                    }
                    CryptoTransferSendAddressHostDuxo.this.submit(new CryptoTransferSendAddressHostEvent.Error(th));
                    cryptoTransferSendAddressHostDuxo = CryptoTransferSendAddressHostDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                } catch (Throwable th2) {
                    CryptoTransferSendAddressHostDuxo.this.applyMutation(new AnonymousClass1(null));
                    throw th2;
                }
            }
            cryptoTransferSendAddressHostDuxo.applyMutation(anonymousClass1);
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$acknowledgeProtectionSheet$2$1", m3645f = "CryptoTransferSendAddressHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostDuxo$acknowledgeProtectionSheet$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferSendAddressHostDataState, Continuation<? super CryptoTransferSendAddressHostDataState>, Object> {
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
            public final Object invoke(CryptoTransferSendAddressHostDataState cryptoTransferSendAddressHostDataState, Continuation<? super CryptoTransferSendAddressHostDataState> continuation) {
                return ((AnonymousClass1) create(cryptoTransferSendAddressHostDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoTransferSendAddressHostDataState.copy$default((CryptoTransferSendAddressHostDataState) this.L$0, null, false, null, null, false, 15, null);
            }
        }
    }

    public final void acknowledgeProtectionSheet(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        applyMutation(new C381541(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C381552(address, null), 3, null);
    }

    public final void markAllowlistPrimerAsSeen() {
        this.hasSeenAllowlistPrimerPref.set(true);
    }

    /* renamed from: showInterstitialIfNecessary$feature_crypto_transfer_externalDebug */
    public final void m2787x3500f16e(AllowlistStatus allowlistStatus) {
        if ((allowlistStatus != null ? allowlistStatus.getStatus() : null) == ApiAllowlistingStatus.Status.ENABLED && !this.hasSeenAllowlistPrimerPref.get()) {
            submit(CryptoTransferSendAddressHostEvent.ShowAllowlistPrimer.INSTANCE);
        } else {
            m2788x81966257();
        }
    }

    /* renamed from: showWarningSheetIfNecessary$feature_crypto_transfer_externalDebug */
    public final void m2788x81966257() {
        CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet = ((CryptoTransferSendAddressFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInitialWarningSheet();
        if (getWasInitialWarningSheetShown() || initialWarningSheet == null) {
            return;
        }
        setWasInitialWarningSheetShown(true);
        submit(new CryptoTransferSendAddressHostEvent.ShowInitialWarningSheet(initialWarningSheet));
    }

    /* compiled from: CryptoTransferSendAddressHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Args;", "<init>", "()V", "INITIAL_WARNING_SHOWN_KEY", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferSendAddressHostDuxo, CryptoTransferSendAddressFragment.Args> {
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
        public CryptoTransferSendAddressFragment.Args getArgs(CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo) {
            return (CryptoTransferSendAddressFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferSendAddressHostDuxo);
        }
    }
}
