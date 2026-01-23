package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoFeeTierStatusComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ CryptoFeeTierStatusViewState $viewState;

    CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$6(CryptoFeeTierStatusViewState cryptoFeeTierStatusViewState, Navigator navigator, Context context) {
        this.$viewState = cryptoFeeTierStatusViewState;
        this.$navigator = navigator;
        this.$context = context;
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
            ComposerKt.traceEventStart(1797553097, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:176)");
        }
        composer.startReplaceGroup(871677741);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        if (!this.$viewState.isContentLoading()) {
            modifierFillMaxWidth$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "view_fee_tier_details", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
        }
        Modifier modifier = modifierFillMaxWidth$default;
        composer.endReplaceGroup();
        String strStringResource = StringResources_androidKt.stringResource(C40095R.string.f6283xc483bfef, composer, 0);
        boolean z = !this.$viewState.isContentLoading();
        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$6.invoke$lambda$3$lambda$2(navigator, context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifier, null, type2, z, false, null, null, null, null, false, null, composer, 24576, 0, 8136);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context) {
        CryptoFeeTierStatusComposableKt.navigateToFeeTierScreen(navigator, context);
        return Unit.INSTANCE;
    }
}
