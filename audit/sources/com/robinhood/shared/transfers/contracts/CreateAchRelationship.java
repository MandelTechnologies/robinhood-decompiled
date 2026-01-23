package com.robinhood.shared.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.iav.p154ui.PlaidExchangeTokenFragment;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateAchRelationship.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/transfers/contracts/CreateAchRelationship;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "iavSource", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/shared/transfers/contracts/context/IavSource;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;Lcom/robinhood/models/api/ColorTheme;)V", "getIavSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateAchRelationship implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CreateAchRelationship> CREATOR = new Creator();
    private final IavSource iavSource;
    private final PlaidIavMetadata plaidIavMetadata;
    private final ColorTheme theme;

    /* compiled from: CreateAchRelationship.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateAchRelationship> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateAchRelationship createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreateAchRelationship(IavSource.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PlaidIavMetadata.CREATOR.createFromParcel(parcel), ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateAchRelationship[] newArray(int i) {
            return new CreateAchRelationship[i];
        }
    }

    public static /* synthetic */ CreateAchRelationship copy$default(CreateAchRelationship createAchRelationship, IavSource iavSource, PlaidIavMetadata plaidIavMetadata, ColorTheme colorTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            iavSource = createAchRelationship.iavSource;
        }
        if ((i & 2) != 0) {
            plaidIavMetadata = createAchRelationship.plaidIavMetadata;
        }
        if ((i & 4) != 0) {
            colorTheme = createAchRelationship.theme;
        }
        return createAchRelationship.copy(iavSource, plaidIavMetadata, colorTheme);
    }

    /* renamed from: component1, reason: from getter */
    public final IavSource getIavSource() {
        return this.iavSource;
    }

    /* renamed from: component2, reason: from getter */
    public final PlaidIavMetadata getPlaidIavMetadata() {
        return this.plaidIavMetadata;
    }

    /* renamed from: component3, reason: from getter */
    public final ColorTheme getTheme() {
        return this.theme;
    }

    public final CreateAchRelationship copy(IavSource iavSource, PlaidIavMetadata plaidIavMetadata, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(iavSource, "iavSource");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new CreateAchRelationship(iavSource, plaidIavMetadata, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAchRelationship)) {
            return false;
        }
        CreateAchRelationship createAchRelationship = (CreateAchRelationship) other;
        return this.iavSource == createAchRelationship.iavSource && Intrinsics.areEqual(this.plaidIavMetadata, createAchRelationship.plaidIavMetadata) && this.theme == createAchRelationship.theme;
    }

    public int hashCode() {
        int iHashCode = this.iavSource.hashCode() * 31;
        PlaidIavMetadata plaidIavMetadata = this.plaidIavMetadata;
        return ((iHashCode + (plaidIavMetadata == null ? 0 : plaidIavMetadata.hashCode())) * 31) + this.theme.hashCode();
    }

    public String toString() {
        return "CreateAchRelationship(iavSource=" + this.iavSource + ", plaidIavMetadata=" + this.plaidIavMetadata + ", theme=" + this.theme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.iavSource.name());
        PlaidIavMetadata plaidIavMetadata = this.plaidIavMetadata;
        if (plaidIavMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plaidIavMetadata.writeToParcel(dest, flags);
        }
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CreateAchRelationship(IavSource iavSource, PlaidIavMetadata plaidIavMetadata, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(iavSource, "iavSource");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.iavSource = iavSource;
        this.plaidIavMetadata = plaidIavMetadata;
        this.theme = theme;
    }

    public final IavSource getIavSource() {
        return this.iavSource;
    }

    public final PlaidIavMetadata getPlaidIavMetadata() {
        return this.plaidIavMetadata;
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }
}
