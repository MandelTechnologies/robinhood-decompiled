package com.robinhood.android.crypto.p094ui.detail.position;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionSection7;
import com.robinhood.android.crypto.p094ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingBottomSheet;
import com.robinhood.android.crypto.p094ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPositionSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$4$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoPositionSection7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<CryptoAverageCostReturnUnavailableOrPendingState> $bottomSheetState$delegate;
    final /* synthetic */ CryptoAverageCostReturnUnavailableOrPendingState $it;

    CryptoPositionSection7(SnapshotState<CryptoAverageCostReturnUnavailableOrPendingState> snapshotState, CryptoAverageCostReturnUnavailableOrPendingState cryptoAverageCostReturnUnavailableOrPendingState) {
        this.$bottomSheetState$delegate = snapshotState;
        this.$it = cryptoAverageCostReturnUnavailableOrPendingState;
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
            ComposerKt.traceEventStart(-1149452789, i, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionSection.<anonymous>.<anonymous> (CryptoPositionSection.kt:149)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$bottomSheetState$delegate);
        final SnapshotState<CryptoAverageCostReturnUnavailableOrPendingState> snapshotState = this.$bottomSheetState$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoPositionSection7.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1144098514, true, new C134292(this.$it, this.$bottomSheetState$delegate), composer, 54), composer, 1572864, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* compiled from: CryptoPositionSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$4$1$2 */
    static final class C134292 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<CryptoAverageCostReturnUnavailableOrPendingState> $bottomSheetState$delegate;
        final /* synthetic */ CryptoAverageCostReturnUnavailableOrPendingState $it;

        C134292(CryptoAverageCostReturnUnavailableOrPendingState cryptoAverageCostReturnUnavailableOrPendingState, SnapshotState<CryptoAverageCostReturnUnavailableOrPendingState> snapshotState) {
            this.$it = cryptoAverageCostReturnUnavailableOrPendingState;
            this.$bottomSheetState$delegate = snapshotState;
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
                ComposerKt.traceEventStart(1144098514, i, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionSection.<anonymous>.<anonymous>.<anonymous> (CryptoPositionSection.kt:152)");
            }
            CryptoAverageCostReturnUnavailableOrPendingState cryptoAverageCostReturnUnavailableOrPendingState = this.$it;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$bottomSheetState$delegate);
            final SnapshotState<CryptoAverageCostReturnUnavailableOrPendingState> snapshotState = this.$bottomSheetState$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$4$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoPositionSection7.C134292.invoke$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoAverageCostReturnUnavailableOrPendingBottomSheet.CryptoAverageCostReturnUnavailableOrPendingBottomSheet(cryptoAverageCostReturnUnavailableOrPendingState, (Function0) objRememberedValue, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            snapshotState.setValue(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
