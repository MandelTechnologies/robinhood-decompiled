package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Strings.android.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m3636d2 = {"getString", "", "string", "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class Strings_androidKt {
    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m5642getString4foXLRw(int i, Composer composer, int i2) {
        String string2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.INSTANCE;
        if (Strings.m5633equalsimpl0(i, companion.m5638getNavigationMenuUdPEhr4())) {
            string2 = resources.getString(androidx.compose.p011ui.R$string.navigation_menu);
        } else if (Strings.m5633equalsimpl0(i, companion.m5634getCloseDrawerUdPEhr4())) {
            string2 = resources.getString(androidx.compose.p011ui.R$string.close_drawer);
        } else if (Strings.m5633equalsimpl0(i, companion.m5635getCloseSheetUdPEhr4())) {
            string2 = resources.getString(androidx.compose.p011ui.R$string.close_sheet);
        } else if (Strings.m5633equalsimpl0(i, companion.m5636getDefaultErrorMessageUdPEhr4())) {
            string2 = resources.getString(androidx.compose.p011ui.R$string.default_error_message);
        } else if (Strings.m5633equalsimpl0(i, companion.m5637getExposedDropdownMenuUdPEhr4())) {
            string2 = resources.getString(androidx.compose.p011ui.R$string.dropdown_menu);
        } else if (Strings.m5633equalsimpl0(i, companion.m5640getSliderRangeStartUdPEhr4())) {
            string2 = resources.getString(androidx.compose.p011ui.R$string.range_start);
        } else if (Strings.m5633equalsimpl0(i, companion.m5639getSliderRangeEndUdPEhr4())) {
            string2 = resources.getString(androidx.compose.p011ui.R$string.range_end);
        } else {
            string2 = Strings.m5633equalsimpl0(i, companion.m5641getSnackbarPaneTitleUdPEhr4()) ? resources.getString(R$string.mc2_snackbar_pane_title) : "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string2;
    }
}
