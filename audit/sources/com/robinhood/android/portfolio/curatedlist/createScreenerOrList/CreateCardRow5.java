package com.robinhood.android.portfolio.curatedlist.createScreenerOrList;

import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.portfolio.curatedlist.C25624R;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateCardRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.ComposableSingletons$CreateCardRowKt$lambda$1783333990$1, reason: use source file name */
/* loaded from: classes11.dex */
final class CreateCardRow5 implements Function2<Composer, Integer, Unit> {
    public static final CreateCardRow5 INSTANCE = new CreateCardRow5();

    CreateCardRow5() {
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
            ComposerKt.traceEventStart(1783333990, i, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.ComposableSingletons$CreateCardRowKt.lambda$1783333990.<anonymous> (CreateCardRow.kt:157)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C25624R.string.create_screener_title, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C25624R.string.create_screener_message, composer, 0);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(C25624R.drawable.create_screener_icon, composer, 0);
        long stratos = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getStratos();
        BadgeData badgeData = new BadgeData(StringResources_androidKt.stringResource(C25624R.string.chip_new, composer, 0), new BentoIcon4.Size12(ServerToBentoAssetMapper2.STAR_FILLED_12));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.ComposableSingletons$CreateCardRowKt$lambda$1783333990$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CreateCardRow6.m17643CreateCardRowcd68TDI(null, (Function0) objRememberedValue, strStringResource, strStringResource2, painterPainterResource, stratos, badgeData, composer, (BentoIcon4.$stable << 18) | 48, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
