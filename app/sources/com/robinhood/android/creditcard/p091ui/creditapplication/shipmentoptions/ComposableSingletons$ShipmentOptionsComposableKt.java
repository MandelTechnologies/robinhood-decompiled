package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ShipmentOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$ShipmentOptionsComposableKt {
    public static final ComposableSingletons$ShipmentOptionsComposableKt INSTANCE = new ComposableSingletons$ShipmentOptionsComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$2046368560 = ComposableLambda3.composableLambdaInstance(2046368560, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ComposableSingletons$ShipmentOptionsComposableKt$lambda$2046368560$1
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
                ComposerKt.traceEventStart(2046368560, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ComposableSingletons$ShipmentOptionsComposableKt.lambda$2046368560.<anonymous> (ShipmentOptionsComposable.kt:204)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_options_different_address, composer, 0), modifierM5144paddingVpY3zN4$default, null, null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 221184, 0, 8140);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1645115425, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8798lambda$1645115425 = ComposableLambda3.composableLambdaInstance(-1645115425, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ComposableSingletons$ShipmentOptionsComposableKt$lambda$-1645115425$1
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
                ComposerKt.traceEventStart(-1645115425, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ComposableSingletons$ShipmentOptionsComposableKt.lambda$-1645115425.<anonymous> (ShipmentOptionsComposable.kt:383)");
            }
            BentoText2.m20747BentoText38GnDrw("Option Line 1", ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 6, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-845540896, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8799lambda$845540896 = ComposableLambda3.composableLambdaInstance(-845540896, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ComposableSingletons$ShipmentOptionsComposableKt$lambda$-845540896$1
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
                ComposerKt.traceEventStart(-845540896, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ComposableSingletons$ShipmentOptionsComposableKt.lambda$-845540896.<anonymous> (ShipmentOptionsComposable.kt:390)");
            }
            BentoText2.m20747BentoText38GnDrw("Option Line 2", ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 6, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$753608162 = ComposableLambda3.composableLambdaInstance(753608162, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ComposableSingletons$ShipmentOptionsComposableKt$lambda$753608162$1
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
                ComposerKt.traceEventStart(753608162, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ComposableSingletons$ShipmentOptionsComposableKt.lambda$753608162.<anonymous> (ShipmentOptionsComposable.kt:397)");
            }
            BentoRadioButton2.BentoRadioButton(true, ModifiersKt.bentoCirclePlaceholder(Modifier.INSTANCE, true), true, composer, 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1645115425$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12811getLambda$1645115425$feature_credit_card_externalDebug() {
        return f8798lambda$1645115425;
    }

    /* renamed from: getLambda$-845540896$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12812getLambda$845540896$feature_credit_card_externalDebug() {
        return f8799lambda$845540896;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2046368560$feature_credit_card_externalDebug() {
        return lambda$2046368560;
    }

    public final Function2<Composer, Integer, Unit> getLambda$753608162$feature_credit_card_externalDebug() {
        return lambda$753608162;
    }
}
