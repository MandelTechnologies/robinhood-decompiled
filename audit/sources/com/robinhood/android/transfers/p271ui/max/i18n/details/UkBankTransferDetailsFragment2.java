package com.robinhood.android.transfers.p271ui.max.i18n.details;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkBankTransferDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.ComposableSingletons$UkBankTransferDetailsFragmentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkBankTransferDetailsFragment2 {
    public static final UkBankTransferDetailsFragment2 INSTANCE = new UkBankTransferDetailsFragment2();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$620417581 = ComposableLambda3.composableLambdaInstance(620417581, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.details.ComposableSingletons$UkBankTransferDetailsFragmentKt$lambda$620417581$1
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
                ComposerKt.traceEventStart(620417581, i, -1, "com.robinhood.android.transfers.ui.max.i18n.details.ComposableSingletons$UkBankTransferDetailsFragmentKt.lambda$620417581.<anonymous> (UkBankTransferDetailsFragment.kt:141)");
            }
            Spacer2.Spacer(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1962913712, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9291lambda$1962913712 = ComposableLambda3.composableLambdaInstance(-1962913712, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.details.ComposableSingletons$UkBankTransferDetailsFragmentKt$lambda$-1962913712$1
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
                ComposerKt.traceEventStart(-1962913712, i, -1, "com.robinhood.android.transfers.ui.max.i18n.details.ComposableSingletons$UkBankTransferDetailsFragmentKt.lambda$-1962913712.<anonymous> (UkBankTransferDetailsFragment.kt:166)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C30065R.string.uk_transfer_cancelable_footer, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1962913712$feature_transfers_externalRelease, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m19858getLambda$1962913712$feature_transfers_externalRelease() {
        return f9291lambda$1962913712;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$620417581$feature_transfers_externalRelease() {
        return lambda$620417581;
    }
}
