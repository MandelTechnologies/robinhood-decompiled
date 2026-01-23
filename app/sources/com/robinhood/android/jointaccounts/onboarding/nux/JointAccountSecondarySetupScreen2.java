package com.robinhood.android.jointaccounts.onboarding.nux;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.jointaccounts.api.confirmation.ApiSecondarySetupViewModel;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: JointAccountSecondarySetupScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$LoadedJointAccountSecondarySetupScreen$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class JointAccountSecondarySetupScreen2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ ServerToBentoAssetMapper2 $iconAsset;
    final /* synthetic */ Function1<ApiSecondarySetupViewModel.ShareViewModel, Unit> $onShareClicked;
    final /* synthetic */ ApiSecondarySetupViewModel $viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    JointAccountSecondarySetupScreen2(ApiSecondarySetupViewModel apiSecondarySetupViewModel, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function1<? super ApiSecondarySetupViewModel.ShareViewModel, Unit> function1) {
        this.$viewModel = apiSecondarySetupViewModel;
        this.$iconAsset = serverToBentoAssetMapper2;
        this.$onShareClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function1 function1, ApiSecondarySetupViewModel apiSecondarySetupViewModel) {
        function1.invoke(apiSecondarySetupViewModel.getShare_view_model());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833481316, i, -1, "com.robinhood.android.jointaccounts.onboarding.nux.LoadedJointAccountSecondarySetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JointAccountSecondarySetupScreen.kt:74)");
        }
        Arrangement arrangement = Arrangement.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
        final ApiSecondarySetupViewModel apiSecondarySetupViewModel = this.$viewModel;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.$iconAsset;
        final Function1<ApiSecondarySetupViewModel.ShareViewModel, Unit> function1 = this.$onShareClicked;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        BentoText2.m20747BentoText38GnDrw(apiSecondarySetupViewModel.getTitle_text(), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
        String mobile_title = apiSecondarySetupViewModel.getShare_view_model().getMobile_title();
        BentoBaseRowState.Start.Icon icon = serverToBentoAssetMapper2 != null ? new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null) : null;
        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, apiSecondarySetupViewModel.getShare_view_model().getLogging_identifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 7, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(function1) | composer.changedInstance(apiSecondarySetupViewModel);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$LoadedJointAccountSecondarySetupScreen$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JointAccountSecondarySetupScreen2.invoke$lambda$3$lambda$2$lambda$1(function1, apiSecondarySetupViewModel);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierM5146paddingqDBjuR0$default, icon, mobile_title, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer, BentoBaseRowState.Start.Icon.$stable << 3, 0, 2040);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
