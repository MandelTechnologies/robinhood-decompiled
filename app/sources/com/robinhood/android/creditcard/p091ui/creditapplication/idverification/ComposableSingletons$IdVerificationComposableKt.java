package com.robinhood.android.creditcard.p091ui.creditapplication.idverification;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdVerificationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$IdVerificationComposableKt {
    public static final ComposableSingletons$IdVerificationComposableKt INSTANCE = new ComposableSingletons$IdVerificationComposableKt();

    /* renamed from: lambda$-808535737, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8786lambda$808535737 = ComposableLambda3.composableLambdaInstance(-808535737, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.ComposableSingletons$IdVerificationComposableKt$lambda$-808535737$1
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
                ComposerKt.traceEventStart(-808535737, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.ComposableSingletons$IdVerificationComposableKt.lambda$-808535737.<anonymous> (IdVerificationComposable.kt:129)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, IdVerificationComposableKt.ID_VERIFICATION_TITLE_TEST_TAG);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_idv_title, composer, 0), modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleLarge(), composer, 48, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1639276994, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8785lambda$1639276994 = ComposableLambda3.composableLambdaInstance(-1639276994, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.ComposableSingletons$IdVerificationComposableKt$lambda$-1639276994$1
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
                ComposerKt.traceEventStart(-1639276994, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.ComposableSingletons$IdVerificationComposableKt.lambda$-1639276994.<anonymous> (IdVerificationComposable.kt:137)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1588592001, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8784lambda$1588592001 = ComposableLambda3.composableLambdaInstance(-1588592001, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.ComposableSingletons$IdVerificationComposableKt$lambda$-1588592001$1
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
                ComposerKt.traceEventStart(-1588592001, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.ComposableSingletons$IdVerificationComposableKt.lambda$-1588592001.<anonymous> (IdVerificationComposable.kt:139)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, IdVerificationComposableKt.ID_VERIFICATION_SUBTITLE_TEST_TAG);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_idv_subtitle, composer, 0), modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 48, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1537907008, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8783lambda$1537907008 = ComposableLambda3.composableLambdaInstance(-1537907008, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.idverification.ComposableSingletons$IdVerificationComposableKt$lambda$-1537907008$1
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
                ComposerKt.traceEventStart(-1537907008, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.idverification.ComposableSingletons$IdVerificationComposableKt.lambda$-1537907008.<anonymous> (IdVerificationComposable.kt:147)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1537907008$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12747getLambda$1537907008$feature_credit_card_externalDebug() {
        return f8783lambda$1537907008;
    }

    /* renamed from: getLambda$-1588592001$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12748getLambda$1588592001$feature_credit_card_externalDebug() {
        return f8784lambda$1588592001;
    }

    /* renamed from: getLambda$-1639276994$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12749getLambda$1639276994$feature_credit_card_externalDebug() {
        return f8785lambda$1639276994;
    }

    /* renamed from: getLambda$-808535737$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12750getLambda$808535737$feature_credit_card_externalDebug() {
        return f8786lambda$808535737;
    }
}
