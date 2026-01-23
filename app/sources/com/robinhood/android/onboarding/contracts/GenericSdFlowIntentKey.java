package com.robinhood.android.onboarding.contracts;

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

/* compiled from: GenericSdFlowIntentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/GenericSdFlowIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "flowPath", "", "isWorkflow", "", "odysseyVersion", "exitDeeplinkOverride", "Landroid/net/Uri;", "queryParameters", "", "entryPointIdentifier", "requiresAuthentication", "deeplinkCompletionCheckpoint", "forceDarkTheme", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Landroid/net/Uri;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;)V", "getFlowPath", "()Ljava/lang/String;", "()Z", "getOdysseyVersion", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "getQueryParameters", "()Ljava/util/Map;", "getEntryPointIdentifier", "getRequiresAuthentication", "getDeeplinkCompletionCheckpoint", "getForceDarkTheme", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GenericSdFlowIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<GenericSdFlowIntentKey> CREATOR = new Creator();
    private final String deeplinkCompletionCheckpoint;
    private final String entryPointIdentifier;
    private final Uri exitDeeplinkOverride;
    private final String flowPath;
    private final Boolean forceDarkTheme;
    private final boolean isWorkflow;
    private final String odysseyVersion;
    private final Map<String, String> queryParameters;
    private final boolean requiresAuthentication;

    /* compiled from: GenericSdFlowIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GenericSdFlowIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenericSdFlowIntentKey createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            String string3 = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(GenericSdFlowIntentKey.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new GenericSdFlowIntentKey(string2, z2, string3, uri, linkedHashMap, parcel.readString(), parcel.readInt() != 0 ? z : false, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0 ? z : false));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenericSdFlowIntentKey[] newArray(int i) {
            return new GenericSdFlowIntentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.flowPath);
        dest.writeInt(this.isWorkflow ? 1 : 0);
        dest.writeString(this.odysseyVersion);
        dest.writeParcelable(this.exitDeeplinkOverride, flags);
        Map<String, String> map = this.queryParameters;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        dest.writeString(this.entryPointIdentifier);
        dest.writeInt(this.requiresAuthentication ? 1 : 0);
        dest.writeString(this.deeplinkCompletionCheckpoint);
        Boolean bool = this.forceDarkTheme;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public GenericSdFlowIntentKey(String flowPath, boolean z, String str, Uri uri, Map<String, String> queryParameters, String str2, boolean z2, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(flowPath, "flowPath");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        this.flowPath = flowPath;
        this.isWorkflow = z;
        this.odysseyVersion = str;
        this.exitDeeplinkOverride = uri;
        this.queryParameters = queryParameters;
        this.entryPointIdentifier = str2;
        this.requiresAuthentication = z2;
        this.deeplinkCompletionCheckpoint = str3;
        this.forceDarkTheme = bool;
    }

    public final String getFlowPath() {
        return this.flowPath;
    }

    /* renamed from: isWorkflow, reason: from getter */
    public final boolean getIsWorkflow() {
        return this.isWorkflow;
    }

    public final String getOdysseyVersion() {
        return this.odysseyVersion;
    }

    public final Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    public /* synthetic */ GenericSdFlowIntentKey(String str, boolean z, String str2, Uri uri, Map map, String str3, boolean z2, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : uri, (i & 16) != 0 ? MapsKt.emptyMap() : map, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : bool);
    }

    public final Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final boolean getRequiresAuthentication() {
        return this.requiresAuthentication;
    }

    public final String getDeeplinkCompletionCheckpoint() {
        return this.deeplinkCompletionCheckpoint;
    }

    public final Boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }
}
