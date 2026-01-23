package com.robinhood.tooltips;

import android.view.View;
import com.robinhood.disposer.ViewDisposerKt;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: View.kt */
@Metadata(m3635d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"com/robinhood/tooltips/DefaultTooltipManager$reposition$lambda$14$$inlined$doOnAttach$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DefaultTooltipManager$reposition$lambda$14$$inlined$doOnAttach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ TooltipData $data$inlined;
    final /* synthetic */ View $this_doOnAttach;
    final /* synthetic */ DefaultTooltipManager this$0;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    public DefaultTooltipManager$reposition$lambda$14$$inlined$doOnAttach$1(View view, TooltipData tooltipData, DefaultTooltipManager defaultTooltipManager) {
        this.$this_doOnAttach = view;
        this.$data$inlined = tooltipData;
        this.this$0 = defaultTooltipManager;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.$this_doOnAttach.removeOnAttachStateChangeListener(this);
        if (this.$data$inlined.getBehavior().getDisplayTime() != null) {
            Observable observableDelay = Observable.just(this.$data$inlined).delay(this.$data$inlined.getBehavior().getDisplayTime().longValue(), TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNullExpressionValue(observableDelay, "delay(...)");
            ViewDisposerKt.bindTo$default(observableDelay, view, false, 2, null).subscribeKotlin(new DefaultTooltipManager5(this.this$0));
        }
    }
}
