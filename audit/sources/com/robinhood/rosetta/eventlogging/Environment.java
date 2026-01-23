package com.robinhood.rosetta.eventlogging;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Environment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J\u009e\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Environment;", "Lcom/squareup/wire/Message;", "", "machine", "Lcom/robinhood/rosetta/eventlogging/Machine;", "xcode", "", "swift", "gradle", "android_gradle_plugin", "kotlin", "android_lint", "androidx_room_compiler", "androidx_lifecycle_compiler", "dagger_compiler", "moshi_kotlin_codegen", "crashlytics_gradle_plugin", "firebase_performance_gradle_plugin", "sqldelight_gradle_plugin", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Machine;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getMachine", "()Lcom/robinhood/rosetta/eventlogging/Machine;", "getXcode", "()Ljava/lang/String;", "getSwift", "getGradle", "getAndroid_gradle_plugin", "getKotlin", "getAndroid_lint", "getAndroidx_room_compiler", "getAndroidx_lifecycle_compiler", "getDagger_compiler", "getMoshi_kotlin_codegen", "getCrashlytics_gradle_plugin", "getFirebase_performance_gradle_plugin", "getSqldelight_gradle_plugin", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Environment extends Message {

    @JvmField
    public static final ProtoAdapter<Environment> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "androidGradlePlugin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String android_gradle_plugin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "androidLint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String android_lint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "androidxLifecycleCompiler", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String androidx_lifecycle_compiler;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "androidxRoomCompiler", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String androidx_room_compiler;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "crashlyticsGradlePlugin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String crashlytics_gradle_plugin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "daggerCompiler", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String dagger_compiler;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "firebasePerformanceGradlePlugin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String firebase_performance_gradle_plugin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String gradle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String kotlin;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Machine#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Machine machine;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "moshiKotlinCodegen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String moshi_kotlin_codegen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sqldelightGradlePlugin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String sqldelight_gradle_plugin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String swift;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String xcode;

    public Environment() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ Environment(Machine machine, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : machine, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) == 0 ? str13 : "", (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24240newBuilder();
    }

    public final Machine getMachine() {
        return this.machine;
    }

    public final String getXcode() {
        return this.xcode;
    }

    public final String getSwift() {
        return this.swift;
    }

    public final String getGradle() {
        return this.gradle;
    }

    public final String getAndroid_gradle_plugin() {
        return this.android_gradle_plugin;
    }

    public final String getKotlin() {
        return this.kotlin;
    }

    public final String getAndroid_lint() {
        return this.android_lint;
    }

    public final String getAndroidx_room_compiler() {
        return this.androidx_room_compiler;
    }

    public final String getAndroidx_lifecycle_compiler() {
        return this.androidx_lifecycle_compiler;
    }

    public final String getDagger_compiler() {
        return this.dagger_compiler;
    }

    public final String getMoshi_kotlin_codegen() {
        return this.moshi_kotlin_codegen;
    }

    public final String getCrashlytics_gradle_plugin() {
        return this.crashlytics_gradle_plugin;
    }

    public final String getFirebase_performance_gradle_plugin() {
        return this.firebase_performance_gradle_plugin;
    }

    public final String getSqldelight_gradle_plugin() {
        return this.sqldelight_gradle_plugin;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Environment(Machine machine, String xcode, String swift, String gradle, String android_gradle_plugin, String kotlin2, String android_lint, String androidx_room_compiler, String androidx_lifecycle_compiler, String dagger_compiler, String moshi_kotlin_codegen, String crashlytics_gradle_plugin, String firebase_performance_gradle_plugin, String sqldelight_gradle_plugin, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(xcode, "xcode");
        Intrinsics.checkNotNullParameter(swift, "swift");
        Intrinsics.checkNotNullParameter(gradle, "gradle");
        Intrinsics.checkNotNullParameter(android_gradle_plugin, "android_gradle_plugin");
        Intrinsics.checkNotNullParameter(kotlin2, "kotlin");
        Intrinsics.checkNotNullParameter(android_lint, "android_lint");
        Intrinsics.checkNotNullParameter(androidx_room_compiler, "androidx_room_compiler");
        Intrinsics.checkNotNullParameter(androidx_lifecycle_compiler, "androidx_lifecycle_compiler");
        Intrinsics.checkNotNullParameter(dagger_compiler, "dagger_compiler");
        Intrinsics.checkNotNullParameter(moshi_kotlin_codegen, "moshi_kotlin_codegen");
        Intrinsics.checkNotNullParameter(crashlytics_gradle_plugin, "crashlytics_gradle_plugin");
        Intrinsics.checkNotNullParameter(firebase_performance_gradle_plugin, "firebase_performance_gradle_plugin");
        Intrinsics.checkNotNullParameter(sqldelight_gradle_plugin, "sqldelight_gradle_plugin");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.machine = machine;
        this.xcode = xcode;
        this.swift = swift;
        this.gradle = gradle;
        this.android_gradle_plugin = android_gradle_plugin;
        this.kotlin = kotlin2;
        this.android_lint = android_lint;
        this.androidx_room_compiler = androidx_room_compiler;
        this.androidx_lifecycle_compiler = androidx_lifecycle_compiler;
        this.dagger_compiler = dagger_compiler;
        this.moshi_kotlin_codegen = moshi_kotlin_codegen;
        this.crashlytics_gradle_plugin = crashlytics_gradle_plugin;
        this.firebase_performance_gradle_plugin = firebase_performance_gradle_plugin;
        this.sqldelight_gradle_plugin = sqldelight_gradle_plugin;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24240newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Environment)) {
            return false;
        }
        Environment environment = (Environment) other;
        return Intrinsics.areEqual(unknownFields(), environment.unknownFields()) && Intrinsics.areEqual(this.machine, environment.machine) && Intrinsics.areEqual(this.xcode, environment.xcode) && Intrinsics.areEqual(this.swift, environment.swift) && Intrinsics.areEqual(this.gradle, environment.gradle) && Intrinsics.areEqual(this.android_gradle_plugin, environment.android_gradle_plugin) && Intrinsics.areEqual(this.kotlin, environment.kotlin) && Intrinsics.areEqual(this.android_lint, environment.android_lint) && Intrinsics.areEqual(this.androidx_room_compiler, environment.androidx_room_compiler) && Intrinsics.areEqual(this.androidx_lifecycle_compiler, environment.androidx_lifecycle_compiler) && Intrinsics.areEqual(this.dagger_compiler, environment.dagger_compiler) && Intrinsics.areEqual(this.moshi_kotlin_codegen, environment.moshi_kotlin_codegen) && Intrinsics.areEqual(this.crashlytics_gradle_plugin, environment.crashlytics_gradle_plugin) && Intrinsics.areEqual(this.firebase_performance_gradle_plugin, environment.firebase_performance_gradle_plugin) && Intrinsics.areEqual(this.sqldelight_gradle_plugin, environment.sqldelight_gradle_plugin);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Machine machine = this.machine;
        int iHashCode2 = ((((((((((((((((((((((((((iHashCode + (machine != null ? machine.hashCode() : 0)) * 37) + this.xcode.hashCode()) * 37) + this.swift.hashCode()) * 37) + this.gradle.hashCode()) * 37) + this.android_gradle_plugin.hashCode()) * 37) + this.kotlin.hashCode()) * 37) + this.android_lint.hashCode()) * 37) + this.androidx_room_compiler.hashCode()) * 37) + this.androidx_lifecycle_compiler.hashCode()) * 37) + this.dagger_compiler.hashCode()) * 37) + this.moshi_kotlin_codegen.hashCode()) * 37) + this.crashlytics_gradle_plugin.hashCode()) * 37) + this.firebase_performance_gradle_plugin.hashCode()) * 37) + this.sqldelight_gradle_plugin.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Machine machine = this.machine;
        if (machine != null) {
            arrayList.add("machine=" + machine);
        }
        arrayList.add("xcode=" + Internal.sanitize(this.xcode));
        arrayList.add("swift=" + Internal.sanitize(this.swift));
        arrayList.add("gradle=" + Internal.sanitize(this.gradle));
        arrayList.add("android_gradle_plugin=" + Internal.sanitize(this.android_gradle_plugin));
        arrayList.add("kotlin=" + Internal.sanitize(this.kotlin));
        arrayList.add("android_lint=" + Internal.sanitize(this.android_lint));
        arrayList.add("androidx_room_compiler=" + Internal.sanitize(this.androidx_room_compiler));
        arrayList.add("androidx_lifecycle_compiler=" + Internal.sanitize(this.androidx_lifecycle_compiler));
        arrayList.add("dagger_compiler=" + Internal.sanitize(this.dagger_compiler));
        arrayList.add("moshi_kotlin_codegen=" + Internal.sanitize(this.moshi_kotlin_codegen));
        arrayList.add("crashlytics_gradle_plugin=" + Internal.sanitize(this.crashlytics_gradle_plugin));
        arrayList.add("firebase_performance_gradle_plugin=" + Internal.sanitize(this.firebase_performance_gradle_plugin));
        arrayList.add("sqldelight_gradle_plugin=" + Internal.sanitize(this.sqldelight_gradle_plugin));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Environment{", "}", 0, null, null, 56, null);
    }

    public final Environment copy(Machine machine, String xcode, String swift, String gradle, String android_gradle_plugin, String kotlin2, String android_lint, String androidx_room_compiler, String androidx_lifecycle_compiler, String dagger_compiler, String moshi_kotlin_codegen, String crashlytics_gradle_plugin, String firebase_performance_gradle_plugin, String sqldelight_gradle_plugin, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(xcode, "xcode");
        Intrinsics.checkNotNullParameter(swift, "swift");
        Intrinsics.checkNotNullParameter(gradle, "gradle");
        Intrinsics.checkNotNullParameter(android_gradle_plugin, "android_gradle_plugin");
        Intrinsics.checkNotNullParameter(kotlin2, "kotlin");
        Intrinsics.checkNotNullParameter(android_lint, "android_lint");
        Intrinsics.checkNotNullParameter(androidx_room_compiler, "androidx_room_compiler");
        Intrinsics.checkNotNullParameter(androidx_lifecycle_compiler, "androidx_lifecycle_compiler");
        Intrinsics.checkNotNullParameter(dagger_compiler, "dagger_compiler");
        Intrinsics.checkNotNullParameter(moshi_kotlin_codegen, "moshi_kotlin_codegen");
        Intrinsics.checkNotNullParameter(crashlytics_gradle_plugin, "crashlytics_gradle_plugin");
        Intrinsics.checkNotNullParameter(firebase_performance_gradle_plugin, "firebase_performance_gradle_plugin");
        Intrinsics.checkNotNullParameter(sqldelight_gradle_plugin, "sqldelight_gradle_plugin");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Environment(machine, xcode, swift, gradle, android_gradle_plugin, kotlin2, android_lint, androidx_room_compiler, androidx_lifecycle_compiler, dagger_compiler, moshi_kotlin_codegen, crashlytics_gradle_plugin, firebase_performance_gradle_plugin, sqldelight_gradle_plugin, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Environment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Environment>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Environment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Environment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMachine() != null) {
                    size += Machine.ADAPTER.encodedSizeWithTag(1, value.getMachine());
                }
                if (!Intrinsics.areEqual(value.getXcode(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getXcode());
                }
                if (!Intrinsics.areEqual(value.getSwift(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSwift());
                }
                if (!Intrinsics.areEqual(value.getGradle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getGradle());
                }
                if (!Intrinsics.areEqual(value.getAndroid_gradle_plugin(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAndroid_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getKotlin(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getKotlin());
                }
                if (!Intrinsics.areEqual(value.getAndroid_lint(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getAndroid_lint());
                }
                if (!Intrinsics.areEqual(value.getAndroidx_room_compiler(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getAndroidx_room_compiler());
                }
                if (!Intrinsics.areEqual(value.getAndroidx_lifecycle_compiler(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getAndroidx_lifecycle_compiler());
                }
                if (!Intrinsics.areEqual(value.getDagger_compiler(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getDagger_compiler());
                }
                if (!Intrinsics.areEqual(value.getMoshi_kotlin_codegen(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getMoshi_kotlin_codegen());
                }
                if (!Intrinsics.areEqual(value.getCrashlytics_gradle_plugin(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getCrashlytics_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getFirebase_performance_gradle_plugin(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getFirebase_performance_gradle_plugin());
                }
                return !Intrinsics.areEqual(value.getSqldelight_gradle_plugin(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(14, value.getSqldelight_gradle_plugin()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Environment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMachine() != null) {
                    Machine.ADAPTER.encodeWithTag(writer, 1, (int) value.getMachine());
                }
                if (!Intrinsics.areEqual(value.getXcode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getXcode());
                }
                if (!Intrinsics.areEqual(value.getSwift(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSwift());
                }
                if (!Intrinsics.areEqual(value.getGradle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getGradle());
                }
                if (!Intrinsics.areEqual(value.getAndroid_gradle_plugin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAndroid_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getKotlin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getKotlin());
                }
                if (!Intrinsics.areEqual(value.getAndroid_lint(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAndroid_lint());
                }
                if (!Intrinsics.areEqual(value.getAndroidx_room_compiler(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAndroidx_room_compiler());
                }
                if (!Intrinsics.areEqual(value.getAndroidx_lifecycle_compiler(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAndroidx_lifecycle_compiler());
                }
                if (!Intrinsics.areEqual(value.getDagger_compiler(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDagger_compiler());
                }
                if (!Intrinsics.areEqual(value.getMoshi_kotlin_codegen(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getMoshi_kotlin_codegen());
                }
                if (!Intrinsics.areEqual(value.getCrashlytics_gradle_plugin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getCrashlytics_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getFirebase_performance_gradle_plugin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getFirebase_performance_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getSqldelight_gradle_plugin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getSqldelight_gradle_plugin());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Environment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSqldelight_gradle_plugin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getSqldelight_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getFirebase_performance_gradle_plugin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getFirebase_performance_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getCrashlytics_gradle_plugin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getCrashlytics_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getMoshi_kotlin_codegen(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getMoshi_kotlin_codegen());
                }
                if (!Intrinsics.areEqual(value.getDagger_compiler(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDagger_compiler());
                }
                if (!Intrinsics.areEqual(value.getAndroidx_lifecycle_compiler(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAndroidx_lifecycle_compiler());
                }
                if (!Intrinsics.areEqual(value.getAndroidx_room_compiler(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAndroidx_room_compiler());
                }
                if (!Intrinsics.areEqual(value.getAndroid_lint(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAndroid_lint());
                }
                if (!Intrinsics.areEqual(value.getKotlin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getKotlin());
                }
                if (!Intrinsics.areEqual(value.getAndroid_gradle_plugin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAndroid_gradle_plugin());
                }
                if (!Intrinsics.areEqual(value.getGradle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getGradle());
                }
                if (!Intrinsics.areEqual(value.getSwift(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSwift());
                }
                if (!Intrinsics.areEqual(value.getXcode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getXcode());
                }
                if (value.getMachine() != null) {
                    Machine.ADAPTER.encodeWithTag(writer, 1, (int) value.getMachine());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Environment redact(Environment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Machine machine = value.getMachine();
                return value.copy((16382 & 1) != 0 ? value.machine : machine != null ? Machine.ADAPTER.redact(machine) : null, (16382 & 2) != 0 ? value.xcode : null, (16382 & 4) != 0 ? value.swift : null, (16382 & 8) != 0 ? value.gradle : null, (16382 & 16) != 0 ? value.android_gradle_plugin : null, (16382 & 32) != 0 ? value.kotlin : null, (16382 & 64) != 0 ? value.android_lint : null, (16382 & 128) != 0 ? value.androidx_room_compiler : null, (16382 & 256) != 0 ? value.androidx_lifecycle_compiler : null, (16382 & 512) != 0 ? value.dagger_compiler : null, (16382 & 1024) != 0 ? value.moshi_kotlin_codegen : null, (16382 & 2048) != 0 ? value.crashlytics_gradle_plugin : null, (16382 & 4096) != 0 ? value.firebase_performance_gradle_plugin : null, (16382 & 8192) != 0 ? value.sqldelight_gradle_plugin : null, (16382 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Environment decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Machine machineDecode = null;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                machineDecode = Machine.ADAPTER.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode = str;
                    } else {
                        return new Environment(machineDecode, str, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
