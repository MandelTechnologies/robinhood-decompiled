package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.window.PopupProperties;
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
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import com.robinhood.android.chart.blackwidowadvancedchart.IntervalSelectorState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: IntervalSelector.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001aC\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"IntervalSelector", "", "state", "Lcom/robinhood/android/chart/blackwidowadvancedchart/IntervalSelectorState;", "onIntervalSelected", "Lkotlin/Function1;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "onIntervalMenuOpen", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/IntervalSelectorState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ScrollingIntervalSelectorPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "showIntervalSelector", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class IntervalSelector3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntervalSelector$lambda$8(IntervalSelectorState intervalSelectorState, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IntervalSelector(intervalSelectorState, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollingIntervalSelectorPreview$lambda$9(int i, Composer composer, int i2) {
        ScrollingIntervalSelectorPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IntervalSelector(final IntervalSelectorState intervalSelectorState, final Function1<? super IntervalDto, Unit> onIntervalSelected, final Function0<Unit> onIntervalMenuOpen, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final HapticFeedback hapticFeedback;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        Composer composer2;
        final Modifier modifier3;
        IntervalDto currentInterval;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onIntervalSelected, "onIntervalSelected");
        Intrinsics.checkNotNullParameter(onIntervalMenuOpen, "onIntervalMenuOpen");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2038442824);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(intervalSelectorState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIntervalSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIntervalMenuOpen) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2038442824, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelector (IntervalSelector.kt:40)");
                }
                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(modifier4, (intervalSelectorState == null ? intervalSelectorState.getCurrentInterval() : null) != null, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(hapticFeedback);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntervalSelector3.IntervalSelector$lambda$4$lambda$3(hapticFeedback, onIntervalMenuOpen, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierBentoPlaceholder$default, false, null, null, (Function0) objRememberedValue2, 7, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(modifierM4893clickableXHw0xAI$default, bentoTheme.getColors(composerStartRestartGroup, i5).m21368getAccent0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(10));
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                if (intervalSelectorState != null || (currentInterval = intervalSelectorState.getCurrentInterval()) == null || (label = currentInterval.getLabel()) == null) {
                    String label = "XXX XXX";
                }
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(label, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21371getBg0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 24576, 0, 8168);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.DROPDOWN_12), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null);
                boolean zIntervalSelector$lambda$1 = IntervalSelector$lambda$1(snapshotState);
                PopupProperties popupProperties = new PopupProperties(true, false, false, false, 6, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                    snapshotState2 = snapshotState;
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntervalSelector3.IntervalSelector$lambda$7$lambda$6$lambda$5(snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    snapshotState2 = snapshotState;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                AndroidMenu_androidKt.m5699DropdownMenuIlH_yew(zIntervalSelector$lambda$1, (Function0) objRememberedValue3, modifierM4872backgroundbw27NRU$default, 0L, null, popupProperties, null, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(1356780097, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2

                    /* compiled from: IntervalSelector.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2$1 */
                    static final class C106661 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ HapticFeedback $hapticFeedback;
                        final /* synthetic */ Function1<IntervalDto, Unit> $onIntervalSelected;
                        final /* synthetic */ SnapshotState<Boolean> $showIntervalSelector$delegate;
                        final /* synthetic */ IntervalSelectorState $state;

                        /* JADX WARN: Multi-variable type inference failed */
                        C106661(IntervalSelectorState intervalSelectorState, HapticFeedback hapticFeedback, Function1<? super IntervalDto, Unit> function1, SnapshotState<Boolean> snapshotState) {
                            this.$state = intervalSelectorState;
                            this.$hapticFeedback = hapticFeedback;
                            this.$onIntervalSelected = function1;
                            this.$showIntervalSelector$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r9v1 */
                        /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r9v7 */
                        public final void invoke(Composer composer, int i) {
                            long jM21372getBg20d7_KjU;
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(799878025, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelector.<anonymous>.<anonymous>.<anonymous> (IntervalSelector.kt:80)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer2, i2).m21372getBg20d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i2).m21595getXsmallD9Ej5fM(), 1, null);
                            IntervalSelectorState intervalSelectorState = this.$state;
                            final HapticFeedback hapticFeedback = this.$hapticFeedback;
                            final Function1<IntervalDto, Unit> function1 = this.$onIntervalSelected;
                            final SnapshotState<Boolean> snapshotState = this.$showIntervalSelector$delegate;
                            ?? r9 = 0;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
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
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ImmutableList<IntervalDto> intervals = intervalSelectorState != null ? intervalSelectorState.getIntervals() : null;
                            composer2.startReplaceGroup(504279157);
                            if (intervals != null) {
                                for (final IntervalDto intervalDto : intervals) {
                                    IntervalSelectorState intervalSelectorState2 = intervalSelectorState;
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(100));
                                    if (Intrinsics.areEqual(intervalDto, intervalSelectorState2.getCurrentInterval())) {
                                        composer2.startReplaceGroup(-1965946738);
                                        jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU();
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-1965840594);
                                        jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21372getBg20d7_KjU();
                                        composer2.endReplaceGroup();
                                    }
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5174width3ABfNKs, jM21372getBg20d7_KjU, null, 2, null);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i3 = BentoTheme.$stable;
                                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM4872backgroundbw27NRU$default, bentoTheme2.getSpacing(composer2, i3).m21593getSmallD9Ej5fM());
                                    composer2.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer2.changedInstance(hapticFeedback) | composer2.changed(function1) | composer2.changedInstance(intervalDto);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0172: CONSTRUCTOR (r11v6 'objRememberedValue' java.lang.Object) = 
                                              (r3v4 'hapticFeedback' androidx.compose.ui.hapticfeedback.HapticFeedback A[DONT_INLINE])
                                              (r4v2 'function1' kotlin.jvm.functions.Function1<black_widow.contracts.mobile_app_chart.proto.v1.IntervalDto, kotlin.Unit> A[DONT_INLINE])
                                              (r1v10 'intervalDto' black_widow.contracts.mobile_app_chart.proto.v1.IntervalDto A[DONT_INLINE])
                                              (r6v2 'snapshotState' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE])
                                             A[MD:(androidx.compose.ui.hapticfeedback.HapticFeedback, kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.IntervalDto, androidx.compose.runtime.MutableState):void (m)] (LINE:98) call: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2$1$$ExternalSyntheticLambda0.<init>(androidx.compose.ui.hapticfeedback.HapticFeedback, kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.IntervalDto, androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 37 more
                                            */
                                        /*
                                            Method dump skipped, instructions count: 599
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelector4.C106661.invoke(androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$4$lambda$3$lambda$1$lambda$0(HapticFeedback hapticFeedback, Function1 function1, IntervalDto intervalDto, SnapshotState snapshotState) {
                                        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
                                        function1.invoke(intervalDto);
                                        IntervalSelector3.IntervalSelector$lambda$2(snapshotState, false);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                    invoke(column5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 DropdownMenu, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
                                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1356780097, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelector.<anonymous>.<anonymous> (IntervalSelector.kt:79)");
                                    }
                                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(799878025, true, new C106661(intervalSelectorState, hapticFeedback, onIntervalSelected, snapshotState2), composer3, 54), composer3, 100663296, 255);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, 196656, 48, 2008);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return IntervalSelector3.IntervalSelector$lambda$8(intervalSelectorState, onIntervalSelected, onIntervalMenuOpen, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 3072;
                    modifier2 = modifier;
                    if ((i3 & 1171) == 1170) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(modifier4, (intervalSelectorState == null ? intervalSelectorState.getCurrentInterval() : null) != null, null, 2, null);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(hapticFeedback);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntervalSelector3.IntervalSelector$lambda$4$lambda$3(hapticFeedback, onIntervalMenuOpen, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierBentoPlaceholder$default2, false, null, null, (Function0) objRememberedValue2, 7, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i52 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(modifierM4893clickableXHw0xAI$default2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21368getAccent0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM())), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(10));
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                                FontWeight bold2 = FontWeight.INSTANCE.getBold();
                                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
                                if (intervalSelectorState != null) {
                                    String label2 = "XXX XXX";
                                    Modifier modifier52 = modifier4;
                                    BentoText2.m20747BentoText38GnDrw(label2, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM21371getBg0d7_KjU2), null, bold2, null, null, 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, 24576, 0, 8168);
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.DROPDOWN_12), null, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(companion32, bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), null, 2, null);
                                    boolean zIntervalSelector$lambda$12 = IntervalSelector$lambda$1(snapshotState);
                                    PopupProperties popupProperties2 = new PopupProperties(true, false, false, false, 6, (DefaultConstructorMarker) null);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 != companion.getEmpty()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    AndroidMenu_androidKt.m5699DropdownMenuIlH_yew(zIntervalSelector$lambda$12, (Function0) objRememberedValue3, modifierM4872backgroundbw27NRU$default2, 0L, null, popupProperties2, null, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(1356780097, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2

                                        /* compiled from: IntervalSelector.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2$1 */
                                        static final class C106661 implements Function2<Composer, Integer, Unit> {
                                            final /* synthetic */ HapticFeedback $hapticFeedback;
                                            final /* synthetic */ Function1<IntervalDto, Unit> $onIntervalSelected;
                                            final /* synthetic */ SnapshotState<Boolean> $showIntervalSelector$delegate;
                                            final /* synthetic */ IntervalSelectorState $state;

                                            /* JADX WARN: Multi-variable type inference failed */
                                            C106661(IntervalSelectorState intervalSelectorState, HapticFeedback hapticFeedback, Function1<? super IntervalDto, Unit> function1, SnapshotState<Boolean> snapshotState) {
                                                this.$state = intervalSelectorState;
                                                this.$hapticFeedback = hapticFeedback;
                                                this.$onIntervalSelected = function1;
                                                this.$showIntervalSelector$delegate = snapshotState;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                invoke(composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0172: CONSTRUCTOR (r11v6 'objRememberedValue' java.lang.Object) = 
                                                  (r3v4 'hapticFeedback' androidx.compose.ui.hapticfeedback.HapticFeedback A[DONT_INLINE])
                                                  (r4v2 'function1' kotlin.jvm.functions.Function1<black_widow.contracts.mobile_app_chart.proto.v1.IntervalDto, kotlin.Unit> A[DONT_INLINE])
                                                  (r1v10 'intervalDto' black_widow.contracts.mobile_app_chart.proto.v1.IntervalDto A[DONT_INLINE])
                                                  (r6v2 'snapshotState' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE])
                                                 A[MD:(androidx.compose.ui.hapticfeedback.HapticFeedback, kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.IntervalDto, androidx.compose.runtime.MutableState):void (m)] (LINE:98) call: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2$1$$ExternalSyntheticLambda0.<init>(androidx.compose.ui.hapticfeedback.HapticFeedback, kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.IntervalDto, androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$IntervalSelector$2$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 32 more
                                                */
                                            public final void invoke(androidx.compose.runtime.Composer r28, int r29) {
                                                /*
                                                    Method dump skipped, instructions count: 599
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelector4.C106661.invoke(androidx.compose.runtime.Composer, int):void");
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$4$lambda$3$lambda$1$lambda$0(HapticFeedback hapticFeedback, Function1 function1, IntervalDto intervalDto, SnapshotState snapshotState) {
                                                hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
                                                function1.invoke(intervalDto);
                                                IntervalSelector3.IntervalSelector$lambda$2(snapshotState, false);
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                            invoke(column5, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Column5 DropdownMenu, Composer composer3, int i6) {
                                            Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
                                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1356780097, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelector.<anonymous>.<anonymous> (IntervalSelector.kt:79)");
                                            }
                                            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(799878025, true, new C106661(intervalSelectorState, hapticFeedback, onIntervalSelected, snapshotState2), composer3, 54), composer3, 100663296, 255);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composer2, 196656, 48, 2008);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void IntervalSelector$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
                    snapshotState.setValue(Boolean.valueOf(z));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit IntervalSelector$lambda$4$lambda$3(HapticFeedback hapticFeedback, Function0 function0, SnapshotState snapshotState) {
                    hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                    IntervalSelector$lambda$2(snapshotState, !IntervalSelector$lambda$1(snapshotState));
                    function0.invoke();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit IntervalSelector$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
                    IntervalSelector$lambda$2(snapshotState, false);
                    return Unit.INSTANCE;
                }

                private static final boolean IntervalSelector$lambda$1(SnapshotState<Boolean> snapshotState) {
                    return snapshotState.getValue().booleanValue();
                }

                private static final void ScrollingIntervalSelectorPreview(Composer composer, final int i) {
                    Composer composerStartRestartGroup = composer.startRestartGroup(1623109424);
                    if (i != 0 || !composerStartRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1623109424, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelectorPreview (IntervalSelector.kt:119)");
                        }
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, IntervalSelector.INSTANCE.m1751xdef32194(), composerStartRestartGroup, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelectorKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntervalSelector3.ScrollingIntervalSelectorPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
            }
