package com.robinhood.shared.crypto.p375ui.feeTiers.expirationWarning;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoFeeTierExpirationWarningBannerDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerDataState;", "Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerViewState;", "Lcom/robinhood/prefs/LongPreference;", "lastDismissedFeeTierExpirationBannerMillis", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/prefs/LongPreference;Lj$/time/Clock;Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onBannerDismissed", "()V", "Lcom/robinhood/prefs/LongPreference;", "Lj$/time/Clock;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoFeeTierExpirationWarningBannerDuxo extends BaseDuxo<CryptoFeeTierExpirationWarningBannerDataState, CryptoFeeTierExpirationWarningBannerViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final LongPreference lastDismissedFeeTierExpirationBannerMillis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoFeeTierExpirationWarningBannerDuxo(@CryptoFeeTierExpirationWarningModule2 LongPreference lastDismissedFeeTierExpirationBannerMillis, Clock clock, CryptoFeeTierExpirationWarningBannerDuxo2 stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoFeeTierExpirationWarningBannerDataState(Long.valueOf(lastDismissedFeeTierExpirationBannerMillis.get()), clock), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(lastDismissedFeeTierExpirationBannerMillis, "lastDismissedFeeTierExpirationBannerMillis");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.lastDismissedFeeTierExpirationBannerMillis = lastDismissedFeeTierExpirationBannerMillis;
        this.clock = clock;
    }

    /* compiled from: CryptoFeeTierExpirationWarningBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerDuxo$onBannerDismissed$1", m3645f = "CryptoFeeTierExpirationWarningBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerDuxo$onBannerDismissed$1 */
    static final class C385931 extends ContinuationImpl7 implements Function2<CryptoFeeTierExpirationWarningBannerDataState, Continuation<? super CryptoFeeTierExpirationWarningBannerDataState>, Object> {
        final /* synthetic */ long $currentTimeMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385931(long j, Continuation<? super C385931> continuation) {
            super(2, continuation);
            this.$currentTimeMillis = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C385931 c385931 = new C385931(this.$currentTimeMillis, continuation);
            c385931.L$0 = obj;
            return c385931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoFeeTierExpirationWarningBannerDataState cryptoFeeTierExpirationWarningBannerDataState, Continuation<? super CryptoFeeTierExpirationWarningBannerDataState> continuation) {
            return ((C385931) create(cryptoFeeTierExpirationWarningBannerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoFeeTierExpirationWarningBannerDataState.copy$default((CryptoFeeTierExpirationWarningBannerDataState) this.L$0, boxing.boxLong(this.$currentTimeMillis), null, 2, null);
        }
    }

    public final void onBannerDismissed() {
        long jMillis = this.clock.millis();
        applyMutation(new C385931(jMillis, null));
        this.lastDismissedFeeTierExpirationBannerMillis.set(jMillis);
    }
}
