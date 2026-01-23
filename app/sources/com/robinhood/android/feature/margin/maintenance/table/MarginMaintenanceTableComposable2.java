package com.robinhood.android.feature.margin.maintenance.table;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.lib.screener.DisplayScreenerCellsKt;
import com.robinhood.android.lib.screener.ScreenTableCells;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginMaintenanceTableComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.maintenance.table.ComposableSingletons$MarginMaintenanceTableComposableKt$lambda$1255615434$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginMaintenanceTableComposable2 implements Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> {
    public static final MarginMaintenanceTableComposable2 INSTANCE = new MarginMaintenanceTableComposable2();

    MarginMaintenanceTableComposable2() {
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Unit invoke(GenericCell genericCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num) {
        m14508invokeC8IHX40(genericCell, c2002Dp, c2002Dp2, displayDetails, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-C8IHX40, reason: not valid java name */
    public final void m14508invokeC8IHX40(GenericCell cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1255615434, i, -1, "com.robinhood.android.feature.margin.maintenance.table.ComposableSingletons$MarginMaintenanceTableComposableKt.lambda$1255615434.<anonymous> (MarginMaintenanceTableComposable.kt:90)");
        }
        ScreenTableCells screenTableCells = (ScreenTableCells) cell;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.feature.margin.maintenance.table.ComposableSingletons$MarginMaintenanceTableComposableKt$lambda$1255615434$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginMaintenanceTableComposable2.invoke_C8IHX40$lambda$1$lambda$0(((Boolean) obj).booleanValue(), (UUID) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.margin.maintenance.table.ComposableSingletons$MarginMaintenanceTableComposableKt$lambda$1255615434$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.feature.margin.maintenance.table.ComposableSingletons$MarginMaintenanceTableComposableKt$lambda$1255615434$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        DisplayScreenerCellsKt.m15870DisplayScreenerCellwYrrvMY(screenTableCells, c2002Dp, c2002Dp2, displayDetails, function2, function0, (Function0) objRememberedValue3, composer, (i & 112) | 1794048 | (i & 896) | (DisplayDetails.$stable << 9) | (i & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke_C8IHX40$lambda$1$lambda$0(boolean z, UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<unused var>");
        return Unit.INSTANCE;
    }
}
