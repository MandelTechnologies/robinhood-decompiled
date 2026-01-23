package com.robinhood.android.crypto.pulse.feed.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedViewState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPulseFeedHeader.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\"\u001c\u0010\u0007\u001a\u00020\b8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002"}, m3636d2 = {"CryptoPulseFeedHeader", "", "viewState", "Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/pulse/feed/CryptoPulseFeedViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_PULSE_FEED_HEADER_LOTTIE_ANIMATION", "", "getCRYPTO_PULSE_FEED_HEADER_LOTTIE_ANIMATION$annotations", "()V", "getCRYPTO_PULSE_FEED_HEADER_LOTTIE_ANIMATION", "()Ljava/lang/String;", "CRYPTO_PULSE_FEED_HEADER_CORTEX_ICON_SIZE", "Landroidx/compose/ui/unit/Dp;", "F", "feature-crypto-pulse_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedHeaderKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseFeedHeader {
    private static final float CRYPTO_PULSE_FEED_HEADER_CORTEX_ICON_SIZE = C2002Dp.m7995constructorimpl(12);
    private static final String CRYPTO_PULSE_FEED_HEADER_LOTTIE_ANIMATION = "crypto_pulse_feed_header_lottie_animation";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseFeedHeader$lambda$1(CryptoPulseFeedViewState cryptoPulseFeedViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoPulseFeedHeader(cryptoPulseFeedViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_PULSE_FEED_HEADER_LOTTIE_ANIMATION$annotations() {
    }

    public static final void CryptoPulseFeedHeader(final CryptoPulseFeedViewState viewState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1485992059);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1485992059, i3, -1, "com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedHeader (CryptoPulseFeedHeader.kt:34)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            LocalShowPlaceholder.Loadable(viewState.getSubtitleText() == null, null, null, ComposableLambda3.rememberComposableLambda(-766090817, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedHeaderKt$CryptoPulseFeedHeader$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                private static final LottieComposition invoke$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                    return lottieCompositionResult.getValue();
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-766090817, i5, -1, "com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedHeader.<anonymous>.<anonymous> (CryptoPulseFeedHeader.kt:39)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM());
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    CryptoPulseFeedViewState cryptoPulseFeedViewState = viewState;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    LottieAnimation2.LottieAnimation(invoke$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(bentoTheme.getColors(composer2, i6).getIsDay() ? LottieUrl.CORTEX_ICON_LIGHT.getUrl().getUrl() : LottieUrl.CORTEX_ICON_DARK.getUrl().getUrl())), null, null, null, null, null, composer2, 0, 62)), SizeKt.m5169size3ABfNKs(TestTag3.testTag(companion2, CryptoPulseFeedHeader.getCRYPTO_PULSE_FEED_HEADER_LOTTIE_ANIMATION()), CryptoPulseFeedHeader.CRYPTO_PULSE_FEED_HEADER_CORTEX_ICON_SIZE), false, false, null, 0.0f, 0, false, false, false, null, false, false, LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU())), new String[]{"**"}, composer2, 6), LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.STROKE_COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU())), new String[]{"**"}, composer2, 6)}, composer2, LottieDynamicProperties3.$stable), null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composer2, 48, (LottieDynamicProperties.$stable << 9) | 196608, 0, 2056188);
                    StringResource subtitleText = cryptoPulseFeedViewState.getSubtitleText();
                    composer2.startReplaceGroup(-1003443220);
                    String textAsString = subtitleText == null ? null : StringResources6.getTextAsString(subtitleText, composer2, StringResource.$stable);
                    composer2.endReplaceGroup();
                    if (textAsString == null) {
                        textAsString = "----------";
                    }
                    BentoText2.m20747BentoText38GnDrw(textAsString, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer2, 0, 0, 8186);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            String titleText = viewState.getTitleText();
            LocalShowPlaceholder.Loadable(titleText == null || titleText.length() == 0, null, null, ComposableLambda3.rememberComposableLambda(-1059389272, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedHeaderKt$CryptoPulseFeedHeader$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1059389272, i5, -1, "com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedHeader.<anonymous>.<anonymous> (CryptoPulseFeedHeader.kt:79)");
                    }
                    String titleText2 = viewState.getTitleText();
                    if (titleText2 == null) {
                        titleText2 = "----------";
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    String str = titleText2;
                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleMedium(), composer2, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPulseFeedHeader.CryptoPulseFeedHeader$lambda$1(viewState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String getCRYPTO_PULSE_FEED_HEADER_LOTTIE_ANIMATION() {
        return CRYPTO_PULSE_FEED_HEADER_LOTTIE_ANIMATION;
    }
}
