package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorValidationInfoDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineColorDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.IndicatorQuickAccessState;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.Helpers3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: IndicatorQuickAccessRow.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aZ\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u00142\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0006H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\"\"\u0014\u0010&\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\"¨\u0006,²\u0006\f\u0010(\u001a\u00020'8\nX\u008a\u0084\u0002²\u0006\u000e\u0010)\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/IndicatorQuickAccessState;", "state", "Lkotlin/Function0;", "", "onAddIndicators", "Lkotlin/Function1;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "onIndicatorClicked", "onIndicatorSettingsClicked", "onTemplateClicked", "onSaveAsSetClicked", "Landroidx/compose/ui/Modifier;", "modifier", "IndicatorQuickAccessRow", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/IndicatorQuickAccessState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "borderColor", "backgroundColor", "onPillClicked", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "pillContent", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "IndicatorPill-1Kfb2uI", "(JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "IndicatorPill", "BwIndicatorQuickAccessRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "", "isVisible", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;)Z", "", "INDICATORS_ROW", "Ljava/lang/String;", "INDICATORS_ROW_SETTINGS", "INDICATORS_ROW_ADD", "INDICATORS_ROW_SAVE_AS_SET", "INDICATORS_ROW_SET", "", "radius", "showMaxIndicatorAlert", "Lkotlinx/collections/immutable/PersistentList;", "indicators", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class IndicatorQuickAccessRowKt {
    public static final String INDICATORS_ROW = "IndicatorsRow";
    public static final String INDICATORS_ROW_ADD = "IndicatorsRowAdd";
    public static final String INDICATORS_ROW_SAVE_AS_SET = "IndicatorsRowSaveAsSet";
    public static final String INDICATORS_ROW_SET = "IndicatorsRowSet";
    public static final String INDICATORS_ROW_SETTINGS = "IndicatorsRowSettings";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BwIndicatorQuickAccessRowPreview$lambda$22(int i, Composer composer, int i2) {
        BwIndicatorQuickAccessRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorPill_1Kfb2uI$lambda$18(long j, long j2, Function0 function0, Function3 function3, Modifier modifier, InteractionSource3 interactionSource3, int i, int i2, Composer composer, int i3) {
        m11905IndicatorPill1Kfb2uI(j, j2, function0, function3, modifier, interactionSource3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorQuickAccessRow$lambda$15(IndicatorQuickAccessState indicatorQuickAccessState, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IndicatorQuickAccessRow(indicatorQuickAccessState, function0, function1, function12, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList3<IndicatorStateDto> BwIndicatorQuickAccessRowPreview$lambda$20(SnapshotState<ImmutableList3<IndicatorStateDto>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IndicatorQuickAccessRow$lambda$14$lambda$13$lambda$12$lambda$11$lambda$8 */
    public static final float m1785x83945dd(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    public static final void IndicatorQuickAccessRow(final IndicatorQuickAccessState state, final Function0<Unit> onAddIndicators, final Function1<? super IndicatorStateDto, Unit> onIndicatorClicked, final Function1<? super IndicatorStateDto, Unit> onIndicatorSettingsClicked, final Function0<Unit> onTemplateClicked, final Function0<Unit> onSaveAsSetClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAddIndicators, "onAddIndicators");
        Intrinsics.checkNotNullParameter(onIndicatorClicked, "onIndicatorClicked");
        Intrinsics.checkNotNullParameter(onIndicatorSettingsClicked, "onIndicatorSettingsClicked");
        Intrinsics.checkNotNullParameter(onTemplateClicked, "onTemplateClicked");
        Intrinsics.checkNotNullParameter(onSaveAsSetClicked, "onSaveAsSetClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1102252459);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddIndicators) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIndicatorClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIndicatorSettingsClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTemplateClicked) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSaveAsSetClicked) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
        }
        if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1102252459, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow (IndicatorQuickAccessRow.kt:85)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM4872backgroundbw27NRU$default, null, null, false, null, null, (Function0) objRememberedValue, 28, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(6));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(hapticFeedback) | ((57344 & i3) == 16384) | composerStartRestartGroup.changed(density) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 458752) == 131072);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IndicatorQuickAccessRowKt.IndicatorQuickAccessRow$lambda$14$lambda$13$lambda$12(state, current, userInteractionEventDescriptor, hapticFeedback, onTemplateClicked, density, onIndicatorSettingsClicked, onIndicatorClicked, onAddIndicators, onSaveAsSetClicked, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue2 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier4 = modifier2;
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyRow(modifierM5142padding3ABfNKs, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, null, false, null, (Function1) objRememberedValue2, composer2, 196614, 462);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IndicatorQuickAccessRowKt.IndicatorQuickAccessRow$lambda$15(state, onAddIndicators, onIndicatorClicked, onIndicatorSettingsClicked, onTemplateClicked, onSaveAsSetClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorQuickAccessRow$lambda$14$lambda$13$lambda$12(IndicatorQuickAccessState indicatorQuickAccessState, final EventLogger eventLogger, final UserInteractionEventDescriptor userInteractionEventDescriptor, final HapticFeedback hapticFeedback, Function0 function0, final Density density, final Function1 function1, final Function1 function12, Function0 function02, Function0 function03, LazyListScope LazyRow) {
        LazyListScope lazyListScope;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        ComposableSingletons$IndicatorQuickAccessRowKt composableSingletons$IndicatorQuickAccessRowKt = ComposableSingletons$IndicatorQuickAccessRowKt.INSTANCE;
        LazyListScope.item$default(LazyRow, null, null, composableSingletons$IndicatorQuickAccessRowKt.m1783x416b0216(), 3, null);
        if (indicatorQuickAccessState.getAvailableTemplates() == null || !(!r0.isEmpty())) {
            lazyListScope = LazyRow;
        } else {
            lazyListScope = LazyRow;
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1426288721, true, new IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$1(eventLogger, userInteractionEventDescriptor, hapticFeedback, function0, indicatorQuickAccessState)), 3, null);
        }
        final ImmutableList<IndicatorStateDto> selectedIndicators = indicatorQuickAccessState.getSelectedIndicators();
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IndicatorQuickAccessRowKt.IndicatorQuickAccessRow$lambda$14$lambda$13$lambda$12$lambda$2(((Integer) obj).intValue(), (IndicatorStateDto) obj2);
            }
        };
        lazyListScope.items(selectedIndicators.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$lambda$14$lambda$13$lambda$12$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), selectedIndicators.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$lambda$14$lambda$13$lambda$12$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                selectedIndicators.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$lambda$14$lambda$13$lambda$12$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Object next;
                long jM21426getFg20d7_KjU;
                long j;
                long jM6725getTransparent0d7_KjU;
                Object next2;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final IndicatorStateDto indicatorStateDto = (IndicatorStateDto) selectedIndicators.get(i);
                composer.startReplaceGroup(1728665044);
                Object validation_info = indicatorStateDto.getValidation_info();
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(validation_info);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Iterator<T> it = indicatorStateDto.getValidation_info().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        IndicatorValidationInfoDto indicatorValidationInfoDto = (IndicatorValidationInfoDto) next;
                        if (indicatorValidationInfoDto.getPrevents_calculation() && indicatorValidationInfoDto.getMessage() != null) {
                            break;
                        }
                    }
                    objRememberedValue = (IndicatorValidationInfoDto) next;
                    composer.updateRememberedValue(objRememberedValue);
                }
                final IndicatorValidationInfoDto indicatorValidationInfoDto2 = (IndicatorValidationInfoDto) objRememberedValue;
                composer.endReplaceGroup();
                if (indicatorValidationInfoDto2 == null) {
                    composer.startReplaceGroup(1728745023);
                    List<IndicatorLineDto> lines = indicatorStateDto.getLines();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = lines.iterator();
                    while (it2.hasNext()) {
                        CollectionsKt.addAll(arrayList, ((IndicatorLineDto) it2.next()).getColors());
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it3.next();
                            if (((LineColorDto) next2).getColor() != null) {
                                break;
                            }
                        }
                    }
                    LineColorDto lineColorDto = (LineColorDto) next2;
                    ThemedColorDto color = lineColorDto != null ? lineColorDto.getColor() : null;
                    composer.startReplaceGroup(-1468250821);
                    Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer, 0);
                    composer.endReplaceGroup();
                    jM21426getFg20d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1728929690);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
                    composer.endReplaceGroup();
                }
                final long j2 = jM21426getFg20d7_KjU;
                boolean zIsVisible = indicatorValidationInfoDto2 == null ? IndicatorQuickAccessRowKt.isVisible(indicatorStateDto) : false;
                composer.startReplaceGroup(-1468240143);
                Density density2 = density;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                final float fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM() + bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()));
                composer.endReplaceGroup();
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(zIsVisible ? 500.0f : 0.0f, AnimationSpecKt.tween$default(350, 0, null, 6, null), 0.0f, null, null, composer, 48, 28);
                Modifier modifierClip = Clip.clip(Modifier.INSTANCE, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(20)));
                composer.startReplaceGroup(-1746271574);
                boolean zChanged2 = composer.changed(snapshotState4AnimateFloatAsState) | composer.changed(j2) | composer.changed(fMo5016toPx0680j_4);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<ContentDrawScope, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$3$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                            invoke2(contentDrawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ContentDrawScope drawWithContent) {
                            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                            if (IndicatorQuickAccessRowKt.m1785x83945dd(snapshotState4AnimateFloatAsState) != 1000.0f) {
                                long j3 = j2;
                                float f = fMo5016toPx0680j_4;
                                SnapshotState4<Float> snapshotState4 = snapshotState4AnimateFloatAsState;
                                drawWithContent.getDrawContext().getCanvas();
                                long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j3, 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                                float fM1785x83945dd = IndicatorQuickAccessRowKt.m1785x83945dd(snapshotState4);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.mo6963getSizeNHjbRc() & 4294967295L)) / 2;
                                DrawScope.m6947drawCircleVaOC9Bg$default(drawWithContent, jM6705copywmQWz5c$default, fM1785x83945dd, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)), 0.0f, null, null, BlendMode.INSTANCE.m6670getSrcOver0nO6VwU(), 56, null);
                            }
                            drawWithContent.drawContent();
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifierClip, (Function1) objRememberedValue2);
                composer.startReplaceGroup(-1468208061);
                long jM21373getBg30d7_KjU = zIsVisible ? j2 : bentoTheme.getColors(composer, i4).m21373getBg30d7_KjU();
                composer.endReplaceGroup();
                if (IndicatorQuickAccessRowKt.m1785x83945dd(snapshotState4AnimateFloatAsState) == 1000.0f) {
                    jM6725getTransparent0d7_KjU = Color.m6705copywmQWz5c$default(j2, 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    j = j2;
                } else {
                    j = j2;
                    jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                }
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(indicatorValidationInfoDto2) | composer.changedInstance(hapticFeedback) | composer.changed(function1) | composer.changedInstance(indicatorStateDto) | composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor) | composer.changed(function12);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final HapticFeedback hapticFeedback2 = hapticFeedback;
                    final Function1 function13 = function1;
                    final EventLogger eventLogger2 = eventLogger;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    final Function1 function14 = function12;
                    objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$3$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (indicatorValidationInfoDto2 != null) {
                                hapticFeedback2.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                                function13.invoke(indicatorStateDto);
                            } else {
                                EventLogger.DefaultImpls.logTap$default(eventLogger2, null, userInteractionEventDescriptor2.getScreen(), new Component(Component.ComponentType.PILL, IndicatorQuickAccessRowKt.INDICATORS_ROW, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor2, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, null, null, 0.0d, null, null, 32511, null).getContext(), false, 41, null);
                                hapticFeedback2.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                                function14.invoke(indicatorStateDto);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                final EventLogger eventLogger3 = eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor;
                final HapticFeedback hapticFeedback3 = hapticFeedback;
                final Function1 function15 = function1;
                final long j3 = j;
                final boolean z = zIsVisible;
                IndicatorQuickAccessRowKt.m11905IndicatorPill1Kfb2uI(jM21373getBg30d7_KjU, jM6725getTransparent0d7_KjU, (Function0) objRememberedValue3, ComposableLambda3.rememberComposableLambda(-1897817767, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$3$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 IndicatorPill, Composer composer2, int i5) {
                        int i6;
                        Composer composer3 = composer2;
                        Intrinsics.checkNotNullParameter(IndicatorPill, "$this$IndicatorPill");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer3.changed(IndicatorPill) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1897817767, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorQuickAccessRow.kt:217)");
                        }
                        composer3.startReplaceGroup(1558228101);
                        if (indicatorValidationInfoDto2 != null) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_FILLED_16), null, j3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
                            composer3 = composer2;
                        }
                        composer3.endReplaceGroup();
                        boolean z2 = !z && indicatorValidationInfoDto2 == null;
                        final long j4 = j3;
                        int i7 = (i6 & 14) | 1572864;
                        AnimatedVisibilityKt.AnimatedVisibility(IndicatorPill, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-678592639, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$3$3.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-678592639, i8, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorQuickAccessRow.kt:231)");
                                }
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DOT_24), null, j4, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, composer4, BentoIcon4.Size16.$stable | 48, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, i7, 30);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        String strIndicatorName = Helpers3.indicatorName(indicatorStateDto);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strIndicatorName, companion, Color.m6701boximpl(bentoTheme2.getColors(composer3, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getTextS(), composer2, 48, 0, 8184);
                        boolean z3 = z || indicatorValidationInfoDto2 != null;
                        final long j5 = j3;
                        final EventLogger eventLogger4 = eventLogger3;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor4 = userInteractionEventDescriptor3;
                        final IndicatorStateDto indicatorStateDto2 = indicatorStateDto;
                        final HapticFeedback hapticFeedback4 = hapticFeedback3;
                        final Function1<IndicatorStateDto, Unit> function16 = function15;
                        AnimatedVisibilityKt.AnimatedVisibility(IndicatorPill, z3, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1373676714, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$3$3.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1373676714, i9, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorQuickAccessRow.kt:250)");
                                }
                                Modifier modifierClip2 = Clip.clip(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShape2.getCircleShape());
                                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16);
                                String strStringResource = StringResources_androidKt.stringResource(C10963R.string.bw_indicator_pill_settings_content_description, composer4, 0);
                                long j6 = j5;
                                composer4.startReplaceGroup(-1224400529);
                                boolean zChangedInstance2 = composer4.changedInstance(eventLogger4) | composer4.changedInstance(userInteractionEventDescriptor4) | composer4.changedInstance(indicatorStateDto2) | composer4.changedInstance(hapticFeedback4) | composer4.changed(function16);
                                final EventLogger eventLogger5 = eventLogger4;
                                final UserInteractionEventDescriptor userInteractionEventDescriptor5 = userInteractionEventDescriptor4;
                                final IndicatorStateDto indicatorStateDto3 = indicatorStateDto2;
                                final HapticFeedback hapticFeedback5 = hapticFeedback4;
                                final Function1<IndicatorStateDto, Unit> function17 = function16;
                                Object objRememberedValue4 = composer4.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    Function0<Unit> function04 = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$3$3$2$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            EventLogger.DefaultImpls.logTap$default(eventLogger5, null, userInteractionEventDescriptor5.getScreen(), new Component(Component.ComponentType.BUTTON, IndicatorQuickAccessRowKt.INDICATORS_ROW_SETTINGS, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor5, null, null, null, null, null, null, 0.0d, false, indicatorStateDto3.getId(), null, null, null, 0.0d, null, null, 32511, null).getContext(), false, 41, null);
                                            hapticFeedback5.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                                            function17.invoke(indicatorStateDto3);
                                        }
                                    };
                                    composer4.updateRememberedValue(function04);
                                    objRememberedValue4 = function04;
                                }
                                composer4.endReplaceGroup();
                                BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, j6, modifierClip2, (Function0) objRememberedValue4, false, composer4, BentoIcon4.Size16.$stable, 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, i7, 30);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), modifierDrawWithContent, null, composer, 3072, 32);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyRow, null, null, ComposableLambda3.composableLambdaInstance(-1385274741, true, new IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$4(eventLogger, userInteractionEventDescriptor, indicatorQuickAccessState, hapticFeedback, function02)), 3, null);
        if (indicatorQuickAccessState.getSelectedTemplate() == null && !indicatorQuickAccessState.getSelectedIndicators().isEmpty()) {
            LazyListScope.item$default(LazyRow, null, null, ComposableLambda3.composableLambdaInstance(-122273946, true, new IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$5(eventLogger, userInteractionEventDescriptor, hapticFeedback, function03)), 3, null);
        }
        LazyListScope.item$default(LazyRow, null, null, composableSingletons$IndicatorQuickAccessRowKt.m1784xfc31f20b(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BwIndicatorQuickAccessRowPreview$lambda$21(SnapshotState<ImmutableList3<IndicatorStateDto>> snapshotState, ImmutableList3<IndicatorStateDto> immutableList3) {
        snapshotState.setValue(immutableList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IndicatorQuickAccessRow$lambda$14$lambda$13$lambda$12$lambda$2(int i, IndicatorStateDto item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e6  */
    /* renamed from: IndicatorPill-1Kfb2uI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11905IndicatorPill1Kfb2uI(final long j, final long j2, final Function0<Unit> function0, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, InteractionSource3 interactionSource3, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        int i5;
        InteractionSource3 interactionSource32;
        InteractionSource3 interactionSource33;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        final InteractionSource3 interactionSource34;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1812581129);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        interactionSource32 = interactionSource3;
                        i3 |= composerStartRestartGroup.changed(interactionSource32) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSource2.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            interactionSource33 = (InteractionSource3) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            interactionSource33 = interactionSource32;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1812581129, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorPill (IndicatorQuickAccessRow.kt:388)");
                        }
                        float f = 20;
                        Modifier modifier5 = modifier4;
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(Clip.clip(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(modifier4, j2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), C2002Dp.m7995constructorimpl(1), j, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), interactionSource33, null, false, null, null, function02, 28, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(PaddingKt.m5143paddingVpY3zN4(modifierM4891clickableO2vRcR0$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), null, null, 3, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i3 >> 6) & 112) | 6));
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        interactionSource34 = interactionSource33;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        interactionSource34 = interactionSource32;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IndicatorQuickAccessRowKt.IndicatorPill_1Kfb2uI$lambda$18(j, j2, function0, function3, modifier3, interactionSource34, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                interactionSource32 = interactionSource3;
                if ((74899 & i3) == 74898) {
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float f2 = 20;
                    Modifier modifier52 = modifier4;
                    Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(Clip.clip(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(modifier4, j2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), C2002Dp.m7995constructorimpl(1), j, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), interactionSource33, null, false, null, null, function02, 28, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifierAnimateContentSize$default2 = AnimationModifier.animateContentSize$default(PaddingKt.m5143paddingVpY3zN4(modifierM4891clickableO2vRcR0$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), null, null, 3, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i3 >> 6) & 112) | 6));
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        interactionSource34 = interactionSource33;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            interactionSource32 = interactionSource3;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function02 = function0;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        interactionSource32 = interactionSource3;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void BwIndicatorQuickAccessRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-933086826);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-933086826, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.BwIndicatorQuickAccessRowPreview (IndicatorQuickAccessRow.kt:416)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ColorDto colorDto = ColorDto.COLOR_LUMEN;
                Boolean bool = null;
                Boolean bool2 = null;
                boolean z = false;
                boolean z2 = true;
                String str = null;
                boolean z3 = true;
                Boolean bool3 = null;
                Boolean bool4 = null;
                Integer num = null;
                List list = null;
                String str2 = Constants.SdidMigrationStatusCodes.ALREADY_SDID;
                String str3 = "";
                String str4 = "MACD";
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Object[] objArr5 = 0 == true ? 1 : 0;
                Object[] objArr6 = 0 == true ? 1 : 0;
                Object[] objArr7 = 0 == true ? 1 : 0;
                Object[] objArr8 = 0 == true ? 1 : 0;
                Object[] objArr9 = 0 == true ? 1 : 0;
                Object[] objArr10 = 0 == true ? 1 : 0;
                IndicatorStateDto indicatorStateDto = new IndicatorStateDto(str2, z, z2, objArr, objArr2, str, str3, objArr3, z3, objArr4, str4, objArr5, bool3, bool4, bool, objArr6, CollectionsKt.listOf(new IndicatorLineDto(null, null, null, null, null, null, CollectionsKt.listOf(new LineColorDto(new ThemedColorDto(colorDto, colorDto), null, null, null, 14, null)), null, null, null, null, null, null, false, false, bool, null, null, null, bool2, false, null, null, null, 16777151, null)), objArr7, bool2, num, objArr8, objArr9, objArr10, list, 16710330, null);
                ColorDto colorDto2 = ColorDto.COLOR_IRIS;
                Boolean bool5 = null;
                Object[] objArr11 = 0 == true ? 1 : 0;
                Object[] objArr12 = 0 == true ? 1 : 0;
                Object[] objArr13 = 0 == true ? 1 : 0;
                Object[] objArr14 = 0 == true ? 1 : 0;
                Object[] objArr15 = 0 == true ? 1 : 0;
                Object[] objArr16 = 0 == true ? 1 : 0;
                Object[] objArr17 = 0 == true ? 1 : 0;
                Object[] objArr18 = 0 == true ? 1 : 0;
                Object[] objArr19 = 0 == true ? 1 : 0;
                Object[] objArr20 = 0 == true ? 1 : 0;
                Object[] objArr21 = 0 == true ? 1 : 0;
                Object[] objArr22 = 0 == true ? 1 : 0;
                boolean z4 = true;
                boolean z5 = true;
                String str5 = null;
                boolean z6 = false;
                Boolean bool6 = null;
                Boolean bool7 = null;
                Integer num2 = null;
                List list2 = null;
                String str6 = Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED;
                String str7 = "";
                String str8 = "SMA";
                Object[] objArr23 = 0 == true ? 1 : 0;
                Object[] objArr24 = 0 == true ? 1 : 0;
                Object[] objArr25 = 0 == true ? 1 : 0;
                Object[] objArr26 = 0 == true ? 1 : 0;
                Object[] objArr27 = 0 == true ? 1 : 0;
                Object[] objArr28 = 0 == true ? 1 : 0;
                Object[] objArr29 = 0 == true ? 1 : 0;
                Object[] objArr30 = 0 == true ? 1 : 0;
                Object[] objArr31 = 0 == true ? 1 : 0;
                Object[] objArr32 = 0 == true ? 1 : 0;
                Object[] objArr33 = 0 == true ? 1 : 0;
                IndicatorStateDto indicatorStateDto2 = new IndicatorStateDto(str6, z4, z5, objArr28, objArr32, str5, str7, objArr23, z6, objArr24, str8, objArr29, bool6, bool7, bool5, objArr25, CollectionsKt.listOf(new IndicatorLineDto(null, null, objArr11, objArr12, objArr18, null, CollectionsKt.listOf(new LineColorDto(new ThemedColorDto(colorDto2, colorDto2), null, null, null, 14, null)), null, objArr13, null, objArr14, objArr19, objArr20, false, false, bool5, objArr15, bool2, objArr21, objArr16, false, objArr17, objArr22, null, 16777151, null)), objArr30, objArr26, num2, objArr27, objArr31, objArr33, list2, 16710328, null);
                ColorDto colorDto3 = ColorDto.COLOR_COSMONAUT;
                Boolean bool8 = null;
                Object[] objArr34 = 0 == true ? 1 : 0;
                Object[] objArr35 = 0 == true ? 1 : 0;
                Object[] objArr36 = 0 == true ? 1 : 0;
                Object[] objArr37 = 0 == true ? 1 : 0;
                Object[] objArr38 = 0 == true ? 1 : 0;
                Object[] objArr39 = 0 == true ? 1 : 0;
                Object[] objArr40 = 0 == true ? 1 : 0;
                Object[] objArr41 = 0 == true ? 1 : 0;
                Object[] objArr42 = 0 == true ? 1 : 0;
                Object[] objArr43 = 0 == true ? 1 : 0;
                Object[] objArr44 = 0 == true ? 1 : 0;
                Object[] objArr45 = 0 == true ? 1 : 0;
                boolean z7 = false;
                boolean z8 = false;
                String str9 = null;
                boolean z9 = false;
                Boolean bool9 = null;
                Boolean bool10 = null;
                Integer num3 = null;
                List list3 = null;
                String str10 = Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET;
                String str11 = "";
                String str12 = "EMA";
                Object[] objArr46 = 0 == true ? 1 : 0;
                Object[] objArr47 = 0 == true ? 1 : 0;
                Object[] objArr48 = 0 == true ? 1 : 0;
                Object[] objArr49 = 0 == true ? 1 : 0;
                Object[] objArr50 = 0 == true ? 1 : 0;
                Object[] objArr51 = 0 == true ? 1 : 0;
                Object[] objArr52 = 0 == true ? 1 : 0;
                Object[] objArr53 = 0 == true ? 1 : 0;
                Object[] objArr54 = 0 == true ? 1 : 0;
                Object[] objArr55 = 0 == true ? 1 : 0;
                objRememberedValue = SnapshotState3.mutableStateOf$default(extensions2.persistentListOf(indicatorStateDto, indicatorStateDto2, new IndicatorStateDto(str10, z7, z8, objArr51, objArr54, str9, str11, objArr46, z9, objArr48, str12, bool7, bool9, bool10, bool8, objArr49, CollectionsKt.listOf(new IndicatorLineDto(null, null, objArr37, objArr40, objArr42, null, CollectionsKt.listOf(new LineColorDto(new ThemedColorDto(colorDto3, colorDto3), null, null, null, 14, null)), null, objArr34, null, objArr38, objArr43, bool7, false, false, bool8, objArr39, objArr35, objArr44, objArr36, false, objArr41, objArr45, null, 16777151, null)), objArr52, objArr47, num3, objArr50, objArr53, objArr55, list3, 16710328, null)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1973476018, true, new C107961((SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IndicatorQuickAccessRowKt.BwIndicatorQuickAccessRowPreview$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: IndicatorQuickAccessRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$BwIndicatorQuickAccessRowPreview$1 */
    static final class C107961 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<ImmutableList3<IndicatorStateDto>> $indicators$delegate;

        C107961(SnapshotState<ImmutableList3<IndicatorStateDto>> snapshotState) {
            this.$indicators$delegate = snapshotState;
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
                ComposerKt.traceEventStart(-1973476018, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.BwIndicatorQuickAccessRowPreview.<anonymous> (IndicatorQuickAccessRow.kt:484)");
            }
            IndicatorQuickAccessState indicatorQuickAccessState = new IndicatorQuickAccessState(IndicatorQuickAccessRowKt.BwIndicatorQuickAccessRowPreview$lambda$20(this.$indicators$delegate), new TemplateDto(null, null, "Selected Template", 3, null), extensions2.persistentListOf());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$BwIndicatorQuickAccessRowPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            final SnapshotState<ImmutableList3<IndicatorStateDto>> snapshotState = this.$indicators$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$BwIndicatorQuickAccessRowPreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IndicatorQuickAccessRowKt.C107961.invoke$lambda$4$lambda$3(snapshotState, (IndicatorStateDto) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$BwIndicatorQuickAccessRowPreview$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IndicatorQuickAccessRowKt.C107961.invoke$lambda$6$lambda$5((IndicatorStateDto) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$BwIndicatorQuickAccessRowPreview$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function02 = (Function0) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$BwIndicatorQuickAccessRowPreview$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            IndicatorQuickAccessRowKt.IndicatorQuickAccessRow(indicatorQuickAccessState, function0, function1, function12, function02, (Function0) objRememberedValue5, null, composer, 224688, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState, IndicatorStateDto selectedIndicator) {
            Intrinsics.checkNotNullParameter(selectedIndicator, "selectedIndicator");
            Iterator<E> it = IndicatorQuickAccessRowKt.BwIndicatorQuickAccessRowPreview$lambda$20(snapshotState).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(selectedIndicator, (IndicatorStateDto) it.next())) {
                    break;
                }
                i++;
            }
            IndicatorStateDto indicatorStateDto = (IndicatorStateDto) IndicatorQuickAccessRowKt.BwIndicatorQuickAccessRowPreview$lambda$20(snapshotState).get(i);
            List mutableList = CollectionsKt.toMutableList((Collection) IndicatorQuickAccessRowKt.BwIndicatorQuickAccessRowPreview$lambda$20(snapshotState));
            boolean z = !IndicatorQuickAccessRowKt.isVisible(indicatorStateDto);
            mutableList.set(i, IndicatorStateDto.copy$default(indicatorStateDto, null, z, z, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777209, null));
            IndicatorQuickAccessRowKt.BwIndicatorQuickAccessRowPreview$lambda$21(snapshotState, extensions2.toPersistentList(mutableList));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(IndicatorStateDto it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final boolean isVisible(IndicatorStateDto indicatorStateDto) {
        Intrinsics.checkNotNullParameter(indicatorStateDto, "<this>");
        if (indicatorStateDto.getOverlaying()) {
            return indicatorStateDto.getVisible();
        }
        return !indicatorStateDto.getMinimized();
    }
}
