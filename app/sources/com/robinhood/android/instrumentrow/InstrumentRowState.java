package com.robinhood.android.instrumentrow;

import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentRow.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010=\u001a\u00020\u000eHÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0013HÆ\u0003J\t\u0010@\u001a\u00020\u0013HÆ\u0003J\t\u0010A\u001a\u00020\u0016HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u0013HÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u001bHÆ\u0003J»\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0013\u0010G\u001a\u00020\u00132\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0016HÖ\u0001J\t\u0010J\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010-R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0017\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0011\u0010\u0018\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0011\u0010\u0019\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/instrumentrow/InstrumentRowState;", "", "metadataId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "accountNumber", "", "primaryText", "Lcom/robinhood/android/instrumentrow/models/Text;", "secondaryText", "trailingText", "trailingSecondaryText", "trailingTextBackgroundColor", "Lcom/robinhood/android/instrumentrow/models/BackgroundColor;", "chartLines", "", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "isDisplayTypeLoading", "", "showTrailingTextInContainer", "secondaryTextMaxLines", "", "showDivider", "removeVerticalPadding", "removeHorizontalPadding", "iconDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/lang/String;Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/BackgroundColor;Ljava/util/List;ZZIZZZLcom/robinhood/models/serverdriven/experimental/api/Direction;)V", "getMetadataId", "()Ljava/util/UUID;", "getInstrumentType", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "getAccountNumber", "()Ljava/lang/String;", "getPrimaryText", "()Lcom/robinhood/android/instrumentrow/models/Text;", "getSecondaryText", "getTrailingText", "getTrailingSecondaryText", "getTrailingTextBackgroundColor", "()Lcom/robinhood/android/instrumentrow/models/BackgroundColor;", "getChartLines", "()Ljava/util/List;", "()Z", "getShowTrailingTextInContainer", "getSecondaryTextMaxLines", "()I", "getShowDivider", "getRemoveVerticalPadding", "getRemoveHorizontalPadding", "getIconDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InstrumentRowState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final List<SegmentedLine> chartLines;
    private final Direction iconDirection;
    private final InstrumentType instrumentType;
    private final boolean isDisplayTypeLoading;
    private final UUID metadataId;
    private final Text primaryText;
    private final boolean removeHorizontalPadding;
    private final boolean removeVerticalPadding;
    private final Text secondaryText;
    private final int secondaryTextMaxLines;
    private final boolean showDivider;
    private final boolean showTrailingTextInContainer;
    private final Text trailingSecondaryText;
    private final Text trailingText;
    private final BackgroundColor trailingTextBackgroundColor;

    /* renamed from: component1, reason: from getter */
    public final UUID getMetadataId() {
        return this.metadataId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsDisplayTypeLoading() {
        return this.isDisplayTypeLoading;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowTrailingTextInContainer() {
        return this.showTrailingTextInContainer;
    }

    /* renamed from: component12, reason: from getter */
    public final int getSecondaryTextMaxLines() {
        return this.secondaryTextMaxLines;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getRemoveVerticalPadding() {
        return this.removeVerticalPadding;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getRemoveHorizontalPadding() {
        return this.removeHorizontalPadding;
    }

    /* renamed from: component16, reason: from getter */
    public final Direction getIconDirection() {
        return this.iconDirection;
    }

    /* renamed from: component2, reason: from getter */
    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final Text getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final Text getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component6, reason: from getter */
    public final Text getTrailingText() {
        return this.trailingText;
    }

    /* renamed from: component7, reason: from getter */
    public final Text getTrailingSecondaryText() {
        return this.trailingSecondaryText;
    }

    /* renamed from: component8, reason: from getter */
    public final BackgroundColor getTrailingTextBackgroundColor() {
        return this.trailingTextBackgroundColor;
    }

    public final List<SegmentedLine> component9() {
        return this.chartLines;
    }

    public final InstrumentRowState copy(UUID metadataId, InstrumentType instrumentType, String accountNumber, Text primaryText, Text secondaryText, Text trailingText, Text trailingSecondaryText, BackgroundColor trailingTextBackgroundColor, List<? extends SegmentedLine> chartLines, boolean isDisplayTypeLoading, boolean showTrailingTextInContainer, int secondaryTextMaxLines, boolean showDivider, boolean removeVerticalPadding, boolean removeHorizontalPadding, Direction iconDirection) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(trailingText, "trailingText");
        Intrinsics.checkNotNullParameter(trailingTextBackgroundColor, "trailingTextBackgroundColor");
        return new InstrumentRowState(metadataId, instrumentType, accountNumber, primaryText, secondaryText, trailingText, trailingSecondaryText, trailingTextBackgroundColor, chartLines, isDisplayTypeLoading, showTrailingTextInContainer, secondaryTextMaxLines, showDivider, removeVerticalPadding, removeHorizontalPadding, iconDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentRowState)) {
            return false;
        }
        InstrumentRowState instrumentRowState = (InstrumentRowState) other;
        return Intrinsics.areEqual(this.metadataId, instrumentRowState.metadataId) && this.instrumentType == instrumentRowState.instrumentType && Intrinsics.areEqual(this.accountNumber, instrumentRowState.accountNumber) && Intrinsics.areEqual(this.primaryText, instrumentRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, instrumentRowState.secondaryText) && Intrinsics.areEqual(this.trailingText, instrumentRowState.trailingText) && Intrinsics.areEqual(this.trailingSecondaryText, instrumentRowState.trailingSecondaryText) && Intrinsics.areEqual(this.trailingTextBackgroundColor, instrumentRowState.trailingTextBackgroundColor) && Intrinsics.areEqual(this.chartLines, instrumentRowState.chartLines) && this.isDisplayTypeLoading == instrumentRowState.isDisplayTypeLoading && this.showTrailingTextInContainer == instrumentRowState.showTrailingTextInContainer && this.secondaryTextMaxLines == instrumentRowState.secondaryTextMaxLines && this.showDivider == instrumentRowState.showDivider && this.removeVerticalPadding == instrumentRowState.removeVerticalPadding && this.removeHorizontalPadding == instrumentRowState.removeHorizontalPadding && this.iconDirection == instrumentRowState.iconDirection;
    }

    public int hashCode() {
        UUID uuid = this.metadataId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        InstrumentType instrumentType = this.instrumentType;
        int iHashCode2 = (iHashCode + (instrumentType == null ? 0 : instrumentType.hashCode())) * 31;
        String str = this.accountNumber;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.trailingText.hashCode()) * 31;
        Text text = this.trailingSecondaryText;
        int iHashCode4 = (((iHashCode3 + (text == null ? 0 : text.hashCode())) * 31) + this.trailingTextBackgroundColor.hashCode()) * 31;
        List<SegmentedLine> list = this.chartLines;
        int iHashCode5 = (((((((((((((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isDisplayTypeLoading)) * 31) + Boolean.hashCode(this.showTrailingTextInContainer)) * 31) + Integer.hashCode(this.secondaryTextMaxLines)) * 31) + Boolean.hashCode(this.showDivider)) * 31) + Boolean.hashCode(this.removeVerticalPadding)) * 31) + Boolean.hashCode(this.removeHorizontalPadding)) * 31;
        Direction direction = this.iconDirection;
        return iHashCode5 + (direction != null ? direction.hashCode() : 0);
    }

    public String toString() {
        return "InstrumentRowState(metadataId=" + this.metadataId + ", instrumentType=" + this.instrumentType + ", accountNumber=" + this.accountNumber + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", trailingText=" + this.trailingText + ", trailingSecondaryText=" + this.trailingSecondaryText + ", trailingTextBackgroundColor=" + this.trailingTextBackgroundColor + ", chartLines=" + this.chartLines + ", isDisplayTypeLoading=" + this.isDisplayTypeLoading + ", showTrailingTextInContainer=" + this.showTrailingTextInContainer + ", secondaryTextMaxLines=" + this.secondaryTextMaxLines + ", showDivider=" + this.showDivider + ", removeVerticalPadding=" + this.removeVerticalPadding + ", removeHorizontalPadding=" + this.removeHorizontalPadding + ", iconDirection=" + this.iconDirection + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstrumentRowState(UUID uuid, InstrumentType instrumentType, String str, Text primaryText, Text secondaryText, Text trailingText, Text text, BackgroundColor trailingTextBackgroundColor, List<? extends SegmentedLine> list, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, Direction direction) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(trailingText, "trailingText");
        Intrinsics.checkNotNullParameter(trailingTextBackgroundColor, "trailingTextBackgroundColor");
        this.metadataId = uuid;
        this.instrumentType = instrumentType;
        this.accountNumber = str;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.trailingText = trailingText;
        this.trailingSecondaryText = text;
        this.trailingTextBackgroundColor = trailingTextBackgroundColor;
        this.chartLines = list;
        this.isDisplayTypeLoading = z;
        this.showTrailingTextInContainer = z2;
        this.secondaryTextMaxLines = i;
        this.showDivider = z3;
        this.removeVerticalPadding = z4;
        this.removeHorizontalPadding = z5;
        this.iconDirection = direction;
    }

    public /* synthetic */ InstrumentRowState(UUID uuid, InstrumentType instrumentType, String str, Text text, Text text2, Text text3, Text text4, BackgroundColor backgroundColor, List list, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, Direction direction, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uuid, (i2 & 2) != 0 ? null : instrumentType, (i2 & 4) != 0 ? null : str, text, text2, text3, (i2 & 64) != 0 ? null : text4, backgroundColor, (i2 & 256) != 0 ? null : list, z, z2, (i2 & 2048) != 0 ? 2 : i, (i2 & 4096) != 0 ? true : z3, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) != 0 ? false : z5, (i2 & 32768) != 0 ? null : direction);
    }

    public final UUID getMetadataId() {
        return this.metadataId;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Text getPrimaryText() {
        return this.primaryText;
    }

    public final Text getSecondaryText() {
        return this.secondaryText;
    }

    public final Text getTrailingText() {
        return this.trailingText;
    }

    public final Text getTrailingSecondaryText() {
        return this.trailingSecondaryText;
    }

    public final BackgroundColor getTrailingTextBackgroundColor() {
        return this.trailingTextBackgroundColor;
    }

    public final List<SegmentedLine> getChartLines() {
        return this.chartLines;
    }

    public final boolean isDisplayTypeLoading() {
        return this.isDisplayTypeLoading;
    }

    public final boolean getShowTrailingTextInContainer() {
        return this.showTrailingTextInContainer;
    }

    public final int getSecondaryTextMaxLines() {
        return this.secondaryTextMaxLines;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final boolean getRemoveVerticalPadding() {
        return this.removeVerticalPadding;
    }

    public final boolean getRemoveHorizontalPadding() {
        return this.removeHorizontalPadding;
    }

    public final Direction getIconDirection() {
        return this.iconDirection;
    }
}
