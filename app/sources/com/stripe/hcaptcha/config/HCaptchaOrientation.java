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
/* compiled from: HCaptchaOrientation.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "", "(Ljava/lang/String;I)V", "PORTRAIT", "LANDSCAPE", "Companion", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes26.dex */
public final class HCaptchaOrientation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HCaptchaOrientation[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("portrait")
    public static final HCaptchaOrientation PORTRAIT = new HCaptchaOrientation("PORTRAIT", 0);

    @SerialName("landscape")
    public static final HCaptchaOrientation LANDSCAPE = new HCaptchaOrientation("LANDSCAPE", 1);

    private static final /* synthetic */ HCaptchaOrientation[] $values() {
        return new HCaptchaOrientation[]{PORTRAIT, LANDSCAPE};
    }

    public static EnumEntries<HCaptchaOrientation> getEntries() {
        return $ENTRIES;
    }

    public static HCaptchaOrientation valueOf(String str) {
        return (HCaptchaOrientation) Enum.valueOf(HCaptchaOrientation.class, str);
    }

    public static HCaptchaOrientation[] values() {
        return (HCaptchaOrientation[]) $VALUES.clone();
    }

    /* compiled from: HCaptchaOrientation.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaOrientation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) HCaptchaOrientation.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<HCaptchaOrientation> serializer() {
            return get$cachedSerializer();
        }
    }

    private HCaptchaOrientation(String str, int i) {
    }

    static {
        HCaptchaOrientation[] hCaptchaOrientationArr$values = $values();
        $VALUES = hCaptchaOrientationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(hCaptchaOrientationArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.stripe.hcaptcha.config.HCaptchaOrientation.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("com.stripe.hcaptcha.config.HCaptchaOrientation", HCaptchaOrientation.values(), new String[]{"portrait", "landscape"}, new Annotation[][]{null, null}, null);
            }
        });
    }
}
