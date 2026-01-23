package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.layout.Column5;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ModalBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/material3/SheetState;", "sheetState", "content", "ModalBottomSheet", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ModalBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ModalBottomSheet(Modifier modifier, final Function0<Unit> onDismissRequest, final SheetState sheetState, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1628479504);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 7168) == 0) {
                function22 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function2M27033getLambda1$payments_ui_release = i5 == 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.m27033getLambda1$payments_ui_release() : function22;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1628479504, i3, -1, "com.truelayer.payments.ui.components.ModalBottomSheet (ModalBottomSheet.kt:15)");
                }
                int i6 = ((i3 >> 3) & 14) | 12582912 | ((i3 << 3) & 112) | (i3 & 896);
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                Function2<? super Composer, ? super Integer, Unit> function24 = function2M27033getLambda1$payments_ui_release;
                ModalBottomSheet_androidKt.m5892ModalBottomSheetdYc4hso(onDismissRequest, modifier3, sheetState, 0.0f, null, 0L, 0L, C2002Dp.m7995constructorimpl(0), 0L, null, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1607867347, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ModalBottomSheetKt.ModalBottomSheet.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                        if ((i7 & 81) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1607867347, i7, -1, "com.truelayer.payments.ui.components.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:21)");
                        }
                        function2M27033getLambda1$payments_ui_release.invoke(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, i6, 384, 3960);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function23 = function24;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                function23 = function22;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ModalBottomSheetKt.ModalBottomSheet.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        ModalBottomSheetKt.ModalBottomSheet(modifier3, onDismissRequest, sheetState, function23, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function22 = function2;
        if ((i3 & 5851) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = ((i3 >> 3) & 14) | 12582912 | ((i3 << 3) & 112) | (i3 & 896);
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            Function2<? super Composer, ? super Integer, Unit> function242 = function2M27033getLambda1$payments_ui_release;
            ModalBottomSheet_androidKt.m5892ModalBottomSheetdYc4hso(onDismissRequest, modifier3, sheetState, 0.0f, null, 0L, 0L, C2002Dp.m7995constructorimpl(0), 0L, null, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1607867347, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ModalBottomSheetKt.ModalBottomSheet.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i7) {
                    Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((i7 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1607867347, i7, -1, "com.truelayer.payments.ui.components.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:21)");
                    }
                    function2M27033getLambda1$payments_ui_release.invoke(composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, i62, 384, 3960);
            if (ComposerKt.isTraceInProgress()) {
            }
            function23 = function242;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
