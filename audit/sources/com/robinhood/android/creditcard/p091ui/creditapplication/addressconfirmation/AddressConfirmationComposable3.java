package com.robinhood.android.creditcard.p091ui.creditapplication.addressconfirmation;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AddressConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.ComposableSingletons$AddressConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AddressConfirmationComposable3 {
    public static final AddressConfirmationComposable3 INSTANCE = new AddressConfirmationComposable3();
    private static Function2<Composer, Integer, Unit> lambda$1701846933 = ComposableLambda3.composableLambdaInstance(1701846933, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.ComposableSingletons$AddressConfirmationComposableKt$lambda$1701846933$1
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
                ComposerKt.traceEventStart(1701846933, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.ComposableSingletons$AddressConfirmationComposableKt.lambda$1701846933.<anonymous> (AddressConfirmationComposable.kt:220)");
            }
            BentoText2.m20747BentoText38GnDrw("Address Line 1", ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, true, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 24582, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-569620812, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8756lambda$569620812 = ComposableLambda3.composableLambdaInstance(-569620812, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.ComposableSingletons$AddressConfirmationComposableKt$lambda$-569620812$1
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
                ComposerKt.traceEventStart(-569620812, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.ComposableSingletons$AddressConfirmationComposableKt.lambda$-569620812.<anonymous> (AddressConfirmationComposable.kt:228)");
            }
            BentoText2.m20747BentoText38GnDrw("Address Line 2", ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 6, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-817589006, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8757lambda$817589006 = ComposableLambda3.composableLambdaInstance(-817589006, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.ComposableSingletons$AddressConfirmationComposableKt$lambda$-817589006$1
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
                ComposerKt.traceEventStart(-817589006, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.ComposableSingletons$AddressConfirmationComposableKt.lambda$-817589006.<anonymous> (AddressConfirmationComposable.kt:235)");
            }
            BentoRadioButton2.BentoRadioButton(true, ModifiersKt.bentoCirclePlaceholder(Modifier.INSTANCE, true), true, composer, 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-569620812$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12661getLambda$569620812$feature_credit_card_externalDebug() {
        return f8756lambda$569620812;
    }

    /* renamed from: getLambda$-817589006$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12662getLambda$817589006$feature_credit_card_externalDebug() {
        return f8757lambda$817589006;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1701846933$feature_credit_card_externalDebug() {
        return lambda$1701846933;
    }
}
