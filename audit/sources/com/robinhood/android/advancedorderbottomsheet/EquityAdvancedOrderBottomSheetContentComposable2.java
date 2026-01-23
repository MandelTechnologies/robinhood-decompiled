package com.robinhood.android.advancedorderbottomsheet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityAdvancedOrderBottomSheetContentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetContentComposableKt$EquityAdvancedOrderBottomSheetContentComposable$1$2$2, reason: use source file name */
/* loaded from: classes24.dex */
final class EquityAdvancedOrderBottomSheetContentComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $hideBottomSheet;
    final /* synthetic */ EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow $rowState;

    EquityAdvancedOrderBottomSheetContentComposable2(EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow baseRow, Context context, Function0<Unit> function0) {
        this.$rowState = baseRow;
        this.$context = context;
        this.$hideBottomSheet = function0;
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
            ComposerKt.traceEventStart(-321806471, i, -1, "com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetContentComposable.<anonymous>.<anonymous>.<anonymous> (EquityAdvancedOrderBottomSheetContentComposable.kt:138)");
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, ((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DoneButtonRow) this.$rowState).getTestTag()), 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 13, null);
        StringResource buttonText = ((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DoneButtonRow) this.$rowState).getButtonText();
        Resources resources = this.$context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = buttonText.getText(resources).toString();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$hideBottomSheet);
        final Function0<Unit> function0 = this.$hideBottomSheet;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetContentComposableKt$EquityAdvancedOrderBottomSheetContentComposable$1$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityAdvancedOrderBottomSheetContentComposable2.invoke$lambda$1$lambda$0(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierM5146paddingqDBjuR0$default, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
