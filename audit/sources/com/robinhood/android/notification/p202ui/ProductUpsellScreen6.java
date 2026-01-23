package com.robinhood.android.notification.p202ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.notification.data.ProductUpsellViewData;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProductUpsellScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.notification.ui.ProductUpsellScreenKt$CallToActionContent$1$1", m3645f = "ProductUpsellScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.notification.ui.ProductUpsellScreenKt$CallToActionContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class ProductUpsellScreen6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ ProductUpsellViewData $productUpsell;
    final /* synthetic */ Screen $screen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductUpsellScreen6(EventLogger eventLogger, Screen screen, ProductUpsellViewData productUpsellViewData, Continuation<? super ProductUpsellScreen6> continuation) {
        super(2, continuation);
        this.$eventLogger = eventLogger;
        this.$screen = screen;
        this.$productUpsell = productUpsellViewData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductUpsellScreen6(this.$eventLogger, this.$screen, this.$productUpsell, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProductUpsellScreen6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventLogger eventLogger = this.$eventLogger;
        Screen screen = this.$screen;
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(componentType, this.$productUpsell.getPrimaryCtaIdentifier(), null, 4, null), null, null, 25, null);
        String secondaryCtaIdentifier = this.$productUpsell.getSecondaryCtaIdentifier();
        if (secondaryCtaIdentifier != null) {
            EventLogger.DefaultImpls.logAppear$default(this.$eventLogger, null, this.$screen, new Component(componentType, secondaryCtaIdentifier, null, 4, null), null, null, 25, null);
        }
        return Unit.INSTANCE;
    }
}
