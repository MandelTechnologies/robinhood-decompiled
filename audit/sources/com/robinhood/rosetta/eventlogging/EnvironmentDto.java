package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.MachineDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: EnvironmentDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000489:;B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0097\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0018J\u0094\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bJ\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u000bH\u0016J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000201H\u0016J\b\u00107\u001a\u000201H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001c¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Environment;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$Surrogate;)V", "machine", "Lcom/robinhood/rosetta/eventlogging/MachineDto;", "xcode", "", "swift", "gradle", "android_gradle_plugin", "kotlin", "android_lint", "androidx_room_compiler", "androidx_lifecycle_compiler", "dagger_compiler", "moshi_kotlin_codegen", "crashlytics_gradle_plugin", "firebase_performance_gradle_plugin", "sqldelight_gradle_plugin", "(Lcom/robinhood/rosetta/eventlogging/MachineDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMachine", "()Lcom/robinhood/rosetta/eventlogging/MachineDto;", "getXcode", "()Ljava/lang/String;", "getSwift", "getGradle", "getAndroid_gradle_plugin", "getKotlin", "getAndroid_lint", "getAndroidx_room_compiler", "getAndroidx_lifecycle_compiler", "getDagger_compiler", "getMoshi_kotlin_codegen", "getCrashlytics_gradle_plugin", "getFirebase_performance_gradle_plugin", "getSqldelight_gradle_plugin", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class EnvironmentDto implements Dto3<Environment>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EnvironmentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EnvironmentDto, Environment>> binaryBase64Serializer$delegate;
    private static final EnvironmentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EnvironmentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EnvironmentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MachineDto getMachine() {
        return this.surrogate.getMachine();
    }

    public final String getXcode() {
        return this.surrogate.getXcode();
    }

    public final String getSwift() {
        return this.surrogate.getSwift();
    }

    public final String getGradle() {
        return this.surrogate.getGradle();
    }

    public final String getAndroid_gradle_plugin() {
        return this.surrogate.getAndroid_gradle_plugin();
    }

    public final String getKotlin() {
        return this.surrogate.getKotlin();
    }

    public final String getAndroid_lint() {
        return this.surrogate.getAndroid_lint();
    }

    public final String getAndroidx_room_compiler() {
        return this.surrogate.getAndroidx_room_compiler();
    }

    public final String getAndroidx_lifecycle_compiler() {
        return this.surrogate.getAndroidx_lifecycle_compiler();
    }

    public final String getDagger_compiler() {
        return this.surrogate.getDagger_compiler();
    }

    public final String getMoshi_kotlin_codegen() {
        return this.surrogate.getMoshi_kotlin_codegen();
    }

    public final String getCrashlytics_gradle_plugin() {
        return this.surrogate.getCrashlytics_gradle_plugin();
    }

    public final String getFirebase_performance_gradle_plugin() {
        return this.surrogate.getFirebase_performance_gradle_plugin();
    }

    public final String getSqldelight_gradle_plugin() {
        return this.surrogate.getSqldelight_gradle_plugin();
    }

    public /* synthetic */ EnvironmentDto(MachineDto machineDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : machineDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnvironmentDto(MachineDto machineDto, String xcode, String swift, String gradle, String android_gradle_plugin, String kotlin2, String android_lint, String androidx_room_compiler, String androidx_lifecycle_compiler, String dagger_compiler, String moshi_kotlin_codegen, String crashlytics_gradle_plugin, String firebase_performance_gradle_plugin, String sqldelight_gradle_plugin) {
        this(new Surrogate(machineDto, xcode, swift, gradle, android_gradle_plugin, kotlin2, android_lint, androidx_room_compiler, androidx_lifecycle_compiler, dagger_compiler, moshi_kotlin_codegen, crashlytics_gradle_plugin, firebase_performance_gradle_plugin, sqldelight_gradle_plugin));
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
    }

    public final EnvironmentDto copy(MachineDto machine, String xcode, String swift, String gradle, String android_gradle_plugin, String kotlin2, String android_lint, String androidx_room_compiler, String androidx_lifecycle_compiler, String dagger_compiler, String moshi_kotlin_codegen, String crashlytics_gradle_plugin, String firebase_performance_gradle_plugin, String sqldelight_gradle_plugin) {
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
        return new EnvironmentDto(new Surrogate(machine, xcode, swift, gradle, android_gradle_plugin, kotlin2, android_lint, androidx_room_compiler, androidx_lifecycle_compiler, dagger_compiler, moshi_kotlin_codegen, crashlytics_gradle_plugin, firebase_performance_gradle_plugin, sqldelight_gradle_plugin));
    }

    @Override // com.robinhood.idl.Dto
    public Environment toProto() {
        MachineDto machine = this.surrogate.getMachine();
        return new Environment(machine != null ? machine.toProto() : null, this.surrogate.getXcode(), this.surrogate.getSwift(), this.surrogate.getGradle(), this.surrogate.getAndroid_gradle_plugin(), this.surrogate.getKotlin(), this.surrogate.getAndroid_lint(), this.surrogate.getAndroidx_room_compiler(), this.surrogate.getAndroidx_lifecycle_compiler(), this.surrogate.getDagger_compiler(), this.surrogate.getMoshi_kotlin_codegen(), this.surrogate.getCrashlytics_gradle_plugin(), this.surrogate.getFirebase_performance_gradle_plugin(), this.surrogate.getSqldelight_gradle_plugin(), null, 16384, null);
    }

    public String toString() {
        return "[EnvironmentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EnvironmentDto) && Intrinsics.areEqual(((EnvironmentDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EnvironmentDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 U2\u00020\u0001:\u0002TUB\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013B§\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\u0097\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0015HÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001J%\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0001¢\u0006\u0002\bSR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001fR\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001fR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001fR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001fR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001fR\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001fR\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001fR\u001c\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010\u001f¨\u0006V"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$Surrogate;", "", "machine", "Lcom/robinhood/rosetta/eventlogging/MachineDto;", "xcode", "", "swift", "gradle", "android_gradle_plugin", "kotlin", "android_lint", "androidx_room_compiler", "androidx_lifecycle_compiler", "dagger_compiler", "moshi_kotlin_codegen", "crashlytics_gradle_plugin", "firebase_performance_gradle_plugin", "sqldelight_gradle_plugin", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MachineDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/MachineDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMachine$annotations", "()V", "getMachine", "()Lcom/robinhood/rosetta/eventlogging/MachineDto;", "getXcode$annotations", "getXcode", "()Ljava/lang/String;", "getSwift$annotations", "getSwift", "getGradle$annotations", "getGradle", "getAndroid_gradle_plugin$annotations", "getAndroid_gradle_plugin", "getKotlin$annotations", "getKotlin", "getAndroid_lint$annotations", "getAndroid_lint", "getAndroidx_room_compiler$annotations", "getAndroidx_room_compiler", "getAndroidx_lifecycle_compiler$annotations", "getAndroidx_lifecycle_compiler", "getDagger_compiler$annotations", "getDagger_compiler", "getMoshi_kotlin_codegen$annotations", "getMoshi_kotlin_codegen", "getCrashlytics_gradle_plugin$annotations", "getCrashlytics_gradle_plugin", "getFirebase_performance_gradle_plugin$annotations", "getFirebase_performance_gradle_plugin", "getSqldelight_gradle_plugin$annotations", "getSqldelight_gradle_plugin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String android_gradle_plugin;
        private final String android_lint;
        private final String androidx_lifecycle_compiler;
        private final String androidx_room_compiler;
        private final String crashlytics_gradle_plugin;
        private final String dagger_compiler;
        private final String firebase_performance_gradle_plugin;
        private final String gradle;
        private final String kotlin;
        private final MachineDto machine;
        private final String moshi_kotlin_codegen;
        private final String sqldelight_gradle_plugin;
        private final String swift;
        private final String xcode;

        public Surrogate() {
            this((MachineDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        @SerialName("androidGradlePlugin")
        @JsonAnnotations2(names = {"android_gradle_plugin"})
        public static /* synthetic */ void getAndroid_gradle_plugin$annotations() {
        }

        @SerialName("androidLint")
        @JsonAnnotations2(names = {"android_lint"})
        public static /* synthetic */ void getAndroid_lint$annotations() {
        }

        @SerialName("androidxLifecycleCompiler")
        @JsonAnnotations2(names = {"androidx_lifecycle_compiler"})
        public static /* synthetic */ void getAndroidx_lifecycle_compiler$annotations() {
        }

        @SerialName("androidxRoomCompiler")
        @JsonAnnotations2(names = {"androidx_room_compiler"})
        public static /* synthetic */ void getAndroidx_room_compiler$annotations() {
        }

        @SerialName("crashlyticsGradlePlugin")
        @JsonAnnotations2(names = {"crashlytics_gradle_plugin"})
        public static /* synthetic */ void getCrashlytics_gradle_plugin$annotations() {
        }

        @SerialName("daggerCompiler")
        @JsonAnnotations2(names = {"dagger_compiler"})
        public static /* synthetic */ void getDagger_compiler$annotations() {
        }

        @SerialName("firebasePerformanceGradlePlugin")
        @JsonAnnotations2(names = {"firebase_performance_gradle_plugin"})
        public static /* synthetic */ void getFirebase_performance_gradle_plugin$annotations() {
        }

        @SerialName("gradle")
        @JsonAnnotations2(names = {"gradle"})
        public static /* synthetic */ void getGradle$annotations() {
        }

        @SerialName("kotlin")
        @JsonAnnotations2(names = {"kotlin"})
        public static /* synthetic */ void getKotlin$annotations() {
        }

        @SerialName("machine")
        @JsonAnnotations2(names = {"machine"})
        public static /* synthetic */ void getMachine$annotations() {
        }

        @SerialName("moshiKotlinCodegen")
        @JsonAnnotations2(names = {"moshi_kotlin_codegen"})
        public static /* synthetic */ void getMoshi_kotlin_codegen$annotations() {
        }

        @SerialName("sqldelightGradlePlugin")
        @JsonAnnotations2(names = {"sqldelight_gradle_plugin"})
        public static /* synthetic */ void getSqldelight_gradle_plugin$annotations() {
        }

        @SerialName("swift")
        @JsonAnnotations2(names = {"swift"})
        public static /* synthetic */ void getSwift$annotations() {
        }

        @SerialName("xcode")
        @JsonAnnotations2(names = {"xcode"})
        public static /* synthetic */ void getXcode$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MachineDto getMachine() {
            return this.machine;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDagger_compiler() {
            return this.dagger_compiler;
        }

        /* renamed from: component11, reason: from getter */
        public final String getMoshi_kotlin_codegen() {
            return this.moshi_kotlin_codegen;
        }

        /* renamed from: component12, reason: from getter */
        public final String getCrashlytics_gradle_plugin() {
            return this.crashlytics_gradle_plugin;
        }

        /* renamed from: component13, reason: from getter */
        public final String getFirebase_performance_gradle_plugin() {
            return this.firebase_performance_gradle_plugin;
        }

        /* renamed from: component14, reason: from getter */
        public final String getSqldelight_gradle_plugin() {
            return this.sqldelight_gradle_plugin;
        }

        /* renamed from: component2, reason: from getter */
        public final String getXcode() {
            return this.xcode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSwift() {
            return this.swift;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGradle() {
            return this.gradle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAndroid_gradle_plugin() {
            return this.android_gradle_plugin;
        }

        /* renamed from: component6, reason: from getter */
        public final String getKotlin() {
            return this.kotlin;
        }

        /* renamed from: component7, reason: from getter */
        public final String getAndroid_lint() {
            return this.android_lint;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAndroidx_room_compiler() {
            return this.androidx_room_compiler;
        }

        /* renamed from: component9, reason: from getter */
        public final String getAndroidx_lifecycle_compiler() {
            return this.androidx_lifecycle_compiler;
        }

        public final Surrogate copy(MachineDto machine, String xcode, String swift, String gradle, String android_gradle_plugin, String kotlin2, String android_lint, String androidx_room_compiler, String androidx_lifecycle_compiler, String dagger_compiler, String moshi_kotlin_codegen, String crashlytics_gradle_plugin, String firebase_performance_gradle_plugin, String sqldelight_gradle_plugin) {
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
            return new Surrogate(machine, xcode, swift, gradle, android_gradle_plugin, kotlin2, android_lint, androidx_room_compiler, androidx_lifecycle_compiler, dagger_compiler, moshi_kotlin_codegen, crashlytics_gradle_plugin, firebase_performance_gradle_plugin, sqldelight_gradle_plugin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.machine, surrogate.machine) && Intrinsics.areEqual(this.xcode, surrogate.xcode) && Intrinsics.areEqual(this.swift, surrogate.swift) && Intrinsics.areEqual(this.gradle, surrogate.gradle) && Intrinsics.areEqual(this.android_gradle_plugin, surrogate.android_gradle_plugin) && Intrinsics.areEqual(this.kotlin, surrogate.kotlin) && Intrinsics.areEqual(this.android_lint, surrogate.android_lint) && Intrinsics.areEqual(this.androidx_room_compiler, surrogate.androidx_room_compiler) && Intrinsics.areEqual(this.androidx_lifecycle_compiler, surrogate.androidx_lifecycle_compiler) && Intrinsics.areEqual(this.dagger_compiler, surrogate.dagger_compiler) && Intrinsics.areEqual(this.moshi_kotlin_codegen, surrogate.moshi_kotlin_codegen) && Intrinsics.areEqual(this.crashlytics_gradle_plugin, surrogate.crashlytics_gradle_plugin) && Intrinsics.areEqual(this.firebase_performance_gradle_plugin, surrogate.firebase_performance_gradle_plugin) && Intrinsics.areEqual(this.sqldelight_gradle_plugin, surrogate.sqldelight_gradle_plugin);
        }

        public int hashCode() {
            MachineDto machineDto = this.machine;
            return ((((((((((((((((((((((((((machineDto == null ? 0 : machineDto.hashCode()) * 31) + this.xcode.hashCode()) * 31) + this.swift.hashCode()) * 31) + this.gradle.hashCode()) * 31) + this.android_gradle_plugin.hashCode()) * 31) + this.kotlin.hashCode()) * 31) + this.android_lint.hashCode()) * 31) + this.androidx_room_compiler.hashCode()) * 31) + this.androidx_lifecycle_compiler.hashCode()) * 31) + this.dagger_compiler.hashCode()) * 31) + this.moshi_kotlin_codegen.hashCode()) * 31) + this.crashlytics_gradle_plugin.hashCode()) * 31) + this.firebase_performance_gradle_plugin.hashCode()) * 31) + this.sqldelight_gradle_plugin.hashCode();
        }

        public String toString() {
            return "Surrogate(machine=" + this.machine + ", xcode=" + this.xcode + ", swift=" + this.swift + ", gradle=" + this.gradle + ", android_gradle_plugin=" + this.android_gradle_plugin + ", kotlin=" + this.kotlin + ", android_lint=" + this.android_lint + ", androidx_room_compiler=" + this.androidx_room_compiler + ", androidx_lifecycle_compiler=" + this.androidx_lifecycle_compiler + ", dagger_compiler=" + this.dagger_compiler + ", moshi_kotlin_codegen=" + this.moshi_kotlin_codegen + ", crashlytics_gradle_plugin=" + this.crashlytics_gradle_plugin + ", firebase_performance_gradle_plugin=" + this.firebase_performance_gradle_plugin + ", sqldelight_gradle_plugin=" + this.sqldelight_gradle_plugin + ")";
        }

        /* compiled from: EnvironmentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EnvironmentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MachineDto machineDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
            this.machine = (i & 1) == 0 ? null : machineDto;
            if ((i & 2) == 0) {
                this.xcode = "";
            } else {
                this.xcode = str;
            }
            if ((i & 4) == 0) {
                this.swift = "";
            } else {
                this.swift = str2;
            }
            if ((i & 8) == 0) {
                this.gradle = "";
            } else {
                this.gradle = str3;
            }
            if ((i & 16) == 0) {
                this.android_gradle_plugin = "";
            } else {
                this.android_gradle_plugin = str4;
            }
            if ((i & 32) == 0) {
                this.kotlin = "";
            } else {
                this.kotlin = str5;
            }
            if ((i & 64) == 0) {
                this.android_lint = "";
            } else {
                this.android_lint = str6;
            }
            if ((i & 128) == 0) {
                this.androidx_room_compiler = "";
            } else {
                this.androidx_room_compiler = str7;
            }
            if ((i & 256) == 0) {
                this.androidx_lifecycle_compiler = "";
            } else {
                this.androidx_lifecycle_compiler = str8;
            }
            if ((i & 512) == 0) {
                this.dagger_compiler = "";
            } else {
                this.dagger_compiler = str9;
            }
            if ((i & 1024) == 0) {
                this.moshi_kotlin_codegen = "";
            } else {
                this.moshi_kotlin_codegen = str10;
            }
            if ((i & 2048) == 0) {
                this.crashlytics_gradle_plugin = "";
            } else {
                this.crashlytics_gradle_plugin = str11;
            }
            if ((i & 4096) == 0) {
                this.firebase_performance_gradle_plugin = "";
            } else {
                this.firebase_performance_gradle_plugin = str12;
            }
            if ((i & 8192) == 0) {
                this.sqldelight_gradle_plugin = "";
            } else {
                this.sqldelight_gradle_plugin = str13;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MachineDto machineDto = self.machine;
            if (machineDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MachineDto.Serializer.INSTANCE, machineDto);
            }
            if (!Intrinsics.areEqual(self.xcode, "")) {
                output.encodeStringElement(serialDesc, 1, self.xcode);
            }
            if (!Intrinsics.areEqual(self.swift, "")) {
                output.encodeStringElement(serialDesc, 2, self.swift);
            }
            if (!Intrinsics.areEqual(self.gradle, "")) {
                output.encodeStringElement(serialDesc, 3, self.gradle);
            }
            if (!Intrinsics.areEqual(self.android_gradle_plugin, "")) {
                output.encodeStringElement(serialDesc, 4, self.android_gradle_plugin);
            }
            if (!Intrinsics.areEqual(self.kotlin, "")) {
                output.encodeStringElement(serialDesc, 5, self.kotlin);
            }
            if (!Intrinsics.areEqual(self.android_lint, "")) {
                output.encodeStringElement(serialDesc, 6, self.android_lint);
            }
            if (!Intrinsics.areEqual(self.androidx_room_compiler, "")) {
                output.encodeStringElement(serialDesc, 7, self.androidx_room_compiler);
            }
            if (!Intrinsics.areEqual(self.androidx_lifecycle_compiler, "")) {
                output.encodeStringElement(serialDesc, 8, self.androidx_lifecycle_compiler);
            }
            if (!Intrinsics.areEqual(self.dagger_compiler, "")) {
                output.encodeStringElement(serialDesc, 9, self.dagger_compiler);
            }
            if (!Intrinsics.areEqual(self.moshi_kotlin_codegen, "")) {
                output.encodeStringElement(serialDesc, 10, self.moshi_kotlin_codegen);
            }
            if (!Intrinsics.areEqual(self.crashlytics_gradle_plugin, "")) {
                output.encodeStringElement(serialDesc, 11, self.crashlytics_gradle_plugin);
            }
            if (!Intrinsics.areEqual(self.firebase_performance_gradle_plugin, "")) {
                output.encodeStringElement(serialDesc, 12, self.firebase_performance_gradle_plugin);
            }
            if (Intrinsics.areEqual(self.sqldelight_gradle_plugin, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 13, self.sqldelight_gradle_plugin);
        }

        public Surrogate(MachineDto machineDto, String xcode, String swift, String gradle, String android_gradle_plugin, String kotlin2, String android_lint, String androidx_room_compiler, String androidx_lifecycle_compiler, String dagger_compiler, String moshi_kotlin_codegen, String crashlytics_gradle_plugin, String firebase_performance_gradle_plugin, String sqldelight_gradle_plugin) {
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
            this.machine = machineDto;
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

        public /* synthetic */ Surrogate(MachineDto machineDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : machineDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13);
        }

        public final MachineDto getMachine() {
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
    }

    /* compiled from: EnvironmentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "Lcom/robinhood/rosetta/eventlogging/Environment;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EnvironmentDto, Environment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EnvironmentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EnvironmentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EnvironmentDto> getBinaryBase64Serializer() {
            return (KSerializer) EnvironmentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Environment> getProtoAdapter() {
            return Environment.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EnvironmentDto getZeroValue() {
            return EnvironmentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EnvironmentDto fromProto(Environment proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Machine machine = proto.getMachine();
            return new EnvironmentDto(new Surrogate(machine != null ? MachineDto.INSTANCE.fromProto(machine) : null, proto.getXcode(), proto.getSwift(), proto.getGradle(), proto.getAndroid_gradle_plugin(), proto.getKotlin(), proto.getAndroid_lint(), proto.getAndroidx_room_compiler(), proto.getAndroidx_lifecycle_compiler(), proto.getDagger_compiler(), proto.getMoshi_kotlin_codegen(), proto.getCrashlytics_gradle_plugin(), proto.getFirebase_performance_gradle_plugin(), proto.getSqldelight_gradle_plugin()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EnvironmentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EnvironmentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EnvironmentDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EnvironmentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<EnvironmentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Environment", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EnvironmentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EnvironmentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EnvironmentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EnvironmentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EnvironmentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EnvironmentDto";
        }
    }
}
