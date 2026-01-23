package com.robinhood.android.portfolio.positions.display;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionsDisplayOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.positions.display.ComposableSingletons$PositionsDisplayOptionsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PositionsDisplayOptionsComposable {
    public static final PositionsDisplayOptionsComposable INSTANCE = new PositionsDisplayOptionsComposable();
    private static Function2<Composer, Integer, Unit> lambda$210413746 = ComposableLambda3.composableLambdaInstance(210413746, false, PositionsDisplayOptionsComposable2.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$210413746$lib_positions_externalDebug() {
        return lambda$210413746;
    }
}
