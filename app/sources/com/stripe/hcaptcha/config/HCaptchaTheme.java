package com.stripe.hcaptcha.config;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HCaptchaTheme.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "", "(Ljava/lang/String;I)V", "DARK", "LIGHT", "CONTRAST", "Companion", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes26.dex */
public final class HCaptchaTheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HCaptchaTheme[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("dark")
    public static final HCaptchaTheme DARK = new HCaptchaTheme("DARK", 0);

    @SerialName("light")
    public static final HCaptchaTheme LIGHT = new HCaptchaTheme("LIGHT", 1);

    @SerialName("contrast")
    public static final HCaptchaTheme CONTRAST = new HCaptchaTheme("CONTRAST", 2);

    private static final /* synthetic */ HCaptchaTheme[] $values() {
        return new HCaptchaTheme[]{DARK, LIGHT, CONTRAST};
    }

    public static EnumEntries<HCaptchaTheme> getEntries() {
        return $ENTRIES;
    }

    public static HCaptchaTheme valueOf(String str) {
        return (HCaptchaTheme) Enum.valueOf(HCaptchaTheme.class, str);
    }

    public static HCaptchaTheme[] values() {
        return (HCaptchaTheme[]) $VALUES.clone();
    }

    /* compiled from: HCaptchaTheme.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaTheme$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) HCaptchaTheme.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<HCaptchaTheme> serializer() {
            return get$cachedSerializer();
        }
    }

    private HCaptchaTheme(String str, int i) {
    }

    static {
        HCaptchaTheme[] hCaptchaThemeArr$values = $values();
        $VALUES = hCaptchaThemeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(hCaptchaThemeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.stripe.hcaptcha.config.HCaptchaTheme.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("com.stripe.hcaptcha.config.HCaptchaTheme", HCaptchaTheme.values(), new String[]{"dark", "light", "contrast"}, new Annotation[][]{null, null, null}, null);
            }
        });
    }
}
