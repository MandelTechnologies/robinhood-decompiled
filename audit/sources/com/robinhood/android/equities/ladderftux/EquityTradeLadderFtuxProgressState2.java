package com.robinhood.android.equities.ladderftux;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.FtuxContextualBarData;
import kotlin.Metadata;

/* compiled from: EquityTradeLadderFtuxProgressState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0003"}, m3636d2 = {"getDefaultPrimaryButton", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;", "getDefaultSecondaryButton", "lib-equity-ladder-ftux_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.ladderftux.EquityTradeLadderFtuxProgressStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradeLadderFtuxProgressState2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FtuxContextualBarData.ButtonType getDefaultPrimaryButton() {
        return new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_RIGHT_24, C40888R.string.ladder_ftux_continue_content_description, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FtuxContextualBarData.ButtonType getDefaultSecondaryButton() {
        return new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_LEFT_24, C40888R.string.ladder_ftux_back_content_description, BentoIconButton4.Type.Secondary);
    }
}
