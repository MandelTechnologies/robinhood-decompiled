package androidx.camera.camera2.internal;

import androidx.camera.core.impl.UseCaseConfigFactory;

/* loaded from: classes4.dex */
public class TemplateTypeUtil {

    /* renamed from: androidx.camera.camera2.internal.TemplateTypeUtil$1 */
    static /* synthetic */ class C07901 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType */
        static final /* synthetic */ int[] f25x65b8d150;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            f25x65b8d150 = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25x65b8d150[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25x65b8d150[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25x65b8d150[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25x65b8d150[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int getSessionConfigTemplateType(UseCaseConfigFactory.CaptureType captureType, int i) {
        int i2 = C07901.f25x65b8d150[captureType.ordinal()];
        return i2 != 1 ? i2 != 2 ? 1 : 3 : i == 2 ? 5 : 1;
    }

    public static int getCaptureConfigTemplateType(UseCaseConfigFactory.CaptureType captureType, int i) {
        int i2 = C07901.f25x65b8d150[captureType.ordinal()];
        return i2 != 1 ? i2 != 2 ? 1 : 3 : i == 2 ? 5 : 2;
    }
}
