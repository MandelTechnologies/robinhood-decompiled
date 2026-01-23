package com.robinhood.android.rollover401k.steps;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Rollover401kAccountNumbersFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.ComposableSingletons$Rollover401kAccountNumbersFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Rollover401kAccountNumbersFragment2 {
    public static final Rollover401kAccountNumbersFragment2 INSTANCE = new Rollover401kAccountNumbersFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1410858835 = ComposableLambda3.composableLambdaInstance(1410858835, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.ComposableSingletons$Rollover401kAccountNumbersFragmentKt$lambda$1410858835$1
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
                ComposerKt.traceEventStart(1410858835, i, -1, "com.robinhood.android.rollover401k.steps.ComposableSingletons$Rollover401kAccountNumbersFragmentKt.lambda$1410858835.<anonymous> (Rollover401kAccountNumbersFragment.kt:244)");
            }
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.COPY_24;
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, "Account", "PlaceholderNumber", (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.Icon(serverToBentoAssetMapper2, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null);
            int i2 = BentoBaseRowState.$stable;
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, null, composer, i2 << 3, 125);
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, "Account", "PlaceholderNumber", (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.Icon(serverToBentoAssetMapper2, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer, i2 << 3, 125);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1410858835$feature_rollover_401k_externalDebug() {
        return lambda$1410858835;
    }
}
