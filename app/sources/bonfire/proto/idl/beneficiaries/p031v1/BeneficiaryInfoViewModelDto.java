package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoLoggingIdentifierDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoTypeDto;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModelDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: BeneficiaryInfoViewModelDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Surrogate;)V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoTypeDto;", "type", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "components", "", "done_button_text", "add_beneficiaries_text", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifierDto;", "logging_identifier", "footer_markdown", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoTypeDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifierDto;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class BeneficiaryInfoViewModelDto implements Dto3<BeneficiaryInfoViewModel>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BeneficiaryInfoViewModelDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BeneficiaryInfoViewModelDto, BeneficiaryInfoViewModel>> binaryBase64Serializer$delegate;
    private static final BeneficiaryInfoViewModelDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BeneficiaryInfoViewModelDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BeneficiaryInfoViewModelDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BeneficiaryInfoViewModelDto(bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoTypeDto r2, java.util.List r3, java.lang.String r4, java.lang.String r5, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoLoggingIdentifierDto r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoTypeDto$Companion r2 = bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoTypeDto.INSTANCE
            bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoTypeDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            if (r9 == 0) goto L12
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L12:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L18
            r4 = r0
        L18:
            r9 = r8 & 8
            if (r9 == 0) goto L1d
            r5 = r0
        L1d:
            r9 = r8 & 16
            if (r9 == 0) goto L27
            bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoLoggingIdentifierDto$Companion r6 = bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoLoggingIdentifierDto.INSTANCE
            bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoLoggingIdentifierDto r6 = r6.getZeroValue()
        L27:
            r8 = r8 & 32
            if (r8 == 0) goto L33
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3a
        L33:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModelDto.<init>(bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoTypeDto, java.util.List, java.lang.String, java.lang.String, bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoLoggingIdentifierDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeneficiaryInfoViewModelDto(BeneficiaryInfoTypeDto type2, List<UIComponentDto> components, String str, String str2, BeneficiaryInfoLoggingIdentifierDto logging_identifier, String str3) {
        this(new Surrogate(type2, components, str, str2, logging_identifier, str3));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BeneficiaryInfoViewModel toProto() {
        BeneficiaryInfoType beneficiaryInfoType = (BeneficiaryInfoType) this.surrogate.getType().toProto();
        List<UIComponentDto> components = this.surrogate.getComponents();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(components, 10));
        Iterator<T> it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIComponentDto) it.next()).toProto());
        }
        return new BeneficiaryInfoViewModel(beneficiaryInfoType, arrayList, this.surrogate.getDone_button_text(), this.surrogate.getAdd_beneficiaries_text(), (BeneficiaryInfoLoggingIdentifier) this.surrogate.getLogging_identifier().toProto(), this.surrogate.getFooter_markdown(), null, 64, null);
    }

    public String toString() {
        return "[BeneficiaryInfoViewModelDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BeneficiaryInfoViewModelDto) && Intrinsics.areEqual(((BeneficiaryInfoViewModelDto) other).surrogate, this.surrogate);
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
    /* compiled from: BeneficiaryInfoViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b2\u0010)\u001a\u0004\b1\u0010\u001eR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b6\u0010)\u001a\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010.\u0012\u0004\b8\u0010)\u001a\u0004\b7\u0010\u001e¨\u0006;"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Surrogate;", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoTypeDto;", "type", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "components", "", "done_button_text", "add_beneficiaries_text", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifierDto;", "logging_identifier", "footer_markdown", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoTypeDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifierDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoTypeDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifierDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoTypeDto;", "getType", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoTypeDto;", "getType$annotations", "()V", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "getComponents$annotations", "Ljava/lang/String;", "getDone_button_text", "getDone_button_text$annotations", "getAdd_beneficiaries_text", "getAdd_beneficiaries_text$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifierDto;", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifierDto;", "getLogging_identifier$annotations", "getFooter_markdown", "getFooter_markdown$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String add_beneficiaries_text;
        private final List<UIComponentDto> components;
        private final String done_button_text;
        private final String footer_markdown;
        private final BeneficiaryInfoLoggingIdentifierDto logging_identifier;
        private final BeneficiaryInfoTypeDto type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoViewModelDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryInfoViewModelDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((BeneficiaryInfoTypeDto) null, (List) null, (String) null, (String) null, (BeneficiaryInfoLoggingIdentifierDto) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.components, surrogate.components) && Intrinsics.areEqual(this.done_button_text, surrogate.done_button_text) && Intrinsics.areEqual(this.add_beneficiaries_text, surrogate.add_beneficiaries_text) && this.logging_identifier == surrogate.logging_identifier && Intrinsics.areEqual(this.footer_markdown, surrogate.footer_markdown);
        }

        public int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + this.components.hashCode()) * 31;
            String str = this.done_button_text;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.add_beneficiaries_text;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.logging_identifier.hashCode()) * 31;
            String str3 = this.footer_markdown;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", components=" + this.components + ", done_button_text=" + this.done_button_text + ", add_beneficiaries_text=" + this.add_beneficiaries_text + ", logging_identifier=" + this.logging_identifier + ", footer_markdown=" + this.footer_markdown + ")";
        }

        /* compiled from: BeneficiaryInfoViewModelDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BeneficiaryInfoViewModelDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BeneficiaryInfoTypeDto beneficiaryInfoTypeDto, List list, String str, String str2, BeneficiaryInfoLoggingIdentifierDto beneficiaryInfoLoggingIdentifierDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? BeneficiaryInfoTypeDto.INSTANCE.getZeroValue() : beneficiaryInfoTypeDto;
            if ((i & 2) == 0) {
                this.components = CollectionsKt.emptyList();
            } else {
                this.components = list;
            }
            if ((i & 4) == 0) {
                this.done_button_text = null;
            } else {
                this.done_button_text = str;
            }
            if ((i & 8) == 0) {
                this.add_beneficiaries_text = null;
            } else {
                this.add_beneficiaries_text = str2;
            }
            if ((i & 16) == 0) {
                this.logging_identifier = BeneficiaryInfoLoggingIdentifierDto.INSTANCE.getZeroValue();
            } else {
                this.logging_identifier = beneficiaryInfoLoggingIdentifierDto;
            }
            if ((i & 32) == 0) {
                this.footer_markdown = null;
            } else {
                this.footer_markdown = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.type != BeneficiaryInfoTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, BeneficiaryInfoTypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.components, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.components);
            }
            String str = self.done_button_text;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            String str2 = self.add_beneficiaries_text;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str2);
            }
            if (self.logging_identifier != BeneficiaryInfoLoggingIdentifierDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, BeneficiaryInfoLoggingIdentifierDto.Serializer.INSTANCE, self.logging_identifier);
            }
            String str3 = self.footer_markdown;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str3);
            }
        }

        public Surrogate(BeneficiaryInfoTypeDto type2, List<UIComponentDto> components, String str, String str2, BeneficiaryInfoLoggingIdentifierDto logging_identifier, String str3) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            this.type = type2;
            this.components = components;
            this.done_button_text = str;
            this.add_beneficiaries_text = str2;
            this.logging_identifier = logging_identifier;
            this.footer_markdown = str3;
        }

        public final BeneficiaryInfoTypeDto getType() {
            return this.type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoTypeDto r2, java.util.List r3, java.lang.String r4, java.lang.String r5, bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoLoggingIdentifierDto r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoTypeDto$Companion r2 = bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoTypeDto.INSTANCE
                bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoTypeDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                if (r9 == 0) goto L12
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            L12:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L18
                r4 = r0
            L18:
                r9 = r8 & 8
                if (r9 == 0) goto L1d
                r5 = r0
            L1d:
                r9 = r8 & 16
                if (r9 == 0) goto L27
                bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoLoggingIdentifierDto$Companion r6 = bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoLoggingIdentifierDto.INSTANCE
                bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoLoggingIdentifierDto r6 = r6.getZeroValue()
            L27:
                r8 = r8 & 32
                if (r8 == 0) goto L33
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3a
            L33:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3a:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModelDto.Surrogate.<init>(bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoTypeDto, java.util.List, java.lang.String, java.lang.String, bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoLoggingIdentifierDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<UIComponentDto> getComponents() {
            return this.components;
        }

        public final String getDone_button_text() {
            return this.done_button_text;
        }

        public final String getAdd_beneficiaries_text() {
            return this.add_beneficiaries_text;
        }

        public final BeneficiaryInfoLoggingIdentifierDto getLogging_identifier() {
            return this.logging_identifier;
        }

        public final String getFooter_markdown() {
            return this.footer_markdown;
        }
    }

    /* compiled from: BeneficiaryInfoViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BeneficiaryInfoViewModelDto, BeneficiaryInfoViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BeneficiaryInfoViewModelDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryInfoViewModelDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryInfoViewModelDto> getBinaryBase64Serializer() {
            return (KSerializer) BeneficiaryInfoViewModelDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BeneficiaryInfoViewModel> getProtoAdapter() {
            return BeneficiaryInfoViewModel.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryInfoViewModelDto getZeroValue() {
            return BeneficiaryInfoViewModelDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryInfoViewModelDto fromProto(BeneficiaryInfoViewModel proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BeneficiaryInfoTypeDto beneficiaryInfoTypeDtoFromProto = BeneficiaryInfoTypeDto.INSTANCE.fromProto(proto.getType());
            List<UIComponent> components = proto.getComponents();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(components, 10));
            Iterator<T> it = components.iterator();
            while (it.hasNext()) {
                arrayList.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it.next()));
            }
            return new BeneficiaryInfoViewModelDto(new Surrogate(beneficiaryInfoTypeDtoFromProto, arrayList, proto.getDone_button_text(), proto.getAdd_beneficiaries_text(), BeneficiaryInfoLoggingIdentifierDto.INSTANCE.fromProto(proto.getLogging_identifier()), proto.getFooter_markdown()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoViewModelDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryInfoViewModelDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new BeneficiaryInfoViewModelDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BeneficiaryInfoViewModelDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BeneficiaryInfoViewModelDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoViewModel", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BeneficiaryInfoViewModelDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BeneficiaryInfoViewModelDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BeneficiaryInfoViewModelDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BeneficiaryInfoViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModelDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoViewModelDto";
        }
    }
}
