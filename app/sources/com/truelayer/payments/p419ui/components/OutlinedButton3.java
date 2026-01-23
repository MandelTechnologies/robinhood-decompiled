package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OutlinedButton.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aC\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/Function0;", "", "onClick", "content", "OutlinedButton", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.OutlinedButtonKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class OutlinedButton3 {
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
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(Modifier modifier, boolean z, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Function0<Unit> function02;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function2M27034getLambda1$payments_ui_release;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final Function0<Unit> function03;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-741526170);
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
                        function2M27034getLambda1$payments_ui_release = function2;
                        i3 |= composerStartRestartGroup.changedInstance(function2M27034getLambda1$payments_ui_release) ? 2048 : 1024;
                    }
                    if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i7 == 0 ? true : z2;
                        Function0<Unit> function04 = i4 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.OutlinedButtonKt.OutlinedButton.1
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
                            function2M27034getLambda1$payments_ui_release = OutlinedButton.INSTANCE.m27034getLambda1$payments_ui_release();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-741526170, i3, -1, "com.truelayer.payments.ui.components.OutlinedButton (OutlinedButton.kt:13)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function2M27034getLambda1$payments_ui_release;
                        int i8 = ((i3 >> 6) & 14) | 805306368;
                        int i9 = i3 << 3;
                        int i10 = i8 | (i9 & 112) | (i9 & 896);
                        Function0<Unit> function05 = function04;
                        Modifier modifier5 = modifier4;
                        boolean z5 = z4;
                        ButtonKt.OutlinedButton(function05, modifier5, z5, null, ButtonDefaults.INSTANCE.m5724outlinedButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface(), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, null, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, 992827572, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.OutlinedButtonKt.OutlinedButton.2
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

                            public final void invoke(Row5 OutlinedButton, Composer composer2, int i11) {
                                Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                                if ((i11 & 81) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(992827572, i11, -1, "com.truelayer.payments.ui.components.OutlinedButton.<anonymous> (OutlinedButton.kt:22)");
                                }
                                function23.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, i10, 488);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function23;
                        function03 = function05;
                        modifier3 = modifier5;
                        z3 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        function03 = function02;
                        function22 = function2M27034getLambda1$payments_ui_release;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.OutlinedButtonKt.OutlinedButton.3
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

                            public final void invoke(Composer composer2, int i11) {
                                OutlinedButton3.OutlinedButton(modifier3, z3, function03, function22, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function2M27034getLambda1$payments_ui_release = function2;
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
                    final Function2<? super Composer, ? super Integer, Unit> function232 = function2M27034getLambda1$payments_ui_release;
                    int i82 = ((i3 >> 6) & 14) | 805306368;
                    int i92 = i3 << 3;
                    int i102 = i82 | (i92 & 112) | (i92 & 896);
                    Function0<Unit> function052 = function04;
                    Modifier modifier52 = modifier4;
                    boolean z52 = z4;
                    ButtonKt.OutlinedButton(function052, modifier52, z52, null, ButtonDefaults.INSTANCE.m5724outlinedButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface(), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13), null, null, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, 992827572, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.OutlinedButtonKt.OutlinedButton.2
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

                        public final void invoke(Row5 OutlinedButton, Composer composer2, int i11) {
                            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                            if ((i11 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(992827572, i11, -1, "com.truelayer.payments.ui.components.OutlinedButton.<anonymous> (OutlinedButton.kt:22)");
                            }
                            function232.invoke(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, i102, 488);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function22 = function232;
                    function03 = function052;
                    modifier3 = modifier52;
                    z3 = z52;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function2M27034getLambda1$payments_ui_release = function2;
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
        function2M27034getLambda1$payments_ui_release = function2;
        if ((i3 & 5851) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
