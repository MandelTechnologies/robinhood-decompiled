package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpgradeConfirmationFragmentContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract;", "", "<init>", "()V", "Key", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldUpgradeConfirmationFragmentContract {
    public static final GoldUpgradeConfirmationFragmentContract INSTANCE = new GoldUpgradeConfirmationFragmentContract();

    /* compiled from: GoldUpgradeConfirmationFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract$Callbacks;", "", "onClickConfirmationCta", "", "isSweepEnabled", "", "isActionHandled", "onClickConfirmationFailedCta", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClickConfirmationCta(boolean isSweepEnabled, boolean isActionHandled);

        void onClickConfirmationFailedCta();
    }

    private GoldUpgradeConfirmationFragmentContract() {
    }

    /* compiled from: GoldUpgradeConfirmationFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "goldConfirmation", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "isSweepEnabled", "", "<init>", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;Z)V", "getOutcome", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getGoldConfirmation", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation;
        private final boolean isSweepEnabled;
        private final Context loggingContext;
        private final GoldUpgradeOutcome outcome;

        /* compiled from: GoldUpgradeConfirmationFragmentContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes10.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((GoldUpgradeOutcome) parcel.readParcelable(Key.class.getClassLoader()), (Context) parcel.readSerializable(), (ApiGoldUpgradeFlow.ApiGoldConfirmation) parcel.readParcelable(Key.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, GoldUpgradeOutcome goldUpgradeOutcome, Context context, ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                goldUpgradeOutcome = key.outcome;
            }
            if ((i & 2) != 0) {
                context = key.loggingContext;
            }
            if ((i & 4) != 0) {
                apiGoldConfirmation = key.goldConfirmation;
            }
            if ((i & 8) != 0) {
                z = key.isSweepEnabled;
            }
            return key.copy(goldUpgradeOutcome, context, apiGoldConfirmation, z);
        }

        /* renamed from: component1, reason: from getter */
        public final GoldUpgradeOutcome getOutcome() {
            return this.outcome;
        }

        /* renamed from: component2, reason: from getter */
        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiGoldUpgradeFlow.ApiGoldConfirmation getGoldConfirmation() {
            return this.goldConfirmation;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSweepEnabled() {
            return this.isSweepEnabled;
        }

        public final Key copy(GoldUpgradeOutcome outcome, Context loggingContext, ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation, boolean isSweepEnabled) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(goldConfirmation, "goldConfirmation");
            return new Key(outcome, loggingContext, goldConfirmation, isSweepEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.outcome, key.outcome) && Intrinsics.areEqual(this.loggingContext, key.loggingContext) && Intrinsics.areEqual(this.goldConfirmation, key.goldConfirmation) && this.isSweepEnabled == key.isSweepEnabled;
        }

        public int hashCode() {
            return (((((this.outcome.hashCode() * 31) + this.loggingContext.hashCode()) * 31) + this.goldConfirmation.hashCode()) * 31) + Boolean.hashCode(this.isSweepEnabled);
        }

        public String toString() {
            return "Key(outcome=" + this.outcome + ", loggingContext=" + this.loggingContext + ", goldConfirmation=" + this.goldConfirmation + ", isSweepEnabled=" + this.isSweepEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.outcome, flags);
            dest.writeSerializable(this.loggingContext);
            dest.writeParcelable(this.goldConfirmation, flags);
            dest.writeInt(this.isSweepEnabled ? 1 : 0);
        }

        public Key(GoldUpgradeOutcome outcome, Context loggingContext, ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation, boolean z) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(goldConfirmation, "goldConfirmation");
            this.outcome = outcome;
            this.loggingContext = loggingContext;
            this.goldConfirmation = goldConfirmation;
            this.isSweepEnabled = z;
        }

        public final GoldUpgradeOutcome getOutcome() {
            return this.outcome;
        }

        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        public final ApiGoldUpgradeFlow.ApiGoldConfirmation getGoldConfirmation() {
            return this.goldConfirmation;
        }

        public final boolean isSweepEnabled() {
            return this.isSweepEnabled;
        }
    }
}
