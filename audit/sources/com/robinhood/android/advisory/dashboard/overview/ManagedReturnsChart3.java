package com.robinhood.android.advisory.dashboard.overview;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChart3;
import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartState;
import com.robinhood.android.advisory.returns.ReturnsBarColors;
import com.robinhood.android.advisory.returns.ReturnsBarData;
import com.robinhood.android.advisory.returns.ReturnsChart2;
import com.robinhood.android.advisory.returns.ReturnsChart7;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ManagedReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u001a\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"LOGGING_IDENTIFIER_COMPARE_BUTTON", "", "ManagedReturnsChart", "", "state", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState;", "onSpanSelected", "Lkotlin/Function1;", "onBarSelected", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toReturnsBarDataList", "", "Lcom/robinhood/android/advisory/returns/ReturnsBarData;", "(Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "formatRoundedOrCompact", "Lcom/robinhood/models/util/Money;", "compactValue", "", "colorFactory", "Lcom/robinhood/android/advisory/returns/ReturnsBarColors;", PlaceTypes.BAR, "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ManagedReturnsChart3 {
    public static final String LOGGING_IDENTIFIER_COMPARE_BUTTON = "advisory-returns-compare";

    /* compiled from: ManagedReturnsChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ManagedReturnsChartState.ReturnsType.values().length];
            try {
                iArr[ManagedReturnsChartState.ReturnsType.APPRECIATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagedReturnsChartState.ReturnsType.INCOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagedReturnsChartState.ReturnsType.FEES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagedReturnsChart$lambda$0(ManagedReturnsChartState managedReturnsChartState, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ManagedReturnsChart(managedReturnsChartState, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagedReturnsChart(final ManagedReturnsChartState state, final Function1<? super String, Unit> onSpanSelected, final Function1<? super ManagedReturnsChartState.ReturnsBar, Unit> onBarSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        Intrinsics.checkNotNullParameter(onBarSelected, "onBarSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1272880474);
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
            i3 |= composerStartRestartGroup.changedInstance(onSpanSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBarSelected) ? 256 : 128;
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
                    ComposerKt.traceEventStart(1272880474, i3, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChart (ManagedReturnsChart.kt:64)");
                }
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifier5 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.RETURNS_CHART, null, null, 6, null), null, 47, null)), ComposableLambda3.rememberComposableLambda(-151544369, true, new C87071(modifier5, state, toReturnsBarDataList(state, composerStartRestartGroup, i3 & 14), onBarSelected, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), onSpanSelected, navigator, context), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ManagedReturnsChart3.ManagedReturnsChart$lambda$0(state, onSpanSelected, onBarSelected, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifier52 = modifier4;
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.RETURNS_CHART, null, null, 6, null), null, 47, null)), ComposableLambda3.rememberComposableLambda(-151544369, true, new C87071(modifier52, state, toReturnsBarDataList(state, composerStartRestartGroup, i3 & 14), onBarSelected, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), onSpanSelected, navigator2, context2), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ManagedReturnsChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$ManagedReturnsChart$1 */
    static final class C87071 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<ReturnsBarData> $bars;
        final /* synthetic */ Context $context;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function1<ManagedReturnsChartState.ReturnsBar, Unit> $onBarSelected;
        final /* synthetic */ Function1<String, Unit> $onSpanSelected;
        final /* synthetic */ ManagedReturnsChartState $state;

        /* compiled from: ManagedReturnsChart.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$ManagedReturnsChart$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Direction.values().length];
                try {
                    iArr[Direction.f5855UP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Direction.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C87071(Modifier modifier, ManagedReturnsChartState managedReturnsChartState, List<ReturnsBarData> list, Function1<? super ManagedReturnsChartState.ReturnsBar, Unit> function1, EventLogger eventLogger, Function1<? super String, Unit> function12, Navigator navigator, Context context) {
            this.$modifier = modifier;
            this.$state = managedReturnsChartState;
            this.$bars = list;
            this.$onBarSelected = function1;
            this.$eventLogger = eventLogger;
            this.$onSpanSelected = function12;
            this.$navigator = navigator;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            UserInteractionEventDescriptor userInteractionEventDescriptor;
            Modifier.Companion companion;
            List<ReturnsBarData> list;
            final Function1<ManagedReturnsChartState.ReturnsBar, Unit> function1;
            final EventLogger eventLogger;
            Function1<String, Unit> function12;
            Navigator navigator;
            Context context;
            BentoTheme4 bentoTheme4;
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-151544369, i, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChart.<anonymous> (ManagedReturnsChart.kt:79)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(this.$modifier, 1.0f, false, 2, null);
            final ManagedReturnsChartState managedReturnsChartState = this.$state;
            List<ReturnsBarData> list2 = this.$bars;
            Function1<ManagedReturnsChartState.ReturnsBar, Unit> function13 = this.$onBarSelected;
            EventLogger eventLogger2 = this.$eventLogger;
            Function1<String, Unit> function14 = this.$onSpanSelected;
            Navigator navigator2 = this.$navigator;
            Context context2 = this.$context;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAspectRatio$default);
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
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion4, C2002Dp.m7995constructorimpl(40));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            composer2.startReplaceGroup(-74626798);
            if (managedReturnsChartState.getSelectedBarInfo() != null) {
                Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getTopStart());
                composer2.startReplaceGroup(-74620972);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                composer2.startReplaceGroup(-74619324);
                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(managedReturnsChartState.getSelectedBarInfo().getNameRes(), composer2, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composer2.endReplaceGroup();
                    builder.append(" · ");
                    builder.append(StringResources_androidKt.stringResource(managedReturnsChartState.getSelectedBarInfo().getDescriptionRes(), composer2, 0));
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composer2.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    list = list2;
                    userInteractionEventDescriptor = userInteractionEventDescriptor2;
                    eventLogger = eventLogger2;
                    navigator = navigator2;
                    context = context2;
                    companion = companion4;
                    function12 = function14;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierAlign, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer2, i2).getTextS(), composer, 0, 0, 8184);
                    composer2 = composer;
                    function1 = function13;
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            } else {
                userInteractionEventDescriptor = userInteractionEventDescriptor2;
                companion = companion4;
                list = list2;
                function1 = function13;
                eventLogger = eventLogger2;
                function12 = function14;
                navigator = navigator2;
                context = context2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            Modifier modifierWeight$default = Column5.weight$default(column6, companion, 1.0f, false, 2, null);
            ImmutableList immutableList = extensions2.toImmutableList(list);
            composer2.startReplaceGroup(-1224400529);
            final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor;
            boolean zChanged = composer2.changed(function1) | composer2.changedInstance(managedReturnsChartState) | composer2.changedInstance(eventLogger) | composer2.changedInstance(userInteractionEventDescriptor3);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$ManagedReturnsChart$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ManagedReturnsChart3.C87071.invoke$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(function1, managedReturnsChartState, eventLogger, userInteractionEventDescriptor3, ((Integer) obj).intValue());
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            ReturnsChart7.ReturnsBarChart(immutableList, modifierWeight$default, true, (Function1) objRememberedValue, null, false, composer2, ReturnsBarData.$stable | 384, 48);
            Composer composer3 = composer2;
            composer3.endNode();
            composer3.endNode();
            int i3 = WhenMappings.$EnumSwitchMapping$0[managedReturnsChartState.getDirection().ordinal()];
            if (i3 == 1) {
                bentoTheme4 = BentoTheme4.POSITIVE;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bentoTheme4 = BentoTheme4.NEGATIVE;
            }
            BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-1399670177, true, new ManagedReturnsChart4(managedReturnsChartState, function12, userInteractionEventDescriptor3, eventLogger, navigator, context), composer3, 54), composer3, 48);
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(Function1 function1, ManagedReturnsChartState managedReturnsChartState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, int i) {
            if (i >= 0) {
                function1.invoke(managedReturnsChartState.getBars().get(i));
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.LONG_PRESS, userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), null, userInteractionEventDescriptor.getContext(), null, null, 104, null), false, false, 6, null);
            } else {
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final List<ReturnsBarData> toReturnsBarDataList(ManagedReturnsChartState managedReturnsChartState, Composer composer, int i) {
        Float fValueOf;
        String strStringResource;
        Intrinsics.checkNotNullParameter(managedReturnsChartState, "<this>");
        composer.startReplaceGroup(-780864258);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-780864258, i, -1, "com.robinhood.android.advisory.dashboard.overview.toReturnsBarDataList (ManagedReturnsChart.kt:211)");
        }
        Iterator<ManagedReturnsChartState.ReturnsBar> it = managedReturnsChartState.getBars().iterator();
        if (it.hasNext()) {
            float fAbs = Math.abs(it.next().getValue().getDecimalValue().floatValue());
            while (it.hasNext()) {
                fAbs = Math.max(fAbs, Math.abs(it.next().getValue().getDecimalValue().floatValue()));
            }
            fValueOf = Float.valueOf(fAbs);
        } else {
            fValueOf = null;
        }
        float fCoerceAtLeast = fValueOf != null ? RangesKt.coerceAtLeast(fValueOf.floatValue(), 1.0E-4f) : 1.0f;
        ImmutableList<ManagedReturnsChartState.ReturnsBar> bars = managedReturnsChartState.getBars();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bars, 10));
        for (ManagedReturnsChartState.ReturnsBar returnsBar : bars) {
            boolean zIsNegative = returnsBar.getValue().isNegative();
            float fCoerceIn = RangesKt.coerceIn(returnsBar.getValue().getDecimalValue().floatValue() / fCoerceAtLeast, -1.0f, 1.0f);
            int i2 = WhenMappings.$EnumSwitchMapping$0[returnsBar.getType().ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-1401717929);
                if (zIsNegative) {
                    composer.startReplaceGroup(-503570499);
                    strStringResource = StringResources_androidKt.stringResource(C8626R.string.returns_chart_bar_name_depreciation, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-503473283);
                    strStringResource = StringResources_androidKt.stringResource(C8626R.string.returns_chart_bar_name_appreciation, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else if (i2 == 2) {
                composer.startReplaceGroup(-1401709025);
                strStringResource = StringResources_androidKt.stringResource(C8626R.string.returns_chart_bar_name_income, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (i2 != 3) {
                    composer.startReplaceGroup(-1401720234);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1401704899);
                strStringResource = StringResources_androidKt.stringResource(C8626R.string.returns_chart_bar_name_fees, composer, 0);
                composer.endReplaceGroup();
            }
            arrayList.add(new ReturnsBarData(strStringResource, formatRoundedOrCompact$default(returnsBar.getValue(), false, 1, null), formatRoundedOrCompact(returnsBar.getValue(), false), fCoerceIn, colorFactory(returnsBar)));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return arrayList;
    }

    public static /* synthetic */ String formatRoundedOrCompact$default(Money money, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return formatRoundedOrCompact(money, z);
    }

    public static final String formatRoundedOrCompact(Money money, boolean z) {
        Intrinsics.checkNotNullParameter(money, "<this>");
        return (money.getDecimalValue().abs().compareTo(new BigDecimal("9999.99")) <= 0 || !z) ? Money.format$default(money, null, false, null, false, 2, 2, false, null, false, false, 975, null) : Money.formatCompact$default(money, null, 1, 1, 1, null);
    }

    public static final ReturnsBarColors colorFactory(ManagedReturnsChartState.ReturnsBar bar) {
        Intrinsics.checkNotNullParameter(bar, "bar");
        boolean zIsNegative = bar.getValue().isNegative();
        int i = WhenMappings.$EnumSwitchMapping$0[bar.getType().ordinal()];
        if (i == 1) {
            if (zIsNegative) {
                ReturnsChart2 returnsChart2 = ReturnsChart2.LIGHT_SELECTED;
                Tuples2 tuples2M3642to = Tuples4.m3642to(returnsChart2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294958541L)), Color.m6701boximpl(Color2.Color(4294953907L)), Color.m6701boximpl(Color2.Color(4294947213L)), Color.m6701boximpl(Color2.Color(4294944125L)), Color.m6701boximpl(Color2.Color(4294940263L)), Color.m6701boximpl(Color2.Color(4294937946L)), Color.m6701boximpl(Color2.Color(4294935885L)), Color.m6701boximpl(Color2.Color(4294931252L)), Color.m6701boximpl(Color2.Color(4294922240L))}));
                ReturnsChart2 returnsChart22 = ReturnsChart2.LIGHT_UNSELECTED;
                Tuples2 tuples2M3642to2 = Tuples4.m3642to(returnsChart22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4293914859L)), Color.m6701boximpl(Color2.Color(4293717736L)), Color.m6701boximpl(Color2.Color(4293520357L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4291811019L)), Color.m6701boximpl(Color2.Color(4291218883L)), Color.m6701boximpl(Color2.Color(4290692539L)), Color.m6701boximpl(Color2.Color(4289113508L))}));
                ReturnsChart2 returnsChart23 = ReturnsChart2.DARK_SELECTED;
                Tuples2 tuples2M3642to3 = Tuples4.m3642to(returnsChart23, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4283505667L)), Color.m6701boximpl(Color2.Color(4286589443L)), Color.m6701boximpl(Color2.Color(4289082626L)), Color.m6701boximpl(Color2.Color(4291575808L)), Color.m6701boximpl(Color2.Color(4292428800L)), Color.m6701boximpl(Color2.Color(4293216256L)), Color.m6701boximpl(Color2.Color(4294922240L))}));
                ReturnsChart2 returnsChart24 = ReturnsChart2.DARK_UNSELECTED;
                return new ReturnsBarColors(MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, Tuples4.m3642to(returnsChart24, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4285100637L)), Color.m6701boximpl(Color2.Color(4284771672L)), Color.m6701boximpl(Color2.Color(4284310866L)), Color.m6701boximpl(Color2.Color(4283850060L)), Color.m6701boximpl(Color2.Color(4282928960L)), Color.m6701boximpl(Color2.Color(4282073396L)), Color.m6701boximpl(Color2.Color(4281744176L)), Color.m6701boximpl(Color2.Color(4281151528L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart2, Color.m6701boximpl(Color2.Color(1728046296))), Tuples4.m3642to(returnsChart22, Color.m6701boximpl(Color2.Color(1728053247))), Tuples4.m3642to(returnsChart23, Color.m6701boximpl(Color2.Color(2583652864L))), Tuples4.m3642to(returnsChart24, Color.m6701boximpl(Color2.Color(1726145250)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart23, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4286589443L)), Color.m6701boximpl(Color2.Color(4291575808L)), Color.m6701boximpl(Color2.Color(4294929191L))})), Tuples4.m3642to(returnsChart2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294958541L)), Color.m6701boximpl(Color2.Color(4294938719L)), Color.m6701boximpl(Color2.Color(4294930480L)), Color.m6701boximpl(Color2.Color(4294922240L))})), Tuples4.m3642to(returnsChart24, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291027865L)), Color.m6701boximpl(Color2.Color(4283350285L)), Color.m6701boximpl(Color2.Color(4278473220L))})), Tuples4.m3642to(returnsChart22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4293914859L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4290626747L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart23, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4292428800L)), Color.m6701boximpl(Color2.Color(4286589443L)), Color.m6701boximpl(Color2.Color(4291575808L)), Color.m6701boximpl(Color2.Color(4294922240L))})), Tuples4.m3642to(returnsChart2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294958541L)), Color.m6701boximpl(Color2.Color(4294940263L)), Color.m6701boximpl(Color2.Color(4294922240L)), Color.m6701boximpl(Color2.Color(4294609238L))})), Tuples4.m3642to(returnsChart24, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4286876795L)), Color.m6701boximpl(Color2.Color(4285100637L)), Color.m6701boximpl(Color2.Color(4282138679L)), Color.m6701boximpl(Color2.Color(4284574038L))})), Tuples4.m3642to(returnsChart22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4293914859L)), Color.m6701boximpl(Color2.Color(4293126111L)), Color.m6701boximpl(Color2.Color(4291876301L)), Color.m6701boximpl(Color2.Color(4290626747L)), Color.m6701boximpl(Color2.Color(4292337363L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart23, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4283505667L)), Color.m6701boximpl(Color2.Color(4286130437L)), Color.m6701boximpl(Color2.Color(4288755462L)), Color.m6701boximpl(Color2.Color(4293216256L))})), Tuples4.m3642to(returnsChart2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294958541L)), Color.m6701boximpl(Color2.Color(4294940263L)), Color.m6701boximpl(Color2.Color(4294922240L))})), Tuples4.m3642to(returnsChart24, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4285100637L)), Color.m6701boximpl(Color2.Color(4283718731L)), Color.m6701boximpl(Color2.Color(4282336824L)), Color.m6701boximpl(Color2.Color(4281151528L))})), Tuples4.m3642to(returnsChart22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4293388263L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4290626747L))}))), null, MapsKt.mapOf(Tuples4.m3642to(returnsChart23, Color.m6701boximpl(Color2.Color(1725580802))), Tuples4.m3642to(returnsChart2, Color.m6701boximpl(Color2.Color(1728013856))), Tuples4.m3642to(returnsChart24, Color.m6701boximpl(Color2.Color(1714566700))), Tuples4.m3642to(returnsChart22, Color.m6701boximpl(Color2.Color(1723844284)))), 32, null);
            }
            ReturnsChart2 returnsChart25 = ReturnsChart2.LIGHT_SELECTED;
            Tuples2 tuples2M3642to4 = Tuples4.m3642to(returnsChart25, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4278946574L)), Color.m6701boximpl(Color2.Color(4279478805L)), Color.m6701boximpl(Color2.Color(4280529444L)), Color.m6701boximpl(Color2.Color(4281061932L)), Color.m6701boximpl(Color2.Color(4282638913L)), Color.m6701boximpl(Color2.Color(4284215638L)), Color.m6701boximpl(Color2.Color(4287887459L))}));
            ReturnsChart2 returnsChart26 = ReturnsChart2.LIGHT_UNSELECTED;
            Tuples2 tuples2M3642to5 = Tuples4.m3642to(returnsChart26, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4289113508L)), Color.m6701boximpl(Color2.Color(4290692539L)), Color.m6701boximpl(Color2.Color(4291218883L)), Color.m6701boximpl(Color2.Color(4291811019L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4293520357L)), Color.m6701boximpl(Color2.Color(4293717736L)), Color.m6701boximpl(Color2.Color(4293914859L))}));
            ReturnsChart2 returnsChart27 = ReturnsChart2.DARK_SELECTED;
            Tuples2 tuples2M3642to6 = Tuples4.m3642to(returnsChart27, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291297149L)), Color.m6701boximpl(Color2.Color(4287555140L)), Color.m6701boximpl(Color2.Color(4284271897L)), Color.m6701boximpl(Color2.Color(4282360854L)), Color.m6701boximpl(Color2.Color(4280515092L)), Color.m6701boximpl(Color2.Color(4279855119L)), Color.m6701boximpl(Color2.Color(4279456525L)), Color.m6701boximpl(Color2.Color(4278926859L))}));
            ReturnsChart2 returnsChart28 = ReturnsChart2.DARK_UNSELECTED;
            return new ReturnsBarColors(MapsKt.mapOf(tuples2M3642to4, tuples2M3642to5, tuples2M3642to6, Tuples4.m3642to(returnsChart28, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281151528L)), Color.m6701boximpl(Color2.Color(4281744176L)), Color.m6701boximpl(Color2.Color(4282073396L)), Color.m6701boximpl(Color2.Color(4282928960L)), Color.m6701boximpl(Color2.Color(4283850060L)), Color.m6701boximpl(Color2.Color(4284310866L)), Color.m6701boximpl(Color2.Color(4284771672L)), Color.m6701boximpl(Color2.Color(4285100637L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart25, Color.m6701boximpl(Color2.Color(1726349136))), Tuples4.m3642to(returnsChart26, Color.m6701boximpl(Color2.Color(1728053247))), Tuples4.m3642to(returnsChart27, Color.m6701boximpl(Color2.Color(1305280256))), Tuples4.m3642to(returnsChart28, Color.m6701boximpl(Color2.Color(1726145250)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart27, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291027865L)), Color.m6701boximpl(Color2.Color(4283350285L)), Color.m6701boximpl(Color2.Color(4278473220L))})), Tuples4.m3642to(returnsChart25, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4279478805L)), Color.m6701boximpl(Color2.Color(4282638913L)), Color.m6701boximpl(Color2.Color(4291296941L))})), Tuples4.m3642to(returnsChart28, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4278473220L)), Color.m6701boximpl(Color2.Color(4283350285L)), Color.m6701boximpl(Color2.Color(4291027865L))})), Tuples4.m3642to(returnsChart26, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4290626747L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4293914859L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart27, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4289920844L)), Color.m6701boximpl(Color2.Color(4282619664L)), Color.m6701boximpl(Color2.Color(4278476801L)), Color.m6701boximpl(Color2.Color(4286762270L))})), Tuples4.m3642to(returnsChart25, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281322295L)), Color.m6701boximpl(Color2.Color(4279478805L)), Color.m6701boximpl(Color2.Color(4283683132L)), Color.m6701boximpl(Color2.Color(4287887459L)), Color.m6701boximpl(Color2.Color(4290314134L))})), Tuples4.m3642to(returnsChart28, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4284574038L)), Color.m6701boximpl(Color2.Color(4282138679L)), Color.m6701boximpl(Color2.Color(4285100637L)), Color.m6701boximpl(Color2.Color(4286876795L))})), Tuples4.m3642to(returnsChart26, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4290626747L)), Color.m6701boximpl(Color2.Color(4291876301L)), Color.m6701boximpl(Color2.Color(4293126111L)), Color.m6701boximpl(Color2.Color(4293914859L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart27, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4286827560L)), Color.m6701boximpl(Color2.Color(4284393525L)), Color.m6701boximpl(Color2.Color(4279987993L)), Color.m6701boximpl(Color2.Color(4279121676L))})), Tuples4.m3642to(returnsChart25, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4278946574L)), Color.m6701boximpl(Color2.Color(4280529444L)), Color.m6701boximpl(Color2.Color(4282372669L)), Color.m6701boximpl(Color2.Color(4284215638L)), Color.m6701boximpl(Color2.Color(4287887459L))})), Tuples4.m3642to(returnsChart28, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281151528L)), Color.m6701boximpl(Color2.Color(4282336824L)), Color.m6701boximpl(Color2.Color(4283718731L)), Color.m6701boximpl(Color2.Color(4285100637L))})), Tuples4.m3642to(returnsChart26, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4290626747L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4293388263L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart27, Color.m6701boximpl(Color2.Color(1718800175))), Tuples4.m3642to(returnsChart28, Color.m6701boximpl(Color2.Color(1714566700))), Tuples4.m3642to(returnsChart26, Color.m6701boximpl(Color2.Color(1723844284)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart25, Color.m6701boximpl(Color2.Color(2155148380L)))));
        }
        if (i == 2) {
            ReturnsChart2 returnsChart29 = ReturnsChart2.LIGHT_SELECTED;
            Tuples2 tuples2M3642to7 = Tuples4.m3642to(returnsChart29, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4287544329L)), Color.m6701boximpl(Color2.Color(4287939855L)), Color.m6701boximpl(Color2.Color(4288335382L)), Color.m6701boximpl(Color2.Color(4289059867L)), Color.m6701boximpl(Color2.Color(4289322775L)), Color.m6701boximpl(Color2.Color(4289914382L)), Color.m6701boximpl(Color2.Color(4290769671L)), Color.m6701boximpl(Color2.Color(4291624704L)), Color.m6701boximpl(Color2.Color(4292869982L))}));
            ReturnsChart2 returnsChart210 = ReturnsChart2.LIGHT_UNSELECTED;
            Tuples2 tuples2M3642to8 = Tuples4.m3642to(returnsChart210, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4290692539L)), Color.m6701boximpl(Color2.Color(4291218883L)), Color.m6701boximpl(Color2.Color(4291811019L)), Color.m6701boximpl(Color2.Color(4292074191L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4293520357L))}));
            ReturnsChart2 returnsChart211 = ReturnsChart2.DARK_SELECTED;
            Tuples2 tuples2M3642to9 = Tuples4.m3642to(returnsChart211, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291624704L)), Color.m6701boximpl(Color2.Color(4290897707L)), Color.m6701boximpl(Color2.Color(4288857380L)), Color.m6701boximpl(Color2.Color(4286817309L)), Color.m6701boximpl(Color2.Color(4285764633L)), Color.m6701boximpl(Color2.Color(4284711701L)), Color.m6701boximpl(Color2.Color(4283658513L)), Color.m6701boximpl(Color2.Color(4282605329L)), Color.m6701boximpl(Color2.Color(4281353229L))}));
            ReturnsChart2 returnsChart212 = ReturnsChart2.DARK_UNSELECTED;
            return new ReturnsBarColors(MapsKt.mapOf(tuples2M3642to7, tuples2M3642to8, tuples2M3642to9, Tuples4.m3642to(returnsChart212, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281151528L)), Color.m6701boximpl(Color2.Color(4281744176L)), Color.m6701boximpl(Color2.Color(4282073396L)), Color.m6701boximpl(Color2.Color(4282928960L)), Color.m6701boximpl(Color2.Color(4284047439L)), Color.m6701boximpl(Color2.Color(4285100637L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart29, Color.m6701boximpl(Color2.Color(1727856623))), Tuples4.m3642to(returnsChart210, Color.m6701boximpl(Color2.Color(1727921661))), Tuples4.m3642to(returnsChart211, Color.m6701boximpl(Color2.Color(1724710656))), Tuples4.m3642to(returnsChart212, Color.m6701boximpl(Color2.Color(1726145250)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart29, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291164420L)), Color.m6701boximpl(Color2.Color(4291427330L)), Color.m6701boximpl(Color2.Color(4293787555L))})), Tuples4.m3642to(returnsChart211, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4289452847L)), Color.m6701boximpl(Color2.Color(4290897707L))})), Tuples4.m3642to(returnsChart212, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4286613876L)), Color.m6701boximpl(Color2.Color(4283323461L)), Color.m6701boximpl(Color2.Color(4282007347L))})), Tuples4.m3642to(returnsChart210, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291218883L)), Color.m6701boximpl(Color2.Color(4293060576L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart29, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291164420L)), Color.m6701boximpl(Color2.Color(4291427330L)), Color.m6701boximpl(Color2.Color(4293787555L))})), Tuples4.m3642to(returnsChart211, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4289452847L)), Color.m6701boximpl(Color2.Color(4290897707L))})), Tuples4.m3642to(returnsChart212, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4284574038L)), Color.m6701boximpl(Color2.Color(4285100637L)), Color.m6701boximpl(Color2.Color(4283784013L))})), Tuples4.m3642to(returnsChart210, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291218883L)), Color.m6701boximpl(Color2.Color(4293060576L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart29, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4286556672L)), Color.m6701boximpl(Color2.Color(4291624704L))})), Tuples4.m3642to(returnsChart211, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291624704L)), Color.m6701boximpl(Color2.Color(4279704846L))})), Tuples4.m3642to(returnsChart212, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281151528L)), Color.m6701boximpl(Color2.Color(4282336824L)), Color.m6701boximpl(Color2.Color(4283718731L)), Color.m6701boximpl(Color2.Color(4285100637L))})), Tuples4.m3642to(returnsChart210, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4290626747L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4293388263L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart211, Color.m6701boximpl(Color2.Color(218103808)))), null, 64, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ReturnsChart2 returnsChart213 = ReturnsChart2.LIGHT_SELECTED;
        Tuples2 tuples2M3642to10 = Tuples4.m3642to(returnsChart213, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291495160L)), Color.m6701boximpl(Color2.Color(4292563963L)), Color.m6701boximpl(Color2.Color(4293698047L))}));
        ReturnsChart2 returnsChart214 = ReturnsChart2.LIGHT_UNSELECTED;
        Tuples2 tuples2M3642to11 = Tuples4.m3642to(returnsChart214, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291545025L)), Color.m6701boximpl(Color2.Color(4292794578L)), Color.m6701boximpl(Color2.Color(4293913322L))}));
        ReturnsChart2 returnsChart215 = ReturnsChart2.DARK_SELECTED;
        Tuples2 tuples2M3642to12 = Tuples4.m3642to(returnsChart215, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4286907391L)), Color.m6701boximpl(Color2.Color(4288629759L)), Color.m6701boximpl(Color2.Color(4293111807L))}));
        ReturnsChart2 returnsChart216 = ReturnsChart2.DARK_UNSELECTED;
        return new ReturnsBarColors(MapsKt.mapOf(tuples2M3642to10, tuples2M3642to11, tuples2M3642to12, Tuples4.m3642to(returnsChart216, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281281066L)), Color.m6701boximpl(Color2.Color(4282399033L)), Color.m6701boximpl(Color2.Color(4285490019L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart213, Color.m6701boximpl(Color2.Color(868943096))), Tuples4.m3642to(returnsChart214, Color.m6701boximpl(Color2.Color(1305200577))), Tuples4.m3642to(returnsChart215, Color.m6701boximpl(Color2.Color(864355327))), Tuples4.m3642to(returnsChart216, Color.m6701boximpl(Color2.Color(1294936618)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart213, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291232755L)), Color.m6701boximpl(Color2.Color(4293698047L))})), Tuples4.m3642to(returnsChart215, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4287046377L)), Color.m6701boximpl(Color2.Color(4293111807L))})), Tuples4.m3642to(returnsChart216, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281281066L)), Color.m6701boximpl(Color2.Color(4285490019L))})), Tuples4.m3642to(returnsChart214, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291150267L)), Color.m6701boximpl(Color2.Color(4293058266L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart213, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4290839788L)), Color.m6701boximpl(Color2.Color(4293698047L)), Color.m6701boximpl(Color2.Color(4293698047L)), Color.m6701boximpl(Color2.Color(4293698047L))})), Tuples4.m3642to(returnsChart215, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4293111807L)), Color.m6701boximpl(Color2.Color(4293111807L)), Color.m6701boximpl(Color2.Color(4289814527L))})), Tuples4.m3642to(returnsChart216, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4285490019L)), Color.m6701boximpl(Color2.Color(4288123024L)), Color.m6701boximpl(Color2.Color(4288123024L))})), Tuples4.m3642to(returnsChart214, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4292794578L)), Color.m6701boximpl(Color2.Color(4292794578L)), Color.m6701boximpl(Color2.Color(4291545025L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart213, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4292427261L)), Color.m6701boximpl(Color2.Color(4293295615L)), Color.m6701boximpl(Color2.Color(4293898751L))})), Tuples4.m3642to(returnsChart215, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4289749502L)), Color.m6701boximpl(Color2.Color(4291662847L)), Color.m6701boximpl(Color2.Color(4293641727L))})), Tuples4.m3642to(returnsChart216, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4282399033L)), Color.m6701boximpl(Color2.Color(4285490019L)), Color.m6701boximpl(Color2.Color(4288123024L))})), Tuples4.m3642to(returnsChart214, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291545025L)), Color.m6701boximpl(Color2.Color(4292794578L)), Color.m6701boximpl(Color2.Color(4293913322L))}))), null, null, 96, null);
    }
}
