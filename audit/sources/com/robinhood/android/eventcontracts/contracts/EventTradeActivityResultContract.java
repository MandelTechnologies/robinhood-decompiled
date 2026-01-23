package com.robinhood.android.eventcontracts.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractsNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract;", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityKey;", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract$Result;", "navigatorDelegate", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Result", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventTradeActivityResultContract extends NavigationActivityResultContract<EventTradeActivityKey, Result> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTradeActivityResultContract(Function0<? extends Navigator> navigatorDelegate) {
        super(navigatorDelegate);
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
    }

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract$Result;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "OrderSubmitted", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract$Result$OrderSubmitted;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Result extends Parcelable, NavigationActivityResultContract2 {

        /* compiled from: EventContractsNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract$Result$OrderSubmitted;", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract$Result;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderSubmitted implements Result {
            public static final OrderSubmitted INSTANCE = new OrderSubmitted();
            public static final Parcelable.Creator<OrderSubmitted> CREATOR = new Creator();

            /* compiled from: EventContractsNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<OrderSubmitted> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OrderSubmitted createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OrderSubmitted.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OrderSubmitted[] newArray(int i) {
                    return new OrderSubmitted[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OrderSubmitted);
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return -1;
            }

            public int hashCode() {
                return 1437739928;
            }

            public String toString() {
                return "OrderSubmitted";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private OrderSubmitted() {
            }
        }
    }
}
