package com.robinhood.android.apyboost;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApyBoostCelebrationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.apyboost.ApyBoostCelebrationFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ApyBoostCelebrationFragment2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UiPostTransferPage.ApyBoostCelebration $apyBoostCelebration;
    final /* synthetic */ ApyBoostCelebrationFragment this$0;

    ApyBoostCelebrationFragment2(UiPostTransferPage.ApyBoostCelebration apyBoostCelebration, ApyBoostCelebrationFragment apyBoostCelebrationFragment) {
        this.$apyBoostCelebration = apyBoostCelebration;
        this.this$0 = apyBoostCelebrationFragment;
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
            ComposerKt.traceEventStart(1011028405, i, -1, "com.robinhood.android.apyboost.ApyBoostCelebrationFragment.ComposeContent.<anonymous>.<anonymous> (ApyBoostCelebrationFragment.kt:101)");
        }
        UiPostTransferPage.ApyBoostCelebration apyBoostCelebration = this.$apyBoostCelebration;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final ApyBoostCelebrationFragment apyBoostCelebrationFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.apyboost.ApyBoostCelebrationFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ApyBoostCelebrationFragment2.invoke$lambda$1$lambda$0(apyBoostCelebrationFragment, (GenericAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ApyBoostCelebrationComposable.ApyBoostCelebrationComposable(apyBoostCelebration, (Function1) objRememberedValue, null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ApyBoostCelebrationFragment apyBoostCelebrationFragment, GenericAction genericAction) {
        apyBoostCelebrationFragment.getCallbacks().onConfirmationClick(genericAction);
        return Unit.INSTANCE;
    }
}
