package com.robinhood.android.engagement.goldevent.p115ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoPlayer$7$3$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ Color $landscapeUpsellLinkColor;
    final /* synthetic */ String $landscapeUpsellMarkdown;

    LiveEventStreamComposableKt$VideoPlayer$7$3$2(String str, Color color, AppCompatActivity appCompatActivity) {
        this.$landscapeUpsellMarkdown = str;
        this.$landscapeUpsellLinkColor = color;
        this.$activity = appCompatActivity;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-933018163, i, -1, "com.robinhood.android.engagement.goldevent.ui.VideoPlayer.<anonymous>.<anonymous>.<anonymous> (LiveEventStreamComposable.kt:431)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 0, 0);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        String str = this.$landscapeUpsellMarkdown;
        Color color = this.$landscapeUpsellLinkColor;
        final AppCompatActivity appCompatActivity = this.$activity;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer, 6);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        composer.startReplaceGroup(-1306628135);
        long jM21425getFg0d7_KjU2 = color == null ? bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU() : color.getValue();
        composer.endReplaceGroup();
        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textS, TextAlign.INSTANCE.m7919getCentere0LSkKk(), jM21425getFg0d7_KjU, jM21425getFg0d7_KjU2, false, composer, BentoMarkdownText.$stable << 15, 16);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(appCompatActivity) | composer.changedInstance(uriHandler);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoPlayer$7$3$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveEventStreamComposableKt$VideoPlayer$7$3$2.invoke$lambda$2$lambda$1$lambda$0(appCompatActivity, uriHandler, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 10);
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
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(AppCompatActivity appCompatActivity, UriHandler uriHandler, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (appCompatActivity != null) {
            LiveEventStreamComposableKt.setRotation(appCompatActivity, false);
        }
        uriHandler.openUri(it);
        return Unit.INSTANCE;
    }
}
