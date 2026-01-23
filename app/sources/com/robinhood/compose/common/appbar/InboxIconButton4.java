package com.robinhood.compose.common.appbar;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InboxIconButton.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\"\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f\"\u0010\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f\"\u0010\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f\"\u0010\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"InboxIconButton", "", "shouldShowInboxBadge", "", "inboxBadgeIsCritical", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CriticalBadgeSize", "Landroidx/compose/ui/unit/Dp;", "F", "CriticalBadgeMargin", "NonCriticalBadgeSize", "NonCriticalBadgeMargin", "InboxBadgeTestTag", "", "InboxIconButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.appbar.InboxIconButtonKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class InboxIconButton4 {
    public static final String InboxBadgeTestTag = "inbox_badge";
    private static final float CriticalBadgeSize = C2002Dp.m7995constructorimpl(20);
    private static final float CriticalBadgeMargin = C2002Dp.m7995constructorimpl(5);
    private static final float NonCriticalBadgeSize = C2002Dp.m7995constructorimpl(14);
    private static final float NonCriticalBadgeMargin = C2002Dp.m7995constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxIconButton$lambda$5(boolean z, boolean z2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InboxIconButton(z, z2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxIconButtonPreview$lambda$6(int i, Composer composer, int i2) {
        InboxIconButtonPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InboxIconButton(final boolean z, final boolean z2, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        final boolean z4;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        SnapshotState snapshotState2;
        final int i5;
        boolean zChanged;
        Object objRememberedValue6;
        final SnapshotState snapshotState3;
        Object obj;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1899197457);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1899197457, i3, -1, "com.robinhood.compose.common.appbar.InboxIconButton (InboxIconButton.kt:28)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                    composerStartRestartGroup.startReplaceGroup(212064437);
                    composerStartRestartGroup.endReplaceGroup();
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Measurer2(density);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    measurer2 = (Measurer2) objRememberedValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ConstraintLayoutScope();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue5;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                    i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                        snapshotState3 = snapshotState2;
                        obj = null;
                        objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$2
                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                snapshotState3.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                                snapshotState.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$2.1
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
                                        measurer22.performLayout(placementScope, list, linkedHashMap);
                                    }
                                }, 4, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        snapshotState3 = snapshotState2;
                        obj = null;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                constraintSetForInlineDsl.setKnownDirty(true);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    final Function0 function0 = (Function0) objRememberedValue7;
                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$4
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
                                ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier2, false, (Function1) objRememberedValue8, 1, obj);
                    final boolean z5 = z3;
                    final SnapshotState snapshotState4 = snapshotState3;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$5
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
                            Composer composer4 = composer3;
                            if ((i6 & 3) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState4.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                composer4.startReplaceGroup(1561311411);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                composer4.startReplaceGroup(1849434622);
                                Object objRememberedValue9 = composer4.rememberedValue();
                                Composer.Companion companion3 = Composer.INSTANCE;
                                if (objRememberedValue9 == companion3.getEmpty()) {
                                    objRememberedValue9 = InboxIconButton5.INSTANCE;
                                    composer4.updateRememberedValue(objRememberedValue9);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                IconButton5.IconButton(onClick, null, false, null, null, InboxIconButton.INSTANCE.m21667getLambda$880042805$lib_compose_common_externalDebug(), composer4, 196608, 30);
                                composer4.endNode();
                                composer4.startReplaceGroup(-88168746);
                                if (z5) {
                                    float f = z4 ? InboxIconButton4.CriticalBadgeMargin : InboxIconButton4.NonCriticalBadgeMargin;
                                    boolean z6 = z4;
                                    int i7 = z6 ? C11048R.drawable.svg_ic_critical_badge : C11048R.drawable.tab_badge;
                                    float f2 = z6 ? InboxIconButton4.CriticalBadgeSize : InboxIconButton4.NonCriticalBadgeSize;
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged2 = composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f);
                                    Object objRememberedValue10 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue10 == companion3.getEmpty()) {
                                        objRememberedValue10 = new InboxIconButton6(constraintLayoutBaseScope4Component1, f);
                                        composer4.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierTestTag = TestTag3.testTag(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), InboxIconButton4.InboxBadgeTestTag);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierTestTag);
                                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(i7), null, null, null, 0, null, composer4, 0, 62), (String) null, SizeKt.m5169size3ABfNKs(companion2, f2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                                    composer4 = composer3;
                                    composer4.endNode();
                                }
                                composer4.endReplaceGroup();
                                composer4.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                    EffectsKt.SideEffect(function0, composer4, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                    composer2 = composerStartRestartGroup;
                    LayoutKt.MultiMeasureLayout(modifierSemantics$default, composableLambdaRememberComposableLambda, measurePolicy, composer2, 48, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return InboxIconButton4.InboxIconButton$lambda$5(z, z2, onClick, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                measurer2 = (Measurer2) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
                i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    snapshotState3 = snapshotState2;
                    obj = null;
                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                            final Map linkedHashMap = new LinkedHashMap();
                            snapshotState3.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$2.1
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
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                    }
                    final Function0 function02 = (Function0) objRememberedValue7;
                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$4
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
                                ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier2, false, (Function1) objRememberedValue8, 1, obj);
                        final boolean z52 = z3;
                        final SnapshotState snapshotState42 = snapshotState3;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$InboxIconButton$$inlined$ConstraintLayout$5
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
                                Composer composer4 = composer3;
                                if ((i6 & 3) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                    }
                                    snapshotState42.setValue(Unit.INSTANCE);
                                    int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                    constraintLayoutScope2.reset();
                                    ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                    composer4.startReplaceGroup(1561311411);
                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue9 = composer4.rememberedValue();
                                    Composer.Companion companion3 = Composer.INSTANCE;
                                    if (objRememberedValue9 == companion3.getEmpty()) {
                                        objRememberedValue9 = InboxIconButton5.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue9);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    IconButton5.IconButton(onClick, null, false, null, null, InboxIconButton.INSTANCE.m21667getLambda$880042805$lib_compose_common_externalDebug(), composer4, 196608, 30);
                                    composer4.endNode();
                                    composer4.startReplaceGroup(-88168746);
                                    if (z52) {
                                        float f = z4 ? InboxIconButton4.CriticalBadgeMargin : InboxIconButton4.NonCriticalBadgeMargin;
                                        boolean z6 = z4;
                                        int i7 = z6 ? C11048R.drawable.svg_ic_critical_badge : C11048R.drawable.tab_badge;
                                        float f2 = z6 ? InboxIconButton4.CriticalBadgeSize : InboxIconButton4.NonCriticalBadgeSize;
                                        composer4.startReplaceGroup(-1633490746);
                                        boolean zChanged2 = composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f);
                                        Object objRememberedValue10 = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue10 == companion3.getEmpty()) {
                                            objRememberedValue10 = new InboxIconButton6(constraintLayoutBaseScope4Component1, f);
                                            composer4.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierTestTag = TestTag3.testTag(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), InboxIconButton4.InboxBadgeTestTag);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierTestTag);
                                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(i7), null, null, null, 0, null, composer4, 0, 62), (String) null, SizeKt.m5169size3ABfNKs(companion2, f2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                                        composer4 = composer3;
                                        composer4.endNode();
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.endReplaceGroup();
                                    if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                        EffectsKt.SideEffect(function02, composer4, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54);
                        composer2 = composerStartRestartGroup;
                        LayoutKt.MultiMeasureLayout(modifierSemantics$default2, composableLambdaRememberComposableLambda2, measurePolicy2, composer2, 48, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void InboxIconButtonPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1903313766);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1903313766, i, -1, "com.robinhood.compose.common.appbar.InboxIconButtonPreview (InboxIconButton.kt:71)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InboxIconButton.INSTANCE.m21666getLambda$263358290$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.appbar.InboxIconButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxIconButton4.InboxIconButtonPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
