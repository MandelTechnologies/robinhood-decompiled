package com.robinhood.android.equities.ladderftux;

import android.content.Context;
import com.robinhood.android.equities.ladderftux.EquityTradeLadderFtuxProgressState;
import com.robinhood.android.equities.ladderftux.prefs.EquityTradeLadderFtuxPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderFtuxManager.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxManager;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxProgressState;", "shouldShowEquityLadderFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;)V", "getFirstFtuxPageImpl", "prefetchAllLotties", "", "context", "Landroid/content/Context;", "isDay", "", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderFtuxManager extends GenericLadderFtuxManager<EquityTradeLadderFtuxProgressState> {
    public static final int $stable = GenericLadderFtuxManager.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityTradeLadderFtuxManager(@EquityTradeLadderFtuxPref BooleanPreference shouldShowEquityLadderFtuxPref) {
        super(shouldShowEquityLadderFtuxPref);
        Intrinsics.checkNotNullParameter(shouldShowEquityLadderFtuxPref, "shouldShowEquityLadderFtuxPref");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxManager
    public EquityTradeLadderFtuxProgressState getFirstFtuxPageImpl() {
        return EquityTradeLadderFtuxProgressState.LadderEducation.LadderIntroduction.INSTANCE;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxManager
    protected void prefetchAllLotties(Context context, boolean isDay) {
        Intrinsics.checkNotNullParameter(context, "context");
        GenericLadderFtuxManager.defaultPrefetchAllLotties$default(this, context, isDay, null, 4, null);
    }
}
