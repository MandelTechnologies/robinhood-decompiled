package com.robinhood.android.crypto.tab.p093ui.pnl;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.datetime.Instants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CryptoHomePnlEntryPointDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDataState;", "Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointViewState;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointStateProvider;", "stateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "pnlEntryPointSeenNewBadgePref", "<init>", "(Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointStateProvider;Lcom/robinhood/prefs/BooleanPreference;)V", "Lcom/robinhood/prefs/BooleanPreference;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomePnlEntryPointDuxo extends BaseDuxo<CryptoHomePnlEntryPointDataState, CryptoHomePnlEntryPointViewState> {
    public static final int $stable = 8;
    private final BooleanPreference pnlEntryPointSeenNewBadgePref;

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoHomePnlEntryPointDuxo(Clock clock, DuxoBundle duxoBundle, CryptoHomePnlEntryPointStateProvider stateProvider, @CryptoHomePnlEntryPointSeenNewBadgePref BooleanPreference pnlEntryPointSeenNewBadgePref) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(pnlEntryPointSeenNewBadgePref, "pnlEntryPointSeenNewBadgePref");
        boolean z = pnlEntryPointSeenNewBadgePref.get();
        Instant instantNow = Instant.now(clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        super(new CryptoHomePnlEntryPointDataState(z, Instants.toLocalDate$default(instantNow, null, 1, null), null, 4, null), stateProvider, duxoBundle);
        this.pnlEntryPointSeenNewBadgePref = pnlEntryPointSeenNewBadgePref;
        pnlEntryPointSeenNewBadgePref.set(true);
    }
}
