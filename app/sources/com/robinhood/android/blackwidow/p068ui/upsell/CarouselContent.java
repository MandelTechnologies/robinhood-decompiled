package com.robinhood.android.blackwidow.p068ui.upsell;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/CarouselContent;", "", "video", "Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", AnnotatedPrivateKey.LABEL, "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "description", "<init>", "(Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getVideo", "()Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CarouselContent {
    public static final int $stable = 8;
    private final String description;
    private final ServerToBentoAssetMapper2 icon;
    private final String label;
    private final VideoInfo video;

    public static /* synthetic */ CarouselContent copy$default(CarouselContent carouselContent, VideoInfo videoInfo, String str, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            videoInfo = carouselContent.video;
        }
        if ((i & 2) != 0) {
            str = carouselContent.label;
        }
        if ((i & 4) != 0) {
            serverToBentoAssetMapper2 = carouselContent.icon;
        }
        if ((i & 8) != 0) {
            str2 = carouselContent.description;
        }
        return carouselContent.copy(videoInfo, str, serverToBentoAssetMapper2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final VideoInfo getVideo() {
        return this.video;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final CarouselContent copy(VideoInfo video, String label, ServerToBentoAssetMapper2 icon, String description) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        return new CarouselContent(video, label, icon, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselContent)) {
            return false;
        }
        CarouselContent carouselContent = (CarouselContent) other;
        return Intrinsics.areEqual(this.video, carouselContent.video) && Intrinsics.areEqual(this.label, carouselContent.label) && this.icon == carouselContent.icon && Intrinsics.areEqual(this.description, carouselContent.description);
    }

    public int hashCode() {
        return (((((this.video.hashCode() * 31) + this.label.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "CarouselContent(video=" + this.video + ", label=" + this.label + ", icon=" + this.icon + ", description=" + this.description + ")";
    }

    public CarouselContent(VideoInfo video, String label, ServerToBentoAssetMapper2 icon, String description) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        this.video = video;
        this.label = label;
        this.icon = icon;
        this.description = description;
    }

    public final VideoInfo getVideo() {
        return this.video;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final String getDescription() {
        return this.description;
    }
}
