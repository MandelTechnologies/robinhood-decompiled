package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.models.api.ColorTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferIntentKey.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/AchTransferIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "useScheduleAutomaticDepositV2", "", "isFromRhfOnboarding", "useAchromaticOverlay", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;ZZZLcom/robinhood/models/api/ColorTheme;)V", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getUseScheduleAutomaticDepositV2", "()Z", "getUseAchromaticOverlay", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class AchTransferIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<AchTransferIntentKey> CREATOR = new Creator();
    private final boolean isFromRhfOnboarding;
    private final ColorTheme theme;
    private final TransferContext transferContext;
    private final boolean useAchromaticOverlay;
    private final boolean useScheduleAutomaticDepositV2;

    /* compiled from: AchTransferIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<AchTransferIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchTransferIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            TransferContext transferContext = (TransferContext) parcel.readParcelable(AchTransferIntentKey.class.getClassLoader());
            boolean z3 = false;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new AchTransferIntentKey(transferContext, z3, z4, z2, ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchTransferIntentKey[] newArray(int i) {
            return new AchTransferIntentKey[i];
        }
    }

    public static /* synthetic */ AchTransferIntentKey copy$default(AchTransferIntentKey achTransferIntentKey, TransferContext transferContext, boolean z, boolean z2, boolean z3, ColorTheme colorTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            transferContext = achTransferIntentKey.transferContext;
        }
        if ((i & 2) != 0) {
            z = achTransferIntentKey.useScheduleAutomaticDepositV2;
        }
        if ((i & 4) != 0) {
            z2 = achTransferIntentKey.isFromRhfOnboarding;
        }
        if ((i & 8) != 0) {
            z3 = achTransferIntentKey.useAchromaticOverlay;
        }
        if ((i & 16) != 0) {
            colorTheme = achTransferIntentKey.theme;
        }
        ColorTheme colorTheme2 = colorTheme;
        boolean z4 = z2;
        return achTransferIntentKey.copy(transferContext, z, z4, z3, colorTheme2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferContext getTransferContext() {
        return this.transferContext;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUseScheduleAutomaticDepositV2() {
        return this.useScheduleAutomaticDepositV2;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUseAchromaticOverlay() {
        return this.useAchromaticOverlay;
    }

    /* renamed from: component5, reason: from getter */
    public final ColorTheme getTheme() {
        return this.theme;
    }

    public final AchTransferIntentKey copy(TransferContext transferContext, boolean useScheduleAutomaticDepositV2, boolean isFromRhfOnboarding, boolean useAchromaticOverlay, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new AchTransferIntentKey(transferContext, useScheduleAutomaticDepositV2, isFromRhfOnboarding, useAchromaticOverlay, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchTransferIntentKey)) {
            return false;
        }
        AchTransferIntentKey achTransferIntentKey = (AchTransferIntentKey) other;
        return Intrinsics.areEqual(this.transferContext, achTransferIntentKey.transferContext) && this.useScheduleAutomaticDepositV2 == achTransferIntentKey.useScheduleAutomaticDepositV2 && this.isFromRhfOnboarding == achTransferIntentKey.isFromRhfOnboarding && this.useAchromaticOverlay == achTransferIntentKey.useAchromaticOverlay && this.theme == achTransferIntentKey.theme;
    }

    public int hashCode() {
        return (((((((this.transferContext.hashCode() * 31) + Boolean.hashCode(this.useScheduleAutomaticDepositV2)) * 31) + Boolean.hashCode(this.isFromRhfOnboarding)) * 31) + Boolean.hashCode(this.useAchromaticOverlay)) * 31) + this.theme.hashCode();
    }

    public String toString() {
        return "AchTransferIntentKey(transferContext=" + this.transferContext + ", useScheduleAutomaticDepositV2=" + this.useScheduleAutomaticDepositV2 + ", isFromRhfOnboarding=" + this.isFromRhfOnboarding + ", useAchromaticOverlay=" + this.useAchromaticOverlay + ", theme=" + this.theme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.transferContext, flags);
        dest.writeInt(this.useScheduleAutomaticDepositV2 ? 1 : 0);
        dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
        dest.writeInt(this.useAchromaticOverlay ? 1 : 0);
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public AchTransferIntentKey(TransferContext transferContext, boolean z, boolean z2, boolean z3, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.transferContext = transferContext;
        this.useScheduleAutomaticDepositV2 = z;
        this.isFromRhfOnboarding = z2;
        this.useAchromaticOverlay = z3;
        this.theme = theme;
    }

    public final TransferContext getTransferContext() {
        return this.transferContext;
    }

    public final boolean getUseScheduleAutomaticDepositV2() {
        return this.useScheduleAutomaticDepositV2;
    }

    public final boolean isFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    public final boolean getUseAchromaticOverlay() {
        return this.useAchromaticOverlay;
    }

    public /* synthetic */ AchTransferIntentKey(TransferContext transferContext, boolean z, boolean z2, boolean z3, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferContext, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? ColorTheme.DEFAULT : colorTheme);
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }
}
