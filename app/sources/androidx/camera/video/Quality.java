package androidx.camera.video;

import android.util.Size;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class Quality {
    public static final Quality FHD;

    /* renamed from: HD */
    public static final Quality f30HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;

    /* renamed from: SD */
    public static final Quality f31SD;
    public static final Quality UHD;

    private Quality() {
    }

    static {
        ConstantQuality constantQualityM81of = ConstantQuality.m81of(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(OptionsSimulatedReturnUtils.SMALL_DEVICE_HEIGHT_FOR_OPTIONS_SIMULATED_RETURNS, 480))));
        f31SD = constantQualityM81of;
        ConstantQuality constantQualityM81of2 = ConstantQuality.m81of(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f30HD = constantQualityM81of2;
        ConstantQuality constantQualityM81of3 = ConstantQuality.m81of(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        FHD = constantQualityM81of3;
        ConstantQuality constantQualityM81of4 = ConstantQuality.m81of(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = constantQualityM81of4;
        List list = Collections.EMPTY_LIST;
        ConstantQuality constantQualityM81of5 = ConstantQuality.m81of(0, "LOWEST", list);
        LOWEST = constantQualityM81of5;
        ConstantQuality constantQualityM81of6 = ConstantQuality.m81of(1, "HIGHEST", list);
        HIGHEST = constantQualityM81of6;
        NONE = ConstantQuality.m81of(-1, "NONE", list);
        QUALITIES = new HashSet(Arrays.asList(constantQualityM81of5, constantQualityM81of6, constantQualityM81of, constantQualityM81of2, constantQualityM81of3, constantQualityM81of4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(constantQualityM81of4, constantQualityM81of3, constantQualityM81of2, constantQualityM81of);
    }

    static boolean containsQuality(Quality quality) {
        return QUALITIES.contains(quality);
    }

    public static List<Quality> getSortedQualities() {
        return new ArrayList(QUALITIES_ORDER_BY_SIZE);
    }

    public static abstract class ConstantQuality extends Quality {
        public abstract String getName();

        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();

        public ConstantQuality() {
            super();
        }

        /* renamed from: of */
        static ConstantQuality m81of(int i, String str, List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i, str, list);
        }
    }
}
