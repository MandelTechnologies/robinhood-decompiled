package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.InfoBannerStyle;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003Jk\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InfoBannerViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "receiptUuid", "Ljava/util/UUID;", "text", "Lcom/robinhood/models/serverdriven/db/RichText;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "ctaText", "", "ctaAction", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "canDismiss", "", ResourceTypes.STYLE, "Lcom/robinhood/models/serverdriven/db/InfoBannerStyle;", "loggingIdentifier", "location", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/GenericAction;ZLcom/robinhood/models/serverdriven/db/InfoBannerStyle;Ljava/lang/String;Lcom/robinhood/models/db/IacInfoBannerLocation;)V", "infoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "(Lcom/robinhood/models/db/IacInfoBanner;)V", "getReceiptUuid", "()Ljava/util/UUID;", "getText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getCtaText", "()Ljava/lang/String;", "getCtaAction", "()Lcom/robinhood/models/serverdriven/db/GenericAction;", "getCanDismiss", "()Z", "getStyle", "()Lcom/robinhood/models/serverdriven/db/InfoBannerStyle;", "getLoggingIdentifier", "getLocation", "()Lcom/robinhood/models/db/IacInfoBannerLocation;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoBannerViewData extends DetailData {
    public static final int $stable = 8;
    private final boolean canDismiss;
    private final GenericAction ctaAction;
    private final String ctaText;
    private final ServerToBentoAssetMapper2 icon;
    private final IacInfoBannerLocation location;
    private final String loggingIdentifier;
    private final UUID receiptUuid;
    private final ApiStockDetail.Section section;
    private final InfoBannerStyle style;
    private final RichText text;

    public static /* synthetic */ InfoBannerViewData copy$default(InfoBannerViewData infoBannerViewData, UUID uuid, RichText richText, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, GenericAction genericAction, boolean z, InfoBannerStyle infoBannerStyle, String str2, IacInfoBannerLocation iacInfoBannerLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = infoBannerViewData.receiptUuid;
        }
        if ((i & 2) != 0) {
            richText = infoBannerViewData.text;
        }
        if ((i & 4) != 0) {
            serverToBentoAssetMapper2 = infoBannerViewData.icon;
        }
        if ((i & 8) != 0) {
            str = infoBannerViewData.ctaText;
        }
        if ((i & 16) != 0) {
            genericAction = infoBannerViewData.ctaAction;
        }
        if ((i & 32) != 0) {
            z = infoBannerViewData.canDismiss;
        }
        if ((i & 64) != 0) {
            infoBannerStyle = infoBannerViewData.style;
        }
        if ((i & 128) != 0) {
            str2 = infoBannerViewData.loggingIdentifier;
        }
        if ((i & 256) != 0) {
            iacInfoBannerLocation = infoBannerViewData.location;
        }
        String str3 = str2;
        IacInfoBannerLocation iacInfoBannerLocation2 = iacInfoBannerLocation;
        boolean z2 = z;
        InfoBannerStyle infoBannerStyle2 = infoBannerStyle;
        GenericAction genericAction2 = genericAction;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
        return infoBannerViewData.copy(uuid, richText, serverToBentoAssetMapper22, str, genericAction2, z2, infoBannerStyle2, str3, iacInfoBannerLocation2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getReceiptUuid() {
        return this.receiptUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final RichText getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component5, reason: from getter */
    public final GenericAction getCtaAction() {
        return this.ctaAction;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCanDismiss() {
        return this.canDismiss;
    }

    /* renamed from: component7, reason: from getter */
    public final InfoBannerStyle getStyle() {
        return this.style;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component9, reason: from getter */
    public final IacInfoBannerLocation getLocation() {
        return this.location;
    }

    public final InfoBannerViewData copy(UUID receiptUuid, RichText text, ServerToBentoAssetMapper2 icon, String ctaText, GenericAction ctaAction, boolean canDismiss, InfoBannerStyle style, String loggingIdentifier, IacInfoBannerLocation location) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(location, "location");
        return new InfoBannerViewData(receiptUuid, text, icon, ctaText, ctaAction, canDismiss, style, loggingIdentifier, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoBannerViewData)) {
            return false;
        }
        InfoBannerViewData infoBannerViewData = (InfoBannerViewData) other;
        return Intrinsics.areEqual(this.receiptUuid, infoBannerViewData.receiptUuid) && Intrinsics.areEqual(this.text, infoBannerViewData.text) && this.icon == infoBannerViewData.icon && Intrinsics.areEqual(this.ctaText, infoBannerViewData.ctaText) && Intrinsics.areEqual(this.ctaAction, infoBannerViewData.ctaAction) && this.canDismiss == infoBannerViewData.canDismiss && Intrinsics.areEqual(this.style, infoBannerViewData.style) && Intrinsics.areEqual(this.loggingIdentifier, infoBannerViewData.loggingIdentifier) && this.location == infoBannerViewData.location;
    }

    public int hashCode() {
        int iHashCode = ((this.receiptUuid.hashCode() * 31) + this.text.hashCode()) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        int iHashCode2 = (iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31;
        String str = this.ctaText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        GenericAction genericAction = this.ctaAction;
        int iHashCode4 = (((((iHashCode3 + (genericAction == null ? 0 : genericAction.hashCode())) * 31) + Boolean.hashCode(this.canDismiss)) * 31) + this.style.hashCode()) * 31;
        String str2 = this.loggingIdentifier;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.location.hashCode();
    }

    public String toString() {
        return "InfoBannerViewData(receiptUuid=" + this.receiptUuid + ", text=" + this.text + ", icon=" + this.icon + ", ctaText=" + this.ctaText + ", ctaAction=" + this.ctaAction + ", canDismiss=" + this.canDismiss + ", style=" + this.style + ", loggingIdentifier=" + this.loggingIdentifier + ", location=" + this.location + ")";
    }

    public final UUID getReceiptUuid() {
        return this.receiptUuid;
    }

    public final RichText getText() {
        return this.text;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final GenericAction getCtaAction() {
        return this.ctaAction;
    }

    public final boolean getCanDismiss() {
        return this.canDismiss;
    }

    public final InfoBannerStyle getStyle() {
        return this.style;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final IacInfoBannerLocation getLocation() {
        return this.location;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoBannerViewData(UUID receiptUuid, RichText text, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, GenericAction genericAction, boolean z, InfoBannerStyle style, String str2, IacInfoBannerLocation location) {
        super(null);
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(location, "location");
        this.receiptUuid = receiptUuid;
        this.text = text;
        this.icon = serverToBentoAssetMapper2;
        this.ctaText = str;
        this.ctaAction = genericAction;
        this.canDismiss = z;
        this.style = style;
        this.loggingIdentifier = str2;
        this.location = location;
        this.section = ApiStockDetail.Section.IN_APP_COMMS;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoBannerViewData(IacInfoBanner infoBanner) {
        this(infoBanner.getReceiptUuid(), infoBanner.getText(), infoBanner.getIcon(), infoBanner.getCtaText(), infoBanner.getCtaAction(), infoBanner.getCanDismiss(), infoBanner.getStyle(), infoBanner.getLoggingIdentifier(), infoBanner.getLocation());
        Intrinsics.checkNotNullParameter(infoBanner, "infoBanner");
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }
}
