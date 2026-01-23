package com.google.accompanist.navigation.material;

import androidx.compose.foundation.layout.Column5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetNavigator.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.accompanist.navigation.material.ComposableSingletons$BottomSheetNavigatorKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class BottomSheetNavigator5 {
    public static final BottomSheetNavigator5 INSTANCE = new BottomSheetNavigator5();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function4<Column5, NavBackStackEntry, Composer, Integer, Unit> f8593lambda1 = ComposableLambda3.composableLambdaInstance(-819710375, false, new Function4<Column5, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.google.accompanist.navigation.material.ComposableSingletons$BottomSheetNavigatorKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(column5, navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 $receiver, NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819710375, i, -1, "com.google.accompanist.navigation.material.ComposableSingletons$BottomSheetNavigatorKt.lambda-1.<anonymous> (BottomSheetNavigator.kt:225)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$navigation_material_release, reason: not valid java name */
    public final Function4<Column5, NavBackStackEntry, Composer, Integer, Unit> m9190getLambda1$navigation_material_release() {
        return f8593lambda1;
    }
}
