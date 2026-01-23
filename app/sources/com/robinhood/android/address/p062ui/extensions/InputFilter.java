package com.robinhood.android.address.p062ui.extensions;

import android.content.res.Resources;
import android.widget.EditText;
import com.robinhood.common.strings.C32428R;
import com.robinhood.utils.text.CharacterSetInputFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InputFilter.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"applyAddressValidCharsetFilter", "", "Landroid/content/res/Resources;", "editTexts", "", "Landroid/widget/EditText;", "(Landroid/content/res/Resources;[Landroid/widget/EditText;)V", "feature-address_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.address.ui.extensions.InputFilterKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class InputFilter {
    public static final void applyAddressValidCharsetFilter(Resources resources, EditText... editTexts) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(editTexts, "editTexts");
        String string2 = resources.getString(C32428R.string.onboarding_valid_english_characters_charset);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        CharacterSetInputFilter[] characterSetInputFilterArr = {new CharacterSetInputFilter(StringsKt.toSet(string2), false)};
        for (EditText editText : editTexts) {
            editText.setFilters(characterSetInputFilterArr);
        }
    }
}
