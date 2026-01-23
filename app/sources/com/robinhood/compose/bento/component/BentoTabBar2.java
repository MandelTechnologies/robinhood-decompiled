package com.robinhood.compose.bento.component;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.NavigationBarItemColors;
import androidx.compose.material3.NavigationBarItemDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoTabBar2;
import com.robinhood.compose.bento.component.BentoTabBarState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: BentoTabBar.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0089\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u001028\b\u0002\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\f0\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a[\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\u00052\b\b\u0001\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010$¨\u0006%"}, m3636d2 = {"tabBarBottomNavItemTestTag", "", "tab", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "BentoTabBar", "", "state", "Lcom/robinhood/compose/bento/component/BentoTabBarState;", "onTabClick", "Lkotlin/Function2;", "", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPaddingNonClipped", "Landroidx/compose/ui/unit/Dp;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "tabItemModifierProvider", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "BentoTabBar-jIwJxvA", "(Lcom/robinhood/compose/bento/component/BentoTabBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BadgedNavigationBarItem", "badgeState", "Lcom/robinhood/compose/bento/component/BentoTabBarState$BadgeState;", "tabItemModifier", "(Lcom/robinhood/compose/bento/component/BentoTabBarState;ILcom/robinhood/compose/bento/component/BentoTabBarState$Tab;Lcom/robinhood/compose/bento/component/BentoTabBarState$BadgeState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TabBadge", "(Lcom/robinhood/compose/bento/component/BentoTabBarState$BadgeState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CriticalBadge", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NormalBadge", "BentoTabBarPreview", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/compose/bento/component/TabPreviewData;", "(Lcom/robinhood/compose/bento/component/TabPreviewData;Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoTabBarKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTabBar2 {

    /* compiled from: BentoTabBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoTabBarKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoTabBarState.BadgeState.values().length];
            try {
                iArr[BentoTabBarState.BadgeState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTabBarState.BadgeState.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BentoTabBarState.BadgeState.CRITICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BadgedNavigationBarItem$lambda$6(BentoTabBarState bentoTabBarState, int i, BentoTabBarState.Tab tab, BentoTabBarState.BadgeState badgeState, Function2 function2, Modifier modifier, Modifier modifier2, int i2, int i3, Composer composer, int i4) {
        BadgedNavigationBarItem(bentoTabBarState, i, tab, badgeState, function2, modifier, modifier2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTabBarPreview$lambda$12(BentoTabBar7 bentoTabBar7, int i, Composer composer, int i2) {
        BentoTabBarPreview(bentoTabBar7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTabBar_jIwJxvA$lambda$2(BentoTabBarState bentoTabBarState, Function2 function2, Modifier modifier, float f, WindowInsets windowInsets, Function2 function22, int i, int i2, Composer composer, int i3) {
        m20711BentoTabBarjIwJxvA(bentoTabBarState, function2, modifier, f, windowInsets, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CriticalBadge$lambda$8(Modifier modifier, int i, int i2, Composer composer, int i3) {
        CriticalBadge(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NormalBadge$lambda$11(Modifier modifier, int i, int i2, Composer composer, int i3) {
        NormalBadge(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabBadge$lambda$7(BentoTabBarState.BadgeState badgeState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TabBadge(badgeState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final String tabBarBottomNavItemTestTag(BentoTabBarState.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        return "bento_tab_bar_bottom_nav_item_" + tab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Companion BentoTabBar_jIwJxvA$lambda$1$lambda$0(int i, BentoTabBarState.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "<unused var>");
        return Modifier.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0140  */
    /* renamed from: BentoTabBar-jIwJxvA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20711BentoTabBarjIwJxvA(final BentoTabBarState state, final Function2<? super Integer, ? super BentoTabBarState.Tab, Unit> onTabClick, Modifier modifier, float f, WindowInsets windowInsets, Function2<? super Integer, ? super BentoTabBarState.Tab, ? extends Modifier> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float fM7995constructorimpl;
        WindowInsets windowInsetsWindowInsets$default;
        int i5;
        Function2<? super Integer, ? super BentoTabBarState.Tab, ? extends Modifier> function22;
        Modifier modifier3;
        int i6;
        final Function2<? super Integer, ? super BentoTabBarState.Tab, ? extends Modifier> function23;
        final float f2;
        Composer composer2;
        final Modifier modifier4;
        final WindowInsets windowInsets2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTabClick, "onTabClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1165992056);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabClick) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    fM7995constructorimpl = f;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        windowInsetsWindowInsets$default = windowInsets;
                        int i8 = composerStartRestartGroup.changed(windowInsetsWindowInsets$default) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        windowInsetsWindowInsets$default = windowInsets;
                    }
                    i3 |= i8;
                } else {
                    windowInsetsWindowInsets$default = windowInsets;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function22 = function2;
                        i3 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoTabBar2.BentoTabBar_jIwJxvA$lambda$1$lambda$0(((Integer) obj).intValue(), (BentoTabBarState.Tab) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function23 = (Function2) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                i6 = i3;
                                f2 = fM7995constructorimpl;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1165992056, i6, -1, "com.robinhood.compose.bento.component.BentoTabBar (BentoTabBar.kt:66)");
                                }
                                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(48));
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                WindowInsets windowInsets3 = windowInsetsWindowInsets$default;
                                composer2 = composerStartRestartGroup;
                                NavigationBarKt.m5899NavigationBarHsRjFd4(modifierM5156height3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU(), C2002Dp.m7995constructorimpl(0), windowInsets3, ComposableLambda3.rememberComposableLambda(391025905, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$BentoTabBar$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                        invoke(row5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 row5, Composer composer3, int i9) {
                                        Row5 NavigationBar = row5;
                                        Intrinsics.checkNotNullParameter(NavigationBar, "$this$NavigationBar");
                                        int i10 = (i9 & 6) == 0 ? i9 | (composer3.changed(NavigationBar) ? 4 : 2) : i9;
                                        if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(391025905, i10, -1, "com.robinhood.compose.bento.component.BentoTabBar.<anonymous> (BentoTabBar.kt:74)");
                                        }
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f2), composer3, 0);
                                        composer3.startReplaceGroup(2113743577);
                                        ImmutableList<BentoTabBarState.Tab> tabs = state.getTabs();
                                        BentoTabBarState bentoTabBarState = state;
                                        Function2<Integer, BentoTabBarState.Tab, Unit> function24 = onTabClick;
                                        Function2<Integer, BentoTabBarState.Tab, Modifier> function25 = function23;
                                        int i11 = 0;
                                        for (BentoTabBarState.Tab tab : tabs) {
                                            int i12 = i11 + 1;
                                            if (i11 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            BentoTabBarState.Tab tab2 = tab;
                                            BentoTabBarState.BadgeState badgeState = bentoTabBarState.getBadges().get(tab2);
                                            if (badgeState == null) {
                                                badgeState = BentoTabBarState.BadgeState.NONE;
                                            }
                                            Function2<Integer, BentoTabBarState.Tab, Unit> function26 = function24;
                                            BentoTabBarState bentoTabBarState2 = bentoTabBarState;
                                            BentoTabBar2.BadgedNavigationBarItem(bentoTabBarState2, i11, tab2, badgeState, function26, Row5.weight$default(NavigationBar, Modifier.INSTANCE, 1.0f, false, 2, null), function25.invoke(Integer.valueOf(i11), tab2), composer3, 0, 0);
                                            bentoTabBarState = bentoTabBarState2;
                                            function24 = function26;
                                            i11 = i12;
                                            NavigationBar = row5;
                                        }
                                        composer3.endReplaceGroup();
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f2), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composer2, (57344 & i6) | 199680, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                windowInsets2 = windowInsets3;
                            } else {
                                i6 = i3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                        }
                        f2 = fM7995constructorimpl;
                        function23 = function22;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(48));
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        WindowInsets windowInsets32 = windowInsetsWindowInsets$default;
                        composer2 = composerStartRestartGroup;
                        NavigationBarKt.m5899NavigationBarHsRjFd4(modifierM5156height3ABfNKs2, bentoTheme2.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU(), C2002Dp.m7995constructorimpl(0), windowInsets32, ComposableLambda3.rememberComposableLambda(391025905, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$BentoTabBar$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 row5, Composer composer3, int i9) {
                                Row5 NavigationBar = row5;
                                Intrinsics.checkNotNullParameter(NavigationBar, "$this$NavigationBar");
                                int i10 = (i9 & 6) == 0 ? i9 | (composer3.changed(NavigationBar) ? 4 : 2) : i9;
                                if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(391025905, i10, -1, "com.robinhood.compose.bento.component.BentoTabBar.<anonymous> (BentoTabBar.kt:74)");
                                }
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f2), composer3, 0);
                                composer3.startReplaceGroup(2113743577);
                                ImmutableList<BentoTabBarState.Tab> tabs = state.getTabs();
                                BentoTabBarState bentoTabBarState = state;
                                Function2<Integer, BentoTabBarState.Tab, Unit> function24 = onTabClick;
                                Function2<Integer, BentoTabBarState.Tab, Modifier> function25 = function23;
                                int i11 = 0;
                                for (BentoTabBarState.Tab tab : tabs) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    BentoTabBarState.Tab tab2 = tab;
                                    BentoTabBarState.BadgeState badgeState = bentoTabBarState.getBadges().get(tab2);
                                    if (badgeState == null) {
                                        badgeState = BentoTabBarState.BadgeState.NONE;
                                    }
                                    Function2<Integer, BentoTabBarState.Tab, Unit> function26 = function24;
                                    BentoTabBarState bentoTabBarState2 = bentoTabBarState;
                                    BentoTabBar2.BadgedNavigationBarItem(bentoTabBarState2, i11, tab2, badgeState, function26, Row5.weight$default(NavigationBar, Modifier.INSTANCE, 1.0f, false, 2, null), function25.invoke(Integer.valueOf(i11), tab2), composer3, 0, 0);
                                    bentoTabBarState = bentoTabBarState2;
                                    function24 = function26;
                                    i11 = i12;
                                    NavigationBar = row5;
                                }
                                composer3.endReplaceGroup();
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f2), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, (57344 & i6) | 199680, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        windowInsets2 = windowInsets32;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        f2 = fM7995constructorimpl;
                        windowInsets2 = windowInsetsWindowInsets$default;
                        function23 = function22;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoTabBar2.BentoTabBar_jIwJxvA$lambda$2(state, onTabClick, modifier4, f2, windowInsets2, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function22 = function2;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM7995constructorimpl = f;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function22 = function2;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        fM7995constructorimpl = f;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function22 = function2;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BadgedNavigationBarItem(final BentoTabBarState state, final int i, final BentoTabBarState.Tab tab, final BentoTabBarState.BadgeState badgeState, final Function2<? super Integer, ? super BentoTabBarState.Tab, Unit> onTabClick, Modifier modifier, Modifier modifier2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier3;
        int i5;
        Modifier modifier4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier5;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tab, "tab");
        Intrinsics.checkNotNullParameter(badgeState, "badgeState");
        Intrinsics.checkNotNullParameter(onTabClick, "onTabClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1041460852);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(tab.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(badgeState.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onTabClick) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
        } else {
            if ((196608 & i2) == 0) {
                modifier3 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier3) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((1572864 & i2) == 0) {
                    modifier4 = modifier2;
                    i4 |= composerStartRestartGroup.changed(modifier4) ? 1048576 : 524288;
                }
                if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier7 = i6 == 0 ? Modifier.INSTANCE : modifier3;
                    Modifier modifier8 = i5 == 0 ? Modifier.INSTANCE : modifier4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1041460852, i4, -1, "com.robinhood.compose.bento.component.BadgedNavigationBarItem (BentoTabBar.kt:99)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier7);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    NavigationBarStyle.Colors colors = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getNavigationBarStyle(composerStartRestartGroup, 0).getColors();
                    Modifier modifierThen = modifier8.then(LocalShowPlaceholder.withBentoPlaceholder$default(TestTag3.testTag(Modifier.INSTANCE, tabBarBottomNavItemTestTag(tab)), false, null, 3, null));
                    boolean z2 = state.getSelectedIndex() != i;
                    Modifier modifier9 = modifier8;
                    modifier5 = modifier7;
                    NavigationBarItemColors navigationBarItemColorsM5898colors69fazGs = NavigationBarItemDefaults.INSTANCE.m5898colors69fazGs(colors.m21816getSelectedColor0d7_KjU(), colors.m21816getSelectedColor0d7_KjU(), colors.m21815getIndicatorColor0d7_KjU(), colors.m21817getUnselectedColor0d7_KjU(), colors.m21817getUnselectedColor0d7_KjU(), colors.m21814getDisabledColor0d7_KjU(), colors.m21814getDisabledColor0d7_KjU(), composerStartRestartGroup, NavigationBarItemDefaults.$stable << 21, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    z = ((i4 & 112) != 32) | ((57344 & i4) != 16384) | ((i4 & 896) != 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BentoTabBar2.BadgedNavigationBarItem$lambda$5$lambda$4$lambda$3(onTabClick, i, tab);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    NavigationBarKt.NavigationBarItem(row6, z2, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1606496989, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$BadgedNavigationBarItem$1$2

                        /* compiled from: BentoTabBar.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.compose.bento.component.BentoTabBarKt$BadgedNavigationBarItem$1$2$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[BentoTabBarState.BadgeState.values().length];
                                try {
                                    iArr[BentoTabBarState.BadgeState.NONE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[BentoTabBarState.BadgeState.NORMAL.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[BentoTabBarState.BadgeState.CRITICAL.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        public final void invoke(Composer composer3, int i7) {
                            float fM7995constructorimpl;
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1606496989, i7, -1, "com.robinhood.compose.bento.component.BadgedNavigationBarItem.<anonymous>.<anonymous> (BentoTabBar.kt:109)");
                            }
                            BentoTabBarState.BadgeState badgeState2 = badgeState;
                            BentoTabBarState.Tab tab2 = tab;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion2);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            int i8 = WhenMappings.$EnumSwitchMapping$0[badgeState2.ordinal()];
                            if (i8 == 1 || i8 == 2) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                            } else {
                                if (i8 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(2);
                            }
                            IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(tab2.getIcon(), composer3, 0), StringResources_androidKt.stringResource(tab2.getContentDescription(), composer3, 0), boxScopeInstance.align(PaddingKt.m5142padding3ABfNKs(LocalShowPlaceholder.withBentoCirclePlaceholder$default(companion2, false, 1, null), fM7995constructorimpl), companion3.getCenter()), 0L, composer3, 0, 8);
                            BentoTabBar2.TabBadge(badgeState2, boxScopeInstance.align(companion2, companion3.getTopEnd()), composer3, 0, 0);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), modifierThen, false, null, false, navigationBarItemColorsM5898colors69fazGs, null, composerStartRestartGroup, 12585990, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier6 = modifier9;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoTabBar2.BadgedNavigationBarItem$lambda$6(state, i, tab, badgeState, onTabClick, modifier5, modifier6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 1572864;
            modifier4 = modifier2;
            if ((i4 & 599187) != 599186) {
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier7);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    NavigationBarStyle.Colors colors2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getNavigationBarStyle(composerStartRestartGroup, 0).getColors();
                    Modifier modifierThen2 = modifier8.then(LocalShowPlaceholder.withBentoPlaceholder$default(TestTag3.testTag(Modifier.INSTANCE, tabBarBottomNavItemTestTag(tab)), false, null, 3, null));
                    if (state.getSelectedIndex() != i) {
                    }
                    Modifier modifier92 = modifier8;
                    modifier5 = modifier7;
                    NavigationBarItemColors navigationBarItemColorsM5898colors69fazGs2 = NavigationBarItemDefaults.INSTANCE.m5898colors69fazGs(colors2.m21816getSelectedColor0d7_KjU(), colors2.m21816getSelectedColor0d7_KjU(), colors2.m21815getIndicatorColor0d7_KjU(), colors2.m21817getUnselectedColor0d7_KjU(), colors2.m21817getUnselectedColor0d7_KjU(), colors2.m21814getDisabledColor0d7_KjU(), colors2.m21814getDisabledColor0d7_KjU(), composerStartRestartGroup, NavigationBarItemDefaults.$stable << 21, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    if ((57344 & i4) != 16384) {
                    }
                    z = ((i4 & 112) != 32) | ((57344 & i4) != 16384) | ((i4 & 896) != 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BentoTabBar2.BadgedNavigationBarItem$lambda$5$lambda$4$lambda$3(onTabClick, i, tab);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        NavigationBarKt.NavigationBarItem(row62, z2, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1606496989, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$BadgedNavigationBarItem$1$2

                            /* compiled from: BentoTabBar.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.compose.bento.component.BentoTabBarKt$BadgedNavigationBarItem$1$2$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[BentoTabBarState.BadgeState.values().length];
                                    try {
                                        iArr[BentoTabBarState.BadgeState.NONE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[BentoTabBarState.BadgeState.NORMAL.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[BentoTabBarState.BadgeState.CRITICAL.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            public final void invoke(Composer composer3, int i7) {
                                float fM7995constructorimpl;
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1606496989, i7, -1, "com.robinhood.compose.bento.component.BadgedNavigationBarItem.<anonymous>.<anonymous> (BentoTabBar.kt:109)");
                                }
                                BentoTabBarState.BadgeState badgeState2 = badgeState;
                                BentoTabBarState.Tab tab2 = tab;
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, companion22);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor22);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i8 = WhenMappings.$EnumSwitchMapping$0[badgeState2.ordinal()];
                                if (i8 == 1 || i8 == 2) {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                } else {
                                    if (i8 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(2);
                                }
                                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(tab2.getIcon(), composer3, 0), StringResources_androidKt.stringResource(tab2.getContentDescription(), composer3, 0), boxScopeInstance.align(PaddingKt.m5142padding3ABfNKs(LocalShowPlaceholder.withBentoCirclePlaceholder$default(companion22, false, 1, null), fM7995constructorimpl), companion3.getCenter()), 0L, composer3, 0, 8);
                                BentoTabBar2.TabBadge(badgeState2, boxScopeInstance.align(companion22, companion3.getTopEnd()), composer3, 0, 0);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), modifierThen2, false, null, false, navigationBarItemColorsM5898colors69fazGs2, null, composerStartRestartGroup, 12585990, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier6 = modifier92;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier3 = modifier;
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        modifier4 = modifier2;
        if ((i4 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BadgedNavigationBarItem$lambda$5$lambda$4$lambda$3(Function2 function2, int i, BentoTabBarState.Tab tab) {
        function2.invoke(Integer.valueOf(i), tab);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBadge(final BentoTabBarState.BadgeState badgeState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1304862771);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(badgeState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304862771, i3, -1, "com.robinhood.compose.bento.component.TabBadge (BentoTabBar.kt:152)");
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[badgeState.ordinal()];
            if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(582369811);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i5 == 2) {
                composerStartRestartGroup.startReplaceGroup(157335135);
                float f = 8;
                NormalBadge(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 3) {
                    composerStartRestartGroup.startReplaceGroup(157331806);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(157340387);
                float f2 = 16;
                CriticalBadge(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f2)), C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTabBar2.TabBadge$lambda$7(badgeState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CriticalBadge(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(391993837);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(391993837, i3, -1, "com.robinhood.compose.bento.component.CriticalBadge (BentoTabBar.kt:172)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(C11048R.drawable.svg_ic_critical_badge, composerStartRestartGroup, 0), (String) null, modifier2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 6) & 896) | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTabBar2.CriticalBadge$lambda$8(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void NormalBadge(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1736813093);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1736813093, i3, -1, "com.robinhood.compose.bento.component.NormalBadge (BentoTabBar.kt:183)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            final long jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, 6).m21452getNegative0d7_KjU();
            final long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(jM21452getNegative0d7_KjU) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoTabBar2.NormalBadge$lambda$10$lambda$9(jM21452getNegative0d7_KjU, jM21371getBg0d7_KjU, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTabBar2.NormalBadge$lambda$11(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NormalBadge$lambda$10$lambda$9(long j, long j2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f = 2;
        float fM6582getMinDimensionimpl = Size.m6582getMinDimensionimpl(Canvas.mo6963getSizeNHjbRc()) / f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) / f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / f;
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, fM6582getMinDimensionimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), 0.0f, DrawScope3.INSTANCE, null, 0, 104, null);
        float fM6582getMinDimensionimpl2 = Size.m6582getMinDimensionimpl(Canvas.mo6963getSizeNHjbRc()) / f;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) / f;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / f;
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j2, fM6582getMinDimensionimpl2, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        return Unit.INSTANCE;
    }

    private static final void BentoTabBarPreview(final BentoTabBar7 bentoTabBar7, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1028720733);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(bentoTabBar7) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1028720733, i2, -1, "com.robinhood.compose.bento.component.BentoTabBarPreview (BentoTabBar.kt:315)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(bentoTabBar7.getIsDay()), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(348415211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt.BentoTabBarPreview.1

                /* compiled from: BentoTabBar.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.compose.bento.component.BentoTabBarKt$BentoTabBarPreview$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ BentoTabBar7 $data;

                    AnonymousClass1(BentoTabBar7 bentoTabBar7) {
                        this.$data = bentoTabBar7;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2146218661, i, -1, "com.robinhood.compose.bento.component.BentoTabBarPreview.<anonymous>.<anonymous> (BentoTabBar.kt:320)");
                        }
                        BentoTabBarState state = this.$data.getState();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$BentoTabBarPreview$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTabBar2.C324491.AnonymousClass1.invoke$lambda$1$lambda$0(((Integer) obj).intValue(), (BentoTabBarState.Tab) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoTabBar2.m20711BentoTabBarjIwJxvA(state, (Function2) objRememberedValue, null, 0.0f, null, null, composer, 48, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(int i, BentoTabBarState.Tab tab) {
                        Intrinsics.checkNotNullParameter(tab, "<unused var>");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(348415211, i3, -1, "com.robinhood.compose.bento.component.BentoTabBarPreview.<anonymous> (BentoTabBar.kt:319)");
                    }
                    LocalShowPlaceholder.Loadable(bentoTabBar7.getIsShowPlaceholder(), null, null, ComposableLambda3.rememberComposableLambda(-2146218661, true, new AnonymousClass1(bentoTabBar7), composer2, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTabBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTabBar2.BentoTabBarPreview$lambda$12(bentoTabBar7, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
