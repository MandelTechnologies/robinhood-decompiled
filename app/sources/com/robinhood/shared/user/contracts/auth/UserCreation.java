package com.robinhood.shared.user.contracts.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreation.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JW\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/UserCreation;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "source", "", "emailAddress", "loginInsteadExitDeepLinkOverride", "Landroid/net/Uri;", "flow", "Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;", "onboardingQueryParams", "", "forceDarkTheme", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;Ljava/util/Map;Z)V", "getSource", "()Ljava/lang/String;", "getEmailAddress", "getLoginInsteadExitDeepLinkOverride", "()Landroid/net/Uri;", "getFlow", "()Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;", "getOnboardingQueryParams", "()Ljava/util/Map;", "getForceDarkTheme", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class UserCreation implements IntentKey, Parcelable {
    public static final Parcelable.Creator<UserCreation> CREATOR = new Creator();
    private final String emailAddress;
    private final UserCreationFlow flow;
    private final boolean forceDarkTheme;
    private final Uri loginInsteadExitDeepLinkOverride;
    private final Map<String, String> onboardingQueryParams;
    private final String source;

    /* compiled from: UserCreation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<UserCreation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserCreation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(UserCreation.class.getClassLoader());
            UserCreationFlow userCreationFlowCreateFromParcel = UserCreationFlow.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new UserCreation(string2, string3, uri, userCreationFlowCreateFromParcel, linkedHashMap, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserCreation[] newArray(int i) {
            return new UserCreation[i];
        }
    }

    public UserCreation() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ UserCreation copy$default(UserCreation userCreation, String str, String str2, Uri uri, UserCreationFlow userCreationFlow, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userCreation.source;
        }
        if ((i & 2) != 0) {
            str2 = userCreation.emailAddress;
        }
        if ((i & 4) != 0) {
            uri = userCreation.loginInsteadExitDeepLinkOverride;
        }
        if ((i & 8) != 0) {
            userCreationFlow = userCreation.flow;
        }
        if ((i & 16) != 0) {
            map = userCreation.onboardingQueryParams;
        }
        if ((i & 32) != 0) {
            z = userCreation.forceDarkTheme;
        }
        Map map2 = map;
        boolean z2 = z;
        return userCreation.copy(str, str2, uri, userCreationFlow, map2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getLoginInsteadExitDeepLinkOverride() {
        return this.loginInsteadExitDeepLinkOverride;
    }

    /* renamed from: component4, reason: from getter */
    public final UserCreationFlow getFlow() {
        return this.flow;
    }

    public final Map<String, String> component5() {
        return this.onboardingQueryParams;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }

    public final UserCreation copy(String source, String emailAddress, Uri loginInsteadExitDeepLinkOverride, UserCreationFlow flow, Map<String, String> onboardingQueryParams, boolean forceDarkTheme) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(onboardingQueryParams, "onboardingQueryParams");
        return new UserCreation(source, emailAddress, loginInsteadExitDeepLinkOverride, flow, onboardingQueryParams, forceDarkTheme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCreation)) {
            return false;
        }
        UserCreation userCreation = (UserCreation) other;
        return Intrinsics.areEqual(this.source, userCreation.source) && Intrinsics.areEqual(this.emailAddress, userCreation.emailAddress) && Intrinsics.areEqual(this.loginInsteadExitDeepLinkOverride, userCreation.loginInsteadExitDeepLinkOverride) && this.flow == userCreation.flow && Intrinsics.areEqual(this.onboardingQueryParams, userCreation.onboardingQueryParams) && this.forceDarkTheme == userCreation.forceDarkTheme;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.emailAddress;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Uri uri = this.loginInsteadExitDeepLinkOverride;
        return ((((((iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31) + this.flow.hashCode()) * 31) + this.onboardingQueryParams.hashCode()) * 31) + Boolean.hashCode(this.forceDarkTheme);
    }

    public String toString() {
        return "UserCreation(source=" + this.source + ", emailAddress=" + this.emailAddress + ", loginInsteadExitDeepLinkOverride=" + this.loginInsteadExitDeepLinkOverride + ", flow=" + this.flow + ", onboardingQueryParams=" + this.onboardingQueryParams + ", forceDarkTheme=" + this.forceDarkTheme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeString(this.emailAddress);
        dest.writeParcelable(this.loginInsteadExitDeepLinkOverride, flags);
        this.flow.writeToParcel(dest, flags);
        Map<String, String> map = this.onboardingQueryParams;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        dest.writeInt(this.forceDarkTheme ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public UserCreation(String str, String str2, Uri uri, UserCreationFlow flow, Map<String, String> onboardingQueryParams, boolean z) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(onboardingQueryParams, "onboardingQueryParams");
        this.source = str;
        this.emailAddress = str2;
        this.loginInsteadExitDeepLinkOverride = uri;
        this.flow = flow;
        this.onboardingQueryParams = onboardingQueryParams;
        this.forceDarkTheme = z;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final Uri getLoginInsteadExitDeepLinkOverride() {
        return this.loginInsteadExitDeepLinkOverride;
    }

    public /* synthetic */ UserCreation(String str, String str2, Uri uri, UserCreationFlow userCreationFlow, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : uri, (i & 8) != 0 ? UserCreationFlow.TRADER : userCreationFlow, (i & 16) != 0 ? MapsKt.emptyMap() : map, (i & 32) != 0 ? false : z);
    }

    public final UserCreationFlow getFlow() {
        return this.flow;
    }

    public final Map<String, String> getOnboardingQueryParams() {
        return this.onboardingQueryParams;
    }

    public final boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }
}
