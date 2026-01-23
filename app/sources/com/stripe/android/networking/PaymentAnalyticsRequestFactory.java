package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.NetworkTypeDetector;
import com.stripe.android.core.utils.ContextUtils;
import com.stripe.android.model.Token;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentAnalyticsRequestFactory.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002>?BS\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eB)\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u0012B\u001f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u0013B1\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u0015JY\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J3\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010)\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b'\u0010(J%\u0010,\u001a\u00020&2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b*\u0010+J)\u00101\u001a\u00020&2\n\u0010.\u001a\u00060\u0006j\u0002`-2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b/\u00100J%\u00105\u001a\u00020&2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b3\u00104J#\u00107\u001a\u00020&2\b\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b6\u00104JW\u0010:\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b8\u00109R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010=¨\u0006@"}, m3636d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "Landroid/content/pm/PackageManager;", "packageManager", "Landroid/content/pm/PackageInfo;", "packageInfo", "", "packageName", "Ljavax/inject/Provider;", "publishableKeyProvider", "networkTypeProvider", "", "defaultProductUsageTokens", "<init>", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/Set;)V", "Landroid/content/Context;", "context", "publishableKey", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V", "(Landroid/content/Context;Ljavax/inject/Provider;)V", "Lkotlin/Function0;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V", "productUsageTokens", "sourceType", "Lcom/stripe/android/model/Token$Type;", "tokenType", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "threeDS2UiType", "errorMessage", "", "", "additionalParams", "(Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;)Ljava/util/Map;", "createTokenTypeParam", "(Ljava/lang/String;Lcom/stripe/android/model/Token$Type;)Ljava/util/Map;", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "event", "uiTypeCode", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "create3ds2Challenge$payments_core_release", "(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "create3ds2Challenge", "createTokenCreation$payments_core_release", "(Ljava/util/Set;Lcom/stripe/android/model/Token$Type;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createTokenCreation", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "createPaymentMethodCreation$payments_core_release", "(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createPaymentMethodCreation", "paymentMethodType", "createPaymentIntentConfirmation$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createPaymentIntentConfirmation", "createSetupIntentConfirmation$payments_core_release", "createSetupIntentConfirmation", "createRequest$payments_core_release", "(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createRequest", "Ljava/util/Set;", "getDefaultProductUsageTokens$payments_core_release", "()Ljava/util/Set;", "Companion", "ThreeDS2UiType", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class PaymentAnalyticsRequestFactory extends AnalyticsRequestFactory {
    private final Set<String> defaultProductUsageTokens;
    public static final int $stable = 8;

    public /* synthetic */ PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Provider provider2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, packageInfo, str, provider, provider2, (i & 32) != 0 ? SetsKt.emptySet() : set);
    }

    public final Set<String> getDefaultProductUsageTokens$payments_core_release() {
        return this.defaultProductUsageTokens;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, Provider<String> publishableKeyProvider, Provider<String> networkTypeProvider, Set<String> defaultProductUsageTokens) {
        super(packageManager, packageInfo, packageName, publishableKeyProvider, networkTypeProvider, null, 32, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(networkTypeProvider, "networkTypeProvider");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
        this.defaultProductUsageTokens = defaultProductUsageTokens;
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(Context context, String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (Set<String>) ((i & 4) != 0 ? SetsKt.emptySet() : set));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(Context context, final String publishableKey, Set<String> defaultProductUsageTokens) {
        this(context, new Function0<String>() { // from class: com.stripe.android.networking.PaymentAnalyticsRequestFactory.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return publishableKey;
            }
        }, defaultProductUsageTokens);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
    }

    public PaymentAnalyticsRequestFactory(Context context, Provider<String> publishableKeyProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        PackageInfo packageInfo = contextUtils.getPackageInfo(applicationContext);
        String packageName = context.getApplicationContext().getPackageName();
        String str = packageName == null ? "" : packageName;
        final NetworkTypeDetector networkTypeDetector = new NetworkTypeDetector(context);
        this(packageManager, packageInfo, str, publishableKeyProvider, new Provider() { // from class: com.stripe.android.networking.PaymentAnalyticsRequestFactory$$ExternalSyntheticLambda1
            @Override // javax.inject.Provider
            public final Object get() {
                return networkTypeDetector.invoke();
            }
        }, null, 32, null);
    }

    public PaymentAnalyticsRequestFactory(Context context, final Function0<String> publishableKeyProvider, Set<String> defaultProductUsageTokens) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        PackageInfo packageInfo = contextUtils.getPackageInfo(applicationContext);
        String packageName = context.getApplicationContext().getPackageName();
        packageName = packageName == null ? "" : packageName;
        Provider provider = new Provider() { // from class: com.stripe.android.networking.PaymentAnalyticsRequestFactory$$ExternalSyntheticLambda0
            @Override // javax.inject.Provider
            public final Object get() {
                return PaymentAnalyticsRequestFactory._init_$lambda$0(publishableKeyProvider);
            }
        };
        final NetworkTypeDetector networkTypeDetector = new NetworkTypeDetector(context);
        this(packageManager, packageInfo, packageName, provider, new Provider() { // from class: com.stripe.android.networking.PaymentAnalyticsRequestFactory$$ExternalSyntheticLambda1
            @Override // javax.inject.Provider
            public final Object get() {
                return networkTypeDetector.invoke();
            }
        }, defaultProductUsageTokens);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    public final /* synthetic */ AnalyticsRequest create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent event, String uiTypeCode) {
        Intrinsics.checkNotNullParameter(event, "event");
        return createRequest$payments_core_release$default(this, event, null, null, null, ThreeDS2UiType.INSTANCE.fromUiTypeCode(uiTypeCode), null, 46, null);
    }

    public final /* synthetic */ AnalyticsRequest createTokenCreation$payments_core_release(Set productUsageTokens, Token.Type tokenType) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.TokenCreate, productUsageTokens, null, tokenType, null, null, 52, null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentMethodCreation$payments_core_release(String paymentMethodCode, Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentMethodCreate, productUsageTokens, paymentMethodCode, null, null, null, 56, null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release(String paymentMethodType, String errorMessage) {
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentIntentConfirm, null, paymentMethodType, null, null, errorMessage, 26, null);
    }

    public final /* synthetic */ AnalyticsRequest createSetupIntentConfirmation$payments_core_release(String paymentMethodType, String errorMessage) {
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.SetupIntentConfirm, null, paymentMethodType, null, null, errorMessage, 26, null);
    }

    public static /* synthetic */ AnalyticsRequest createRequest$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, PaymentAnalyticsEvent paymentAnalyticsEvent, Set set, String str, Token.Type type2, ThreeDS2UiType threeDS2UiType, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            set = SetsKt.emptySet();
        }
        return paymentAnalyticsRequestFactory.createRequest$payments_core_release(paymentAnalyticsEvent, set, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : type2, (i & 16) != 0 ? null : threeDS2UiType, (i & 32) != 0 ? null : str2);
    }

    public final /* synthetic */ AnalyticsRequest createRequest$payments_core_release(PaymentAnalyticsEvent event, Set productUsageTokens, String sourceType, Token.Type tokenType, ThreeDS2UiType threeDS2UiType, String errorMessage) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest(event, additionalParams(productUsageTokens, sourceType, tokenType, threeDS2UiType, errorMessage));
    }

    private final Map<String, Object> additionalParams(Set<String> productUsageTokens, String sourceType, Token.Type tokenType, ThreeDS2UiType threeDS2UiType, String errorMessage) {
        Set setPlus = SetsKt.plus((Set) this.defaultProductUsageTokens, (Iterable) productUsageTokens);
        if (setPlus.isEmpty()) {
            setPlus = null;
        }
        Map mapMapOf = setPlus != null ? MapsKt.mapOf(Tuples4.m3642to("product_usage", CollectionsKt.toList(setPlus))) : null;
        if (mapMapOf == null) {
            mapMapOf = MapsKt.emptyMap();
        }
        Map mapMapOf2 = sourceType != null ? MapsKt.mapOf(Tuples4.m3642to("source_type", sourceType)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(MapsKt.plus(mapMapOf, mapMapOf2), createTokenTypeParam(sourceType, tokenType));
        Map mapMapOf3 = threeDS2UiType != null ? MapsKt.mapOf(Tuples4.m3642to("3ds2_ui_type", threeDS2UiType.toString())) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf3);
        Map mapMapOf4 = errorMessage != null ? MapsKt.mapOf(Tuples4.m3642to("error_message", errorMessage)) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapPlus2, mapMapOf4);
    }

    private final Map<String, String> createTokenTypeParam(String sourceType, Token.Type tokenType) {
        String code;
        if (tokenType != null) {
            code = tokenType.getCode();
        } else {
            code = sourceType == null ? "unknown" : null;
        }
        Map<String, String> mapMapOf = code != null ? MapsKt.mapOf(Tuples4.m3642to("token_type", code)) : null;
        return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentAnalyticsRequestFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "", "code", "", "typeName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "None", "Text", "SingleSelect", "MultiSelect", "Oob", "Html", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ThreeDS2UiType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ThreeDS2UiType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        private final String typeName;
        public static final ThreeDS2UiType None = new ThreeDS2UiType("None", 0, null, ApiRenderablePlatforms.VERSIONS_NONE);
        public static final ThreeDS2UiType Text = new ThreeDS2UiType("Text", 1, "01", "text");
        public static final ThreeDS2UiType SingleSelect = new ThreeDS2UiType("SingleSelect", 2, "02", "single_select");
        public static final ThreeDS2UiType MultiSelect = new ThreeDS2UiType("MultiSelect", 3, "03", "multi_select");
        public static final ThreeDS2UiType Oob = new ThreeDS2UiType("Oob", 4, "04", "oob");
        public static final ThreeDS2UiType Html = new ThreeDS2UiType("Html", 5, "05", "html");

        private static final /* synthetic */ ThreeDS2UiType[] $values() {
            return new ThreeDS2UiType[]{None, Text, SingleSelect, MultiSelect, Oob, Html};
        }

        public static EnumEntries<ThreeDS2UiType> getEntries() {
            return $ENTRIES;
        }

        public static ThreeDS2UiType valueOf(String str) {
            return (ThreeDS2UiType) Enum.valueOf(ThreeDS2UiType.class, str);
        }

        public static ThreeDS2UiType[] values() {
            return (ThreeDS2UiType[]) $VALUES.clone();
        }

        private ThreeDS2UiType(String str, int i, String str2, String str3) {
            this.code = str2;
            this.typeName = str3;
        }

        static {
            ThreeDS2UiType[] threeDS2UiTypeArr$values = $values();
            $VALUES = threeDS2UiTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(threeDS2UiTypeArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.typeName;
        }

        /* compiled from: PaymentAnalyticsRequestFactory.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;", "", "()V", "fromUiTypeCode", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "uiTypeCode", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ThreeDS2UiType fromUiTypeCode(String uiTypeCode) {
                ThreeDS2UiType next;
                Iterator<ThreeDS2UiType> it = ThreeDS2UiType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.code, uiTypeCode)) {
                        break;
                    }
                }
                ThreeDS2UiType threeDS2UiType = next;
                return threeDS2UiType == null ? ThreeDS2UiType.None : threeDS2UiType;
            }
        }
    }
}
