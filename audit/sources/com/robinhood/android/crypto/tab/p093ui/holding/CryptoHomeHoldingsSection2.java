package com.robinhood.android.crypto.tab.p093ui.holding;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
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

/* compiled from: CryptoHomeHoldingsSection.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.holding.CryptoHomeHoldingsSectionKt$cryptoHomeHoldingsSection$1$1", m3645f = "CryptoHomeHoldingsSection.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.holding.CryptoHomeHoldingsSectionKt$cryptoHomeHoldingsSection$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeHoldingsSection2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ PositionInstrumentType $positionInstrumentType;
    final /* synthetic */ Screen $screen;
    int label;

    /* compiled from: CryptoHomeHoldingsSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.tab.ui.holding.CryptoHomeHoldingsSectionKt$cryptoHomeHoldingsSection$1$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionInstrumentType.values().length];
            try {
                iArr[PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_PERPETUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeHoldingsSection2(EventLogger eventLogger, Screen screen, PositionInstrumentType positionInstrumentType, Continuation<? super CryptoHomeHoldingsSection2> continuation) {
        super(2, continuation);
        this.$eventLogger = eventLogger;
        this.$screen = screen;
        this.$positionInstrumentType = positionInstrumentType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoHomeHoldingsSection2(this.$eventLogger, this.$screen, this.$positionInstrumentType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoHomeHoldingsSection2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Component.ComponentType componentType;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventLogger eventLogger = this.$eventLogger;
        Screen screen = this.$screen;
        int i = WhenMappings.$EnumSwitchMapping$0[this.$positionInstrumentType.ordinal()];
        if (i == 1) {
            componentType = Component.ComponentType.TOKENIZED_STOCK_HOLDING_SECTION;
        } else if (i == 2) {
            componentType = Component.ComponentType.PERPETUALS_HOLDING_SECTION;
        } else {
            componentType = Component.ComponentType.HOLDING_SECTION;
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(componentType, null, null, 6, null), null, null, 25, null);
        return Unit.INSTANCE;
    }
}
