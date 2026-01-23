package com.robinhood.android.chart.blackwidowadvancedchart.composables.templates;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
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
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet3;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SelectTemplateBottomSheet.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a\u0089\u0001\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, m3636d2 = {"INDICATOR_SETS_BOTTOM_SHEET", "", "INDICATOR_SETS_BOTTOM_SHEET_CREATE_SET", "SelectTemplateBottomSheet", "", "selectedTemplate", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "availableTemplates", "Lkotlinx/collections/immutable/ImmutableList;", "onDeleteTemplate", "Lkotlin/Function1;", "onRenameTemplate", "onSelectTemplate", "onCreateTemplate", "Lkotlin/Function0;", "onDone", "modifier", "Landroidx/compose/ui/Modifier;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BwSelectTemplateBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "showPopupScrim", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SelectTemplateBottomSheetKt {
    public static final String INDICATOR_SETS_BOTTOM_SHEET = "IndicatorSetsBottomSheet";
    public static final String INDICATOR_SETS_BOTTOM_SHEET_CREATE_SET = "IndicatorSetsBottomSheetCreateSet";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BwSelectTemplateBottomSheetPreview$lambda$4(int i, Composer composer, int i2) {
        BwSelectTemplateBottomSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectTemplateBottomSheet$lambda$3(TemplateDto templateDto, ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectTemplateBottomSheet(templateDto, immutableList, function1, function12, function13, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectTemplateBottomSheet(final TemplateDto templateDto, final ImmutableList<TemplateDto> immutableList, final Function1<? super TemplateDto, Unit> onDeleteTemplate, final Function1<? super TemplateDto, Unit> onRenameTemplate, final Function1<? super TemplateDto, Unit> onSelectTemplate, final Function0<Unit> onCreateTemplate, final Function0<Unit> onDone, Modifier modifier, Composer composer, final int i, final int i2) {
        TemplateDto templateDto2;
        int i3;
        ImmutableList<TemplateDto> immutableList2;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDeleteTemplate, "onDeleteTemplate");
        Intrinsics.checkNotNullParameter(onRenameTemplate, "onRenameTemplate");
        Intrinsics.checkNotNullParameter(onSelectTemplate, "onSelectTemplate");
        Intrinsics.checkNotNullParameter(onCreateTemplate, "onCreateTemplate");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(-312668523);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            templateDto2 = templateDto;
        } else if ((i & 6) == 0) {
            templateDto2 = templateDto;
            i3 = (composerStartRestartGroup.changedInstance(templateDto2) ? 4 : 2) | i;
        } else {
            templateDto2 = templateDto;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                immutableList2 = immutableList;
                i3 |= composerStartRestartGroup.changedInstance(immutableList2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDeleteTemplate) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onRenameTemplate) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSelectTemplate) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCreateTemplate) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDone) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312668523, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheet (SelectTemplateBottomSheet.kt:60)");
                    }
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final ImmutableList<TemplateDto> immutableList3 = immutableList2;
                    final TemplateDto templateDto3 = templateDto2;
                    final Modifier modifier4 = modifier2;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-408718048, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt.SelectTemplateBottomSheet.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            Function1<TemplateDto, Unit> function1;
                            Function1<TemplateDto, Unit> function12;
                            HapticFeedback hapticFeedback2;
                            Function0<Unit> function0;
                            Function1<TemplateDto, Unit> function13;
                            int i6;
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-408718048, i5, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheet.<anonymous> (SelectTemplateBottomSheet.kt:65)");
                            }
                            Alignment center = Alignment.INSTANCE.getCenter();
                            Modifier modifier5 = modifier4;
                            Function0<Unit> function02 = onDone;
                            SnapshotState<Boolean> snapshotState2 = snapshotState;
                            ImmutableList<TemplateDto> immutableList4 = immutableList3;
                            TemplateDto templateDto4 = templateDto3;
                            Context context2 = context;
                            Function1<TemplateDto, Unit> function14 = onDeleteTemplate;
                            Function1<TemplateDto, Unit> function15 = onRenameTemplate;
                            Function1<TemplateDto, Unit> function16 = onSelectTemplate;
                            HapticFeedback hapticFeedback3 = hapticFeedback;
                            Function0<Unit> function03 = onCreateTemplate;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceGroup(1276458741);
                            if (SelectTemplateBottomSheetKt.SelectTemplateBottomSheet$lambda$1(snapshotState2)) {
                                function1 = function15;
                                function12 = function16;
                                hapticFeedback2 = hapticFeedback3;
                                function0 = function03;
                                function13 = function14;
                                i6 = 0;
                                AndroidPopup_androidKt.m8111PopupK5zGePQ(null, 0L, null, null, ComposableSingletons$SelectTemplateBottomSheetKt.INSTANCE.m1798x11b45346(), composer2, 24576, 15);
                            } else {
                                function1 = function15;
                                function12 = function16;
                                hapticFeedback2 = hapticFeedback3;
                                function0 = function03;
                                function13 = function14;
                                i6 = 0;
                            }
                            composer2.endReplaceGroup();
                            SelectionBottomSheet3.SelectionBottomSheetLayout(false, StringResources_androidKt.stringResource(C10963R.string.indicator_bottom_sheet_select_title, composer2, i6), function02, ComposableLambda3.rememberComposableLambda(-46948152, true, new SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1(immutableList4, templateDto4, context2, function13, function1, function12, hapticFeedback2, function0, snapshotState2), composer2, 54), ModifiersKt.autoLogEvents$default(modifier5, Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.BOTTOM_SHEET, SelectTemplateBottomSheetKt.INDICATOR_SETS_BOTTOM_SHEET, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32766, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composer2, 3078, 32);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SelectTemplateBottomSheetKt.SelectTemplateBottomSheet$lambda$3(templateDto, immutableList, onDeleteTemplate, onRenameTemplate, onSelectTemplate, onCreateTemplate, onDone, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            if ((4793491 & i3) != 4793490) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final ImmutableList<TemplateDto> immutableList32 = immutableList2;
                final TemplateDto templateDto32 = templateDto2;
                final Modifier modifier42 = modifier2;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-408718048, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt.SelectTemplateBottomSheet.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        Function1<TemplateDto, Unit> function1;
                        Function1<TemplateDto, Unit> function12;
                        HapticFeedback hapticFeedback22;
                        Function0<Unit> function0;
                        Function1<TemplateDto, Unit> function13;
                        int i6;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-408718048, i5, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheet.<anonymous> (SelectTemplateBottomSheet.kt:65)");
                        }
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Modifier modifier5 = modifier42;
                        Function0<Unit> function02 = onDone;
                        SnapshotState<Boolean> snapshotState22 = snapshotState2;
                        ImmutableList<TemplateDto> immutableList4 = immutableList32;
                        TemplateDto templateDto4 = templateDto32;
                        Context context22 = context2;
                        Function1<TemplateDto, Unit> function14 = onDeleteTemplate;
                        Function1<TemplateDto, Unit> function15 = onRenameTemplate;
                        Function1<TemplateDto, Unit> function16 = onSelectTemplate;
                        HapticFeedback hapticFeedback3 = hapticFeedback2;
                        Function0<Unit> function03 = onCreateTemplate;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(1276458741);
                        if (SelectTemplateBottomSheetKt.SelectTemplateBottomSheet$lambda$1(snapshotState22)) {
                            function1 = function15;
                            function12 = function16;
                            hapticFeedback22 = hapticFeedback3;
                            function0 = function03;
                            function13 = function14;
                            i6 = 0;
                            AndroidPopup_androidKt.m8111PopupK5zGePQ(null, 0L, null, null, ComposableSingletons$SelectTemplateBottomSheetKt.INSTANCE.m1798x11b45346(), composer2, 24576, 15);
                        } else {
                            function1 = function15;
                            function12 = function16;
                            hapticFeedback22 = hapticFeedback3;
                            function0 = function03;
                            function13 = function14;
                            i6 = 0;
                        }
                        composer2.endReplaceGroup();
                        SelectionBottomSheet3.SelectionBottomSheetLayout(false, StringResources_androidKt.stringResource(C10963R.string.indicator_bottom_sheet_select_title, composer2, i6), function02, ComposableLambda3.rememberComposableLambda(-46948152, true, new SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1(immutableList4, templateDto4, context22, function13, function1, function12, hapticFeedback22, function0, snapshotState22), composer2, 54), ModifiersKt.autoLogEvents$default(modifier5, Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.BOTTOM_SHEET, SelectTemplateBottomSheetKt.INDICATOR_SETS_BOTTOM_SHEET, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32766, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composer2, 3078, 32);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        immutableList2 = immutableList;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectTemplateBottomSheet$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SelectTemplateBottomSheet$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final void BwSelectTemplateBottomSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1382924221);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1382924221, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.BwSelectTemplateBottomSheetPreview (SelectTemplateBottomSheet.kt:167)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableSingletons$SelectTemplateBottomSheetKt.INSTANCE.m1799x683f0945(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectTemplateBottomSheetKt.BwSelectTemplateBottomSheetPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
