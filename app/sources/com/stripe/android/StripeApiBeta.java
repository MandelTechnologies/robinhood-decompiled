package com.stripe.android;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StripeApiBeta.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/StripeApiBeta;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "WeChatPayV1", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class StripeApiBeta {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StripeApiBeta[] $VALUES;
    public static final StripeApiBeta WeChatPayV1 = new StripeApiBeta("WeChatPayV1", 0, "wechat_pay_beta=v1");
    private final String code;

    private static final /* synthetic */ StripeApiBeta[] $values() {
        return new StripeApiBeta[]{WeChatPayV1};
    }

    public static EnumEntries<StripeApiBeta> getEntries() {
        return $ENTRIES;
    }

    public static StripeApiBeta valueOf(String str) {
        return (StripeApiBeta) Enum.valueOf(StripeApiBeta.class, str);
    }

    public static StripeApiBeta[] values() {
        return (StripeApiBeta[]) $VALUES.clone();
    }

    private StripeApiBeta(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        return this.code;
    }

    static {
        StripeApiBeta[] stripeApiBetaArr$values = $values();
        $VALUES = stripeApiBetaArr$values;
        $ENTRIES = EnumEntries2.enumEntries(stripeApiBetaArr$values);
    }
}
