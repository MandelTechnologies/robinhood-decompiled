package com.robinhood.android.internalassettransfers;

import android.content.res.Resources;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.internalassettransfers.InternalAssetTransferInfoBannerViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTranferInfoBanner.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"NONTRANSFERABLE_ASSETS_BANNER_IDENTIFIER", "", "InternalAssetTransferInfoBanner", "", "infoBannerViewState", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState;", "onCtaClicked", "Lkotlin/Function0;", "(Lcom/robinhood/android/internalassettransfers/InternalAssetTransferInfoBannerViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTranferInfoBannerKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTranferInfoBanner {
    private static final String NONTRANSFERABLE_ASSETS_BANNER_IDENTIFIER = "nontransferable_assets";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferInfoBanner$lambda$2(InternalAssetTransferInfoBannerViewState internalAssetTransferInfoBannerViewState, Function0 function0, int i, Composer composer, int i2) throws Resources.NotFoundException {
        InternalAssetTransferInfoBanner(internalAssetTransferInfoBannerViewState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InternalAssetTransferInfoBanner(final InternalAssetTransferInfoBannerViewState infoBannerViewState, final Function0<Unit> onCtaClicked, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Intrinsics.checkNotNullParameter(infoBannerViewState, "infoBannerViewState");
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-159017668);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(infoBannerViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-159017668, i2, -1, "com.robinhood.android.internalassettransfers.InternalAssetTransferInfoBanner (InternalAssetTranferInfoBanner.kt:36)");
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.INFO_BANNER, NONTRANSFERABLE_ASSETS_BANNER_IDENTIFIER, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            InternalAssetTransferInfoBannerViewState.InfoBannerState infoBannerState = infoBannerViewState.getInfoBannerState();
            if (Intrinsics.areEqual(infoBannerState, InternalAssetTransferInfoBannerViewState.InfoBannerState.HasIneligibleAssets.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(54453961);
                String strPluralStringResource = StringResources_androidKt.pluralStringResource(C18977R.plurals.f4206xefaace5, infoBannerViewState.getNontransferableAssets().getAssetsCount(), new Object[]{Integer.valueOf(infoBannerViewState.getNontransferableAssets().getAssetsCount())}, composerStartRestartGroup, 0);
                String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_review_info_banner_cta_text, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
                long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU();
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (i2 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTranferInfoBannerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTranferInfoBanner.InternalAssetTransferInfoBanner$lambda$1$lambda$0(onCtaClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierAutoLogEvents$default, strPluralStringResource, size24, strStringResource, (Function0) objRememberedValue, null, jM21425getFg0d7_KjU, jM21372getBg20d7_KjU, composerStartRestartGroup, BentoIcon4.Size24.$stable << 6, 32);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(infoBannerState, InternalAssetTransferInfoBannerViewState.InfoBannerState.NoAvailableAssets.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1802868292);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(55289566);
                String strStringResource2 = StringResources_androidKt.stringResource(C18977R.string.f4220xeefd9cfb, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierAutoLogEvents$default, strStringResource2, new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), null, null, null, bentoTheme2.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), composerStartRestartGroup, (BentoIcon4.Size24.$stable << 6) | 3072, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTranferInfoBannerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTranferInfoBanner.InternalAssetTransferInfoBanner$lambda$2(infoBannerViewState, onCtaClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferInfoBanner$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
