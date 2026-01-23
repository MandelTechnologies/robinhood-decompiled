package com.robinhood.crypto.perpetuals.values;

import com.robinhood.crypto.models.perpetuals.p288db.PerpetualHistoryType;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryTypeDisplayNames.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"displayName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualHistoryType;", "getDisplayName", "(Lcom/robinhood/crypto/models/perpetuals/db/PerpetualHistoryType;)Lcom/robinhood/utils/resource/StringResource;", "lowercaseDisplayName", "getLowercaseDisplayName", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.HistoryTypeDisplayNamesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class HistoryTypeDisplayNames {

    /* compiled from: HistoryTypeDisplayNames.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.HistoryTypeDisplayNamesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PerpetualHistoryType.values().length];
            try {
                iArr[PerpetualHistoryType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerpetualHistoryType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PerpetualHistoryType.TAKE_PROFIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PerpetualHistoryType.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PerpetualHistoryType.LIQUIDATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PerpetualHistoryType.CLOSE_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getDisplayName(PerpetualHistoryType perpetualHistoryType) {
        Intrinsics.checkNotNullParameter(perpetualHistoryType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[perpetualHistoryType.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_market, new Object[0]);
            case 2:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_limit, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_take_profit, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_stop_loss, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_liquidation, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_close_position, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getLowercaseDisplayName(PerpetualHistoryType perpetualHistoryType) {
        Intrinsics.checkNotNullParameter(perpetualHistoryType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[perpetualHistoryType.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_market_lowercase, new Object[0]);
            case 2:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_limit_lowercase, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_take_profit_lowercase, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_stop_loss_lowercase, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_liquidation_lowercase, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke(C33018R.string.history_type_close_position_lowercase, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
