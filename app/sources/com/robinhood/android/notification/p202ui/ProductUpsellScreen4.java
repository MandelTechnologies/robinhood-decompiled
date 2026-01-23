package com.robinhood.android.notification.p202ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.notification.data.ProductUpsellActionType;
import com.robinhood.android.notification.data.ProductUpsellViewData;
import com.robinhood.android.notification.data.ProductUpsellViewState;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProductUpsellScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.notification.ui.ComposableSingletons$ProductUpsellScreenKt$lambda$1596150525$1, reason: use source file name */
/* loaded from: classes8.dex */
final class ProductUpsellScreen4 implements Function2<Composer, Integer, Unit> {
    public static final ProductUpsellScreen4 INSTANCE = new ProductUpsellScreen4();

    ProductUpsellScreen4() {
    }

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
            ComposerKt.traceEventStart(1596150525, i, -1, "com.robinhood.android.notification.ui.ComposableSingletons$ProductUpsellScreenKt.lambda$1596150525.<anonymous> (ProductUpsellScreen.kt:324)");
        }
        ColorScheme colorSchemeDetermineColorScheme = ProductUpsellScreen5.determineColorScheme(false, composer, 6, 0);
        ProductUpsellViewState.ContentReady contentReady = new ProductUpsellViewState.ContentReady(new ProductUpsellViewData("Stay up to date with notifications", "Get important updates, like order confirmations and alerts when your stock's price moves significantly. You're in control - customize which ones you see", "https://cdn.robinhood.com/static_content/5ft2qdzfrz9o/en-US/assets/files/2osy1xAh913PwrO5N2bRk5_1_optin-crypto-trade.png", null, "", "Enable notifications", ProductUpsellActionType.REQUEST_NOTIFICATION_PERMISSION, "", "Maybe later", ProductUpsellActionType.DISMISS, ""));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.notification.ui.ComposableSingletons$ProductUpsellScreenKt$lambda$1596150525$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductUpsellScreen4.invoke$lambda$1$lambda$0((ProductUpsellViewData) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.notification.ui.ComposableSingletons$ProductUpsellScreenKt$lambda$1596150525$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductUpsellScreen4.invoke$lambda$3$lambda$2((ProductUpsellViewData) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ProductUpsellScreen5.MainContent(null, colorSchemeDetermineColorScheme, contentReady, function1, (Function1) objRememberedValue2, new Screen(Screen.Name.PRODUCT_UPSELL, null, null, null, 14, null), composer, 27648, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ProductUpsellViewData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ProductUpsellViewData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
