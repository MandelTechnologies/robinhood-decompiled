package com.robinhood.android.event.gamedetail.components.bottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl;
import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRowState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionDetailBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.components.bottomsheet.ComposableSingletons$PositionDetailBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PositionDetailBottomSheet {
    public static final PositionDetailBottomSheet INSTANCE = new PositionDetailBottomSheet();

    /* renamed from: lambda$-374986953, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8947lambda$374986953 = ComposableLambda3.composableLambdaInstance(-374986953, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.ComposableSingletons$PositionDetailBottomSheetKt$lambda$-374986953$1
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
                ComposerKt.traceEventStart(-374986953, i, -1, "com.robinhood.android.event.gamedetail.components.bottomsheet.ComposableSingletons$PositionDetailBottomSheetKt.lambda$-374986953.<anonymous> (PositionDetailBottomSheet.kt:108)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke("100 @$0.51");
            StringResource stringResourceInvoke2 = companion.invoke("Payout if right");
            StringResource stringResourceInvoke3 = companion.invoke("$51 → $100");
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            PositionDetailBottomSheet4.PositionDetailBottomSheet(new PositionDetailBottomSheetState(new GameDetailPositionRowState(uuidRandomUUID, stringResourceInvoke, stringResourceInvoke2, "+$28.00", stringResourceInvoke3, Boolean.TRUE, false, false, false, null, 960, null), new PositionContractDetailRowState("", new DayNightImageUrl(null, null, 3, null), "SF +3.5", companion.invoke("No · LAR by 3.5"))), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-374986953$feature_game_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14220getLambda$374986953$feature_game_detail_externalDebug() {
        return f8947lambda$374986953;
    }
}
