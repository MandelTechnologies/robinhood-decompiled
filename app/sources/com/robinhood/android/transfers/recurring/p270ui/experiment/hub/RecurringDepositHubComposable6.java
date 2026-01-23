package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.RecurringMaxTransfer;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringDepositHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1$1$1$2, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositHubComposable6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;

    RecurringDepositHubComposable6(Navigator navigator, Context context) {
        this.$navigator = navigator;
        this.$context = context;
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
            ComposerKt.traceEventStart(885653943, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringDepositHubComposable.kt:124)");
        }
        int i2 = C20690R.drawable.pict_mono_rds_dollar_sign;
        String strStringResource = StringResources_androidKt.stringResource(C30439R.string.recurring_deposit_row_primary_text, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C30439R.string.recurring_deposit_row_secondary_text, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringDepositHubComposable6.invoke$lambda$1$lambda$0(navigator, context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RecurringDepositHubComposable4.RecurringDepositSetUpRow(i2, strStringResource, null, strStringResource2, (Function0) objRememberedValue, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "set_up_fixed_amount", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), composer, 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new RecurringMaxTransfer(null, null, 3, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
