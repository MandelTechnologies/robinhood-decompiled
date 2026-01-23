package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldBasicDownsellBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet$ComposeContent$1$1$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class GoldBasicDownsellBottomSheet2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $isLoading$delegate;
    final /* synthetic */ SnapshotState<Boolean> $showErrorDialog$delegate;
    final /* synthetic */ GoldBasicDownsellBottomSheet this$0;

    GoldBasicDownsellBottomSheet2(CoroutineScope coroutineScope, EventLogger eventLogger, GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheet, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$coroutineScope = coroutineScope;
        this.$eventLogger = eventLogger;
        this.this$0 = goldBasicDownsellBottomSheet;
        this.$isLoading$delegate = snapshotState;
        this.$showErrorDialog$delegate = snapshotState2;
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
            ComposerKt.traceEventStart(967349174, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldBasicDownsellBottomSheet.kt:120)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_gold_basic_downsell_primary_cta, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        boolean zComposeContent$lambda$1 = GoldBasicDownsellBottomSheet.ComposeContent$lambda$1(this.$isLoading$delegate);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final EventLogger eventLogger = this.$eventLogger;
        final GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheet = this.this$0;
        final SnapshotState<Boolean> snapshotState = this.$isLoading$delegate;
        final SnapshotState<Boolean> snapshotState2 = this.$showErrorDialog$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function0 function0 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet$ComposeContent$1$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldBasicDownsellBottomSheet2.invoke$lambda$1$lambda$0(coroutineScope, eventLogger, goldBasicDownsellBottomSheet, snapshotState, snapshotState2);
                }
            };
            composer.updateRememberedValue(function0);
            objRememberedValue = function0;
        }
        Function0 function02 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
        final EventLogger eventLogger2 = this.$eventLogger;
        final GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheet2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet$ComposeContent$1$1$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldBasicDownsellBottomSheet2.invoke$lambda$3$lambda$2(eventLogger2, goldBasicDownsellBottomSheet2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, strStringResource, zComposeContent$lambda$1, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 58943);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, EventLogger eventLogger, GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheet, SnapshotState snapshotState, SnapshotState snapshotState2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GoldBasicDownsellBottomSheet3(eventLogger, goldBasicDownsellBottomSheet, snapshotState, snapshotState2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheet) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.CC_APPLICATION_ACCOUNT_TERMS, null, null, null, 14, null), new Component(Component.ComponentType.CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET, null, null, 6, null), null, null, false, 56, null);
        Function0<Unit> onDismiss = goldBasicDownsellBottomSheet.getOnDismiss();
        if (onDismiss != null) {
            onDismiss.invoke();
        }
        goldBasicDownsellBottomSheet.dismiss();
        return Unit.INSTANCE;
    }
}
