package com.robinhood.android.advisory.onboarding.outro;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryAccountLoadingScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$AdvisoryAccountLoadingScreenKt {
    public static final ComposableSingletons$AdvisoryAccountLoadingScreenKt INSTANCE = new ComposableSingletons$AdvisoryAccountLoadingScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$504037017 = ComposableLambda3.composableLambdaInstance(504037017, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryAccountLoadingScreenKt$lambda$504037017$1
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
                ComposerKt.traceEventStart(504037017, i, -1, "com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryAccountLoadingScreenKt.lambda$504037017.<anonymous> (AdvisoryAccountLoadingScreen.kt:102)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2066174017 = ComposableLambda3.composableLambdaInstance(2066174017, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryAccountLoadingScreenKt$lambda$2066174017$1
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
                ComposerKt.traceEventStart(2066174017, i, -1, "com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryAccountLoadingScreenKt.lambda$2066174017.<anonymous> (AdvisoryAccountLoadingScreen.kt:254)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            AdvisoryAccountLoadingScreenKt.AdvisoryLoadingAccountScreen(new AccountLoadingScreenState(companion.invoke("We're working on it"), companion.invoke("It's taking a little longer than usual..."), new HeaderIcon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, true), true, true, ""), new AdvisoryPostAgreementsScreen() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryAccountLoadingScreenKt$lambda$2066174017$1.1
                @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen
                public void onCelebrationCtaClicked(IntentKey destination) {
                    Intrinsics.checkNotNullParameter(destination, "destination");
                }

                @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen
                public void onCloseClicked() {
                }

                @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen
                public void onRefreshClicked() {
                }

                @Override // com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen
                public void onSwipeToSubmit(TransferAccount sinkAccount, AdvisoryFirstDepositConfig.Transfer config) {
                    Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
                    Intrinsics.checkNotNullParameter(config, "config");
                }
            }, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, StringResource.$stable | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$893586689 = ComposableLambda3.composableLambdaInstance(893586689, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryAccountLoadingScreenKt$lambda$893586689$1
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
                ComposerKt.traceEventStart(893586689, i, -1, "com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryAccountLoadingScreenKt.lambda$893586689.<anonymous> (AdvisoryAccountLoadingScreen.kt:251)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableSingletons$AdvisoryAccountLoadingScreenKt.INSTANCE.getLambda$2066174017$feature_advisory_onboarding_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2066174017$feature_advisory_onboarding_externalDebug() {
        return lambda$2066174017;
    }

    public final Function2<Composer, Integer, Unit> getLambda$504037017$feature_advisory_onboarding_externalDebug() {
        return lambda$504037017;
    }

    public final Function2<Composer, Integer, Unit> getLambda$893586689$feature_advisory_onboarding_externalDebug() {
        return lambda$893586689;
    }
}
