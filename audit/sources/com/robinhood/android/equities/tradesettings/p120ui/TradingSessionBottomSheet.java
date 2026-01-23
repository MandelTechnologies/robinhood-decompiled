package com.robinhood.android.equities.tradesettings.p120ui;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OrderMarketHours;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingSessionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TradingSessionBottomSheet {
    public static final TradingSessionBottomSheet INSTANCE = new TradingSessionBottomSheet();

    /* renamed from: lambda$-1547827426, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8903lambda$1547827426 = ComposableLambda3.composableLambdaInstance(-1547827426, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt$lambda$-1547827426$1
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
                ComposerKt.traceEventStart(-1547827426, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt.lambda$-1547827426.<anonymous> (TradingSessionBottomSheet.kt:82)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C14990R.string.select_trading_session_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<AnimatedContentScope, OrderMarketHours, Composer, Integer, Unit> lambda$276695385 = ComposableLambda3.composableLambdaInstance(276695385, false, new Function4<AnimatedContentScope, OrderMarketHours, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt$lambda$276695385$1

        /* compiled from: TradingSessionBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt$lambda$276695385$1$WhenMappings */
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

        public final void invoke(AnimatedContentScope AnimatedContent, OrderMarketHours orderMarketHours, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(276695385, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt.lambda$276695385.<anonymous> (TradingSessionBottomSheet.kt:115)");
            }
            int i2 = orderMarketHours != null ? WhenMappings.$EnumSwitchMapping$0[orderMarketHours.ordinal()] : -1;
            if (i2 == 1) {
                composer.startReplaceGroup(990089577);
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(StringResources_androidKt.stringResource(C14990R.string.footer_24_hour_market, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, composer, 6, 2), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composer, 196608, 448);
                composer.endReplaceGroup();
            } else if (i2 != 2) {
                composer.startReplaceGroup(991255518);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(990693705);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(StringResources_androidKt.stringResource(C14990R.string.footer_extended_hours, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, composer, 6, 2), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composer, 196608, 448);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1804804032 = ComposableLambda3.composableLambdaInstance(1804804032, false, TradingSessionBottomSheet3.INSTANCE);

    /* renamed from: getLambda$-1547827426$lib_trade_settings_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13695getLambda$1547827426$lib_trade_settings_externalDebug() {
        return f8903lambda$1547827426;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1804804032$lib_trade_settings_externalDebug() {
        return lambda$1804804032;
    }

    public final Function4<AnimatedContentScope, OrderMarketHours, Composer, Integer, Unit> getLambda$276695385$lib_trade_settings_externalDebug() {
        return lambda$276695385;
    }
}
