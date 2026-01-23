package bonfire.proto.idl.accounts.p028v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: IsaTabBannerConfigDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001c¨\u0006;"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfig;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Surrogate;)V", "", "title", "cta_text", "cta_deeplink", "asset_path_light_mobile", "asset_path_dark_mobile", "asset_path_light_web", "asset_path_dark_web", "", "asset_width_mobile", "asset_height_mobile", "asset_render_width_mobile", "asset_width_web", "asset_height_web", "asset_render_width_web", "logging_identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJJLjava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfig;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Surrogate;", "getTitle", "getCta_text", "getCta_deeplink", "getAsset_path_light_mobile", "getAsset_path_dark_mobile", "getAsset_width_mobile", "()J", "getAsset_height_mobile", "getAsset_render_width_mobile", "getLogging_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class IsaTabBannerConfigDto implements Dto3<IsaTabBannerConfig>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IsaTabBannerConfigDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IsaTabBannerConfigDto, IsaTabBannerConfig>> binaryBase64Serializer$delegate;
    private static final IsaTabBannerConfigDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IsaTabBannerConfigDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IsaTabBannerConfigDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getCta_text() {
        return this.surrogate.getCta_text();
    }

    public final String getCta_deeplink() {
        return this.surrogate.getCta_deeplink();
    }

    public final String getAsset_path_light_mobile() {
        return this.surrogate.getAsset_path_light_mobile();
    }

    public final String getAsset_path_dark_mobile() {
        return this.surrogate.getAsset_path_dark_mobile();
    }

    public final long getAsset_width_mobile() {
        return this.surrogate.getAsset_width_mobile();
    }

    public final long getAsset_height_mobile() {
        return this.surrogate.getAsset_height_mobile();
    }

    public final long getAsset_render_width_mobile() {
        return this.surrogate.getAsset_render_width_mobile();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public /* synthetic */ IsaTabBannerConfigDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, long j3, long j4, long j5, long j6, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? 0L : j2, (i & 512) != 0 ? 0L : j3, (i & 1024) != 0 ? 0L : j4, (i & 2048) != 0 ? 0L : j5, (i & 4096) == 0 ? j6 : 0L, (i & 8192) != 0 ? "" : str8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IsaTabBannerConfigDto(String title, String cta_text, String cta_deeplink, String asset_path_light_mobile, String asset_path_dark_mobile, String asset_path_light_web, String asset_path_dark_web, long j, long j2, long j3, long j4, long j5, long j6, String logging_identifier) {
        this(new Surrogate(title, cta_text, cta_deeplink, asset_path_light_mobile, asset_path_dark_mobile, asset_path_light_web, asset_path_dark_web, j, j2, j3, j4, j5, j6, logging_identifier));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(asset_path_light_mobile, "asset_path_light_mobile");
        Intrinsics.checkNotNullParameter(asset_path_dark_mobile, "asset_path_dark_mobile");
        Intrinsics.checkNotNullParameter(asset_path_light_web, "asset_path_light_web");
        Intrinsics.checkNotNullParameter(asset_path_dark_web, "asset_path_dark_web");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
    }

    @Override // com.robinhood.idl.Dto
    public IsaTabBannerConfig toProto() {
        return new IsaTabBannerConfig(this.surrogate.getTitle(), this.surrogate.getCta_text(), this.surrogate.getCta_deeplink(), this.surrogate.getAsset_path_light_mobile(), this.surrogate.getAsset_path_dark_mobile(), this.surrogate.getAsset_path_light_web(), this.surrogate.getAsset_path_dark_web(), this.surrogate.getAsset_width_mobile(), this.surrogate.getAsset_height_mobile(), this.surrogate.getAsset_render_width_mobile(), this.surrogate.getAsset_width_web(), this.surrogate.getAsset_height_web(), this.surrogate.getAsset_render_width_web(), this.surrogate.getLogging_identifier(), null, 16384, null);
    }

    public String toString() {
        return "[IsaTabBannerConfigDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IsaTabBannerConfigDto) && Intrinsics.areEqual(((IsaTabBannerConfigDto) other).surrogate, this.surrogate);
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
    /* compiled from: IsaTabBannerConfigDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 M2\u00020\u0001:\u0002NMBí\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010&R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010&R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010&R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010&R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010&R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b<\u00100\u001a\u0004\b;\u0010&R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R/\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\bB\u00100\u001a\u0004\bA\u0010?R/\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010=\u0012\u0004\bD\u00100\u001a\u0004\bC\u0010?R/\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\bF\u00100\u001a\u0004\bE\u0010?R/\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010=\u0012\u0004\bH\u00100\u001a\u0004\bG\u0010?R/\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010=\u0012\u0004\bJ\u00100\u001a\u0004\bI\u0010?R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010-\u0012\u0004\bL\u00100\u001a\u0004\bK\u0010&¨\u0006O"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Surrogate;", "", "", "title", "cta_text", "cta_deeplink", "asset_path_light_mobile", "asset_path_dark_mobile", "asset_path_light_web", "asset_path_dark_web", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "asset_width_mobile", "asset_height_mobile", "asset_render_width_mobile", "asset_width_web", "asset_height_web", "asset_render_width_web", "logging_identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJJLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_rhuk_isa_v1_externalRelease", "(Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getCta_text", "getCta_text$annotations", "getCta_deeplink", "getCta_deeplink$annotations", "getAsset_path_light_mobile", "getAsset_path_light_mobile$annotations", "getAsset_path_dark_mobile", "getAsset_path_dark_mobile$annotations", "getAsset_path_light_web", "getAsset_path_light_web$annotations", "getAsset_path_dark_web", "getAsset_path_dark_web$annotations", "J", "getAsset_width_mobile", "()J", "getAsset_width_mobile$annotations", "getAsset_height_mobile", "getAsset_height_mobile$annotations", "getAsset_render_width_mobile", "getAsset_render_width_mobile$annotations", "getAsset_width_web", "getAsset_width_web$annotations", "getAsset_height_web", "getAsset_height_web$annotations", "getAsset_render_width_web", "getAsset_render_width_web$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Companion", "$serializer", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long asset_height_mobile;
        private final long asset_height_web;
        private final String asset_path_dark_mobile;
        private final String asset_path_dark_web;
        private final String asset_path_light_mobile;
        private final String asset_path_light_web;
        private final long asset_render_width_mobile;
        private final long asset_render_width_web;
        private final long asset_width_mobile;
        private final long asset_width_web;
        private final String cta_deeplink;
        private final String cta_text;
        private final String logging_identifier;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.cta_text, surrogate.cta_text) && Intrinsics.areEqual(this.cta_deeplink, surrogate.cta_deeplink) && Intrinsics.areEqual(this.asset_path_light_mobile, surrogate.asset_path_light_mobile) && Intrinsics.areEqual(this.asset_path_dark_mobile, surrogate.asset_path_dark_mobile) && Intrinsics.areEqual(this.asset_path_light_web, surrogate.asset_path_light_web) && Intrinsics.areEqual(this.asset_path_dark_web, surrogate.asset_path_dark_web) && this.asset_width_mobile == surrogate.asset_width_mobile && this.asset_height_mobile == surrogate.asset_height_mobile && this.asset_render_width_mobile == surrogate.asset_render_width_mobile && this.asset_width_web == surrogate.asset_width_web && this.asset_height_web == surrogate.asset_height_web && this.asset_render_width_web == surrogate.asset_render_width_web && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.title.hashCode() * 31) + this.cta_text.hashCode()) * 31) + this.cta_deeplink.hashCode()) * 31) + this.asset_path_light_mobile.hashCode()) * 31) + this.asset_path_dark_mobile.hashCode()) * 31) + this.asset_path_light_web.hashCode()) * 31) + this.asset_path_dark_web.hashCode()) * 31) + Long.hashCode(this.asset_width_mobile)) * 31) + Long.hashCode(this.asset_height_mobile)) * 31) + Long.hashCode(this.asset_render_width_mobile)) * 31) + Long.hashCode(this.asset_width_web)) * 31) + Long.hashCode(this.asset_height_web)) * 31) + Long.hashCode(this.asset_render_width_web)) * 31) + this.logging_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", cta_text=" + this.cta_text + ", cta_deeplink=" + this.cta_deeplink + ", asset_path_light_mobile=" + this.asset_path_light_mobile + ", asset_path_dark_mobile=" + this.asset_path_dark_mobile + ", asset_path_light_web=" + this.asset_path_light_web + ", asset_path_dark_web=" + this.asset_path_dark_web + ", asset_width_mobile=" + this.asset_width_mobile + ", asset_height_mobile=" + this.asset_height_mobile + ", asset_render_width_mobile=" + this.asset_render_width_mobile + ", asset_width_web=" + this.asset_width_web + ", asset_height_web=" + this.asset_height_web + ", asset_render_width_web=" + this.asset_render_width_web + ", logging_identifier=" + this.logging_identifier + ")";
        }

        /* compiled from: IsaTabBannerConfigDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Surrogate;", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IsaTabBannerConfigDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, long j3, long j4, long j5, long j6, String str8, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.cta_text = "";
            } else {
                this.cta_text = str2;
            }
            if ((i & 4) == 0) {
                this.cta_deeplink = "";
            } else {
                this.cta_deeplink = str3;
            }
            if ((i & 8) == 0) {
                this.asset_path_light_mobile = "";
            } else {
                this.asset_path_light_mobile = str4;
            }
            if ((i & 16) == 0) {
                this.asset_path_dark_mobile = "";
            } else {
                this.asset_path_dark_mobile = str5;
            }
            if ((i & 32) == 0) {
                this.asset_path_light_web = "";
            } else {
                this.asset_path_light_web = str6;
            }
            if ((i & 64) == 0) {
                this.asset_path_dark_web = "";
            } else {
                this.asset_path_dark_web = str7;
            }
            if ((i & 128) == 0) {
                this.asset_width_mobile = 0L;
            } else {
                this.asset_width_mobile = j;
            }
            if ((i & 256) == 0) {
                this.asset_height_mobile = 0L;
            } else {
                this.asset_height_mobile = j2;
            }
            if ((i & 512) == 0) {
                this.asset_render_width_mobile = 0L;
            } else {
                this.asset_render_width_mobile = j3;
            }
            if ((i & 1024) == 0) {
                this.asset_width_web = 0L;
            } else {
                this.asset_width_web = j4;
            }
            if ((i & 2048) == 0) {
                this.asset_height_web = 0L;
            } else {
                this.asset_height_web = j5;
            }
            if ((i & 4096) == 0) {
                this.asset_render_width_web = 0L;
            } else {
                this.asset_render_width_web = j6;
            }
            if ((i & 8192) == 0) {
                this.logging_identifier = "";
            } else {
                this.logging_identifier = str8;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_rhuk_isa_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.cta_text, "")) {
                output.encodeStringElement(serialDesc, 1, self.cta_text);
            }
            if (!Intrinsics.areEqual(self.cta_deeplink, "")) {
                output.encodeStringElement(serialDesc, 2, self.cta_deeplink);
            }
            if (!Intrinsics.areEqual(self.asset_path_light_mobile, "")) {
                output.encodeStringElement(serialDesc, 3, self.asset_path_light_mobile);
            }
            if (!Intrinsics.areEqual(self.asset_path_dark_mobile, "")) {
                output.encodeStringElement(serialDesc, 4, self.asset_path_dark_mobile);
            }
            if (!Intrinsics.areEqual(self.asset_path_light_web, "")) {
                output.encodeStringElement(serialDesc, 5, self.asset_path_light_web);
            }
            if (!Intrinsics.areEqual(self.asset_path_dark_web, "")) {
                output.encodeStringElement(serialDesc, 6, self.asset_path_dark_web);
            }
            long j = self.asset_width_mobile;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            long j2 = self.asset_height_mobile;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 8, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            long j3 = self.asset_render_width_mobile;
            if (j3 != 0) {
                output.encodeSerializableElement(serialDesc, 9, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j3));
            }
            long j4 = self.asset_width_web;
            if (j4 != 0) {
                output.encodeSerializableElement(serialDesc, 10, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j4));
            }
            long j5 = self.asset_height_web;
            if (j5 != 0) {
                output.encodeSerializableElement(serialDesc, 11, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j5));
            }
            long j6 = self.asset_render_width_web;
            if (j6 != 0) {
                output.encodeSerializableElement(serialDesc, 12, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j6));
            }
            if (Intrinsics.areEqual(self.logging_identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 13, self.logging_identifier);
        }

        public Surrogate(String title, String cta_text, String cta_deeplink, String asset_path_light_mobile, String asset_path_dark_mobile, String asset_path_light_web, String asset_path_dark_web, long j, long j2, long j3, long j4, long j5, long j6, String logging_identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cta_text, "cta_text");
            Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
            Intrinsics.checkNotNullParameter(asset_path_light_mobile, "asset_path_light_mobile");
            Intrinsics.checkNotNullParameter(asset_path_dark_mobile, "asset_path_dark_mobile");
            Intrinsics.checkNotNullParameter(asset_path_light_web, "asset_path_light_web");
            Intrinsics.checkNotNullParameter(asset_path_dark_web, "asset_path_dark_web");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            this.title = title;
            this.cta_text = cta_text;
            this.cta_deeplink = cta_deeplink;
            this.asset_path_light_mobile = asset_path_light_mobile;
            this.asset_path_dark_mobile = asset_path_dark_mobile;
            this.asset_path_light_web = asset_path_light_web;
            this.asset_path_dark_web = asset_path_dark_web;
            this.asset_width_mobile = j;
            this.asset_height_mobile = j2;
            this.asset_render_width_mobile = j3;
            this.asset_width_web = j4;
            this.asset_height_web = j5;
            this.asset_render_width_web = j6;
            this.logging_identifier = logging_identifier;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, long j3, long j4, long j5, long j6, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? 0L : j2, (i & 512) != 0 ? 0L : j3, (i & 1024) != 0 ? 0L : j4, (i & 2048) != 0 ? 0L : j5, (i & 4096) == 0 ? j6 : 0L, (i & 8192) != 0 ? "" : str8);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getCta_text() {
            return this.cta_text;
        }

        public final String getCta_deeplink() {
            return this.cta_deeplink;
        }

        public final String getAsset_path_light_mobile() {
            return this.asset_path_light_mobile;
        }

        public final String getAsset_path_dark_mobile() {
            return this.asset_path_dark_mobile;
        }

        public final String getAsset_path_light_web() {
            return this.asset_path_light_web;
        }

        public final String getAsset_path_dark_web() {
            return this.asset_path_dark_web;
        }

        public final long getAsset_width_mobile() {
            return this.asset_width_mobile;
        }

        public final long getAsset_height_mobile() {
            return this.asset_height_mobile;
        }

        public final long getAsset_render_width_mobile() {
            return this.asset_render_width_mobile;
        }

        public final long getAsset_width_web() {
            return this.asset_width_web;
        }

        public final long getAsset_height_web() {
            return this.asset_height_web;
        }

        public final long getAsset_render_width_web() {
            return this.asset_render_width_web;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }
    }

    /* compiled from: IsaTabBannerConfigDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfig;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<IsaTabBannerConfigDto, IsaTabBannerConfig> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IsaTabBannerConfigDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaTabBannerConfigDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaTabBannerConfigDto> getBinaryBase64Serializer() {
            return (KSerializer) IsaTabBannerConfigDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IsaTabBannerConfig> getProtoAdapter() {
            return IsaTabBannerConfig.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaTabBannerConfigDto getZeroValue() {
            return IsaTabBannerConfigDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaTabBannerConfigDto fromProto(IsaTabBannerConfig proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new IsaTabBannerConfigDto(new Surrogate(proto.getTitle(), proto.getCta_text(), proto.getCta_deeplink(), proto.getAsset_path_light_mobile(), proto.getAsset_path_dark_mobile(), proto.getAsset_path_light_web(), proto.getAsset_path_dark_web(), proto.getAsset_width_mobile(), proto.getAsset_height_mobile(), proto.getAsset_render_width_mobile(), proto.getAsset_width_web(), proto.getAsset_height_web(), proto.getAsset_render_width_web(), proto.getLogging_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.accounts.v1.IsaTabBannerConfigDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsaTabBannerConfigDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IsaTabBannerConfigDto(null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IsaTabBannerConfigDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IsaTabBannerConfigDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.accounts.v1.IsaTabBannerConfig", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IsaTabBannerConfigDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IsaTabBannerConfigDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IsaTabBannerConfigDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IsaTabBannerConfigDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.accounts.v1.IsaTabBannerConfigDto";
        }
    }
}
