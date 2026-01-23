package com.robinhood.android.creditcard.p091ui.creditapplication.idverification;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.creditcard.p091ui.creditapplication.textinputs.SsnHeroInput;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdVerificationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class IdVerificationComposableKt$IdVerification$2$1$1$4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<String> $ssn$delegate;

    IdVerificationComposableKt$IdVerification$2$1$1$4(SnapshotState<String> snapshotState) {
        this.$ssn$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-1883933669, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerification.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdVerificationComposable.kt:185)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, IdVerificationComposableKt.ID_VERIFICATION_SSN_TEST_TAG);
        String strIdVerification$lambda$18 = IdVerificationComposableKt.IdVerification$lambda$18(this.$ssn$delegate);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$ssn$delegate);
        final SnapshotState<String> snapshotState = this.$ssn$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$IdVerification$2$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IdVerificationComposableKt$IdVerification$2$1$1$4.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SsnHeroInput.SsnHeroInput(strIdVerification$lambda$18, (Function1) objRememberedValue, modifierTestTag, composer, 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }
}
