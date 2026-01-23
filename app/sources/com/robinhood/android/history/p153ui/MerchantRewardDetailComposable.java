package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.models.p320db.MerchantRewardDetails;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MerchantRewardDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"MerchantRewardDetailsList", "", "state", "Lcom/robinhood/android/history/ui/MerchantDetailViewState;", "onStatusIconClicked", "Lkotlin/Function0;", "onBannerDeeplinkClicked", "(Lcom/robinhood/android/history/ui/MerchantDetailViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BANNER_TEST_TAG", "", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.history.ui.MerchantRewardDetailComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class MerchantRewardDetailComposable {
    public static final String BANNER_TEST_TAG = "banner";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardDetailsList$lambda$5(MerchantDetailViewState merchantDetailViewState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        MerchantRewardDetailsList(merchantDetailViewState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r10v14 */
    public static final void MerchantRewardDetailsList(final MerchantDetailViewState state, Function0<Unit> function0, Function0<Unit> onBannerDeeplinkClicked, Composer composer, final int i) {
        TextStyle displayCapsuleMedium;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i2;
        Context context;
        int i3;
        boolean z;
        boolean z2;
        final Function0<Unit> function02;
        int i4;
        ?? r10;
        final Function0<Unit> onStatusIconClicked = function0;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onStatusIconClicked, "onStatusIconClicked");
        Intrinsics.checkNotNullParameter(onBannerDeeplinkClicked, "onBannerDeeplinkClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1320919933);
        int i5 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onStatusIconClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onBannerDeeplinkClicked) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = onBannerDeeplinkClicked;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1320919933, i5, -1, "com.robinhood.android.history.ui.MerchantRewardDetailsList (MerchantRewardDetailComposable.kt:27)");
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            StringResource rewardDetailTitle = state.getRewardDetailTitle();
            Resources resources = context2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String string2 = rewardDetailTitle.getText(resources).toString();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            if (string2.length() < 12) {
                composerStartRestartGroup.startReplaceGroup(1066088498);
                displayCapsuleMedium = bentoTheme2.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleLarge();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1066166897);
                displayCapsuleMedium = bentoTheme2.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium();
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoText2.m20747BentoText38GnDrw(string2, modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
            String rewardDetailSubtitle = state.getRewardDetailSubtitle();
            composerStartRestartGroup.startReplaceGroup(588588455);
            if (state.getMerchantRewardDetailSubtitleIsVisible() && rewardDetailSubtitle != null) {
                BentoText2.m20747BentoText38GnDrw(rewardDetailSubtitle, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8188);
            }
            composerStartRestartGroup.endReplaceGroup();
            MerchantOfferBanner banner = state.getBanner();
            composerStartRestartGroup.startReplaceGroup(588601634);
            if (banner == null) {
                context = context2;
                i3 = i5;
                bentoTheme = bentoTheme2;
                companion = companion2;
                i2 = i6;
                z = true;
                z2 = false;
            } else {
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2);
                companion = companion2;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifierTestTag = TestTag3.testTag(modifierM21622defaultHorizontalPaddingWMci_g0, BANNER_TEST_TAG);
                int i7 = i5;
                String text = banner.getText();
                Icon icon = banner.getIcon();
                bentoTheme = bentoTheme2;
                i2 = i6;
                context = context2;
                i3 = i7;
                z = true;
                z2 = false;
                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierTestTag, text, icon != null ? SduiIcon2.toBentoIcon(icon) : null, banner.getCtaText(), onBannerDeeplinkClicked, null, bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), composerStartRestartGroup, (BentoIcon4.$stable << 6) | ((i7 << 6) & 57344), 32);
            }
            function02 = onBannerDeeplinkClicked;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(588618943);
            if (state.getMerchantRewardDetailStatusIsVisible()) {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String string3 = context.getString(C18359R.string.merchant_reward_detail_status);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                i4 = 2;
                r10 = 0;
                AnnotatedString annotatedString = new AnnotatedString(string3, null, 2, null);
                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_24);
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i2).m21426getFg20d7_KjU();
                MerchantReward merchantReward = state.getMerchantReward();
                String stateDescription = merchantReward != null ? merchantReward.getStateDescription() : null;
                String string4 = context.getString(state.getRewardDetailStatus());
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                BentoDataRowState bentoDataRowState = new BentoDataRowState(stateDescription, annotatedString, null, size16, Color.m6701boximpl(jM21426getFg20d7_KjU), new AnnotatedString(string4, null, 2, null), null, null, null, null, false, false, 4036, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z3 = (i3 & 112) == 32 ? z : z2;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    onStatusIconClicked = function0;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.history.ui.MerchantRewardDetailComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MerchantRewardDetailComposable.MerchantRewardDetailsList$lambda$4$lambda$2$lambda$1(onStatusIconClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    onStatusIconClicked = function0;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowKt.BentoDataRow(bentoDataRowState, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, composerStartRestartGroup, BentoDataRowState.$stable, 0);
            } else {
                onStatusIconClicked = function0;
                i4 = 2;
                r10 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            MerchantReward merchantReward2 = state.getMerchantReward();
            List<MerchantRewardDetails> detailsFields = merchantReward2 != null ? merchantReward2.getDetailsFields() : r10;
            composerStartRestartGroup.startReplaceGroup(588643049);
            if (detailsFields != null) {
                for (MerchantRewardDetails merchantRewardDetails : detailsFields) {
                    String header = merchantRewardDetails.getHeader();
                    String mainValue = merchantRewardDetails.getMainValue();
                    composerStartRestartGroup.startReplaceGroup(588646077);
                    if (header != null && header.length() != 0 && mainValue != null && mainValue.length() != 0) {
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(header, r10, i4, r10), null, null, null, new AnnotatedString(mainValue, r10, i4, r10), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.history.ui.MerchantRewardDetailComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardDetailComposable.MerchantRewardDetailsList$lambda$5(state, onStatusIconClicked, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardDetailsList$lambda$4$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
