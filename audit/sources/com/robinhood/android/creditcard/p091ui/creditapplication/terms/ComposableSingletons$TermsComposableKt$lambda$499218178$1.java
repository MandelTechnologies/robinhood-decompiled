package com.robinhood.android.creditcard.p091ui.creditapplication.terms;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TermsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ComposableSingletons$TermsComposableKt$lambda$499218178$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$TermsComposableKt$lambda$499218178$1 INSTANCE = new ComposableSingletons$TermsComposableKt$lambda$499218178$1();

    ComposableSingletons$TermsComposableKt$lambda$499218178$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition invoke$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* compiled from: TermsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.terms.ComposableSingletons$TermsComposableKt$lambda$499218178$1$1 */
    static final class C125921 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ LottieCompositionResult $composition$delegate;
        final /* synthetic */ LottieAnimationState $progress$delegate;

        C125921(LottieAnimationState lottieAnimationState, LottieCompositionResult lottieCompositionResult) {
            this.$progress$delegate = lottieAnimationState;
            this.$composition$delegate = lottieCompositionResult;
        }

        public final void invoke(PaddingValues it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(145159118, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.ComposableSingletons$TermsComposableKt.lambda$499218178.<anonymous>.<anonymous> (TermsComposable.kt:320)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            final LottieAnimationState lottieAnimationState = this.$progress$delegate;
            LottieCompositionResult lottieCompositionResult = this.$composition$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5162requiredSize3ABfNKs = SizeKt.m5162requiredSize3ABfNKs(companion, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE));
            LottieComposition lottieCompositionInvoke$lambda$0 = ComposableSingletons$TermsComposableKt$lambda$499218178$1.invoke$lambda$0(lottieCompositionResult);
            Integer num = LottieProperty.COLOR;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(num, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU())), new String[]{"**"}, composer, 6), LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.STROKE_COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU())), new String[]{"**"}, composer, 6)}, composer, LottieDynamicProperties3.$stable);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(lottieAnimationState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.terms.ComposableSingletons$TermsComposableKt$lambda$499218178$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ComposableSingletons$TermsComposableKt$lambda$499218178$1.access$invoke$lambda$1(lottieAnimationState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LottieAnimation2.LottieAnimation(lottieCompositionInvoke$lambda$0, (Function0) objRememberedValue, modifierM5162requiredSize3ABfNKs, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, null, false, false, null, null, false, composer, (LottieDynamicProperties.$stable << 24) | 384, 0, 65272);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_terms_loading, composer, 0);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextL(), composer, 0, 0, 8120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ float access$invoke$lambda$1(LottieAnimationState lottieAnimationState) {
        return invoke$lambda$1(lottieAnimationState);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(499218178, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.terms.ComposableSingletons$TermsComposableKt.lambda$499218178.<anonymous> (TermsComposable.kt:307)");
        }
        LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.SECURITY_OAUTH_SPINNER.getUrl().getUrl())), null, null, null, null, null, composer, 0, 62);
        LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(invoke$lambda$0(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composer, 1572864, 958);
        CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(loggingUtils.getCcScreen(), TestTag3.testTag(Modifier.INSTANCE, TermsComposableKt.TERMS_FULL_PAGE_LOADER_TEST_TAG), null, null, null, null, null, null, null, null, false, false, ComposableLambda3.rememberComposableLambda(145159118, true, new C125921(lottieAnimationStateAnimateLottieCompositionAsState, lottieCompositionResultRememberLottieComposition), composer, 54), composer, 48, 384, 4092);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
