package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.Application;
import com.robinhood.rosetta.eventlogging.ApplicationDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: ApplicationDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006123456B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Be\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0015Jb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020\fH\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\fH\u0016J\b\u00100\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Application;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ApplicationDto$Surrogate;)V", "version", "", "app_id", "build_number", "", "locale", "language", "release_channel", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "web_bundle_experiment_name", "web_bundle_experiment_variant", AnalyticsStrings.BUTTON_GROUP_APP_APPEARANCE_SETTINGS, "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;)V", "getVersion", "()Ljava/lang/String;", "getApp_id", "getBuild_number", "()I", "getLocale", "getLanguage", "getRelease_channel", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "getWeb_bundle_experiment_name", "getWeb_bundle_experiment_variant", "getApp_appearance_settings", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ReleaseChannelDto", "AppAppearanceSettingsDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ApplicationDto implements Dto3<Application>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ApplicationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ApplicationDto, Application>> binaryBase64Serializer$delegate;
    private static final ApplicationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ApplicationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ApplicationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getVersion() {
        return this.surrogate.getVersion();
    }

    public final String getApp_id() {
        return this.surrogate.getApp_id();
    }

    public final int getBuild_number() {
        return this.surrogate.getBuild_number();
    }

    public final String getLocale() {
        return this.surrogate.getLocale();
    }

    public final String getLanguage() {
        return this.surrogate.getLanguage();
    }

    public final ReleaseChannelDto getRelease_channel() {
        return this.surrogate.getRelease_channel();
    }

    public final String getWeb_bundle_experiment_name() {
        return this.surrogate.getWeb_bundle_experiment_name();
    }

    public final String getWeb_bundle_experiment_variant() {
        return this.surrogate.getWeb_bundle_experiment_variant();
    }

    public final AppAppearanceSettingsDto getApp_appearance_settings() {
        return this.surrogate.getApp_appearance_settings();
    }

    public /* synthetic */ ApplicationDto(String str, String str2, int i, String str3, String str4, ReleaseChannelDto releaseChannelDto, String str5, String str6, AppAppearanceSettingsDto appAppearanceSettingsDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? ReleaseChannelDto.INSTANCE.getZeroValue() : releaseChannelDto, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? null : appAppearanceSettingsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApplicationDto(String version, String app_id, int i, String locale, String language, ReleaseChannelDto release_channel, String web_bundle_experiment_name, String web_bundle_experiment_variant, AppAppearanceSettingsDto appAppearanceSettingsDto) {
        this(new Surrogate(version, app_id, i, locale, language, release_channel, web_bundle_experiment_name, web_bundle_experiment_variant, appAppearanceSettingsDto));
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(release_channel, "release_channel");
        Intrinsics.checkNotNullParameter(web_bundle_experiment_name, "web_bundle_experiment_name");
        Intrinsics.checkNotNullParameter(web_bundle_experiment_variant, "web_bundle_experiment_variant");
    }

    public static /* synthetic */ ApplicationDto copy$default(ApplicationDto applicationDto, String str, String str2, int i, String str3, String str4, ReleaseChannelDto releaseChannelDto, String str5, String str6, AppAppearanceSettingsDto appAppearanceSettingsDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = applicationDto.surrogate.getVersion();
        }
        if ((i2 & 2) != 0) {
            str2 = applicationDto.surrogate.getApp_id();
        }
        if ((i2 & 4) != 0) {
            i = applicationDto.surrogate.getBuild_number();
        }
        if ((i2 & 8) != 0) {
            str3 = applicationDto.surrogate.getLocale();
        }
        if ((i2 & 16) != 0) {
            str4 = applicationDto.surrogate.getLanguage();
        }
        if ((i2 & 32) != 0) {
            releaseChannelDto = applicationDto.surrogate.getRelease_channel();
        }
        if ((i2 & 64) != 0) {
            str5 = applicationDto.surrogate.getWeb_bundle_experiment_name();
        }
        if ((i2 & 128) != 0) {
            str6 = applicationDto.surrogate.getWeb_bundle_experiment_variant();
        }
        if ((i2 & 256) != 0) {
            appAppearanceSettingsDto = applicationDto.surrogate.getApp_appearance_settings();
        }
        String str7 = str6;
        AppAppearanceSettingsDto appAppearanceSettingsDto2 = appAppearanceSettingsDto;
        ReleaseChannelDto releaseChannelDto2 = releaseChannelDto;
        String str8 = str5;
        String str9 = str4;
        int i3 = i;
        return applicationDto.copy(str, str2, i3, str3, str9, releaseChannelDto2, str8, str7, appAppearanceSettingsDto2);
    }

    public final ApplicationDto copy(String version, String app_id, int build_number, String locale, String language, ReleaseChannelDto release_channel, String web_bundle_experiment_name, String web_bundle_experiment_variant, AppAppearanceSettingsDto app_appearance_settings) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(release_channel, "release_channel");
        Intrinsics.checkNotNullParameter(web_bundle_experiment_name, "web_bundle_experiment_name");
        Intrinsics.checkNotNullParameter(web_bundle_experiment_variant, "web_bundle_experiment_variant");
        return new ApplicationDto(new Surrogate(version, app_id, build_number, locale, language, release_channel, web_bundle_experiment_name, web_bundle_experiment_variant, app_appearance_settings));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Application toProto() {
        String version = this.surrogate.getVersion();
        String app_id = this.surrogate.getApp_id();
        int build_number = this.surrogate.getBuild_number();
        String locale = this.surrogate.getLocale();
        String language = this.surrogate.getLanguage();
        Application.ReleaseChannel releaseChannel = (Application.ReleaseChannel) this.surrogate.getRelease_channel().toProto();
        String web_bundle_experiment_name = this.surrogate.getWeb_bundle_experiment_name();
        String web_bundle_experiment_variant = this.surrogate.getWeb_bundle_experiment_variant();
        AppAppearanceSettingsDto app_appearance_settings = this.surrogate.getApp_appearance_settings();
        return new Application(version, app_id, build_number, locale, language, releaseChannel, web_bundle_experiment_name, web_bundle_experiment_variant, app_appearance_settings != null ? app_appearance_settings.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[ApplicationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ApplicationDto) && Intrinsics.areEqual(((ApplicationDto) other).surrogate, this.surrogate);
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
    /* compiled from: ApplicationDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002FGBr\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013Bs\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0018\u00101\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jt\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0006HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J%\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0001¢\u0006\u0002\bER\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010.¨\u0006H"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$Surrogate;", "", "version", "", "app_id", "build_number", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "locale", "language", "release_channel", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "web_bundle_experiment_name", "web_bundle_experiment_variant", AnalyticsStrings.BUTTON_GROUP_APP_APPEARANCE_SETTINGS, "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getVersion$annotations", "()V", "getVersion", "()Ljava/lang/String;", "getApp_id$annotations", "getApp_id", "getBuild_number$annotations", "getBuild_number", "()I", "getLocale$annotations", "getLocale", "getLanguage$annotations", "getLanguage", "getRelease_channel$annotations", "getRelease_channel", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "getWeb_bundle_experiment_name$annotations", "getWeb_bundle_experiment_name", "getWeb_bundle_experiment_variant$annotations", "getWeb_bundle_experiment_variant", "getApp_appearance_settings$annotations", "getApp_appearance_settings", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AppAppearanceSettingsDto app_appearance_settings;
        private final String app_id;
        private final int build_number;
        private final String language;
        private final String locale;
        private final ReleaseChannelDto release_channel;
        private final String version;
        private final String web_bundle_experiment_name;
        private final String web_bundle_experiment_variant;

        public Surrogate() {
            this((String) null, (String) null, 0, (String) null, (String) null, (ReleaseChannelDto) null, (String) null, (String) null, (AppAppearanceSettingsDto) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, int i, String str3, String str4, ReleaseChannelDto releaseChannelDto, String str5, String str6, AppAppearanceSettingsDto appAppearanceSettingsDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.version;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.app_id;
            }
            if ((i2 & 4) != 0) {
                i = surrogate.build_number;
            }
            if ((i2 & 8) != 0) {
                str3 = surrogate.locale;
            }
            if ((i2 & 16) != 0) {
                str4 = surrogate.language;
            }
            if ((i2 & 32) != 0) {
                releaseChannelDto = surrogate.release_channel;
            }
            if ((i2 & 64) != 0) {
                str5 = surrogate.web_bundle_experiment_name;
            }
            if ((i2 & 128) != 0) {
                str6 = surrogate.web_bundle_experiment_variant;
            }
            if ((i2 & 256) != 0) {
                appAppearanceSettingsDto = surrogate.app_appearance_settings;
            }
            String str7 = str6;
            AppAppearanceSettingsDto appAppearanceSettingsDto2 = appAppearanceSettingsDto;
            ReleaseChannelDto releaseChannelDto2 = releaseChannelDto;
            String str8 = str5;
            String str9 = str4;
            int i3 = i;
            return surrogate.copy(str, str2, i3, str3, str9, releaseChannelDto2, str8, str7, appAppearanceSettingsDto2);
        }

        @SerialName("appAppearanceSettings")
        @JsonAnnotations2(names = {AnalyticsStrings.BUTTON_GROUP_APP_APPEARANCE_SETTINGS})
        public static /* synthetic */ void getApp_appearance_settings$annotations() {
        }

        @SerialName("appId")
        @JsonAnnotations2(names = {"app_id"})
        public static /* synthetic */ void getApp_id$annotations() {
        }

        @SerialName("buildNumber")
        @JsonAnnotations2(names = {"build_number"})
        public static /* synthetic */ void getBuild_number$annotations() {
        }

        @SerialName("language")
        @JsonAnnotations2(names = {"language"})
        public static /* synthetic */ void getLanguage$annotations() {
        }

        @SerialName("locale")
        @JsonAnnotations2(names = {"locale"})
        public static /* synthetic */ void getLocale$annotations() {
        }

        @SerialName("releaseChannel")
        @JsonAnnotations2(names = {"release_channel"})
        public static /* synthetic */ void getRelease_channel$annotations() {
        }

        @SerialName("version")
        @JsonAnnotations2(names = {"version"})
        public static /* synthetic */ void getVersion$annotations() {
        }

        @SerialName("webBundleExperimentName")
        @JsonAnnotations2(names = {"web_bundle_experiment_name"})
        public static /* synthetic */ void getWeb_bundle_experiment_name$annotations() {
        }

        @SerialName("webBundleExperimentVariant")
        @JsonAnnotations2(names = {"web_bundle_experiment_variant"})
        public static /* synthetic */ void getWeb_bundle_experiment_variant$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApp_id() {
            return this.app_id;
        }

        /* renamed from: component3, reason: from getter */
        public final int getBuild_number() {
            return this.build_number;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* renamed from: component6, reason: from getter */
        public final ReleaseChannelDto getRelease_channel() {
            return this.release_channel;
        }

        /* renamed from: component7, reason: from getter */
        public final String getWeb_bundle_experiment_name() {
            return this.web_bundle_experiment_name;
        }

        /* renamed from: component8, reason: from getter */
        public final String getWeb_bundle_experiment_variant() {
            return this.web_bundle_experiment_variant;
        }

        /* renamed from: component9, reason: from getter */
        public final AppAppearanceSettingsDto getApp_appearance_settings() {
            return this.app_appearance_settings;
        }

        public final Surrogate copy(String version, String app_id, int build_number, String locale, String language, ReleaseChannelDto release_channel, String web_bundle_experiment_name, String web_bundle_experiment_variant, AppAppearanceSettingsDto app_appearance_settings) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(app_id, "app_id");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(language, "language");
            Intrinsics.checkNotNullParameter(release_channel, "release_channel");
            Intrinsics.checkNotNullParameter(web_bundle_experiment_name, "web_bundle_experiment_name");
            Intrinsics.checkNotNullParameter(web_bundle_experiment_variant, "web_bundle_experiment_variant");
            return new Surrogate(version, app_id, build_number, locale, language, release_channel, web_bundle_experiment_name, web_bundle_experiment_variant, app_appearance_settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.version, surrogate.version) && Intrinsics.areEqual(this.app_id, surrogate.app_id) && this.build_number == surrogate.build_number && Intrinsics.areEqual(this.locale, surrogate.locale) && Intrinsics.areEqual(this.language, surrogate.language) && this.release_channel == surrogate.release_channel && Intrinsics.areEqual(this.web_bundle_experiment_name, surrogate.web_bundle_experiment_name) && Intrinsics.areEqual(this.web_bundle_experiment_variant, surrogate.web_bundle_experiment_variant) && Intrinsics.areEqual(this.app_appearance_settings, surrogate.app_appearance_settings);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.version.hashCode() * 31) + this.app_id.hashCode()) * 31) + Integer.hashCode(this.build_number)) * 31) + this.locale.hashCode()) * 31) + this.language.hashCode()) * 31) + this.release_channel.hashCode()) * 31) + this.web_bundle_experiment_name.hashCode()) * 31) + this.web_bundle_experiment_variant.hashCode()) * 31;
            AppAppearanceSettingsDto appAppearanceSettingsDto = this.app_appearance_settings;
            return iHashCode + (appAppearanceSettingsDto == null ? 0 : appAppearanceSettingsDto.hashCode());
        }

        public String toString() {
            return "Surrogate(version=" + this.version + ", app_id=" + this.app_id + ", build_number=" + this.build_number + ", locale=" + this.locale + ", language=" + this.language + ", release_channel=" + this.release_channel + ", web_bundle_experiment_name=" + this.web_bundle_experiment_name + ", web_bundle_experiment_variant=" + this.web_bundle_experiment_variant + ", app_appearance_settings=" + this.app_appearance_settings + ")";
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ApplicationDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, int i2, String str3, String str4, ReleaseChannelDto releaseChannelDto, String str5, String str6, AppAppearanceSettingsDto appAppearanceSettingsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.version = "";
            } else {
                this.version = str;
            }
            if ((i & 2) == 0) {
                this.app_id = "";
            } else {
                this.app_id = str2;
            }
            if ((i & 4) == 0) {
                this.build_number = 0;
            } else {
                this.build_number = i2;
            }
            if ((i & 8) == 0) {
                this.locale = "";
            } else {
                this.locale = str3;
            }
            if ((i & 16) == 0) {
                this.language = "";
            } else {
                this.language = str4;
            }
            if ((i & 32) == 0) {
                this.release_channel = ReleaseChannelDto.INSTANCE.getZeroValue();
            } else {
                this.release_channel = releaseChannelDto;
            }
            if ((i & 64) == 0) {
                this.web_bundle_experiment_name = "";
            } else {
                this.web_bundle_experiment_name = str5;
            }
            if ((i & 128) == 0) {
                this.web_bundle_experiment_variant = "";
            } else {
                this.web_bundle_experiment_variant = str6;
            }
            if ((i & 256) == 0) {
                this.app_appearance_settings = null;
            } else {
                this.app_appearance_settings = appAppearanceSettingsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.version, "")) {
                output.encodeStringElement(serialDesc, 0, self.version);
            }
            if (!Intrinsics.areEqual(self.app_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.app_id);
            }
            int i = self.build_number;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.locale, "")) {
                output.encodeStringElement(serialDesc, 3, self.locale);
            }
            if (!Intrinsics.areEqual(self.language, "")) {
                output.encodeStringElement(serialDesc, 4, self.language);
            }
            if (self.release_channel != ReleaseChannelDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, ReleaseChannelDto.Serializer.INSTANCE, self.release_channel);
            }
            if (!Intrinsics.areEqual(self.web_bundle_experiment_name, "")) {
                output.encodeStringElement(serialDesc, 6, self.web_bundle_experiment_name);
            }
            if (!Intrinsics.areEqual(self.web_bundle_experiment_variant, "")) {
                output.encodeStringElement(serialDesc, 7, self.web_bundle_experiment_variant);
            }
            AppAppearanceSettingsDto appAppearanceSettingsDto = self.app_appearance_settings;
            if (appAppearanceSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, AppAppearanceSettingsDto.Serializer.INSTANCE, appAppearanceSettingsDto);
            }
        }

        public Surrogate(String version, String app_id, int i, String locale, String language, ReleaseChannelDto release_channel, String web_bundle_experiment_name, String web_bundle_experiment_variant, AppAppearanceSettingsDto appAppearanceSettingsDto) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(app_id, "app_id");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(language, "language");
            Intrinsics.checkNotNullParameter(release_channel, "release_channel");
            Intrinsics.checkNotNullParameter(web_bundle_experiment_name, "web_bundle_experiment_name");
            Intrinsics.checkNotNullParameter(web_bundle_experiment_variant, "web_bundle_experiment_variant");
            this.version = version;
            this.app_id = app_id;
            this.build_number = i;
            this.locale = locale;
            this.language = language;
            this.release_channel = release_channel;
            this.web_bundle_experiment_name = web_bundle_experiment_name;
            this.web_bundle_experiment_variant = web_bundle_experiment_variant;
            this.app_appearance_settings = appAppearanceSettingsDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, int i, String str3, String str4, ReleaseChannelDto releaseChannelDto, String str5, String str6, AppAppearanceSettingsDto appAppearanceSettingsDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? ReleaseChannelDto.INSTANCE.getZeroValue() : releaseChannelDto, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? null : appAppearanceSettingsDto);
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

        public final ReleaseChannelDto getRelease_channel() {
            return this.release_channel;
        }

        public final String getWeb_bundle_experiment_name() {
            return this.web_bundle_experiment_name;
        }

        public final String getWeb_bundle_experiment_variant() {
            return this.web_bundle_experiment_variant;
        }

        public final AppAppearanceSettingsDto getApp_appearance_settings() {
            return this.app_appearance_settings;
        }
    }

    /* compiled from: ApplicationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "Lcom/robinhood/rosetta/eventlogging/Application;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ApplicationDto, Application> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ApplicationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ApplicationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ApplicationDto> getBinaryBase64Serializer() {
            return (KSerializer) ApplicationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Application> getProtoAdapter() {
            return Application.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ApplicationDto getZeroValue() {
            return ApplicationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ApplicationDto fromProto(Application proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String version = proto.getVersion();
            String app_id = proto.getApp_id();
            int build_number = proto.getBuild_number();
            String locale = proto.getLocale();
            String language = proto.getLanguage();
            ReleaseChannelDto releaseChannelDtoFromProto = ReleaseChannelDto.INSTANCE.fromProto(proto.getRelease_channel());
            String web_bundle_experiment_name = proto.getWeb_bundle_experiment_name();
            String web_bundle_experiment_variant = proto.getWeb_bundle_experiment_variant();
            Application.AppAppearanceSettings app_appearance_settings = proto.getApp_appearance_settings();
            return new ApplicationDto(new Surrogate(version, app_id, build_number, locale, language, releaseChannelDtoFromProto, web_bundle_experiment_name, web_bundle_experiment_variant, app_appearance_settings != null ? AppAppearanceSettingsDto.INSTANCE.fromProto(app_appearance_settings) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ApplicationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApplicationDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ApplicationDto(null, null, 0, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApplicationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RELEASE_CHANNEL_UNSPECIFIED", "PRODUCTION", "BETA", "NIGHTLY", "CANARY", "BASELINE", "TEST", "LOCAL", "LATEST", "DEV", "PREVIEW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ReleaseChannelDto implements Dto2<Application.ReleaseChannel>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReleaseChannelDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ReleaseChannelDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ReleaseChannelDto, Application.ReleaseChannel>> binaryBase64Serializer$delegate;
        public static final ReleaseChannelDto RELEASE_CHANNEL_UNSPECIFIED = new RELEASE_CHANNEL_UNSPECIFIED("RELEASE_CHANNEL_UNSPECIFIED", 0);
        public static final ReleaseChannelDto PRODUCTION = new PRODUCTION("PRODUCTION", 1);
        public static final ReleaseChannelDto BETA = new BETA("BETA", 2);
        public static final ReleaseChannelDto NIGHTLY = new NIGHTLY("NIGHTLY", 3);
        public static final ReleaseChannelDto CANARY = new CANARY("CANARY", 4);
        public static final ReleaseChannelDto BASELINE = new BASELINE("BASELINE", 5);
        public static final ReleaseChannelDto TEST = new TEST("TEST", 6);
        public static final ReleaseChannelDto LOCAL = new LOCAL("LOCAL", 7);
        public static final ReleaseChannelDto LATEST = new LATEST("LATEST", 8);
        public static final ReleaseChannelDto DEV = new DEV("DEV", 9);
        public static final ReleaseChannelDto PREVIEW = new PREVIEW("PREVIEW", 10);

        private static final /* synthetic */ ReleaseChannelDto[] $values() {
            return new ReleaseChannelDto[]{RELEASE_CHANNEL_UNSPECIFIED, PRODUCTION, BETA, NIGHTLY, CANARY, BASELINE, TEST, LOCAL, LATEST, DEV, PREVIEW};
        }

        public /* synthetic */ ReleaseChannelDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ReleaseChannelDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.RELEASE_CHANNEL_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RELEASE_CHANNEL_UNSPECIFIED extends ReleaseChannelDto {
            RELEASE_CHANNEL_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.RELEASE_CHANNEL_UNSPECIFIED;
            }
        }

        private ReleaseChannelDto(String str, int i) {
        }

        static {
            ReleaseChannelDto[] releaseChannelDtoArr$values = $values();
            $VALUES = releaseChannelDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(releaseChannelDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ApplicationDto$ReleaseChannelDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ApplicationDto.ReleaseChannelDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.PRODUCTION", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRODUCTION extends ReleaseChannelDto {
            PRODUCTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.PRODUCTION;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.BETA", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BETA extends ReleaseChannelDto {
            BETA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.BETA;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.NIGHTLY", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NIGHTLY extends ReleaseChannelDto {
            NIGHTLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.NIGHTLY;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.CANARY", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANARY extends ReleaseChannelDto {
            CANARY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.CANARY;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.BASELINE", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BASELINE extends ReleaseChannelDto {
            BASELINE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.BASELINE;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.TEST", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TEST extends ReleaseChannelDto {
            TEST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.TEST;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.LOCAL", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOCAL extends ReleaseChannelDto {
            LOCAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.LOCAL;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.LATEST", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LATEST extends ReleaseChannelDto {
            LATEST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.LATEST;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.DEV", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEV extends ReleaseChannelDto {
            DEV(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.DEV;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.ReleaseChannelDto.PREVIEW", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PREVIEW extends ReleaseChannelDto {
            PREVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Application.ReleaseChannel toProto() {
                return Application.ReleaseChannel.PREVIEW;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ReleaseChannelDto, Application.ReleaseChannel> {

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Application.ReleaseChannel.values().length];
                    try {
                        iArr[Application.ReleaseChannel.RELEASE_CHANNEL_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.PRODUCTION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.BETA.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.NIGHTLY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.CANARY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.BASELINE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.TEST.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.LOCAL.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.LATEST.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.DEV.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[Application.ReleaseChannel.PREVIEW.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ReleaseChannelDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ReleaseChannelDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ReleaseChannelDto> getBinaryBase64Serializer() {
                return (KSerializer) ReleaseChannelDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Application.ReleaseChannel> getProtoAdapter() {
                return Application.ReleaseChannel.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ReleaseChannelDto getZeroValue() {
                return ReleaseChannelDto.RELEASE_CHANNEL_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ReleaseChannelDto fromProto(Application.ReleaseChannel proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ReleaseChannelDto.RELEASE_CHANNEL_UNSPECIFIED;
                    case 2:
                        return ReleaseChannelDto.PRODUCTION;
                    case 3:
                        return ReleaseChannelDto.BETA;
                    case 4:
                        return ReleaseChannelDto.NIGHTLY;
                    case 5:
                        return ReleaseChannelDto.CANARY;
                    case 6:
                        return ReleaseChannelDto.BASELINE;
                    case 7:
                        return ReleaseChannelDto.TEST;
                    case 8:
                        return ReleaseChannelDto.LOCAL;
                    case 9:
                        return ReleaseChannelDto.LATEST;
                    case 10:
                        return ReleaseChannelDto.DEV;
                    case 11:
                        return ReleaseChannelDto.PREVIEW;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$ReleaseChannelDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ReleaseChannelDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ReleaseChannelDto, Application.ReleaseChannel> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.Application.ReleaseChannel", ReleaseChannelDto.getEntries(), ReleaseChannelDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ReleaseChannelDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ReleaseChannelDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ReleaseChannelDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ReleaseChannelDto valueOf(String str) {
            return (ReleaseChannelDto) Enum.valueOf(ReleaseChannelDto.class, str);
        }

        public static ReleaseChannelDto[] values() {
            return (ReleaseChannelDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ApplicationDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u001f !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$Surrogate;)V", "theme_setting", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "is_accessible_colors", "", "(Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;Z)V", "getTheme_setting", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "()Z", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ThemeSettingDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class AppAppearanceSettingsDto implements Dto3<Application.AppAppearanceSettings>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<AppAppearanceSettingsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AppAppearanceSettingsDto, Application.AppAppearanceSettings>> binaryBase64Serializer$delegate;
        private static final AppAppearanceSettingsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ AppAppearanceSettingsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AppAppearanceSettingsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ThemeSettingDto getTheme_setting() {
            return this.surrogate.getTheme_setting();
        }

        public final boolean is_accessible_colors() {
            return this.surrogate.is_accessible_colors();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AppAppearanceSettingsDto(ThemeSettingDto theme_setting, boolean z) {
            this(new Surrogate(theme_setting, z));
            Intrinsics.checkNotNullParameter(theme_setting, "theme_setting");
        }

        public /* synthetic */ AppAppearanceSettingsDto(ThemeSettingDto themeSettingDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ThemeSettingDto.INSTANCE.getZeroValue() : themeSettingDto, (i & 2) != 0 ? false : z);
        }

        public static /* synthetic */ AppAppearanceSettingsDto copy$default(AppAppearanceSettingsDto appAppearanceSettingsDto, ThemeSettingDto themeSettingDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                themeSettingDto = appAppearanceSettingsDto.surrogate.getTheme_setting();
            }
            if ((i & 2) != 0) {
                z = appAppearanceSettingsDto.surrogate.is_accessible_colors();
            }
            return appAppearanceSettingsDto.copy(themeSettingDto, z);
        }

        public final AppAppearanceSettingsDto copy(ThemeSettingDto theme_setting, boolean is_accessible_colors) {
            Intrinsics.checkNotNullParameter(theme_setting, "theme_setting");
            return new AppAppearanceSettingsDto(new Surrogate(theme_setting, is_accessible_colors));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Application.AppAppearanceSettings toProto() {
            return new Application.AppAppearanceSettings((Application.AppAppearanceSettings.ThemeSetting) this.surrogate.getTheme_setting().toProto(), this.surrogate.is_accessible_colors(), null, 4, null);
        }

        public String toString() {
            return "[AppAppearanceSettingsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof AppAppearanceSettingsDto) && Intrinsics.areEqual(((AppAppearanceSettingsDto) other).surrogate, this.surrogate);
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
        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0004\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$Surrogate;", "", "theme_setting", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "is_accessible_colors", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTheme_setting$annotations", "()V", "getTheme_setting", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "is_accessible_colors$annotations", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean is_accessible_colors;
            private final ThemeSettingDto theme_setting;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((ThemeSettingDto) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ThemeSettingDto themeSettingDto, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    themeSettingDto = surrogate.theme_setting;
                }
                if ((i & 2) != 0) {
                    z = surrogate.is_accessible_colors;
                }
                return surrogate.copy(themeSettingDto, z);
            }

            @SerialName("themeSetting")
            @JsonAnnotations2(names = {"theme_setting"})
            public static /* synthetic */ void getTheme_setting$annotations() {
            }

            @SerialName("isAccessibleColors")
            @JsonAnnotations2(names = {"is_accessible_colors"})
            public static /* synthetic */ void is_accessible_colors$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final ThemeSettingDto getTheme_setting() {
                return this.theme_setting;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIs_accessible_colors() {
                return this.is_accessible_colors;
            }

            public final Surrogate copy(ThemeSettingDto theme_setting, boolean is_accessible_colors) {
                Intrinsics.checkNotNullParameter(theme_setting, "theme_setting");
                return new Surrogate(theme_setting, is_accessible_colors);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.theme_setting == surrogate.theme_setting && this.is_accessible_colors == surrogate.is_accessible_colors;
            }

            public int hashCode() {
                return (this.theme_setting.hashCode() * 31) + java.lang.Boolean.hashCode(this.is_accessible_colors);
            }

            public String toString() {
                return "Surrogate(theme_setting=" + this.theme_setting + ", is_accessible_colors=" + this.is_accessible_colors + ")";
            }

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ApplicationDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, ThemeSettingDto themeSettingDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                this.theme_setting = (i & 1) == 0 ? ThemeSettingDto.INSTANCE.getZeroValue() : themeSettingDto;
                if ((i & 2) == 0) {
                    this.is_accessible_colors = false;
                } else {
                    this.is_accessible_colors = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.theme_setting != ThemeSettingDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, ThemeSettingDto.Serializer.INSTANCE, self.theme_setting);
                }
                boolean z = self.is_accessible_colors;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 1, z);
                }
            }

            public Surrogate(ThemeSettingDto theme_setting, boolean z) {
                Intrinsics.checkNotNullParameter(theme_setting, "theme_setting");
                this.theme_setting = theme_setting;
                this.is_accessible_colors = z;
            }

            public final ThemeSettingDto getTheme_setting() {
                return this.theme_setting;
            }

            public /* synthetic */ Surrogate(ThemeSettingDto themeSettingDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ThemeSettingDto.INSTANCE.getZeroValue() : themeSettingDto, (i & 2) != 0 ? false : z);
            }

            public final boolean is_accessible_colors() {
                return this.is_accessible_colors;
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<AppAppearanceSettingsDto, Application.AppAppearanceSettings> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AppAppearanceSettingsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AppAppearanceSettingsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AppAppearanceSettingsDto> getBinaryBase64Serializer() {
                return (KSerializer) AppAppearanceSettingsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Application.AppAppearanceSettings> getProtoAdapter() {
                return Application.AppAppearanceSettings.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AppAppearanceSettingsDto getZeroValue() {
                return AppAppearanceSettingsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AppAppearanceSettingsDto fromProto(Application.AppAppearanceSettings proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new AppAppearanceSettingsDto(new Surrogate(ThemeSettingDto.INSTANCE.fromProto(proto.getTheme_setting()), proto.getIs_accessible_colors()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ApplicationDto$AppAppearanceSettingsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ApplicationDto.AppAppearanceSettingsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new AppAppearanceSettingsDto(0 == true ? 1 : 0, false, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_SETTING_UNSPECIFIED", "MARKET_HOURS", "LIGHT", "DARK", "SYSTEM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ThemeSettingDto implements Dto2<Application.AppAppearanceSettings.ThemeSetting>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ThemeSettingDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<ThemeSettingDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ThemeSettingDto, Application.AppAppearanceSettings.ThemeSetting>> binaryBase64Serializer$delegate;
            public static final ThemeSettingDto THEME_SETTING_UNSPECIFIED = new THEME_SETTING_UNSPECIFIED("THEME_SETTING_UNSPECIFIED", 0);
            public static final ThemeSettingDto MARKET_HOURS = new MARKET_HOURS("MARKET_HOURS", 1);
            public static final ThemeSettingDto LIGHT = new LIGHT("LIGHT", 2);
            public static final ThemeSettingDto DARK = new DARK("DARK", 3);
            public static final ThemeSettingDto SYSTEM = new SYSTEM("SYSTEM", 4);

            private static final /* synthetic */ ThemeSettingDto[] $values() {
                return new ThemeSettingDto[]{THEME_SETTING_UNSPECIFIED, MARKET_HOURS, LIGHT, DARK, SYSTEM};
            }

            public /* synthetic */ ThemeSettingDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<ThemeSettingDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ThemeSettingDto(String str, int i) {
            }

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.AppAppearanceSettingsDto.ThemeSettingDto.THEME_SETTING_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class THEME_SETTING_UNSPECIFIED extends ThemeSettingDto {
                THEME_SETTING_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public Application.AppAppearanceSettings.ThemeSetting toProto() {
                    return Application.AppAppearanceSettings.ThemeSetting.THEME_SETTING_UNSPECIFIED;
                }
            }

            static {
                ThemeSettingDto[] themeSettingDtoArr$values = $values();
                $VALUES = themeSettingDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(themeSettingDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ApplicationDto.AppAppearanceSettingsDto.ThemeSettingDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.AppAppearanceSettingsDto.ThemeSettingDto.MARKET_HOURS", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class MARKET_HOURS extends ThemeSettingDto {
                MARKET_HOURS(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public Application.AppAppearanceSettings.ThemeSetting toProto() {
                    return Application.AppAppearanceSettings.ThemeSetting.MARKET_HOURS;
                }
            }

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.AppAppearanceSettingsDto.ThemeSettingDto.LIGHT", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class LIGHT extends ThemeSettingDto {
                LIGHT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public Application.AppAppearanceSettings.ThemeSetting toProto() {
                    return Application.AppAppearanceSettings.ThemeSetting.LIGHT;
                }
            }

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.AppAppearanceSettingsDto.ThemeSettingDto.DARK", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class DARK extends ThemeSettingDto {
                DARK(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public Application.AppAppearanceSettings.ThemeSetting toProto() {
                    return Application.AppAppearanceSettings.ThemeSetting.DARK;
                }
            }

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ApplicationDto.AppAppearanceSettingsDto.ThemeSettingDto.SYSTEM", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class SYSTEM extends ThemeSettingDto {
                SYSTEM(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public Application.AppAppearanceSettings.ThemeSetting toProto() {
                    return Application.AppAppearanceSettings.ThemeSetting.SYSTEM;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "Lcom/robinhood/rosetta/eventlogging/Application$AppAppearanceSettings$ThemeSetting;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<ThemeSettingDto, Application.AppAppearanceSettings.ThemeSetting> {

                /* compiled from: ApplicationDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Application.AppAppearanceSettings.ThemeSetting.values().length];
                        try {
                            iArr[Application.AppAppearanceSettings.ThemeSetting.THEME_SETTING_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Application.AppAppearanceSettings.ThemeSetting.MARKET_HOURS.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Application.AppAppearanceSettings.ThemeSetting.LIGHT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Application.AppAppearanceSettings.ThemeSetting.DARK.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Application.AppAppearanceSettings.ThemeSetting.SYSTEM.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ThemeSettingDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ThemeSettingDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ThemeSettingDto> getBinaryBase64Serializer() {
                    return (KSerializer) ThemeSettingDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Application.AppAppearanceSettings.ThemeSetting> getProtoAdapter() {
                    return Application.AppAppearanceSettings.ThemeSetting.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ThemeSettingDto getZeroValue() {
                    return ThemeSettingDto.THEME_SETTING_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ThemeSettingDto fromProto(Application.AppAppearanceSettings.ThemeSetting proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return ThemeSettingDto.THEME_SETTING_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return ThemeSettingDto.MARKET_HOURS;
                    }
                    if (i == 3) {
                        return ThemeSettingDto.LIGHT;
                    }
                    if (i == 4) {
                        return ThemeSettingDto.DARK;
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ThemeSettingDto.SYSTEM;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ApplicationDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$ThemeSettingDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<ThemeSettingDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<ThemeSettingDto, Application.AppAppearanceSettings.ThemeSetting> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.Application.AppAppearanceSettings.ThemeSetting", ThemeSettingDto.getEntries(), ThemeSettingDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public ThemeSettingDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (ThemeSettingDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ThemeSettingDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static ThemeSettingDto valueOf(String str) {
                return (ThemeSettingDto) Enum.valueOf(ThemeSettingDto.class, str);
            }

            public static ThemeSettingDto[] values() {
                return (ThemeSettingDto[]) $VALUES.clone();
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AppAppearanceSettingsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Application.AppAppearanceSettings", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AppAppearanceSettingsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public AppAppearanceSettingsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new AppAppearanceSettingsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: ApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$AppAppearanceSettingsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.ApplicationDto$AppAppearanceSettingsDto";
            }
        }
    }

    /* compiled from: ApplicationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ApplicationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Application", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ApplicationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ApplicationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ApplicationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ApplicationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ApplicationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ApplicationDto";
        }
    }
}
