package com.robinhood.android.microgramsdui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.shared.compose.color.LinearGradientColor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.p507ui.p508v1.LinearGradientColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: Colors.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"toLinearGradientColor", "Lcom/robinhood/shared/compose/color/LinearGradientColor;", "Lmicrogram/ui/v1/LinearGradientColorDto;", "alpha", "", "(Lmicrogram/ui/v1/LinearGradientColorDto;FLandroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/compose/color/LinearGradientColor;", "toComposeColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyThemedColor;", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "lib-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.microgramsdui.ColorsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Colors4 {
    public static final LinearGradientColor toLinearGradientColor(LinearGradientColorDto linearGradientColorDto, float f, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(linearGradientColorDto, "<this>");
        composer.startReplaceGroup(-114472628);
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-114472628, i, -1, "com.robinhood.android.microgramsdui.toLinearGradientColor (Colors.kt:11)");
        }
        List<LinearGradientColorDto.ColorStopDto> color_stops = linearGradientColorDto.getColor_stops();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(color_stops, 10));
        for (LinearGradientColorDto.ColorStopDto colorStopDto : color_stops) {
            Float fValueOf = Float.valueOf((float) colorStopDto.getStop());
            ThemedColorDto color = colorStopDto.getColor();
            composer.startReplaceGroup(1660959868);
            Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer, 0);
            composer.endReplaceGroup();
            arrayList.add(Tuples4.m3642to(fValueOf, Color.m6701boximpl(composeColor != null ? Color.m6705copywmQWz5c$default(composeColor.getValue(), f2, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m6726getUnspecified0d7_KjU())));
        }
        LinearGradientColor linearGradientColor = new LinearGradientColor((float) linearGradientColorDto.getAngle(), arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linearGradientColor;
    }

    public static final Color toComposeColor(UiObject<ThemedColor, ThemedColorDto> uiObject, Composer composer, int i) {
        Color composeColor;
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        composer.startReplaceGroup(277450784);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(277450784, i, -1, "com.robinhood.android.microgramsdui.toComposeColor (Colors.kt:19)");
        }
        if (uiObject instanceof UiObject.Legacy) {
            composer.startReplaceGroup(342234160);
            composeColor = SduiColors2.toComposeColor((ThemedColor) ((UiObject.Legacy) uiObject).getValue(), composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(uiObject instanceof UiObject.Idl)) {
                composer.startReplaceGroup(342232782);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(342235632);
            composeColor = SduiColors2.toComposeColor((ThemedColorDto) ((UiObject.Idl) uiObject).getValue(), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return composeColor;
    }
}
