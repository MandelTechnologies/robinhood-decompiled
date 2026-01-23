package com.twilio.twilsock.client;

import com.singular.sdk.internal.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002MNBµ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014B¡\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¥\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001J&\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KHÁ\u0001¢\u0006\u0002\bLR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0017\u001a\u0004\b/\u0010\u0019R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019¨\u0006O"}, m3636d2 = {"Lcom/twilio/twilsock/client/ClientMetadata;", "", "seen1", "", "env", "", "envVer", "os", "osVer", "osArch", "devModel", "devVendor", "devType", "appName", "appVer", "sdkType", Constants.RequestParamsKeys.SDK_VERSION_KEY, "sdkVer", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName$annotations", "()V", "getAppName", "()Ljava/lang/String;", "getAppVer$annotations", "getAppVer", "getDevModel$annotations", "getDevModel", "getDevType$annotations", "getDevType", "getDevVendor$annotations", "getDevVendor", "getEnv$annotations", "getEnv", "getEnvVer$annotations", "getEnvVer", "getOs$annotations", "getOs", "getOsArch$annotations", "getOsArch", "getOsVer$annotations", "getOsVer", "getSdk$annotations", "getSdk", "getSdkType$annotations", "getSdkType", "getSdkVer$annotations", "getSdkVer", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class ClientMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String appName;
    private final String appVer;
    private final String devModel;
    private final String devType;
    private final String devVendor;
    private final String env;
    private final String envVer;
    private final String os;
    private final String osArch;
    private final String osVer;
    private final String sdk;
    private final String sdkType;
    private final String sdkVer;

    public ClientMetadata() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ClientMetadata copy$default(ClientMetadata clientMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientMetadata.env;
        }
        return clientMetadata.copy(str, (i & 2) != 0 ? clientMetadata.envVer : str2, (i & 4) != 0 ? clientMetadata.os : str3, (i & 8) != 0 ? clientMetadata.osVer : str4, (i & 16) != 0 ? clientMetadata.osArch : str5, (i & 32) != 0 ? clientMetadata.devModel : str6, (i & 64) != 0 ? clientMetadata.devVendor : str7, (i & 128) != 0 ? clientMetadata.devType : str8, (i & 256) != 0 ? clientMetadata.appName : str9, (i & 512) != 0 ? clientMetadata.appVer : str10, (i & 1024) != 0 ? clientMetadata.sdkType : str11, (i & 2048) != 0 ? clientMetadata.sdk : str12, (i & 4096) != 0 ? clientMetadata.sdkVer : str13);
    }

    @SerialName("app")
    public static /* synthetic */ void getAppName$annotations() {
    }

    @SerialName("appv")
    public static /* synthetic */ void getAppVer$annotations() {
    }

    @SerialName("dev")
    public static /* synthetic */ void getDevModel$annotations() {
    }

    @SerialName("devt")
    public static /* synthetic */ void getDevType$annotations() {
    }

    @SerialName("devv")
    public static /* synthetic */ void getDevVendor$annotations() {
    }

    @SerialName("env")
    public static /* synthetic */ void getEnv$annotations() {
    }

    @SerialName("envv")
    public static /* synthetic */ void getEnvVer$annotations() {
    }

    @SerialName("os")
    public static /* synthetic */ void getOs$annotations() {
    }

    @SerialName("osa")
    public static /* synthetic */ void getOsArch$annotations() {
    }

    @SerialName("osv")
    public static /* synthetic */ void getOsVer$annotations() {
    }

    @SerialName(Constants.RequestParamsKeys.SDK_VERSION_KEY)
    public static /* synthetic */ void getSdk$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getSdkType$annotations() {
    }

    @SerialName("sdkv")
    public static /* synthetic */ void getSdkVer$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getEnv() {
        return this.env;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAppVer() {
        return this.appVer;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSdkType() {
        return this.sdkType;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSdkVer() {
        return this.sdkVer;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEnvVer() {
        return this.envVer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOsVer() {
        return this.osVer;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOsArch() {
        return this.osArch;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDevModel() {
        return this.devModel;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDevVendor() {
        return this.devVendor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDevType() {
        return this.devType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    public final ClientMetadata copy(String env, String envVer, String os, String osVer, String osArch, String devModel, String devVendor, String devType, String appName, String appVer, String sdkType, String sdk, String sdkVer) {
        return new ClientMetadata(env, envVer, os, osVer, osArch, devModel, devVendor, devType, appName, appVer, sdkType, sdk, sdkVer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientMetadata)) {
            return false;
        }
        ClientMetadata clientMetadata = (ClientMetadata) other;
        return Intrinsics.areEqual(this.env, clientMetadata.env) && Intrinsics.areEqual(this.envVer, clientMetadata.envVer) && Intrinsics.areEqual(this.os, clientMetadata.os) && Intrinsics.areEqual(this.osVer, clientMetadata.osVer) && Intrinsics.areEqual(this.osArch, clientMetadata.osArch) && Intrinsics.areEqual(this.devModel, clientMetadata.devModel) && Intrinsics.areEqual(this.devVendor, clientMetadata.devVendor) && Intrinsics.areEqual(this.devType, clientMetadata.devType) && Intrinsics.areEqual(this.appName, clientMetadata.appName) && Intrinsics.areEqual(this.appVer, clientMetadata.appVer) && Intrinsics.areEqual(this.sdkType, clientMetadata.sdkType) && Intrinsics.areEqual(this.sdk, clientMetadata.sdk) && Intrinsics.areEqual(this.sdkVer, clientMetadata.sdkVer);
    }

    public int hashCode() {
        String str = this.env;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.envVer;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.os;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.osVer;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.osArch;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.devModel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.devVendor;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.devType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.appName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.appVer;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sdkType;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sdk;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.sdkVer;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "ClientMetadata(env=" + this.env + ", envVer=" + this.envVer + ", os=" + this.os + ", osVer=" + this.osVer + ", osArch=" + this.osArch + ", devModel=" + this.devModel + ", devVendor=" + this.devVendor + ", devType=" + this.devType + ", appName=" + this.appName + ", appVer=" + this.appVer + ", sdkType=" + this.sdkType + ", sdk=" + this.sdk + ", sdkVer=" + this.sdkVer + ')';
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/ClientMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/ClientMetadata;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientMetadata> serializer() {
            return ClientMetadata$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ClientMetadata(int i, @SerialName("env") String str, @SerialName("envv") String str2, @SerialName("os") String str3, @SerialName("osv") String str4, @SerialName("osa") String str5, @SerialName("dev") String str6, @SerialName("devv") String str7, @SerialName("devt") String str8, @SerialName("app") String str9, @SerialName("appv") String str10, @SerialName("type") String str11, @SerialName(Constants.RequestParamsKeys.SDK_VERSION_KEY) String str12, @SerialName("sdkv") String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.env = null;
        } else {
            this.env = str;
        }
        if ((i & 2) == 0) {
            this.envVer = null;
        } else {
            this.envVer = str2;
        }
        if ((i & 4) == 0) {
            this.os = null;
        } else {
            this.os = str3;
        }
        if ((i & 8) == 0) {
            this.osVer = null;
        } else {
            this.osVer = str4;
        }
        if ((i & 16) == 0) {
            this.osArch = null;
        } else {
            this.osArch = str5;
        }
        if ((i & 32) == 0) {
            this.devModel = null;
        } else {
            this.devModel = str6;
        }
        if ((i & 64) == 0) {
            this.devVendor = null;
        } else {
            this.devVendor = str7;
        }
        if ((i & 128) == 0) {
            this.devType = null;
        } else {
            this.devType = str8;
        }
        if ((i & 256) == 0) {
            this.appName = null;
        } else {
            this.appName = str9;
        }
        if ((i & 512) == 0) {
            this.appVer = null;
        } else {
            this.appVer = str10;
        }
        if ((i & 1024) == 0) {
            this.sdkType = null;
        } else {
            this.sdkType = str11;
        }
        if ((i & 2048) == 0) {
            this.sdk = null;
        } else {
            this.sdk = str12;
        }
        if ((i & 4096) == 0) {
            this.sdkVer = null;
        } else {
            this.sdkVer = str13;
        }
    }

    public ClientMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.env = str;
        this.envVer = str2;
        this.os = str3;
        this.osVer = str4;
        this.osArch = str5;
        this.devModel = str6;
        this.devVendor = str7;
        this.devType = str8;
        this.appName = str9;
        this.appVer = str10;
        this.sdkType = str11;
        this.sdk = str12;
        this.sdkVer = str13;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(ClientMetadata self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.env != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.env);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.envVer != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.envVer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.os != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.os);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.osVer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.osVer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.osArch != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.osArch);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.devModel != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.devModel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.devVendor != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.devVendor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.devType != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.devType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.appName != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.appName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.appVer != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.appVer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.sdkType != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.sdkType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.sdk != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.sdk);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.sdkVer == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.sdkVer);
    }

    public /* synthetic */ ClientMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13);
    }

    public final String getEnv() {
        return this.env;
    }

    public final String getEnvVer() {
        return this.envVer;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsVer() {
        return this.osVer;
    }

    public final String getOsArch() {
        return this.osArch;
    }

    public final String getDevModel() {
        return this.devModel;
    }

    public final String getDevVendor() {
        return this.devVendor;
    }

    public final String getDevType() {
        return this.devType;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVer() {
        return this.appVer;
    }

    public final String getSdkType() {
        return this.sdkType;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getSdkVer() {
        return this.sdkVer;
    }
}
