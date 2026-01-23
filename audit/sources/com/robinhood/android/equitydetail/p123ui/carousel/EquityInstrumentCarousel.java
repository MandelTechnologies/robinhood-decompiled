package com.robinhood.android.equitydetail.p123ui.carousel;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.carousel.InstrumentCard;
import com.robinhood.android.carousel.InstrumentCarousel;
import com.robinhood.android.equitydetail.p123ui.carousel.EquityInstrumentCard;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityInstrumentCarousel.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCarousel;", "Lcom/robinhood/android/carousel/InstrumentCarousel;", "Ljava/util/UUID;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard$Callbacks;)V", "createInstrumentCard", "Lcom/robinhood/android/carousel/InstrumentCard;", "cardButtonGroupTitle", "", "cardButtonTitle", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityInstrumentCarousel extends InstrumentCarousel<UUID> {
    public static final int $stable = 8;
    private EquityInstrumentCard.Callbacks callbacks;

    public /* synthetic */ EquityInstrumentCarousel(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityInstrumentCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final EquityInstrumentCard.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(EquityInstrumentCard.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.android.carousel.InstrumentCarousel
    public InstrumentCard<UUID> createInstrumentCard(Context context, String cardButtonGroupTitle, String cardButtonTitle) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new EquityInstrumentCard(context, cardButtonGroupTitle, cardButtonTitle, this.callbacks);
    }
}
