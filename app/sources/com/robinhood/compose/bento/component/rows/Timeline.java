package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTimelineRow.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\r\u001c\u001d\u001e\u001f !\"#$%&'(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u000e\u0010\u000f\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline;", "", "<init>", "()V", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "connectorWidth", "getConnectorWidth-D9Ej5fM", "iconPadding", "getIconPadding-D9Ej5fM", "textSpaceWidth", "getTextSpaceWidth-D9Ej5fM", "STATUS_INFO_ANIMATION_DURATION", "", "MIDDLE_META_OFFSET_ANIMATION_DURATION", "MIDDLE_META_ALPHA_ANIMATION_DURATION", "MIDDLE_META_ANIMATION_DELAY", "getPositionFromIndex", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "numRows", "getConnectorColor", "Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;", "status", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "StatusInfo", BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_REMOVE_CTA_BUTTON, "InfoAction", "ColorOverrides", "Status", "Position", "ColorType", "IconStyle", "IconPaddingPosition", "InfoIconPosition", "StatusIconPosition", "DetailContent", "PrimaryTextStyleOverride", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class Timeline {
    public static final int $stable = 0;
    public static final int MIDDLE_META_ALPHA_ANIMATION_DURATION = 283;
    public static final int MIDDLE_META_ANIMATION_DELAY = 250;
    public static final int MIDDLE_META_OFFSET_ANIMATION_DURATION = 700;
    public static final int STATUS_INFO_ANIMATION_DURATION = 271;
    private static final float connectorWidth;
    private static final float iconPadding;
    public static final Timeline INSTANCE = new Timeline();
    private static final float height = C2002Dp.m7995constructorimpl(80);
    private static final float textSpaceWidth = C2002Dp.m7995constructorimpl(4);

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.INCOMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Status.COMPLETE_GOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 2;
        connectorWidth = C2002Dp.m7995constructorimpl(f);
        iconPadding = C2002Dp.m7995constructorimpl(f);
    }

    private Timeline() {
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m21059getHeightD9Ej5fM() {
        return height;
    }

    /* renamed from: getConnectorWidth-D9Ej5fM, reason: not valid java name */
    public final float m21058getConnectorWidthD9Ej5fM() {
        return connectorWidth;
    }

    /* renamed from: getIconPadding-D9Ej5fM, reason: not valid java name */
    public final float m21060getIconPaddingD9Ej5fM() {
        return iconPadding;
    }

    /* renamed from: getTextSpaceWidth-D9Ej5fM, reason: not valid java name */
    public final float m21061getTextSpaceWidthD9Ej5fM() {
        return textSpaceWidth;
    }

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0001CBm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\b4J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\b8J\t\u00109\u001a\u00020\u0013HÆ\u0003J\t\u0010:\u001a\u00020\u0015HÆ\u0003J\u008e\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0006HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006D"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$StatusInfo;", "", "topConnectorColor", "Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;", "bottomConnectorColor", "icon", "", "iconColor", "iconStyle", "Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;", "iconPaddingPosition", "Lcom/robinhood/compose/bento/component/rows/Timeline$IconPaddingPosition;", "colorOverride", "Landroidx/compose/ui/graphics/Color;", "position", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "iconColorOverride", "isLargeIconContainer", "", "statusIconPosition", "Lcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;Ljava/lang/Integer;Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;Lcom/robinhood/compose/bento/component/rows/Timeline$IconPaddingPosition;Landroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/rows/Timeline$Position;ILandroidx/compose/ui/graphics/Color;ZLcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTopConnectorColor", "()Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;", "getBottomConnectorColor", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconColor", "getIconStyle", "()Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;", "getIconPaddingPosition", "()Lcom/robinhood/compose/bento/component/rows/Timeline$IconPaddingPosition;", "getColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getPosition", "()Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "getIndex", "()I", "getIconColorOverride-QN2ZGVo", "()Z", "getStatusIconPosition", "()Lcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7-QN2ZGVo", "component8", "component9", "component10", "component10-QN2ZGVo", "component11", "component12", "copy", "copy-bIdyMIk", "(Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;Ljava/lang/Integer;Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;Lcom/robinhood/compose/bento/component/rows/Timeline$IconPaddingPosition;Landroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/rows/Timeline$Position;ILandroidx/compose/ui/graphics/Color;ZLcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;)Lcom/robinhood/compose/bento/component/rows/Timeline$StatusInfo;", "equals", "other", "hashCode", "toString", "", "Companion", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StatusInfo {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ColorType bottomConnectorColor;
        private final Color colorOverride;
        private final Integer icon;
        private final ColorType iconColor;
        private final Color iconColorOverride;
        private final IconPaddingPosition iconPaddingPosition;
        private final IconStyle iconStyle;
        private final int index;
        private final boolean isLargeIconContainer;
        private final Position position;
        private final StatusIconPosition statusIconPosition;
        private final ColorType topConnectorColor;

        public /* synthetic */ StatusInfo(ColorType colorType, ColorType colorType2, Integer num, ColorType colorType3, IconStyle iconStyle, IconPaddingPosition iconPaddingPosition, Color color, Position position, int i, Color color2, boolean z, StatusIconPosition statusIconPosition, DefaultConstructorMarker defaultConstructorMarker) {
            this(colorType, colorType2, num, colorType3, iconStyle, iconPaddingPosition, color, position, i, color2, z, statusIconPosition);
        }

        /* renamed from: copy-bIdyMIk$default, reason: not valid java name */
        public static /* synthetic */ StatusInfo m21080copybIdyMIk$default(StatusInfo statusInfo, ColorType colorType, ColorType colorType2, Integer num, ColorType colorType3, IconStyle iconStyle, IconPaddingPosition iconPaddingPosition, Color color, Position position, int i, Color color2, boolean z, StatusIconPosition statusIconPosition, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                colorType = statusInfo.topConnectorColor;
            }
            if ((i2 & 2) != 0) {
                colorType2 = statusInfo.bottomConnectorColor;
            }
            if ((i2 & 4) != 0) {
                num = statusInfo.icon;
            }
            if ((i2 & 8) != 0) {
                colorType3 = statusInfo.iconColor;
            }
            if ((i2 & 16) != 0) {
                iconStyle = statusInfo.iconStyle;
            }
            if ((i2 & 32) != 0) {
                iconPaddingPosition = statusInfo.iconPaddingPosition;
            }
            if ((i2 & 64) != 0) {
                color = statusInfo.colorOverride;
            }
            if ((i2 & 128) != 0) {
                position = statusInfo.position;
            }
            if ((i2 & 256) != 0) {
                i = statusInfo.index;
            }
            if ((i2 & 512) != 0) {
                color2 = statusInfo.iconColorOverride;
            }
            if ((i2 & 1024) != 0) {
                z = statusInfo.isLargeIconContainer;
            }
            if ((i2 & 2048) != 0) {
                statusIconPosition = statusInfo.statusIconPosition;
            }
            boolean z2 = z;
            StatusIconPosition statusIconPosition2 = statusIconPosition;
            int i3 = i;
            Color color3 = color2;
            Color color4 = color;
            Position position2 = position;
            IconStyle iconStyle2 = iconStyle;
            IconPaddingPosition iconPaddingPosition2 = iconPaddingPosition;
            return statusInfo.m21083copybIdyMIk(colorType, colorType2, num, colorType3, iconStyle2, iconPaddingPosition2, color4, position2, i3, color3, z2, statusIconPosition2);
        }

        /* renamed from: component1, reason: from getter */
        public final ColorType getTopConnectorColor() {
            return this.topConnectorColor;
        }

        /* renamed from: component10-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getIconColorOverride() {
            return this.iconColorOverride;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsLargeIconContainer() {
            return this.isLargeIconContainer;
        }

        /* renamed from: component12, reason: from getter */
        public final StatusIconPosition getStatusIconPosition() {
            return this.statusIconPosition;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorType getBottomConnectorColor() {
            return this.bottomConnectorColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final ColorType getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component5, reason: from getter */
        public final IconStyle getIconStyle() {
            return this.iconStyle;
        }

        /* renamed from: component6, reason: from getter */
        public final IconPaddingPosition getIconPaddingPosition() {
            return this.iconPaddingPosition;
        }

        /* renamed from: component7-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getColorOverride() {
            return this.colorOverride;
        }

        /* renamed from: component8, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        /* renamed from: component9, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: copy-bIdyMIk, reason: not valid java name */
        public final StatusInfo m21083copybIdyMIk(ColorType topConnectorColor, ColorType bottomConnectorColor, Integer icon, ColorType iconColor, IconStyle iconStyle, IconPaddingPosition iconPaddingPosition, Color colorOverride, Position position, int index, Color iconColorOverride, boolean isLargeIconContainer, StatusIconPosition statusIconPosition) {
            Intrinsics.checkNotNullParameter(topConnectorColor, "topConnectorColor");
            Intrinsics.checkNotNullParameter(bottomConnectorColor, "bottomConnectorColor");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
            Intrinsics.checkNotNullParameter(iconPaddingPosition, "iconPaddingPosition");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(statusIconPosition, "statusIconPosition");
            return new StatusInfo(topConnectorColor, bottomConnectorColor, icon, iconColor, iconStyle, iconPaddingPosition, colorOverride, position, index, iconColorOverride, isLargeIconContainer, statusIconPosition, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusInfo)) {
                return false;
            }
            StatusInfo statusInfo = (StatusInfo) other;
            return this.topConnectorColor == statusInfo.topConnectorColor && this.bottomConnectorColor == statusInfo.bottomConnectorColor && Intrinsics.areEqual(this.icon, statusInfo.icon) && this.iconColor == statusInfo.iconColor && this.iconStyle == statusInfo.iconStyle && this.iconPaddingPosition == statusInfo.iconPaddingPosition && Intrinsics.areEqual(this.colorOverride, statusInfo.colorOverride) && this.position == statusInfo.position && this.index == statusInfo.index && Intrinsics.areEqual(this.iconColorOverride, statusInfo.iconColorOverride) && this.isLargeIconContainer == statusInfo.isLargeIconContainer && this.statusIconPosition == statusInfo.statusIconPosition;
        }

        public int hashCode() {
            int iHashCode = ((this.topConnectorColor.hashCode() * 31) + this.bottomConnectorColor.hashCode()) * 31;
            Integer num = this.icon;
            int iHashCode2 = (((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.iconColor.hashCode()) * 31) + this.iconStyle.hashCode()) * 31) + this.iconPaddingPosition.hashCode()) * 31;
            Color color = this.colorOverride;
            int iM6713hashCodeimpl = (((((iHashCode2 + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31) + this.position.hashCode()) * 31) + Integer.hashCode(this.index)) * 31;
            Color color2 = this.iconColorOverride;
            return ((((iM6713hashCodeimpl + (color2 != null ? Color.m6713hashCodeimpl(color2.getValue()) : 0)) * 31) + Boolean.hashCode(this.isLargeIconContainer)) * 31) + this.statusIconPosition.hashCode();
        }

        public String toString() {
            return "StatusInfo(topConnectorColor=" + this.topConnectorColor + ", bottomConnectorColor=" + this.bottomConnectorColor + ", icon=" + this.icon + ", iconColor=" + this.iconColor + ", iconStyle=" + this.iconStyle + ", iconPaddingPosition=" + this.iconPaddingPosition + ", colorOverride=" + this.colorOverride + ", position=" + this.position + ", index=" + this.index + ", iconColorOverride=" + this.iconColorOverride + ", isLargeIconContainer=" + this.isLargeIconContainer + ", statusIconPosition=" + this.statusIconPosition + ")";
        }

        private StatusInfo(ColorType topConnectorColor, ColorType bottomConnectorColor, Integer num, ColorType iconColor, IconStyle iconStyle, IconPaddingPosition iconPaddingPosition, Color color, Position position, int i, Color color2, boolean z, StatusIconPosition statusIconPosition) {
            Intrinsics.checkNotNullParameter(topConnectorColor, "topConnectorColor");
            Intrinsics.checkNotNullParameter(bottomConnectorColor, "bottomConnectorColor");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
            Intrinsics.checkNotNullParameter(iconPaddingPosition, "iconPaddingPosition");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(statusIconPosition, "statusIconPosition");
            this.topConnectorColor = topConnectorColor;
            this.bottomConnectorColor = bottomConnectorColor;
            this.icon = num;
            this.iconColor = iconColor;
            this.iconStyle = iconStyle;
            this.iconPaddingPosition = iconPaddingPosition;
            this.colorOverride = color;
            this.position = position;
            this.index = i;
            this.iconColorOverride = color2;
            this.isLargeIconContainer = z;
            this.statusIconPosition = statusIconPosition;
        }

        public final ColorType getTopConnectorColor() {
            return this.topConnectorColor;
        }

        public final ColorType getBottomConnectorColor() {
            return this.bottomConnectorColor;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final ColorType getIconColor() {
            return this.iconColor;
        }

        public final IconStyle getIconStyle() {
            return this.iconStyle;
        }

        public final IconPaddingPosition getIconPaddingPosition() {
            return this.iconPaddingPosition;
        }

        /* renamed from: getColorOverride-QN2ZGVo, reason: not valid java name */
        public final Color m21084getColorOverrideQN2ZGVo() {
            return this.colorOverride;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final int getIndex() {
            return this.index;
        }

        /* renamed from: getIconColorOverride-QN2ZGVo, reason: not valid java name */
        public final Color m21085getIconColorOverrideQN2ZGVo() {
            return this.iconColorOverride;
        }

        public final boolean isLargeIconContainer() {
            return this.isLargeIconContainer;
        }

        public final StatusIconPosition getStatusIconPosition() {
            return this.statusIconPosition;
        }

        /* compiled from: BentoTimelineRow.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\b\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$StatusInfo$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/compose/bento/component/rows/Timeline$StatusInfo;", "status", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "position", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "colorOverrides", "Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;", "previousStatus", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "iconOverride", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "iconColorOverride", "Landroidx/compose/ui/graphics/Color;", "isLargeIconContainer", "", "statusIconPosition", "Lcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;", "iconStyleOverride", "Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;", "create-PIknLig", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {

            /* compiled from: BentoTimelineRow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                static {
                    int[] iArr = new int[Position.values().length];
                    try {
                        iArr[Position.TOP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Position.BETWEEN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Position.BOTTOM.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[Status.values().length];
                    try {
                        iArr2[Status.INCOMPLETE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[Status.ONGOING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[Status.COMPLETE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr2[Status.COMPLETE_GOLD.ordinal()] = 4;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr2[Status.ERROR.ordinal()] = 5;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr2[Status.WARNING.ordinal()] = 6;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
            /* renamed from: create-PIknLig, reason: not valid java name */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final StatusInfo m21086createPIknLig(Status status, Position position, ColorOverrides colorOverrides, Status previousStatus, int index, ServerToBentoAssetMapper2 iconOverride, Color iconColorOverride, boolean isLargeIconContainer, StatusIconPosition statusIconPosition, IconStyle iconStyleOverride) {
                ColorType connectorColor;
                ColorType connectorColor2;
                Integer num;
                Integer numValueOf;
                int[] iArr;
                ColorType colorType;
                IconStyle iconStyle;
                IconPaddingPosition iconPaddingPosition;
                Intrinsics.checkNotNullParameter(status, "status");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(statusIconPosition, "statusIconPosition");
                int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                int i = iArr2[position.ordinal()];
                if (i == 1) {
                    connectorColor = ColorType.TRANSPARENT;
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    connectorColor = Timeline.INSTANCE.getConnectorColor(previousStatus);
                }
                int i2 = iArr2[position.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    connectorColor2 = Timeline.INSTANCE.getConnectorColor(status);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    connectorColor2 = ColorType.TRANSPARENT;
                }
                ColorType colorType2 = connectorColor2;
                Color colorM21071getIncompleteQN2ZGVo = null;
                if (iconOverride != null) {
                    numValueOf = Integer.valueOf(iconOverride.getResourceId());
                } else {
                    switch (WhenMappings.$EnumSwitchMapping$1[status.ordinal()]) {
                        case 1:
                            num = null;
                            iArr = WhenMappings.$EnumSwitchMapping$1;
                            switch (iArr[status.ordinal()]) {
                                case 1:
                                    colorType = ColorType.DISABLED;
                                    break;
                                case 2:
                                case 3:
                                    colorType = ColorType.BACKGROUND;
                                    break;
                                case 4:
                                    colorType = ColorType.SPARKLE;
                                    break;
                                case 5:
                                    colorType = ColorType.ERROR;
                                    break;
                                case 6:
                                    colorType = ColorType.WARNING;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            if (iconStyleOverride != null) {
                                switch (iArr[status.ordinal()]) {
                                    case 1:
                                        iconStyle = IconStyle.DOT;
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        iconStyle = IconStyle.FILLED;
                                        break;
                                    case 5:
                                    case 6:
                                        iconStyle = IconStyle.OUTLINE;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                iconStyle = iconStyleOverride;
                            }
                            switch (iArr[status.ordinal()]) {
                                case 1:
                                    if (connectorColor == ColorType.ENABLED) {
                                        iconPaddingPosition = IconPaddingPosition.ABOVE;
                                        break;
                                    } else {
                                        iconPaddingPosition = IconPaddingPosition.NONE;
                                        break;
                                    }
                                case 2:
                                case 3:
                                case 4:
                                    iconPaddingPosition = IconPaddingPosition.NONE;
                                    break;
                                case 5:
                                case 6:
                                    iconPaddingPosition = IconPaddingPosition.BELOW;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            switch (iArr[status.ordinal()]) {
                                case 1:
                                    if (colorOverrides != null) {
                                        colorM21071getIncompleteQN2ZGVo = colorOverrides.m21071getIncompleteQN2ZGVo();
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (colorOverrides != null) {
                                        colorM21071getIncompleteQN2ZGVo = colorOverrides.m21072getOngoingQN2ZGVo();
                                        break;
                                    }
                                    break;
                                case 3:
                                    if (colorOverrides != null) {
                                        colorM21071getIncompleteQN2ZGVo = colorOverrides.m21069getCompleteQN2ZGVo();
                                        break;
                                    }
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    if (colorOverrides != null) {
                                        colorM21071getIncompleteQN2ZGVo = colorOverrides.m21070getErrorQN2ZGVo();
                                        break;
                                    }
                                    break;
                                case 6:
                                    if (colorOverrides != null) {
                                        colorM21071getIncompleteQN2ZGVo = colorOverrides.m21073getWarningQN2ZGVo();
                                        break;
                                    }
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            return new StatusInfo(connectorColor, colorType2, num, colorType, iconStyle, iconPaddingPosition, colorM21071getIncompleteQN2ZGVo, position, index, iconColorOverride, isLargeIconContainer, statusIconPosition, null);
                        case 2:
                            numValueOf = Integer.valueOf(C20690R.drawable.ic_rds_dot_12dp);
                            break;
                        case 3:
                        case 4:
                            numValueOf = Integer.valueOf(C20690R.drawable.ic_rds_checkmark_16dp);
                            break;
                        case 5:
                            numValueOf = Integer.valueOf(C20690R.drawable.ic_rds_bubble_remove_24dp);
                            break;
                        case 6:
                            numValueOf = Integer.valueOf(C20690R.drawable.ic_rds_alert_24dp);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                num = numValueOf;
                iArr = WhenMappings.$EnumSwitchMapping$1;
                switch (iArr[status.ordinal()]) {
                }
                if (iconStyleOverride != null) {
                }
                switch (iArr[status.ordinal()]) {
                }
                switch (iArr[status.ordinal()]) {
                }
                return new StatusInfo(connectorColor, colorType2, num, colorType, iconStyle, iconPaddingPosition, colorM21071getIncompleteQN2ZGVo, position, index, iconColorOverride, isLargeIconContainer, statusIconPosition, null);
            }
        }
    }

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$CtaButton;", "", "text", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getText", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CtaButton {
        public static final int $stable = 0;
        private final Function0<Unit> onClick;
        private final String text;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CtaButton copy$default(CtaButton ctaButton, String str, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ctaButton.text;
            }
            if ((i & 2) != 0) {
                function0 = ctaButton.onClick;
            }
            return ctaButton.copy(str, function0);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Function0<Unit> component2() {
            return this.onClick;
        }

        public final CtaButton copy(String text, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new CtaButton(text, onClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CtaButton)) {
                return false;
            }
            CtaButton ctaButton = (CtaButton) other;
            return Intrinsics.areEqual(this.text, ctaButton.text) && Intrinsics.areEqual(this.onClick, ctaButton.onClick);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "CtaButton(text=" + this.text + ", onClick=" + this.onClick + ")";
        }

        public CtaButton(String text, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.text = text;
            this.onClick = onClick;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$InfoAction;", "", "infoIconPosition", "Lcom/robinhood/compose/bento/component/rows/Timeline$InfoIconPosition;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/compose/bento/component/rows/Timeline$InfoIconPosition;Lkotlin/jvm/functions/Function0;)V", "getInfoIconPosition", "()Lcom/robinhood/compose/bento/component/rows/Timeline$InfoIconPosition;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InfoAction {
        public static final int $stable = 0;
        private final InfoIconPosition infoIconPosition;
        private final Function0<Unit> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InfoAction copy$default(InfoAction infoAction, InfoIconPosition infoIconPosition, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                infoIconPosition = infoAction.infoIconPosition;
            }
            if ((i & 2) != 0) {
                function0 = infoAction.onClick;
            }
            return infoAction.copy(infoIconPosition, function0);
        }

        /* renamed from: component1, reason: from getter */
        public final InfoIconPosition getInfoIconPosition() {
            return this.infoIconPosition;
        }

        public final Function0<Unit> component2() {
            return this.onClick;
        }

        public final InfoAction copy(InfoIconPosition infoIconPosition, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(infoIconPosition, "infoIconPosition");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new InfoAction(infoIconPosition, onClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoAction)) {
                return false;
            }
            InfoAction infoAction = (InfoAction) other;
            return this.infoIconPosition == infoAction.infoIconPosition && Intrinsics.areEqual(this.onClick, infoAction.onClick);
        }

        public int hashCode() {
            return (this.infoIconPosition.hashCode() * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "InfoAction(infoIconPosition=" + this.infoIconPosition + ", onClick=" + this.onClick + ")";
        }

        public InfoAction(InfoIconPosition infoIconPosition, Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(infoIconPosition, "infoIconPosition");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.infoIconPosition = infoIconPosition;
            this.onClick = onClick;
        }

        public final InfoIconPosition getInfoIconPosition() {
            return this.infoIconPosition;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }
    }

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u0019JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;", "", "incomplete", "Landroidx/compose/ui/graphics/Color;", "complete", "error", "warning", "ongoing", "<init>", "(Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIncomplete-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getComplete-QN2ZGVo", "getError-QN2ZGVo", "getWarning-QN2ZGVo", "getOngoing-QN2ZGVo", "component1", "component1-QN2ZGVo", "component2", "component2-QN2ZGVo", "component3", "component3-QN2ZGVo", "component4", "component4-QN2ZGVo", "component5", "component5-QN2ZGVo", "copy", "copy-J8Qt_cc", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ColorOverrides {
        public static final int $stable = 0;
        private final Color complete;
        private final Color error;
        private final Color incomplete;
        private final Color ongoing;
        private final Color warning;

        public /* synthetic */ ColorOverrides(Color color, Color color2, Color color3, Color color4, Color color5, DefaultConstructorMarker defaultConstructorMarker) {
            this(color, color2, color3, color4, color5);
        }

        /* renamed from: copy-J8Qt_cc$default, reason: not valid java name */
        public static /* synthetic */ ColorOverrides m21062copyJ8Qt_cc$default(ColorOverrides colorOverrides, Color color, Color color2, Color color3, Color color4, Color color5, int i, Object obj) {
            if ((i & 1) != 0) {
                color = colorOverrides.incomplete;
            }
            if ((i & 2) != 0) {
                color2 = colorOverrides.complete;
            }
            if ((i & 4) != 0) {
                color3 = colorOverrides.error;
            }
            if ((i & 8) != 0) {
                color4 = colorOverrides.warning;
            }
            if ((i & 16) != 0) {
                color5 = colorOverrides.ongoing;
            }
            Color color6 = color5;
            Color color7 = color3;
            return colorOverrides.m21068copyJ8Qt_cc(color, color2, color7, color4, color6);
        }

        /* renamed from: component1-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getIncomplete() {
            return this.incomplete;
        }

        /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getComplete() {
            return this.complete;
        }

        /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getError() {
            return this.error;
        }

        /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getWarning() {
            return this.warning;
        }

        /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getOngoing() {
            return this.ongoing;
        }

        /* renamed from: copy-J8Qt_cc, reason: not valid java name */
        public final ColorOverrides m21068copyJ8Qt_cc(Color incomplete, Color complete, Color error, Color warning, Color ongoing) {
            return new ColorOverrides(incomplete, complete, error, warning, ongoing, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorOverrides)) {
                return false;
            }
            ColorOverrides colorOverrides = (ColorOverrides) other;
            return Intrinsics.areEqual(this.incomplete, colorOverrides.incomplete) && Intrinsics.areEqual(this.complete, colorOverrides.complete) && Intrinsics.areEqual(this.error, colorOverrides.error) && Intrinsics.areEqual(this.warning, colorOverrides.warning) && Intrinsics.areEqual(this.ongoing, colorOverrides.ongoing);
        }

        public int hashCode() {
            Color color = this.incomplete;
            int iM6713hashCodeimpl = (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue())) * 31;
            Color color2 = this.complete;
            int iM6713hashCodeimpl2 = (iM6713hashCodeimpl + (color2 == null ? 0 : Color.m6713hashCodeimpl(color2.getValue()))) * 31;
            Color color3 = this.error;
            int iM6713hashCodeimpl3 = (iM6713hashCodeimpl2 + (color3 == null ? 0 : Color.m6713hashCodeimpl(color3.getValue()))) * 31;
            Color color4 = this.warning;
            int iM6713hashCodeimpl4 = (iM6713hashCodeimpl3 + (color4 == null ? 0 : Color.m6713hashCodeimpl(color4.getValue()))) * 31;
            Color color5 = this.ongoing;
            return iM6713hashCodeimpl4 + (color5 != null ? Color.m6713hashCodeimpl(color5.getValue()) : 0);
        }

        public String toString() {
            return "ColorOverrides(incomplete=" + this.incomplete + ", complete=" + this.complete + ", error=" + this.error + ", warning=" + this.warning + ", ongoing=" + this.ongoing + ")";
        }

        private ColorOverrides(Color color, Color color2, Color color3, Color color4, Color color5) {
            this.incomplete = color;
            this.complete = color2;
            this.error = color3;
            this.warning = color4;
            this.ongoing = color5;
        }

        public /* synthetic */ ColorOverrides(Color color, Color color2, Color color3, Color color4, Color color5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : color, (i & 2) != 0 ? null : color2, (i & 4) != 0 ? null : color3, (i & 8) != 0 ? null : color4, (i & 16) != 0 ? null : color5, null);
        }

        /* renamed from: getIncomplete-QN2ZGVo, reason: not valid java name */
        public final Color m21071getIncompleteQN2ZGVo() {
            return this.incomplete;
        }

        /* renamed from: getComplete-QN2ZGVo, reason: not valid java name */
        public final Color m21069getCompleteQN2ZGVo() {
            return this.complete;
        }

        /* renamed from: getError-QN2ZGVo, reason: not valid java name */
        public final Color m21070getErrorQN2ZGVo() {
            return this.error;
        }

        /* renamed from: getWarning-QN2ZGVo, reason: not valid java name */
        public final Color m21073getWarningQN2ZGVo() {
            return this.warning;
        }

        /* renamed from: getOngoing-QN2ZGVo, reason: not valid java name */
        public final Color m21072getOngoingQN2ZGVo() {
            return this.ongoing;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "", "<init>", "(Ljava/lang/String;I)V", "INCOMPLETE", "ONGOING", "COMPLETE", "ERROR", "WARNING", "COMPLETE_GOLD", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status INCOMPLETE = new Status("INCOMPLETE", 0);
        public static final Status ONGOING = new Status("ONGOING", 1);
        public static final Status COMPLETE = new Status("COMPLETE", 2);
        public static final Status ERROR = new Status("ERROR", 3);
        public static final Status WARNING = new Status("WARNING", 4);
        public static final Status COMPLETE_GOLD = new Status("COMPLETE_GOLD", 5);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{INCOMPLETE, ONGOING, COMPLETE, ERROR, WARNING, COMPLETE_GOLD};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BETWEEN", "BOTTOM", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Position {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position TOP = new Position("TOP", 0);
        public static final Position BETWEEN = new Position("BETWEEN", 1);
        public static final Position BOTTOM = new Position("BOTTOM", 2);

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{TOP, BETWEEN, BOTTOM};
        }

        public static EnumEntries<Position> getEntries() {
            return $ENTRIES;
        }

        private Position(String str, int i) {
        }

        static {
            Position[] positionArr$values = $values();
            $VALUES = positionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(positionArr$values);
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$ColorType;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "TRANSPARENT", "BACKGROUND", "ERROR", "WARNING", "SPARKLE", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ColorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ColorType[] $VALUES;
        public static final ColorType ENABLED = new ColorType("ENABLED", 0);
        public static final ColorType DISABLED = new ColorType("DISABLED", 1);
        public static final ColorType TRANSPARENT = new ColorType("TRANSPARENT", 2);
        public static final ColorType BACKGROUND = new ColorType("BACKGROUND", 3);
        public static final ColorType ERROR = new ColorType("ERROR", 4);
        public static final ColorType WARNING = new ColorType("WARNING", 5);
        public static final ColorType SPARKLE = new ColorType("SPARKLE", 6);

        private static final /* synthetic */ ColorType[] $values() {
            return new ColorType[]{ENABLED, DISABLED, TRANSPARENT, BACKGROUND, ERROR, WARNING, SPARKLE};
        }

        public static EnumEntries<ColorType> getEntries() {
            return $ENTRIES;
        }

        private ColorType(String str, int i) {
        }

        static {
            ColorType[] colorTypeArr$values = $values();
            $VALUES = colorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(colorTypeArr$values);
        }

        public static ColorType valueOf(String str) {
            return (ColorType) Enum.valueOf(ColorType.class, str);
        }

        public static ColorType[] values() {
            return (ColorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DOT", "FILLED", "OUTLINE", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IconStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IconStyle[] $VALUES;
        public static final IconStyle DOT = new IconStyle("DOT", 0);
        public static final IconStyle FILLED = new IconStyle("FILLED", 1);
        public static final IconStyle OUTLINE = new IconStyle("OUTLINE", 2);

        private static final /* synthetic */ IconStyle[] $values() {
            return new IconStyle[]{DOT, FILLED, OUTLINE};
        }

        public static EnumEntries<IconStyle> getEntries() {
            return $ENTRIES;
        }

        private IconStyle(String str, int i) {
        }

        static {
            IconStyle[] iconStyleArr$values = $values();
            $VALUES = iconStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(iconStyleArr$values);
        }

        public static IconStyle valueOf(String str) {
            return (IconStyle) Enum.valueOf(IconStyle.class, str);
        }

        public static IconStyle[] values() {
            return (IconStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$IconPaddingPosition;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ABOVE", "BELOW", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IconPaddingPosition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IconPaddingPosition[] $VALUES;
        public static final IconPaddingPosition NONE = new IconPaddingPosition("NONE", 0);
        public static final IconPaddingPosition ABOVE = new IconPaddingPosition("ABOVE", 1);
        public static final IconPaddingPosition BELOW = new IconPaddingPosition("BELOW", 2);

        private static final /* synthetic */ IconPaddingPosition[] $values() {
            return new IconPaddingPosition[]{NONE, ABOVE, BELOW};
        }

        public static EnumEntries<IconPaddingPosition> getEntries() {
            return $ENTRIES;
        }

        private IconPaddingPosition(String str, int i) {
        }

        static {
            IconPaddingPosition[] iconPaddingPositionArr$values = $values();
            $VALUES = iconPaddingPositionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(iconPaddingPositionArr$values);
        }

        public static IconPaddingPosition valueOf(String str) {
            return (IconPaddingPosition) Enum.valueOf(IconPaddingPosition.class, str);
        }

        public static IconPaddingPosition[] values() {
            return (IconPaddingPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$InfoIconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "TITLE", "METADATA", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InfoIconPosition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoIconPosition[] $VALUES;
        public static final InfoIconPosition NONE = new InfoIconPosition("NONE", 0);
        public static final InfoIconPosition TITLE = new InfoIconPosition("TITLE", 1);
        public static final InfoIconPosition METADATA = new InfoIconPosition("METADATA", 2);

        private static final /* synthetic */ InfoIconPosition[] $values() {
            return new InfoIconPosition[]{NONE, TITLE, METADATA};
        }

        public static EnumEntries<InfoIconPosition> getEntries() {
            return $ENTRIES;
        }

        private InfoIconPosition(String str, int i) {
        }

        static {
            InfoIconPosition[] infoIconPositionArr$values = $values();
            $VALUES = infoIconPositionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoIconPositionArr$values);
        }

        public static InfoIconPosition valueOf(String str) {
            return (InfoIconPosition) Enum.valueOf(InfoIconPosition.class, str);
        }

        public static InfoIconPosition[] values() {
            return (InfoIconPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StatusIconPosition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusIconPosition[] $VALUES;
        public static final StatusIconPosition TOP = new StatusIconPosition("TOP", 0);
        public static final StatusIconPosition CENTER = new StatusIconPosition("CENTER", 1);

        private static final /* synthetic */ StatusIconPosition[] $values() {
            return new StatusIconPosition[]{TOP, CENTER};
        }

        public static EnumEntries<StatusIconPosition> getEntries() {
            return $ENTRIES;
        }

        private StatusIconPosition(String str, int i) {
        }

        static {
            StatusIconPosition[] statusIconPositionArr$values = $values();
            $VALUES = statusIconPositionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusIconPositionArr$values);
        }

        public static StatusIconPosition valueOf(String str) {
            return (StatusIconPosition) Enum.valueOf(StatusIconPosition.class, str);
        }

        public static StatusIconPosition[] values() {
            return (StatusIconPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$DetailContent;", "", "tertiaryText", "", "detailThumbnailImage", "detailThumbnailAction", "Lkotlin/Function0;", "", "showPlayButton", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V", "getTertiaryText", "()Ljava/lang/String;", "getDetailThumbnailImage", "getDetailThumbnailAction", "()Lkotlin/jvm/functions/Function0;", "getShowPlayButton", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DetailContent {
        public static final int $stable = 0;
        private final Function0<Unit> detailThumbnailAction;
        private final String detailThumbnailImage;
        private final boolean showPlayButton;
        private final String tertiaryText;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DetailContent copy$default(DetailContent detailContent, String str, String str2, Function0 function0, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = detailContent.tertiaryText;
            }
            if ((i & 2) != 0) {
                str2 = detailContent.detailThumbnailImage;
            }
            if ((i & 4) != 0) {
                function0 = detailContent.detailThumbnailAction;
            }
            if ((i & 8) != 0) {
                z = detailContent.showPlayButton;
            }
            return detailContent.copy(str, str2, function0, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTertiaryText() {
            return this.tertiaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDetailThumbnailImage() {
            return this.detailThumbnailImage;
        }

        public final Function0<Unit> component3() {
            return this.detailThumbnailAction;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowPlayButton() {
            return this.showPlayButton;
        }

        public final DetailContent copy(String tertiaryText, String detailThumbnailImage, Function0<Unit> detailThumbnailAction, boolean showPlayButton) {
            Intrinsics.checkNotNullParameter(tertiaryText, "tertiaryText");
            return new DetailContent(tertiaryText, detailThumbnailImage, detailThumbnailAction, showPlayButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DetailContent)) {
                return false;
            }
            DetailContent detailContent = (DetailContent) other;
            return Intrinsics.areEqual(this.tertiaryText, detailContent.tertiaryText) && Intrinsics.areEqual(this.detailThumbnailImage, detailContent.detailThumbnailImage) && Intrinsics.areEqual(this.detailThumbnailAction, detailContent.detailThumbnailAction) && this.showPlayButton == detailContent.showPlayButton;
        }

        public int hashCode() {
            int iHashCode = this.tertiaryText.hashCode() * 31;
            String str = this.detailThumbnailImage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Function0<Unit> function0 = this.detailThumbnailAction;
            return ((iHashCode2 + (function0 != null ? function0.hashCode() : 0)) * 31) + Boolean.hashCode(this.showPlayButton);
        }

        public String toString() {
            return "DetailContent(tertiaryText=" + this.tertiaryText + ", detailThumbnailImage=" + this.detailThumbnailImage + ", detailThumbnailAction=" + this.detailThumbnailAction + ", showPlayButton=" + this.showPlayButton + ")";
        }

        public DetailContent(String tertiaryText, String str, Function0<Unit> function0, boolean z) {
            Intrinsics.checkNotNullParameter(tertiaryText, "tertiaryText");
            this.tertiaryText = tertiaryText;
            this.detailThumbnailImage = str;
            this.detailThumbnailAction = function0;
            this.showPlayButton = z;
        }

        public /* synthetic */ DetailContent(String str, String str2, Function0 function0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? true : z);
        }

        public final String getTertiaryText() {
            return this.tertiaryText;
        }

        public final String getDetailThumbnailImage() {
            return this.detailThumbnailImage;
        }

        public final Function0<Unit> getDetailThumbnailAction() {
            return this.detailThumbnailAction;
        }

        public final boolean getShowPlayButton() {
            return this.showPlayButton;
        }
    }

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0011J0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\b\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Timeline$PrimaryTextStyleOverride;", "", "isBold", "", "enabledColor", "Landroidx/compose/ui/graphics/Color;", "disabledColor", "<init>", "(ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "()Z", "getEnabledColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getDisabledColor-QN2ZGVo", "component1", "component2", "component2-QN2ZGVo", "component3", "component3-QN2ZGVo", "copy", "copy-aroclsI", "equals", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PrimaryTextStyleOverride {
        public static final int $stable = 0;
        private final Color disabledColor;
        private final Color enabledColor;
        private final boolean isBold;

        public /* synthetic */ PrimaryTextStyleOverride(boolean z, Color color, Color color2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, color, color2);
        }

        /* renamed from: copy-aroclsI$default, reason: not valid java name */
        public static /* synthetic */ PrimaryTextStyleOverride m21074copyaroclsI$default(PrimaryTextStyleOverride primaryTextStyleOverride, boolean z, Color color, Color color2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = primaryTextStyleOverride.isBold;
            }
            if ((i & 2) != 0) {
                color = primaryTextStyleOverride.enabledColor;
            }
            if ((i & 4) != 0) {
                color2 = primaryTextStyleOverride.disabledColor;
            }
            return primaryTextStyleOverride.m21077copyaroclsI(z, color, color2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getEnabledColor() {
            return this.enabledColor;
        }

        /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getDisabledColor() {
            return this.disabledColor;
        }

        /* renamed from: copy-aroclsI, reason: not valid java name */
        public final PrimaryTextStyleOverride m21077copyaroclsI(boolean isBold, Color enabledColor, Color disabledColor) {
            return new PrimaryTextStyleOverride(isBold, enabledColor, disabledColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryTextStyleOverride)) {
                return false;
            }
            PrimaryTextStyleOverride primaryTextStyleOverride = (PrimaryTextStyleOverride) other;
            return this.isBold == primaryTextStyleOverride.isBold && Intrinsics.areEqual(this.enabledColor, primaryTextStyleOverride.enabledColor) && Intrinsics.areEqual(this.disabledColor, primaryTextStyleOverride.disabledColor);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isBold) * 31;
            Color color = this.enabledColor;
            int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
            Color color2 = this.disabledColor;
            return iM6713hashCodeimpl + (color2 != null ? Color.m6713hashCodeimpl(color2.getValue()) : 0);
        }

        public String toString() {
            return "PrimaryTextStyleOverride(isBold=" + this.isBold + ", enabledColor=" + this.enabledColor + ", disabledColor=" + this.disabledColor + ")";
        }

        private PrimaryTextStyleOverride(boolean z, Color color, Color color2) {
            this.isBold = z;
            this.enabledColor = color;
            this.disabledColor = color2;
        }

        public /* synthetic */ PrimaryTextStyleOverride(boolean z, Color color, Color color2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : color, (i & 4) != 0 ? null : color2, null);
        }

        public final boolean isBold() {
            return this.isBold;
        }

        /* renamed from: getEnabledColor-QN2ZGVo, reason: not valid java name */
        public final Color m21079getEnabledColorQN2ZGVo() {
            return this.enabledColor;
        }

        /* renamed from: getDisabledColor-QN2ZGVo, reason: not valid java name */
        public final Color m21078getDisabledColorQN2ZGVo() {
            return this.disabledColor;
        }
    }

    public final Position getPositionFromIndex(int index, int numRows) {
        if (index == 0) {
            return Position.TOP;
        }
        if (index == numRows - 1) {
            return Position.BOTTOM;
        }
        return Position.BETWEEN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorType getConnectorColor(Status status) {
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return ColorType.DISABLED;
        }
        if (i == 4) {
            return ColorType.SPARKLE;
        }
        return ColorType.ENABLED;
    }
}
