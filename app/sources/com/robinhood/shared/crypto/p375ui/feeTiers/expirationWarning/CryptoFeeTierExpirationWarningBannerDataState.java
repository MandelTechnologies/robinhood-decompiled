package com.robinhood.shared.crypto.p375ui.feeTiers.expirationWarning;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: CryptoFeeTierExpirationWarningBannerDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028G¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerDataState;", "", "", "lastDismissedFeeTierExpirationBannerMillis", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljava/lang/Long;Lj$/time/Clock;)V", "component2", "()Lj$/time/Clock;", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;Lj$/time/Clock;)Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getLastDismissedFeeTierExpirationBannerMillis", "Lj$/time/Clock;", "getShouldShowBanner", "()Z", "shouldShowBanner", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoFeeTierExpirationWarningBannerDataState {
    public static final int $stable = 8;
    private final Clock clock;
    private final Long lastDismissedFeeTierExpirationBannerMillis;

    /* renamed from: component2, reason: from getter */
    private final Clock getClock() {
        return this.clock;
    }

    public static /* synthetic */ CryptoFeeTierExpirationWarningBannerDataState copy$default(CryptoFeeTierExpirationWarningBannerDataState cryptoFeeTierExpirationWarningBannerDataState, Long l, Clock clock, int i, Object obj) {
        if ((i & 1) != 0) {
            l = cryptoFeeTierExpirationWarningBannerDataState.lastDismissedFeeTierExpirationBannerMillis;
        }
        if ((i & 2) != 0) {
            clock = cryptoFeeTierExpirationWarningBannerDataState.clock;
        }
        return cryptoFeeTierExpirationWarningBannerDataState.copy(l, clock);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getLastDismissedFeeTierExpirationBannerMillis() {
        return this.lastDismissedFeeTierExpirationBannerMillis;
    }

    public final CryptoFeeTierExpirationWarningBannerDataState copy(Long lastDismissedFeeTierExpirationBannerMillis, Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        return new CryptoFeeTierExpirationWarningBannerDataState(lastDismissedFeeTierExpirationBannerMillis, clock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoFeeTierExpirationWarningBannerDataState)) {
            return false;
        }
        CryptoFeeTierExpirationWarningBannerDataState cryptoFeeTierExpirationWarningBannerDataState = (CryptoFeeTierExpirationWarningBannerDataState) other;
        return Intrinsics.areEqual(this.lastDismissedFeeTierExpirationBannerMillis, cryptoFeeTierExpirationWarningBannerDataState.lastDismissedFeeTierExpirationBannerMillis) && Intrinsics.areEqual(this.clock, cryptoFeeTierExpirationWarningBannerDataState.clock);
    }

    public int hashCode() {
        Long l = this.lastDismissedFeeTierExpirationBannerMillis;
        return ((l == null ? 0 : l.hashCode()) * 31) + this.clock.hashCode();
    }

    public String toString() {
        return "CryptoFeeTierExpirationWarningBannerDataState(lastDismissedFeeTierExpirationBannerMillis=" + this.lastDismissedFeeTierExpirationBannerMillis + ", clock=" + this.clock + ")";
    }

    public CryptoFeeTierExpirationWarningBannerDataState(Long l, Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.lastDismissedFeeTierExpirationBannerMillis = l;
        this.clock = clock;
    }

    public final Long getLastDismissedFeeTierExpirationBannerMillis() {
        return this.lastDismissedFeeTierExpirationBannerMillis;
    }

    public final boolean getShouldShowBanner() {
        Long l = this.lastDismissedFeeTierExpirationBannerMillis;
        if (l == null) {
            return false;
        }
        long jLongValue = l.longValue();
        return jLongValue <= 0 || this.clock.millis() - jLongValue >= Duration.ofDays(7L).toMillis();
    }
}
