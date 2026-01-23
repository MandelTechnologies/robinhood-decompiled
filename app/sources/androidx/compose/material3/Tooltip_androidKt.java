package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp5;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Tooltip.android.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aj\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aH\u0010\u001f\u001a\u00020\u001c*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m3636d2 = {"Landroidx/compose/material3/TooltipScope;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpSize;", "caretSize", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "contentColor", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Lkotlin/Function0;", "", "content", "PlainTooltip-7QI4Sbk", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PlainTooltip", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/material3/CaretType;", "caretType", "Landroidx/compose/ui/unit/Density;", "density", "Landroid/content/res/Configuration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Landroidx/compose/ui/layout/LayoutCoordinates;", "anchorLayoutCoordinates", "Landroidx/compose/ui/draw/DrawResult;", "drawCaretWithPath-JKu-mZY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;", "drawCaretWithPath", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class Tooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* renamed from: PlainTooltip-7QI4Sbk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6074PlainTooltip7QI4Sbk(final TooltipScope tooltipScope, Modifier modifier, long j, Shape shape, long j2, long j3, float f, float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape plainTooltipContainerShape;
        final long plainTooltipContentColor;
        long plainTooltipContainerColor;
        int i4;
        float f3;
        int i5;
        long jM8028getUnspecifiedMYxV2XQ;
        float fM7995constructorimpl;
        float f4;
        Shape shape2;
        int i6;
        final long j4;
        long j5;
        Modifier modifierThen;
        Composer composer2;
        final Modifier modifier3;
        final long j6;
        final Shape shape3;
        final long j7;
        final float f5;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1407069716);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(tooltipScope) : composerStartRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 4) == 0) {
                    plainTooltipContainerShape = shape;
                    int i8 = composerStartRestartGroup.changed(plainTooltipContainerShape) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    plainTooltipContainerShape = shape;
                }
                i3 |= i8;
            } else {
                plainTooltipContainerShape = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 8) == 0) {
                    plainTooltipContentColor = j2;
                    int i9 = composerStartRestartGroup.changed(plainTooltipContentColor) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    plainTooltipContentColor = j2;
                }
                i3 |= i9;
            } else {
                plainTooltipContentColor = j2;
            }
            if ((i & 196608) != 0) {
                plainTooltipContainerColor = j3;
                i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(plainTooltipContainerColor)) ? 131072 : 65536;
            } else {
                plainTooltipContainerColor = j3;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
            }
            if ((i2 & 128) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) == 0) {
                        jM8028getUnspecifiedMYxV2XQ = Dp5.INSTANCE.m8028getUnspecifiedMYxV2XQ();
                        i3 &= -897;
                    } else {
                        jM8028getUnspecifiedMYxV2XQ = j;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    float fM7995constructorimpl2 = i4 == 0 ? C2002Dp.m7995constructorimpl(0) : f3;
                    if (i5 == 0) {
                        f4 = fM7995constructorimpl2;
                        shape2 = plainTooltipContainerShape;
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                    } else {
                        fM7995constructorimpl = f2;
                        f4 = fM7995constructorimpl2;
                        shape2 = plainTooltipContainerShape;
                    }
                    i6 = i3;
                    j4 = jM8028getUnspecifiedMYxV2XQ;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -458753;
                    }
                    fM7995constructorimpl = f2;
                    shape2 = plainTooltipContainerShape;
                    f4 = f3;
                    i6 = i3;
                    j4 = j;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1407069716, i6, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:73)");
                }
                composerStartRestartGroup.startReplaceGroup(-333850415);
                if (j4 == 9205357640488583168L) {
                    j5 = plainTooltipContainerColor;
                    modifierThen = modifier2;
                } else {
                    final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    final Configuration configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changedInstance(configuration) | ((((i6 & 458752) ^ 196608) > 131072 && composerStartRestartGroup.changed(plainTooltipContainerColor)) || (i6 & 196608) == 131072) | ((((i6 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(j4)) || (i6 & 384) == 256);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final long j8 = j4;
                        final long j9 = plainTooltipContainerColor;
                        objRememberedValue = new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$drawCaretModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m6076drawCaretWithPathJKumZY(cacheDrawScope, CaretType.Plain, density, configuration, j9, j8, layoutCoordinates);
                            }
                        };
                        j5 = j9;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        j5 = plainTooltipContainerColor;
                    }
                    modifierThen = tooltipScope.drawCaret(companion, (Function2) objRememberedValue).then(modifier2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i10 = i6 >> 6;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5967SurfaceT9BRK9s(modifierThen, shape2, j5, 0L, f4, fM7995constructorimpl, null, ComposableLambda3.rememberComposableLambda(1430116975, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
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

                    public final void invoke(Composer composer3, int i11) {
                        if ((i11 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1430116975, i11, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:97)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m5173sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                            long j10 = plainTooltipContentColor;
                            Function2<Composer, Integer, Unit> function22 = function2;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j10)), TextKt.getLocalTextStyle().provides(Typography4.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextFont(), composer3, 6))}, function22, composer3, ProvidedValue.$stable);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composer2, ((i6 >> 9) & 896) | (i10 & 112) | 12582912 | (57344 & i10) | (i10 & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                j6 = plainTooltipContentColor;
                shape3 = shape2;
                j7 = j5;
                f5 = f4;
                f6 = fM7995constructorimpl;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j4 = j;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                shape3 = plainTooltipContainerShape;
                j7 = plainTooltipContainerColor;
                j6 = plainTooltipContentColor;
                f5 = f3;
                f6 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$2
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

                    public final void invoke(Composer composer3, int i11) {
                        Tooltip_androidKt.m6074PlainTooltip7QI4Sbk(tooltipScope, modifier3, j4, shape3, j6, j7, f5, f6, function2, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i & 196608) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                i6 = i3;
                j4 = jM8028getUnspecifiedMYxV2XQ;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-333850415);
                if (j4 == 9205357640488583168L) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i102 = i6 >> 6;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5967SurfaceT9BRK9s(modifierThen, shape2, j5, 0L, f4, fM7995constructorimpl, null, ComposableLambda3.rememberComposableLambda(1430116975, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
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

                    public final void invoke(Composer composer3, int i11) {
                        if ((i11 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1430116975, i11, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:97)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m5173sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                            long j10 = plainTooltipContentColor;
                            Function2<Composer, Integer, Unit> function22 = function2;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j10)), TextKt.getLocalTextStyle().provides(Typography4.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextFont(), composer3, 6))}, function22, composer3, ProvidedValue.$stable);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composer2, ((i6 >> 9) & 896) | (i102 & 112) | 12582912 | (57344 & i102) | (i102 & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                j6 = plainTooltipContentColor;
                shape3 = shape2;
                j7 = j5;
                f5 = f4;
                f6 = fM7995constructorimpl;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca A[PHI: r15
      0x00ca: PHI (r15v2 long) = (r15v1 long), (r15v4 long) binds: [B:17:0x009c, B:19:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: drawCaretWithPath-JKu-mZY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DrawResult m6076drawCaretWithPathJKumZY(CacheDrawScope cacheDrawScope, CaretType caretType, Density density, Configuration configuration, final long j, long j2, final LayoutCoordinates layoutCoordinates) {
        long jOffset;
        final Path Path = AndroidPath_androidKt.Path();
        if (layoutCoordinates != null) {
            int iMo5010roundToPx0680j_4 = density.mo5010roundToPx0680j_4(Dp5.m8023getHeightD9Ej5fM(j2));
            int iMo5010roundToPx0680j_42 = density.mo5010roundToPx0680j_4(Dp5.m8024getWidthD9Ej5fM(j2));
            int iMo5010roundToPx0680j_43 = density.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(configuration.screenWidthDp));
            int iMo5010roundToPx0680j_44 = density.mo5010roundToPx0680j_4(TooltipKt.getSpacingBetweenTooltipAndAnchor());
            Rect rectBoundsInWindow = LayoutCoordinates2.boundsInWindow(layoutCoordinates);
            float left = rectBoundsInWindow.getLeft();
            float right = rectBoundsInWindow.getRight();
            float top = rectBoundsInWindow.getTop();
            float f = 2;
            float f2 = (right + left) / f;
            float f3 = right - left;
            float fM6583getWidthimpl = Size.m6583getWidthimpl(cacheDrawScope.m6459getSizeNHjbRc());
            float fM6580getHeightimpl = Size.m6580getHeightimpl(cacheDrawScope.m6459getSizeNHjbRc());
            boolean z = (top - fM6580getHeightimpl) - ((float) iMo5010roundToPx0680j_44) < 0.0f;
            if (z) {
                fM6580getHeightimpl = 0.0f;
            }
            if (caretType == CaretType.Plain) {
                float f4 = iMo5010roundToPx0680j_43;
                if ((fM6583getWidthimpl / f) + f2 > f4) {
                    jOffset = OffsetKt.Offset(fM6583getWidthimpl - (f4 - f2), fM6580getHeightimpl);
                } else {
                    jOffset = OffsetKt.Offset(f2 - Math.max(left - ((Size.m6583getWidthimpl(cacheDrawScope.m6459getSizeNHjbRc()) / f) - (f3 / f)), 0.0f), fM6580getHeightimpl);
                }
            } else {
                long jOffset2 = OffsetKt.Offset(f2 - left, fM6580getHeightimpl);
                float f5 = iMo5010roundToPx0680j_43;
                if (left + fM6583getWidthimpl > f5) {
                    float f6 = right - fM6583getWidthimpl;
                    jOffset2 = OffsetKt.Offset(f2 - f6, fM6580getHeightimpl);
                    if (f6 < 0.0f) {
                        float f7 = fM6583getWidthimpl / f;
                        float f8 = f3 / f;
                        if ((left - f7) + f8 <= 0.0f) {
                            jOffset = OffsetKt.Offset(f2, fM6580getHeightimpl);
                        } else if ((right + f7) - f8 >= f5) {
                            jOffset = OffsetKt.Offset(fM6583getWidthimpl - (f5 - f2), fM6580getHeightimpl);
                        } else {
                            jOffset = OffsetKt.Offset(f7, fM6580getHeightimpl);
                        }
                    } else {
                        jOffset = jOffset2;
                    }
                }
            }
            if (z) {
                Path.moveTo(Offset.m6543getXimpl(jOffset), Offset.m6544getYimpl(jOffset));
                float f9 = iMo5010roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m6543getXimpl(jOffset) + f9, Offset.m6544getYimpl(jOffset));
                Path.lineTo(Offset.m6543getXimpl(jOffset), Offset.m6544getYimpl(jOffset) - iMo5010roundToPx0680j_4);
                Path.lineTo(Offset.m6543getXimpl(jOffset) - f9, Offset.m6544getYimpl(jOffset));
                Path.close();
            } else {
                Path.moveTo(Offset.m6543getXimpl(jOffset), Offset.m6544getYimpl(jOffset));
                float f10 = iMo5010roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m6543getXimpl(jOffset) + f10, Offset.m6544getYimpl(jOffset));
                Path.lineTo(Offset.m6543getXimpl(jOffset), Offset.m6544getYimpl(jOffset) + iMo5010roundToPx0680j_4);
                Path.lineTo(Offset.m6543getXimpl(jOffset) - f10, Offset.m6544getYimpl(jOffset));
                Path.close();
            }
        }
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$drawCaretWithPath$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                if (layoutCoordinates != null) {
                    contentDrawScope.drawContent();
                    DrawScope.m6955drawPathLG529CI$default(contentDrawScope, Path, j, 0.0f, null, null, 0, 60, null);
                }
            }
        });
    }
}
