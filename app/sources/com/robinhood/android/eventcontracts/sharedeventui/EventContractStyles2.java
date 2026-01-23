package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.vector.PathParser;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.SportsBackgroundData;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WaveBackgroundData;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WaveBackgroundData2;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcImageStyle;
import com.robinhood.utils.compose.extensions.Colors8;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventContractStyles.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0005*\u00020\u0005H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\u001a\u0017\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\u001a\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"buildPath", "Landroidx/compose/ui/graphics/Path;", "pathData", "", "darken", "Landroidx/compose/ui/graphics/Color;", "darken-8_81llA", "(J)J", "forOrderForm", "Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/EventContractBackgroundData;", "imageStyle", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;", "dayNightColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "isDay", "", "forOrderFormGeneric", "Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/WaveBackgroundData;", ResourceTypes.COLOR, "forOrderFormGeneric-8_81llA", "(J)Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/WaveBackgroundData;", "forReceiptPreview", "forReceiptGeneric", "forReceiptGeneric-8_81llA", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.EventContractStylesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventContractStyles2 {

    /* compiled from: EventContractStyles.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.EventContractStylesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcImageStyle.values().length];
            try {
                iArr[EcImageStyle.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EcImageStyle.SPORTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Path buildPath(String str) {
        return PathParser.toPath$default(new PathParser().parsePathString(str), null, 1, null);
    }

    /* renamed from: darken-8_81llA, reason: not valid java name */
    private static final long m14368darken8_81llA(long j) {
        return Colors8.m26601blendWithjxsXWHM(j, Color.INSTANCE.m6716getBlack0d7_KjU(), 0.8f);
    }

    public static final WaveBackgroundData2 forOrderForm(EcImageStyle imageStyle, DayNightColor dayNightColor, boolean z) {
        Intrinsics.checkNotNullParameter(imageStyle, "imageStyle");
        Intrinsics.checkNotNullParameter(dayNightColor, "dayNightColor");
        int i = WhenMappings.$EnumSwitchMapping$0[imageStyle.ordinal()];
        if (i == 1) {
            return m14369forOrderFormGeneric8_81llA(dayNightColor.m14362colorvNxB06k(z));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new SportsBackgroundData(dayNightColor.m14366getDayColor0d7_KjU(), null);
    }

    /* renamed from: forOrderFormGeneric-8_81llA, reason: not valid java name */
    private static final WaveBackgroundData m14369forOrderFormGeneric8_81llA(long j) {
        long jM14368darken8_81llA = m14368darken8_81llA(j);
        return new WaveBackgroundData(C16594R.drawable.swipe_pattern, buildPath("M-3.14,0h399.29v850.98h-399.29z"), Brush.Companion.m6681radialGradientP_VxKs$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j)), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(jM14368darken8_81llA))}, Offset.m6535constructorimpl((Float.floatToRawIntBits(429.16f) << 32) | (Float.floatToRawIntBits(396.67f) & 4294967295L)), 564.91f, 0, 8, (Object) null), jM14368darken8_81llA, null);
    }

    public static final WaveBackgroundData2 forReceiptPreview(EcImageStyle imageStyle, DayNightColor dayNightColor, boolean z) {
        Intrinsics.checkNotNullParameter(imageStyle, "imageStyle");
        Intrinsics.checkNotNullParameter(dayNightColor, "dayNightColor");
        int i = WhenMappings.$EnumSwitchMapping$0[imageStyle.ordinal()];
        if (i == 1) {
            return m14370forReceiptGeneric8_81llA(dayNightColor.m14367getNightColor0d7_KjU());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new SportsBackgroundData(dayNightColor.m14366getDayColor0d7_KjU(), null);
    }

    /* renamed from: forReceiptGeneric-8_81llA, reason: not valid java name */
    private static final WaveBackgroundData m14370forReceiptGeneric8_81llA(long j) {
        return new WaveBackgroundData(C16594R.drawable.receipt_pattern, buildPath("M-1.89,0h399.77v852h-399.77z"), Brush.Companion.m6681radialGradientP_VxKs$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.22f), Color.m6701boximpl(j)), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(m14368darken8_81llA(j)))}, Offset.m6535constructorimpl((Float.floatToRawIntBits(269.35f) << 32) | (Float.floatToRawIntBits(109.12f) & 4294967295L)), 1148.33f, 0, 8, (Object) null), j, null);
    }
}
