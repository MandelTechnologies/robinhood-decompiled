package com.robinhood.shared.common.etpcomposition;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Helpers.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a!\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"getComposeColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", "(Lcom/robinhood/models/db/bonfire/etp/EtpHolding;Landroidx/compose/runtime/Composer;I)J", "toComposeColor", "Lcom/robinhood/models/db/bonfire/etp/EtpHolding$CustomColor;", "(Lcom/robinhood/models/db/bonfire/etp/EtpHolding$CustomColor;Landroidx/compose/runtime/Composer;I)J", "formatWeight", "", "Ljava/math/BigDecimal;", "createTint", "factor", "", "targetColor", "createTint-1VYSb5o", "(JFJ)J", "getVehicleColor", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "totalCount", "maxTint", "getVehicleColor-0Hk2hKA", "(JIIFJ)J", "lib-etp-composition_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.etpcomposition.HelpersKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Helpers6 {
    public static final long getComposeColor(EtpHolding etpHolding, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(etpHolding, "<this>");
        composer.startReplaceGroup(-1037745949);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1037745949, i, -1, "com.robinhood.shared.common.etpcomposition.getComposeColor (Helpers.kt:15)");
        }
        EtpHolding.CustomColor customColor = etpHolding.getCustomColor();
        composer.startReplaceGroup(-841441869);
        Color composeColor = null;
        Color colorM6701boximpl = customColor == null ? null : Color.m6701boximpl(toComposeColor(customColor, composer, 0));
        composer.endReplaceGroup();
        composer.startReplaceGroup(-841442395);
        if (colorM6701boximpl == null) {
            ThemedColor color = etpHolding.getColor();
            if (color != null) {
                composeColor = SduiColors2.toComposeColor(color, composer, 0);
            }
        } else {
            composeColor = colorM6701boximpl;
        }
        composer.endReplaceGroup();
        long jM21368getAccent0d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21368getAccent0d7_KjU() : composeColor.getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21368getAccent0d7_KjU;
    }

    public static final long toComposeColor(EtpHolding.CustomColor customColor, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(customColor, "<this>");
        composer.startReplaceGroup(1168657872);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1168657872, i, -1, "com.robinhood.shared.common.etpcomposition.toComposeColor (Helpers.kt:19)");
        }
        long jColor = Color2.Color(android.graphics.Color.parseColor(((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).isDay(composer, 0) ? customColor.getLightHex() : customColor.getDarkHex()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jColor;
    }

    public static final String formatWeight(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return Formats.getPercentFormat().format(bigDecimal);
    }

    /* renamed from: createTint-1VYSb5o, reason: not valid java name */
    public static final long m24835createTint1VYSb5o(long j, float f, long j2) {
        return Color2.m6733lerpjxsXWHM(j, j2, f);
    }

    /* renamed from: getVehicleColor-0Hk2hKA$default, reason: not valid java name */
    public static /* synthetic */ long m24837getVehicleColor0Hk2hKA$default(long j, int i, int i2, float f, long j2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f = 0.5f;
        }
        float f2 = f;
        if ((i3 & 8) != 0) {
            j2 = Color.INSTANCE.m6727getWhite0d7_KjU();
        }
        return m24836getVehicleColor0Hk2hKA(j, i, i2, f2, j2);
    }

    /* renamed from: getVehicleColor-0Hk2hKA, reason: not valid java name */
    public static final long m24836getVehicleColor0Hk2hKA(long j, int i, int i2, float f, long j2) {
        if (i2 <= 1) {
            return j;
        }
        return m24835createTint1VYSb5o(j, RangesKt.coerceIn(i * (f / (i2 - 1)), 0.0f, 1.0f), j2);
    }
}
