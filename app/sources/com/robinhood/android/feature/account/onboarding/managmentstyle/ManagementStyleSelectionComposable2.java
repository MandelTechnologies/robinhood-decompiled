package com.robinhood.android.feature.account.onboarding.managmentstyle;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionViewState;
import com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementTypeSelectionRow;
import com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ManagementStyleSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ComposableSingletons$ManagementStyleSelectionComposableKt$lambda$-315164758$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ManagementStyleSelectionComposable2 implements Function2<Composer, Integer, Unit> {
    public static final ManagementStyleSelectionComposable2 INSTANCE = new ManagementStyleSelectionComposable2();

    ManagementStyleSelectionComposable2() {
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
            ComposerKt.traceEventStart(-315164758, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ComposableSingletons$ManagementStyleSelectionComposableKt.lambda$-315164758.<anonymous> (ManagementStyleSelectionComposable.kt:420)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ManagementStyleSelectionViewState.Loaded loaded = new ManagementStyleSelectionViewState.Loaded("Choose a management style for your individual account", "You can open a total of 10 self-directed and 1 managed accounts.", "Lorem ipsum dolor amet sit amet consectetur adipiscing elit [match limits](robinhood://enoki_info)", BrokerageAccountType.INDIVIDUAL, extensions2.persistentListOf(new ManagementTypeSelectionRow(ManagementType.SELF_DIRECTED, null, RetirementManagementStyleSelectionComposable3.IDENTIFIER_SELF_DIRECTED_BUTTON, "Choose and manage your own investments", true, "Learn more", new ManagementTypeSelectionRow.BottomSheet(RetirementManagementStyleSelectionComposable3.IDENTIFIER_SELF_DIRECTED_BUTTON, "Choose your own investments and manage them your way.", "Select self-directed", "", "Cancel", "", "", "Lorem ipsum dolor amet sit amet consectetur", extensions2.persistentListOf(new ManagementTypeSelectionRow.ValueProp("Invest in stocks, ETFs, options, and more", "You can invest in a variety of assets to build a diversified portfolio."), new ManagementTypeSelectionRow.ValueProp("Access to research and analysis tools", "You can use our research and analysis tools to make informed investment decisions."), new ManagementTypeSelectionRow.ValueProp("No management fees", "You can manage your own investments without paying any management fees."))), "", 2, null), new ManagementTypeSelectionRow(ManagementType.MANAGED, null, "Managed by Robinhood Strategies", "Have a team of investing experts create and\nmanage a diversified portfolio for you", false, "Learn more", new ManagementTypeSelectionRow.BottomSheet(RetirementManagementStyleSelectionComposable3.IDENTIFIER_MANAGED_BUTTON, "Get a portfolio", "Select managed", "", "Cancel", "", "", "Lorem ipsum dolor amet sit amet consectetur", extensions2.persistentListOf()), "", 2, null)), "");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ComposableSingletons$ManagementStyleSelectionComposableKt$lambda$-315164758$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManagementStyleSelectionComposable2.invoke$lambda$1$lambda$0((ManagementType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ManagementStyleSelectionComposable4.ManagementStyleSelection(loaded, (Function1) objRememberedValue, modifierFillMaxSize$default, composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ManagementType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
