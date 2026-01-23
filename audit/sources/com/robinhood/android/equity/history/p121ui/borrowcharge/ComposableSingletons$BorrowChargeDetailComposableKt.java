package com.robinhood.android.equity.history.p121ui.borrowcharge;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equity.history.C15093R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BorrowChargeDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$BorrowChargeDetailComposableKt {
    public static final ComposableSingletons$BorrowChargeDetailComposableKt INSTANCE = new ComposableSingletons$BorrowChargeDetailComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$741704728 = ComposableLambda3.composableLambdaInstance(741704728, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.ComposableSingletons$BorrowChargeDetailComposableKt$lambda$741704728$1
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
                ComposerKt.traceEventStart(741704728, i, -1, "com.robinhood.android.equity.history.ui.borrowcharge.ComposableSingletons$BorrowChargeDetailComposableKt.lambda$741704728.<anonymous> (BorrowChargeDetailComposable.kt:45)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$2139910080 = ComposableLambda3.composableLambdaInstance(2139910080, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.ComposableSingletons$BorrowChargeDetailComposableKt$lambda$2139910080$1
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
                ComposerKt.traceEventStart(2139910080, i, -1, "com.robinhood.android.equity.history.ui.borrowcharge.ComposableSingletons$BorrowChargeDetailComposableKt.lambda$2139910080.<anonymous> (BorrowChargeDetailComposable.kt:81)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C15093R.string.borrow_charge_detail_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$2139910080$feature_equity_history_externalDebug() {
        return lambda$2139910080;
    }

    public final Function2<Composer, Integer, Unit> getLambda$741704728$feature_equity_history_externalDebug() {
        return lambda$741704728;
    }
}
