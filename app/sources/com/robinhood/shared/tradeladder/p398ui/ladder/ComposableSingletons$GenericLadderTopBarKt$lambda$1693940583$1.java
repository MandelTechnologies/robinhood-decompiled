package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.C40888R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericLadderTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class ComposableSingletons$GenericLadderTopBarKt$lambda$1693940583$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$GenericLadderTopBarKt$lambda$1693940583$1 INSTANCE = new ComposableSingletons$GenericLadderTopBarKt$lambda$1693940583$1();

    ComposableSingletons$GenericLadderTopBarKt$lambda$1693940583$1() {
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
            ComposerKt.traceEventStart(1693940583, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt.lambda$1693940583.<anonymous> (GenericLadderTopBar.kt:111)");
        }
        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.NO_VALUE_24);
        String strStringResource = StringResources_androidKt.stringResource(C40888R.string.flatten_label, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), null, false, composer, BentoIcon4.Size24.$stable, 48);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ComposableSingletons$GenericLadderTopBarKt$lambda$1693940583$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.CONTROLS_24), "Ladder Settings", null, BentoIconButton4.Type.Secondary, false, null, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU()), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(40)), false, composer, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 805331334, 0, 1256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
