package com.robinhood.shared.crypto.transfer.send.landing;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingEvent;
import com.robinhood.shared.crypto.transfer.unified.HigherCryptoWithdrawalLimitLastShownPref;
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
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: CryptoTransferSendLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002*)BK\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDataState;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo$InitArgs;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/prefs/LongPreference;", "higherLimitSheetShownTimestampPref", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/prefs/LongPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "t", "", "handleError", "(Ljava/lang/Throwable;)V", "onCreate", "()V", "markHigherLimitSheetAsShown", "markInitialWarningSheetAsShown", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "Lcom/robinhood/prefs/LongPreference;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "InitArgs", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendLandingDuxo extends BaseDuxo3<CryptoTransferSendLandingDataState, CryptoTransferSendLandingViewState, CryptoTransferSendLandingEvent> implements HasArgs<InitArgs> {
    private static final String INITIAL_SEND_WARNING_SHOWN_KEY = "initial_send_warning_shown";
    private final Clock clock;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final LongPreference higherLimitSheetShownTimestampPref;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoTransferSendLandingDuxo(AppType appType, Clock clock, CryptoTransfersStore cryptoTransfersStore, CurrencyPairV2Store currencyPairStore, @HigherCryptoWithdrawalLimitLastShownPref LongPreference higherLimitSheetShownTimestampPref, SavedStateHandle savedStateHandle, CryptoTransferSendLandingStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(higherLimitSheetShownTimestampPref, "higherLimitSheetShownTimestampPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        boolean z = appType == AppType.RHC;
        boolean useSavedAddressesFlow = ((InitArgs) INSTANCE.getArgs(savedStateHandle)).getUseSavedAddressesFlow();
        Boolean bool = (Boolean) savedStateHandle.get(INITIAL_SEND_WARNING_SHOWN_KEY);
        super(new CryptoTransferSendLandingDataState(z, null, null, null, useSavedAddressesFlow, bool != null ? bool.booleanValue() : false, 14, null), stateProvider, duxoBundle);
        this.clock = clock;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.currencyPairStore = currencyPairStore;
        this.higherLimitSheetShownTimestampPref = higherLimitSheetShownTimestampPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C383331(null));
    }

    /* compiled from: CryptoTransferSendLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1 */
    static final class C383331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C383331(Continuation<? super C383331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383331 c383331 = CryptoTransferSendLandingDuxo.this.new C383331(continuation);
            c383331.L$0 = obj;
            return c383331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C383331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoTransferSendLandingDuxo.this.currencyPairStore.streamCurrencyPairFlow(((InitArgs) CryptoTransferSendLandingDuxo.INSTANCE.getArgs((HasArgs) CryptoTransferSendLandingDuxo.this)).getCurrencyPairId());
                LifecycleHostCoroutineScope lifecycleScope = CryptoTransferSendLandingDuxo.this.getLifecycleScope();
                SharingStarted.Companion companion = SharingStarted.INSTANCE;
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(flowStreamCurrencyPairFlow, lifecycleScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                SharedFlow sharedFlowShareIn2 = FlowKt.shareIn(FlowKt.transformLatest(sharedFlowShareIn, new C38332x2960963d(null, CryptoTransferSendLandingDuxo.this)), CryptoTransferSendLandingDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, CryptoTransferSendLandingDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn2, CryptoTransferSendLandingDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CryptoTransferSendLandingDuxo.this, sharedFlowShareIn2, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(sharedFlowShareIn, CryptoTransferSendLandingDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoTransferSendLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$1", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {76}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiCurrencyPair> $currencyPairFlow;
            int label;
            final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UiCurrencyPair> sharedFlow, CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currencyPairFlow = sharedFlow;
                this.this$0 = cryptoTransferSendLandingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$currencyPairFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow<UiCurrencyPair> sharedFlow = this.$currencyPairFlow;
                        C507171 c507171 = new C507171(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(sharedFlow, c507171, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.this$0.handleError(th);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferSendLandingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$1$1", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507171 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507171(CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Continuation<? super C507171> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSendLandingDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507171 c507171 = new C507171(this.this$0, continuation);
                    c507171.L$0 = obj;
                    return c507171;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                    return ((C507171) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferSendLandingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$1$1$1", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507181 extends ContinuationImpl7 implements Function2<CryptoTransferSendLandingDataState, Continuation<? super CryptoTransferSendLandingDataState>, Object> {
                    final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507181(UiCurrencyPair uiCurrencyPair, Continuation<? super C507181> continuation) {
                        super(2, continuation);
                        this.$uiCurrencyPair = uiCurrencyPair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507181 c507181 = new C507181(this.$uiCurrencyPair, continuation);
                        c507181.L$0 = obj;
                        return c507181;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferSendLandingDataState cryptoTransferSendLandingDataState, Continuation<? super CryptoTransferSendLandingDataState> continuation) {
                        return ((C507181) create(cryptoTransferSendLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferSendLandingDataState.copy$default((CryptoTransferSendLandingDataState) this.L$0, false, this.$uiCurrencyPair, null, null, false, false, 61, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507181((UiCurrencyPair) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoTransferSendLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$2", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {87}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<CryptoTransferConfig> $configFlow;
            int label;
            final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<CryptoTransferConfig> sharedFlow, CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$configFlow = sharedFlow;
                this.this$0 = cryptoTransferSendLandingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$configFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow<CryptoTransferConfig> sharedFlow = this.$configFlow;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.this$0.handleError(th);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferSendLandingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$2$1", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferConfig, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSendLandingDuxo;
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

                /* compiled from: CryptoTransferSendLandingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$2$1$1", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507191 extends ContinuationImpl7 implements Function2<CryptoTransferSendLandingDataState, Continuation<? super CryptoTransferSendLandingDataState>, Object> {
                    final /* synthetic */ CryptoTransferConfig $config;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507191(CryptoTransferConfig cryptoTransferConfig, Continuation<? super C507191> continuation) {
                        super(2, continuation);
                        this.$config = cryptoTransferConfig;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507191 c507191 = new C507191(this.$config, continuation);
                        c507191.L$0 = obj;
                        return c507191;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferSendLandingDataState cryptoTransferSendLandingDataState, Continuation<? super CryptoTransferSendLandingDataState> continuation) {
                        return ((C507191) create(cryptoTransferSendLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferSendLandingDataState.copy$default((CryptoTransferSendLandingDataState) this.L$0, false, null, this.$config, null, false, false, 59, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507191((CryptoTransferConfig) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoTransferSendLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$3", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {107}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<CryptoTransferConfig> $configFlow;
            int label;
            final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, SharedFlow<CryptoTransferConfig> sharedFlow, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSendLandingDuxo;
                this.$configFlow = sharedFlow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$configFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (Duration.between(Instant.ofEpochMilli(this.this$0.higherLimitSheetShownTimestampPref.get()), this.this$0.clock.instant()).toDays() > 30) {
                            final SharedFlow<CryptoTransferConfig> sharedFlow = this.$configFlow;
                            Flow flowTransformLatest = FlowKt.transformLatest(new Flow<CryptoTransferConfig>() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$3$invokeSuspend$$inlined$filter$1

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$3$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        Object L$1;
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
                                            if (((CryptoTransferConfig) obj).getEligibleForHigherLimit()) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
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
                                public Object collect(FlowCollector<? super CryptoTransferConfig> flowCollector, Continuation continuation) {
                                    Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }
                            }, new C38330x50ffe30e(null, this.this$0));
                            C507203 c507203 = new C507203(this.this$0, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(flowTransformLatest, c507203, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.this$0.handleError(th);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferSendLandingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "limits", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$3$3", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C507203 extends ContinuationImpl7 implements Function2<CryptoTransferLimits, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507203(CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Continuation<? super C507203> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSendLandingDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507203 c507203 = new C507203(this.this$0, continuation);
                    c507203.L$0 = obj;
                    return c507203;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferLimits cryptoTransferLimits, Continuation<? super Unit> continuation) {
                    return ((C507203) create(cryptoTransferLimits, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new CryptoTransferSendLandingEvent.ShowHigherLimitSheet((CryptoTransferLimits) this.L$0));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: CryptoTransferSendLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiCurrencyPair> $currencyPairFlow;
            int label;
            final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SharedFlow<UiCurrencyPair> sharedFlow, CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$currencyPairFlow = sharedFlow;
                this.this$0 = cryptoTransferSendLandingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$currencyPairFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final SharedFlow<UiCurrencyPair> sharedFlow = this.$currencyPairFlow;
                        final CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo = this.this$0;
                        Flow<ApiCryptoSupportedNetworks> flow = new Flow<ApiCryptoSupportedNetworks>() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super ApiCryptoSupportedNetworks> flowCollector, Continuation continuation) {
                                Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector, cryptoTransferSendLandingDuxo), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;
                                final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {51, 50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                                public AnonymousClass2(FlowCollector flowCollector, CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo) {
                                    this.$this_unsafeFlow = flowCollector;
                                    this.this$0 = cryptoTransferSendLandingDuxo;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
                                
                                    if (r8.emit(r9, r0) == r1) goto L22;
                                 */
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    FlowCollector flowCollector;
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
                                        FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                        CryptoTransfersStore cryptoTransfersStore = this.this$0.cryptoTransfersStore;
                                        Currency assetCurrency = ((UiCurrencyPair) obj).getAssetCurrency();
                                        anonymousClass1.L$0 = flowCollector2;
                                        anonymousClass1.label = 1;
                                        Object supportNetworksCo = cryptoTransfersStore.getSupportNetworksCo(assetCurrency, null, anonymousClass1);
                                        if (supportNetworksCo != coroutine_suspended) {
                                            obj2 = supportNetworksCo;
                                            flowCollector = flowCollector2;
                                        }
                                        return coroutine_suspended;
                                    }
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                        return Unit.INSTANCE;
                                    }
                                    FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                                    ResultKt.throwOnFailure(obj2);
                                    flowCollector = flowCollector3;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 2;
                                }
                            }
                        };
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.this$0.handleError(th);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferSendLandingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "supportedNetworks", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4$2", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ApiCryptoSupportedNetworks, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSendLandingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSendLandingDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(apiCryptoSupportedNetworks, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferSendLandingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4$2$1", m3645f = "CryptoTransferSendLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo$onCreate$1$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferSendLandingDataState, Continuation<? super CryptoTransferSendLandingDataState>, Object> {
                    final /* synthetic */ ApiCryptoSupportedNetworks $supportedNetworks;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$supportedNetworks = apiCryptoSupportedNetworks;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$supportedNetworks, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferSendLandingDataState cryptoTransferSendLandingDataState, Continuation<? super CryptoTransferSendLandingDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoTransferSendLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferSendLandingDataState.copy$default((CryptoTransferSendLandingDataState) this.L$0, false, null, null, this.$supportedNetworks, false, false, 55, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ApiCryptoSupportedNetworks) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void markHigherLimitSheetAsShown() {
        this.higherLimitSheetShownTimestampPref.set(this.clock.instant().toEpochMilli());
    }

    public final void markInitialWarningSheetAsShown() {
        getSavedStateHandle().set(INITIAL_SEND_WARNING_SHOWN_KEY, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable t) throws Throwable {
        if (Throwables.isNetworkRelated(t)) {
            submit(new CryptoTransferSendLandingEvent.Error(t));
            return;
        }
        throw t;
    }

    /* compiled from: CryptoTransferSendLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo$InitArgs;", "Landroid/os/Parcelable;", "loggingSessionId", "Ljava/util/UUID;", "currencyPairId", "initialAction", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "useSavedAddressesFlow", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/api/transfer/CryptoTransferAction;Z)V", "getLoggingSessionId", "()Ljava/util/UUID;", "getCurrencyPairId", "getInitialAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "getUseSavedAddressesFlow", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final CryptoTransferAction initialAction;
        private final UUID loggingSessionId;
        private final boolean useSavedAddressesFlow;

        /* compiled from: CryptoTransferSendLandingDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), CryptoTransferAction.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, UUID uuid2, CryptoTransferAction cryptoTransferAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.loggingSessionId;
            }
            if ((i & 2) != 0) {
                uuid2 = initArgs.currencyPairId;
            }
            if ((i & 4) != 0) {
                cryptoTransferAction = initArgs.initialAction;
            }
            if ((i & 8) != 0) {
                z = initArgs.useSavedAddressesFlow;
            }
            return initArgs.copy(uuid, uuid2, cryptoTransferAction, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoTransferAction getInitialAction() {
            return this.initialAction;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUseSavedAddressesFlow() {
            return this.useSavedAddressesFlow;
        }

        public final InitArgs copy(UUID loggingSessionId, UUID currencyPairId, CryptoTransferAction initialAction, boolean useSavedAddressesFlow) {
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(initialAction, "initialAction");
            return new InitArgs(loggingSessionId, currencyPairId, initialAction, useSavedAddressesFlow);
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
            return Intrinsics.areEqual(this.loggingSessionId, initArgs.loggingSessionId) && Intrinsics.areEqual(this.currencyPairId, initArgs.currencyPairId) && this.initialAction == initArgs.initialAction && this.useSavedAddressesFlow == initArgs.useSavedAddressesFlow;
        }

        public int hashCode() {
            return (((((this.loggingSessionId.hashCode() * 31) + this.currencyPairId.hashCode()) * 31) + this.initialAction.hashCode()) * 31) + Boolean.hashCode(this.useSavedAddressesFlow);
        }

        public String toString() {
            return "InitArgs(loggingSessionId=" + this.loggingSessionId + ", currencyPairId=" + this.currencyPairId + ", initialAction=" + this.initialAction + ", useSavedAddressesFlow=" + this.useSavedAddressesFlow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.loggingSessionId);
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.initialAction.name());
            dest.writeInt(this.useSavedAddressesFlow ? 1 : 0);
        }

        public InitArgs(UUID loggingSessionId, UUID currencyPairId, CryptoTransferAction initialAction, boolean z) {
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(initialAction, "initialAction");
            this.loggingSessionId = loggingSessionId;
            this.currencyPairId = currencyPairId;
            this.initialAction = initialAction;
            this.useSavedAddressesFlow = z;
        }

        public final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final CryptoTransferAction getInitialAction() {
            return this.initialAction;
        }

        public final boolean getUseSavedAddressesFlow() {
            return this.useSavedAddressesFlow;
        }
    }

    /* compiled from: CryptoTransferSendLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo$InitArgs;", "<init>", "()V", "INITIAL_SEND_WARNING_SHOWN_KEY", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoTransferSendLandingDuxo, InitArgs> {
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
        public InitArgs getArgs(CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferSendLandingDuxo);
        }
    }
}
