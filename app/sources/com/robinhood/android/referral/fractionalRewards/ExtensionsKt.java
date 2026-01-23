package com.robinhood.android.referral.fractionalRewards;

import com.robinhood.models.p355ui.ClaimableInstrument;
import com.robinhood.models.p355ui.FractionalRewardInfo;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"hasInstrumentShortage", "", "Lcom/robinhood/models/ui/FractionalRewardInfo;", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ExtensionsKt {
    public static final boolean hasInstrumentShortage(FractionalRewardInfo fractionalRewardInfo) {
        Object next;
        Intrinsics.checkNotNullParameter(fractionalRewardInfo, "<this>");
        Iterator<T> it = fractionalRewardInfo.getInstruments().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((ClaimableInstrument) next).getAvailableToClaim()) {
                break;
            }
        }
        return next != null;
    }
}
