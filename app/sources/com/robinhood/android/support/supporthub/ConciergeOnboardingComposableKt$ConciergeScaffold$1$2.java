package com.robinhood.android.support.supporthub;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class ConciergeOnboardingComposableKt$ConciergeScaffold$1$2 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $bottomPrimaryCta;
    final /* synthetic */ String $bottomPrimaryCtaLabel;
    final /* synthetic */ String $bottomSummary;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ Context $context;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ boolean $isFinalScreen;
    final /* synthetic */ ConciergeOnboardingViewState2 $subScreen;

    /* JADX WARN: Multi-variable type inference failed */
    ConciergeOnboardingComposableKt$ConciergeScaffold$1$2(Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, String str, Context context, String str2, ConciergeOnboardingViewState2 conciergeOnboardingViewState2, EventLogger eventLogger, boolean z, Function0<Unit> function0) {
        this.$content = function3;
        this.$bottomSummary = str;
        this.$context = context;
        this.$bottomPrimaryCtaLabel = str2;
        this.$subScreen = conciergeOnboardingViewState2;
        this.$eventLogger = eventLogger;
        this.$isFinalScreen = z;
        this.$bottomPrimaryCta = function0;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Function0<Unit> function0;
        EventLogger eventLogger;
        String str;
        float f;
        Object obj;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 6) == 0) {
            i2 = i | (composer2.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1926264489, i2, -1, "com.robinhood.android.support.supporthub.ConciergeScaffold.<anonymous>.<anonymous> (ConciergeOnboardingComposable.kt:415)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
        String str2 = this.$bottomSummary;
        final Context context = this.$context;
        String str3 = this.$bottomPrimaryCtaLabel;
        final ConciergeOnboardingViewState2 conciergeOnboardingViewState2 = this.$subScreen;
        EventLogger eventLogger2 = this.$eventLogger;
        final boolean z = this.$isFinalScreen;
        Function0<Unit> function02 = this.$bottomPrimaryCta;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
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
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 1, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default2);
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
        function3.invoke(paddingValues, composer2, Integer.valueOf(i2 & 14));
        composer2.endNode();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
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
        composer2.startReplaceGroup(-40083846);
        if (str2 != null) {
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
            obj = null;
            function0 = function02;
            str = str3;
            eventLogger = eventLogger2;
            f = 0.0f;
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i3).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 16);
            composer2 = composer;
            composer2.startReplaceGroup(5004770);
            boolean zChangedInstance = composer2.changedInstance(context);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeScaffold$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ConciergeOnboardingComposableKt$ConciergeScaffold$1$2.invoke$lambda$7$lambda$6$lambda$2$lambda$1(context, (String) obj2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(str2, modifierFillMaxWidth$default2, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer2, MarkdownStyle.$stable << 6, 8);
        } else {
            function0 = function02;
            eventLogger = eventLogger2;
            str = str3;
            f = 0.0f;
            obj = null;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-40054983);
        if (str != null) {
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), f, 2, obj), f, 1, obj);
            composer2.startReplaceGroup(-1224400529);
            final EventLogger eventLogger3 = eventLogger;
            final Function0<Unit> function03 = function0;
            boolean zChangedInstance2 = composer2.changedInstance(conciergeOnboardingViewState2) | composer2.changedInstance(eventLogger3) | composer2.changedInstance(userInteractionEventDescriptor) | composer2.changed(z) | composer2.changed(function03);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function0 function04 = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeScaffold$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConciergeOnboardingComposableKt$ConciergeScaffold$1$2.invoke$lambda$7$lambda$6$lambda$5$lambda$4(conciergeOnboardingViewState2, function03, eventLogger3, userInteractionEventDescriptor, z);
                    }
                };
                composer2.updateRememberedValue(function04);
                objRememberedValue2 = function04;
            }
            composer2.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default3, null, null, false, null, null, (Function0) objRememberedValue2, str, false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
        }
        composer.endReplaceGroup();
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$2$lambda$1(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebUtils.viewUrl$default(context, url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(ConciergeOnboardingViewState2 conciergeOnboardingViewState2, Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z) {
        UserInteractionEventData.Action action;
        if (conciergeOnboardingViewState2 != null) {
            if (z) {
                action = UserInteractionEventData.Action.DONE;
            } else {
                action = UserInteractionEventData.Action.CONTINUE;
            }
            ConciergeOnboardingComposableKt.logTapEvent(eventLogger, conciergeOnboardingViewState2, userInteractionEventDescriptor, action);
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
