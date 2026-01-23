package com.robinhood.android.common.search.p087ui;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.carousel.InstrumentCard;
import com.robinhood.android.carousel.InstrumentCarousel;
import com.robinhood.android.common.search.p087ui.RecurringCard;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringCarousel.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/RecurringCarousel;", "Lcom/robinhood/android/carousel/InstrumentCarousel;", "Ljava/util/UUID;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/common/search/ui/RecurringCard$Callbacks;", "createInstrumentCard", "Lcom/robinhood/android/common/search/ui/RecurringCard;", "cardButtonGroupTitle", "", "cardButtonTitle", "setCallbacks", "", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringCarousel extends InstrumentCarousel<UUID> {
    public static final int $stable = 8;
    private RecurringCard.Callbacks callbacks;

    public /* synthetic */ RecurringCarousel(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.carousel.InstrumentCarousel
    public InstrumentCard<UUID> createInstrumentCard(Context context, String cardButtonGroupTitle, String cardButtonTitle) {
        Intrinsics.checkNotNullParameter(context, "context");
        RecurringCard.Callbacks callbacks = this.callbacks;
        if (callbacks == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callbacks");
            callbacks = null;
        }
        return new RecurringCard(context, cardButtonGroupTitle, cardButtonTitle, callbacks);
    }

    public final void setCallbacks(RecurringCard.Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }
}
