package com.robinhood.shared.crypto.transfer;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.rhc.upsells.RhcUpsellsService;
import com.robinhood.rhc.upsells.TouchPoint;
import com.robinhood.rhc.upsells.TouchPointData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.shared.crypto.transfer.CryptoTransferEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CryptoTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00011BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0012\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0002J\u0010\u0010\u001f\u001a\u0004\u0018\u00010 H\u0082@¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J'\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010%\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0001¢\u0006\u0002\b-R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010)\u001a\u00020**\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "rhcUpsellsMicrogramApp", "Lmicrogram/android/inject/MicrogramComponent;", "onCreate", "checkCryptoTransferConfigIfNeeded", "checkCryptoTransferConfig", "shouldCheckForUpsell", "", "refreshConfiguration", "streamMicrogramUpsell", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateWithConfig", "launchData", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey;", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "generateNavigationEvent", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "localAction", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "currencyPairId", "Ljava/util/UUID;", "generateNavigationEvent$feature_crypto_transfer_externalDebug", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;", "getLocalAction", "(Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;)Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferDuxo extends BaseDuxo5<Unit, CryptoTransferEvent> implements HasSavedState {
    private static final String SAVED_STATE_KEY_CONFIG_FETCHED = "config_fetched";
    private final AppType appType;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final MicrogramComponent rhcUpsellsMicrogramApp;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoTransferIntentKey.Action.values().length];
            try {
                iArr[CryptoTransferIntentKey.Action.ENROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoTransferIntentKey.Action.RECEIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoTransferIntentKey.Action.SEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoTransferIntentKey.Action.SAVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CryptoTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.CryptoTransferDuxo", m3645f = "CryptoTransferDuxo.kt", m3646l = {128, 131}, m3647m = "streamMicrogramUpsell")
    /* renamed from: com.robinhood.shared.crypto.transfer.CryptoTransferDuxo$streamMicrogramUpsell$1 */
    static final class C379301 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C379301(Continuation<? super C379301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoTransferDuxo.this.streamMicrogramUpsell(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransferDuxo(SavedStateHandle savedStateHandle, AppType appType, CryptoExperimentsStore cryptoExperimentsStore, CryptoTransfersStore cryptoTransfersStore, CurrencyPairV2Store currencyPairStore, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.appType = appType;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.currencyPairStore = currencyPairStore;
        this.rhcUpsellsMicrogramApp = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-rhc-upsells", null, 2, null), null, 4, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        checkCryptoTransferConfigIfNeeded();
    }

    private final void checkCryptoTransferConfigIfNeeded() {
        Boolean bool = (Boolean) getSavedStateHandle().get(SAVED_STATE_KEY_CONFIG_FETCHED);
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        checkCryptoTransferConfig(true);
    }

    static /* synthetic */ void checkCryptoTransferConfig$default(CryptoTransferDuxo cryptoTransferDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        cryptoTransferDuxo.checkCryptoTransferConfig(z);
    }

    /* compiled from: CryptoTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.CryptoTransferDuxo$checkCryptoTransferConfig$1", m3645f = "CryptoTransferDuxo.kt", m3646l = {89, 91, 95}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.CryptoTransferDuxo$checkCryptoTransferConfig$1 */
    static final class C379291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $shouldCheckForUpsell;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C379291(boolean z, Continuation<? super C379291> continuation) {
            super(2, continuation);
            this.$shouldCheckForUpsell = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferDuxo.this.new C379291(this.$shouldCheckForUpsell, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:40:0x00ae, B:41:0x00b2, B:43:0x00c3, B:44:0x00cd, B:14:0x0026, B:34:0x0099, B:36:0x009f, B:15:0x002b, B:26:0x006e, B:27:0x0070, B:29:0x0078, B:31:0x007e, B:18:0x0039, B:21:0x004d, B:23:0x0061, B:45:0x00db, B:46:0x00e2), top: B:53:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x001b, PHI: r9
          0x0099: PHI (r9v19 java.lang.Object) = (r9v15 java.lang.Object), (r9v0 java.lang.Object) binds: [B:32:0x0096, B:14:0x0026] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:40:0x00ae, B:41:0x00b2, B:43:0x00c3, B:44:0x00cd, B:14:0x0026, B:34:0x0099, B:36:0x009f, B:15:0x002b, B:26:0x006e, B:27:0x0070, B:29:0x0078, B:31:0x007e, B:18:0x0039, B:21:0x004d, B:23:0x0061, B:45:0x00db, B:46:0x00e2), top: B:53:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:40:0x00ae, B:41:0x00b2, B:43:0x00c3, B:44:0x00cd, B:14:0x0026, B:34:0x0099, B:36:0x009f, B:15:0x002b, B:26:0x006e, B:27:0x0070, B:29:0x0078, B:31:0x007e, B:18:0x0039, B:21:0x004d, B:23:0x0061, B:45:0x00db, B:46:0x00e2), top: B:53:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:40:0x00ae, B:41:0x00b2, B:43:0x00c3, B:44:0x00cd, B:14:0x0026, B:34:0x0099, B:36:0x009f, B:15:0x002b, B:26:0x006e, B:27:0x0070, B:29:0x0078, B:31:0x007e, B:18:0x0039, B:21:0x004d, B:23:0x0061, B:45:0x00db, B:46:0x00e2), top: B:53:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UiCurrencyPair uiCurrencyPair;
            CryptoTransferConfig cryptoTransferConfig;
            CryptoTransferConfig cryptoTransferConfig2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            String str = null;
            try {
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    CryptoTransferDuxo.this.submit(new CryptoTransferEvent.Error(th));
                } else {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTransferDuxo.this.submit(CryptoTransferEvent.NavigateEvent.Loading.INSTANCE);
                Companion companion = CryptoTransferDuxo.INSTANCE;
                if (((CryptoTransferIntentKey) companion.getExtras((HasSavedState) CryptoTransferDuxo.this)).getAction() == CryptoTransferIntentKey.Action.ENROLL) {
                    uiCurrencyPair = null;
                    CryptoTransfersStore cryptoTransfersStore = CryptoTransferDuxo.this.cryptoTransfersStore;
                    Currency assetCurrency = uiCurrencyPair == null ? uiCurrencyPair.getAssetCurrency() : null;
                    CryptoTransferDuxo cryptoTransferDuxo = CryptoTransferDuxo.this;
                    CryptoTransferAction localAction = cryptoTransferDuxo.getLocalAction(((CryptoTransferIntentKey) CryptoTransferDuxo.INSTANCE.getExtras((HasSavedState) cryptoTransferDuxo)).getAction());
                    this.label = 2;
                    obj = cryptoTransfersStore.fetchTransferConfigCo(assetCurrency, localAction, this);
                    if (obj == coroutine_suspended) {
                        cryptoTransferConfig = (CryptoTransferConfig) obj;
                        if (this.$shouldCheckForUpsell) {
                        }
                        CryptoTransferDuxo.this.getSavedStateHandle().set(CryptoTransferDuxo.SAVED_STATE_KEY_CONFIG_FETCHED, boxing.boxBoolean(true));
                        if (str != null) {
                        }
                        CryptoTransferDuxo cryptoTransferDuxo2 = CryptoTransferDuxo.this;
                        cryptoTransferDuxo2.navigateWithConfig((CryptoTransferIntentKey) CryptoTransferDuxo.INSTANCE.getExtras((HasSavedState) cryptoTransferDuxo2), cryptoTransferConfig);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                CurrencyPairV2Store currencyPairV2Store = CryptoTransferDuxo.this.currencyPairStore;
                UUID currencyPairId = ((CryptoTransferIntentKey) companion.getExtras((HasSavedState) CryptoTransferDuxo.this)).getCurrencyPairId();
                if (currencyPairId == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = currencyPairV2Store.streamCurrencyPairFlow(currencyPairId);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamCurrencyPairFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cryptoTransferConfig2 = (CryptoTransferConfig) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        cryptoTransferConfig = cryptoTransferConfig2;
                        CryptoTransferDuxo.this.getSavedStateHandle().set(CryptoTransferDuxo.SAVED_STATE_KEY_CONFIG_FETCHED, boxing.boxBoolean(true));
                        if (str != null) {
                            CryptoTransferDuxo.this.submit(new CryptoTransferEvent.Upsell(str));
                        }
                        CryptoTransferDuxo cryptoTransferDuxo22 = CryptoTransferDuxo.this;
                        cryptoTransferDuxo22.navigateWithConfig((CryptoTransferIntentKey) CryptoTransferDuxo.INSTANCE.getExtras((HasSavedState) cryptoTransferDuxo22), cryptoTransferConfig);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    cryptoTransferConfig = (CryptoTransferConfig) obj;
                    if (this.$shouldCheckForUpsell) {
                        CryptoTransferDuxo cryptoTransferDuxo3 = CryptoTransferDuxo.this;
                        this.L$0 = cryptoTransferConfig;
                        this.label = 3;
                        Object objStreamMicrogramUpsell = cryptoTransferDuxo3.streamMicrogramUpsell(this);
                        if (objStreamMicrogramUpsell != coroutine_suspended) {
                            cryptoTransferConfig2 = cryptoTransferConfig;
                            obj = objStreamMicrogramUpsell;
                            str = (String) obj;
                            cryptoTransferConfig = cryptoTransferConfig2;
                        }
                        return coroutine_suspended;
                    }
                    CryptoTransferDuxo.this.getSavedStateHandle().set(CryptoTransferDuxo.SAVED_STATE_KEY_CONFIG_FETCHED, boxing.boxBoolean(true));
                    if (str != null) {
                    }
                    CryptoTransferDuxo cryptoTransferDuxo222 = CryptoTransferDuxo.this;
                    cryptoTransferDuxo222.navigateWithConfig((CryptoTransferIntentKey) CryptoTransferDuxo.INSTANCE.getExtras((HasSavedState) cryptoTransferDuxo222), cryptoTransferConfig);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            uiCurrencyPair = (UiCurrencyPair) obj;
            CryptoTransfersStore cryptoTransfersStore2 = CryptoTransferDuxo.this.cryptoTransfersStore;
            if (uiCurrencyPair == null) {
            }
            CryptoTransferDuxo cryptoTransferDuxo4 = CryptoTransferDuxo.this;
            CryptoTransferAction localAction2 = cryptoTransferDuxo4.getLocalAction(((CryptoTransferIntentKey) CryptoTransferDuxo.INSTANCE.getExtras((HasSavedState) cryptoTransferDuxo4)).getAction());
            this.label = 2;
            obj = cryptoTransfersStore2.fetchTransferConfigCo(assetCurrency, localAction2, this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    private final void checkCryptoTransferConfig(boolean shouldCheckForUpsell) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C379291(shouldCheckForUpsell, null), 3, null);
    }

    public final void refreshConfiguration() {
        checkCryptoTransferConfig$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (r0 == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object streamMicrogramUpsell(Continuation<? super String> continuation) {
        C379301 c379301;
        RhcUpsellsService rhcUpsellsService;
        if (continuation instanceof C379301) {
            c379301 = (C379301) continuation;
            int i = c379301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c379301.label = i - Integer.MIN_VALUE;
            } else {
                c379301 = new C379301(continuation);
            }
        }
        Object objFirstOrNull = c379301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c379301.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                if (this.appType == AppType.RHC) {
                    Companion companion = INSTANCE;
                    if (((CryptoTransferIntentKey) companion.getExtras((HasSavedState) this)).getCheckForUpsell() && CollectionsKt.listOf((Object[]) new CryptoTransferAction[]{CryptoTransferAction.RECEIVE, CryptoTransferAction.ENROLL}).contains(getLocalAction(((CryptoTransferIntentKey) companion.getExtras((HasSavedState) this)).getAction()))) {
                        rhcUpsellsService = (RhcUpsellsService) this.rhcUpsellsMicrogramApp.getServiceLocator().getClient(RhcUpsellsService.class);
                        Flow<Boolean> flowStreamDepositMatchEuExperiment = this.cryptoExperimentsStore.streamDepositMatchEuExperiment();
                        c379301.L$0 = rhcUpsellsService;
                        c379301.label = 1;
                        objFirstOrNull = FlowKt.firstOrNull(flowStreamDepositMatchEuExperiment, c379301);
                        if (objFirstOrNull == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
                String str = (String) objFirstOrNull;
                if (str != null) {
                    boolean z = StringsKt.isBlank(str);
                    if (!z) {
                        return str;
                    }
                }
                return null;
            }
            rhcUpsellsService = (RhcUpsellsService) c379301.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            Boolean bool = (Boolean) objFirstOrNull;
            if (bool != null ? bool.booleanValue() : false) {
                TouchPoint touchPoint = TouchPoint.CRYPTO_TRANSFERS;
                UUID currencyPairId = ((CryptoTransferIntentKey) INSTANCE.getExtras((HasSavedState) this)).getCurrencyPairId();
                TouchPointData touchPointData = new TouchPointData(touchPoint, (String) null, currencyPairId != null ? currencyPairId.toString() : null, 2, (DefaultConstructorMarker) null);
                c379301.L$0 = null;
                c379301.label = 2;
                objFirstOrNull = rhcUpsellsService.shouldShowUpsell(touchPointData, c379301);
            }
            return null;
        } catch (Throwable th) {
            if (!Throwables.isNetworkRelated(th) && !(th instanceof CancellationException)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RuntimeException("Unable to fetch microgram deposit match upsell", th), false, new EventMetadata(SentryTeam.CRYPTO, null, null, 6, null), 2, null);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateWithConfig(CryptoTransferIntentKey launchData, CryptoTransferConfig config) {
        submit(generateNavigationEvent$feature_crypto_transfer_externalDebug(getLocalAction(launchData.getAction()), config, launchData.getCurrencyPairId()));
    }

    public final CryptoTransferEvent.NavigateEvent generateNavigationEvent$feature_crypto_transfer_externalDebug(CryptoTransferAction localAction, CryptoTransferConfig config, UUID currencyPairId) {
        CryptoTransferAction cryptoTransferAction;
        CryptoTransferAction cryptoTransferAction2;
        Intrinsics.checkNotNullParameter(localAction, "localAction");
        Intrinsics.checkNotNullParameter(config, "config");
        if (localAction == CryptoTransferAction.ENROLL || ((localAction == (cryptoTransferAction = CryptoTransferAction.RECEIVE) && config.getReceiveState() == ApiCryptoTransferConfig.TransferStates.ReceiveState.ENROLLMENT) || (localAction == (cryptoTransferAction2 = CryptoTransferAction.SEND) && config.getSendState() == ApiCryptoTransferConfig.TransferStates.SendState.ENROLLMENT))) {
            return new CryptoTransferEvent.NavigateEvent.Enrollment(config.getEnrollmentState(), localAction);
        }
        if (localAction == cryptoTransferAction) {
            if (currencyPairId != null) {
                return new CryptoTransferEvent.NavigateEvent.Receive(currencyPairId);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (localAction != cryptoTransferAction2) {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(config);
            throw new ExceptionsH();
        }
        if (currencyPairId != null) {
            return new CryptoTransferEvent.NavigateEvent.Send(currencyPairId, config.getSendState());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoTransferAction getLocalAction(CryptoTransferIntentKey.Action action) {
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            return CryptoTransferAction.ENROLL;
        }
        if (i == 2) {
            return CryptoTransferAction.RECEIVE;
        }
        if (i == 3) {
            return CryptoTransferAction.SEND;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SAVE action is not supported in transfer flow");
    }

    /* compiled from: CryptoTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferDuxo;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey;", "<init>", "()V", "SAVED_STATE_KEY_CONFIG_FETCHED", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<CryptoTransferDuxo, CryptoTransferIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CryptoTransferIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (CryptoTransferIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CryptoTransferIntentKey getExtras(CryptoTransferDuxo cryptoTransferDuxo) {
            return (CryptoTransferIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, cryptoTransferDuxo);
        }
    }
}
