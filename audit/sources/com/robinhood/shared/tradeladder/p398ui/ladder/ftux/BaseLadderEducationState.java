package com.robinhood.shared.tradeladder.p398ui.ladder.ftux;

import android.content.Context;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.FtuxContextualBarData;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BaseLadderEducationState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/BaseLadderEducationState;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderEducationState;", "ladderEducationDescription", "", "ladderEducationDescriptionSubText", "contextualBarPrimaryButtonType", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;", "contextualBarSecondaryButtonType", "showAppBarTitleInTopBar", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;Z)V", "getLadderEducationDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLadderEducationDescriptionSubText", "getContextualBarPrimaryButtonType", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData$ButtonType;", "getContextualBarSecondaryButtonType", "getShowAppBarTitleInTopBar", "()Z", "contextualBarData", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData;", "getContextualBarData", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseLadderEducationState implements GenericLadderFtuxProgressState2 {
    public static final int $stable = 0;
    private final FtuxContextualBarData.ButtonType contextualBarPrimaryButtonType;
    private final FtuxContextualBarData.ButtonType contextualBarSecondaryButtonType;
    private final Integer ladderEducationDescription;
    private final Integer ladderEducationDescriptionSubText;
    private final boolean showAppBarTitleInTopBar;

    public BaseLadderEducationState(Integer num, Integer num2, FtuxContextualBarData.ButtonType buttonType, FtuxContextualBarData.ButtonType buttonType2, boolean z) {
        this.ladderEducationDescription = num;
        this.ladderEducationDescriptionSubText = num2;
        this.contextualBarPrimaryButtonType = buttonType;
        this.contextualBarSecondaryButtonType = buttonType2;
        this.showAppBarTitleInTopBar = z;
    }

    public /* synthetic */ BaseLadderEducationState(Integer num, Integer num2, FtuxContextualBarData.ButtonType buttonType, FtuxContextualBarData.ButtonType buttonType2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : buttonType, (i & 8) != 0 ? null : buttonType2, (i & 16) != 0 ? true : z);
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
    public void prefetchLottie(Context context, boolean z) {
        GenericLadderFtuxProgressState2.DefaultImpls.prefetchLottie(this, context, z);
    }

    public final Integer getLadderEducationDescription() {
        return this.ladderEducationDescription;
    }

    public final Integer getLadderEducationDescriptionSubText() {
        return this.ladderEducationDescriptionSubText;
    }

    public final FtuxContextualBarData.ButtonType getContextualBarPrimaryButtonType() {
        return this.contextualBarPrimaryButtonType;
    }

    public final FtuxContextualBarData.ButtonType getContextualBarSecondaryButtonType() {
        return this.contextualBarSecondaryButtonType;
    }

    public final boolean getShowAppBarTitleInTopBar() {
        return this.showAppBarTitleInTopBar;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState2
    public FtuxContextualBarData getContextualBarData() {
        return new FtuxContextualBarData(this.ladderEducationDescription, this.ladderEducationDescriptionSubText, this.contextualBarPrimaryButtonType, this.contextualBarSecondaryButtonType);
    }
}
