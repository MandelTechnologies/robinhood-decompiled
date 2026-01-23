package com.robinhood.android.individualaccounts.onboarding.outro;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroState3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoadingAccountScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$3$1$2$4, reason: use source file name */
/* loaded from: classes10.dex */
final class LoadingAccountScreen4 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ IndividualAccountOutroScreen $callbacks;
    final /* synthetic */ IndividualAccountOutroState3.LoadingAccount $state;

    LoadingAccountScreen4(IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.LoadingAccount loadingAccount) {
        this.$callbacks = individualAccountOutroScreen;
        this.$state = loadingAccount;
    }

    private static final boolean invoke$lambda$6$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-781888342, i, -1, "com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingAccountScreen.kt:180)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
        final IndividualAccountOutroScreen individualAccountOutroScreen = this.$callbacks;
        IndividualAccountOutroState3.LoadingAccount loadingAccount = this.$state;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(individualAccountOutroScreen);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LoadingAccountScreen5(individualAccountOutroScreen);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_refresh, composer, 0);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue), strStringResource, ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.REFRESH, null, new Component(componentType, "refresh-timeout", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(12003368);
        if (loadingAccount.getShowContactSupportButton()) {
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(individualAccountOutroScreen);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$3$1$2$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoadingAccountScreen4.invoke$lambda$6$lambda$5$lambda$4(coroutineScope, individualAccountOutroScreen, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue4, StringResources_androidKt.stringResource(C11048R.string.general_label_contact_support, composer, 0), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTACT_SUPPORT, null, new Component(componentType, "contact-support-timeout", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, invoke$lambda$6$lambda$2(snapshotState), null, null, null, null, false, null, composer, 24576, 0, 8104);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$6$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(CoroutineScope coroutineScope, IndividualAccountOutroScreen individualAccountOutroScreen, SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LoadingAccountScreen6(individualAccountOutroScreen, snapshotState, null), 3, null);
        return Unit.INSTANCE;
    }
}
