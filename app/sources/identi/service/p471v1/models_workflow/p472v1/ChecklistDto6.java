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
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import identi.service.p471v1.models_workflow.p472v1.Checklist7;
import identi.service.p471v1.models_workflow.p472v1.ChecklistDto6;
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

/* compiled from: ChecklistDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000532456B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0018¨\u00067"}, m3636d2 = {"identi/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Surrogate;)V", "", "header_title", "", "markdown_items", Footer.f10637type, WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "", "primary_cta_enable_delay_seconds", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "secondary_cta_callback", "secondary_cta_deeplink", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Surrogate;", "getHeader_title", "getMarkdown_items", "()Ljava/util/List;", "getFooter", "getPrimary_cta", "getPrimary_cta_enable_delay_seconds", "getSecondary_cta", "getSecondary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "getSecondary_cta_deeplink", "Companion", "Surrogate", "CallbackDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto, reason: use source file name */
/* loaded from: classes14.dex */
public final class ChecklistDto6 implements Dto3<Checklist7>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChecklistDto6> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChecklistDto6, Checklist7>> binaryBase64Serializer$delegate;
    private static final ChecklistDto6 zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChecklistDto6(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChecklistDto6(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getHeader_title() {
        return this.surrogate.getHeader_title();
    }

    public final List<String> getMarkdown_items() {
        return this.surrogate.getMarkdown_items();
    }

    public final String getFooter() {
        return this.surrogate.getFooter();
    }

    public final String getPrimary_cta() {
        return this.surrogate.getPrimary_cta();
    }

    public final int getPrimary_cta_enable_delay_seconds() {
        return this.surrogate.getPrimary_cta_enable_delay_seconds();
    }

    public final String getSecondary_cta() {
        return this.surrogate.getSecondary_cta();
    }

    public final CallbackDto getSecondary_cta_callback() {
        return this.surrogate.getSecondary_cta_callback();
    }

    public final String getSecondary_cta_deeplink() {
        return this.surrogate.getSecondary_cta_deeplink();
    }

    public /* synthetic */ ChecklistDto6(String str, List list, String str2, String str3, int i, String str4, CallbackDto callbackDto, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? CallbackDto.INSTANCE.getZeroValue() : callbackDto, (i2 & 128) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChecklistDto6(String header_title, List<String> markdown_items, String footer, String primary_cta, int i, String secondary_cta, CallbackDto secondary_cta_callback, String str) {
        this(new Surrogate(header_title, markdown_items, footer, primary_cta, i, secondary_cta, secondary_cta_callback, str));
        Intrinsics.checkNotNullParameter(header_title, "header_title");
        Intrinsics.checkNotNullParameter(markdown_items, "markdown_items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(secondary_cta, "secondary_cta");
        Intrinsics.checkNotNullParameter(secondary_cta_callback, "secondary_cta_callback");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Checklist7 toProto() {
        String header_title = this.surrogate.getHeader_title();
        List<String> markdown_items = this.surrogate.getMarkdown_items();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(markdown_items, 10));
        Iterator<T> it = markdown_items.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new Checklist7(header_title, arrayList, this.surrogate.getFooter(), this.surrogate.getPrimary_cta(), this.surrogate.getPrimary_cta_enable_delay_seconds(), this.surrogate.getSecondary_cta(), (Checklist7.Callback) this.surrogate.getSecondary_cta_callback().toProto(), this.surrogate.getSecondary_cta_deeplink(), null, 256, null);
    }

    public String toString() {
        return "[ScreenParamsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChecklistDto6) && Intrinsics.areEqual(((ChecklistDto6) other).surrogate, this.surrogate);
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
    /* compiled from: ChecklistDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bn\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012Bo\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010!R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010!R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010!R/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b6\u0010+\u001a\u0004\b5\u0010#R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010(\u0012\u0004\b8\u0010+\u001a\u0004\b7\u0010!R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b<\u0010+\u001a\u0004\b:\u0010;R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010(\u0012\u0004\b>\u0010+\u001a\u0004\b=\u0010!¨\u0006A"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Surrogate;", "", "", "header_title", "", "markdown_items", Footer.f10637type, WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "primary_cta_enable_delay_seconds", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "secondary_cta_callback", "secondary_cta_deeplink", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader_title", "getHeader_title$annotations", "()V", "Ljava/util/List;", "getMarkdown_items", "()Ljava/util/List;", "getMarkdown_items$annotations", "getFooter", "getFooter$annotations", "getPrimary_cta", "getPrimary_cta$annotations", "I", "getPrimary_cta_enable_delay_seconds", "getPrimary_cta_enable_delay_seconds$annotations", "getSecondary_cta", "getSecondary_cta$annotations", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "getSecondary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "getSecondary_cta_callback$annotations", "getSecondary_cta_deeplink", "getSecondary_cta_deeplink$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$Surrogate, reason: from toString */
    static final /* data */ class Surrogate {
        private final String footer;
        private final String header_title;
        private final List<String> markdown_items;
        private final String primary_cta;
        private final int primary_cta_enable_delay_seconds;
        private final String secondary_cta;
        private final CallbackDto secondary_cta_callback;
        private final String secondary_cta_deeplink;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChecklistDto6.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (String) null, (String) null, 0, (String) null, (CallbackDto) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.header_title, surrogate.header_title) && Intrinsics.areEqual(this.markdown_items, surrogate.markdown_items) && Intrinsics.areEqual(this.footer, surrogate.footer) && Intrinsics.areEqual(this.primary_cta, surrogate.primary_cta) && this.primary_cta_enable_delay_seconds == surrogate.primary_cta_enable_delay_seconds && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta) && this.secondary_cta_callback == surrogate.secondary_cta_callback && Intrinsics.areEqual(this.secondary_cta_deeplink, surrogate.secondary_cta_deeplink);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.header_title.hashCode() * 31) + this.markdown_items.hashCode()) * 31) + this.footer.hashCode()) * 31) + this.primary_cta.hashCode()) * 31) + Integer.hashCode(this.primary_cta_enable_delay_seconds)) * 31) + this.secondary_cta.hashCode()) * 31) + this.secondary_cta_callback.hashCode()) * 31;
            String str = this.secondary_cta_deeplink;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Surrogate(header_title=" + this.header_title + ", markdown_items=" + this.markdown_items + ", footer=" + this.footer + ", primary_cta=" + this.primary_cta + ", primary_cta_enable_delay_seconds=" + this.primary_cta_enable_delay_seconds + ", secondary_cta=" + this.secondary_cta + ", secondary_cta_callback=" + this.secondary_cta_callback + ", secondary_cta_deeplink=" + this.secondary_cta_deeplink + ")";
        }

        /* compiled from: ChecklistDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$Surrogate$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChecklistDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, String str2, String str3, int i2, String str4, CallbackDto callbackDto, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.header_title = "";
            } else {
                this.header_title = str;
            }
            if ((i & 2) == 0) {
                this.markdown_items = CollectionsKt.emptyList();
            } else {
                this.markdown_items = list;
            }
            if ((i & 4) == 0) {
                this.footer = "";
            } else {
                this.footer = str2;
            }
            if ((i & 8) == 0) {
                this.primary_cta = "";
            } else {
                this.primary_cta = str3;
            }
            if ((i & 16) == 0) {
                this.primary_cta_enable_delay_seconds = 0;
            } else {
                this.primary_cta_enable_delay_seconds = i2;
            }
            if ((i & 32) == 0) {
                this.secondary_cta = "";
            } else {
                this.secondary_cta = str4;
            }
            if ((i & 64) == 0) {
                this.secondary_cta_callback = CallbackDto.INSTANCE.getZeroValue();
            } else {
                this.secondary_cta_callback = callbackDto;
            }
            if ((i & 128) == 0) {
                this.secondary_cta_deeplink = null;
            } else {
                this.secondary_cta_deeplink = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.header_title, "")) {
                output.encodeStringElement(serialDesc, 0, self.header_title);
            }
            if (!Intrinsics.areEqual(self.markdown_items, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.markdown_items);
            }
            if (!Intrinsics.areEqual(self.footer, "")) {
                output.encodeStringElement(serialDesc, 2, self.footer);
            }
            if (!Intrinsics.areEqual(self.primary_cta, "")) {
                output.encodeStringElement(serialDesc, 3, self.primary_cta);
            }
            int i = self.primary_cta_enable_delay_seconds;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.secondary_cta, "")) {
                output.encodeStringElement(serialDesc, 5, self.secondary_cta);
            }
            if (self.secondary_cta_callback != CallbackDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, CallbackDto.Serializer.INSTANCE, self.secondary_cta_callback);
            }
            String str = self.secondary_cta_deeplink;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String header_title, List<String> markdown_items, String footer, String primary_cta, int i, String secondary_cta, CallbackDto secondary_cta_callback, String str) {
            Intrinsics.checkNotNullParameter(header_title, "header_title");
            Intrinsics.checkNotNullParameter(markdown_items, "markdown_items");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
            Intrinsics.checkNotNullParameter(secondary_cta, "secondary_cta");
            Intrinsics.checkNotNullParameter(secondary_cta_callback, "secondary_cta_callback");
            this.header_title = header_title;
            this.markdown_items = markdown_items;
            this.footer = footer;
            this.primary_cta = primary_cta;
            this.primary_cta_enable_delay_seconds = i;
            this.secondary_cta = secondary_cta;
            this.secondary_cta_callback = secondary_cta_callback;
            this.secondary_cta_deeplink = str;
        }

        public /* synthetic */ Surrogate(String str, List list, String str2, String str3, int i, String str4, CallbackDto callbackDto, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? CallbackDto.INSTANCE.getZeroValue() : callbackDto, (i2 & 128) != 0 ? null : str5);
        }

        public final String getHeader_title() {
            return this.header_title;
        }

        public final List<String> getMarkdown_items() {
            return this.markdown_items;
        }

        public final String getFooter() {
            return this.footer;
        }

        public final String getPrimary_cta() {
            return this.primary_cta;
        }

        public final int getPrimary_cta_enable_delay_seconds() {
            return this.primary_cta_enable_delay_seconds;
        }

        public final String getSecondary_cta() {
            return this.secondary_cta;
        }

        public final CallbackDto getSecondary_cta_callback() {
            return this.secondary_cta_callback;
        }

        public final String getSecondary_cta_deeplink() {
            return this.secondary_cta_deeplink;
        }
    }

    /* compiled from: ChecklistDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto3.Creator<ChecklistDto6, Checklist7> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChecklistDto6> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChecklistDto6> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChecklistDto6> getBinaryBase64Serializer() {
            return (KSerializer) ChecklistDto6.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Checklist7> getProtoAdapter() {
            return Checklist7.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChecklistDto6 getZeroValue() {
            return ChecklistDto6.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChecklistDto6 fromProto(Checklist7 proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String header_title = proto.getHeader_title();
            List<String> markdown_items = proto.getMarkdown_items();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(markdown_items, 10));
            Iterator<T> it = markdown_items.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new ChecklistDto6(new Surrogate(header_title, arrayList, proto.getFooter(), proto.getPrimary_cta(), proto.getPrimary_cta_enable_delay_seconds(), proto.getSecondary_cta(), CallbackDto.INSTANCE.fromProto(proto.getSecondary_cta_callback()), proto.getSecondary_cta_deeplink()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChecklistDto6.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ChecklistDto6(null, null, null, null, 0, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChecklistDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CALLBACK_UNSPECIFIED", "EXIT", "ACTION", "DEEPLINK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto */
    public static final class CallbackDto implements Dto2<Checklist7.Callback>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallbackDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CallbackDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CallbackDto, Checklist7.Callback>> binaryBase64Serializer$delegate;
        public static final CallbackDto CALLBACK_UNSPECIFIED = new CALLBACK_UNSPECIFIED("CALLBACK_UNSPECIFIED", 0);
        public static final CallbackDto EXIT = new EXIT("EXIT", 1);
        public static final CallbackDto ACTION = new ACTION("ACTION", 2);
        public static final CallbackDto DEEPLINK = new DEEPLINK("DEEPLINK", 3);

        private static final /* synthetic */ CallbackDto[] $values() {
            return new CallbackDto[]{CALLBACK_UNSPECIFIED, EXIT, ACTION, DEEPLINK};
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

        /* compiled from: ChecklistDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/ChecklistDto.ScreenParamsDto.CallbackDto.CALLBACK_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto$CALLBACK_UNSPECIFIED */
        static final class CALLBACK_UNSPECIFIED extends CallbackDto {
            CALLBACK_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Checklist7.Callback toProto() {
                return Checklist7.Callback.CALLBACK_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChecklistDto6.CallbackDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ChecklistDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/ChecklistDto.ScreenParamsDto.CallbackDto.EXIT", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto$EXIT */
        static final class EXIT extends CallbackDto {
            EXIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Checklist7.Callback toProto() {
                return Checklist7.Callback.EXIT;
            }
        }

        /* compiled from: ChecklistDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/ChecklistDto.ScreenParamsDto.CallbackDto.ACTION", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto$ACTION */
        static final class ACTION extends CallbackDto {
            ACTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Checklist7.Callback toProto() {
                return Checklist7.Callback.ACTION;
            }
        }

        /* compiled from: ChecklistDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/ChecklistDto.ScreenParamsDto.CallbackDto.DEEPLINK", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto$DEEPLINK */
        static final class DEEPLINK extends CallbackDto {
            DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Checklist7.Callback toProto() {
                return Checklist7.Callback.DEEPLINK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ChecklistDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto2.Creator<CallbackDto, Checklist7.Callback> {

            /* compiled from: ChecklistDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto$Companion$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Checklist7.Callback.values().length];
                    try {
                        iArr[Checklist7.Callback.CALLBACK_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Checklist7.Callback.EXIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Checklist7.Callback.ACTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Checklist7.Callback.DEEPLINK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
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
            public ProtoAdapter<Checklist7.Callback> getProtoAdapter() {
                return Checklist7.Callback.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CallbackDto getZeroValue() {
                return CallbackDto.CALLBACK_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CallbackDto fromProto(Checklist7.Callback proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CallbackDto.CALLBACK_UNSPECIFIED;
                }
                if (i == 2) {
                    return CallbackDto.EXIT;
                }
                if (i == 3) {
                    return CallbackDto.ACTION;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return CallbackDto.DEEPLINK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChecklistDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$CallbackDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$CallbackDto$Serializer */
        public static final class Serializer implements KSerializer<CallbackDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CallbackDto, Checklist7.Callback> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.Checklist.ScreenParams.Callback", CallbackDto.getEntries(), CallbackDto.INSTANCE.getZeroValue());

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

    /* compiled from: ChecklistDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$Serializer */
    public static final class Serializer implements KSerializer<ChecklistDto6> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.Checklist.ScreenParams", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChecklistDto6 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChecklistDto6 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChecklistDto6((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChecklistDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto$MultibindingModule */
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.ChecklistDto$ScreenParamsDto";
        }
    }
}
