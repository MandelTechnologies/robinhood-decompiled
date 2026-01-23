package com.robinhood.android.aura;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.Focusable2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Blur;
import androidx.compose.p011ui.draw.Blur3;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutModifier4;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.aura.StaticAura;
import com.robinhood.android.aura.StaticAura5;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StaticAura.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\"\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002"}, m3636d2 = {"StaticShader", "", "modifier", "Landroidx/compose/ui/Modifier;", "type", "Lcom/robinhood/android/aura/StaticAuraType;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/aura/StaticAuraType;Landroidx/compose/runtime/Composer;II)V", "generateAuraBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "maxWidthPx", "", "createBitmap", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "scaleAndBlur", "paddedBitmap", "PreviewStaticShader", "(Landroidx/compose/runtime/Composer;I)V", "lib-aura_externalDebug", "selectedType", "expanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.aura.StaticAuraKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StaticAura {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewStaticShader$lambda$18(int i, Composer composer, int i2) {
        PreviewStaticShader(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticShader$lambda$0(Modifier modifier, StaticAura5 staticAura5, int i, int i2, Composer composer, int i3) {
        StaticShader(modifier, staticAura5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void StaticShader(final Modifier modifier, final StaticAura5 type2, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(type2, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(588750545);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(type2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(588750545, i3, -1, "com.robinhood.android.aura.StaticShader (StaticAura.kt:49)");
            }
            BoxWithConstraints.BoxWithConstraints(null, null, false, ComposableLambda3.rememberComposableLambda(1989318055, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.aura.StaticAuraKt.StaticShader.1

                /* compiled from: StaticAura.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.aura.StaticAuraKt$StaticShader$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<StaticAura5, Composer, Integer, Unit> {
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ BoxWithConstraints4 $this_BoxWithConstraints;

                    AnonymousClass1(Modifier modifier, BoxWithConstraints4 boxWithConstraints4) {
                        this.$modifier = modifier;
                        this.$this_BoxWithConstraints = boxWithConstraints4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(StaticAura5 staticAura5, Composer composer, Integer num) {
                        invoke(staticAura5, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final StaticAura5 auraType, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(auraType, "auraType");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1402022047, i, -1, "com.robinhood.android.aura.StaticShader.<anonymous>.<anonymous> (StaticAura.kt:52)");
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            composer.startReplaceGroup(-918052221);
                            Modifier modifierM6448blurF8QBwvs = Blur.m6448blurF8QBwvs(SizeKt.fillMaxSize$default(Focusable2.focusable$default(this.$modifier, false, null, 2, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(this.$this_BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() * 0.25f), Blur3.INSTANCE.m6457getUnboundedGoahg());
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(auraType);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.aura.StaticAuraKt$StaticShader$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return StaticAura.C96191.AnonymousClass1.invoke$lambda$1$lambda$0(auraType, (DrawScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Canvas2.Canvas(modifierM6448blurF8QBwvs, (Function1) objRememberedValue, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-917350288);
                            Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(this.$this_BoxWithConstraints.mo5103getMaxWidthD9Ej5fM());
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(auraType);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = StaticAura.generateAuraBitmap(context, auraType, fMo5016toPx0680j_4);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Bitmap bitmap = (Bitmap) objRememberedValue2;
                            composer.endReplaceGroup();
                            Modifier modifierFocusable$default = Focusable2.focusable$default(this.$modifier, false, null, 2, null);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.aura.StaticAuraKt$StaticShader$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return StaticAura.C96191.AnonymousClass1.invoke$lambda$5$lambda$4((GraphicsLayerScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            ImageKt.m4912Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, GraphicsLayerModifier6.graphicsLayer(modifierFocusable$default, (Function1) objRememberedValue3), null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, composer, 24624, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(StaticAura5 staticAura5, DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fM6582getMinDimensionimpl = Size.m6582getMinDimensionimpl(Canvas.mo6963getSizeNHjbRc()) * 0.5f;
                        Brush.Companion companion = Brush.INSTANCE;
                        Tuples2[] tuples2Arr = (Tuples2[]) staticAura5.getColors().toArray(new Tuples2[0]);
                        DrawScope.m6946drawCircleV9BoPsw$default(Canvas, Brush.Companion.m6681radialGradientP_VxKs$default(companion, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), staticAura5.mo11353getRadialGradientCenteresNoTWg(Canvas.mo6963getSizeNHjbRc(), fM6582getMinDimensionimpl), fM6582getMinDimensionimpl, 0, 8, (Object) null), fM6582getMinDimensionimpl, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(GraphicsLayerScope graphicsLayer) {
                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.setClip(false);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 6) == 0) {
                        i5 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1989318055, i5, -1, "com.robinhood.android.aura.StaticShader.<anonymous> (StaticAura.kt:51)");
                    }
                    Crossfade.Crossfade(type2, (Modifier) null, (FiniteAnimationSpec<Float>) null, "aura", ComposableLambda3.rememberComposableLambda(1402022047, true, new AnonymousClass1(modifier, BoxWithConstraints), composer2, 54), composer2, 27648, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.aura.StaticAuraKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StaticAura.StaticShader$lambda$0(modifier, type2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean PreviewStaticShader$lambda$17$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticAura5 PreviewStaticShader$lambda$17$lambda$5(SnapshotState<StaticAura5> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Bitmap createBitmap(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapCreateBitmap;
        return (config == null || (bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config)) == null) ? Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888) : bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap generateAuraBitmap(Context context, StaticAura5 staticAura5, float f) {
        int i = (int) f;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), staticAura5.getBitmapResource());
        Intrinsics.checkNotNull(bitmapDecodeResource);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, i, i, true);
        float f2 = 0.5f * f;
        Bitmap bitmapCreateBitmap = createBitmap(i, (int) (f + (2 * f2)), bitmapDecodeResource.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, f2, (Paint) null);
        return scaleAndBlur(bitmapCreateBitmap, context);
    }

    private static final Bitmap scaleAndBlur(Bitmap bitmap, Context context) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 50, (bitmap.getHeight() / bitmap.getWidth()) * 50, true);
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, allocationCreateFromBitmap.getElement());
        scriptIntrinsicBlurCreate.setRadius(20.0f);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCreateScaledBitmap);
        scriptIntrinsicBlurCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static final void PreviewStaticShader(Composer composer, final int i) {
        final SnapshotState snapshotState;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1414130193);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1414130193, i, -1, "com.robinhood.android.aura.PreviewStaticShader (StaticAura.kt:198)");
            }
            StaticAura5.Neutral neutral = StaticAura5.Neutral.INSTANCE;
            List listListOf = CollectionsKt.listOf((Object[]) new StaticAura5[]{StaticAura5.Negative.INSTANCE, neutral, StaticAura5.Positive.INSTANCE});
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(neutral, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function3() { // from class: com.robinhood.android.aura.StaticAuraKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return StaticAura.PreviewStaticShader$lambda$17$lambda$9$lambda$8((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            StaticShader(LayoutModifier4.layout(modifierFillMaxWidth$default, (Function3) objRememberedValue2), PreviewStaticShader$lambda$17$lambda$5(snapshotState2), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.aura.StaticAuraKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StaticAura.PreviewStaticShader$lambda$17$lambda$14$lambda$13(snapshotState3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonKt.Button((Function0) objRememberedValue4, boxScopeInstance.align(companion, companion2.getBottomCenter()), false, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-41856411, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.aura.StaticAuraKt$PreviewStaticShader$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 Button, Composer composer3, int i2) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i2 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-41856411, i2, -1, "com.robinhood.android.aura.PreviewStaticShader.<anonymous>.<anonymous> (StaticAura.kt:223)");
                    }
                    String simpleName = Reflection.getOrCreateKotlinClass(StaticAura.PreviewStaticShader$lambda$17$lambda$5(snapshotState2).getClass()).getSimpleName();
                    Intrinsics.checkNotNull(simpleName);
                    TextKt.m5665Text4IGK_g(simpleName, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306374, 508);
            boolean zPreviewStaticShader$lambda$17$lambda$11 = PreviewStaticShader$lambda$17$lambda$11(snapshotState3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion4.getEmpty()) {
                snapshotState = snapshotState3;
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.aura.StaticAuraKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StaticAura.PreviewStaticShader$lambda$17$lambda$16$lambda$15(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                snapshotState = snapshotState3;
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidMenu_androidKt.m5541DropdownMenu4kj_NE(zPreviewStaticShader$lambda$17$lambda$11, (Function0) objRememberedValue5, boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter()), 0L, null, null, ComposableLambda3.rememberComposableLambda(-864979992, true, new StaticAura3(listListOf, snapshotState2, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912, 56);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.aura.StaticAuraKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StaticAura.PreviewStaticShader$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult PreviewStaticShader$lambda$17$lambda$9$lambda$8(MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(constraints.getValue());
        return MeasureScope.layout$default(layout, Constraints.m7975getMaxWidthimpl(constraints.getValue()), Constraints.m7974getMaxHeightimpl(constraints.getValue()), null, new Function1() { // from class: com.robinhood.android.aura.StaticAuraKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StaticAura.PreviewStaticShader$lambda$17$lambda$9$lambda$8$lambda$7(placeableMo7239measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewStaticShader$lambda$17$lambda$9$lambda$8$lambda$7(Placeable placeable, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, -((int) (placeable.getHeight() * 0.5f)), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewStaticShader$lambda$17$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewStaticShader$lambda$17$lambda$14$lambda$13(SnapshotState snapshotState) {
        PreviewStaticShader$lambda$17$lambda$12(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewStaticShader$lambda$17$lambda$16$lambda$15(SnapshotState snapshotState) {
        PreviewStaticShader$lambda$17$lambda$12(snapshotState, false);
        return Unit.INSTANCE;
    }
}
