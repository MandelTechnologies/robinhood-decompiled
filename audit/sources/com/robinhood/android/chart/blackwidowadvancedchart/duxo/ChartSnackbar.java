package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvanceChartEvent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/ChartSnackbar;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "startText", "Lcom/robinhood/utils/resource/StringResource;", "actionText", "onActionClicked", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;)V", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getStartText", "()Lcom/robinhood/utils/resource/StringResource;", "getActionText", "getOnActionClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChartSnackbar implements AdvanceChartEvent {
    public static final int $stable = StringResource.$stable;
    private final StringResource actionText;
    private final ServerToBentoAssetMapper2 icon;
    private final Function0<Unit> onActionClicked;
    private final StringResource startText;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartSnackbar copy$default(ChartSnackbar chartSnackbar, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            serverToBentoAssetMapper2 = chartSnackbar.icon;
        }
        if ((i & 2) != 0) {
            stringResource = chartSnackbar.startText;
        }
        if ((i & 4) != 0) {
            stringResource2 = chartSnackbar.actionText;
        }
        if ((i & 8) != 0) {
            function0 = chartSnackbar.onActionClicked;
        }
        return chartSnackbar.copy(serverToBentoAssetMapper2, stringResource, stringResource2, function0);
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

    public final ChartSnackbar copy(ServerToBentoAssetMapper2 icon, StringResource startText, StringResource actionText, Function0<Unit> onActionClicked) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        return new ChartSnackbar(icon, startText, actionText, onActionClicked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartSnackbar)) {
            return false;
        }
        ChartSnackbar chartSnackbar = (ChartSnackbar) other;
        return this.icon == chartSnackbar.icon && Intrinsics.areEqual(this.startText, chartSnackbar.startText) && Intrinsics.areEqual(this.actionText, chartSnackbar.actionText) && Intrinsics.areEqual(this.onActionClicked, chartSnackbar.onActionClicked);
    }

    public int hashCode() {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        int iHashCode = (((serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode()) * 31) + this.startText.hashCode()) * 31;
        StringResource stringResource = this.actionText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        Function0<Unit> function0 = this.onActionClicked;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public String toString() {
        return "ChartSnackbar(icon=" + this.icon + ", startText=" + this.startText + ", actionText=" + this.actionText + ", onActionClicked=" + this.onActionClicked + ")";
    }

    public ChartSnackbar(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource startText, StringResource stringResource, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        this.icon = serverToBentoAssetMapper2;
        this.startText = startText;
        this.actionText = stringResource;
        this.onActionClicked = function0;
    }

    public /* synthetic */ ChartSnackbar(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serverToBentoAssetMapper2, stringResource, (i & 4) != 0 ? null : stringResource2, (i & 8) != 0 ? null : function0);
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
}
