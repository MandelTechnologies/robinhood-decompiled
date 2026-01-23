package io.branch.referral;

/* loaded from: classes21.dex */
public enum Defines$HeaderKey {
    RequestId("X-Branch-Request-Id"),
    SendCloseRequest("X-Branch-Send-Close-Request");

    private final String key;

    Defines$HeaderKey(String str) {
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
