package com.stripe.hcaptcha.config;

import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.encode.DurationSerializer;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: HCaptchaConfig.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0002\\[Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eBÉ\u0001\b\u0011\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J(\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÁ\u0001¢\u0006\u0004\b*\u0010+Jó\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0004HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b=\u0010<R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010<R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b?\u00101R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b@\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\bA\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bB\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\bC\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bD\u00101R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bE\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\bO\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\bP\u00101R4\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010Q\u0012\u0004\bT\u0010U\u001a\u0004\bR\u0010SR&\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010V\u0012\u0004\bY\u0010U\u001a\u0004\bW\u0010XR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010:\u001a\u0004\bZ\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, m3636d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "Ljava/io/Serializable;", "", "siteKey", "", "sentry", "loading", "hideDialog", "rqdata", "jsSrc", "endpoint", "reportapi", "assethost", "imghost", "locale", "Lcom/stripe/hcaptcha/config/HCaptchaSize;", "size", "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "orientation", "Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "theme", "host", "customTheme", "Lkotlin/Function2;", "Lcom/stripe/hcaptcha/HCaptchaException;", "retryPredicate", "Lkotlin/time/Duration;", "tokenExpiration", "disableHardwareAcceleration", "<init>", "(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Duration;ZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$hcaptcha_release", "(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "copy-ZIzw2bI", "(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZ)Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "copy", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSiteKey", "Z", "getSentry", "()Z", "getLoading", "getHideDialog", "getRqdata", "getJsSrc", "getEndpoint", "getReportapi", "getAssethost", "getImghost", "getLocale", "Lcom/stripe/hcaptcha/config/HCaptchaSize;", "getSize", "()Lcom/stripe/hcaptcha/config/HCaptchaSize;", "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "getOrientation", "()Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "getTheme", "()Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "getHost", "getCustomTheme", "Lkotlin/jvm/functions/Function2;", "getRetryPredicate", "()Lkotlin/jvm/functions/Function2;", "getRetryPredicate$annotations", "()V", "J", "getTokenExpiration-UwyO8pc", "()J", "getTokenExpiration-UwyO8pc$annotations", "getDisableHardwareAcceleration", "Companion", "$serializer", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes26.dex */
public final /* data */ class HCaptchaConfig implements java.io.Serializable {
    private final String assethost;
    private final String customTheme;
    private final boolean disableHardwareAcceleration;
    private final String endpoint;
    private final boolean hideDialog;
    private final String host;
    private final String imghost;
    private final String jsSrc;
    private final boolean loading;
    private final String locale;
    private final HCaptchaOrientation orientation;
    private final String reportapi;
    private final Function2<HCaptchaConfig, HCaptchaException, Boolean> retryPredicate;
    private final String rqdata;
    private final boolean sentry;
    private final String siteKey;
    private final HCaptchaSize size;
    private final HCaptchaTheme theme;
    private final long tokenExpiration;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, HCaptchaSize.INSTANCE.serializer(), HCaptchaOrientation.INSTANCE.serializer(), HCaptchaTheme.INSTANCE.serializer(), null, null, null, null};

    @Deprecated
    public /* synthetic */ HCaptchaConfig(int i, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, @Serializable(with = DurationSerializer.class) Duration duration, boolean z4, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, z, z2, z3, str2, str3, str4, str5, str6, str7, str8, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str9, str10, duration, z4, serializationConstructorMarker);
    }

    public /* synthetic */ HCaptchaConfig(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, Function2 function2, long j, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, z3, str2, str3, str4, str5, str6, str7, str8, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str9, str10, function2, j, z4);
    }

    /* renamed from: copy-ZIzw2bI$default, reason: not valid java name */
    public static /* synthetic */ HCaptchaConfig m26978copyZIzw2bI$default(HCaptchaConfig hCaptchaConfig, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, Function2 function2, long j, boolean z4, int i, Object obj) {
        boolean z5;
        long j2;
        String str11 = (i & 1) != 0 ? hCaptchaConfig.siteKey : str;
        boolean z6 = (i & 2) != 0 ? hCaptchaConfig.sentry : z;
        boolean z7 = (i & 4) != 0 ? hCaptchaConfig.loading : z2;
        boolean z8 = (i & 8) != 0 ? hCaptchaConfig.hideDialog : z3;
        String str12 = (i & 16) != 0 ? hCaptchaConfig.rqdata : str2;
        String str13 = (i & 32) != 0 ? hCaptchaConfig.jsSrc : str3;
        String str14 = (i & 64) != 0 ? hCaptchaConfig.endpoint : str4;
        String str15 = (i & 128) != 0 ? hCaptchaConfig.reportapi : str5;
        String str16 = (i & 256) != 0 ? hCaptchaConfig.assethost : str6;
        String str17 = (i & 512) != 0 ? hCaptchaConfig.imghost : str7;
        String str18 = (i & 1024) != 0 ? hCaptchaConfig.locale : str8;
        HCaptchaSize hCaptchaSize2 = (i & 2048) != 0 ? hCaptchaConfig.size : hCaptchaSize;
        HCaptchaOrientation hCaptchaOrientation2 = (i & 4096) != 0 ? hCaptchaConfig.orientation : hCaptchaOrientation;
        HCaptchaTheme hCaptchaTheme2 = (i & 8192) != 0 ? hCaptchaConfig.theme : hCaptchaTheme;
        String str19 = str11;
        String str20 = (i & 16384) != 0 ? hCaptchaConfig.host : str9;
        String str21 = (i & 32768) != 0 ? hCaptchaConfig.customTheme : str10;
        Function2 function22 = (i & 65536) != 0 ? hCaptchaConfig.retryPredicate : function2;
        String str22 = str20;
        long j3 = (i & 131072) != 0 ? hCaptchaConfig.tokenExpiration : j;
        if ((i & 262144) != 0) {
            j2 = j3;
            z5 = hCaptchaConfig.disableHardwareAcceleration;
        } else {
            z5 = z4;
            j2 = j3;
        }
        return hCaptchaConfig.m26979copyZIzw2bI(str19, z6, z7, z8, str12, str13, str14, str15, str16, str17, str18, hCaptchaSize2, hCaptchaOrientation2, hCaptchaTheme2, str22, str21, function22, j2, z5);
    }

    /* renamed from: copy-ZIzw2bI, reason: not valid java name */
    public final HCaptchaConfig m26979copyZIzw2bI(String siteKey, boolean sentry, boolean loading, boolean hideDialog, String rqdata, String jsSrc, String endpoint, String reportapi, String assethost, String imghost, String locale, HCaptchaSize size, HCaptchaOrientation orientation, HCaptchaTheme theme, String host, String customTheme, Function2<? super HCaptchaConfig, ? super HCaptchaException, Boolean> retryPredicate, long tokenExpiration, boolean disableHardwareAcceleration) {
        Intrinsics.checkNotNullParameter(siteKey, "siteKey");
        Intrinsics.checkNotNullParameter(jsSrc, "jsSrc");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new HCaptchaConfig(siteKey, sentry, loading, hideDialog, rqdata, jsSrc, endpoint, reportapi, assethost, imghost, locale, size, orientation, theme, host, customTheme, retryPredicate, tokenExpiration, disableHardwareAcceleration, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HCaptchaConfig)) {
            return false;
        }
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) other;
        return Intrinsics.areEqual(this.siteKey, hCaptchaConfig.siteKey) && this.sentry == hCaptchaConfig.sentry && this.loading == hCaptchaConfig.loading && this.hideDialog == hCaptchaConfig.hideDialog && Intrinsics.areEqual(this.rqdata, hCaptchaConfig.rqdata) && Intrinsics.areEqual(this.jsSrc, hCaptchaConfig.jsSrc) && Intrinsics.areEqual(this.endpoint, hCaptchaConfig.endpoint) && Intrinsics.areEqual(this.reportapi, hCaptchaConfig.reportapi) && Intrinsics.areEqual(this.assethost, hCaptchaConfig.assethost) && Intrinsics.areEqual(this.imghost, hCaptchaConfig.imghost) && Intrinsics.areEqual(this.locale, hCaptchaConfig.locale) && this.size == hCaptchaConfig.size && this.orientation == hCaptchaConfig.orientation && this.theme == hCaptchaConfig.theme && Intrinsics.areEqual(this.host, hCaptchaConfig.host) && Intrinsics.areEqual(this.customTheme, hCaptchaConfig.customTheme) && Intrinsics.areEqual(this.retryPredicate, hCaptchaConfig.retryPredicate) && Duration.m28733equalsimpl0(this.tokenExpiration, hCaptchaConfig.tokenExpiration) && this.disableHardwareAcceleration == hCaptchaConfig.disableHardwareAcceleration;
    }

    public int hashCode() {
        int iHashCode = ((((((this.siteKey.hashCode() * 31) + Boolean.hashCode(this.sentry)) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.hideDialog)) * 31;
        String str = this.rqdata;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.jsSrc.hashCode()) * 31;
        String str2 = this.endpoint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reportapi;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.assethost;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imghost;
        int iHashCode6 = (((((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.locale.hashCode()) * 31) + this.size.hashCode()) * 31) + this.orientation.hashCode()) * 31) + this.theme.hashCode()) * 31;
        String str6 = this.host;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customTheme;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Function2<HCaptchaConfig, HCaptchaException, Boolean> function2 = this.retryPredicate;
        return ((((iHashCode8 + (function2 != null ? function2.hashCode() : 0)) * 31) + Duration.m28747hashCodeimpl(this.tokenExpiration)) * 31) + Boolean.hashCode(this.disableHardwareAcceleration);
    }

    public String toString() {
        return "HCaptchaConfig(siteKey=" + this.siteKey + ", sentry=" + this.sentry + ", loading=" + this.loading + ", hideDialog=" + this.hideDialog + ", rqdata=" + this.rqdata + ", jsSrc=" + this.jsSrc + ", endpoint=" + this.endpoint + ", reportapi=" + this.reportapi + ", assethost=" + this.assethost + ", imghost=" + this.imghost + ", locale=" + this.locale + ", size=" + this.size + ", orientation=" + this.orientation + ", theme=" + this.theme + ", host=" + this.host + ", customTheme=" + this.customTheme + ", retryPredicate=" + this.retryPredicate + ", tokenExpiration=" + Duration.m28761toStringimpl(this.tokenExpiration) + ", disableHardwareAcceleration=" + this.disableHardwareAcceleration + ")";
    }

    private HCaptchaConfig(int i, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, Duration duration, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        long rawValue;
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, HCaptchaConfig2.INSTANCE.getDescriptor());
        }
        this.siteKey = str;
        if ((i & 2) == 0) {
            this.sentry = true;
        } else {
            this.sentry = z;
        }
        if ((i & 4) == 0) {
            this.loading = true;
        } else {
            this.loading = z2;
        }
        if ((i & 8) == 0) {
            this.hideDialog = false;
        } else {
            this.hideDialog = z3;
        }
        if ((i & 16) == 0) {
            this.rqdata = null;
        } else {
            this.rqdata = str2;
        }
        if ((i & 32) == 0) {
            this.jsSrc = "https://js.hcaptcha.com/1/api.js";
        } else {
            this.jsSrc = str3;
        }
        if ((i & 64) == 0) {
            this.endpoint = null;
        } else {
            this.endpoint = str4;
        }
        if ((i & 128) == 0) {
            this.reportapi = null;
        } else {
            this.reportapi = str5;
        }
        if ((i & 256) == 0) {
            this.assethost = null;
        } else {
            this.assethost = str6;
        }
        if ((i & 512) == 0) {
            this.imghost = null;
        } else {
            this.imghost = str7;
        }
        if ((i & 1024) == 0) {
            String language = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            this.locale = language;
        } else {
            this.locale = str8;
        }
        if ((i & 2048) == 0) {
            this.size = HCaptchaSize.INVISIBLE;
        } else {
            this.size = hCaptchaSize;
        }
        this.orientation = (i & 4096) == 0 ? HCaptchaOrientation.PORTRAIT : hCaptchaOrientation;
        this.theme = (i & 8192) == 0 ? HCaptchaTheme.LIGHT : hCaptchaTheme;
        if ((i & 16384) == 0) {
            this.host = null;
        } else {
            this.host = str9;
        }
        if ((32768 & i) == 0) {
            this.customTheme = null;
        } else {
            this.customTheme = str10;
        }
        this.retryPredicate = null;
        if ((65536 & i) == 0) {
            Duration.Companion companion = Duration.INSTANCE;
            rawValue = Duration3.toDuration(120, DurationUnitJvm.SECONDS);
        } else {
            rawValue = duration.getRawValue();
        }
        this.tokenExpiration = rawValue;
        if ((i & 131072) == 0) {
            this.disableHardwareAcceleration = true;
        } else {
            this.disableHardwareAcceleration = z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HCaptchaConfig(String siteKey, boolean z, boolean z2, boolean z3, String str, String jsSrc, String str2, String str3, String str4, String str5, String locale, HCaptchaSize size, HCaptchaOrientation orientation, HCaptchaTheme theme, String str6, String str7, Function2<? super HCaptchaConfig, ? super HCaptchaException, Boolean> function2, long j, boolean z4) {
        Intrinsics.checkNotNullParameter(siteKey, "siteKey");
        Intrinsics.checkNotNullParameter(jsSrc, "jsSrc");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.siteKey = siteKey;
        this.sentry = z;
        this.loading = z2;
        this.hideDialog = z3;
        this.rqdata = str;
        this.jsSrc = jsSrc;
        this.endpoint = str2;
        this.reportapi = str3;
        this.assethost = str4;
        this.imghost = str5;
        this.locale = locale;
        this.size = size;
        this.orientation = orientation;
        this.theme = theme;
        this.host = str6;
        this.customTheme = str7;
        this.retryPredicate = function2;
        this.tokenExpiration = j;
        this.disableHardwareAcceleration = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$hcaptcha_release(HCaptchaConfig self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.siteKey);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.sentry) {
            output.encodeBooleanElement(serialDesc, 1, self.sentry);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.loading) {
            output.encodeBooleanElement(serialDesc, 2, self.loading);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.hideDialog) {
            output.encodeBooleanElement(serialDesc, 3, self.hideDialog);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.rqdata != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.rqdata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.jsSrc, "https://js.hcaptcha.com/1/api.js")) {
            output.encodeStringElement(serialDesc, 5, self.jsSrc);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.endpoint != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.endpoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.reportapi != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.reportapi);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.assethost != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.assethost);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.imghost != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.imghost);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10)) {
            output.encodeStringElement(serialDesc, 10, self.locale);
        } else {
            String str = self.locale;
            String language = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            if (!Intrinsics.areEqual(str, language)) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.size != HCaptchaSize.INVISIBLE) {
            output.encodeSerializableElement(serialDesc, 11, kSerializerArr[11], self.size);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.orientation != HCaptchaOrientation.PORTRAIT) {
            output.encodeSerializableElement(serialDesc, 12, kSerializerArr[12], self.orientation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.theme != HCaptchaTheme.LIGHT) {
            output.encodeSerializableElement(serialDesc, 13, kSerializerArr[13], self.theme);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.host != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.host);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.customTheme != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.customTheme);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16)) {
            output.encodeSerializableElement(serialDesc, 16, DurationSerializer.INSTANCE, Duration.m28726boximpl(self.tokenExpiration));
        } else {
            long j = self.tokenExpiration;
            Duration.Companion companion = Duration.INSTANCE;
            if (!Duration.m28733equalsimpl0(j, Duration3.toDuration(120, DurationUnitJvm.SECONDS))) {
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 17) && self.disableHardwareAcceleration) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 17, self.disableHardwareAcceleration);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getHideDialog() {
        return this.hideDialog;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HCaptchaConfig(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, Function2 function2, long j, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        long duration;
        boolean z5 = (i & 2) != 0 ? true : z;
        boolean z6 = (i & 4) != 0 ? true : z2;
        boolean z7 = (i & 8) != 0 ? false : z3;
        String str12 = (i & 16) != 0 ? null : str2;
        String str13 = (i & 32) != 0 ? "https://js.hcaptcha.com/1/api.js" : str3;
        String str14 = (i & 64) != 0 ? null : str4;
        String str15 = (i & 128) != 0 ? null : str5;
        String str16 = (i & 256) != 0 ? null : str6;
        String str17 = (i & 512) != 0 ? null : str7;
        if ((i & 1024) != 0) {
            String language = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            str11 = language;
        } else {
            str11 = str8;
        }
        HCaptchaSize hCaptchaSize2 = (i & 2048) != 0 ? HCaptchaSize.INVISIBLE : hCaptchaSize;
        HCaptchaOrientation hCaptchaOrientation2 = (i & 4096) != 0 ? HCaptchaOrientation.PORTRAIT : hCaptchaOrientation;
        HCaptchaTheme hCaptchaTheme2 = (i & 8192) != 0 ? HCaptchaTheme.LIGHT : hCaptchaTheme;
        String str18 = (i & 16384) != 0 ? null : str9;
        String str19 = (32768 & i) != 0 ? null : str10;
        Function2 function22 = (65536 & i) != 0 ? null : function2;
        if ((131072 & i) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            duration = Duration3.toDuration(120, DurationUnitJvm.SECONDS);
        } else {
            duration = j;
        }
        this(str, z5, z6, z7, str12, str13, str14, str15, str16, str17, str11, hCaptchaSize2, hCaptchaOrientation2, hCaptchaTheme2, str18, str19, function22, duration, (i & 262144) != 0 ? true : z4, (DefaultConstructorMarker) null);
    }

    public final HCaptchaSize getSize() {
        return this.size;
    }

    public final String getHost() {
        return this.host;
    }

    public final Function2<HCaptchaConfig, HCaptchaException, Boolean> getRetryPredicate() {
        return this.retryPredicate;
    }

    /* renamed from: getTokenExpiration-UwyO8pc, reason: not valid java name and from getter */
    public final long getTokenExpiration() {
        return this.tokenExpiration;
    }

    public final boolean getDisableHardwareAcceleration() {
        return this.disableHardwareAcceleration;
    }

    /* compiled from: HCaptchaConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaConfig$Companion;", "", "()V", "serialVersionUID", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HCaptchaConfig> serializer() {
            return HCaptchaConfig2.INSTANCE;
        }
    }
}
