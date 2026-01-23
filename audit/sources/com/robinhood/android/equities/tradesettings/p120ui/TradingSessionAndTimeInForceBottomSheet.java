package com.robinhood.android.equities.tradesettings.p120ui;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p320db.OrderMarketHours;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingSessionAndTimeInForceBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TradingSessionAndTimeInForceBottomSheet {
    public static final TradingSessionAndTimeInForceBottomSheet INSTANCE = new TradingSessionAndTimeInForceBottomSheet();

    /* renamed from: lambda$-559053758, reason: not valid java name */
    private static Function4<AnimatedContentScope, OrderMarketHours, Composer, Integer, Unit> f8902lambda$559053758 = ComposableLambda3.composableLambdaInstance(-559053758, false, new Function4<AnimatedContentScope, OrderMarketHours, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt$lambda$-559053758$1

        /* compiled from: TradingSessionAndTimeInForceBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt$lambda$-559053758$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderMarketHours.values().length];
                try {
                    iArr[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, OrderMarketHours orderMarketHours, Composer composer, Integer num) {
            invoke(animatedContentScope, orderMarketHours, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, OrderMarketHours it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559053758, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt.lambda$-559053758.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:157)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(1112805712);
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, composer, 6, 2);
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(StringResources_androidKt.stringResource(C14990R.string.footer_combined_24_hour_market, composer, 0), modifierM21622defaultHorizontalPaddingWMci_g0, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21456getPositive0d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composer, 196608, 448);
                composer.endReplaceGroup();
            } else if (i2 != 2) {
                composer.startReplaceGroup(1114269005);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1113560624);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, composer, 6, 2);
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(StringResources_androidKt.stringResource(C14990R.string.footer_combined_extended_hours, composer, 0), modifierM21622defaultHorizontalPaddingWMci_g02, Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21456getPositive0d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composer, 196608, 448);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1618711466, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8900lambda$1618711466 = ComposableLambda3.composableLambdaInstance(-1618711466, false, TradingSessionAndTimeInForceBottomSheet2.INSTANCE);

    /* renamed from: lambda$-165702401, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8901lambda$165702401 = ComposableLambda3.composableLambdaInstance(-165702401, false, TradingSessionAndTimeInForceBottomSheet3.INSTANCE);

    /* renamed from: getLambda$-1618711466$lib_trade_settings_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13689getLambda$1618711466$lib_trade_settings_externalDebug() {
        return f8900lambda$1618711466;
    }

    /* renamed from: getLambda$-165702401$lib_trade_settings_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13690getLambda$165702401$lib_trade_settings_externalDebug() {
        return f8901lambda$165702401;
    }

    /* renamed from: getLambda$-559053758$lib_trade_settings_externalDebug, reason: not valid java name */
    public final Function4<AnimatedContentScope, OrderMarketHours, Composer, Integer, Unit> m13691getLambda$559053758$lib_trade_settings_externalDebug() {
        return f8902lambda$559053758;
    }
}
