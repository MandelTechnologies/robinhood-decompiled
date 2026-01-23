package hippo.model.p469v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GeneralSettings.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016JO\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u001fR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000f¨\u0006!"}, m3636d2 = {"Lhippo/model/v1/GeneralSettings;", "Lcom/squareup/wire/Message;", "", "loading_sound_enabled", "", "trading_sound_enabled", "session_change_sound_enabled", "app_color_theme", "Lhippo/model/v1/AppColorTheme;", "privacy_mode_enabled", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhippo/model/v1/AppColorTheme;Ljava/lang/Boolean;Lokio/ByteString;)V", "getLoading_sound_enabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrading_sound_enabled", "getSession_change_sound_enabled", "getApp_color_theme", "()Lhippo/model/v1/AppColorTheme;", "getPrivacy_mode_enabled", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhippo/model/v1/AppColorTheme;Ljava/lang/Boolean;Lokio/ByteString;)Lhippo/model/v1/GeneralSettings;", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GeneralSettings extends Message {

    @JvmField
    public static final ProtoAdapter<GeneralSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.AppColorTheme#ADAPTER", jsonName = "appColorTheme", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AppColorTheme app_color_theme;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "loadingSoundEnabled", schemaIndex = 0, tag = 1)
    private final Boolean loading_sound_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "privacyModeEnabled", schemaIndex = 4, tag = 5)
    private final Boolean privacy_mode_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sessionChangeSoundEnabled", schemaIndex = 2, tag = 3)
    private final Boolean session_change_sound_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tradingSoundEnabled", schemaIndex = 1, tag = 2)
    private final Boolean trading_sound_enabled;

    public GeneralSettings() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28245newBuilder();
    }

    public final Boolean getLoading_sound_enabled() {
        return this.loading_sound_enabled;
    }

    public final Boolean getTrading_sound_enabled() {
        return this.trading_sound_enabled;
    }

    public final Boolean getSession_change_sound_enabled() {
        return this.session_change_sound_enabled;
    }

    public final AppColorTheme getApp_color_theme() {
        return this.app_color_theme;
    }

    public /* synthetic */ GeneralSettings(Boolean bool, Boolean bool2, Boolean bool3, AppColorTheme appColorTheme, Boolean bool4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? AppColorTheme.APP_THEME_UNSPECIFIED : appColorTheme, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Boolean getPrivacy_mode_enabled() {
        return this.privacy_mode_enabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralSettings(Boolean bool, Boolean bool2, Boolean bool3, AppColorTheme app_color_theme, Boolean bool4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(app_color_theme, "app_color_theme");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.loading_sound_enabled = bool;
        this.trading_sound_enabled = bool2;
        this.session_change_sound_enabled = bool3;
        this.app_color_theme = app_color_theme;
        this.privacy_mode_enabled = bool4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28245newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GeneralSettings)) {
            return false;
        }
        GeneralSettings generalSettings = (GeneralSettings) other;
        return Intrinsics.areEqual(unknownFields(), generalSettings.unknownFields()) && Intrinsics.areEqual(this.loading_sound_enabled, generalSettings.loading_sound_enabled) && Intrinsics.areEqual(this.trading_sound_enabled, generalSettings.trading_sound_enabled) && Intrinsics.areEqual(this.session_change_sound_enabled, generalSettings.session_change_sound_enabled) && this.app_color_theme == generalSettings.app_color_theme && Intrinsics.areEqual(this.privacy_mode_enabled, generalSettings.privacy_mode_enabled);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.loading_sound_enabled;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.trading_sound_enabled;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.session_change_sound_enabled;
        int iHashCode4 = (((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 37) + this.app_color_theme.hashCode()) * 37;
        Boolean bool4 = this.privacy_mode_enabled;
        int iHashCode5 = iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.loading_sound_enabled;
        if (bool != null) {
            arrayList.add("loading_sound_enabled=" + bool);
        }
        Boolean bool2 = this.trading_sound_enabled;
        if (bool2 != null) {
            arrayList.add("trading_sound_enabled=" + bool2);
        }
        Boolean bool3 = this.session_change_sound_enabled;
        if (bool3 != null) {
            arrayList.add("session_change_sound_enabled=" + bool3);
        }
        arrayList.add("app_color_theme=" + this.app_color_theme);
        Boolean bool4 = this.privacy_mode_enabled;
        if (bool4 != null) {
            arrayList.add("privacy_mode_enabled=" + bool4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GeneralSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GeneralSettings copy$default(GeneralSettings generalSettings, Boolean bool, Boolean bool2, Boolean bool3, AppColorTheme appColorTheme, Boolean bool4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = generalSettings.loading_sound_enabled;
        }
        if ((i & 2) != 0) {
            bool2 = generalSettings.trading_sound_enabled;
        }
        if ((i & 4) != 0) {
            bool3 = generalSettings.session_change_sound_enabled;
        }
        if ((i & 8) != 0) {
            appColorTheme = generalSettings.app_color_theme;
        }
        if ((i & 16) != 0) {
            bool4 = generalSettings.privacy_mode_enabled;
        }
        if ((i & 32) != 0) {
            byteString = generalSettings.unknownFields();
        }
        Boolean bool5 = bool4;
        ByteString byteString2 = byteString;
        return generalSettings.copy(bool, bool2, bool3, appColorTheme, bool5, byteString2);
    }

    public final GeneralSettings copy(Boolean loading_sound_enabled, Boolean trading_sound_enabled, Boolean session_change_sound_enabled, AppColorTheme app_color_theme, Boolean privacy_mode_enabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(app_color_theme, "app_color_theme");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GeneralSettings(loading_sound_enabled, trading_sound_enabled, session_change_sound_enabled, app_color_theme, privacy_mode_enabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GeneralSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GeneralSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.GeneralSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GeneralSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getLoading_sound_enabled()) + protoAdapter.encodedSizeWithTag(2, value.getTrading_sound_enabled()) + protoAdapter.encodedSizeWithTag(3, value.getSession_change_sound_enabled());
                if (value.getApp_color_theme() != AppColorTheme.APP_THEME_UNSPECIFIED) {
                    iEncodedSizeWithTag += AppColorTheme.ADAPTER.encodedSizeWithTag(4, value.getApp_color_theme());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getPrivacy_mode_enabled());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GeneralSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getLoading_sound_enabled());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTrading_sound_enabled());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSession_change_sound_enabled());
                if (value.getApp_color_theme() != AppColorTheme.APP_THEME_UNSPECIFIED) {
                    AppColorTheme.ADAPTER.encodeWithTag(writer, 4, (int) value.getApp_color_theme());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getPrivacy_mode_enabled());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GeneralSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getPrivacy_mode_enabled());
                if (value.getApp_color_theme() != AppColorTheme.APP_THEME_UNSPECIFIED) {
                    AppColorTheme.ADAPTER.encodeWithTag(writer, 4, (int) value.getApp_color_theme());
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSession_change_sound_enabled());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTrading_sound_enabled());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getLoading_sound_enabled());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GeneralSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AppColorTheme appColorThemeDecode = AppColorTheme.APP_THEME_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                Boolean boolDecode3 = null;
                Boolean boolDecode4 = null;
                while (true) {
                    AppColorTheme appColorTheme = appColorThemeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GeneralSettings(boolDecode, boolDecode2, boolDecode3, appColorTheme, boolDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                        } else if (iNextTag == 2) {
                            boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                        } else if (iNextTag == 3) {
                            boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                appColorThemeDecode = AppColorTheme.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GeneralSettings redact(GeneralSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GeneralSettings.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
