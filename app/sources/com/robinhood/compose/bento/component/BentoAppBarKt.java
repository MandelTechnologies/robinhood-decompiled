package com.robinhood.compose.bento.component;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.util.MathHelpers;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: BentoAppBar.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a¸\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00072\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00072\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aÂ\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00072\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00072\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0001H\u0001¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0001H\u0001¢\u0006\u0004\b&\u0010%\u001a\u000f\u0010'\u001a\u00020\u0001H\u0001¢\u0006\u0004\b'\u0010%\u001a\u000f\u0010(\u001a\u00020\u0001H\u0001¢\u0006\u0004\b(\u0010%¨\u0006*²\u0006\f\u0010)\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "title", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/robinhood/compose/bento/component/BentoAppBarScope;", "Lkotlin/ExtensionFunctionType;", "navigationIcon", "Landroidx/compose/foundation/layout/RowScope;", "actions", "Landroidx/compose/foundation/layout/BoxScope;", "progressBar", "", "transparent", "showDivider", "Lcom/robinhood/compose/bento/component/AppBarType;", "type", "Landroidx/compose/ui/graphics/Color;", "backgroundColorOverride", "scrolledContainerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "BentoAppBar-SGdaT3c", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZZLcom/robinhood/compose/bento/component/AppBarType;Landroidx/compose/ui/graphics/Color;JLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;III)V", "BentoAppBar", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "BentoAppBar-i0w9Sqc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZZLcom/robinhood/compose/bento/component/AppBarType;Landroidx/compose/ui/graphics/Color;JLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;III)V", "", "minScrollDistance", "maxScrollDistance", "Landroidx/compose/runtime/State;", "rememberAppBarTitleAlpha", "(Landroidx/compose/material3/TopAppBarScrollBehavior;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "BentoAppBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "BentoAppBarCenterTitlePreview", "BentoAppBarMediumPreview", "BentoAppBarLargePreview", "bgAlpha", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class BentoAppBarKt {

    /* compiled from: BentoAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppBarType.values().length];
            try {
                iArr[AppBarType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppBarType.CENTER_ALIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppBarType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppBarType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAppBarCenterTitlePreview$lambda$7(int i, Composer composer, int i2) {
        BentoAppBarCenterTitlePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAppBarLargePreview$lambda$9(int i, Composer composer, int i2) {
        BentoAppBarLargePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAppBarMediumPreview$lambda$8(int i, Composer composer, int i2) {
        BentoAppBarMediumPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAppBarPreview$lambda$6(int i, Composer composer, int i2) {
        BentoAppBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAppBar_SGdaT3c$lambda$0(Function2 function2, Modifier modifier, Function3 function3, Function3 function32, Function3 function33, boolean z, boolean z2, AppBarType appBarType, Color color, long j, WindowInsets windowInsets, int i, int i2, int i3, Composer composer, int i4) {
        m20573BentoAppBarSGdaT3c(function2, modifier, function3, function32, function33, z, z2, appBarType, color, j, windowInsets, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAppBar_i0w9Sqc$lambda$3(Function2 function2, TopAppBarScrollBehavior topAppBarScrollBehavior, Modifier modifier, Function3 function3, Function3 function32, Function3 function33, boolean z, boolean z2, AppBarType appBarType, Color color, long j, WindowInsets windowInsets, int i, int i2, int i3, Composer composer, int i4) {
        m20574BentoAppBari0w9Sqc(function2, topAppBarScrollBehavior, modifier, function3, function32, function33, z, z2, appBarType, color, j, windowInsets, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /* renamed from: BentoAppBar-SGdaT3c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20573BentoAppBarSGdaT3c(final Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33, boolean z, boolean z2, AppBarType appBarType, Color color, long j, WindowInsets windowInsets, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function34;
        int i6;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35;
        int i7;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function36;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Modifier modifier3;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M20764getLambda$260068255$lib_compose_bento_externalRelease;
        final Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function37;
        boolean z5;
        final WindowInsets windowInsets2;
        int i16;
        final long j2;
        final Color color2;
        final AppBarType appBarType2;
        final boolean z6;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function38;
        Modifier modifier4;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function39;
        final boolean z7;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(12118216);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
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
                    function34 = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function34) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function35 = function32;
                        i4 |= composerStartRestartGroup.changedInstance(function35) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function36 = function33;
                            i4 |= composerStartRestartGroup.changedInstance(function36) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            z3 = z;
                        } else {
                            z3 = z;
                            if ((i & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            z4 = z2;
                        } else {
                            z4 = z2;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(appBarType == null ? -1 : appBarType.ordinal()) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else {
                            if ((i & 100663296) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changed(color) ? 67108864 : 33554432;
                            }
                            i13 = i3 & 512;
                            if (i13 != 0) {
                                if ((i & 805306368) == 0) {
                                    i14 = i13;
                                    i4 |= composerStartRestartGroup.changed(j) ? 536870912 : 268435456;
                                }
                                if ((i2 & 6) == 0) {
                                    i15 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 4 : 2);
                                } else {
                                    i15 = i2;
                                }
                                int i18 = i15;
                                if ((i4 & 306783379) == 306783378 && (i18 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    color2 = color;
                                    z7 = z4;
                                    z6 = z3;
                                    modifier5 = modifier2;
                                    function37 = function34;
                                    function39 = function35;
                                    function38 = function36;
                                    appBarType2 = appBarType;
                                    j2 = j;
                                    windowInsets2 = windowInsets;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier3 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                        Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> lambda$86444441$lib_compose_bento_externalRelease = i5 == 0 ? ComposableSingletons$BentoAppBarKt.INSTANCE.getLambda$86444441$lib_compose_bento_externalRelease() : function34;
                                        function3M20764getLambda$260068255$lib_compose_bento_externalRelease = i6 == 0 ? ComposableSingletons$BentoAppBarKt.INSTANCE.m20764getLambda$260068255$lib_compose_bento_externalRelease() : function35;
                                        if (i7 != 0) {
                                            function36 = null;
                                        }
                                        if (i8 != 0) {
                                            z3 = false;
                                        }
                                        if (i9 != 0) {
                                            z4 = false;
                                        }
                                        AppBarType appBarType3 = i10 == 0 ? AppBarType.DEFAULT : appBarType;
                                        Color color3 = i12 == 0 ? color : null;
                                        long jM6726getUnspecified0d7_KjU = i14 == 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
                                        if ((i3 & 1024) == 0) {
                                            boolean z8 = z4;
                                            function37 = lambda$86444441$lib_compose_bento_externalRelease;
                                            z5 = z8;
                                            i16 = i18 & (-15);
                                            windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, TopAppBarDefaults.$stable);
                                        } else {
                                            boolean z9 = z4;
                                            function37 = lambda$86444441$lib_compose_bento_externalRelease;
                                            z5 = z9;
                                            windowInsets2 = windowInsets;
                                            i16 = i18;
                                        }
                                        j2 = jM6726getUnspecified0d7_KjU;
                                        color2 = color3;
                                        appBarType2 = appBarType3;
                                        z6 = z3;
                                        function38 = function36;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 1024) != 0) {
                                            color2 = color;
                                            i16 = i18 & (-15);
                                        } else {
                                            color2 = color;
                                            i16 = i18;
                                        }
                                        z5 = z4;
                                        z6 = z3;
                                        modifier3 = modifier2;
                                        function37 = function34;
                                        function3M20764getLambda$260068255$lib_compose_bento_externalRelease = function35;
                                        function38 = function36;
                                        appBarType2 = appBarType;
                                        j2 = j;
                                        windowInsets2 = windowInsets;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        modifier4 = modifier3;
                                    } else {
                                        modifier4 = modifier3;
                                        ComposerKt.traceEventStart(12118216, i4, i16, "com.robinhood.compose.bento.component.BentoAppBar (BentoAppBar.kt:68)");
                                    }
                                    int i19 = i4 << 3;
                                    int i20 = (i4 & 14) | 48 | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192);
                                    int i21 = ((i4 >> 27) & 14) | ((i16 << 3) & 112);
                                    function39 = function3M20764getLambda$260068255$lib_compose_bento_externalRelease;
                                    z7 = z5;
                                    modifier5 = modifier4;
                                    m20574BentoAppBari0w9Sqc(title, null, modifier5, function37, function39, function38, z6, z7, appBarType2, color2, j2, windowInsets2, composerStartRestartGroup, i20, i21, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoAppBarKt.BentoAppBar_SGdaT3c$lambda$0(title, modifier5, function37, function39, function38, z6, z7, appBarType2, color2, j2, windowInsets2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= 805306368;
                            i14 = i13;
                            if ((i2 & 6) == 0) {
                            }
                            int i182 = i15;
                            if ((i4 & 306783379) == 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i17 == 0) {
                                    }
                                    if (i5 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if ((i3 & 1024) == 0) {
                                    }
                                    j2 = jM6726getUnspecified0d7_KjU;
                                    color2 = color3;
                                    appBarType2 = appBarType3;
                                    z6 = z3;
                                    function38 = function36;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i192 = i4 << 3;
                                    int i202 = (i4 & 14) | 48 | (i192 & 896) | (i192 & 7168) | (i192 & 57344) | (i192 & 458752) | (i192 & 3670016) | (i192 & 29360128) | (i192 & 234881024) | (i192 & 1879048192);
                                    int i212 = ((i4 >> 27) & 14) | ((i16 << 3) & 112);
                                    function39 = function3M20764getLambda$260068255$lib_compose_bento_externalRelease;
                                    z7 = z5;
                                    modifier5 = modifier4;
                                    m20574BentoAppBari0w9Sqc(title, null, modifier5, function37, function39, function38, z6, z7, appBarType2, color2, j2, windowInsets2, composerStartRestartGroup, i202, i212, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 != 0) {
                        }
                        i14 = i13;
                        if ((i2 & 6) == 0) {
                        }
                        int i1822 = i15;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    function36 = function33;
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
                    if ((i2 & 6) == 0) {
                    }
                    int i18222 = i15;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function35 = function32;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function36 = function33;
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
                if ((i2 & 6) == 0) {
                }
                int i182222 = i15;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function34 = function3;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function35 = function32;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function36 = function33;
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
            if ((i2 & 6) == 0) {
            }
            int i1822222 = i15;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function34 = function3;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function35 = function32;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function36 = function33;
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
        if ((i2 & 6) == 0) {
        }
        int i18222222 = i15;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final float BentoAppBar_i0w9Sqc$lambda$2$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* renamed from: BentoAppBar-i0w9Sqc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20574BentoAppBari0w9Sqc(final Function2<? super Composer, ? super Integer, Unit> title, final TopAppBarScrollBehavior topAppBarScrollBehavior, Modifier modifier, Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33, boolean z, boolean z2, AppBarType appBarType, Color color, long j, WindowInsets windowInsets, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        int i5;
        Modifier modifier2;
        int i6;
        Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function34;
        int i7;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> lambda$438898075$lib_compose_bento_externalRelease;
        int i8;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function35;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier3;
        final Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function3M20767getLambda$530955565$lib_compose_bento_externalRelease;
        boolean z4;
        AppBarType appBarType2;
        Color color2;
        WindowInsets windowInsets2;
        long j2;
        int i18;
        Modifier.Companion companion;
        Alignment.Companion companion2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BoxScopeInstance boxScopeInstance;
        int i19;
        long value;
        int i20;
        Modifier modifier4;
        WindowInsets windowInsets3;
        Modifier modifier5;
        WindowInsets windowInsets4;
        final WindowInsets windowInsets5;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function36;
        final Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function37;
        final Color color3;
        final boolean z5;
        final boolean z6;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function38;
        final AppBarType appBarType3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-790805246);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                i4 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function34 = function3;
                        i4 |= composerStartRestartGroup.changedInstance(function34) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            lambda$438898075$lib_compose_bento_externalRelease = function32;
                            i4 |= composerStartRestartGroup.changedInstance(lambda$438898075$lib_compose_bento_externalRelease) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            function35 = function33;
                        } else {
                            function35 = function33;
                            if ((i & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function35) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            z3 = z;
                        } else {
                            z3 = z;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else {
                            if ((i & 100663296) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changed(appBarType == null ? -1 : appBarType.ordinal()) ? 67108864 : 33554432;
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
                                    i17 = i2 | (composerStartRestartGroup.changed(j) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                if ((i2 & 48) == 0) {
                                    i17 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 32 : 16;
                                }
                                if ((306783379 & i4) == 306783378 && (i17 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    color3 = color;
                                    j2 = j;
                                    z5 = z3;
                                    function36 = lambda$438898075$lib_compose_bento_externalRelease;
                                    function38 = function35;
                                    function37 = function34;
                                    z6 = z2;
                                    appBarType3 = appBarType;
                                    windowInsets5 = windowInsets;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                        function3M20767getLambda$530955565$lib_compose_bento_externalRelease = i6 == 0 ? ComposableSingletons$BentoAppBarKt.INSTANCE.m20767getLambda$530955565$lib_compose_bento_externalRelease() : function34;
                                        if (i7 != 0) {
                                            lambda$438898075$lib_compose_bento_externalRelease = ComposableSingletons$BentoAppBarKt.INSTANCE.getLambda$438898075$lib_compose_bento_externalRelease();
                                        }
                                        if (i8 != 0) {
                                            function35 = null;
                                        }
                                        if (i9 != 0) {
                                            z3 = false;
                                        }
                                        z4 = i10 == 0 ? false : z2;
                                        appBarType2 = i12 == 0 ? AppBarType.DEFAULT : appBarType;
                                        color2 = i14 == 0 ? null : color;
                                        long jM6726getUnspecified0d7_KjU = i16 == 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
                                        if ((i3 & 2048) == 0) {
                                            windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, TopAppBarDefaults.$stable);
                                            i17 &= -113;
                                        } else {
                                            windowInsets2 = windowInsets;
                                        }
                                        j2 = jM6726getUnspecified0d7_KjU;
                                        i18 = i17;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 2048) != 0) {
                                            i17 &= -113;
                                        }
                                        z4 = z2;
                                        color2 = color;
                                        j2 = j;
                                        windowInsets2 = windowInsets;
                                        modifier3 = modifier2;
                                        function3M20767getLambda$530955565$lib_compose_bento_externalRelease = function34;
                                        i18 = i17;
                                        appBarType2 = appBarType;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-790805246, i4, i18, "com.robinhood.compose.bento.component.BentoAppBar (BentoAppBar.kt:98)");
                                    }
                                    companion = Modifier.INSTANCE;
                                    companion2 = Alignment.INSTANCE;
                                    Modifier modifier6 = modifier3;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    WindowInsets windowInsets6 = windowInsets2;
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    int i21 = i4;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    boolean z7 = z3;
                                    SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!z3 ? 0.0f : 1.0f, AnimationSpecKt.tween$default(300, 0, Easing3.getLinearEasing(), 2, null), 0.0f, "bgAlpha", null, composerStartRestartGroup, 3072, 20);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.startReplaceGroup(-704464652);
                                    if (color2 != null) {
                                        i19 = 0;
                                        value = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getAppBar(composerStartRestartGroup, 0).getColors().m21684getBackgroundColor0d7_KjU();
                                    } else {
                                        i19 = 0;
                                        value = color2.getValue();
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    long jM21685getForegroundColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getAppBar(composerStartRestartGroup, i19).getColors().m21685getForegroundColor0d7_KjU();
                                    TopAppBarColors topAppBarColorsM6088topAppBarColorszjMxDiM = TopAppBarDefaults.INSTANCE.m6088topAppBarColorszjMxDiM(Color.m6705copywmQWz5c$default(value, BentoAppBar_i0w9Sqc$lambda$2$lambda$1(snapshotState4AnimateFloatAsState), 0.0f, 0.0f, 0.0f, 14, null), j2, jM21685getForegroundColor0d7_KjU, jM21685getForegroundColor0d7_KjU, jM21685getForegroundColor0d7_KjU, composerStartRestartGroup, ((i18 << 3) & 112) | (TopAppBarDefaults.$stable << 15), 0);
                                    i20 = WhenMappings.$EnumSwitchMapping$0[appBarType2.ordinal()];
                                    if (i20 != 1) {
                                        composerStartRestartGroup.startReplaceGroup(-363033228);
                                        int i22 = i21 >> 3;
                                        AppBarKt.m5704TopAppBarGHTll3U(title, modifier6, ComposableLambda3.rememberComposableLambda(-1577761798, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$BentoAppBar$2$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i23) {
                                                if ((i23 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1577761798, i23, -1, "com.robinhood.compose.bento.component.BentoAppBar.<anonymous>.<anonymous> (BentoAppBar.kt:122)");
                                                }
                                                function3M20767getLambda$530955565$lib_compose_bento_externalRelease.invoke(BentoAppBarScope.INSTANCE, composer2, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), lambda$438898075$lib_compose_bento_externalRelease, 0.0f, windowInsets6, topAppBarColorsM6088topAppBarColorszjMxDiM, topAppBarScrollBehavior, composerStartRestartGroup, (i21 & 14) | 384 | (i22 & 112) | (i22 & 7168) | ((i18 << 12) & 458752) | ((i21 << 18) & 29360128), 16);
                                        modifier4 = modifier6;
                                        windowInsets3 = windowInsets6;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Unit unit = Unit.INSTANCE;
                                    } else if (i20 == 2) {
                                        composerStartRestartGroup.startReplaceGroup(-362603289);
                                        int i23 = i21 >> 3;
                                        AppBarKt.m5700CenterAlignedTopAppBarGHTll3U(title, modifier6, ComposableLambda3.rememberComposableLambda(792715856, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$BentoAppBar$2$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i24) {
                                                if ((i24 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(792715856, i24, -1, "com.robinhood.compose.bento.component.BentoAppBar.<anonymous>.<anonymous> (BentoAppBar.kt:134)");
                                                }
                                                function3M20767getLambda$530955565$lib_compose_bento_externalRelease.invoke(BentoAppBarScope.INSTANCE, composer2, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), lambda$438898075$lib_compose_bento_externalRelease, 0.0f, windowInsets6, topAppBarColorsM6088topAppBarColorszjMxDiM, topAppBarScrollBehavior, composerStartRestartGroup, (i21 & 14) | 384 | (i23 & 112) | (i23 & 7168) | ((i18 << 12) & 458752) | ((i21 << 18) & 29360128), 16);
                                        modifier4 = modifier6;
                                        windowInsets3 = windowInsets6;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Unit unit2 = Unit.INSTANCE;
                                    } else if (i20 == 3) {
                                        composerStartRestartGroup.startReplaceGroup(-362169010);
                                        int i24 = i21 >> 3;
                                        AppBarKt.m5702MediumTopAppBaroKE7A98(title, modifier6, ComposableLambda3.rememberComposableLambda(2132453069, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$BentoAppBar$2$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i25) {
                                                if ((i25 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2132453069, i25, -1, "com.robinhood.compose.bento.component.BentoAppBar.<anonymous>.<anonymous> (BentoAppBar.kt:146)");
                                                }
                                                function3M20767getLambda$530955565$lib_compose_bento_externalRelease.invoke(BentoAppBarScope.INSTANCE, composer2, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), lambda$438898075$lib_compose_bento_externalRelease, 0.0f, 0.0f, windowInsets6, topAppBarColorsM6088topAppBarColorszjMxDiM, topAppBarScrollBehavior, composerStartRestartGroup, (i21 & 14) | 384 | (i24 & 112) | (i24 & 7168) | ((i18 << 15) & 3670016) | ((i21 << 21) & 234881024), 48);
                                        modifier4 = modifier6;
                                        windowInsets3 = windowInsets6;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                    } else {
                                        if (i20 != 4) {
                                            composerStartRestartGroup.startReplaceGroup(-704447582);
                                            composerStartRestartGroup.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composerStartRestartGroup.startReplaceGroup(-361742481);
                                        int i25 = i21 >> 3;
                                        AppBarKt.m5701LargeTopAppBaroKE7A98(title, modifier6, ComposableLambda3.rememberComposableLambda(1499629474, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$BentoAppBar$2$4
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i26) {
                                                if ((i26 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1499629474, i26, -1, "com.robinhood.compose.bento.component.BentoAppBar.<anonymous>.<anonymous> (BentoAppBar.kt:158)");
                                                }
                                                function3M20767getLambda$530955565$lib_compose_bento_externalRelease.invoke(BentoAppBarScope.INSTANCE, composer2, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), lambda$438898075$lib_compose_bento_externalRelease, 0.0f, 0.0f, windowInsets6, topAppBarColorsM6088topAppBarColorszjMxDiM, topAppBarScrollBehavior2, composerStartRestartGroup, (i21 & 14) | 384 | (i25 & 112) | (i25 & 7168) | ((i18 << 15) & 3670016) | ((i21 << 21) & 234881024), 48);
                                        modifier4 = modifier6;
                                        windowInsets3 = windowInsets6;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-704391208);
                                    if (z4 && !z7) {
                                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(companion, companion2.getBottomCenter()), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-704384196);
                                    if (function35 == null) {
                                        Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), companion2.getBottomCenter());
                                        int i26 = (i21 >> 6) & 7168;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                                        modifier5 = modifier4;
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(constructor2);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        windowInsets4 = windowInsets3;
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        function35.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i26 >> 6) & 112) | 6));
                                        composerStartRestartGroup.endNode();
                                    } else {
                                        modifier5 = modifier4;
                                        windowInsets4 = windowInsets3;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets5 = windowInsets4;
                                    function36 = lambda$438898075$lib_compose_bento_externalRelease;
                                    function37 = function3M20767getLambda$530955565$lib_compose_bento_externalRelease;
                                    color3 = color2;
                                    z5 = z7;
                                    z6 = z4;
                                    function38 = function35;
                                    appBarType3 = appBarType2;
                                    modifier2 = modifier5;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final Modifier modifier7 = modifier2;
                                    final long j3 = j2;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoAppBarKt.BentoAppBar_i0w9Sqc$lambda$3(title, topAppBarScrollBehavior, modifier7, function37, function36, function38, z5, z6, appBarType3, color3, j3, windowInsets5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
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
                            if ((i2 & 48) == 0) {
                            }
                            if ((306783379 & i4) == 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i5 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
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
                                    if ((i3 & 2048) == 0) {
                                    }
                                    j2 = jM6726getUnspecified0d7_KjU;
                                    i18 = i17;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    companion = Modifier.INSTANCE;
                                    companion2 = Alignment.INSTANCE;
                                    Modifier modifier62 = modifier3;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    WindowInsets windowInsets62 = windowInsets2;
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                    int i212 = i4;
                                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        boolean z72 = z3;
                                        SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!z3 ? 0.0f : 1.0f, AnimationSpecKt.tween$default(300, 0, Easing3.getLinearEasing(), 2, null), 0.0f, "bgAlpha", null, composerStartRestartGroup, 3072, 20);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        composerStartRestartGroup.startReplaceGroup(-704464652);
                                        if (color2 != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        long jM21685getForegroundColor0d7_KjU2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getAppBar(composerStartRestartGroup, i19).getColors().m21685getForegroundColor0d7_KjU();
                                        TopAppBarColors topAppBarColorsM6088topAppBarColorszjMxDiM2 = TopAppBarDefaults.INSTANCE.m6088topAppBarColorszjMxDiM(Color.m6705copywmQWz5c$default(value, BentoAppBar_i0w9Sqc$lambda$2$lambda$1(snapshotState4AnimateFloatAsState2), 0.0f, 0.0f, 0.0f, 14, null), j2, jM21685getForegroundColor0d7_KjU2, jM21685getForegroundColor0d7_KjU2, jM21685getForegroundColor0d7_KjU2, composerStartRestartGroup, ((i18 << 3) & 112) | (TopAppBarDefaults.$stable << 15), 0);
                                        i20 = WhenMappings.$EnumSwitchMapping$0[appBarType2.ordinal()];
                                        if (i20 != 1) {
                                        }
                                        composerStartRestartGroup.startReplaceGroup(-704391208);
                                        if (z4) {
                                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(companion, companion2.getBottomCenter()), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(-704384196);
                                        if (function35 == null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        windowInsets5 = windowInsets4;
                                        function36 = lambda$438898075$lib_compose_bento_externalRelease;
                                        function37 = function3M20767getLambda$530955565$lib_compose_bento_externalRelease;
                                        color3 = color2;
                                        z5 = z72;
                                        z6 = z4;
                                        function38 = function35;
                                        appBarType3 = appBarType2;
                                        modifier2 = modifier5;
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
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
                        if ((i2 & 48) == 0) {
                        }
                        if ((306783379 & i4) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    lambda$438898075$lib_compose_bento_externalRelease = function32;
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
                    if ((i2 & 48) == 0) {
                    }
                    if ((306783379 & i4) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function34 = function3;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                lambda$438898075$lib_compose_bento_externalRelease = function32;
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
                if ((i2 & 48) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function34 = function3;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            lambda$438898075$lib_compose_bento_externalRelease = function32;
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
            if ((i2 & 48) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function34 = function3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        lambda$438898075$lib_compose_bento_externalRelease = function32;
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
        if ((i2 & 48) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final SnapshotState4<Float> rememberAppBarTitleAlpha(final TopAppBarScrollBehavior scrollBehavior, final float f, final float f2, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(scrollBehavior, "scrollBehavior");
        composer.startReplaceGroup(550684110);
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 80.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(550684110, i, -1, "com.robinhood.compose.bento.component.rememberAppBarTitleAlpha (BentoAppBar.kt:257)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(BentoAppBarKt.rememberAppBarTitleAlpha$lambda$5$lambda$4(scrollBehavior, f, f2));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState4<Float> snapshotState4 = (SnapshotState4) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rememberAppBarTitleAlpha$lambda$5$lambda$4(TopAppBarScrollBehavior topAppBarScrollBehavior, float f, float f2) {
        return MathHelpers.lerp(0.0f, 1.0f, RangesKt.coerceIn(((-topAppBarScrollBehavior.getState().getContentOffset()) - f) / (f2 - f), 0.0f, 1.0f));
    }

    public static final void BentoAppBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1306049992);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1306049992, i, -1, "com.robinhood.compose.bento.component.BentoAppBarPreview (BentoAppBar.kt:287)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoAppBarKt.INSTANCE.getLambda$1841696128$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAppBarKt.BentoAppBarPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoAppBarCenterTitlePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(780161929);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(780161929, i, -1, "com.robinhood.compose.bento.component.BentoAppBarCenterTitlePreview (BentoAppBar.kt:308)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoAppBarKt.INSTANCE.m20763getLambda$1405408447$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAppBarKt.BentoAppBarCenterTitlePreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoAppBarMediumPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1730225923);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1730225923, i, -1, "com.robinhood.compose.bento.component.BentoAppBarMediumPreview (BentoAppBar.kt:329)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoAppBarKt.INSTANCE.m20765getLambda$436446133$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAppBarKt.BentoAppBarMediumPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoAppBarLargePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(609163217);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(609163217, i, -1, "com.robinhood.compose.bento.component.BentoAppBarLargePreview (BentoAppBar.kt:350)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoAppBarKt.INSTANCE.m20769getLambda$569108087$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoAppBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAppBarKt.BentoAppBarLargePreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
