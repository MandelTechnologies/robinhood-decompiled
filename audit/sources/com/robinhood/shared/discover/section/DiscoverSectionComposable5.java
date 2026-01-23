package com.robinhood.shared.discover.section;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.Navigator;
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

/* compiled from: DiscoverSectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$SectionWithHeaderDisclosure$1, reason: use source file name */
/* loaded from: classes6.dex */
final class DiscoverSectionComposable5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $description;
    final /* synthetic */ String $disclosure;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ float $paddingUnderTitle;
    final /* synthetic */ String $title;

    /* JADX WARN: Multi-variable type inference failed */
    DiscoverSectionComposable5(String str, Navigator navigator, Context context, String str2, String str3, float f, Function2<? super Composer, ? super Integer, Unit> function2) {
        this.$disclosure = str;
        this.$navigator = navigator;
        this.$context = context;
        this.$title = str2;
        this.$description = str3;
        this.$paddingUnderTitle = f;
        this.$content = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Navigator navigator, Context context, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Uri uri = Uri.parse(it);
        if (navigator.isDeepLinkSupported(uri)) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, Boolean.FALSE, null, false, null, 56, null);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1615535328, i, -1, "com.robinhood.shared.discover.section.SectionWithHeaderDisclosure.<anonymous> (DiscoverSectionComposable.kt:292)");
        }
        String str = this.$disclosure;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        String str2 = this.$title;
        String str3 = this.$description;
        float f = this.$paddingUnderTitle;
        Function2<Composer, Integer, Unit> function2 = this.$content;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        composer.startReplaceGroup(-300243849);
        if (str != null) {
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 1, null);
            MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer, BentoMarkdownText.$stable), null, null, null, null, bentoTheme.getTypography(composer, i2).getTextS(), null, new MarkdownStyle.Link(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), false, false, 6, null), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null, 0, null, 1839, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.discover.section.DiscoverSectionComposableKt$SectionWithHeaderDisclosure$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DiscoverSectionComposable5.invoke$lambda$2$lambda$1$lambda$0(navigator, context, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(str, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 8);
        }
        composer.endReplaceGroup();
        DiscoverSectionComposable.Header(str2, str3, null, composer, 0, 4);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, f), composer, 0);
        function2.invoke(composer, 0);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
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
}
