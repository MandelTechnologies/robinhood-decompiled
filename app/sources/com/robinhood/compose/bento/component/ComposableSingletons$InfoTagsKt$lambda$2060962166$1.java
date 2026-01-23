package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.Column5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InfoTags.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class ComposableSingletons$InfoTagsKt$lambda$2060962166$1 implements Function3<Column5, Composer, Integer, Unit> {
    public static final ComposableSingletons$InfoTagsKt$lambda$2060962166$1 INSTANCE = new ComposableSingletons$InfoTagsKt$lambda$2060962166$1();

    ComposableSingletons$InfoTagsKt$lambda$2060962166$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
        invoke(column5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Column5 InfoTagPreviewGrid, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(InfoTagPreviewGrid, "$this$InfoTagPreviewGrid");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2060962166, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$InfoTagsKt.lambda$2060962166.<anonymous> (InfoTags.kt:316)");
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.INFO_FILLED_16;
        Integer numValueOf = Integer.valueOf(serverToBentoAssetMapper2.getResourceId());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$InfoTagsKt$lambda$2060962166$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA("General tag", null, numValueOf, null, null, false, null, (Function0) objRememberedValue, composer, 12582918, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        Integer numValueOf2 = Integer.valueOf(serverToBentoAssetMapper2.getResourceId());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$InfoTagsKt$lambda$2060962166$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA("General tag", null, numValueOf2, null, null, false, null, (Function0) objRememberedValue2, composer, 12779526, 90);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
