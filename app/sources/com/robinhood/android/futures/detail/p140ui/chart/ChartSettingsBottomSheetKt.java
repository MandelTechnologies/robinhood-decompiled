package com.robinhood.android.futures.detail.p140ui.chart;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.p140ui.chart.ChartSettingsBottomSheetKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.store.futures.ChartType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: ChartSettingsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001ae\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"ChartSettingsBottomSheet", "", "currentChartType", "Lcom/robinhood/store/futures/ChartType;", "showContinuousChartToggle", "", "isContinuousChart", "onChartTypeSelected", "Lkotlin/Function1;", "onContinuousChartSelected", "onDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/store/futures/ChartType;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ChartSettingsBottomSheetContent", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/store/futures/ChartType;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChartSettingsBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSettingsBottomSheet$lambda$0(ChartType chartType, boolean z, boolean z2, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        ChartSettingsBottomSheet(chartType, z, z2, function1, function12, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSettingsBottomSheetContent$lambda$6(ChartType chartType, Function1 function1, boolean z, boolean z2, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChartSettingsBottomSheetContent(chartType, function1, z, z2, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ChartSettingsBottomSheet(final ChartType currentChartType, final boolean z, final boolean z2, final Function1<? super ChartType, Unit> onChartTypeSelected, final Function1<? super Boolean, Unit> onContinuousChartSelected, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(currentChartType, "currentChartType");
        Intrinsics.checkNotNullParameter(onChartTypeSelected, "onChartTypeSelected");
        Intrinsics.checkNotNullParameter(onContinuousChartSelected, "onContinuousChartSelected");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(32808549);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(currentChartType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onChartTypeSelected) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinuousChartSelected) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(32808549, i3, -1, "com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheet (ChartSettingsBottomSheet.kt:33)");
            }
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1192126932, true, new C170821(currentChartType, onChartTypeSelected, z, z2, onContinuousChartSelected, onDismiss), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartSettingsBottomSheetKt.ChartSettingsBottomSheet$lambda$0(currentChartType, z, z2, onChartTypeSelected, onContinuousChartSelected, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ChartSettingsBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetKt$ChartSettingsBottomSheet$1 */
    static final class C170821 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ ChartType $currentChartType;
        final /* synthetic */ boolean $isContinuousChart;
        final /* synthetic */ Function1<ChartType, Unit> $onChartTypeSelected;
        final /* synthetic */ Function1<Boolean, Unit> $onContinuousChartSelected;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ boolean $showContinuousChartToggle;

        /* JADX WARN: Multi-variable type inference failed */
        C170821(ChartType chartType, Function1<? super ChartType, Unit> function1, boolean z, boolean z2, Function1<? super Boolean, Unit> function12, Function0<Unit> function0) {
            this.$currentChartType = chartType;
            this.$onChartTypeSelected = function1;
            this.$showContinuousChartToggle = z;
            this.$isContinuousChart = z2;
            this.$onContinuousChartSelected = function12;
            this.$onDismiss = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1192126932, i2, -1, "com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheet.<anonymous> (ChartSettingsBottomSheet.kt:37)");
            }
            ChartType chartType = this.$currentChartType;
            int i3 = i2;
            Function1<ChartType, Unit> function1 = this.$onChartTypeSelected;
            boolean z = this.$showContinuousChartToggle;
            boolean z2 = this.$isContinuousChart;
            Function1<Boolean, Unit> function12 = this.$onContinuousChartSelected;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = ((i3 & 14) == 4 || ((i3 & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) | composer.changed(this.$onDismiss);
            final Function0<Unit> function0 = this.$onDismiss;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetKt$ChartSettingsBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartSettingsBottomSheetKt.C170821.invoke$lambda$1$lambda$0(RhModalBottomSheet, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ChartSettingsBottomSheetKt.ChartSettingsBottomSheetContent(chartType, function1, z, z2, function12, (Function0) objRememberedValue, null, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0) {
            rhModalBottomSheet5.hideBottomSheet(function0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartSettingsBottomSheetContent(final ChartType currentChartType, final Function1<? super ChartType, Unit> onChartTypeSelected, final boolean z, final boolean z2, final Function1<? super Boolean, Unit> onContinuousChartSelected, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z4;
        Object objRememberedValue;
        boolean z5;
        Object objRememberedValue2;
        Modifier.Companion companion;
        int i5;
        BentoTheme bentoTheme;
        int i6;
        Composer composer2;
        int i7;
        int i8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currentChartType, "currentChartType");
        Intrinsics.checkNotNullParameter(onChartTypeSelected, "onChartTypeSelected");
        Intrinsics.checkNotNullParameter(onContinuousChartSelected, "onContinuousChartSelected");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1404504333);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currentChartType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChartTypeSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onContinuousChartSelected) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1404504333, i3, -1, "com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetContent (ChartSettingsBottomSheet.kt:57)");
                    }
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    Modifier modifier5 = modifier4;
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_settings_title, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    TextStyle displayCapsuleSmall = bentoTheme2.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleSmall();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion4, companion2.getCenterHorizontally()), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8188);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_view_title, composerStartRestartGroup, 0), PaddingKt.m5145paddingqDBjuR0(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21595getXsmallD9Ej5fM()), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
                    String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_view_line, composerStartRestartGroup, 0);
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, strStringResource2, currentChartType != ChartType.LINE, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2008, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i10 = i3 & 112;
                    z4 = i10 != 32;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartSettingsBottomSheetKt.ChartSettingsBottomSheetContent$lambda$5$lambda$2$lambda$1(onChartTypeSelected);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i11 = BentoSelectionRowState.$stable;
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composerStartRestartGroup, i11 << 3, 1);
                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_view_candlestick, composerStartRestartGroup, 0), currentChartType != ChartType.CANDLESTICK, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2008, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z5 = i10 != 32;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartSettingsBottomSheetKt.ChartSettingsBottomSheetContent$lambda$5$lambda$4$lambda$3(onChartTypeSelected);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState2, (Function0) objRememberedValue2, composerStartRestartGroup, i11 << 3, 1);
                    composerStartRestartGroup.startReplaceGroup(-602350829);
                    if (z) {
                        companion = companion4;
                        i5 = i3;
                        bentoTheme = bentoTheme2;
                        i6 = i9;
                        composer2 = composerStartRestartGroup;
                        i7 = 0;
                        i8 = 1;
                    } else {
                        i6 = i9;
                        bentoTheme = bentoTheme2;
                        i7 = 0;
                        companion = companion4;
                        i5 = i3;
                        composer2 = composerStartRestartGroup;
                        i8 = 1;
                        BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_view_continuous, composerStartRestartGroup, 0), null, false, z3, null, null, false, false, false, 493, null), onContinuousChartSelected, null, composer2, BentoToggleRowState.$stable | ((i3 >> 9) & 112), 4);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onDismiss, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, i7), PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, i8, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer3, (i5 >> 15) & 14, 0, 8184);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChartSettingsBottomSheetKt.ChartSettingsBottomSheetContent$lambda$6(currentChartType, onChartTypeSelected, z, z2, onContinuousChartSelected, onDismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i3) != 599186) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Modifier modifier52 = modifier4;
                Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String strStringResource3 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_settings_title, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i92 = BentoTheme.$stable;
                    TextStyle displayCapsuleSmall2 = bentoTheme22.getTypography(composerStartRestartGroup, i92).getDisplayCapsuleSmall();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource3, PaddingKt.m5146paddingqDBjuR0$default(column62.align(companion42, companion22.getCenterHorizontally()), 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8188);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_view_title, composerStartRestartGroup, 0), PaddingKt.m5145paddingqDBjuR0(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21595getXsmallD9Ej5fM()), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composerStartRestartGroup, i92).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
                    String strStringResource22 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_view_line, composerStartRestartGroup, 0);
                    BentoSelectionRowState.Type type22 = BentoSelectionRowState.Type.RadioButton;
                    BentoSelectionRowState bentoSelectionRowState3 = new BentoSelectionRowState(type22, strStringResource22, currentChartType != ChartType.LINE, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2008, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i102 = i3 & 112;
                    if (i102 != 32) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartSettingsBottomSheetKt.ChartSettingsBottomSheetContent$lambda$5$lambda$2$lambda$1(onChartTypeSelected);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        int i112 = BentoSelectionRowState.$stable;
                        BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState3, (Function0) objRememberedValue, composerStartRestartGroup, i112 << 3, 1);
                        BentoSelectionRowState bentoSelectionRowState22 = new BentoSelectionRowState(type22, StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_view_candlestick, composerStartRestartGroup, 0), currentChartType != ChartType.CANDLESTICK, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2008, (DefaultConstructorMarker) null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (i102 != 32) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z5) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.chart.ChartSettingsBottomSheetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChartSettingsBottomSheetKt.ChartSettingsBottomSheetContent$lambda$5$lambda$4$lambda$3(onChartTypeSelected);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState22, (Function0) objRememberedValue2, composerStartRestartGroup, i112 << 3, 1);
                            composerStartRestartGroup.startReplaceGroup(-602350829);
                            if (z) {
                            }
                            composer2.endReplaceGroup();
                            Composer composer32 = composer2;
                            BentoButtonKt.m20586BentoButtonEikTQX8(onDismiss, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, i7), PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, i8, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer32, (i5 >> 15) & 14, 0, 8184);
                            composerStartRestartGroup = composer32;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z2;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSettingsBottomSheetContent$lambda$5$lambda$2$lambda$1(Function1 function1) {
        function1.invoke(ChartType.LINE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSettingsBottomSheetContent$lambda$5$lambda$4$lambda$3(Function1 function1) {
        function1.invoke(ChartType.CANDLESTICK);
        return Unit.INSTANCE;
    }
}
