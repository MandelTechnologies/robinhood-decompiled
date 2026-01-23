package com.stripe.android.model;

import com.adjust.sdk.Constants;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TokenizationMethod.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/TokenizationMethod;", "", "code", "", "", "(Ljava/lang/String;ILjava/util/Set;)V", "ApplePay", "GooglePay", "Masterpass", "VisaCheckout", "Companion", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class TokenizationMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TokenizationMethod[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final Set<String> code;
    public static final TokenizationMethod ApplePay = new TokenizationMethod("ApplePay", 0, SetsKt.setOf("apple_pay"));
    public static final TokenizationMethod GooglePay = new TokenizationMethod("GooglePay", 1, SetsKt.setOf((Object[]) new String[]{"android_pay", Constants.REFERRER_API_GOOGLE}));
    public static final TokenizationMethod Masterpass = new TokenizationMethod("Masterpass", 2, SetsKt.setOf("masterpass"));
    public static final TokenizationMethod VisaCheckout = new TokenizationMethod("VisaCheckout", 3, SetsKt.setOf("visa_checkout"));

    private static final /* synthetic */ TokenizationMethod[] $values() {
        return new TokenizationMethod[]{ApplePay, GooglePay, Masterpass, VisaCheckout};
    }

    public static EnumEntries<TokenizationMethod> getEntries() {
        return $ENTRIES;
    }

    public static TokenizationMethod valueOf(String str) {
        return (TokenizationMethod) Enum.valueOf(TokenizationMethod.class, str);
    }

    public static TokenizationMethod[] values() {
        return (TokenizationMethod[]) $VALUES.clone();
    }

    private TokenizationMethod(String str, int i, Set set) {
        this.code = set;
    }

    static {
        TokenizationMethod[] tokenizationMethodArr$values = $values();
        $VALUES = tokenizationMethodArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tokenizationMethodArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: TokenizationMethod.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/TokenizationMethod$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/TokenizationMethod;", "code", "", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TokenizationMethod fromCode(String code) {
            TokenizationMethod next;
            Iterator<TokenizationMethod> it = TokenizationMethod.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (CollectionsKt.contains(next.code, code)) {
                    break;
                }
            }
            return next;
        }
    }
}
