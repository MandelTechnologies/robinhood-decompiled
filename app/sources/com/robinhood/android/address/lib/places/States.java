package com.robinhood.android.address.lib.places;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: States.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"convertStateNameToCode", "", "Landroid/content/Context;", "name", "feature-lib-address_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.address.lib.places.StatesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class States {
    public static final String convertStateNameToCode(Context context, String name) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(C11048R.array.us_states);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String[] stringArray2 = resources.getStringArray(C11048R.array.us_states_full_name);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        int length = stringArray2.length;
        for (int i = 0; i < length; i++) {
            if (StringsKt.equals(stringArray2[i], name, true)) {
                String str = stringArray[i];
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                return str;
            }
        }
        return name;
    }
}
