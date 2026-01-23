package com.robinhood.android.eventcontracts.hub.p134v2.home;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.eventcontracts.hub.p134v2.HubTestTags;
import com.robinhood.android.eventcontracts.sharedeventui.ShortEventContractDisclosure;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HubDefaultCategoryContentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.ComposableSingletons$HubDefaultCategoryContentComposableKt$lambda$566279186$1, reason: use source file name */
/* loaded from: classes3.dex */
final class HubDefaultCategoryContentComposable3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final HubDefaultCategoryContentComposable3 INSTANCE = new HubDefaultCategoryContentComposable3();

    HubDefaultCategoryContentComposable3() {
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
            ComposerKt.traceEventStart(566279186, i, -1, "com.robinhood.android.eventcontracts.hub.v2.home.ComposableSingletons$HubDefaultCategoryContentComposableKt.lambda$566279186.<anonymous> (HubDefaultCategoryContentComposable.kt:133)");
        }
        final HubNavigationCallbacks hubNavigationCallbacks = (HubNavigationCallbacks) composer.consume(HubNavigationCallbacks2.getLocalHubNavigationCallbacks());
        Modifier modifierAutomationTestTag = AutomationTestTagModifierExt.automationTestTag(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composer, 6, 1), HubTestTags.HUB_DISCLOSURE);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(hubNavigationCallbacks);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.ComposableSingletons$HubDefaultCategoryContentComposableKt$lambda$566279186$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HubDefaultCategoryContentComposable3.invoke$lambda$1$lambda$0(hubNavigationCallbacks);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ShortEventContractDisclosure.ShortEventContractDisclosure(modifierAutomationTestTag, (Function0) objRememberedValue, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(HubNavigationCallbacks hubNavigationCallbacks) {
        hubNavigationCallbacks.showEventContractDisclosure();
        return Unit.INSTANCE;
    }
}
