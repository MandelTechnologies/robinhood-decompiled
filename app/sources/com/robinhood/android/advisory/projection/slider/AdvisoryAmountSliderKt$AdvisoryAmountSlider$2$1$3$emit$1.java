package com.robinhood.android.advisory.projection.slider;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3", m3645f = "AdvisoryAmountSlider.kt", m3646l = {97}, m3647m = "emit")
/* loaded from: classes7.dex */
final class AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1.C92923<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1(AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1.C92923<? super T> c92923, Continuation<? super AdvisoryAmountSliderKt$AdvisoryAmountSlider$2$1$3$emit$1> continuation) {
        super(continuation);
        this.this$0 = c92923;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((List<? extends LazyListItemInfo>) null, (Continuation<? super Unit>) this);
    }
}
