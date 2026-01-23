package hippo.model.p469v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import hippo.model.p469v1.BackgroundAuraDto;
import hippo.model.p469v1.CryptoOrderFormSettingsDto;
import hippo.model.p469v1.EquityOrderFormSettingsDto;
import hippo.model.p469v1.GeneralSettingsDto;
import hippo.model.p469v1.OptionOrderFormSettingsDto;
import hippo.model.p469v1.OrderFormSettingsDto;
import hippo.model.p469v1.ReleaseSettingsDto;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: AppSettingsDto.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0083\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0006\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020&H\u0016¢\u0006\u0004\b/\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u001c\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b3\u0010!¨\u00068"}, m3636d2 = {"Lhippo/model/v1/AppSettingsDto;", "Lcom/robinhood/idl/MessageDto;", "Lhippo/model/v1/AppSettings;", "Landroid/os/Parcelable;", "Lhippo/model/v1/AppSettingsDto$Surrogate;", "surrogate", "<init>", "(Lhippo/model/v1/AppSettingsDto$Surrogate;)V", "Lhippo/model/v1/EquityOrderFormSettingsDto;", "last_equity_order_form_fields", "Lhippo/model/v1/OptionOrderFormSettingsDto;", "last_option_order_form_fields", "Lhippo/model/v1/BackgroundAuraDto;", "background_aura", "Lhippo/model/v1/ReleaseSettingsDto;", "release_settings", "Lhippo/model/v1/CryptoOrderFormSettingsDto;", "last_crypto_order_form_fields", "", "is_auto_send_disclosure_signed", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_accessed_at", "Lhippo/model/v1/OrderFormSettingsDto;", "order_form_settings", "Lhippo/model/v1/GeneralSettingsDto;", "general_settings", "", "last_selected_account", "(Lhippo/model/v1/EquityOrderFormSettingsDto;Lhippo/model/v1/OptionOrderFormSettingsDto;Lhippo/model/v1/BackgroundAuraDto;Lhippo/model/v1/ReleaseSettingsDto;Lhippo/model/v1/CryptoOrderFormSettingsDto;ZLj$/time/Instant;Lhippo/model/v1/OrderFormSettingsDto;Lhippo/model/v1/GeneralSettingsDto;Ljava/lang/String;)V", "toProto", "()Lhippo/model/v1/AppSettings;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhippo/model/v1/AppSettingsDto$Surrogate;", "getBackground_aura", "()Lhippo/model/v1/BackgroundAuraDto;", "getLast_selected_account", "Companion", "Surrogate", "Serializer", "MultibindingModule", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class AppSettingsDto implements Dto3<AppSettings>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AppSettingsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AppSettingsDto, AppSettings>> binaryBase64Serializer$delegate;
    private static final AppSettingsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AppSettingsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AppSettingsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BackgroundAuraDto getBackground_aura() {
        return this.surrogate.getBackground_aura();
    }

    public final String getLast_selected_account() {
        return this.surrogate.getLast_selected_account();
    }

    public /* synthetic */ AppSettingsDto(EquityOrderFormSettingsDto equityOrderFormSettingsDto, OptionOrderFormSettingsDto optionOrderFormSettingsDto, BackgroundAuraDto backgroundAuraDto, ReleaseSettingsDto releaseSettingsDto, CryptoOrderFormSettingsDto cryptoOrderFormSettingsDto, boolean z, Instant instant, OrderFormSettingsDto orderFormSettingsDto, GeneralSettingsDto generalSettingsDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : equityOrderFormSettingsDto, (i & 2) != 0 ? null : optionOrderFormSettingsDto, (i & 4) != 0 ? null : backgroundAuraDto, (i & 8) != 0 ? null : releaseSettingsDto, (i & 16) != 0 ? null : cryptoOrderFormSettingsDto, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? null : orderFormSettingsDto, (i & 256) != 0 ? null : generalSettingsDto, (i & 512) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppSettingsDto(EquityOrderFormSettingsDto equityOrderFormSettingsDto, OptionOrderFormSettingsDto optionOrderFormSettingsDto, BackgroundAuraDto backgroundAuraDto, ReleaseSettingsDto releaseSettingsDto, CryptoOrderFormSettingsDto cryptoOrderFormSettingsDto, boolean z, Instant instant, OrderFormSettingsDto orderFormSettingsDto, GeneralSettingsDto generalSettingsDto, String last_selected_account) {
        this(new Surrogate(equityOrderFormSettingsDto, optionOrderFormSettingsDto, backgroundAuraDto, releaseSettingsDto, cryptoOrderFormSettingsDto, z, instant, orderFormSettingsDto, generalSettingsDto, last_selected_account));
        Intrinsics.checkNotNullParameter(last_selected_account, "last_selected_account");
    }

    @Override // com.robinhood.idl.Dto
    public AppSettings toProto() {
        EquityOrderFormSettingsDto last_equity_order_form_fields = this.surrogate.getLast_equity_order_form_fields();
        EquityOrderFormSettings proto = last_equity_order_form_fields != null ? last_equity_order_form_fields.toProto() : null;
        OptionOrderFormSettingsDto last_option_order_form_fields = this.surrogate.getLast_option_order_form_fields();
        OptionOrderFormSettings proto2 = last_option_order_form_fields != null ? last_option_order_form_fields.toProto() : null;
        BackgroundAuraDto background_aura = this.surrogate.getBackground_aura();
        BackgroundAura proto3 = background_aura != null ? background_aura.toProto() : null;
        ReleaseSettingsDto release_settings = this.surrogate.getRelease_settings();
        ReleaseSettings proto4 = release_settings != null ? release_settings.toProto() : null;
        CryptoOrderFormSettingsDto last_crypto_order_form_fields = this.surrogate.getLast_crypto_order_form_fields();
        CryptoOrderFormSettings proto5 = last_crypto_order_form_fields != null ? last_crypto_order_form_fields.toProto() : null;
        boolean is_auto_send_disclosure_signed = this.surrogate.getIs_auto_send_disclosure_signed();
        Instant last_accessed_at = this.surrogate.getLast_accessed_at();
        OrderFormSettingsDto order_form_settings = this.surrogate.getOrder_form_settings();
        OrderFormSettings proto6 = order_form_settings != null ? order_form_settings.toProto() : null;
        GeneralSettingsDto general_settings = this.surrogate.getGeneral_settings();
        return new AppSettings(proto, proto2, proto3, proto4, proto5, is_auto_send_disclosure_signed, last_accessed_at, proto6, general_settings != null ? general_settings.toProto() : null, this.surrogate.getLast_selected_account(), null, 1024, null);
    }

    public String toString() {
        return "[AppSettingsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AppSettingsDto) && Intrinsics.areEqual(((AppSettingsDto) other).surrogate, this.surrogate);
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
    /* compiled from: AppSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b4\b\u0083\b\u0018\u0000 X2\u00020\u0001:\u0002YXB\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB}\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J'\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b9\u00105\u001a\u0004\b7\u00108R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\b=\u00105\u001a\u0004\b;\u0010<R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bA\u00105\u001a\u0004\b?\u0010@R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bE\u00105\u001a\u0004\bC\u0010DR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010F\u0012\u0004\bH\u00105\u001a\u0004\b\r\u0010GRF\u0010\u0013\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010I\u0012\u0004\bL\u00105\u001a\u0004\bJ\u0010KR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010M\u0012\u0004\bP\u00105\u001a\u0004\bN\u0010OR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010Q\u0012\u0004\bT\u00105\u001a\u0004\bR\u0010SR \u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010U\u0012\u0004\bW\u00105\u001a\u0004\bV\u0010+¨\u0006Z"}, m3636d2 = {"Lhippo/model/v1/AppSettingsDto$Surrogate;", "", "Lhippo/model/v1/EquityOrderFormSettingsDto;", "last_equity_order_form_fields", "Lhippo/model/v1/OptionOrderFormSettingsDto;", "last_option_order_form_fields", "Lhippo/model/v1/BackgroundAuraDto;", "background_aura", "Lhippo/model/v1/ReleaseSettingsDto;", "release_settings", "Lhippo/model/v1/CryptoOrderFormSettingsDto;", "last_crypto_order_form_fields", "", "is_auto_send_disclosure_signed", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_accessed_at", "Lhippo/model/v1/OrderFormSettingsDto;", "order_form_settings", "Lhippo/model/v1/GeneralSettingsDto;", "general_settings", "", "last_selected_account", "<init>", "(Lhippo/model/v1/EquityOrderFormSettingsDto;Lhippo/model/v1/OptionOrderFormSettingsDto;Lhippo/model/v1/BackgroundAuraDto;Lhippo/model/v1/ReleaseSettingsDto;Lhippo/model/v1/CryptoOrderFormSettingsDto;ZLj$/time/Instant;Lhippo/model/v1/OrderFormSettingsDto;Lhippo/model/v1/GeneralSettingsDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILhippo/model/v1/EquityOrderFormSettingsDto;Lhippo/model/v1/OptionOrderFormSettingsDto;Lhippo/model/v1/BackgroundAuraDto;Lhippo/model/v1/ReleaseSettingsDto;Lhippo/model/v1/CryptoOrderFormSettingsDto;ZLj$/time/Instant;Lhippo/model/v1/OrderFormSettingsDto;Lhippo/model/v1/GeneralSettingsDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$hippo_v1_externalRelease", "(Lhippo/model/v1/AppSettingsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lhippo/model/v1/EquityOrderFormSettingsDto;", "getLast_equity_order_form_fields", "()Lhippo/model/v1/EquityOrderFormSettingsDto;", "getLast_equity_order_form_fields$annotations", "()V", "Lhippo/model/v1/OptionOrderFormSettingsDto;", "getLast_option_order_form_fields", "()Lhippo/model/v1/OptionOrderFormSettingsDto;", "getLast_option_order_form_fields$annotations", "Lhippo/model/v1/BackgroundAuraDto;", "getBackground_aura", "()Lhippo/model/v1/BackgroundAuraDto;", "getBackground_aura$annotations", "Lhippo/model/v1/ReleaseSettingsDto;", "getRelease_settings", "()Lhippo/model/v1/ReleaseSettingsDto;", "getRelease_settings$annotations", "Lhippo/model/v1/CryptoOrderFormSettingsDto;", "getLast_crypto_order_form_fields", "()Lhippo/model/v1/CryptoOrderFormSettingsDto;", "getLast_crypto_order_form_fields$annotations", "Z", "()Z", "is_auto_send_disclosure_signed$annotations", "Lj$/time/Instant;", "getLast_accessed_at", "()Lj$/time/Instant;", "getLast_accessed_at$annotations", "Lhippo/model/v1/OrderFormSettingsDto;", "getOrder_form_settings", "()Lhippo/model/v1/OrderFormSettingsDto;", "getOrder_form_settings$annotations", "Lhippo/model/v1/GeneralSettingsDto;", "getGeneral_settings", "()Lhippo/model/v1/GeneralSettingsDto;", "getGeneral_settings$annotations", "Ljava/lang/String;", "getLast_selected_account", "getLast_selected_account$annotations", "Companion", "$serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BackgroundAuraDto background_aura;
        private final GeneralSettingsDto general_settings;
        private final boolean is_auto_send_disclosure_signed;
        private final Instant last_accessed_at;
        private final CryptoOrderFormSettingsDto last_crypto_order_form_fields;
        private final EquityOrderFormSettingsDto last_equity_order_form_fields;
        private final OptionOrderFormSettingsDto last_option_order_form_fields;
        private final String last_selected_account;
        private final OrderFormSettingsDto order_form_settings;
        private final ReleaseSettingsDto release_settings;

        public Surrogate() {
            this((EquityOrderFormSettingsDto) null, (OptionOrderFormSettingsDto) null, (BackgroundAuraDto) null, (ReleaseSettingsDto) null, (CryptoOrderFormSettingsDto) null, false, (Instant) null, (OrderFormSettingsDto) null, (GeneralSettingsDto) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.last_equity_order_form_fields, surrogate.last_equity_order_form_fields) && Intrinsics.areEqual(this.last_option_order_form_fields, surrogate.last_option_order_form_fields) && Intrinsics.areEqual(this.background_aura, surrogate.background_aura) && Intrinsics.areEqual(this.release_settings, surrogate.release_settings) && Intrinsics.areEqual(this.last_crypto_order_form_fields, surrogate.last_crypto_order_form_fields) && this.is_auto_send_disclosure_signed == surrogate.is_auto_send_disclosure_signed && Intrinsics.areEqual(this.last_accessed_at, surrogate.last_accessed_at) && Intrinsics.areEqual(this.order_form_settings, surrogate.order_form_settings) && Intrinsics.areEqual(this.general_settings, surrogate.general_settings) && Intrinsics.areEqual(this.last_selected_account, surrogate.last_selected_account);
        }

        public int hashCode() {
            EquityOrderFormSettingsDto equityOrderFormSettingsDto = this.last_equity_order_form_fields;
            int iHashCode = (equityOrderFormSettingsDto == null ? 0 : equityOrderFormSettingsDto.hashCode()) * 31;
            OptionOrderFormSettingsDto optionOrderFormSettingsDto = this.last_option_order_form_fields;
            int iHashCode2 = (iHashCode + (optionOrderFormSettingsDto == null ? 0 : optionOrderFormSettingsDto.hashCode())) * 31;
            BackgroundAuraDto backgroundAuraDto = this.background_aura;
            int iHashCode3 = (iHashCode2 + (backgroundAuraDto == null ? 0 : backgroundAuraDto.hashCode())) * 31;
            ReleaseSettingsDto releaseSettingsDto = this.release_settings;
            int iHashCode4 = (iHashCode3 + (releaseSettingsDto == null ? 0 : releaseSettingsDto.hashCode())) * 31;
            CryptoOrderFormSettingsDto cryptoOrderFormSettingsDto = this.last_crypto_order_form_fields;
            int iHashCode5 = (((iHashCode4 + (cryptoOrderFormSettingsDto == null ? 0 : cryptoOrderFormSettingsDto.hashCode())) * 31) + Boolean.hashCode(this.is_auto_send_disclosure_signed)) * 31;
            Instant instant = this.last_accessed_at;
            int iHashCode6 = (iHashCode5 + (instant == null ? 0 : instant.hashCode())) * 31;
            OrderFormSettingsDto orderFormSettingsDto = this.order_form_settings;
            int iHashCode7 = (iHashCode6 + (orderFormSettingsDto == null ? 0 : orderFormSettingsDto.hashCode())) * 31;
            GeneralSettingsDto generalSettingsDto = this.general_settings;
            return ((iHashCode7 + (generalSettingsDto != null ? generalSettingsDto.hashCode() : 0)) * 31) + this.last_selected_account.hashCode();
        }

        public String toString() {
            return "Surrogate(last_equity_order_form_fields=" + this.last_equity_order_form_fields + ", last_option_order_form_fields=" + this.last_option_order_form_fields + ", background_aura=" + this.background_aura + ", release_settings=" + this.release_settings + ", last_crypto_order_form_fields=" + this.last_crypto_order_form_fields + ", is_auto_send_disclosure_signed=" + this.is_auto_send_disclosure_signed + ", last_accessed_at=" + this.last_accessed_at + ", order_form_settings=" + this.order_form_settings + ", general_settings=" + this.general_settings + ", last_selected_account=" + this.last_selected_account + ")";
        }

        /* compiled from: AppSettingsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhippo/model/v1/AppSettingsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/AppSettingsDto$Surrogate;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AppSettingsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EquityOrderFormSettingsDto equityOrderFormSettingsDto, OptionOrderFormSettingsDto optionOrderFormSettingsDto, BackgroundAuraDto backgroundAuraDto, ReleaseSettingsDto releaseSettingsDto, CryptoOrderFormSettingsDto cryptoOrderFormSettingsDto, boolean z, Instant instant, OrderFormSettingsDto orderFormSettingsDto, GeneralSettingsDto generalSettingsDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.last_equity_order_form_fields = null;
            } else {
                this.last_equity_order_form_fields = equityOrderFormSettingsDto;
            }
            if ((i & 2) == 0) {
                this.last_option_order_form_fields = null;
            } else {
                this.last_option_order_form_fields = optionOrderFormSettingsDto;
            }
            if ((i & 4) == 0) {
                this.background_aura = null;
            } else {
                this.background_aura = backgroundAuraDto;
            }
            if ((i & 8) == 0) {
                this.release_settings = null;
            } else {
                this.release_settings = releaseSettingsDto;
            }
            if ((i & 16) == 0) {
                this.last_crypto_order_form_fields = null;
            } else {
                this.last_crypto_order_form_fields = cryptoOrderFormSettingsDto;
            }
            if ((i & 32) == 0) {
                this.is_auto_send_disclosure_signed = false;
            } else {
                this.is_auto_send_disclosure_signed = z;
            }
            if ((i & 64) == 0) {
                this.last_accessed_at = null;
            } else {
                this.last_accessed_at = instant;
            }
            if ((i & 128) == 0) {
                this.order_form_settings = null;
            } else {
                this.order_form_settings = orderFormSettingsDto;
            }
            if ((i & 256) == 0) {
                this.general_settings = null;
            } else {
                this.general_settings = generalSettingsDto;
            }
            if ((i & 512) == 0) {
                this.last_selected_account = "";
            } else {
                this.last_selected_account = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$hippo_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            EquityOrderFormSettingsDto equityOrderFormSettingsDto = self.last_equity_order_form_fields;
            if (equityOrderFormSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, EquityOrderFormSettingsDto.Serializer.INSTANCE, equityOrderFormSettingsDto);
            }
            OptionOrderFormSettingsDto optionOrderFormSettingsDto = self.last_option_order_form_fields;
            if (optionOrderFormSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, OptionOrderFormSettingsDto.Serializer.INSTANCE, optionOrderFormSettingsDto);
            }
            BackgroundAuraDto backgroundAuraDto = self.background_aura;
            if (backgroundAuraDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BackgroundAuraDto.Serializer.INSTANCE, backgroundAuraDto);
            }
            ReleaseSettingsDto releaseSettingsDto = self.release_settings;
            if (releaseSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ReleaseSettingsDto.Serializer.INSTANCE, releaseSettingsDto);
            }
            CryptoOrderFormSettingsDto cryptoOrderFormSettingsDto = self.last_crypto_order_form_fields;
            if (cryptoOrderFormSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CryptoOrderFormSettingsDto.Serializer.INSTANCE, cryptoOrderFormSettingsDto);
            }
            boolean z = self.is_auto_send_disclosure_signed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
            Instant instant = self.last_accessed_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant);
            }
            OrderFormSettingsDto orderFormSettingsDto = self.order_form_settings;
            if (orderFormSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, OrderFormSettingsDto.Serializer.INSTANCE, orderFormSettingsDto);
            }
            GeneralSettingsDto generalSettingsDto = self.general_settings;
            if (generalSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, GeneralSettingsDto.Serializer.INSTANCE, generalSettingsDto);
            }
            if (Intrinsics.areEqual(self.last_selected_account, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 9, self.last_selected_account);
        }

        public Surrogate(EquityOrderFormSettingsDto equityOrderFormSettingsDto, OptionOrderFormSettingsDto optionOrderFormSettingsDto, BackgroundAuraDto backgroundAuraDto, ReleaseSettingsDto releaseSettingsDto, CryptoOrderFormSettingsDto cryptoOrderFormSettingsDto, boolean z, Instant instant, OrderFormSettingsDto orderFormSettingsDto, GeneralSettingsDto generalSettingsDto, String last_selected_account) {
            Intrinsics.checkNotNullParameter(last_selected_account, "last_selected_account");
            this.last_equity_order_form_fields = equityOrderFormSettingsDto;
            this.last_option_order_form_fields = optionOrderFormSettingsDto;
            this.background_aura = backgroundAuraDto;
            this.release_settings = releaseSettingsDto;
            this.last_crypto_order_form_fields = cryptoOrderFormSettingsDto;
            this.is_auto_send_disclosure_signed = z;
            this.last_accessed_at = instant;
            this.order_form_settings = orderFormSettingsDto;
            this.general_settings = generalSettingsDto;
            this.last_selected_account = last_selected_account;
        }

        public final EquityOrderFormSettingsDto getLast_equity_order_form_fields() {
            return this.last_equity_order_form_fields;
        }

        public final OptionOrderFormSettingsDto getLast_option_order_form_fields() {
            return this.last_option_order_form_fields;
        }

        public final BackgroundAuraDto getBackground_aura() {
            return this.background_aura;
        }

        public final ReleaseSettingsDto getRelease_settings() {
            return this.release_settings;
        }

        public final CryptoOrderFormSettingsDto getLast_crypto_order_form_fields() {
            return this.last_crypto_order_form_fields;
        }

        /* renamed from: is_auto_send_disclosure_signed, reason: from getter */
        public final boolean getIs_auto_send_disclosure_signed() {
            return this.is_auto_send_disclosure_signed;
        }

        public final Instant getLast_accessed_at() {
            return this.last_accessed_at;
        }

        public final OrderFormSettingsDto getOrder_form_settings() {
            return this.order_form_settings;
        }

        public final GeneralSettingsDto getGeneral_settings() {
            return this.general_settings;
        }

        public final String getLast_selected_account() {
            return this.last_selected_account;
        }

        public /* synthetic */ Surrogate(EquityOrderFormSettingsDto equityOrderFormSettingsDto, OptionOrderFormSettingsDto optionOrderFormSettingsDto, BackgroundAuraDto backgroundAuraDto, ReleaseSettingsDto releaseSettingsDto, CryptoOrderFormSettingsDto cryptoOrderFormSettingsDto, boolean z, Instant instant, OrderFormSettingsDto orderFormSettingsDto, GeneralSettingsDto generalSettingsDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : equityOrderFormSettingsDto, (i & 2) != 0 ? null : optionOrderFormSettingsDto, (i & 4) != 0 ? null : backgroundAuraDto, (i & 8) != 0 ? null : releaseSettingsDto, (i & 16) != 0 ? null : cryptoOrderFormSettingsDto, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? null : orderFormSettingsDto, (i & 256) != 0 ? null : generalSettingsDto, (i & 512) != 0 ? "" : str);
        }
    }

    /* compiled from: AppSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/AppSettingsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhippo/model/v1/AppSettingsDto;", "Lhippo/model/v1/AppSettings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/AppSettingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AppSettingsDto, AppSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppSettingsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppSettingsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppSettingsDto> getBinaryBase64Serializer() {
            return (KSerializer) AppSettingsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AppSettings> getProtoAdapter() {
            return AppSettings.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppSettingsDto getZeroValue() {
            return AppSettingsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppSettingsDto fromProto(AppSettings proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EquityOrderFormSettings last_equity_order_form_fields = proto.getLast_equity_order_form_fields();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EquityOrderFormSettingsDto equityOrderFormSettingsDtoFromProto = last_equity_order_form_fields != null ? EquityOrderFormSettingsDto.INSTANCE.fromProto(last_equity_order_form_fields) : null;
            OptionOrderFormSettings last_option_order_form_fields = proto.getLast_option_order_form_fields();
            OptionOrderFormSettingsDto optionOrderFormSettingsDtoFromProto = last_option_order_form_fields != null ? OptionOrderFormSettingsDto.INSTANCE.fromProto(last_option_order_form_fields) : null;
            BackgroundAura background_aura = proto.getBackground_aura();
            BackgroundAuraDto backgroundAuraDtoFromProto = background_aura != null ? BackgroundAuraDto.INSTANCE.fromProto(background_aura) : null;
            ReleaseSettings release_settings = proto.getRelease_settings();
            ReleaseSettingsDto releaseSettingsDtoFromProto = release_settings != null ? ReleaseSettingsDto.INSTANCE.fromProto(release_settings) : null;
            CryptoOrderFormSettings last_crypto_order_form_fields = proto.getLast_crypto_order_form_fields();
            CryptoOrderFormSettingsDto cryptoOrderFormSettingsDtoFromProto = last_crypto_order_form_fields != null ? CryptoOrderFormSettingsDto.INSTANCE.fromProto(last_crypto_order_form_fields) : null;
            boolean is_auto_send_disclosure_signed = proto.getIs_auto_send_disclosure_signed();
            Instant last_accessed_at = proto.getLast_accessed_at();
            OrderFormSettings order_form_settings = proto.getOrder_form_settings();
            OrderFormSettingsDto orderFormSettingsDtoFromProto = order_form_settings != null ? OrderFormSettingsDto.INSTANCE.fromProto(order_form_settings) : null;
            GeneralSettings general_settings = proto.getGeneral_settings();
            return new AppSettingsDto(new Surrogate(equityOrderFormSettingsDtoFromProto, optionOrderFormSettingsDtoFromProto, backgroundAuraDtoFromProto, releaseSettingsDtoFromProto, cryptoOrderFormSettingsDtoFromProto, is_auto_send_disclosure_signed, last_accessed_at, orderFormSettingsDtoFromProto, general_settings != null ? GeneralSettingsDto.INSTANCE.fromProto(general_settings) : null, proto.getLast_selected_account()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.AppSettingsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppSettingsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AppSettingsDto(null, null, null, null, null, false, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AppSettingsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/AppSettingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/AppSettingsDto;", "<init>", "()V", "surrogateSerializer", "Lhippo/model/v1/AppSettingsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AppSettingsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/hippo.model.v1.AppSettings", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AppSettingsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AppSettingsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AppSettingsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AppSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhippo/model/v1/AppSettingsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "hippo.model.v1.AppSettingsDto";
        }
    }
}
