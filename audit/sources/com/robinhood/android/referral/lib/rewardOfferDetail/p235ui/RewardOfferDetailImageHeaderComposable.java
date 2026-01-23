package com.robinhood.android.referral.lib.rewardOfferDetail.p235ui;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.Coil;
import coil.compose.AsyncImagePainter4;
import coil.request.ImageRequest;
import coil.size.Scale;
import coil.size.Size;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.referral.lib.C26709R;
import com.robinhood.android.referral.lib.ToHttpUrl;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.rewardoffer.ImageHeaderData;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RewardOfferDetailImageHeaderComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"RewardOfferDetailImageHeaderComposable", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/ImageHeaderData;", "(Lcom/robinhood/models/api/rewardoffer/ImageHeaderData;Landroidx/compose/runtime/Composer;I)V", "imageHeaderTestTag", "", "feature-lib-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailImageHeaderComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardOfferDetailImageHeaderComposable {
    public static final String imageHeaderTestTag = "imageHeader";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardOfferDetailImageHeaderComposable$lambda$1(ImageHeaderData imageHeaderData, int i, Composer composer, int i2) {
        RewardOfferDetailImageHeaderComposable(imageHeaderData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RewardOfferDetailImageHeaderComposable(final ImageHeaderData data, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        int i3;
        float f;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-182130362);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(data) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-182130362, i2, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailImageHeaderComposable (RewardOfferDetailImageHeaderComposable.kt:33)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(ToHttpUrl.toHttpUrl(data.getImage().toDbModel(), composerStartRestartGroup, 0)).size(Size.ORIGINAL).scale(Scale.FIT).build(), Coil.imageLoader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, imageHeaderTestTag), 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            Instant expiration_date = data.getExpiration_date();
            composerStartRestartGroup.startReplaceGroup(1891198242);
            if (!data.getShow_expiration() || expiration_date == null) {
                bentoTheme = bentoTheme2;
                i3 = i5;
                f = 0.0f;
                i4 = 1;
            } else {
                i3 = i5;
                bentoTheme = bentoTheme2;
                f = 0.0f;
                i4 = 1;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26709R.string.reward_offers_expiration_text, new Object[]{InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) expiration_date)}, composerStartRestartGroup, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8124);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, f, composerStartRestartGroup, 6, i4);
            String display_title = data.getDisplay_title();
            int i6 = i3;
            BentoTheme bentoTheme3 = bentoTheme;
            TextStyle displayCapsuleMedium = bentoTheme3.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            Composer composer3 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(display_title, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 0, 0, 8124);
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, C2002Dp.m7995constructorimpl(12), 0.0f, composer3, 54, 2);
            String display_subtitle = data.getDisplay_subtitle();
            TextStyle textM = bentoTheme3.getTypography(composer3, i6).getTextM();
            composer2 = composer3;
            BentoText2.m20747BentoText38GnDrw(display_subtitle, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composer2, 0, 0, 8124);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailImageHeaderComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardOfferDetailImageHeaderComposable.RewardOfferDetailImageHeaderComposable$lambda$1(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
