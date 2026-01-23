package com.robinhood.android.address.p062ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.autofill.AutofillValue;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.dropdown.RdsDropdown;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: StateDropdown.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002R0\u0010\b\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/address/ui/StateDropdown;", "Lcom/robinhood/android/designsystem/dropdown/RdsDropdown;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "stateCodesToNames", "", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "autofill", "", "value", "Landroid/view/autofill/AutofillValue;", "getAutofillType", "", "setStateFromAutofill", "autofillValue", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class StateDropdown extends RdsDropdown {
    private final List<Tuples2<String, String>> stateCodesToNames;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateDropdown(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        String[] stringArray = getResources().getStringArray(C11048R.array.us_states);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String[] stringArray2 = getResources().getStringArray(C11048R.array.us_states_full_name);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        this.stateCodesToNames = ArraysKt.zip(stringArray, stringArray2);
    }

    public /* synthetic */ StateDropdown(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.View
    public void autofill(AutofillValue value) {
        CharSequence textValue;
        String string2;
        if (Build.VERSION.SDK_INT < 26 || value == null || (textValue = value.getTextValue()) == null || (string2 = textValue.toString()) == null) {
            return;
        }
        setStateFromAutofill(string2);
    }

    @Override // android.view.View
    public int getAutofillType() {
        if (Build.VERSION.SDK_INT >= 26) {
            return 1;
        }
        return super.getAutofillType();
    }

    private final void setStateFromAutofill(String autofillValue) {
        Iterator<Tuples2<String, String>> it = this.stateCodesToNames.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Tuples2<String, String> next = it.next();
            String strComponent1 = next.component1();
            String strComponent2 = next.component2();
            if (StringsKt.equals(strComponent1, autofillValue, true) || StringsKt.equals(strComponent2, autofillValue, true)) {
                break;
            } else {
                i++;
            }
        }
        if (i > -1) {
            setText(this.stateCodesToNames.get(i).component2());
        }
    }
}
