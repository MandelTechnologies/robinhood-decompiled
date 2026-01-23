package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.Handle;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Alignment2;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Canvas3;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.ImageBitmap2;
import androidx.compose.p011ui.graphics.ImageBitmap3;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp5;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.p011ui.window.PopupProperties;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aL\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0016\u001a\u00020\u000b*\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010!\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0001¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m3636d2 = {"Landroidx/compose/foundation/text/selection/OffsetProvider;", "offsetProvider", "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "Landroidx/compose/ui/unit/DpSize;", "minTouchTargetSize", "", "lineHeight", "Landroidx/compose/ui/Modifier;", "modifier", "", "SelectionHandle-wLIcFTc", "(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SelectionHandle", "Lkotlin/Function0;", "iconVisible", "isLeft", "SelectionHandleIcon", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "drawSelectionHandle", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "Landroidx/compose/ui/graphics/ImageBitmap;", "createHandleImage", "(Landroidx/compose/ui/draw/CacheDrawScope;F)Landroidx/compose/ui/graphics/ImageBitmap;", "positionProvider", "Landroidx/compose/ui/Alignment;", "handleReferencePoint", "content", "HandlePopup", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AndroidSelectionHandles_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5508SelectionHandlewLIcFTc(final SelectionHandles2 selectionHandles2, final boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, long j, final float f, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        ResolvedTextDirection resolvedTextDirection2;
        boolean z3;
        long jM8028getUnspecifiedMYxV2XQ;
        final boolean zIsLeftSelectionHandle;
        boolean zChanged;
        Object objRememberedValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(-466280168);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(selectionHandles2) : composerStartRestartGroup.changedInstance(selectionHandles2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            resolvedTextDirection2 = resolvedTextDirection;
        } else {
            resolvedTextDirection2 = resolvedTextDirection;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(resolvedTextDirection2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
        }
        if ((i & 24576) == 0) {
            jM8028getUnspecifiedMYxV2XQ = j;
            i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(jM8028getUnspecifiedMYxV2XQ)) ? 16384 : 8192;
        } else {
            jM8028getUnspecifiedMYxV2XQ = j;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((533651 & i3) != 533650, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    jM8028getUnspecifiedMYxV2XQ = Dp5.INSTANCE.m8028getUnspecifiedMYxV2XQ();
                    i3 &= -57345;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-466280168, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
                }
                zIsLeftSelectionHandle = SelectionHandles5.isLeftSelectionHandle(z, resolvedTextDirection, z2);
                Alignment2 alignment2 = Alignment2.INSTANCE;
                Alignment topRight = !zIsLeftSelectionHandle ? alignment2.getTopRight() : alignment2.getTopLeft();
                int i4 = i3 & 14;
                zChanged = ((i3 & 112) != 32) | (i4 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(selectionHandles2))) | composerStartRestartGroup.changed(zIsLeftSelectionHandle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1
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
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            long jMo5345provideF1C5BW0 = selectionHandles2.mo5345provideF1C5BW0();
                            semanticsPropertyReceiver.set(SelectionHandles5.getSelectionHandleInfoKey(), new SelectionHandleInfo(z ? Handle.SelectionStart : Handle.SelectionEnd, jMo5345provideF1C5BW0, zIsLeftSelectionHandle ? SelectionHandles3.Left : SelectionHandles3.Right, (9223372034707292159L & jMo5345provideF1C5BW0) != 9205357640488583168L, null));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null);
                final ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                final long j2 = jM8028getUnspecifiedMYxV2XQ;
                HandlePopup(selectionHandles2, topRight, ComposableLambda3.rememberComposableLambda(1365123137, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1365123137, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
                        }
                        ProvidedValue<ViewConfiguration> providedValueProvides = CompositionLocalsKt.getLocalViewConfiguration().provides(viewConfiguration);
                        final long j3 = j2;
                        final boolean z4 = zIsLeftSelectionHandle;
                        final Modifier modifier2 = modifierSemantics$default;
                        final SelectionHandles2 selectionHandles22 = selectionHandles2;
                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1260045569, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                Arrangement.Horizontal left;
                                if (!composer3.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1260045569, i6, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
                                }
                                if (j3 != 9205357640488583168L) {
                                    composer3.startReplaceGroup(-837626688);
                                    if (z4) {
                                        left = Arrangement.Absolute.INSTANCE.getRight();
                                    } else {
                                        left = Arrangement.Absolute.INSTANCE.getLeft();
                                    }
                                    Modifier modifierM5165requiredSizeInqDBjuR0$default = SizeKt.m5165requiredSizeInqDBjuR0$default(modifier2, Dp5.m8024getWidthD9Ej5fM(j3), Dp5.m8023getHeightD9Ej5fM(j3), 0.0f, 0.0f, 12, null);
                                    final SelectionHandles2 selectionHandles23 = selectionHandles22;
                                    boolean z5 = z4;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(left, Alignment.INSTANCE.getTop(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5165requiredSizeInqDBjuR0$default);
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
                                    Row6 row6 = Row6.INSTANCE;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    boolean zChangedInstance = composer3.changedInstance(selectionHandles23);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                return Boolean.valueOf((selectionHandles23.mo5345provideF1C5BW0() & 9223372034707292159L) != 9205357640488583168L);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    AndroidSelectionHandles_androidKt.SelectionHandleIcon(companion2, (Function0) objRememberedValue2, z5, composer3, 6);
                                    composer3.endNode();
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-836697680);
                                    Modifier modifier3 = modifier2;
                                    boolean zChangedInstance2 = composer3.changedInstance(selectionHandles22);
                                    final SelectionHandles2 selectionHandles24 = selectionHandles22;
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                return Boolean.valueOf((selectionHandles24.mo5345provideF1C5BW0() & 9223372034707292159L) != 9205357640488583168L);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    AndroidSelectionHandles_androidKt.SelectionHandleIcon(modifier3, (Function0) objRememberedValue3, z4, composer3, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, i4 | 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM8028getUnspecifiedMYxV2XQ = j2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                zIsLeftSelectionHandle = SelectionHandles5.isLeftSelectionHandle(z, resolvedTextDirection, z2);
                Alignment2 alignment22 = Alignment2.INSTANCE;
                if (!zIsLeftSelectionHandle) {
                }
                int i42 = i3 & 14;
                if (i42 != 4) {
                    zChanged = ((i3 & 112) != 32) | (i42 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(selectionHandles2))) | composerStartRestartGroup.changed(zIsLeftSelectionHandle);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1
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
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                long jMo5345provideF1C5BW0 = selectionHandles2.mo5345provideF1C5BW0();
                                semanticsPropertyReceiver.set(SelectionHandles5.getSelectionHandleInfoKey(), new SelectionHandleInfo(z ? Handle.SelectionStart : Handle.SelectionEnd, jMo5345provideF1C5BW0, zIsLeftSelectionHandle ? SelectionHandles3.Left : SelectionHandles3.Right, (9223372034707292159L & jMo5345provideF1C5BW0) != 9205357640488583168L, null));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        final Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null);
                        final ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        final long j22 = jM8028getUnspecifiedMYxV2XQ;
                        HandlePopup(selectionHandles2, topRight, ComposableLambda3.rememberComposableLambda(1365123137, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i5) {
                                if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1365123137, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
                                }
                                ProvidedValue<ViewConfiguration> providedValueProvides = CompositionLocalsKt.getLocalViewConfiguration().provides(viewConfiguration2);
                                final long j3 = j22;
                                final boolean z4 = zIsLeftSelectionHandle;
                                final Modifier modifier2 = modifierSemantics$default2;
                                final SelectionHandles2 selectionHandles22 = selectionHandles2;
                                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1260045569, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i6) {
                                        Arrangement.Horizontal left;
                                        if (!composer3.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1260045569, i6, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
                                        }
                                        if (j3 != 9205357640488583168L) {
                                            composer3.startReplaceGroup(-837626688);
                                            if (z4) {
                                                left = Arrangement.Absolute.INSTANCE.getRight();
                                            } else {
                                                left = Arrangement.Absolute.INSTANCE.getLeft();
                                            }
                                            Modifier modifierM5165requiredSizeInqDBjuR0$default = SizeKt.m5165requiredSizeInqDBjuR0$default(modifier2, Dp5.m8024getWidthD9Ej5fM(j3), Dp5.m8023getHeightD9Ej5fM(j3), 0.0f, 0.0f, 12, null);
                                            final SelectionHandles2 selectionHandles23 = selectionHandles22;
                                            boolean z5 = z4;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(left, Alignment.INSTANCE.getTop(), composer3, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5165requiredSizeInqDBjuR0$default);
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
                                            Row6 row6 = Row6.INSTANCE;
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            boolean zChangedInstance = composer3.changedInstance(selectionHandles23);
                                            Object objRememberedValue2 = composer3.rememberedValue();
                                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        return Boolean.valueOf((selectionHandles23.mo5345provideF1C5BW0() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue2);
                                            }
                                            AndroidSelectionHandles_androidKt.SelectionHandleIcon(companion2, (Function0) objRememberedValue2, z5, composer3, 6);
                                            composer3.endNode();
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(-836697680);
                                            Modifier modifier3 = modifier2;
                                            boolean zChangedInstance2 = composer3.changedInstance(selectionHandles22);
                                            final SelectionHandles2 selectionHandles24 = selectionHandles22;
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        return Boolean.valueOf((selectionHandles24.mo5345provideF1C5BW0() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue3);
                                            }
                                            AndroidSelectionHandles_androidKt.SelectionHandleIcon(modifier3, (Function0) objRememberedValue3, z4, composer3, 0);
                                            composer3.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, i42 | 384);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        jM8028getUnspecifiedMYxV2XQ = j22;
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ResolvedTextDirection resolvedTextDirection3 = resolvedTextDirection2;
            final boolean z4 = z3;
            final long j3 = jM8028getUnspecifiedMYxV2XQ;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    AndroidSelectionHandles_androidKt.m5508SelectionHandlewLIcFTc(selectionHandles2, z, resolvedTextDirection3, z4, j3, f, modifier, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void SelectionHandleIcon(final Modifier modifier, final Function0<Boolean> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2111672474);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:127)");
            }
            Spacer2.Spacer(drawSelectionHandle(SizeKt.m5171sizeVpY3zN4(modifier, SelectionHandles5.getHandleWidth(), SelectionHandles5.getHandleHeight()), function0, z), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandleIcon.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    AndroidSelectionHandles_androidKt.SelectionHandleIcon(modifier, function0, z, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Modifier drawSelectionHandle(Modifier modifier, final Function0<Boolean> function0, final boolean z) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(-196777734);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:133)");
                }
                final long selectionHandleColor = ((SelectionColors) composer.consume(TextSelectionColors2.getLocalTextSelectionColors())).getSelectionHandleColor();
                boolean zChanged = composer.changed(selectionHandleColor) | composer.changed(function0) | composer.changed(z);
                final Function0<Boolean> function02 = function0;
                final boolean z2 = z;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            final ImageBitmap imageBitmapCreateHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.m6459getSizeNHjbRc() >> 32)) / 2.0f);
                            final ColorFilter colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, selectionHandleColor, 0, 2, null);
                            final Function0<Boolean> function03 = function02;
                            final boolean z3 = z2;
                            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
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
                                    contentDrawScope.drawContent();
                                    if (function03.invoke().booleanValue()) {
                                        if (z3) {
                                            ImageBitmap imageBitmap = imageBitmapCreateHandleImage;
                                            ColorFilter colorFilter = colorFilterM6729tintxETnrds$default;
                                            long jMo6962getCenterF1C5BW0 = contentDrawScope.mo6962getCenterF1C5BW0();
                                            DrawContext drawContext = contentDrawScope.getDrawContext();
                                            long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
                                            drawContext.getCanvas().save();
                                            try {
                                                drawContext.getTransform().mo6942scale0AR0LA0(-1.0f, 1.0f, jMo6962getCenterF1C5BW0);
                                                DrawScope.m6949drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                                return;
                                            } finally {
                                                drawContext.getCanvas().restore();
                                                drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                                            }
                                        }
                                        DrawScope.m6949drawImagegbVJVH8$default(contentDrawScope, imageBitmapCreateHandleImage, 0L, 0.0f, null, colorFilterM6729tintxETnrds$default, 0, 46, null);
                                    }
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifier2, (Function1) objRememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawWithCache;
            }
        }, 1, null);
    }

    public static final ImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || iCeil > imageBitmap.getWidth() || iCeil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmap3.m6778ImageBitmapx__hDU$default(iCeil, iCeil, ImageBitmap2.INSTANCE.m6772getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = Canvas3.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        float width = imageBitmap2.getWidth();
        float height = imageBitmap2.getHeight();
        long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m6935setSizeuvyYCjk(jM6575constructorimpl);
        canvas2.save();
        DrawScope.m6958drawRectnJ9OG0$default(canvasDrawScope2, Color.INSTANCE.m6716getBlack0d7_KjU(), 0L, canvasDrawScope2.mo6963getSizeNHjbRc(), 0.0f, null, null, BlendMode.INSTANCE.m6643getClear0nO6VwU(), 58, null);
        DrawScope.m6958drawRectnJ9OG0$default(canvasDrawScope2, Color2.Color(4278190080L), Offset.INSTANCE.m6553getZeroF1C5BW0(), Size.m6575constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.m6947drawCircleVaOC9Bg$default(canvasDrawScope2, Color2.Color(4278190080L), f, Offset.m6535constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m6935setSizeuvyYCjk(size);
        return imageBitmap2;
    }

    public static final void HandlePopup(final SelectionHandles2 selectionHandles2, final Alignment alignment, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(476043083);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(selectionHandles2) : composerStartRestartGroup.changedInstance(selectionHandles2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        boolean z = false;
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476043083, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changed(selectionHandles2))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SelectionHandles(alignment, selectionHandles2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidPopup_androidKt.Popup((SelectionHandles) objRememberedValue, null, new PopupProperties(false, false, false, null, true, false, 15, null), function2, composerStartRestartGroup, ((i2 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.HandlePopup.1
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

                public final void invoke(Composer composer2, int i3) {
                    AndroidSelectionHandles_androidKt.HandlePopup(selectionHandles2, alignment, function2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
