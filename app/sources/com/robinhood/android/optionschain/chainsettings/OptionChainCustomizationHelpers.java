package com.robinhood.android.optionschain.chainsettings;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationHelpers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"firstIndexOrNull", "", "E", "list", "", "(Ljava/util/List;)Ljava/lang/Integer;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationHelpersKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainCustomizationHelpers {
    public static final <E> Integer firstIndexOrNull(List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return !list.isEmpty() ? 0 : null;
    }
}
