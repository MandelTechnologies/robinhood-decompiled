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
import identi.service.p471v1.models_workflow.p472v1.GKba$ScreenParams;
import identi.service.p471v1.models_workflow.p472v1.GKbaDto9;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GKbaDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006324567B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00068"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Surrogate;)V", "", "heading", "subheading", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "secondary_cta_callback", "close_button_callback", "", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto;", "fields", "", "requires_recaptcha", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;Ljava/util/List;Ljava/lang/Boolean;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Surrogate;", "getHeading", "getSubheading", "getPrimary_cta", "getSecondary_cta", "getSecondary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "getClose_button_callback", "getFields", "()Ljava/util/List;", "Companion", "Surrogate", "FieldDto", "CallbackDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto, reason: use source file name */
/* loaded from: classes14.dex */
public final class GKbaDto9 implements Dto3<GKba$ScreenParams>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GKbaDto9> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GKbaDto9, GKba$ScreenParams>> binaryBase64Serializer$delegate;
    private static final GKbaDto9 zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GKbaDto9(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GKbaDto9(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getHeading() {
        return this.surrogate.getHeading();
    }

    public final String getSubheading() {
        return this.surrogate.getSubheading();
    }

    public final String getPrimary_cta() {
        return this.surrogate.getPrimary_cta();
    }

    public final String getSecondary_cta() {
        return this.surrogate.getSecondary_cta();
    }

    public final CallbackDto getSecondary_cta_callback() {
        return this.surrogate.getSecondary_cta_callback();
    }

    public final CallbackDto getClose_button_callback() {
        return this.surrogate.getClose_button_callback();
    }

    public final List<FieldDto> getFields() {
        return this.surrogate.getFields();
    }

    public /* synthetic */ GKbaDto9(String str, String str2, String str3, String str4, CallbackDto callbackDto, CallbackDto callbackDto2, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : callbackDto, (i & 32) != 0 ? null : callbackDto2, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GKbaDto9(String heading, String subheading, String primary_cta, String str, CallbackDto callbackDto, CallbackDto callbackDto2, List<FieldDto> fields, Boolean bool) {
        this(new Surrogate(heading, subheading, primary_cta, str, callbackDto, callbackDto2, fields, bool));
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(fields, "fields");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GKba$ScreenParams toProto() {
        String heading = this.surrogate.getHeading();
        String subheading = this.surrogate.getSubheading();
        String primary_cta = this.surrogate.getPrimary_cta();
        String secondary_cta = this.surrogate.getSecondary_cta();
        CallbackDto secondary_cta_callback = this.surrogate.getSecondary_cta_callback();
        GKba$ScreenParams.Callback callback = secondary_cta_callback != null ? (GKba$ScreenParams.Callback) secondary_cta_callback.toProto() : null;
        CallbackDto close_button_callback = this.surrogate.getClose_button_callback();
        GKba$ScreenParams.Callback callback2 = close_button_callback != null ? (GKba$ScreenParams.Callback) close_button_callback.toProto() : null;
        List<FieldDto> fields = this.surrogate.getFields();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fields, 10));
        Iterator<T> it = fields.iterator();
        while (it.hasNext()) {
            arrayList.add(((FieldDto) it.next()).toProto());
        }
        return new GKba$ScreenParams(heading, subheading, primary_cta, secondary_cta, callback, callback2, arrayList, this.surrogate.getRequires_recaptcha(), null, 256, null);
    }

    public String toString() {
        return "[ScreenParamsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GKbaDto9) && Intrinsics.areEqual(((GKbaDto9) other).surrogate, this.surrogate);
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
    /* compiled from: GKbaDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002?>Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010 R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b5\u0010)\u001a\u0004\b4\u00102R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b=\u0010)\u001a\u0004\b;\u0010<¨\u0006@"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Surrogate;", "", "", "heading", "subheading", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "secondary_cta_callback", "close_button_callback", "", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto;", "fields", "", "requires_recaptcha", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;Ljava/util/List;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeading", "getHeading$annotations", "()V", "getSubheading", "getSubheading$annotations", "getPrimary_cta", "getPrimary_cta$annotations", "getSecondary_cta", "getSecondary_cta$annotations", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "getSecondary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "getSecondary_cta_callback$annotations", "getClose_button_callback", "getClose_button_callback$annotations", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getFields$annotations", "Ljava/lang/Boolean;", "getRequires_recaptcha", "()Ljava/lang/Boolean;", "getRequires_recaptcha$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$Surrogate, reason: from toString */
    static final /* data */ class Surrogate {
        private final CallbackDto close_button_callback;
        private final List<FieldDto> fields;
        private final String heading;
        private final String primary_cta;
        private final Boolean requires_recaptcha;
        private final String secondary_cta;
        private final CallbackDto secondary_cta_callback;
        private final String subheading;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GKbaDto9.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (CallbackDto) null, (CallbackDto) null, (List) null, (Boolean) null, 255, (DefaultConstructorMarker) null);
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
            return Intrinsics.areEqual(this.heading, surrogate.heading) && Intrinsics.areEqual(this.subheading, surrogate.subheading) && Intrinsics.areEqual(this.primary_cta, surrogate.primary_cta) && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta) && this.secondary_cta_callback == surrogate.secondary_cta_callback && this.close_button_callback == surrogate.close_button_callback && Intrinsics.areEqual(this.fields, surrogate.fields) && Intrinsics.areEqual(this.requires_recaptcha, surrogate.requires_recaptcha);
        }

        public int hashCode() {
            int iHashCode = ((((this.heading.hashCode() * 31) + this.subheading.hashCode()) * 31) + this.primary_cta.hashCode()) * 31;
            String str = this.secondary_cta;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            CallbackDto callbackDto = this.secondary_cta_callback;
            int iHashCode3 = (iHashCode2 + (callbackDto == null ? 0 : callbackDto.hashCode())) * 31;
            CallbackDto callbackDto2 = this.close_button_callback;
            int iHashCode4 = (((iHashCode3 + (callbackDto2 == null ? 0 : callbackDto2.hashCode())) * 31) + this.fields.hashCode()) * 31;
            Boolean bool = this.requires_recaptcha;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(heading=" + this.heading + ", subheading=" + this.subheading + ", primary_cta=" + this.primary_cta + ", secondary_cta=" + this.secondary_cta + ", secondary_cta_callback=" + this.secondary_cta_callback + ", close_button_callback=" + this.close_button_callback + ", fields=" + this.fields + ", requires_recaptcha=" + this.requires_recaptcha + ")";
        }

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$Surrogate$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GKbaDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, CallbackDto callbackDto, CallbackDto callbackDto2, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.heading = "";
            } else {
                this.heading = str;
            }
            if ((i & 2) == 0) {
                this.subheading = "";
            } else {
                this.subheading = str2;
            }
            if ((i & 4) == 0) {
                this.primary_cta = "";
            } else {
                this.primary_cta = str3;
            }
            if ((i & 8) == 0) {
                this.secondary_cta = null;
            } else {
                this.secondary_cta = str4;
            }
            if ((i & 16) == 0) {
                this.secondary_cta_callback = null;
            } else {
                this.secondary_cta_callback = callbackDto;
            }
            if ((i & 32) == 0) {
                this.close_button_callback = null;
            } else {
                this.close_button_callback = callbackDto2;
            }
            if ((i & 64) == 0) {
                this.fields = CollectionsKt.emptyList();
            } else {
                this.fields = list;
            }
            if ((i & 128) == 0) {
                this.requires_recaptcha = null;
            } else {
                this.requires_recaptcha = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.heading, "")) {
                output.encodeStringElement(serialDesc, 0, self.heading);
            }
            if (!Intrinsics.areEqual(self.subheading, "")) {
                output.encodeStringElement(serialDesc, 1, self.subheading);
            }
            if (!Intrinsics.areEqual(self.primary_cta, "")) {
                output.encodeStringElement(serialDesc, 2, self.primary_cta);
            }
            String str = self.secondary_cta;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            CallbackDto callbackDto = self.secondary_cta_callback;
            if (callbackDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CallbackDto.Serializer.INSTANCE, callbackDto);
            }
            CallbackDto callbackDto2 = self.close_button_callback;
            if (callbackDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, CallbackDto.Serializer.INSTANCE, callbackDto2);
            }
            if (!Intrinsics.areEqual(self.fields, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.fields);
            }
            Boolean bool = self.requires_recaptcha;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(String heading, String subheading, String primary_cta, String str, CallbackDto callbackDto, CallbackDto callbackDto2, List<FieldDto> fields, Boolean bool) {
            Intrinsics.checkNotNullParameter(heading, "heading");
            Intrinsics.checkNotNullParameter(subheading, "subheading");
            Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.heading = heading;
            this.subheading = subheading;
            this.primary_cta = primary_cta;
            this.secondary_cta = str;
            this.secondary_cta_callback = callbackDto;
            this.close_button_callback = callbackDto2;
            this.fields = fields;
            this.requires_recaptcha = bool;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, CallbackDto callbackDto, CallbackDto callbackDto2, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : callbackDto, (i & 32) != 0 ? null : callbackDto2, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : bool);
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

        public final String getSecondary_cta() {
            return this.secondary_cta;
        }

        public final CallbackDto getSecondary_cta_callback() {
            return this.secondary_cta_callback;
        }

        public final CallbackDto getClose_button_callback() {
            return this.close_button_callback;
        }

        public final List<FieldDto> getFields() {
            return this.fields;
        }

        public final Boolean getRequires_recaptcha() {
            return this.requires_recaptcha;
        }
    }

    /* compiled from: GKbaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto3.Creator<GKbaDto9, GKba$ScreenParams> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GKbaDto9> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GKbaDto9> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GKbaDto9> getBinaryBase64Serializer() {
            return (KSerializer) GKbaDto9.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GKba$ScreenParams> getProtoAdapter() {
            return GKba$ScreenParams.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GKbaDto9 getZeroValue() {
            return GKbaDto9.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GKbaDto9 fromProto(GKba$ScreenParams proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String heading = proto.getHeading();
            String subheading = proto.getSubheading();
            String primary_cta = proto.getPrimary_cta();
            String secondary_cta = proto.getSecondary_cta();
            GKba$ScreenParams.Callback secondary_cta_callback = proto.getSecondary_cta_callback();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CallbackDto callbackDtoFromProto = secondary_cta_callback != null ? CallbackDto.INSTANCE.fromProto(secondary_cta_callback) : null;
            GKba$ScreenParams.Callback close_button_callback = proto.getClose_button_callback();
            CallbackDto callbackDtoFromProto2 = close_button_callback != null ? CallbackDto.INSTANCE.fromProto(close_button_callback) : null;
            List<GKba$ScreenParams.Field> fields = proto.getFields();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fields, 10));
            Iterator<T> it = fields.iterator();
            while (it.hasNext()) {
                arrayList.add(FieldDto.INSTANCE.fromProto((GKba$ScreenParams.Field) it.next()));
            }
            return new GKbaDto9(new Surrogate(heading, subheading, primary_cta, secondary_cta, callbackDtoFromProto, callbackDtoFromProto2, arrayList, proto.getRequires_recaptcha()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GKbaDto9.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GKbaDto9(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GKbaDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005*)+,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014¨\u0006."}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "type", "", "name", "placeholder", "id", "", "is_optional", "(Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Surrogate;", "getType", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "getName", "getPlaceholder", "getId", "Companion", "Surrogate", "TypeDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto */
    public static final class FieldDto implements Dto3<GKba$ScreenParams.Field>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<FieldDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FieldDto, GKba$ScreenParams.Field>> binaryBase64Serializer$delegate;
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

        public final TypeDto getType() {
            return this.surrogate.getType();
        }

        public final String getName() {
            return this.surrogate.getName();
        }

        public final String getPlaceholder() {
            return this.surrogate.getPlaceholder();
        }

        public final String getId() {
            return this.surrogate.getId();
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
        public GKba$ScreenParams.Field toProto() {
            return new GKba$ScreenParams.Field((GKba$ScreenParams.Field.Type) this.surrogate.getType().toProto(), this.surrogate.getName(), this.surrogate.getPlaceholder(), this.surrogate.getId(), this.surrogate.getIs_optional(), null, 32, null);
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
        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u001bR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b/\u0010%\u001a\u0004\b\t\u0010.¨\u00062"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "type", "", "name", "placeholder", "id", "", "is_optional", "<init>", "(Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "getType", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "getType$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "getPlaceholder", "getPlaceholder$annotations", "getId", "getId$annotations", "Z", "()Z", "is_optional$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$Surrogate, reason: from toString */
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

            /* compiled from: GKbaDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$Surrogate$Companion, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GKbaDto4.INSTANCE;
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

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto3.Creator<FieldDto, GKba$ScreenParams.Field> {
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
            public ProtoAdapter<GKba$ScreenParams.Field> getProtoAdapter() {
                return GKba$ScreenParams.Field.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FieldDto getZeroValue() {
                return FieldDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FieldDto fromProto(GKba$ScreenParams.Field proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new FieldDto(new Surrogate(TypeDto.INSTANCE.fromProto(proto.getType()), proto.getName(), proto.getPlaceholder(), proto.getId(), proto.getIs_optional()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GKbaDto9.FieldDto.binaryBase64Serializer_delegate$lambda$0();
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
        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "PLAIN_TEXT", "DATE", "SSN", "PHONE_NUMBER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto */
        public static final class TypeDto implements Dto2<GKba$ScreenParams.Field.Type>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<TypeDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TypeDto, GKba$ScreenParams.Field.Type>> binaryBase64Serializer$delegate;
            public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
            public static final TypeDto PLAIN_TEXT = new PLAIN_TEXT("PLAIN_TEXT", 1);
            public static final TypeDto DATE = new DATE("DATE", 2);
            public static final TypeDto SSN = new SSN("SSN", 3);
            public static final TypeDto PHONE_NUMBER = new PHONE_NUMBER("PHONE_NUMBER", 4);

            private static final /* synthetic */ TypeDto[] $values() {
                return new TypeDto[]{TYPE_UNSPECIFIED, PLAIN_TEXT, DATE, SSN, PHONE_NUMBER};
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

            /* compiled from: GKbaDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto.ScreenParamsDto.FieldDto.TypeDto.TYPE_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$TYPE_UNSPECIFIED */
            static final class TYPE_UNSPECIFIED extends TypeDto {
                TYPE_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public GKba$ScreenParams.Field.Type toProto() {
                    return GKba$ScreenParams.Field.Type.TYPE_UNSPECIFIED;
                }
            }

            private TypeDto(String str, int i) {
            }

            static {
                TypeDto[] typeDtoArr$values = $values();
                $VALUES = typeDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GKbaDto9.FieldDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: GKbaDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto.ScreenParamsDto.FieldDto.TypeDto.PLAIN_TEXT", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$PLAIN_TEXT */
            static final class PLAIN_TEXT extends TypeDto {
                PLAIN_TEXT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public GKba$ScreenParams.Field.Type toProto() {
                    return GKba$ScreenParams.Field.Type.PLAIN_TEXT;
                }
            }

            /* compiled from: GKbaDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto.ScreenParamsDto.FieldDto.TypeDto.DATE", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$DATE */
            static final class DATE extends TypeDto {
                DATE(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public GKba$ScreenParams.Field.Type toProto() {
                    return GKba$ScreenParams.Field.Type.DATE;
                }
            }

            /* compiled from: GKbaDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto.ScreenParamsDto.FieldDto.TypeDto.SSN", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$SSN */
            static final class SSN extends TypeDto {
                SSN(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public GKba$ScreenParams.Field.Type toProto() {
                    return GKba$ScreenParams.Field.Type.SSN;
                }
            }

            /* compiled from: GKbaDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto.ScreenParamsDto.FieldDto.TypeDto.PHONE_NUMBER", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$PHONE_NUMBER */
            static final class PHONE_NUMBER extends TypeDto {
                PHONE_NUMBER(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public GKba$ScreenParams.Field.Type toProto() {
                    return GKba$ScreenParams.Field.Type.PHONE_NUMBER;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: GKbaDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$Companion, reason: from kotlin metadata */
            public static final class Companion implements Dto2.Creator<TypeDto, GKba$ScreenParams.Field.Type> {

                /* compiled from: GKbaDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$Companion$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[GKba$ScreenParams.Field.Type.values().length];
                        try {
                            iArr[GKba$ScreenParams.Field.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[GKba$ScreenParams.Field.Type.PLAIN_TEXT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[GKba$ScreenParams.Field.Type.DATE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[GKba$ScreenParams.Field.Type.SSN.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[GKba$ScreenParams.Field.Type.PHONE_NUMBER.ordinal()] = 5;
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
                public ProtoAdapter<GKba$ScreenParams.Field.Type> getProtoAdapter() {
                    return GKba$ScreenParams.Field.Type.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto getZeroValue() {
                    return TypeDto.TYPE_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(GKba$ScreenParams.Field.Type proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return TypeDto.TYPE_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return TypeDto.PLAIN_TEXT;
                    }
                    if (i == 3) {
                        return TypeDto.DATE;
                    }
                    if (i == 4) {
                        return TypeDto.SSN;
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return TypeDto.PHONE_NUMBER;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: GKbaDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$TypeDto$Serializer */
            public static final class Serializer implements KSerializer<TypeDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<TypeDto, GKba$ScreenParams.Field.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.GKba.ScreenParams.Field.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

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

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$Serializer */
        public static final class Serializer implements KSerializer<FieldDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.GKba.ScreenParams.Field", kSerializerSerializer.getDescriptor());
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

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$FieldDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto$MultibindingModule */
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$FieldDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GKbaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CALLBACK_UNSPECIFIED", "EXIT", "ACTION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$CallbackDto */
    public static final class CallbackDto implements Dto2<GKba$ScreenParams.Callback>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallbackDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CallbackDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CallbackDto, GKba$ScreenParams.Callback>> binaryBase64Serializer$delegate;
        public static final CallbackDto CALLBACK_UNSPECIFIED = new CALLBACK_UNSPECIFIED("CALLBACK_UNSPECIFIED", 0);
        public static final CallbackDto EXIT = new EXIT("EXIT", 1);
        public static final CallbackDto ACTION = new ACTION("ACTION", 2);

        private static final /* synthetic */ CallbackDto[] $values() {
            return new CallbackDto[]{CALLBACK_UNSPECIFIED, EXIT, ACTION};
        }

        public /* synthetic */ CallbackDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CallbackDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto.ScreenParamsDto.CallbackDto.CALLBACK_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$CallbackDto$CALLBACK_UNSPECIFIED */
        static final class CALLBACK_UNSPECIFIED extends CallbackDto {
            CALLBACK_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GKba$ScreenParams.Callback toProto() {
                return GKba$ScreenParams.Callback.CALLBACK_UNSPECIFIED;
            }
        }

        private CallbackDto(String str, int i) {
        }

        static {
            CallbackDto[] callbackDtoArr$values = $values();
            $VALUES = callbackDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(callbackDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$CallbackDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GKbaDto9.CallbackDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto.ScreenParamsDto.CallbackDto.EXIT", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$CallbackDto$EXIT */
        static final class EXIT extends CallbackDto {
            EXIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GKba$ScreenParams.Callback toProto() {
                return GKba$ScreenParams.Callback.EXIT;
            }
        }

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKbaDto.ScreenParamsDto.CallbackDto.ACTION", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$CallbackDto$ACTION */
        static final class ACTION extends CallbackDto {
            ACTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GKba$ScreenParams.Callback toProto() {
                return GKba$ScreenParams.Callback.ACTION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$CallbackDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto2.Creator<CallbackDto, GKba$ScreenParams.Callback> {

            /* compiled from: GKbaDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$CallbackDto$Companion$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GKba$ScreenParams.Callback.values().length];
                    try {
                        iArr[GKba$ScreenParams.Callback.CALLBACK_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GKba$ScreenParams.Callback.EXIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GKba$ScreenParams.Callback.ACTION.ordinal()] = 3;
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

            public final KSerializer<CallbackDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CallbackDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CallbackDto> getBinaryBase64Serializer() {
                return (KSerializer) CallbackDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GKba$ScreenParams.Callback> getProtoAdapter() {
                return GKba$ScreenParams.Callback.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CallbackDto getZeroValue() {
                return CallbackDto.CALLBACK_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CallbackDto fromProto(GKba$ScreenParams.Callback proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CallbackDto.CALLBACK_UNSPECIFIED;
                }
                if (i == 2) {
                    return CallbackDto.EXIT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return CallbackDto.ACTION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GKbaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$CallbackDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$CallbackDto$Serializer */
        public static final class Serializer implements KSerializer<CallbackDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CallbackDto, GKba$ScreenParams.Callback> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.GKba.ScreenParams.Callback", CallbackDto.getEntries(), CallbackDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CallbackDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CallbackDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CallbackDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CallbackDto valueOf(String str) {
            return (CallbackDto) Enum.valueOf(CallbackDto.class, str);
        }

        public static CallbackDto[] values() {
            return (CallbackDto[]) $VALUES.clone();
        }
    }

    /* compiled from: GKbaDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$Serializer */
    public static final class Serializer implements KSerializer<GKbaDto9> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.GKba.ScreenParams", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GKbaDto9 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GKbaDto9 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GKbaDto9((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GKbaDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto$MultibindingModule */
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.GKbaDto$ScreenParamsDto";
        }
    }
}
