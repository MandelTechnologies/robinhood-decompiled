package com.withpersona.sdk2.camera.analyzers;

import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.GovernmentIdFeed5;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposableImageAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "", "<init>", "()V", "IdFrontAnalysisData", "BarcodeAnalysisData", "FrontOrBackData", "TextExtractionData", "LightConditionData", "Empty", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$BarcodeAnalysisData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$Empty;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$FrontOrBackData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$IdFrontAnalysisData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$LightConditionData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$TextExtractionData;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisData, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class ComposableImageAnalyzer2 {
    public /* synthetic */ ComposableImageAnalyzer2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComposableImageAnalyzer2() {
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$IdFrontAnalysisData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "metadata", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "<init>", "(Lcom/withpersona/sdk2/camera/ImageIdMetadata;)V", "getMetadata", "()Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisData$IdFrontAnalysisData */
    public static final class IdFrontAnalysisData extends ComposableImageAnalyzer2 {
        private final ImageIdMetadata metadata;

        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdFrontAnalysisData(ImageIdMetadata metadata) {
            super(null);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.metadata = metadata;
        }
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$BarcodeAnalysisData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "extractedBarcode", "Lcom/withpersona/sdk2/camera/BarcodeInfo;", "<init>", "(Lcom/withpersona/sdk2/camera/BarcodeInfo;)V", "getExtractedBarcode", "()Lcom/withpersona/sdk2/camera/BarcodeInfo;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisData$BarcodeAnalysisData */
    public static final class BarcodeAnalysisData extends ComposableImageAnalyzer2 {
        private final BarcodeInfo extractedBarcode;

        public final BarcodeInfo getExtractedBarcode() {
            return this.extractedBarcode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarcodeAnalysisData(BarcodeInfo extractedBarcode) {
            super(null);
            Intrinsics.checkNotNullParameter(extractedBarcode, "extractedBarcode");
            this.extractedBarcode = extractedBarcode;
        }
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$FrontOrBackData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "side", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "frontOrBackData", "<init>", "(Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;)V", "getSide", "()Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "getFrontOrBackData", "()Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisData$FrontOrBackData */
    public static final class FrontOrBackData extends ComposableImageAnalyzer2 {
        private final ComposableImageAnalyzer2 frontOrBackData;
        private final GovernmentIdFeed5.Side side;

        public final GovernmentIdFeed5.Side getSide() {
            return this.side;
        }

        public final ComposableImageAnalyzer2 getFrontOrBackData() {
            return this.frontOrBackData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrontOrBackData(GovernmentIdFeed5.Side side, ComposableImageAnalyzer2 frontOrBackData) {
            super(null);
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(frontOrBackData, "frontOrBackData");
            this.side = side;
            this.frontOrBackData = frontOrBackData;
        }
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$TextExtractionData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "extractedTexts", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "<init>", "(Lcom/withpersona/sdk2/camera/ExtractedTexts;)V", "getExtractedTexts", "()Lcom/withpersona/sdk2/camera/ExtractedTexts;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisData$TextExtractionData */
    public static final class TextExtractionData extends ComposableImageAnalyzer2 {
        private final ExtractedTexts extractedTexts;

        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextExtractionData(ExtractedTexts extractedTexts) {
            super(null);
            Intrinsics.checkNotNullParameter(extractedTexts, "extractedTexts");
            this.extractedTexts = extractedTexts;
        }
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$LightConditionData;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "imageLightCondition", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "<init>", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V", "getImageLightCondition", "()Lcom/withpersona/sdk2/camera/ImageLightCondition;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisData$LightConditionData */
    public static final class LightConditionData extends ComposableImageAnalyzer2 {
        private final ImageLightCondition imageLightCondition;

        public final ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LightConditionData(ImageLightCondition imageLightCondition) {
            super(null);
            Intrinsics.checkNotNullParameter(imageLightCondition, "imageLightCondition");
            this.imageLightCondition = imageLightCondition;
        }
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisData$Empty;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisData$Empty */
    public static final /* data */ class Empty extends ComposableImageAnalyzer2 {
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return 801215118;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
            super(null);
        }
    }
}
