package com.truelayer.payments.core.domain.configuration;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Environment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/configuration/Environment;", "", "(Ljava/lang/String;I)V", "PRODUCTION", "SANDBOX", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class Environment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    public static final Environment PRODUCTION = new Environment("PRODUCTION", 0);
    public static final Environment SANDBOX = new Environment("SANDBOX", 1);

    private static final /* synthetic */ Environment[] $values() {
        return new Environment[]{PRODUCTION, SANDBOX};
    }

    public static EnumEntries<Environment> getEntries() {
        return $ENTRIES;
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }

    private Environment(String str, int i) {
    }

    static {
        Environment[] environmentArr$values = $values();
        $VALUES = environmentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(environmentArr$values);
    }
}
