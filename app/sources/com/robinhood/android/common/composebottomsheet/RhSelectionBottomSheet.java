package com.robinhood.android.common.composebottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhSelectionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhSelectionBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhSelectionBottomSheet {
    public static final RhSelectionBottomSheet INSTANCE = new RhSelectionBottomSheet();
    private static Function2<Composer, Integer, Unit> lambda$1205070960 = ComposableLambda3.composableLambdaInstance(1205070960, false, RhSelectionBottomSheet2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$305070269 = ComposableLambda3.composableLambdaInstance(305070269, false, RhSelectionBottomSheet3.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1205070960$lib_compose_bottom_sheet_externalDebug() {
        return lambda$1205070960;
    }

    public final Function2<Composer, Integer, Unit> getLambda$305070269$lib_compose_bottom_sheet_externalDebug() {
        return lambda$305070269;
    }
}
