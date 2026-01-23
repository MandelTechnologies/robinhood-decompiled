package com.robinhood.crypto.perpetuals.values;

import com.robinhood.crypto.models.perpetuals.p288db.TimeInForceType;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeInForceTypeValues.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"displayName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/db/TimeInForceType;", "getDisplayName", "(Lcom/robinhood/crypto/models/perpetuals/db/TimeInForceType;)Lcom/robinhood/utils/resource/StringResource;", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.TimeInForceTypeValuesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class TimeInForceTypeValues {

    /* compiled from: TimeInForceTypeValues.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.TimeInForceTypeValuesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeInForceType.values().length];
            try {
                iArr[TimeInForceType.GOOD_FOR_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeInForceType.GOOD_TIL_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getDisplayName(TimeInForceType timeInForceType) {
        Intrinsics.checkNotNullParameter(timeInForceType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[timeInForceType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.time_in_force_type_gfd, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.time_in_force_type_gtc, new Object[0]);
    }
}
