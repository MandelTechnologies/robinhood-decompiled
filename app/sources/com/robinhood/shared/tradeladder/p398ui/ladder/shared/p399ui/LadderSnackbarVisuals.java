package com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarVisuals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderSnackbarVisuals.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003Jc\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 ¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/ui/LadderSnackbarVisuals;", "Landroidx/compose/material3/SnackbarVisuals;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "startText", "Lcom/robinhood/utils/resource/StringResource;", "actionText", "onActionClicked", "Lkotlin/Function0;", "", "onDismissClicked", "duration", "Landroidx/compose/material3/SnackbarDuration;", "withDismissAction", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SnackbarDuration;Z)V", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getStartText", "()Lcom/robinhood/utils/resource/StringResource;", "getActionText", "getOnActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnDismissClicked", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "getWithDismissAction", "()Z", "message", "", "getMessage", "()Ljava/lang/String;", "actionLabel", "getActionLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LadderSnackbarVisuals implements SnackbarVisuals {
    public static final int $stable = 0;
    private final String actionLabel;
    private final StringResource actionText;
    private final SnackbarDuration duration;
    private final ServerToBentoAssetMapper2 icon;
    private final String message;
    private final Function0<Unit> onActionClicked;
    private final Function0<Unit> onDismissClicked;
    private final StringResource startText;
    private final boolean withDismissAction;

    public static /* synthetic */ LadderSnackbarVisuals copy$default(LadderSnackbarVisuals ladderSnackbarVisuals, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, Function0 function0, Function0 function02, SnackbarDuration snackbarDuration, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            serverToBentoAssetMapper2 = ladderSnackbarVisuals.icon;
        }
        if ((i & 2) != 0) {
            stringResource = ladderSnackbarVisuals.startText;
        }
        if ((i & 4) != 0) {
            stringResource2 = ladderSnackbarVisuals.actionText;
        }
        if ((i & 8) != 0) {
            function0 = ladderSnackbarVisuals.onActionClicked;
        }
        if ((i & 16) != 0) {
            function02 = ladderSnackbarVisuals.onDismissClicked;
        }
        if ((i & 32) != 0) {
            snackbarDuration = ladderSnackbarVisuals.duration;
        }
        if ((i & 64) != 0) {
            z = ladderSnackbarVisuals.withDismissAction;
        }
        SnackbarDuration snackbarDuration2 = snackbarDuration;
        boolean z2 = z;
        Function0 function03 = function02;
        StringResource stringResource3 = stringResource2;
        return ladderSnackbarVisuals.copy(serverToBentoAssetMapper2, stringResource, stringResource3, function0, function03, snackbarDuration2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getStartText() {
        return this.startText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getActionText() {
        return this.actionText;
    }

    public final Function0<Unit> component4() {
        return this.onActionClicked;
    }

    public final Function0<Unit> component5() {
        return this.onDismissClicked;
    }

    /* renamed from: component6, reason: from getter */
    public final SnackbarDuration getDuration() {
        return this.duration;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getWithDismissAction() {
        return this.withDismissAction;
    }

    public final LadderSnackbarVisuals copy(ServerToBentoAssetMapper2 icon, StringResource startText, StringResource actionText, Function0<Unit> onActionClicked, Function0<Unit> onDismissClicked, SnackbarDuration duration, boolean withDismissAction) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new LadderSnackbarVisuals(icon, startText, actionText, onActionClicked, onDismissClicked, duration, withDismissAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderSnackbarVisuals)) {
            return false;
        }
        LadderSnackbarVisuals ladderSnackbarVisuals = (LadderSnackbarVisuals) other;
        return this.icon == ladderSnackbarVisuals.icon && Intrinsics.areEqual(this.startText, ladderSnackbarVisuals.startText) && Intrinsics.areEqual(this.actionText, ladderSnackbarVisuals.actionText) && Intrinsics.areEqual(this.onActionClicked, ladderSnackbarVisuals.onActionClicked) && Intrinsics.areEqual(this.onDismissClicked, ladderSnackbarVisuals.onDismissClicked) && this.duration == ladderSnackbarVisuals.duration && this.withDismissAction == ladderSnackbarVisuals.withDismissAction;
    }

    public int hashCode() {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        int iHashCode = (((serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode()) * 31) + this.startText.hashCode()) * 31;
        StringResource stringResource = this.actionText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        Function0<Unit> function0 = this.onActionClicked;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<Unit> function02 = this.onDismissClicked;
        return ((((iHashCode3 + (function02 != null ? function02.hashCode() : 0)) * 31) + this.duration.hashCode()) * 31) + Boolean.hashCode(this.withDismissAction);
    }

    public String toString() {
        return "LadderSnackbarVisuals(icon=" + this.icon + ", startText=" + this.startText + ", actionText=" + this.actionText + ", onActionClicked=" + this.onActionClicked + ", onDismissClicked=" + this.onDismissClicked + ", duration=" + this.duration + ", withDismissAction=" + this.withDismissAction + ")";
    }

    public LadderSnackbarVisuals(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource startText, StringResource stringResource, Function0<Unit> function0, Function0<Unit> function02, SnackbarDuration duration, boolean z) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.icon = serverToBentoAssetMapper2;
        this.startText = startText;
        this.actionText = stringResource;
        this.onActionClicked = function0;
        this.onDismissClicked = function02;
        this.duration = duration;
        this.withDismissAction = z;
        this.message = "";
        this.actionLabel = "";
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final StringResource getStartText() {
        return this.startText;
    }

    public final StringResource getActionText() {
        return this.actionText;
    }

    public final Function0<Unit> getOnActionClicked() {
        return this.onActionClicked;
    }

    public final Function0<Unit> getOnDismissClicked() {
        return this.onDismissClicked;
    }

    public /* synthetic */ LadderSnackbarVisuals(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, Function0 function0, Function0 function02, SnackbarDuration snackbarDuration, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serverToBentoAssetMapper2, stringResource, (i & 4) != 0 ? null : stringResource2, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function02, (i & 32) != 0 ? SnackbarDuration.Short : snackbarDuration, (i & 64) != 0 ? false : z);
    }

    @Override // androidx.compose.material3.SnackbarVisuals
    public SnackbarDuration getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.material3.SnackbarVisuals
    public boolean getWithDismissAction() {
        return this.withDismissAction;
    }

    @Override // androidx.compose.material3.SnackbarVisuals
    public String getMessage() {
        return this.message;
    }

    @Override // androidx.compose.material3.SnackbarVisuals
    public String getActionLabel() {
        return this.actionLabel;
    }
}
