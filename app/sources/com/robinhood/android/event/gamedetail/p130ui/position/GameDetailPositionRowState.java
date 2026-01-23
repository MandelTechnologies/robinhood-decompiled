package com.robinhood.android.event.gamedetail.p130ui.position;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailPositionRow.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J~\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\n\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u001e\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;", "", "contractId", "Ljava/util/UUID;", "leftPrimary", "Lcom/robinhood/utils/resource/StringResource;", "leftSecondary", "rightPrimary", "", "rightSecondary", "isPnlPositive", "", "isSelected", "isLoading", "isLeftPrimaryTextBolded", "loggingIdentifier", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;ZZZLjava/lang/String;)V", "getContractId", "()Ljava/util/UUID;", "getLeftPrimary", "()Lcom/robinhood/utils/resource/StringResource;", "getLeftSecondary", "getRightPrimary", "()Ljava/lang/String;", "getRightSecondary", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getLoggingIdentifier", "rightPrimaryColor", "Landroidx/compose/ui/graphics/Color;", "getRightPrimaryColor", "(Landroidx/compose/runtime/Composer;I)J", "rowBackgroundColor", "getRowBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;ZZZLjava/lang/String;)Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;", "equals", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GameDetailPositionRowState {
    public static final int $stable = 0;
    private final UUID contractId;
    private final boolean isLeftPrimaryTextBolded;
    private final boolean isLoading;
    private final Boolean isPnlPositive;
    private final boolean isSelected;
    private final StringResource leftPrimary;
    private final StringResource leftSecondary;
    private final String loggingIdentifier;
    private final String rightPrimary;
    private final StringResource rightSecondary;

    public static /* synthetic */ GameDetailPositionRowState copy$default(GameDetailPositionRowState gameDetailPositionRowState, UUID uuid, StringResource stringResource, StringResource stringResource2, String str, StringResource stringResource3, Boolean bool, boolean z, boolean z2, boolean z3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = gameDetailPositionRowState.contractId;
        }
        if ((i & 2) != 0) {
            stringResource = gameDetailPositionRowState.leftPrimary;
        }
        if ((i & 4) != 0) {
            stringResource2 = gameDetailPositionRowState.leftSecondary;
        }
        if ((i & 8) != 0) {
            str = gameDetailPositionRowState.rightPrimary;
        }
        if ((i & 16) != 0) {
            stringResource3 = gameDetailPositionRowState.rightSecondary;
        }
        if ((i & 32) != 0) {
            bool = gameDetailPositionRowState.isPnlPositive;
        }
        if ((i & 64) != 0) {
            z = gameDetailPositionRowState.isSelected;
        }
        if ((i & 128) != 0) {
            z2 = gameDetailPositionRowState.isLoading;
        }
        if ((i & 256) != 0) {
            z3 = gameDetailPositionRowState.isLeftPrimaryTextBolded;
        }
        if ((i & 512) != 0) {
            str2 = gameDetailPositionRowState.loggingIdentifier;
        }
        boolean z4 = z3;
        String str3 = str2;
        boolean z5 = z;
        boolean z6 = z2;
        StringResource stringResource4 = stringResource3;
        Boolean bool2 = bool;
        return gameDetailPositionRowState.copy(uuid, stringResource, stringResource2, str, stringResource4, bool2, z5, z6, z4, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getLeftPrimary() {
        return this.leftPrimary;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getLeftSecondary() {
        return this.leftSecondary;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRightPrimary() {
        return this.rightPrimary;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getRightSecondary() {
        return this.rightSecondary;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsPnlPositive() {
        return this.isPnlPositive;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLeftPrimaryTextBolded() {
        return this.isLeftPrimaryTextBolded;
    }

    public final GameDetailPositionRowState copy(UUID contractId, StringResource leftPrimary, StringResource leftSecondary, String rightPrimary, StringResource rightSecondary, Boolean isPnlPositive, boolean isSelected, boolean isLoading, boolean isLeftPrimaryTextBolded, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return new GameDetailPositionRowState(contractId, leftPrimary, leftSecondary, rightPrimary, rightSecondary, isPnlPositive, isSelected, isLoading, isLeftPrimaryTextBolded, loggingIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDetailPositionRowState)) {
            return false;
        }
        GameDetailPositionRowState gameDetailPositionRowState = (GameDetailPositionRowState) other;
        return Intrinsics.areEqual(this.contractId, gameDetailPositionRowState.contractId) && Intrinsics.areEqual(this.leftPrimary, gameDetailPositionRowState.leftPrimary) && Intrinsics.areEqual(this.leftSecondary, gameDetailPositionRowState.leftSecondary) && Intrinsics.areEqual(this.rightPrimary, gameDetailPositionRowState.rightPrimary) && Intrinsics.areEqual(this.rightSecondary, gameDetailPositionRowState.rightSecondary) && Intrinsics.areEqual(this.isPnlPositive, gameDetailPositionRowState.isPnlPositive) && this.isSelected == gameDetailPositionRowState.isSelected && this.isLoading == gameDetailPositionRowState.isLoading && this.isLeftPrimaryTextBolded == gameDetailPositionRowState.isLeftPrimaryTextBolded && Intrinsics.areEqual(this.loggingIdentifier, gameDetailPositionRowState.loggingIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.contractId.hashCode() * 31;
        StringResource stringResource = this.leftPrimary;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.leftSecondary;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        String str = this.rightPrimary;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource3 = this.rightSecondary;
        int iHashCode5 = (iHashCode4 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
        Boolean bool = this.isPnlPositive;
        int iHashCode6 = (((((((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isLeftPrimaryTextBolded)) * 31;
        String str2 = this.loggingIdentifier;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GameDetailPositionRowState(contractId=" + this.contractId + ", leftPrimary=" + this.leftPrimary + ", leftSecondary=" + this.leftSecondary + ", rightPrimary=" + this.rightPrimary + ", rightSecondary=" + this.rightSecondary + ", isPnlPositive=" + this.isPnlPositive + ", isSelected=" + this.isSelected + ", isLoading=" + this.isLoading + ", isLeftPrimaryTextBolded=" + this.isLeftPrimaryTextBolded + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    public GameDetailPositionRowState(UUID contractId, StringResource stringResource, StringResource stringResource2, String str, StringResource stringResource3, Boolean bool, boolean z, boolean z2, boolean z3, String str2) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        this.contractId = contractId;
        this.leftPrimary = stringResource;
        this.leftSecondary = stringResource2;
        this.rightPrimary = str;
        this.rightSecondary = stringResource3;
        this.isPnlPositive = bool;
        this.isSelected = z;
        this.isLoading = z2;
        this.isLeftPrimaryTextBolded = z3;
        this.loggingIdentifier = str2;
    }

    public /* synthetic */ GameDetailPositionRowState(UUID uuid, StringResource stringResource, StringResource stringResource2, String str, StringResource stringResource3, Boolean bool, boolean z, boolean z2, boolean z3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, stringResource, stringResource2, str, stringResource3, bool, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : str2);
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final StringResource getLeftPrimary() {
        return this.leftPrimary;
    }

    public final StringResource getLeftSecondary() {
        return this.leftSecondary;
    }

    public final String getRightPrimary() {
        return this.rightPrimary;
    }

    public final StringResource getRightSecondary() {
        return this.rightSecondary;
    }

    public final Boolean isPnlPositive() {
        return this.isPnlPositive;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLeftPrimaryTextBolded() {
        return this.isLeftPrimaryTextBolded;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    @JvmName
    public final long getRightPrimaryColor(Composer composer, int i) {
        long jM21425getFg0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735975243, i, -1, "com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowState.<get-rightPrimaryColor> (GameDetailPositionRow.kt:41)");
        }
        Boolean bool = this.isPnlPositive;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            composer.startReplaceGroup(1824901203);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            composer.startReplaceGroup(1824902739);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        } else {
            if (bool != null) {
                composer.startReplaceGroup(1824899411);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1824904237);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21425getFg0d7_KjU;
    }

    @JvmName
    public final long getRowBackgroundColor(Composer composer, int i) {
        long jM6725getTransparent0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-83421027, i, -1, "com.robinhood.android.event.gamedetail.ui.position.GameDetailPositionRowState.<get-rowBackgroundColor> (GameDetailPositionRow.kt:49)");
        }
        if (this.isSelected) {
            jM6725getTransparent0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
        } else {
            jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM6725getTransparent0d7_KjU;
    }
}
