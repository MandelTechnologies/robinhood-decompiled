package com.robinhood.staticcontent.model.rhymigration;

import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyMigrationLoadingAnimation.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\nHÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationLoadingAnimation;", "", "animationAsset", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "phraseOneText", "", "phraseTwoText", "phraseThreeText", "phraseOneLoopStartFrame", "", "phraseOneLoopEndFrame", "phraseTwoTransitionStartFrame", "phraseTwoTransitionEndFrame", "phraseThreeLoopStartFrame", "phraseThreeLoopEndFrame", "pollingTimeoutSeconds", "", "<init>", "(Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIJ)V", "getAnimationAsset", "()Lcom/robinhood/contentful/model/ResourceLink;", "getPhraseOneText", "()Ljava/lang/String;", "getPhraseTwoText", "getPhraseThreeText", "getPhraseOneLoopStartFrame", "()I", "getPhraseOneLoopEndFrame", "getPhraseTwoTransitionStartFrame", "getPhraseTwoTransitionEndFrame", "getPhraseThreeLoopStartFrame", "getPhraseThreeLoopEndFrame", "getPollingTimeoutSeconds", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class RhyMigrationLoadingAnimation {
    private final ResourceLink<AssetResource<?>> animationAsset;
    private final int phraseOneLoopEndFrame;
    private final int phraseOneLoopStartFrame;
    private final String phraseOneText;
    private final int phraseThreeLoopEndFrame;
    private final int phraseThreeLoopStartFrame;
    private final String phraseThreeText;
    private final String phraseTwoText;
    private final int phraseTwoTransitionEndFrame;
    private final int phraseTwoTransitionStartFrame;
    private final long pollingTimeoutSeconds;

    public static /* synthetic */ RhyMigrationLoadingAnimation copy$default(RhyMigrationLoadingAnimation rhyMigrationLoadingAnimation, ResourceLink resourceLink, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            resourceLink = rhyMigrationLoadingAnimation.animationAsset;
        }
        if ((i7 & 2) != 0) {
            str = rhyMigrationLoadingAnimation.phraseOneText;
        }
        if ((i7 & 4) != 0) {
            str2 = rhyMigrationLoadingAnimation.phraseTwoText;
        }
        if ((i7 & 8) != 0) {
            str3 = rhyMigrationLoadingAnimation.phraseThreeText;
        }
        if ((i7 & 16) != 0) {
            i = rhyMigrationLoadingAnimation.phraseOneLoopStartFrame;
        }
        if ((i7 & 32) != 0) {
            i2 = rhyMigrationLoadingAnimation.phraseOneLoopEndFrame;
        }
        if ((i7 & 64) != 0) {
            i3 = rhyMigrationLoadingAnimation.phraseTwoTransitionStartFrame;
        }
        if ((i7 & 128) != 0) {
            i4 = rhyMigrationLoadingAnimation.phraseTwoTransitionEndFrame;
        }
        if ((i7 & 256) != 0) {
            i5 = rhyMigrationLoadingAnimation.phraseThreeLoopStartFrame;
        }
        if ((i7 & 512) != 0) {
            i6 = rhyMigrationLoadingAnimation.phraseThreeLoopEndFrame;
        }
        if ((i7 & 1024) != 0) {
            j = rhyMigrationLoadingAnimation.pollingTimeoutSeconds;
        }
        long j2 = j;
        int i8 = i5;
        int i9 = i6;
        int i10 = i3;
        int i11 = i4;
        int i12 = i;
        int i13 = i2;
        return rhyMigrationLoadingAnimation.copy(resourceLink, str, str2, str3, i12, i13, i10, i11, i8, i9, j2);
    }

    public final ResourceLink<AssetResource<?>> component1() {
        return this.animationAsset;
    }

    /* renamed from: component10, reason: from getter */
    public final int getPhraseThreeLoopEndFrame() {
        return this.phraseThreeLoopEndFrame;
    }

    /* renamed from: component11, reason: from getter */
    public final long getPollingTimeoutSeconds() {
        return this.pollingTimeoutSeconds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhraseOneText() {
        return this.phraseOneText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhraseTwoText() {
        return this.phraseTwoText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhraseThreeText() {
        return this.phraseThreeText;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPhraseOneLoopStartFrame() {
        return this.phraseOneLoopStartFrame;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPhraseOneLoopEndFrame() {
        return this.phraseOneLoopEndFrame;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPhraseTwoTransitionStartFrame() {
        return this.phraseTwoTransitionStartFrame;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPhraseTwoTransitionEndFrame() {
        return this.phraseTwoTransitionEndFrame;
    }

    /* renamed from: component9, reason: from getter */
    public final int getPhraseThreeLoopStartFrame() {
        return this.phraseThreeLoopStartFrame;
    }

    public final RhyMigrationLoadingAnimation copy(ResourceLink<AssetResource<?>> animationAsset, String phraseOneText, String phraseTwoText, String phraseThreeText, int phraseOneLoopStartFrame, int phraseOneLoopEndFrame, int phraseTwoTransitionStartFrame, int phraseTwoTransitionEndFrame, int phraseThreeLoopStartFrame, int phraseThreeLoopEndFrame, long pollingTimeoutSeconds) {
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        Intrinsics.checkNotNullParameter(phraseOneText, "phraseOneText");
        Intrinsics.checkNotNullParameter(phraseTwoText, "phraseTwoText");
        Intrinsics.checkNotNullParameter(phraseThreeText, "phraseThreeText");
        return new RhyMigrationLoadingAnimation(animationAsset, phraseOneText, phraseTwoText, phraseThreeText, phraseOneLoopStartFrame, phraseOneLoopEndFrame, phraseTwoTransitionStartFrame, phraseTwoTransitionEndFrame, phraseThreeLoopStartFrame, phraseThreeLoopEndFrame, pollingTimeoutSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyMigrationLoadingAnimation)) {
            return false;
        }
        RhyMigrationLoadingAnimation rhyMigrationLoadingAnimation = (RhyMigrationLoadingAnimation) other;
        return Intrinsics.areEqual(this.animationAsset, rhyMigrationLoadingAnimation.animationAsset) && Intrinsics.areEqual(this.phraseOneText, rhyMigrationLoadingAnimation.phraseOneText) && Intrinsics.areEqual(this.phraseTwoText, rhyMigrationLoadingAnimation.phraseTwoText) && Intrinsics.areEqual(this.phraseThreeText, rhyMigrationLoadingAnimation.phraseThreeText) && this.phraseOneLoopStartFrame == rhyMigrationLoadingAnimation.phraseOneLoopStartFrame && this.phraseOneLoopEndFrame == rhyMigrationLoadingAnimation.phraseOneLoopEndFrame && this.phraseTwoTransitionStartFrame == rhyMigrationLoadingAnimation.phraseTwoTransitionStartFrame && this.phraseTwoTransitionEndFrame == rhyMigrationLoadingAnimation.phraseTwoTransitionEndFrame && this.phraseThreeLoopStartFrame == rhyMigrationLoadingAnimation.phraseThreeLoopStartFrame && this.phraseThreeLoopEndFrame == rhyMigrationLoadingAnimation.phraseThreeLoopEndFrame && this.pollingTimeoutSeconds == rhyMigrationLoadingAnimation.pollingTimeoutSeconds;
    }

    public int hashCode() {
        return (((((((((((((((((((this.animationAsset.hashCode() * 31) + this.phraseOneText.hashCode()) * 31) + this.phraseTwoText.hashCode()) * 31) + this.phraseThreeText.hashCode()) * 31) + Integer.hashCode(this.phraseOneLoopStartFrame)) * 31) + Integer.hashCode(this.phraseOneLoopEndFrame)) * 31) + Integer.hashCode(this.phraseTwoTransitionStartFrame)) * 31) + Integer.hashCode(this.phraseTwoTransitionEndFrame)) * 31) + Integer.hashCode(this.phraseThreeLoopStartFrame)) * 31) + Integer.hashCode(this.phraseThreeLoopEndFrame)) * 31) + Long.hashCode(this.pollingTimeoutSeconds);
    }

    public String toString() {
        return "RhyMigrationLoadingAnimation(animationAsset=" + this.animationAsset + ", phraseOneText=" + this.phraseOneText + ", phraseTwoText=" + this.phraseTwoText + ", phraseThreeText=" + this.phraseThreeText + ", phraseOneLoopStartFrame=" + this.phraseOneLoopStartFrame + ", phraseOneLoopEndFrame=" + this.phraseOneLoopEndFrame + ", phraseTwoTransitionStartFrame=" + this.phraseTwoTransitionStartFrame + ", phraseTwoTransitionEndFrame=" + this.phraseTwoTransitionEndFrame + ", phraseThreeLoopStartFrame=" + this.phraseThreeLoopStartFrame + ", phraseThreeLoopEndFrame=" + this.phraseThreeLoopEndFrame + ", pollingTimeoutSeconds=" + this.pollingTimeoutSeconds + ")";
    }

    public RhyMigrationLoadingAnimation(ResourceLink<AssetResource<?>> animationAsset, String phraseOneText, String phraseTwoText, String phraseThreeText, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        Intrinsics.checkNotNullParameter(phraseOneText, "phraseOneText");
        Intrinsics.checkNotNullParameter(phraseTwoText, "phraseTwoText");
        Intrinsics.checkNotNullParameter(phraseThreeText, "phraseThreeText");
        this.animationAsset = animationAsset;
        this.phraseOneText = phraseOneText;
        this.phraseTwoText = phraseTwoText;
        this.phraseThreeText = phraseThreeText;
        this.phraseOneLoopStartFrame = i;
        this.phraseOneLoopEndFrame = i2;
        this.phraseTwoTransitionStartFrame = i3;
        this.phraseTwoTransitionEndFrame = i4;
        this.phraseThreeLoopStartFrame = i5;
        this.phraseThreeLoopEndFrame = i6;
        this.pollingTimeoutSeconds = j;
    }

    public final ResourceLink<AssetResource<?>> getAnimationAsset() {
        return this.animationAsset;
    }

    public final String getPhraseOneText() {
        return this.phraseOneText;
    }

    public final String getPhraseTwoText() {
        return this.phraseTwoText;
    }

    public final String getPhraseThreeText() {
        return this.phraseThreeText;
    }

    public final int getPhraseOneLoopStartFrame() {
        return this.phraseOneLoopStartFrame;
    }

    public final int getPhraseOneLoopEndFrame() {
        return this.phraseOneLoopEndFrame;
    }

    public final int getPhraseTwoTransitionStartFrame() {
        return this.phraseTwoTransitionStartFrame;
    }

    public final int getPhraseTwoTransitionEndFrame() {
        return this.phraseTwoTransitionEndFrame;
    }

    public final int getPhraseThreeLoopStartFrame() {
        return this.phraseThreeLoopStartFrame;
    }

    public final int getPhraseThreeLoopEndFrame() {
        return this.phraseThreeLoopEndFrame;
    }

    public final long getPollingTimeoutSeconds() {
        return this.pollingTimeoutSeconds;
    }
}
