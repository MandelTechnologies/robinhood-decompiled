package com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
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
final class ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<String> $city$delegate;

    ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$4(SnapshotState<String> snapshotState) {
        this.$city$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-1487597887, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManualAddressEntryComposable.kt:146)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_CITY_INPUT_TEST_TAG);
        String strManualAddressEntry$lambda$10 = ManualAddressEntryComposableKt.ManualAddressEntry$lambda$10(this.$city$delegate);
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_city_placeholder, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$city$delegate);
        final SnapshotState<String> snapshotState = this.$city$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$4.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoTextInput(strManualAddressEntry$lambda$10, (Function1) objRememberedValue, modifierTestTag, null, strStringResource, null, null, null, null, null, null, null, null, false, false, composer, 384, 0, 32744);
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
