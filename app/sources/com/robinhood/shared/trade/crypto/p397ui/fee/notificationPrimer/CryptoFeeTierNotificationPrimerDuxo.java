package com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer;

import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.trade.crypto.dagger.FeeTierNotificationPrimerLastTimeSeenMillisPref;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider;
import com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo3;
import kotlin.Metadata;
import kotlin.Result;
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
import p479j$.time.Clock;

/* compiled from: CryptoFeeTierNotificationPrimerDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerViewState;", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerEvent;", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "notificationStatusProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "notifPrimerLastTimeSeenMillisPref", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "turnOn", "onTryAgainClick", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/LongPreference;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeTierNotificationPrimerDuxo extends BaseDuxo5<CryptoFeeTierNotificationPrimerViewState, CryptoFeeTierNotificationPrimerDuxo3> {
    public static final int $stable = 8;
    private final Clock clock;
    private final LongPreference notifPrimerLastTimeSeenMillisPref;
    private final CryptoFeeTierNotificationStatusProvider notificationStatusProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoFeeTierNotificationPrimerDuxo(CryptoFeeTierNotificationStatusProvider notificationStatusProvider, Clock clock, @FeeTierNotificationPrimerLastTimeSeenMillisPref LongPreference notifPrimerLastTimeSeenMillisPref, DuxoBundle duxoBundle) {
        super(new CryptoFeeTierNotificationPrimerViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(notificationStatusProvider, "notificationStatusProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(notifPrimerLastTimeSeenMillisPref, "notifPrimerLastTimeSeenMillisPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.notificationStatusProvider = notificationStatusProvider;
        this.clock = clock;
        this.notifPrimerLastTimeSeenMillisPref = notifPrimerLastTimeSeenMillisPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C401951(null), 3, null);
    }

    /* compiled from: CryptoFeeTierNotificationPrimerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo$onCreate$1", m3645f = "CryptoFeeTierNotificationPrimerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo$onCreate$1 */
    static final class C401951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C401951(Continuation<? super C401951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeTierNotificationPrimerDuxo.this.new C401951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoFeeTierNotificationPrimerDuxo.this.notifPrimerLastTimeSeenMillisPref.set(CryptoFeeTierNotificationPrimerDuxo.this.clock.millis());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CryptoFeeTierNotificationPrimerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo$turnOn$1", m3645f = "CryptoFeeTierNotificationPrimerDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo$turnOn$1 */
    static final class C401961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C401961(Continuation<? super C401961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeTierNotificationPrimerDuxo.this.new C401961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoFeeTierNotificationPrimerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo$turnOn$1$1", m3645f = "CryptoFeeTierNotificationPrimerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerDuxo$turnOn$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoFeeTierNotificationPrimerViewState, Continuation<? super CryptoFeeTierNotificationPrimerViewState>, Object> {
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
            public final Object invoke(CryptoFeeTierNotificationPrimerViewState cryptoFeeTierNotificationPrimerViewState, Continuation<? super CryptoFeeTierNotificationPrimerViewState> continuation) {
                return ((AnonymousClass1) create(cryptoFeeTierNotificationPrimerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CryptoFeeTierNotificationPrimerViewState) this.L$0).copy(true);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM25808optInIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoFeeTierNotificationPrimerDuxo.this.applyMutation(new AnonymousClass1(null));
                CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider = CryptoFeeTierNotificationPrimerDuxo.this.notificationStatusProvider;
                this.label = 1;
                objM25808optInIoAF18A = cryptoFeeTierNotificationStatusProvider.m25808optInIoAF18A(this);
                if (objM25808optInIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM25808optInIoAF18A = ((Result) obj).getValue();
            }
            CryptoFeeTierNotificationPrimerDuxo cryptoFeeTierNotificationPrimerDuxo = CryptoFeeTierNotificationPrimerDuxo.this;
            if (Result.m28553exceptionOrNullimpl(objM25808optInIoAF18A) != null) {
                cryptoFeeTierNotificationPrimerDuxo.applyMutation(new CryptoFeeTierNotificationPrimerDuxo2(null));
                cryptoFeeTierNotificationPrimerDuxo.submit(CryptoFeeTierNotificationPrimerDuxo3.ShowTurnOnErrorAlert.INSTANCE);
            } else {
                cryptoFeeTierNotificationPrimerDuxo.submit(CryptoFeeTierNotificationPrimerDuxo3.ShowToastAndFinish.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void turnOn() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C401961(null), 3, null);
    }

    public final void onTryAgainClick() {
        turnOn();
    }
}
