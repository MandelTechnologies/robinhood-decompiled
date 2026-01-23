package com.truelayer.payments.p419ui.screens.result;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.iso.countrycode.CountryCode;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.payments.PaymentFailureReason;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.ProviderAvailability;
import com.truelayer.payments.p419ui.screens.result.components.Badge2;
import com.truelayer.payments.p419ui.screens.result.components.ResultIcons;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Result.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ResultKt {
    public static final ComposableSingletons$ResultKt INSTANCE = new ComposableSingletons$ResultKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9617lambda1 = ComposableLambda3.composableLambdaInstance(-674658725, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-674658725, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-1.<anonymous> (Result.kt:116)");
            }
            ResultIcons.m27152ResultInProgressIcon9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<C2002Dp, Composer, Integer, Unit> f9619lambda2 = ComposableLambda3.composableLambdaInstance(1072680556, false, new Function3<C2002Dp, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C2002Dp c2002Dp, Composer composer, Integer num) {
            m27138invoke8Feqmps(c2002Dp.getValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-8Feqmps, reason: not valid java name */
        public final void m27138invoke8Feqmps(float f, Composer composer, int i) {
            if ((i & 14) == 0) {
                i |= composer.changed(f) ? 4 : 2;
            }
            if ((i & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1072680556, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-2.<anonymous> (Result.kt:162)");
                }
                Badge2.m27143BadgeOkHde_KZM(f, 0L, 0L, composer, i & 14, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<C2002Dp, Composer, Integer, Unit> f9620lambda3 = ComposableLambda3.composableLambdaInstance(627903123, false, new Function3<C2002Dp, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C2002Dp c2002Dp, Composer composer, Integer num) {
            m27139invoke8Feqmps(c2002Dp.getValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-8Feqmps, reason: not valid java name */
        public final void m27139invoke8Feqmps(float f, Composer composer, int i) {
            if ((i & 14) == 0) {
                i |= composer.changed(f) ? 4 : 2;
            }
            if ((i & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(627903123, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-3.<anonymous> (Result.kt:249)");
                }
                Badge2.m27142BadgeFailedHde_KZM(f, 0L, 0L, composer, i & 14, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9621lambda4 = ComposableLambda3.composableLambdaInstance(969168798, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(969168798, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-4.<anonymous> (Result.kt:278)");
                }
                ResultKt.ResultInProgress(Currency.Defaults.INSTANCE.getGBP(), 1000L, "123456778", "Client", ResultScreen8.Payment, null, composer, 28088, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9622lambda5 = ComposableLambda3.composableLambdaInstance(-1157949939, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1157949939, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-5.<anonymous> (Result.kt:301)");
                }
                ResultKt.ResultSuccess(Currency.Defaults.INSTANCE.getGBP(), 1000L, "123456778", "Client", new PaymentProvider("id", "Provider", "", "", "", CountryCode.COUNTRY_CODE_GB, (List) null, 0.0f, false, (ProviderAvailability) null, (List) null, (List) null, 4032, (DefaultConstructorMarker) null), ResultScreen8.Payment, null, composer, 232888, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9623lambda6 = ComposableLambda3.composableLambdaInstance(1333970483, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1333970483, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-6.<anonymous> (Result.kt:335)");
                }
                ResultKt.ResultFailed(PaymentFailureReason.Blocked, "Client", "123456778", new PaymentProvider("id", "Provider", "", "", "", CountryCode.COUNTRY_CODE_GB, (List) null, 0.0f, false, (ProviderAvailability) null, (List) null, (List) null, 4032, (DefaultConstructorMarker) null), ResultScreen8.Payment, null, composer, 29110, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9624lambda7 = ComposableLambda3.composableLambdaInstance(936087554, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(936087554, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-7.<anonymous> (Result.kt:368)");
                }
                ResultKt.ResultFailed(PaymentFailureReason.ProviderError, "Client", "123456778", new PaymentProvider("id", "Provider", "", "", "", CountryCode.COUNTRY_CODE_GB, (List) null, 0.0f, false, (ProviderAvailability) null, (List) null, (List) null, 4032, (DefaultConstructorMarker) null), ResultScreen8.Payment, null, composer, 29110, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9625lambda8 = ComposableLambda3.composableLambdaInstance(-585046278, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-585046278, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-8.<anonymous> (Result.kt:393)");
                }
                ResultKt.ResultInProgress(Currency.Defaults.INSTANCE.getGBP(), 1000L, "123456778", "Client Name", ResultScreen8.Mandate, null, composer, 28088, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9626lambda9 = ComposableLambda3.composableLambdaInstance(-585441877, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-585441877, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-9.<anonymous> (Result.kt:410)");
                }
                ResultKt.ResultSuccess(Currency.Defaults.INSTANCE.getGBP(), 1000L, "123456778", "Client Name", new PaymentProvider("id", "Provider Name", "", "", "", CountryCode.COUNTRY_CODE_GB, (List) null, 0.0f, false, (ProviderAvailability) null, (List) null, (List) null, 4032, (DefaultConstructorMarker) null), ResultScreen8.Mandate, null, composer, 232888, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9618lambda10 = ComposableLambda3.composableLambdaInstance(-1392912699, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt$lambda-10$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1392912699, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultKt.lambda-10.<anonymous> (Result.kt:435)");
                }
                ResultKt.ResultFailed(PaymentFailureReason.Blocked, "Client", "123456778", new PaymentProvider("id", "Provider", "", "", "", CountryCode.COUNTRY_CODE_GB, (List) null, 0.0f, false, (ProviderAvailability) null, (List) null, (List) null, 4032, (DefaultConstructorMarker) null), ResultScreen8.Mandate, null, composer, 29110, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27128getLambda1$payments_ui_release() {
        return f9617lambda1;
    }

    /* renamed from: getLambda-10$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27129getLambda10$payments_ui_release() {
        return f9618lambda10;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function3<C2002Dp, Composer, Integer, Unit> m27130getLambda2$payments_ui_release() {
        return f9619lambda2;
    }

    /* renamed from: getLambda-3$payments_ui_release, reason: not valid java name */
    public final Function3<C2002Dp, Composer, Integer, Unit> m27131getLambda3$payments_ui_release() {
        return f9620lambda3;
    }

    /* renamed from: getLambda-4$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27132getLambda4$payments_ui_release() {
        return f9621lambda4;
    }

    /* renamed from: getLambda-5$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27133getLambda5$payments_ui_release() {
        return f9622lambda5;
    }

    /* renamed from: getLambda-6$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27134getLambda6$payments_ui_release() {
        return f9623lambda6;
    }

    /* renamed from: getLambda-7$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27135getLambda7$payments_ui_release() {
        return f9624lambda7;
    }

    /* renamed from: getLambda-8$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27136getLambda8$payments_ui_release() {
        return f9625lambda8;
    }

    /* renamed from: getLambda-9$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27137getLambda9$payments_ui_release() {
        return f9626lambda9;
    }
}
