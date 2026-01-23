package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.face.FaceLandmark;
import com.withpersona.sdk2.camera.SelfiePhoto;
import com.withpersona.sdk2.camera.feed.ViewfinderInfo;
import com.withpersona.sdk2.camera.feed.ViewfinderInfo2;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;

/* compiled from: SelfieProcessor.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 G2\u00020\u0001:\u0003GHIB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020 J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bJ\u001c\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u001c\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\u000bH\u0002J \u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001fH\u0002J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fH\u0002J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fH\u0002J(\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u000bH\u0002J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002J\u001a\u0010=\u001a\u0004\u0018\u0001082\u0006\u0010!\u001a\u00020\"2\u0006\u0010>\u001a\u00020:H\u0002J\u0014\u0010?\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010@\u001a\u00020\u000bH\u0002J\u0014\u0010A\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010@\u001a\u00020\u000bH\u0002J\u0014\u0010B\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010@\u001a\u00020\u000bH\u0002J\u0014\u0010C\u001a\u00020\u0011*\u00020D2\u0006\u0010@\u001a\u00020\u000bH\u0002J\f\u0010E\u001a\u00020\u000b*\u00020FH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006J"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/SelfieProcessor;", "", "<init>", "()V", "minFaceRatio", "", "viewfinderInfo", "Lcom/withpersona/sdk2/camera/feed/ViewfinderInfo;", "targetPose", "Lcom/withpersona/sdk2/camera/SelfieProcessor$TargetPose;", "tempRect", "Landroid/graphics/Rect;", "byteArr", "", "setRequireStrictSelfie", "", "requireStrictSelfie", "", "setTargetPose", "pose", "faceDetector", "Lcom/google/mlkit/vision/face/FaceDetector;", "getFaceDetector", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector$delegate", "Lkotlin/Lazy;", "direction", "Lcom/withpersona/sdk2/camera/selfie/SelfieFrameInfo;", "image", "Landroid/media/Image;", "rotationDegrees", "", "Landroidx/camera/core/ImageProxy;", "imageToAnalyze", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "setViewfinderRect", "rect", "previewRect", "getBrightnessInfo", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "viewfinderRect", "convertRegionCoordinatesToIndex", "x", "y", "angleInDegrees", "fastSin", "degrees", "fastCos", "getRegionBrightness", "", "yPlaneBuffer", "Ljava/nio/ByteBuffer;", "imageWidth", "imageHeight", "region", "getPose", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;", "type", "Lcom/withpersona/sdk2/camera/SelfieProcessor$PoseType;", "bitmap", "Landroid/graphics/Bitmap;", "createSuccessResult", "poseType", "isCenteredInImage", "imageRect", "isFaceTooClose", "isFaceTooFar", "isCenterPoseCentered", "Lcom/google/mlkit/vision/face/Face;", "getBounds", "Lcom/google/mlkit/vision/common/InputImage;", "Companion", "TargetPose", "PoseType", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class SelfieProcessor {
    private ViewfinderInfo viewfinderInfo;
    private double minFaceRatio = 0.35d;
    private TargetPose targetPose = TargetPose.All;
    private Rect tempRect = new Rect();
    private final byte[] byteArr = new byte[32768];

    /* renamed from: faceDetector$delegate, reason: from kotlin metadata */
    private final Lazy faceDetector = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.SelfieProcessor$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelfieProcessor.faceDetector_delegate$lambda$0();
        }
    });

    /* compiled from: SelfieProcessor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PoseType.values().length];
            try {
                iArr[PoseType.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PoseType.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PoseType.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void setRequireStrictSelfie(boolean requireStrictSelfie) {
        this.minFaceRatio = requireStrictSelfie ? 0.45d : 0.35d;
    }

    public final void setTargetPose(TargetPose pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.targetPose = pose;
    }

    private final FaceDetector getFaceDetector() {
        return (FaceDetector) this.faceDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDetector faceDetector_delegate$lambda$0() {
        FaceDetector client = FaceDetection.getClient(new FaceDetectorOptions.Builder().setMinFaceSize(0.35f).setLandmarkMode(2).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    public final SelfieFrameInfo direction(Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        return direction(ImageToAnalyze2.toImageToAnalyze(image, rotationDegrees));
    }

    public final SelfieFrameInfo direction(ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ImageToAnalyze imageToAnalyze = ImageToAnalyze2.toImageToAnalyze(image);
        if (imageToAnalyze == null) {
            return new SelfieFrameInfo(null, SelfieError.Other, 0, false, false, false, 0.0f, null);
        }
        return direction(imageToAnalyze);
    }

    public final SelfieFrameInfo direction(ImageToAnalyze imageToAnalyze) {
        SelfieError selfieError;
        SelfiePhoto selfiePhotoCreateSuccessResult;
        SelfiePhoto selfiePhoto;
        SelfieError selfieError2;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        ViewfinderInfo viewfinderInfo = this.viewfinderInfo;
        Rect rectCalculateViewfinderRect = viewfinderInfo != null ? ViewfinderInfo2.calculateViewfinderRect(viewfinderInfo, imageToAnalyze) : null;
        InputImage inputImage = imageToAnalyze.getInputImage();
        Rect bounds = getBounds(inputImage);
        SelfieBrightnessInfo brightnessInfo = getBrightnessInfo(imageToAnalyze, rectCalculateViewfinderRect);
        Task<List<Face>> taskProcess = getFaceDetector().process(inputImage);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        try {
            List<Face> result = taskProcess.getResult();
            if (result.isEmpty()) {
                return new SelfieFrameInfo(null, SelfieError.FaceNotFound, result.size(), false, false, false, 0.0f, brightnessInfo);
            }
            if (result.size() > 1) {
                return new SelfieFrameInfo(null, SelfieError.MultipleFaces, result.size(), false, false, false, 0.0f, brightnessInfo);
            }
            Intrinsics.checkNotNull(result);
            Face face = (Face) CollectionsKt.first((List) result);
            Rect boundingBox = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
            boolean zIsFaceTooClose = isFaceTooClose(boundingBox, bounds);
            Rect boundingBox2 = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox2, "getBoundingBox(...)");
            boolean zIsFaceTooFar = isFaceTooFar(boundingBox2, bounds);
            Rect boundingBox3 = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox3, "getBoundingBox(...)");
            boolean zIsCenteredInImage = isCenteredInImage(boundingBox3, bounds);
            float headEulerAngleY = face.getHeadEulerAngleY();
            if (zIsFaceTooClose) {
                selfieError = SelfieError.FaceTooClose;
            } else if (zIsFaceTooFar) {
                selfieError = SelfieError.FaceTooFar;
            } else if (!zIsCenteredInImage) {
                selfieError = SelfieError.FaceNotCentered;
            } else {
                if (-10.0f < headEulerAngleY && headEulerAngleY < 10.0f) {
                    Intrinsics.checkNotNull(face);
                    if (!isCenterPoseCentered(face, bounds)) {
                        selfieError = SelfieError.FaceNotCentered;
                    } else {
                        TargetPose targetPose = this.targetPose;
                        if (targetPose == TargetPose.Center || targetPose == TargetPose.All) {
                            selfiePhotoCreateSuccessResult = createSuccessResult(imageToAnalyze, PoseType.Center);
                            selfiePhoto = selfiePhotoCreateSuccessResult;
                            selfieError2 = null;
                        } else {
                            selfieError = SelfieError.IncorrectPose;
                        }
                    }
                } else if (headEulerAngleY < -15.0f) {
                    TargetPose targetPose2 = this.targetPose;
                    if (targetPose2 == TargetPose.Right || targetPose2 == TargetPose.All) {
                        selfiePhotoCreateSuccessResult = createSuccessResult(imageToAnalyze, PoseType.Right);
                        selfiePhoto = selfiePhotoCreateSuccessResult;
                        selfieError2 = null;
                    } else {
                        selfieError = SelfieError.IncorrectPose;
                    }
                } else if (15.0f < headEulerAngleY) {
                    TargetPose targetPose3 = this.targetPose;
                    if (targetPose3 == TargetPose.Left || targetPose3 == TargetPose.All) {
                        selfiePhotoCreateSuccessResult = createSuccessResult(imageToAnalyze, PoseType.Left);
                        selfiePhoto = selfiePhotoCreateSuccessResult;
                        selfieError2 = null;
                    } else {
                        selfieError = SelfieError.IncorrectPose;
                    }
                } else {
                    selfieError = SelfieError.IncorrectPose;
                }
                return new SelfieFrameInfo(selfiePhoto, selfieError2, result.size(), zIsFaceTooClose, zIsFaceTooFar, zIsCenteredInImage, headEulerAngleY, brightnessInfo);
            }
            selfieError2 = selfieError;
            selfiePhoto = null;
            return new SelfieFrameInfo(selfiePhoto, selfieError2, result.size(), zIsFaceTooClose, zIsFaceTooFar, zIsCenteredInImage, headEulerAngleY, brightnessInfo);
        } catch (ExecutionException unused) {
            return new SelfieFrameInfo(null, SelfieError.FaceDetectionUnsupported, 0, false, false, false, 0.0f, brightnessInfo);
        }
    }

    public final void setViewfinderRect(Rect rect, Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }

    private final SelfieBrightnessInfo getBrightnessInfo(ImageToAnalyze image, Rect viewfinderRect) {
        Image.Plane plane;
        int width = image.getImage().getWidth();
        int height = image.getImage().getHeight();
        Image.Plane[] planes = image.getImage().getPlanes();
        if (width == 0 || height == 0 || planes == null || (plane = planes[0]) == null) {
            return null;
        }
        ByteBuffer buffer = plane.getBuffer();
        if (viewfinderRect == null) {
            viewfinderRect = new Rect(0, 0, width, height);
        }
        viewfinderRect.width();
        int iWidth = viewfinderRect.width() / 3;
        int iHeight = viewfinderRect.height() / 3;
        Rect rect = this.tempRect;
        int i = viewfinderRect.left;
        int i2 = viewfinderRect.top;
        rect.set(i, i2, i + iWidth, i2 + iHeight);
        Float[] fArr = new Float[9];
        for (int i3 = 0; i3 < 9; i3++) {
            fArr[i3] = Float.valueOf(0.0f);
        }
        for (int i4 = 0; i4 < 3; i4++) {
            for (int i5 = 0; i5 < 3; i5++) {
                int iConvertRegionCoordinatesToIndex = convertRegionCoordinatesToIndex(i5, i4, image.getRotationDegrees());
                Intrinsics.checkNotNull(buffer);
                fArr[iConvertRegionCoordinatesToIndex] = Float.valueOf(getRegionBrightness(buffer, width, height, this.tempRect));
                Rect rect2 = this.tempRect;
                rect2.left += iWidth;
                rect2.right += iWidth;
            }
            Rect rect3 = this.tempRect;
            rect3.left = viewfinderRect.left;
            rect3.right = viewfinderRect.left + iWidth;
            rect3.top += iHeight;
            rect3.bottom += iHeight;
        }
        buffer.rewind();
        return new SelfieBrightnessInfo(fArr);
    }

    private final int convertRegionCoordinatesToIndex(int x, int y, int angleInDegrees) {
        int i = x - 1;
        int i2 = y - 1;
        return (((i2 * fastCos(angleInDegrees)) + (i * fastSin(angleInDegrees)) + 1) * 3) + ((fastCos(angleInDegrees) * i) - (fastSin(angleInDegrees) * i2)) + 1;
    }

    private final int fastSin(int degrees) {
        int iAbs = Math.abs(degrees / 90) % 4;
        if (iAbs == 0) {
            return 0;
        }
        if (iAbs == 1) {
            return 1;
        }
        if (iAbs == 2) {
            return 0;
        }
        if (iAbs == 3) {
            return -1;
        }
        throw new IllegalStateException("unreachable");
    }

    private final int fastCos(int degrees) {
        return fastSin(degrees + 90);
    }

    private final float getRegionBrightness(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        yPlaneBuffer.rewind();
        int iWidth = region.width();
        int iHeight = region.height() * iWidth;
        if (iWidth > 32768) {
            return 0.0f;
        }
        Progressions2 progressions2Step = RangesKt.step(RangesKt.until(region.top, region.bottom), 2);
        int first = progressions2Step.getFirst();
        int last = progressions2Step.getLast();
        int step = progressions2Step.getStep();
        long j = 0;
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                yPlaneBuffer.position((first * imageWidth) + region.left);
                yPlaneBuffer.get(this.byteArr, 0, iWidth);
                for (int i = 0; i < iWidth; i++) {
                    j += this.byteArr[i] & 255;
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        return ((j / iHeight) / 255.0f) * 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelfieProcessor.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/SelfieProcessor$TargetPose;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "All", "None", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TargetPose {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TargetPose[] $VALUES;
        public static final TargetPose Center = new TargetPose("Center", 0);
        public static final TargetPose Left = new TargetPose("Left", 1);
        public static final TargetPose Right = new TargetPose("Right", 2);
        public static final TargetPose All = new TargetPose("All", 3);
        public static final TargetPose None = new TargetPose("None", 4);

        private static final /* synthetic */ TargetPose[] $values() {
            return new TargetPose[]{Center, Left, Right, All, None};
        }

        public static EnumEntries<TargetPose> getEntries() {
            return $ENTRIES;
        }

        private TargetPose(String str, int i) {
        }

        static {
            TargetPose[] targetPoseArr$values = $values();
            $VALUES = targetPoseArr$values;
            $ENTRIES = EnumEntries2.enumEntries(targetPoseArr$values);
        }

        public static TargetPose valueOf(String str) {
            return (TargetPose) Enum.valueOf(TargetPose.class, str);
        }

        public static TargetPose[] values() {
            return (TargetPose[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelfieProcessor.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/SelfieProcessor$PoseType;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class PoseType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PoseType[] $VALUES;
        public static final PoseType Center = new PoseType("Center", 0);
        public static final PoseType Left = new PoseType("Left", 1);
        public static final PoseType Right = new PoseType("Right", 2);

        private static final /* synthetic */ PoseType[] $values() {
            return new PoseType[]{Center, Left, Right};
        }

        public static EnumEntries<PoseType> getEntries() {
            return $ENTRIES;
        }

        private PoseType(String str, int i) {
        }

        static {
            PoseType[] poseTypeArr$values = $values();
            $VALUES = poseTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(poseTypeArr$values);
        }

        public static PoseType valueOf(String str) {
            return (PoseType) Enum.valueOf(PoseType.class, str);
        }

        public static PoseType[] values() {
            return (PoseType[]) $VALUES.clone();
        }
    }

    private final SelfiePhoto getPose(PoseType type2, Bitmap bitmap) {
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return new SelfiePhoto.Center(bitmap);
        }
        if (i == 2) {
            return new SelfiePhoto.Left(bitmap);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new SelfiePhoto.Right(bitmap);
    }

    private final SelfiePhoto createSuccessResult(ImageToAnalyze imageToAnalyze, PoseType poseType) {
        Bitmap bitmap = imageToAnalyze.getBitmap();
        if (bitmap != null) {
            return getPose(poseType, bitmap);
        }
        return null;
    }

    private final boolean isCenteredInImage(Rect rect, Rect rect2) {
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        int i = iWidth / 2;
        int i2 = iHeight / 2;
        int iMin = Math.min(iWidth, iHeight) / 2;
        Rect rect3 = new Rect(0, 0, iWidth, iHeight);
        rect3.inset(25, 25);
        return rect3.contains(rect) && ((double) Math.abs(RangesKt.coerceAtLeast(rect2.width() - rect.right, 1) - RangesKt.coerceAtLeast(rect.left, 1))) / ((double) rect2.width()) <= 0.3d && rect.left > i - iMin && rect.right < i + iMin && rect.top > i2 - iMin && rect.bottom < i2 + iMin;
    }

    private final boolean isFaceTooClose(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) > ((double) Math.min(rect2.width(), rect2.height())) * 0.8d;
    }

    private final boolean isFaceTooFar(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) < ((double) Math.min(rect2.width(), rect2.height())) * this.minFaceRatio;
    }

    private final boolean isCenterPoseCentered(Face face, Rect rect) {
        int iWidth = rect.width();
        int iHeight = rect.height();
        FaceLandmark landmark = face.getLandmark(6);
        if (landmark == null) {
            return false;
        }
        double d = iWidth / 2;
        double dMin = (Math.min(iWidth, iHeight) * 0.4d) / 2;
        double d2 = iHeight / 2;
        return new Rect((int) (d - dMin), (int) (d2 - dMin), (int) (d + dMin), (int) (d2 + dMin)).contains((int) landmark.getPosition().x, (int) landmark.getPosition().y);
    }

    private final Rect getBounds(InputImage inputImage) {
        if (inputImage.getRotationDegrees() == 90 || inputImage.getRotationDegrees() == 270) {
            return new Rect(0, 0, inputImage.getHeight(), inputImage.getWidth());
        }
        return new Rect(0, 0, inputImage.getWidth(), inputImage.getHeight());
    }
}
