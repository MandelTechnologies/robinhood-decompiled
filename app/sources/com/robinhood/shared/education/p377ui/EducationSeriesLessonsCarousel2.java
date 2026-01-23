package com.robinhood.shared.education.p377ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import okhttp3.HttpUrl;

/* compiled from: EducationSeriesLessonsCarousel.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.education.ui.ComposableSingletons$EducationSeriesLessonsCarouselKt$lambda$-171233948$1, reason: use source file name */
/* loaded from: classes6.dex */
final class EducationSeriesLessonsCarousel2 implements Function2<Composer, Integer, Unit> {
    public static final EducationSeriesLessonsCarousel2 INSTANCE = new EducationSeriesLessonsCarousel2();

    EducationSeriesLessonsCarousel2() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-171233948, i, -1, "com.robinhood.shared.education.ui.ComposableSingletons$EducationSeriesLessonsCarouselKt.lambda$-171233948.<anonymous> (EducationSeriesLessonsCarousel.kt:219)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        int iM6735toArgb8_81llA = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).getCosmonautLight());
        int iM6735toArgb8_81llA2 = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).getCosmonautDark());
        int iM6735toArgb8_81llA3 = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU());
        int iM6735toArgb8_81llA4 = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU());
        int iM6735toArgb8_81llA5 = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU());
        HttpUrl.Companion companion3 = HttpUrl.INSTANCE;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new EducationLessonPreview("sysId", "identifier", "trackingId", 1, null, "Learn and earn €1 of AVAX", "", iM6735toArgb8_81llA, iM6735toArgb8_81llA2, iM6735toArgb8_81llA3, iM6735toArgb8_81llA4, iM6735toArgb8_81llA5, companion3.get("https://brokerage-static.s3.amazonaws.com/app_assets/crypto/crypto_l2e/banner_image/2x/AVAX%402x.png"), companion3.get("https://brokerage-static.s3.amazonaws.com/app_assets/crypto/crypto_l2e/banner_image/3x/AVAX%403x.png"), companion3.get("https://brokerage-static.s3.amazonaws.com/app_assets/crypto/crypto_l2e/banner_image/3x/AVAX%403x.png"), null, false, true, 1, 32768, null), new EducationLessonPreview("sysId", "identifier", "trackingId", 2, null, "Learn and earn €1 of BTC", "", Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).getBiomeLight()), Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).getBiomeDark()), Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU()), companion3.get("https://brokerage-static.s3.amazonaws.com/app_assets/crypto/crypto_l2e/banner_image/2x/btc%402x.png"), companion3.get("https://brokerage-static.s3.amazonaws.com/app_assets/crypto/crypto_l2e/banner_image/3x/btc%403x.png"), companion3.get("https://brokerage-static.s3.amazonaws.com/app_assets/crypto/crypto_l2e/banner_image/3x/btc%403x.png"), null, true, true, 1, 32768, null));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.education.ui.ComposableSingletons$EducationSeriesLessonsCarouselKt$lambda$-171233948$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationSeriesLessonsCarousel2.invoke$lambda$2$lambda$1$lambda$0((EducationLessonPreview) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EducationSeriesLessonsCarousel5.EducationSeriesLessonsCarousel(immutableList3PersistentListOf, true, modifierFillMaxWidth$default2, (Function1) objRememberedValue, composer, 3504, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(EducationLessonPreview it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
