package com.robinhood.android.futures.history.p142ui.correction;

import com.robinhood.android.futures.history.C17229R;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhdCashCorrectionDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState$Loaded;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState$Loading;", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class RhdCashCorrectionDetailDuxo4 {
    public static final int $stable = 0;

    public /* synthetic */ RhdCashCorrectionDetailDuxo4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RhdCashCorrectionDetailDuxo4() {
    }

    /* compiled from: RhdCashCorrectionDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState$Loading;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionViewState$Loading */
    public static final /* data */ class Loading extends RhdCashCorrectionDetailDuxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1363108541;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: RhdCashCorrectionDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState$Loaded;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;", "cashCorrection", "Lcom/robinhood/android/models/futures/db/FuturesCashCorrection;", "<init>", "(Lcom/robinhood/android/models/futures/db/FuturesCashCorrection;)V", "getCashCorrection", "()Lcom/robinhood/android/models/futures/db/FuturesCashCorrection;", "amountDisplayString", "", "getAmountDisplayString", "()Ljava/lang/String;", "payDateDisplayString", "getPayDateDisplayString", "reasonDisplayString", "Lcom/robinhood/utils/resource/StringResource;", "getReasonDisplayString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends RhdCashCorrectionDetailDuxo4 {
        public static final int $stable = 8;
        private final FuturesCashCorrection cashCorrection;

        /* compiled from: RhdCashCorrectionDetailDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionViewState$Loaded$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesCashCorrection.Reason.values().length];
                try {
                    iArr[FuturesCashCorrection.Reason.ADJUSTMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesCashCorrection.Reason.COMMISSION_AND_FEE_CREDIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FuturesCashCorrection.Reason.CREDIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FuturesCashCorrection.Reason.WRITE_OFF.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FuturesCashCorrection.Reason.EVENT_CONTRACT_ADJUSTMENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FuturesCashCorrection.Reason.EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[FuturesCashCorrection.Reason.EVENT_CONTRACT_CREDIT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[FuturesCashCorrection.Reason.EVENT_CONTRACT_WRITE_OFF.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[FuturesCashCorrection.Reason.UNSPECIFIED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, FuturesCashCorrection futuresCashCorrection, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresCashCorrection = loaded.cashCorrection;
            }
            return loaded.copy(futuresCashCorrection);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesCashCorrection getCashCorrection() {
            return this.cashCorrection;
        }

        public final Loaded copy(FuturesCashCorrection cashCorrection) {
            Intrinsics.checkNotNullParameter(cashCorrection, "cashCorrection");
            return new Loaded(cashCorrection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.cashCorrection, ((Loaded) other).cashCorrection);
        }

        public int hashCode() {
            return this.cashCorrection.hashCode();
        }

        public String toString() {
            return "Loaded(cashCorrection=" + this.cashCorrection + ")";
        }

        public final FuturesCashCorrection getCashCorrection() {
            return this.cashCorrection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(FuturesCashCorrection cashCorrection) {
            super(null);
            Intrinsics.checkNotNullParameter(cashCorrection, "cashCorrection");
            this.cashCorrection = cashCorrection;
        }

        public final String getAmountDisplayString() {
            return Money.Adjustment.format$default(this.cashCorrection.getAdjustment(), false, null, 3, null);
        }

        public final String getPayDateDisplayString() {
            return LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(this.cashCorrection.getUpdatedAt(), null, 1, null));
        }

        public final StringResource getReasonDisplayString() {
            switch (WhenMappings.$EnumSwitchMapping$0[this.cashCorrection.getReason().ordinal()]) {
                case 1:
                    return StringResource.INSTANCE.invoke(C17229R.string.futures_cash_correction_detail_reason_adjustment, new Object[0]);
                case 2:
                    return StringResource.INSTANCE.invoke(C17229R.string.futures_cash_correction_detail_reason_commission_and_fees_credit, new Object[0]);
                case 3:
                    return StringResource.INSTANCE.invoke(C17229R.string.futures_cash_correction_detail_reason_credit, new Object[0]);
                case 4:
                    return StringResource.INSTANCE.invoke(C17229R.string.futures_cash_correction_detail_reason_write_off, new Object[0]);
                case 5:
                    return StringResource.INSTANCE.invoke(C17229R.string.events_cash_correction_detail_reason_adjustment, new Object[0]);
                case 6:
                    return StringResource.INSTANCE.invoke(C17229R.string.events_cash_correction_detail_reason_commission_and_fees_credit, new Object[0]);
                case 7:
                    return StringResource.INSTANCE.invoke(C17229R.string.events_cash_correction_detail_reason_credit, new Object[0]);
                case 8:
                    return StringResource.INSTANCE.invoke(C17229R.string.events_cash_correction_detail_reason_write_off, new Object[0]);
                case 9:
                    return StringResource.INSTANCE.invoke(C17229R.string.futures_cash_correction_detail_reason_unspecified, new Object[0]);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
