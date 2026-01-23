package advisory.proto.p008v1;

import advisory.proto.p008v1.RemoteIconDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AdvisoryInsightContentViewModelDashboardHighlightDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlight;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Surrogate;)V", "", "icon", "title_markdown", "deeplink", "logging_identifier", "top_line_text", "Ladvisory/proto/v1/RemoteIconDto;", "remote_icon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/RemoteIconDto;)V", "toProto", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlight;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Surrogate;", "getIcon", "getTitle_markdown", "getDeeplink", "getLogging_identifier", "getTop_line_text", "getRemote_icon", "()Ladvisory/proto/v1/RemoteIconDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class AdvisoryInsightContentViewModelDashboardHighlightDto implements Dto3<AdvisoryInsightContentViewModelDashboardHighlight>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryInsightContentViewModelDashboardHighlightDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryInsightContentViewModelDashboardHighlightDto, AdvisoryInsightContentViewModelDashboardHighlight>> binaryBase64Serializer$delegate;
    private static final AdvisoryInsightContentViewModelDashboardHighlightDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryInsightContentViewModelDashboardHighlightDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryInsightContentViewModelDashboardHighlightDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getIcon() {
        return this.surrogate.getIcon();
    }

    public final String getTitle_markdown() {
        return this.surrogate.getTitle_markdown();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final String getTop_line_text() {
        return this.surrogate.getTop_line_text();
    }

    public final RemoteIconDto getRemote_icon() {
        return this.surrogate.getRemote_icon();
    }

    public /* synthetic */ AdvisoryInsightContentViewModelDashboardHighlightDto(String str, String str2, String str3, String str4, String str5, RemoteIconDto remoteIconDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : remoteIconDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightContentViewModelDashboardHighlightDto(String icon, String title_markdown, String deeplink, String logging_identifier, String str, RemoteIconDto remoteIconDto) {
        this(new Surrogate(icon, title_markdown, deeplink, logging_identifier, str, remoteIconDto));
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
    }

    @Override // com.robinhood.idl.Dto
    public AdvisoryInsightContentViewModelDashboardHighlight toProto() {
        String icon = this.surrogate.getIcon();
        String title_markdown = this.surrogate.getTitle_markdown();
        String deeplink = this.surrogate.getDeeplink();
        String logging_identifier = this.surrogate.getLogging_identifier();
        String top_line_text = this.surrogate.getTop_line_text();
        RemoteIconDto remote_icon = this.surrogate.getRemote_icon();
        return new AdvisoryInsightContentViewModelDashboardHighlight(icon, title_markdown, deeplink, logging_identifier, top_line_text, remote_icon != null ? remote_icon.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[AdvisoryInsightContentViewModelDashboardHighlightDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryInsightContentViewModelDashboardHighlightDto) && Intrinsics.areEqual(((AdvisoryInsightContentViewModelDashboardHighlightDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisoryInsightContentViewModelDashboardHighlightDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Surrogate;", "", "", "icon", "title_markdown", "deeplink", "logging_identifier", "top_line_text", "Ladvisory/proto/v1/RemoteIconDto;", "remote_icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/RemoteIconDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/RemoteIconDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getIcon$annotations", "()V", "getTitle_markdown", "getTitle_markdown$annotations", "getDeeplink", "getDeeplink$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "getTop_line_text", "getTop_line_text$annotations", "Ladvisory/proto/v1/RemoteIconDto;", "getRemote_icon", "()Ladvisory/proto/v1/RemoteIconDto;", "getRemote_icon$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String deeplink;
        private final String icon;
        private final String logging_identifier;
        private final RemoteIconDto remote_icon;
        private final String title_markdown;
        private final String top_line_text;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (RemoteIconDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.icon, surrogate.icon) && Intrinsics.areEqual(this.title_markdown, surrogate.title_markdown) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.top_line_text, surrogate.top_line_text) && Intrinsics.areEqual(this.remote_icon, surrogate.remote_icon);
        }

        public int hashCode() {
            int iHashCode = ((((((this.icon.hashCode() * 31) + this.title_markdown.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.logging_identifier.hashCode()) * 31;
            String str = this.top_line_text;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            RemoteIconDto remoteIconDto = this.remote_icon;
            return iHashCode2 + (remoteIconDto != null ? remoteIconDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(icon=" + this.icon + ", title_markdown=" + this.title_markdown + ", deeplink=" + this.deeplink + ", logging_identifier=" + this.logging_identifier + ", top_line_text=" + this.top_line_text + ", remote_icon=" + this.remote_icon + ")";
        }

        /* compiled from: AdvisoryInsightContentViewModelDashboardHighlightDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryInsightContentViewModelDashboardHighlightDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, RemoteIconDto remoteIconDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            if ((i & 2) == 0) {
                this.title_markdown = "";
            } else {
                this.title_markdown = str2;
            }
            if ((i & 4) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str3;
            }
            if ((i & 8) == 0) {
                this.logging_identifier = "";
            } else {
                this.logging_identifier = str4;
            }
            if ((i & 16) == 0) {
                this.top_line_text = null;
            } else {
                this.top_line_text = str5;
            }
            if ((i & 32) == 0) {
                this.remote_icon = null;
            } else {
                this.remote_icon = remoteIconDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.icon, "")) {
                output.encodeStringElement(serialDesc, 0, self.icon);
            }
            if (!Intrinsics.areEqual(self.title_markdown, "")) {
                output.encodeStringElement(serialDesc, 1, self.title_markdown);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 2, self.deeplink);
            }
            if (!Intrinsics.areEqual(self.logging_identifier, "")) {
                output.encodeStringElement(serialDesc, 3, self.logging_identifier);
            }
            String str = self.top_line_text;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            RemoteIconDto remoteIconDto = self.remote_icon;
            if (remoteIconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, RemoteIconDto.Serializer.INSTANCE, remoteIconDto);
            }
        }

        public Surrogate(String icon, String title_markdown, String deeplink, String logging_identifier, String str, RemoteIconDto remoteIconDto) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            this.icon = icon;
            this.title_markdown = title_markdown;
            this.deeplink = deeplink;
            this.logging_identifier = logging_identifier;
            this.top_line_text = str;
            this.remote_icon = remoteIconDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, RemoteIconDto remoteIconDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : remoteIconDto);
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getTitle_markdown() {
            return this.title_markdown;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final String getTop_line_text() {
            return this.top_line_text;
        }

        public final RemoteIconDto getRemote_icon() {
            return this.remote_icon;
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelDashboardHighlightDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlight;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisoryInsightContentViewModelDashboardHighlightDto, AdvisoryInsightContentViewModelDashboardHighlight> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryInsightContentViewModelDashboardHighlightDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightContentViewModelDashboardHighlightDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightContentViewModelDashboardHighlightDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryInsightContentViewModelDashboardHighlightDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryInsightContentViewModelDashboardHighlight> getProtoAdapter() {
            return AdvisoryInsightContentViewModelDashboardHighlight.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightContentViewModelDashboardHighlightDto getZeroValue() {
            return AdvisoryInsightContentViewModelDashboardHighlightDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightContentViewModelDashboardHighlightDto fromProto(AdvisoryInsightContentViewModelDashboardHighlight proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String icon = proto.getIcon();
            String title_markdown = proto.getTitle_markdown();
            String deeplink = proto.getDeeplink();
            String logging_identifier = proto.getLogging_identifier();
            String top_line_text = proto.getTop_line_text();
            RemoteIcon remote_icon = proto.getRemote_icon();
            return new AdvisoryInsightContentViewModelDashboardHighlightDto(new Surrogate(icon, title_markdown, deeplink, logging_identifier, top_line_text, remote_icon != null ? RemoteIconDto.INSTANCE.fromProto(remote_icon) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelDashboardHighlightDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryInsightContentViewModelDashboardHighlightDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisoryInsightContentViewModelDashboardHighlightDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryInsightContentViewModelDashboardHighlightDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<AdvisoryInsightContentViewModelDashboardHighlightDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.AdvisoryInsightContentViewModelDashboardHighlight", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryInsightContentViewModelDashboardHighlightDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryInsightContentViewModelDashboardHighlightDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryInsightContentViewModelDashboardHighlightDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelDashboardHighlightDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "advisory.proto.v1.AdvisoryInsightContentViewModelDashboardHighlightDto";
        }
    }
}
