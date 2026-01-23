package com.robinhood.android.creditcard.p091ui.creditapplication;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditApplicationScaffold.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Landroidx/compose/ui/Modifier;", "modifier", "", "loggingIdentifier", "Lkotlin/Function0;", "", "onBackPress", "onClosePress", "onHelpPress", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "topBarActions", "bottomBar", "snackbarHost", "Landroidx/compose/ui/graphics/Color;", "overrideHeaderBackground", "", "largeGradientBackground", "hideTopBar", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "CreditApplicationScaffold-TuSUGN0", "(Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Color;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CreditApplicationScaffold", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CreditApplicationScaffoldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreditApplicationScaffold_TuSUGN0$lambda$0(Screen screen, Modifier modifier, String str, Function0 function0, Function0 function02, Function0 function03, Function3 function3, Function2 function2, Function2 function22, Color color, boolean z, boolean z2, Function3 function32, int i, int i2, int i3, Composer composer, int i4) {
        m12623CreditApplicationScaffoldTuSUGN0(screen, modifier, str, function0, function02, function03, function3, function2, function22, color, z, z2, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* renamed from: CreditApplicationScaffold-TuSUGN0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12623CreditApplicationScaffoldTuSUGN0(final Screen screen, Modifier modifier, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Color color, boolean z, boolean z2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        String str2;
        int i6;
        Function0<Unit> function04;
        int i7;
        Function0<Unit> function05;
        int i8;
        Function0<Unit> function06;
        int i9;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M12619getLambda$778111950$feature_credit_card_externalDebug;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Color color2;
        Composer composer2;
        final boolean z3;
        final Modifier modifier3;
        final Function0<Unit> function07;
        final String str3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function0<Unit> function08;
        final Function0<Unit> function09;
        final Color color3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-156832521);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str2 = str;
                    i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function04 = function0;
                        i4 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function05 = function02;
                            i4 |= composerStartRestartGroup.changedInstance(function05) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            function06 = function03;
                        } else {
                            function06 = function03;
                            if ((i & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function06) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            function3M12619getLambda$778111950$feature_credit_card_externalDebug = function3;
                        } else {
                            function3M12619getLambda$778111950$feature_credit_card_externalDebug = function3;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function3M12619getLambda$778111950$feature_credit_card_externalDebug) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else {
                            if ((i & 100663296) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changedInstance(function22) ? 67108864 : 33554432;
                            }
                            i13 = i3 & 512;
                            if (i13 != 0) {
                                if ((i & 805306368) == 0) {
                                    i14 = i13;
                                    i4 |= composerStartRestartGroup.changed(color) ? 536870912 : 268435456;
                                }
                                i15 = i3 & 1024;
                                if (i15 != 0) {
                                    i17 = i2 | 6;
                                    i16 = i15;
                                } else if ((i2 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i2 | (composerStartRestartGroup.changed(z) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                i18 = i3 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i2 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i21 = i17;
                                if ((i3 & 4096) != 0) {
                                    i21 |= 384;
                                } else if ((i2 & 384) == 0) {
                                    i21 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
                                }
                                if ((306783379 & i4) == 306783378 && (i21 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function23 = function2;
                                    z4 = z2;
                                    composer2 = composerStartRestartGroup;
                                    str3 = str2;
                                    function08 = function04;
                                    function07 = function05;
                                    function09 = function06;
                                    modifier3 = modifier2;
                                    function24 = function22;
                                    color3 = color;
                                    z3 = z;
                                } else {
                                    Modifier modifier4 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i5 != 0) {
                                        str2 = null;
                                    }
                                    if (i6 != 0) {
                                        function04 = null;
                                    }
                                    Function0<Unit> function010 = i7 == 0 ? null : function05;
                                    Function0<Unit> function011 = i8 == 0 ? null : function06;
                                    if (i9 != 0) {
                                        function3M12619getLambda$778111950$feature_credit_card_externalDebug = ComposableSingletons$CreditApplicationScaffoldKt.INSTANCE.m12619getLambda$778111950$feature_credit_card_externalDebug();
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> lambda$681092627$feature_credit_card_externalDebug = i10 == 0 ? ComposableSingletons$CreditApplicationScaffoldKt.INSTANCE.getLambda$681092627$feature_credit_card_externalDebug() : function2;
                                    Function2<? super Composer, ? super Integer, Unit> lambda$277027922$feature_credit_card_externalDebug = i12 == 0 ? ComposableSingletons$CreditApplicationScaffoldKt.INSTANCE.getLambda$277027922$feature_credit_card_externalDebug() : function22;
                                    Color color4 = i14 == 0 ? color : null;
                                    boolean z5 = i16 == 0 ? false : z;
                                    boolean z6 = i19 == 0 ? z2 : false;
                                    Modifier modifier5 = modifier4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        color2 = color4;
                                    } else {
                                        color2 = color4;
                                        ComposerKt.traceEventStart(-156832521, i4, i21, "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffold (CreditApplicationScaffold.kt:58)");
                                    }
                                    boolean z7 = z5;
                                    boolean z8 = z6;
                                    Function0<Unit> function012 = function04;
                                    Function2<? super Composer, ? super Integer, Unit> function25 = lambda$681092627$feature_credit_card_externalDebug;
                                    Function2<? super Composer, ? super Integer, Unit> function26 = lambda$277027922$feature_credit_card_externalDebug;
                                    String str4 = str2;
                                    composer2 = composerStartRestartGroup;
                                    BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-265267025, true, new CreditApplicationScaffoldKt$CreditApplicationScaffold$1(color2, z7, screen, str4, modifier5, function25, function26, content, z8, function012, function010, function011, function3M12619getLambda$778111950$feature_credit_card_externalDebug), composerStartRestartGroup, 54), composer2, 100663686, 250);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    Function0<Unit> function013 = function010;
                                    z3 = z7;
                                    modifier3 = modifier5;
                                    function07 = function013;
                                    str3 = str4;
                                    function23 = function25;
                                    function08 = function012;
                                    function09 = function011;
                                    color3 = color2;
                                    z4 = z8;
                                    function24 = function26;
                                }
                                final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32 = function3M12619getLambda$778111950$feature_credit_card_externalDebug;
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return CreditApplicationScaffoldKt.CreditApplicationScaffold_TuSUGN0$lambda$0(screen, modifier3, str3, function08, function07, function09, function32, function23, function24, color3, z3, z4, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= 805306368;
                            i14 = i13;
                            i15 = i3 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i3 & 2048;
                            if (i18 != 0) {
                            }
                            int i212 = i17;
                            if ((i3 & 4096) != 0) {
                            }
                            if ((306783379 & i4) == 306783378) {
                                if (i20 == 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                Modifier modifier52 = modifier4;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                boolean z72 = z5;
                                boolean z82 = z6;
                                Function0<Unit> function0122 = function04;
                                Function2<? super Composer, ? super Integer, Unit> function252 = lambda$681092627$feature_credit_card_externalDebug;
                                Function2<? super Composer, ? super Integer, Unit> function262 = lambda$277027922$feature_credit_card_externalDebug;
                                String str42 = str2;
                                composer2 = composerStartRestartGroup;
                                BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-265267025, true, new CreditApplicationScaffoldKt$CreditApplicationScaffold$1(color2, z72, screen, str42, modifier52, function252, function262, content, z82, function0122, function010, function011, function3M12619getLambda$778111950$feature_credit_card_externalDebug), composerStartRestartGroup, 54), composer2, 100663686, 250);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Function0<Unit> function0132 = function010;
                                z3 = z72;
                                modifier3 = modifier52;
                                function07 = function0132;
                                str3 = str42;
                                function23 = function252;
                                function08 = function0122;
                                function09 = function011;
                                color3 = color2;
                                z4 = z82;
                                function24 = function262;
                            }
                            final Function3 function322 = function3M12619getLambda$778111950$feature_credit_card_externalDebug;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 != 0) {
                        }
                        i14 = i13;
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                        }
                        int i2122 = i17;
                        if ((i3 & 4096) != 0) {
                        }
                        if ((306783379 & i4) == 306783378) {
                        }
                        final Function3 function3222 = function3M12619getLambda$778111950$feature_credit_card_externalDebug;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    function05 = function02;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    int i21222 = i17;
                    if ((i3 & 4096) != 0) {
                    }
                    if ((306783379 & i4) == 306783378) {
                    }
                    final Function3 function32222 = function3M12619getLambda$778111950$feature_credit_card_externalDebug;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function04 = function0;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function05 = function02;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 != 0) {
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                int i212222 = i17;
                if ((i3 & 4096) != 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                final Function3 function322222 = function3M12619getLambda$778111950$feature_credit_card_externalDebug;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str2 = str;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function04 = function0;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function05 = function02;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            int i2122222 = i17;
            if ((i3 & 4096) != 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            final Function3 function3222222 = function3M12619getLambda$778111950$feature_credit_card_externalDebug;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function04 = function0;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function05 = function02;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        int i21222222 = i17;
        if ((i3 & 4096) != 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        final Function3 function32222222 = function3M12619getLambda$778111950$feature_credit_card_externalDebug;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
