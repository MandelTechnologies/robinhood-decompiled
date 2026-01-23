package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpgradeSubmissionFragmentContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeSubmissionFragmentContract;", "", "<init>", "()V", "Key", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldUpgradeSubmissionFragmentContract {
    public static final GoldUpgradeSubmissionFragmentContract INSTANCE = new GoldUpgradeSubmissionFragmentContract();

    /* compiled from: GoldUpgradeSubmissionFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeSubmissionFragmentContract$Callbacks;", "", "onUpgraded", "", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "newToSweep", "", "planId", "Ljava/util/UUID;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onUpgraded(GoldUpgradeOutcome outcome, boolean newToSweep, UUID planId);
    }

    private GoldUpgradeSubmissionFragmentContract() {
    }

    /* compiled from: GoldUpgradeSubmissionFragmentContract.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jx\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u000202J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\rHÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeSubmissionFragmentContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "planId", "Ljava/util/UUID;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "loggingScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen;", "enableSweep", "", "enableSlip", "promotion", "", "signedAgreementTypes", "", "isFromRhfOnboarding", "backupPaymentInstrument", "Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;ZLcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)V", "getPlanId", "()Ljava/util/UUID;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getEnableSweep", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableSlip", "getPromotion", "()Ljava/lang/String;", "getSignedAgreementTypes", "()Ljava/util/List;", "()Z", "getBackupPaymentInstrument", "()Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;ZLcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)Lcom/robinhood/android/gold/contracts/GoldUpgradeSubmissionFragmentContract$Key;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final ApiGoldPaymentInstrument backupPaymentInstrument;
        private final Boolean enableSlip;
        private final Boolean enableSweep;
        private final boolean isFromRhfOnboarding;
        private final Context loggingContext;
        private final Screen loggingScreenName;
        private final UUID planId;
        private final String promotion;
        private final List<String> signedAgreementTypes;

        /* compiled from: GoldUpgradeSubmissionFragmentContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes10.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                Context context = (Context) parcel.readSerializable();
                Screen screen = (Screen) parcel.readSerializable();
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string2 = parcel.readString();
                boolean z = true;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new Key(uuid, context, screen, boolValueOf, boolValueOf2, string2, arrayListCreateStringArrayList, z, (ApiGoldPaymentInstrument) parcel.readParcelable(Key.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, UUID uuid, Context context, Screen screen, Boolean bool, Boolean bool2, String str, List list, boolean z, ApiGoldPaymentInstrument apiGoldPaymentInstrument, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = key.planId;
            }
            if ((i & 2) != 0) {
                context = key.loggingContext;
            }
            if ((i & 4) != 0) {
                screen = key.loggingScreenName;
            }
            if ((i & 8) != 0) {
                bool = key.enableSweep;
            }
            if ((i & 16) != 0) {
                bool2 = key.enableSlip;
            }
            if ((i & 32) != 0) {
                str = key.promotion;
            }
            if ((i & 64) != 0) {
                list = key.signedAgreementTypes;
            }
            if ((i & 128) != 0) {
                z = key.isFromRhfOnboarding;
            }
            if ((i & 256) != 0) {
                apiGoldPaymentInstrument = key.backupPaymentInstrument;
            }
            boolean z2 = z;
            ApiGoldPaymentInstrument apiGoldPaymentInstrument2 = apiGoldPaymentInstrument;
            String str2 = str;
            List list2 = list;
            Boolean bool3 = bool2;
            Screen screen2 = screen;
            return key.copy(uuid, context, screen2, bool, bool3, str2, list2, z2, apiGoldPaymentInstrument2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getPlanId() {
            return this.planId;
        }

        /* renamed from: component2, reason: from getter */
        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component3, reason: from getter */
        public final Screen getLoggingScreenName() {
            return this.loggingScreenName;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getEnableSweep() {
            return this.enableSweep;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getEnableSlip() {
            return this.enableSlip;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPromotion() {
            return this.promotion;
        }

        public final List<String> component7() {
            return this.signedAgreementTypes;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsFromRhfOnboarding() {
            return this.isFromRhfOnboarding;
        }

        /* renamed from: component9, reason: from getter */
        public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
            return this.backupPaymentInstrument;
        }

        public final Key copy(UUID planId, Context loggingContext, Screen loggingScreenName, Boolean enableSweep, Boolean enableSlip, String promotion, List<String> signedAgreementTypes, boolean isFromRhfOnboarding, ApiGoldPaymentInstrument backupPaymentInstrument) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(loggingScreenName, "loggingScreenName");
            return new Key(planId, loggingContext, loggingScreenName, enableSweep, enableSlip, promotion, signedAgreementTypes, isFromRhfOnboarding, backupPaymentInstrument);
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
            return Intrinsics.areEqual(this.planId, key.planId) && Intrinsics.areEqual(this.loggingContext, key.loggingContext) && Intrinsics.areEqual(this.loggingScreenName, key.loggingScreenName) && Intrinsics.areEqual(this.enableSweep, key.enableSweep) && Intrinsics.areEqual(this.enableSlip, key.enableSlip) && Intrinsics.areEqual(this.promotion, key.promotion) && Intrinsics.areEqual(this.signedAgreementTypes, key.signedAgreementTypes) && this.isFromRhfOnboarding == key.isFromRhfOnboarding && Intrinsics.areEqual(this.backupPaymentInstrument, key.backupPaymentInstrument);
        }

        public int hashCode() {
            int iHashCode = ((((this.planId.hashCode() * 31) + this.loggingContext.hashCode()) * 31) + this.loggingScreenName.hashCode()) * 31;
            Boolean bool = this.enableSweep;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.enableSlip;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.promotion;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.signedAgreementTypes;
            int iHashCode5 = (((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isFromRhfOnboarding)) * 31;
            ApiGoldPaymentInstrument apiGoldPaymentInstrument = this.backupPaymentInstrument;
            return iHashCode5 + (apiGoldPaymentInstrument != null ? apiGoldPaymentInstrument.hashCode() : 0);
        }

        public String toString() {
            return "Key(planId=" + this.planId + ", loggingContext=" + this.loggingContext + ", loggingScreenName=" + this.loggingScreenName + ", enableSweep=" + this.enableSweep + ", enableSlip=" + this.enableSlip + ", promotion=" + this.promotion + ", signedAgreementTypes=" + this.signedAgreementTypes + ", isFromRhfOnboarding=" + this.isFromRhfOnboarding + ", backupPaymentInstrument=" + this.backupPaymentInstrument + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.planId);
            dest.writeSerializable(this.loggingContext);
            dest.writeSerializable(this.loggingScreenName);
            Boolean bool = this.enableSweep;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.enableSlip;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.promotion);
            dest.writeStringList(this.signedAgreementTypes);
            dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
            dest.writeParcelable(this.backupPaymentInstrument, flags);
        }

        public Key(UUID planId, Context loggingContext, Screen loggingScreenName, Boolean bool, Boolean bool2, String str, List<String> list, boolean z, ApiGoldPaymentInstrument apiGoldPaymentInstrument) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(loggingScreenName, "loggingScreenName");
            this.planId = planId;
            this.loggingContext = loggingContext;
            this.loggingScreenName = loggingScreenName;
            this.enableSweep = bool;
            this.enableSlip = bool2;
            this.promotion = str;
            this.signedAgreementTypes = list;
            this.isFromRhfOnboarding = z;
            this.backupPaymentInstrument = apiGoldPaymentInstrument;
        }

        public final UUID getPlanId() {
            return this.planId;
        }

        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        public final Screen getLoggingScreenName() {
            return this.loggingScreenName;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Key(java.util.UUID r13, com.robinhood.rosetta.eventlogging.Context r14, com.robinhood.rosetta.eventlogging.Screen r15, java.lang.Boolean r16, java.lang.Boolean r17, java.lang.String r18, java.util.List r19, boolean r20, com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 8
                if (r1 == 0) goto La
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r6 = r1
                goto Lc
            La:
                r6 = r16
            Lc:
                r1 = r0 & 16
                if (r1 == 0) goto L14
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r7 = r1
                goto L16
            L14:
                r7 = r17
            L16:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L1d
                r8 = r2
                goto L1f
            L1d:
                r8 = r18
            L1f:
                r1 = r0 & 64
                if (r1 == 0) goto L25
                r9 = r2
                goto L27
            L25:
                r9 = r19
            L27:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L2e
                r1 = 0
                r10 = r1
                goto L30
            L2e:
                r10 = r20
            L30:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L3a
                r11 = r2
                r3 = r13
                r4 = r14
                r5 = r15
                r2 = r12
                goto L40
            L3a:
                r11 = r21
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
            L40:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.contracts.GoldUpgradeSubmissionFragmentContract.Key.<init>(java.util.UUID, com.robinhood.rosetta.eventlogging.Context, com.robinhood.rosetta.eventlogging.Screen, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List, boolean, com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Boolean getEnableSweep() {
            return this.enableSweep;
        }

        public final Boolean getEnableSlip() {
            return this.enableSlip;
        }

        public final String getPromotion() {
            return this.promotion;
        }

        public final List<String> getSignedAgreementTypes() {
            return this.signedAgreementTypes;
        }

        public final boolean isFromRhfOnboarding() {
            return this.isFromRhfOnboarding;
        }

        public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
            return this.backupPaymentInstrument;
        }
    }
}
