package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.PostOnboardingFundAccountSplashScreenContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PostSignUpFundAccountSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposableKt$PostSignUpFundAccountSplashComposable$1, reason: use source file name */
/* loaded from: classes10.dex */
final class PostSignUpFundAccountSplashComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PostOnboardingFundAccountSplashScreenContent $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onCtaClicked;
    final /* synthetic */ long $topHalfColor;

    PostSignUpFundAccountSplashComposable2(Modifier modifier, long j, PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent, Function0<Unit> function0) {
        this.$modifier = modifier;
        this.$topHalfColor = j;
        this.$content = postOnboardingFundAccountSplashScreenContent;
        this.$onCtaClicked = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final LottieComposition invoke$lambda$5$lambda$4$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$5$lambda$4$lambda$1(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    public final void invoke(Composer composer, int i) {
        PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent;
        Function0<Unit> function0;
        Modifier.Companion companion;
        float f;
        ?? r12;
        Composer composer2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1600009579, i, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposable.<anonymous> (PostSignUpFundAccountSplashComposable.kt:65)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
        long j = this.$topHalfColor;
        PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent2 = this.$content;
        Function0<Unit> function02 = this.$onCtaClicked;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer, 6), composer, 0);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(companion4, j, null, 2, null), 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, paddingValuesAsPaddingValues.getTop(), 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        if (postOnboardingFundAccountSplashScreenContent2.getHeaderLottieUrl() != null) {
            composer.startReplaceGroup(-2021865876);
            String headerLottieUrl = postOnboardingFundAccountSplashScreenContent2.getHeaderLottieUrl();
            if (headerLottieUrl == null) {
                headerLottieUrl = "";
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(headerLottieUrl)), null, null, null, null, null, composer, 0, 62);
            postOnboardingFundAccountSplashScreenContent = postOnboardingFundAccountSplashScreenContent2;
            function0 = function02;
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(invoke$lambda$5$lambda$4$lambda$0(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composer, 1572864, 958);
            Alignment center = companion2.getCenter();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(TestTag3.testTag(companion4, PostSignUpFundAccountSplashComposable.SplashScreenHeaderAnimationTestTag), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), 0.0f, 1, null);
            LottieComposition lottieCompositionInvoke$lambda$5$lambda$4$lambda$0 = invoke$lambda$5$lambda$4$lambda$0(lottieCompositionResultRememberLottieComposition);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposableKt$PostSignUpFundAccountSplashComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(PostSignUpFundAccountSplashComposable2.invoke$lambda$5$lambda$4$lambda$1(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            companion = companion4;
            LottieAnimation2.LottieAnimation(lottieCompositionInvoke$lambda$5$lambda$4$lambda$0, (Function0) objRememberedValue, modifierFillMaxWidth$default2, false, false, false, null, false, null, center, null, false, false, null, null, false, composer, 805306368, 0, 65016);
            composer2 = composer;
            composer2.endReplaceGroup();
            f = 0.0f;
            r12 = 1;
        } else {
            postOnboardingFundAccountSplashScreenContent = postOnboardingFundAccountSplashScreenContent2;
            function0 = function02;
            companion = companion4;
            composer.startReplaceGroup(-2021024071);
            f = 0.0f;
            r12 = 1;
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(UtilKt.toImageUrl(postOnboardingFundAccountSplashScreenContent.getHeaderImage(), (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).build(), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion, "headerImage"), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), 0.0f, 1, null), companion2.getCenter(), ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer, 27696, 96);
            composer2 = composer;
            composer2.endReplaceGroup();
        }
        composer2.endNode();
        final PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent3 = postOnboardingFundAccountSplashScreenContent;
        final Function0<Unit> function03 = function0;
        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(ModifiersKt.autoLogEvents$default(companion, (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 1.0f, false, 2, null), f, r12, null), false, ComposableLambda3.rememberComposableLambda(-1668748716, r12, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposableKt$PostSignUpFundAccountSplashComposable$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                invoke(bentoButtonBar3, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i2) {
                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                if ((i2 & 17) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1668748716, i2, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposable.<anonymous>.<anonymous>.<anonymous> (PostSignUpFundAccountSplashComposable.kt:125)");
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default3, bentoTheme.getSpacing(composer3, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i3).m21593getSmallD9Ej5fM(), 2, null);
                BentoButtonKt.m20586BentoButtonEikTQX8(function03, postOnboardingFundAccountSplashScreenContent3.getButtonText(), modifierM5146paddingqDBjuR0$default2, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), ComposableLambda3.rememberComposableLambda(-458381497, r12, new PostSignUpFundAccountSplashComposable4(postOnboardingFundAccountSplashScreenContent3), composer2, 54), composer, 3456, 2);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
