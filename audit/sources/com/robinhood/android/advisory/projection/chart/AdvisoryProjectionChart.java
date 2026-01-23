package com.robinhood.android.advisory.projection.chart;

import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotDoubleState2;
import androidx.compose.runtime.SnapshotDoubleState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.advisory.p304db.projection.ProjectedValues;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryProjectionChart.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\u0010\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"AdvisoryProjectionChart", "", "values", "Lcom/robinhood/models/advisory/db/projection/ProjectedValues;", "currentPortfolioValue", "Ljava/math/BigDecimal;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "", "depositFrequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "currency", "Ljava/util/Currency;", "areValuesRelative", "", "currentYear", "", "onYearSelected", "Lkotlin/Function2;", "Lcom/robinhood/android/advisory/projection/chart/EndOfYearProjectionValue;", "modifier", "Landroidx/compose/ui/Modifier;", "numYears", "isLoading", "initialSelectedYear", "topLabel", "Lcom/robinhood/android/advisory/projection/chart/ChartTopLabel;", "userEndOfYearAge", "(Lcom/robinhood/models/advisory/db/projection/ProjectedValues;Ljava/math/BigDecimal;DLcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;Ljava/util/Currency;ZILkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;IZILcom/robinhood/android/advisory/projection/chart/ChartTopLabel;ILandroidx/compose/runtime/Composer;III)V", "feature-projected-returns_externalDebug", "selectedYear", "chartWidthPx", "currentValues", "debouncedCurrentValues", "currentMaxValue", "gridIncrements", "", "chartPoints", "Lcom/robinhood/android/advisory/projection/chart/ChartPoints;", "isLoadingAnimationFinished", "hasLoggedAppearEvent", "maxGridIncrementsRowHeight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryProjectionChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryProjectionChart$lambda$45(ProjectedValues projectedValues, BigDecimal bigDecimal, double d, SimulateDepositFrequency simulateDepositFrequency, Currency currency, boolean z, int i, Function2 function2, Modifier modifier, int i2, boolean z2, int i3, ChartModels3 chartModels3, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        AdvisoryProjectionChart(projectedValues, bigDecimal, d, simulateDepositFrequency, currency, z, i, function2, modifier, i2, z2, i3, chartModels3, i4, composer, RecomposeScopeImpl4.updateChangedFlags(i5 | 1), RecomposeScopeImpl4.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryProjectionChart(final ProjectedValues values, final BigDecimal currentPortfolioValue, final double d, final SimulateDepositFrequency depositFrequency, final Currency currency, final boolean z, final int i, final Function2<? super Integer, ? super EndOfYearProjectionValue, Unit> onYearSelected, Modifier modifier, int i2, boolean z2, int i3, ChartModels3 chartModels3, int i4, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        final Modifier modifier2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        ChartModels3 chartModels32;
        int i22;
        int i23;
        HapticFeedback hapticFeedback;
        Modifier modifier3;
        EventLogger current;
        int i24;
        Object objRememberedValue;
        SnapshotIntState2 snapshotIntState2;
        Object objRememberedValue2;
        Composer.Companion companion;
        Object objRememberedValue3;
        SnapshotState4 snapshotState4RememberDebouncedState;
        Object objRememberedValue4;
        SnapshotState snapshotState;
        Animatable animatable;
        Object objRememberedValue5;
        SnapshotDoubleState2 snapshotDoubleState2;
        Object objRememberedValue6;
        Density density;
        Object objRememberedValue7;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotState snapshotState2;
        Object objRememberedValue8;
        SnapshotState snapshotState3;
        int i25;
        float f;
        Animatable animatable2;
        Object objRememberedValue9;
        Animatable animatable3;
        Object objRememberedValue10;
        SnapshotState snapshotState4;
        Object objRememberedValue11;
        SnapshotState snapshotState5;
        int i26;
        int i27;
        int i28;
        int i29;
        Object objRememberedValue12;
        SnapshotState snapshotState6;
        Density density2;
        int i30;
        int i31;
        int i32;
        int i33;
        Modifier modifier4;
        EventLogger eventLogger;
        SnapshotState snapshotState7;
        Animatable animatable4;
        Animatable animatable5;
        HapticFeedback hapticFeedback2;
        SnapshotState snapshotState8;
        boolean z4;
        Composer composer2;
        HapticFeedback hapticFeedback3;
        boolean zChanged;
        Object objRememberedValue13;
        Animatable animatable6;
        Animatable animatable7;
        boolean zChangedInstance;
        Object objRememberedValue14;
        SnapshotState snapshotState9;
        boolean z5;
        Animatable animatable8;
        Animatable animatable9;
        boolean z6;
        ChartModels3 chartModels33;
        int i34;
        Object objRememberedValue15;
        Modifier modifier5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue16;
        final int i35;
        final ChartModels3 chartModels34;
        final boolean z7;
        final int i36;
        final int i37;
        float f2;
        SnapshotIntState2 snapshotIntState22;
        SnapshotIntState2 snapshotIntState23;
        final SnapshotIntState2 snapshotIntState24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(currentPortfolioValue, "currentPortfolioValue");
        Intrinsics.checkNotNullParameter(depositFrequency, "depositFrequency");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(onYearSelected, "onYearSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(323617085);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(values) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(currentPortfolioValue) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= 384;
        } else if ((i5 & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(d) ? 256 : 128;
        }
        if ((i7 & 8) != 0) {
            i8 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(depositFrequency.ordinal()) ? 2048 : 1024;
        }
        if ((i7 & 16) != 0) {
            i8 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(currency) ? 16384 : 8192;
        }
        if ((i7 & 32) != 0) {
            i8 |= 196608;
        } else if ((i5 & 196608) == 0) {
            i8 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i7 & 64) == 0) {
            if ((i5 & 1572864) == 0) {
                i8 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
            }
            if ((i7 & 128) == 0) {
                i8 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                i8 |= composerStartRestartGroup.changedInstance(onYearSelected) ? 8388608 : 4194304;
            }
            i9 = i7 & 256;
            if (i9 == 0) {
                i8 |= 100663296;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i5 & 100663296) == 0) {
                    i8 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                }
            }
            i10 = i7 & 512;
            if (i10 == 0) {
                i8 |= 805306368;
            } else if ((i5 & 805306368) == 0) {
                i8 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
            }
            i11 = i7 & 1024;
            if (i11 == 0) {
                i13 = i6 | 6;
                i12 = i11;
            } else if ((i6 & 6) == 0) {
                i12 = i11;
                i13 = i6 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
            } else {
                i12 = i11;
                i13 = i6;
            }
            i14 = i7 & 2048;
            if (i14 == 0) {
                i13 |= 48;
                i15 = i14;
            } else if ((i6 & 48) == 0) {
                i15 = i14;
                i13 |= composerStartRestartGroup.changed(i3) ? 32 : 16;
            } else {
                i15 = i14;
            }
            int i38 = i13;
            i16 = i7 & 4096;
            if (i16 == 0) {
                i17 = i38 | 384;
            } else if ((i6 & 384) == 0) {
                i17 = i38 | (composerStartRestartGroup.changed(chartModels3 == null ? -1 : chartModels3.ordinal()) ? 256 : 128);
            } else {
                i17 = i38;
            }
            i18 = i7 & 8192;
            if (i18 == 0) {
                i19 = i17 | 3072;
            } else {
                int i39 = i17;
                if ((i6 & 3072) == 0) {
                    i39 |= composerStartRestartGroup.changed(i4) ? 2048 : 1024;
                }
                i19 = i39;
            }
            if ((i8 & 306783379) != 306783378 && (i19 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                i37 = i2;
                i36 = i3;
                chartModels34 = chartModels3;
                i35 = i4;
                composer2 = composerStartRestartGroup;
                z7 = z2;
            } else {
                Modifier modifier6 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                i20 = i10 == 0 ? 30 : i2;
                z3 = i12 == 0 ? true : z2;
                i21 = i15 == 0 ? 30 : i3;
                chartModels32 = i16 == 0 ? ChartModels3.YEAR : chartModels3;
                i22 = i18 == 0 ? 0 : i4;
                if (ComposerKt.isTraceInProgress()) {
                    i23 = 0;
                } else {
                    i23 = 0;
                    ComposerKt.traceEventStart(323617085, i8, i19, "com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChart (AdvisoryProjectionChart.kt:65)");
                }
                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                int i40 = i19;
                modifier3 = modifier6;
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(3);
                composerStartRestartGroup.startReplaceGroup(5004770);
                i24 = (i40 & 112) != 32 ? 1 : i23;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i24 == 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotIntState2 snapshotIntState25 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(ChartUtils.toAbsoluteValues(z, values, currentPortfolioValue, d), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState snapshotState10 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                snapshotState4RememberDebouncedState = ChartComponentsKt.rememberDebouncedState(AdvisoryProjectionChart$lambda$7(snapshotState10), 0L, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                    snapshotState = snapshotState10;
                    Object objAnimatable$default = Animatable2.Animatable$default(1.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objAnimatable$default);
                    objRememberedValue4 = objAnimatable$default;
                } else {
                    snapshotState = snapshotState10;
                }
                animatable = (Animatable) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotDoubleState3.mutableDoubleStateOf(ChartUtils.getMaxValue(values));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotDoubleState2 = (SnapshotDoubleState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 != companion.getEmpty()) {
                    density = density3;
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(ChartUtils.makeGridIncrements(currentPortfolioValue.doubleValue(), snapshotDoubleState2.getDoubleValue()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    density = density3;
                }
                SnapshotState snapshotState11 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 != companion.getEmpty()) {
                    int i41 = i20;
                    i20 = i41;
                    snapshotMutationPolicy = null;
                    objRememberedValue7 = SnapshotState3.mutableStateOf$default(ChartUtils.calculateChartPoints(AdvisoryProjectionChart$lambda$7(snapshotState), currentPortfolioValue.doubleValue(), i41, ((Number) CollectionsKt.first((List) AdvisoryProjectionChart$lambda$15(snapshotState11))).doubleValue(), ((Number) CollectionsKt.last((List) AdvisoryProjectionChart$lambda$15(snapshotState11))).doubleValue()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    snapshotMutationPolicy = null;
                }
                snapshotState2 = (SnapshotState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 != companion.getEmpty()) {
                    snapshotState3 = snapshotState11;
                    i25 = 2;
                    f = 0.0f;
                    objRememberedValue8 = Animatable2.Animatable$default(0.5f, 0.0f, 2, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    snapshotState3 = snapshotState11;
                    i25 = 2;
                    f = 0.0f;
                }
                animatable2 = (Animatable) objRememberedValue8;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = Animatable2.Animatable$default(0.5f, f, i25, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                animatable3 = (Animatable) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i25, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                snapshotState4 = (SnapshotState) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i25, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                snapshotState5 = (SnapshotState) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(z);
                Double dValueOf = Double.valueOf(d);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                i26 = i8 & 896;
                i27 = i40 & 14;
                i28 = 1879048192 & i8;
                i29 = ((i8 & 458752) != 131072 ? 1 : i23) | (composerStartRestartGroup.changedInstance(values) ? 1 : 0) | (composerStartRestartGroup.changedInstance(currentPortfolioValue) ? 1 : 0) | (i26 != 256 ? 1 : i23) | (i27 != 4 ? 1 : i23) | ((i8 & 7168) != 2048 ? 1 : i23) | (composerStartRestartGroup.changedInstance(current) ? 1 : 0) | (composerStartRestartGroup.changed(snapshotState4RememberDebouncedState) ? 1 : 0) | (i28 != 536870912 ? 1 : i23) | (composerStartRestartGroup.changedInstance(animatable) ? 1 : 0);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (i29 == 0 || objRememberedValue12 == companion.getEmpty()) {
                    snapshotState6 = snapshotState3;
                    density2 = density;
                    i30 = i26;
                    i31 = i27;
                    i32 = i28;
                    i33 = i8;
                    boolean z8 = z3;
                    modifier4 = modifier3;
                    eventLogger = current;
                    snapshotState7 = snapshotState2;
                    animatable4 = animatable2;
                    animatable5 = animatable3;
                    hapticFeedback2 = hapticFeedback;
                    snapshotState8 = snapshotState;
                    Object advisoryProjectionChart2 = new AdvisoryProjectionChart2(z, values, currentPortfolioValue, d, z8, depositFrequency, eventLogger, i20, animatable, snapshotState5, snapshotState4RememberDebouncedState, snapshotState8, snapshotDoubleState2, snapshotState6, snapshotState7, null);
                    z4 = z8;
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(advisoryProjectionChart2);
                    objRememberedValue12 = advisoryProjectionChart2;
                } else {
                    snapshotState6 = snapshotState3;
                    density2 = density;
                    eventLogger = current;
                    i30 = i26;
                    composer2 = composerStartRestartGroup;
                    i31 = i27;
                    i32 = i28;
                    i33 = i8;
                    z4 = z3;
                    modifier4 = modifier3;
                    snapshotState7 = snapshotState2;
                    animatable4 = animatable2;
                    animatable5 = animatable3;
                    hapticFeedback2 = hapticFeedback;
                    snapshotState8 = snapshotState;
                }
                composer2.endReplaceGroup();
                int i42 = i33 >> 12;
                EffectsKt.LaunchedEffect(values, boolValueOf, dValueOf, (Function2) objRememberedValue12, composer2, (i33 & 14) | (i42 & 112) | i30);
                Integer numValueOf = Integer.valueOf(snapshotIntState2.getIntValue());
                ProjectedValues projectedValuesAdvisoryProjectionChart$lambda$7 = AdvisoryProjectionChart$lambda$7(snapshotState8);
                composer2.startReplaceGroup(-1224400529);
                hapticFeedback3 = hapticFeedback2;
                zChanged = composer2.changed(snapshotIntState2) | ((i33 & 29360128) != 8388608) | composer2.changedInstance(hapticFeedback3);
                objRememberedValue13 = composer2.rememberedValue();
                if (!zChanged || objRememberedValue13 == companion.getEmpty()) {
                    objRememberedValue13 = new AdvisoryProjectionChart3(onYearSelected, hapticFeedback3, snapshotState8, snapshotIntState2, null);
                    composer2.updateRememberedValue(objRememberedValue13);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf, projectedValuesAdvisoryProjectionChart$lambda$7, (Function2) objRememberedValue13, composer2, 0);
                Boolean boolValueOf2 = Boolean.valueOf(z4);
                ChartPoints chartPointsAdvisoryProjectionChart$lambda$18 = AdvisoryProjectionChart$lambda$18(snapshotState7);
                composer2.startReplaceGroup(-1224400529);
                int i43 = i31;
                animatable6 = animatable4;
                animatable7 = animatable5;
                zChangedInstance = (i43 != 4) | composer2.changedInstance(animatable6) | composer2.changedInstance(animatable7);
                objRememberedValue14 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue14 == companion.getEmpty()) {
                    snapshotState9 = snapshotState4;
                    objRememberedValue14 = new AdvisoryProjectionChart4(z4, snapshotState7, animatable6, animatable7, snapshotState9, null);
                    z5 = z4;
                    animatable8 = animatable6;
                    animatable9 = animatable7;
                    composer2.updateRememberedValue(objRememberedValue14);
                } else {
                    animatable8 = animatable6;
                    animatable9 = animatable7;
                    snapshotState9 = snapshotState4;
                    z5 = z4;
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, chartPointsAdvisoryProjectionChart$lambda$18, (Function2) objRememberedValue14, composer2, i43);
                if (z5 && AdvisoryProjectionChart$lambda$23(snapshotState9)) {
                    composer2.startReplaceGroup(-1315371900);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue17 = composer2.rememberedValue();
                    if (objRememberedValue17 == companion.getEmpty()) {
                        objRememberedValue17 = SnapshotIntState3.mutableIntStateOf(0);
                        composer2.updateRememberedValue(objRememberedValue17);
                    }
                    SnapshotIntState2 snapshotIntState26 = (SnapshotIntState2) objRememberedValue17;
                    composer2.endReplaceGroup();
                    float fMo5013toDpu2uoSUM = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState26.getIntValue());
                    composer2.startReplaceGroup(1758686160);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i44 = BentoTheme.$stable;
                    Density density4 = density2;
                    float fMo5016toPx0680j_4 = density4.mo5016toPx0680j_4(bentoTheme.getSpacing(composer2, i44).m21596getXxlargeD9Ej5fM());
                    composer2.endReplaceGroup();
                    z6 = z5;
                    Modifier modifier7 = modifier4;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null);
                    composer2.startReplaceGroup(-1224400529);
                    int i45 = i32;
                    boolean zChanged2 = composer2.changed(fMo5016toPx0680j_4) | (i45 == 536870912) | composer2.changed(snapshotIntState2) | composer2.changedInstance(eventLogger);
                    Object objRememberedValue18 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue18 == companion.getEmpty()) {
                        f2 = fM7995constructorimpl;
                        snapshotIntState22 = snapshotIntState25;
                        objRememberedValue18 = new AdvisoryProjectionChart5(fMo5016toPx0680j_4, i20, f2, eventLogger, snapshotIntState22, snapshotIntState2);
                        composer2.updateRememberedValue(objRememberedValue18);
                    } else {
                        f2 = fM7995constructorimpl;
                        snapshotIntState22 = snapshotIntState25;
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, "drag", (PointerInputEventHandler) objRememberedValue18);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChanged3 = composer2.changed(fMo5016toPx0680j_4) | (i45 == 536870912) | composer2.changed(snapshotIntState2) | composer2.changedInstance(eventLogger);
                    Object objRememberedValue19 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue19 == companion.getEmpty()) {
                        snapshotIntState23 = snapshotIntState2;
                        objRememberedValue19 = new AdvisoryProjectionChart6(fMo5016toPx0680j_4, i20, f2, eventLogger, snapshotIntState22, snapshotIntState23);
                        snapshotIntState24 = snapshotIntState22;
                        composer2.updateRememberedValue(objRememberedValue19);
                    } else {
                        snapshotIntState23 = snapshotIntState2;
                        snapshotIntState24 = snapshotIntState22;
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput, "tap", (PointerInputEventHandler) objRememberedValue19);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPointerInput2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Crossfade.Crossfade(AdvisoryProjectionChart$lambda$15(snapshotState6), (Modifier) null, AnimationSpecKt.tween$default(500, 0, null, 6, null), "grid_cross_fade", ComposableLambda3.rememberComposableLambda(1832732850, true, new AdvisoryProjectionChart7(currency, boxScopeInstance, snapshotIntState26), composer2, 54), composer2, 28032, 2);
                    ChartPoints chartPointsAdvisoryProjectionChart$lambda$182 = AdvisoryProjectionChart$lambda$18(snapshotState7);
                    int intValue = snapshotIntState23.getIntValue();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    float f3 = fMo5013toDpu2uoSUM / 2;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), companion2.getBottomCenter()), bentoTheme.getSpacing(composer2, i44).m21596getXxlargeD9Ej5fM(), C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer2, i44).m21592getMediumD9Ej5fM() + C2002Dp.m7995constructorimpl(f3)), bentoTheme.getSpacing(composer2, i44).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer2, i44).m21592getMediumD9Ej5fM() + C2002Dp.m7995constructorimpl(f3)));
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue20 = composer2.rememberedValue();
                    if (objRememberedValue20 == companion.getEmpty()) {
                        objRememberedValue20 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$44$lambda$43$lambda$42(snapshotIntState24, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue20);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    ChartComponentsKt.m11209ProjectionChartjt2gSs(chartPointsAdvisoryProjectionChart$lambda$182, intValue, OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5145paddingqDBjuR0, (Function1) objRememberedValue20), f2, composer3, 3072, 0);
                    ChartComponentsKt.m11207ChartBottomLabelsdjqsMU(i20, bentoTheme.getSpacing(composer2, i44).m21596getXxlargeD9Ej5fM(), bentoTheme.getSpacing(composer2, i44).m21592getMediumD9Ej5fM(), boxScopeInstance.align(companion4, companion2.getBottomCenter()), composer3, (i33 >> 27) & 14, 0);
                    ChartModels3 chartModels35 = chartModels32;
                    int i46 = i22;
                    ChartComponentsKt.ChartTopLabels(chartModels35, i46, i, snapshotIntState23.getIntValue(), i20, snapshotIntState24.getIntValue(), density4, PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion2.getTopStart()), bentoTheme.getSpacing(composer2, i44).m21596getXxlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i44).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i44).m21597getXxsmallD9Ej5fM(), 2, null), composer2, ((i40 >> 6) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i42 & 896) | ((i33 >> 15) & 57344), 0);
                    chartModels33 = chartModels35;
                    i34 = i46;
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    modifier5 = modifier7;
                } else {
                    z6 = z5;
                    chartModels33 = chartModels32;
                    i34 = i22;
                    Modifier modifier8 = modifier4;
                    composer2.startReplaceGroup(-1316240086);
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue15 = composer2.rememberedValue();
                    if (objRememberedValue15 == companion.getEmpty()) {
                        objRememberedValue15 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue15);
                    }
                    final SnapshotState snapshotState12 = (SnapshotState) objRememberedValue15;
                    composer2.endReplaceGroup();
                    modifier5 = modifier8;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i47 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxSize$default2, bentoTheme2.getSpacing(composer2, i47).m21596getXxlargeD9Ej5fM(), C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer2, i47).m21592getMediumD9Ej5fM() + ((C2002Dp) snapshotState12.getValue()).getValue()));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor2);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    objRememberedValue16 = composer2.rememberedValue();
                    if (objRememberedValue16 == companion.getEmpty()) {
                        objRememberedValue16 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$34$lambda$33$lambda$32(snapshotState12, (C2002Dp) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue16);
                    }
                    composer2.endReplaceGroup();
                    ChartComponentsKt.ExtraVerticalPadding(null, (Function1) objRememberedValue16, composer2, 48, 1);
                    ChartComponentsKt.m11208GlowingDotNRI76As(new Point(((Number) animatable8.getValue()).floatValue(), ((Number) animatable9.getValue()).floatValue()), null, 0L, 0.0f, 0.0f, true, 0, composer2, Point.$stable | 196608, 94);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i35 = i34;
                modifier2 = modifier5;
                chartModels34 = chartModels33;
                z7 = z6;
                i36 = i21;
                i37 = i20;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$45(values, currentPortfolioValue, d, depositFrequency, currency, z, i, onYearSelected, modifier2, i37, z7, i36, chartModels34, i35, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i8 |= 1572864;
        if ((i7 & 128) == 0) {
        }
        i9 = i7 & 256;
        if (i9 == 0) {
        }
        i10 = i7 & 512;
        if (i10 == 0) {
        }
        i11 = i7 & 1024;
        if (i11 == 0) {
        }
        i14 = i7 & 2048;
        if (i14 == 0) {
        }
        int i382 = i13;
        i16 = i7 & 4096;
        if (i16 == 0) {
        }
        i18 = i7 & 8192;
        if (i18 == 0) {
        }
        if ((i8 & 306783379) != 306783378) {
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Density density32 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            int i402 = i19;
            modifier3 = modifier6;
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i402 & 112) != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i24 == 0) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(i21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                SnapshotIntState2 snapshotIntState252 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                SnapshotState snapshotState102 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                snapshotState4RememberDebouncedState = ChartComponentsKt.rememberDebouncedState(AdvisoryProjectionChart$lambda$7(snapshotState102), 0L, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                }
                animatable = (Animatable) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotDoubleState2 = (SnapshotDoubleState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 != companion.getEmpty()) {
                }
                SnapshotState snapshotState112 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 != companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 != companion.getEmpty()) {
                }
                animatable2 = (Animatable) objRememberedValue8;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                }
                animatable3 = (Animatable) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                }
                snapshotState5 = (SnapshotState) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf3 = Boolean.valueOf(z);
                Double dValueOf2 = Double.valueOf(d);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                i26 = i8 & 896;
                i27 = i402 & 14;
                i28 = 1879048192 & i8;
                i29 = ((i8 & 458752) != 131072 ? 1 : i23) | (composerStartRestartGroup.changedInstance(values) ? 1 : 0) | (composerStartRestartGroup.changedInstance(currentPortfolioValue) ? 1 : 0) | (i26 != 256 ? 1 : i23) | (i27 != 4 ? 1 : i23) | ((i8 & 7168) != 2048 ? 1 : i23) | (composerStartRestartGroup.changedInstance(current) ? 1 : 0) | (composerStartRestartGroup.changed(snapshotState4RememberDebouncedState) ? 1 : 0) | (i28 != 536870912 ? 1 : i23) | (composerStartRestartGroup.changedInstance(animatable) ? 1 : 0);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (i29 == 0) {
                    snapshotState6 = snapshotState3;
                    density2 = density;
                    i30 = i26;
                    i31 = i27;
                    i32 = i28;
                    i33 = i8;
                    boolean z82 = z3;
                    modifier4 = modifier3;
                    eventLogger = current;
                    snapshotState7 = snapshotState2;
                    animatable4 = animatable2;
                    animatable5 = animatable3;
                    hapticFeedback2 = hapticFeedback;
                    snapshotState8 = snapshotState;
                    Object advisoryProjectionChart22 = new AdvisoryProjectionChart2(z, values, currentPortfolioValue, d, z82, depositFrequency, eventLogger, i20, animatable, snapshotState5, snapshotState4RememberDebouncedState, snapshotState8, snapshotDoubleState2, snapshotState6, snapshotState7, null);
                    z4 = z82;
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(advisoryProjectionChart22);
                    objRememberedValue12 = advisoryProjectionChart22;
                    composer2.endReplaceGroup();
                    int i422 = i33 >> 12;
                    EffectsKt.LaunchedEffect(values, boolValueOf3, dValueOf2, (Function2) objRememberedValue12, composer2, (i33 & 14) | (i422 & 112) | i30);
                    Integer numValueOf2 = Integer.valueOf(snapshotIntState2.getIntValue());
                    ProjectedValues projectedValuesAdvisoryProjectionChart$lambda$72 = AdvisoryProjectionChart$lambda$7(snapshotState8);
                    composer2.startReplaceGroup(-1224400529);
                    hapticFeedback3 = hapticFeedback2;
                    zChanged = composer2.changed(snapshotIntState2) | ((i33 & 29360128) != 8388608) | composer2.changedInstance(hapticFeedback3);
                    objRememberedValue13 = composer2.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue13 = new AdvisoryProjectionChart3(onYearSelected, hapticFeedback3, snapshotState8, snapshotIntState2, null);
                        composer2.updateRememberedValue(objRememberedValue13);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(numValueOf2, projectedValuesAdvisoryProjectionChart$lambda$72, (Function2) objRememberedValue13, composer2, 0);
                        Boolean boolValueOf22 = Boolean.valueOf(z4);
                        ChartPoints chartPointsAdvisoryProjectionChart$lambda$183 = AdvisoryProjectionChart$lambda$18(snapshotState7);
                        composer2.startReplaceGroup(-1224400529);
                        int i432 = i31;
                        animatable6 = animatable4;
                        animatable7 = animatable5;
                        zChangedInstance = (i432 != 4) | composer2.changedInstance(animatable6) | composer2.changedInstance(animatable7);
                        objRememberedValue14 = composer2.rememberedValue();
                        if (zChangedInstance) {
                            snapshotState9 = snapshotState4;
                            objRememberedValue14 = new AdvisoryProjectionChart4(z4, snapshotState7, animatable6, animatable7, snapshotState9, null);
                            z5 = z4;
                            animatable8 = animatable6;
                            animatable9 = animatable7;
                            composer2.updateRememberedValue(objRememberedValue14);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf22, chartPointsAdvisoryProjectionChart$lambda$183, (Function2) objRememberedValue14, composer2, i432);
                            if (z5) {
                                z6 = z5;
                                chartModels33 = chartModels32;
                                i34 = i22;
                                Modifier modifier82 = modifier4;
                                composer2.startReplaceGroup(-1316240086);
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue15 = composer2.rememberedValue();
                                if (objRememberedValue15 == companion.getEmpty()) {
                                }
                                final SnapshotState snapshotState122 = (SnapshotState) objRememberedValue15;
                                composer2.endReplaceGroup();
                                modifier5 = modifier82;
                                Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                int i472 = BentoTheme.$stable;
                                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxSize$default22, bentoTheme22.getSpacing(composer2, i472).m21596getXxlargeD9Ej5fM(), C2002Dp.m7995constructorimpl(bentoTheme22.getSpacing(composer2, i472).m21592getMediumD9Ej5fM() + ((C2002Dp) snapshotState122.getValue()).getValue()));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN42);
                                ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                                if (composer2.getApplier() == null) {
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion52.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier22, companion52.getSetModifier());
                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceGroup(5004770);
                                    objRememberedValue16 = composer2.rememberedValue();
                                    if (objRememberedValue16 == companion.getEmpty()) {
                                    }
                                    composer2.endReplaceGroup();
                                    ChartComponentsKt.ExtraVerticalPadding(null, (Function1) objRememberedValue16, composer2, 48, 1);
                                    ChartComponentsKt.m11208GlowingDotNRI76As(new Point(((Number) animatable8.getValue()).floatValue(), ((Number) animatable9.getValue()).floatValue()), null, 0L, 0.0f, 0.0f, true, 0, composer2, Point.$stable | 196608, 94);
                                    composer2.endNode();
                                    composer2.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i35 = i34;
                                    modifier2 = modifier5;
                                    chartModels34 = chartModels33;
                                    z7 = z6;
                                    i36 = i21;
                                    i37 = i20;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final List<Double> AdvisoryProjectionChart$lambda$15(SnapshotState<List<Double>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChartPoints AdvisoryProjectionChart$lambda$18(SnapshotState<ChartPoints> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean AdvisoryProjectionChart$lambda$23(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvisoryProjectionChart$lambda$26(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProjectedValues AdvisoryProjectionChart$lambda$7(SnapshotState<ProjectedValues> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProjectedValues AdvisoryProjectionChart$lambda$9(SnapshotState4<ProjectedValues> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryProjectionChart$lambda$24(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryProjectionChart$lambda$27(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryProjectionChart$lambda$34$lambda$33$lambda$32(SnapshotState snapshotState, C2002Dp c2002Dp) {
        snapshotState.setValue(c2002Dp);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryProjectionChart$lambda$44$lambda$43$lambda$42(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) (coordinates.mo7241getSizeYbymL2g() >> 32));
        return Unit.INSTANCE;
    }
}
