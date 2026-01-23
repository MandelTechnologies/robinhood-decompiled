package com.robinhood.shared.trade.crypto.views.edittext;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAmountEditText.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0#J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0#J\u0006\u0010%\u001a\u00020\u001aJ\u0015\u0010%\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010(R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoAmountEditText;", "Lcom/robinhood/android/common/ui/view/RhEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "amountRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Ljava/math/BigDecimal;", "getAmountRelay", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "textRelay", "", "getTextRelay", "watcher", "Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoTextWatcher;", "currency", "Lcom/robinhood/models/crypto/db/Currency;", "getCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "setCurrency", "(Lcom/robinhood/models/crypto/db/Currency;)V", "setCustomCursorDrawable", "", "removeTextChangedListener", "cryptoAmount", "hintAmount", "getHintAmount", "()Ljava/math/BigDecimal;", "setHintAmount", "(Ljava/math/BigDecimal;)V", "amountChanges", "Lio/reactivex/Observable;", "textChanges", "updateHint", "isHintVisible", "", "(Ljava/lang/Boolean;)V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoAmountEditText extends RhEditText {
    public static final int $stable = 8;
    private final BehaviorRelay<Optional<BigDecimal>> amountRelay;
    private Currency currency;
    private BigDecimal hintAmount;
    private final BehaviorRelay<String> textRelay;
    private CryptoTextWatcher watcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAmountEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        BehaviorRelay<Optional<BigDecimal>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.amountRelay = behaviorRelayCreateDefault;
        BehaviorRelay<String> behaviorRelayCreateDefault2 = BehaviorRelay.createDefault("");
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault2, "createDefault(...)");
        this.textRelay = behaviorRelayCreateDefault2;
        this.watcher = CryptoTextWatcher.INSTANCE.watch(this);
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.hintAmount = ZERO;
    }

    public final BehaviorRelay<Optional<BigDecimal>> getAmountRelay() {
        return this.amountRelay;
    }

    public final BehaviorRelay<String> getTextRelay() {
        return this.textRelay;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final void setCurrency(Currency currency) {
        if (Intrinsics.areEqual(currency, this.currency) || currency == null) {
            return;
        }
        this.currency = currency;
        CryptoTextWatcher cryptoTextWatcher = this.watcher;
        if (cryptoTextWatcher != null) {
            Editable editableText = getEditableText();
            Intrinsics.checkNotNullExpressionValue(editableText, "getEditableText(...)");
            cryptoTextWatcher.afterTextChanged(editableText);
        }
        updateHint();
    }

    public final void setCustomCursorDrawable() {
        if (Build.VERSION.SDK_INT >= 29) {
            setTextCursorDrawable(C40095R.drawable.crypto_amount_edt_cursor_drawable);
        }
    }

    public final void removeTextChangedListener() {
        CryptoTextWatcher cryptoTextWatcher = this.watcher;
        if (cryptoTextWatcher != null) {
            cryptoTextWatcher.removeTextChangedListener();
        }
        this.watcher = null;
    }

    public final BigDecimal getHintAmount() {
        return this.hintAmount;
    }

    public final void setHintAmount(BigDecimal cryptoAmount) {
        Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
        if (Intrinsics.areEqual(cryptoAmount, this.hintAmount)) {
            return;
        }
        this.hintAmount = cryptoAmount;
        updateHint();
    }

    public final Observable<Optional<BigDecimal>> amountChanges() {
        Observable<Optional<BigDecimal>> observableHide = this.amountRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public final Observable<String> textChanges() {
        Observable<String> observableHide = this.textRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public final void updateHint() {
        boolean z = true;
        if (this.watcher != null) {
            String value = this.textRelay.getValue();
            if (value != null && value.length() != 0) {
                z = false;
            }
            updateHint(Boolean.valueOf(z));
            return;
        }
        Editable text = getText();
        if (text != null && text.length() != 0) {
            z = false;
        }
        updateHint(Boolean.valueOf(z));
    }

    public final void updateHint(Boolean isHintVisible) {
        String currency$default;
        if (Intrinsics.areEqual(isHintVisible, Boolean.TRUE)) {
            Currency currency = this.currency;
            currency$default = currency != null ? CurrencyDefinitions.formatCurrency$default(currency, this.hintAmount, currency.isFiatCurrency(), false, null, 0, null, null, false, false, false, false, 2044, null) : null;
        } else {
            currency$default = "";
        }
        setHint(currency$default);
    }
}
