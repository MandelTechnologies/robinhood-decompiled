package com.robinhood.android.history.p153ui.acats;

import android.text.Spanned;
import com.robinhood.android.history.p153ui.AcatsInDetailBannerView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0\nHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010A\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001dHÆ\u0003JÊ\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\u00052\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020MHÖ\u0001J\t\u0010N\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailViewState;", "", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "isLoading", "", "titleText", "", "subtitleText", "timelineRows", "", "Lcom/robinhood/models/serverdriven/db/TimelineRow;", "detailRows", "Lcom/robinhood/models/serverdriven/db/StandardRow;", "footerButtons", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "dividerData", "", "bannerData", "Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$BannerViewData;", "showHelpIcon", "helpIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "alertSheetTitle", "alertSheetContentMarkdown", "Landroid/text/Spanned;", "alertSheetButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "goldDepositBoost", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/Unit;Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$BannerViewData;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Landroid/text/Spanned;Lcom/robinhood/models/serverdriven/db/GenericButton;Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;)V", "getAcatsTransfer", "()Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "()Z", "getTitleText", "()Ljava/lang/String;", "getSubtitleText", "getTimelineRows", "()Ljava/util/List;", "getDetailRows", "getFooterButtons", "getDividerData", "()Lkotlin/Unit;", "Lkotlin/Unit;", "getBannerData", "()Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$BannerViewData;", "getShowHelpIcon", "getHelpIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getAlertSheetTitle", "getAlertSheetContentMarkdown", "()Landroid/text/Spanned;", "getAlertSheetButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "getGoldDepositBoost", "()Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/Unit;Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$BannerViewData;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Landroid/text/Spanned;Lcom/robinhood/models/serverdriven/db/GenericButton;Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;)Lcom/robinhood/android/history/ui/acats/AcatsDetailViewState;", "equals", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AcatsDetailViewState {
    public static final int $stable = 8;
    private final AcatsTransfer acatsTransfer;
    private final GenericButton alertSheetButton;
    private final Spanned alertSheetContentMarkdown;
    private final String alertSheetTitle;
    private final AcatsInDetailBannerView.BannerViewData bannerData;
    private final List<StandardRow> detailRows;
    private final Unit dividerData;
    private final List<ServerDrivenButton> footerButtons;
    private final GoldDepositBoostTransferDetail goldDepositBoost;
    private final ServerToBentoAssetMapper2 helpIcon;
    private final boolean isLoading;
    private final boolean showHelpIcon;
    private final String subtitleText;
    private final List<TimelineRow> timelineRows;
    private final String titleText;

    public AcatsDetailViewState() {
        this(null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, 32767, null);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsTransfer getAcatsTransfer() {
        return this.acatsTransfer;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowHelpIcon() {
        return this.showHelpIcon;
    }

    /* renamed from: component11, reason: from getter */
    public final ServerToBentoAssetMapper2 getHelpIcon() {
        return this.helpIcon;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAlertSheetTitle() {
        return this.alertSheetTitle;
    }

    /* renamed from: component13, reason: from getter */
    public final Spanned getAlertSheetContentMarkdown() {
        return this.alertSheetContentMarkdown;
    }

    /* renamed from: component14, reason: from getter */
    public final GenericButton getAlertSheetButton() {
        return this.alertSheetButton;
    }

    /* renamed from: component15, reason: from getter */
    public final GoldDepositBoostTransferDetail getGoldDepositBoost() {
        return this.goldDepositBoost;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    public final List<TimelineRow> component5() {
        return this.timelineRows;
    }

    public final List<StandardRow> component6() {
        return this.detailRows;
    }

    public final List<ServerDrivenButton> component7() {
        return this.footerButtons;
    }

    /* renamed from: component8, reason: from getter */
    public final Unit getDividerData() {
        return this.dividerData;
    }

    /* renamed from: component9, reason: from getter */
    public final AcatsInDetailBannerView.BannerViewData getBannerData() {
        return this.bannerData;
    }

    public final AcatsDetailViewState copy(AcatsTransfer acatsTransfer, boolean isLoading, String titleText, String subtitleText, List<TimelineRow> timelineRows, List<StandardRow> detailRows, List<? extends ServerDrivenButton> footerButtons, Unit dividerData, AcatsInDetailBannerView.BannerViewData bannerData, boolean showHelpIcon, ServerToBentoAssetMapper2 helpIcon, String alertSheetTitle, Spanned alertSheetContentMarkdown, GenericButton alertSheetButton, GoldDepositBoostTransferDetail goldDepositBoost) {
        Intrinsics.checkNotNullParameter(timelineRows, "timelineRows");
        Intrinsics.checkNotNullParameter(detailRows, "detailRows");
        Intrinsics.checkNotNullParameter(footerButtons, "footerButtons");
        return new AcatsDetailViewState(acatsTransfer, isLoading, titleText, subtitleText, timelineRows, detailRows, footerButtons, dividerData, bannerData, showHelpIcon, helpIcon, alertSheetTitle, alertSheetContentMarkdown, alertSheetButton, goldDepositBoost);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsDetailViewState)) {
            return false;
        }
        AcatsDetailViewState acatsDetailViewState = (AcatsDetailViewState) other;
        return Intrinsics.areEqual(this.acatsTransfer, acatsDetailViewState.acatsTransfer) && this.isLoading == acatsDetailViewState.isLoading && Intrinsics.areEqual(this.titleText, acatsDetailViewState.titleText) && Intrinsics.areEqual(this.subtitleText, acatsDetailViewState.subtitleText) && Intrinsics.areEqual(this.timelineRows, acatsDetailViewState.timelineRows) && Intrinsics.areEqual(this.detailRows, acatsDetailViewState.detailRows) && Intrinsics.areEqual(this.footerButtons, acatsDetailViewState.footerButtons) && Intrinsics.areEqual(this.dividerData, acatsDetailViewState.dividerData) && Intrinsics.areEqual(this.bannerData, acatsDetailViewState.bannerData) && this.showHelpIcon == acatsDetailViewState.showHelpIcon && this.helpIcon == acatsDetailViewState.helpIcon && Intrinsics.areEqual(this.alertSheetTitle, acatsDetailViewState.alertSheetTitle) && Intrinsics.areEqual(this.alertSheetContentMarkdown, acatsDetailViewState.alertSheetContentMarkdown) && Intrinsics.areEqual(this.alertSheetButton, acatsDetailViewState.alertSheetButton) && Intrinsics.areEqual(this.goldDepositBoost, acatsDetailViewState.goldDepositBoost);
    }

    public int hashCode() {
        AcatsTransfer acatsTransfer = this.acatsTransfer;
        int iHashCode = (((acatsTransfer == null ? 0 : acatsTransfer.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str = this.titleText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitleText;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.timelineRows.hashCode()) * 31) + this.detailRows.hashCode()) * 31) + this.footerButtons.hashCode()) * 31;
        Unit unit = this.dividerData;
        int iHashCode4 = (iHashCode3 + (unit == null ? 0 : unit.hashCode())) * 31;
        AcatsInDetailBannerView.BannerViewData bannerViewData = this.bannerData;
        int iHashCode5 = (((iHashCode4 + (bannerViewData == null ? 0 : bannerViewData.hashCode())) * 31) + Boolean.hashCode(this.showHelpIcon)) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.helpIcon;
        int iHashCode6 = (iHashCode5 + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31;
        String str3 = this.alertSheetTitle;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Spanned spanned = this.alertSheetContentMarkdown;
        int iHashCode8 = (iHashCode7 + (spanned == null ? 0 : spanned.hashCode())) * 31;
        GenericButton genericButton = this.alertSheetButton;
        int iHashCode9 = (iHashCode8 + (genericButton == null ? 0 : genericButton.hashCode())) * 31;
        GoldDepositBoostTransferDetail goldDepositBoostTransferDetail = this.goldDepositBoost;
        return iHashCode9 + (goldDepositBoostTransferDetail != null ? goldDepositBoostTransferDetail.hashCode() : 0);
    }

    public String toString() {
        AcatsTransfer acatsTransfer = this.acatsTransfer;
        boolean z = this.isLoading;
        String str = this.titleText;
        String str2 = this.subtitleText;
        List<TimelineRow> list = this.timelineRows;
        List<StandardRow> list2 = this.detailRows;
        List<ServerDrivenButton> list3 = this.footerButtons;
        Unit unit = this.dividerData;
        AcatsInDetailBannerView.BannerViewData bannerViewData = this.bannerData;
        boolean z2 = this.showHelpIcon;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.helpIcon;
        String str3 = this.alertSheetTitle;
        Spanned spanned = this.alertSheetContentMarkdown;
        return "AcatsDetailViewState(acatsTransfer=" + acatsTransfer + ", isLoading=" + z + ", titleText=" + str + ", subtitleText=" + str2 + ", timelineRows=" + list + ", detailRows=" + list2 + ", footerButtons=" + list3 + ", dividerData=" + unit + ", bannerData=" + bannerViewData + ", showHelpIcon=" + z2 + ", helpIcon=" + serverToBentoAssetMapper2 + ", alertSheetTitle=" + str3 + ", alertSheetContentMarkdown=" + ((Object) spanned) + ", alertSheetButton=" + this.alertSheetButton + ", goldDepositBoost=" + this.goldDepositBoost + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsDetailViewState(AcatsTransfer acatsTransfer, boolean z, String str, String str2, List<TimelineRow> timelineRows, List<StandardRow> detailRows, List<? extends ServerDrivenButton> footerButtons, Unit unit, AcatsInDetailBannerView.BannerViewData bannerViewData, boolean z2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str3, Spanned spanned, GenericButton genericButton, GoldDepositBoostTransferDetail goldDepositBoostTransferDetail) {
        Intrinsics.checkNotNullParameter(timelineRows, "timelineRows");
        Intrinsics.checkNotNullParameter(detailRows, "detailRows");
        Intrinsics.checkNotNullParameter(footerButtons, "footerButtons");
        this.acatsTransfer = acatsTransfer;
        this.isLoading = z;
        this.titleText = str;
        this.subtitleText = str2;
        this.timelineRows = timelineRows;
        this.detailRows = detailRows;
        this.footerButtons = footerButtons;
        this.dividerData = unit;
        this.bannerData = bannerViewData;
        this.showHelpIcon = z2;
        this.helpIcon = serverToBentoAssetMapper2;
        this.alertSheetTitle = str3;
        this.alertSheetContentMarkdown = spanned;
        this.alertSheetButton = genericButton;
        this.goldDepositBoost = goldDepositBoostTransferDetail;
    }

    public final AcatsTransfer getAcatsTransfer() {
        return this.acatsTransfer;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final String getSubtitleText() {
        return this.subtitleText;
    }

    public /* synthetic */ AcatsDetailViewState(AcatsTransfer acatsTransfer, boolean z, String str, String str2, List list, List list2, List list3, Unit unit, AcatsInDetailBannerView.BannerViewData bannerViewData, boolean z2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str3, Spanned spanned, GenericButton genericButton, GoldDepositBoostTransferDetail goldDepositBoostTransferDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : acatsTransfer, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? CollectionsKt.emptyList() : list3, (i & 128) != 0 ? null : unit, (i & 256) != 0 ? null : bannerViewData, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : serverToBentoAssetMapper2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : spanned, (i & 8192) != 0 ? null : genericButton, (i & 16384) != 0 ? null : goldDepositBoostTransferDetail);
    }

    public final List<TimelineRow> getTimelineRows() {
        return this.timelineRows;
    }

    public final List<StandardRow> getDetailRows() {
        return this.detailRows;
    }

    public final List<ServerDrivenButton> getFooterButtons() {
        return this.footerButtons;
    }

    public final Unit getDividerData() {
        return this.dividerData;
    }

    public final AcatsInDetailBannerView.BannerViewData getBannerData() {
        return this.bannerData;
    }

    public final boolean getShowHelpIcon() {
        return this.showHelpIcon;
    }

    public final ServerToBentoAssetMapper2 getHelpIcon() {
        return this.helpIcon;
    }

    public final String getAlertSheetTitle() {
        return this.alertSheetTitle;
    }

    public final Spanned getAlertSheetContentMarkdown() {
        return this.alertSheetContentMarkdown;
    }

    public final GenericButton getAlertSheetButton() {
        return this.alertSheetButton;
    }

    public final GoldDepositBoostTransferDetail getGoldDepositBoost() {
        return this.goldDepositBoost;
    }
}
