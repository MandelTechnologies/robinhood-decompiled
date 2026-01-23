package io.branch.referral;

/* loaded from: classes21.dex */
public enum Defines$IntentKeys {
    BranchData("branch_data"),
    AndroidPushNotificationKey("branch"),
    ForceNewBranchSession("branch_force_new_session"),
    BranchLinkUsed("branch_used"),
    BranchURI("branch");

    private final String key;

    Defines$IntentKeys(String str) {
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
