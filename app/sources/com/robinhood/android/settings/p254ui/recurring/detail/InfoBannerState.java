package com.robinhood.android.settings.p254ui.recurring.detail;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InfoBannerState;", "", "text", "Lcom/robinhood/models/serverdriven/db/RichText;", "showLearnMore", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "showArrow", "url", "", "<init>", "(Lcom/robinhood/models/serverdriven/db/RichText;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZLjava/lang/String;)V", "getText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getShowLearnMore", "()Z", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getShowArrow", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InfoBannerState {
    public static final int $stable = 8;
    private final ServerToBentoAssetMapper2 icon;
    private final boolean showArrow;
    private final boolean showLearnMore;
    private final RichText text;
    private final String url;

    public static /* synthetic */ InfoBannerState copy$default(InfoBannerState infoBannerState, RichText richText, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            richText = infoBannerState.text;
        }
        if ((i & 2) != 0) {
            z = infoBannerState.showLearnMore;
        }
        if ((i & 4) != 0) {
            serverToBentoAssetMapper2 = infoBannerState.icon;
        }
        if ((i & 8) != 0) {
            z2 = infoBannerState.showArrow;
        }
        if ((i & 16) != 0) {
            str = infoBannerState.url;
        }
        String str2 = str;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
        return infoBannerState.copy(richText, z, serverToBentoAssetMapper22, z2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final RichText getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLearnMore() {
        return this.showLearnMore;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowArrow() {
        return this.showArrow;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final InfoBannerState copy(RichText text, boolean showLearnMore, ServerToBentoAssetMapper2 icon, boolean showArrow, String url) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url, "url");
        return new InfoBannerState(text, showLearnMore, icon, showArrow, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoBannerState)) {
            return false;
        }
        InfoBannerState infoBannerState = (InfoBannerState) other;
        return Intrinsics.areEqual(this.text, infoBannerState.text) && this.showLearnMore == infoBannerState.showLearnMore && this.icon == infoBannerState.icon && this.showArrow == infoBannerState.showArrow && Intrinsics.areEqual(this.url, infoBannerState.url);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + Boolean.hashCode(this.showLearnMore)) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        return ((((iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31) + Boolean.hashCode(this.showArrow)) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "InfoBannerState(text=" + this.text + ", showLearnMore=" + this.showLearnMore + ", icon=" + this.icon + ", showArrow=" + this.showArrow + ", url=" + this.url + ")";
    }

    public InfoBannerState(RichText text, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z2, String url) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url, "url");
        this.text = text;
        this.showLearnMore = z;
        this.icon = serverToBentoAssetMapper2;
        this.showArrow = z2;
        this.url = url;
    }

    public final RichText getText() {
        return this.text;
    }

    public final boolean getShowLearnMore() {
        return this.showLearnMore;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final boolean getShowArrow() {
        return this.showArrow;
    }

    public final String getUrl() {
        return this.url;
    }
}
