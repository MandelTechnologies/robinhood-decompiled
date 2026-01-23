package com.robinhood.android.event.detail.p129ui.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButton2;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventTradeOverlayDialog.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J{\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u000eHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "", "contractName", "", "selectedQuote", "Lcom/robinhood/utils/resource/StringResource;", "buyButtonLabel", "closeButtonLabel", "buyMoreMetadata", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;", "closeMetadata", "side", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonOrderSide;", "anchorYPx", "", "viewMode", "Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "signedQuantity", "avgPrice", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonOrderSide;ILcom/robinhood/android/models/event/db/arsenal/EventViewMode;ID)V", "getContractName", "()Ljava/lang/String;", "getSelectedQuote", "()Lcom/robinhood/utils/resource/StringResource;", "getBuyButtonLabel", "getCloseButtonLabel", "getBuyMoreMetadata", "()Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;", "getCloseMetadata", "getSide", "()Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonOrderSide;", "getAnchorYPx", "()I", "getViewMode", "()Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "getSignedQuantity", "getAvgPrice", "()D", "themeColor", "Landroidx/compose/ui/graphics/Color;", "getThemeColor", "(Landroidx/compose/runtime/Composer;I)J", "animationStartDirection", "", "getAnimationStartDirection", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventTradeOverlayDialogData {
    public static final int $stable = 8;
    private final int anchorYPx;
    private final double avgPrice;
    private final StringResource buyButtonLabel;
    private final ContractSelectorButtonViewState.Metadata buyMoreMetadata;
    private final StringResource closeButtonLabel;
    private final ContractSelectorButtonViewState.Metadata closeMetadata;
    private final String contractName;
    private final StringResource selectedQuote;
    private final ContractSelectorButton2 side;
    private final int signedQuantity;
    private final EventViewMode viewMode;

    public static /* synthetic */ EventTradeOverlayDialogData copy$default(EventTradeOverlayDialogData eventTradeOverlayDialogData, String str, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, ContractSelectorButtonViewState.Metadata metadata, ContractSelectorButtonViewState.Metadata metadata2, ContractSelectorButton2 contractSelectorButton2, int i, EventViewMode eventViewMode, int i2, double d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = eventTradeOverlayDialogData.contractName;
        }
        if ((i3 & 2) != 0) {
            stringResource = eventTradeOverlayDialogData.selectedQuote;
        }
        if ((i3 & 4) != 0) {
            stringResource2 = eventTradeOverlayDialogData.buyButtonLabel;
        }
        if ((i3 & 8) != 0) {
            stringResource3 = eventTradeOverlayDialogData.closeButtonLabel;
        }
        if ((i3 & 16) != 0) {
            metadata = eventTradeOverlayDialogData.buyMoreMetadata;
        }
        if ((i3 & 32) != 0) {
            metadata2 = eventTradeOverlayDialogData.closeMetadata;
        }
        if ((i3 & 64) != 0) {
            contractSelectorButton2 = eventTradeOverlayDialogData.side;
        }
        if ((i3 & 128) != 0) {
            i = eventTradeOverlayDialogData.anchorYPx;
        }
        if ((i3 & 256) != 0) {
            eventViewMode = eventTradeOverlayDialogData.viewMode;
        }
        if ((i3 & 512) != 0) {
            i2 = eventTradeOverlayDialogData.signedQuantity;
        }
        if ((i3 & 1024) != 0) {
            d = eventTradeOverlayDialogData.avgPrice;
        }
        double d2 = d;
        EventViewMode eventViewMode2 = eventViewMode;
        int i4 = i2;
        ContractSelectorButton2 contractSelectorButton22 = contractSelectorButton2;
        int i5 = i;
        ContractSelectorButtonViewState.Metadata metadata3 = metadata;
        ContractSelectorButtonViewState.Metadata metadata4 = metadata2;
        return eventTradeOverlayDialogData.copy(str, stringResource, stringResource2, stringResource3, metadata3, metadata4, contractSelectorButton22, i5, eventViewMode2, i4, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContractName() {
        return this.contractName;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSignedQuantity() {
        return this.signedQuantity;
    }

    /* renamed from: component11, reason: from getter */
    public final double getAvgPrice() {
        return this.avgPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSelectedQuote() {
        return this.selectedQuote;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getBuyButtonLabel() {
        return this.buyButtonLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getCloseButtonLabel() {
        return this.closeButtonLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final ContractSelectorButtonViewState.Metadata getBuyMoreMetadata() {
        return this.buyMoreMetadata;
    }

    /* renamed from: component6, reason: from getter */
    public final ContractSelectorButtonViewState.Metadata getCloseMetadata() {
        return this.closeMetadata;
    }

    /* renamed from: component7, reason: from getter */
    public final ContractSelectorButton2 getSide() {
        return this.side;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAnchorYPx() {
        return this.anchorYPx;
    }

    /* renamed from: component9, reason: from getter */
    public final EventViewMode getViewMode() {
        return this.viewMode;
    }

    public final EventTradeOverlayDialogData copy(String contractName, StringResource selectedQuote, StringResource buyButtonLabel, StringResource closeButtonLabel, ContractSelectorButtonViewState.Metadata buyMoreMetadata, ContractSelectorButtonViewState.Metadata closeMetadata, ContractSelectorButton2 side, int anchorYPx, EventViewMode viewMode, int signedQuantity, double avgPrice) {
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(selectedQuote, "selectedQuote");
        Intrinsics.checkNotNullParameter(buyButtonLabel, "buyButtonLabel");
        Intrinsics.checkNotNullParameter(closeButtonLabel, "closeButtonLabel");
        Intrinsics.checkNotNullParameter(buyMoreMetadata, "buyMoreMetadata");
        Intrinsics.checkNotNullParameter(side, "side");
        return new EventTradeOverlayDialogData(contractName, selectedQuote, buyButtonLabel, closeButtonLabel, buyMoreMetadata, closeMetadata, side, anchorYPx, viewMode, signedQuantity, avgPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTradeOverlayDialogData)) {
            return false;
        }
        EventTradeOverlayDialogData eventTradeOverlayDialogData = (EventTradeOverlayDialogData) other;
        return Intrinsics.areEqual(this.contractName, eventTradeOverlayDialogData.contractName) && Intrinsics.areEqual(this.selectedQuote, eventTradeOverlayDialogData.selectedQuote) && Intrinsics.areEqual(this.buyButtonLabel, eventTradeOverlayDialogData.buyButtonLabel) && Intrinsics.areEqual(this.closeButtonLabel, eventTradeOverlayDialogData.closeButtonLabel) && Intrinsics.areEqual(this.buyMoreMetadata, eventTradeOverlayDialogData.buyMoreMetadata) && Intrinsics.areEqual(this.closeMetadata, eventTradeOverlayDialogData.closeMetadata) && this.side == eventTradeOverlayDialogData.side && this.anchorYPx == eventTradeOverlayDialogData.anchorYPx && this.viewMode == eventTradeOverlayDialogData.viewMode && this.signedQuantity == eventTradeOverlayDialogData.signedQuantity && Double.compare(this.avgPrice, eventTradeOverlayDialogData.avgPrice) == 0;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.contractName.hashCode() * 31) + this.selectedQuote.hashCode()) * 31) + this.buyButtonLabel.hashCode()) * 31) + this.closeButtonLabel.hashCode()) * 31) + this.buyMoreMetadata.hashCode()) * 31;
        ContractSelectorButtonViewState.Metadata metadata = this.closeMetadata;
        int iHashCode2 = (((((iHashCode + (metadata == null ? 0 : metadata.hashCode())) * 31) + this.side.hashCode()) * 31) + Integer.hashCode(this.anchorYPx)) * 31;
        EventViewMode eventViewMode = this.viewMode;
        return ((((iHashCode2 + (eventViewMode != null ? eventViewMode.hashCode() : 0)) * 31) + Integer.hashCode(this.signedQuantity)) * 31) + Double.hashCode(this.avgPrice);
    }

    public String toString() {
        return "EventTradeOverlayDialogData(contractName=" + this.contractName + ", selectedQuote=" + this.selectedQuote + ", buyButtonLabel=" + this.buyButtonLabel + ", closeButtonLabel=" + this.closeButtonLabel + ", buyMoreMetadata=" + this.buyMoreMetadata + ", closeMetadata=" + this.closeMetadata + ", side=" + this.side + ", anchorYPx=" + this.anchorYPx + ", viewMode=" + this.viewMode + ", signedQuantity=" + this.signedQuantity + ", avgPrice=" + this.avgPrice + ")";
    }

    public EventTradeOverlayDialogData(String contractName, StringResource selectedQuote, StringResource buyButtonLabel, StringResource closeButtonLabel, ContractSelectorButtonViewState.Metadata buyMoreMetadata, ContractSelectorButtonViewState.Metadata metadata, ContractSelectorButton2 side, int i, EventViewMode eventViewMode, int i2, double d) {
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(selectedQuote, "selectedQuote");
        Intrinsics.checkNotNullParameter(buyButtonLabel, "buyButtonLabel");
        Intrinsics.checkNotNullParameter(closeButtonLabel, "closeButtonLabel");
        Intrinsics.checkNotNullParameter(buyMoreMetadata, "buyMoreMetadata");
        Intrinsics.checkNotNullParameter(side, "side");
        this.contractName = contractName;
        this.selectedQuote = selectedQuote;
        this.buyButtonLabel = buyButtonLabel;
        this.closeButtonLabel = closeButtonLabel;
        this.buyMoreMetadata = buyMoreMetadata;
        this.closeMetadata = metadata;
        this.side = side;
        this.anchorYPx = i;
        this.viewMode = eventViewMode;
        this.signedQuantity = i2;
        this.avgPrice = d;
    }

    public final String getContractName() {
        return this.contractName;
    }

    public final StringResource getSelectedQuote() {
        return this.selectedQuote;
    }

    public final StringResource getBuyButtonLabel() {
        return this.buyButtonLabel;
    }

    public final StringResource getCloseButtonLabel() {
        return this.closeButtonLabel;
    }

    public final ContractSelectorButtonViewState.Metadata getBuyMoreMetadata() {
        return this.buyMoreMetadata;
    }

    public final ContractSelectorButtonViewState.Metadata getCloseMetadata() {
        return this.closeMetadata;
    }

    public final ContractSelectorButton2 getSide() {
        return this.side;
    }

    public final int getAnchorYPx() {
        return this.anchorYPx;
    }

    public final EventViewMode getViewMode() {
        return this.viewMode;
    }

    public final int getSignedQuantity() {
        return this.signedQuantity;
    }

    public final double getAvgPrice() {
        return this.avgPrice;
    }

    @JvmName
    public final long getThemeColor(Composer composer, int i) {
        long jM21452getNegative0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1477591211, i, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogData.<get-themeColor> (EventTradeOverlayDialog.kt:87)");
        }
        if (this.viewMode == EventViewMode.PAIR) {
            composer.startReplaceGroup(-199964117);
            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        } else if (this.side == ContractSelectorButton2.YES) {
            composer.startReplaceGroup(-199865723);
            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-199810171);
            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21452getNegative0d7_KjU;
    }

    public final float getAnimationStartDirection() {
        return this.side == ContractSelectorButton2.YES ? 0.0f : 1.0f;
    }
}
