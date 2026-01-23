package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketMatchState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J_\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010 \u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0013\u0010!\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "", "cardId", "Ljava/util/UUID;", "seed1", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "seed2", "gameStateDisplay", "", "state", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "hasPosition", "", "pnlAmount", "Lcom/robinhood/models/util/Money;", "canNavigateToEdp", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;Ljava/lang/String;Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;ZLcom/robinhood/models/util/Money;Z)V", "getCardId", "()Ljava/util/UUID;", "getSeed1", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "getSeed2", "getGameStateDisplay", "()Ljava/lang/String;", "getState", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "getHasPosition", "()Z", "getPnlAmount", "()Lcom/robinhood/models/util/Money;", "getCanNavigateToEdp", "isLive", "isSeed1Winner", "()Ljava/lang/Boolean;", "borderGradient", "Landroidx/compose/ui/graphics/Brush;", "getBorderGradient", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Brush;", "backgroundBrush", "getBackgroundBrush", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class BracketGameOverviewCardData {
    public static final int $stable = 0;
    private final boolean canNavigateToEdp;
    private final UUID cardId;
    private final String gameStateDisplay;
    private final boolean hasPosition;
    private final Money pnlAmount;
    private final BracketGameSeedData seed1;
    private final BracketGameSeedData seed2;
    private final BracketMatchState state;

    public static /* synthetic */ BracketGameOverviewCardData copy$default(BracketGameOverviewCardData bracketGameOverviewCardData, UUID uuid, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2, String str, BracketMatchState bracketMatchState, boolean z, Money money, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = bracketGameOverviewCardData.cardId;
        }
        if ((i & 2) != 0) {
            bracketGameSeedData = bracketGameOverviewCardData.seed1;
        }
        if ((i & 4) != 0) {
            bracketGameSeedData2 = bracketGameOverviewCardData.seed2;
        }
        if ((i & 8) != 0) {
            str = bracketGameOverviewCardData.gameStateDisplay;
        }
        if ((i & 16) != 0) {
            bracketMatchState = bracketGameOverviewCardData.state;
        }
        if ((i & 32) != 0) {
            z = bracketGameOverviewCardData.hasPosition;
        }
        if ((i & 64) != 0) {
            money = bracketGameOverviewCardData.pnlAmount;
        }
        if ((i & 128) != 0) {
            z2 = bracketGameOverviewCardData.canNavigateToEdp;
        }
        Money money2 = money;
        boolean z3 = z2;
        BracketMatchState bracketMatchState2 = bracketMatchState;
        boolean z4 = z;
        return bracketGameOverviewCardData.copy(uuid, bracketGameSeedData, bracketGameSeedData2, str, bracketMatchState2, z4, money2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final BracketGameSeedData getSeed1() {
        return this.seed1;
    }

    /* renamed from: component3, reason: from getter */
    public final BracketGameSeedData getSeed2() {
        return this.seed2;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGameStateDisplay() {
        return this.gameStateDisplay;
    }

    /* renamed from: component5, reason: from getter */
    public final BracketMatchState getState() {
        return this.state;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getPnlAmount() {
        return this.pnlAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCanNavigateToEdp() {
        return this.canNavigateToEdp;
    }

    public final BracketGameOverviewCardData copy(UUID cardId, BracketGameSeedData seed1, BracketGameSeedData seed2, String gameStateDisplay, BracketMatchState state, boolean hasPosition, Money pnlAmount, boolean canNavigateToEdp) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(gameStateDisplay, "gameStateDisplay");
        Intrinsics.checkNotNullParameter(state, "state");
        return new BracketGameOverviewCardData(cardId, seed1, seed2, gameStateDisplay, state, hasPosition, pnlAmount, canNavigateToEdp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BracketGameOverviewCardData)) {
            return false;
        }
        BracketGameOverviewCardData bracketGameOverviewCardData = (BracketGameOverviewCardData) other;
        return Intrinsics.areEqual(this.cardId, bracketGameOverviewCardData.cardId) && Intrinsics.areEqual(this.seed1, bracketGameOverviewCardData.seed1) && Intrinsics.areEqual(this.seed2, bracketGameOverviewCardData.seed2) && Intrinsics.areEqual(this.gameStateDisplay, bracketGameOverviewCardData.gameStateDisplay) && Intrinsics.areEqual(this.state, bracketGameOverviewCardData.state) && this.hasPosition == bracketGameOverviewCardData.hasPosition && Intrinsics.areEqual(this.pnlAmount, bracketGameOverviewCardData.pnlAmount) && this.canNavigateToEdp == bracketGameOverviewCardData.canNavigateToEdp;
    }

    public int hashCode() {
        int iHashCode = this.cardId.hashCode() * 31;
        BracketGameSeedData bracketGameSeedData = this.seed1;
        int iHashCode2 = (iHashCode + (bracketGameSeedData == null ? 0 : bracketGameSeedData.hashCode())) * 31;
        BracketGameSeedData bracketGameSeedData2 = this.seed2;
        int iHashCode3 = (((((((iHashCode2 + (bracketGameSeedData2 == null ? 0 : bracketGameSeedData2.hashCode())) * 31) + this.gameStateDisplay.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.hasPosition)) * 31;
        Money money = this.pnlAmount;
        return ((iHashCode3 + (money != null ? money.hashCode() : 0)) * 31) + Boolean.hashCode(this.canNavigateToEdp);
    }

    public String toString() {
        return "BracketGameOverviewCardData(cardId=" + this.cardId + ", seed1=" + this.seed1 + ", seed2=" + this.seed2 + ", gameStateDisplay=" + this.gameStateDisplay + ", state=" + this.state + ", hasPosition=" + this.hasPosition + ", pnlAmount=" + this.pnlAmount + ", canNavigateToEdp=" + this.canNavigateToEdp + ")";
    }

    public BracketGameOverviewCardData(UUID cardId, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2, String gameStateDisplay, BracketMatchState state, boolean z, Money money, boolean z2) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(gameStateDisplay, "gameStateDisplay");
        Intrinsics.checkNotNullParameter(state, "state");
        this.cardId = cardId;
        this.seed1 = bracketGameSeedData;
        this.seed2 = bracketGameSeedData2;
        this.gameStateDisplay = gameStateDisplay;
        this.state = state;
        this.hasPosition = z;
        this.pnlAmount = money;
        this.canNavigateToEdp = z2;
    }

    public /* synthetic */ BracketGameOverviewCardData(UUID uuid, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2, String str, BracketMatchState bracketMatchState, boolean z, Money money, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, bracketGameSeedData, bracketGameSeedData2, str, bracketMatchState, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : money, (i & 128) != 0 ? false : z2);
    }

    public final UUID getCardId() {
        return this.cardId;
    }

    public final BracketGameSeedData getSeed1() {
        return this.seed1;
    }

    public final BracketGameSeedData getSeed2() {
        return this.seed2;
    }

    public final String getGameStateDisplay() {
        return this.gameStateDisplay;
    }

    public final BracketMatchState getState() {
        return this.state;
    }

    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    public final Money getPnlAmount() {
        return this.pnlAmount;
    }

    public final boolean getCanNavigateToEdp() {
        return this.canNavigateToEdp;
    }

    public final boolean isLive() {
        BracketMatchState bracketMatchState = this.state;
        if (bracketMatchState instanceof BracketMatchState.Tradeable) {
            return ((BracketMatchState.Tradeable) bracketMatchState).isLive();
        }
        return false;
    }

    public final Boolean isSeed1Winner() {
        BracketMatchState bracketMatchState = this.state;
        if (bracketMatchState instanceof BracketMatchState.Resolved) {
            return Boolean.valueOf(((BracketMatchState.Resolved) bracketMatchState).getSeed1IsWinner());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Brush getBorderGradient(Composer composer, int i) {
        Brush brushM6682verticalGradient8A3gB4$default;
        composer.startReplaceGroup(660161131);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(660161131, i, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketGameOverviewCardData.<get-borderGradient> (BracketMatchOverviewCard.kt:89)");
        }
        BracketMatchState bracketMatchState = this.state;
        Color color = null;
        if (bracketMatchState instanceof BracketMatchState.Tradeable) {
            composer.startReplaceGroup(-1240309233);
            if (this.seed1 != null && this.seed2 != null) {
                composer.startReplaceGroup(205151745);
                brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(this.seed1.getColorInBorder(composer, 0)), Color.m6701boximpl(this.seed2.getColorInBorder(composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(205365459);
                brushM6682verticalGradient8A3gB4$default = new SolidColor(BracketStyle.INSTANCE.getBorderColor(composer, 6), null);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else if (bracketMatchState instanceof BracketMatchState.Locked) {
            composer.startReplaceGroup(-1240297713);
            brushM6682verticalGradient8A3gB4$default = new SolidColor(BracketStyle.INSTANCE.getBorderColor(composer, 6), null);
            composer.endReplaceGroup();
        } else {
            if (!(bracketMatchState instanceof BracketMatchState.Resolved)) {
                composer.startReplaceGroup(-1240310702);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1240294623);
            Brush.Companion companion = Brush.INSTANCE;
            BracketGameSeedData bracketGameSeedData = this.seed1;
            composer.startReplaceGroup(-1240292680);
            Color colorM6701boximpl = bracketGameSeedData == null ? null : Color.m6701boximpl(bracketGameSeedData.getColorInBorder(composer, 0));
            composer.endReplaceGroup();
            if (colorM6701boximpl != null) {
                colorM6701boximpl.getValue();
                if (!((BracketMatchState.Resolved) this.state).getSeed1IsWinner()) {
                    colorM6701boximpl = null;
                }
                composer.startReplaceGroup(-1240292837);
                long borderColor = colorM6701boximpl == null ? BracketStyle.INSTANCE.getBorderColor(composer, 6) : colorM6701boximpl.getValue();
                composer.endReplaceGroup();
                Color colorM6701boximpl2 = Color.m6701boximpl(borderColor);
                BracketGameSeedData bracketGameSeedData2 = this.seed2;
                composer.startReplaceGroup(-1240289416);
                Color colorM6701boximpl3 = bracketGameSeedData2 == null ? null : Color.m6701boximpl(bracketGameSeedData2.getColorInBorder(composer, 0));
                composer.endReplaceGroup();
                if (colorM6701boximpl3 != null) {
                    colorM6701boximpl3.getValue();
                    if (!((BracketMatchState.Resolved) this.state).getSeed1IsWinner()) {
                        color = colorM6701boximpl3;
                    }
                }
                brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl2, Color.m6701boximpl(color == null ? BracketStyle.INSTANCE.getBorderColor(composer, 6) : color.getValue())}), 0.0f, 0.0f, 0, 14, (Object) null);
                composer.endReplaceGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return brushM6682verticalGradient8A3gB4$default;
    }

    @JvmName
    public final Brush getBackgroundBrush(Composer composer, int i) {
        List listListOf;
        Brush brushM6682verticalGradient8A3gB4$default;
        long jM21371getBg0d7_KjU;
        composer.startReplaceGroup(-502794907);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-502794907, i, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketGameOverviewCardData.<get-backgroundBrush> (BracketMatchOverviewCard.kt:114)");
        }
        BracketMatchState bracketMatchState = this.state;
        if (bracketMatchState instanceof BracketMatchState.Tradeable) {
            composer.startReplaceGroup(2145402214);
            brushM6682verticalGradient8A3gB4$default = new SolidColor(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), null);
            composer.endReplaceGroup();
        } else if (bracketMatchState instanceof BracketMatchState.Locked) {
            composer.startReplaceGroup(2145404768);
            if (((BracketMatchState.Locked) this.state).getShowTwoLocksSideBySide()) {
                composer.startReplaceGroup(2145407208);
                jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU();
            } else {
                composer.startReplaceGroup(2145408071);
                jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            }
            composer.endReplaceGroup();
            brushM6682verticalGradient8A3gB4$default = new SolidColor(jM21371getBg0d7_KjU, null);
            composer.endReplaceGroup();
        } else {
            if (!(bracketMatchState instanceof BracketMatchState.Resolved)) {
                composer.startReplaceGroup(2145400823);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(2145410547);
            Brush.Companion companion = Brush.INSTANCE;
            if (((BracketMatchState.Resolved) this.state).getSeed1IsWinner()) {
                composer.startReplaceGroup(2083279426);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU())});
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2083375650);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21372getBg20d7_KjU())});
                composer.endReplaceGroup();
            }
            brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(companion, listListOf, 0.0f, 0.0f, 0, 14, (Object) null);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return brushM6682verticalGradient8A3gB4$default;
    }
}
