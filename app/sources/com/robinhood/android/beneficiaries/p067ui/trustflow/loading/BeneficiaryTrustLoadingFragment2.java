package com.robinhood.android.beneficiaries.p067ui.trustflow.loading;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustNameViewModel;
import com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameCallbacks;
import com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameCompose;
import com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryTrustLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.loading.ComposableSingletons$BeneficiaryTrustLoadingFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiaryTrustLoadingFragment2 {
    public static final BeneficiaryTrustLoadingFragment2 INSTANCE = new BeneficiaryTrustLoadingFragment2();

    /* renamed from: lambda$-608077995, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8670lambda$608077995 = ComposableLambda3.composableLambdaInstance(-608077995, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.loading.ComposableSingletons$BeneficiaryTrustLoadingFragmentKt$lambda$-608077995$1
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
                ComposerKt.traceEventStart(-608077995, i, -1, "com.robinhood.android.beneficiaries.ui.trustflow.loading.ComposableSingletons$BeneficiaryTrustLoadingFragmentKt.lambda$-608077995.<anonymous> (BeneficiaryTrustLoadingFragment.kt:44)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            BeneficiaryTrustNameCompose.BeneficiaryTrustNameScaffold(new BeneficiaryTrustNameViewState(new BeneficiaryFlowTrustNameViewModel("----- ----", "----- ------------ -- -- -----\n--- ---  - ---------- ---------", null, null, null, null, 60, null), "", StringResource.INSTANCE.invoke("------ -- ------ -")), new BeneficiaryTrustNameCallbacks() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.loading.ComposableSingletons$BeneficiaryTrustLoadingFragmentKt$lambda$-608077995$1$1$1
                @Override // com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameCallbacks
                public void onTrustNameConfirmed() {
                }

                @Override // com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameCallbacks
                public void onTrustNameInput(String input) {
                    Intrinsics.checkNotNullParameter(input, "input");
                }
            }, null, composer, 0, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-701088315, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8671lambda$701088315 = ComposableLambda3.composableLambdaInstance(-701088315, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.loading.ComposableSingletons$BeneficiaryTrustLoadingFragmentKt$lambda$-701088315$1
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
                ComposerKt.traceEventStart(-701088315, i, -1, "com.robinhood.android.beneficiaries.ui.trustflow.loading.ComposableSingletons$BeneficiaryTrustLoadingFragmentKt.lambda$-701088315.<anonymous> (BeneficiaryTrustLoadingFragment.kt:40)");
            }
            LocalShowPlaceholder.Loadable(true, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, BeneficiaryTrustLoadingFragment2.INSTANCE.m11431getLambda$608077995$feature_beneficiaries_externalDebug(), composer, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-608077995$feature_beneficiaries_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11431getLambda$608077995$feature_beneficiaries_externalDebug() {
        return f8670lambda$608077995;
    }

    /* renamed from: getLambda$-701088315$feature_beneficiaries_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11432getLambda$701088315$feature_beneficiaries_externalDebug() {
        return f8671lambda$701088315;
    }
}
