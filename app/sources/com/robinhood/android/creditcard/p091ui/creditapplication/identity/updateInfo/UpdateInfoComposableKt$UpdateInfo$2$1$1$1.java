package com.robinhood.android.creditcard.p091ui.creditapplication.identity.updateInfo;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.PersonalInfo;
import com.robinhood.compose.bento.component.BentoTextInput4;
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
final class UpdateInfoComposableKt$UpdateInfo$2$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<String> $firstName$delegate;
    final /* synthetic */ PersonalInfo $info;
    final /* synthetic */ BentoTextInput8.Icon.Size24 $lock;

    UpdateInfoComposableKt$UpdateInfo$2$1$1$1(PersonalInfo personalInfo, BentoTextInput8.Icon.Size24 size24, SnapshotState<String> snapshotState) {
        this.$info = personalInfo;
        this.$lock = size24;
        this.$firstName$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-801217693, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdateInfoComposable.kt:128)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, UpdateInfoComposableKt.UPDATE_INFO_FIRST_NAME_TEST_TAG);
        String strUpdateInfo$lambda$2 = UpdateInfoComposableKt.UpdateInfo$lambda$2(this.$firstName$delegate);
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_first_name_input_placeholder, composer, 0);
        KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7770getWordsIUNYP9k(), null, KeyboardType.INSTANCE.m7785getTextPjHm6EE(), 0, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        boolean z = this.$info.getFirstName().length() == 0;
        BentoTextInput8.Icon.Size24 size24 = this.$info.getFirstName().length() > 0 ? this.$lock : null;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$firstName$delegate);
        final SnapshotState<String> snapshotState = this.$firstName$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.identity.updateInfo.UpdateInfoComposableKt$UpdateInfo$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdateInfoComposableKt$UpdateInfo$2$1$1$1.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoHeroTextInput(strUpdateInfo$lambda$2, (Function1) objRememberedValue, modifierTestTag, null, strStringResource, null, size24, null, null, keyboardOptions, null, null, z, false, composer, (BentoTextInput8.Icon.Size24.$stable << 18) | 805306752, 0, 11688);
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
