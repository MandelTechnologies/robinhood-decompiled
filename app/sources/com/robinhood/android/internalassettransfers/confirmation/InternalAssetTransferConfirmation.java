package com.robinhood.android.internalassettransfers.confirmation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalAssetTransferConfirmation.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferConfirmation {
    public static final InternalAssetTransferConfirmation INSTANCE = new InternalAssetTransferConfirmation();

    /* renamed from: lambda$-153928519, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9042lambda$153928519 = ComposableLambda3.composableLambdaInstance(-153928519, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt$lambda$-153928519$1
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
                ComposerKt.traceEventStart(-153928519, i, -1, "com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt.lambda$-153928519.<anonymous> (InternalAssetTransferConfirmation.kt:68)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-320413881, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9043lambda$320413881 = ComposableLambda3.composableLambdaInstance(-320413881, false, InternalAssetTransferConfirmation4.INSTANCE);

    /* renamed from: lambda$-1514009977, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9041lambda$1514009977 = ComposableLambda3.composableLambdaInstance(-1514009977, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt$lambda$-1514009977$1
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
                ComposerKt.traceEventStart(-1514009977, i, -1, "com.robinhood.android.internalassettransfers.confirmation.ComposableSingletons$InternalAssetTransferConfirmationKt.lambda$-1514009977.<anonymous> (InternalAssetTransferConfirmation.kt:284)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), InternalAssetTransferConfirmation.INSTANCE.m2078x5148bee7(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1514009977$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2076xb9fec140() {
        return f9041lambda$1514009977;
    }

    /* renamed from: getLambda$-153928519$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2077x57762206() {
        return f9042lambda$153928519;
    }

    /* renamed from: getLambda$-320413881$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2078x5148bee7() {
        return f9043lambda$320413881;
    }
}
