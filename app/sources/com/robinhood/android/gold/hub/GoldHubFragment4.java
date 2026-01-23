package com.robinhood.android.gold.hub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.hub.GoldHubFragment$ComposeContent$3$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldHubFragment4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SduiActionHandler<GoldHubAction> $actionHandler;
    final /* synthetic */ GenericAlertContent<GoldHubAction> $it;
    final /* synthetic */ GoldHubFragment this$0;

    /* JADX WARN: Multi-variable type inference failed */
    GoldHubFragment4(GenericAlertContent<? extends GoldHubAction> genericAlertContent, SduiActionHandler<? super GoldHubAction> sduiActionHandler, GoldHubFragment goldHubFragment) {
        this.$it = genericAlertContent;
        this.$actionHandler = sduiActionHandler;
        this.this$0 = goldHubFragment;
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
            ComposerKt.traceEventStart(-810850018, i, -1, "com.robinhood.android.gold.hub.GoldHubFragment.ComposeContent.<anonymous>.<anonymous> (GoldHubFragment.kt:139)");
        }
        SduiAlert sduiAlert = SduiAlert.INSTANCE;
        GenericAlertContent<GoldHubAction> genericAlertContent = this.$it;
        SduiActionHandler<GoldHubAction> sduiActionHandler = this.$actionHandler;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final GoldHubFragment goldHubFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$ComposeContent$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldHubFragment4.invoke$lambda$1$lambda$0(goldHubFragment);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        sduiAlert.Dialog(genericAlertContent, sduiActionHandler, null, (Function0) objRememberedValue, composer, SduiAlert.$stable << 12, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(GoldHubFragment goldHubFragment) {
        goldHubFragment.setModal(null);
        return Unit.INSTANCE;
    }
}
