package com.robinhood.android.creditcard.p091ui.creditapplication.identity.ssn;

import android.text.TextUtils;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SsnComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.ssn.SsnComposableKt$Ssn$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class SsnComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Function1<String, Unit> $onContinue;
    final /* synthetic */ SnapshotState<String> $ssn$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    SsnComposable2(EventLogger eventLogger, Function1<? super String, Unit> function1, SnapshotState<String> snapshotState) {
        this.$eventLogger = eventLogger;
        this.$onContinue = function1;
        this.$ssn$delegate = snapshotState;
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
            ComposerKt.traceEventStart(1550033491, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.ssn.Ssn.<anonymous>.<anonymous>.<anonymous> (SsnComposable.kt:61)");
        }
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue) | composer.changed(this.$ssn$delegate);
        final EventLogger eventLogger = this.$eventLogger;
        final Function1<String, Unit> function1 = this.$onContinue;
        final SnapshotState<String> snapshotState = this.$ssn$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.ssn.SsnComposableKt$Ssn$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SsnComposable2.invoke$lambda$1$lambda$0(eventLogger, function1, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        boolean z = false;
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
        if (SsnComposable.Ssn$lambda$2(this.$ssn$delegate).length() == 9 && TextUtils.isDigitsOnly(SsnComposable.Ssn$lambda$2(this.$ssn$delegate))) {
            z = true;
        }
        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, strStringResource, false, null, z, null, null, false, null, false, composer, 0, 0, 64319);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function1 function1, SnapshotState snapshotState) {
        loggingUtils.logContinue$default(eventLogger, null, 1, null);
        function1.invoke(SsnComposable.Ssn$lambda$2(snapshotState));
        return Unit.INSTANCE;
    }
}
