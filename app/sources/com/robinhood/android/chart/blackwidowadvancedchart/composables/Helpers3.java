package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.Helpers3;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartSnackbar;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Helpers.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001af\u0010\u0018\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001c\u001a\u00020\u001b*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010 \"\u001a\u0010#\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006(²\u0006\u000e\u0010'\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "", "toSubtitle", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "indicatorName", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;)Ljava/lang/String;", "", "visible", "Lkotlin/Function0;", "", "onDismissed", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "", "delay", "Lkotlin/Function1;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/BwAnimateVisibilityScope;", "Lkotlin/ExtensionFunctionType;", "content", "BwAnimateVisibility", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/ChartSnackbar;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/ChartSnackbarVisuals;", "toSnackBarVisuals", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/ChartSnackbar;)Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/ChartSnackbarVisuals;", "", "MAX_INDICATORS", "I", "MAX_LOWER_INDICATORS", "Landroidx/compose/ui/unit/Dp;", "BW_ADVANCE_CHART_STANDARD_PADDING", "F", "getBW_ADVANCE_CHART_STANDARD_PADDING", "()F", "internalVisibility", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.HelpersKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Helpers3 {
    private static final float BW_ADVANCE_CHART_STANDARD_PADDING = C2002Dp.m7995constructorimpl(12);
    public static final int MAX_INDICATORS = 10;
    public static final int MAX_LOWER_INDICATORS = 5;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BwAnimateVisibility$lambda$8(boolean z, Function0 function0, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, long j, Function3 function3, int i, int i2, Composer composer, int i3) {
        BwAnimateVisibility(z, function0, modifier, enterTransition, exitTransition, j, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final float getBW_ADVANCE_CHART_STANDARD_PADDING() {
        return BW_ADVANCE_CHART_STANDARD_PADDING;
    }

    public static final String toSubtitle(List<IndicatorStateDto> list, Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        Intrinsics.checkNotNullParameter(list, "<this>");
        composer.startReplaceGroup(247272800);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(247272800, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.toSubtitle (Helpers.kt:35)");
        }
        int size = list.size();
        if (size == 1) {
            composer.startReplaceGroup(1405963311);
            composer.endReplaceGroup();
            strStringResource = indicatorName((IndicatorStateDto) CollectionsKt.first((List) list));
        } else if (2 <= size && size < 4) {
            composer.startReplaceGroup(1405964457);
            List<IndicatorStateDto> list2 = list;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.HelpersKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Helpers3.toSubtitle$lambda$1$lambda$0((IndicatorStateDto) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            strStringResource = CollectionsKt.joinToString$default(list2, ", ", null, null, 0, null, (Function1) objRememberedValue, 30, null);
            composer.endReplaceGroup();
        } else if (4 <= size && size <= Integer.MAX_VALUE) {
            composer.startReplaceGroup(1405967321);
            int i2 = C10963R.string.template_bottom_sheet_subtitle;
            List<IndicatorStateDto> listSubList = list.subList(0, 2);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.HelpersKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Helpers3.toSubtitle$lambda$3$lambda$2((IndicatorStateDto) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            strStringResource = StringResources_androidKt.stringResource(i2, new Object[]{CollectionsKt.joinToString$default(listSubList, ", ", null, null, 0, null, (Function1) objRememberedValue2, 30, null), Integer.valueOf(list.size() - 2)}, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(635509694);
            composer.endReplaceGroup();
            strStringResource = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toSubtitle$lambda$1$lambda$0(IndicatorStateDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return indicatorName(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toSubtitle$lambda$3$lambda$2(IndicatorStateDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return indicatorName(it);
    }

    public static final String indicatorName(IndicatorStateDto indicatorStateDto) {
        Intrinsics.checkNotNullParameter(indicatorStateDto, "<this>");
        String abbreviation = indicatorStateDto.getAbbreviation();
        if (abbreviation == null) {
            abbreviation = indicatorStateDto.getTitle();
        }
        String paren_params_label = indicatorStateDto.getParen_params_label();
        if (paren_params_label != null) {
            String str = abbreviation + paren_params_label;
            if (str != null) {
                return str;
            }
        }
        return abbreviation;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BwAnimateVisibility(final boolean z, final Function0<Unit> onDismissed, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, long j, final Function3<? super Helpers, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransitionPlus;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z3;
        Object objRememberedValue2;
        Composer composer2;
        final long j2;
        final Modifier modifier3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-54663595);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissed) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    enterTransitionPlus = enterTransition;
                    i3 |= composerStartRestartGroup.changed(enterTransitionPlus) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        exitTransition2 = exitTransition;
                        i3 |= composerStartRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                        }
                        ExitTransition exitTransitionPlus = i5 == 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                        long j3 = i6 == 0 ? 200L : j;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54663595, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.BwAnimateVisibility (Helpers.kt:63)");
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z3 = (i3 & 14) != 4;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean zBwAnimateVisibility$lambda$6 = BwAnimateVisibility$lambda$6(snapshotState);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-693996243, true, new C106331(content, coroutineScope, snapshotState, j3, onDismissed), composerStartRestartGroup, 54);
                        int i8 = i3 >> 3;
                        Modifier modifier5 = modifier4;
                        composer2 = composerStartRestartGroup;
                        AnimatedVisibilityKt.AnimatedVisibility(zBwAnimateVisibility$lambda$6, modifier5, enterTransitionPlus, exitTransitionPlus, (String) null, composableLambdaRememberComposableLambda, composer2, (i8 & 112) | 196608 | (i8 & 896) | (i8 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = j3;
                        modifier3 = modifier5;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                        exitTransition3 = exitTransition2;
                        j2 = j;
                    }
                    final EnterTransition enterTransition2 = enterTransitionPlus;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.HelpersKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Helpers3.BwAnimateVisibility$lambda$8(z, onDismissed, modifier3, enterTransition2, exitTransition3, j2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                exitTransition2 = exitTransition;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 14) != 4) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        boolean zBwAnimateVisibility$lambda$62 = BwAnimateVisibility$lambda$6(snapshotState2);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-693996243, true, new C106331(content, coroutineScope2, snapshotState2, j3, onDismissed), composerStartRestartGroup, 54);
                        int i82 = i3 >> 3;
                        Modifier modifier52 = modifier4;
                        composer2 = composerStartRestartGroup;
                        AnimatedVisibilityKt.AnimatedVisibility(zBwAnimateVisibility$lambda$62, modifier52, enterTransitionPlus, exitTransitionPlus, (String) null, composableLambdaRememberComposableLambda2, composer2, (i82 & 112) | 196608 | (i82 & 896) | (i82 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j2 = j3;
                        modifier3 = modifier52;
                        exitTransition3 = exitTransitionPlus;
                    }
                }
                final EnterTransition enterTransition22 = enterTransitionPlus;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            enterTransitionPlus = enterTransition;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            final EnterTransition enterTransition222 = enterTransitionPlus;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        enterTransitionPlus = enterTransition;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        final EnterTransition enterTransition2222 = enterTransitionPlus;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BwAnimateVisibility$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: Helpers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.HelpersKt$BwAnimateVisibility$1 */
    static final class C106331 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ Function3<Helpers, Composer, Integer, Unit> $content;
        final /* synthetic */ long $delay;
        final /* synthetic */ SnapshotState<Boolean> $internalVisibility$delegate;
        final /* synthetic */ Function0<Unit> $onDismissed;
        final /* synthetic */ CoroutineScope $scope;

        /* JADX WARN: Multi-variable type inference failed */
        C106331(Function3<? super Helpers, ? super Composer, ? super Integer, Unit> function3, CoroutineScope coroutineScope, SnapshotState<Boolean> snapshotState, long j, Function0<Unit> function0) {
            this.$content = function3;
            this.$scope = coroutineScope;
            this.$internalVisibility$delegate = snapshotState;
            this.$delay = j;
            this.$onDismissed = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-693996243, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.BwAnimateVisibility.<anonymous> (Helpers.kt:73)");
            }
            Function3<Helpers, Composer, Integer, Unit> function3 = this.$content;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changed(this.$internalVisibility$delegate) | composer.changed(this.$delay) | composer.changed(this.$onDismissed);
            final CoroutineScope coroutineScope = this.$scope;
            final long j = this.$delay;
            final Function0<Unit> function0 = this.$onDismissed;
            final SnapshotState<Boolean> snapshotState = this.$internalVisibility$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.HelpersKt$BwAnimateVisibility$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Helpers3.C106331.invoke$lambda$1$lambda$0(coroutineScope, j, function0, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            function3.invoke(new Helpers((Function0) objRememberedValue), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, long j, Function0 function0, SnapshotState snapshotState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Helpers4(j, function0, snapshotState, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    private static final boolean BwAnimateVisibility$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final ChartSnackbarVisuals toSnackBarVisuals(ChartSnackbar chartSnackbar) {
        Intrinsics.checkNotNullParameter(chartSnackbar, "<this>");
        return new ChartSnackbarVisuals(chartSnackbar.getIcon(), chartSnackbar.getStartText(), chartSnackbar.getActionText(), chartSnackbar.getOnActionClicked(), null, 16, null);
    }
}
