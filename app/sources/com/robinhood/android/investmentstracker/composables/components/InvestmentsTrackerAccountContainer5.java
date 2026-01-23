package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import bff_money_movement.service.p019v1.InvestmentsTrackerAccountContainerDto;
import com.robinhood.android.investmentstracker.linking.models.AccountListContainerViewModel;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerAccountContainer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerAccountContainer5 implements Function2<Composer, Integer, Unit> {
    public static final InvestmentsTrackerAccountContainer5 INSTANCE = new InvestmentsTrackerAccountContainer5();

    InvestmentsTrackerAccountContainer5() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$3$lambda$2(InvestmentsTrackerAccountContainerDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$7$lambda$6(InvestmentsTrackerAccountContainerDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$5$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2055320221, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt.lambda$-2055320221.<anonymous> (InvestmentsTrackerAccountContainer.kt:69)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM()), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
        AccountListContainerViewModel accountListContainerViewModel = new AccountListContainerViewModel(false, true, InvestmentsTrackerAccountContainer6.getTestAccount(true));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentsTrackerAccountContainer5.invoke$lambda$16$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentsTrackerAccountContainer5.invoke$lambda$16$lambda$3$lambda$2((InvestmentsTrackerAccountContainerDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerAccountContainer6.InvestmentsTrackerAccountContainer(accountListContainerViewModel, function1, (Function1) objRememberedValue2, null, composer, 432, 8);
        AccountListContainerViewModel accountListContainerViewModel2 = new AccountListContainerViewModel(false, true, InvestmentsTrackerAccountContainer6.getTestAccount(false));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentsTrackerAccountContainer5.invoke$lambda$16$lambda$5$lambda$4((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function12 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentsTrackerAccountContainer5.invoke$lambda$16$lambda$7$lambda$6((InvestmentsTrackerAccountContainerDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerAccountContainer6.InvestmentsTrackerAccountContainer(accountListContainerViewModel2, function12, (Function1) objRememberedValue4, null, composer, 432, 8);
        AccountListContainerViewModel accountListContainerViewModel3 = new AccountListContainerViewModel(true, false, InvestmentsTrackerAccountContainer6.getTestAccount(true));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentsTrackerAccountContainer5.invoke$lambda$16$lambda$9$lambda$8((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function1 function13 = (Function1) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentsTrackerAccountContainer5.invoke$lambda$16$lambda$11$lambda$10((InvestmentsTrackerAccountContainerDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerAccountContainer6.InvestmentsTrackerAccountContainer(accountListContainerViewModel3, function13, (Function1) objRememberedValue6, null, composer, 432, 8);
        AccountListContainerViewModel accountListContainerViewModel4 = new AccountListContainerViewModel(false, false, InvestmentsTrackerAccountContainer6.getTestAccount(true));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion3.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentsTrackerAccountContainer5.invoke$lambda$16$lambda$13$lambda$12((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function1 function14 = (Function1) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion3.getEmpty()) {
            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-2055320221$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentsTrackerAccountContainer5.invoke$lambda$16$lambda$15$lambda$14((InvestmentsTrackerAccountContainerDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerAccountContainer6.InvestmentsTrackerAccountContainer(accountListContainerViewModel4, function14, (Function1) objRememberedValue8, null, composer, 432, 8);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$11$lambda$10(InvestmentsTrackerAccountContainerDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$9$lambda$8(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15$lambda$14(InvestmentsTrackerAccountContainerDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$13$lambda$12(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
