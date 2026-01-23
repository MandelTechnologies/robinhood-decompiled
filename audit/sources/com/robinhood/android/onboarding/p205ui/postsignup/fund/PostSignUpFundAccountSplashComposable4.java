package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import android.net.Uri;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.PostOnboardingFundAccountSplashScreenContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PostSignUpFundAccountSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposableKt$PostSignUpFundAccountSplashComposable$1$1$3, reason: use source file name */
/* loaded from: classes10.dex */
final class PostSignUpFundAccountSplashComposable4 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ PostOnboardingFundAccountSplashScreenContent $content;

    PostSignUpFundAccountSplashComposable4(PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent) {
        this.$content = postOnboardingFundAccountSplashScreenContent;
    }

    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-458381497, i, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposable.<anonymous>.<anonymous>.<anonymous> (PostSignUpFundAccountSplashComposable.kt:150)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
        PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent = this.$content;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        Divider2.m5581DivideroMI9zvI(null, Color.INSTANCE.m6716getBlack0d7_KjU(), 0.0f, 0.0f, composer, 48, 13);
        InfoTag<GenericAction> infoTag = postOnboardingFundAccountSplashScreenContent.getInfoTag();
        if (infoTag == null) {
            composer.startReplaceGroup(-744831080);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-744705158);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            SduiComponent3.SduiComponent(infoTag, PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, composer, 0, 4);
            composer.endReplaceGroup();
        }
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15957toAnnotatedStringiJQMabo(postOnboardingFundAccountSplashScreenContent.getTitle(), 0L, composer, 0, 1), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 10, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composer, i3).getBookCoverCapsuleSmall(), composer, 0, 0, 8188);
        final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
        RichText subtitle = postOnboardingFundAccountSplashScreenContent.getSubtitle();
        TextStyle textM = bentoTheme2.getTypography(composer, i3).getTextM();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(uriHandler);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposableKt$PostSignUpFundAccountSplashComposable$1$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PostSignUpFundAccountSplashComposable4.invoke$lambda$2$lambda$1$lambda$0(uriHandler, (Uri) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoRichText.m15949BentoRichText0sCZWFg(subtitle, modifierM5146paddingqDBjuR0$default, textM, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer, 0, 504);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(UriHandler uriHandler, Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string2 = it.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        uriHandler.openUri(string2);
        return Unit.INSTANCE;
    }
}
