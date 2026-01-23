package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyle;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: NavigationBar.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\u001a]\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a}\u0010\u001d\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a_\u0010#\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0003¢\u0006\u0004\b#\u0010$\u001a8\u0010/\u001a\u00020,*\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aP\u00103\u001a\u00020,*\u00020%2\u0006\u00100\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\"\u0014\u00104\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u001a\u00106\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b7\u00108\"\u001a\u00109\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00108\"\u0014\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105\"\u001a\u0010<\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00108\"\u0014\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C²\u0006\f\u0010?\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010B\u001a\u00020A8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBar", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", AnnotatedPrivateKey.LABEL, "alwaysShowLabel", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationBarItem", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "indicatorRipple", "indicator", "", "animationProgress", "NavigationBarItemLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "NavigationBarHeight", "F", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarIndicatorToLabelPadding", "getNavigationBarIndicatorToLabelPadding", "IndicatorHorizontalPadding", "IndicatorVerticalPadding", "getIndicatorVerticalPadding", "IndicatorVerticalOffset", "iconColor", "textColor", "", "itemWidth", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class NavigationBarKt {
    private static final float IndicatorHorizontalPadding;
    private static final float IndicatorVerticalOffset;
    private static final float IndicatorVerticalPadding;
    private static final float NavigationBarHeight;
    private static final float NavigationBarIndicatorToLabelPadding;
    private static final float NavigationBarItemHorizontalPadding;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5899NavigationBarHsRjFd4(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long containerColor;
        long jM5778contentColorFor4WTKRHQ;
        float fM5893getElevationD9Ej5fM;
        WindowInsets windowInsets2;
        long j3;
        float f2;
        final WindowInsets windowInsets3;
        Modifier modifier3;
        Composer composer2;
        final WindowInsets windowInsets4;
        final Modifier modifier4;
        final long j4;
        final long j5;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1596802123);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                containerColor = j;
                int i5 = composerStartRestartGroup.changed(containerColor) ? 32 : 16;
                i3 |= i5;
            } else {
                containerColor = j;
            }
            i3 |= i5;
        } else {
            containerColor = j;
        }
        if ((i & 384) == 0) {
            jM5778contentColorFor4WTKRHQ = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(jM5778contentColorFor4WTKRHQ)) ? 256 : 128;
        } else {
            jM5778contentColorFor4WTKRHQ = j2;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                fM5893getElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM5893getElevationD9Ej5fM) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    windowInsets2 = windowInsets;
                    int i7 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    windowInsets2 = windowInsets;
                }
                i3 |= i7;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        jM5778contentColorFor4WTKRHQ = ColorScheme2.m5778contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i3 &= -897;
                    }
                    if (i6 != 0) {
                        fM5893getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m5893getElevationD9Ej5fM();
                    }
                    if ((i2 & 16) == 0) {
                        windowInsets3 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        i3 &= -57345;
                        j3 = jM5778contentColorFor4WTKRHQ;
                        f2 = fM5893getElevationD9Ej5fM;
                    } else {
                        j3 = jM5778contentColorFor4WTKRHQ;
                        f2 = fM5893getElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    j3 = jM5778contentColorFor4WTKRHQ;
                    f2 = fM5893getElevationD9Ej5fM;
                    modifier3 = modifier2;
                    windowInsets3 = windowInsets2;
                }
                long j6 = containerColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1596802123, i3, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:115)");
                }
                int i8 = i3 << 3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5967SurfaceT9BRK9s(modifier3, null, j6, j3, f2, 0.0f, null, ComposableLambda3.rememberComposableLambda(105663120, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(105663120, i9, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:122)");
                            }
                            Modifier modifierSelectableGroup = SelectableGroup.selectableGroup(SizeKt.m5155defaultMinSizeVpY3zN4$default(WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets3), 0.0f, NavigationBarKt.NavigationBarHeight, 1, null));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(NavigationBarKt.getNavigationBarItemHorizontalPadding());
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<Row5, Composer, Integer, Unit> function32 = function3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer3, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierSelectableGroup);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            function32.invoke(Row6.INSTANCE, composer3, 6);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composer2, (i3 & 14) | 12582912 | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 98);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets4 = windowInsets3;
                modifier4 = modifier3;
                j4 = j6;
                j5 = j3;
                f3 = f2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                j4 = containerColor;
                j5 = jM5778contentColorFor4WTKRHQ;
                f3 = fM5893getElevationD9Ej5fM;
                windowInsets4 = windowInsets2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$2
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

                    public final void invoke(Composer composer3, int i9) {
                        NavigationBarKt.m5899NavigationBarHsRjFd4(modifier4, j4, j5, f3, windowInsets4, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        fM5893getElevationD9Ej5fM = f;
        if ((i & 24576) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                modifier3 = modifier5;
                long j62 = containerColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i3 << 3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5967SurfaceT9BRK9s(modifier3, null, j62, j3, f2, 0.0f, null, ComposableLambda3.rememberComposableLambda(105663120, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(105663120, i9, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:122)");
                            }
                            Modifier modifierSelectableGroup = SelectableGroup.selectableGroup(SizeKt.m5155defaultMinSizeVpY3zN4$default(WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets3), 0.0f, NavigationBarKt.NavigationBarHeight, 1, null));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(NavigationBarKt.getNavigationBarItemHorizontalPadding());
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<Row5, Composer, Integer, Unit> function32 = function3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer3, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierSelectableGroup);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            function32.invoke(Row6.INSTANCE, composer3, 6);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composer2, (i3 & 14) | 12582912 | (i82 & 896) | (i82 & 7168) | (i82 & 57344), 98);
                if (ComposerKt.isTraceInProgress()) {
                }
                windowInsets4 = windowInsets3;
                modifier4 = modifier3;
                j4 = j62;
                j5 = j3;
                f3 = f2;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0170 A[PHI: r0 r8 r9 r13 r15 r20
      0x0170: PHI (r0v12 androidx.compose.material3.NavigationBarItemColors) = (r0v8 androidx.compose.material3.NavigationBarItemColors), (r0v16 androidx.compose.material3.NavigationBarItemColors) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r8v5 androidx.compose.ui.Modifier) = (r8v3 androidx.compose.ui.Modifier), (r8v2 androidx.compose.ui.Modifier) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r9v4 boolean) = (r9v2 boolean), (r9v1 boolean) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v6 boolean) = (r13v4 boolean), (r13v3 boolean) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r15v6 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r15v4 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r15v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r20v8 int) = (r20v6 int), (r20v5 int) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationBarItem(final Row5 row5, final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z3, NavigationBarItemColors navigationBarItemColors, InteractionSource3 interactionSource3, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i4;
        Modifier modifier2;
        int i5;
        final boolean z4;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        boolean z5;
        int i8;
        int i9;
        final NavigationBarItemColors navigationBarItemColorsColors;
        int i10;
        InteractionSource3 interactionSource32;
        InteractionSource3 interactionSource33;
        Object objRememberedValue;
        Composer.Companion companion;
        InteractionSource3 interactionSource34;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        long jOffset;
        boolean zChanged;
        Object objRememberedValue3;
        boolean zChanged2;
        Object objRememberedValue4;
        final InteractionSource3 interactionSource35;
        final NavigationBarItemColors navigationBarItemColors2;
        final boolean z6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-663510974);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(row5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i2 & 4) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function23 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
                }
                i4 = i2 & 8;
                if (i4 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    i5 = i2 & 16;
                    if (i5 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            z4 = z2;
                            i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                        i6 = i2 & 32;
                        if (i6 != 0) {
                            i3 |= 1572864;
                        } else {
                            if ((1572864 & i) == 0) {
                                function24 = function22;
                                i3 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                            }
                            i7 = i2 & 64;
                            if (i7 == 0) {
                                i3 |= 12582912;
                                z5 = z3;
                            } else {
                                z5 = z3;
                                if ((i & 12582912) == 0) {
                                    i3 |= composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
                                }
                            }
                            if ((i & 100663296) == 0) {
                                i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(navigationBarItemColors)) ? 67108864 : 33554432;
                            }
                            i8 = i2 & 256;
                            if (i8 != 0) {
                                if ((i & 805306368) == 0) {
                                    i9 = i8;
                                    i3 |= composerStartRestartGroup.changed(interactionSource3) ? 536870912 : 268435456;
                                }
                                if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    int i11 = i3;
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i4 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            z4 = true;
                                        }
                                        if (i6 != 0) {
                                            function24 = null;
                                        }
                                        if (i7 != 0) {
                                            z5 = true;
                                        }
                                        if ((i2 & 128) == 0) {
                                            navigationBarItemColorsColors = NavigationBarItemDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                            i11 &= -234881025;
                                        } else {
                                            navigationBarItemColorsColors = navigationBarItemColors;
                                        }
                                        if (i9 == 0) {
                                            i10 = i11;
                                            interactionSource32 = null;
                                        } else {
                                            interactionSource32 = interactionSource3;
                                            i10 = i11;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-663510974, i10, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:180)");
                                        }
                                        composerStartRestartGroup.startReplaceGroup(-103236853);
                                        if (interactionSource32 != null) {
                                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = InteractionSource2.MutableInteractionSource();
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            }
                                            interactionSource33 = (InteractionSource3) objRememberedValue5;
                                        } else {
                                            interactionSource33 = interactionSource32;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        final NavigationBarItemColors navigationBarItemColors3 = navigationBarItemColorsColors;
                                        final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                                        final boolean z7 = z5;
                                        final boolean z8 = z4;
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function24;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1419576100, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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

                                            public final void invoke(Composer composer2, int i12) {
                                                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1419576100, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:185)");
                                                    }
                                                    SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(navigationBarItemColors3.m5896iconColorWaAFU9c$material3_release(z, z8), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer2, 48, 12);
                                                    Modifier modifierClearAndSetSemantics = (function26 == null || !(z7 || z)) ? Modifier.INSTANCE : SemanticsModifier6.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }
                                                    });
                                                    Function2<Composer, Integer, Unit> function27 = function25;
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierClearAndSetSemantics);
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                    if (composer2.getApplier() == null) {
                                                        Composables.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier, companion2.getSetModifier());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    CompositionLocal3.CompositionLocalProvider(ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(invoke$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac))), function27, composer2, ProvidedValue.$stable);
                                                    composer2.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }

                                            private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                                                return snapshotState4.getValue().getValue();
                                            }
                                        }, composerStartRestartGroup, 54);
                                        composerStartRestartGroup.startReplaceGroup(-103210706);
                                        ComposableLambda composableLambdaRememberComposableLambda2 = function24 != null ? null : ComposableLambda3.rememberComposableLambda(1644987592, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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

                                            public final void invoke(Composer composer2, int i12) {
                                                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1644987592, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:200)");
                                                    }
                                                    ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(invoke$lambda$0(SingleValueAnimation.m4805animateColorAsStateeuL9pac(navigationBarItemColorsColors.m5897textColorWaAFU9c$material3_release(z, z4), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer2, 48, 12)), Typography4.getValue(NavigationBarTokens.INSTANCE.getLabelTextFont(), composer2, 6), function24, composer2, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }

                                            private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                                                return snapshotState4.getValue().getValue();
                                            }
                                        }, composerStartRestartGroup, 54);
                                        composerStartRestartGroup.endReplaceGroup();
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                                        interactionSource34 = interactionSource33;
                                        Modifier modifier4 = modifier2;
                                        Modifier modifierWeight$default = Row5.weight$default(row5, SizeKt.m5155defaultMinSizeVpY3zN4$default(Selectable3.m5313selectableO2vRcR0(modifier4, z, interactionSource34, null, z4, Role.m7472boximpl(Role.INSTANCE.m7486getTabo7Vup1c()), function0), 0.0f, NavigationBarHeight, 1, null), 1.0f, false, 2, null);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                    m5904invokeozmzZPI(intSize.getPackedValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                public final void m5904invokeozmzZPI(long j) {
                                                    snapshotIntState2.setIntValue(IntSize.m8060getWidthimpl(j));
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierWeight$default, (Function1) objRememberedValue2);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), true);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        boolean z9 = z5;
                                        InteractionSource3 interactionSource36 = interactionSource32;
                                        snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                                        jOffset = OffsetKt.Offset((snapshotIntState2.getIntValue() - r2.mo5010roundToPx0680j_4(NavigationBarTokens.INSTANCE.m6218getActiveIndicatorWidthD9Ej5fM())) / 2, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(IndicatorVerticalOffset));
                                        Unit unit = Unit.INSTANCE;
                                        zChanged = composerStartRestartGroup.changed(interactionSource34) | composerStartRestartGroup.changed(jOffset);
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = new MappedInteractionSource(interactionSource34, jOffset, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) objRememberedValue3;
                                        ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(691730997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicatorRipple$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i12) {
                                                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(691730997, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:256)");
                                                    }
                                                    BoxKt.Box(IndicationKt.indication(Clip.clip(LayoutId2.layoutId(Modifier.INSTANCE, "indicatorRipple"), Shapes5.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer2, 6)), mappedInteractionSource, RippleKt.m5938rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7)), composer2, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54);
                                        ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-474426875, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i12) {
                                                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-474426875, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:264)");
                                                    }
                                                    Modifier modifierLayoutId = LayoutId2.layoutId(Modifier.INSTANCE, "indicator");
                                                    boolean zChanged3 = composer2.changed(snapshotState4AnimateFloatAsState);
                                                    final SnapshotState4<Float> snapshotState4 = snapshotState4AnimateFloatAsState;
                                                    Object objRememberedValue6 = composer2.rememberedValue();
                                                    if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                invoke2(graphicsLayerScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                graphicsLayerScope.setAlpha(snapshotState4.getValue().floatValue());
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(objRememberedValue6);
                                                    }
                                                    BoxKt.Box(Background3.m4871backgroundbw27NRU(GraphicsLayerModifier6.graphicsLayer(modifierLayoutId, (Function1) objRememberedValue6), navigationBarItemColorsColors.getSelectedIndicatorColor(), Shapes5.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer2, 6)), composer2, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54);
                                        zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                            objRememberedValue4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Float invoke() {
                                                    return snapshotState4AnimateFloatAsState.getValue();
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        NavigationBarItemLayout(composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, z9, (Function0) objRememberedValue4, composerStartRestartGroup, ((i10 >> 9) & 57344) | 438);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        interactionSource35 = interactionSource36;
                                        navigationBarItemColors2 = navigationBarItemColorsColors;
                                        z6 = z9;
                                        modifier3 = modifier4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i2 & 128) != 0) {
                                            interactionSource32 = interactionSource3;
                                            i10 = i11 & (-234881025);
                                            navigationBarItemColorsColors = navigationBarItemColors;
                                            composerStartRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composerStartRestartGroup.startReplaceGroup(-103236853);
                                            if (interactionSource32 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            final NavigationBarItemColors navigationBarItemColors32 = navigationBarItemColorsColors;
                                            final Function2<? super Composer, ? super Integer, Unit> function252 = function23;
                                            final boolean z72 = z5;
                                            final boolean z82 = z4;
                                            final Function2<? super Composer, ? super Integer, Unit> function262 = function24;
                                            ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambda3.rememberComposableLambda(-1419576100, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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

                                                public final void invoke(Composer composer2, int i12) {
                                                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1419576100, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:185)");
                                                        }
                                                        SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(navigationBarItemColors32.m5896iconColorWaAFU9c$material3_release(z, z82), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer2, 48, 12);
                                                        Modifier modifierClearAndSetSemantics = (function262 == null || !(z72 || z)) ? Modifier.INSTANCE : SemanticsModifier6.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }
                                                        });
                                                        Function2<Composer, Integer, Unit> function27 = function252;
                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierClearAndSetSemantics);
                                                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                                        if (composer2.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer2.startReusableNode();
                                                        if (composer2.getInserting()) {
                                                            composer2.createNode(constructor2);
                                                        } else {
                                                            composer2.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion22.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        CompositionLocal3.CompositionLocalProvider(ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(invoke$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac))), function27, composer2, ProvidedValue.$stable);
                                                        composer2.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }

                                                private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                                                    return snapshotState4.getValue().getValue();
                                                }
                                            }, composerStartRestartGroup, 54);
                                            composerStartRestartGroup.startReplaceGroup(-103210706);
                                            if (function24 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                            }
                                            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
                                            interactionSource34 = interactionSource33;
                                            Modifier modifier42 = modifier2;
                                            Modifier modifierWeight$default2 = Row5.weight$default(row5, SizeKt.m5155defaultMinSizeVpY3zN4$default(Selectable3.m5313selectableO2vRcR0(modifier42, z, interactionSource34, null, z4, Role.m7472boximpl(Role.INSTANCE.m7486getTabo7Vup1c()), function0), 0.0f, NavigationBarHeight, 1, null), 1.0f, false, 2, null);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue2 == companion.getEmpty()) {
                                            }
                                            Modifier modifierOnSizeChanged2 = OnRemeasuredModifier2.onSizeChanged(modifierWeight$default2, (Function1) objRememberedValue2);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), true);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged2);
                                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (!composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting()) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                boolean z92 = z5;
                                                InteractionSource3 interactionSource362 = interactionSource32;
                                                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                                                jOffset = OffsetKt.Offset((snapshotIntState22.getIntValue() - r2.mo5010roundToPx0680j_4(NavigationBarTokens.INSTANCE.m6218getActiveIndicatorWidthD9Ej5fM())) / 2, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(IndicatorVerticalOffset));
                                                Unit unit2 = Unit.INSTANCE;
                                                zChanged = composerStartRestartGroup.changed(interactionSource34) | composerStartRestartGroup.changed(jOffset);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (!zChanged) {
                                                    objRememberedValue3 = new MappedInteractionSource(interactionSource34, jOffset, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                    final MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) objRememberedValue3;
                                                    ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(691730997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicatorRipple$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                            invoke(composer2, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer2, int i12) {
                                                            if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(691730997, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:256)");
                                                                }
                                                                BoxKt.Box(IndicationKt.indication(Clip.clip(LayoutId2.layoutId(Modifier.INSTANCE, "indicatorRipple"), Shapes5.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer2, 6)), mappedInteractionSource2, RippleKt.m5938rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7)), composer2, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer2.skipToGroupEnd();
                                                        }
                                                    }, composerStartRestartGroup, 54);
                                                    ComposableLambda composableLambdaRememberComposableLambda42 = ComposableLambda3.rememberComposableLambda(-474426875, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                            invoke(composer2, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer2, int i12) {
                                                            if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-474426875, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:264)");
                                                                }
                                                                Modifier modifierLayoutId = LayoutId2.layoutId(Modifier.INSTANCE, "indicator");
                                                                boolean zChanged3 = composer2.changed(snapshotState4AnimateFloatAsState);
                                                                final SnapshotState4<Float> snapshotState4 = snapshotState4AnimateFloatAsState;
                                                                Object objRememberedValue6 = composer2.rememberedValue();
                                                                if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                            invoke2(graphicsLayerScope);
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                            graphicsLayerScope.setAlpha(snapshotState4.getValue().floatValue());
                                                                        }
                                                                    };
                                                                    composer2.updateRememberedValue(objRememberedValue6);
                                                                }
                                                                BoxKt.Box(Background3.m4871backgroundbw27NRU(GraphicsLayerModifier6.graphicsLayer(modifierLayoutId, (Function1) objRememberedValue6), navigationBarItemColorsColors.getSelectedIndicatorColor(), Shapes5.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer2, 6)), composer2, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer2.skipToGroupEnd();
                                                        }
                                                    }, composerStartRestartGroup, 54);
                                                    zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
                                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                    if (!zChanged2) {
                                                        objRememberedValue4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$2$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Float invoke() {
                                                                return snapshotState4AnimateFloatAsState.getValue();
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                        NavigationBarItemLayout(composableLambdaRememberComposableLambda32, composableLambdaRememberComposableLambda42, composableLambdaRememberComposableLambda5, composableLambdaRememberComposableLambda2, z92, (Function0) objRememberedValue4, composerStartRestartGroup, ((i10 >> 9) & 57344) | 438);
                                                        composerStartRestartGroup = composerStartRestartGroup;
                                                        composerStartRestartGroup.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        interactionSource35 = interactionSource362;
                                                        navigationBarItemColors2 = navigationBarItemColorsColors;
                                                        z6 = z92;
                                                        modifier3 = modifier42;
                                                    }
                                                }
                                            }
                                        } else {
                                            navigationBarItemColorsColors = navigationBarItemColors;
                                            interactionSource32 = interactionSource3;
                                            i10 = i11;
                                            composerStartRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composerStartRestartGroup.startReplaceGroup(-103236853);
                                            if (interactionSource32 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            final NavigationBarItemColors navigationBarItemColors322 = navigationBarItemColorsColors;
                                            final Function2<? super Composer, ? super Integer, Unit> function2522 = function23;
                                            final boolean z722 = z5;
                                            final boolean z822 = z4;
                                            final Function2<? super Composer, ? super Integer, Unit> function2622 = function24;
                                            ComposableLambda composableLambdaRememberComposableLambda52 = ComposableLambda3.rememberComposableLambda(-1419576100, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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

                                                public final void invoke(Composer composer2, int i12) {
                                                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1419576100, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:185)");
                                                        }
                                                        SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(navigationBarItemColors322.m5896iconColorWaAFU9c$material3_release(z, z822), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer2, 48, 12);
                                                        Modifier modifierClearAndSetSemantics = (function2622 == null || !(z722 || z)) ? Modifier.INSTANCE : SemanticsModifier6.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }
                                                        });
                                                        Function2<Composer, Integer, Unit> function27 = function2522;
                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierClearAndSetSemantics);
                                                        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
                                                        if (composer2.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer2.startReusableNode();
                                                        if (composer2.getInserting()) {
                                                            composer2.createNode(constructor22);
                                                        } else {
                                                            composer2.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion222.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion222.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                        CompositionLocal3.CompositionLocalProvider(ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(invoke$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac))), function27, composer2, ProvidedValue.$stable);
                                                        composer2.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }

                                                private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                                                    return snapshotState4.getValue().getValue();
                                                }
                                            }, composerStartRestartGroup, 54);
                                            composerStartRestartGroup.startReplaceGroup(-103210706);
                                            if (function24 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                            }
                                            final SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue;
                                            interactionSource34 = interactionSource33;
                                            Modifier modifier422 = modifier2;
                                            Modifier modifierWeight$default22 = Row5.weight$default(row5, SizeKt.m5155defaultMinSizeVpY3zN4$default(Selectable3.m5313selectableO2vRcR0(modifier422, z, interactionSource34, null, z4, Role.m7472boximpl(Role.INSTANCE.m7486getTabo7Vup1c()), function0), 0.0f, NavigationBarHeight, 1, null), 1.0f, false, 2, null);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue2 == companion.getEmpty()) {
                                            }
                                            Modifier modifierOnSizeChanged22 = OnRemeasuredModifier2.onSizeChanged(modifierWeight$default22, (Function1) objRememberedValue2);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), true);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged22);
                                            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (!composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion222.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting()) {
                                            }
                                        }
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    interactionSource35 = interactionSource3;
                                    modifier3 = modifier2;
                                    z6 = z5;
                                    navigationBarItemColors2 = navigationBarItemColors;
                                }
                                Composer composer2 = composerStartRestartGroup;
                                final boolean z10 = z4;
                                final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt.NavigationBarItem.3
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

                                        public final void invoke(Composer composer3, int i12) {
                                            NavigationBarKt.NavigationBarItem(row5, z, function0, function2, modifier3, z10, function27, z6, navigationBarItemColors2, interactionSource35, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 805306368;
                            i9 = i8;
                            if ((i3 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                int i112 = i3;
                                if ((i & 1) != 0) {
                                    if (i4 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i2 & 128) == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-103236853);
                                    if (interactionSource32 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    final NavigationBarItemColors navigationBarItemColors3222 = navigationBarItemColorsColors;
                                    final Function2<? super Composer, ? super Integer, Unit> function25222 = function23;
                                    final boolean z7222 = z5;
                                    final boolean z8222 = z4;
                                    final Function2<? super Composer, ? super Integer, Unit> function26222 = function24;
                                    ComposableLambda composableLambdaRememberComposableLambda522 = ComposableLambda3.rememberComposableLambda(-1419576100, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer22, Integer num) {
                                            invoke(composer22, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer22, int i12) {
                                            if ((i12 & 3) != 2 || !composer22.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1419576100, i12, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:185)");
                                                }
                                                SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(navigationBarItemColors3222.m5896iconColorWaAFU9c$material3_release(z, z8222), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer22, 48, 12);
                                                Modifier modifierClearAndSetSemantics = (function26222 == null || !(z7222 || z)) ? Modifier.INSTANCE : SemanticsModifier6.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }
                                                });
                                                Function2<Composer, Integer, Unit> function272 = function25222;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer22, 0);
                                                CompositionLocalMap currentCompositionLocalMap222 = composer22.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier222 = ComposedModifier2.materializeModifier(composer22, modifierClearAndSetSemantics);
                                                ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor222 = companion2222.getConstructor();
                                                if (composer22.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer22.startReusableNode();
                                                if (composer22.getInserting()) {
                                                    composer22.createNode(constructor222);
                                                } else {
                                                    composer22.useNode();
                                                }
                                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer22);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy222, companion2222.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap222, companion2222.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2222.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier222, companion2222.getSetModifier());
                                                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                CompositionLocal3.CompositionLocalProvider(ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(invoke$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac))), function272, composer22, ProvidedValue.$stable);
                                                composer22.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer22.skipToGroupEnd();
                                        }

                                        private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                                            return snapshotState4.getValue().getValue();
                                        }
                                    }, composerStartRestartGroup, 54);
                                    composerStartRestartGroup.startReplaceGroup(-103210706);
                                    if (function24 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                    }
                                    final SnapshotIntState2 snapshotIntState2222 = (SnapshotIntState2) objRememberedValue;
                                    interactionSource34 = interactionSource33;
                                    Modifier modifier4222 = modifier2;
                                    Modifier modifierWeight$default222 = Row5.weight$default(row5, SizeKt.m5155defaultMinSizeVpY3zN4$default(Selectable3.m5313selectableO2vRcR0(modifier4222, z, interactionSource34, null, z4, Role.m7472boximpl(Role.INSTANCE.m7486getTabo7Vup1c()), function0), 0.0f, NavigationBarHeight, 1, null), 1.0f, false, 2, null);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                    }
                                    Modifier modifierOnSizeChanged222 = OnRemeasuredModifier2.onSizeChanged(modifierWeight$default222, (Function1) objRememberedValue2);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), true);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap222 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier222 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged222);
                                    ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor222 = companion2222.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy222, companion2222.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap222, companion2222.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2222.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                    }
                                }
                            }
                            Composer composer22 = composerStartRestartGroup;
                            final boolean z102 = z4;
                            final Function2<? super Composer, ? super Integer, Unit> function272 = function24;
                            scopeUpdateScopeEndRestartGroup = composer22.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        function24 = function22;
                        i7 = i2 & 64;
                        if (i7 == 0) {
                        }
                        if ((i & 100663296) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                        }
                        i9 = i8;
                        if ((i3 & 306783379) != 306783378) {
                        }
                        Composer composer222 = composerStartRestartGroup;
                        final boolean z1022 = z4;
                        final Function2<? super Composer, ? super Integer, Unit> function2722 = function24;
                        scopeUpdateScopeEndRestartGroup = composer222.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z4 = z2;
                    i6 = i2 & 32;
                    if (i6 != 0) {
                    }
                    function24 = function22;
                    i7 = i2 & 64;
                    if (i7 == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    if ((i3 & 306783379) != 306783378) {
                    }
                    Composer composer2222 = composerStartRestartGroup;
                    final boolean z10222 = z4;
                    final Function2<? super Composer, ? super Integer, Unit> function27222 = function24;
                    scopeUpdateScopeEndRestartGroup = composer2222.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i5 = i2 & 16;
                if (i5 == 0) {
                }
                z4 = z2;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function24 = function22;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i3 & 306783379) != 306783378) {
                }
                Composer composer22222 = composerStartRestartGroup;
                final boolean z102222 = z4;
                final Function2<? super Composer, ? super Integer, Unit> function272222 = function24;
                scopeUpdateScopeEndRestartGroup = composer22222.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function23 = function2;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function24 = function22;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i3 & 306783379) != 306783378) {
            }
            Composer composer222222 = composerStartRestartGroup;
            final boolean z1022222 = z4;
            final Function2<? super Composer, ? super Integer, Unit> function2722222 = function24;
            scopeUpdateScopeEndRestartGroup = composer222222.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        function23 = function2;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function24 = function22;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i3 & 306783379) != 306783378) {
        }
        Composer composer2222222 = composerStartRestartGroup;
        final boolean z10222222 = z4;
        final Function2<? super Composer, ? super Integer, Unit> function27222222 = function24;
        scopeUpdateScopeEndRestartGroup = composer2222222.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationBarItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final Function0<Float> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427075886);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1427075886, i2, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:515)");
            }
            int i3 = 458752 & i2;
            int i4 = 57344 & i2;
            boolean z2 = ((i2 & 7168) == 2048) | (i3 == 131072) | (i4 == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$2$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        Measurable measurable;
                        Placeable placeableMo7239measureBRTryo0;
                        MeasureScope measureScope2 = measureScope;
                        float fFloatValue = function0.invoke().floatValue();
                        long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Measurable measurable2 = list.get(i5);
                            if (Intrinsics.areEqual(LayoutId2.getLayoutId(measurable2), "icon")) {
                                Placeable placeableMo7239measureBRTryo02 = measurable2.mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
                                float f = 2;
                                int width = placeableMo7239measureBRTryo02.getWidth() + measureScope2.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(NavigationBarKt.IndicatorHorizontalPadding * f));
                                int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                                int height = placeableMo7239measureBRTryo02.getHeight() + measureScope2.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(NavigationBarKt.getIndicatorVerticalPadding() * f));
                                int size2 = list.size();
                                int i6 = 0;
                                while (i6 < size2) {
                                    Measurable measurable3 = list.get(i6);
                                    if (Intrinsics.areEqual(LayoutId2.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable placeableMo7239measureBRTryo03 = measurable3.mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(width, height));
                                        int size3 = list.size();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i7);
                                            if (Intrinsics.areEqual(LayoutId2.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i7++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable placeableMo7239measureBRTryo04 = measurable4 != null ? measurable4.mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(iRoundToInt, height)) : null;
                                        if (function24 != null) {
                                            int size4 = list.size();
                                            for (int i8 = 0; i8 < size4; i8++) {
                                                Measurable measurable5 = list.get(i8);
                                                if (Intrinsics.areEqual(LayoutId2.getLayoutId(measurable5), AnnotatedPrivateKey.LABEL)) {
                                                    placeableMo7239measureBRTryo0 = measurable5.mo7239measureBRTryo0(jM7967copyZbe2FdA$default);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeableMo7239measureBRTryo0 = null;
                                        if (function24 == null) {
                                            return NavigationBarKt.m5902placeIconX9ElhV4(measureScope2, placeableMo7239measureBRTryo02, placeableMo7239measureBRTryo03, placeableMo7239measureBRTryo04, j);
                                        }
                                        Intrinsics.checkNotNull(placeableMo7239measureBRTryo0);
                                        return NavigationBarKt.m5903placeLabelAndIconzUg2_y0(measureScope, placeableMo7239measureBRTryo0, placeableMo7239measureBRTryo02, placeableMo7239measureBRTryo03, placeableMo7239measureBRTryo04, j, z, fFloatValue);
                                    }
                                    i6++;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i5++;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            Modifier modifierLayoutId = LayoutId2.layoutId(companion, "icon");
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function23.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(1087196576);
            if (function24 != null) {
                Modifier modifierLayoutId2 = LayoutId2.layoutId(companion, AnnotatedPrivateKey.LABEL);
                boolean z3 = (i4 == 16384) | (i3 == 131072);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.setAlpha(z ? 1.0f : function0.invoke().floatValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierLayoutId2, (Function1) objRememberedValue2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 9) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt.NavigationBarItemLayout.3
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

                public final void invoke(Composer composer2, int i5) {
                    NavigationBarKt.NavigationBarItemLayout(function2, function22, function23, function24, z, function0, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m5902placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j) {
        final int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        final int iM7989constrainHeightK40F9xA = Constraints2.m7989constrainHeightK40F9xA(j, measureScope.mo5010roundToPx0680j_4(NavigationBarHeight));
        final int width = (iM7975getMaxWidthimpl - placeable.getWidth()) / 2;
        final int height = (iM7989constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (iM7975getMaxWidthimpl - placeable2.getWidth()) / 2;
        final int height2 = (iM7989constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM7975getMaxWidthimpl, iM7989constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                Placeable placeable4 = placeable3;
                if (placeable4 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (iM7975getMaxWidthimpl - placeable4.getWidth()) / 2, (iM7989constrainHeightK40F9xA - placeable4.getHeight()) / 2, 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, width2, height2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m5903placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j, final boolean z, final float f) {
        float height = placeable2.getHeight();
        float f2 = IndicatorVerticalPadding;
        float fMo5016toPx0680j_4 = height + measureScope.mo5016toPx0680j_4(f2);
        float f3 = NavigationBarIndicatorToLabelPadding;
        float fMo5016toPx0680j_42 = fMo5016toPx0680j_4 + measureScope.mo5016toPx0680j_4(f3) + placeable.getHeight();
        float f4 = 2;
        final float fCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.m7976getMinHeightimpl(j) - fMo5016toPx0680j_42) / f4, measureScope.mo5016toPx0680j_4(f2));
        float f5 = fMo5016toPx0680j_42 + (fCoerceAtLeast * f4);
        final float height2 = ((z ? fCoerceAtLeast : (f5 - placeable2.getHeight()) / f4) - fCoerceAtLeast) * (1 - f);
        final float height3 = placeable2.getHeight() + fCoerceAtLeast + measureScope.mo5016toPx0680j_4(f2) + measureScope.mo5016toPx0680j_4(f3);
        final int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        final int width = (iM7975getMaxWidthimpl - placeable.getWidth()) / 2;
        final int width2 = (iM7975getMaxWidthimpl - placeable2.getWidth()) / 2;
        final int width3 = (iM7975getMaxWidthimpl - placeable3.getWidth()) / 2;
        final float fMo5016toPx0680j_43 = fCoerceAtLeast - measureScope.mo5016toPx0680j_4(f2);
        return MeasureScope.layout$default(measureScope, iM7975getMaxWidthimpl, MathKt.roundToInt(f5), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                Placeable placeable5 = placeable4;
                if (placeable5 != null) {
                    int i = iM7975getMaxWidthimpl;
                    float f6 = fCoerceAtLeast;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, (i - placeable5.getWidth()) / 2, MathKt.roundToInt((f6 - measureScope2.mo5010roundToPx0680j_4(NavigationBarKt.getIndicatorVerticalPadding())) + height2), 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                if (z || f != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, MathKt.roundToInt(height3 + height2), 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, width2, MathKt.roundToInt(fCoerceAtLeast + height2), 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable3, width3, MathKt.roundToInt(fMo5016toPx0680j_43 + height2), 0.0f, 4, null);
            }
        }, 4, null);
    }

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarHeight = navigationBarTokens.m6219getContainerHeightD9Ej5fM();
        NavigationBarItemHorizontalPadding = C2002Dp.m7995constructorimpl(8);
        NavigationBarIndicatorToLabelPadding = C2002Dp.m7995constructorimpl(4);
        float f = 2;
        IndicatorHorizontalPadding = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(navigationBarTokens.m6218getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m6220getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalPadding = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(navigationBarTokens.m6217getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m6220getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalOffset = C2002Dp.m7995constructorimpl(12);
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }
}
