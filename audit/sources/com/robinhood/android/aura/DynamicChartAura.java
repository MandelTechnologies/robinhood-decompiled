package com.robinhood.android.aura;

import android.os.Build;
import android.os.Trace;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.Focusable2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Blur;
import androidx.compose.p011ui.draw.Blur3;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.aura.ChartAuraType;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilder2;
import kotlin.sequences.SequencesKt;

/* compiled from: DynamicChartAura.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0002\u001a\u00020\u0003\u001a*\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00040\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\t\u001a\u00020\u0003\u001a/\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0002\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0002\u0010\u0016\u001a!\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"downsample", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "pickEachNth", "", "", "Lcom/robinhood/models/serverdriven/experimental/api/Segment;", "overlappingChunks", "Lkotlin/sequences/Sequence;", "T", "chunkSize", "DynamicChartAura", "", "state", "Lcom/robinhood/android/aura/DynamicChartAuraState;", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Lcom/robinhood/android/aura/DynamicChartAuraState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)V", "InternalDynamicChartAura", "alphaOverride", "(Lcom/robinhood/android/aura/DynamicChartAuraState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V", "toOffset", "Landroidx/compose/ui/geometry/Offset;", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "measuredWidthPx", "measuredHeightPx", "(Lcom/robinhood/models/serverdriven/experimental/api/Point;FF)J", "lib-aura_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.aura.DynamicChartAuraKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DynamicChartAura {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DynamicChartAura$lambda$2(DynamicChartAuraState dynamicChartAuraState, Modifier modifier, AnimationSpec animationSpec, int i, int i2, Composer composer, int i3) {
        DynamicChartAura(dynamicChartAuraState, modifier, animationSpec, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalDynamicChartAura$lambda$14(DynamicChartAuraState dynamicChartAuraState, Modifier modifier, AnimationSpec animationSpec, Float f, int i, int i2, Composer composer, int i3) {
        InternalDynamicChartAura(dynamicChartAuraState, modifier, animationSpec, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Line downsample(Line line, int i) {
        Intrinsics.checkNotNullParameter(line, "<this>");
        return Line.copy$default(line, null, downsample(line.getSegments(), i), null, false, 13, null);
    }

    public static final List<Segment> downsample(final List<Segment> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return SequencesKt.toList(SequencesKt.map(overlappingChunks(SequencesKt.flatMapIterable(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.aura.DynamicChartAuraKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DynamicChartAura.downsample$lambda$0((Segment) obj);
            }
        }), i), new Function1() { // from class: com.robinhood.android.aura.DynamicChartAuraKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DynamicChartAura.downsample$lambda$1(list, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable downsample$lambda$0(Segment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPoints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Segment downsample$lambda$1(List list, List chunk) {
        Intrinsics.checkNotNullParameter(chunk, "chunk");
        return new Segment(CollectionsKt.listOf((Object[]) new Point[]{(Point) CollectionsKt.first(chunk), (Point) CollectionsKt.last(chunk)}), ((Segment) CollectionsKt.first(list)).getStyles());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: DynamicChartAura.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.aura.DynamicChartAuraKt$overlappingChunks$1", m3645f = "DynamicChartAura.kt", m3646l = {79, 83}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.aura.DynamicChartAuraKt$overlappingChunks$1 */
    static final class C96171<T> extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $chunkSize;
        final /* synthetic */ Sequence<T> $this_overlappingChunks;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C96171(int i, Sequence<? extends T> sequence, Continuation<? super C96171> continuation) {
            super(2, continuation);
            this.$chunkSize = i;
            this.$this_overlappingChunks = sequence;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96171 c96171 = new C96171(this.$chunkSize, this.$this_overlappingChunks, continuation);
            c96171.L$0 = obj;
            return c96171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super List<? extends T>> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C96171) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        
            r8.L$0 = r6;
            r8.L$1 = r5;
            r8.L$2 = r4;
            r8.I$0 = r9;
            r8.label = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        
            if (r6.yield(r4, r8) != r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        
            if (r6.yield(r4, r8) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:24:0x0080). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List listMutableListOf;
            SequenceBuilder2 sequenceBuilder2;
            int i;
            Iterator<T> it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceBuilder2 sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                if (this.$chunkSize <= 1) {
                    throw new IllegalArgumentException("Can't have overlapping chunks if they are each of length 1");
                }
                Iterator<T> itIterator2 = this.$this_overlappingChunks.iterator2();
                if (!itIterator2.hasNext()) {
                    return Unit.INSTANCE;
                }
                listMutableListOf = CollectionsKt.mutableListOf(itIterator2.next());
                sequenceBuilder2 = sequenceBuilder22;
                i = 0;
                it = itIterator2;
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            int i3 = this.I$0;
            listMutableListOf = (List) this.L$2;
            it = (Iterator) this.L$1;
            sequenceBuilder2 = (SequenceBuilder2) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = i3;
            listMutableListOf = CollectionsKt.mutableListOf(CollectionsKt.last(listMutableListOf));
            while (true) {
                if (!it.hasNext()) {
                    listMutableListOf.add(it.next());
                    i++;
                    if (i % this.$chunkSize == 0) {
                        break;
                    }
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                }
            }
            return coroutine_suspended;
        }
    }

    public static final <T> Sequence<List<T>> overlappingChunks(Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt.sequence(new C96171(i, sequence, null));
    }

    public static final void DynamicChartAura(final DynamicChartAuraState state, Modifier modifier, AnimationSpec<Float> animationSpec, Composer composer, final int i, final int i2) {
        int i3;
        final AnimationSpec<Float> animationSpec2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1161757702);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(animationSpec) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                animationSpec = AnimationSpecKt.snap$default(0, 1, null);
            }
            AnimationSpec<Float> animationSpec3 = animationSpec;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1161757702, i3, -1, "com.robinhood.android.aura.DynamicChartAura (DynamicChartAura.kt:97)");
            }
            if (Build.VERSION.SDK_INT >= 31) {
                composerStartRestartGroup.startReplaceGroup(-1077010996);
                InternalDynamicChartAura(state, Focusable2.focusable$default(modifier, false, null, 2, null), animationSpec3, state.getAlphaOverride(), composerStartRestartGroup, i3 & 910, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1076787455);
                ChartAuraType type2 = state.getType();
                Modifier modifierFocusable$default = Focusable2.focusable$default(modifier, false, null, 2, null);
                Float alphaOverride = state.getAlphaOverride();
                StaticChartAura.StaticImageChartAura(type2, Alpha.alpha(modifierFocusable$default, alphaOverride != null ? alphaOverride.floatValue() : 1.0f), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            animationSpec2 = animationSpec3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            animationSpec2 = animationSpec;
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.aura.DynamicChartAuraKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DynamicChartAura.DynamicChartAura$lambda$2(state, modifier2, animationSpec2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void InternalDynamicChartAura(final DynamicChartAuraState dynamicChartAuraState, Modifier modifier, AnimationSpec<Float> animationSpec, Float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        AnimationSpec<Float> animationSpecSnap$default;
        int i5;
        final Float f2;
        Density density;
        boolean zChanged;
        Object objRememberedValue;
        final float fFloatValue;
        boolean zChanged2;
        Object objRememberedValue2;
        final Line line;
        Float f3;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(299006087);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(dynamicChartAuraState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    animationSpecSnap$default = animationSpec;
                    i3 |= composerStartRestartGroup.changedInstance(animationSpecSnap$default) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        f2 = f;
                        i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            animationSpecSnap$default = AnimationSpecKt.snap$default(0, 1, null);
                        }
                        if (i5 != 0) {
                            f2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(299006087, i3, -1, "com.robinhood.android.aura.InternalDynamicChartAura (DynamicChartAura.kt:121)");
                        }
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(dynamicChartAuraState);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = Float.valueOf(density.mo5016toPx0680j_4(dynamicChartAuraState.m11349getStrokeWidthD9Ej5fM()));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        fFloatValue = ((Number) objRememberedValue).floatValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(dynamicChartAuraState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = downsample(dynamicChartAuraState.getLine(), 5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        line = (Line) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        f3 = f2;
                        snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!Intrinsics.areEqual(dynamicChartAuraState.getType(), ChartAuraType.Positive.INSTANCE) ? 0.0f : 1.0f, animationSpecSnap$default, 0.0f, "colorChoice", null, composerStartRestartGroup, ((i3 >> 3) & 112) | 3072, 20);
                        Modifier modifierM6448blurF8QBwvs = Blur.m6448blurF8QBwvs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(dynamicChartAuraState.m11349getStrokeWidthD9Ej5fM() * dynamicChartAuraState.getBlurFactor()), Blur3.INSTANCE.m6457getUnboundedGoahg());
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(line) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changed(fFloatValue);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            f2 = f3;
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.aura.DynamicChartAuraKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DynamicChartAura.InternalDynamicChartAura$lambda$13$lambda$12(line, snapshotState4AnimateFloatAsState, f2, fFloatValue, (DrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            f2 = f3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifierM6448blurF8QBwvs, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    final AnimationSpec<Float> animationSpec2 = animationSpecSnap$default;
                    final Float f4 = f2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.aura.DynamicChartAuraKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DynamicChartAura.InternalDynamicChartAura$lambda$14(dynamicChartAuraState, modifier3, animationSpec2, f4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                f2 = f;
                if ((i3 & 1171) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(dynamicChartAuraState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = Float.valueOf(density.mo5016toPx0680j_4(dynamicChartAuraState.m11349getStrokeWidthD9Ej5fM()));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        fFloatValue = ((Number) objRememberedValue).floatValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(dynamicChartAuraState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = downsample(dynamicChartAuraState.getLine(), 5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            line = (Line) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            f3 = f2;
                            snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!Intrinsics.areEqual(dynamicChartAuraState.getType(), ChartAuraType.Positive.INSTANCE) ? 0.0f : 1.0f, animationSpecSnap$default, 0.0f, "colorChoice", null, composerStartRestartGroup, ((i3 >> 3) & 112) | 3072, 20);
                            Modifier modifierM6448blurF8QBwvs2 = Blur.m6448blurF8QBwvs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(dynamicChartAuraState.m11349getStrokeWidthD9Ej5fM() * dynamicChartAuraState.getBlurFactor()), Blur3.INSTANCE.m6457getUnboundedGoahg());
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = composerStartRestartGroup.changedInstance(line) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changed(fFloatValue);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                f2 = f3;
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.aura.DynamicChartAuraKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return DynamicChartAura.InternalDynamicChartAura$lambda$13$lambda$12(line, snapshotState4AnimateFloatAsState, f2, fFloatValue, (DrawScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                Canvas2.Canvas(modifierM6448blurF8QBwvs2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                            }
                        }
                    }
                }
                final AnimationSpec animationSpec22 = animationSpecSnap$default;
                final Float f42 = f2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            animationSpecSnap$default = animationSpec;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            f2 = f;
            if ((i3 & 1171) == 1170) {
            }
            final AnimationSpec animationSpec222 = animationSpecSnap$default;
            final Float f422 = f2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        animationSpecSnap$default = animationSpec;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        f2 = f;
        if ((i3 & 1171) == 1170) {
        }
        final AnimationSpec animationSpec2222 = animationSpecSnap$default;
        final Float f4222 = f2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalDynamicChartAura$lambda$13$lambda$12(Line line, SnapshotState4 snapshotState4, Float f, float f2, DrawScope drawScope) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Trace.beginSection("chart-aura");
        Iterator<T> it = line.getSegments().iterator();
        if (it.hasNext()) {
            Iterator<T> it2 = ((Segment) it.next()).getPoints().iterator();
            if (it2.hasNext()) {
                float x = ((Point) it2.next()).getX();
                while (it2.hasNext()) {
                    x = Math.max(x, ((Point) it2.next()).getX());
                }
                fValueOf = Float.valueOf(x);
            } else {
                fValueOf = null;
            }
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
            while (it.hasNext()) {
                Iterator<T> it3 = ((Segment) it.next()).getPoints().iterator();
                if (it3.hasNext()) {
                    float x2 = ((Point) it3.next()).getX();
                    while (it3.hasNext()) {
                        x2 = Math.max(x2, ((Point) it3.next()).getX());
                    }
                    fValueOf3 = Float.valueOf(x2);
                } else {
                    fValueOf3 = null;
                }
                fFloatValue = Math.max(fFloatValue, fValueOf3 != null ? fValueOf3.floatValue() : 0.0f);
            }
            fValueOf2 = Float.valueOf(fFloatValue);
        } else {
            fValueOf2 = null;
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        Iterator<T> it4 = line.getSegments().iterator();
        while (it4.hasNext()) {
            Offset offsetM6534boximpl = null;
            for (Point point : ((Segment) it4.next()).getPoints()) {
                float x3 = point.getX() / fFloatValue2;
                long jM6733lerpjxsXWHM = Color2.m6733lerpjxsXWHM(ChartAuraType.Positive.INSTANCE.m11344getColorAtvNxB06k(x3), ChartAuraType.Negative.INSTANCE.m11344getColorAtvNxB06k(x3), ((Number) snapshotState4.getValue()).floatValue());
                if (f != null) {
                    Color.m6705copywmQWz5c$default(jM6733lerpjxsXWHM, f.floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                }
                long offset = toOffset(point, Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)));
                if (offsetM6534boximpl != null) {
                    DrawScope.m6951drawLineNGM6Ib0$default(Canvas, jM6733lerpjxsXWHM, offsetM6534boximpl.getPackedValue(), offset, f2, 0, null, 0.0f, null, 0, 496, null);
                }
                offsetM6534boximpl = Offset.m6534boximpl(offset);
                Canvas = drawScope;
            }
            Canvas = drawScope;
        }
        Trace.endSection();
        return Unit.INSTANCE;
    }

    private static final long toOffset(Point point, float f, float f2) {
        float x = point.getX() * f;
        float y = (1 - point.getY()) * f2;
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32));
    }
}
