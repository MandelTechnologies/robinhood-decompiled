package com.robinhood.android.transfers.recurring.p270ui.experiment.infobanner;

import android.content.Context;
import android.net.Uri;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBanner2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiInfoBannerWithDeepLinkHandling.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"SduiInfoBannerWithDeepLinkHandling", "", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "infoBanner", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.infobanner.SduiInfoBannerWithDeepLinkHandlingKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class SduiInfoBannerWithDeepLinkHandling {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiInfoBannerWithDeepLinkHandling$lambda$1(Component component, InfoBanner infoBanner, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiInfoBannerWithDeepLinkHandling(component, infoBanner, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SduiInfoBannerWithDeepLinkHandling(final Component component, final InfoBanner<? extends GenericAction> infoBanner, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(infoBanner, "infoBanner");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1684921450);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(infoBanner) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1684921450, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.infobanner.SduiInfoBannerWithDeepLinkHandling (SduiInfoBannerWithDeepLinkHandling.kt:21)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.infobanner.SduiInfoBannerWithDeepLinkHandlingKt$SduiInfoBannerWithDeepLinkHandling$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GenericAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (!(action instanceof GenericAction.Deeplink)) {
                            return false;
                        }
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                        return true;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SduiActionHandler3.ProvideActionHandler((SduiActionHandler) objRememberedValue, ComposableLambda3.rememberComposableLambda(716635511, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.infobanner.SduiInfoBannerWithDeepLinkHandlingKt.SduiInfoBannerWithDeepLinkHandling.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(716635511, i5, -1, "com.robinhood.android.transfers.recurring.ui.experiment.infobanner.SduiInfoBannerWithDeepLinkHandling.<anonymous> (SduiInfoBannerWithDeepLinkHandling.kt:39)");
                    }
                    SduiInfoBanner2.SduiInfoBanner(infoBanner, ModifiersKt.autoLogEvents$default(modifier, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, component, null, 47, null), true, false, false, true, false, null, 108, null), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.infobanner.SduiInfoBannerWithDeepLinkHandlingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiInfoBannerWithDeepLinkHandling.SduiInfoBannerWithDeepLinkHandling$lambda$1(component, infoBanner, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
