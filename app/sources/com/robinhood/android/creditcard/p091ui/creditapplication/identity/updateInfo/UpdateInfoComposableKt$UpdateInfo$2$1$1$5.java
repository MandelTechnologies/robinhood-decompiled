package com.robinhood.android.creditcard.p091ui.creditapplication.identity.updateInfo;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.PersonalInfo;
import com.robinhood.android.creditcard.p091ui.creditapplication.textinputs.DateOfBirthHeroInput;
import com.robinhood.compose.bento.component.BentoTextInput8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UpdateInfoComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class UpdateInfoComposableKt$UpdateInfo$2$1$1$5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<String> $dob$delegate;
    final /* synthetic */ SnapshotState<Boolean> $dobError$delegate;
    final /* synthetic */ PersonalInfo $info;
    final /* synthetic */ BentoTextInput8.Icon.Size24 $lock;

    UpdateInfoComposableKt$UpdateInfo$2$1$1$5(PersonalInfo personalInfo, BentoTextInput8.Icon.Size24 size24, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$info = personalInfo;
        this.$lock = size24;
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
            ComposerKt.traceEventStart(1611908319, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdateInfoComposable.kt:194)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, UpdateInfoComposableKt.UPDATE_INFO_DATE_OF_BIRTH_TEST_TAG);
        String strUpdateInfo$lambda$18 = UpdateInfoComposableKt.UpdateInfo$lambda$18(this.$dob$delegate);
        boolean z = this.$info.getDateOfBirth().length() == 0;
        BentoTextInput8.Icon.Size24 size24 = this.$info.getDateOfBirth().length() > 0 ? this.$lock : null;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$dob$delegate);
        final SnapshotState<String> snapshotState = this.$dob$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$UpdateInfo$2$1$1$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdateInfoComposableKt$UpdateInfo$2$1$1$5.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged2 = composer.changed(this.$info) | composer.changed(this.$dobError$delegate);
        final PersonalInfo personalInfo = this.$info;
        final SnapshotState<Boolean> snapshotState2 = this.$dobError$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$UpdateInfo$2$1$1$5$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdateInfoComposableKt$UpdateInfo$2$1$1$5.invoke$lambda$3$lambda$2(personalInfo, snapshotState2, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        DateOfBirthHeroInput.DateOfBirthHeroInput(strUpdateInfo$lambda$18, function1, modifierTestTag, z, size24, (Function1) objRememberedValue2, composer, (BentoTextInput8.Icon.Size24.$stable << 12) | 384, 0);
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
    public static final Unit invoke$lambda$3$lambda$2(PersonalInfo personalInfo, SnapshotState snapshotState, boolean z) {
        if (personalInfo.getDateOfBirth().length() == 0) {
            UpdateInfoComposableKt.UpdateInfo$lambda$23(snapshotState, z);
        }
        return Unit.INSTANCE;
    }
}
