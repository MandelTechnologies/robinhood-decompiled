package com.robinhood.android.lib.performancechart;

import android.content.Context;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.contracts.AccountMarketValuesContract;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.compose.LocalityStringResources2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: PerformanceChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¶\u0002\u0010$\u001a\u00020\u00132\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n22\b\u0002\u0010\u0015\u001a,\u0012\u0004\u0012\u00020\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r¢\u0006\u0002\b\u00142#\b\u0002\u0010\u0017\u001a\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0018\u001a\u00020\b2#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r¢\u0006\u0002\b\u00142\u001b\b\u0002\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001a¢\u0006\u0002\b\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b$\u0010%\u001a]\u0010/\u001a\u00020\u0013*\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001c2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u001a2\u0006\u0010.\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u00102\u001a\u00020\u0000*\u000201H\u0002¢\u0006\u0004\b2\u00103¨\u00066²\u0006\f\u00105\u001a\u0002048\nX\u008a\u0084\u0002"}, m3636d2 = {"", "accountNumber", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "chartType", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "marketValuesType", "Landroidx/compose/ui/Modifier;", "modifier", "", "allowFxTooltip", "Landroidx/compose/animation/core/AnimationSpec;", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "animationSpec", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/RowScope;", "Lcom/robinhood/models/util/Money;", "Lkotlin/ParameterName;", "name", "usdAmount", "", "Lkotlin/ExtensionFunctionType;", "fxTooltipContent", "Landroidx/compose/foundation/layout/ColumnScope;", "headerContent", "auraEnabled", "trailingChartValuesContent", "Lkotlin/Function1;", "trailingButtonOverride", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "trailingButtonAccessibilityActionOverride", "Lkotlin/Function0;", "onChartLoaded", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo;", "duxo", "highlightBigNumberForFtux", "highlightChartForFtux", "PerformanceChartComposable", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Landroidx/compose/ui/Modifier;ZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;ZLkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/semantics/CustomAccessibilityAction;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Landroid/content/Context;", "context", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;", "concreteState", "trailingButton", "onMarketValuesBreakdown", "onSpanSelected", "equityString", "performanceChartAccessibility", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroid/content/Context;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;Landroidx/compose/ui/semantics/CustomAccessibilityAction;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "Lcom/robinhood/android/charts/models/db/SpanOption;", "toReadableString", "(Lcom/robinhood/android/charts/models/db/SpanOption;)Ljava/lang/String;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState;", "viewState", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PerformanceChartComposable {

    /* compiled from: PerformanceChartComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PerformanceChartType.values().length];
            try {
                iArr[PerformanceChartType.HISTORICAL_PORTFOLIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceChartType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PerformanceChartType.OPTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PerformanceChartType.EQUITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PerformanceChartType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Direction.values().length];
            try {
                iArr2[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Icon.values().length];
            try {
                iArr3[Icon.STOCK_UP_16.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Icon.STOCK_DOWN_16.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartComposable$lambda$14(String str, PerformanceChartType performanceChartType, AccountMarketValuesType accountMarketValuesType, Modifier modifier, boolean z, AnimationSpec animationSpec, Function4 function4, Function4 function42, boolean z2, Function4 function43, Function3 function3, CustomAccessibilityAction customAccessibilityAction, Function0 function0, PerformanceChartDuxo performanceChartDuxo, Boolean bool, Boolean bool2, int i, int i2, int i3, Composer composer, int i4) {
        PerformanceChartComposable(str, performanceChartType, accountMarketValuesType, modifier, z, animationSpec, function4, function42, z2, function43, function3, customAccessibilityAction, function0, performanceChartDuxo, bool, bool2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fa A[PHI: r22
      0x01fa: PHI (r22v12 int) = (r22v0 int), (r22v3 int), (r22v4 int) binds: [B:168:0x01f8, B:176:0x020e, B:175:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PerformanceChartComposable(final String str, final PerformanceChartType chartType, final AccountMarketValuesType accountMarketValuesType, Modifier modifier, boolean z, AnimationSpec<Point> animationSpec, Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function4, Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function42, boolean z2, Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function43, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, CustomAccessibilityAction customAccessibilityAction, Function0<Unit> function0, PerformanceChartDuxo performanceChartDuxo, Boolean bool, Boolean bool2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        AnimationSpec<Point> animationSpec2;
        int i7;
        Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function44;
        int i8;
        Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function45;
        int i9;
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
        Modifier modifier3;
        Composer composer2;
        PerformanceChartDuxo performanceChartDuxo2;
        Boolean bool3;
        Function0<Unit> function02;
        Boolean bool4;
        int i21;
        final PerformanceChartDuxo performanceChartDuxo3;
        CustomAccessibilityAction customAccessibilityAction2;
        AnimationSpec<Point> animationSpec3;
        Modifier modifier4;
        Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function46;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function47;
        boolean z4;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composer3;
        int i22;
        boolean z5;
        boolean zChanged;
        Object objRememberedValue;
        final PerformanceChartStateProvider3 performanceChartStateProvider3PerformanceChartComposable$lambda$0;
        final AnimationSpec<Point> animationSpec4;
        Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function48;
        Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function49;
        Function0<Unit> function03;
        Boolean bool5;
        Composer composer4;
        final Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function410;
        final Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function411;
        final boolean z6;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        final Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function412;
        final Boolean bool6;
        final boolean z7;
        final Function0<Unit> function04;
        final CustomAccessibilityAction customAccessibilityAction3;
        final Boolean bool7;
        final PerformanceChartDuxo performanceChartDuxo4;
        final Modifier modifier5;
        PerformanceChartStateProvider3 performanceChartStateProvider3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Composer composerStartRestartGroup = composer.startRestartGroup(102201369);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(chartType.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(accountMarketValuesType == null ? -1 : accountMarketValuesType.ordinal()) ? 256 : 128;
        }
        int i23 = i3 & 8;
        if (i23 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z3 = z;
                    i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                int i24 = 196608;
                if (i6 != 0) {
                    i4 |= 196608;
                    animationSpec2 = animationSpec;
                } else {
                    animationSpec2 = animationSpec;
                    if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(animationSpec2) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function44 = function4;
                } else {
                    function44 = function4;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function44) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    function45 = function42;
                } else {
                    function45 = function42;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function45) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else {
                    if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= composerStartRestartGroup.changedInstance(function43) ? 536870912 : 268435456;
                    }
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i14 = i2 | 6;
                        i13 = i12;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i14 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(customAccessibilityAction) : composerStartRestartGroup.changedInstance(customAccessibilityAction) ? 32 : 16;
                    }
                    int i25 = i14;
                    i16 = i3 & 4096;
                    if (i16 != 0) {
                        i17 = i25;
                        if ((i2 & 384) == 0) {
                            i17 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
                        }
                        if ((i2 & 3072) == 0) {
                            i17 |= ((i3 & 8192) == 0 && composerStartRestartGroup.changedInstance(performanceChartDuxo)) ? 2048 : 1024;
                        }
                        int i26 = i17;
                        i18 = i3 & 16384;
                        if (i18 != 0) {
                            i19 = i26 | 24576;
                        } else if ((i2 & 24576) == 0) {
                            i19 = i26 | (composerStartRestartGroup.changed(bool) ? 16384 : 8192);
                        } else {
                            i19 = i26;
                        }
                        i20 = i3 & 32768;
                        if (i20 != 0) {
                            i19 |= i24;
                        } else if ((i2 & 196608) == 0) {
                            i24 = composerStartRestartGroup.changed(bool2) ? 131072 : 65536;
                            i19 |= i24;
                        }
                        int i27 = i19;
                        if ((i4 & 306783379) == 306783378 && (74899 & i27) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z6 = z2;
                            function412 = function43;
                            performanceChartDuxo4 = performanceChartDuxo;
                            bool7 = bool2;
                            composer4 = composerStartRestartGroup;
                            modifier5 = modifier2;
                            function411 = function44;
                            function410 = function45;
                            z7 = z3;
                            animationSpec4 = animationSpec2;
                            function33 = function3;
                            customAccessibilityAction3 = customAccessibilityAction;
                            function04 = function0;
                            bool6 = bool;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier6 = i23 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    z3 = false;
                                }
                                if (i6 != 0) {
                                    animationSpec2 = null;
                                }
                                if (i7 != 0) {
                                    function44 = null;
                                }
                                if (i8 != 0) {
                                    function45 = null;
                                }
                                boolean z8 = i9 == 0 ? false : z2;
                                Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function413 = i11 == 0 ? null : function43;
                                Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34 = i13 == 0 ? null : function3;
                                CustomAccessibilityAction customAccessibilityAction4 = i15 == 0 ? null : customAccessibilityAction;
                                Function0<Unit> function05 = i16 == 0 ? null : function0;
                                if ((i3 & 8192) == 0) {
                                    modifier3 = modifier6;
                                    String str2 = str + chartType.getServerValue();
                                    composerStartRestartGroup.startReplaceGroup(-747520797);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PerformanceChartDuxo.class), current, str2, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                    composer2 = composerStartRestartGroup;
                                    composer2.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composer2.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$PerformanceChartComposable$$inlined$duxo$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$PerformanceChartComposable$$inlined$duxo$1.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                                    composer2.endReplaceGroup();
                                    performanceChartDuxo2 = (PerformanceChartDuxo) baseDuxo;
                                    i27 &= -7169;
                                } else {
                                    modifier3 = modifier6;
                                    composer2 = composerStartRestartGroup;
                                    performanceChartDuxo2 = performanceChartDuxo;
                                }
                                Function0<Unit> function06 = function05;
                                bool3 = i18 == 0 ? null : bool;
                                function02 = function06;
                                if (i20 == 0) {
                                    i21 = i27;
                                    performanceChartDuxo3 = performanceChartDuxo2;
                                    customAccessibilityAction2 = customAccessibilityAction4;
                                    animationSpec3 = animationSpec2;
                                    modifier4 = modifier3;
                                    bool4 = null;
                                } else {
                                    bool4 = bool2;
                                    i21 = i27;
                                    performanceChartDuxo3 = performanceChartDuxo2;
                                    customAccessibilityAction2 = customAccessibilityAction4;
                                    animationSpec3 = animationSpec2;
                                    modifier4 = modifier3;
                                }
                                function46 = function413;
                                function32 = function34;
                                function47 = function45;
                                z4 = z8;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 8192) != 0) {
                                    i27 &= -7169;
                                }
                                function32 = function3;
                                customAccessibilityAction2 = customAccessibilityAction;
                                function02 = function0;
                                performanceChartDuxo3 = performanceChartDuxo;
                                bool3 = bool;
                                bool4 = bool2;
                                composer2 = composerStartRestartGroup;
                                function47 = function45;
                                animationSpec3 = animationSpec2;
                                z4 = z2;
                                function46 = function43;
                                i21 = i27;
                                modifier4 = modifier2;
                            }
                            Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function414 = function44;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(102201369, i4, i21, "com.robinhood.android.lib.performancechart.PerformanceChartComposable (PerformanceChartComposable.kt:61)");
                            }
                            final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                            final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            AnimationSpec<Point> animationSpec5 = animationSpec3;
                            final Screen screen = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                            Composer composer5 = composer2;
                            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(performanceChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer5, 0, 7);
                            Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function415 = function47;
                            composer3 = composer5;
                            composer3.startReplaceGroup(-568685655);
                            if (str == null) {
                                Boolean boolValueOf = Boolean.valueOf(z3);
                                composer3.startReplaceGroup(-1224400529);
                                final PerformanceChartDuxo performanceChartDuxo5 = performanceChartDuxo3;
                                boolean zChangedInstance2 = composer3.changedInstance(performanceChartDuxo3) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((57344 & i4) == 16384);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    final boolean z9 = z3;
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PerformanceChartComposable.PerformanceChartComposable$lambda$3$lambda$2(performanceChartDuxo5, str, chartType, accountMarketValuesType, z9, (LifecycleResumePauseEffectScope) obj);
                                        }
                                    };
                                    performanceChartDuxo3 = performanceChartDuxo5;
                                    z5 = z9;
                                    composer3.updateRememberedValue(objRememberedValue3);
                                } else {
                                    performanceChartDuxo3 = performanceChartDuxo5;
                                    z5 = z3;
                                }
                                composer3.endReplaceGroup();
                                i22 = i4;
                                LifecycleEffectKt.LifecycleResumeEffect(str, chartType, boolValueOf, null, (Function1) objRememberedValue3, composer3, ((i22 >> 6) & 896) | (i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE), 8);
                            } else {
                                i22 = i4;
                                z5 = z3;
                            }
                            composer3.endReplaceGroup();
                            PerformanceChartStateProvider3 performanceChartStateProvider3PerformanceChartComposable$lambda$02 = PerformanceChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                            composer3.startReplaceGroup(-1633490746);
                            int i28 = i21;
                            zChanged = ((i21 & 896) != 256) | composer3.changed(snapshotState4CollectAsStateWithLifecycle);
                            objRememberedValue = composer3.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PerformanceChartComposable2(function02, snapshotState4CollectAsStateWithLifecycle, null);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            int i29 = i22 & 112;
                            EffectsKt.LaunchedEffect(str, chartType, performanceChartStateProvider3PerformanceChartComposable$lambda$02, (Function2) objRememberedValue, composer3, i22 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                            performanceChartStateProvider3PerformanceChartComposable$lambda$0 = PerformanceChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                            if (performanceChartStateProvider3PerformanceChartComposable$lambda$0 instanceof PerformanceChartStateProvider3.Ready) {
                                animationSpec4 = animationSpec5;
                                function48 = function414;
                                function49 = function415;
                                function03 = function02;
                                bool5 = bool4;
                                composer3.startReplaceGroup(-445471315);
                                PerformanceChartLoadingComposable3.PerformanceChartLoadingComposable(ModifiersKt.performanceIndicator(modifier4, PerformanceChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).loadedState()), composer3, 0, 0);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-448580708);
                                final String strRegionGateStringResource = LocalityStringResources2.regionGateStringResource(EtfRegionGate.INSTANCE, C20506R.string.gated_etf_accessibility_stocks_etf_chart_type, C20506R.string.accessibility_stock_chart_type, null, composer3, 0, 8);
                                Modifier modifierPerformanceIndicator = ModifiersKt.performanceIndicator(modifier4, PerformanceChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).loadedState());
                                composer3.startReplaceGroup(-1224400529);
                                function03 = function02;
                                boolean zChangedInstance3 = ((i28 & 112) == 32 || ((i28 & 64) != 0 && composer3.changedInstance(customAccessibilityAction2))) | composer3.changedInstance(performanceChartStateProvider3PerformanceChartComposable$lambda$0) | composer3.changedInstance(context) | composer3.changedInstance(navigator) | composer3.changedInstance(screen) | (i29 == 32) | composer3.changedInstance(performanceChartDuxo3) | composer3.changed(strRegionGateStringResource);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    final CustomAccessibilityAction customAccessibilityAction5 = customAccessibilityAction2;
                                    final PerformanceChartDuxo performanceChartDuxo6 = performanceChartDuxo3;
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PerformanceChartComposable.PerformanceChartComposable$lambda$9$lambda$8(performanceChartStateProvider3PerformanceChartComposable$lambda$0, customAccessibilityAction5, context, chartType, strRegionGateStringResource, navigator, screen, performanceChartDuxo6, (SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    performanceChartStateProvider3 = performanceChartStateProvider3PerformanceChartComposable$lambda$0;
                                    composer3.updateRememberedValue(objRememberedValue4);
                                } else {
                                    performanceChartStateProvider3 = performanceChartStateProvider3PerformanceChartComposable$lambda$0;
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierPerformanceIndicator, false, (Function1) objRememberedValue4, 1, null);
                                PerformanceChartStateProvider3.Ready ready = (PerformanceChartStateProvider3.Ready) performanceChartStateProvider3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer3.changedInstance(performanceChartDuxo3);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PerformanceChartComposable.PerformanceChartComposable$lambda$11$lambda$10(performanceChartDuxo3, (String) obj);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                Function1 function1 = (Function1) objRememberedValue5;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance5 = composer3.changedInstance(performanceChartDuxo3);
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PerformanceChartComposable.PerformanceChartComposable$lambda$13$lambda$12(performanceChartDuxo3);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                Function0 function07 = (Function0) objRememberedValue6;
                                composer3.endReplaceGroup();
                                int i30 = i22 >> 12;
                                animationSpec4 = animationSpec5;
                                function49 = function415;
                                PerformanceChartReadyComposable.PerformanceChartReadyComposable(animationSpec4, ready, function414, function49, function1, function07, z4, modifierSemantics$default, function32, function46, bool3, bool4, composer3, ((i22 >> 15) & 14) | (i30 & 896) | (i30 & 7168) | (3670016 & (i22 >> 6)) | ((i28 << 24) & 234881024) | (i22 & 1879048192), (i28 >> 12) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                                function48 = function414;
                                bool5 = bool4;
                                composer3 = composer3;
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer4 = composer3;
                            function410 = function49;
                            function411 = function48;
                            z6 = z4;
                            function33 = function32;
                            function412 = function46;
                            bool6 = bool3;
                            z7 = z5;
                            function04 = function03;
                            customAccessibilityAction3 = customAccessibilityAction2;
                            bool7 = bool5;
                            performanceChartDuxo4 = performanceChartDuxo3;
                            modifier5 = modifier4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PerformanceChartComposable.PerformanceChartComposable$lambda$14(str, chartType, accountMarketValuesType, modifier5, z7, animationSpec4, function411, function410, z6, function412, function33, customAccessibilityAction3, function04, performanceChartDuxo4, bool6, bool7, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i17 = i25 | 384;
                    if ((i2 & 3072) == 0) {
                    }
                    int i262 = i17;
                    i18 = i3 & 16384;
                    if (i18 != 0) {
                    }
                    i20 = i3 & 32768;
                    if (i20 != 0) {
                    }
                    int i272 = i19;
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i23 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if ((i3 & 8192) == 0) {
                            }
                            Function0<Unit> function062 = function05;
                            bool3 = i18 == 0 ? null : bool;
                            function02 = function062;
                            if (i20 == 0) {
                            }
                            function46 = function413;
                            function32 = function34;
                            function47 = function45;
                            z4 = z8;
                            Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function4142 = function44;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                            final Context context2 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            AnimationSpec<Point> animationSpec52 = animationSpec3;
                            final Screen screen2 = ((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                            Composer composer52 = composer2;
                            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(performanceChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer52, 0, 7);
                            Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function4152 = function47;
                            composer3 = composer52;
                            composer3.startReplaceGroup(-568685655);
                            if (str == null) {
                            }
                            composer3.endReplaceGroup();
                            PerformanceChartStateProvider3 performanceChartStateProvider3PerformanceChartComposable$lambda$022 = PerformanceChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                            composer3.startReplaceGroup(-1633490746);
                            int i282 = i21;
                            zChanged = ((i21 & 896) != 256) | composer3.changed(snapshotState4CollectAsStateWithLifecycle);
                            objRememberedValue = composer3.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = new PerformanceChartComposable2(function02, snapshotState4CollectAsStateWithLifecycle, null);
                                composer3.updateRememberedValue(objRememberedValue);
                                composer3.endReplaceGroup();
                                int i292 = i22 & 112;
                                EffectsKt.LaunchedEffect(str, chartType, performanceChartStateProvider3PerformanceChartComposable$lambda$022, (Function2) objRememberedValue, composer3, i22 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                performanceChartStateProvider3PerformanceChartComposable$lambda$0 = PerformanceChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                                if (performanceChartStateProvider3PerformanceChartComposable$lambda$0 instanceof PerformanceChartStateProvider3.Ready) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer4 = composer3;
                                function410 = function49;
                                function411 = function48;
                                z6 = z4;
                                function33 = function32;
                                function412 = function46;
                                bool6 = bool3;
                                z7 = z5;
                                function04 = function03;
                                customAccessibilityAction3 = customAccessibilityAction2;
                                bool7 = bool5;
                                performanceChartDuxo4 = performanceChartDuxo3;
                                modifier5 = modifier4;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                int i252 = i14;
                i16 = i3 & 4096;
                if (i16 != 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i2622 = i17;
                i18 = i3 & 16384;
                if (i18 != 0) {
                }
                i20 = i3 & 32768;
                if (i20 != 0) {
                }
                int i2722 = i19;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            i6 = i3 & 32;
            int i242 = 196608;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            int i2522 = i14;
            i16 = i3 & 4096;
            if (i16 != 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i26222 = i17;
            i18 = i3 & 16384;
            if (i18 != 0) {
            }
            i20 = i3 & 32768;
            if (i20 != 0) {
            }
            int i27222 = i19;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 32;
        int i2422 = 196608;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        int i25222 = i14;
        i16 = i3 & 4096;
        if (i16 != 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i262222 = i17;
        i18 = i3 & 16384;
        if (i18 != 0) {
        }
        i20 = i3 & 32768;
        if (i20 != 0) {
        }
        int i272222 = i19;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult PerformanceChartComposable$lambda$3$lambda$2(PerformanceChartDuxo performanceChartDuxo, String str, PerformanceChartType performanceChartType, AccountMarketValuesType accountMarketValuesType, boolean z, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Disposable disposableBind = performanceChartDuxo.bind(str, performanceChartType, accountMarketValuesType, z);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$PerformanceChartComposable$lambda$3$lambda$2$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                disposableBind.dispose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceChartStateProvider3 PerformanceChartComposable$lambda$0(SnapshotState4<? extends PerformanceChartStateProvider3> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartComposable$lambda$9$lambda$8(final PerformanceChartStateProvider3 performanceChartStateProvider3, CustomAccessibilityAction customAccessibilityAction, final Context context, PerformanceChartType performanceChartType, String str, final Navigator navigator, final Screen screen, final PerformanceChartDuxo performanceChartDuxo, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        CustomAccessibilityAction customAccessibilityAction2 = customAccessibilityAction;
        PerformanceChartStateProvider3.Ready ready = (PerformanceChartStateProvider3.Ready) performanceChartStateProvider3;
        if (customAccessibilityAction2 == null) {
            String string2 = context.getString(C20506R.string.accessibility_action_chart_settings);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            customAccessibilityAction2 = new CustomAccessibilityAction(string2, new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(PerformanceChartComposable.PerformanceChartComposable$lambda$9$lambda$8$lambda$5(navigator, context, performanceChartStateProvider3, screen));
                }
            });
        }
        performanceChartAccessibility(semantics, context, performanceChartType, ready, customAccessibilityAction2, new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerformanceChartComposable.PerformanceChartComposable$lambda$9$lambda$8$lambda$6(performanceChartStateProvider3, navigator, context);
            }
        }, new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartComposable.PerformanceChartComposable$lambda$9$lambda$8$lambda$7(performanceChartDuxo, (String) obj);
            }
        }, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartComposable$lambda$9$lambda$8$lambda$7(PerformanceChartDuxo performanceChartDuxo, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        performanceChartDuxo.onSpanSelected(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PerformanceChartComposable$lambda$9$lambda$8$lambda$5(Navigator navigator, Context context, PerformanceChartStateProvider3 performanceChartStateProvider3, Screen screen) {
        PerformanceChartStateProvider3.Ready ready = (PerformanceChartStateProvider3.Ready) performanceChartStateProvider3;
        PerformanceChartReadyComposable.launchChartSettings(navigator, context, ready.getChartModel().getAccountNumber(), ready.getChartType(), screen);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartComposable$lambda$9$lambda$8$lambda$6(PerformanceChartStateProvider3 performanceChartStateProvider3, Navigator navigator, Context context) {
        PerformanceChartStateProvider3.Ready ready = (PerformanceChartStateProvider3.Ready) performanceChartStateProvider3;
        if (ready.getMarketValuesType() != null && ready.getActiveSpan() != null) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new AccountMarketValuesContract.Key(ready.getChartModel().getAccountNumber(), ready.getMarketValuesType(), ready.getActiveSpan()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartComposable$lambda$11$lambda$10(PerformanceChartDuxo performanceChartDuxo, String str) {
        performanceChartDuxo.onSpanSelected(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartComposable$lambda$13$lambda$12(PerformanceChartDuxo performanceChartDuxo) {
        performanceChartDuxo.onBigNumberClicked();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void performanceChartAccessibility(SemanticsPropertyReceiver semanticsPropertyReceiver, Context context, PerformanceChartType chartType, PerformanceChartStateProvider3.Ready concreteState, CustomAccessibilityAction trailingButton, final Function0<Unit> onMarketValuesBreakdown, final Function1<? super String, Unit> onSpanSelected, String equityString) {
        String string2;
        String string3;
        DisplayText description;
        IconDisplayText main;
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(concreteState, "concreteState");
        Intrinsics.checkNotNullParameter(trailingButton, "trailingButton");
        Intrinsics.checkNotNullParameter(onMarketValuesBreakdown, "onMarketValuesBreakdown");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        Intrinsics.checkNotNullParameter(equityString, "equityString");
        CursorData defaultDisplay = concreteState.getChartModel().getDefaultDisplay();
        DisplayText primary_value = defaultDisplay != null ? defaultDisplay.getPrimary_value() : null;
        CursorData defaultDisplay2 = concreteState.getChartModel().getDefaultDisplay();
        SubDisplayText secondary_value = defaultDisplay2 != null ? defaultDisplay2.getSecondary_value() : null;
        CursorData defaultDisplay3 = concreteState.getChartModel().getDefaultDisplay();
        SubDisplayText tertiary_value = defaultDisplay3 != null ? defaultDisplay3.getTertiary_value() : null;
        String string4 = context.getString(C20506R.string.accessibility_chart_content_description, primary_value != null ? primary_value.getValue() : null);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, string4);
        int i = C20506R.string.accessibility_chart_state_description;
        int i2 = WhenMappings.$EnumSwitchMapping$0[chartType.ordinal()];
        String string5 = "";
        if (i2 == 1) {
            string2 = context.getString(C20506R.string.accessibility_investing_chart_type);
        } else if (i2 == 2) {
            string2 = context.getString(C20506R.string.gated_crypto_accessibility_crypto_chart_type);
        } else if (i2 == 3) {
            string2 = context.getString(C20506R.string.gated_options_accessibility_option_chart_type);
        } else if (i2 == 4) {
            string2 = equityString;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = "";
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[concreteState.getChartModel().getPageDirection().ordinal()];
        if (i3 == 1) {
            string3 = context.getString(C20506R.string.accessibility_increase);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string3 = context.getString(C20506R.string.accessibility_decrease);
        }
        String value = (secondary_value == null || (main = secondary_value.getMain()) == null) ? null : main.getValue();
        String value2 = (secondary_value == null || (description = secondary_value.getDescription()) == null) ? null : description.getValue();
        if (value2 != null) {
            switch (value2.hashCode()) {
                case -1631148370:
                    if (value2.equals("Past 3 months")) {
                        value2 = context.getString(C20506R.string.accessibility_timespan, value2);
                        Intrinsics.checkNotNullExpressionValue(value2, "getString(...)");
                        break;
                    } else {
                        value2 = "";
                        break;
                    }
                case -1256287888:
                    if (!value2.equals("Year to date")) {
                    }
                    break;
                case 80981793:
                    if (!value2.equals("Today")) {
                    }
                    break;
                case 1023892754:
                    if (!value2.equals("Past hour")) {
                    }
                    break;
                case 1024329506:
                    if (!value2.equals("Past week")) {
                    }
                    break;
                case 1024388971:
                    if (!value2.equals("Past year")) {
                    }
                    break;
                case 1680515346:
                    if (!value2.equals("Past month")) {
                    }
                    break;
                case 1804732940:
                    if (!value2.equals("All time")) {
                    }
                    break;
            }
        }
        String string6 = context.getString(i, string2, string3, value, value2);
        if (tertiary_value != null) {
            int i4 = C20506R.string.accessibility_description_after_hours;
            Icon icon = tertiary_value.getMain().getIcon();
            int i5 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$2[icon.ordinal()];
            if (i5 == 1) {
                string5 = context.getString(C20506R.string.accessibility_increase);
            } else if (i5 == 2) {
                string5 = context.getString(C20506R.string.accessibility_decrease);
            }
            string5 = context.getString(i4, string5, tertiary_value.getMain().getValue());
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, string6 + string5);
        ArrayList arrayList = new ArrayList();
        List<SpanOption> availableSpans = concreteState.getChartModel().getSpans().getAvailableSpans();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(availableSpans, 10));
        for (final SpanOption spanOption : availableSpans) {
            arrayList2.add(new CustomAccessibilityAction(toReadableString(spanOption), new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(PerformanceChartComposable.performanceChartAccessibility$lambda$16$lambda$15(onSpanSelected, spanOption));
                }
            }));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(trailingButton);
        if (concreteState.getMarketValuesType() != null && concreteState.getActiveSpan() != null) {
            String string7 = context.getString(C20506R.string.market_values);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            arrayList.add(new CustomAccessibilityAction(string7, new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(PerformanceChartComposable.performanceChartAccessibility$lambda$17(onMarketValuesBreakdown));
                }
            }));
        }
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean performanceChartAccessibility$lambda$16$lambda$15(Function1 function1, SpanOption spanOption) {
        function1.invoke(spanOption.getQueryValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean performanceChartAccessibility$lambda$17(Function0 function0) {
        function0.invoke();
        return true;
    }

    private static final String toReadableString(SpanOption spanOption) {
        String displayValue = spanOption.getDisplayValue();
        int iHashCode = displayValue.hashCode();
        if (iHashCode != 1587) {
            if (iHashCode != 1596) {
                if (iHashCode != 1606) {
                    if (iHashCode != 1608) {
                        if (iHashCode != 1658) {
                            if (iHashCode != 64897) {
                                if (iHashCode == 88201 && displayValue.equals(DisplaySpans.YTD)) {
                                    return "Year to date";
                                }
                            } else if (displayValue.equals(DisplaySpans.ALL)) {
                                return "All";
                            }
                        } else if (displayValue.equals(DisplaySpans.THREE_MONTHS)) {
                            return "3 Months";
                        }
                    } else if (displayValue.equals(DisplaySpans.YEAR)) {
                        return "1 Year";
                    }
                } else if (displayValue.equals(DisplaySpans.WEEK)) {
                    return "1 Week";
                }
            } else if (displayValue.equals(DisplaySpans.MONTH)) {
                return "1 Month";
            }
        } else if (displayValue.equals("1D")) {
            return "1 Day";
        }
        return spanOption.getDisplayValue();
    }
}
