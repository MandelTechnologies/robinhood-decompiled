package com.robinhood.android.advisory.dashboard.overview;

import android.content.Context;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.ReturnsHubFragmentKey;
import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChart4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.span.SpanOptionsDynamicSelector;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions2;
import com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollInteraction;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ManagedReturnsChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$ManagedReturnsChart$1$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class ManagedReturnsChart4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function1<String, Unit> $onSpanSelected;
    final /* synthetic */ ManagedReturnsChartState $state;

    /* JADX WARN: Multi-variable type inference failed */
    ManagedReturnsChart4(ManagedReturnsChartState managedReturnsChartState, Function1<? super String, Unit> function1, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Navigator navigator, Context context) {
        this.$state = managedReturnsChartState;
        this.$onSpanSelected = function1;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
        this.$navigator = navigator;
        this.$context = context;
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
            ComposerKt.traceEventStart(-1399670177, i, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChart.<anonymous>.<anonymous>.<anonymous> (ManagedReturnsChart.kt:144)");
        }
        ImmutableList immutableList = extensions2.toImmutableList(this.$state.getSupportedSpans());
        String activeSpan = this.$state.getActiveSpan();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$onSpanSelected) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$eventLogger);
        final Function1<String, Unit> function1 = this.$onSpanSelected;
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final EventLogger eventLogger = this.$eventLogger;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$ManagedReturnsChart$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManagedReturnsChart4.invoke$lambda$1$lambda$0(function1, userInteractionEventDescriptor, eventLogger, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SpanOptionsDynamicSelector.SpanOptionsDynamicSelector(immutableList, activeSpan, (Function1) objRememberedValue, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(AccountTabScrollInteractions2.accountTabScrollInteraction(Modifier.INSTANCE, (AccountTabScrollInteractions) composer.consume(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction())), 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, false, ComposableLambda3.rememberComposableLambda(-130734374, true, new C87082(this.$eventDescriptor, this.$navigator, this.$context, this.$state), composer, 54), composer, 1572864, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, String span) {
        Intrinsics.checkNotNullParameter(span, "span");
        function1.invoke(span);
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.SPAN_SELECTOR, span, null, 4, null), new ComponentHierarchy(userInteractionEventDescriptor.getComponent(), null, null, null, null, 30, null), userInteractionEventDescriptor.getContext(), false, 33, null);
        return Unit.INSTANCE;
    }

    /* compiled from: ManagedReturnsChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$ManagedReturnsChart$1$1$2$2 */
    static final class C87082 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ ManagedReturnsChartState $state;

        C87082(UserInteractionEventDescriptor userInteractionEventDescriptor, Navigator navigator, Context context, ManagedReturnsChartState managedReturnsChartState) {
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$navigator = navigator;
            this.$context = context;
            this.$state = managedReturnsChartState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 SpanOptionsDynamicSelector, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SpanOptionsDynamicSelector, "$this$SpanOptionsDynamicSelector");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-130734374, i, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagedReturnsChart.kt:166)");
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith(this.$eventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, ManagedReturnsChart3.LOGGING_IDENTIFIER_COMPARE_BUTTON, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            Color.Companion companion = Color.INSTANCE;
            ButtonColors buttonColorsM5719buttonColorsro_MJ88 = buttonDefaults.m5719buttonColorsro_MJ88(companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 54, 12);
            float f = 8;
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f));
            PaddingValues paddingValuesM5136PaddingValuesYgX7TsA = PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(f));
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU());
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$state);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final ManagedReturnsChartState managedReturnsChartState = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartKt$ManagedReturnsChart$1$1$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManagedReturnsChart4.C87082.invoke$lambda$1$lambda$0(navigator, context, managedReturnsChartState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) objRememberedValue, modifierAutoLogEvents$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, buttonColorsM5719buttonColorsro_MJ88, null, borderStrokeM4886BorderStrokecXLIe8U, paddingValuesM5136PaddingValuesYgX7TsA, null, ManagedReturnsChart.INSTANCE.m11002getLambda$438123830$lib_advisory_dashboard_externalDebug(), composer, 817889280, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, ManagedReturnsChartState managedReturnsChartState) {
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new ReturnsHubFragmentKey(managedReturnsChartState.getAccountNumber()), false, false, false, false, null, false, null, null, 1020, null);
            return Unit.INSTANCE;
        }
    }
}
