package com.robinhood.android.common.composebottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: RhSelectionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhSelectionBottomSheetKt$lambda$1205070960$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RhSelectionBottomSheet2 implements Function2<Composer, Integer, Unit> {
    public static final RhSelectionBottomSheet2 INSTANCE = new RhSelectionBottomSheet2();

    RhSelectionBottomSheet2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1205070960, i, -1, "com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhSelectionBottomSheetKt.lambda$1205070960.<anonymous> (RhSelectionBottomSheet.kt:152)");
        }
        ArrayList arrayList = new ArrayList(4);
        int i2 = 0;
        while (i2 < 4) {
            int i3 = i2 + 1;
            BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, "Selection Row " + i3, false, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhSelectionBottomSheetKt$lambda$1205070960$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer2, (BentoSelectionRowState.$stable << 3) | 384, 1);
            arrayList.add(Unit.INSTANCE);
            composer2 = composer;
            i2 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
