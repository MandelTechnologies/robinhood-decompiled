package com.truelayer.payments.p419ui.screens.formflows.model;

import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.inputs.form.models.ValidationError;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.utils.FieldIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: ExtraInputValidationProvider.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J,\u0010\u0007\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/model/ExtraInputValidationProvider;", "", "()V", "isValidIban", "", "iban", "", "provideValidations", "", "Lkotlin/Function1;", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/ui/components/inputs/form/models/ValidationError;", "input", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ExtraInputValidationProvider {
    public static final int $stable = 0;
    public static final ExtraInputValidationProvider INSTANCE = new ExtraInputValidationProvider();

    private ExtraInputValidationProvider() {
    }

    public final List<Function1<String, Outcome<String, ValidationError>>> provideValidations(FormInputWrapper input) {
        Intrinsics.checkNotNullParameter(input, "input");
        ArrayList arrayList = new ArrayList();
        if (!(input instanceof FormInputWrapper.Select) && (input instanceof FormInputWrapper.Text) && Intrinsics.areEqual(input.getId(), FieldIds.IBAN)) {
            arrayList.add(new Function1<String, Outcome<? extends String, ? extends ValidationError>>() { // from class: com.truelayer.payments.ui.screens.formflows.model.ExtraInputValidationProvider.provideValidations.1
                @Override // kotlin.jvm.functions.Function1
                public final Outcome<String, ValidationError> invoke(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (ExtraInputValidationProvider.INSTANCE.isValidIban(it)) {
                        return new Ok(it);
                    }
                    return new Fail(new ValidationError.Other(Integer.valueOf(C42830R.string.iban_validation_error), null, null, 2, null));
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidIban(String iban) throws NumberFormatException {
        if (!new Regex("^[\\dA-Z]*$").matches(iban)) {
            return false;
        }
        int length = iban.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) iban.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string2 = iban.subSequence(i, length + 1).toString();
        if (string2.length() >= 15 && string2.length() <= 34) {
            String strSubstring = string2.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = string2.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            char[] charArray = (strSubstring + strSubstring2).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            ArrayList arrayList = new ArrayList(charArray.length);
            for (char c : charArray) {
                arrayList.add(Integer.valueOf(c));
            }
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = Integer.parseInt(String.valueOf((char) ((Number) it.next()).intValue()), 36);
                int i4 = 10;
                if (i3 >= 10) {
                    i4 = 100;
                }
                i2 = ((i4 * i2) + i3) % 97;
            }
            if (i2 == 1) {
                return true;
            }
        }
        return false;
    }
}
