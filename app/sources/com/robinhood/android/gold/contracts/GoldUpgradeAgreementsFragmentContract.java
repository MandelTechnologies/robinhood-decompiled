package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldAgreementsProgressBar;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.rosetta.eventlogging.Context;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpgradeAgreementsFragmentContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract;", "", "<init>", "()V", "Key", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldUpgradeAgreementsFragmentContract {
    public static final GoldUpgradeAgreementsFragmentContract INSTANCE = new GoldUpgradeAgreementsFragmentContract();

    /* compiled from: GoldUpgradeAgreementsFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Callbacks;", "", "onClickFullAgreement", "", "agreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "onClickAgreementsCta", "isSweepChecked", "", "selectedPlanId", "Ljava/util/UUID;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClickAgreementsCta(boolean isSweepChecked, UUID selectedPlanId);

        void onClickFullAgreement(ApiGoldSweepAgreement agreement);
    }

    private GoldUpgradeAgreementsFragmentContract() {
    }

    /* compiled from: GoldUpgradeAgreementsFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "agreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "titleProgressBar", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "isTitleCenterAlignment", "", "showSparkleButton", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;ZZ)V", "getAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getTitleProgressBar", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "()Z", "getShowSparkleButton", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final ApiGoldUpgradeFlow.ApiGoldSweepAgreements agreements;
        private final boolean isTitleCenterAlignment;
        private final Context loggingContext;
        private final boolean showSparkleButton;
        private final ApiGoldAgreementsProgressBar titleProgressBar;

        /* compiled from: GoldUpgradeAgreementsFragmentContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes10.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements = (ApiGoldUpgradeFlow.ApiGoldSweepAgreements) parcel.readParcelable(Key.class.getClassLoader());
                Context context = (Context) parcel.readSerializable();
                ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar = (ApiGoldAgreementsProgressBar) parcel.readParcelable(Key.class.getClassLoader());
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Key(apiGoldSweepAgreements, context, apiGoldAgreementsProgressBar, z2, parcel.readInt() == 0 ? z : true);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, Context context, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldSweepAgreements = key.agreements;
            }
            if ((i & 2) != 0) {
                context = key.loggingContext;
            }
            if ((i & 4) != 0) {
                apiGoldAgreementsProgressBar = key.titleProgressBar;
            }
            if ((i & 8) != 0) {
                z = key.isTitleCenterAlignment;
            }
            if ((i & 16) != 0) {
                z2 = key.showSparkleButton;
            }
            boolean z3 = z2;
            ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar2 = apiGoldAgreementsProgressBar;
            return key.copy(apiGoldSweepAgreements, context, apiGoldAgreementsProgressBar2, z, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getAgreements() {
            return this.agreements;
        }

        /* renamed from: component2, reason: from getter */
        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
            return this.titleProgressBar;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsTitleCenterAlignment() {
            return this.isTitleCenterAlignment;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowSparkleButton() {
            return this.showSparkleButton;
        }

        public final Key copy(ApiGoldUpgradeFlow.ApiGoldSweepAgreements agreements, Context loggingContext, ApiGoldAgreementsProgressBar titleProgressBar, boolean isTitleCenterAlignment, boolean showSparkleButton) {
            Intrinsics.checkNotNullParameter(agreements, "agreements");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Key(agreements, loggingContext, titleProgressBar, isTitleCenterAlignment, showSparkleButton);
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
            return Intrinsics.areEqual(this.agreements, key.agreements) && Intrinsics.areEqual(this.loggingContext, key.loggingContext) && Intrinsics.areEqual(this.titleProgressBar, key.titleProgressBar) && this.isTitleCenterAlignment == key.isTitleCenterAlignment && this.showSparkleButton == key.showSparkleButton;
        }

        public int hashCode() {
            int iHashCode = ((this.agreements.hashCode() * 31) + this.loggingContext.hashCode()) * 31;
            ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar = this.titleProgressBar;
            return ((((iHashCode + (apiGoldAgreementsProgressBar == null ? 0 : apiGoldAgreementsProgressBar.hashCode())) * 31) + Boolean.hashCode(this.isTitleCenterAlignment)) * 31) + Boolean.hashCode(this.showSparkleButton);
        }

        public String toString() {
            return "Key(agreements=" + this.agreements + ", loggingContext=" + this.loggingContext + ", titleProgressBar=" + this.titleProgressBar + ", isTitleCenterAlignment=" + this.isTitleCenterAlignment + ", showSparkleButton=" + this.showSparkleButton + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.agreements, flags);
            dest.writeSerializable(this.loggingContext);
            dest.writeParcelable(this.titleProgressBar, flags);
            dest.writeInt(this.isTitleCenterAlignment ? 1 : 0);
            dest.writeInt(this.showSparkleButton ? 1 : 0);
        }

        public Key(ApiGoldUpgradeFlow.ApiGoldSweepAgreements agreements, Context loggingContext, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(agreements, "agreements");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.agreements = agreements;
            this.loggingContext = loggingContext;
            this.titleProgressBar = apiGoldAgreementsProgressBar;
            this.isTitleCenterAlignment = z;
            this.showSparkleButton = z2;
        }

        public /* synthetic */ Key(ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, Context context, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(apiGoldSweepAgreements, context, (i & 4) != 0 ? null : apiGoldAgreementsProgressBar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
        }

        public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getAgreements() {
            return this.agreements;
        }

        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
            return this.titleProgressBar;
        }

        public final boolean isTitleCenterAlignment() {
            return this.isTitleCenterAlignment;
        }

        public final boolean getShowSparkleButton() {
            return this.showSparkleButton;
        }
    }
}
