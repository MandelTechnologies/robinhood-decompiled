package com.robinhood.android.internalassettransfers.agreements;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferAgreement.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$InternalAssetTransferAgreementKt {
    public static final ComposableSingletons$InternalAssetTransferAgreementKt INSTANCE = new ComposableSingletons$InternalAssetTransferAgreementKt();

    /* renamed from: lambda$-666873070, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9040lambda$666873070 = ComposableLambda3.composableLambdaInstance(-666873070, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.agreements.ComposableSingletons$InternalAssetTransferAgreementKt$lambda$-666873070$1
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
                ComposerKt.traceEventStart(-666873070, i, -1, "com.robinhood.android.internalassettransfers.agreements.ComposableSingletons$InternalAssetTransferAgreementKt.lambda$-666873070.<anonymous> (InternalAssetTransferAgreement.kt:142)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-370456297, reason: not valid java name */
    private static Function3<BoxScope, Composer, Integer, Unit> f9039lambda$370456297 = ComposableLambda3.composableLambdaInstance(-370456297, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.agreements.ComposableSingletons$InternalAssetTransferAgreementKt$lambda$-370456297$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-370456297, i, -1, "com.robinhood.android.internalassettransfers.agreements.ComposableSingletons$InternalAssetTransferAgreementKt.lambda$-370456297.<anonymous> (InternalAssetTransferAgreement.kt:150)");
            }
            BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.8f, null, 0, 0L, 0L, false, composer, 6, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$432173172 = ComposableLambda3.composableLambdaInstance(432173172, false, C19032xdd346482.INSTANCE);

    /* renamed from: getLambda$-370456297$feature_internal_asset_transfers_externalDebug */
    public final Function3<BoxScope, Composer, Integer, Unit> m2067x5241ac6c() {
        return f9039lambda$370456297;
    }

    /* renamed from: getLambda$-666873070$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2068x183efba8() {
        return f9040lambda$666873070;
    }

    /* renamed from: getLambda$432173172$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2069xd2411502() {
        return lambda$432173172;
    }
}
