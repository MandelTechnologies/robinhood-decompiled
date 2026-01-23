package com.robinhood.shared.trade.crypto.views.edittext;

import android.text.Editable;
import android.text.Selection;
import com.robinhood.android.designsystem.textinput.TextWatcherAdapter;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatParser;
import com.robinhood.shared.common.lib.formats.currency.InputAmount;
import com.robinhood.utils.Optional3;
import java.math.RoundingMode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: CryptoTextWatcher.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J0\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0013H\u0002J\u001d\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0001¢\u0006\u0002\b J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoTextWatcher;", "Lcom/robinhood/android/designsystem/textinput/TextWatcherAdapter;", "editText", "Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoAmountEditText;", "locale", "Ljava/util/Locale;", "<init>", "(Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoAmountEditText;Ljava/util/Locale;)V", "decimalSeparator", "", "deletableCharacters", "Lkotlin/text/Regex;", "removeTextChangedListener", "", "afterTextChanged", "text", "Landroid/text/Editable;", "setTextInternal", "oldText", "", "newText", "cursorIndex", "", "avoidTextWatcherUpdates", "", "getNewCursorIndex", "oldCursorIndex", "getDecimalSeparatorPosition", "formatAmount", "inputAmount", "Lcom/robinhood/shared/common/lib/formats/currency/InputAmount;", "useCurrencyToFormat", "formatAmount$feature_trade_crypto_externalDebug", "getValidCursorPosition", "cursorPosition", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTextWatcher implements TextWatcherAdapter {
    public static final String SPECIAL_CHARACTER_NO_FORMAT = "~";
    private final String decimalSeparator;
    private final Regex deletableCharacters;
    private final CryptoAmountEditText editText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private CryptoTextWatcher(CryptoAmountEditText cryptoAmountEditText, Locale locale) {
        this.editText = cryptoAmountEditText;
        String strValueOf = String.valueOf(Locales2.getMonetaryDecimalSeparator(locale));
        this.decimalSeparator = strValueOf;
        this.deletableCharacters = new Regex("[0-9" + strValueOf + "]+");
        cryptoAmountEditText.addTextChangedListener(this);
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcherAdapter.DefaultImpls.beforeTextChanged(this, charSequence, i, i2, i3);
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcherAdapter.DefaultImpls.onTextChanged(this, charSequence, i, i2, i3);
    }

    /* synthetic */ CryptoTextWatcher(CryptoAmountEditText cryptoAmountEditText, Locale locale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoAmountEditText, (i & 2) != 0 ? CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale() : locale);
    }

    public final void removeTextChangedListener() {
        this.editText.removeTextChangedListener(this);
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(Editable text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String string2 = text.toString();
        String strReplace$default = StringsKt.replace$default(string2, SPECIAL_CHARACTER_NO_FORMAT, "", false, 4, (Object) null);
        InputAmount currencyText$default = CurrencyFormatParser.parseCurrencyText$default(strReplace$default, new InputAmount(null, InputAmount.Type.BLANK, 1, null), null, 4, null);
        boolean zContains$default = StringsKt.contains$default((CharSequence) text, (CharSequence) SPECIAL_CHARACTER_NO_FORMAT, false, 2, (Object) null);
        String amount$feature_trade_crypto_externalDebug = formatAmount$feature_trade_crypto_externalDebug(currencyText$default, !zContains$default);
        int newCursorIndex = getNewCursorIndex(this.editText.getSelectionStart(), strReplace$default, amount$feature_trade_crypto_externalDebug);
        this.editText.getAmountRelay().accept(Optional3.asOptional(currencyText$default.getAmount()));
        this.editText.getTextRelay().accept(amount$feature_trade_crypto_externalDebug);
        this.editText.updateHint(Boolean.valueOf(amount$feature_trade_crypto_externalDebug.length() == 0));
        setTextInternal(text, string2, amount$feature_trade_crypto_externalDebug, newCursorIndex, zContains$default);
    }

    private final void setTextInternal(Editable editText, CharSequence oldText, CharSequence newText, int cursorIndex, boolean avoidTextWatcherUpdates) {
        if (Intrinsics.areEqual(oldText, newText)) {
            return;
        }
        if (avoidTextWatcherUpdates) {
            this.editText.removeTextChangedListener(this);
        }
        editText.replace(0, editText.toString().length(), newText);
        Selection.setSelection(editText, getValidCursorPosition(cursorIndex, newText));
        if (avoidTextWatcherUpdates) {
            this.editText.addTextChangedListener(this);
        }
    }

    private final int getNewCursorIndex(int oldCursorIndex, String oldText, String newText) {
        return (oldCursorIndex - getDecimalSeparatorPosition(oldText)) + getDecimalSeparatorPosition(newText);
    }

    private final int getDecimalSeparatorPosition(CharSequence text) {
        return StringsKt.indexOf$default((CharSequence) (((Object) text) + this.decimalSeparator), this.decimalSeparator, 0, false, 6, (Object) null);
    }

    public final String formatAmount$feature_trade_crypto_externalDebug(InputAmount inputAmount, boolean useCurrencyToFormat) {
        String str;
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Currency currency = useCurrencyToFormat ? this.editText.getCurrency() : null;
        return (currency == null || (str = inputAmount.format(CurrencyFormatModel.Companion.fromCurrencyAmount$default(CurrencyFormatModel.INSTANCE, currency, inputAmount.getAmount(), false, false, 0, 0, false, false, RoundingMode.DOWN, null, true, null, false, false, false, false, 64248, null))) == null) ? inputAmount.format(CurrencyFormatModel.Companion.fromAmount$default(CurrencyFormatModel.INSTANCE, inputAmount.getAmount(), false, false, 0, 0, false, RoundingMode.DOWN, null, 188, null)) : str;
    }

    private final int getValidCursorPosition(int cursorPosition, CharSequence text) {
        while (-1 < cursorPosition) {
            if (this.deletableCharacters.containsMatchIn(String.valueOf(StringsKt.getOrNull(text, cursorPosition - 1)))) {
                return cursorPosition;
            }
            cursorPosition--;
        }
        return 0;
    }

    /* compiled from: CryptoTextWatcher.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoTextWatcher$Companion;", "", "<init>", "()V", "watch", "Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoTextWatcher;", "editText", "Lcom/robinhood/shared/trade/crypto/views/edittext/CryptoAmountEditText;", "SPECIAL_CHARACTER_NO_FORMAT", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CryptoTextWatcher watch(CryptoAmountEditText editText) {
            Intrinsics.checkNotNullParameter(editText, "editText");
            return new CryptoTextWatcher(editText, null, 2, 0 == true ? 1 : 0);
        }
    }
}
