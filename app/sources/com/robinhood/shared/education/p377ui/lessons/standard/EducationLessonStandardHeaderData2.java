package com.robinhood.shared.education.p377ui.lessons.standard;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonStandardHeaderData.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl;", "", "<init>", "()V", "Animation", "Image", "Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl$Animation;", "Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl$Image;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.lessons.standard.SectionAssetUrl, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class EducationLessonStandardHeaderData2 {
    public static final int $stable = 0;

    public /* synthetic */ EducationLessonStandardHeaderData2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EducationLessonStandardHeaderData2() {
    }

    /* compiled from: EducationLessonStandardHeaderData.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl$Animation;", "Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl;", "assetUrl", "", "<init>", "(Ljava/lang/String;)V", "getAssetUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.standard.SectionAssetUrl$Animation, reason: from toString */
    public static final /* data */ class Animation extends EducationLessonStandardHeaderData2 {
        public static final int $stable = 0;
        private final String assetUrl;

        public static /* synthetic */ Animation copy$default(Animation animation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = animation.assetUrl;
            }
            return animation.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetUrl() {
            return this.assetUrl;
        }

        public final Animation copy(String assetUrl) {
            Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
            return new Animation(assetUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Animation) && Intrinsics.areEqual(this.assetUrl, ((Animation) other).assetUrl);
        }

        public int hashCode() {
            return this.assetUrl.hashCode();
        }

        public String toString() {
            return "Animation(assetUrl=" + this.assetUrl + ")";
        }

        public final String getAssetUrl() {
            return this.assetUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Animation(String assetUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
            this.assetUrl = assetUrl;
        }
    }

    /* compiled from: EducationLessonStandardHeaderData.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl$Image;", "Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl;", "assetUrl", "", "<init>", "(Ljava/lang/String;)V", "getAssetUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.standard.SectionAssetUrl$Image, reason: from toString */
    public static final /* data */ class Image extends EducationLessonStandardHeaderData2 {
        public static final int $stable = 0;
        private final String assetUrl;

        public static /* synthetic */ Image copy$default(Image image, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.assetUrl;
            }
            return image.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetUrl() {
            return this.assetUrl;
        }

        public final Image copy(String assetUrl) {
            Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
            return new Image(assetUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Image) && Intrinsics.areEqual(this.assetUrl, ((Image) other).assetUrl);
        }

        public int hashCode() {
            return this.assetUrl.hashCode();
        }

        public String toString() {
            return "Image(assetUrl=" + this.assetUrl + ")";
        }

        public final String getAssetUrl() {
            return this.assetUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(String assetUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
            this.assetUrl = assetUrl;
        }
    }
}
