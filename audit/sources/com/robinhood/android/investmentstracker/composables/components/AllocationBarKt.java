package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AllocationBar.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001aY\u0010\u0003\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u001d\u001aS\u0010\u001e\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(\u001a8\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0016H\u0002\u001aC\u0010,\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.¨\u0006/²\u0006\n\u0010\u001c\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\f\u00100\u001a\u0004\u0018\u000101X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\u0010\u00106\u001a\b\u0012\u0004\u0012\u00020\u001507X\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\u001c\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020:0907X\u008a\u008e\u0002²\u0006\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001507X\u008a\u008e\u0002²\u0006\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001507X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020>X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020\u0015X\u008a\u008e\u0002"}, m3636d2 = {"AllocationsIsometricBarPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "AllocationsIsometricBar", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/investmentstracker/composables/components/AllocationSection;", "selectedId", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "onSectionSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "height", "Landroidx/compose/ui/unit/Dp;", "AllocationsIsometricBar-wC_cr3g", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "calculateRenderingState", "Lkotlin/Pair;", "", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "isSelected", "selectedIndex", "previousSelectedIndex", "animationProgress", "(IZLjava/lang/Integer;Ljava/lang/Integer;F)Lkotlin/Pair;", "drawIsometricCube", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "x", "y", "width", "depth", "fillColor", "lineColor", "showFrontFace", "drawIsometricCube-XfLwLrM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFFJJZ)V", "createCubePath", "Landroidx/compose/ui/graphics/Path;", "filled", "drawVisibleEdges", "drawVisibleEdges-PE3pjmc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFFJ)V", "feature-investments-tracker_externalDebug", "canvasSize", "Landroidx/compose/ui/geometry/Size;", "totalWidth", "cubeHeight", "cubeDepth", "yPosition", "cubeWidths", "", "animatablesForPosition", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "previousXPositions", "targetXPositions", "swipeStartTime", "", "startSwipeX", "endingSwipeX"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AllocationBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AllocationsIsometricBarPreview$lambda$0(int i, Composer composer, int i2) {
        AllocationsIsometricBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AllocationsIsometricBar_wC_cr3g$lambda$80(ImmutableList immutableList, String str, long j, Function1 function1, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        m15574AllocationsIsometricBarwC_cr3g(immutableList, str, j, function1, modifier, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final void AllocationsIsometricBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-263372864);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-263372864, i, -1, "com.robinhood.android.investmentstracker.composables.components.AllocationsIsometricBarPreview (AllocationBar.kt:84)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$AllocationBarKt.INSTANCE.m15583getLambda$988732664$feature_investments_tracker_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AllocationBarKt.AllocationsIsometricBarPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> AllocationsIsometricBar_wC_cr3g$lambda$23(SnapshotState<List<Float>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer AllocationsIsometricBar_wC_cr3g$lambda$29(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    private static final List<Animatable<Float, AnimationVectors2>> AllocationsIsometricBar_wC_cr3g$lambda$33(SnapshotState<List<Animatable<Float, AnimationVectors2>>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> AllocationsIsometricBar_wC_cr3g$lambda$37(SnapshotState<List<Float>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> AllocationsIsometricBar_wC_cr3g$lambda$41(SnapshotState<List<Float>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Size AllocationsIsometricBar_wC_cr3g$lambda$8(SnapshotState<Size> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0d79  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0d96  */
    /* JADX WARN: Removed duplicated region for block: B:411:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* renamed from: AllocationsIsometricBar-wC_cr3g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15574AllocationsIsometricBarwC_cr3g(final ImmutableList<AllocationSection> sections, final String str, final long j, final Function1<? super String, Unit> onSectionSelected, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        Modifier modifier3;
        float fM7995constructorimpl;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue2;
        SnapshotIntState2 snapshotIntState2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        SnapshotFloatState2 snapshotFloatState22;
        Object objRememberedValue5;
        final SnapshotFloatState2 snapshotFloatState23;
        Object objRememberedValue6;
        final SnapshotFloatState2 snapshotFloatState24;
        Object objRememberedValue7;
        final SnapshotFloatState2 snapshotFloatState25;
        Object objRememberedValue8;
        int i5;
        SnapshotState snapshotState;
        Object objRememberedValue9;
        int i6;
        SnapshotState snapshotState2;
        Animatable animatable;
        Object objRememberedValue10;
        Object objRememberedValue11;
        CubicBezierEasing cubicBezierEasing;
        SnapshotState snapshotState3;
        final SnapshotState snapshotState4;
        Object objRememberedValue12;
        SnapshotState snapshotState5;
        Object objRememberedValue13;
        final SnapshotState snapshotState6;
        Object objRememberedValue14;
        Composer.Companion companion2;
        boolean zChangedInstance;
        Object objRememberedValue15;
        int i7;
        int i8;
        boolean zChangedInstance2;
        Object objRememberedValue16;
        int i9;
        Modifier modifier4;
        float f3;
        int i10;
        SnapshotFloatState2 snapshotFloatState26;
        int i11;
        SnapshotState snapshotState7;
        float f4;
        Composer composer2;
        int i12;
        SnapshotState snapshotState8;
        SnapshotState snapshotState9;
        final SnapshotState snapshotState10;
        SnapshotIntState2 snapshotIntState22;
        SnapshotFloatState2 snapshotFloatState27;
        String str2;
        Object objRememberedValue17;
        SnapshotLongState2 snapshotLongState2;
        Object objRememberedValue18;
        float f5;
        SnapshotFloatState2 snapshotFloatState28;
        Object objRememberedValue19;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i13;
        SnapshotState snapshotState11;
        final SnapshotState snapshotState12;
        SnapshotState snapshotState13;
        SnapshotState snapshotState14;
        Modifier.Companion companion3;
        Composer composer3;
        SnapshotFloatState2 snapshotFloatState29;
        int i14;
        int i15;
        int i16;
        ?? r12;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier modifier5;
        float f6;
        Modifier modifierM5156height3ABfNKs;
        Unit unit;
        int i17;
        int i18;
        Object objRememberedValue20;
        Modifier modifier6;
        float f7;
        Unit unit2;
        int i19;
        Modifier.Companion companion4;
        SnapshotState snapshotState15;
        SnapshotState snapshotState16;
        boolean z;
        Object objRememberedValue21;
        Modifier modifier7;
        Modifier modifierPointerInput;
        boolean z2;
        Object objRememberedValue22;
        Modifier modifier8;
        float f8;
        float f9;
        final float f10;
        final Modifier modifier9;
        Object obj;
        int i20;
        float f11;
        SnapshotState snapshotState17;
        SnapshotState snapshotState18;
        SnapshotState snapshotState19;
        int i21;
        int i22;
        SnapshotState snapshotState20;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Float fValueOf = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(onSectionSelected, "onSectionSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(2066288648);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sections) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSectionSelected) ? 2048 : 1024;
        }
        int i23 = i2 & 16;
        if (i23 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                }
            }
            if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i23 == 0 ? Modifier.INSTANCE : modifier2;
                fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(40) : f2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2066288648, i3, -1, "com.robinhood.android.investmentstracker.composables.components.AllocationsIsometricBar (AllocationBar.kt:127)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(-1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState snapshotState21 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                snapshotFloatState24 = (SnapshotFloatState2) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                snapshotFloatState25 = (SnapshotFloatState2) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 != companion.getEmpty()) {
                    i5 = 2;
                    objRememberedValue8 = SnapshotState3.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    i5 = 2;
                }
                snapshotState = (SnapshotState) objRememberedValue8;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                i6 = i3;
                if (objRememberedValue9 != companion.getEmpty()) {
                    snapshotState2 = snapshotState21;
                    Animatable animatableAnimatable$default = Animatable2.Animatable$default(0.0f, 0.0f, i5, null);
                    composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
                    objRememberedValue9 = animatableAnimatable$default;
                } else {
                    snapshotState2 = snapshotState21;
                }
                animatable = (Animatable) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                CubicBezierEasing cubicBezierEasing2 = new CubicBezierEasing(0.215f, 0.61f, 0.355f, 1.0f);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    Iterator<AllocationSection> it = sections.iterator();
                    int i24 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i24 = -1;
                            break;
                        } else if (Intrinsics.areEqual(it.next().getId(), str)) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i24);
                    if (numValueOf.intValue() < 0) {
                        numValueOf = null;
                    }
                    objRememberedValue10 = SnapshotState3.mutableStateOf$default(numValueOf, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                SnapshotState snapshotState22 = (SnapshotState) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 != Composer.INSTANCE.getEmpty()) {
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
                    for (AllocationSection allocationSection : sections) {
                        arrayList.add(Animatable2.Animatable$default(0.0f, 0.0f, 2, null));
                        cubicBezierEasing2 = cubicBezierEasing2;
                        snapshotState22 = snapshotState22;
                    }
                    cubicBezierEasing = cubicBezierEasing2;
                    snapshotState3 = snapshotState22;
                    objRememberedValue11 = SnapshotState3.mutableStateOf$default(arrayList, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    cubicBezierEasing = cubicBezierEasing2;
                    snapshotState3 = snapshotState22;
                }
                snapshotState4 = (SnapshotState) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
                    for (AllocationSection allocationSection2 : sections) {
                        arrayList2.add(fValueOf);
                    }
                    objRememberedValue12 = SnapshotState3.mutableStateOf$default(arrayList2, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                snapshotState5 = (SnapshotState) objRememberedValue12;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
                    for (AllocationSection allocationSection3 : sections) {
                        arrayList3.add(fValueOf);
                    }
                    objRememberedValue13 = SnapshotState3.mutableStateOf$default(arrayList3, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                snapshotState6 = (SnapshotState) objRememberedValue13;
                composerStartRestartGroup.endReplaceGroup();
                List<Float> listAllocationsIsometricBar_wC_cr3g$lambda$41 = AllocationsIsometricBar_wC_cr3g$lambda$41(snapshotState6);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue14 == companion2.getEmpty()) {
                    objRememberedValue14 = new AllocationBarKt$AllocationsIsometricBar$1$1(snapshotState5, cubicBezierEasing, snapshotState6, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(listAllocationsIsometricBar_wC_cr3g$lambda$41, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 0);
                Object value = animatable.getValue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue15 == companion2.getEmpty()) {
                    objRememberedValue15 = new AllocationBarKt$AllocationsIsometricBar$2$1(animatable, snapshotFloatState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                i7 = i6 & 14;
                i8 = i6 & 112;
                zChangedInstance2 = (i7 != 4) | (i8 != 32) | composerStartRestartGroup.changedInstance(animatable);
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue16 == companion2.getEmpty()) {
                    i9 = i7;
                    modifier4 = modifier3;
                    f3 = fM7995constructorimpl;
                    i10 = i8;
                    snapshotFloatState26 = snapshotFloatState22;
                    i11 = i6;
                    snapshotState7 = snapshotState;
                    f4 = 1.0f;
                    composer2 = composerStartRestartGroup;
                    i12 = 1849434622;
                    snapshotState8 = snapshotState2;
                    SnapshotState snapshotState23 = snapshotState3;
                    AllocationBarKt$AllocationsIsometricBar$3$1 allocationBarKt$AllocationsIsometricBar$3$1 = new AllocationBarKt$AllocationsIsometricBar$3$1(sections, str, snapshotState23, snapshotState8, snapshotState7, snapshotState6, snapshotState5, snapshotIntState2, snapshotFloatState2, animatable, cubicBezierEasing, null);
                    snapshotState9 = snapshotState23;
                    snapshotState10 = snapshotState5;
                    snapshotIntState22 = snapshotIntState2;
                    snapshotFloatState27 = snapshotFloatState2;
                    str2 = str;
                    composer2.updateRememberedValue(allocationBarKt$AllocationsIsometricBar$3$1);
                    objRememberedValue16 = allocationBarKt$AllocationsIsometricBar$3$1;
                } else {
                    i9 = i7;
                    modifier4 = modifier3;
                    f3 = fM7995constructorimpl;
                    i10 = i8;
                    snapshotFloatState26 = snapshotFloatState22;
                    i11 = i6;
                    snapshotState7 = snapshotState;
                    snapshotState9 = snapshotState3;
                    f4 = 1.0f;
                    composer2 = composerStartRestartGroup;
                    i12 = 1849434622;
                    snapshotState10 = snapshotState5;
                    snapshotFloatState27 = snapshotFloatState2;
                    snapshotState8 = snapshotState2;
                    str2 = str;
                    snapshotIntState22 = snapshotIntState2;
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(str2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue16, composer2, (i11 >> 3) & 14);
                composer2.startReplaceGroup(i12);
                objRememberedValue17 = composer2.rememberedValue();
                if (objRememberedValue17 == companion2.getEmpty()) {
                    objRememberedValue17 = SnapshotLongState3.mutableLongStateOf(0L);
                    composer2.updateRememberedValue(objRememberedValue17);
                }
                snapshotLongState2 = (SnapshotLongState2) objRememberedValue17;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(i12);
                objRememberedValue18 = composer2.rememberedValue();
                if (objRememberedValue18 != companion2.getEmpty()) {
                    f5 = 0.0f;
                    objRememberedValue18 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composer2.updateRememberedValue(objRememberedValue18);
                } else {
                    f5 = 0.0f;
                }
                snapshotFloatState28 = (SnapshotFloatState2) objRememberedValue18;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(i12);
                objRememberedValue19 = composer2.rememberedValue();
                if (objRememberedValue19 == companion2.getEmpty()) {
                    objRememberedValue19 = SnapshotFloatState3.mutableFloatStateOf(f5);
                    composer2.updateRememberedValue(objRememberedValue19);
                }
                SnapshotFloatState2 snapshotFloatState210 = (SnapshotFloatState2) objRememberedValue19;
                composer2.endReplaceGroup();
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion6 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion6.getStart(), composer2, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion5);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion7.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState9) == null) {
                    composer2.startReplaceGroup(-609103751);
                    Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(companion5, C2002Dp.m7995constructorimpl(57));
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i25 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM5156height3ABfNKs2, bentoTheme.getSpacing(composer2, i25).m21590getDefaultD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion6.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    final SnapshotState snapshotState24 = snapshotState9;
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier2, companion7.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CLOSE_24);
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i25).m21425getFg0d7_KjU();
                    float f12 = 25;
                    float f13 = 1;
                    snapshotState12 = snapshotState8;
                    Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(companion5, bentoTheme.getColors(composer2, i25).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f12))), C2002Dp.m7995constructorimpl(f13), bentoTheme.getColors(composer2, i25).m21426getFg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f12))), bentoTheme.getSpacing(composer2, i25).m21597getXxsmallD9Ej5fM());
                    composer2.startReplaceGroup(-1224400529);
                    int i26 = i11 & 7168;
                    boolean z3 = i26 == 2048;
                    Object objRememberedValue23 = composer2.rememberedValue();
                    if (z3 || objRememberedValue23 == companion2.getEmpty()) {
                        i20 = i26;
                        final SnapshotState snapshotState25 = snapshotState7;
                        f11 = f13;
                        obj = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AllocationBarKt.m2117xf494b8f6(onSectionSelected, snapshotState24, snapshotState12, snapshotState25, snapshotState6, snapshotState10);
                            }
                        };
                        snapshotState17 = snapshotState25;
                        snapshotState18 = snapshotState6;
                        snapshotState11 = snapshotState24;
                        snapshotState19 = snapshotState10;
                        composer2.updateRememberedValue(obj);
                    } else {
                        obj = objRememberedValue23;
                        snapshotState11 = snapshotState24;
                        i20 = i26;
                        snapshotState17 = snapshotState7;
                        snapshotState19 = snapshotState10;
                        snapshotState18 = snapshotState6;
                        f11 = f13;
                    }
                    composer2.endReplaceGroup();
                    int i27 = BentoIcon4.Size16.$stable;
                    Composer composer4 = composer2;
                    i13 = i10;
                    BentoIcon2.m20644BentoIconFU0evQE(size16, "", jM21425getFg0d7_KjU, modifierM5142padding3ABfNKs2, (Function0) obj, false, composer4, i27 | 48, 32);
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion5, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer4, 0);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierWeight$default);
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier3, companion7.getSetModifier());
                    composer4.endNode();
                    Integer numAllocationsIsometricBar_wC_cr3g$lambda$29 = AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState11);
                    if (numAllocationsIsometricBar_wC_cr3g$lambda$29 == null) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_LEFT_24);
                    long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer4, i25).m21425getFg0d7_KjU();
                    Modifier modifierAlpha = Alpha.alpha(PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(companion5, bentoTheme.getColors(composer4, i25).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f12))), C2002Dp.m7995constructorimpl(f11), bentoTheme.getColors(composer4, i25).m21426getFg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f12))), bentoTheme.getSpacing(composer4, i25).m21597getXxsmallD9Ej5fM()), numAllocationsIsometricBar_wC_cr3g$lambda$29.intValue() + (-1) >= 0 ? f4 : 0.3f);
                    composer4.startReplaceGroup(-1224400529);
                    int i28 = i20;
                    int i29 = i9;
                    boolean z4 = (i28 == 2048) | (i29 == 4);
                    Object objRememberedValue24 = composer4.rememberedValue();
                    if (z4 || objRememberedValue24 == companion2.getEmpty()) {
                        i21 = i28;
                        i22 = i29;
                        final SnapshotState snapshotState26 = snapshotState18;
                        final SnapshotState snapshotState27 = snapshotState17;
                        final SnapshotState snapshotState28 = snapshotState19;
                        final SnapshotState snapshotState29 = snapshotState11;
                        objRememberedValue24 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AllocationBarKt.m2118x7eea2de8(snapshotState29, onSectionSelected, sections, snapshotState12, snapshotState27, snapshotState26, snapshotState28);
                            }
                        };
                        snapshotState11 = snapshotState29;
                        snapshotState17 = snapshotState27;
                        snapshotState20 = snapshotState26;
                        snapshotState19 = snapshotState28;
                        composer4.updateRememberedValue(objRememberedValue24);
                    } else {
                        i21 = i28;
                        i22 = i29;
                        snapshotState20 = snapshotState18;
                    }
                    composer4.endReplaceGroup();
                    composer3 = composer4;
                    final SnapshotState snapshotState30 = snapshotState17;
                    snapshotFloatState29 = snapshotFloatState210;
                    i16 = 1;
                    BentoIcon2.m20644BentoIconFU0evQE(size162, "", jM21425getFg0d7_KjU2, modifierAlpha, (Function0) objRememberedValue24, false, composer3, i27 | 48, 32);
                    BentoIcon4.Size16 size163 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_24);
                    long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer3, i25).m21425getFg0d7_KjU();
                    Modifier modifierAlpha2 = Alpha.alpha(PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(PaddingKt.m5146paddingqDBjuR0$default(companion5, bentoTheme.getSpacing(composer3, i25).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), bentoTheme.getColors(composer3, i25).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f12))), C2002Dp.m7995constructorimpl(f11), bentoTheme.getColors(composer3, i25).m21426getFg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f12))), bentoTheme.getSpacing(composer3, i25).m21597getXxsmallD9Ej5fM()), numAllocationsIsometricBar_wC_cr3g$lambda$29.intValue() + 1 < AllocationsIsometricBar_wC_cr3g$lambda$23(snapshotState30).size() ? f4 : 0.3f);
                    composer3.startReplaceGroup(-1224400529);
                    int i30 = i22;
                    boolean z5 = (i21 == 2048) | (i30 == 4);
                    Object objRememberedValue25 = composer3.rememberedValue();
                    if (z5 || objRememberedValue25 == companion2.getEmpty()) {
                        i14 = i30;
                        final SnapshotState snapshotState31 = snapshotState19;
                        final SnapshotState snapshotState32 = snapshotState11;
                        final SnapshotState snapshotState33 = snapshotState20;
                        Function0 function0 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AllocationBarKt.m2119x3d98462e(snapshotState32, onSectionSelected, sections, snapshotState30, snapshotState12, snapshotState33, snapshotState31);
                            }
                        };
                        snapshotState11 = snapshotState32;
                        snapshotState13 = snapshotState30;
                        snapshotState6 = snapshotState33;
                        snapshotState14 = snapshotState31;
                        composer3.updateRememberedValue(function0);
                        objRememberedValue25 = function0;
                    } else {
                        i14 = i30;
                        snapshotState14 = snapshotState19;
                        snapshotState6 = snapshotState20;
                        snapshotState13 = snapshotState30;
                    }
                    composer3.endReplaceGroup();
                    companion3 = companion5;
                    BentoIcon2.m20644BentoIconFU0evQE(size163, "", jM21425getFg0d7_KjU3, modifierAlpha2, (Function0) objRememberedValue25, false, composer3, i27 | 48, 32);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                    i15 = -1224400529;
                    r12 = 0;
                } else {
                    i13 = i10;
                    snapshotState11 = snapshotState9;
                    snapshotState12 = snapshotState8;
                    snapshotState13 = snapshotState7;
                    snapshotState14 = snapshotState10;
                    companion3 = companion5;
                    composer3 = composer2;
                    snapshotFloatState29 = snapshotFloatState210;
                    i14 = i9;
                    i15 = -1224400529;
                    i16 = 1;
                    composer3.startReplaceGroup(-605270942);
                    Modifier modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(57));
                    r12 = 0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierM5156height3ABfNKs3);
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy3, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier4, companion7.getSetModifier());
                    composer3.endNode();
                    composer3.endReplaceGroup();
                }
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), r12);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, r12);
                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, companion3);
                Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor5);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier5, companion7.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                modifier5 = modifier4;
                f6 = f3;
                modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier5, 0.0f, i16, null), f6);
                unit = Unit.INSTANCE;
                composer3.startReplaceGroup(i15);
                i17 = i14;
                int i31 = i11 & 7168;
                i18 = (i31 != 2048 ? i16 : r12) | (i17 != 4 ? i16 : r12) | (i13 != 32 ? i16 : 0);
                objRememberedValue20 = composer3.rememberedValue();
                if (i18 == 0 || objRememberedValue20 == companion2.getEmpty()) {
                    modifier6 = modifierM5156height3ABfNKs;
                    f7 = f6;
                    unit2 = unit;
                    i19 = i17;
                    SnapshotState snapshotState34 = snapshotState14;
                    companion4 = companion3;
                    snapshotState15 = snapshotState13;
                    SnapshotState snapshotState35 = snapshotState11;
                    AllocationBarKt$AllocationsIsometricBar$4$3$1$1 allocationBarKt$AllocationsIsometricBar$4$3$1$1 = new AllocationBarKt$AllocationsIsometricBar$4$3$1$1(sections, onSectionSelected, str, snapshotState6, snapshotState15, snapshotState35, snapshotState12, snapshotState34);
                    snapshotState11 = snapshotState35;
                    snapshotState16 = snapshotState34;
                    composer3.updateRememberedValue(allocationBarKt$AllocationsIsometricBar$4$3$1$1);
                    objRememberedValue20 = allocationBarKt$AllocationsIsometricBar$4$3$1$1;
                } else {
                    companion4 = companion3;
                    modifier6 = modifierM5156height3ABfNKs;
                    f7 = f6;
                    unit2 = unit;
                    i19 = i17;
                    snapshotState16 = snapshotState14;
                    snapshotState15 = snapshotState13;
                }
                composer3.endReplaceGroup();
                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifier6, unit2, (PointerInputEventHandler) objRememberedValue20);
                composer3.startReplaceGroup(-1224400529);
                z = (i31 != 2048) | (i19 != 4);
                objRememberedValue21 = composer3.rememberedValue();
                if (!z || objRememberedValue21 == companion2.getEmpty()) {
                    SnapshotState snapshotState36 = snapshotState16;
                    modifier7 = modifier5;
                    SnapshotState snapshotState37 = snapshotState15;
                    AllocationBarKt$AllocationsIsometricBar$4$3$2$1 allocationBarKt$AllocationsIsometricBar$4$3$2$1 = new AllocationBarKt$AllocationsIsometricBar$4$3$2$1(snapshotLongState2, snapshotFloatState28, snapshotState11, onSectionSelected, sections, snapshotFloatState29, snapshotState37, snapshotState12, snapshotState6, snapshotState36);
                    snapshotState15 = snapshotState37;
                    snapshotState16 = snapshotState36;
                    composer3.updateRememberedValue(allocationBarKt$AllocationsIsometricBar$4$3$2$1);
                    objRememberedValue21 = allocationBarKt$AllocationsIsometricBar$4$3$2$1;
                } else {
                    modifier7 = modifier5;
                }
                composer3.endReplaceGroup();
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput2, unit2, (PointerInputEventHandler) objRememberedValue21);
                composer3.startReplaceGroup(-1224400529);
                z2 = ((i11 & 896) != 256) | (i19 != 4);
                objRememberedValue22 = composer3.rememberedValue();
                if (!z2 || objRememberedValue22 == companion2.getEmpty()) {
                    modifier8 = modifierPointerInput;
                    final SnapshotState snapshotState38 = snapshotState11;
                    final SnapshotState snapshotState39 = snapshotState15;
                    final SnapshotState snapshotState40 = snapshotState16;
                    Composer composer5 = composer3;
                    final SnapshotFloatState2 snapshotFloatState211 = snapshotFloatState26;
                    final SnapshotFloatState2 snapshotFloatState212 = snapshotFloatState27;
                    final SnapshotIntState2 snapshotIntState23 = snapshotIntState22;
                    final SnapshotState snapshotState41 = snapshotState6;
                    f8 = f7;
                    final SnapshotState snapshotState42 = snapshotState12;
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AllocationBarKt.m2120x19ba8386(sections, j, snapshotState42, snapshotFloatState211, snapshotFloatState23, snapshotFloatState24, snapshotFloatState25, snapshotState39, snapshotState38, snapshotState41, snapshotState40, snapshotIntState23, snapshotFloatState212, snapshotState4, (DrawScope) obj2);
                        }
                    };
                    snapshotState11 = snapshotState38;
                    composer3 = composer5;
                    composer3.updateRememberedValue(function1);
                    objRememberedValue22 = function1;
                } else {
                    modifier8 = modifierPointerInput;
                    f8 = f7;
                }
                composer3.endReplaceGroup();
                Canvas2.Canvas(modifier8, (Function1) objRememberedValue22, composer3, 0);
                composer3.startReplaceGroup(2137016993);
                if (AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState11) == null) {
                    Modifier.Companion companion8 = companion4;
                    f9 = f8;
                    Modifier modifierM5156height3ABfNKs4 = SizeKt.m5156height3ABfNKs(companion8, f9);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion6.getTop(), composer3, 0);
                    int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer3, modifierM5156height3ABfNKs4);
                    Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion7.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    float f14 = 100;
                    Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(companion8, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f14));
                    Brush.Companion companion9 = Brush.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i32 = BentoTheme.$stable;
                    Color colorM6701boximpl = Color.m6701boximpl(bentoTheme2.getColors(composer3, i32).m21371getBg0d7_KjU());
                    Color.Companion companion10 = Color.INSTANCE;
                    Modifier modifierBackground$default = Background3.background$default(modifierM5174width3ABfNKs, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion9, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, Color.m6701boximpl(companion10.m6725getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                    int currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composer3, modifierBackground$default);
                    Function0<ComposeUiNode> constructor7 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl7 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyColumnMeasurePolicy4, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap7, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier7, companion7.getSetModifier());
                    composer3.endNode();
                    Modifier modifierWeight$default2 = Row5.weight$default(row62, SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(companion8, 0.0f, 1, null), 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = Column2.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                    int currentCompositeKeyHash8 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default2);
                    Function0<ComposeUiNode> constructor8 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl8 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl8, measurePolicyColumnMeasurePolicy5, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl8, currentCompositionLocalMap8, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        composerM6388constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        composerM6388constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl8, modifierMaterializeModifier8, companion7.getSetModifier());
                    composer3.endNode();
                    Modifier modifierBackground$default2 = Background3.background$default(SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(companion8, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f14)), Brush.Companion.m6676horizontalGradient8A3gB4$default(companion9, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion10.m6725getTransparent0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer3, i32).m21371getBg0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = Column2.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                    int currentCompositeKeyHash9 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifier2.materializeModifier(composer3, modifierBackground$default2);
                    Function0<ComposeUiNode> constructor9 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor9);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl9 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl9, measurePolicyColumnMeasurePolicy6, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl9, currentCompositionLocalMap9, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        composerM6388constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                        composerM6388constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl9, modifierMaterializeModifier9, companion7.getSetModifier());
                    composer3.endNode();
                    composer3.endNode();
                } else {
                    f9 = f8;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f10 = f9;
                modifier9 = modifier7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f10 = f2;
                modifier9 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$80(sections, str, j, onSectionSelected, modifier9, f10, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if ((i3 & 74899) == 74898) {
            if (i23 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            SnapshotState snapshotState212 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
            }
            snapshotFloatState24 = (SnapshotFloatState2) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
            }
            snapshotFloatState25 = (SnapshotFloatState2) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 != companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            i6 = i3;
            if (objRememberedValue9 != companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue9;
            composerStartRestartGroup.endReplaceGroup();
            CubicBezierEasing cubicBezierEasing22 = new CubicBezierEasing(0.215f, 0.61f, 0.355f, 1.0f);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
            }
            SnapshotState snapshotState222 = (SnapshotState) objRememberedValue10;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 != Composer.INSTANCE.getEmpty()) {
            }
            snapshotState4 = (SnapshotState) objRememberedValue11;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
            }
            snapshotState5 = (SnapshotState) objRememberedValue12;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
            }
            snapshotState6 = (SnapshotState) objRememberedValue13;
            composerStartRestartGroup.endReplaceGroup();
            List<Float> listAllocationsIsometricBar_wC_cr3g$lambda$412 = AllocationsIsometricBar_wC_cr3g$lambda$41(snapshotState6);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue14 == companion2.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(listAllocationsIsometricBar_wC_cr3g$lambda$412, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 0);
            Object value2 = animatable.getValue();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue15 = new AllocationBarKt$AllocationsIsometricBar$2$1(animatable, snapshotFloatState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(value2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                i7 = i6 & 14;
                i8 = i6 & 112;
                zChangedInstance2 = (i7 != 4) | (i8 != 32) | composerStartRestartGroup.changedInstance(animatable);
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    i9 = i7;
                    modifier4 = modifier3;
                    f3 = fM7995constructorimpl;
                    i10 = i8;
                    snapshotFloatState26 = snapshotFloatState22;
                    i11 = i6;
                    snapshotState7 = snapshotState;
                    f4 = 1.0f;
                    composer2 = composerStartRestartGroup;
                    i12 = 1849434622;
                    snapshotState8 = snapshotState2;
                    SnapshotState snapshotState232 = snapshotState3;
                    AllocationBarKt$AllocationsIsometricBar$3$1 allocationBarKt$AllocationsIsometricBar$3$12 = new AllocationBarKt$AllocationsIsometricBar$3$1(sections, str, snapshotState232, snapshotState8, snapshotState7, snapshotState6, snapshotState5, snapshotIntState2, snapshotFloatState2, animatable, cubicBezierEasing, null);
                    snapshotState9 = snapshotState232;
                    snapshotState10 = snapshotState5;
                    snapshotIntState22 = snapshotIntState2;
                    snapshotFloatState27 = snapshotFloatState2;
                    str2 = str;
                    composer2.updateRememberedValue(allocationBarKt$AllocationsIsometricBar$3$12);
                    objRememberedValue16 = allocationBarKt$AllocationsIsometricBar$3$12;
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(str2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue16, composer2, (i11 >> 3) & 14);
                    composer2.startReplaceGroup(i12);
                    objRememberedValue17 = composer2.rememberedValue();
                    if (objRememberedValue17 == companion2.getEmpty()) {
                    }
                    snapshotLongState2 = (SnapshotLongState2) objRememberedValue17;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(i12);
                    objRememberedValue18 = composer2.rememberedValue();
                    if (objRememberedValue18 != companion2.getEmpty()) {
                    }
                    snapshotFloatState28 = (SnapshotFloatState2) objRememberedValue18;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(i12);
                    objRememberedValue19 = composer2.rememberedValue();
                    if (objRememberedValue19 == companion2.getEmpty()) {
                    }
                    SnapshotFloatState2 snapshotFloatState2102 = (SnapshotFloatState2) objRememberedValue19;
                    composer2.endReplaceGroup();
                    Modifier.Companion companion52 = Modifier.INSTANCE;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion62 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy7 = Column2.columnMeasurePolicy(top2, companion62.getStart(), composer2, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifier2.materializeModifier(composer2, companion52);
                    ComposeUiNode.Companion companion72 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor10 = companion72.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy7, companion72.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap10, companion72.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion72.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier10, companion72.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        if (AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState9) == null) {
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion62.getTopStart(), r12);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, r12);
                        CompositionLocalMap currentCompositionLocalMap52 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer3, companion3);
                        Function0<ComposeUiNode> constructor52 = companion72.getConstructor();
                        if (composer3.getApplier() == null) {
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion72.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap52, companion72.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion72.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier52, companion72.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            modifier5 = modifier4;
                            f6 = f3;
                            modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier5, 0.0f, i16, null), f6);
                            unit = Unit.INSTANCE;
                            composer3.startReplaceGroup(i15);
                            i17 = i14;
                            if (i17 != 4) {
                            }
                            int i312 = i11 & 7168;
                            i18 = (i312 != 2048 ? i16 : r12) | (i17 != 4 ? i16 : r12) | (i13 != 32 ? i16 : 0);
                            objRememberedValue20 = composer3.rememberedValue();
                            if (i18 == 0) {
                                modifier6 = modifierM5156height3ABfNKs;
                                f7 = f6;
                                unit2 = unit;
                                i19 = i17;
                                SnapshotState snapshotState342 = snapshotState14;
                                companion4 = companion3;
                                snapshotState15 = snapshotState13;
                                SnapshotState snapshotState352 = snapshotState11;
                                AllocationBarKt$AllocationsIsometricBar$4$3$1$1 allocationBarKt$AllocationsIsometricBar$4$3$1$12 = new AllocationBarKt$AllocationsIsometricBar$4$3$1$1(sections, onSectionSelected, str, snapshotState6, snapshotState15, snapshotState352, snapshotState12, snapshotState342);
                                snapshotState11 = snapshotState352;
                                snapshotState16 = snapshotState342;
                                composer3.updateRememberedValue(allocationBarKt$AllocationsIsometricBar$4$3$1$12);
                                objRememberedValue20 = allocationBarKt$AllocationsIsometricBar$4$3$1$12;
                                composer3.endReplaceGroup();
                                Modifier modifierPointerInput22 = SuspendingPointerInputFilterKt.pointerInput(modifier6, unit2, (PointerInputEventHandler) objRememberedValue20);
                                composer3.startReplaceGroup(-1224400529);
                                z = (i312 != 2048) | (i19 != 4);
                                objRememberedValue21 = composer3.rememberedValue();
                                if (z) {
                                    SnapshotState snapshotState362 = snapshotState16;
                                    modifier7 = modifier5;
                                    SnapshotState snapshotState372 = snapshotState15;
                                    AllocationBarKt$AllocationsIsometricBar$4$3$2$1 allocationBarKt$AllocationsIsometricBar$4$3$2$12 = new AllocationBarKt$AllocationsIsometricBar$4$3$2$1(snapshotLongState2, snapshotFloatState28, snapshotState11, onSectionSelected, sections, snapshotFloatState29, snapshotState372, snapshotState12, snapshotState6, snapshotState362);
                                    snapshotState15 = snapshotState372;
                                    snapshotState16 = snapshotState362;
                                    composer3.updateRememberedValue(allocationBarKt$AllocationsIsometricBar$4$3$2$12);
                                    objRememberedValue21 = allocationBarKt$AllocationsIsometricBar$4$3$2$12;
                                    composer3.endReplaceGroup();
                                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput22, unit2, (PointerInputEventHandler) objRememberedValue21);
                                    composer3.startReplaceGroup(-1224400529);
                                    if (i19 != 4) {
                                    }
                                    z2 = ((i11 & 896) != 256) | (i19 != 4);
                                    objRememberedValue22 = composer3.rememberedValue();
                                    if (z2) {
                                        modifier8 = modifierPointerInput;
                                        final SnapshotState snapshotState382 = snapshotState11;
                                        final SnapshotState snapshotState392 = snapshotState15;
                                        final SnapshotState snapshotState402 = snapshotState16;
                                        Composer composer52 = composer3;
                                        final SnapshotFloatState2 snapshotFloatState2112 = snapshotFloatState26;
                                        final SnapshotFloatState2 snapshotFloatState2122 = snapshotFloatState27;
                                        final SnapshotIntState2 snapshotIntState232 = snapshotIntState22;
                                        final SnapshotState snapshotState412 = snapshotState6;
                                        f8 = f7;
                                        final SnapshotState snapshotState422 = snapshotState12;
                                        Function1 function12 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return AllocationBarKt.m2120x19ba8386(sections, j, snapshotState422, snapshotFloatState2112, snapshotFloatState23, snapshotFloatState24, snapshotFloatState25, snapshotState392, snapshotState382, snapshotState412, snapshotState402, snapshotIntState232, snapshotFloatState2122, snapshotState4, (DrawScope) obj2);
                                            }
                                        };
                                        snapshotState11 = snapshotState382;
                                        composer3 = composer52;
                                        composer3.updateRememberedValue(function12);
                                        objRememberedValue22 = function12;
                                        composer3.endReplaceGroup();
                                        Canvas2.Canvas(modifier8, (Function1) objRememberedValue22, composer3, 0);
                                        composer3.startReplaceGroup(2137016993);
                                        if (AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState11) == null) {
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        f10 = f9;
                                        modifier9 = modifier7;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void AllocationsIsometricBar_wC_cr3g$runFirstTimeCalculation(ImmutableList<AllocationSection> immutableList, SnapshotState<Size> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotFloatState2 snapshotFloatState23, SnapshotFloatState2 snapshotFloatState24, SnapshotState<List<Float>> snapshotState2, Size size) {
        if (size == null) {
            return;
        }
        snapshotState.setValue(size);
        snapshotFloatState2.setFloatValue(Float.intBitsToFloat((int) (size.getPackedValue() >> 32)) * 0.85f);
        snapshotFloatState22.setFloatValue(Float.intBitsToFloat((int) (size.getPackedValue() & 4294967295L)) * 0.8f);
        snapshotFloatState23.setFloatValue(Float.intBitsToFloat((int) (size.getPackedValue() & 4294967295L)) * 0.12f);
        snapshotFloatState24.setFloatValue(Float.intBitsToFloat((int) (size.getPackedValue() & 4294967295L)) * 0.15f);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
        Iterator<AllocationSection> it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(snapshotFloatState2.getFloatValue() * it.next().getPercentage()));
        }
        snapshotState2.setValue(arrayList);
    }

    private static final List<Float> AllocationsIsometricBar_wC_cr3g$getTargetXPositionsForAnimation(SnapshotState<Size> snapshotState, List<Float> list, Integer num, float f) {
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            Size sizeAllocationsIsometricBar_wC_cr3g$lambda$8 = AllocationsIsometricBar_wC_cr3g$lambda$8(snapshotState);
            if (sizeAllocationsIsometricBar_wC_cr3g$lambda$8 == null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            float f2 = 2;
            arrayList.add(Float.valueOf((Float.intBitsToFloat((int) (sizeAllocationsIsometricBar_wC_cr3g$lambda$8.getPackedValue() >> 32)) / f2) - (list.get(num.intValue()).floatValue() / f2)));
            int iIntValue = num.intValue();
            while (true) {
                iIntValue--;
                if (-1 >= iIntValue) {
                    break;
                }
                arrayList.add(0, Float.valueOf((((Number) arrayList.get(0)).floatValue() - 100) - list.get(iIntValue).floatValue()));
            }
            int size = list.size();
            for (int iIntValue2 = num.intValue() + 1; iIntValue2 < size; iIntValue2++) {
                int i = iIntValue2 - 1;
                arrayList.add(Float.valueOf(((Number) arrayList.get(i)).floatValue() + 100 + list.get(i).floatValue()));
            }
            return arrayList;
        }
        float fFloatValue = f - (0.07f * f);
        Iterator it = CollectionsKt.reversed(list).iterator();
        while (it.hasNext()) {
            fFloatValue = (fFloatValue - ((Number) it.next()).floatValue()) - 1.5f;
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return CollectionsKt.reversed(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AllocationsIsometricBar_wC_cr3g$updateTargetPositions(SnapshotState<Size> snapshotState, SnapshotState<List<Float>> snapshotState2, SnapshotState<Integer> snapshotState3, SnapshotState<List<Float>> snapshotState4, SnapshotState<List<Float>> snapshotState5) {
        Size sizeAllocationsIsometricBar_wC_cr3g$lambda$8 = AllocationsIsometricBar_wC_cr3g$lambda$8(snapshotState);
        if (sizeAllocationsIsometricBar_wC_cr3g$lambda$8 != null) {
            List<Float> listAllocationsIsometricBar_wC_cr3g$getTargetXPositionsForAnimation = AllocationsIsometricBar_wC_cr3g$getTargetXPositionsForAnimation(snapshotState, AllocationsIsometricBar_wC_cr3g$lambda$23(snapshotState2), AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState3), Float.intBitsToFloat((int) (sizeAllocationsIsometricBar_wC_cr3g$lambda$8.getPackedValue() >> 32)));
            snapshotState5.setValue(AllocationsIsometricBar_wC_cr3g$lambda$41(snapshotState4));
            snapshotState4.setValue(listAllocationsIsometricBar_wC_cr3g$getTargetXPositionsForAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer AllocationsIsometricBar_wC_cr3g$findSectionIndex(SnapshotState<List<Float>> snapshotState, SnapshotState<List<Float>> snapshotState2, long j) {
        int size = AllocationsIsometricBar_wC_cr3g$lambda$41(snapshotState).size();
        for (int i = 0; i < size; i++) {
            int i2 = (int) (j >> 32);
            if (AllocationsIsometricBar_wC_cr3g$lambda$41(snapshotState).get(i).floatValue() < Float.intBitsToFloat(i2) && Float.intBitsToFloat(i2) < AllocationsIsometricBar_wC_cr3g$lambda$41(snapshotState).get(i).floatValue() + AllocationsIsometricBar_wC_cr3g$lambda$23(snapshotState2).get(i).floatValue()) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AllocationsIsometricBar_wC_cr3g$lambda$79$lambda$67$lambda$59$lambda$58 */
    public static final Unit m2117xf494b8f6(Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5) {
        function1.invoke(null);
        snapshotState.setValue(null);
        AllocationsIsometricBar_wC_cr3g$updateTargetPositions(snapshotState2, snapshotState3, snapshotState, snapshotState4, snapshotState5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: AllocationsIsometricBar_wC_cr3g$lambda$79$lambda$67$lambda$63$lambda$62 */
    public static final Unit m2118x7eea2de8(SnapshotState snapshotState, Function1 function1, ImmutableList immutableList, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5) {
        Integer numAllocationsIsometricBar_wC_cr3g$lambda$29 = AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState);
        if (numAllocationsIsometricBar_wC_cr3g$lambda$29 != null) {
            int iIntValue = numAllocationsIsometricBar_wC_cr3g$lambda$29.intValue();
            int i = iIntValue - 1;
            if (i >= 0) {
                iIntValue = i;
            }
            function1.invoke(((AllocationSection) immutableList.get(iIntValue)).getId());
            snapshotState.setValue(Integer.valueOf(iIntValue));
            AllocationsIsometricBar_wC_cr3g$updateTargetPositions(snapshotState2, snapshotState3, snapshotState, snapshotState4, snapshotState5);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: AllocationsIsometricBar_wC_cr3g$lambda$79$lambda$67$lambda$66$lambda$65 */
    public static final Unit m2119x3d98462e(SnapshotState snapshotState, Function1 function1, ImmutableList immutableList, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5) {
        Integer numAllocationsIsometricBar_wC_cr3g$lambda$29 = AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState);
        if (numAllocationsIsometricBar_wC_cr3g$lambda$29 != null) {
            int iIntValue = numAllocationsIsometricBar_wC_cr3g$lambda$29.intValue();
            int i = iIntValue + 1;
            if (i < AllocationsIsometricBar_wC_cr3g$lambda$23(snapshotState2).size()) {
                iIntValue = i;
            }
            function1.invoke(((AllocationSection) immutableList.get(iIntValue)).getId());
            snapshotState.setValue(Integer.valueOf(iIntValue));
            AllocationsIsometricBar_wC_cr3g$updateTargetPositions(snapshotState3, snapshotState2, snapshotState, snapshotState4, snapshotState5);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: AllocationsIsometricBar_wC_cr3g$lambda$79$lambda$78$lambda$73$lambda$72 */
    public static final Unit m2120x19ba8386(ImmutableList immutableList, long j, SnapshotState snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotFloatState2 snapshotFloatState23, SnapshotFloatState2 snapshotFloatState24, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5, SnapshotIntState2 snapshotIntState2, SnapshotFloatState2 snapshotFloatState25, SnapshotState snapshotState6, DrawScope drawScope) {
        SnapshotState snapshotState7;
        SnapshotState snapshotState8;
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        if (immutableList.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (AllocationsIsometricBar_wC_cr3g$lambda$8(snapshotState) == null) {
            AllocationsIsometricBar_wC_cr3g$runFirstTimeCalculation(immutableList, snapshotState, snapshotFloatState2, snapshotFloatState22, snapshotFloatState23, snapshotFloatState24, snapshotState2, Size.m6574boximpl(Canvas.mo6963getSizeNHjbRc()));
            snapshotState8 = snapshotState3;
            snapshotState7 = snapshotState2;
            AllocationsIsometricBar_wC_cr3g$updateTargetPositions(snapshotState, snapshotState7, snapshotState8, snapshotState4, snapshotState5);
        } else {
            snapshotState7 = snapshotState2;
            snapshotState8 = snapshotState3;
        }
        int size = immutableList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                AllocationSection allocationSection = (AllocationSection) immutableList.get(size);
                float fFloatValue = AllocationsIsometricBar_wC_cr3g$lambda$23(snapshotState7).get(size).floatValue();
                if (fFloatValue >= 0.001f) {
                    boolean z = size == 0;
                    Integer numAllocationsIsometricBar_wC_cr3g$lambda$29 = AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState8);
                    boolean z2 = numAllocationsIsometricBar_wC_cr3g$lambda$29 != null && numAllocationsIsometricBar_wC_cr3g$lambda$29.intValue() == size;
                    Integer numAllocationsIsometricBar_wC_cr3g$lambda$292 = AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState8);
                    Integer numValueOf = Integer.valueOf(snapshotIntState2.getIntValue());
                    if (numValueOf.intValue() < 0) {
                        numValueOf = null;
                    }
                    Tuples2<Float, Boolean> tuples2CalculateRenderingState = calculateRenderingState(size, z2, numAllocationsIsometricBar_wC_cr3g$lambda$292, numValueOf, snapshotFloatState25.getFloatValue());
                    m15575drawIsometricCubeXfLwLrM(Canvas, AllocationsIsometricBar_wC_cr3g$lambda$33(snapshotState6).get(size).getValue().floatValue(), snapshotFloatState24.getFloatValue(), fFloatValue, snapshotFloatState22.getFloatValue(), snapshotFloatState23.getFloatValue(), Color.m6705copywmQWz5c$default(allocationSection.m15582getColor0d7_KjU(), tuples2CalculateRenderingState.component1().floatValue(), 0.0f, 0.0f, 0.0f, 14, null), tuples2CalculateRenderingState.component2().booleanValue() ? allocationSection.m15582getColor0d7_KjU() : j, z || snapshotFloatState25.getFloatValue() > 0.01f);
                }
                if (i < 0) {
                    break;
                }
                Canvas = drawScope;
                size = i;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[PHI: r2
      0x0046: PHI (r2v3 float) = 
      (r2v0 float)
      (r2v0 float)
      (r2v1 float)
      (r2v0 float)
      (r2v4 float)
      (r2v0 float)
      (r2v0 float)
      (r2v6 float)
      (r2v7 float)
     binds: [B:36:0x0057, B:37:0x0059, B:39:0x005f, B:31:0x004c, B:34:0x0054, B:26:0x0040, B:27:0x0042, B:24:0x003d, B:19:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Tuples2<Float, Boolean> calculateRenderingState(int i, boolean z, Integer num, Integer num2, float f) {
        float f2 = 1.0f;
        boolean z2 = true;
        if (num2 == null || f >= 1.0f) {
            if (num == null || z) {
                z2 = false;
            } else {
                f2 = 1.0f + ((-0.7f) * f);
                if (f <= 0.5f) {
                }
            }
        } else if (num != null) {
            boolean z3 = i == num2.intValue();
            boolean z4 = i == num.intValue();
            if (z3 && !z4) {
                f2 = 1.0f + ((-0.7f) * f);
                if (f <= 0.5f) {
                }
            } else if (!z3 && z4) {
                f2 = (0.7f * f) + 0.3f;
                if (f >= 0.5f) {
                }
            } else if (!z3 && !z4) {
                f2 = 0.3f;
            }
        } else if (i != num2.intValue()) {
            f2 = (0.7f * f) + 0.3f;
            if (f >= 0.5f) {
            }
        }
        return new Tuples2<>(Float.valueOf(f2), Boolean.valueOf(z2));
    }

    /* renamed from: drawIsometricCube-XfLwLrM, reason: not valid java name */
    private static final void m15575drawIsometricCubeXfLwLrM(DrawScope drawScope, float f, float f2, float f3, float f4, float f5, long j, long j2, boolean z) {
        DrawScope.m6955drawPathLG529CI$default(drawScope, createCubePath(f, f2, f3, f4, f5, z), j, 0.0f, null, null, 0, 60, null);
        m15576drawVisibleEdgesPE3pjmc(drawScope, f, f2, f3, f4, f5, j2);
    }

    private static final Path createCubePath(float f, float f2, float f3, float f4, float f5, boolean z) {
        Path Path = AndroidPath_androidKt.Path();
        if (z) {
            float f6 = f2 - f5;
            Path.moveTo(f, f6);
            float f7 = f4 + f2;
            Path.lineTo(f, f7 - (2 * f5));
            float f8 = f + f5;
            float f9 = f7 - f5;
            Path.lineTo(f8, f9);
            float f10 = f + f3;
            Path.lineTo(f10, f9);
            float f11 = f5 + f10;
            Path.lineTo(f11, f9);
            Path.lineTo(f11, f2);
            Path.lineTo(f10, f6);
            Path.lineTo(f8, f6);
            Path.close();
            return Path;
        }
        Path.moveTo(f, f2);
        float f12 = f2 - f5;
        Path.lineTo(f - f5, f12);
        float f13 = f3 + f;
        Path.lineTo(f13, f12);
        float f14 = f13 + f5;
        Path.lineTo(f14, f2);
        float f15 = (f2 + f4) - f5;
        Path.lineTo(f14, f15);
        Path.lineTo(f, f15);
        Path.close();
        return Path;
    }

    /* renamed from: drawVisibleEdges-PE3pjmc, reason: not valid java name */
    private static final void m15576drawVisibleEdgesPE3pjmc(DrawScope drawScope, float f, float f2, float f3, float f4, float f5, long j) {
        float f6 = f + f5;
        float f7 = f2 + f4;
        float f8 = f7 - f5;
        float f9 = f + f3 + f5;
        float f10 = f2 - f5;
        float f11 = f7 - (2 * f5);
        for (Tuples2 tuples2 : CollectionsKt.listOf((Object[]) new Tuples2[]{new Tuples2(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L))), Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)))), new Tuples2(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L))), Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)))), new Tuples2(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L))), Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)))), new Tuples2(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L))), Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)))), new Tuples2(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f) << 32))), Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)))), new Tuples2(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f) << 32))), Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(r9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)))), new Tuples2(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L))), Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)))), new Tuples2(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f) << 32))), Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L))))})) {
            DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, ((Offset) tuples2.component1()).getPackedValue(), ((Offset) tuples2.component2()).getPackedValue(), 1.5f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        }
    }
}
