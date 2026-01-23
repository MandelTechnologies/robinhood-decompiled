package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.trade.crypto.dagger.FeeTierStatusLastTimeSeenMillisPref;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: CryptoFeeTierStatusDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002$#BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDataState;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo$Args;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierStore", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "feeTierNotificationProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "feeTierStatusLastTimeSeenMillisPref", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "fetchFeeTierInfo", "()V", "onCreate", "onStart", "onTryAgainClick", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/LongPreference;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "Args", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoFeeTierStatusDuxo extends BaseDuxo<CryptoFeeTierStatusDataState, CryptoFeeTierStatusViewState> implements HasArgs<Args> {
    private final Clock clock;
    private final CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider;
    private final LongPreference feeTierStatusLastTimeSeenMillisPref;
    private final CryptoFeeTierStore feeTierStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoFeeTierStatusDuxo(CryptoFeeTierStore feeTierStore, CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider, Clock clock, @FeeTierStatusLastTimeSeenMillisPref LongPreference feeTierStatusLastTimeSeenMillisPref, CryptoFeeTierStatusDuxo2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
        Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(feeTierStatusLastTimeSeenMillisPref, "feeTierStatusLastTimeSeenMillisPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        CryptoFeeTierInfo feeTierInfo = ((Args) companion.getArgs(savedStateHandle)).getFeeTierInfo();
        Result resultM28549boximpl = feeTierInfo != null ? Result.m28549boximpl(Result.m28550constructorimpl(feeTierInfo)) : null;
        Boolean canSkipNotificationPrompt = ((Args) companion.getArgs(savedStateHandle)).getCanSkipNotificationPrompt();
        super(new CryptoFeeTierStatusDataState(resultM28549boximpl, canSkipNotificationPrompt != null ? Result.m28549boximpl(Result.m28550constructorimpl(canSkipNotificationPrompt)) : null), stateProvider, duxoBundle);
        this.feeTierStore = feeTierStore;
        this.feeTierNotificationProvider = feeTierNotificationProvider;
        this.clock = clock;
        this.feeTierStatusLastTimeSeenMillisPref = feeTierStatusLastTimeSeenMillisPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C403821(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403832(null), 3, null);
    }

    /* compiled from: CryptoFeeTierStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$onCreate$1", m3645f = "CryptoFeeTierStatusDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$onCreate$1 */
    static final class C403821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403821(Continuation<? super C403821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeTierStatusDuxo.this.new C403821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM25807canSkipNotificationPromptIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider = CryptoFeeTierStatusDuxo.this.feeTierNotificationProvider;
                this.label = 1;
                objM25807canSkipNotificationPromptIoAF18A = cryptoFeeTierNotificationStatusProvider.m25807canSkipNotificationPromptIoAF18A(this);
                if (objM25807canSkipNotificationPromptIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM25807canSkipNotificationPromptIoAF18A = ((Result) obj).getValue();
            }
            CryptoFeeTierStatusDuxo.this.applyMutation(new AnonymousClass1(objM25807canSkipNotificationPromptIoAF18A, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoFeeTierStatusDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$onCreate$1$1", m3645f = "CryptoFeeTierStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoFeeTierStatusDataState, Continuation<? super CryptoFeeTierStatusDataState>, Object> {
            final /* synthetic */ Object $result;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Object obj, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoFeeTierStatusDataState cryptoFeeTierStatusDataState, Continuation<? super CryptoFeeTierStatusDataState> continuation) {
                return ((AnonymousClass1) create(cryptoFeeTierStatusDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoFeeTierStatusDataState.copy$default((CryptoFeeTierStatusDataState) this.L$0, null, Result.m28549boximpl(this.$result), 1, null);
            }
        }
    }

    /* compiled from: CryptoFeeTierStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$onCreate$2", m3645f = "CryptoFeeTierStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$onCreate$2 */
    static final class C403832 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403832(Continuation<? super C403832> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeTierStatusDuxo.this.new C403832(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoFeeTierStatusDuxo.this.feeTierStatusLastTimeSeenMillisPref.set(CryptoFeeTierStatusDuxo.this.clock.millis());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoFeeTierStatusDuxo.onStart$lambda$2(this.f$0, (CryptoFeeTierStatusDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo, CryptoFeeTierStatusDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.m25886getFeeTierInfoResultxLWZpok() == null) {
            cryptoFeeTierStatusDuxo.fetchFeeTierInfo();
        }
        return Unit.INSTANCE;
    }

    public final void onTryAgainClick() {
        fetchFeeTierInfo();
    }

    /* compiled from: CryptoFeeTierStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$fetchFeeTierInfo$1", m3645f = "CryptoFeeTierStatusDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$fetchFeeTierInfo$1 */
    static final class C403811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403811(Continuation<? super C403811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeTierStatusDuxo.this.new C403811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoFeeTierStatusDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$fetchFeeTierInfo$1$1", m3645f = "CryptoFeeTierStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$fetchFeeTierInfo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoFeeTierStatusDataState, Continuation<? super CryptoFeeTierStatusDataState>, Object> {
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
            public final Object invoke(CryptoFeeTierStatusDataState cryptoFeeTierStatusDataState, Continuation<? super CryptoFeeTierStatusDataState> continuation) {
                return ((AnonymousClass1) create(cryptoFeeTierStatusDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoFeeTierStatusDataState.copy$default((CryptoFeeTierStatusDataState) this.L$0, null, null, 2, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM22810getCryptoFeeTierInfoIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoFeeTierStatusDuxo.this.applyMutation(new AnonymousClass1(null));
                CryptoFeeTierStore cryptoFeeTierStore = CryptoFeeTierStatusDuxo.this.feeTierStore;
                this.label = 1;
                objM22810getCryptoFeeTierInfoIoAF18A = cryptoFeeTierStore.m22810getCryptoFeeTierInfoIoAF18A(this);
                if (objM22810getCryptoFeeTierInfoIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22810getCryptoFeeTierInfoIoAF18A = ((Result) obj).getValue();
            }
            CryptoFeeTierStatusDuxo.this.applyMutation(new AnonymousClass2(objM22810getCryptoFeeTierInfoIoAF18A, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoFeeTierStatusDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$fetchFeeTierInfo$1$2", m3645f = "CryptoFeeTierStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo$fetchFeeTierInfo$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoFeeTierStatusDataState, Continuation<? super CryptoFeeTierStatusDataState>, Object> {
            final /* synthetic */ Object $feeTierInfo;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Object obj, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$feeTierInfo = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$feeTierInfo, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoFeeTierStatusDataState cryptoFeeTierStatusDataState, Continuation<? super CryptoFeeTierStatusDataState> continuation) {
                return ((AnonymousClass2) create(cryptoFeeTierStatusDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoFeeTierStatusDataState.copy$default((CryptoFeeTierStatusDataState) this.L$0, Result.m28549boximpl(this.$feeTierInfo), null, 2, null);
            }
        }
    }

    private final void fetchFeeTierInfo() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403811(null), 3, null);
    }

    /* compiled from: CryptoFeeTierStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo$Args;", "Landroid/os/Parcelable;", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPrompt", "", "<init>", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;)V", "getFeeTierInfo", "()Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "getCanSkipNotificationPrompt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo$Args;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Boolean canSkipNotificationPrompt;
        private final CryptoFeeTierInfo feeTierInfo;

        /* compiled from: CryptoFeeTierStatusDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) parcel.readParcelable(Args.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Args(cryptoFeeTierInfo, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoFeeTierInfo = args.feeTierInfo;
            }
            if ((i & 2) != 0) {
                bool = args.canSkipNotificationPrompt;
            }
            return args.copy(cryptoFeeTierInfo, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getCanSkipNotificationPrompt() {
            return this.canSkipNotificationPrompt;
        }

        public final Args copy(CryptoFeeTierInfo feeTierInfo, Boolean canSkipNotificationPrompt) {
            return new Args(feeTierInfo, canSkipNotificationPrompt);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.feeTierInfo, args.feeTierInfo) && Intrinsics.areEqual(this.canSkipNotificationPrompt, args.canSkipNotificationPrompt);
        }

        public int hashCode() {
            CryptoFeeTierInfo cryptoFeeTierInfo = this.feeTierInfo;
            int iHashCode = (cryptoFeeTierInfo == null ? 0 : cryptoFeeTierInfo.hashCode()) * 31;
            Boolean bool = this.canSkipNotificationPrompt;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Args(feeTierInfo=" + this.feeTierInfo + ", canSkipNotificationPrompt=" + this.canSkipNotificationPrompt + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.feeTierInfo, flags);
            Boolean bool = this.canSkipNotificationPrompt;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public Args(CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool) {
            this.feeTierInfo = cryptoFeeTierInfo;
            this.canSkipNotificationPrompt = bool;
        }

        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        public final Boolean getCanSkipNotificationPrompt() {
            return this.canSkipNotificationPrompt;
        }
    }

    /* compiled from: CryptoFeeTierStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoFeeTierStatusDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoFeeTierStatusDuxo);
        }
    }
}
