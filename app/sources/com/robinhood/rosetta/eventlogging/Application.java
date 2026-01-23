package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.eventlogging.Application;
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

/* compiled from: Application.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020\u0007H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016Jl\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Application;", "Lcom/squareup/wire/Message;", "", "version", "", "app_id", "build_number", "", "locale", "language", "release_channel", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "web_bundle_experiment_name", "web_bundle_experiment_variant", AnalyticsStrings.BUTTON_GROUP_APP_APPEARANCE_SETTINGS, "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings;Lokio/ByteString;)V", "getVersion", "()Ljava/lang/String;", "getApp_id", "getBuild_number", "()I", "getLocale", "getLanguage", "getRelease_channel", "()Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "getWeb_bundle_experiment_name", "getWeb_bundle_experiment_variant", "getApp_appearance_settings", "()Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "ReleaseChannel", "AppAppearanceSettings", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Application extends Message {

    @JvmField
    public static final ProtoAdapter<Application> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Application$AppAppearanceSettings#ADAPTER", jsonName = "appAppearanceSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final AppAppearanceSettings app_appearance_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String app_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "buildNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int build_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String language;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String locale;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Application$ReleaseChannel#ADAPTER", jsonName = "releaseChannel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ReleaseChannel release_channel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webBundleExperimentName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String web_bundle_experiment_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webBundleExperimentVariant", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String web_bundle_experiment_variant;

    public Application() {
        this(null, null, 0, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ Application(String str, String str2, int i, String str3, String str4, ReleaseChannel releaseChannel, String str5, String str6, AppAppearanceSettings appAppearanceSettings, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? ReleaseChannel.RELEASE_CHANNEL_UNSPECIFIED : releaseChannel, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? null : appAppearanceSettings, (i2 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24014newBuilder();
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getApp_id() {
        return this.app_id;
    }

    public final int getBuild_number() {
        return this.build_number;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final ReleaseChannel getRelease_channel() {
        return this.release_channel;
    }

    public final String getWeb_bundle_experiment_name() {
        return this.web_bundle_experiment_name;
    }

    public final String getWeb_bundle_experiment_variant() {
        return this.web_bundle_experiment_variant;
    }

    public final AppAppearanceSettings getApp_appearance_settings() {
        return this.app_appearance_settings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Application(String version, String app_id, int i, String locale, String language, ReleaseChannel release_channel, String web_bundle_experiment_name, String web_bundle_experiment_variant, AppAppearanceSettings appAppearanceSettings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(release_channel, "release_channel");
        Intrinsics.checkNotNullParameter(web_bundle_experiment_name, "web_bundle_experiment_name");
        Intrinsics.checkNotNullParameter(web_bundle_experiment_variant, "web_bundle_experiment_variant");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.version = version;
        this.app_id = app_id;
        this.build_number = i;
        this.locale = locale;
        this.language = language;
        this.release_channel = release_channel;
        this.web_bundle_experiment_name = web_bundle_experiment_name;
        this.web_bundle_experiment_variant = web_bundle_experiment_variant;
        this.app_appearance_settings = appAppearanceSettings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24014newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Application)) {
            return false;
        }
        Application application = (Application) other;
        return Intrinsics.areEqual(unknownFields(), application.unknownFields()) && Intrinsics.areEqual(this.version, application.version) && Intrinsics.areEqual(this.app_id, application.app_id) && this.build_number == application.build_number && Intrinsics.areEqual(this.locale, application.locale) && Intrinsics.areEqual(this.language, application.language) && this.release_channel == application.release_channel && Intrinsics.areEqual(this.web_bundle_experiment_name, application.web_bundle_experiment_name) && Intrinsics.areEqual(this.web_bundle_experiment_variant, application.web_bundle_experiment_variant) && Intrinsics.areEqual(this.app_appearance_settings, application.app_appearance_settings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.version.hashCode()) * 37) + this.app_id.hashCode()) * 37) + Integer.hashCode(this.build_number)) * 37) + this.locale.hashCode()) * 37) + this.language.hashCode()) * 37) + this.release_channel.hashCode()) * 37) + this.web_bundle_experiment_name.hashCode()) * 37) + this.web_bundle_experiment_variant.hashCode()) * 37;
        AppAppearanceSettings appAppearanceSettings = this.app_appearance_settings;
        int iHashCode2 = iHashCode + (appAppearanceSettings != null ? appAppearanceSettings.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("version=" + Internal.sanitize(this.version));
        arrayList.add("app_id=" + Internal.sanitize(this.app_id));
        arrayList.add("build_number=" + this.build_number);
        arrayList.add("locale=" + Internal.sanitize(this.locale));
        arrayList.add("language=" + Internal.sanitize(this.language));
        arrayList.add("release_channel=" + this.release_channel);
        arrayList.add("web_bundle_experiment_name=" + Internal.sanitize(this.web_bundle_experiment_name));
        arrayList.add("web_bundle_experiment_variant=" + Internal.sanitize(this.web_bundle_experiment_variant));
        AppAppearanceSettings appAppearanceSettings = this.app_appearance_settings;
        if (appAppearanceSettings != null) {
            arrayList.add("app_appearance_settings=" + appAppearanceSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Application{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Application copy$default(Application application, String str, String str2, int i, String str3, String str4, ReleaseChannel releaseChannel, String str5, String str6, AppAppearanceSettings appAppearanceSettings, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = application.version;
        }
        if ((i2 & 2) != 0) {
            str2 = application.app_id;
        }
        if ((i2 & 4) != 0) {
            i = application.build_number;
        }
        if ((i2 & 8) != 0) {
            str3 = application.locale;
        }
        if ((i2 & 16) != 0) {
            str4 = application.language;
        }
        if ((i2 & 32) != 0) {
            releaseChannel = application.release_channel;
        }
        if ((i2 & 64) != 0) {
            str5 = application.web_bundle_experiment_name;
        }
        if ((i2 & 128) != 0) {
            str6 = application.web_bundle_experiment_variant;
        }
        if ((i2 & 256) != 0) {
            appAppearanceSettings = application.app_appearance_settings;
        }
        if ((i2 & 512) != 0) {
            byteString = application.unknownFields();
        }
        AppAppearanceSettings appAppearanceSettings2 = appAppearanceSettings;
        ByteString byteString2 = byteString;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        ReleaseChannel releaseChannel2 = releaseChannel;
        return application.copy(str, str2, i, str3, str9, releaseChannel2, str7, str8, appAppearanceSettings2, byteString2);
    }

    public final Application copy(String version, String app_id, int build_number, String locale, String language, ReleaseChannel release_channel, String web_bundle_experiment_name, String web_bundle_experiment_variant, AppAppearanceSettings app_appearance_settings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(release_channel, "release_channel");
        Intrinsics.checkNotNullParameter(web_bundle_experiment_name, "web_bundle_experiment_name");
        Intrinsics.checkNotNullParameter(web_bundle_experiment_variant, "web_bundle_experiment_variant");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Application(version, app_id, build_number, locale, language, release_channel, web_bundle_experiment_name, web_bundle_experiment_variant, app_appearance_settings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Application.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Application>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Application$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Application value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getVersion());
                }
                if (!Intrinsics.areEqual(value.getApp_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getApp_id());
                }
                if (value.getBuild_number() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getBuild_number()));
                }
                if (!Intrinsics.areEqual(value.getLocale(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLocale());
                }
                if (!Intrinsics.areEqual(value.getLanguage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLanguage());
                }
                if (value.getRelease_channel() != Application.ReleaseChannel.RELEASE_CHANNEL_UNSPECIFIED) {
                    size += Application.ReleaseChannel.ADAPTER.encodedSizeWithTag(6, value.getRelease_channel());
                }
                if (!Intrinsics.areEqual(value.getWeb_bundle_experiment_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getWeb_bundle_experiment_name());
                }
                if (!Intrinsics.areEqual(value.getWeb_bundle_experiment_variant(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getWeb_bundle_experiment_variant());
                }
                return value.getApp_appearance_settings() != null ? size + Application.AppAppearanceSettings.ADAPTER.encodedSizeWithTag(9, value.getApp_appearance_settings()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Application value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVersion());
                }
                if (!Intrinsics.areEqual(value.getApp_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApp_id());
                }
                if (value.getBuild_number() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getBuild_number()));
                }
                if (!Intrinsics.areEqual(value.getLocale(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLocale());
                }
                if (!Intrinsics.areEqual(value.getLanguage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLanguage());
                }
                if (value.getRelease_channel() != Application.ReleaseChannel.RELEASE_CHANNEL_UNSPECIFIED) {
                    Application.ReleaseChannel.ADAPTER.encodeWithTag(writer, 6, (int) value.getRelease_channel());
                }
                if (!Intrinsics.areEqual(value.getWeb_bundle_experiment_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getWeb_bundle_experiment_name());
                }
                if (!Intrinsics.areEqual(value.getWeb_bundle_experiment_variant(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getWeb_bundle_experiment_variant());
                }
                if (value.getApp_appearance_settings() != null) {
                    Application.AppAppearanceSettings.ADAPTER.encodeWithTag(writer, 9, (int) value.getApp_appearance_settings());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Application value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getApp_appearance_settings() != null) {
                    Application.AppAppearanceSettings.ADAPTER.encodeWithTag(writer, 9, (int) value.getApp_appearance_settings());
                }
                if (!Intrinsics.areEqual(value.getWeb_bundle_experiment_variant(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getWeb_bundle_experiment_variant());
                }
                if (!Intrinsics.areEqual(value.getWeb_bundle_experiment_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getWeb_bundle_experiment_name());
                }
                if (value.getRelease_channel() != Application.ReleaseChannel.RELEASE_CHANNEL_UNSPECIFIED) {
                    Application.ReleaseChannel.ADAPTER.encodeWithTag(writer, 6, (int) value.getRelease_channel());
                }
                if (!Intrinsics.areEqual(value.getLanguage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLanguage());
                }
                if (!Intrinsics.areEqual(value.getLocale(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLocale());
                }
                if (value.getBuild_number() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getBuild_number()));
                }
                if (!Intrinsics.areEqual(value.getApp_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApp_id());
                }
                if (Intrinsics.areEqual(value.getVersion(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVersion());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Application decode(ProtoReader reader) throws IOException {
                Application.ReleaseChannel releaseChannel;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Application.ReleaseChannel releaseChannel2 = Application.ReleaseChannel.RELEASE_CHANNEL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                int iIntValue = 0;
                Application.AppAppearanceSettings appAppearanceSettingsDecode = null;
                Application.ReleaseChannel releaseChannelDecode = releaseChannel2;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                try {
                                    releaseChannelDecode = Application.ReleaseChannel.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    releaseChannel = releaseChannelDecode;
                                    str = strDecode5;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                appAppearanceSettingsDecode = Application.AppAppearanceSettings.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                releaseChannel = releaseChannelDecode;
                                str = strDecode5;
                                break;
                        }
                        strDecode5 = str;
                        releaseChannelDecode = releaseChannel;
                    } else {
                        return new Application(strDecode5, strDecode6, iIntValue, strDecode, strDecode2, releaseChannelDecode, strDecode3, strDecode4, appAppearanceSettingsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Application redact(Application value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Application.AppAppearanceSettings app_appearance_settings = value.getApp_appearance_settings();
                return Application.copy$default(value, null, null, 0, null, null, null, null, null, app_appearance_settings != null ? Application.AppAppearanceSettings.ADAPTER.redact(app_appearance_settings) : null, ByteString.EMPTY, 255, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Application.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RELEASE_CHANNEL_UNSPECIFIED", "PRODUCTION", "BETA", "NIGHTLY", "CANARY", "BASELINE", "TEST", "LOCAL", "LATEST", "DEV", "PREVIEW", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReleaseChannel implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReleaseChannel[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ReleaseChannel> ADAPTER;
        public static final ReleaseChannel BASELINE;
        public static final ReleaseChannel BETA;
        public static final ReleaseChannel CANARY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ReleaseChannel DEV;
        public static final ReleaseChannel LATEST;
        public static final ReleaseChannel LOCAL;
        public static final ReleaseChannel NIGHTLY;
        public static final ReleaseChannel PREVIEW;
        public static final ReleaseChannel PRODUCTION;
        public static final ReleaseChannel RELEASE_CHANNEL_UNSPECIFIED;
        public static final ReleaseChannel TEST;
        private final int value;

        private static final /* synthetic */ ReleaseChannel[] $values() {
            return new ReleaseChannel[]{RELEASE_CHANNEL_UNSPECIFIED, PRODUCTION, BETA, NIGHTLY, CANARY, BASELINE, TEST, LOCAL, LATEST, DEV, PREVIEW};
        }

        @JvmStatic
        public static final ReleaseChannel fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ReleaseChannel> getEntries() {
            return $ENTRIES;
        }

        private ReleaseChannel(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ReleaseChannel releaseChannel = new ReleaseChannel("RELEASE_CHANNEL_UNSPECIFIED", 0, 0);
            RELEASE_CHANNEL_UNSPECIFIED = releaseChannel;
            PRODUCTION = new ReleaseChannel("PRODUCTION", 1, 1);
            BETA = new ReleaseChannel("BETA", 2, 2);
            NIGHTLY = new ReleaseChannel("NIGHTLY", 3, 3);
            CANARY = new ReleaseChannel("CANARY", 4, 4);
            BASELINE = new ReleaseChannel("BASELINE", 5, 5);
            TEST = new ReleaseChannel("TEST", 6, 6);
            LOCAL = new ReleaseChannel("LOCAL", 7, 7);
            LATEST = new ReleaseChannel("LATEST", 8, 8);
            DEV = new ReleaseChannel("DEV", 9, 9);
            PREVIEW = new ReleaseChannel("PREVIEW", 10, 10);
            ReleaseChannel[] releaseChannelArr$values = $values();
            $VALUES = releaseChannelArr$values;
            $ENTRIES = EnumEntries2.enumEntries(releaseChannelArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReleaseChannel.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ReleaseChannel>(orCreateKotlinClass, syntax, releaseChannel) { // from class: com.robinhood.rosetta.eventlogging.Application$ReleaseChannel$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Application.ReleaseChannel fromValue(int value) {
                    return Application.ReleaseChannel.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Application.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ReleaseChannel fromValue(int value) {
                switch (value) {
                    case 0:
                        return ReleaseChannel.RELEASE_CHANNEL_UNSPECIFIED;
                    case 1:
                        return ReleaseChannel.PRODUCTION;
                    case 2:
                        return ReleaseChannel.BETA;
                    case 3:
                        return ReleaseChannel.NIGHTLY;
                    case 4:
                        return ReleaseChannel.CANARY;
                    case 5:
                        return ReleaseChannel.BASELINE;
                    case 6:
                        return ReleaseChannel.TEST;
                    case 7:
                        return ReleaseChannel.LOCAL;
                    case 8:
                        return ReleaseChannel.LATEST;
                    case 9:
                        return ReleaseChannel.DEV;
                    case 10:
                        return ReleaseChannel.PREVIEW;
                    default:
                        return null;
                }
            }
        }

        public static ReleaseChannel valueOf(String str) {
            return (ReleaseChannel) Enum.valueOf(ReleaseChannel.class, str);
        }

        public static ReleaseChannel[] values() {
            return (ReleaseChannel[]) $VALUES.clone();
        }
    }

    /* compiled from: Application.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings;", "Lcom/squareup/wire/Message;", "", "theme_setting", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "is_accessible_colors", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;ZLokio/ByteString;)V", "getTheme_setting", "()Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ThemeSetting", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class AppAppearanceSettings extends Message {

        @JvmField
        public static final ProtoAdapter<AppAppearanceSettings> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAccessibleColors", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final boolean is_accessible_colors;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.Application$AppAppearanceSettings$ThemeSetting#ADAPTER", jsonName = "themeSetting", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final ThemeSetting theme_setting;

        public AppAppearanceSettings() {
            this(null, false, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24015newBuilder();
        }

        public final ThemeSetting getTheme_setting() {
            return this.theme_setting;
        }

        public /* synthetic */ AppAppearanceSettings(ThemeSetting themeSetting, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ThemeSetting.THEME_SETTING_UNSPECIFIED : themeSetting, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* renamed from: is_accessible_colors, reason: from getter */
        public final boolean getIs_accessible_colors() {
            return this.is_accessible_colors;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppAppearanceSettings(ThemeSetting theme_setting, boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(theme_setting, "theme_setting");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.theme_setting = theme_setting;
            this.is_accessible_colors = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24015newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AppAppearanceSettings)) {
                return false;
            }
            AppAppearanceSettings appAppearanceSettings = (AppAppearanceSettings) other;
            return Intrinsics.areEqual(unknownFields(), appAppearanceSettings.unknownFields()) && this.theme_setting == appAppearanceSettings.theme_setting && this.is_accessible_colors == appAppearanceSettings.is_accessible_colors;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.theme_setting.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_accessible_colors);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("theme_setting=" + this.theme_setting);
            arrayList.add("is_accessible_colors=" + this.is_accessible_colors);
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppAppearanceSettings{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ AppAppearanceSettings copy$default(AppAppearanceSettings appAppearanceSettings, ThemeSetting themeSetting, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                themeSetting = appAppearanceSettings.theme_setting;
            }
            if ((i & 2) != 0) {
                z = appAppearanceSettings.is_accessible_colors;
            }
            if ((i & 4) != 0) {
                byteString = appAppearanceSettings.unknownFields();
            }
            return appAppearanceSettings.copy(themeSetting, z, byteString);
        }

        public final AppAppearanceSettings copy(ThemeSetting theme_setting, boolean is_accessible_colors, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(theme_setting, "theme_setting");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new AppAppearanceSettings(theme_setting, is_accessible_colors, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppAppearanceSettings.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<AppAppearanceSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Application$AppAppearanceSettings$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Application.AppAppearanceSettings value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getTheme_setting() != Application.AppAppearanceSettings.ThemeSetting.THEME_SETTING_UNSPECIFIED) {
                        size += Application.AppAppearanceSettings.ThemeSetting.ADAPTER.encodedSizeWithTag(1, value.getTheme_setting());
                    }
                    return value.getIs_accessible_colors() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getIs_accessible_colors())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Application.AppAppearanceSettings value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getTheme_setting() != Application.AppAppearanceSettings.ThemeSetting.THEME_SETTING_UNSPECIFIED) {
                        Application.AppAppearanceSettings.ThemeSetting.ADAPTER.encodeWithTag(writer, 1, (int) value.getTheme_setting());
                    }
                    if (value.getIs_accessible_colors()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIs_accessible_colors()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Application.AppAppearanceSettings value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getIs_accessible_colors()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIs_accessible_colors()));
                    }
                    if (value.getTheme_setting() != Application.AppAppearanceSettings.ThemeSetting.THEME_SETTING_UNSPECIFIED) {
                        Application.AppAppearanceSettings.ThemeSetting.ADAPTER.encodeWithTag(writer, 1, (int) value.getTheme_setting());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Application.AppAppearanceSettings decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Application.AppAppearanceSettings.ThemeSetting themeSettingDecode = Application.AppAppearanceSettings.ThemeSetting.THEME_SETTING_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    boolean zBooleanValue = false;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Application.AppAppearanceSettings(themeSettingDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                themeSettingDecode = Application.AppAppearanceSettings.ThemeSetting.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Application.AppAppearanceSettings redact(Application.AppAppearanceSettings value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return Application.AppAppearanceSettings.copy$default(value, null, false, ByteString.EMPTY, 3, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Application.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "THEME_SETTING_UNSPECIFIED", "MARKET_HOURS", "LIGHT", "DARK", "SYSTEM", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ThemeSetting implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ThemeSetting[] $VALUES;

            @JvmField
            public static final ProtoAdapter<ThemeSetting> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final ThemeSetting DARK;
            public static final ThemeSetting LIGHT;
            public static final ThemeSetting MARKET_HOURS;
            public static final ThemeSetting SYSTEM;
            public static final ThemeSetting THEME_SETTING_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ ThemeSetting[] $values() {
                return new ThemeSetting[]{THEME_SETTING_UNSPECIFIED, MARKET_HOURS, LIGHT, DARK, SYSTEM};
            }

            @JvmStatic
            public static final ThemeSetting fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<ThemeSetting> getEntries() {
                return $ENTRIES;
            }

            private ThemeSetting(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final ThemeSetting themeSetting = new ThemeSetting("THEME_SETTING_UNSPECIFIED", 0, 0);
                THEME_SETTING_UNSPECIFIED = themeSetting;
                MARKET_HOURS = new ThemeSetting("MARKET_HOURS", 1, 1);
                LIGHT = new ThemeSetting("LIGHT", 2, 2);
                DARK = new ThemeSetting("DARK", 3, 3);
                SYSTEM = new ThemeSetting("SYSTEM", 4, 4);
                ThemeSetting[] themeSettingArr$values = $values();
                $VALUES = themeSettingArr$values;
                $ENTRIES = EnumEntries2.enumEntries(themeSettingArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ThemeSetting.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<ThemeSetting>(orCreateKotlinClass, syntax, themeSetting) { // from class: com.robinhood.rosetta.eventlogging.Application$AppAppearanceSettings$ThemeSetting$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public Application.AppAppearanceSettings.ThemeSetting fromValue(int value) {
                        return Application.AppAppearanceSettings.ThemeSetting.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: Application.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final ThemeSetting fromValue(int value) {
                    if (value == 0) {
                        return ThemeSetting.THEME_SETTING_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return ThemeSetting.MARKET_HOURS;
                    }
                    if (value == 2) {
                        return ThemeSetting.LIGHT;
                    }
                    if (value == 3) {
                        return ThemeSetting.DARK;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return ThemeSetting.SYSTEM;
                }
            }

            public static ThemeSetting valueOf(String str) {
                return (ThemeSetting) Enum.valueOf(ThemeSetting.class, str);
            }

            public static ThemeSetting[] values() {
                return (ThemeSetting[]) $VALUES.clone();
            }
        }
    }
}
