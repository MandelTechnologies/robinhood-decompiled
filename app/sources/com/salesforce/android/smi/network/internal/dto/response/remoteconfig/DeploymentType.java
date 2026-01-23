package com.salesforce.android.smi.network.internal.dto.response.remoteconfig;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeploymentType.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/DeploymentType;", "", "<init>", "(Ljava/lang/String;I)V", "Mobile", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DeploymentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeploymentType[] $VALUES;
    public static final DeploymentType Mobile = new DeploymentType("Mobile", 0);

    private static final /* synthetic */ DeploymentType[] $values() {
        return new DeploymentType[]{Mobile};
    }

    public static EnumEntries<DeploymentType> getEntries() {
        return $ENTRIES;
    }

    private DeploymentType(String str, int i) {
    }

    static {
        DeploymentType[] deploymentTypeArr$values = $values();
        $VALUES = deploymentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(deploymentTypeArr$values);
    }

    public static DeploymentType valueOf(String str) {
        return (DeploymentType) Enum.valueOf(DeploymentType.class, str);
    }

    public static DeploymentType[] values() {
        return (DeploymentType[]) $VALUES.clone();
    }
}
