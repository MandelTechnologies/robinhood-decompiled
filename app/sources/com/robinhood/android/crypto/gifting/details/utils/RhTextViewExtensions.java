package com.robinhood.android.crypto.gifting.details.utils;

import android.R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhTextViewExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"setCustomTextColor", "", "Lcom/robinhood/android/designsystem/text/RhTextView;", ResourceTypes.COLOR, "", "feature-crypto-gifting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.gifting.details.utils.RhTextViewExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhTextViewExtensions {
    public static final void setCustomTextColor(RhTextView rhTextView, int i) {
        Intrinsics.checkNotNullParameter(rhTextView, "<this>");
        ScarletManager2.overrideAttribute(rhTextView, R.attr.textColor, new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(i)));
    }
}
