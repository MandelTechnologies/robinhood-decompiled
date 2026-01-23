package com.robinhood.android.cash.cushion.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashCushionDetailsContract.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashCushionDetails;", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract$Result;", "navigatorDelegate", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Result", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CashCushionDetailsContract extends NavigationActivityResultContract<LegacyIntentKey.CashCushionDetails, Result> {
    public static final int $stable = NavigationActivityResultContract.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCushionDetailsContract(Function0<? extends Navigator> navigatorDelegate) {
        super(navigatorDelegate);
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
    }

    /* compiled from: CashCushionDetailsContract.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract$Result;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/contracts/ActivityResult;", "<init>", "()V", "Enabled", "Dismissed", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract$Result$Dismissed;", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract$Result$Enabled;", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result implements Parcelable, NavigationActivityResultContract2 {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }

        /* compiled from: CashCushionDetailsContract.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract$Result$Enabled;", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract$Result;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Enabled extends Result {
            public static final int $stable = 0;
            public static final Enabled INSTANCE = new Enabled();
            public static final Parcelable.Creator<Enabled> CREATOR = new Creator();

            /* compiled from: CashCushionDetailsContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Enabled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Enabled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Enabled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Enabled[] newArray(int i) {
                    return new Enabled[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return -1;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Enabled() {
                super(null);
            }
        }

        /* compiled from: CashCushionDetailsContract.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract$Result$Dismissed;", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsContract$Result;", "<init>", "()V", "resultCode", "", "getResultCode", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Dismissed extends Result {
            public static final int $stable = 0;
            public static final Dismissed INSTANCE = new Dismissed();
            public static final Parcelable.Creator<Dismissed> CREATOR = new Creator();

            /* compiled from: CashCushionDetailsContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Dismissed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Dismissed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Dismissed.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Dismissed[] newArray(int i) {
                    return new Dismissed[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.robinhood.android.navigation.contracts.NavigationActivityResultContract2
            public int getResultCode() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Dismissed() {
                super(null);
            }
        }
    }
}
