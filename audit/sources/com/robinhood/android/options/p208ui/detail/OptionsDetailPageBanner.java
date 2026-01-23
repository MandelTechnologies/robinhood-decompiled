package com.robinhood.android.options.p208ui.detail;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.shared.iac.extensions.IacInfoBannerComposable;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsDetailPageBanner.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"OptionsDetailPageBanner", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Banner;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "duxo", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Banner;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBannerKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageBanner {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageBanner$lambda$1(OptionsDetailPageBodyState2.Banner banner, Navigator navigator, OptionsDetailPageDuxo optionsDetailPageDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsDetailPageBanner(banner, navigator, optionsDetailPageDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OptionsDetailPageBanner(final OptionsDetailPageBodyState2.Banner state, final Navigator navigator, final OptionsDetailPageDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(1019200205);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1019200205, i3, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageBanner (OptionsDetailPageBanner.kt:19)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OptionsDetailPageBanner2(duxo, state, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            IacInfoBannerComposable.IacInfoBannerComposable(PaddingKt.m5143paddingVpY3zN4(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), state.getInfoBanner(), new InfoBannerCallbacks() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageBannerKt.OptionsDetailPageBanner.2
                @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
                public void onClickInfoBanner(IacInfoBanner banner) {
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    duxo.tapInfoBanner(navigator, context, banner.getReceiptUuid(), banner.getCtaAction());
                }

                @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
                public void onDismissInfoBanner(IacInfoBanner banner) {
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    duxo.dismissInfoBanner(banner.getReceiptUuid());
                }
            }, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDetailPageBanner.OptionsDetailPageBanner$lambda$1(state, navigator, duxo, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
