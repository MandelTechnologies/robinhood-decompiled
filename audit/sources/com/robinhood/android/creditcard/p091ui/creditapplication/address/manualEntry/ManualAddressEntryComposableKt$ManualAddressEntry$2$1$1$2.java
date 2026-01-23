package com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry;

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

/* compiled from: ManualAddressEntryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<String> $line1$delegate;

    ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$2(SnapshotState<String> snapshotState) {
        this.$line1$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-1396287681, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManualAddressEntryComposable.kt:128)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_LINE1_INPUT_TEST_TAG);
        String strManualAddressEntry$lambda$2 = ManualAddressEntryComposableKt.ManualAddressEntry$lambda$2(this.$line1$delegate);
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_line1_placeholder, composer, 0);
        KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7770getWordsIUNYP9k(), null, 0, 0, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$line1$delegate);
        final SnapshotState<String> snapshotState = this.$line1$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$2.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoTextInput(strManualAddressEntry$lambda$2, (Function1) objRememberedValue, modifierTestTag, null, strStringResource, null, null, null, null, null, keyboardOptions, null, null, false, false, composer, 384, 6, 31720);
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
