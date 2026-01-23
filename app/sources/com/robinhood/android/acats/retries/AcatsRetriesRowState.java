package com.robinhood.android.acats.retries;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsRetriesRowStates.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J?\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u0017¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u0017¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001a¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesRowState;", "Landroid/os/Parcelable;", "labelText", "Lcom/robinhood/utils/resource/StringResource;", "metaText", "metaIconUrl", "", "rowAction", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRetryStep;", "interactionState", "Lcom/robinhood/android/acats/retries/AcatsRetriesRowState$RowInteractionState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRetryStep;Lcom/robinhood/android/acats/retries/AcatsRetriesRowState$RowInteractionState;)V", "getLabelText", "()Lcom/robinhood/utils/resource/StringResource;", "getMetaText", "getMetaIconUrl", "()Ljava/lang/String;", "getRowAction", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRetryStep;", "getInteractionState", "()Lcom/robinhood/android/acats/retries/AcatsRetriesRowState$RowInteractionState;", "isActionable", "", "isActionable$annotations", "()V", "()Z", "requiresAttention", "getRequiresAttention$annotations", "getRequiresAttention", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RowInteractionState", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsRetriesRowState implements Parcelable {
    public static final int $stable = StringResource.$stable;
    public static final Parcelable.Creator<AcatsRetriesRowState> CREATOR = new Creator();
    private final RowInteractionState interactionState;
    private final boolean isActionable;
    private final StringResource labelText;
    private final String metaIconUrl;
    private final StringResource metaText;
    private final boolean requiresAttention;
    private final ApiAcatsTransfer.AcatRetryStep rowAction;

    /* compiled from: AcatsRetriesRowStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AcatsRetriesRowState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsRetriesRowState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcatsRetriesRowState((StringResource) parcel.readParcelable(AcatsRetriesRowState.class.getClassLoader()), (StringResource) parcel.readParcelable(AcatsRetriesRowState.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ApiAcatsTransfer.AcatRetryStep.valueOf(parcel.readString()), RowInteractionState.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsRetriesRowState[] newArray(int i) {
            return new AcatsRetriesRowState[i];
        }
    }

    public static /* synthetic */ AcatsRetriesRowState copy$default(AcatsRetriesRowState acatsRetriesRowState, StringResource stringResource, StringResource stringResource2, String str, ApiAcatsTransfer.AcatRetryStep acatRetryStep, RowInteractionState rowInteractionState, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = acatsRetriesRowState.labelText;
        }
        if ((i & 2) != 0) {
            stringResource2 = acatsRetriesRowState.metaText;
        }
        if ((i & 4) != 0) {
            str = acatsRetriesRowState.metaIconUrl;
        }
        if ((i & 8) != 0) {
            acatRetryStep = acatsRetriesRowState.rowAction;
        }
        if ((i & 16) != 0) {
            rowInteractionState = acatsRetriesRowState.interactionState;
        }
        RowInteractionState rowInteractionState2 = rowInteractionState;
        String str2 = str;
        return acatsRetriesRowState.copy(stringResource, stringResource2, str2, acatRetryStep, rowInteractionState2);
    }

    public static /* synthetic */ void getRequiresAttention$annotations() {
    }

    public static /* synthetic */ void isActionable$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabelText() {
        return this.labelText;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getMetaText() {
        return this.metaText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetaIconUrl() {
        return this.metaIconUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiAcatsTransfer.AcatRetryStep getRowAction() {
        return this.rowAction;
    }

    /* renamed from: component5, reason: from getter */
    public final RowInteractionState getInteractionState() {
        return this.interactionState;
    }

    public final AcatsRetriesRowState copy(StringResource labelText, StringResource metaText, String metaIconUrl, ApiAcatsTransfer.AcatRetryStep rowAction, RowInteractionState interactionState) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        Intrinsics.checkNotNullParameter(interactionState, "interactionState");
        return new AcatsRetriesRowState(labelText, metaText, metaIconUrl, rowAction, interactionState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsRetriesRowState)) {
            return false;
        }
        AcatsRetriesRowState acatsRetriesRowState = (AcatsRetriesRowState) other;
        return Intrinsics.areEqual(this.labelText, acatsRetriesRowState.labelText) && Intrinsics.areEqual(this.metaText, acatsRetriesRowState.metaText) && Intrinsics.areEqual(this.metaIconUrl, acatsRetriesRowState.metaIconUrl) && this.rowAction == acatsRetriesRowState.rowAction && this.interactionState == acatsRetriesRowState.interactionState;
    }

    public int hashCode() {
        int iHashCode = ((this.labelText.hashCode() * 31) + this.metaText.hashCode()) * 31;
        String str = this.metaIconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ApiAcatsTransfer.AcatRetryStep acatRetryStep = this.rowAction;
        return ((iHashCode2 + (acatRetryStep != null ? acatRetryStep.hashCode() : 0)) * 31) + this.interactionState.hashCode();
    }

    public String toString() {
        return "AcatsRetriesRowState(labelText=" + this.labelText + ", metaText=" + this.metaText + ", metaIconUrl=" + this.metaIconUrl + ", rowAction=" + this.rowAction + ", interactionState=" + this.interactionState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.labelText, flags);
        dest.writeParcelable(this.metaText, flags);
        dest.writeString(this.metaIconUrl);
        ApiAcatsTransfer.AcatRetryStep acatRetryStep = this.rowAction;
        if (acatRetryStep == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(acatRetryStep.name());
        }
        dest.writeString(this.interactionState.name());
    }

    public AcatsRetriesRowState(StringResource labelText, StringResource metaText, String str, ApiAcatsTransfer.AcatRetryStep acatRetryStep, RowInteractionState interactionState) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        Intrinsics.checkNotNullParameter(interactionState, "interactionState");
        this.labelText = labelText;
        this.metaText = metaText;
        this.metaIconUrl = str;
        this.rowAction = acatRetryStep;
        this.interactionState = interactionState;
        this.isActionable = interactionState != RowInteractionState.NONE;
        this.requiresAttention = interactionState == RowInteractionState.ERROR || interactionState == RowInteractionState.VERIFY;
    }

    public final StringResource getLabelText() {
        return this.labelText;
    }

    public final StringResource getMetaText() {
        return this.metaText;
    }

    public final String getMetaIconUrl() {
        return this.metaIconUrl;
    }

    public final ApiAcatsTransfer.AcatRetryStep getRowAction() {
        return this.rowAction;
    }

    public /* synthetic */ AcatsRetriesRowState(StringResource stringResource, StringResource stringResource2, String str, ApiAcatsTransfer.AcatRetryStep acatRetryStep, RowInteractionState rowInteractionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : acatRetryStep, (i & 16) != 0 ? RowInteractionState.NONE : rowInteractionState);
    }

    public final RowInteractionState getInteractionState() {
        return this.interactionState;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AcatsRetriesRowStates.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesRowState$RowInteractionState;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ERROR", "VERIFY", "OPTIONAL", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RowInteractionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RowInteractionState[] $VALUES;
        public static final RowInteractionState NONE = new RowInteractionState("NONE", 0);
        public static final RowInteractionState ERROR = new RowInteractionState("ERROR", 1);
        public static final RowInteractionState VERIFY = new RowInteractionState("VERIFY", 2);
        public static final RowInteractionState OPTIONAL = new RowInteractionState("OPTIONAL", 3);

        private static final /* synthetic */ RowInteractionState[] $values() {
            return new RowInteractionState[]{NONE, ERROR, VERIFY, OPTIONAL};
        }

        public static EnumEntries<RowInteractionState> getEntries() {
            return $ENTRIES;
        }

        private RowInteractionState(String str, int i) {
        }

        static {
            RowInteractionState[] rowInteractionStateArr$values = $values();
            $VALUES = rowInteractionStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(rowInteractionStateArr$values);
        }

        public static RowInteractionState valueOf(String str) {
            return (RowInteractionState) Enum.valueOf(RowInteractionState.class, str);
        }

        public static RowInteractionState[] values() {
            return (RowInteractionState[]) $VALUES.clone();
        }
    }

    /* renamed from: isActionable, reason: from getter */
    public final boolean getIsActionable() {
        return this.isActionable;
    }

    public final boolean getRequiresAttention() {
        return this.requiresAttention;
    }
}
