package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarVisuals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Helpers.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003JG\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001a¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/ChartSnackbarVisuals;", "Landroidx/compose/material3/SnackbarVisuals;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "startText", "Lcom/robinhood/utils/resource/StringResource;", "actionText", "onActionClicked", "Lkotlin/Function0;", "", "duration", "Landroidx/compose/material3/SnackbarDuration;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SnackbarDuration;)V", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getStartText", "()Lcom/robinhood/utils/resource/StringResource;", "getActionText", "getOnActionClicked", "()Lkotlin/jvm/functions/Function0;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "message", "", "getMessage", "()Ljava/lang/String;", "withDismissAction", "", "getWithDismissAction", "()Z", "actionLabel", "getActionLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChartSnackbarVisuals implements SnackbarVisuals {
    public static final int $stable = 0;
    private final String actionLabel;
    private final StringResource actionText;
    private final SnackbarDuration duration;
    private final ServerToBentoAssetMapper2 icon;
    private final String message;
    private final Function0<Unit> onActionClicked;
    private final StringResource startText;
    private final boolean withDismissAction;

    public static /* synthetic */ ChartSnackbarVisuals copy$default(ChartSnackbarVisuals chartSnackbarVisuals, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, Function0 function0, SnackbarDuration snackbarDuration, int i, Object obj) {
        if ((i & 1) != 0) {
            serverToBentoAssetMapper2 = chartSnackbarVisuals.icon;
        }
        if ((i & 2) != 0) {
            stringResource = chartSnackbarVisuals.startText;
        }
        if ((i & 4) != 0) {
            stringResource2 = chartSnackbarVisuals.actionText;
        }
        if ((i & 8) != 0) {
            function0 = chartSnackbarVisuals.onActionClicked;
        }
        if ((i & 16) != 0) {
            snackbarDuration = chartSnackbarVisuals.duration;
        }
        SnackbarDuration snackbarDuration2 = snackbarDuration;
        StringResource stringResource3 = stringResource2;
        return chartSnackbarVisuals.copy(serverToBentoAssetMapper2, stringResource, stringResource3, function0, snackbarDuration2);
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

    /* renamed from: component5, reason: from getter */
    public final SnackbarDuration getDuration() {
        return this.duration;
    }

    public final ChartSnackbarVisuals copy(ServerToBentoAssetMapper2 icon, StringResource startText, StringResource actionText, Function0<Unit> onActionClicked, SnackbarDuration duration) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new ChartSnackbarVisuals(icon, startText, actionText, onActionClicked, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartSnackbarVisuals)) {
            return false;
        }
        ChartSnackbarVisuals chartSnackbarVisuals = (ChartSnackbarVisuals) other;
        return this.icon == chartSnackbarVisuals.icon && Intrinsics.areEqual(this.startText, chartSnackbarVisuals.startText) && Intrinsics.areEqual(this.actionText, chartSnackbarVisuals.actionText) && Intrinsics.areEqual(this.onActionClicked, chartSnackbarVisuals.onActionClicked) && this.duration == chartSnackbarVisuals.duration;
    }

    public int hashCode() {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        int iHashCode = (((serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode()) * 31) + this.startText.hashCode()) * 31;
        StringResource stringResource = this.actionText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        Function0<Unit> function0 = this.onActionClicked;
        return ((iHashCode2 + (function0 != null ? function0.hashCode() : 0)) * 31) + this.duration.hashCode();
    }

    public String toString() {
        return "ChartSnackbarVisuals(icon=" + this.icon + ", startText=" + this.startText + ", actionText=" + this.actionText + ", onActionClicked=" + this.onActionClicked + ", duration=" + this.duration + ")";
    }

    public ChartSnackbarVisuals(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource startText, StringResource stringResource, Function0<Unit> function0, SnackbarDuration duration) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.icon = serverToBentoAssetMapper2;
        this.startText = startText;
        this.actionText = stringResource;
        this.onActionClicked = function0;
        this.duration = duration;
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

    public /* synthetic */ ChartSnackbarVisuals(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, Function0 function0, SnackbarDuration snackbarDuration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serverToBentoAssetMapper2, stringResource, (i & 4) != 0 ? null : stringResource2, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? SnackbarDuration.Short : snackbarDuration);
    }

    @Override // androidx.compose.material3.SnackbarVisuals
    public SnackbarDuration getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.material3.SnackbarVisuals
    public String getMessage() {
        return this.message;
    }

    @Override // androidx.compose.material3.SnackbarVisuals
    public boolean getWithDismissAction() {
        return this.withDismissAction;
    }

    @Override // androidx.compose.material3.SnackbarVisuals
    public String getActionLabel() {
        return this.actionLabel;
    }
}
