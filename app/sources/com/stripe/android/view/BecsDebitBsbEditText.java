package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.R$attr;
import com.stripe.android.R$drawable;
import com.stripe.android.R$string;
import com.stripe.android.view.BecsDebitBanks;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: BecsDebitBsbEditText.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0014H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bank", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "getBank", "()Lcom/stripe/android/view/BecsDebitBanks$Bank;", "banks", "Lcom/stripe/android/view/BecsDebitBanks;", "bsb", "", "getBsb$payments_core_release", "()Ljava/lang/String;", "isComplete", "", "()Z", "onBankChangedCallback", "Lkotlin/Function1;", "", "getOnBankChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnBankChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "onCompletedCallback", "Lkotlin/Function0;", "getOnCompletedCallback", "()Lkotlin/jvm/functions/Function0;", "setOnCompletedCallback", "(Lkotlin/jvm/functions/Function0;)V", "formatBsb", "updateIcon", "isError", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class BecsDebitBsbEditText extends StripeEditText {
    private final BecsDebitBanks banks;
    private Function1<? super BecsDebitBanks.Bank, Unit> onBankChangedCallback;
    private Function0<Unit> onCompletedCallback;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.banks = new BecsDebitBanks(context, false, 2, null);
        this.onBankChangedCallback = new Function1<BecsDebitBanks.Bank, Unit>() { // from class: com.stripe.android.view.BecsDebitBsbEditText$onBankChangedCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BecsDebitBanks.Bank bank) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BecsDebitBanks.Bank bank) {
                invoke2(bank);
                return Unit.INSTANCE;
            }
        };
        this.onCompletedCallback = new Function0<Unit>() { // from class: com.stripe.android.view.BecsDebitBsbEditText$onCompletedCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        setInputType(2);
        addTextChangedListener(new StripeTextWatcher() { // from class: com.stripe.android.view.BecsDebitBsbEditText.1
            private String formattedBsb;
            private boolean ignoreChanges;
            private Integer newCursorPosition;

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) throws IOException {
                if (!this.ignoreChanges && start <= 4) {
                    String string2 = s != null ? s.toString() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = string2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = string2.charAt(i2);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string3 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    String bsb = BecsDebitBsbEditText.this.formatBsb(string3);
                    this.formattedBsb = bsb;
                    this.newCursorPosition = bsb != null ? Integer.valueOf(bsb.length()) : null;
                }
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String str;
                if (this.ignoreChanges) {
                    return;
                }
                this.ignoreChanges = true;
                if (!BecsDebitBsbEditText.this.getIsLastKeyDelete() && (str = this.formattedBsb) != null) {
                    BecsDebitBsbEditText.this.setText(str);
                    Integer num = this.newCursorPosition;
                    if (num != null) {
                        BecsDebitBsbEditText becsDebitBsbEditText = BecsDebitBsbEditText.this;
                        becsDebitBsbEditText.setSelection(RangesKt.coerceIn(num.intValue(), 0, becsDebitBsbEditText.getFieldText$payments_core_release().length()));
                    }
                }
                this.formattedBsb = null;
                this.newCursorPosition = null;
                this.ignoreChanges = false;
                boolean z = BecsDebitBsbEditText.this.getBank() == null && BecsDebitBsbEditText.this.getFieldText$payments_core_release().length() >= 2;
                BecsDebitBsbEditText becsDebitBsbEditText2 = BecsDebitBsbEditText.this;
                becsDebitBsbEditText2.setErrorMessage$payments_core_release(z ? becsDebitBsbEditText2.getResources().getString(R$string.stripe_becs_widget_bsb_invalid) : null);
                BecsDebitBsbEditText becsDebitBsbEditText3 = BecsDebitBsbEditText.this;
                becsDebitBsbEditText3.setShouldShowError(becsDebitBsbEditText3.getErrorMessage() != null);
                BecsDebitBsbEditText.this.getOnBankChangedCallback().invoke(BecsDebitBsbEditText.this.getBank());
                BecsDebitBsbEditText.this.updateIcon(z);
                if (BecsDebitBsbEditText.this.isComplete()) {
                    BecsDebitBsbEditText.this.getOnCompletedCallback().invoke();
                }
            }
        });
    }

    public final Function1<BecsDebitBanks.Bank, Unit> getOnBankChangedCallback() {
        return this.onBankChangedCallback;
    }

    public final void setOnBankChangedCallback(Function1<? super BecsDebitBanks.Bank, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onBankChangedCallback = function1;
    }

    public final Function0<Unit> getOnCompletedCallback() {
        return this.onCompletedCallback;
    }

    public final void setOnCompletedCallback(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCompletedCallback = function0;
    }

    public final String getBsb$payments_core_release() throws Resources.NotFoundException, IOException {
        String string2;
        if (getFieldText$payments_core_release().length() < 2) {
            string2 = getResources().getString(R$string.stripe_becs_widget_bsb_incomplete);
        } else if (getBank() == null) {
            string2 = getResources().getString(R$string.stripe_becs_widget_bsb_invalid);
        } else {
            string2 = getFieldText$payments_core_release().length() < 7 ? getResources().getString(R$string.stripe_becs_widget_bsb_incomplete) : null;
        }
        setErrorMessage$payments_core_release(string2);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        StringBuilder sb = new StringBuilder();
        int length = fieldText$payments_core_release.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = fieldText$payments_core_release.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        if (isComplete()) {
            return string3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isComplete() {
        return getBank() != null && getFieldText$payments_core_release().length() == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BecsDebitBanks.Bank getBank() {
        return this.banks.byPrefix(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIcon(boolean isError) {
        int i;
        if (isError) {
            i = R$drawable.stripe_ic_bank_error;
        } else {
            i = R$drawable.stripe_ic_bank_becs;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatBsb(String bsb) {
        return bsb.length() >= 3 ? CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{StringsKt.take(bsb, 3), StringsKt.takeLast(bsb, bsb.length() - 3)}), "-", null, null, 0, null, null, 62, null) : bsb;
    }

    /* compiled from: BecsDebitBsbEditText.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText$Companion;", "", "()V", "MAX_LENGTH", "", "MIN_VALIDATION_THRESHOLD", "SEPARATOR", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
