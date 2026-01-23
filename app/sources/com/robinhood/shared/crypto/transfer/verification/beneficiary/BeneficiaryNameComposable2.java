package com.robinhood.shared.crypto.transfer.verification.beneficiary;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActions2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BeneficiaryNameComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$2$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class BeneficiaryNameComposable2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState4<Boolean> $ctaEnabled$delegate;
    final /* synthetic */ SnapshotState<String> $firstName$delegate;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SnapshotState<String> $lastName$delegate;
    final /* synthetic */ Function2<String, String, Unit> $onBeneficiaryName;
    final /* synthetic */ SnapshotState<Boolean> $requestFocus$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    BeneficiaryNameComposable2(FocusRequester focusRequester, SnapshotState<String> snapshotState, Function2<? super String, ? super String, Unit> function2, SnapshotState<String> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState4<Boolean> snapshotState4) {
        this.$focusRequester = focusRequester;
        this.$firstName$delegate = snapshotState;
        this.$onBeneficiaryName = function2;
        this.$lastName$delegate = snapshotState2;
        this.$requestFocus$delegate = snapshotState3;
        this.$ctaEnabled$delegate = snapshotState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(278331126, i, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BeneficiaryNameComposable.kt:91)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        FocusRequester focusRequester = this.$focusRequester;
        final SnapshotState<String> snapshotState = this.$firstName$delegate;
        final Function2<String, String, Unit> function2 = this.$onBeneficiaryName;
        final SnapshotState<String> snapshotState2 = this.$lastName$delegate;
        final SnapshotState<Boolean> snapshotState3 = this.$requestFocus$delegate;
        final SnapshotState4<Boolean> snapshotState4 = this.$ctaEnabled$delegate;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer, 54);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
        final FocusManager focusManager = (FocusManager) composer.consume(CompositionLocalsKt.getLocalFocusManager());
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryNameComposable2.invoke$lambda$10$lambda$1$lambda$0(snapshotState3, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierTestTag = TestTag3.testTag(FocusRequesterModifier3.focusRequester(OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default2, (Function1) objRememberedValue), focusRequester), "firstNameTestTag");
        String strBeneficiaryNameComposable$lambda$2 = BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$2(snapshotState);
        KeyboardOptions.Companion companion4 = KeyboardOptions.INSTANCE;
        KeyboardOptions keyboardOptions = companion4.getDefault();
        ImeAction.Companion companion5 = ImeAction.INSTANCE;
        KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(keyboardOptions, 0, null, 0, companion5.m7749getNexteUduSuo(), null, null, null, 119, null);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(focusManager);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$2$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryNameComposable2.invoke$lambda$10$lambda$3$lambda$2(focusManager, (KeyboardActions2) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        KeyboardActions keyboardActions = new KeyboardActions(null, null, (Function1) objRememberedValue2, null, null, null, 59, null);
        String strStringResource = StringResources_androidKt.stringResource(C37934R.string.withdrawal_beneficiary_name_hint_1, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(snapshotState);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$2$1$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryNameComposable2.invoke$lambda$10$lambda$5$lambda$4(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoHeroTextInput(strBeneficiaryNameComposable$lambda$2, (Function1) objRememberedValue3, modifierTestTag, null, strStringResource, null, null, null, null, keyboardOptionsM5353copyINvB4aQ$default, keyboardActions, null, false, false, composer, 0, 0, 14824);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
        Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BeneficiaryNameComposable.LastNameTestTag);
        String strBeneficiaryNameComposable$lambda$6 = BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$6(snapshotState2);
        String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.withdrawal_beneficiary_name_hint_2, composer, 0);
        KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default2 = KeyboardOptions.m5353copyINvB4aQ$default(companion4.getDefault(), 0, null, 0, companion5.m7747getDoneeUduSuo(), null, null, null, 119, null);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged2 = composer.changed(function2) | composer.changed(snapshotState) | composer.changed(snapshotState2);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$2$1$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryNameComposable2.invoke$lambda$10$lambda$7$lambda$6(function2, snapshotState4, snapshotState, snapshotState2, (KeyboardActions2) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        KeyboardActions keyboardActions2 = new KeyboardActions((Function1) objRememberedValue4, null, null, null, null, null, 62, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged3 = composer.changed(snapshotState2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$2$1$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryNameComposable2.invoke$lambda$10$lambda$9$lambda$8(snapshotState2, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoHeroTextInput(strBeneficiaryNameComposable$lambda$6, (Function1) objRememberedValue5, modifierTestTag2, null, strStringResource2, null, null, null, null, keyboardOptionsM5353copyINvB4aQ$default2, keyboardActions2, null, false, false, composer, 384, 0, 14824);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$1$lambda$0(SnapshotState snapshotState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$14(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$3$lambda$2(FocusManager focusManager, KeyboardActions2 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.mo6487moveFocus3ESFkO8(FocusDirection.INSTANCE.m6478getDowndhqQ8s());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$5$lambda$4(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= 35) {
            snapshotState.setValue(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$7$lambda$6(Function2 function2, SnapshotState4 snapshotState4, SnapshotState snapshotState, SnapshotState snapshotState2, KeyboardActions2 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        if (BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$10(snapshotState4)) {
            function2.invoke(BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$2(snapshotState), BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$6(snapshotState2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= 35) {
            snapshotState.setValue(it);
        }
        return Unit.INSTANCE;
    }
}
