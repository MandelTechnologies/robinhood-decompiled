package helios.service.advancedorder.p467v1;

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
import p479j$.time.Instant;

/* compiled from: AdvancedOrderLinkDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010.R\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, m3636d2 = {"Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto;", "Lcom/robinhood/idl/MessageDto;", "Lhelios/service/advancedorder/v1/AdvancedOrderLink;", "Landroid/os/Parcelable;", "Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Surrogate;", "surrogate", "<init>", "(Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Surrogate;)V", "", "id", "root_advanced_order_id", "parent_advanced_order_id", "order_id", "fx_order_id", "advanced_order_id", "", "is_primary", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;)V", "toProto", "()Lhelios/service/advancedorder/v1/AdvancedOrderLink;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Surrogate;", "getId", "getRoot_advanced_order_id", "getParent_advanced_order_id", "getOrder_id", "getFx_order_id", "getAdvanced_order_id", "()Z", "getCreated_at", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class AdvancedOrderLinkDto implements Dto3<AdvancedOrderLink>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvancedOrderLinkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvancedOrderLinkDto, AdvancedOrderLink>> binaryBase64Serializer$delegate;
    private static final AdvancedOrderLinkDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvancedOrderLinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvancedOrderLinkDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getRoot_advanced_order_id() {
        return this.surrogate.getRoot_advanced_order_id();
    }

    public final String getParent_advanced_order_id() {
        return this.surrogate.getParent_advanced_order_id();
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final String getFx_order_id() {
        return this.surrogate.getFx_order_id();
    }

    public final String getAdvanced_order_id() {
        return this.surrogate.getAdvanced_order_id();
    }

    public final boolean is_primary() {
        return this.surrogate.getIs_primary();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public /* synthetic */ AdvancedOrderLinkDto(String str, String str2, String str3, String str4, String str5, String str6, boolean z, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : instant);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvancedOrderLinkDto(String id, String root_advanced_order_id, String parent_advanced_order_id, String order_id, String fx_order_id, String advanced_order_id, boolean z, Instant instant) {
        this(new Surrogate(id, root_advanced_order_id, parent_advanced_order_id, order_id, fx_order_id, advanced_order_id, z, instant));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(root_advanced_order_id, "root_advanced_order_id");
        Intrinsics.checkNotNullParameter(parent_advanced_order_id, "parent_advanced_order_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(fx_order_id, "fx_order_id");
        Intrinsics.checkNotNullParameter(advanced_order_id, "advanced_order_id");
    }

    @Override // com.robinhood.idl.Dto
    public AdvancedOrderLink toProto() {
        return new AdvancedOrderLink(this.surrogate.getId(), this.surrogate.getRoot_advanced_order_id(), this.surrogate.getParent_advanced_order_id(), this.surrogate.getOrder_id(), this.surrogate.getFx_order_id(), this.surrogate.getAdvanced_order_id(), this.surrogate.getIs_primary(), this.surrogate.getCreated_at(), null, 256, null);
    }

    public String toString() {
        return "[AdvancedOrderLinkDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvancedOrderLinkDto) && Intrinsics.areEqual(((AdvancedOrderLinkDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvancedOrderLinkDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012.\b\u0002\u0010\u0010\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bi\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\"R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\"R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\"R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010\"R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b5\u0010+\u001a\u0004\b4\u0010\"R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b8\u0010+\u001a\u0004\b\n\u00107RF\u0010\u0010\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00109\u0012\u0004\b<\u0010+\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Surrogate;", "", "", "id", "root_advanced_order_id", "parent_advanced_order_id", "order_id", "fx_order_id", "advanced_order_id", "", "is_primary", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$helios_advancedorder_v1_externalRelease", "(Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getRoot_advanced_order_id", "getRoot_advanced_order_id$annotations", "getParent_advanced_order_id", "getParent_advanced_order_id$annotations", "getOrder_id", "getOrder_id$annotations", "getFx_order_id", "getFx_order_id$annotations", "getAdvanced_order_id", "getAdvanced_order_id$annotations", "Z", "()Z", "is_primary$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "Companion", "$serializer", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String advanced_order_id;
        private final Instant created_at;
        private final String fx_order_id;
        private final String id;
        private final boolean is_primary;
        private final String order_id;
        private final String parent_advanced_order_id;
        private final String root_advanced_order_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (Instant) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.root_advanced_order_id, surrogate.root_advanced_order_id) && Intrinsics.areEqual(this.parent_advanced_order_id, surrogate.parent_advanced_order_id) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.fx_order_id, surrogate.fx_order_id) && Intrinsics.areEqual(this.advanced_order_id, surrogate.advanced_order_id) && this.is_primary == surrogate.is_primary && Intrinsics.areEqual(this.created_at, surrogate.created_at);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.root_advanced_order_id.hashCode()) * 31) + this.parent_advanced_order_id.hashCode()) * 31) + this.order_id.hashCode()) * 31) + this.fx_order_id.hashCode()) * 31) + this.advanced_order_id.hashCode()) * 31) + Boolean.hashCode(this.is_primary)) * 31;
            Instant instant = this.created_at;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", root_advanced_order_id=" + this.root_advanced_order_id + ", parent_advanced_order_id=" + this.parent_advanced_order_id + ", order_id=" + this.order_id + ", fx_order_id=" + this.fx_order_id + ", advanced_order_id=" + this.advanced_order_id + ", is_primary=" + this.is_primary + ", created_at=" + this.created_at + ")";
        }

        /* compiled from: AdvancedOrderLinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Surrogate;", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvancedOrderLinkDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.root_advanced_order_id = "";
            } else {
                this.root_advanced_order_id = str2;
            }
            if ((i & 4) == 0) {
                this.parent_advanced_order_id = "";
            } else {
                this.parent_advanced_order_id = str3;
            }
            if ((i & 8) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str4;
            }
            if ((i & 16) == 0) {
                this.fx_order_id = "";
            } else {
                this.fx_order_id = str5;
            }
            if ((i & 32) == 0) {
                this.advanced_order_id = "";
            } else {
                this.advanced_order_id = str6;
            }
            if ((i & 64) == 0) {
                this.is_primary = false;
            } else {
                this.is_primary = z;
            }
            if ((i & 128) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$helios_advancedorder_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.root_advanced_order_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.root_advanced_order_id);
            }
            if (!Intrinsics.areEqual(self.parent_advanced_order_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.parent_advanced_order_id);
            }
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.order_id);
            }
            if (!Intrinsics.areEqual(self.fx_order_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.fx_order_id);
            }
            if (!Intrinsics.areEqual(self.advanced_order_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.advanced_order_id);
            }
            boolean z = self.is_primary;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant);
            }
        }

        public Surrogate(String id, String root_advanced_order_id, String parent_advanced_order_id, String order_id, String fx_order_id, String advanced_order_id, boolean z, Instant instant) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(root_advanced_order_id, "root_advanced_order_id");
            Intrinsics.checkNotNullParameter(parent_advanced_order_id, "parent_advanced_order_id");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(fx_order_id, "fx_order_id");
            Intrinsics.checkNotNullParameter(advanced_order_id, "advanced_order_id");
            this.id = id;
            this.root_advanced_order_id = root_advanced_order_id;
            this.parent_advanced_order_id = parent_advanced_order_id;
            this.order_id = order_id;
            this.fx_order_id = fx_order_id;
            this.advanced_order_id = advanced_order_id;
            this.is_primary = z;
            this.created_at = instant;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, boolean z, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : instant);
        }

        public final String getId() {
            return this.id;
        }

        public final String getRoot_advanced_order_id() {
            return this.root_advanced_order_id;
        }

        public final String getParent_advanced_order_id() {
            return this.parent_advanced_order_id;
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getFx_order_id() {
            return this.fx_order_id;
        }

        public final String getAdvanced_order_id() {
            return this.advanced_order_id;
        }

        /* renamed from: is_primary, reason: from getter */
        public final boolean getIs_primary() {
            return this.is_primary;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }
    }

    /* compiled from: AdvancedOrderLinkDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto;", "Lhelios/service/advancedorder/v1/AdvancedOrderLink;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AdvancedOrderLinkDto, AdvancedOrderLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvancedOrderLinkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvancedOrderLinkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvancedOrderLinkDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvancedOrderLinkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvancedOrderLink> getProtoAdapter() {
            return AdvancedOrderLink.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvancedOrderLinkDto getZeroValue() {
            return AdvancedOrderLinkDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvancedOrderLinkDto fromProto(AdvancedOrderLink proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AdvancedOrderLinkDto(new Surrogate(proto.getId(), proto.getRoot_advanced_order_id(), proto.getParent_advanced_order_id(), proto.getOrder_id(), proto.getFx_order_id(), proto.getAdvanced_order_id(), proto.getIs_primary(), proto.getCreated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: helios.service.advancedorder.v1.AdvancedOrderLinkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedOrderLinkDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvancedOrderLinkDto(null, null, null, null, null, null, false, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvancedOrderLinkDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto;", "<init>", "()V", "surrogateSerializer", "Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvancedOrderLinkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/helios.service.advancedorder.v1.AdvancedOrderLink", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvancedOrderLinkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvancedOrderLinkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvancedOrderLinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvancedOrderLinkDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "helios.service.advancedorder.v1.AdvancedOrderLinkDto";
        }
    }
}
