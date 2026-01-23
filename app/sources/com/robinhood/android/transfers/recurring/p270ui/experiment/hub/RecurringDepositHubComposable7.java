package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import android.content.res.Resources;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations8;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringDepositHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1$1$1$3, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositHubComposable7 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ LifecycleAwareNavigator $composeNavigator;
    final /* synthetic */ SnapshotState4<RecurringDepositHubViewState> $viewState$delegate;

    RecurringDepositHubComposable7(LifecycleAwareNavigator lifecycleAwareNavigator, SnapshotState4<RecurringDepositHubViewState> snapshotState4) {
        this.$composeNavigator = lifecycleAwareNavigator;
        this.$viewState$delegate = snapshotState4;
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
            ComposerKt.traceEventStart(413656534, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringDepositHubComposable.kt:150)");
        }
        int i2 = C20690R.drawable.pict_mono_rds_money;
        String strStringResource = StringResources_androidKt.stringResource(C30439R.string.recurring_deposit_extra_cash_row_primary_text, composer, 0);
        String labelPillForRecurringExtraCash = RecurringDepositHubComposable4.RecurringDepositHubComposable$lambda$0(this.$viewState$delegate).getLabelPillForRecurringExtraCash();
        String strStringResource2 = StringResources_androidKt.stringResource(C30439R.string.recurring_deposit_extra_cash_row_secondary_text, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$composeNavigator);
        final LifecycleAwareNavigator lifecycleAwareNavigator = this.$composeNavigator;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1$1$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringDepositHubComposable7.invoke$lambda$1$lambda$0(lifecycleAwareNavigator);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RecurringDepositHubComposable4.RecurringDepositSetUpRow(i2, strStringResource, labelPillForRecurringExtraCash, strStringResource2, (Function0) objRememberedValue, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "set_up_extra_cash", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestination.composeNav$default(RecurringDepositExtraCashDestinations8.INSTANCE, null, null, 3, null), false, (Function1) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
