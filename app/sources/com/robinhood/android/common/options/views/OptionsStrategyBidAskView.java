package com.robinhood.android.common.options.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.databinding.MergeOptionStrategyBidAskViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: OptionsStrategyBidAskView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J,\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/options/views/OptionsStrategyBidAskView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/db/OptionQuote;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindings", "Lcom/robinhood/android/common/options/databinding/MergeOptionStrategyBidAskViewBinding;", "getBindings", "()Lcom/robinhood/android/common/options/databinding/MergeOptionStrategyBidAskViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bidAnimator", "Landroid/animation/ValueAnimator;", "askAnimator", "bind", "", "state", "getBlockHeightAnimator", "block", "Landroid/view/View;", "placeholder", "percentage", "", "spreadAnimator", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionsStrategyBidAskView extends ConstraintLayout implements Bindable<OptionQuote> {
    public static final float MINIMUM_BLOCK_HEIGHT_PERCENTAGE = 0.05f;
    public static final long SPREAD_ANIMATION_DURATION_MS = 200;
    private ValueAnimator askAnimator;
    private ValueAnimator bidAnimator;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionsStrategyBidAskView.class, "bindings", "getBindings()Lcom/robinhood/android/common/options/databinding/MergeOptionStrategyBidAskViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ OptionsStrategyBidAskView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsStrategyBidAskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C11303R.layout.merge_option_strategy_bid_ask_view, true);
        this.bindings = ViewBinding5.viewBinding(this, OptionsStrategyBidAskView2.INSTANCE);
    }

    private final MergeOptionStrategyBidAskViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionStrategyBidAskViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(OptionQuote state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Integer bidSize = state.getBidSize();
        BigDecimal bigDecimal = new BigDecimal(bidSize != null ? bidSize.intValue() : 0);
        Integer askSize = state.getAskSize();
        BigDecimal bigDecimal2 = new BigDecimal(askSize != null ? askSize.intValue() : 0);
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        MergeOptionStrategyBidAskViewBinding bindings = getBindings();
        bindings.bidPrice.setText(Formats.getPriceFormat().format(state.getBidPrice().getUnsignedValue()));
        bindings.bidSize.setText(getResources().getString(C11303R.string.option_detail_quote_size, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getShareQuantityFormat(), bigDecimal, null, 2, null)));
        View bidBlock = bindings.bidBlock;
        Intrinsics.checkNotNullExpressionValue(bidBlock, "bidBlock");
        Space bidBlockPlaceholder = bindings.bidBlockPlaceholder;
        Intrinsics.checkNotNullExpressionValue(bidBlockPlaceholder, "bidBlockPlaceholder");
        this.bidAnimator = getBlockHeightAnimator(bidBlock, bidBlockPlaceholder, BigDecimals7.safeDivide(bigDecimal, bigDecimalAdd).floatValue(), this.bidAnimator);
        bindings.askPrice.setText(Formats.getPriceFormat().format(state.getAskPrice().getUnsignedValue()));
        bindings.askSize.setText(getResources().getString(C11303R.string.option_detail_quote_size, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getShareQuantityFormat(), bigDecimal2, null, 2, null)));
        View askBlock = bindings.askBlock;
        Intrinsics.checkNotNullExpressionValue(askBlock, "askBlock");
        Space askBlockPlaceholder = bindings.askBlockPlaceholder;
        Intrinsics.checkNotNullExpressionValue(askBlockPlaceholder, "askBlockPlaceholder");
        this.askAnimator = getBlockHeightAnimator(askBlock, askBlockPlaceholder, BigDecimals7.safeDivide(bigDecimal2, bigDecimalAdd).floatValue(), this.askAnimator);
    }

    private final ValueAnimator getBlockHeightAnimator(final View block, final View placeholder, float percentage, ValueAnimator spreadAnimator) {
        float fCoerceAtLeast = RangesKt.coerceAtLeast(percentage, 0.05f);
        ViewGroup.LayoutParams layoutParams = block.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        final ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = placeholder.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        final ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        if (layoutParams2.verticalWeight == fCoerceAtLeast) {
            return spreadAnimator;
        }
        if (spreadAnimator != null) {
            spreadAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(RangesKt.coerceAtLeast(layoutParams2.verticalWeight, 0.05f), fCoerceAtLeast);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.common.options.views.OptionsStrategyBidAskView$getBlockHeightAnimator$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                ConstraintLayout.LayoutParams layoutParams5 = layoutParams2;
                layoutParams5.verticalWeight = fFloatValue;
                layoutParams4.verticalWeight = 1.0f - fFloatValue;
                block.setLayoutParams(layoutParams5);
                placeholder.setLayoutParams(layoutParams4);
            }
        });
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    /* compiled from: OptionsStrategyBidAskView.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/options/views/OptionsStrategyBidAskView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/options/views/OptionsStrategyBidAskView;", "<init>", "()V", "MINIMUM_BLOCK_HEIGHT_PERCENTAGE", "", "SPREAD_ANIMATION_DURATION_MS", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionsStrategyBidAskView> {
        private final /* synthetic */ Inflater<OptionsStrategyBidAskView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionsStrategyBidAskView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionsStrategyBidAskView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11303R.layout.include_option_strategy_bid_ask_view);
        }
    }
}
