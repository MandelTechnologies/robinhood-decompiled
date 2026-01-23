package com.robinhood.android.acats.retries.activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acats.retries.AcatsRetriesRowState;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsRetriesViewState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00018B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003Jm\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001e¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState;", "Landroid/os/Parcelable;", "headerTitle", "Lcom/robinhood/utils/resource/StringResource;", "headerInfoBanner", "rowStates", "", "Lcom/robinhood/android/acats/retries/AcatsRetriesRowState;", "dtcNumber", "", "rhsAccountNumber", "submissionState", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState$SubmissionState;", "isReady", "", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "enableSubmitButton", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState$SubmissionState;ZLcom/robinhood/android/acatsin/util/AcatsInScreenContext;Z)V", "getHeaderTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getHeaderInfoBanner", "getRowStates", "()Ljava/util/List;", "getDtcNumber", "()Ljava/lang/String;", "getRhsAccountNumber", "getSubmissionState", "()Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState$SubmissionState;", "()Z", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getEnableSubmitButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SubmissionState", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsRetriesViewState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AcatsRetriesViewState> CREATOR = new Creator();
    private final String dtcNumber;
    private final boolean enableSubmitButton;
    private final StringResource headerInfoBanner;
    private final StringResource headerTitle;
    private final boolean isReady;
    private final String rhsAccountNumber;
    private final List<AcatsRetriesRowState> rowStates;
    private final AcatsInScreenContext screenContext;
    private final SubmissionState submissionState;

    /* compiled from: AcatsRetriesViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AcatsRetriesViewState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsRetriesViewState createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StringResource stringResource = (StringResource) parcel.readParcelable(AcatsRetriesViewState.class.getClassLoader());
            StringResource stringResource2 = (StringResource) parcel.readParcelable(AcatsRetriesViewState.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AcatsRetriesRowState.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            SubmissionState submissionStateValueOf = SubmissionState.valueOf(parcel.readString());
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new AcatsRetriesViewState(stringResource, stringResource2, arrayList, string2, string3, submissionStateValueOf, z2, (AcatsInScreenContext) parcel.readParcelable(AcatsRetriesViewState.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsRetriesViewState[] newArray(int i) {
            return new AcatsRetriesViewState[i];
        }
    }

    public static /* synthetic */ AcatsRetriesViewState copy$default(AcatsRetriesViewState acatsRetriesViewState, StringResource stringResource, StringResource stringResource2, List list, String str, String str2, SubmissionState submissionState, boolean z, AcatsInScreenContext acatsInScreenContext, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = acatsRetriesViewState.headerTitle;
        }
        if ((i & 2) != 0) {
            stringResource2 = acatsRetriesViewState.headerInfoBanner;
        }
        if ((i & 4) != 0) {
            list = acatsRetriesViewState.rowStates;
        }
        if ((i & 8) != 0) {
            str = acatsRetriesViewState.dtcNumber;
        }
        if ((i & 16) != 0) {
            str2 = acatsRetriesViewState.rhsAccountNumber;
        }
        if ((i & 32) != 0) {
            submissionState = acatsRetriesViewState.submissionState;
        }
        if ((i & 64) != 0) {
            z = acatsRetriesViewState.isReady;
        }
        if ((i & 128) != 0) {
            acatsInScreenContext = acatsRetriesViewState.screenContext;
        }
        if ((i & 256) != 0) {
            z2 = acatsRetriesViewState.enableSubmitButton;
        }
        AcatsInScreenContext acatsInScreenContext2 = acatsInScreenContext;
        boolean z3 = z2;
        SubmissionState submissionState2 = submissionState;
        boolean z4 = z;
        String str3 = str2;
        List list2 = list;
        return acatsRetriesViewState.copy(stringResource, stringResource2, list2, str, str3, submissionState2, z4, acatsInScreenContext2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getHeaderTitle() {
        return this.headerTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getHeaderInfoBanner() {
        return this.headerInfoBanner;
    }

    public final List<AcatsRetriesRowState> component3() {
        return this.rowStates;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDtcNumber() {
        return this.dtcNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final SubmissionState getSubmissionState() {
        return this.submissionState;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsReady() {
        return this.isReady;
    }

    /* renamed from: component8, reason: from getter */
    public final AcatsInScreenContext getScreenContext() {
        return this.screenContext;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getEnableSubmitButton() {
        return this.enableSubmitButton;
    }

    public final AcatsRetriesViewState copy(StringResource headerTitle, StringResource headerInfoBanner, List<AcatsRetriesRowState> rowStates, String dtcNumber, String rhsAccountNumber, SubmissionState submissionState, boolean isReady, AcatsInScreenContext screenContext, boolean enableSubmitButton) {
        Intrinsics.checkNotNullParameter(rowStates, "rowStates");
        Intrinsics.checkNotNullParameter(dtcNumber, "dtcNumber");
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(submissionState, "submissionState");
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        return new AcatsRetriesViewState(headerTitle, headerInfoBanner, rowStates, dtcNumber, rhsAccountNumber, submissionState, isReady, screenContext, enableSubmitButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsRetriesViewState)) {
            return false;
        }
        AcatsRetriesViewState acatsRetriesViewState = (AcatsRetriesViewState) other;
        return Intrinsics.areEqual(this.headerTitle, acatsRetriesViewState.headerTitle) && Intrinsics.areEqual(this.headerInfoBanner, acatsRetriesViewState.headerInfoBanner) && Intrinsics.areEqual(this.rowStates, acatsRetriesViewState.rowStates) && Intrinsics.areEqual(this.dtcNumber, acatsRetriesViewState.dtcNumber) && Intrinsics.areEqual(this.rhsAccountNumber, acatsRetriesViewState.rhsAccountNumber) && this.submissionState == acatsRetriesViewState.submissionState && this.isReady == acatsRetriesViewState.isReady && Intrinsics.areEqual(this.screenContext, acatsRetriesViewState.screenContext) && this.enableSubmitButton == acatsRetriesViewState.enableSubmitButton;
    }

    public int hashCode() {
        StringResource stringResource = this.headerTitle;
        int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
        StringResource stringResource2 = this.headerInfoBanner;
        return ((((((((((((((iHashCode + (stringResource2 != null ? stringResource2.hashCode() : 0)) * 31) + this.rowStates.hashCode()) * 31) + this.dtcNumber.hashCode()) * 31) + this.rhsAccountNumber.hashCode()) * 31) + this.submissionState.hashCode()) * 31) + Boolean.hashCode(this.isReady)) * 31) + this.screenContext.hashCode()) * 31) + Boolean.hashCode(this.enableSubmitButton);
    }

    public String toString() {
        return "AcatsRetriesViewState(headerTitle=" + this.headerTitle + ", headerInfoBanner=" + this.headerInfoBanner + ", rowStates=" + this.rowStates + ", dtcNumber=" + this.dtcNumber + ", rhsAccountNumber=" + this.rhsAccountNumber + ", submissionState=" + this.submissionState + ", isReady=" + this.isReady + ", screenContext=" + this.screenContext + ", enableSubmitButton=" + this.enableSubmitButton + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.headerTitle, flags);
        dest.writeParcelable(this.headerInfoBanner, flags);
        List<AcatsRetriesRowState> list = this.rowStates;
        dest.writeInt(list.size());
        Iterator<AcatsRetriesRowState> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.dtcNumber);
        dest.writeString(this.rhsAccountNumber);
        dest.writeString(this.submissionState.name());
        dest.writeInt(this.isReady ? 1 : 0);
        dest.writeParcelable(this.screenContext, flags);
        dest.writeInt(this.enableSubmitButton ? 1 : 0);
    }

    public AcatsRetriesViewState(StringResource stringResource, StringResource stringResource2, List<AcatsRetriesRowState> rowStates, String dtcNumber, String rhsAccountNumber, SubmissionState submissionState, boolean z, AcatsInScreenContext screenContext, boolean z2) {
        Intrinsics.checkNotNullParameter(rowStates, "rowStates");
        Intrinsics.checkNotNullParameter(dtcNumber, "dtcNumber");
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(submissionState, "submissionState");
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        this.headerTitle = stringResource;
        this.headerInfoBanner = stringResource2;
        this.rowStates = rowStates;
        this.dtcNumber = dtcNumber;
        this.rhsAccountNumber = rhsAccountNumber;
        this.submissionState = submissionState;
        this.isReady = z;
        this.screenContext = screenContext;
        this.enableSubmitButton = z2;
    }

    public final StringResource getHeaderTitle() {
        return this.headerTitle;
    }

    public final StringResource getHeaderInfoBanner() {
        return this.headerInfoBanner;
    }

    public final List<AcatsRetriesRowState> getRowStates() {
        return this.rowStates;
    }

    public final String getDtcNumber() {
        return this.dtcNumber;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final SubmissionState getSubmissionState() {
        return this.submissionState;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    public /* synthetic */ AcatsRetriesViewState(StringResource stringResource, StringResource stringResource2, List list, String str, String str2, SubmissionState submissionState, boolean z, AcatsInScreenContext acatsInScreenContext, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        AcatsInScreenContext acatsInScreenContext2;
        if ((i & 128) != 0) {
            acatsInScreenContext2 = new AcatsInScreenContext(null, true, false, null, null, null, true, str, false, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, null);
        } else {
            acatsInScreenContext2 = acatsInScreenContext;
        }
        this(stringResource, stringResource2, list, str, str2, submissionState, z, acatsInScreenContext2, z2);
    }

    public final AcatsInScreenContext getScreenContext() {
        return this.screenContext;
    }

    public final boolean getEnableSubmitButton() {
        return this.enableSubmitButton;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AcatsRetriesViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState$SubmissionState;", "", "ready", "", "<init>", "(Ljava/lang/String;IZ)V", "getReady", "()Z", "READY", "LOADING", "DISABLED", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SubmissionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SubmissionState[] $VALUES;
        private final boolean ready;
        public static final SubmissionState READY = new SubmissionState("READY", 0, true);
        public static final SubmissionState LOADING = new SubmissionState("LOADING", 1, false);
        public static final SubmissionState DISABLED = new SubmissionState("DISABLED", 2, false);

        private static final /* synthetic */ SubmissionState[] $values() {
            return new SubmissionState[]{READY, LOADING, DISABLED};
        }

        public static EnumEntries<SubmissionState> getEntries() {
            return $ENTRIES;
        }

        private SubmissionState(String str, int i, boolean z) {
            this.ready = z;
        }

        public final boolean getReady() {
            return this.ready;
        }

        static {
            SubmissionState[] submissionStateArr$values = $values();
            $VALUES = submissionStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(submissionStateArr$values);
        }

        public static SubmissionState valueOf(String str) {
            return (SubmissionState) Enum.valueOf(SubmissionState.class, str);
        }

        public static SubmissionState[] values() {
            return (SubmissionState[]) $VALUES.clone();
        }
    }
}
