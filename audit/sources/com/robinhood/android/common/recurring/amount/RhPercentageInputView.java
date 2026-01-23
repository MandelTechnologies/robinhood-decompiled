package com.robinhood.android.common.recurring.amount;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhPercentageInputView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010%\u001a\u00020\u0007H\u0016J\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*J\u001c\u0010+\u001a\u00020'*\u00020,2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0007H\u0002J\u0014\u0010/\u001a\u00020'*\u00020\u000b2\u0006\u00100\u001a\u00020\u0007H\u0002J\u0014\u00101\u001a\u00020'*\u00020\u000b2\u0006\u00102\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\"0!¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RhPercentageInputView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "percentSymbolText", "Landroid/widget/TextView;", "percentageEditText", "Landroid/widget/EditText;", "length", "getLength", "()I", "value", "", "isAmountEnabled", "()Z", "setAmountEnabled", "(Z)V", "Ljava/math/BigDecimal;", "percentage", "getPercentage", "()Ljava/math/BigDecimal;", "setPercentage", "(Ljava/math/BigDecimal;)V", "emitZeroPercentOnEmpty", "getEmitZeroPercentOnEmpty", "setEmitZeroPercentOnEmpty", "percentageObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "getPercentageObservable", "()Lio/reactivex/Observable;", "getBaseline", "requestAmountTextFocus", "", "dispatchInputKeyEvent", "event", "Landroid/view/KeyEvent;", "applyTextAppearance", "Landroid/content/res/TypedArray;", "tv", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "overrideTextAppearance", "textAppearanceId", "setMaxLength", "maxLength", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RhPercentageInputView extends LinearLayout {
    private boolean emitZeroPercentOnEmpty;
    private final TextView percentSymbolText;
    private final EditText percentageEditText;
    private final Observable<Optional<BigDecimal>> percentageObservable;
    public static final int $stable = 8;
    private static final DecimalFormat percentageFormat = new DecimalFormat("##.##");

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhPercentageInputView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhPercentageInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RhPercentageInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhPercentageInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C11595R.layout.merge_percentage_input_view, true);
        View viewFindViewById = findViewById(C11595R.id.percentage_input_view_percent_symbol);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.percentSymbolText = textView;
        View viewFindViewById2 = findViewById(C11595R.id.percentage_input_view_edit_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        EditText editText = (EditText) viewFindViewById2;
        this.percentageEditText = editText;
        int[] RhPercentageInputView = C11595R.styleable.RhPercentageInputView;
        Intrinsics.checkNotNullExpressionValue(RhPercentageInputView, "RhPercentageInputView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RhPercentageInputView, 0, 0);
        setMaxLength(editText, 3);
        applyTextAppearance(typedArrayObtainStyledAttributes, editText, C11595R.styleable.RhPercentageInputView_amountTextAppearance);
        applyTextAppearance(typedArrayObtainStyledAttributes, textView, C11595R.styleable.RhPercentageInputView_percentageTextAppearance);
        textView.setPadding(0, 0, (int) typedArrayObtainStyledAttributes.getDimension(C11595R.styleable.RhPercentageInputView_innerPadding, 0.0f), 0);
        typedArrayObtainStyledAttributes.recycle();
        Observable<Optional<BigDecimal>> observableDistinctUntilChanged = RxTextView.textChanges(editText).map(new Function() { // from class: com.robinhood.android.common.recurring.amount.RhPercentageInputView$percentageObservable$1
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(CharSequence amountText) {
                BigDecimal bigDecimalOrNull;
                Intrinsics.checkNotNullParameter(amountText, "amountText");
                if (amountText.length() == 0 && this.this$0.getEmitZeroPercentOnEmpty()) {
                    bigDecimalOrNull = BigDecimal.ZERO;
                } else {
                    bigDecimalOrNull = BigDecimals7.toBigDecimalOrNull(amountText);
                }
                return Optional3.asOptional(bigDecimalOrNull);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.percentageObservable = observableDistinctUntilChanged;
    }

    public final int getLength() {
        return this.percentageEditText.length();
    }

    public final boolean isAmountEnabled() {
        return this.percentageEditText.isEnabled();
    }

    public final void setAmountEnabled(boolean z) {
        this.percentageEditText.setEnabled(z);
    }

    public final BigDecimal getPercentage() {
        String string2;
        Editable text = this.percentageEditText.getText();
        if (text == null || (string2 = text.toString()) == null) {
            return null;
        }
        return BigDecimals7.toBigDecimalOrNull(string2);
    }

    public final void setPercentage(BigDecimal bigDecimal) {
        this.percentageEditText.setText(bigDecimal != null ? percentageFormat.format(bigDecimal) : null);
    }

    public final boolean getEmitZeroPercentOnEmpty() {
        return this.emitZeroPercentOnEmpty;
    }

    public final void setEmitZeroPercentOnEmpty(boolean z) {
        this.emitZeroPercentOnEmpty = z;
    }

    public final Observable<Optional<BigDecimal>> getPercentageObservable() {
        return this.percentageObservable;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        return this.percentageEditText.getBaseline();
    }

    public final void requestAmountTextFocus() {
        this.percentageEditText.requestFocus();
    }

    public final void dispatchInputKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.percentageEditText.dispatchKeyEvent(event);
    }

    private final void applyTextAppearance(TypedArray typedArray, TextView textView, int i) {
        Integer resourceIdOrNull = TypedArrays3.getResourceIdOrNull(typedArray, i);
        if (resourceIdOrNull != null) {
            overrideTextAppearance(textView, resourceIdOrNull.intValue());
        }
    }

    private final void overrideTextAppearance(TextView textView, int i) {
        TextViewsKt.setTextAppearanceCompat(textView, i);
        ScarletManager2.overrideAttribute(textView, R.attr.textAppearance, new DirectResourceReference(ResourceType.STYLE.INSTANCE, i));
    }

    private final void setMaxLength(TextView textView, int i) {
        textView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }
}
