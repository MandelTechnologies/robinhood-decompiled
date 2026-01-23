package com.truelayer.payments.p419ui.components.toolbars;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccessibleTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aP\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "title", "Lkotlin/Function0;", "", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "AccessibleTopAppBar", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.toolbars.AccessibleTopAppBarKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AccessibleTopAppBar2 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccessibleTopAppBar(Modifier modifier, String str, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i5;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        final Modifier modifier3;
        final String str3;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1082132138);
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
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 7168) == 0) {
                        function32 = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    }
                    if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        str3 = i7 == 0 ? null : str2;
                        Function2<? super Composer, ? super Integer, Unit> function2M27066getLambda1$payments_ui_release = i4 == 0 ? AccessibleTopAppBar4.INSTANCE.m27066getLambda1$payments_ui_release() : function22;
                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M27067getLambda2$payments_ui_release = i5 == 0 ? AccessibleTopAppBar4.INSTANCE.m27067getLambda2$payments_ui_release() : function32;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1082132138, i3, -1, "com.truelayer.payments.ui.components.toolbars.AccessibleTopAppBar (AccessibleTopAppBar.kt:20)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1835580242);
                        z = (i3 & 112) != 32;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.AccessibleTopAppBarKt$AccessibleTopAppBar$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    String str4 = str3;
                                    if (str4 != null) {
                                        SemanticsPropertiesKt.setContentDescription(semantics, str4);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Function2<? super Composer, ? super Integer, Unit> function24 = function2M27066getLambda1$payments_ui_release;
                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34 = function3M27067getLambda2$payments_ui_release;
                        AppBarKt.TopAppBar(AccessibleTopAppBar4.INSTANCE.m27068getLambda3$payments_ui_release(), SemanticsModifier6.semantics(modifier3, true, (Function1) objRememberedValue), function24, function34, null, TopAppBarDefaults.INSTANCE.m6088topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getBackground(), 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 15, 30), null, composer2, (i3 & 896) | 6 | (i3 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function23 = function24;
                        function33 = function34;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        str3 = str2;
                        function23 = function22;
                        function33 = function32;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.AccessibleTopAppBarKt.AccessibleTopAppBar.2
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

                            public final void invoke(Composer composer3, int i8) {
                                AccessibleTopAppBar2.AccessibleTopAppBar(modifier3, str3, function23, function33, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function32 = function3;
                if ((i3 & 5851) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1835580242);
                    if ((i3 & 112) != 32) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.AccessibleTopAppBarKt$AccessibleTopAppBar$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                String str4 = str3;
                                if (str4 != null) {
                                    SemanticsPropertiesKt.setContentDescription(semantics, str4);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Function2<? super Composer, ? super Integer, Unit> function242 = function2M27066getLambda1$payments_ui_release;
                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function342 = function3M27067getLambda2$payments_ui_release;
                        AppBarKt.TopAppBar(AccessibleTopAppBar4.INSTANCE.m27068getLambda3$payments_ui_release(), SemanticsModifier6.semantics(modifier3, true, (Function1) objRememberedValue), function242, function342, null, TopAppBarDefaults.INSTANCE.m6088topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getBackground(), 0L, 0L, 0L, 0L, composer2, TopAppBarDefaults.$stable << 15, 30), null, composer2, (i3 & 896) | 6 | (i3 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function23 = function242;
                        function33 = function342;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function32 = function3;
            if ((i3 & 5851) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str2 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function32 = function3;
        if ((i3 & 5851) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
