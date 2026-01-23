package com.robinhood.android.chart.blackwidowadvancedchart.composables.templates;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.p011ui.window.PopupProperties;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.Helpers3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRow;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEvents;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: TemplateRow.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"INDICATOR_SETS_BOTTOM_SHEET_SET_OPTIONS", "", "INDICATOR_SETS_BOTTOM_SHEET_DELETE_SET_ALERT", "INDICATOR_SETS_BOTTOM_SHEET_DELETE_SET", "INDICATOR_SETS_BOTTOM_SHEET_RENAME_SET", "INDICATOR_SETS_BOTTOM_SHEET_SET_ROW", "TemplateRow", "", "template", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "selected", "", "onDeleteTemplate", "Lkotlin/Function1;", "onRenameTemplate", "onSelectTemplate", "togglePopupScrim", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-black-widow-advanced-chart_externalDebug", "showDeleteTemplateAlert", "showTemplatePopup"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TemplateRow {
    public static final String INDICATOR_SETS_BOTTOM_SHEET_DELETE_SET = "IndicatorSetsBottomSheetDeleteSet";
    public static final String INDICATOR_SETS_BOTTOM_SHEET_DELETE_SET_ALERT = "IndicatorSetsBottomSheetDeleteSetAlert";
    public static final String INDICATOR_SETS_BOTTOM_SHEET_RENAME_SET = "IndicatorSetsBottomSheetRenameSet";
    public static final String INDICATOR_SETS_BOTTOM_SHEET_SET_OPTIONS = "IndicatorSetsBottomSheetSetOptions";
    public static final String INDICATOR_SETS_BOTTOM_SHEET_SET_ROW = "IndicatorSetsBottomSheetSetRow";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TemplateRow$lambda$8(TemplateDto templateDto, boolean z, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TemplateRow(templateDto, z, function1, function12, function13, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TemplateRow(TemplateDto template, final boolean z, final Function1<? super TemplateDto, Unit> onDeleteTemplate, final Function1<? super TemplateDto, Unit> onRenameTemplate, Function1<? super TemplateDto, Unit> onSelectTemplate, final Function0<Unit> togglePopupScrim, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        long jM21426getFg20d7_KjU;
        long jM6705copywmQWz5c$default;
        final TemplateDto templateDto;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Function1<? super TemplateDto, Unit> function1;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(onDeleteTemplate, "onDeleteTemplate");
        Intrinsics.checkNotNullParameter(onRenameTemplate, "onRenameTemplate");
        Intrinsics.checkNotNullParameter(onSelectTemplate, "onSelectTemplate");
        Intrinsics.checkNotNullParameter(togglePopupScrim, "togglePopupScrim");
        Composer composerStartRestartGroup = composer.startRestartGroup(-96945935);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(template) ? 4 : 2) | i;
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
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeleteTemplate) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRenameTemplate) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelectTemplate) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(togglePopupScrim) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i3;
            if ((599187 & i4) == 599186 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-96945935, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRow (TemplateRow.kt:56)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(-1897536171);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1897470668);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierClip = Clip.clip(BorderKt.m4876borderxT4_qwU(modifierM5146paddingqDBjuR0$default, fM7995constructorimpl, jM21426getFg20d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM())), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()));
                composerStartRestartGroup.startReplaceGroup(1324272554);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(1324274195);
                    jM6705copywmQWz5c$default = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1324275542);
                    boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i6).getIsDay();
                    composerStartRestartGroup.endReplaceGroup();
                    if (isDay) {
                        composerStartRestartGroup.startReplaceGroup(1324276404);
                        jM6705copywmQWz5c$default = bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1324278178);
                        jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                long j = jM6705copywmQWz5c$default;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierClip, j, null, 2, null);
                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, template.getName(), z, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(Helpers3.toSubtitle(template.getIndicators(), composerStartRestartGroup, 0)), false, false, (BentoSelectionRowState.IconPosition) new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(634338613, true, new C109031(template, current, userInteractionEventDescriptor, togglePopupScrim, onDeleteTemplate, snapshotState2, snapshotState, view, onRenameTemplate), composerStartRestartGroup, 54)), false, false, (ImmutableMap) null, (Function0) null, 1936, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                templateDto = template;
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(templateDto) | ((i4 & 57344) != 16384);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    function1 = onSelectTemplate;
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TemplateRow.TemplateRow$lambda$7$lambda$6(current, userInteractionEventDescriptor, templateDto, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    function1 = onSelectTemplate;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(modifierM4872backgroundbw27NRU$default, bentoSelectionRowState, (Function0) objRememberedValue3, composerStartRestartGroup, BentoSelectionRowState.$stable << 3, 0);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
                function1 = onSelectTemplate;
                templateDto = template;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final TemplateDto templateDto2 = templateDto;
                final Function1<? super TemplateDto, Unit> function12 = function1;
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TemplateRow.TemplateRow$lambda$8(templateDto2, z, onDeleteTemplate, onRenameTemplate, function12, togglePopupScrim, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        i4 = i3;
        if ((599187 & i4) == 599186) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            if (!z) {
            }
            Modifier modifierClip2 = Clip.clip(BorderKt.m4876borderxT4_qwU(modifierM5146paddingqDBjuR0$default2, fM7995constructorimpl2, jM21426getFg20d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM())), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()));
            composerStartRestartGroup.startReplaceGroup(1324272554);
            if (z) {
            }
            long j2 = jM6705copywmQWz5c$default;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierClip2, j2, null, 2, null);
            BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, template.getName(), z, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(Helpers3.toSubtitle(template.getIndicators(), composerStartRestartGroup, 0)), false, false, (BentoSelectionRowState.IconPosition) new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(634338613, true, new C109031(template, current, userInteractionEventDescriptor, togglePopupScrim, onDeleteTemplate, snapshotState22, snapshotState3, view2, onRenameTemplate), composerStartRestartGroup, 54)), false, false, (ImmutableMap) null, (Function0) null, 1936, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            templateDto = template;
            zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(templateDto) | ((i4 & 57344) != 16384);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                function1 = onSelectTemplate;
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TemplateRow.TemplateRow$lambda$7$lambda$6(current, userInteractionEventDescriptor, templateDto, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(modifierM4872backgroundbw27NRU$default2, bentoSelectionRowState2, (Function0) objRememberedValue3, composerStartRestartGroup, BentoSelectionRowState.$stable << 3, 0);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TemplateRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TemplateRow$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TemplateRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TemplateRow$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: TemplateRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$TemplateRow$1 */
    static final class C109031 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function1<TemplateDto, Unit> $onDeleteTemplate;
        final /* synthetic */ Function1<TemplateDto, Unit> $onRenameTemplate;
        final /* synthetic */ SnapshotState<Boolean> $showDeleteTemplateAlert$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showTemplatePopup$delegate;
        final /* synthetic */ TemplateDto $template;
        final /* synthetic */ Function0<Unit> $togglePopupScrim;
        final /* synthetic */ View $view;

        /* JADX WARN: Multi-variable type inference failed */
        C109031(TemplateDto templateDto, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0<Unit> function0, Function1<? super TemplateDto, Unit> function1, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, View view, Function1<? super TemplateDto, Unit> function12) {
            this.$template = templateDto;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$togglePopupScrim = function0;
            this.$onDeleteTemplate = function1;
            this.$showTemplatePopup$delegate = snapshotState;
            this.$showDeleteTemplateAlert$delegate = snapshotState2;
            this.$view = view;
            this.$onRenameTemplate = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, TemplateDto templateDto, Function0 function0, SnapshotState snapshotState) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.MENU_ITEM, TemplateRow.INDICATOR_SETS_BOTTOM_SHEET_SET_OPTIONS, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, templateDto.getId(), null, null, 0.0d, null, null, 32255, null).getContext(), false, 41, null);
            function0.invoke();
            TemplateRow.TemplateRow$lambda$5(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, TemplateDto templateDto, Function1 function1, Function0 function0, SnapshotState snapshotState) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CONTINUE_BUTTON, TemplateRow.INDICATOR_SETS_BOTTOM_SHEET_DELETE_SET_ALERT, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, templateDto.getId(), null, null, 0.0d, null, null, 32255, null).getContext(), false, 41, null);
            function1.invoke(templateDto);
            function0.invoke();
            TemplateRow.TemplateRow$lambda$2(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, TemplateDto templateDto, Function0 function0, SnapshotState snapshotState) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CANCEL_BUTTON, TemplateRow.INDICATOR_SETS_BOTTOM_SHEET_DELETE_SET_ALERT, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, templateDto.getId(), null, null, 0.0d, null, null, 32255, null).getContext(), false, 41, null);
            TemplateRow.TemplateRow$lambda$2(snapshotState, false);
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(Function0 function0, SnapshotState snapshotState) {
            function0.invoke();
            TemplateRow.TemplateRow$lambda$5(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* compiled from: TemplateRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$TemplateRow$1$5, reason: invalid class name */
        static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
            final /* synthetic */ EventLogger $eventLogger;
            final /* synthetic */ Function1<TemplateDto, Unit> $onRenameTemplate;
            final /* synthetic */ SnapshotState<Boolean> $showDeleteTemplateAlert$delegate;
            final /* synthetic */ SnapshotState<Boolean> $showTemplatePopup$delegate;
            final /* synthetic */ TemplateDto $template;
            final /* synthetic */ View $view;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, TemplateDto templateDto, View view, Function1<? super TemplateDto, Unit> function1, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
                this.$eventLogger = eventLogger;
                this.$eventDescriptor = userInteractionEventDescriptor;
                this.$template = templateDto;
                this.$view = view;
                this.$onRenameTemplate = function1;
                this.$showTemplatePopup$delegate = snapshotState;
                this.$showDeleteTemplateAlert$delegate = snapshotState2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(700737815, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRow.<anonymous>.<anonymous> (TemplateRow.kt:172)");
                }
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$template) | composer.changedInstance(this.$view);
                final EventLogger eventLogger = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                final TemplateDto templateDto = this.$template;
                final View view = this.$view;
                final SnapshotState<Boolean> snapshotState = this.$showTemplatePopup$delegate;
                final SnapshotState<Boolean> snapshotState2 = this.$showDeleteTemplateAlert$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$TemplateRow$1$5$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TemplateRow.C109031.AnonymousClass5.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, templateDto, view, snapshotState, snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$template) | composer.changed(this.$onRenameTemplate);
                final EventLogger eventLogger2 = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                final TemplateDto templateDto2 = this.$template;
                final Function1<TemplateDto, Unit> function1 = this.$onRenameTemplate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$TemplateRow$1$5$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TemplateRow.C109031.AnonymousClass5.invoke$lambda$3$lambda$2(eventLogger2, userInteractionEventDescriptor2, templateDto2, function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                TemplateEditPopup3.TemplateEditPopup(function0, (Function0) objRememberedValue2, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, TemplateDto templateDto, View view, SnapshotState snapshotState, SnapshotState snapshotState2) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.MENU_ITEM, TemplateRow.INDICATOR_SETS_BOTTOM_SHEET_DELETE_SET, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, templateDto.getId(), null, null, 0.0d, null, null, 32255, null).getContext(), false, 41, null);
                HapticEvents.onRejectHapticEvent(view);
                TemplateRow.TemplateRow$lambda$5(snapshotState, false);
                TemplateRow.TemplateRow$lambda$2(snapshotState2, true);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, TemplateDto templateDto, Function1 function1) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.MENU_ITEM, TemplateRow.INDICATOR_SETS_BOTTOM_SHEET_RENAME_SET, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, templateDto.getId(), null, null, 0.0d, null, null, 32255, null).getContext(), false, 41, null);
                function1.invoke(templateDto);
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634338613, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRow.<anonymous> (TemplateRow.kt:93)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, this.$template.getName() + "_edit");
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.DOTS_24);
            long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$template) | composer.changed(this.$togglePopupScrim);
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final TemplateDto templateDto = this.$template;
            final Function0<Unit> function0 = this.$togglePopupScrim;
            final SnapshotState<Boolean> snapshotState = this.$showTemplatePopup$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$TemplateRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TemplateRow.C109031.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, templateDto, function0, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, modifierTestTag, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
            if (TemplateRow.TemplateRow$lambda$1(this.$showDeleteTemplateAlert$delegate)) {
                composer.startReplaceGroup(-273207888);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, Logging4.updateEventDescriptor$default(this.$eventDescriptor, new Component(Component.ComponentType.ALERT, TemplateRow.INDICATOR_SETS_BOTTOM_SHEET_DELETE_SET_ALERT, null, 4, null), null, null, null, null, null, 0.0d, false, null, this.$template.getId(), null, null, 0.0d, null, null, 32254, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                String name = this.$template.getName();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$template) | composer.changed(this.$togglePopupScrim);
                final EventLogger eventLogger2 = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                final TemplateDto templateDto2 = this.$template;
                final Function0<Unit> function02 = this.$togglePopupScrim;
                final SnapshotState<Boolean> snapshotState2 = this.$showDeleteTemplateAlert$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$TemplateRow$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TemplateRow.C109031.invoke$lambda$3$lambda$2(eventLogger2, userInteractionEventDescriptor2, templateDto2, function02, snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function03 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance3 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$template) | composer.changed(this.$onDeleteTemplate) | composer.changed(this.$togglePopupScrim);
                final EventLogger eventLogger3 = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor3 = this.$eventDescriptor;
                final TemplateDto templateDto3 = this.$template;
                final Function1<TemplateDto, Unit> function1 = this.$onDeleteTemplate;
                final Function0<Unit> function04 = this.$togglePopupScrim;
                final SnapshotState<Boolean> snapshotState3 = this.$showDeleteTemplateAlert$delegate;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$TemplateRow$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TemplateRow.C109031.invoke$lambda$5$lambda$4(eventLogger3, userInteractionEventDescriptor3, templateDto3, function1, function04, snapshotState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                TemplateAlert.DeleteTemplateAlert(name, function03, (Function0) objRememberedValue3, modifierAutoLogEvents$default, composer, 0, 0);
                composer.endReplaceGroup();
            } else if (TemplateRow.TemplateRow$lambda$4(this.$showTemplatePopup$delegate)) {
                composer.startReplaceGroup(-270533394);
                long jM8033constructorimpl = IntOffset.m8033constructorimpl(((-((int) ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(150)))) << 32) | (0 & 4294967295L));
                PopupProperties popupProperties = new PopupProperties(false, false, false, false, 7, (DefaultConstructorMarker) null);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(this.$togglePopupScrim);
                final Function0<Unit> function05 = this.$togglePopupScrim;
                final SnapshotState<Boolean> snapshotState4 = this.$showTemplatePopup$delegate;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.TemplateRowKt$TemplateRow$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TemplateRow.C109031.invoke$lambda$8$lambda$7(function05, snapshotState4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                AndroidPopup_androidKt.m8111PopupK5zGePQ(null, jM8033constructorimpl, (Function0) objRememberedValue4, popupProperties, ComposableLambda3.rememberComposableLambda(700737815, true, new AnonymousClass5(this.$eventLogger, this.$eventDescriptor, this.$template, this.$view, this.$onRenameTemplate, this.$showTemplatePopup$delegate, this.$showDeleteTemplateAlert$delegate), composer, 54), composer, 27648, 1);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-268083123);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TemplateRow$lambda$7$lambda$6(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, TemplateDto templateDto, Function1 function1) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.LIST_ROW, INDICATOR_SETS_BOTTOM_SHEET_SET_ROW, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, null, templateDto.getId(), null, null, 0.0d, null, null, 32255, null).getContext(), false, 41, null);
        function1.invoke(templateDto);
        return Unit.INSTANCE;
    }
}
