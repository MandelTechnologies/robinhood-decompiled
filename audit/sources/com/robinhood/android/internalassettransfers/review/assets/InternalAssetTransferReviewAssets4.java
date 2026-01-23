package com.robinhood.android.internalassettransfers.review.assets;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferReviewAssets.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferReviewAssets4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;

    InternalAssetTransferReviewAssets4(Context context) {
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context) {
        WebUtils.viewUrl$default(context, C18977R.string.internal_asset_transfer_help_center_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1319959741, i, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferReviewAssets.kt:112)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        String strStringResource = StringResources_androidKt.stringResource(C18977R.string.f4207xde129274, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C18977R.string.f4221x74115b0a, composer, 0);
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$context);
        final Context context = this.$context;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsKt$InternalAssetTransferReviewAssetListContent$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InternalAssetTransferReviewAssets4.invoke$lambda$1$lambda$0(context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue, modifierM5144paddingVpY3zN4$default, jM21425getFg0d7_KjU, 0L, textM, 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
