package com.robinhood.android.gold.switchplans;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import midas.service.p509v1.SwitchPlansConfirmationContent;

/* compiled from: GoldSwitchPlansConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¢\u0006\u0002\u0010\f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\r"}, m3636d2 = {"GoldSwitchPlansConfirmationImage", "", "getGoldSwitchPlansConfirmationImage$annotations", "()V", "GoldSwitchPlansConfirmationComposable", "", "confirmationPage", "Lmidas/service/v1/SwitchPlansConfirmationContent;", "modifier", "Landroidx/compose/ui/Modifier;", "onClickCta", "Lkotlin/Function0;", "(Lmidas/service/v1/SwitchPlansConfirmationContent;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-gold-switch-plans_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansConfirmationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSwitchPlansConfirmationComposable {
    public static final String GoldSwitchPlansConfirmationImage = "gold_switch_plans_confirmation_image";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSwitchPlansConfirmationComposable$lambda$1(SwitchPlansConfirmationContent switchPlansConfirmationContent, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        GoldSwitchPlansConfirmationComposable(switchPlansConfirmationContent, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldSwitchPlansConfirmationImage$annotations() {
    }

    public static final void GoldSwitchPlansConfirmationComposable(final SwitchPlansConfirmationContent confirmationPage, final Modifier modifier, final Function0<Unit> onClickCta, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(confirmationPage, "confirmationPage");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2010963421);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(confirmationPage) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2010963421, i3, -1, "com.robinhood.android.gold.switchplans.GoldSwitchPlansConfirmationComposable (GoldSwitchPlansConfirmationComposable.kt:41)");
            }
            final AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(confirmationPage.getImage_url(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-461237144, true, new GoldSwitchPlansConfirmationComposable2(confirmationPage, onClickCta), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2309787, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansConfirmationComposableKt$GoldSwitchPlansConfirmationComposable$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                    invoke(boxScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i5) {
                    long solLight;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2309787, i5, -1, "com.robinhood.android.gold.switchplans.GoldSwitchPlansConfirmationComposable.<anonymous>.<anonymous> (GoldSwitchPlansConfirmationComposable.kt:62)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier, 0.0f, composer3, 0, 1), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    AsyncImagePainter asyncImagePainter = asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg;
                    SwitchPlansConfirmationContent switchPlansConfirmationContent = confirmationPage;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ImageKt.Image(asyncImagePainter, (String) null, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, GoldSwitchPlansConfirmationComposable.GoldSwitchPlansConfirmationImage), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C17956R.dimen.gold_confirmation_checkmark_height, composer3, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i6).m21594getXlargeD9Ej5fM()), composer3, 0);
                    String title = switchPlansConfirmationContent.getTitle();
                    TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer3, i6).getDisplayCapsuleLarge();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 0, 0, 8126);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM()), composer3, 0);
                    String description = switchPlansConfirmationContent.getDescription();
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                    if (bentoTheme.getColors(composer3, i6).getIsDay()) {
                        composer3.startReplaceGroup(1364465125);
                        solLight = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1364546655);
                        solLight = bentoTheme.getColors(composer3, i6).getSolLight();
                        composer3.endReplaceGroup();
                    }
                    BentoMarkdownText2.BentoMarkdownText(description, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(null, iM7919getCentere0LSkKk, 0L, solLight, false, composer3, BentoMarkdownText.$stable << 15, 21), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansConfirmationComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSwitchPlansConfirmationComposable.GoldSwitchPlansConfirmationComposable$lambda$1(confirmationPage, modifier2, onClickCta, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
