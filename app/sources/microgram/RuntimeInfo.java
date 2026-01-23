package microgram;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.RuntimeInfo;

/* compiled from: RuntimeInfo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0006BCDEAFBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b3\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b=\u0010$R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@¨\u0006G"}, m3636d2 = {"Lmicrogram/RuntimeInfo;", "", "Lmicrogram/RuntimeInfo$Platform;", "platform", "", "appVersion", "buildNumber", "Lmicrogram/RuntimeInfo$ApiEnvironment;", "apiEnvironment", "apolloNamespace", "Lmicrogram/RuntimeInfo$ReleaseVariant;", "releaseVariant", "Lmicrogram/RuntimeInfo$AppType;", "appType", "", "preferredLocales", "formattingLocale", "", "startApplicationFromDebugger", "<init>", "(Lmicrogram/RuntimeInfo$Platform;Ljava/lang/String;Ljava/lang/String;Lmicrogram/RuntimeInfo$ApiEnvironment;Ljava/lang/String;Lmicrogram/RuntimeInfo$ReleaseVariant;Lmicrogram/RuntimeInfo$AppType;Ljava/util/List;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/RuntimeInfo$Platform;Ljava/lang/String;Ljava/lang/String;Lmicrogram/RuntimeInfo$ApiEnvironment;Ljava/lang/String;Lmicrogram/RuntimeInfo$ReleaseVariant;Lmicrogram/RuntimeInfo$AppType;Ljava/util/List;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_core", "(Lmicrogram/RuntimeInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/RuntimeInfo$Platform;", "getPlatform", "()Lmicrogram/RuntimeInfo$Platform;", "Ljava/lang/String;", "getAppVersion", "getBuildNumber", "Lmicrogram/RuntimeInfo$ApiEnvironment;", "getApiEnvironment", "()Lmicrogram/RuntimeInfo$ApiEnvironment;", "getApolloNamespace", "Lmicrogram/RuntimeInfo$ReleaseVariant;", "getReleaseVariant", "()Lmicrogram/RuntimeInfo$ReleaseVariant;", "Lmicrogram/RuntimeInfo$AppType;", "getAppType", "()Lmicrogram/RuntimeInfo$AppType;", "Ljava/util/List;", "getPreferredLocales", "()Ljava/util/List;", "getFormattingLocale", "Z", "getStartApplicationFromDebugger", "()Z", "Companion", "Platform", "ApiEnvironment", "ReleaseVariant", "AppType", "$serializer", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class RuntimeInfo {

    @JvmField
    private static final Lazy<KSerializer<Object>>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<RuntimeInfo> _currentInfo$delegate;
    private final ApiEnvironment apiEnvironment;
    private final String apolloNamespace;
    private final AppType appType;
    private final String appVersion;
    private final String buildNumber;
    private final String formattingLocale;
    private final Platform platform;
    private final List<String> preferredLocales;
    private final ReleaseVariant releaseVariant;
    private final boolean startApplicationFromDebugger;

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Platform.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ApiEnvironment.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return ReleaseVariant.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return AppType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RuntimeInfo)) {
            return false;
        }
        RuntimeInfo runtimeInfo = (RuntimeInfo) other;
        return this.platform == runtimeInfo.platform && Intrinsics.areEqual(this.appVersion, runtimeInfo.appVersion) && Intrinsics.areEqual(this.buildNumber, runtimeInfo.buildNumber) && this.apiEnvironment == runtimeInfo.apiEnvironment && Intrinsics.areEqual(this.apolloNamespace, runtimeInfo.apolloNamespace) && this.releaseVariant == runtimeInfo.releaseVariant && this.appType == runtimeInfo.appType && Intrinsics.areEqual(this.preferredLocales, runtimeInfo.preferredLocales) && Intrinsics.areEqual(this.formattingLocale, runtimeInfo.formattingLocale) && this.startApplicationFromDebugger == runtimeInfo.startApplicationFromDebugger;
    }

    public int hashCode() {
        int iHashCode = ((((((this.platform.hashCode() * 31) + this.appVersion.hashCode()) * 31) + this.buildNumber.hashCode()) * 31) + this.apiEnvironment.hashCode()) * 31;
        String str = this.apolloNamespace;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.releaseVariant.hashCode()) * 31;
        AppType appType = this.appType;
        return ((((((iHashCode2 + (appType != null ? appType.hashCode() : 0)) * 31) + this.preferredLocales.hashCode()) * 31) + this.formattingLocale.hashCode()) * 31) + Boolean.hashCode(this.startApplicationFromDebugger);
    }

    public String toString() {
        return "RuntimeInfo(platform=" + this.platform + ", appVersion=" + this.appVersion + ", buildNumber=" + this.buildNumber + ", apiEnvironment=" + this.apiEnvironment + ", apolloNamespace=" + this.apolloNamespace + ", releaseVariant=" + this.releaseVariant + ", appType=" + this.appType + ", preferredLocales=" + this.preferredLocales + ", formattingLocale=" + this.formattingLocale + ", startApplicationFromDebugger=" + this.startApplicationFromDebugger + ")";
    }

    public /* synthetic */ RuntimeInfo(int i, Platform platform, String str, String str2, ApiEnvironment apiEnvironment, String str3, ReleaseVariant releaseVariant, AppType appType, List list, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptions.throwMissingFieldException(i, 63, RuntimeInfo2.INSTANCE.getDescriptor());
        }
        this.platform = platform;
        this.appVersion = str;
        this.buildNumber = str2;
        this.apiEnvironment = apiEnvironment;
        this.apolloNamespace = str3;
        this.releaseVariant = releaseVariant;
        if ((i & 64) == 0) {
            this.appType = null;
        } else {
            this.appType = appType;
        }
        if ((i & 128) == 0) {
            this.preferredLocales = CollectionsKt.listOf("en-US");
        } else {
            this.preferredLocales = list;
        }
        if ((i & 256) == 0) {
            this.formattingLocale = (String) CollectionsKt.first((List) this.preferredLocales);
        } else {
            this.formattingLocale = str4;
        }
        if ((i & 512) == 0) {
            this.startApplicationFromDebugger = false;
        } else {
            this.startApplicationFromDebugger = z;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_core(RuntimeInfo self, Encoding3 output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.platform);
        output.encodeStringElement(serialDesc, 1, self.appVersion);
        output.encodeStringElement(serialDesc, 2, self.buildNumber);
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.apiEnvironment);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.apolloNamespace);
        output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.releaseVariant);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.appType != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.appType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.preferredLocales, CollectionsKt.listOf("en-US"))) {
            output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.preferredLocales);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual(self.formattingLocale, CollectionsKt.first((List) self.preferredLocales))) {
            output.encodeStringElement(serialDesc, 8, self.formattingLocale);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.startApplicationFromDebugger) {
            output.encodeBooleanElement(serialDesc, 9, self.startApplicationFromDebugger);
        }
    }

    public RuntimeInfo(Platform platform, String appVersion, String buildNumber, ApiEnvironment apiEnvironment, String str, ReleaseVariant releaseVariant, AppType appType, List<String> preferredLocales, String formattingLocale, boolean z) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(buildNumber, "buildNumber");
        Intrinsics.checkNotNullParameter(apiEnvironment, "apiEnvironment");
        Intrinsics.checkNotNullParameter(releaseVariant, "releaseVariant");
        Intrinsics.checkNotNullParameter(preferredLocales, "preferredLocales");
        Intrinsics.checkNotNullParameter(formattingLocale, "formattingLocale");
        this.platform = platform;
        this.appVersion = appVersion;
        this.buildNumber = buildNumber;
        this.apiEnvironment = apiEnvironment;
        this.apolloNamespace = str;
        this.releaseVariant = releaseVariant;
        this.appType = appType;
        this.preferredLocales = preferredLocales;
        this.formattingLocale = formattingLocale;
        this.startApplicationFromDebugger = z;
    }

    public final ReleaseVariant getReleaseVariant() {
        return this.releaseVariant;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RuntimeInfo(Platform platform, String str, String str2, ApiEnvironment apiEnvironment, String str3, ReleaseVariant releaseVariant, AppType appType, List list, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        AppType appType2 = (i & 64) != 0 ? null : appType;
        List listListOf = (i & 128) != 0 ? CollectionsKt.listOf("en-US") : list;
        this(platform, str, str2, apiEnvironment, str3, releaseVariant, appType2, listListOf, (i & 256) != 0 ? (String) CollectionsKt.first(listListOf) : str4, (i & 512) != 0 ? false : z);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RuntimeInfo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/RuntimeInfo$Platform;", "", "<init>", "(Ljava/lang/String;I)V", "ANDROID", "IOS", "WEB", "Companion", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final class Platform {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Platform[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("Android")
        public static final Platform ANDROID = new Platform("ANDROID", 0);

        @SerialName("iOS")
        public static final Platform IOS = new Platform("IOS", 1);

        @SerialName("Web")
        public static final Platform WEB = new Platform("WEB", 2);

        private static final /* synthetic */ Platform[] $values() {
            return new Platform[]{ANDROID, IOS, WEB};
        }

        public static EnumEntries<Platform> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: RuntimeInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/RuntimeInfo$Platform$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/RuntimeInfo$Platform;", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Platform.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Platform> serializer() {
                return get$cachedSerializer();
            }
        }

        private Platform(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return Enums4.createAnnotatedEnumSerializer("microgram.RuntimeInfo.Platform", values(), new String[]{"Android", "iOS", "Web"}, new Annotation[][]{null, null, null}, null);
        }

        static {
            Platform[] platformArr$values = $values();
            $VALUES = platformArr$values;
            $ENTRIES = EnumEntries2.enumEntries(platformArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.RuntimeInfo$Platform$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RuntimeInfo.Platform._init_$_anonymous_();
                }
            });
        }

        public static Platform valueOf(String str) {
            return (Platform) Enum.valueOf(Platform.class, str);
        }

        public static Platform[] values() {
            return (Platform[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RuntimeInfo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/RuntimeInfo$ApiEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCTION", "APOLLO", "Companion", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final class ApiEnvironment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ApiEnvironment[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("production")
        public static final ApiEnvironment PRODUCTION = new ApiEnvironment("PRODUCTION", 0);

        @SerialName("apollo")
        public static final ApiEnvironment APOLLO = new ApiEnvironment("APOLLO", 1);

        private static final /* synthetic */ ApiEnvironment[] $values() {
            return new ApiEnvironment[]{PRODUCTION, APOLLO};
        }

        public static EnumEntries<ApiEnvironment> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: RuntimeInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/RuntimeInfo$ApiEnvironment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/RuntimeInfo$ApiEnvironment;", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) ApiEnvironment.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<ApiEnvironment> serializer() {
                return get$cachedSerializer();
            }
        }

        private ApiEnvironment(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return Enums4.createAnnotatedEnumSerializer("microgram.RuntimeInfo.ApiEnvironment", values(), new String[]{"production", "apollo"}, new Annotation[][]{null, null}, null);
        }

        static {
            ApiEnvironment[] apiEnvironmentArr$values = $values();
            $VALUES = apiEnvironmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(apiEnvironmentArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.RuntimeInfo$ApiEnvironment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RuntimeInfo.ApiEnvironment._init_$_anonymous_();
                }
            });
        }

        public static ApiEnvironment valueOf(String str) {
            return (ApiEnvironment) Enum.valueOf(ApiEnvironment.class, str);
        }

        public static ApiEnvironment[] values() {
            return (ApiEnvironment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RuntimeInfo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lmicrogram/RuntimeInfo$ReleaseVariant;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCTION", "BETA", "NIGHTLY", "DEVELOPMENT", "Companion", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final class ReleaseVariant {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReleaseVariant[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("production")
        public static final ReleaseVariant PRODUCTION = new ReleaseVariant("PRODUCTION", 0);

        @SerialName("beta")
        public static final ReleaseVariant BETA = new ReleaseVariant("BETA", 1);

        @SerialName("nightly")
        public static final ReleaseVariant NIGHTLY = new ReleaseVariant("NIGHTLY", 2);

        @SerialName("development")
        public static final ReleaseVariant DEVELOPMENT = new ReleaseVariant("DEVELOPMENT", 3);

        private static final /* synthetic */ ReleaseVariant[] $values() {
            return new ReleaseVariant[]{PRODUCTION, BETA, NIGHTLY, DEVELOPMENT};
        }

        public static EnumEntries<ReleaseVariant> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: RuntimeInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/RuntimeInfo$ReleaseVariant$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/RuntimeInfo$ReleaseVariant;", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) ReleaseVariant.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<ReleaseVariant> serializer() {
                return get$cachedSerializer();
            }
        }

        private ReleaseVariant(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return Enums4.createAnnotatedEnumSerializer("microgram.RuntimeInfo.ReleaseVariant", values(), new String[]{"production", "beta", "nightly", "development"}, new Annotation[][]{null, null, null, null}, null);
        }

        static {
            ReleaseVariant[] releaseVariantArr$values = $values();
            $VALUES = releaseVariantArr$values;
            $ENTRIES = EnumEntries2.enumEntries(releaseVariantArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.RuntimeInfo$ReleaseVariant$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RuntimeInfo.ReleaseVariant._init_$_anonymous_();
                }
            });
        }

        public static ReleaseVariant valueOf(String str) {
            return (ReleaseVariant) Enum.valueOf(ReleaseVariant.class, str);
        }

        public static ReleaseVariant[] values() {
            return (ReleaseVariant[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RuntimeInfo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/RuntimeInfo$AppType;", "", "<init>", "(Ljava/lang/String;I)V", "TRADER", "RHC", "NCW", "Companion", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final class AppType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AppType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("trader")
        public static final AppType TRADER = new AppType("TRADER", 0);

        @SerialName("rhc")
        public static final AppType RHC = new AppType("RHC", 1);

        @SerialName("ncw")
        public static final AppType NCW = new AppType("NCW", 2);

        private static final /* synthetic */ AppType[] $values() {
            return new AppType[]{TRADER, RHC, NCW};
        }

        public static EnumEntries<AppType> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: RuntimeInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/RuntimeInfo$AppType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/RuntimeInfo$AppType;", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) AppType.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<AppType> serializer() {
                return get$cachedSerializer();
            }
        }

        private AppType(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return Enums4.createAnnotatedEnumSerializer("microgram.RuntimeInfo.AppType", values(), new String[]{"trader", "rhc", "ncw"}, new Annotation[][]{null, null, null}, null);
        }

        static {
            AppType[] appTypeArr$values = $values();
            $VALUES = appTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(appTypeArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.RuntimeInfo$AppType$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RuntimeInfo.AppType._init_$_anonymous_();
                }
            });
        }

        public static AppType valueOf(String str) {
            return (AppType) Enum.valueOf(AppType.class, str);
        }

        public static AppType[] values() {
            return (AppType[]) $VALUES.clone();
        }
    }

    /* compiled from: RuntimeInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lmicrogram/RuntimeInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/RuntimeInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "_overrideRuntimeInfo", "Lmicrogram/RuntimeInfo;", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RuntimeInfo> serializer() {
            return RuntimeInfo2.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.RuntimeInfo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RuntimeInfo._childSerializers$_anonymous_();
            }
        }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.RuntimeInfo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RuntimeInfo._childSerializers$_anonymous_$0();
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.RuntimeInfo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RuntimeInfo._childSerializers$_anonymous_$1();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.RuntimeInfo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RuntimeInfo._childSerializers$_anonymous_$2();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.RuntimeInfo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RuntimeInfo._childSerializers$_anonymous_$3();
            }
        }), null, null};
        _currentInfo$delegate = LazyKt.lazy(new Function0() { // from class: microgram.RuntimeInfo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RuntimeInfo3.getGlobalRuntimeInfo();
            }
        });
    }
}
