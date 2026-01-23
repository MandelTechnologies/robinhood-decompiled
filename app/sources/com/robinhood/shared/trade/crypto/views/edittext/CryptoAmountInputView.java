package com.robinhood.shared.trade.crypto.views.edittext;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.databinding.MergeCryptoAmountInputViewBinding;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: CryptoAmountInputView.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u0017J\u0006\u00107\u001a\u00020%J\u0006\u00108\u001a\u00020%J\b\u00109\u001a\u00020%H\u0014J\b\u0010:\u001a\u00020\u0007H\u0016J\u000e\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020%J\b\u0010?\u001a\u00020%H\u0016J\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011J\b\u0010A\u001a\u00020%H\u0002J\u0012\u0010B\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u001c\u0010C\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R$\u0010*\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0004\u0018\u0001002\b\u0010/\u001a\u0004\u0018\u0001008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoAmountInputView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoAmountInputViewBinding;", "getBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoAmountInputViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "amountChanges", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Ljava/math/BigDecimal;", "getAmountChanges", "()Lio/reactivex/Observable;", "isDecimalSeparatorEnabledChanges", "", "value", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "currencySymbolPosition", "getCurrencySymbolPosition", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "setCurrencySymbolPosition", "(Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;)V", "useCustomNumpad", "getUseCustomNumpad", "()Z", "setUseCustomNumpad", "(Z)V", "setIsAmountEnabled", "", "isAmountEnabled", "shouldRequestFocusIfEnabled", "isSymbolEnabled", "setSymbolEnabled", "hint", "getHint", "()Ljava/math/BigDecimal;", "setHint", "(Ljava/math/BigDecimal;)V", "currency", "Lcom/robinhood/models/crypto/db/Currency;", "getCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "setCurrency", "(Lcom/robinhood/models/crypto/db/Currency;)V", "decimalSeparator", "", "setCustomCursorDrawable", "removeTextChangedListener", "onAttachedToWindow", "getBaseline", "setText", "text", "", "requestInputFocus", "clearFocus", "edtFocusChanges", "updateHint", "updateSymbolVisibility", "updateSymbolText", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoAmountInputView extends LinearLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoAmountInputView.class, "binding", "getBinding()Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoAmountInputViewBinding;", 0))};
    public static final int $stable = 8;
    private final Observable<Optional<BigDecimal>> amountChanges;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition;
    private final char decimalSeparator;
    private final Observable<Boolean> isDecimalSeparatorEnabledChanges;

    /* compiled from: CryptoAmountInputView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyFormatModel.CurrencySymbolPosition.values().length];
            try {
                iArr[CurrencyFormatModel.CurrencySymbolPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyFormatModel.CurrencySymbolPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyFormatModel.CurrencySymbolPosition.RIGHT_SPACED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CryptoAmountInputView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CryptoAmountInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CryptoAmountInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CryptoAmountInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        ViewGroups.inflate(this, C40095R.layout.merge_crypto_amount_input_view, true);
        this.binding = ViewBinding5.viewBinding(this, CryptoAmountInputView2.INSTANCE);
        this.amountChanges = getBinding().amountEditText.amountChanges();
        Observable map = getBinding().amountEditText.textChanges().doOnNext(new Consumer() { // from class: com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView.isDecimalSeparatorEnabledChanges.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(String str) {
                CryptoAmountInputView.this.updateHint();
            }
        }).map(new Function() { // from class: com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView.isDecimalSeparatorEnabledChanges.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return Boolean.valueOf(!StringsKt.contains$default((CharSequence) text, CryptoAmountInputView.this.decimalSeparator, false, 2, (Object) null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.isDecimalSeparatorEnabledChanges = map;
        this.currencySymbolPosition = CurrencyFormatModel.CurrencySymbolPosition.LEFT;
        this.decimalSeparator = Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale());
    }

    private final MergeCryptoAmountInputViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeCryptoAmountInputViewBinding) value;
    }

    public final Observable<Optional<BigDecimal>> getAmountChanges() {
        return this.amountChanges;
    }

    public final Observable<Boolean> isDecimalSeparatorEnabledChanges() {
        return this.isDecimalSeparatorEnabledChanges;
    }

    public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
        return this.currencySymbolPosition;
    }

    public final void setCurrencySymbolPosition(CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition) {
        this.currencySymbolPosition = currencySymbolPosition;
        updateSymbolText(getCurrency(), currencySymbolPosition);
        updateSymbolVisibility(getCurrency());
    }

    public final boolean getUseCustomNumpad() {
        return getBinding().amountEditText.getUseCustomNumpad();
    }

    public final void setUseCustomNumpad(boolean z) {
        getBinding().amountEditText.setUseCustomNumpad(z);
    }

    public static /* synthetic */ void setIsAmountEnabled$default(CryptoAmountInputView cryptoAmountInputView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        cryptoAmountInputView.setIsAmountEnabled(z, z2);
    }

    public final void setIsAmountEnabled(boolean isAmountEnabled, boolean shouldRequestFocusIfEnabled) {
        if (shouldRequestFocusIfEnabled && isAmountEnabled) {
            requestInputFocus();
        } else if (!isAmountEnabled) {
            getBinding().amountEditText.clearFocus();
        }
        getBinding().amountEditText.setEnabled(isAmountEnabled);
    }

    public final boolean isSymbolEnabled() {
        return getBinding().frontSymbolText.isEnabled();
    }

    public final void setSymbolEnabled(boolean z) {
        getBinding().frontSymbolText.setEnabled(z);
        getBinding().rearSymbolText.setEnabled(z);
    }

    public final BigDecimal getHint() {
        return getBinding().amountEditText.getHintAmount();
    }

    public final void setHint(BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getBinding().amountEditText.setHintAmount(value);
    }

    public final Currency getCurrency() {
        return getBinding().amountEditText.getCurrency();
    }

    public final void setCurrency(Currency currency) {
        getBinding().amountEditText.setCurrency(currency);
        updateSymbolText(currency, this.currencySymbolPosition);
        updateSymbolVisibility(currency);
    }

    public final void setCustomCursorDrawable() {
        getBinding().amountEditText.setCustomCursorDrawable();
    }

    public final void removeTextChangedListener() {
        getBinding().amountEditText.removeTextChangedListener();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().frontSymbolText.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView.onAttachedToWindow.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CryptoAmountInputView.this.requestInputFocus();
            }
        });
        getBinding().rearSymbolText.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView.onAttachedToWindow.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CryptoAmountInputView.this.requestInputFocus();
            }
        });
        updateHint();
        getBinding().amountEditText.requestFocus();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        return getBinding().amountEditText.getBaseline() * 2;
    }

    public final void setText(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        CryptoAmountEditText amountEditText = getBinding().amountEditText;
        Intrinsics.checkNotNullExpressionValue(amountEditText, "amountEditText");
        TextViewsKt.setTextAndUpdateCursor(amountEditText, text);
        updateHint();
    }

    public final void requestInputFocus() {
        getBinding().amountEditText.requestFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        getBinding().amountEditText.clearFocus();
    }

    public final Observable<Boolean> edtFocusChanges() {
        CryptoAmountEditText amountEditText = getBinding().amountEditText;
        Intrinsics.checkNotNullExpressionValue(amountEditText, "amountEditText");
        return RxView.focusChanges(amountEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHint() {
        updateSymbolVisibility(getCurrency());
        getBinding().amountEditText.updateHint();
    }

    private final void updateSymbolVisibility(Currency currency) {
        CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition;
        boolean z = (currency != null ? CurrencyDefinition.getCurrencySymbol$default(currency, null, 1, null) : null) != null;
        Editable text = getBinding().amountEditText.getText();
        if (text == null || text.length() == 0) {
            RhTextView frontSymbolText = getBinding().frontSymbolText;
            Intrinsics.checkNotNullExpressionValue(frontSymbolText, "frontSymbolText");
            frontSymbolText.setVisibility(8);
            RhTextView rearSymbolText = getBinding().rearSymbolText;
            Intrinsics.checkNotNullExpressionValue(rearSymbolText, "rearSymbolText");
            rearSymbolText.setVisibility(8);
            return;
        }
        if (!z || (currencySymbolPosition = this.currencySymbolPosition) == null) {
            RhTextView frontSymbolText2 = getBinding().frontSymbolText;
            Intrinsics.checkNotNullExpressionValue(frontSymbolText2, "frontSymbolText");
            frontSymbolText2.setVisibility(8);
            RhTextView rearSymbolText2 = getBinding().rearSymbolText;
            Intrinsics.checkNotNullExpressionValue(rearSymbolText2, "rearSymbolText");
            rearSymbolText2.setVisibility(8);
            return;
        }
        int i = currencySymbolPosition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencySymbolPosition.ordinal()];
        if (i == -1) {
            RhTextView frontSymbolText3 = getBinding().frontSymbolText;
            Intrinsics.checkNotNullExpressionValue(frontSymbolText3, "frontSymbolText");
            frontSymbolText3.setVisibility(8);
            RhTextView rearSymbolText3 = getBinding().rearSymbolText;
            Intrinsics.checkNotNullExpressionValue(rearSymbolText3, "rearSymbolText");
            rearSymbolText3.setVisibility(8);
            return;
        }
        if (i == 1) {
            RhTextView frontSymbolText4 = getBinding().frontSymbolText;
            Intrinsics.checkNotNullExpressionValue(frontSymbolText4, "frontSymbolText");
            frontSymbolText4.setVisibility(0);
            RhTextView rearSymbolText4 = getBinding().rearSymbolText;
            Intrinsics.checkNotNullExpressionValue(rearSymbolText4, "rearSymbolText");
            rearSymbolText4.setVisibility(8);
            return;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        RhTextView frontSymbolText5 = getBinding().frontSymbolText;
        Intrinsics.checkNotNullExpressionValue(frontSymbolText5, "frontSymbolText");
        frontSymbolText5.setVisibility(8);
        RhTextView rearSymbolText5 = getBinding().rearSymbolText;
        Intrinsics.checkNotNullExpressionValue(rearSymbolText5, "rearSymbolText");
        rearSymbolText5.setVisibility(0);
    }

    private final void updateSymbolText(Currency currency, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition) {
        String currencySymbol$default;
        int i = currencySymbolPosition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencySymbolPosition.ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            getBinding().frontSymbolText.setText(currency != null ? CurrencyDefinition.getCurrencySymbol$default(currency, null, 1, null) : null);
            getBinding().rearSymbolText.setText(currency != null ? CurrencyDefinition.getCurrencySymbol$default(currency, null, 1, null) : null);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        getBinding().frontSymbolText.setText(currency != null ? CurrencyDefinition.getCurrencySymbol$default(currency, null, 1, null) : null);
        RhTextView rhTextView = getBinding().rearSymbolText;
        if (currency != null && (currencySymbol$default = CurrencyDefinition.getCurrencySymbol$default(currency, null, 1, null)) != null) {
            str = PlaceholderUtils.XXShortPlaceholderText + currencySymbol$default;
        }
        rhTextView.setText(str);
    }
}
