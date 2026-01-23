package com.robinhood.android.settings.settings.account.trustedcontact;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrustedContactField.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactField;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST_NAME", "LAST_NAME", "PHONE_NUMBER", "EMAIL", "inputTypeFlags", "", "getInputTypeFlags", "()I", "autofillHints", "", "", "getAutofillHints", "()Ljava/util/List;", "isPhoneNumber", "", "()Z", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class TrustedContactField {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrustedContactField[] $VALUES;
    public static final TrustedContactField FIRST_NAME = new TrustedContactField("FIRST_NAME", 0);
    public static final TrustedContactField LAST_NAME = new TrustedContactField("LAST_NAME", 1);
    public static final TrustedContactField PHONE_NUMBER = new TrustedContactField("PHONE_NUMBER", 2);
    public static final TrustedContactField EMAIL = new TrustedContactField("EMAIL", 3);

    /* compiled from: TrustedContactField.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrustedContactField.values().length];
            try {
                iArr[TrustedContactField.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrustedContactField.LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrustedContactField.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrustedContactField.PHONE_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ TrustedContactField[] $values() {
        return new TrustedContactField[]{FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL};
    }

    public static EnumEntries<TrustedContactField> getEntries() {
        return $ENTRIES;
    }

    private TrustedContactField(String str, int i) {
    }

    static {
        TrustedContactField[] trustedContactFieldArr$values = $values();
        $VALUES = trustedContactFieldArr$values;
        $ENTRIES = EnumEntries2.enumEntries(trustedContactFieldArr$values);
    }

    public final int getInputTypeFlags() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return 8289;
        }
        if (i == 3) {
            return 33;
        }
        if (i == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<String> getAutofillHints() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return CollectionsKt.listOf((Object[]) new String[]{"given-name", "firstname"});
        }
        if (i == 2) {
            return CollectionsKt.listOf((Object[]) new String[]{"family-name", "lastname"});
        }
        if (i == 3) {
            return CollectionsKt.listOf("emailAddress");
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.listOf("phone");
    }

    public final boolean isPhoneNumber() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TrustedContactField valueOf(String str) {
        return (TrustedContactField) Enum.valueOf(TrustedContactField.class, str);
    }

    public static TrustedContactField[] values() {
        return (TrustedContactField[]) $VALUES.clone();
    }
}
