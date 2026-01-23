package com.robinhood.android.notification.p202ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.notification.Loggable;
import com.robinhood.android.notification.data.ProductUpsellActionType;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProductUpsellFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.notification.ui.ProductUpsellFragment$ComposeContent$EmbeddedContent$1, reason: use source file name */
/* loaded from: classes8.dex */
final class ProductUpsellFragment2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ProductUpsellFragment this$0;

    ProductUpsellFragment2(ProductUpsellFragment productUpsellFragment) {
        this.this$0 = productUpsellFragment;
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
            ComposerKt.traceEventStart(108656875, i, -1, "com.robinhood.android.notification.ui.ProductUpsellFragment.ComposeContent.EmbeddedContent.<anonymous> (ProductUpsellFragment.kt:58)");
        }
        Screen eventScreen = this.this$0.getEventScreen();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final ProductUpsellFragment productUpsellFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.notification.ui.ProductUpsellFragment$ComposeContent$EmbeddedContent$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductUpsellFragment2.invoke$lambda$1$lambda$0(productUpsellFragment, (ProductUpsellActionType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
        final ProductUpsellFragment productUpsellFragment2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.notification.ui.ProductUpsellFragment$ComposeContent$EmbeddedContent$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProductUpsellFragment2.invoke$lambda$3$lambda$2(productUpsellFragment2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ProductUpsellScreen5.ProductUpsellScreen(null, function1, (Function0) objRememberedValue2, eventScreen, composer, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ProductUpsellFragment productUpsellFragment, ProductUpsellActionType actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        productUpsellFragment.handleCtaClick(actionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ProductUpsellFragment productUpsellFragment) {
        Loggable.debugLog("Early exit requested.");
        productUpsellFragment.close();
        return Unit.INSTANCE;
    }
}
