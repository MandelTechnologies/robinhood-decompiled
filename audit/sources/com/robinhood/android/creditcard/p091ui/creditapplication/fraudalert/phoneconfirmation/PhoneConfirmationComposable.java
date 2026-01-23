package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
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

/* compiled from: PhoneConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PhoneConfirmationComposable {
    public static final PhoneConfirmationComposable INSTANCE = new PhoneConfirmationComposable();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$906634823 = ComposableLambda3.composableLambdaInstance(906634823, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt$lambda$906634823$1
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
                ComposerKt.traceEventStart(906634823, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt.lambda$906634823.<anonymous> (PhoneConfirmationComposable.kt:90)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, PhoneConfirmationComposable6.PHONE_CONFIRMATION_TITLE_TEST_TAG);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_phone_title, composer, 0), modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleLarge(), composer, 48, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1516839998 = ComposableLambda3.composableLambdaInstance(1516839998, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt$lambda$1516839998$1
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
                ComposerKt.traceEventStart(1516839998, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt.lambda$1516839998.<anonymous> (PhoneConfirmationComposable.kt:98)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-383076481, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8774lambda$383076481 = ComposableLambda3.composableLambdaInstance(-383076481, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt$lambda$-383076481$1
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
                ComposerKt.traceEventStart(-383076481, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt.lambda$-383076481.<anonymous> (PhoneConfirmationComposable.kt:100)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, PhoneConfirmationComposable6.PHONE_CONFIRMATION_SUBTITLE_TEST_TAG);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_fraud_alert_phone_subtitle, composer, 0), modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 48, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$2011974336 = ComposableLambda3.composableLambdaInstance(2011974336, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt$lambda$2011974336$1
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
                ComposerKt.traceEventStart(2011974336, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.ComposableSingletons$PhoneConfirmationComposableKt.lambda$2011974336.<anonymous> (PhoneConfirmationComposable.kt:108)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-383076481$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12707getLambda$383076481$feature_credit_card_externalDebug() {
        return f8774lambda$383076481;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1516839998$feature_credit_card_externalDebug() {
        return lambda$1516839998;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$2011974336$feature_credit_card_externalDebug() {
        return lambda$2011974336;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$906634823$feature_credit_card_externalDebug() {
        return lambda$906634823;
    }
}
