package com.robinhood.android.navigation.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalBottomBarHeightConstant.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0006\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"LocalBottomBarHeightConstant", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalBottomBarHeightConstant", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "bottomBarConstantPadding", "Landroidx/compose/ui/Modifier;", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.compose.LocalBottomBarHeightConstantKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class LocalBottomBarHeightConstant {
    private static final CompositionLocal6<C2002Dp> LocalBottomBarHeightConstant = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.navigation.compose.LocalBottomBarHeightConstantKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalBottomBarHeightConstant.LocalBottomBarHeightConstant$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp LocalBottomBarHeightConstant$lambda$0() {
        return null;
    }

    public static final CompositionLocal6<C2002Dp> getLocalBottomBarHeightConstant() {
        return LocalBottomBarHeightConstant;
    }

    public static final Modifier bottomBarConstantPadding(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.navigation.compose.LocalBottomBarHeightConstantKt.bottomBarConstantPadding.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Modifier modifier2;
                Modifier modifierM5146paddingqDBjuR0$default;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-1719465105);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1719465105, i, -1, "com.robinhood.android.navigation.compose.bottomBarConstantPadding.<anonymous> (LocalBottomBarHeightConstant.kt:22)");
                }
                C2002Dp c2002Dp = (C2002Dp) composer.consume(LocalBottomBarHeightConstant.getLocalBottomBarHeightConstant());
                if (c2002Dp != null) {
                    modifier2 = composed;
                    modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, c2002Dp.getValue(), 7, null);
                    if (modifierM5146paddingqDBjuR0$default == null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifierM5146paddingqDBjuR0$default;
                }
                modifier2 = composed;
                modifierM5146paddingqDBjuR0$default = modifier2;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                return modifierM5146paddingqDBjuR0$default;
            }
        }, 1, null);
    }
}
