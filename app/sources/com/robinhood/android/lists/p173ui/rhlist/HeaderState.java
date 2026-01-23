package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.serverdriven.experimental.api.LinearGradientColor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p479j$.time.Instant;

/* compiled from: CuratedListRhListViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0012HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0080\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b9\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b@\u0010\u001bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010AR\u0017\u0010B\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bC\u0010$R\u0019\u0010D\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010\u0017R\u0017\u0010F\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010$¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/HeaderState;", "", "Ljava/util/UUID;", "id", "", "displayName", "j$/time/Instant", "updatedAt", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "description", "backgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;", "backgroundGradient", "", "showErrorImage", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "badgeIcon", "badgeTitle", "Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "imageUrls", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;)V", "component10", "()Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Lj$/time/Instant;", "component4", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "component5", "component6", "()Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;", "component7", "()Z", "component8", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component9", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;)Lcom/robinhood/android/lists/ui/rhlist/HeaderState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Ljava/lang/String;", "getDisplayName", "Lj$/time/Instant;", "getUpdatedAt", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getDescription", "getBackgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;", "getBackgroundGradient", "Z", "getShowErrorImage", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBadgeIcon", "getBadgeTitle", "Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "showDescription", "getShowDescription", "headerImages", "getHeaderImages", "showBadge", "getShowBadge", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HeaderState {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final LinearGradientColor backgroundGradient;
    private final ServerToBentoAssetMapper2 badgeIcon;
    private final String badgeTitle;
    private final MarkdownContent description;
    private final String displayName;
    private final SizedUrlHolder headerImages;
    private final UUID id;
    private final SizedUrlHolder imageUrls;
    private final boolean showBadge;
    private final boolean showDescription;
    private final boolean showErrorImage;
    private final Instant updatedAt;

    /* renamed from: component10, reason: from getter */
    private final SizedUrlHolder getImageUrls() {
        return this.imageUrls;
    }

    public static /* synthetic */ HeaderState copy$default(HeaderState headerState, UUID uuid, String str, Instant instant, MarkdownContent markdownContent, String str2, LinearGradientColor linearGradientColor, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str3, SizedUrlHolder sizedUrlHolder, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = headerState.id;
        }
        if ((i & 2) != 0) {
            str = headerState.displayName;
        }
        if ((i & 4) != 0) {
            instant = headerState.updatedAt;
        }
        if ((i & 8) != 0) {
            markdownContent = headerState.description;
        }
        if ((i & 16) != 0) {
            str2 = headerState.backgroundColor;
        }
        if ((i & 32) != 0) {
            linearGradientColor = headerState.backgroundGradient;
        }
        if ((i & 64) != 0) {
            z = headerState.showErrorImage;
        }
        if ((i & 128) != 0) {
            serverToBentoAssetMapper2 = headerState.badgeIcon;
        }
        if ((i & 256) != 0) {
            str3 = headerState.badgeTitle;
        }
        if ((i & 512) != 0) {
            sizedUrlHolder = headerState.imageUrls;
        }
        String str4 = str3;
        SizedUrlHolder sizedUrlHolder2 = sizedUrlHolder;
        boolean z2 = z;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
        String str5 = str2;
        LinearGradientColor linearGradientColor2 = linearGradientColor;
        return headerState.copy(uuid, str, instant, markdownContent, str5, linearGradientColor2, z2, serverToBentoAssetMapper22, str4, sizedUrlHolder2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component4, reason: from getter */
    public final MarkdownContent getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final LinearGradientColor getBackgroundGradient() {
        return this.backgroundGradient;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowErrorImage() {
        return this.showErrorImage;
    }

    /* renamed from: component8, reason: from getter */
    public final ServerToBentoAssetMapper2 getBadgeIcon() {
        return this.badgeIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBadgeTitle() {
        return this.badgeTitle;
    }

    public final HeaderState copy(UUID id, String displayName, Instant updatedAt, MarkdownContent description, String backgroundColor, LinearGradientColor backgroundGradient, boolean showErrorImage, ServerToBentoAssetMapper2 badgeIcon, String badgeTitle, SizedUrlHolder imageUrls) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new HeaderState(id, displayName, updatedAt, description, backgroundColor, backgroundGradient, showErrorImage, badgeIcon, badgeTitle, imageUrls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderState)) {
            return false;
        }
        HeaderState headerState = (HeaderState) other;
        return Intrinsics.areEqual(this.id, headerState.id) && Intrinsics.areEqual(this.displayName, headerState.displayName) && Intrinsics.areEqual(this.updatedAt, headerState.updatedAt) && Intrinsics.areEqual(this.description, headerState.description) && Intrinsics.areEqual(this.backgroundColor, headerState.backgroundColor) && Intrinsics.areEqual(this.backgroundGradient, headerState.backgroundGradient) && this.showErrorImage == headerState.showErrorImage && this.badgeIcon == headerState.badgeIcon && Intrinsics.areEqual(this.badgeTitle, headerState.badgeTitle) && Intrinsics.areEqual(this.imageUrls, headerState.imageUrls);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        MarkdownContent markdownContent = this.description;
        int iHashCode2 = (iHashCode + (markdownContent == null ? 0 : markdownContent.hashCode())) * 31;
        String str = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LinearGradientColor linearGradientColor = this.backgroundGradient;
        int iHashCode4 = (((iHashCode3 + (linearGradientColor == null ? 0 : linearGradientColor.hashCode())) * 31) + Boolean.hashCode(this.showErrorImage)) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.badgeIcon;
        int iHashCode5 = (iHashCode4 + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31;
        String str2 = this.badgeTitle;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SizedUrlHolder sizedUrlHolder = this.imageUrls;
        return iHashCode6 + (sizedUrlHolder != null ? sizedUrlHolder.hashCode() : 0);
    }

    public String toString() {
        return "HeaderState(id=" + this.id + ", displayName=" + this.displayName + ", updatedAt=" + this.updatedAt + ", description=" + this.description + ", backgroundColor=" + this.backgroundColor + ", backgroundGradient=" + this.backgroundGradient + ", showErrorImage=" + this.showErrorImage + ", badgeIcon=" + this.badgeIcon + ", badgeTitle=" + this.badgeTitle + ", imageUrls=" + this.imageUrls + ")";
    }

    public HeaderState(UUID id, String displayName, Instant updatedAt, MarkdownContent markdownContent, String str, LinearGradientColor linearGradientColor, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str2, SizedUrlHolder sizedUrlHolder) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.id = id;
        this.displayName = displayName;
        this.updatedAt = updatedAt;
        this.description = markdownContent;
        this.backgroundColor = str;
        this.backgroundGradient = linearGradientColor;
        this.showErrorImage = z;
        this.badgeIcon = serverToBentoAssetMapper2;
        this.badgeTitle = str2;
        this.imageUrls = sizedUrlHolder;
        String raw = markdownContent != null ? markdownContent.getRaw() : null;
        boolean z2 = false;
        this.showDescription = !(raw == null || StringsKt.isBlank(raw));
        this.headerImages = sizedUrlHolder;
        if (serverToBentoAssetMapper2 != null && str2 != null) {
            z2 = true;
        }
        this.showBadge = z2;
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final LinearGradientColor getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public final boolean getShowErrorImage() {
        return this.showErrorImage;
    }

    public final ServerToBentoAssetMapper2 getBadgeIcon() {
        return this.badgeIcon;
    }

    public final String getBadgeTitle() {
        return this.badgeTitle;
    }

    public final boolean getShowDescription() {
        return this.showDescription;
    }

    public final SizedUrlHolder getHeaderImages() {
        return this.headerImages;
    }

    public final boolean getShowBadge() {
        return this.showBadge;
    }
}
