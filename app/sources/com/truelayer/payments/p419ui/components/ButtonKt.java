package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.theme.Spacing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: Button.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/Function0;", "", "onClick", "content", "Button", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", AnnotatedPrivateKey.LABEL, "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(Modifier modifier, boolean z, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Function0<Unit> function02;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function2M27026getLambda1$payments_ui_release;
        final Modifier modifier3;
        final Function0<Unit> function03;
        final boolean z3;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1427947046);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 7168) == 0) {
                        function2M27026getLambda1$payments_ui_release = function2;
                        i3 |= composerStartRestartGroup.changedInstance(function2M27026getLambda1$payments_ui_release) ? 2048 : 1024;
                    }
                    if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i7 == 0 ? true : z2;
                        Function0<Unit> function04 = i4 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.ButtonKt.Button.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        } : function02;
                        if (i5 != 0) {
                            function2M27026getLambda1$payments_ui_release = ComposableSingletons$ButtonKt.INSTANCE.m27026getLambda1$payments_ui_release();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1427947046, i3, -1, "com.truelayer.payments.ui.components.Button (Button.kt:20)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i8 = MaterialTheme.$stable;
                        long primary = materialTheme.getColorScheme(composerStartRestartGroup, i8).getPrimary();
                        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i8).getOnSurface(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function2M27026getLambda1$payments_ui_release;
                        Function0<Unit> function05 = function04;
                        boolean z5 = z4;
                        androidx.compose.material3.ButtonKt.Button(function05, modifierFillMaxWidth$default, z5, null, buttonDefaults.m5719buttonColorsro_MJ88(primary, materialTheme.getColorScheme(composerStartRestartGroup, i8).getOnPrimary(), 0L, jM6705copywmQWz5c$default, composerStartRestartGroup, ButtonDefaults.$stable << 12, 4), null, null, PaddingKt.m5136PaddingValuesYgX7TsA(Spacing.INSTANCE.m27174getLARGED9Ej5fM(), C2002Dp.m7995constructorimpl(12)), null, ComposableLambda3.composableLambda(composerStartRestartGroup, -938094538, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ButtonKt.Button.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                invoke(row5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 Button, Composer composer2, int i9) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i9 & 81) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-938094538, i9, -1, "com.truelayer.payments.ui.components.Button.<anonymous> (Button.kt:32)");
                                }
                                function23.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 6) & 14) | 817889280 | ((i3 << 3) & 896), 360);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function03 = function05;
                        z3 = z5;
                        function22 = function23;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        function03 = function02;
                        function22 = function2M27026getLambda1$payments_ui_release;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ButtonKt.Button.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                ButtonKt.Button(modifier3, z3, function03, function22, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function2M27026getLambda1$payments_ui_release = function2;
                if ((i3 & 5851) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i82 = MaterialTheme.$stable;
                    long primary2 = materialTheme2.getColorScheme(composerStartRestartGroup, i82).getPrimary();
                    long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i82).getOnSurface(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    final Function2<? super Composer, ? super Integer, Unit> function232 = function2M27026getLambda1$payments_ui_release;
                    Function0<Unit> function052 = function04;
                    boolean z52 = z4;
                    androidx.compose.material3.ButtonKt.Button(function052, modifierFillMaxWidth$default2, z52, null, buttonDefaults2.m5719buttonColorsro_MJ88(primary2, materialTheme2.getColorScheme(composerStartRestartGroup, i82).getOnPrimary(), 0L, jM6705copywmQWz5c$default2, composerStartRestartGroup, ButtonDefaults.$stable << 12, 4), null, null, PaddingKt.m5136PaddingValuesYgX7TsA(Spacing.INSTANCE.m27174getLARGED9Ej5fM(), C2002Dp.m7995constructorimpl(12)), null, ComposableLambda3.composableLambda(composerStartRestartGroup, -938094538, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ButtonKt.Button.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                            invoke(row5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 Button, Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i9 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-938094538, i9, -1, "com.truelayer.payments.ui.components.Button.<anonymous> (Button.kt:32)");
                            }
                            function232.invoke(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i3 >> 6) & 14) | 817889280 | ((i3 << 3) & 896), 360);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function03 = function052;
                    z3 = z52;
                    function22 = function232;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function2M27026getLambda1$payments_ui_release = function2;
            if ((i3 & 5851) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function2M27026getLambda1$payments_ui_release = function2;
        if ((i3 & 5851) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void Button(Modifier modifier, boolean z, Function0<Unit> function0, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        final boolean z2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-501199697);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i4 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            boolean z3 = i6 != 0 ? true : z;
            if (i7 != 0) {
                function0 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.ButtonKt.Button.4
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            Function0<Unit> function03 = function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-501199697, i4, -1, "com.truelayer.payments.ui.components.Button (Button.kt:42)");
            }
            Modifier modifier3 = modifier;
            Button(modifier3, z3, function03, ComposableLambda3.composableLambda(composerStartRestartGroup, 1690102061, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ButtonKt.Button.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1690102061, i8, -1, "com.truelayer.payments.ui.components.Button.<anonymous> (Button.kt:48)");
                    }
                    TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(i, composer2, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i4 & 14) | 3072 | (i4 & 112) | (i4 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            z2 = z3;
            function02 = function03;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ButtonKt.Button.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ButtonKt.Button(modifier2, z2, function02, i, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }
}
