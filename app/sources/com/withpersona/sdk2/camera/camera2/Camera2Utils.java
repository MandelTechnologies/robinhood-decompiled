package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import com.withpersona.sdk2.camera.CameraProperties;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Camera2Utils.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Landroid/hardware/camera2/CameraCharacteristics;", "", "preferredFps", "Landroid/util/Range;", "getBestRange", "(Landroid/hardware/camera2/CameraCharacteristics;I)Landroid/util/Range;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/camera/camera2/CameraChoice;", "getAllCameraChoices", "(Landroid/content/Context;)Ljava/util/List;", "Lcom/withpersona/sdk2/camera/camera2/CameraDirection;", "cameraDirection", "Lcom/withpersona/sdk2/camera/camera2/CameraChoices;", "getBestCameraChoices", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/camera2/CameraDirection;)Lcom/withpersona/sdk2/camera/camera2/CameraChoices;", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "toFacingMode", "(Lcom/withpersona/sdk2/camera/camera2/CameraDirection;)Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "camera_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.camera.camera2.Camera2UtilsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Camera2Utils {

    /* compiled from: Camera2Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2UtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Camera2Utils4.values().length];
            try {
                iArr[Camera2Utils4.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Camera2Utils4.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Camera2Utils4.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Range<Integer> getBestRange(CameraCharacteristics cameraCharacteristics, int i) {
        Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr == null || rangeArr.length == 0) {
            return null;
        }
        for (Range<Integer> range2 : rangeArr) {
            Object upper = range2.getUpper();
            Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
            int iIntValue = ((Number) upper).intValue();
            if (iIntValue >= i && (range == null || iIntValue < ((Number) range.getUpper()).intValue())) {
                range = range2;
            }
        }
        if (range != null) {
            return range;
        }
        if (rangeArr.length == 0) {
            throw new NoSuchElementException();
        }
        Range<Integer> range3 = rangeArr[0];
        int lastIndex = ArraysKt.getLastIndex(rangeArr);
        if (lastIndex == 0) {
            return range3;
        }
        Integer num = (Integer) range3.getUpper();
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                Range<Integer> range4 = rangeArr[i2];
                Integer num2 = (Integer) range4.getUpper();
                if (num.compareTo(num2) < 0) {
                    range3 = range4;
                    num = num2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return range3;
    }

    public static final List<CameraChoice> getAllCameraChoices(Context context) throws CameraAccessException {
        CameraProperties.FacingMode facingMode;
        StreamConfigurationMap streamConfigurationMap;
        String[] strArr;
        int i;
        Range<Integer> range;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("camera");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        ArrayList arrayList = new ArrayList();
        String[] cameraIdList = cameraManager.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            String str = cameraIdList[i3];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            int iIntValue = num2 != null ? num2.intValue() : i2;
            if (num != null && num.intValue() == 0) {
                facingMode = CameraProperties.FacingMode.User;
            } else {
                facingMode = (num != null && num.intValue() == 1) ? CameraProperties.FacingMode.Environment : CameraProperties.FacingMode.Unknown;
            }
            CameraProperties.FacingMode facingMode2 = facingMode;
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && ArraysKt.contains(iArr, i2)) {
                Range<Integer> bestRange = getBestRange(cameraCharacteristics, 30);
                Class<MediaRecorder> cls = MediaRecorder.class;
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
                Intrinsics.checkNotNullExpressionValue(outputSizes, "getOutputSizes(...)");
                int length2 = outputSizes.length;
                int i4 = i2;
                while (i4 < length2) {
                    Size[] sizeArr = outputSizes;
                    Size size = sizeArr[i4];
                    int i5 = i3;
                    double outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(cls, size) / 1.0E9d;
                    Class<MediaRecorder> cls2 = cls;
                    double d = outputMinFrameDuration > 0.0d ? 1.0d / outputMinFrameDuration : 0.0d;
                    Intrinsics.checkNotNull(str);
                    Intrinsics.checkNotNull(size);
                    CameraManager cameraManager2 = cameraManager;
                    if (bestRange == null) {
                        strArr = cameraIdList;
                        int i6 = (int) d;
                        i = length;
                        range = new Range<>(Integer.valueOf(i6), Integer.valueOf(i6));
                    } else {
                        strArr = cameraIdList;
                        i = length;
                        range = bestRange;
                    }
                    arrayList.add(new CameraChoice(str, size, d, range, iIntValue, facingMode2, new ExtraCameraOptions(0L, false, 3, null)));
                    i4++;
                    outputSizes = sizeArr;
                    length2 = length2;
                    cls = cls2;
                    i3 = i5;
                    cameraManager = cameraManager2;
                    cameraIdList = strArr;
                    length = i;
                }
            }
            i3++;
            cameraManager = cameraManager;
            cameraIdList = cameraIdList;
            length = length;
            i2 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            CameraChoice cameraChoice = (CameraChoice) obj;
            if (cameraChoice.getSize().getWidth() < 2000 && cameraChoice.getSize().getHeight() < 2000) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final CameraChoices getBestCameraChoices(Context context, Camera2Utils4 cameraDirection) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        List<CameraChoice> allCameraChoices = getAllCameraChoices(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : allCameraChoices) {
            if (((CameraChoice) obj).getFacingMode() == toFacingMode(cameraDirection)) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.withpersona.sdk2.camera.camera2.Camera2UtilsKt$getBestCameraChoices$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                CameraChoice cameraChoice = (CameraChoice) t2;
                CameraChoice cameraChoice2 = (CameraChoice) t;
                return ComparisonsKt.compareValues(Integer.valueOf(cameraChoice.getSize().getWidth() * cameraChoice.getSize().getHeight()), Integer.valueOf(cameraChoice2.getSize().getWidth() * cameraChoice2.getSize().getHeight()));
            }
        });
        if (listSortedWith.isEmpty()) {
            return null;
        }
        return new CameraChoices((CameraChoice) CollectionsKt.first(listSortedWith), CollectionsKt.take(CollectionsKt.drop(listSortedWith, 1), 2));
    }

    private static final CameraProperties.FacingMode toFacingMode(Camera2Utils4 camera2Utils4) {
        int i = WhenMappings.$EnumSwitchMapping$0[camera2Utils4.ordinal()];
        if (i == 1) {
            return CameraProperties.FacingMode.User;
        }
        if (i == 2) {
            return CameraProperties.FacingMode.Environment;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return CameraProperties.FacingMode.Unknown;
    }
}
