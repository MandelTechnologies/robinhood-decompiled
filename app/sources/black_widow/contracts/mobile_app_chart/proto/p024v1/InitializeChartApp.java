package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: InitializeChartApp.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/InitializeChartApp;", "Lcom/squareup/wire/Message;", "", "auth_state", "Lblack_widow/contracts/mobile_app_chart/proto/v1/AuthState;", "is_accessible_theme", "", "native_user_agent", "", "supported_features", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/AuthState;ZLjava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getAuth_state", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/AuthState;", "()Z", "getNative_user_agent", "()Ljava/lang/String;", "getSupported_features", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InitializeChartApp extends Message {

    @JvmField
    public static final ProtoAdapter<InitializeChartApp> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.AuthState#ADAPTER", jsonName = "authState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AuthState auth_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAccessibleTheme", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_accessible_theme;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nativeUserAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String native_user_agent;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.MobileAppFeature#ADAPTER", jsonName = "supportedFeatures", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<MobileAppFeature> supported_features;

    public InitializeChartApp() {
        this(null, false, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8616newBuilder();
    }

    public final AuthState getAuth_state() {
        return this.auth_state;
    }

    /* renamed from: is_accessible_theme, reason: from getter */
    public final boolean getIs_accessible_theme() {
        return this.is_accessible_theme;
    }

    public final String getNative_user_agent() {
        return this.native_user_agent;
    }

    public /* synthetic */ InitializeChartApp(AuthState authState, boolean z, String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authState, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeChartApp(AuthState authState, boolean z, String native_user_agent, List<? extends MobileAppFeature> supported_features, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(native_user_agent, "native_user_agent");
        Intrinsics.checkNotNullParameter(supported_features, "supported_features");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.auth_state = authState;
        this.is_accessible_theme = z;
        this.native_user_agent = native_user_agent;
        this.supported_features = Internal.immutableCopyOf("supported_features", supported_features);
    }

    public final List<MobileAppFeature> getSupported_features() {
        return this.supported_features;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8616newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InitializeChartApp)) {
            return false;
        }
        InitializeChartApp initializeChartApp = (InitializeChartApp) other;
        return Intrinsics.areEqual(unknownFields(), initializeChartApp.unknownFields()) && Intrinsics.areEqual(this.auth_state, initializeChartApp.auth_state) && this.is_accessible_theme == initializeChartApp.is_accessible_theme && Intrinsics.areEqual(this.native_user_agent, initializeChartApp.native_user_agent) && Intrinsics.areEqual(this.supported_features, initializeChartApp.supported_features);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AuthState authState = this.auth_state;
        int iHashCode2 = ((((((iHashCode + (authState != null ? authState.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_accessible_theme)) * 37) + this.native_user_agent.hashCode()) * 37) + this.supported_features.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AuthState authState = this.auth_state;
        if (authState != null) {
            arrayList.add("auth_state=" + authState);
        }
        arrayList.add("is_accessible_theme=" + this.is_accessible_theme);
        arrayList.add("native_user_agent=" + Internal.sanitize(this.native_user_agent));
        if (!this.supported_features.isEmpty()) {
            arrayList.add("supported_features=" + this.supported_features);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitializeChartApp{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InitializeChartApp copy$default(InitializeChartApp initializeChartApp, AuthState authState, boolean z, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            authState = initializeChartApp.auth_state;
        }
        if ((i & 2) != 0) {
            z = initializeChartApp.is_accessible_theme;
        }
        if ((i & 4) != 0) {
            str = initializeChartApp.native_user_agent;
        }
        if ((i & 8) != 0) {
            list = initializeChartApp.supported_features;
        }
        if ((i & 16) != 0) {
            byteString = initializeChartApp.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str2 = str;
        return initializeChartApp.copy(authState, z, str2, list, byteString2);
    }

    public final InitializeChartApp copy(AuthState auth_state, boolean is_accessible_theme, String native_user_agent, List<? extends MobileAppFeature> supported_features, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(native_user_agent, "native_user_agent");
        Intrinsics.checkNotNullParameter(supported_features, "supported_features");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InitializeChartApp(auth_state, is_accessible_theme, native_user_agent, supported_features, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InitializeChartApp.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InitializeChartApp>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.InitializeChartApp$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InitializeChartApp value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAuth_state() != null) {
                    size += AuthState.ADAPTER.encodedSizeWithTag(1, value.getAuth_state());
                }
                if (value.getIs_accessible_theme()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_accessible_theme()));
                }
                if (!Intrinsics.areEqual(value.getNative_user_agent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNative_user_agent());
                }
                return size + MobileAppFeature.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getSupported_features());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InitializeChartApp value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAuth_state() != null) {
                    AuthState.ADAPTER.encodeWithTag(writer, 1, (int) value.getAuth_state());
                }
                if (value.getIs_accessible_theme()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_accessible_theme()));
                }
                if (!Intrinsics.areEqual(value.getNative_user_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNative_user_agent());
                }
                MobileAppFeature.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSupported_features());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InitializeChartApp value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MobileAppFeature.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSupported_features());
                if (!Intrinsics.areEqual(value.getNative_user_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNative_user_agent());
                }
                if (value.getIs_accessible_theme()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_accessible_theme()));
                }
                if (value.getAuth_state() != null) {
                    AuthState.ADAPTER.encodeWithTag(writer, 1, (int) value.getAuth_state());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InitializeChartApp decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                AuthState authStateDecode = null;
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    AuthState authState = authStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new InitializeChartApp(authState, zBooleanValue, strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            } else if (iNextTag == 3) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 4) {
                                try {
                                    MobileAppFeature.ADAPTER.tryDecode(reader, arrayList);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    authStateDecode = AuthState.ADAPTER.decode(reader);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InitializeChartApp redact(InitializeChartApp value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AuthState auth_state = value.getAuth_state();
                return InitializeChartApp.copy$default(value, auth_state != null ? AuthState.ADAPTER.redact(auth_state) : null, false, null, null, ByteString.EMPTY, 14, null);
            }
        };
    }
}
