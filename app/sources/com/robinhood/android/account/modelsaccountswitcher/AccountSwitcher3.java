package com.robinhood.android.account.modelsaccountswitcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcher.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", "Landroid/os/Parcelable;", "<init>", "()V", "Equity", "Index", "Options", "AdapterModule", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails$Equity;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails$Index;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails$Options;", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccountDetails, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class AccountSwitcher3 implements Parcelable {
    public /* synthetic */ AccountSwitcher3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AccountSwitcher3() {
    }

    /* compiled from: AccountSwitcher.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails$Equity;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", "isClosingShortPosition", "", "<init>", "(Z)V", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccountDetails$Equity, reason: from toString */
    public static final /* data */ class Equity extends AccountSwitcher3 {
        public static final Parcelable.Creator<Equity> CREATOR = new Creator();
        private final boolean isClosingShortPosition;

        /* compiled from: AccountSwitcher.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccountDetails$Equity$Creator */
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Equity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Equity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Equity(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Equity[] newArray(int i) {
                return new Equity[i];
            }
        }

        public static /* synthetic */ Equity copy$default(Equity equity, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = equity.isClosingShortPosition;
            }
            return equity.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsClosingShortPosition() {
            return this.isClosingShortPosition;
        }

        public final Equity copy(boolean isClosingShortPosition) {
            return new Equity(isClosingShortPosition);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Equity) && this.isClosingShortPosition == ((Equity) other).isClosingShortPosition;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isClosingShortPosition);
        }

        public String toString() {
            return "Equity(isClosingShortPosition=" + this.isClosingShortPosition + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isClosingShortPosition ? 1 : 0);
        }

        public final boolean isClosingShortPosition() {
            return this.isClosingShortPosition;
        }

        public Equity(boolean z) {
            super(null);
            this.isClosingShortPosition = z;
        }
    }

    /* compiled from: AccountSwitcher.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails$Index;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", "dummy", "", "<init>", "(Z)V", "getDummy", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccountDetails$Index, reason: from toString */
    public static final /* data */ class Index extends AccountSwitcher3 {
        public static final Parcelable.Creator<Index> CREATOR = new Creator();
        private final boolean dummy;

        /* compiled from: AccountSwitcher.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccountDetails$Index$Creator */
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Index> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Index createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Index(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Index[] newArray(int i) {
                return new Index[i];
            }
        }

        public Index() {
            this(false, 1, null);
        }

        public static /* synthetic */ Index copy$default(Index index, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = index.dummy;
            }
            return index.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getDummy() {
            return this.dummy;
        }

        public final Index copy(boolean dummy) {
            return new Index(dummy);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Index) && this.dummy == ((Index) other).dummy;
        }

        public int hashCode() {
            return Boolean.hashCode(this.dummy);
        }

        public String toString() {
            return "Index(dummy=" + this.dummy + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.dummy ? 1 : 0);
        }

        public /* synthetic */ Index(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getDummy() {
            return this.dummy;
        }

        public Index(boolean z) {
            super(null);
            this.dummy = z;
        }
    }

    /* compiled from: AccountSwitcher.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails$Options;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", "dummy", "", "<init>", "(Z)V", "getDummy", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccountDetails$Options, reason: from toString */
    public static final /* data */ class Options extends AccountSwitcher3 {
        public static final Parcelable.Creator<Options> CREATOR = new Creator();
        private final boolean dummy;

        /* compiled from: AccountSwitcher.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccountDetails$Options$Creator */
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Options> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Options(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options[] newArray(int i) {
                return new Options[i];
            }
        }

        public Options() {
            this(false, 1, null);
        }

        public static /* synthetic */ Options copy$default(Options options, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = options.dummy;
            }
            return options.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getDummy() {
            return this.dummy;
        }

        public final Options copy(boolean dummy) {
            return new Options(dummy);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Options) && this.dummy == ((Options) other).dummy;
        }

        public int hashCode() {
            return Boolean.hashCode(this.dummy);
        }

        public String toString() {
            return "Options(dummy=" + this.dummy + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.dummy ? 1 : 0);
        }

        public /* synthetic */ Options(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getDummy() {
            return this.dummy;
        }

        public Options(boolean z) {
            super(null);
            this.dummy = z;
        }
    }

    /* compiled from: AccountSwitcher.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccountDetails$AdapterModule */
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(AccountSwitcher3.class, "account_switcher_account_details").withSubtype(Equity.class, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY).withSubtype(Index.class, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX).withSubtype(Options.class, "options");
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
            return polymorphicJsonAdapterFactoryWithSubtype;
        }
    }
}
