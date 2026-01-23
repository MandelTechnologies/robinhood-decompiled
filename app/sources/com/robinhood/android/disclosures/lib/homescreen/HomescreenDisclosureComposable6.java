package com.robinhood.android.disclosures.lib.homescreen;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.disclosures.lib.C14229R;
import com.robinhood.android.disclosures.lib.p107ui.DisclosureText2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HomescreenDisclosureComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureComposableKt$SelfDirectedAccountDisclosure$1$1, reason: use source file name */
/* loaded from: classes27.dex */
final class HomescreenDisclosureComposable6 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function1<Integer, Unit> $onShowDialog;
    final /* synthetic */ HomescreenDisclosureViewState $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    HomescreenDisclosureComposable6(HomescreenDisclosureViewState homescreenDisclosureViewState, Function1<? super Integer, Unit> function1, Navigator navigator, Context context) {
        this.$viewState = homescreenDisclosureViewState;
        this.$onShowDialog = function1;
        this.$navigator = navigator;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(600515092, i, -1, "com.robinhood.android.disclosures.lib.homescreen.SelfDirectedAccountDisclosure.<anonymous>.<anonymous> (HomescreenDisclosureComposable.kt:108)");
        }
        int i2 = C14229R.string.watchlist_general_disclosure;
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, HomescreenDisclosureComposable3.HOMESCREEN_DISCLOSURE_TEST_TAG);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureComposableKt$SelfDirectedAccountDisclosure$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomescreenDisclosureComposable6.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changed(this.$onShowDialog) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
        final HomescreenDisclosureViewState homescreenDisclosureViewState = this.$viewState;
        final Function1<Integer, Unit> function1 = this.$onShowDialog;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureComposableKt$SelfDirectedAccountDisclosure$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomescreenDisclosureComposable6.invoke$lambda$3$lambda$2(homescreenDisclosureViewState, function1, navigator, context, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        DisclosureText2.DisclosureText(i2, modifierSemantics$default, (Function1) objRememberedValue2, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(HomescreenDisclosureViewState homescreenDisclosureViewState, Function1 function1, Navigator navigator, Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (homescreenDisclosureViewState.getDisclosureContentfulId() != null) {
            function1.invoke(homescreenDisclosureViewState.getDisclosureVersion());
            Navigator.DefaultImpls.startActivity$default(navigator, context, new RemoteDisclosureKey(homescreenDisclosureViewState.getDisclosureContentfulId(), null, false, false, null, null, null, false, 250, null), null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }
}
