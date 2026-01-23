package com.robinhood.android.advisory.dashboard.overview;

import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.BiasAlignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcher4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.style.SegmentedControlStyle;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Component;
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

/* compiled from: AdvisoryChartSwitcher.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\fH\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0017\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u0084\u0002"}, m3636d2 = {"IconSize", "Landroidx/compose/ui/unit/Dp;", "F", "IconSpacing", "AdvisoryDashboardSwitcher", "", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption;", "selectedIndex", "", "onIndexSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "expanded", "", "(Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "SegmentItem", "segment", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "(Lcom/robinhood/android/advisory/dashboard/overview/AdvisorySwitcherOption;IILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AdvisoryChartSwitcherPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-advisory-dashboard_externalDebug", "horizontalBias", "Landroidx/compose/ui/BiasAlignment;", "alignment"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryChartSwitcher2 {
    private static final float IconSize = C2002Dp.m7995constructorimpl(32);
    private static final float IconSpacing = C2002Dp.m7995constructorimpl(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryChartSwitcherPreview$lambda$19(int i, Composer composer, int i2) {
        AdvisoryChartSwitcherPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryDashboardSwitcher$lambda$10(ImmutableList immutableList, int i, Function1 function1, Modifier modifier, boolean z, int i2, int i3, Composer composer, int i4) {
        AdvisoryDashboardSwitcher(immutableList, i, function1, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentItem$lambda$18(AdvisoryChartSwitcher4 advisoryChartSwitcher4, int i, int i2, Function1 function1, int i3, Composer composer, int i4) {
        SegmentItem(advisoryChartSwitcher4, i, i2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    private static final BiasAlignment AdvisoryDashboardSwitcher$lambda$9$lambda$1(SnapshotState<BiasAlignment> snapshotState) {
        return snapshotState.getValue();
    }

    private static final BiasAlignment AdvisoryDashboardSwitcher$lambda$9$lambda$6(SnapshotState4<BiasAlignment> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryDashboardSwitcher(final ImmutableList<? extends AdvisoryChartSwitcher4> options, final int i, final Function1<? super Integer, Unit> onIndexSelected, Modifier modifier, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        BiasAlignment biasAlignment;
        Object obj;
        Object objMutableStateOf$default;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onIndexSelected, "onIndexSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(781591611);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(options) : composerStartRestartGroup.changedInstance(options) ? 4 : 2) | i2;
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
            i4 |= composerStartRestartGroup.changedInstance(onIndexSelected) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
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
                    modifier3 = modifier2;
                    z3 = z2;
                } else {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i5 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(781591611, i4, -1, "com.robinhood.android.advisory.dashboard.overview.AdvisoryDashboardSwitcher (AdvisoryChartSwitcher.kt:135)");
                    }
                    SegmentedControlStyle segmentedControlStyle = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
                    Modifier modifierPadding = PaddingKt.padding(Background3.m4871backgroundbw27NRU(LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier4, false, 1, null), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), segmentedControlStyle.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle.getSpacing(composerStartRestartGroup, 0).getContainerPadding());
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int size = options.size();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = ((i4 & 112) != 32) | composerStartRestartGroup.changed(size);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        if (i != 0) {
                            biasAlignment = new BiasAlignment(-1.0f, 0.0f);
                        } else {
                            biasAlignment = (i == 1 && options.size() == 3) ? new BiasAlignment(0.0f, 0.0f) : new BiasAlignment(1.0f, 0.0f);
                        }
                        obj = null;
                        objMutableStateOf$default = SnapshotState3.mutableStateOf$default(biasAlignment, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                    } else {
                        objMutableStateOf$default = objRememberedValue3;
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BiasAlignment biasAlignmentAdvisoryDashboardSwitcher$lambda$9$lambda$1 = AdvisoryDashboardSwitcher$lambda$9$lambda$1((SnapshotState) objMutableStateOf$default);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AdvisoryChartSwitcher2.AdvisoryDashboardSwitcher$lambda$9$lambda$3$lambda$2((BiasAlignment) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AdvisoryChartSwitcher2.AdvisoryDashboardSwitcher$lambda$9$lambda$5$lambda$4((AnimationVectors3) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    int i7 = 0;
                    SnapshotState4 snapshotState4AnimateValueAsState = AnimateAsState.animateValueAsState(biasAlignmentAdvisoryDashboardSwitcher$lambda$9$lambda$1, VectorConvertersKt.TwoWayConverter(function1, (Function1) objRememberedValue2), null, null, null, null, composerStartRestartGroup, 0, 60);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BoxKt.Box(boxScopeInstance.align(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion4, IconSize), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21939getSegmentBackgroundColor0d7_KjU(), RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), AdvisoryDashboardSwitcher$lambda$9$lambda$6(snapshotState4AnimateValueAsState)), composerStartRestartGroup, 0);
                    Modifier modifierSelectableGroup = SelectableGroup.selectableGroup(companion4);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5090spacedByD5KLDUw(IconSpacing, companion2.getCenterHorizontally()), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSelectableGroup);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1829691503);
                    final int i8 = 0;
                    for (AdvisoryChartSwitcher4 advisoryChartSwitcher4 : options) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final AdvisoryChartSwitcher4 advisoryChartSwitcher42 = advisoryChartSwitcher4;
                        int i10 = (z4 || (i8 == i ? 1 : i7) != 0) ? 1 : i7;
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(150, i7, Easing3.getLinearOutSlowInEasing(), 2, null), 0.0f, 2, null);
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, i7, Easing3.getLinearOutSlowInEasing(), 2, null);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        Composer composer2 = composerStartRestartGroup;
                        AnimatedVisibilityKt.AnimatedVisibility((Row5) row6, (boolean) i10, (Modifier) null, enterTransitionFadeIn$default.plus(EnterExitTransitionKt.expandHorizontally$default(tweenSpecTween$default, companion5.getCenterHorizontally(), false, null, 12, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(150, i7, Easing3.getFastOutLinearInEasing(), 2, null), 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(AnimationSpecKt.tween$default(150, 0, Easing3.getFastOutLinearInEasing(), 2, null), companion5.getCenterHorizontally(), false, null, 12, null)), (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-753351579, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt$AdvisoryDashboardSwitcher$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i11) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-753351579, i11, -1, "com.robinhood.android.advisory.dashboard.overview.AdvisoryDashboardSwitcher.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryChartSwitcher.kt:202)");
                                }
                                AdvisoryChartSwitcher2.SegmentItem(advisoryChartSwitcher42, i8, i, onIndexSelected, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 1572870, 18);
                        composerStartRestartGroup = composer2;
                        i8 = i9;
                        i7 = 0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return AdvisoryChartSwitcher2.AdvisoryDashboardSwitcher$lambda$10(options, i, onIndexSelected, modifier3, z3, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            z2 = z;
            if ((i4 & 9363) == 9362) {
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                SegmentedControlStyle segmentedControlStyle2 = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
                Modifier modifierPadding2 = PaddingKt.padding(Background3.m4871backgroundbw27NRU(LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier4, false, 1, null), segmentedControlStyle2.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), segmentedControlStyle2.getSizing(composerStartRestartGroup, 0).getShape()), segmentedControlStyle2.getSpacing(composerStartRestartGroup, 0).getContainerPadding());
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int size2 = options.size();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = ((i4 & 112) != 32) | composerStartRestartGroup.changed(size2);
                    Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        if (i != 0) {
                        }
                        obj = null;
                        objMutableStateOf$default = SnapshotState3.mutableStateOf$default(biasAlignment, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                        composerStartRestartGroup.endReplaceGroup();
                        BiasAlignment biasAlignmentAdvisoryDashboardSwitcher$lambda$9$lambda$12 = AdvisoryDashboardSwitcher$lambda$9$lambda$1((SnapshotState) objMutableStateOf$default);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        Function1 function12 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        int i72 = 0;
                        SnapshotState4 snapshotState4AnimateValueAsState2 = AnimateAsState.animateValueAsState(biasAlignmentAdvisoryDashboardSwitcher$lambda$9$lambda$12, VectorConvertersKt.TwoWayConverter(function12, (Function1) objRememberedValue2), null, null, null, null, composerStartRestartGroup, 0, 60);
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        BoxKt.Box(boxScopeInstance2.align(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion42, IconSize), segmentedControlStyle2.getColors(composerStartRestartGroup, 0).m21939getSegmentBackgroundColor0d7_KjU(), RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), AdvisoryDashboardSwitcher$lambda$9$lambda$6(snapshotState4AnimateValueAsState2)), composerStartRestartGroup, 0);
                        Modifier modifierSelectableGroup2 = SelectableGroup.selectableGroup(companion42);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5090spacedByD5KLDUw(IconSpacing, companion22.getCenterHorizontally()), companion22.getCenterVertically(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSelectableGroup2);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1829691503);
                            final int i82 = 0;
                            while (r0.hasNext()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z3 = z4;
                            modifier3 = modifier52;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
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
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVectors3 AdvisoryDashboardSwitcher$lambda$9$lambda$3$lambda$2(BiasAlignment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AnimationVectors3(it.getHorizontalBias(), it.getVerticalBias());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiasAlignment AdvisoryDashboardSwitcher$lambda$9$lambda$5$lambda$4(AnimationVectors3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BiasAlignment(it.getV1(), it.getV2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SegmentItem(final AdvisoryChartSwitcher4 advisoryChartSwitcher4, final int i, final int i2, final Function1<? super Integer, Unit> function1, Composer composer, final int i3) {
        int i4;
        long jM21940getSegmentForegroundDisabledColor0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1834590446);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? composerStartRestartGroup.changed(advisoryChartSwitcher4) : composerStartRestartGroup.changedInstance(advisoryChartSwitcher4) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1834590446, i4, -1, "com.robinhood.android.advisory.dashboard.overview.SegmentItem (AdvisoryChartSwitcher.kt:220)");
            }
            SegmentedControlStyle segmentedControlStyle = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
            final boolean z = i == i2;
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-824826858);
                jM21940getSegmentForegroundDisabledColor0d7_KjU = segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21941getSegmentForegroundEnabledColor0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-824763339);
                jM21940getSegmentForegroundDisabledColor0d7_KjU = segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21940getSegmentForegroundDisabledColor0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, IconSize);
            Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7486getTabo7Vup1c());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = composerStartRestartGroup.changed(z) | composerStartRestartGroup.changedInstance(view) | ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryChartSwitcher2.SegmentItem$lambda$12$lambda$11(z, view, function1, i);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5315selectableXHw0xAI = Selectable3.m5315selectableXHw0xAI(modifierM5169size3ABfNKs, z, true, roleM7472boximpl, (Function0) objRememberedValue);
            if (advisoryChartSwitcher4 instanceof AdvisoryChartSwitcher4.Chart) {
                composerStartRestartGroup.startReplaceGroup(-824222017);
                AdvisoryChartSwitcher4.Chart chart = (AdvisoryChartSwitcher4.Chart) advisoryChartSwitcher4;
                AdvisoryChartSwitcher chart2 = chart.getChart();
                boolean showUnreadIndicator = chart.getShowUnreadIndicator();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
                Modifier modifierThen = ModifiersKt.autoLogEvents$default(Clip.clip(companion, RoundedCornerShape2.getCircleShape()), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.SEGMENT, chart2.getLoggingIdentifier$lib_advisory_dashboard_externalDebug(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null).then(modifierM5315selectableXHw0xAI);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(chart2.getIcon$lib_advisory_dashboard_externalDebug(), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(chart2.getContentDescription$lib_advisory_dashboard_externalDebug(), composerStartRestartGroup, 0), boxScopeInstance.align(Rotate.rotate(Scale2.scale(companion, chart2.getFlipXAxis$lib_advisory_dashboard_externalDebug() ? -1.0f : 1.0f, 1.0f), chart2.getRotate180$lib_advisory_dashboard_externalDebug() ? 180.0f : 0.0f), companion2.getCenter()), jM21940getSegmentForegroundDisabledColor0d7_KjU, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(-1454217338);
                if (showUnreadIndicator) {
                    BoxKt.Box(Background3.m4871backgroundbw27NRU(OffsetKt.m5124offsetVpY3zN4(boxScopeInstance.align(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(9)), companion2.getTopEnd()), C2002Dp.m7995constructorimpl(1), C2002Dp.m7995constructorimpl(-1)), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU(), RoundedCornerShape2.getCircleShape()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                long j = jM21940getSegmentForegroundDisabledColor0d7_KjU;
                if (!(advisoryChartSwitcher4 instanceof AdvisoryChartSwitcher4.Value)) {
                    composerStartRestartGroup.startReplaceGroup(-2104798953);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-822080661);
                Modifier modifierThen2 = Clip.clip(companion, RoundedCornerShape2.getCircleShape()).then(modifierM5315selectableXHw0xAI);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z2 = (i4 & 14) == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(advisoryChartSwitcher4));
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvisoryChartSwitcher2.SegmentItem$lambda$16$lambda$15(advisoryChartSwitcher4, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(modifierThen2, (Function1) objRememberedValue2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(((AdvisoryChartSwitcher4.Value) advisoryChartSwitcher4).getText(), null, Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composerStartRestartGroup, 24576, 0, 8106);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryChartSwitcher2.SegmentItem$lambda$18(advisoryChartSwitcher4, i, i2, function1, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentItem$lambda$12$lambda$11(boolean z, View view, Function1 function1, int i) {
        if (!z) {
            view.performHapticFeedback(6);
        }
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentItem$lambda$16$lambda$15(AdvisoryChartSwitcher4 advisoryChartSwitcher4, SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, ((AdvisoryChartSwitcher4.Value) advisoryChartSwitcher4).getContentDescription());
        return Unit.INSTANCE;
    }

    private static final void AdvisoryChartSwitcherPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-675460788);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-675460788, i, -1, "com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherPreview (AdvisoryChartSwitcher.kt:322)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, AdvisoryChartSwitcher5.INSTANCE.getLambda$303887508$lib_advisory_dashboard_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcherKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryChartSwitcher2.AdvisoryChartSwitcherPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
