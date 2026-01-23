package com.robinhood.android.crypto.p094ui.detail.banner;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.banner.UkRiskWarningBannerComposable;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UkRiskWarningBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"UkRiskWarningBannerComposable", "", "currencyPairId", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.banner.UkRiskWarningBannerComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class UkRiskWarningBannerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkRiskWarningBannerComposable$lambda$0(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UkRiskWarningBannerComposable(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void UkRiskWarningBannerComposable(String currencyPairId, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final String str;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1624650370);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1624650370, i3, -1, "com.robinhood.android.crypto.ui.detail.banner.UkRiskWarningBannerComposable (UkRiskWarningBannerComposable.kt:29)");
            }
            str = currencyPairId;
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1996254684, true, new C133031(modifier2, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), str, (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str = currencyPairId;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.banner.UkRiskWarningBannerComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkRiskWarningBannerComposable.UkRiskWarningBannerComposable$lambda$0(str, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UkRiskWarningBannerComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.banner.UkRiskWarningBannerComposableKt$UkRiskWarningBannerComposable$1 */
    static final class C133031 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $currencyPairId;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Modifier $modifier;

        C133031(Modifier modifier, EventLogger eventLogger, String str, UserInteractionEventDescriptor userInteractionEventDescriptor, Context context) {
            this.$modifier = modifier;
            this.$eventLogger = eventLogger;
            this.$currencyPairId = str;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1996254684, i, -1, "com.robinhood.android.crypto.ui.detail.banner.UkRiskWarningBannerComposable.<anonymous> (UkRiskWarningBannerComposable.kt:35)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C12757R.string.uk_risk_warning_banner_text, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C12757R.string.uk_risk_warning_banner_cta, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            long jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU();
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$currencyPairId) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$context);
            final EventLogger eventLogger = this.$eventLogger;
            final String str = this.$currencyPairId;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final Context context = this.$context;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.banner.UkRiskWarningBannerComposableKt$UkRiskWarningBannerComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkRiskWarningBannerComposable.C133031.invoke$lambda$1$lambda$0(eventLogger, str, userInteractionEventDescriptor, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifier, strStringResource, null, strStringResource2, (Function0) objRememberedValue, null, jM21425getFg0d7_KjU, jM21372getBg20d7_KjU, composer, 0, 36);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, String str, UserInteractionEventDescriptor userInteractionEventDescriptor, Context context) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.CRYPTO_DETAIL_PAGE, str, str, null, 8, null), new Component(null, "INVESTMENT_WARNING_BANNER", null, 5, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, userInteractionEventDescriptor.getScreen(), null, new Asset(str, Asset.AssetType.CURRENCY_PAIR, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -20481, -1, -1, -1, -1, -1, 16383, null), false, 41, null);
            WebUtils.viewUrl$default(context, "https://robinhood.com/gb/en/support/articles/fca-risk-disclosure", 0, 4, (Object) null);
            return Unit.INSTANCE;
        }
    }
}
