package com.robinhood.android.common.p088ui.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.CurrencyTextWatcher;
import com.robinhood.android.common.util.DecimalLimitTextWatcher;
import com.robinhood.android.lib.formats.DefaultNumberFormatter;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.util.CurrencyContext2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RhMoneyInputView.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u00101\u001a\u00020\u0007H\u0016J\u0017\u0010>\u001a\u00020?2\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010)J\u000e\u0010I\u001a\u00020?2\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020?J\u0006\u0010M\u001a\u00020?J\u000e\u0010N\u001a\u00020?2\u0006\u0010O\u001a\u00020PJ\u000e\u0010Q\u001a\u00020?2\u0006\u0010R\u001a\u00020\u0007J\u0006\u0010S\u001a\u00020?J\u0016\u0010T\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020?0VH\u0007J\u0010\u0010W\u001a\u00020?2\u0006\u0010.\u001a\u00020-H\u0002J\b\u0010X\u001a\u00020?H\u0002J\u000e\u0010Y\u001a\u0004\u0018\u00010;*\u00020 H\u0002J\u000e\u0010Z\u001a\u00020?2\u0006\u00102\u001a\u00020[J\u0014\u0010\\\u001a\u00020?2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^J'\u0010`\u001a\u00020?2\u0006\u0010a\u001a\u00020 2\u0012\u0010b\u001a\n\u0012\u0006\b\u0001\u0012\u00020[0c\"\u00020[¢\u0006\u0002\u0010dJ\u001c\u0010e\u001a\u00020?*\u00020f2\u0006\u0010g\u001a\u00020\r2\u0006\u0010R\u001a\u00020\u0007H\u0002J\u0014\u0010h\u001a\u00020?*\u00020\r2\u0006\u0010i\u001a\u00020\u0007H\u0002J\u0014\u0010j\u001a\u00020?*\u00020\r2\u0006\u0010k\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\"\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0016\u001a\u0004\u0018\u00010 @BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001e\u0010.\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020-@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b/\u00100R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:09¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R(\u0010A\u001a\u0004\u0018\u00010;2\b\u0010\u0016\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010F\u001a\u0004\u0018\u00010;2\b\u0010\u0016\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010E¨\u0006l"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/RhMoneyInputView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "numberFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "frontSymbolText", "Landroid/widget/TextView;", "rearSymbolText", "amountEditText", "Landroid/widget/EditText;", "length", "getLength", "()I", "selectionEnd", "getSelectionEnd", "value", "", "isAmountEnabled", "()Z", "setAmountEnabled", "(Z)V", "isSymbolEnabled", "setSymbolEnabled", "hintOverride", "Ljava/lang/Integer;", "", "hintString", "setHintString", "(Ljava/lang/String;)V", "hintNumberFormatter", "hintMaximumFractionDigits", "getHintMaximumFractionDigits", "()Ljava/lang/Integer;", "setHintMaximumFractionDigits", "(Ljava/lang/Integer;)V", "maximumFractionDigits", "getMaximumFractionDigits", "setMaximumFractionDigits", "Ljava/util/Currency;", "currency", "setCurrency", "(Ljava/util/Currency;)V", "getBaseline", "textWatcher", "Lcom/robinhood/android/common/util/DecimalLimitTextWatcher;", "hasFrontSymbol", "emitZeroAmountOnEmpty", "getEmitZeroAmountOnEmpty", "setEmitZeroAmountOnEmpty", "amountObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/util/Money;", "getAmountObservable", "()Lio/reactivex/Observable;", "updateHintOverride", "", "stringRes", "hint", "getHint", "()Lcom/robinhood/models/util/Money;", "setHint", "(Lcom/robinhood/models/util/Money;)V", "amount", "getAmount", "setAmount", "setAccessibilityLabel", "labelView", "Landroid/view/View;", "requestInputFocus", "clearInputFocus", "dispatchInputKeyEvent", "event", "Landroid/view/KeyEvent;", "setSelection", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "requestAmountTextFocus", "setOnAmountTouchListener", "f", "Lkotlin/Function0;", "resetCurrency", "refreshEditTextHint", "toMoneyOrNull", "addAmountTextChangedListener", "Landroid/text/TextWatcher;", "overrideAmountHintTextColor", "colorResourceReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Landroid/content/res/ColorStateList;", "overrideAmountText", "text", "ignorableTextWatchers", "", "(Ljava/lang/String;[Landroid/text/TextWatcher;)V", "applyTextAppearance", "Landroid/content/res/TypedArray;", "tv", "overrideTextAppearance", "textAppearanceId", "setMaxLength", "maxLength", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RhMoneyInputView extends LinearLayout {
    public static final int $stable = 8;
    private final EditText amountEditText;
    private final Observable<Optional<Money>> amountObservable;
    private Currency currency;
    private boolean emitZeroAmountOnEmpty;
    private final TextView frontSymbolText;
    private final boolean hasFrontSymbol;
    private Integer hintMaximumFractionDigits;
    private NumberFormatter hintNumberFormatter;
    private Integer hintOverride;
    private String hintString;
    private Integer maximumFractionDigits;
    private final NumberFormatter numberFormatter;
    private final TextView rearSymbolText;
    private DecimalLimitTextWatcher textWatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhMoneyInputView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhMoneyInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RhMoneyInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhMoneyInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zContains$default = true;
        ViewGroups.inflate(this, C11048R.layout.merge_money_input_view, true);
        View viewFindViewById = findViewById(C11048R.id.money_input_view_front_symbol);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.frontSymbolText = textView;
        View viewFindViewById2 = findViewById(C11048R.id.money_input_view_rear_symbol);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.rearSymbolText = textView2;
        View viewFindViewById3 = findViewById(C11048R.id.money_input_view_edit_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        EditText editText = (EditText) viewFindViewById3;
        this.amountEditText = editText;
        this.currency = Currencies.USD;
        Locale locale = Locale.US;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setGroupingUsed(true);
        if (numberInstance instanceof DecimalFormat) {
            ((DecimalFormat) numberInstance).setParseBigDecimal(true);
        }
        Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
        this.numberFormatter = new DefaultNumberFormatter(numberInstance);
        NumberFormat numberInstance2 = NumberFormat.getNumberInstance(locale);
        numberInstance2.setGroupingUsed(false);
        Integer num = this.hintMaximumFractionDigits;
        if (num != null) {
            numberInstance2.setMaximumFractionDigits(num.intValue());
        }
        if (numberInstance2 instanceof DecimalFormat) {
            ((DecimalFormat) numberInstance2).setParseBigDecimal(true);
        }
        Intrinsics.checkNotNullExpressionValue(numberInstance2, "apply(...)");
        this.hintNumberFormatter = new DefaultNumberFormatter(numberInstance2);
        int[] RhMoneyInputView = C11048R.styleable.RhMoneyInputView;
        Intrinsics.checkNotNullExpressionValue(RhMoneyInputView, "RhMoneyInputView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RhMoneyInputView, 0, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(C11048R.styleable.RhMoneyInputView_amountMaxLength, -1);
        if (integer != -1) {
            setMaxLength(editText, integer);
        }
        this.hintOverride = TypedArrays3.getResourceIdOrNull(typedArrayObtainStyledAttributes, C11048R.styleable.RhMoneyInputView_amountTextHint);
        setHintMaximumFractionDigits(TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C11048R.styleable.RhMoneyInputView_hintMaximumFractionDigits));
        applyTextAppearance(typedArrayObtainStyledAttributes, editText, C11048R.styleable.RhMoneyInputView_amountTextAppearance);
        applyTextAppearance(typedArrayObtainStyledAttributes, textView, C11048R.styleable.RhMoneyInputView_currencyTextAppearance);
        applyTextAppearance(typedArrayObtainStyledAttributes, textView2, C11048R.styleable.RhMoneyInputView_currencyTextAppearance);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.RhMoneyInputView_innerPadding, 0.0f);
        textView.setPadding(0, 0, dimension, 0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView$3$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.this$0.requestInputFocus();
            }
        });
        textView2.setPadding(dimension, 0, dimension, 0);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView$3$2$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.this$0.requestInputFocus();
            }
        });
        typedArrayObtainStyledAttributes.recycle();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        Currency currency = this.currency;
        if (currencyInstance instanceof DecimalFormat) {
            String positivePrefix = ((DecimalFormat) currencyInstance).getPositivePrefix();
            Intrinsics.checkNotNullExpressionValue(positivePrefix, "getPositivePrefix(...)");
            String symbol = currency.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            zContains$default = StringsKt.contains$default((CharSequence) positivePrefix, (CharSequence) symbol, false, 2, (Object) null);
        }
        this.hasFrontSymbol = zContains$default;
        textView.setVisibility(zContains$default ? 0 : 8);
        textView2.setVisibility(zContains$default ? 8 : 0);
        resetCurrency(this.currency);
        Integer num2 = this.hintOverride;
        if (num2 != null) {
            Intrinsics.checkNotNull(num2);
            setHintString(ViewsKt.getString(this, num2.intValue()));
        }
        Observable<Optional<Money>> observableDoOnNext = RxTextView.textChanges(editText).map(new Function() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView$amountObservable$1
            @Override // io.reactivex.functions.Function
            public final Optional<Money> apply(CharSequence amountText) {
                Money moneyOrNull;
                Intrinsics.checkNotNullParameter(amountText, "amountText");
                if (amountText.length() != 0 || !this.this$0.getEmitZeroAmountOnEmpty()) {
                    moneyOrNull = this.this$0.toMoneyOrNull(amountText.toString());
                } else {
                    BigDecimal ZERO = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    moneyOrNull = Money3.toMoney(ZERO, Currencies.USD);
                }
                return Optional3.asOptional(moneyOrNull);
            }
        }).distinctUntilChanged().doOnNext(new Consumer() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView$amountObservable$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Money> optional) {
                Money moneyComponent1 = optional.component1();
                if (this.this$0.hintOverride != null) {
                    (this.this$0.hasFrontSymbol ? this.this$0.frontSymbolText : this.this$0.rearSymbolText).setVisibility(moneyComponent1 != null && !moneyComponent1.isZero() ? 0 : 8);
                }
                this.this$0.refreshEditTextHint();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        this.amountObservable = observableDoOnNext;
        setHint(CurrencyContext2.getZero(this.currency));
        ViewCompat.setAccessibilityDelegate(editText, new AccessibilityDelegateCompat() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView.4
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                String str;
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                String string2 = RhMoneyInputView.this.amountEditText.getText().toString();
                RhMoneyInputView rhMoneyInputView = RhMoneyInputView.this;
                if (StringsKt.isBlank(string2) && (string2 = rhMoneyInputView.hintString) == null) {
                    string2 = "";
                }
                if (RhMoneyInputView.this.hasFrontSymbol) {
                    str = ((Object) RhMoneyInputView.this.frontSymbolText.getText()) + string2;
                } else {
                    str = string2 + ((Object) RhMoneyInputView.this.rearSymbolText.getText());
                }
                info.setText(str);
            }
        });
    }

    public final int getLength() {
        return this.amountEditText.length();
    }

    public final int getSelectionEnd() {
        return this.amountEditText.getSelectionEnd();
    }

    public final boolean isAmountEnabled() {
        return this.amountEditText.isEnabled();
    }

    public final void setAmountEnabled(boolean z) {
        this.amountEditText.setEnabled(z);
    }

    public final boolean isSymbolEnabled() {
        return this.frontSymbolText.isEnabled();
    }

    public final void setSymbolEnabled(boolean z) {
        this.frontSymbolText.setEnabled(z);
        this.rearSymbolText.setEnabled(z);
    }

    private final void setHintString(String str) {
        this.hintString = str;
        refreshEditTextHint();
    }

    public final Integer getHintMaximumFractionDigits() {
        return this.hintMaximumFractionDigits;
    }

    public final void setHintMaximumFractionDigits(Integer num) {
        if (Intrinsics.areEqual(this.hintMaximumFractionDigits, num)) {
            return;
        }
        this.hintMaximumFractionDigits = num;
        resetCurrency(this.currency);
    }

    public final Integer getMaximumFractionDigits() {
        return this.maximumFractionDigits;
    }

    public final void setMaximumFractionDigits(Integer num) {
        if (Intrinsics.areEqual(this.maximumFractionDigits, num)) {
            return;
        }
        this.maximumFractionDigits = num;
        resetCurrency(this.currency);
    }

    private final void setCurrency(Currency currency) {
        if (Intrinsics.areEqual(this.currency, currency)) {
            return;
        }
        this.currency = currency;
        resetCurrency(currency);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        return this.amountEditText.getBaseline();
    }

    public final boolean getEmitZeroAmountOnEmpty() {
        return this.emitZeroAmountOnEmpty;
    }

    public final void setEmitZeroAmountOnEmpty(boolean z) {
        this.emitZeroAmountOnEmpty = z;
    }

    public final Observable<Optional<Money>> getAmountObservable() {
        return this.amountObservable;
    }

    public final void updateHintOverride(Integer stringRes) {
        if (Intrinsics.areEqual(this.hintOverride, stringRes)) {
            return;
        }
        this.hintOverride = stringRes;
        TextView textView = this.hasFrontSymbol ? this.frontSymbolText : this.rearSymbolText;
        if (stringRes == null) {
            setHint(getHint());
            textView.setVisibility(0);
        } else {
            Money amount = getAmount();
            textView.setVisibility(amount != null && !amount.isZero() ? 0 : 8);
            setHintString(ViewsKt.getString(this, stringRes.intValue()));
        }
    }

    public final Money getHint() {
        CharSequence hint = this.amountEditText.getHint();
        String string2 = hint != null ? hint.toString() : null;
        if (string2 != null) {
            return toMoneyOrNull(string2);
        }
        return null;
    }

    public final void setHint(Money money) {
        BigDecimal decimalValue;
        Currency currency;
        if (money != null && (currency = money.getCurrency()) != null) {
            setCurrency(currency);
        }
        if (this.hintOverride != null || money == null || (decimalValue = money.getDecimalValue()) == null) {
            return;
        }
        setHintString(this.hintNumberFormatter.format(decimalValue));
    }

    public final Money getAmount() {
        Editable text = this.amountEditText.getText();
        String string2 = text != null ? text.toString() : null;
        if (string2 != null) {
            return toMoneyOrNull(string2);
        }
        return null;
    }

    public final void setAmount(Money money) {
        BigDecimal decimalValue;
        Currency currency;
        if (money != null && (currency = money.getCurrency()) != null) {
            setCurrency(currency);
        }
        this.amountEditText.setText((money == null || (decimalValue = money.getDecimalValue()) == null) ? null : this.numberFormatter.format(decimalValue));
        EditText editText = this.amountEditText;
        editText.setSelection(editText.getText().length());
    }

    public final void setAccessibilityLabel(View labelView) {
        Intrinsics.checkNotNullParameter(labelView, "labelView");
        labelView.setLabelFor(C11048R.id.money_input_view_edit_text);
    }

    public final void requestInputFocus() {
        this.amountEditText.requestFocus();
    }

    public final void clearInputFocus() {
        this.amountEditText.clearFocus();
    }

    public final void dispatchInputKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.amountEditText.dispatchKeyEvent(event);
    }

    public final void setSelection(int index) {
        this.amountEditText.setSelection(index);
    }

    public final void requestAmountTextFocus() {
        this.amountEditText.requestFocus();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnAmountTouchListener(final Function0<Unit> f) {
        Intrinsics.checkNotNullParameter(f, "f");
        this.amountEditText.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView.setOnAmountTouchListener.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                f.invoke();
                return false;
            }
        });
        OnClickListeners.onClick(this.frontSymbolText, new Function0() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhMoneyInputView.setOnAmountTouchListener$lambda$11(f);
            }
        });
        OnClickListeners.onClick(this.rearSymbolText, new Function0() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhMoneyInputView.setOnAmountTouchListener$lambda$12(f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnAmountTouchListener$lambda$11(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnAmountTouchListener$lambda$12(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void resetCurrency(Currency currency) {
        DecimalLimitTextWatcher currencyTextWatcher;
        String symbol;
        this.amountEditText.removeTextChangedListener(this.textWatcher);
        Integer num = this.maximumFractionDigits;
        if (num != null) {
            final int iIntValue = num.intValue();
            currencyTextWatcher = new DecimalLimitTextWatcher() { // from class: com.robinhood.android.common.ui.view.RhMoneyInputView$resetCurrency$1$1
                @Override // com.robinhood.android.common.util.DecimalLimitTextWatcher
                public int getAllowedScale(BigDecimal input) {
                    Intrinsics.checkNotNullParameter(input, "input");
                    return iIntValue;
                }
            };
        } else {
            currencyTextWatcher = new CurrencyTextWatcher(currency);
        }
        this.textWatcher = currencyTextWatcher;
        this.amountEditText.addTextChangedListener(currencyTextWatcher);
        NumberFormatter numberFormatter = this.numberFormatter;
        Integer num2 = this.maximumFractionDigits;
        numberFormatter.setMaximumFractionalDigits(num2 != null ? num2.intValue() : currency.getDefaultFractionDigits());
        NumberFormatter numberFormatter2 = this.numberFormatter;
        Integer num3 = this.maximumFractionDigits;
        numberFormatter2.setMinimumFractionDigits(num3 != null ? num3.intValue() : currency.getDefaultFractionDigits());
        NumberFormatter numberFormatter3 = this.hintNumberFormatter;
        Integer num4 = this.hintMaximumFractionDigits;
        numberFormatter3.setMaximumFractionalDigits(num4 != null ? num4.intValue() : currency.getDefaultFractionDigits());
        NumberFormatter numberFormatter4 = this.hintNumberFormatter;
        Integer num5 = this.hintMaximumFractionDigits;
        numberFormatter4.setMinimumFractionDigits(num5 != null ? num5.intValue() : currency.getDefaultFractionDigits());
        setHint(getHint());
        setAmount(getAmount());
        if (Intrinsics.areEqual(currency, Currencies.USD)) {
            symbol = currency.getSymbol(Locale.US);
        } else {
            symbol = currency.getSymbol();
        }
        this.frontSymbolText.setText(symbol);
        this.rearSymbolText.setText(symbol);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshEditTextHint() {
        if (toMoneyOrNull(this.amountEditText.getText().toString()) != null) {
            this.amountEditText.setHint((CharSequence) null);
            return;
        }
        String str = this.hintString;
        CharSequence hint = this.amountEditText.getHint();
        if (Intrinsics.areEqual(hint != null ? hint.toString() : null, str)) {
            return;
        }
        this.amountEditText.setHint(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Money toMoneyOrNull(String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        Number number = this.numberFormatter.parse(str);
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : null;
        if (bigDecimal != null) {
            return Money3.toMoney(bigDecimal, this.currency);
        }
        return null;
    }

    public final void addAmountTextChangedListener(TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.amountEditText.addTextChangedListener(textWatcher);
    }

    public final void overrideAmountHintTextColor(ResourceReferences4<? extends ColorStateList> colorResourceReference) {
        Intrinsics.checkNotNullParameter(colorResourceReference, "colorResourceReference");
        ScarletManager2.overrideAttribute(this.amountEditText, R.attr.textColorHint, colorResourceReference);
    }

    public final void overrideAmountText(String text, TextWatcher... ignorableTextWatchers) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(ignorableTextWatchers, "ignorableTextWatchers");
        EditText editText = this.amountEditText;
        for (TextWatcher textWatcher : ignorableTextWatchers) {
            editText.removeTextChangedListener(textWatcher);
        }
        editText.removeTextChangedListener(this.textWatcher);
        editText.setText(text);
        for (TextWatcher textWatcher2 : ignorableTextWatchers) {
            editText.addTextChangedListener(textWatcher2);
        }
        editText.addTextChangedListener(this.textWatcher);
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
