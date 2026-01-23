package com.robinhood.android.trade.configuration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderTypeDisabledBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "<init>", "()V", OrderTypeDisabledBottomSheetFragment.ARG_REASON, "Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason;", "getReason", "()Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason;", "reason$delegate", "Lkotlin/Lazy;", "titleTextLabel", "", "getTitleTextLabel", "()Ljava/lang/String;", "descriptionTextLabel", "getDescriptionTextLabel", "primaryButtonLabel", "getPrimaryButtonLabel", "onPrimaryButtonClicked", "", "OrderTypeDisabledReason", "Companion", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderTypeDisabledBottomSheetFragment extends RhBottomSheetDialogFragment {
    private static final String ARG_REASON = "reason";

    /* renamed from: reason$delegate, reason: from kotlin metadata */
    private final Lazy reason = Fragments2.argument(this, ARG_REASON);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private final OrderTypeDisabledReason getReason() {
        return (OrderTypeDisabledReason) this.reason.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getTitleTextLabel() {
        String string2 = getString(C29312R.string.disabled_order_type_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getDescriptionTextLabel() {
        String string2;
        OrderTypeDisabledReason reason = getReason();
        if (reason instanceof OrderTypeDisabledReason.RecurringFractionalUntradable) {
            string2 = getString(C29312R.string.recurring_disabled_error_dialog_description, ((OrderTypeDisabledReason.RecurringFractionalUntradable) reason).getSymbol());
        } else {
            if (!(reason instanceof OrderTypeDisabledReason.ShortPosition)) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = getString(C29312R.string.short_position_error_dialog_description);
        }
        Intrinsics.checkNotNullExpressionValue(string2, "run(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getPrimaryButtonLabel() {
        String string2 = getString(C11048R.string.general_label_done);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onPrimaryButtonClicked() {
        dismiss();
    }

    /* compiled from: OrderTypeDisabledBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason;", "Landroid/os/Parcelable;", "<init>", "()V", "RecurringFractionalUntradable", "ShortPosition", "Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason$RecurringFractionalUntradable;", "Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason$ShortPosition;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class OrderTypeDisabledReason implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ OrderTypeDisabledReason(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OrderTypeDisabledReason() {
        }

        /* compiled from: OrderTypeDisabledBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason$RecurringFractionalUntradable;", "Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RecurringFractionalUntradable extends OrderTypeDisabledReason {
            public static final int $stable = 0;
            public static final Parcelable.Creator<RecurringFractionalUntradable> CREATOR = new Creator();
            private final String symbol;

            /* compiled from: OrderTypeDisabledBottomSheetFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RecurringFractionalUntradable> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RecurringFractionalUntradable createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RecurringFractionalUntradable(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RecurringFractionalUntradable[] newArray(int i) {
                    return new RecurringFractionalUntradable[i];
                }
            }

            public static /* synthetic */ RecurringFractionalUntradable copy$default(RecurringFractionalUntradable recurringFractionalUntradable, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = recurringFractionalUntradable.symbol;
                }
                return recurringFractionalUntradable.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            public final RecurringFractionalUntradable copy(String symbol) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                return new RecurringFractionalUntradable(symbol);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RecurringFractionalUntradable) && Intrinsics.areEqual(this.symbol, ((RecurringFractionalUntradable) other).symbol);
            }

            public int hashCode() {
                return this.symbol.hashCode();
            }

            public String toString() {
                return "RecurringFractionalUntradable(symbol=" + this.symbol + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.symbol);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RecurringFractionalUntradable(String symbol) {
                super(null);
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                this.symbol = symbol;
            }

            public final String getSymbol() {
                return this.symbol;
            }
        }

        /* compiled from: OrderTypeDisabledBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason$ShortPosition;", "Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShortPosition extends OrderTypeDisabledReason {
            public static final int $stable = 0;
            public static final ShortPosition INSTANCE = new ShortPosition();
            public static final Parcelable.Creator<ShortPosition> CREATOR = new Creator();

            /* compiled from: OrderTypeDisabledBottomSheetFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ShortPosition> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShortPosition createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShortPosition.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShortPosition[] newArray(int i) {
                    return new ShortPosition[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private ShortPosition() {
                super(null);
            }
        }
    }

    /* compiled from: OrderTypeDisabledBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$Companion;", "", "<init>", "()V", "ARG_REASON", "", "newInstance", "Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment;", OrderTypeDisabledBottomSheetFragment.ARG_REASON, "Lcom/robinhood/android/trade/configuration/OrderTypeDisabledBottomSheetFragment$OrderTypeDisabledReason;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OrderTypeDisabledBottomSheetFragment newInstance(OrderTypeDisabledReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            OrderTypeDisabledBottomSheetFragment orderTypeDisabledBottomSheetFragment = new OrderTypeDisabledBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(OrderTypeDisabledBottomSheetFragment.ARG_REASON, reason);
            orderTypeDisabledBottomSheetFragment.setArguments(bundle);
            return orderTypeDisabledBottomSheetFragment;
        }
    }
}
