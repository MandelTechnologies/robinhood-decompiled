package com.robinhood.android.futures.sharedfuturesui.contextualbar;

import android.content.Context;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.futures.p404di.FuturesFtuxPref3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderFtuxManager.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\"\u0010\u0010\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;", "", "shouldShowFuturesLadderFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;)V", "getFirstFtuxPage", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "ignorePref", "", "onFtuxCompleted", "", "prefetchFirstLottie", "context", "Landroid/content/Context;", "isDay", "prefetchLotties", "force", "prefetchLadderFtuxLotties", "lib-shared-futures-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class LadderFtuxManager {
    public static final int $stable = 8;
    private final BooleanPreference shouldShowFuturesLadderFtuxPref;

    public LadderFtuxManager(@FuturesFtuxPref3 BooleanPreference shouldShowFuturesLadderFtuxPref) {
        Intrinsics.checkNotNullParameter(shouldShowFuturesLadderFtuxPref, "shouldShowFuturesLadderFtuxPref");
        this.shouldShowFuturesLadderFtuxPref = shouldShowFuturesLadderFtuxPref;
    }

    public static /* synthetic */ LadderFtuxProgressState getFirstFtuxPage$default(LadderFtuxManager ladderFtuxManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ladderFtuxManager.getFirstFtuxPage(z);
    }

    public final LadderFtuxProgressState getFirstFtuxPage(boolean ignorePref) {
        if (ignorePref || this.shouldShowFuturesLadderFtuxPref.get()) {
            return LadderFtuxProgressState.LadderEducation.LadderIntroduction.INSTANCE;
        }
        return null;
    }

    public final void onFtuxCompleted() {
        this.shouldShowFuturesLadderFtuxPref.set(false);
    }

    public final void prefetchFirstLottie(Context context, boolean isDay) {
        if (context == null || !this.shouldShowFuturesLadderFtuxPref.get()) {
            return;
        }
        LadderFtuxProgressState.LadderEducation.LadderIntroduction.INSTANCE.prefetchLottie(context, isDay);
    }

    public static /* synthetic */ void prefetchLotties$default(LadderFtuxManager ladderFtuxManager, Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        ladderFtuxManager.prefetchLotties(context, z, z2);
    }

    public final void prefetchLotties(Context context, boolean isDay, boolean force) {
        if (context != null) {
            if (force || this.shouldShowFuturesLadderFtuxPref.get()) {
                prefetchLadderFtuxLotties(context, isDay);
            }
        }
    }

    private final void prefetchLadderFtuxLotties(Context context, boolean isDay) {
        LadderFtuxProgressState.LadderEducation.LadderIntroduction.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.LastTradedPriceInformation.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.TickSizeInformation.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.BidBarsInformation.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.AskBarsInformation.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.MarketOrderInformation.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.LadderRowOrderInformation.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.LadderRowEditOrder.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.LadderRowCancelOrder.INSTANCE.prefetchLottie(context, isDay);
        LadderFtuxProgressState.LadderEducation.LadderRowAveragePrice.INSTANCE.prefetchLottie(context, isDay);
        new LadderFtuxProgressState.LadderEducation.LadderRowClosePosition(null).prefetchLottie(context, isDay);
        LadderFtuxProgressState.TransitionToLadderUi.INSTANCE.prefetchLottie(context, isDay);
    }
}
