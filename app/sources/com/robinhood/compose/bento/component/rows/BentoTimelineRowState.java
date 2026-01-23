package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoTimelineRow.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0012\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020\u0012\u0012\b\b\u0002\u0010#\u001a\u00020\u0012\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0012HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\bZJ\u000b\u0010[\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010\\\u001a\u00020\u001aHÆ\u0003J\t\u0010]\u001a\u00020\u0012HÆ\u0003J\t\u0010^\u001a\u00020\u0012HÆ\u0003J\t\u0010_\u001a\u00020\u001eHÆ\u0003J\t\u0010`\u001a\u00020\u0012HÆ\u0003J\t\u0010a\u001a\u00020\u001eHÆ\u0003J\t\u0010b\u001a\u00020\u0012HÆ\u0003J\t\u0010c\u001a\u00020\u0012HÆ\u0003J\t\u0010d\u001a\u00020\u0012HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010'HÆ\u0003J\u0094\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'HÆ\u0001¢\u0006\u0002\bhJ\u0013\u0010i\u001a\u00020\u00122\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\u001eHÖ\u0001J\t\u0010l\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010:R\u0011\u0010\u001c\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010:R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u0011\u0010 \u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0011\u0010!\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bG\u0010:R\u0011\u0010\"\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bH\u0010:R\u0011\u0010#\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bL\u0010M¨\u0006m"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;", "", "status", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "position", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "titleText", "", "infoAction", "Lcom/robinhood/compose/bento/component/rows/Timeline$InfoAction;", "timestampText", "metadataText", "ctaButton", "Lcom/robinhood/compose/bento/component/rows/Timeline$CtaButton;", "colorOverrides", "Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;", "previousStatus", "supportMultipleLines", "", "iconOverride", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "iconColorOverride", "Landroidx/compose/ui/graphics/Color;", "iconStyleOverride", "Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;", "statusIconPosition", "Lcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;", "isActiveEntry", "isLargeIconContainer", "maxLines", "", "animateEntry", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "showTitlePlaceholder", "showMetadataPlaceholder", "showTimelinePlaceholder", "detailContent", "Lcom/robinhood/compose/bento/component/rows/Timeline$DetailContent;", "primaryTextStyleOverride", "Lcom/robinhood/compose/bento/component/rows/Timeline$PrimaryTextStyleOverride;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/Timeline$Status;Lcom/robinhood/compose/bento/component/rows/Timeline$Position;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/Timeline$InfoAction;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/Timeline$CtaButton;Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;Lcom/robinhood/compose/bento/component/rows/Timeline$Status;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;Lcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;ZZIZIZZZLcom/robinhood/compose/bento/component/rows/Timeline$DetailContent;Lcom/robinhood/compose/bento/component/rows/Timeline$PrimaryTextStyleOverride;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStatus", "()Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "getPosition", "()Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "getTitleText", "()Ljava/lang/String;", "getInfoAction", "()Lcom/robinhood/compose/bento/component/rows/Timeline$InfoAction;", "getTimestampText", "getMetadataText", "getCtaButton", "()Lcom/robinhood/compose/bento/component/rows/Timeline$CtaButton;", "getColorOverrides", "()Lcom/robinhood/compose/bento/component/rows/Timeline$ColorOverrides;", "getPreviousStatus", "getSupportMultipleLines", "()Z", "getIconOverride", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIconColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getIconStyleOverride", "()Lcom/robinhood/compose/bento/component/rows/Timeline$IconStyle;", "getStatusIconPosition", "()Lcom/robinhood/compose/bento/component/rows/Timeline$StatusIconPosition;", "getMaxLines", "()I", "getAnimateEntry", "getIndex", "getShowTitlePlaceholder", "getShowMetadataPlaceholder", "getShowTimelinePlaceholder", "getDetailContent", "()Lcom/robinhood/compose/bento/component/rows/Timeline$DetailContent;", "getPrimaryTextStyleOverride", "()Lcom/robinhood/compose/bento/component/rows/Timeline$PrimaryTextStyleOverride;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component12-QN2ZGVo", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "copy-xc7CsRM", "equals", "other", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoTimelineRowState {
    public static final int $stable = 0;
    private final boolean animateEntry;
    private final Timeline.ColorOverrides colorOverrides;
    private final Timeline.CtaButton ctaButton;
    private final Timeline.DetailContent detailContent;
    private final Color iconColorOverride;
    private final ServerToBentoAssetMapper2 iconOverride;
    private final Timeline.IconStyle iconStyleOverride;
    private final int index;
    private final Timeline.InfoAction infoAction;
    private final boolean isActiveEntry;
    private final boolean isLargeIconContainer;
    private final int maxLines;
    private final String metadataText;
    private final Timeline.Position position;
    private final Timeline.Status previousStatus;
    private final Timeline.PrimaryTextStyleOverride primaryTextStyleOverride;
    private final boolean showMetadataPlaceholder;
    private final boolean showTimelinePlaceholder;
    private final boolean showTitlePlaceholder;
    private final Timeline.Status status;
    private final Timeline.StatusIconPosition statusIconPosition;
    private final boolean supportMultipleLines;
    private final String timestampText;
    private final String titleText;

    public /* synthetic */ BentoTimelineRowState(Timeline.Status status, Timeline.Position position, String str, Timeline.InfoAction infoAction, String str2, String str3, Timeline.CtaButton ctaButton, Timeline.ColorOverrides colorOverrides, Timeline.Status status2, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, Timeline.IconStyle iconStyle, Timeline.StatusIconPosition statusIconPosition, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, boolean z7, Timeline.DetailContent detailContent, Timeline.PrimaryTextStyleOverride primaryTextStyleOverride, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, position, str, infoAction, str2, str3, ctaButton, colorOverrides, status2, z, serverToBentoAssetMapper2, color, iconStyle, statusIconPosition, z2, z3, i, z4, i2, z5, z6, z7, detailContent, primaryTextStyleOverride);
    }

    /* renamed from: copy-xc7CsRM$default, reason: not valid java name */
    public static /* synthetic */ BentoTimelineRowState m21002copyxc7CsRM$default(BentoTimelineRowState bentoTimelineRowState, Timeline.Status status, Timeline.Position position, String str, Timeline.InfoAction infoAction, String str2, String str3, Timeline.CtaButton ctaButton, Timeline.ColorOverrides colorOverrides, Timeline.Status status2, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, Timeline.IconStyle iconStyle, Timeline.StatusIconPosition statusIconPosition, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, boolean z7, Timeline.DetailContent detailContent, Timeline.PrimaryTextStyleOverride primaryTextStyleOverride, int i3, Object obj) {
        Timeline.PrimaryTextStyleOverride primaryTextStyleOverride2;
        Timeline.DetailContent detailContent2;
        Timeline.Status status3 = (i3 & 1) != 0 ? bentoTimelineRowState.status : status;
        Timeline.Position position2 = (i3 & 2) != 0 ? bentoTimelineRowState.position : position;
        String str4 = (i3 & 4) != 0 ? bentoTimelineRowState.titleText : str;
        Timeline.InfoAction infoAction2 = (i3 & 8) != 0 ? bentoTimelineRowState.infoAction : infoAction;
        String str5 = (i3 & 16) != 0 ? bentoTimelineRowState.timestampText : str2;
        String str6 = (i3 & 32) != 0 ? bentoTimelineRowState.metadataText : str3;
        Timeline.CtaButton ctaButton2 = (i3 & 64) != 0 ? bentoTimelineRowState.ctaButton : ctaButton;
        Timeline.ColorOverrides colorOverrides2 = (i3 & 128) != 0 ? bentoTimelineRowState.colorOverrides : colorOverrides;
        Timeline.Status status4 = (i3 & 256) != 0 ? bentoTimelineRowState.previousStatus : status2;
        boolean z8 = (i3 & 512) != 0 ? bentoTimelineRowState.supportMultipleLines : z;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = (i3 & 1024) != 0 ? bentoTimelineRowState.iconOverride : serverToBentoAssetMapper2;
        Color color2 = (i3 & 2048) != 0 ? bentoTimelineRowState.iconColorOverride : color;
        Timeline.IconStyle iconStyle2 = (i3 & 4096) != 0 ? bentoTimelineRowState.iconStyleOverride : iconStyle;
        Timeline.StatusIconPosition statusIconPosition2 = (i3 & 8192) != 0 ? bentoTimelineRowState.statusIconPosition : statusIconPosition;
        Timeline.Status status5 = status3;
        boolean z9 = (i3 & 16384) != 0 ? bentoTimelineRowState.isActiveEntry : z2;
        boolean z10 = (i3 & 32768) != 0 ? bentoTimelineRowState.isLargeIconContainer : z3;
        int i4 = (i3 & 65536) != 0 ? bentoTimelineRowState.maxLines : i;
        boolean z11 = (i3 & 131072) != 0 ? bentoTimelineRowState.animateEntry : z4;
        int i5 = (i3 & 262144) != 0 ? bentoTimelineRowState.index : i2;
        boolean z12 = (i3 & 524288) != 0 ? bentoTimelineRowState.showTitlePlaceholder : z5;
        boolean z13 = (i3 & 1048576) != 0 ? bentoTimelineRowState.showMetadataPlaceholder : z6;
        boolean z14 = (i3 & 2097152) != 0 ? bentoTimelineRowState.showTimelinePlaceholder : z7;
        Timeline.DetailContent detailContent3 = (i3 & 4194304) != 0 ? bentoTimelineRowState.detailContent : detailContent;
        if ((i3 & 8388608) != 0) {
            detailContent2 = detailContent3;
            primaryTextStyleOverride2 = bentoTimelineRowState.primaryTextStyleOverride;
        } else {
            primaryTextStyleOverride2 = primaryTextStyleOverride;
            detailContent2 = detailContent3;
        }
        return bentoTimelineRowState.m21004copyxc7CsRM(status5, position2, str4, infoAction2, str5, str6, ctaButton2, colorOverrides2, status4, z8, serverToBentoAssetMapper22, color2, iconStyle2, statusIconPosition2, z9, z10, i4, z11, i5, z12, z13, z14, detailContent2, primaryTextStyleOverride2);
    }

    /* renamed from: component1, reason: from getter */
    public final Timeline.Status getStatus() {
        return this.status;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSupportMultipleLines() {
        return this.supportMultipleLines;
    }

    /* renamed from: component11, reason: from getter */
    public final ServerToBentoAssetMapper2 getIconOverride() {
        return this.iconOverride;
    }

    /* renamed from: component12-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getIconColorOverride() {
        return this.iconColorOverride;
    }

    /* renamed from: component13, reason: from getter */
    public final Timeline.IconStyle getIconStyleOverride() {
        return this.iconStyleOverride;
    }

    /* renamed from: component14, reason: from getter */
    public final Timeline.StatusIconPosition getStatusIconPosition() {
        return this.statusIconPosition;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsActiveEntry() {
        return this.isActiveEntry;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsLargeIconContainer() {
        return this.isLargeIconContainer;
    }

    /* renamed from: component17, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getAnimateEntry() {
        return this.animateEntry;
    }

    /* renamed from: component19, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final Timeline.Position getPosition() {
        return this.position;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getShowTitlePlaceholder() {
        return this.showTitlePlaceholder;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getShowMetadataPlaceholder() {
        return this.showMetadataPlaceholder;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getShowTimelinePlaceholder() {
        return this.showTimelinePlaceholder;
    }

    /* renamed from: component23, reason: from getter */
    public final Timeline.DetailContent getDetailContent() {
        return this.detailContent;
    }

    /* renamed from: component24, reason: from getter */
    public final Timeline.PrimaryTextStyleOverride getPrimaryTextStyleOverride() {
        return this.primaryTextStyleOverride;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: component4, reason: from getter */
    public final Timeline.InfoAction getInfoAction() {
        return this.infoAction;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTimestampText() {
        return this.timestampText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetadataText() {
        return this.metadataText;
    }

    /* renamed from: component7, reason: from getter */
    public final Timeline.CtaButton getCtaButton() {
        return this.ctaButton;
    }

    /* renamed from: component8, reason: from getter */
    public final Timeline.ColorOverrides getColorOverrides() {
        return this.colorOverrides;
    }

    /* renamed from: component9, reason: from getter */
    public final Timeline.Status getPreviousStatus() {
        return this.previousStatus;
    }

    /* renamed from: copy-xc7CsRM, reason: not valid java name */
    public final BentoTimelineRowState m21004copyxc7CsRM(Timeline.Status status, Timeline.Position position, String titleText, Timeline.InfoAction infoAction, String timestampText, String metadataText, Timeline.CtaButton ctaButton, Timeline.ColorOverrides colorOverrides, Timeline.Status previousStatus, boolean supportMultipleLines, ServerToBentoAssetMapper2 iconOverride, Color iconColorOverride, Timeline.IconStyle iconStyleOverride, Timeline.StatusIconPosition statusIconPosition, boolean isActiveEntry, boolean isLargeIconContainer, int maxLines, boolean animateEntry, int index, boolean showTitlePlaceholder, boolean showMetadataPlaceholder, boolean showTimelinePlaceholder, Timeline.DetailContent detailContent, Timeline.PrimaryTextStyleOverride primaryTextStyleOverride) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(statusIconPosition, "statusIconPosition");
        return new BentoTimelineRowState(status, position, titleText, infoAction, timestampText, metadataText, ctaButton, colorOverrides, previousStatus, supportMultipleLines, iconOverride, iconColorOverride, iconStyleOverride, statusIconPosition, isActiveEntry, isLargeIconContainer, maxLines, animateEntry, index, showTitlePlaceholder, showMetadataPlaceholder, showTimelinePlaceholder, detailContent, primaryTextStyleOverride, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoTimelineRowState)) {
            return false;
        }
        BentoTimelineRowState bentoTimelineRowState = (BentoTimelineRowState) other;
        return this.status == bentoTimelineRowState.status && this.position == bentoTimelineRowState.position && Intrinsics.areEqual(this.titleText, bentoTimelineRowState.titleText) && Intrinsics.areEqual(this.infoAction, bentoTimelineRowState.infoAction) && Intrinsics.areEqual(this.timestampText, bentoTimelineRowState.timestampText) && Intrinsics.areEqual(this.metadataText, bentoTimelineRowState.metadataText) && Intrinsics.areEqual(this.ctaButton, bentoTimelineRowState.ctaButton) && Intrinsics.areEqual(this.colorOverrides, bentoTimelineRowState.colorOverrides) && this.previousStatus == bentoTimelineRowState.previousStatus && this.supportMultipleLines == bentoTimelineRowState.supportMultipleLines && this.iconOverride == bentoTimelineRowState.iconOverride && Intrinsics.areEqual(this.iconColorOverride, bentoTimelineRowState.iconColorOverride) && this.iconStyleOverride == bentoTimelineRowState.iconStyleOverride && this.statusIconPosition == bentoTimelineRowState.statusIconPosition && this.isActiveEntry == bentoTimelineRowState.isActiveEntry && this.isLargeIconContainer == bentoTimelineRowState.isLargeIconContainer && this.maxLines == bentoTimelineRowState.maxLines && this.animateEntry == bentoTimelineRowState.animateEntry && this.index == bentoTimelineRowState.index && this.showTitlePlaceholder == bentoTimelineRowState.showTitlePlaceholder && this.showMetadataPlaceholder == bentoTimelineRowState.showMetadataPlaceholder && this.showTimelinePlaceholder == bentoTimelineRowState.showTimelinePlaceholder && Intrinsics.areEqual(this.detailContent, bentoTimelineRowState.detailContent) && Intrinsics.areEqual(this.primaryTextStyleOverride, bentoTimelineRowState.primaryTextStyleOverride);
    }

    public int hashCode() {
        int iHashCode = ((((this.status.hashCode() * 31) + this.position.hashCode()) * 31) + this.titleText.hashCode()) * 31;
        Timeline.InfoAction infoAction = this.infoAction;
        int iHashCode2 = (iHashCode + (infoAction == null ? 0 : infoAction.hashCode())) * 31;
        String str = this.timestampText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metadataText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Timeline.CtaButton ctaButton = this.ctaButton;
        int iHashCode5 = (iHashCode4 + (ctaButton == null ? 0 : ctaButton.hashCode())) * 31;
        Timeline.ColorOverrides colorOverrides = this.colorOverrides;
        int iHashCode6 = (iHashCode5 + (colorOverrides == null ? 0 : colorOverrides.hashCode())) * 31;
        Timeline.Status status = this.previousStatus;
        int iHashCode7 = (((iHashCode6 + (status == null ? 0 : status.hashCode())) * 31) + Boolean.hashCode(this.supportMultipleLines)) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.iconOverride;
        int iHashCode8 = (iHashCode7 + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31;
        Color color = this.iconColorOverride;
        int iM6713hashCodeimpl = (iHashCode8 + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
        Timeline.IconStyle iconStyle = this.iconStyleOverride;
        int iHashCode9 = (((((((((((((((((((iM6713hashCodeimpl + (iconStyle == null ? 0 : iconStyle.hashCode())) * 31) + this.statusIconPosition.hashCode()) * 31) + Boolean.hashCode(this.isActiveEntry)) * 31) + Boolean.hashCode(this.isLargeIconContainer)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Boolean.hashCode(this.animateEntry)) * 31) + Integer.hashCode(this.index)) * 31) + Boolean.hashCode(this.showTitlePlaceholder)) * 31) + Boolean.hashCode(this.showMetadataPlaceholder)) * 31) + Boolean.hashCode(this.showTimelinePlaceholder)) * 31;
        Timeline.DetailContent detailContent = this.detailContent;
        int iHashCode10 = (iHashCode9 + (detailContent == null ? 0 : detailContent.hashCode())) * 31;
        Timeline.PrimaryTextStyleOverride primaryTextStyleOverride = this.primaryTextStyleOverride;
        return iHashCode10 + (primaryTextStyleOverride != null ? primaryTextStyleOverride.hashCode() : 0);
    }

    public String toString() {
        return "BentoTimelineRowState(status=" + this.status + ", position=" + this.position + ", titleText=" + this.titleText + ", infoAction=" + this.infoAction + ", timestampText=" + this.timestampText + ", metadataText=" + this.metadataText + ", ctaButton=" + this.ctaButton + ", colorOverrides=" + this.colorOverrides + ", previousStatus=" + this.previousStatus + ", supportMultipleLines=" + this.supportMultipleLines + ", iconOverride=" + this.iconOverride + ", iconColorOverride=" + this.iconColorOverride + ", iconStyleOverride=" + this.iconStyleOverride + ", statusIconPosition=" + this.statusIconPosition + ", isActiveEntry=" + this.isActiveEntry + ", isLargeIconContainer=" + this.isLargeIconContainer + ", maxLines=" + this.maxLines + ", animateEntry=" + this.animateEntry + ", index=" + this.index + ", showTitlePlaceholder=" + this.showTitlePlaceholder + ", showMetadataPlaceholder=" + this.showMetadataPlaceholder + ", showTimelinePlaceholder=" + this.showTimelinePlaceholder + ", detailContent=" + this.detailContent + ", primaryTextStyleOverride=" + this.primaryTextStyleOverride + ")";
    }

    private BentoTimelineRowState(Timeline.Status status, Timeline.Position position, String titleText, Timeline.InfoAction infoAction, String str, String str2, Timeline.CtaButton ctaButton, Timeline.ColorOverrides colorOverrides, Timeline.Status status2, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, Timeline.IconStyle iconStyle, Timeline.StatusIconPosition statusIconPosition, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, boolean z7, Timeline.DetailContent detailContent, Timeline.PrimaryTextStyleOverride primaryTextStyleOverride) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(statusIconPosition, "statusIconPosition");
        this.status = status;
        this.position = position;
        this.titleText = titleText;
        this.infoAction = infoAction;
        this.timestampText = str;
        this.metadataText = str2;
        this.ctaButton = ctaButton;
        this.colorOverrides = colorOverrides;
        this.previousStatus = status2;
        this.supportMultipleLines = z;
        this.iconOverride = serverToBentoAssetMapper2;
        this.iconColorOverride = color;
        this.iconStyleOverride = iconStyle;
        this.statusIconPosition = statusIconPosition;
        this.isActiveEntry = z2;
        this.isLargeIconContainer = z3;
        this.maxLines = i;
        this.animateEntry = z4;
        this.index = i2;
        this.showTitlePlaceholder = z5;
        this.showMetadataPlaceholder = z6;
        this.showTimelinePlaceholder = z7;
        this.detailContent = detailContent;
        this.primaryTextStyleOverride = primaryTextStyleOverride;
    }

    public final Timeline.Status getStatus() {
        return this.status;
    }

    public final Timeline.Position getPosition() {
        return this.position;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Timeline.InfoAction getInfoAction() {
        return this.infoAction;
    }

    public final String getTimestampText() {
        return this.timestampText;
    }

    public final String getMetadataText() {
        return this.metadataText;
    }

    public final Timeline.CtaButton getCtaButton() {
        return this.ctaButton;
    }

    public final Timeline.ColorOverrides getColorOverrides() {
        return this.colorOverrides;
    }

    public final Timeline.Status getPreviousStatus() {
        return this.previousStatus;
    }

    public final boolean getSupportMultipleLines() {
        return this.supportMultipleLines;
    }

    public final ServerToBentoAssetMapper2 getIconOverride() {
        return this.iconOverride;
    }

    /* renamed from: getIconColorOverride-QN2ZGVo, reason: not valid java name */
    public final Color m21005getIconColorOverrideQN2ZGVo() {
        return this.iconColorOverride;
    }

    public final Timeline.IconStyle getIconStyleOverride() {
        return this.iconStyleOverride;
    }

    public /* synthetic */ BentoTimelineRowState(Timeline.Status status, Timeline.Position position, String str, Timeline.InfoAction infoAction, String str2, String str3, Timeline.CtaButton ctaButton, Timeline.ColorOverrides colorOverrides, Timeline.Status status2, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, Timeline.IconStyle iconStyle, Timeline.StatusIconPosition statusIconPosition, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, boolean z7, Timeline.DetailContent detailContent, Timeline.PrimaryTextStyleOverride primaryTextStyleOverride, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, position, str, (i3 & 8) != 0 ? null : infoAction, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : ctaButton, (i3 & 128) != 0 ? null : colorOverrides, (i3 & 256) != 0 ? null : status2, (i3 & 512) != 0 ? false : z, (i3 & 1024) != 0 ? null : serverToBentoAssetMapper2, (i3 & 2048) != 0 ? null : color, (i3 & 4096) != 0 ? null : iconStyle, (i3 & 8192) != 0 ? Timeline.StatusIconPosition.CENTER : statusIconPosition, (i3 & 16384) != 0 ? false : z2, (32768 & i3) != 0 ? false : z3, (65536 & i3) != 0 ? 1 : i, (131072 & i3) != 0 ? false : z4, (262144 & i3) != 0 ? 0 : i2, (524288 & i3) != 0 ? false : z5, (1048576 & i3) != 0 ? false : z6, (2097152 & i3) != 0 ? false : z7, (4194304 & i3) != 0 ? null : detailContent, (i3 & 8388608) != 0 ? null : primaryTextStyleOverride, null);
    }

    public final Timeline.StatusIconPosition getStatusIconPosition() {
        return this.statusIconPosition;
    }

    public final boolean isActiveEntry() {
        return this.isActiveEntry;
    }

    public final boolean isLargeIconContainer() {
        return this.isLargeIconContainer;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final boolean getAnimateEntry() {
        return this.animateEntry;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean getShowTitlePlaceholder() {
        return this.showTitlePlaceholder;
    }

    public final boolean getShowMetadataPlaceholder() {
        return this.showMetadataPlaceholder;
    }

    public final boolean getShowTimelinePlaceholder() {
        return this.showTimelinePlaceholder;
    }

    public final Timeline.DetailContent getDetailContent() {
        return this.detailContent;
    }

    public final Timeline.PrimaryTextStyleOverride getPrimaryTextStyleOverride() {
        return this.primaryTextStyleOverride;
    }
}
