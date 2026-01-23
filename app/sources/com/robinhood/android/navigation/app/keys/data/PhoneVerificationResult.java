package com.robinhood.android.navigation.app.keys.data;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneVerificationResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/PhoneVerificationResult;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "UPDATE_PHONE_NUMBER", "UNKNOWN", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PhoneVerificationResult implements RhEnum<PhoneVerificationResult> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PhoneVerificationResult[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final PhoneVerificationResult SUCCESS = new PhoneVerificationResult("SUCCESS", 0, "success");
    public static final PhoneVerificationResult FAILURE = new PhoneVerificationResult("FAILURE", 1, "failure");
    public static final PhoneVerificationResult UPDATE_PHONE_NUMBER = new PhoneVerificationResult("UPDATE_PHONE_NUMBER", 2, "update_phone_number");
    public static final PhoneVerificationResult UNKNOWN = new PhoneVerificationResult("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ PhoneVerificationResult[] $values() {
        return new PhoneVerificationResult[]{SUCCESS, FAILURE, UPDATE_PHONE_NUMBER, UNKNOWN};
    }

    public static EnumEntries<PhoneVerificationResult> getEntries() {
        return $ENTRIES;
    }

    private PhoneVerificationResult(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        PhoneVerificationResult[] phoneVerificationResultArr$values = $values();
        $VALUES = phoneVerificationResultArr$values;
        $ENTRIES = EnumEntries2.enumEntries(phoneVerificationResultArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: PhoneVerificationResult.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/PhoneVerificationResult$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/navigation/app/keys/data/PhoneVerificationResult;", "<init>", "()V", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<PhoneVerificationResult> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(PhoneVerificationResult.values(), PhoneVerificationResult.UNKNOWN, false, 4, null);
        }
    }

    public static PhoneVerificationResult valueOf(String str) {
        return (PhoneVerificationResult) Enum.valueOf(PhoneVerificationResult.class, str);
    }

    public static PhoneVerificationResult[] values() {
        return (PhoneVerificationResult[]) $VALUES.clone();
    }
}
