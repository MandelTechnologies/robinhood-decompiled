package identi.service.p471v1.models_workflow.p472v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.UnverifiedAccountContactInformation5;
import identi.service.p471v1.models_workflow.p472v1.UnverifiedAccountContactInformationDto9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: UnverifiedAccountContactInformationDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006)"}, m3636d2 = {"identi/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate;)V", "", "heading", "subheading", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto;", "fields", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate;", "Companion", "Surrogate", "FieldDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto, reason: use source file name */
/* loaded from: classes14.dex */
public final class UnverifiedAccountContactInformationDto9 implements Dto3<UnverifiedAccountContactInformation5>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UnverifiedAccountContactInformationDto9> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UnverifiedAccountContactInformationDto9, UnverifiedAccountContactInformation5>> binaryBase64Serializer$delegate;
    private static final UnverifiedAccountContactInformationDto9 zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UnverifiedAccountContactInformationDto9(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UnverifiedAccountContactInformationDto9(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ UnverifiedAccountContactInformationDto9(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnverifiedAccountContactInformationDto9(String heading, String str, String primary_cta, List<FieldDto> fields) {
        this(new Surrogate(heading, str, primary_cta, fields));
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(fields, "fields");
    }

    @Override // com.robinhood.idl.Dto
    public UnverifiedAccountContactInformation5 toProto() {
        String heading = this.surrogate.getHeading();
        String subheading = this.surrogate.getSubheading();
        String primary_cta = this.surrogate.getPrimary_cta();
        List<FieldDto> fields = this.surrogate.getFields();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fields, 10));
        Iterator<T> it = fields.iterator();
        while (it.hasNext()) {
            arrayList.add(((FieldDto) it.next()).toProto());
        }
        return new UnverifiedAccountContactInformation5(heading, subheading, primary_cta, arrayList, null, 16, null);
    }

    public String toString() {
        return "[ScreenParamsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UnverifiedAccountContactInformationDto9) && Intrinsics.areEqual(((UnverifiedAccountContactInformationDto9) other).surrogate, this.surrogate);
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
    /* compiled from: UnverifiedAccountContactInformationDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u0006/"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate;", "", "", "heading", "subheading", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto;", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeading", "getHeading$annotations", "()V", "getSubheading", "getSubheading$annotations", "getPrimary_cta", "getPrimary_cta$annotations", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getFields$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate, reason: from toString */
    static final /* data */ class Surrogate {
        private final List<FieldDto> fields;
        private final String heading;
        private final String primary_cta;
        private final String subheading;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnverifiedAccountContactInformationDto9.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FieldDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.heading, surrogate.heading) && Intrinsics.areEqual(this.subheading, surrogate.subheading) && Intrinsics.areEqual(this.primary_cta, surrogate.primary_cta) && Intrinsics.areEqual(this.fields, surrogate.fields);
        }

        public int hashCode() {
            int iHashCode = this.heading.hashCode() * 31;
            String str = this.subheading;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.primary_cta.hashCode()) * 31) + this.fields.hashCode();
        }

        public String toString() {
            return "Surrogate(heading=" + this.heading + ", subheading=" + this.subheading + ", primary_cta=" + this.primary_cta + ", fields=" + this.fields + ")";
        }

        /* compiled from: UnverifiedAccountContactInformationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UnverifiedAccountContactInformationDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.heading = "";
            } else {
                this.heading = str;
            }
            if ((i & 2) == 0) {
                this.subheading = null;
            } else {
                this.subheading = str2;
            }
            if ((i & 4) == 0) {
                this.primary_cta = "";
            } else {
                this.primary_cta = str3;
            }
            if ((i & 8) == 0) {
                this.fields = CollectionsKt.emptyList();
            } else {
                this.fields = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.heading, "")) {
                output.encodeStringElement(serialDesc, 0, self.heading);
            }
            String str = self.subheading;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.primary_cta, "")) {
                output.encodeStringElement(serialDesc, 2, self.primary_cta);
            }
            if (Intrinsics.areEqual(self.fields, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.fields);
        }

        public Surrogate(String heading, String str, String primary_cta, List<FieldDto> fields) {
            Intrinsics.checkNotNullParameter(heading, "heading");
            Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.heading = heading;
            this.subheading = str;
            this.primary_cta = primary_cta;
            this.fields = fields;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getHeading() {
            return this.heading;
        }

        public final String getSubheading() {
            return this.subheading;
        }

        public final String getPrimary_cta() {
            return this.primary_cta;
        }

        public final List<FieldDto> getFields() {
            return this.fields;
        }
    }

    /* compiled from: UnverifiedAccountContactInformationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto3.Creator<UnverifiedAccountContactInformationDto9, UnverifiedAccountContactInformation5> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UnverifiedAccountContactInformationDto9> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UnverifiedAccountContactInformationDto9> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UnverifiedAccountContactInformationDto9> getBinaryBase64Serializer() {
            return (KSerializer) UnverifiedAccountContactInformationDto9.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UnverifiedAccountContactInformation5> getProtoAdapter() {
            return UnverifiedAccountContactInformation5.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UnverifiedAccountContactInformationDto9 getZeroValue() {
            return UnverifiedAccountContactInformationDto9.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UnverifiedAccountContactInformationDto9 fromProto(UnverifiedAccountContactInformation5 proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String heading = proto.getHeading();
            String subheading = proto.getSubheading();
            String primary_cta = proto.getPrimary_cta();
            List<UnverifiedAccountContactInformation5.Field> fields = proto.getFields();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fields, 10));
            Iterator<T> it = fields.iterator();
            while (it.hasNext()) {
                arrayList.add(FieldDto.INSTANCE.fromProto((UnverifiedAccountContactInformation5.Field) it.next()));
            }
            return new UnverifiedAccountContactInformationDto9(new Surrogate(heading, subheading, primary_cta, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnverifiedAccountContactInformationDto9.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new UnverifiedAccountContactInformationDto9(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UnverifiedAccountContactInformationDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006)"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "type", "", "name", "placeholder", "id", "", "is_optional", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto */
    public static final class FieldDto implements Dto3<UnverifiedAccountContactInformation5.Field>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<FieldDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FieldDto, UnverifiedAccountContactInformation5.Field>> binaryBase64Serializer$delegate;
        private static final FieldDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ FieldDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private FieldDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ FieldDto(TypeDto typeDto, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public FieldDto(TypeDto type2, String name, String str, String id, boolean z) {
            this(new Surrogate(type2, name, str, id, z));
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(id, "id");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public UnverifiedAccountContactInformation5.Field toProto() {
            return new UnverifiedAccountContactInformation5.Field((UnverifiedAccountContactInformation5.Field.Type) this.surrogate.getType().toProto(), this.surrogate.getName(), this.surrogate.getPlaceholder(), this.surrogate.getId(), this.surrogate.getIs_optional(), null, 32, null);
        }

        public String toString() {
            return "[FieldDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof FieldDto) && Intrinsics.areEqual(((FieldDto) other).surrogate, this.surrogate);
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
        /* compiled from: UnverifiedAccountContactInformationDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u001bR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b/\u0010%\u001a\u0004\b\t\u0010.¨\u00062"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "type", "", "name", "placeholder", "id", "", "is_optional", "<init>", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "getType", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "getType$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "getPlaceholder", "getPlaceholder$annotations", "getId", "getId$annotations", "Z", "()Z", "is_optional$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate, reason: from toString */
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String id;
            private final boolean is_optional;
            private final String name;
            private final String placeholder;
            private final TypeDto type;

            public Surrogate() {
                this((TypeDto) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.type == surrogate.type && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.placeholder, surrogate.placeholder) && Intrinsics.areEqual(this.id, surrogate.id) && this.is_optional == surrogate.is_optional;
            }

            public int hashCode() {
                int iHashCode = ((this.type.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.placeholder;
                return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.is_optional);
            }

            public String toString() {
                return "Surrogate(type=" + this.type + ", name=" + this.name + ", placeholder=" + this.placeholder + ", id=" + this.id + ", is_optional=" + this.is_optional + ")";
            }

            /* compiled from: UnverifiedAccountContactInformationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate$Companion, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return UnverifiedAccountContactInformationDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, TypeDto typeDto, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                this.type = (i & 1) == 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto;
                if ((i & 2) == 0) {
                    this.name = "";
                } else {
                    this.name = str;
                }
                if ((i & 4) == 0) {
                    this.placeholder = null;
                } else {
                    this.placeholder = str2;
                }
                if ((i & 8) == 0) {
                    this.id = "";
                } else {
                    this.id = str3;
                }
                if ((i & 16) == 0) {
                    this.is_optional = false;
                } else {
                    this.is_optional = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.type != TypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, TypeDto.Serializer.INSTANCE, self.type);
                }
                if (!Intrinsics.areEqual(self.name, "")) {
                    output.encodeStringElement(serialDesc, 1, self.name);
                }
                String str = self.placeholder;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
                }
                if (!Intrinsics.areEqual(self.id, "")) {
                    output.encodeStringElement(serialDesc, 3, self.id);
                }
                boolean z = self.is_optional;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 4, z);
                }
            }

            public Surrogate(TypeDto type2, String name, String str, String id, boolean z) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(id, "id");
                this.type = type2;
                this.name = name;
                this.placeholder = str;
                this.id = id;
                this.is_optional = z;
            }

            public final TypeDto getType() {
                return this.type;
            }

            public /* synthetic */ Surrogate(TypeDto typeDto, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z);
            }

            public final String getName() {
                return this.name;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getId() {
                return this.id;
            }

            /* renamed from: is_optional, reason: from getter */
            public final boolean getIs_optional() {
                return this.is_optional;
            }
        }

        /* compiled from: UnverifiedAccountContactInformationDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto3.Creator<FieldDto, UnverifiedAccountContactInformation5.Field> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FieldDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FieldDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FieldDto> getBinaryBase64Serializer() {
                return (KSerializer) FieldDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<UnverifiedAccountContactInformation5.Field> getProtoAdapter() {
                return UnverifiedAccountContactInformation5.Field.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FieldDto getZeroValue() {
                return FieldDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FieldDto fromProto(UnverifiedAccountContactInformation5.Field proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new FieldDto(new Surrogate(TypeDto.INSTANCE.fromProto(proto.getType()), proto.getName(), proto.getPlaceholder(), proto.getId(), proto.getIs_optional()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnverifiedAccountContactInformationDto9.FieldDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new FieldDto(null, null, null, null, false, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UnverifiedAccountContactInformationDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "PLAIN_TEXT", "PHONE_NUMBER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto */
        public static final class TypeDto implements Dto2<UnverifiedAccountContactInformation5.Field.Type>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<TypeDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TypeDto, UnverifiedAccountContactInformation5.Field.Type>> binaryBase64Serializer$delegate;
            public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
            public static final TypeDto PLAIN_TEXT = new PLAIN_TEXT("PLAIN_TEXT", 1);
            public static final TypeDto PHONE_NUMBER = new PHONE_NUMBER("PHONE_NUMBER", 2);

            private static final /* synthetic */ TypeDto[] $values() {
                return new TypeDto[]{TYPE_UNSPECIFIED, PLAIN_TEXT, PHONE_NUMBER};
            }

            public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<TypeDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TypeDto(String str, int i) {
            }

            /* compiled from: UnverifiedAccountContactInformationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto.ScreenParamsDto.FieldDto.TypeDto.TYPE_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$TYPE_UNSPECIFIED */
            static final class TYPE_UNSPECIFIED extends TypeDto {
                TYPE_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public UnverifiedAccountContactInformation5.Field.Type toProto() {
                    return UnverifiedAccountContactInformation5.Field.Type.TYPE_UNSPECIFIED;
                }
            }

            static {
                TypeDto[] typeDtoArr$values = $values();
                $VALUES = typeDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnverifiedAccountContactInformationDto9.FieldDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: UnverifiedAccountContactInformationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto.ScreenParamsDto.FieldDto.TypeDto.PLAIN_TEXT", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$PLAIN_TEXT */
            static final class PLAIN_TEXT extends TypeDto {
                PLAIN_TEXT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public UnverifiedAccountContactInformation5.Field.Type toProto() {
                    return UnverifiedAccountContactInformation5.Field.Type.PLAIN_TEXT;
                }
            }

            /* compiled from: UnverifiedAccountContactInformationDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto.ScreenParamsDto.FieldDto.TypeDto.PHONE_NUMBER", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$PHONE_NUMBER */
            static final class PHONE_NUMBER extends TypeDto {
                PHONE_NUMBER(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public UnverifiedAccountContactInformation5.Field.Type toProto() {
                    return UnverifiedAccountContactInformation5.Field.Type.PHONE_NUMBER;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: UnverifiedAccountContactInformationDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$Companion, reason: from kotlin metadata */
            public static final class Companion implements Dto2.Creator<TypeDto, UnverifiedAccountContactInformation5.Field.Type> {

                /* compiled from: UnverifiedAccountContactInformationDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$Companion$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[UnverifiedAccountContactInformation5.Field.Type.values().length];
                        try {
                            iArr[UnverifiedAccountContactInformation5.Field.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UnverifiedAccountContactInformation5.Field.Type.PLAIN_TEXT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[UnverifiedAccountContactInformation5.Field.Type.PHONE_NUMBER.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TypeDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TypeDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TypeDto> getBinaryBase64Serializer() {
                    return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<UnverifiedAccountContactInformation5.Field.Type> getProtoAdapter() {
                    return UnverifiedAccountContactInformation5.Field.Type.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto getZeroValue() {
                    return TypeDto.TYPE_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(UnverifiedAccountContactInformation5.Field.Type proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return TypeDto.TYPE_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return TypeDto.PLAIN_TEXT;
                    }
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return TypeDto.PHONE_NUMBER;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: UnverifiedAccountContactInformationDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$TypeDto$Serializer */
            public static final class Serializer implements KSerializer<TypeDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<TypeDto, UnverifiedAccountContactInformation5.Field.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation.ScreenParams.Field.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public TypeDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (TypeDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TypeDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }
        }

        /* compiled from: UnverifiedAccountContactInformationDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$Serializer */
        public static final class Serializer implements KSerializer<FieldDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation.ScreenParams.Field", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FieldDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public FieldDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new FieldDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: UnverifiedAccountContactInformationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto$MultibindingModule */
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$FieldDto";
            }
        }
    }

    /* compiled from: UnverifiedAccountContactInformationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$Serializer */
    public static final class Serializer implements KSerializer<UnverifiedAccountContactInformationDto9> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation.ScreenParams", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UnverifiedAccountContactInformationDto9 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UnverifiedAccountContactInformationDto9 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UnverifiedAccountContactInformationDto9((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UnverifiedAccountContactInformationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto$MultibindingModule */
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformationDto$ScreenParamsDto";
        }
    }
}
