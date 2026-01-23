package com.robinhood.tooltips;

import android.view.View;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.tooltips.TooltipManagerViewState;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: View.kt */
@Metadata(m3635d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"com/robinhood/tooltips/DefaultTooltipManager$addPostEffects$lambda$16$$inlined$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.tooltips.DefaultTooltipManager$addPostEffects$lambda$16$$inlined$doOnNextLayout$1 */
/* loaded from: classes12.dex */
public final class ViewOnLayoutChangeListenerC41653x96f4af45 implements View.OnLayoutChangeListener {
    final /* synthetic */ TooltipData $data$inlined;
    final /* synthetic */ RdsTooltipView $this_addPostEffects$inlined;
    final /* synthetic */ DefaultTooltipManager this$0;

    public ViewOnLayoutChangeListenerC41653x96f4af45(DefaultTooltipManager defaultTooltipManager, RdsTooltipView rdsTooltipView, TooltipData tooltipData) {
        this.this$0 = defaultTooltipManager;
        this.$this_addPostEffects$inlined = rdsTooltipView;
        this.$data$inlined = tooltipData;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(final View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.removeOnLayoutChangeListener(this);
        final DefaultTooltipManager defaultTooltipManager = this.this$0;
        final RdsTooltipView rdsTooltipView = this.$this_addPostEffects$inlined;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.robinhood.tooltips.DefaultTooltipManager$addPostEffects$1$1$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                defaultTooltipManager.getNib(rdsTooltipView).setVisibility(0);
            }
        };
        final DefaultTooltipManager defaultTooltipManager2 = this.this$0;
        final RdsTooltipView rdsTooltipView2 = this.$this_addPostEffects$inlined;
        final TooltipData tooltipData = this.$data$inlined;
        defaultTooltipManager.animateAppear(rdsTooltipView, function0, new Function0<Unit>() { // from class: com.robinhood.tooltips.DefaultTooltipManager$addPostEffects$1$1$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                defaultTooltipManager2.positionNib(rdsTooltipView2, tooltipData);
                rdsTooltipView2.requestLayout();
                defaultTooltipManager2.callOnDisplay(tooltipData, view);
                defaultTooltipManager2.getDuxo().updateTooltipStatus(tooltipData.getId(), TooltipManagerViewState.Status.DISPLAYED);
                final View view2 = view;
                final TooltipData tooltipData2 = tooltipData;
                final DefaultTooltipManager defaultTooltipManager3 = defaultTooltipManager2;
                if (!view2.isAttachedToWindow()) {
                    view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$addPostEffects$1$1$2$invoke$$inlined$doOnAttach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view3) {
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view3) {
                            view2.removeOnAttachStateChangeListener(this);
                            if (tooltipData2.getBehavior().getDisplayTime() != null) {
                                Observable observableDelay = Observable.just(tooltipData2).delay(tooltipData2.getBehavior().getDisplayTime().longValue(), TimeUnit.MILLISECONDS);
                                Intrinsics.checkNotNullExpressionValue(observableDelay, "delay(...)");
                                ViewDisposerKt.bindTo$default(observableDelay, view3, false, 2, null).subscribeKotlin(new DefaultTooltipManager4(defaultTooltipManager3));
                            }
                        }
                    });
                } else if (tooltipData2.getBehavior().getDisplayTime() != null) {
                    Observable observableDelay = Observable.just(tooltipData2).delay(tooltipData2.getBehavior().getDisplayTime().longValue(), TimeUnit.MILLISECONDS);
                    Intrinsics.checkNotNullExpressionValue(observableDelay, "delay(...)");
                    ViewDisposerKt.bindTo$default(observableDelay, view2, false, 2, null).subscribeKotlin(new DefaultTooltipManager4(defaultTooltipManager3));
                }
            }
        });
    }
}
