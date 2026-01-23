package com.robinhood.android.support.call.channelavailability;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.RhMultiButtonDialogFragment;
import com.robinhood.models.api.ChannelAvailabilityReason;
import com.robinhood.models.p355ui.AlertButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChannelAvailabilityActionData.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/support/call/channelavailability/ChannelAvailabilityActionData;", "Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$ButtonData;", "text", "", "styleRes", "", "buttonAction", "Lcom/robinhood/models/ui/AlertButtonAction;", "unavailableReason", "Lcom/robinhood/models/api/ChannelAvailabilityReason;", "<init>", "(Ljava/lang/String;ILcom/robinhood/models/ui/AlertButtonAction;Lcom/robinhood/models/api/ChannelAvailabilityReason;)V", "getText", "()Ljava/lang/String;", "getStyleRes", "()I", "getButtonAction", "()Lcom/robinhood/models/ui/AlertButtonAction;", "getUnavailableReason", "()Lcom/robinhood/models/api/ChannelAvailabilityReason;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChannelAvailabilityActionData extends RhMultiButtonDialogFragment.ButtonData {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChannelAvailabilityActionData> CREATOR = new Creator();
    private final AlertButtonAction buttonAction;
    private final int styleRes;
    private final String text;
    private final ChannelAvailabilityReason unavailableReason;

    /* compiled from: ChannelAvailabilityActionData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ChannelAvailabilityActionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelAvailabilityActionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChannelAvailabilityActionData(parcel.readString(), parcel.readInt(), (AlertButtonAction) parcel.readParcelable(ChannelAvailabilityActionData.class.getClassLoader()), parcel.readInt() == 0 ? null : ChannelAvailabilityReason.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelAvailabilityActionData[] newArray(int i) {
            return new ChannelAvailabilityActionData[i];
        }
    }

    public static /* synthetic */ ChannelAvailabilityActionData copy$default(ChannelAvailabilityActionData channelAvailabilityActionData, String str, int i, AlertButtonAction alertButtonAction, ChannelAvailabilityReason channelAvailabilityReason, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = channelAvailabilityActionData.text;
        }
        if ((i2 & 2) != 0) {
            i = channelAvailabilityActionData.styleRes;
        }
        if ((i2 & 4) != 0) {
            alertButtonAction = channelAvailabilityActionData.buttonAction;
        }
        if ((i2 & 8) != 0) {
            channelAvailabilityReason = channelAvailabilityActionData.unavailableReason;
        }
        return channelAvailabilityActionData.copy(str, i, alertButtonAction, channelAvailabilityReason);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStyleRes() {
        return this.styleRes;
    }

    /* renamed from: component3, reason: from getter */
    public final AlertButtonAction getButtonAction() {
        return this.buttonAction;
    }

    /* renamed from: component4, reason: from getter */
    public final ChannelAvailabilityReason getUnavailableReason() {
        return this.unavailableReason;
    }

    public final ChannelAvailabilityActionData copy(String text, int styleRes, AlertButtonAction buttonAction, ChannelAvailabilityReason unavailableReason) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        return new ChannelAvailabilityActionData(text, styleRes, buttonAction, unavailableReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelAvailabilityActionData)) {
            return false;
        }
        ChannelAvailabilityActionData channelAvailabilityActionData = (ChannelAvailabilityActionData) other;
        return Intrinsics.areEqual(this.text, channelAvailabilityActionData.text) && this.styleRes == channelAvailabilityActionData.styleRes && Intrinsics.areEqual(this.buttonAction, channelAvailabilityActionData.buttonAction) && this.unavailableReason == channelAvailabilityActionData.unavailableReason;
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + Integer.hashCode(this.styleRes)) * 31) + this.buttonAction.hashCode()) * 31;
        ChannelAvailabilityReason channelAvailabilityReason = this.unavailableReason;
        return iHashCode + (channelAvailabilityReason == null ? 0 : channelAvailabilityReason.hashCode());
    }

    public String toString() {
        return "ChannelAvailabilityActionData(text=" + this.text + ", styleRes=" + this.styleRes + ", buttonAction=" + this.buttonAction + ", unavailableReason=" + this.unavailableReason + ")";
    }

    @Override // com.robinhood.android.common.ui.RhMultiButtonDialogFragment.ButtonData, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeInt(this.styleRes);
        dest.writeParcelable(this.buttonAction, flags);
        ChannelAvailabilityReason channelAvailabilityReason = this.unavailableReason;
        if (channelAvailabilityReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(channelAvailabilityReason.name());
        }
    }

    @Override // com.robinhood.android.common.ui.RhMultiButtonDialogFragment.ButtonData
    public String getText() {
        return this.text;
    }

    @Override // com.robinhood.android.common.ui.RhMultiButtonDialogFragment.ButtonData
    public int getStyleRes() {
        return this.styleRes;
    }

    public final AlertButtonAction getButtonAction() {
        return this.buttonAction;
    }

    public final ChannelAvailabilityReason getUnavailableReason() {
        return this.unavailableReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelAvailabilityActionData(String text, int i, AlertButtonAction buttonAction, ChannelAvailabilityReason channelAvailabilityReason) {
        super(text, i);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        this.text = text;
        this.styleRes = i;
        this.buttonAction = buttonAction;
        this.unavailableReason = channelAvailabilityReason;
    }
}
