package com.robinhood.android.creditcard.p091ui.creditapplication.identity.updateInfo;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.PersonalInfo;
import com.robinhood.android.creditcard.p091ui.creditapplication.textinputs.PhoneNumberHeroInput;
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
final class UpdateInfoComposableKt$UpdateInfo$2$1$1$4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ PersonalInfo $info;
    final /* synthetic */ BentoTextInput8.Icon.Size24 $lock;
    final /* synthetic */ SnapshotState<String> $phone$delegate;

    UpdateInfoComposableKt$UpdateInfo$2$1$1$4(PersonalInfo personalInfo, BentoTextInput8.Icon.Size24 size24, SnapshotState<String> snapshotState) {
        this.$info = personalInfo;
        this.$lock = size24;
        this.$phone$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-65115008, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdateInfoComposable.kt:180)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, UpdateInfoComposableKt.UPDATE_INFO_E164_TEST_TAG);
        String strUpdateInfo$lambda$14 = UpdateInfoComposableKt.UpdateInfo$lambda$14(this.$phone$delegate);
        boolean z = this.$info.getE164().length() == 0;
        BentoTextInput8.Icon.Size24 size24 = this.$info.getE164().length() > 0 ? this.$lock : null;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$phone$delegate);
        final SnapshotState<String> snapshotState = this.$phone$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$UpdateInfo$2$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdateInfoComposableKt$UpdateInfo$2$1$1$4.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PhoneNumberHeroInput.PhoneNumberHeroInput(strUpdateInfo$lambda$14, (Function1) objRememberedValue, modifierTestTag, null, z, size24, composer, (BentoTextInput8.Icon.Size24.$stable << 15) | 384, 8);
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
