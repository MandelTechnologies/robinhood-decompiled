package com.robinhood.android.creditcard.p091ui.creditapplication.idverification;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoTextInput4;
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
final class IdVerificationComposableKt$IdVerification$2$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<String> $firstName$delegate;

    IdVerificationComposableKt$IdVerification$2$1$1$1(SnapshotState<String> snapshotState) {
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
            ComposerKt.traceEventStart(-554147486, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerification.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdVerificationComposable.kt:150)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, IdVerificationComposableKt.ID_VERIFICATION_FIRST_NAME_TEST_TAG);
        String strIdVerification$lambda$2 = IdVerificationComposableKt.IdVerification$lambda$2(this.$firstName$delegate);
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_first_name_input_placeholder, composer, 0);
        KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7770getWordsIUNYP9k(), null, 0, 0, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$firstName$delegate);
        final SnapshotState<String> snapshotState = this.$firstName$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationComposableKt$IdVerification$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IdVerificationComposableKt$IdVerification$2$1$1$1.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoHeroTextInput(strIdVerification$lambda$2, (Function1) objRememberedValue, modifierTestTag, null, strStringResource, null, null, null, null, keyboardOptions, null, null, false, false, composer, 805306752, 0, 15848);
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
