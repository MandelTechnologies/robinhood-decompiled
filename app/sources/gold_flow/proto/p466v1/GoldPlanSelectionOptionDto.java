package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.ActionDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GoldPlanSelectionOptionDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bs\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPlanSelectionOptionDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/GoldPlanSelectionOption;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Surrogate;)V", "", "title", "plan_id", "badge", "description", "description_secondary", "Lgold_flow/proto/v1/ActionDto;", "on_select_action", "logging_identifier", "", "is_selected", "accessibility_identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/ActionDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "toProto", "()Lgold_flow/proto/v1/GoldPlanSelectionOption;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class GoldPlanSelectionOptionDto implements Dto3<GoldPlanSelectionOption>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GoldPlanSelectionOptionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GoldPlanSelectionOptionDto, GoldPlanSelectionOption>> binaryBase64Serializer$delegate;
    private static final GoldPlanSelectionOptionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GoldPlanSelectionOptionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GoldPlanSelectionOptionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GoldPlanSelectionOptionDto(String str, String str2, String str3, String str4, String str5, ActionDto actionDto, String str6, Boolean bool, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : actionDto, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldPlanSelectionOptionDto(String str, String plan_id, String str2, String str3, String str4, ActionDto actionDto, String str5, Boolean bool, String str6) {
        this(new Surrogate(str, plan_id, str2, str3, str4, actionDto, str5, bool, str6));
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
    }

    @Override // com.robinhood.idl.Dto
    public GoldPlanSelectionOption toProto() {
        String title = this.surrogate.getTitle();
        String plan_id = this.surrogate.getPlan_id();
        String badge = this.surrogate.getBadge();
        String description = this.surrogate.getDescription();
        String description_secondary = this.surrogate.getDescription_secondary();
        ActionDto on_select_action = this.surrogate.getOn_select_action();
        return new GoldPlanSelectionOption(title, plan_id, badge, description, description_secondary, on_select_action != null ? on_select_action.toProto() : null, this.surrogate.getLogging_identifier(), this.surrogate.getIs_selected(), this.surrogate.getAccessibility_identifier(), null, 512, null);
    }

    public String toString() {
        return "[GoldPlanSelectionOptionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GoldPlanSelectionOptionDto) && Intrinsics.areEqual(((GoldPlanSelectionOptionDto) other).surrogate, this.surrogate);
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
    /* compiled from: GoldPlanSelectionOptionDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b9\u0010(\u001a\u0004\b\f\u00108R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010%\u0012\u0004\b;\u0010(\u001a\u0004\b:\u0010\u001f¨\u0006>"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Surrogate;", "", "", "title", "plan_id", "badge", "description", "description_secondary", "Lgold_flow/proto/v1/ActionDto;", "on_select_action", "logging_identifier", "", "is_selected", "accessibility_identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/ActionDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/ActionDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getPlan_id", "getPlan_id$annotations", "getBadge", "getBadge$annotations", "getDescription", "getDescription$annotations", "getDescription_secondary", "getDescription_secondary$annotations", "Lgold_flow/proto/v1/ActionDto;", "getOn_select_action", "()Lgold_flow/proto/v1/ActionDto;", "getOn_select_action$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "is_selected$annotations", "getAccessibility_identifier", "getAccessibility_identifier$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String accessibility_identifier;
        private final String badge;
        private final String description;
        private final String description_secondary;
        private final Boolean is_selected;
        private final String logging_identifier;
        private final ActionDto on_select_action;
        private final String plan_id;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (ActionDto) null, (String) null, (Boolean) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.plan_id, surrogate.plan_id) && Intrinsics.areEqual(this.badge, surrogate.badge) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.description_secondary, surrogate.description_secondary) && Intrinsics.areEqual(this.on_select_action, surrogate.on_select_action) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.is_selected, surrogate.is_selected) && Intrinsics.areEqual(this.accessibility_identifier, surrogate.accessibility_identifier);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.plan_id.hashCode()) * 31;
            String str2 = this.badge;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.description_secondary;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ActionDto actionDto = this.on_select_action;
            int iHashCode5 = (iHashCode4 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
            String str5 = this.logging_identifier;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.is_selected;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str6 = this.accessibility_identifier;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", plan_id=" + this.plan_id + ", badge=" + this.badge + ", description=" + this.description + ", description_secondary=" + this.description_secondary + ", on_select_action=" + this.on_select_action + ", logging_identifier=" + this.logging_identifier + ", is_selected=" + this.is_selected + ", accessibility_identifier=" + this.accessibility_identifier + ")";
        }

        /* compiled from: GoldPlanSelectionOptionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GoldPlanSelectionOptionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, ActionDto actionDto, String str6, Boolean bool, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.plan_id = "";
            } else {
                this.plan_id = str2;
            }
            if ((i & 4) == 0) {
                this.badge = null;
            } else {
                this.badge = str3;
            }
            if ((i & 8) == 0) {
                this.description = null;
            } else {
                this.description = str4;
            }
            if ((i & 16) == 0) {
                this.description_secondary = null;
            } else {
                this.description_secondary = str5;
            }
            if ((i & 32) == 0) {
                this.on_select_action = null;
            } else {
                this.on_select_action = actionDto;
            }
            if ((i & 64) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str6;
            }
            if ((i & 128) == 0) {
                this.is_selected = null;
            } else {
                this.is_selected = bool;
            }
            if ((i & 256) == 0) {
                this.accessibility_identifier = null;
            } else {
                this.accessibility_identifier = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.plan_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.plan_id);
            }
            String str2 = self.badge;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.description;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.description_secondary;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str4);
            }
            ActionDto actionDto = self.on_select_action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ActionDto.Serializer.INSTANCE, actionDto);
            }
            String str5 = self.logging_identifier;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str5);
            }
            Boolean bool = self.is_selected;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, bool);
            }
            String str6 = self.accessibility_identifier;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str6);
            }
        }

        public Surrogate(String str, String plan_id, String str2, String str3, String str4, ActionDto actionDto, String str5, Boolean bool, String str6) {
            Intrinsics.checkNotNullParameter(plan_id, "plan_id");
            this.title = str;
            this.plan_id = plan_id;
            this.badge = str2;
            this.description = str3;
            this.description_secondary = str4;
            this.on_select_action = actionDto;
            this.logging_identifier = str5;
            this.is_selected = bool;
            this.accessibility_identifier = str6;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPlan_id() {
            return this.plan_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, ActionDto actionDto, String str6, Boolean bool, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : actionDto, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str7);
        }

        public final String getBadge() {
            return this.badge;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDescription_secondary() {
            return this.description_secondary;
        }

        public final ActionDto getOn_select_action() {
            return this.on_select_action;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        /* renamed from: is_selected, reason: from getter */
        public final Boolean getIs_selected() {
            return this.is_selected;
        }

        public final String getAccessibility_identifier() {
            return this.accessibility_identifier;
        }
    }

    /* compiled from: GoldPlanSelectionOptionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/GoldPlanSelectionOptionDto;", "Lgold_flow/proto/v1/GoldPlanSelectionOption;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/GoldPlanSelectionOptionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GoldPlanSelectionOptionDto, GoldPlanSelectionOption> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GoldPlanSelectionOptionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GoldPlanSelectionOptionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GoldPlanSelectionOptionDto> getBinaryBase64Serializer() {
            return (KSerializer) GoldPlanSelectionOptionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GoldPlanSelectionOption> getProtoAdapter() {
            return GoldPlanSelectionOption.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GoldPlanSelectionOptionDto getZeroValue() {
            return GoldPlanSelectionOptionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GoldPlanSelectionOptionDto fromProto(GoldPlanSelectionOption proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String plan_id = proto.getPlan_id();
            String badge = proto.getBadge();
            String description = proto.getDescription();
            String description_secondary = proto.getDescription_secondary();
            Action on_select_action = proto.getOn_select_action();
            return new GoldPlanSelectionOptionDto(new Surrogate(title, plan_id, badge, description, description_secondary, on_select_action != null ? ActionDto.INSTANCE.fromProto(on_select_action) : null, proto.getLogging_identifier(), proto.getIs_selected(), proto.getAccessibility_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.GoldPlanSelectionOptionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoldPlanSelectionOptionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GoldPlanSelectionOptionDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GoldPlanSelectionOptionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/GoldPlanSelectionOptionDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GoldPlanSelectionOptionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.GoldPlanSelectionOption", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GoldPlanSelectionOptionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GoldPlanSelectionOptionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GoldPlanSelectionOptionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GoldPlanSelectionOptionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/GoldPlanSelectionOptionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.GoldPlanSelectionOptionDto";
        }
    }
}
