package com.robinhood.android.crypto.settings;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$4$1;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.settings.SetAllowlistingStatusSheetContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoSettingsComposableKt$CryptoSettingsComposable$4$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AllowlistSheetState $allowlistSheet;
    final /* synthetic */ SnapshotState<AllowlistSheetState> $allowlistSheetState$delegate;
    final /* synthetic */ CryptoSettingsDuxo $duxo;

    CryptoSettingsComposableKt$CryptoSettingsComposable$4$1(SnapshotState<AllowlistSheetState> snapshotState, AllowlistSheetState allowlistSheetState, CryptoSettingsDuxo cryptoSettingsDuxo) {
        this.$allowlistSheetState$delegate = snapshotState;
        this.$allowlistSheet = allowlistSheetState;
        this.$duxo = cryptoSettingsDuxo;
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
            ComposerKt.traceEventStart(-1845301542, i, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable.<anonymous>.<anonymous> (CryptoSettingsComposable.kt:268)");
        }
        composer.startReplaceGroup(5004770);
        final SnapshotState<AllowlistSheetState> snapshotState = this.$allowlistSheetState$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoSettingsComposableKt$CryptoSettingsComposable$4$1.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composer, 6, 2), null, 0L, ComposableLambda3.rememberComposableLambda(948665569, true, new C129892(this.$allowlistSheet, this.$duxo, this.$allowlistSheetState$delegate), composer, 54), composer, 1572870, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoSettingsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$4$1$2 */
    static final class C129892 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ AllowlistSheetState $allowlistSheet;
        final /* synthetic */ SnapshotState<AllowlistSheetState> $allowlistSheetState$delegate;
        final /* synthetic */ CryptoSettingsDuxo $duxo;

        C129892(AllowlistSheetState allowlistSheetState, CryptoSettingsDuxo cryptoSettingsDuxo, SnapshotState<AllowlistSheetState> snapshotState) {
            this.$allowlistSheet = allowlistSheetState;
            this.$duxo = cryptoSettingsDuxo;
            this.$allowlistSheetState$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(948665569, i, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable.<anonymous>.<anonymous>.<anonymous> (CryptoSettingsComposable.kt:274)");
            }
            boolean zIsEnabling = this.$allowlistSheet.isEnabling();
            String strStringResource = StringResources_androidKt.stringResource(C13000R.string.enable_allowlisting_bottom_sheet_description_with_catpay, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C38572R.string.disable_allowlisting_bottom_sheet_description, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$allowlistSheet);
            final CryptoSettingsDuxo cryptoSettingsDuxo = this.$duxo;
            final AllowlistSheetState allowlistSheetState = this.$allowlistSheet;
            final SnapshotState<AllowlistSheetState> snapshotState = this.$allowlistSheetState$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$4$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoSettingsComposableKt$CryptoSettingsComposable$4$1.C129892.invoke$lambda$1$lambda$0(cryptoSettingsDuxo, allowlistSheetState, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            final SnapshotState<AllowlistSheetState> snapshotState2 = this.$allowlistSheetState$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$4$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoSettingsComposableKt$CryptoSettingsComposable$4$1.C129892.invoke$lambda$3$lambda$2(snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            SetAllowlistingStatusSheetContent.SetAllowlistingStatusSheetContent(false, strStringResource, strStringResource2, zIsEnabling, function0, (Function0) objRememberedValue2, null, composer, 196614, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoSettingsDuxo cryptoSettingsDuxo, AllowlistSheetState allowlistSheetState, SnapshotState snapshotState) {
            cryptoSettingsDuxo.setAllowlistingStatus(allowlistSheetState.isEnabling());
            snapshotState.setValue(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
            snapshotState.setValue(null);
            return Unit.INSTANCE;
        }
    }
}
