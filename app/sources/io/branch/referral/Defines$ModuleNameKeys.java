package io.branch.referral;

import com.singular.sdk.internal.Constants;

/* loaded from: classes21.dex */
public enum Defines$ModuleNameKeys {
    imei(Constants.DeviceIdentifierKeyspaceKeys.IMEI_KEYSPACE_KEY);

    private final String key;

    Defines$ModuleNameKeys(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.key;
    }
}
