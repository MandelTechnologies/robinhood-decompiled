package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryPostAgreementsKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "applicationId", "Ljava/util/UUID;", "source", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/UUID;Ljava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getApplicationId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryPostAgreementsKey implements TabFragmentKey {
    public static final Parcelable.Creator<AdvisoryPostAgreementsKey> CREATOR = new Creator();
    private final UUID applicationId;
    private final BrokerageAccountType brokerageAccountType;
    private final String source;

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvisoryPostAgreementsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryPostAgreementsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisoryPostAgreementsKey(BrokerageAccountType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryPostAgreementsKey[] newArray(int i) {
            return new AdvisoryPostAgreementsKey[i];
        }
    }

    public static /* synthetic */ AdvisoryPostAgreementsKey copy$default(AdvisoryPostAgreementsKey advisoryPostAgreementsKey, BrokerageAccountType brokerageAccountType, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = advisoryPostAgreementsKey.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            uuid = advisoryPostAgreementsKey.applicationId;
        }
        if ((i & 4) != 0) {
            str = advisoryPostAgreementsKey.source;
        }
        return advisoryPostAgreementsKey.copy(brokerageAccountType, uuid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final AdvisoryPostAgreementsKey copy(BrokerageAccountType brokerageAccountType, UUID applicationId, String source) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return new AdvisoryPostAgreementsKey(brokerageAccountType, applicationId, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryPostAgreementsKey)) {
            return false;
        }
        AdvisoryPostAgreementsKey advisoryPostAgreementsKey = (AdvisoryPostAgreementsKey) other;
        return this.brokerageAccountType == advisoryPostAgreementsKey.brokerageAccountType && Intrinsics.areEqual(this.applicationId, advisoryPostAgreementsKey.applicationId) && Intrinsics.areEqual(this.source, advisoryPostAgreementsKey.source);
    }

    public int hashCode() {
        int iHashCode = ((this.brokerageAccountType.hashCode() * 31) + this.applicationId.hashCode()) * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvisoryPostAgreementsKey(brokerageAccountType=" + this.brokerageAccountType + ", applicationId=" + this.applicationId + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.brokerageAccountType.name());
        dest.writeSerializable(this.applicationId);
        dest.writeString(this.source);
    }

    public AdvisoryPostAgreementsKey(BrokerageAccountType brokerageAccountType, UUID applicationId, String str) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.brokerageAccountType = brokerageAccountType;
        this.applicationId = applicationId;
        this.source = str;
    }

    public /* synthetic */ AdvisoryPostAgreementsKey(BrokerageAccountType brokerageAccountType, UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brokerageAccountType, uuid, (i & 4) != 0 ? null : str);
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final UUID getApplicationId() {
        return this.applicationId;
    }

    public final String getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
