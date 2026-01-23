package com.robinhood.compose.bento.component;

import android.view.View;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.BiasAlignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.style.SegmentedControlStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BentoSegmentedControl.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\"\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0006X\u008a\u0084\u0002"}, m3636d2 = {"BentoSegmentedControl", "", "segments", "", "Lcom/robinhood/compose/bento/component/Segment;", "selectedIndex", "", "onIndexSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "SegmentedControlPreview", "(Landroidx/compose/runtime/Composer;I)V", "LocalSegmentedControlStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/compose/theme/style/SegmentedControlStyle;", "getLocalSegmentedControlStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-compose-bento_externalRelease", "segmentBackgroundWidth", "Landroidx/compose/ui/unit/Dp;", "segmentBackgroundHeight", "horizontalBias", "Landroidx/compose/ui/BiasAlignment;", "alignment", "fontWeight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoSegmentedControlKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoSegmentedControl2 {
    private static final CompositionLocal6<SegmentedControlStyle> LocalSegmentedControlStyle = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.compose.bento.component.BentoSegmentedControlKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BentoSegmentedControl2.LocalSegmentedControlStyle$lambda$26();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSegmentedControl$lambda$24(List list, int i, Function1 function1, Modifier modifier, boolean z, int i2, int i3, Composer composer, int i4) {
        BentoSegmentedControl(list, i, function1, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedControlPreview$lambda$25(int i, Composer composer, int i2) {
        SegmentedControlPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoSegmentedControl(final List<Segment> segments, final int i, final Function1<? super Integer, Unit> onIndexSelected, Modifier modifier, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        SegmentedControlStyle segmentedControlStyle;
        Modifier modifierM4876borderxT4_qwU;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier4;
        final boolean z4;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        long jM21940getSegmentForegroundDisabledColor0d7_KjU;
        SnapshotState snapshotState3;
        long j;
        Composer composer2;
        int i6;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7 = i;
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(onIndexSelected, "onIndexSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(497547453);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(segments) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i7) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onIndexSelected) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z4 = z2;
                    composer3 = composerStartRestartGroup;
                } else {
                    modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i5 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(497547453, i4, -1, "com.robinhood.compose.bento.component.BentoSegmentedControl (BentoSegmentedControl.kt:59)");
                    }
                    if (segments.size() == 2 && segments.size() != 3) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    segmentedControlStyle = (SegmentedControlStyle) composerStartRestartGroup.consume(LocalSegmentedControlStyle);
                    Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier3, false, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1401746298);
                    if (segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21938getContainerBorderColorQN2ZGVo() == null) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float fM20703getOutlinedBorderSizeD9Ej5fM = BentoSegmentedControl.INSTANCE.m20703getOutlinedBorderSizeD9Ej5fM();
                        Color colorM21938getContainerBorderColorQN2ZGVo = segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21938getContainerBorderColorQN2ZGVo();
                        Intrinsics.checkNotNull(colorM21938getContainerBorderColorQN2ZGVo);
                        modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(companion2, fM20703getOutlinedBorderSizeD9Ej5fM, Color.m6705copywmQWz5c$default(colorM21938getContainerBorderColorQN2ZGVo.getValue(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape());
                    } else {
                        modifierM4876borderxT4_qwU = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierPadding = PaddingKt.padding(Clip.clip(Background3.m4871backgroundbw27NRU(modifierWithBentoCirclePlaceholder$default.then(modifierM4876borderxT4_qwU), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle.getSpacing(composerStartRestartGroup, 0).getContainerPadding());
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0.0f)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        Object objMutableStateOf$default = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0.0f)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                        objRememberedValue2 = objMutableStateOf$default;
                    }
                    SnapshotState snapshotState5 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    int size = segments.size();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = ((i4 & 112) != 32) | composerStartRestartGroup.changed(size);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(i7 != 0 ? new BiasAlignment(-1.0f, 0.0f) : (i7 == 1 && segments.size() == 3) ? new BiasAlignment(0.0f, 0.0f) : new BiasAlignment(1.0f, 0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BiasAlignment biasAlignmentBentoSegmentedControl$lambda$23$lambda$7 = BentoSegmentedControl$lambda$23$lambda$7((SnapshotState) objRememberedValue3);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoSegmentedControlKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoSegmentedControl2.BentoSegmentedControl$lambda$23$lambda$9$lambda$8((BiasAlignment) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoSegmentedControlKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoSegmentedControl2.BentoSegmentedControl$lambda$23$lambda$11$lambda$10((AnimationVectors3) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    SnapshotState snapshotState6 = snapshotState4;
                    SnapshotState snapshotState7 = snapshotState5;
                    int i9 = 0;
                    SnapshotState4 snapshotState4AnimateValueAsState = AnimateAsState.animateValueAsState(biasAlignmentBentoSegmentedControl$lambda$23$lambda$7, VectorConvertersKt.TwoWayConverter(function1, (Function1) objRememberedValue5), null, null, null, null, composerStartRestartGroup, 0, 60);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    BoxKt.Box(boxScopeInstance.align(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(companion5, BentoSegmentedControl$lambda$23$lambda$1(snapshotState6), BentoSegmentedControl$lambda$23$lambda$4(snapshotState7)), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21939getSegmentBackgroundColor0d7_KjU(), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), BentoSegmentedControl$lambda$23$lambda$12(snapshotState4AnimateValueAsState)), composerStartRestartGroup, 0);
                    Modifier modifierSelectableGroup = SelectableGroup.selectableGroup(companion5);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSelectableGroup);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(866353415);
                    final int i10 = 0;
                    Composer composer4 = composerStartRestartGroup;
                    for (Object obj : segments) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Segment segment = (Segment) obj;
                        final boolean z5 = i10 == i7 ? 1 : i9;
                        SnapshotState4<Integer> fontWeight = segmentedControlStyle.getTypography(composer4, i9).getFontWeight(z5, composer4, SegmentedControlStyle.Typography.$stable << 3);
                        final View view = (View) composer4.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        final Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier modifier6 = segment.getModifier();
                        composer4.startReplaceGroup(-1746271574);
                        boolean zChanged2 = composer4.changed(density);
                        Object objRememberedValue6 = composer4.rememberedValue();
                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            snapshotState = snapshotState6;
                            snapshotState2 = snapshotState7;
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoSegmentedControlKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return BentoSegmentedControl2.m2574x15880d77(density, snapshotState, snapshotState2, (IntSize) obj2);
                                }
                            };
                            composer4.updateRememberedValue(objRememberedValue6);
                        } else {
                            snapshotState = snapshotState6;
                            snapshotState2 = snapshotState7;
                        }
                        composer4.endReplaceGroup();
                        Row6 row62 = row6;
                        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(Row5.weight$default(row6, OnRemeasuredModifier2.onSizeChanged(modifier6, (Function1) objRememberedValue6), 1.0f, false, 2, null), 0.0f, segmentedControlStyle.getSizing(composer4, i9).m21945getSegmentMinHeightD9Ej5fM(), 1, null);
                        composer4.startReplaceGroup(1849434622);
                        Object objRememberedValue7 = composer4.rememberedValue();
                        Composer.Companion companion6 = Composer.INSTANCE;
                        if (objRememberedValue7 == companion6.getEmpty()) {
                            objRememberedValue7 = InteractionSource2.MutableInteractionSource();
                            composer4.updateRememberedValue(objRememberedValue7);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue7;
                        composer4.endReplaceGroup();
                        Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7486getTabo7Vup1c());
                        composer4.startReplaceGroup(-1224400529);
                        boolean zChanged3 = composer4.changed(z5) | composer4.changedInstance(view) | ((i4 & 896) == 256) | composer4.changed(i10);
                        Object objRememberedValue8 = composer4.rememberedValue();
                        if (zChanged3 || objRememberedValue8 == companion6.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.robinhood.compose.bento.component.BentoSegmentedControlKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BentoSegmentedControl2.m2575xd43625bd(z5, view, onIndexSelected, i10);
                                }
                            };
                            composer4.updateRememberedValue(objRememberedValue8);
                        }
                        composer4.endReplaceGroup();
                        SnapshotState snapshotState8 = snapshotState2;
                        boolean z6 = z3;
                        Modifier modifierPadding2 = PaddingKt.padding(Selectable3.m5313selectableO2vRcR0(modifierM5155defaultMinSizeVpY3zN4$default, z5, interactionSource3, null, z3, roleM7472boximpl, (Function0) objRememberedValue8), segmentedControlStyle.getSpacing(composer4, 0).getSegmentPadding());
                        Arrangement arrangement = Arrangement.INSTANCE;
                        float fM20702getIconSpacingD9Ej5fM = BentoSegmentedControl.INSTANCE.m20702getIconSpacingD9Ej5fM();
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5090spacedByD5KLDUw(fM20702getIconSpacingD9Ej5fM, companion7.getCenterHorizontally()), companion7.getCenterVertically(), composer4, 54);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierPadding2);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion8.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion8.getSetModifier());
                        Row6 row63 = Row6.INSTANCE;
                        if (z6) {
                            composer4.startReplaceGroup(-948878843);
                            jM21940getSegmentForegroundDisabledColor0d7_KjU = segmentedControlStyle.getColors(composer4, 0).m21941getSegmentForegroundEnabledColor0d7_KjU();
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(-948783580);
                            jM21940getSegmentForegroundDisabledColor0d7_KjU = segmentedControlStyle.getColors(composer4, 0).m21940getSegmentForegroundDisabledColor0d7_KjU();
                            composer4.endReplaceGroup();
                        }
                        composer4.startReplaceGroup(-30602091);
                        if (segment.getIcon() != null) {
                            j = jM21940getSegmentForegroundDisabledColor0d7_KjU;
                            Composer composer5 = composer4;
                            snapshotState3 = snapshotState;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(segment.getIcon().getAsset()), null, j, null, null, false, composer5, 48, 56);
                            composer2 = composer5;
                        } else {
                            snapshotState3 = snapshotState;
                            j = jM21940getSegmentForegroundDisabledColor0d7_KjU;
                            composer2 = composer4;
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-30591440);
                        String text = segment.getText();
                        if (text == null || StringsKt.isBlank(text)) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            Composer composer6 = composer2;
                            BentoText2.m20747BentoText38GnDrw(segment.getText(), null, Color.m6701boximpl(j), null, new FontWeight(BentoSegmentedControl$lambda$23$lambda$22$lambda$21$lambda$13(fontWeight)), null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, segmentedControlStyle.getTypography(composer2, 0).getTextStyle(), composer6, 817889280, 0, 7530);
                            composer2 = composer6;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        snapshotState7 = snapshotState8;
                        snapshotState6 = snapshotState3;
                        i9 = i6;
                        z3 = z6;
                        i10 = i11;
                        row6 = row62;
                        i7 = i;
                        composer4 = composer2;
                    }
                    boolean z7 = z3;
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    z4 = z7;
                    composer3 = composer4;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoSegmentedControlKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return BentoSegmentedControl2.BentoSegmentedControl$lambda$24(segments, i, onIndexSelected, modifier4, z4, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            z2 = z;
            if ((i4 & 9363) == 9362) {
                if (i8 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (segments.size() == 2) {
                }
                segmentedControlStyle = (SegmentedControlStyle) composerStartRestartGroup.consume(LocalSegmentedControlStyle);
                Modifier modifierWithBentoCirclePlaceholder$default2 = LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier3, false, 1, null);
                composerStartRestartGroup.startReplaceGroup(1401746298);
                if (segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21938getContainerBorderColorQN2ZGVo() == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPadding3 = PaddingKt.padding(Clip.clip(Background3.m4871backgroundbw27NRU(modifierWithBentoCirclePlaceholder$default2.then(modifierM4876borderxT4_qwU), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle.getSpacing(composerStartRestartGroup, 0).getContainerPadding());
                Alignment.Companion companion32 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding3);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion42.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState42 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState52 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    int size2 = segments.size();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = ((i4 & 112) != 32) | composerStartRestartGroup.changed(size2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        if (i7 != 0) {
                        }
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(i7 != 0 ? new BiasAlignment(-1.0f, 0.0f) : (i7 == 1 && segments.size() == 3) ? new BiasAlignment(0.0f, 0.0f) : new BiasAlignment(1.0f, 0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        BiasAlignment biasAlignmentBentoSegmentedControl$lambda$23$lambda$72 = BentoSegmentedControl$lambda$23$lambda$7((SnapshotState) objRememberedValue3);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        Function1 function12 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier3;
                        SnapshotState snapshotState62 = snapshotState42;
                        SnapshotState snapshotState72 = snapshotState52;
                        int i92 = 0;
                        SnapshotState4 snapshotState4AnimateValueAsState2 = AnimateAsState.animateValueAsState(biasAlignmentBentoSegmentedControl$lambda$23$lambda$72, VectorConvertersKt.TwoWayConverter(function12, (Function1) objRememberedValue5), null, null, null, null, composerStartRestartGroup, 0, 60);
                        Modifier.Companion companion52 = Modifier.INSTANCE;
                        BoxKt.Box(boxScopeInstance2.align(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(companion52, BentoSegmentedControl$lambda$23$lambda$1(snapshotState62), BentoSegmentedControl$lambda$23$lambda$4(snapshotState72)), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21939getSegmentBackgroundColor0d7_KjU(), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), BentoSegmentedControl$lambda$23$lambda$12(snapshotState4AnimateValueAsState2)), composerStartRestartGroup, 0);
                        Modifier modifierSelectableGroup2 = SelectableGroup.selectableGroup(companion52);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion32.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSelectableGroup2);
                        Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                            Row6 row64 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(866353415);
                            final int i102 = 0;
                            Composer composer42 = composerStartRestartGroup;
                            while (r5.hasNext()) {
                            }
                            boolean z72 = z3;
                            composer42.endReplaceGroup();
                            composer42.endNode();
                            composer42.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier52;
                            z4 = z72;
                            composer3 = composer42;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i4 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final float BentoSegmentedControl$lambda$23$lambda$1(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    private static final BiasAlignment BentoSegmentedControl$lambda$23$lambda$12(SnapshotState4<BiasAlignment> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final int BentoSegmentedControl$lambda$23$lambda$22$lambda$21$lambda$13(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    private static final float BentoSegmentedControl$lambda$23$lambda$4(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    private static final BiasAlignment BentoSegmentedControl$lambda$23$lambda$7(SnapshotState<BiasAlignment> snapshotState) {
        return snapshotState.getValue();
    }

    private static final void BentoSegmentedControl$lambda$23$lambda$2(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    private static final void BentoSegmentedControl$lambda$23$lambda$5(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVectors3 BentoSegmentedControl$lambda$23$lambda$9$lambda$8(BiasAlignment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AnimationVectors3(it.getHorizontalBias(), it.getVerticalBias());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiasAlignment BentoSegmentedControl$lambda$23$lambda$11$lambda$10(AnimationVectors3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BiasAlignment(it.getV1(), it.getV2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BentoSegmentedControl$lambda$23$lambda$22$lambda$21$lambda$16$lambda$15 */
    public static final Unit m2574x15880d77(Density density, SnapshotState snapshotState, SnapshotState snapshotState2, IntSize intSize) {
        BentoSegmentedControl$lambda$23$lambda$2(snapshotState, density.mo5013toDpu2uoSUM((int) (intSize.getPackedValue() >> 32)));
        BentoSegmentedControl$lambda$23$lambda$5(snapshotState2, density.mo5013toDpu2uoSUM((int) (intSize.getPackedValue() & 4294967295L)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BentoSegmentedControl$lambda$23$lambda$22$lambda$21$lambda$19$lambda$18 */
    public static final Unit m2575xd43625bd(boolean z, View view, Function1 function1, int i) {
        if (!z) {
            view.performHapticFeedback(6);
        }
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    private static final void SegmentedControlPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-58540656);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-58540656, i, -1, "com.robinhood.compose.bento.component.SegmentedControlPreview (BentoSegmentedControl.kt:307)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoSegmentedControl4.INSTANCE.m20796getLambda$316999352$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoSegmentedControlKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSegmentedControl2.SegmentedControlPreview$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final CompositionLocal6<SegmentedControlStyle> getLocalSegmentedControlStyle() {
        return LocalSegmentedControlStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SegmentedControlStyle LocalSegmentedControlStyle$lambda$26() {
        throw new IllegalStateException("No SegmentedControlStyle provided in the theme.");
    }
}
