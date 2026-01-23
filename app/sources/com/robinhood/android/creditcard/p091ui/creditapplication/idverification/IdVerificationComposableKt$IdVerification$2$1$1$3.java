package com.robinhood.android.creditcard.p091ui.creditapplication.idverification;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.creditcard.p091ui.creditapplication.textinputs.DateOfBirthHeroInput;
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
final class IdVerificationComposableKt$IdVerification$2$1$1$3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<String> $dob$delegate;
    final /* synthetic */ SnapshotState<Boolean> $dobError$delegate;

    IdVerificationComposableKt$IdVerification$2$1$1$3(SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$dob$delegate = snapshotState;
        this.$dobError$delegate = snapshotState2;
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
            ComposerKt.traceEventStart(-1934618662, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerification.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdVerificationComposable.kt:174)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, IdVerificationComposableKt.ID_VERIFICATION_DATE_OF_BIRTH_TEST_TAG);
        String strIdVerification$lambda$10 = IdVerificationComposableKt.IdVerification$lambda$10(this.$dob$delegate);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$dob$delegate);
        final SnapshotState<String> snapshotState = this.$dob$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$IdVerification$2$1$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IdVerificationComposableKt$IdVerification$2$1$1$3.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(this.$dobError$delegate);
        final SnapshotState<Boolean> snapshotState2 = this.$dobError$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$IdVerification$2$1$1$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IdVerificationComposableKt$IdVerification$2$1$1$3.invoke$lambda$3$lambda$2(snapshotState2, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        DateOfBirthHeroInput.DateOfBirthHeroInput(strIdVerification$lambda$10, function1, modifierTestTag, false, null, (Function1) objRememberedValue2, composer, 384, 24);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, boolean z) {
        IdVerificationComposableKt.IdVerification$lambda$15(snapshotState, z);
        return Unit.INSTANCE;
    }
}
