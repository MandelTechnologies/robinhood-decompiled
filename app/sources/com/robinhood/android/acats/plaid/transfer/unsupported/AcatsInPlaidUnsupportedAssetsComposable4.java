package com.robinhood.android.acats.plaid.transfer.unsupported;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPlaidUnsupportedAssetsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInPlaidUnsupportedAssetsComposable4 {
    public static final AcatsInPlaidUnsupportedAssetsComposable4 INSTANCE = new AcatsInPlaidUnsupportedAssetsComposable4();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$2114967084 = ComposableLambda3.composableLambdaInstance(2114967084, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt$lambda$2114967084$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2114967084, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt.lambda$2114967084.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:66)");
            }
            AcatsPlaidPartialTransferReadyComposableKt.AcatsPartialTransferAssetSectionTitle(StringResources_androidKt.stringResource(C7686R.string.acats_in_build_partial_cash_asset_title, composer, 0), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1037963563, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8603lambda$1037963563 = ComposableLambda3.composableLambdaInstance(-1037963563, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt$lambda$-1037963563$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1037963563, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt.lambda$-1037963563.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:82)");
            }
            AcatsPlaidPartialTransferReadyComposableKt.AcatsPartialTransferAssetSectionTitle(StringResources_androidKt.stringResource(C7376R.string.acats_plaid_fractional_shares_title, composer, 0), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-513157452, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8604lambda$513157452 = ComposableLambda3.composableLambdaInstance(-513157452, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt$lambda$-513157452$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-513157452, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt.lambda$-513157452.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:98)");
            }
            AcatsPlaidPartialTransferReadyComposableKt.AcatsPartialTransferAssetSectionTitle(StringResources_androidKt.stringResource(C7686R.string.acats_in_build_partial_options_header, composer, 0), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$11648659 = ComposableLambda3.composableLambdaInstance(11648659, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt$lambda$11648659$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(11648659, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsComposableKt.lambda$11648659.<anonymous> (AcatsInPlaidUnsupportedAssetsComposable.kt:109)");
            }
            AcatsPlaidPartialTransferReadyComposableKt.AcatsPartialTransferAssetSectionTitle(StringResources_androidKt.stringResource(C7376R.string.acats_plaid_fixed_income_title, composer, 0), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1037963563$lib_acats_plaid_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m10672getLambda$1037963563$lib_acats_plaid_externalDebug() {
        return f8603lambda$1037963563;
    }

    /* renamed from: getLambda$-513157452$lib_acats_plaid_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m10673getLambda$513157452$lib_acats_plaid_externalDebug() {
        return f8604lambda$513157452;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$11648659$lib_acats_plaid_externalDebug() {
        return lambda$11648659;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$2114967084$lib_acats_plaid_externalDebug() {
        return lambda$2114967084;
    }
}
