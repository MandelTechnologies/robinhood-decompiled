package accounts.onboarding.proto.p006v1;

import accounts.onboarding.proto.p006v1.ManagementStyleRowLearnMoreBulletDto;
import accounts.onboarding.proto.p006v1.ManagementStyleRowLearnMoreSheetDto;
import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: ManagementStyleRowLearnMoreSheetDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bk\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u0018¨\u00067"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "Lcom/robinhood/idl/MessageDto;", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheet;", "Landroid/os/Parcelable;", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Surrogate;", "surrogate", "<init>", "(Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Surrogate;)V", "", "title", "subtitle", "", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreBulletDto;", "bullets", "primary_cta_text", "secondary_cta_text", "markdown_disclosure", "logging_identifier", "primary_cta_identifier", "secondary_cta_identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheet;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Surrogate;", "getTitle", "getSubtitle", "getBullets", "()Ljava/util/List;", "getPrimary_cta_text", "getSecondary_cta_text", "getMarkdown_disclosure", "getLogging_identifier", "getPrimary_cta_identifier", "getSecondary_cta_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ManagementStyleRowLearnMoreSheetDto implements Dto3<ManagementStyleRowLearnMoreSheet>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ManagementStyleRowLearnMoreSheetDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ManagementStyleRowLearnMoreSheetDto, ManagementStyleRowLearnMoreSheet>> binaryBase64Serializer$delegate;
    private static final ManagementStyleRowLearnMoreSheetDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ManagementStyleRowLearnMoreSheetDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ManagementStyleRowLearnMoreSheetDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final List<ManagementStyleRowLearnMoreBulletDto> getBullets() {
        return this.surrogate.getBullets();
    }

    public final String getPrimary_cta_text() {
        return this.surrogate.getPrimary_cta_text();
    }

    public final String getSecondary_cta_text() {
        return this.surrogate.getSecondary_cta_text();
    }

    public final String getMarkdown_disclosure() {
        return this.surrogate.getMarkdown_disclosure();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final String getPrimary_cta_identifier() {
        return this.surrogate.getPrimary_cta_identifier();
    }

    public final String getSecondary_cta_identifier() {
        return this.surrogate.getSecondary_cta_identifier();
    }

    public /* synthetic */ ManagementStyleRowLearnMoreSheetDto(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManagementStyleRowLearnMoreSheetDto(String title, String subtitle, List<ManagementStyleRowLearnMoreBulletDto> bullets, String primary_cta_text, String secondary_cta_text, String str, String logging_identifier, String primary_cta_identifier, String secondary_cta_identifier) {
        this(new Surrogate(title, subtitle, bullets, primary_cta_text, secondary_cta_text, str, logging_identifier, primary_cta_identifier, secondary_cta_identifier));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(secondary_cta_text, "secondary_cta_text");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(primary_cta_identifier, "primary_cta_identifier");
        Intrinsics.checkNotNullParameter(secondary_cta_identifier, "secondary_cta_identifier");
    }

    @Override // com.robinhood.idl.Dto
    public ManagementStyleRowLearnMoreSheet toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        List<ManagementStyleRowLearnMoreBulletDto> bullets = this.surrogate.getBullets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bullets, 10));
        Iterator<T> it = bullets.iterator();
        while (it.hasNext()) {
            arrayList.add(((ManagementStyleRowLearnMoreBulletDto) it.next()).toProto());
        }
        return new ManagementStyleRowLearnMoreSheet(title, subtitle, arrayList, this.surrogate.getPrimary_cta_text(), this.surrogate.getSecondary_cta_text(), this.surrogate.getMarkdown_disclosure(), this.surrogate.getLogging_identifier(), this.surrogate.getPrimary_cta_identifier(), this.surrogate.getSecondary_cta_identifier(), null, 512, null);
    }

    public String toString() {
        return "[ManagementStyleRowLearnMoreSheetDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ManagementStyleRowLearnMoreSheetDto) && Intrinsics.areEqual(((ManagementStyleRowLearnMoreSheetDto) other).surrogate, this.surrogate);
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
    /* compiled from: ManagementStyleRowLearnMoreSheetDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fB{\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u001fR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010)\u001a\u0004\b-\u0010.R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010&\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010\u001fR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010&\u0012\u0004\b7\u0010)\u001a\u0004\b6\u0010\u001fR \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010&\u0012\u0004\b9\u0010)\u001a\u0004\b8\u0010\u001fR \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010&\u0012\u0004\b;\u0010)\u001a\u0004\b:\u0010\u001f¨\u0006>"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Surrogate;", "", "", "title", "subtitle", "", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreBulletDto;", "bullets", "primary_cta_text", "secondary_cta_text", "markdown_disclosure", "logging_identifier", "primary_cta_identifier", "secondary_cta_identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$account_onboarding_proto_v1_externalRelease", "(Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Ljava/util/List;", "getBullets", "()Ljava/util/List;", "getBullets$annotations", "getPrimary_cta_text", "getPrimary_cta_text$annotations", "getSecondary_cta_text", "getSecondary_cta_text$annotations", "getMarkdown_disclosure", "getMarkdown_disclosure$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "getPrimary_cta_identifier", "getPrimary_cta_identifier$annotations", "getSecondary_cta_identifier", "getSecondary_cta_identifier$annotations", "Companion", "$serializer", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<ManagementStyleRowLearnMoreBulletDto> bullets;
        private final String logging_identifier;
        private final String markdown_disclosure;
        private final String primary_cta_identifier;
        private final String primary_cta_text;
        private final String secondary_cta_identifier;
        private final String secondary_cta_text;
        private final String subtitle;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: accounts.onboarding.proto.v1.ManagementStyleRowLearnMoreSheetDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManagementStyleRowLearnMoreSheetDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ManagementStyleRowLearnMoreBulletDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.bullets, surrogate.bullets) && Intrinsics.areEqual(this.primary_cta_text, surrogate.primary_cta_text) && Intrinsics.areEqual(this.secondary_cta_text, surrogate.secondary_cta_text) && Intrinsics.areEqual(this.markdown_disclosure, surrogate.markdown_disclosure) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.primary_cta_identifier, surrogate.primary_cta_identifier) && Intrinsics.areEqual(this.secondary_cta_identifier, surrogate.secondary_cta_identifier);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.bullets.hashCode()) * 31) + this.primary_cta_text.hashCode()) * 31) + this.secondary_cta_text.hashCode()) * 31;
            String str = this.markdown_disclosure;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.logging_identifier.hashCode()) * 31) + this.primary_cta_identifier.hashCode()) * 31) + this.secondary_cta_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", bullets=" + this.bullets + ", primary_cta_text=" + this.primary_cta_text + ", secondary_cta_text=" + this.secondary_cta_text + ", markdown_disclosure=" + this.markdown_disclosure + ", logging_identifier=" + this.logging_identifier + ", primary_cta_identifier=" + this.primary_cta_identifier + ", secondary_cta_identifier=" + this.secondary_cta_identifier + ")";
        }

        /* compiled from: ManagementStyleRowLearnMoreSheetDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Surrogate;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ManagementStyleRowLearnMoreSheetDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.bullets = CollectionsKt.emptyList();
            } else {
                this.bullets = list;
            }
            if ((i & 8) == 0) {
                this.primary_cta_text = "";
            } else {
                this.primary_cta_text = str3;
            }
            if ((i & 16) == 0) {
                this.secondary_cta_text = "";
            } else {
                this.secondary_cta_text = str4;
            }
            if ((i & 32) == 0) {
                this.markdown_disclosure = null;
            } else {
                this.markdown_disclosure = str5;
            }
            if ((i & 64) == 0) {
                this.logging_identifier = "";
            } else {
                this.logging_identifier = str6;
            }
            if ((i & 128) == 0) {
                this.primary_cta_identifier = "";
            } else {
                this.primary_cta_identifier = str7;
            }
            if ((i & 256) == 0) {
                this.secondary_cta_identifier = "";
            } else {
                this.secondary_cta_identifier = str8;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$account_onboarding_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.bullets, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.bullets);
            }
            if (!Intrinsics.areEqual(self.primary_cta_text, "")) {
                output.encodeStringElement(serialDesc, 3, self.primary_cta_text);
            }
            if (!Intrinsics.areEqual(self.secondary_cta_text, "")) {
                output.encodeStringElement(serialDesc, 4, self.secondary_cta_text);
            }
            String str = self.markdown_disclosure;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.logging_identifier, "")) {
                output.encodeStringElement(serialDesc, 6, self.logging_identifier);
            }
            if (!Intrinsics.areEqual(self.primary_cta_identifier, "")) {
                output.encodeStringElement(serialDesc, 7, self.primary_cta_identifier);
            }
            if (Intrinsics.areEqual(self.secondary_cta_identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 8, self.secondary_cta_identifier);
        }

        public Surrogate(String title, String subtitle, List<ManagementStyleRowLearnMoreBulletDto> bullets, String primary_cta_text, String secondary_cta_text, String str, String logging_identifier, String primary_cta_identifier, String secondary_cta_identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
            Intrinsics.checkNotNullParameter(secondary_cta_text, "secondary_cta_text");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            Intrinsics.checkNotNullParameter(primary_cta_identifier, "primary_cta_identifier");
            Intrinsics.checkNotNullParameter(secondary_cta_identifier, "secondary_cta_identifier");
            this.title = title;
            this.subtitle = subtitle;
            this.bullets = bullets;
            this.primary_cta_text = primary_cta_text;
            this.secondary_cta_text = secondary_cta_text;
            this.markdown_disclosure = str;
            this.logging_identifier = logging_identifier;
            this.primary_cta_identifier = primary_cta_identifier;
            this.secondary_cta_identifier = secondary_cta_identifier;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<ManagementStyleRowLearnMoreBulletDto> getBullets() {
            return this.bullets;
        }

        public final String getPrimary_cta_text() {
            return this.primary_cta_text;
        }

        public final String getSecondary_cta_text() {
            return this.secondary_cta_text;
        }

        public final String getMarkdown_disclosure() {
            return this.markdown_disclosure;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final String getPrimary_cta_identifier() {
            return this.primary_cta_identifier;
        }

        public final String getSecondary_cta_identifier() {
            return this.secondary_cta_identifier;
        }
    }

    /* compiled from: ManagementStyleRowLearnMoreSheetDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheet;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ManagementStyleRowLearnMoreSheetDto, ManagementStyleRowLearnMoreSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ManagementStyleRowLearnMoreSheetDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManagementStyleRowLearnMoreSheetDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManagementStyleRowLearnMoreSheetDto> getBinaryBase64Serializer() {
            return (KSerializer) ManagementStyleRowLearnMoreSheetDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ManagementStyleRowLearnMoreSheet> getProtoAdapter() {
            return ManagementStyleRowLearnMoreSheet.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManagementStyleRowLearnMoreSheetDto getZeroValue() {
            return ManagementStyleRowLearnMoreSheetDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManagementStyleRowLearnMoreSheetDto fromProto(ManagementStyleRowLearnMoreSheet proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            List<ManagementStyleRowLearnMoreBullet> bullets = proto.getBullets();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bullets, 10));
            Iterator<T> it = bullets.iterator();
            while (it.hasNext()) {
                arrayList.add(ManagementStyleRowLearnMoreBulletDto.INSTANCE.fromProto((ManagementStyleRowLearnMoreBullet) it.next()));
            }
            return new ManagementStyleRowLearnMoreSheetDto(new Surrogate(title, subtitle, arrayList, proto.getPrimary_cta_text(), proto.getSecondary_cta_text(), proto.getMarkdown_disclosure(), proto.getLogging_identifier(), proto.getPrimary_cta_identifier(), proto.getSecondary_cta_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: accounts.onboarding.proto.v1.ManagementStyleRowLearnMoreSheetDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManagementStyleRowLearnMoreSheetDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ManagementStyleRowLearnMoreSheetDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ManagementStyleRowLearnMoreSheetDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "<init>", "()V", "surrogateSerializer", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<ManagementStyleRowLearnMoreSheetDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/accounts.onboarding.proto.v1.ManagementStyleRowLearnMoreSheet", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ManagementStyleRowLearnMoreSheetDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ManagementStyleRowLearnMoreSheetDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ManagementStyleRowLearnMoreSheetDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ManagementStyleRowLearnMoreSheetDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "accounts.onboarding.proto.v1.ManagementStyleRowLearnMoreSheetDto";
        }
    }
}
