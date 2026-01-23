package com.robinhood.staticcontent.model.rhymigration;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyMigrationContrastPage.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0013\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007HÆ\u0003J\u0013\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007HÆ\u0003J\u0013\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007HÆ\u0003J\u0013\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007HÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003JÛ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0012\b\u0002\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0012\b\u0002\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\rHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u001b\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001b\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001b¨\u0006F"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationContrastPage;", "", "title", "", "subtitle", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "animationAsset", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "animationAssetDark", "animationAssetSmallDevice", "animationAssetSmallDeviceDark", "combinedToSeparateStartFrame", "", "combinedToSeparateEndFrame", "separateToCombinedStartFrame", "separateToCombinedEndFrame", "combinedLoopStartFrame", "combinedLoopEndFrame", "separateLoopStartFrame", "separateLoopEndFrame", "primaryCtaText", "secondaryCtaText", "secondaryCtaDeeplink", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;IIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getAnimationAsset", "()Lcom/robinhood/contentful/model/ResourceLink;", "getAnimationAssetDark", "getAnimationAssetSmallDevice", "getAnimationAssetSmallDeviceDark", "getCombinedToSeparateStartFrame", "()I", "getCombinedToSeparateEndFrame", "getSeparateToCombinedStartFrame", "getSeparateToCombinedEndFrame", "getCombinedLoopStartFrame", "getCombinedLoopEndFrame", "getSeparateLoopStartFrame", "getSeparateLoopEndFrame", "getPrimaryCtaText", "getSecondaryCtaText", "getSecondaryCtaDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class RhyMigrationContrastPage {
    private final ResourceLink<AssetResource<?>> animationAsset;
    private final ResourceLink<AssetResource<?>> animationAssetDark;
    private final ResourceLink<AssetResource<?>> animationAssetSmallDevice;
    private final ResourceLink<AssetResource<?>> animationAssetSmallDeviceDark;
    private final int combinedLoopEndFrame;
    private final int combinedLoopStartFrame;
    private final int combinedToSeparateEndFrame;
    private final int combinedToSeparateStartFrame;
    private final String primaryCtaText;
    private final String secondaryCtaDeeplink;
    private final String secondaryCtaText;
    private final int separateLoopEndFrame;
    private final int separateLoopStartFrame;
    private final int separateToCombinedEndFrame;
    private final int separateToCombinedStartFrame;
    private final MarkdownContent subtitle;
    private final String title;

    public static /* synthetic */ RhyMigrationContrastPage copy$default(RhyMigrationContrastPage rhyMigrationContrastPage, String str, MarkdownContent markdownContent, ResourceLink resourceLink, ResourceLink resourceLink2, ResourceLink resourceLink3, ResourceLink resourceLink4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, String str3, String str4, int i9, Object obj) {
        String str5;
        String str6;
        String str7;
        RhyMigrationContrastPage rhyMigrationContrastPage2;
        String str8;
        MarkdownContent markdownContent2;
        ResourceLink resourceLink5;
        ResourceLink resourceLink6;
        ResourceLink resourceLink7;
        ResourceLink resourceLink8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str9 = (i9 & 1) != 0 ? rhyMigrationContrastPage.title : str;
        MarkdownContent markdownContent3 = (i9 & 2) != 0 ? rhyMigrationContrastPage.subtitle : markdownContent;
        ResourceLink resourceLink9 = (i9 & 4) != 0 ? rhyMigrationContrastPage.animationAsset : resourceLink;
        ResourceLink resourceLink10 = (i9 & 8) != 0 ? rhyMigrationContrastPage.animationAssetDark : resourceLink2;
        ResourceLink resourceLink11 = (i9 & 16) != 0 ? rhyMigrationContrastPage.animationAssetSmallDevice : resourceLink3;
        ResourceLink resourceLink12 = (i9 & 32) != 0 ? rhyMigrationContrastPage.animationAssetSmallDeviceDark : resourceLink4;
        int i18 = (i9 & 64) != 0 ? rhyMigrationContrastPage.combinedToSeparateStartFrame : i;
        int i19 = (i9 & 128) != 0 ? rhyMigrationContrastPage.combinedToSeparateEndFrame : i2;
        int i20 = (i9 & 256) != 0 ? rhyMigrationContrastPage.separateToCombinedStartFrame : i3;
        int i21 = (i9 & 512) != 0 ? rhyMigrationContrastPage.separateToCombinedEndFrame : i4;
        int i22 = (i9 & 1024) != 0 ? rhyMigrationContrastPage.combinedLoopStartFrame : i5;
        int i23 = (i9 & 2048) != 0 ? rhyMigrationContrastPage.combinedLoopEndFrame : i6;
        int i24 = (i9 & 4096) != 0 ? rhyMigrationContrastPage.separateLoopStartFrame : i7;
        int i25 = (i9 & 8192) != 0 ? rhyMigrationContrastPage.separateLoopEndFrame : i8;
        String str10 = str9;
        String str11 = (i9 & 16384) != 0 ? rhyMigrationContrastPage.primaryCtaText : str2;
        String str12 = (i9 & 32768) != 0 ? rhyMigrationContrastPage.secondaryCtaText : str3;
        if ((i9 & 65536) != 0) {
            str6 = str12;
            str5 = rhyMigrationContrastPage.secondaryCtaDeeplink;
            str8 = str11;
            markdownContent2 = markdownContent3;
            resourceLink5 = resourceLink9;
            resourceLink6 = resourceLink10;
            resourceLink7 = resourceLink11;
            resourceLink8 = resourceLink12;
            i10 = i18;
            i11 = i19;
            i12 = i20;
            i13 = i21;
            i14 = i22;
            i15 = i23;
            i16 = i24;
            i17 = i25;
            str7 = str10;
            rhyMigrationContrastPage2 = rhyMigrationContrastPage;
        } else {
            str5 = str4;
            str6 = str12;
            str7 = str10;
            rhyMigrationContrastPage2 = rhyMigrationContrastPage;
            str8 = str11;
            markdownContent2 = markdownContent3;
            resourceLink5 = resourceLink9;
            resourceLink6 = resourceLink10;
            resourceLink7 = resourceLink11;
            resourceLink8 = resourceLink12;
            i10 = i18;
            i11 = i19;
            i12 = i20;
            i13 = i21;
            i14 = i22;
            i15 = i23;
            i16 = i24;
            i17 = i25;
        }
        return rhyMigrationContrastPage2.copy(str7, markdownContent2, resourceLink5, resourceLink6, resourceLink7, resourceLink8, i10, i11, i12, i13, i14, i15, i16, i17, str8, str6, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSeparateToCombinedEndFrame() {
        return this.separateToCombinedEndFrame;
    }

    /* renamed from: component11, reason: from getter */
    public final int getCombinedLoopStartFrame() {
        return this.combinedLoopStartFrame;
    }

    /* renamed from: component12, reason: from getter */
    public final int getCombinedLoopEndFrame() {
        return this.combinedLoopEndFrame;
    }

    /* renamed from: component13, reason: from getter */
    public final int getSeparateLoopStartFrame() {
        return this.separateLoopStartFrame;
    }

    /* renamed from: component14, reason: from getter */
    public final int getSeparateLoopEndFrame() {
        return this.separateLoopEndFrame;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSecondaryCtaDeeplink() {
        return this.secondaryCtaDeeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final MarkdownContent getSubtitle() {
        return this.subtitle;
    }

    public final ResourceLink<AssetResource<?>> component3() {
        return this.animationAsset;
    }

    public final ResourceLink<AssetResource<?>> component4() {
        return this.animationAssetDark;
    }

    public final ResourceLink<AssetResource<?>> component5() {
        return this.animationAssetSmallDevice;
    }

    public final ResourceLink<AssetResource<?>> component6() {
        return this.animationAssetSmallDeviceDark;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCombinedToSeparateStartFrame() {
        return this.combinedToSeparateStartFrame;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCombinedToSeparateEndFrame() {
        return this.combinedToSeparateEndFrame;
    }

    /* renamed from: component9, reason: from getter */
    public final int getSeparateToCombinedStartFrame() {
        return this.separateToCombinedStartFrame;
    }

    public final RhyMigrationContrastPage copy(String title, MarkdownContent subtitle, ResourceLink<AssetResource<?>> animationAsset, ResourceLink<AssetResource<?>> animationAssetDark, ResourceLink<AssetResource<?>> animationAssetSmallDevice, ResourceLink<AssetResource<?>> animationAssetSmallDeviceDark, int combinedToSeparateStartFrame, int combinedToSeparateEndFrame, int separateToCombinedStartFrame, int separateToCombinedEndFrame, int combinedLoopStartFrame, int combinedLoopEndFrame, int separateLoopStartFrame, int separateLoopEndFrame, String primaryCtaText, String secondaryCtaText, String secondaryCtaDeeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        Intrinsics.checkNotNullParameter(animationAssetDark, "animationAssetDark");
        Intrinsics.checkNotNullParameter(animationAssetSmallDevice, "animationAssetSmallDevice");
        Intrinsics.checkNotNullParameter(animationAssetSmallDeviceDark, "animationAssetSmallDeviceDark");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaDeeplink, "secondaryCtaDeeplink");
        return new RhyMigrationContrastPage(title, subtitle, animationAsset, animationAssetDark, animationAssetSmallDevice, animationAssetSmallDeviceDark, combinedToSeparateStartFrame, combinedToSeparateEndFrame, separateToCombinedStartFrame, separateToCombinedEndFrame, combinedLoopStartFrame, combinedLoopEndFrame, separateLoopStartFrame, separateLoopEndFrame, primaryCtaText, secondaryCtaText, secondaryCtaDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyMigrationContrastPage)) {
            return false;
        }
        RhyMigrationContrastPage rhyMigrationContrastPage = (RhyMigrationContrastPage) other;
        return Intrinsics.areEqual(this.title, rhyMigrationContrastPage.title) && Intrinsics.areEqual(this.subtitle, rhyMigrationContrastPage.subtitle) && Intrinsics.areEqual(this.animationAsset, rhyMigrationContrastPage.animationAsset) && Intrinsics.areEqual(this.animationAssetDark, rhyMigrationContrastPage.animationAssetDark) && Intrinsics.areEqual(this.animationAssetSmallDevice, rhyMigrationContrastPage.animationAssetSmallDevice) && Intrinsics.areEqual(this.animationAssetSmallDeviceDark, rhyMigrationContrastPage.animationAssetSmallDeviceDark) && this.combinedToSeparateStartFrame == rhyMigrationContrastPage.combinedToSeparateStartFrame && this.combinedToSeparateEndFrame == rhyMigrationContrastPage.combinedToSeparateEndFrame && this.separateToCombinedStartFrame == rhyMigrationContrastPage.separateToCombinedStartFrame && this.separateToCombinedEndFrame == rhyMigrationContrastPage.separateToCombinedEndFrame && this.combinedLoopStartFrame == rhyMigrationContrastPage.combinedLoopStartFrame && this.combinedLoopEndFrame == rhyMigrationContrastPage.combinedLoopEndFrame && this.separateLoopStartFrame == rhyMigrationContrastPage.separateLoopStartFrame && this.separateLoopEndFrame == rhyMigrationContrastPage.separateLoopEndFrame && Intrinsics.areEqual(this.primaryCtaText, rhyMigrationContrastPage.primaryCtaText) && Intrinsics.areEqual(this.secondaryCtaText, rhyMigrationContrastPage.secondaryCtaText) && Intrinsics.areEqual(this.secondaryCtaDeeplink, rhyMigrationContrastPage.secondaryCtaDeeplink);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.animationAsset.hashCode()) * 31) + this.animationAssetDark.hashCode()) * 31) + this.animationAssetSmallDevice.hashCode()) * 31) + this.animationAssetSmallDeviceDark.hashCode()) * 31) + Integer.hashCode(this.combinedToSeparateStartFrame)) * 31) + Integer.hashCode(this.combinedToSeparateEndFrame)) * 31) + Integer.hashCode(this.separateToCombinedStartFrame)) * 31) + Integer.hashCode(this.separateToCombinedEndFrame)) * 31) + Integer.hashCode(this.combinedLoopStartFrame)) * 31) + Integer.hashCode(this.combinedLoopEndFrame)) * 31) + Integer.hashCode(this.separateLoopStartFrame)) * 31) + Integer.hashCode(this.separateLoopEndFrame)) * 31) + this.primaryCtaText.hashCode()) * 31) + this.secondaryCtaText.hashCode()) * 31) + this.secondaryCtaDeeplink.hashCode();
    }

    public String toString() {
        return "RhyMigrationContrastPage(title=" + this.title + ", subtitle=" + this.subtitle + ", animationAsset=" + this.animationAsset + ", animationAssetDark=" + this.animationAssetDark + ", animationAssetSmallDevice=" + this.animationAssetSmallDevice + ", animationAssetSmallDeviceDark=" + this.animationAssetSmallDeviceDark + ", combinedToSeparateStartFrame=" + this.combinedToSeparateStartFrame + ", combinedToSeparateEndFrame=" + this.combinedToSeparateEndFrame + ", separateToCombinedStartFrame=" + this.separateToCombinedStartFrame + ", separateToCombinedEndFrame=" + this.separateToCombinedEndFrame + ", combinedLoopStartFrame=" + this.combinedLoopStartFrame + ", combinedLoopEndFrame=" + this.combinedLoopEndFrame + ", separateLoopStartFrame=" + this.separateLoopStartFrame + ", separateLoopEndFrame=" + this.separateLoopEndFrame + ", primaryCtaText=" + this.primaryCtaText + ", secondaryCtaText=" + this.secondaryCtaText + ", secondaryCtaDeeplink=" + this.secondaryCtaDeeplink + ")";
    }

    public RhyMigrationContrastPage(String title, MarkdownContent subtitle, ResourceLink<AssetResource<?>> animationAsset, ResourceLink<AssetResource<?>> animationAssetDark, ResourceLink<AssetResource<?>> animationAssetSmallDevice, ResourceLink<AssetResource<?>> animationAssetSmallDeviceDark, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String primaryCtaText, String secondaryCtaText, String secondaryCtaDeeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        Intrinsics.checkNotNullParameter(animationAssetDark, "animationAssetDark");
        Intrinsics.checkNotNullParameter(animationAssetSmallDevice, "animationAssetSmallDevice");
        Intrinsics.checkNotNullParameter(animationAssetSmallDeviceDark, "animationAssetSmallDeviceDark");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaDeeplink, "secondaryCtaDeeplink");
        this.title = title;
        this.subtitle = subtitle;
        this.animationAsset = animationAsset;
        this.animationAssetDark = animationAssetDark;
        this.animationAssetSmallDevice = animationAssetSmallDevice;
        this.animationAssetSmallDeviceDark = animationAssetSmallDeviceDark;
        this.combinedToSeparateStartFrame = i;
        this.combinedToSeparateEndFrame = i2;
        this.separateToCombinedStartFrame = i3;
        this.separateToCombinedEndFrame = i4;
        this.combinedLoopStartFrame = i5;
        this.combinedLoopEndFrame = i6;
        this.separateLoopStartFrame = i7;
        this.separateLoopEndFrame = i8;
        this.primaryCtaText = primaryCtaText;
        this.secondaryCtaText = secondaryCtaText;
        this.secondaryCtaDeeplink = secondaryCtaDeeplink;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getSubtitle() {
        return this.subtitle;
    }

    public final ResourceLink<AssetResource<?>> getAnimationAsset() {
        return this.animationAsset;
    }

    public final ResourceLink<AssetResource<?>> getAnimationAssetDark() {
        return this.animationAssetDark;
    }

    public final ResourceLink<AssetResource<?>> getAnimationAssetSmallDevice() {
        return this.animationAssetSmallDevice;
    }

    public final ResourceLink<AssetResource<?>> getAnimationAssetSmallDeviceDark() {
        return this.animationAssetSmallDeviceDark;
    }

    public final int getCombinedToSeparateStartFrame() {
        return this.combinedToSeparateStartFrame;
    }

    public final int getCombinedToSeparateEndFrame() {
        return this.combinedToSeparateEndFrame;
    }

    public final int getSeparateToCombinedStartFrame() {
        return this.separateToCombinedStartFrame;
    }

    public final int getSeparateToCombinedEndFrame() {
        return this.separateToCombinedEndFrame;
    }

    public final int getCombinedLoopStartFrame() {
        return this.combinedLoopStartFrame;
    }

    public final int getCombinedLoopEndFrame() {
        return this.combinedLoopEndFrame;
    }

    public final int getSeparateLoopStartFrame() {
        return this.separateLoopStartFrame;
    }

    public final int getSeparateLoopEndFrame() {
        return this.separateLoopEndFrame;
    }

    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    public final String getSecondaryCtaDeeplink() {
        return this.secondaryCtaDeeplink;
    }
}
