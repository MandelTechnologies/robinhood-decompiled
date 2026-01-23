package com.robinhood.android.futures.assethome.sections;

import android.os.Parcelable;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.charts.span.SpanOptionsDynamicSelector;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.futures.assethome.C16973R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesAssetHomeChartSection.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aJ\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u0011\u001a8\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u0013\u001a\u0017\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u008e\u0002²\u0006%\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\fX\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\u0019X\u008a\u008e\u0002"}, m3636d2 = {"FuturesAssetHomeChartSectionContent", "", "viewState", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;", "callbacks", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FuturesAssetHomeChartSection", "chartCallbacks", "onChartLoaded", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isLoaded", "(Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartCallbacks;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MonitorOnChartLoaded", "(Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "loadingTextColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "loadingPlaceholderText", "", "rememberLatestLoadingCursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "cursorData", "(Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "DefaultLoadingCursorData", "feature-futures-asset-home_externalDebug", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "latestOnChartLoaded", "loadingCursorData"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeChartSection {
    private static final CursorData DefaultLoadingCursorData;
    private static final String loadingPlaceholderText;
    private static final ThemedColor loadingTextColor;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeChartSection$lambda$15(FuturesAssetHomeChartViewState futuresAssetHomeChartViewState, FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeChartSection(futuresAssetHomeChartViewState, futuresAssetHomeChartDuxo2, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeChartSectionContent$lambda$13(FuturesAssetHomeChartViewState futuresAssetHomeChartViewState, FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeChartSectionContent(futuresAssetHomeChartViewState, futuresAssetHomeChartDuxo2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MonitorOnChartLoaded$lambda$18(FuturesAssetHomeChartViewState futuresAssetHomeChartViewState, Function1 function1, int i, Composer composer, int i2) {
        MonitorOnChartLoaded(futuresAssetHomeChartViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesAssetHomeChartSectionContent(final FuturesAssetHomeChartViewState viewState, final FuturesAssetHomeChartDuxo2 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Chart<Parcelable> chart;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue2;
        CursorData cursorData;
        int i4;
        Modifier modifier3;
        boolean z2;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean z3;
        boolean zChangedInstance;
        Object objRememberedValue3;
        NetReturnsBottomSheetViewState netReturnsBottomSheetViewState;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2036610507);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2036610507, i3, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionContent (FuturesAssetHomeChartSection.kt:56)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                chart = viewState.getChart();
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierEducationTourId$default = ModifiersKt.educationTourId$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), EducationTourElementIds.PERFORMANCE_CHART_TITLE, null, null, false, false, 30, null);
                String strStringResource = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier6 = modifier5;
                int i7 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierEducationTourId$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i8 = i7 & 112;
                z = i8 != 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FuturesAssetHomeChartSection5(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                CursorRowModifiers.ChartEducationTour chartEducationTour = new CursorRowModifiers.ChartEducationTour((Function0) ((KFunction) objRememberedValue2), EducationTourElementIds.FUTURES_ASSET_HOME_CHART_OPEN_PNL_HEADER, null, null, 12, null);
                CursorData cursorDataRememberLatestLoadingCursorData = rememberLatestLoadingCursorData(viewState.getCursorData(), composerStartRestartGroup, 0);
                cursorData = viewState.getCursorData();
                if (cursorData != null) {
                    cursorDataRememberLatestLoadingCursorData = cursorData;
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
                if (viewState.getCursorData() != null) {
                    i4 = i8;
                    modifier3 = modifierM21623defaultHorizontalPaddingrAjV9yQ;
                    z2 = true;
                } else {
                    i4 = i8;
                    modifier3 = modifierM21623defaultHorizontalPaddingrAjV9yQ;
                    z2 = false;
                }
                int i9 = i4;
                SduiCursorData2.SduiCursorDataHeader(cursorDataRememberLatestLoadingCursorData, modifier3, chartEducationTour, ComposableLambda3.rememberComposableLambda(-708087499, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$FuturesAssetHomeChartSectionContent$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 SduiCursorDataHeader, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(SduiCursorDataHeader, "$this$SduiCursorDataHeader");
                        if ((i10 & 6) == 0) {
                            i10 |= composer2.changed(SduiCursorDataHeader) ? 4 : 2;
                        }
                        if ((i10 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-708087499, i10, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionContent.<anonymous>.<anonymous> (FuturesAssetHomeChartSection.kt:85)");
                        }
                        boolean z4 = viewState.getCursorData() != null;
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                        final FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2 = callbacks;
                        AnimatedVisibilityKt.AnimatedVisibility(SduiCursorDataHeader, z4, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(267030877, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$FuturesAssetHomeChartSectionContent$1$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i11) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(267030877, i11, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionContent.<anonymous>.<anonymous>.<anonymous> (FuturesAssetHomeChartSection.kt:90)");
                                }
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                                String strStringResource2 = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_info_icon_content_description, composer3, 0);
                                long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU();
                                FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo22 = futuresAssetHomeChartDuxo2;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer3.changedInstance(futuresAssetHomeChartDuxo22);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new FuturesAssetHomeChartSection3(futuresAssetHomeChartDuxo22);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceGroup();
                                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource2, jM21426getFg20d7_KjU, null, (Function0) ((KFunction) objRememberedValue4), false, composer3, BentoIcon4.Size24.$stable, 40);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, (i10 & 14) | 1600512, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, true, z2, false, false, composerStartRestartGroup, 199680 | (CursorRowModifiers.ChartEducationTour.$stable << 6), 400);
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                SduiCursorData2.SduiLabelTrack(null, FuturesAssetHomeChartSectionContent$lambda$1(snapshotState), composerStartRestartGroup, 0, 1);
                if (chart == null) {
                    composerStartRestartGroup.startReplaceGroup(-5149158);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z4 = i9 == 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FuturesAssetHomeChartSection.FuturesAssetHomeChartSectionContent$lambda$12$lambda$5$lambda$4(callbacks, snapshotState, (Point) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = (i9 == 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FuturesAssetHomeChartSection.FuturesAssetHomeChartSectionContent$lambda$12$lambda$7$lambda$6(callbacks, current, userInteractionEventDescriptor, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    FuturesAssetHomeLoadedChart.FuturesAssetHomeLoadedChart(chart, function1, (Function0) objRememberedValue5, com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(ModifiersKt.educationTourId$default(companion3, EducationTourElementIds.FUTURES_PERFORMANCE_CHART, null, null, false, false, 30, null), null, true, false, false, false, false, null, 125, null), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    z3 = false;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-4247058);
                    z3 = false;
                    Placeholders2.ChartPlaceholder(ModifiersKt.educationTourId$default(com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(companion3), EducationTourElementIds.FUTURES_PERFORMANCE_CHART, null, null, false, false, 30, null), false, composerStartRestartGroup, 0, 2);
                    composerStartRestartGroup.endReplaceGroup();
                }
                ImmutableList<SpanOption> availableSpans = viewState.getAvailableSpans();
                String currentDisplaySpan = viewState.getCurrentDisplaySpan();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i9 != 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? true : z3) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuturesAssetHomeChartSection.FuturesAssetHomeChartSectionContent$lambda$12$lambda$9$lambda$8(callbacks, current, userInteractionEventDescriptor, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                SpanOptionsDynamicSelector.SpanOptionsDynamicSelector(availableSpans, currentDisplaySpan, (Function1) objRememberedValue3, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, false, null, composerStartRestartGroup, 0, 112);
                composerStartRestartGroup = composerStartRestartGroup;
                netReturnsBottomSheetViewState = viewState.getNetReturnsBottomSheetViewState();
                composerStartRestartGroup.startReplaceGroup(2078105517);
                if (netReturnsBottomSheetViewState != null) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z5 = (i9 == 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? true : z3;
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new FuturesAssetHomeChartSection4(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    NetReturnsBottomSheet4.NetReturnsBottomSheet(netReturnsBottomSheetViewState, com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), "net_returns_bottom_sheet_" + viewState.getCurrentDisplaySpan(), null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "futures_asset_home_net_return", null, 4, null), null, 46, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, (Function0) ((KFunction) objRememberedValue6), composerStartRestartGroup, StringResource.$stable, 4);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesAssetHomeChartSection.FuturesAssetHomeChartSectionContent$lambda$13(viewState, callbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            chart = viewState.getChart();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierEducationTourId$default2 = ModifiersKt.educationTourId$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), EducationTourElementIds.PERFORMANCE_CHART_TITLE, null, null, false, false, 30, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier62 = modifier5;
                int i72 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierEducationTourId$default2, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i82 = i72 & 112;
                if (i82 != 32) {
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue2 = new FuturesAssetHomeChartSection5(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        CursorRowModifiers.ChartEducationTour chartEducationTour2 = new CursorRowModifiers.ChartEducationTour((Function0) ((KFunction) objRememberedValue2), EducationTourElementIds.FUTURES_ASSET_HOME_CHART_OPEN_PNL_HEADER, null, null, 12, null);
                        CursorData cursorDataRememberLatestLoadingCursorData2 = rememberLatestLoadingCursorData(viewState.getCursorData(), composerStartRestartGroup, 0);
                        cursorData = viewState.getCursorData();
                        if (cursorData != null) {
                        }
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
                        if (viewState.getCursorData() != null) {
                        }
                        int i92 = i4;
                        SduiCursorData2.SduiCursorDataHeader(cursorDataRememberLatestLoadingCursorData2, modifier3, chartEducationTour2, ComposableLambda3.rememberComposableLambda(-708087499, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$FuturesAssetHomeChartSectionContent$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                invoke(row5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 SduiCursorDataHeader, Composer composer2, int i10) {
                                Intrinsics.checkNotNullParameter(SduiCursorDataHeader, "$this$SduiCursorDataHeader");
                                if ((i10 & 6) == 0) {
                                    i10 |= composer2.changed(SduiCursorDataHeader) ? 4 : 2;
                                }
                                if ((i10 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-708087499, i10, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionContent.<anonymous>.<anonymous> (FuturesAssetHomeChartSection.kt:85)");
                                }
                                boolean z42 = viewState.getCursorData() != null;
                                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                                ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                                final FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2 = callbacks;
                                AnimatedVisibilityKt.AnimatedVisibility(SduiCursorDataHeader, z42, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(267030877, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$FuturesAssetHomeChartSectionContent$1$1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i11) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(267030877, i11, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionContent.<anonymous>.<anonymous>.<anonymous> (FuturesAssetHomeChartSection.kt:90)");
                                        }
                                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                                        String strStringResource22 = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_chart_info_icon_content_description, composer3, 0);
                                        long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU();
                                        FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo22 = futuresAssetHomeChartDuxo2;
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChangedInstance22 = composer3.changedInstance(futuresAssetHomeChartDuxo22);
                                        Object objRememberedValue42 = composer3.rememberedValue();
                                        if (zChangedInstance22 || objRememberedValue42 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue42 = new FuturesAssetHomeChartSection3(futuresAssetHomeChartDuxo22);
                                            composer3.updateRememberedValue(objRememberedValue42);
                                        }
                                        composer3.endReplaceGroup();
                                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource22, jM21426getFg20d7_KjU, null, (Function0) ((KFunction) objRememberedValue42), false, composer3, BentoIcon4.Size24.$stable, 40);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, (i10 & 14) | 1600512, 18);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, true, z2, false, false, composerStartRestartGroup, 199680 | (CursorRowModifiers.ChartEducationTour.$stable << 6), 400);
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        SduiCursorData2.SduiLabelTrack(null, FuturesAssetHomeChartSectionContent$lambda$1(snapshotState2), composerStartRestartGroup, 0, 1);
                        if (chart == null) {
                        }
                        ImmutableList<SpanOption> availableSpans2 = viewState.getAvailableSpans();
                        String currentDisplaySpan2 = viewState.getCurrentDisplaySpan();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        if (i92 != 32) {
                            zChangedInstance = ((i92 != 32 || ((i72 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? true : z3) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FuturesAssetHomeChartSection.FuturesAssetHomeChartSectionContent$lambda$12$lambda$9$lambda$8(callbacks, current, userInteractionEventDescriptor, (String) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                SpanOptionsDynamicSelector.SpanOptionsDynamicSelector(availableSpans2, currentDisplaySpan2, (Function1) objRememberedValue3, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, false, null, composerStartRestartGroup, 0, 112);
                                composerStartRestartGroup = composerStartRestartGroup;
                                netReturnsBottomSheetViewState = viewState.getNetReturnsBottomSheetViewState();
                                composerStartRestartGroup.startReplaceGroup(2078105517);
                                if (netReturnsBottomSheetViewState != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier62;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Point FuturesAssetHomeChartSectionContent$lambda$1(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> MonitorOnChartLoaded$lambda$16(SnapshotState4<? extends Function1<? super Boolean, Unit>> snapshotState4) {
        return (Function1) snapshotState4.getValue();
    }

    private static final CursorData rememberLatestLoadingCursorData$lambda$20(SnapshotState<CursorData> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeChartSectionContent$lambda$12$lambda$5$lambda$4(FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, SnapshotState snapshotState, Point point) {
        snapshotState.setValue(point);
        futuresAssetHomeChartDuxo2.onScrub(point);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeChartSectionContent$lambda$12$lambda$7$lambda$6(FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState snapshotState) {
        snapshotState.setValue(null);
        futuresAssetHomeChartDuxo2.onScrub(null);
        EventLogger.DefaultImpls.logDrag$default(eventLogger, UserInteractionEventData.Action.SCRUB_CANDLESTICK_CHART, userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), null, userInteractionEventDescriptor.getContext(), false, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeChartSectionContent$lambda$12$lambda$9$lambda$8(FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, String selectedSpan) {
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        futuresAssetHomeChartDuxo2.onSpanSelected(selectedSpan);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CHANGE_CHART_SPAN, userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), null, Loggings2.withChartContext(userInteractionEventDescriptor.getContext(), selectedSpan), false, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesAssetHomeChartSection(final FuturesAssetHomeChartViewState viewState, final FuturesAssetHomeChartDuxo2 chartCallbacks, Modifier modifier, final Function1<? super Boolean, Unit> onChartLoaded, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(onChartLoaded, "onChartLoaded");
        Composer composerStartRestartGroup = composer.startRestartGroup(-352763753);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onChartLoaded) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-352763753, i3, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSection (FuturesAssetHomeChartSection.kt:175)");
                }
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                String currentDisplaySpan = viewState.getCurrentDisplaySpan();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(currentDisplaySpan) | composerStartRestartGroup.changed(userInteractionEventDescriptor);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor("performance_chart", null, null, Loggings2.withChartContext(userInteractionEventDescriptor.getContext(), viewState.getCurrentDisplaySpan()), new Component(Component.ComponentType.PERFORMANCE_CHART, "futures", null, 4, null), null, 38, null));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AutoLoggingCompositionLocals.EventLoggable((UserInteractionEventDescriptor) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1073011316, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt.FuturesAssetHomeChartSection.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1073011316, i5, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSection.<anonymous> (FuturesAssetHomeChartSection.kt:191)");
                        }
                        FuturesAssetHomeChartSection.FuturesAssetHomeChartSectionContent(viewState, chartCallbacks, modifier3, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                MonitorOnChartLoaded(viewState, onChartLoaded, composerStartRestartGroup, (i3 & 14) | ((i3 >> 6) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesAssetHomeChartSection.FuturesAssetHomeChartSection$lambda$15(viewState, chartCallbacks, modifier4, onChartLoaded, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            String currentDisplaySpan2 = viewState.getCurrentDisplaySpan();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(currentDisplaySpan2) | composerStartRestartGroup.changed(userInteractionEventDescriptor);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor("performance_chart", null, null, Loggings2.withChartContext(userInteractionEventDescriptor.getContext(), viewState.getCurrentDisplaySpan()), new Component(Component.ComponentType.PERFORMANCE_CHART, "futures", null, 4, null), null, 38, null));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                AutoLoggingCompositionLocals.EventLoggable((UserInteractionEventDescriptor) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1073011316, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt.FuturesAssetHomeChartSection.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1073011316, i5, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSection.<anonymous> (FuturesAssetHomeChartSection.kt:191)");
                        }
                        FuturesAssetHomeChartSection.FuturesAssetHomeChartSectionContent(viewState, chartCallbacks, modifier3, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                MonitorOnChartLoaded(viewState, onChartLoaded, composerStartRestartGroup, (i3 & 14) | ((i3 >> 6) & 112));
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void MonitorOnChartLoaded(final FuturesAssetHomeChartViewState viewState, final Function1<? super Boolean, Unit> onChartLoaded, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onChartLoaded, "onChartLoaded");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1798732541);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onChartLoaded) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798732541, i2, -1, "com.robinhood.android.futures.assethome.sections.MonitorOnChartLoaded (FuturesAssetHomeChartSection.kt:202)");
            }
            boolean z = (viewState.getChart() == null || viewState.getCursorData() == null) ? false : true;
            SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onChartLoaded, composerStartRestartGroup, (i2 >> 3) & 14);
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState4RememberUpdatedState) | composerStartRestartGroup.changed(z);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FuturesAssetHomeChartSection6(z, snapshotState4RememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesAssetHomeChartSection.MonitorOnChartLoaded$lambda$18(viewState, onChartLoaded, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static {
        Color color = Color.f5853FG;
        ThemedColor themedColor = new ThemedColor(color, color);
        loadingTextColor = themedColor;
        String strRepeat = StringsKt.repeat(PlaceholderUtils.XXShortPlaceholderText, 10);
        loadingPlaceholderText = strRepeat;
        DisplayText displayText = new DisplayText("      ", themedColor, null, 4, null);
        IconDisplayText iconDisplayText = new IconDisplayText(strRepeat, themedColor, null, null, 12, null);
        TextStyle textStyle = TextStyle.TEXT_MEDIUM;
        DefaultLoadingCursorData = new CursorData(null, null, null, null, displayText, new SubDisplayText(iconDisplayText, null, new DisplayText(strRepeat, themedColor, textStyle), null, 10, null), new SubDisplayText(new IconDisplayText(strRepeat, themedColor, null, null, 12, null), null, new DisplayText(strRepeat, themedColor, textStyle), null, 10, null), null, null, null, 911, null);
    }

    private static final CursorData rememberLatestLoadingCursorData(CursorData cursorData, Composer composer, int i) {
        composer.startReplaceGroup(-1279585765);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1279585765, i, -1, "com.robinhood.android.futures.assethome.sections.rememberLatestLoadingCursorData (FuturesAssetHomeChartSection.kt:218)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(cursorData == null ? DefaultLoadingCursorData : cursorData, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(cursorData);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new FuturesAssetHomeChartSection7(cursorData, snapshotState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(cursorData, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, i & 14);
        CursorData cursorDataRememberLatestLoadingCursorData$lambda$20 = rememberLatestLoadingCursorData$lambda$20(snapshotState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cursorDataRememberLatestLoadingCursorData$lambda$20;
    }
}
