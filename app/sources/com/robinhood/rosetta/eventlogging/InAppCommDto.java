package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: InAppCommDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppCommDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/InAppComm;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/InAppCommDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/InAppCommDto$Surrogate;)V", "receipt_unique_identifier", "", "title", "text", "location", "load_id", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "can_passively_dismiss", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getReceipt_unique_identifier", "()Ljava/lang/String;", "getTitle", "getText", "getLocation", "getLoad_id", "getDisclosure", "getCan_passively_dismiss", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class InAppCommDto implements Dto3<InAppComm>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InAppCommDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InAppCommDto, InAppComm>> binaryBase64Serializer$delegate;
    private static final InAppCommDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InAppCommDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InAppCommDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getReceipt_unique_identifier() {
        return this.surrogate.getReceipt_unique_identifier();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getText() {
        return this.surrogate.getText();
    }

    public final String getLocation() {
        return this.surrogate.getLocation();
    }

    public final String getLoad_id() {
        return this.surrogate.getLoad_id();
    }

    public final String getDisclosure() {
        return this.surrogate.getDisclosure();
    }

    public final BooleanDto getCan_passively_dismiss() {
        return this.surrogate.getCan_passively_dismiss();
    }

    public /* synthetic */ InAppCommDto(String str, String str2, String str3, String str4, String str5, String str6, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppCommDto(String receipt_unique_identifier, String title, String text, String location, String load_id, String disclosure, BooleanDto can_passively_dismiss) {
        this(new Surrogate(receipt_unique_identifier, title, text, location, load_id, disclosure, can_passively_dismiss));
        Intrinsics.checkNotNullParameter(receipt_unique_identifier, "receipt_unique_identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(can_passively_dismiss, "can_passively_dismiss");
    }

    public static /* synthetic */ InAppCommDto copy$default(InAppCommDto inAppCommDto, String str, String str2, String str3, String str4, String str5, String str6, BooleanDto booleanDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppCommDto.surrogate.getReceipt_unique_identifier();
        }
        if ((i & 2) != 0) {
            str2 = inAppCommDto.surrogate.getTitle();
        }
        if ((i & 4) != 0) {
            str3 = inAppCommDto.surrogate.getText();
        }
        if ((i & 8) != 0) {
            str4 = inAppCommDto.surrogate.getLocation();
        }
        if ((i & 16) != 0) {
            str5 = inAppCommDto.surrogate.getLoad_id();
        }
        if ((i & 32) != 0) {
            str6 = inAppCommDto.surrogate.getDisclosure();
        }
        if ((i & 64) != 0) {
            booleanDto = inAppCommDto.surrogate.getCan_passively_dismiss();
        }
        String str7 = str6;
        BooleanDto booleanDto2 = booleanDto;
        String str8 = str5;
        String str9 = str3;
        return inAppCommDto.copy(str, str2, str9, str4, str8, str7, booleanDto2);
    }

    public final InAppCommDto copy(String receipt_unique_identifier, String title, String text, String location, String load_id, String disclosure, BooleanDto can_passively_dismiss) {
        Intrinsics.checkNotNullParameter(receipt_unique_identifier, "receipt_unique_identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(can_passively_dismiss, "can_passively_dismiss");
        return new InAppCommDto(new Surrogate(receipt_unique_identifier, title, text, location, load_id, disclosure, can_passively_dismiss));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InAppComm toProto() {
        return new InAppComm(this.surrogate.getReceipt_unique_identifier(), this.surrogate.getTitle(), this.surrogate.getText(), this.surrogate.getLocation(), this.surrogate.getLoad_id(), this.surrogate.getDisclosure(), (Boolean) this.surrogate.getCan_passively_dismiss().toProto(), null, 128, null);
    }

    public String toString() {
        return "[InAppCommDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InAppCommDto) && Intrinsics.areEqual(((InAppCommDto) other).surrogate, this.surrogate);
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
    /* compiled from: InAppCommDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003JO\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppCommDto$Surrogate;", "", "receipt_unique_identifier", "", "title", "text", "location", "load_id", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "can_passively_dismiss", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReceipt_unique_identifier$annotations", "()V", "getReceipt_unique_identifier", "()Ljava/lang/String;", "getTitle$annotations", "getTitle", "getText$annotations", "getText", "getLocation$annotations", "getLocation", "getLoad_id$annotations", "getLoad_id", "getDisclosure$annotations", "getDisclosure", "getCan_passively_dismiss$annotations", "getCan_passively_dismiss", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BooleanDto can_passively_dismiss;
        private final String disclosure;
        private final String load_id;
        private final String location;
        private final String receipt_unique_identifier;
        private final String text;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BooleanDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, BooleanDto booleanDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.receipt_unique_identifier;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.title;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.text;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.location;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.load_id;
            }
            if ((i & 32) != 0) {
                str6 = surrogate.disclosure;
            }
            if ((i & 64) != 0) {
                booleanDto = surrogate.can_passively_dismiss;
            }
            String str7 = str6;
            BooleanDto booleanDto2 = booleanDto;
            String str8 = str5;
            String str9 = str3;
            return surrogate.copy(str, str2, str9, str4, str8, str7, booleanDto2);
        }

        @SerialName("canPassivelyDismiss")
        @JsonAnnotations2(names = {"can_passively_dismiss"})
        public static /* synthetic */ void getCan_passively_dismiss$annotations() {
        }

        @SerialName(OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE)
        @JsonAnnotations2(names = {OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE})
        public static /* synthetic */ void getDisclosure$annotations() {
        }

        @SerialName("loadId")
        @JsonAnnotations2(names = {"load_id"})
        public static /* synthetic */ void getLoad_id$annotations() {
        }

        @SerialName("location")
        @JsonAnnotations2(names = {"location"})
        public static /* synthetic */ void getLocation$annotations() {
        }

        @SerialName("receiptUniqueIdentifier")
        @JsonAnnotations2(names = {"receipt_unique_identifier"})
        public static /* synthetic */ void getReceipt_unique_identifier$annotations() {
        }

        @SerialName("text")
        @JsonAnnotations2(names = {"text"})
        public static /* synthetic */ void getText$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getReceipt_unique_identifier() {
            return this.receipt_unique_identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLoad_id() {
            return this.load_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component7, reason: from getter */
        public final BooleanDto getCan_passively_dismiss() {
            return this.can_passively_dismiss;
        }

        public final Surrogate copy(String receipt_unique_identifier, String title, String text, String location, String load_id, String disclosure, BooleanDto can_passively_dismiss) {
            Intrinsics.checkNotNullParameter(receipt_unique_identifier, "receipt_unique_identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(load_id, "load_id");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(can_passively_dismiss, "can_passively_dismiss");
            return new Surrogate(receipt_unique_identifier, title, text, location, load_id, disclosure, can_passively_dismiss);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.receipt_unique_identifier, surrogate.receipt_unique_identifier) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.text, surrogate.text) && Intrinsics.areEqual(this.location, surrogate.location) && Intrinsics.areEqual(this.load_id, surrogate.load_id) && Intrinsics.areEqual(this.disclosure, surrogate.disclosure) && this.can_passively_dismiss == surrogate.can_passively_dismiss;
        }

        public int hashCode() {
            return (((((((((((this.receipt_unique_identifier.hashCode() * 31) + this.title.hashCode()) * 31) + this.text.hashCode()) * 31) + this.location.hashCode()) * 31) + this.load_id.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.can_passively_dismiss.hashCode();
        }

        public String toString() {
            return "Surrogate(receipt_unique_identifier=" + this.receipt_unique_identifier + ", title=" + this.title + ", text=" + this.text + ", location=" + this.location + ", load_id=" + this.load_id + ", disclosure=" + this.disclosure + ", can_passively_dismiss=" + this.can_passively_dismiss + ")";
        }

        /* compiled from: InAppCommDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppCommDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InAppCommDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InAppCommDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, BooleanDto booleanDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.receipt_unique_identifier = "";
            } else {
                this.receipt_unique_identifier = str;
            }
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 4) == 0) {
                this.text = "";
            } else {
                this.text = str3;
            }
            if ((i & 8) == 0) {
                this.location = "";
            } else {
                this.location = str4;
            }
            if ((i & 16) == 0) {
                this.load_id = "";
            } else {
                this.load_id = str5;
            }
            if ((i & 32) == 0) {
                this.disclosure = "";
            } else {
                this.disclosure = str6;
            }
            if ((i & 64) == 0) {
                this.can_passively_dismiss = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.can_passively_dismiss = booleanDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.receipt_unique_identifier, "")) {
                output.encodeStringElement(serialDesc, 0, self.receipt_unique_identifier);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.text, "")) {
                output.encodeStringElement(serialDesc, 2, self.text);
            }
            if (!Intrinsics.areEqual(self.location, "")) {
                output.encodeStringElement(serialDesc, 3, self.location);
            }
            if (!Intrinsics.areEqual(self.load_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.load_id);
            }
            if (!Intrinsics.areEqual(self.disclosure, "")) {
                output.encodeStringElement(serialDesc, 5, self.disclosure);
            }
            if (self.can_passively_dismiss != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, BooleanDto.Serializer.INSTANCE, self.can_passively_dismiss);
            }
        }

        public Surrogate(String receipt_unique_identifier, String title, String text, String location, String load_id, String disclosure, BooleanDto can_passively_dismiss) {
            Intrinsics.checkNotNullParameter(receipt_unique_identifier, "receipt_unique_identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(load_id, "load_id");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(can_passively_dismiss, "can_passively_dismiss");
            this.receipt_unique_identifier = receipt_unique_identifier;
            this.title = title;
            this.text = text;
            this.location = location;
            this.load_id = load_id;
            this.disclosure = disclosure;
            this.can_passively_dismiss = can_passively_dismiss;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
        }

        public final String getReceipt_unique_identifier() {
            return this.receipt_unique_identifier;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getText() {
            return this.text;
        }

        public final String getLocation() {
            return this.location;
        }

        public final String getLoad_id() {
            return this.load_id;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final BooleanDto getCan_passively_dismiss() {
            return this.can_passively_dismiss;
        }
    }

    /* compiled from: InAppCommDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppCommDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InAppCommDto;", "Lcom/robinhood/rosetta/eventlogging/InAppComm;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InAppCommDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<InAppCommDto, InAppComm> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InAppCommDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InAppCommDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InAppCommDto> getBinaryBase64Serializer() {
            return (KSerializer) InAppCommDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InAppComm> getProtoAdapter() {
            return InAppComm.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InAppCommDto getZeroValue() {
            return InAppCommDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InAppCommDto fromProto(InAppComm proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new InAppCommDto(new Surrogate(proto.getReceipt_unique_identifier(), proto.getTitle(), proto.getText(), proto.getLocation(), proto.getLoad_id(), proto.getDisclosure(), BooleanDto.INSTANCE.fromProto(proto.getCan_passively_dismiss())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InAppCommDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InAppCommDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InAppCommDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InAppCommDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppCommDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InAppCommDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/InAppCommDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<InAppCommDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.InAppComm", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InAppCommDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InAppCommDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InAppCommDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InAppCommDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InAppCommDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.InAppCommDto";
        }
    }
}
