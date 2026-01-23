package com.robinhood.android.cortex.digest.asset;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.cortex.digest.asset.AssetDigestViewState;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackType;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetDigest6;
import com.robinhood.android.cortex.models.asset.AssetDigestDetail;
import com.robinhood.android.cortex.models.asset.AssetDigestDetailItem;
import com.robinhood.android.cortex.models.asset.AssetDigestPreview;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: AssetDigestComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt$lambda$-2028017094$1 */
/* loaded from: classes2.dex */
final class C12020x9adabbf implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final C12020x9adabbf INSTANCE = new C12020x9adabbf();

    C12020x9adabbf() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2028017094, i2, -1, "com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt.lambda$-2028017094.<anonymous> (AssetDigestComposable.kt:579)");
        }
        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
        Instant MIN = Instant.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        AssetType3 assetType3 = AssetType3.STOCKS;
        AssetDigest6 assetDigest6 = AssetDigest6.BREAKING;
        AssetDigestPreview assetDigestPreview = new AssetDigestPreview("", "", assetDigest6);
        AssetDigestDetailItem assetDigestDetailItem = new AssetDigestDetailItem("Lorem ipsum dolor sit amet consectetur. Scelerisque bibendum lorem elit arcu bibendum.", "Lorem ipsum dolor sit amet consectetur. Scelerisque bibendum lorem elit arcu bibendum. Et elit odio viverra aenean.", assetDigest6);
        AssetDigest6 assetDigest62 = AssetDigest6.DEFAULT;
        List listListOf = CollectionsKt.listOf((Object[]) new AssetDigestDetailItem[]{assetDigestDetailItem, new AssetDigestDetailItem("Lorem ipsum dolor sit amet consectetur.", "Lorem ipsum dolor sit amet consectetur. Scelerisque bibendum lorem elit arcu bibendum. Et elit odio viverra aenean.", assetDigest62), new AssetDigestDetailItem(null, "Lorem ipsum dolor sit amet consectetur. Scelerisque bibendum lorem elit arcu bibendum. Et elit odio viverra aenean.", assetDigest62)});
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        ArticleSource articleSource = new ArticleSource("Lorem ipsum dolor sit amet consectetur.", "Benzinga", null, null, MIN);
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        HttpUrl httpUrl = companion.get("https://test.com");
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        ArticleSource articleSource2 = new ArticleSource("Lorem ipsum dolor sit amet consectetur.", "Benzinga", null, httpUrl, MIN);
        HttpUrl httpUrl2 = companion.get("https://test.com");
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        AssetDigestDetail assetDigestDetail = new AssetDigestDetail("Placeholder", listListOf, CollectionsKt.listOf((Object[]) new ArticleSource[]{articleSource, articleSource2, new ArticleSource("Lorem ipsum dolor sit amet consectetur. Sit amet consectetur.", "Benzinga", "test.com", httpUrl2, MIN)}), "Lorem ipsum dolor sit amet consectetur. Scelerisque bibendum lorem elit arcu bibendum. Et elit odio viverra aenean.[Learn more](https://google.com)");
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        AssetDigestViewState.LoadedContent loadedContent = new AssetDigestViewState.LoadedContent(MIN, new AssetDigest.HasSignedAgreement("123", "123", uuidRandomUUID, assetType3, assetDigestPreview, assetDigestDetail, MIN), new DigestFeedback.Asset("123", DigestFeedback.Reaction.NONE, CollectionsKt.emptyList(), CollectionsKt.emptyList(), assetType3));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt$lambda$-2028017094$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12020x9adabbf.invoke$lambda$1$lambda$0((DigestFeedbackType) obj, (DigestFeedback) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt$lambda$-2028017094$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12020x9adabbf.invoke$lambda$3$lambda$2((AssetDigestViewState.ArticleSourceContent) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AssetDigestComposableKt.ComposableDigestList(loadedContent, function2, (Function1) objRememberedValue2, modifierPadding, composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(AssetDigestViewState.ArticleSourceContent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(DigestFeedbackType digestFeedbackType, DigestFeedback digestFeedback) {
        Intrinsics.checkNotNullParameter(digestFeedbackType, "<unused var>");
        Intrinsics.checkNotNullParameter(digestFeedback, "<unused var>");
        return Unit.INSTANCE;
    }
}
