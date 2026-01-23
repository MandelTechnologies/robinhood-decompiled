package bff_vitals.service.p021v1;

import bff_vitals.service.p021v1.FetchVitalsRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FetchVitalsRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001e\u001f B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequest;", "Lcom/squareup/wire/Message;", "", "platform", "Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "app", "Lbff_vitals/service/v1/FetchVitalsRequest$App;", "os_version", "", "app_version", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_vitals/service/v1/FetchVitalsRequest$Platform;Lbff_vitals/service/v1/FetchVitalsRequest$App;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPlatform", "()Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "getApp", "()Lbff_vitals/service/v1/FetchVitalsRequest$App;", "getOs_version", "()Ljava/lang/String;", "getApp_version", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Platform", "App", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class FetchVitalsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<FetchVitalsRequest> ADAPTER;

    @WireField(adapter = "bff_vitals.service.v1.FetchVitalsRequest$App#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final App app;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "osVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String os_version;

    @WireField(adapter = "bff_vitals.service.v1.FetchVitalsRequest$Platform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Platform platform;

    public FetchVitalsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8532newBuilder();
    }

    public final Platform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ FetchVitalsRequest(Platform platform, App app, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Platform.PLATFORM_UNSPECIFIED : platform, (i & 2) != 0 ? App.APP_UNSPECIFIED : app, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final App getApp() {
        return this.app;
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchVitalsRequest(Platform platform, App app, String os_version, String app_version, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.app = app;
        this.os_version = os_version;
        this.app_version = app_version;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8532newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FetchVitalsRequest)) {
            return false;
        }
        FetchVitalsRequest fetchVitalsRequest = (FetchVitalsRequest) other;
        return Intrinsics.areEqual(unknownFields(), fetchVitalsRequest.unknownFields()) && this.platform == fetchVitalsRequest.platform && this.app == fetchVitalsRequest.app && Intrinsics.areEqual(this.os_version, fetchVitalsRequest.os_version) && Intrinsics.areEqual(this.app_version, fetchVitalsRequest.app_version);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37) + this.app.hashCode()) * 37) + this.os_version.hashCode()) * 37) + this.app_version.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.platform);
        arrayList.add("app=" + this.app);
        arrayList.add("os_version=" + Internal.sanitize(this.os_version));
        arrayList.add("app_version=" + Internal.sanitize(this.app_version));
        return CollectionsKt.joinToString$default(arrayList, ", ", "FetchVitalsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FetchVitalsRequest copy$default(FetchVitalsRequest fetchVitalsRequest, Platform platform, App app, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            platform = fetchVitalsRequest.platform;
        }
        if ((i & 2) != 0) {
            app = fetchVitalsRequest.app;
        }
        if ((i & 4) != 0) {
            str = fetchVitalsRequest.os_version;
        }
        if ((i & 8) != 0) {
            str2 = fetchVitalsRequest.app_version;
        }
        if ((i & 16) != 0) {
            byteString = fetchVitalsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str;
        return fetchVitalsRequest.copy(platform, app, str3, str2, byteString2);
    }

    public final FetchVitalsRequest copy(Platform platform, App app, String os_version, String app_version, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FetchVitalsRequest(platform, app, os_version, app_version, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FetchVitalsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FetchVitalsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_vitals.service.v1.FetchVitalsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FetchVitalsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != FetchVitalsRequest.Platform.PLATFORM_UNSPECIFIED) {
                    size += FetchVitalsRequest.Platform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getApp() != FetchVitalsRequest.App.APP_UNSPECIFIED) {
                    size += FetchVitalsRequest.App.ADAPTER.encodedSizeWithTag(2, value.getApp());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getOs_version());
                }
                return !Intrinsics.areEqual(value.getApp_version(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getApp_version()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FetchVitalsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != FetchVitalsRequest.Platform.PLATFORM_UNSPECIFIED) {
                    FetchVitalsRequest.Platform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getApp() != FetchVitalsRequest.App.APP_UNSPECIFIED) {
                    FetchVitalsRequest.App.ADAPTER.encodeWithTag(writer, 2, (int) value.getApp());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getApp_version());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FetchVitalsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getApp_version());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOs_version());
                }
                if (value.getApp() != FetchVitalsRequest.App.APP_UNSPECIFIED) {
                    FetchVitalsRequest.App.ADAPTER.encodeWithTag(writer, 2, (int) value.getApp());
                }
                if (value.getPlatform() != FetchVitalsRequest.Platform.PLATFORM_UNSPECIFIED) {
                    FetchVitalsRequest.Platform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FetchVitalsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FetchVitalsRequest.Platform platformDecode = FetchVitalsRequest.Platform.PLATFORM_UNSPECIFIED;
                FetchVitalsRequest.App app = FetchVitalsRequest.App.APP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                FetchVitalsRequest.App appDecode = app;
                while (true) {
                    FetchVitalsRequest.Platform platform = platformDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FetchVitalsRequest(platform, appDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                platformDecode = FetchVitalsRequest.Platform.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                appDecode = FetchVitalsRequest.App.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FetchVitalsRequest redact(FetchVitalsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FetchVitalsRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FetchVitalsRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PLATFORM_UNSPECIFIED", "PLATFORM_ANDROID", "PLATFORM_IOS", "Companion", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Platform implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Platform[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Platform> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Platform PLATFORM_ANDROID;
        public static final Platform PLATFORM_IOS;
        public static final Platform PLATFORM_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Platform[] $values() {
            return new Platform[]{PLATFORM_UNSPECIFIED, PLATFORM_ANDROID, PLATFORM_IOS};
        }

        @JvmStatic
        public static final Platform fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Platform> getEntries() {
            return $ENTRIES;
        }

        private Platform(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Platform platform = new Platform("PLATFORM_UNSPECIFIED", 0, 0);
            PLATFORM_UNSPECIFIED = platform;
            PLATFORM_ANDROID = new Platform("PLATFORM_ANDROID", 1, 1);
            PLATFORM_IOS = new Platform("PLATFORM_IOS", 2, 2);
            Platform[] platformArr$values = $values();
            $VALUES = platformArr$values;
            $ENTRIES = EnumEntries2.enumEntries(platformArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Platform.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Platform>(orCreateKotlinClass, syntax, platform) { // from class: bff_vitals.service.v1.FetchVitalsRequest$Platform$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FetchVitalsRequest.Platform fromValue(int value) {
                    return FetchVitalsRequest.Platform.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FetchVitalsRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequest$Platform$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "fromValue", "value", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Platform fromValue(int value) {
                if (value == 0) {
                    return Platform.PLATFORM_UNSPECIFIED;
                }
                if (value == 1) {
                    return Platform.PLATFORM_ANDROID;
                }
                if (value != 2) {
                    return null;
                }
                return Platform.PLATFORM_IOS;
            }
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
    /* compiled from: FetchVitalsRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequest$App;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APP_UNSPECIFIED", "APP_ROBINHOOD_TRADER", "APP_ROBINHOOD_WALLET", "APP_ROBINHOOD_GLOBAL", "Companion", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class App implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ App[] $VALUES;

        @JvmField
        public static final ProtoAdapter<App> ADAPTER;
        public static final App APP_ROBINHOOD_GLOBAL;
        public static final App APP_ROBINHOOD_TRADER;
        public static final App APP_ROBINHOOD_WALLET;
        public static final App APP_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ App[] $values() {
            return new App[]{APP_UNSPECIFIED, APP_ROBINHOOD_TRADER, APP_ROBINHOOD_WALLET, APP_ROBINHOOD_GLOBAL};
        }

        @JvmStatic
        public static final App fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<App> getEntries() {
            return $ENTRIES;
        }

        private App(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final App app = new App("APP_UNSPECIFIED", 0, 0);
            APP_UNSPECIFIED = app;
            APP_ROBINHOOD_TRADER = new App("APP_ROBINHOOD_TRADER", 1, 1);
            APP_ROBINHOOD_WALLET = new App("APP_ROBINHOOD_WALLET", 2, 2);
            APP_ROBINHOOD_GLOBAL = new App("APP_ROBINHOOD_GLOBAL", 3, 3);
            App[] appArr$values = $values();
            $VALUES = appArr$values;
            $ENTRIES = EnumEntries2.enumEntries(appArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(App.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<App>(orCreateKotlinClass, syntax, app) { // from class: bff_vitals.service.v1.FetchVitalsRequest$App$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FetchVitalsRequest.App fromValue(int value) {
                    return FetchVitalsRequest.App.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FetchVitalsRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequest$App$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_vitals/service/v1/FetchVitalsRequest$App;", "fromValue", "value", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final App fromValue(int value) {
                if (value == 0) {
                    return App.APP_UNSPECIFIED;
                }
                if (value == 1) {
                    return App.APP_ROBINHOOD_TRADER;
                }
                if (value == 2) {
                    return App.APP_ROBINHOOD_WALLET;
                }
                if (value != 3) {
                    return null;
                }
                return App.APP_ROBINHOOD_GLOBAL;
            }
        }

        public static App valueOf(String str) {
            return (App) Enum.valueOf(App.class, str);
        }

        public static App[] values() {
            return (App[]) $VALUES.clone();
        }
    }
}
