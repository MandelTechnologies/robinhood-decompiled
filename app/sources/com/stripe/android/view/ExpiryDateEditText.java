package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$attr;
import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.stripe.android.R$integer;
import com.stripe.android.R$string;
import com.stripe.android.model.ExpirationDate;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: ExpiryDateEditText.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ/\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0014\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b\u0014\u0010(R+\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010(\"\u0004\b,\u0010\u000eR\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0013\u00104\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, m3636d2 = {"Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/StripeEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "includeSeparatorGaps", "", "updateSeparatorUi", "(Z)V", "listenForTextChanges", "()V", "", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "year", "isDateValid", "(Ljava/lang/String;Ljava/lang/String;)Z", "include", "setIncludeSeparatorGaps", "newLength", "editActionStart", "editActionAddition", "maxInputLength", "updateSelectionIndex$payments_core_release", "(IIII)I", "updateSelectionIndex", "Lkotlin/Function0;", "completionCallback", "Lkotlin/jvm/functions/Function0;", "getCompletionCallback$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "Z", "()Z", "includeSeparatorGaps$delegate", "Lkotlin/properties/ReadWriteProperty;", "getIncludeSeparatorGaps$payments_core_release", "setIncludeSeparatorGaps$payments_core_release", "dateDigitsLength", "I", "separator", "Ljava/lang/String;", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getValidatedDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "validatedDate", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ExpiryDateEditText extends StripeEditText {
    private /* synthetic */ Function0<Unit> completionCallback;
    private final int dateDigitsLength;

    /* renamed from: includeSeparatorGaps$delegate, reason: from kotlin metadata */
    private final Interfaces3 includeSeparatorGaps;
    private boolean isDateValid;
    private String separator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.completionCallback = new Function0<Unit>() { // from class: com.stripe.android.view.ExpiryDateEditText$completionCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.includeSeparatorGaps = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.ExpiryDateEditText$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.getClass();
                this.updateSeparatorUi(zBooleanValue);
            }
        };
        this.dateDigitsLength = context.getResources().getInteger(R$integer.stripe_date_digits_length);
        this.separator = "/";
        setNumberOnlyInputType();
        updateSeparatorUi$default(this, false, 1, null);
        listenForTextChanges();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardExpirationDate"});
        }
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.ExpiryDateEditText$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ExpiryDateEditText._init_$lambda$1(this.f$0, view, z);
            }
        });
        setLayoutDirection(0);
    }

    public final Function0<Unit> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final void setCompletionCallback$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.completionCallback = function0;
    }

    /* renamed from: isDateValid, reason: from getter */
    public final boolean getIsDateValid() {
        return this.isDateValid;
    }

    public final ExpirationDate.Validated getValidatedDate() {
        boolean z = this.isDateValid;
        if (z) {
            return ExpirationDate.Unvalidated.INSTANCE.create(getFieldText$payments_core_release()).validate();
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() throws Resources.NotFoundException {
        String string2 = getResources().getString(R$string.stripe_acc_label_expiry_date_node, getText());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.includeSeparatorGaps.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z) {
        this.includeSeparatorGaps.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setIncludeSeparatorGaps(boolean include) {
        setIncludeSeparatorGaps$payments_core_release(include);
    }

    static /* synthetic */ void updateSeparatorUi$default(ExpiryDateEditText expiryDateEditText, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        expiryDateEditText.updateSeparatorUi(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSeparatorUi(boolean includeSeparatorGaps) {
        String str;
        if (includeSeparatorGaps) {
            str = " / ";
        } else {
            str = "/";
        }
        this.separator = str;
        setFilters((InputFilter[]) CollectionsKt.listOf(new InputFilter.LengthFilter(this.dateDigitsLength + this.separator.length())).toArray(new InputFilter.LengthFilter[0]));
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new StripeTextWatcher() { // from class: com.stripe.android.view.ExpiryDateEditText.listenForTextChanges.1
            private ExpirationDate.Unvalidated expirationDate = ExpirationDate.Unvalidated.INSTANCE.getEMPTY();
            private String formattedDate;
            private int latestChangeStart;
            private int latestInsertionSize;
            private Integer newCursorPosition;

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                this.latestChangeStart = start;
                this.latestInsertionSize = after;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) throws IOException {
                String string2 = s != null ? s.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                StringBuilder sb = new StringBuilder();
                int length = string2.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = string2.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string3 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                if (string3.length() == 1 && this.latestChangeStart == 0 && this.latestInsertionSize == 1) {
                    char cCharAt2 = string3.charAt(0);
                    if (cCharAt2 != '0' && cCharAt2 != '1') {
                        string3 = "0" + string3;
                        this.latestInsertionSize++;
                    }
                } else if (string3.length() == 2 && this.latestChangeStart == 2 && this.latestInsertionSize == 0) {
                    string3 = string3.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
                }
                ExpirationDate.Unvalidated unvalidatedCreate = ExpirationDate.Unvalidated.INSTANCE.create(string3);
                this.expirationDate = unvalidatedCreate;
                boolean isMonthValid = unvalidatedCreate.getIsMonthValid();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(unvalidatedCreate.getMonth());
                if ((unvalidatedCreate.getMonth().length() == 2 && this.latestInsertionSize > 0 && isMonthValid) || string3.length() > 2) {
                    sb2.append(ExpiryDateEditText.this.separator);
                }
                sb2.append(unvalidatedCreate.getYear());
                String string4 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                this.newCursorPosition = Integer.valueOf(ExpiryDateEditText.this.updateSelectionIndex$payments_core_release(string4.length(), this.latestChangeStart, this.latestInsertionSize, ExpiryDateEditText.this.dateDigitsLength + ExpiryDateEditText.this.separator.length()));
                this.formattedDate = string4;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                int i;
                String str = this.formattedDate;
                boolean z = false;
                if (str != null) {
                    ExpiryDateEditText.this.setTextSilent$payments_core_release(str);
                    Integer num = this.newCursorPosition;
                    if (num != null) {
                        ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                        expiryDateEditText.setSelection(RangesKt.coerceIn(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length()));
                    }
                }
                String month = this.expirationDate.getMonth();
                String year = this.expirationDate.getYear();
                boolean z2 = month.length() == 2 && !this.expirationDate.getIsMonthValid();
                if (month.length() != 2 || year.length() != 2) {
                    ExpiryDateEditText.this.isDateValid = false;
                } else {
                    boolean isDateValid = ExpiryDateEditText.this.getIsDateValid();
                    ExpiryDateEditText expiryDateEditText2 = ExpiryDateEditText.this;
                    expiryDateEditText2.isDateValid = expiryDateEditText2.isDateValid(month, year);
                    boolean z3 = !ExpiryDateEditText.this.getIsDateValid();
                    if (!isDateValid && ExpiryDateEditText.this.getIsDateValid()) {
                        ExpiryDateEditText.this.getCompletionCallback$payments_core_release().invoke();
                    }
                    z2 = z3;
                }
                ExpiryDateEditText expiryDateEditText3 = ExpiryDateEditText.this;
                Resources resources = expiryDateEditText3.getResources();
                if (this.expirationDate.getIsPartialEntry()) {
                    i = com.stripe.android.uicore.R$string.stripe_incomplete_expiry_date;
                } else if (!this.expirationDate.getIsMonthValid()) {
                    i = com.stripe.android.uicore.R$string.stripe_invalid_expiry_month;
                } else {
                    i = com.stripe.android.uicore.R$string.stripe_invalid_expiry_year;
                }
                expiryDateEditText3.setErrorMessage(resources.getString(i));
                ExpiryDateEditText expiryDateEditText4 = ExpiryDateEditText.this;
                if (z2 && (this.expirationDate.getIsPartialEntry() || this.expirationDate.getIsComplete())) {
                    z = true;
                }
                expiryDateEditText4.setShouldShowError(z);
                this.formattedDate = null;
                this.newCursorPosition = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ExpiryDateEditText this$0, View view, boolean z) {
        Editable text;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z || (text = this$0.getText()) == null || text.length() == 0 || this$0.isDateValid) {
            return;
        }
        this$0.setShouldShowError(true);
    }

    public final int updateSelectionIndex$payments_core_release(int newLength, int editActionStart, int editActionAddition, int maxInputLength) {
        int length = 0;
        int length2 = (editActionStart > 2 || editActionStart + editActionAddition < 2) ? 0 : this.separator.length();
        boolean z = editActionAddition == 0 && editActionStart == this.separator.length() + 2;
        int i = editActionStart + editActionAddition + length2;
        if (z && i > 0) {
            length = this.separator.length();
        }
        return Math.min(maxInputLength, Math.min(i - length, newLength));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDateValid(String month, String year) {
        Object objM28550constructorimpl;
        int iIntValue;
        Object objM28550constructorimpl2;
        int iIntValue2 = -1;
        if (month.length() != 2) {
            iIntValue = -1;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(Integer.valueOf(Integer.parseInt(month)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = obj;
            }
            iIntValue = ((Number) objM28550constructorimpl).intValue();
        }
        if (year.length() == 2) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(Integer.valueOf(DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(year))));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            iIntValue2 = ((Number) (Result.m28555isFailureimpl(objM28550constructorimpl2) ? -1 : objM28550constructorimpl2)).intValue();
        }
        return DateUtils.isExpiryDataValid(iIntValue, iIntValue2);
    }

    /* compiled from: ExpiryDateEditText.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/view/ExpiryDateEditText$Companion;", "", "()V", "INCLUDE_SEPARATOR_GAPS_DEFAULT", "", "INVALID_INPUT", "", "SEPARATOR_WITHOUT_GAPS", "", "SEPARATOR_WITH_GAPS", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
