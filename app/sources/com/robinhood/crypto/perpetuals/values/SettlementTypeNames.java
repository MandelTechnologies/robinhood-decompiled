package com.robinhood.crypto.perpetuals.values;

import com.robinhood.crypto.models.perpetuals.p288db.SettlementType;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettlementTypeNames.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"displayName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/db/SettlementType;", "getDisplayName", "(Lcom/robinhood/crypto/models/perpetuals/db/SettlementType;)Lcom/robinhood/utils/resource/StringResource;", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.SettlementTypeNamesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SettlementTypeNames {

    /* compiled from: SettlementTypeNames.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.SettlementTypeNamesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettlementType.values().length];
            try {
                iArr[SettlementType.SETTLEMENT_TYPE_PERIODIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettlementType.SETTLEMENT_TYPE_CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getDisplayName(SettlementType settlementType) {
        Intrinsics.checkNotNullParameter(settlementType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[settlementType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.settlement_type_periodic_name, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.settlement_type_close_name, new Object[0]);
    }
}
