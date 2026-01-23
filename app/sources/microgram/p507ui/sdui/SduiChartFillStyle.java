package microgram.p507ui.sdui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartFillStyle;", "", "()V", "Companion", "Lmicrogram/ui/sdui/SduiDottedChartFillStyle;", "Lmicrogram/ui/sdui/SduiGradientAnimationChartFillStyle;", "Lmicrogram/ui/sdui/SduiGradientChartFillStyle;", "Lmicrogram/ui/sdui/SduiRoundedSolidChartFillStyle;", "Lmicrogram/ui/sdui/SduiSolidChartFillStyle;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = SduiChartFillStyleSerializer.class)
/* loaded from: classes14.dex */
public abstract class SduiChartFillStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ SduiChartFillStyle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartFillStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChartFillStyle;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChartFillStyle> serializer() {
            return SduiChartFillStyleSerializer.INSTANCE;
        }
    }

    private SduiChartFillStyle() {
    }
}
