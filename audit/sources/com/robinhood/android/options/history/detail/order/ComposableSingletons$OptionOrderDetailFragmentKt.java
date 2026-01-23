package com.robinhood.android.options.history.detail.order;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.history.detail.C23086R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionOrderDetailFragmentKt {
    public static final ComposableSingletons$OptionOrderDetailFragmentKt INSTANCE = new ComposableSingletons$OptionOrderDetailFragmentKt();

    /* renamed from: lambda$-729638491, reason: not valid java name */
    private static Function3<LazyGridItemScope, Composer, Integer, Unit> f9140lambda$729638491 = ComposableLambda3.composableLambdaInstance(-729638491, false, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt$lambda$-729638491$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            invoke(lazyGridItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyGridItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-729638491, i, -1, "com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt.lambda$-729638491.<anonymous> (OptionOrderDetailFragment.kt:189)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-969891323, reason: not valid java name */
    private static Function3<LazyGridItemScope, Composer, Integer, Unit> f9141lambda$969891323 = ComposableLambda3.composableLambdaInstance(-969891323, false, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt$lambda$-969891323$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            invoke(lazyGridItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyGridItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-969891323, i, -1, "com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt.lambda$-969891323.<anonymous> (OptionOrderDetailFragment.kt:281)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-305461636, reason: not valid java name */
    private static Function3<LazyGridItemScope, Composer, Integer, Unit> f9139lambda$305461636 = ComposableLambda3.composableLambdaInstance(-305461636, false, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt$lambda$-305461636$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            invoke(lazyGridItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyGridItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-305461636, i, -1, "com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt.lambda$-305461636.<anonymous> (OptionOrderDetailFragment.kt:285)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23086R.string.option_order_legs_header, composer, 0), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2109423804, reason: not valid java name */
    private static Function3<LazyGridItemScope, Composer, Integer, Unit> f9138lambda$2109423804 = ComposableLambda3.composableLambdaInstance(-2109423804, false, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt$lambda$-2109423804$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            invoke(lazyGridItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyGridItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2109423804, i, -1, "com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt.lambda$-2109423804.<anonymous> (OptionOrderDetailFragment.kt:315)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyGridItemScope, Composer, Integer, Unit> lambda$805758179 = ComposableLambda3.composableLambdaInstance(805758179, false, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt$lambda$805758179$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            invoke(lazyGridItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyGridItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(805758179, i, -1, "com.robinhood.android.options.history.detail.order.ComposableSingletons$OptionOrderDetailFragmentKt.lambda$805758179.<anonymous> (OptionOrderDetailFragment.kt:336)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2109423804$feature_options_history_detail_externalDebug */
    public final Function3<LazyGridItemScope, Composer, Integer, Unit> m2225x17015cde() {
        return f9138lambda$2109423804;
    }

    /* renamed from: getLambda$-305461636$feature_options_history_detail_externalDebug */
    public final Function3<LazyGridItemScope, Composer, Integer, Unit> m2226x3fe886f7() {
        return f9139lambda$305461636;
    }

    /* renamed from: getLambda$-729638491$feature_options_history_detail_externalDebug */
    public final Function3<LazyGridItemScope, Composer, Integer, Unit> m2227xd6fcaaca() {
        return f9140lambda$729638491;
    }

    /* renamed from: getLambda$-969891323$feature_options_history_detail_externalDebug */
    public final Function3<LazyGridItemScope, Composer, Integer, Unit> m2228x7738c5d9() {
        return f9141lambda$969891323;
    }

    public final Function3<LazyGridItemScope, Composer, Integer, Unit> getLambda$805758179$feature_options_history_detail_externalDebug() {
        return lambda$805758179;
    }
}
