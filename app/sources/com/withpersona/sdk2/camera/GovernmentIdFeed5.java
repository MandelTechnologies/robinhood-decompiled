package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdFeed.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone;", "", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "getImageLightCondition", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "ParsedIdSide", "None", "Side", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$None;", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$ParsedIdSide;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.ParsedIdSideOrNone, reason: use source file name */
/* loaded from: classes26.dex */
public interface GovernmentIdFeed5 {
    ImageLightCondition getImageLightCondition();

    /* compiled from: GovernmentIdFeed.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$ParsedIdSide;", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone;", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "side", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "metadata", "Lcom/withpersona/sdk2/camera/BarcodeInfo;", "extractedBarcode", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "extractedTexts", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;Landroid/graphics/Bitmap;Lcom/withpersona/sdk2/camera/ImageIdMetadata;Lcom/withpersona/sdk2/camera/BarcodeInfo;Lcom/withpersona/sdk2/camera/ExtractedTexts;Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "getSide", "()Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "getMetadata", "()Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "Lcom/withpersona/sdk2/camera/BarcodeInfo;", "getExtractedBarcode", "()Lcom/withpersona/sdk2/camera/BarcodeInfo;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "getExtractedTexts", "()Lcom/withpersona/sdk2/camera/ExtractedTexts;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "getImageLightCondition", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.ParsedIdSideOrNone$ParsedIdSide, reason: from toString */
    public static final /* data */ class ParsedIdSide implements GovernmentIdFeed5 {
        private final Bitmap bitmap;
        private final BarcodeInfo extractedBarcode;
        private final ExtractedTexts extractedTexts;
        private final ImageLightCondition imageLightCondition;
        private final ImageIdMetadata metadata;
        private final Side side;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedIdSide)) {
                return false;
            }
            ParsedIdSide parsedIdSide = (ParsedIdSide) other;
            return this.side == parsedIdSide.side && Intrinsics.areEqual(this.bitmap, parsedIdSide.bitmap) && Intrinsics.areEqual(this.metadata, parsedIdSide.metadata) && Intrinsics.areEqual(this.extractedBarcode, parsedIdSide.extractedBarcode) && Intrinsics.areEqual(this.extractedTexts, parsedIdSide.extractedTexts) && Intrinsics.areEqual(this.imageLightCondition, parsedIdSide.imageLightCondition);
        }

        public int hashCode() {
            int iHashCode = ((this.side.hashCode() * 31) + this.bitmap.hashCode()) * 31;
            ImageIdMetadata imageIdMetadata = this.metadata;
            int iHashCode2 = (iHashCode + (imageIdMetadata == null ? 0 : imageIdMetadata.hashCode())) * 31;
            BarcodeInfo barcodeInfo = this.extractedBarcode;
            int iHashCode3 = (iHashCode2 + (barcodeInfo == null ? 0 : barcodeInfo.hashCode())) * 31;
            ExtractedTexts extractedTexts = this.extractedTexts;
            int iHashCode4 = (iHashCode3 + (extractedTexts == null ? 0 : extractedTexts.hashCode())) * 31;
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            return iHashCode4 + (imageLightCondition != null ? imageLightCondition.hashCode() : 0);
        }

        public String toString() {
            return "ParsedIdSide(side=" + this.side + ", bitmap=" + this.bitmap + ", metadata=" + this.metadata + ", extractedBarcode=" + this.extractedBarcode + ", extractedTexts=" + this.extractedTexts + ", imageLightCondition=" + this.imageLightCondition + ")";
        }

        public ParsedIdSide(Side side, Bitmap bitmap, ImageIdMetadata imageIdMetadata, BarcodeInfo barcodeInfo, ExtractedTexts extractedTexts, ImageLightCondition imageLightCondition) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.side = side;
            this.bitmap = bitmap;
            this.metadata = imageIdMetadata;
            this.extractedBarcode = barcodeInfo;
            this.extractedTexts = extractedTexts;
            this.imageLightCondition = imageLightCondition;
        }

        public final Side getSide() {
            return this.side;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }

        public final BarcodeInfo getExtractedBarcode() {
            return this.extractedBarcode;
        }

        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }

        @Override // com.withpersona.sdk2.camera.GovernmentIdFeed5
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }
    }

    /* compiled from: GovernmentIdFeed.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$None;", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "imageLightCondition", "<init>", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "getImageLightCondition", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.ParsedIdSideOrNone$None, reason: from toString */
    public static final /* data */ class None implements GovernmentIdFeed5 {
        private final ImageLightCondition imageLightCondition;

        /* JADX WARN: Multi-variable type inference failed */
        public None() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && Intrinsics.areEqual(this.imageLightCondition, ((None) other).imageLightCondition);
        }

        public int hashCode() {
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            if (imageLightCondition == null) {
                return 0;
            }
            return imageLightCondition.hashCode();
        }

        public String toString() {
            return "None(imageLightCondition=" + this.imageLightCondition + ")";
        }

        public None(ImageLightCondition imageLightCondition) {
            this.imageLightCondition = imageLightCondition;
        }

        public /* synthetic */ None(ImageLightCondition imageLightCondition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : imageLightCondition);
        }

        @Override // com.withpersona.sdk2.camera.GovernmentIdFeed5
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GovernmentIdFeed.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "", "<init>", "(Ljava/lang/String;I)V", "Front", "Back", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.ParsedIdSideOrNone$Side */
    public static final class Side {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;
        public static final Side Front = new Side("Front", 0);
        public static final Side Back = new Side("Back", 1);

        private static final /* synthetic */ Side[] $values() {
            return new Side[]{Front, Back};
        }

        public static EnumEntries<Side> getEntries() {
            return $ENTRIES;
        }

        private Side(String str, int i) {
        }

        static {
            Side[] sideArr$values = $values();
            $VALUES = sideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sideArr$values);
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }
}
