package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotIntState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$9 */
/* loaded from: classes11.dex */
final class C24198x1c3df010 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotIntState2 $dragHandleHeight$delegate;

    C24198x1c3df010(SnapshotIntState2 snapshotIntState2) {
        this.$dragHandleHeight$delegate = snapshotIntState2;
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
            ComposerKt.traceEventStart(-2002035287, i, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffold.<anonymous> (OptionChainBottomSheetScaffold.kt:265)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        final SnapshotIntState2 snapshotIntState2 = this.$dragHandleHeight$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$9$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C24198x1c3df010.invoke$lambda$1$lambda$0(snapshotIntState2, (IntSize) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        OptionChainBottomSheetDragHandle.m17156OptionChainBottomSheetDragHandlelgZ2HuY(OnRemeasuredModifier2.onSizeChanged(companion, (Function1) objRememberedValue), 0.0f, 0.0f, null, 0L, composer, 6, 30);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }
}
