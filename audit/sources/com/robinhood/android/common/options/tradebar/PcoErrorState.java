package com.robinhood.android.common.options.tradebar;

import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionPositionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PcoErrorState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/PcoErrorState;", "", "errorRes", "", "<init>", "(I)V", "getErrorRes", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PcoErrorState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int errorRes;

    public static /* synthetic */ PcoErrorState copy$default(PcoErrorState pcoErrorState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pcoErrorState.errorRes;
        }
        return pcoErrorState.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getErrorRes() {
        return this.errorRes;
    }

    public final PcoErrorState copy(int errorRes) {
        return new PcoErrorState(errorRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PcoErrorState) && this.errorRes == ((PcoErrorState) other).errorRes;
    }

    public int hashCode() {
        return Integer.hashCode(this.errorRes);
    }

    public String toString() {
        return "PcoErrorState(errorRes=" + this.errorRes + ")";
    }

    public PcoErrorState(int i) {
        this.errorRes = i;
    }

    public final int getErrorRes() {
        return this.errorRes;
    }

    /* compiled from: PcoErrorState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/PcoErrorState$Companion;", "", "<init>", "()V", "getTradeOnExpirationPcoLongContractMessageRes", "", "contractType", "Lcom/robinhood/models/db/OptionContractType;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "showSelloutTime", "", "from", "Lcom/robinhood/android/common/options/tradebar/PcoErrorState;", "isExpiring", "positionType", "Lcom/robinhood/models/db/OptionPositionType;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: PcoErrorState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[OptionContractType.values().length];
                try {
                    iArr[OptionContractType.CALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionContractType.PUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[OptionChain.UnderlyingType.values().length];
                try {
                    iArr2[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[OptionPositionType.values().length];
                try {
                    iArr3[OptionPositionType.LONG.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr3[OptionPositionType.SHORT.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final int getTradeOnExpirationPcoLongContractMessageRes(OptionContractType contractType, OptionChain.UnderlyingType underlyingType, boolean showSelloutTime) {
            int i = WhenMappings.$EnumSwitchMapping$1[underlyingType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return C11453R.string.option_detail_trade_bar_error_expiring_faster_pco_long;
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
            if (i2 == 1) {
                if (showSelloutTime) {
                    return C11453R.string.f4001xe558ffdd;
                }
                return C11453R.string.option_detail_trade_bar_error_expiring_faster_pco_long_call;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (showSelloutTime) {
                return C11453R.string.f4002x556d65d8;
            }
            return C11453R.string.option_detail_trade_bar_error_expiring_faster_pco_long_put;
        }

        public static /* synthetic */ PcoErrorState from$default(Companion companion, boolean z, OptionPositionType optionPositionType, OptionContractType optionContractType, OptionChain.UnderlyingType underlyingType, boolean z2, int i, Object obj) {
            if ((i & 16) != 0) {
                z2 = false;
            }
            return companion.from(z, optionPositionType, optionContractType, underlyingType, z2);
        }

        public final PcoErrorState from(boolean isExpiring, OptionPositionType positionType, OptionContractType contractType, OptionChain.UnderlyingType underlyingType, boolean showSelloutTime) {
            Intrinsics.checkNotNullParameter(positionType, "positionType");
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            if (isExpiring) {
                int i = WhenMappings.$EnumSwitchMapping$2[positionType.ordinal()];
                if (i == 1) {
                    return new PcoErrorState(getTradeOnExpirationPcoLongContractMessageRes(contractType, underlyingType, showSelloutTime));
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return new PcoErrorState(C11453R.string.option_detail_trade_bar_error_expiring_pco_short);
            }
            int i2 = WhenMappings.$EnumSwitchMapping$2[positionType.ordinal()];
            if (i2 == 1) {
                return new PcoErrorState(C11453R.string.option_detail_trade_bar_error_not_expiring_pco_long);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new PcoErrorState(C11453R.string.option_detail_trade_bar_error_not_expiring_pco_short);
        }
    }
}
