package com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Size;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.referral.lib.ToHttpUrl;
import com.robinhood.android.referral.lib.rewardOfferDetail.p235ui.MarqueeRowComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferInfoSheet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ReferralInfoSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"ReferralInfoSheetComposable", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "content", "Lcom/robinhood/models/ui/referraloffer/ReferralOfferInfoSheet;", "onDismiss", "Lkotlin/Function0;", "(Landroid/util/DisplayMetrics;Lcom/robinhood/models/ui/referraloffer/ReferralOfferInfoSheet;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralInfoSheetComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ReferralInfoSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralInfoSheetComposable$lambda$0(DisplayMetrics displayMetrics, ReferralOfferInfoSheet referralOfferInfoSheet, Function0 function0, int i, Composer composer, int i2) {
        ReferralInfoSheetComposable(displayMetrics, referralOfferInfoSheet, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ReferralInfoSheetComposable(final DisplayMetrics displayMetrics, final ReferralOfferInfoSheet content, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(430315736);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(displayMetrics) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(430315736, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralInfoSheetComposable (ReferralInfoSheetComposable.kt:42)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-1469870003, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralInfoSheetComposableKt.ReferralInfoSheetComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1469870003, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralInfoSheetComposable.<anonymous> (ReferralInfoSheetComposable.kt:48)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM());
                    BentoButtonKt.m20586BentoButtonEikTQX8(onDismiss, content.getDismissCtaText(), modifierM5143paddingVpY3zN4, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(401084864, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralInfoSheetComposableKt.ReferralInfoSheetComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(401084864, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralInfoSheetComposable.<anonymous> (ReferralInfoSheetComposable.kt:60)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    ReferralOfferInfoSheet referralOfferInfoSheet = content;
                    DisplayMetrics displayMetrics2 = displayMetrics;
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(ToHttpUrl.toHttpUrl(referralOfferInfoSheet.getHeaderImage().getUrl(), composer2, 0)).size(Size.ORIGINAL).build(), null, null, null, 0, null, composer2, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (displayMetrics2.widthPixels * referralOfferInfoSheet.getHeaderImage().getAspectRatio()))), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                    composer2.endNode();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(referralOfferInfoSheet.getHeader(), 0L, composer2, 0, 1), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleLarge(), composer2, 0, 0, 8188);
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), composer2, 0);
                    composer2.startReplaceGroup(737761798);
                    for (ReferralOfferInfoSheet.Bullet bullet : referralOfferInfoSheet.getBullets()) {
                        BentoValuePropRow3.BentoValuePropRow(bullet.getTitle().getText(), bullet.getSubtitle().getText(), new BentoValuePropRow2.Pog(bullet.getPictogram()), BentoValuePropRow.Top, (Modifier) null, composer2, (BentoValuePropRow2.Pog.$stable << 6) | 3072, 16);
                    }
                    composer2.endReplaceGroup();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion4, bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                    MarqueeRowComposable.MarqueeRowComposable(extensions2.toImmutableList(referralOfferInfoSheet.getMarqueeRow()), null, composer2, 0, 2);
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion4, bentoTheme2.getSpacing(composer2, i5).m21594getXlargeD9Ej5fM()), composer2, 0);
                    BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15958toAnnotatedStringV23IgeMak(referralOfferInfoSheet.getDisclosure(), 0L, (LinkInteractionListener) null, composer2, 0, 3), PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer2, i5).getTextS(), bentoTheme2.getColors(composer2, i5).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer2, 0, 0, 8188);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralInfoSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralInfoSheetComposable.ReferralInfoSheetComposable$lambda$0(displayMetrics, content, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
