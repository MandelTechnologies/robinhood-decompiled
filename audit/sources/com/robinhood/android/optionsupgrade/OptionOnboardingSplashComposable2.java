package com.robinhood.android.optionsupgrade;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.app.keys.data.OptionPage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionOnboardingSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$OptionOnboardingSplashComposable$3$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingSplashComposable2 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ Function1<OptionPage, Unit> $onPageLearnMore;
    final /* synthetic */ ImmutableList<SplashPage> $pages;

    /* JADX WARN: Multi-variable type inference failed */
    OptionOnboardingSplashComposable2(ImmutableList<SplashPage> immutableList, Function1<? super OptionPage, Unit> function1) {
        this.$pages = immutableList;
        this.$onPageLearnMore = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-168557607, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionOnboardingSplashComposable.kt:88)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
        ImmutableList<SplashPage> immutableList = this.$pages;
        final Function1<OptionPage, Unit> function1 = this.$onPageLearnMore;
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
        ImageKt.Image(PainterResources_androidKt.painterResource(immutableList.get(i).getDrawableResId(), composer, 0), immutableList.get(i).getTitle(), column6.align(Column5.weight$default(column6, companion, 1.0f, false, 2, null), companion2.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 0, 120);
        String title = immutableList.get(i).getTitle();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium();
        TextAlign.Companion companion4 = TextAlign.INSTANCE;
        BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 48, 0, 8124);
        final OptionPage optionPage = immutableList.get(i).getOptionPage();
        if (optionPage != null) {
            composer.startReplaceGroup(1804915595);
            String summary = immutableList.get(i).getSummary();
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0);
            TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
            long jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i3).m21456getPositive0d7_KjU();
            int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changed(optionPage.ordinal());
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashComposableKt$OptionOnboardingSplashComposable$3$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingSplashComposable2.invoke$lambda$2$lambda$1$lambda$0(function1, optionPage);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(summary, strStringResource, (Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default, jM21425getFg0d7_KjU, jM21456getPositive0d7_KjU, textM, iM7919getCentere0LSkKk, composer, 0, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1805710466);
            BentoText2.m20747BentoText38GnDrw(immutableList.get(i).getSummary(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
            composer.endReplaceGroup();
        }
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, OptionPage optionPage) {
        function1.invoke(optionPage);
        return Unit.INSTANCE;
    }
}
