package advisory.proto.p008v1;

import advisory.proto.p008v1.AdvisoryInsightContentViewModelAssetDto;
import advisory.proto.p008v1.AdvisoryInsightContentViewModelAudioDto;
import advisory.proto.p008v1.AdvisoryInsightContentViewModelDashboardHighlightDto;
import advisory.proto.p008v1.AdvisoryInsightContentViewModelDto;
import advisory.proto.p008v1.AdvisoryInsightContentViewModelPostContentCtaDto;
import advisory.proto.p008v1.AdvisoryInsightCtaDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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

/* compiled from: AdvisoryInsightContentViewModelDto.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004A@BCB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00138F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b?\u0010\u001e¨\u0006D"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModel;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Surrogate;)V", "", "content_markdown", "contentful_id", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "dashboard_highlight", "disclosure_markdown", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "audio", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "asset", "icon", "", "content_markdown_lines", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCtaDto;", "post_content_cta", "Ladvisory/proto/v1/AdvisoryInsightCtaDto;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "top_line_text", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;Ljava/lang/String;Ljava/util/List;Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCtaDto;Ladvisory/proto/v1/AdvisoryInsightCtaDto;Ljava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModel;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Surrogate;", "getContent_markdown", "getContentful_id", "getDashboard_highlight", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "getDisclosure_markdown", "getAudio", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "getAsset", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "getIcon", "getContent_markdown_lines", "()Ljava/util/List;", "getPost_content_cta", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCtaDto;", "getPrimary_cta", "()Ladvisory/proto/v1/AdvisoryInsightCtaDto;", "getTop_line_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AdvisoryInsightContentViewModelDto implements Dto3<AdvisoryInsightContentViewModel>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryInsightContentViewModelDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryInsightContentViewModelDto, AdvisoryInsightContentViewModel>> binaryBase64Serializer$delegate;
    private static final AdvisoryInsightContentViewModelDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryInsightContentViewModelDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryInsightContentViewModelDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContent_markdown() {
        return this.surrogate.getContent_markdown();
    }

    public final String getContentful_id() {
        return this.surrogate.getContentful_id();
    }

    public final AdvisoryInsightContentViewModelDashboardHighlightDto getDashboard_highlight() {
        return this.surrogate.getDashboard_highlight();
    }

    public final String getDisclosure_markdown() {
        return this.surrogate.getDisclosure_markdown();
    }

    public final AdvisoryInsightContentViewModelAudioDto getAudio() {
        return this.surrogate.getAudio();
    }

    public final AdvisoryInsightContentViewModelAssetDto getAsset() {
        return this.surrogate.getAsset();
    }

    public final String getIcon() {
        return this.surrogate.getIcon();
    }

    public final List<String> getContent_markdown_lines() {
        return this.surrogate.getContent_markdown_lines();
    }

    public final AdvisoryInsightContentViewModelPostContentCtaDto getPost_content_cta() {
        return this.surrogate.getPost_content_cta();
    }

    public final AdvisoryInsightCtaDto getPrimary_cta() {
        return this.surrogate.getPrimary_cta();
    }

    public final String getTop_line_text() {
        return this.surrogate.getTop_line_text();
    }

    public /* synthetic */ AdvisoryInsightContentViewModelDto(String str, String str2, AdvisoryInsightContentViewModelDashboardHighlightDto advisoryInsightContentViewModelDashboardHighlightDto, String str3, AdvisoryInsightContentViewModelAudioDto advisoryInsightContentViewModelAudioDto, AdvisoryInsightContentViewModelAssetDto advisoryInsightContentViewModelAssetDto, String str4, List list, AdvisoryInsightContentViewModelPostContentCtaDto advisoryInsightContentViewModelPostContentCtaDto, AdvisoryInsightCtaDto advisoryInsightCtaDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : advisoryInsightContentViewModelDashboardHighlightDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : advisoryInsightContentViewModelAudioDto, (i & 32) != 0 ? null : advisoryInsightContentViewModelAssetDto, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : advisoryInsightContentViewModelPostContentCtaDto, (i & 512) != 0 ? null : advisoryInsightCtaDto, (i & 1024) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightContentViewModelDto(String content_markdown, String contentful_id, AdvisoryInsightContentViewModelDashboardHighlightDto advisoryInsightContentViewModelDashboardHighlightDto, String str, AdvisoryInsightContentViewModelAudioDto advisoryInsightContentViewModelAudioDto, AdvisoryInsightContentViewModelAssetDto advisoryInsightContentViewModelAssetDto, String icon, List<String> content_markdown_lines, AdvisoryInsightContentViewModelPostContentCtaDto advisoryInsightContentViewModelPostContentCtaDto, AdvisoryInsightCtaDto advisoryInsightCtaDto, String str2) {
        this(new Surrogate(content_markdown, contentful_id, advisoryInsightContentViewModelDashboardHighlightDto, str, advisoryInsightContentViewModelAudioDto, advisoryInsightContentViewModelAssetDto, icon, content_markdown_lines, advisoryInsightContentViewModelPostContentCtaDto, advisoryInsightCtaDto, str2));
        Intrinsics.checkNotNullParameter(content_markdown, "content_markdown");
        Intrinsics.checkNotNullParameter(contentful_id, "contentful_id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(content_markdown_lines, "content_markdown_lines");
    }

    @Override // com.robinhood.idl.Dto
    public AdvisoryInsightContentViewModel toProto() {
        String content_markdown = this.surrogate.getContent_markdown();
        String contentful_id = this.surrogate.getContentful_id();
        AdvisoryInsightContentViewModelDashboardHighlightDto dashboard_highlight = this.surrogate.getDashboard_highlight();
        AdvisoryInsightContentViewModelDashboardHighlight proto = dashboard_highlight != null ? dashboard_highlight.toProto() : null;
        String disclosure_markdown = this.surrogate.getDisclosure_markdown();
        AdvisoryInsightContentViewModelAudioDto audio = this.surrogate.getAudio();
        AdvisoryInsightContentViewModelAudio proto2 = audio != null ? audio.toProto() : null;
        AdvisoryInsightContentViewModelAssetDto asset = this.surrogate.getAsset();
        AdvisoryInsightContentViewModelAsset proto3 = asset != null ? asset.toProto() : null;
        String icon = this.surrogate.getIcon();
        List<String> content_markdown_lines = this.surrogate.getContent_markdown_lines();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content_markdown_lines, 10));
        Iterator<T> it = content_markdown_lines.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        AdvisoryInsightContentViewModelPostContentCtaDto post_content_cta = this.surrogate.getPost_content_cta();
        AdvisoryInsightContentViewModelPostContentCta proto4 = post_content_cta != null ? post_content_cta.toProto() : null;
        AdvisoryInsightCtaDto primary_cta = this.surrogate.getPrimary_cta();
        return new AdvisoryInsightContentViewModel(content_markdown, contentful_id, proto, disclosure_markdown, proto2, proto3, icon, arrayList, proto4, primary_cta != null ? primary_cta.toProto() : null, this.surrogate.getTop_line_text(), null, 2048, null);
    }

    public String toString() {
        return "[AdvisoryInsightContentViewModelDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryInsightContentViewModelDto) && Intrinsics.areEqual(((AdvisoryInsightContentViewModelDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisoryInsightContentViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b)\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002QPB\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b5\u0010/\u001a\u0004\b3\u00104R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b;\u0010/\u001a\u0004\b9\u0010:R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\b?\u0010/\u001a\u0004\b=\u0010>R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\bA\u0010/\u001a\u0004\b@\u0010%R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bE\u0010/\u001a\u0004\bC\u0010DR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010F\u0012\u0004\bI\u0010/\u001a\u0004\bG\u0010HR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010J\u0012\u0004\bM\u0010/\u001a\u0004\bK\u0010LR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010,\u0012\u0004\bO\u0010/\u001a\u0004\bN\u0010%¨\u0006R"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Surrogate;", "", "", "content_markdown", "contentful_id", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "dashboard_highlight", "disclosure_markdown", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "audio", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "asset", "icon", "", "content_markdown_lines", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCtaDto;", "post_content_cta", "Ladvisory/proto/v1/AdvisoryInsightCtaDto;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "top_line_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;Ljava/lang/String;Ljava/util/List;Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCtaDto;Ladvisory/proto/v1/AdvisoryInsightCtaDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;Ljava/lang/String;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;Ljava/lang/String;Ljava/util/List;Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCtaDto;Ladvisory/proto/v1/AdvisoryInsightCtaDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContent_markdown", "getContent_markdown$annotations", "()V", "getContentful_id", "getContentful_id$annotations", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "getDashboard_highlight", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlightDto;", "getDashboard_highlight$annotations", "getDisclosure_markdown", "getDisclosure_markdown$annotations", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "getAudio", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "getAudio$annotations", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "getAsset", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAssetDto;", "getAsset$annotations", "getIcon", "getIcon$annotations", "Ljava/util/List;", "getContent_markdown_lines", "()Ljava/util/List;", "getContent_markdown_lines$annotations", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCtaDto;", "getPost_content_cta", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelPostContentCtaDto;", "getPost_content_cta$annotations", "Ladvisory/proto/v1/AdvisoryInsightCtaDto;", "getPrimary_cta", "()Ladvisory/proto/v1/AdvisoryInsightCtaDto;", "getPrimary_cta$annotations", "getTop_line_text", "getTop_line_text$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final AdvisoryInsightContentViewModelAssetDto asset;
        private final AdvisoryInsightContentViewModelAudioDto audio;
        private final String content_markdown;
        private final List<String> content_markdown_lines;
        private final String contentful_id;
        private final AdvisoryInsightContentViewModelDashboardHighlightDto dashboard_highlight;
        private final String disclosure_markdown;
        private final String icon;
        private final AdvisoryInsightContentViewModelPostContentCtaDto post_content_cta;
        private final AdvisoryInsightCtaDto primary_cta;
        private final String top_line_text;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryInsightContentViewModelDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (AdvisoryInsightContentViewModelDashboardHighlightDto) null, (String) null, (AdvisoryInsightContentViewModelAudioDto) null, (AdvisoryInsightContentViewModelAssetDto) null, (String) null, (List) null, (AdvisoryInsightContentViewModelPostContentCtaDto) null, (AdvisoryInsightCtaDto) null, (String) null, 2047, (DefaultConstructorMarker) null);
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
            return Intrinsics.areEqual(this.content_markdown, surrogate.content_markdown) && Intrinsics.areEqual(this.contentful_id, surrogate.contentful_id) && Intrinsics.areEqual(this.dashboard_highlight, surrogate.dashboard_highlight) && Intrinsics.areEqual(this.disclosure_markdown, surrogate.disclosure_markdown) && Intrinsics.areEqual(this.audio, surrogate.audio) && Intrinsics.areEqual(this.asset, surrogate.asset) && Intrinsics.areEqual(this.icon, surrogate.icon) && Intrinsics.areEqual(this.content_markdown_lines, surrogate.content_markdown_lines) && Intrinsics.areEqual(this.post_content_cta, surrogate.post_content_cta) && Intrinsics.areEqual(this.primary_cta, surrogate.primary_cta) && Intrinsics.areEqual(this.top_line_text, surrogate.top_line_text);
        }

        public int hashCode() {
            int iHashCode = ((this.content_markdown.hashCode() * 31) + this.contentful_id.hashCode()) * 31;
            AdvisoryInsightContentViewModelDashboardHighlightDto advisoryInsightContentViewModelDashboardHighlightDto = this.dashboard_highlight;
            int iHashCode2 = (iHashCode + (advisoryInsightContentViewModelDashboardHighlightDto == null ? 0 : advisoryInsightContentViewModelDashboardHighlightDto.hashCode())) * 31;
            String str = this.disclosure_markdown;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AdvisoryInsightContentViewModelAudioDto advisoryInsightContentViewModelAudioDto = this.audio;
            int iHashCode4 = (iHashCode3 + (advisoryInsightContentViewModelAudioDto == null ? 0 : advisoryInsightContentViewModelAudioDto.hashCode())) * 31;
            AdvisoryInsightContentViewModelAssetDto advisoryInsightContentViewModelAssetDto = this.asset;
            int iHashCode5 = (((((iHashCode4 + (advisoryInsightContentViewModelAssetDto == null ? 0 : advisoryInsightContentViewModelAssetDto.hashCode())) * 31) + this.icon.hashCode()) * 31) + this.content_markdown_lines.hashCode()) * 31;
            AdvisoryInsightContentViewModelPostContentCtaDto advisoryInsightContentViewModelPostContentCtaDto = this.post_content_cta;
            int iHashCode6 = (iHashCode5 + (advisoryInsightContentViewModelPostContentCtaDto == null ? 0 : advisoryInsightContentViewModelPostContentCtaDto.hashCode())) * 31;
            AdvisoryInsightCtaDto advisoryInsightCtaDto = this.primary_cta;
            int iHashCode7 = (iHashCode6 + (advisoryInsightCtaDto == null ? 0 : advisoryInsightCtaDto.hashCode())) * 31;
            String str2 = this.top_line_text;
            return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(content_markdown=" + this.content_markdown + ", contentful_id=" + this.contentful_id + ", dashboard_highlight=" + this.dashboard_highlight + ", disclosure_markdown=" + this.disclosure_markdown + ", audio=" + this.audio + ", asset=" + this.asset + ", icon=" + this.icon + ", content_markdown_lines=" + this.content_markdown_lines + ", post_content_cta=" + this.post_content_cta + ", primary_cta=" + this.primary_cta + ", top_line_text=" + this.top_line_text + ")";
        }

        /* compiled from: AdvisoryInsightContentViewModelDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryInsightContentViewModelDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, AdvisoryInsightContentViewModelDashboardHighlightDto advisoryInsightContentViewModelDashboardHighlightDto, String str3, AdvisoryInsightContentViewModelAudioDto advisoryInsightContentViewModelAudioDto, AdvisoryInsightContentViewModelAssetDto advisoryInsightContentViewModelAssetDto, String str4, List list, AdvisoryInsightContentViewModelPostContentCtaDto advisoryInsightContentViewModelPostContentCtaDto, AdvisoryInsightCtaDto advisoryInsightCtaDto, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.content_markdown = "";
            } else {
                this.content_markdown = str;
            }
            if ((i & 2) == 0) {
                this.contentful_id = "";
            } else {
                this.contentful_id = str2;
            }
            if ((i & 4) == 0) {
                this.dashboard_highlight = null;
            } else {
                this.dashboard_highlight = advisoryInsightContentViewModelDashboardHighlightDto;
            }
            if ((i & 8) == 0) {
                this.disclosure_markdown = null;
            } else {
                this.disclosure_markdown = str3;
            }
            if ((i & 16) == 0) {
                this.audio = null;
            } else {
                this.audio = advisoryInsightContentViewModelAudioDto;
            }
            if ((i & 32) == 0) {
                this.asset = null;
            } else {
                this.asset = advisoryInsightContentViewModelAssetDto;
            }
            if ((i & 64) == 0) {
                this.icon = "";
            } else {
                this.icon = str4;
            }
            if ((i & 128) == 0) {
                this.content_markdown_lines = CollectionsKt.emptyList();
            } else {
                this.content_markdown_lines = list;
            }
            if ((i & 256) == 0) {
                this.post_content_cta = null;
            } else {
                this.post_content_cta = advisoryInsightContentViewModelPostContentCtaDto;
            }
            if ((i & 512) == 0) {
                this.primary_cta = null;
            } else {
                this.primary_cta = advisoryInsightCtaDto;
            }
            if ((i & 1024) == 0) {
                this.top_line_text = null;
            } else {
                this.top_line_text = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.content_markdown, "")) {
                output.encodeStringElement(serialDesc, 0, self.content_markdown);
            }
            if (!Intrinsics.areEqual(self.contentful_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.contentful_id);
            }
            AdvisoryInsightContentViewModelDashboardHighlightDto advisoryInsightContentViewModelDashboardHighlightDto = self.dashboard_highlight;
            if (advisoryInsightContentViewModelDashboardHighlightDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AdvisoryInsightContentViewModelDashboardHighlightDto.Serializer.INSTANCE, advisoryInsightContentViewModelDashboardHighlightDto);
            }
            String str = self.disclosure_markdown;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            AdvisoryInsightContentViewModelAudioDto advisoryInsightContentViewModelAudioDto = self.audio;
            if (advisoryInsightContentViewModelAudioDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AdvisoryInsightContentViewModelAudioDto.Serializer.INSTANCE, advisoryInsightContentViewModelAudioDto);
            }
            AdvisoryInsightContentViewModelAssetDto advisoryInsightContentViewModelAssetDto = self.asset;
            if (advisoryInsightContentViewModelAssetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, AdvisoryInsightContentViewModelAssetDto.Serializer.INSTANCE, advisoryInsightContentViewModelAssetDto);
            }
            if (!Intrinsics.areEqual(self.icon, "")) {
                output.encodeStringElement(serialDesc, 6, self.icon);
            }
            if (!Intrinsics.areEqual(self.content_markdown_lines, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.content_markdown_lines);
            }
            AdvisoryInsightContentViewModelPostContentCtaDto advisoryInsightContentViewModelPostContentCtaDto = self.post_content_cta;
            if (advisoryInsightContentViewModelPostContentCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, AdvisoryInsightContentViewModelPostContentCtaDto.Serializer.INSTANCE, advisoryInsightContentViewModelPostContentCtaDto);
            }
            AdvisoryInsightCtaDto advisoryInsightCtaDto = self.primary_cta;
            if (advisoryInsightCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, AdvisoryInsightCtaDto.Serializer.INSTANCE, advisoryInsightCtaDto);
            }
            String str2 = self.top_line_text;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(String content_markdown, String contentful_id, AdvisoryInsightContentViewModelDashboardHighlightDto advisoryInsightContentViewModelDashboardHighlightDto, String str, AdvisoryInsightContentViewModelAudioDto advisoryInsightContentViewModelAudioDto, AdvisoryInsightContentViewModelAssetDto advisoryInsightContentViewModelAssetDto, String icon, List<String> content_markdown_lines, AdvisoryInsightContentViewModelPostContentCtaDto advisoryInsightContentViewModelPostContentCtaDto, AdvisoryInsightCtaDto advisoryInsightCtaDto, String str2) {
            Intrinsics.checkNotNullParameter(content_markdown, "content_markdown");
            Intrinsics.checkNotNullParameter(contentful_id, "contentful_id");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(content_markdown_lines, "content_markdown_lines");
            this.content_markdown = content_markdown;
            this.contentful_id = contentful_id;
            this.dashboard_highlight = advisoryInsightContentViewModelDashboardHighlightDto;
            this.disclosure_markdown = str;
            this.audio = advisoryInsightContentViewModelAudioDto;
            this.asset = advisoryInsightContentViewModelAssetDto;
            this.icon = icon;
            this.content_markdown_lines = content_markdown_lines;
            this.post_content_cta = advisoryInsightContentViewModelPostContentCtaDto;
            this.primary_cta = advisoryInsightCtaDto;
            this.top_line_text = str2;
        }

        public /* synthetic */ Surrogate(String str, String str2, AdvisoryInsightContentViewModelDashboardHighlightDto advisoryInsightContentViewModelDashboardHighlightDto, String str3, AdvisoryInsightContentViewModelAudioDto advisoryInsightContentViewModelAudioDto, AdvisoryInsightContentViewModelAssetDto advisoryInsightContentViewModelAssetDto, String str4, List list, AdvisoryInsightContentViewModelPostContentCtaDto advisoryInsightContentViewModelPostContentCtaDto, AdvisoryInsightCtaDto advisoryInsightCtaDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : advisoryInsightContentViewModelDashboardHighlightDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : advisoryInsightContentViewModelAudioDto, (i & 32) != 0 ? null : advisoryInsightContentViewModelAssetDto, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : advisoryInsightContentViewModelPostContentCtaDto, (i & 512) != 0 ? null : advisoryInsightCtaDto, (i & 1024) != 0 ? null : str5);
        }

        public final String getContent_markdown() {
            return this.content_markdown;
        }

        public final String getContentful_id() {
            return this.contentful_id;
        }

        public final AdvisoryInsightContentViewModelDashboardHighlightDto getDashboard_highlight() {
            return this.dashboard_highlight;
        }

        public final String getDisclosure_markdown() {
            return this.disclosure_markdown;
        }

        public final AdvisoryInsightContentViewModelAudioDto getAudio() {
            return this.audio;
        }

        public final AdvisoryInsightContentViewModelAssetDto getAsset() {
            return this.asset;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final List<String> getContent_markdown_lines() {
            return this.content_markdown_lines;
        }

        public final AdvisoryInsightContentViewModelPostContentCtaDto getPost_content_cta() {
            return this.post_content_cta;
        }

        public final AdvisoryInsightCtaDto getPrimary_cta() {
            return this.primary_cta;
        }

        public final String getTop_line_text() {
            return this.top_line_text;
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisoryInsightContentViewModelDto, AdvisoryInsightContentViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryInsightContentViewModelDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightContentViewModelDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightContentViewModelDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryInsightContentViewModelDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryInsightContentViewModel> getProtoAdapter() {
            return AdvisoryInsightContentViewModel.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightContentViewModelDto getZeroValue() {
            return AdvisoryInsightContentViewModelDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightContentViewModelDto fromProto(AdvisoryInsightContentViewModel proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String content_markdown = proto.getContent_markdown();
            String contentful_id = proto.getContentful_id();
            AdvisoryInsightContentViewModelDashboardHighlight dashboard_highlight = proto.getDashboard_highlight();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AdvisoryInsightContentViewModelDashboardHighlightDto advisoryInsightContentViewModelDashboardHighlightDtoFromProto = dashboard_highlight != null ? AdvisoryInsightContentViewModelDashboardHighlightDto.INSTANCE.fromProto(dashboard_highlight) : null;
            String disclosure_markdown = proto.getDisclosure_markdown();
            AdvisoryInsightContentViewModelAudio audio = proto.getAudio();
            AdvisoryInsightContentViewModelAudioDto advisoryInsightContentViewModelAudioDtoFromProto = audio != null ? AdvisoryInsightContentViewModelAudioDto.INSTANCE.fromProto(audio) : null;
            AdvisoryInsightContentViewModelAsset asset = proto.getAsset();
            AdvisoryInsightContentViewModelAssetDto advisoryInsightContentViewModelAssetDtoFromProto = asset != null ? AdvisoryInsightContentViewModelAssetDto.INSTANCE.fromProto(asset) : null;
            String icon = proto.getIcon();
            List<String> content_markdown_lines = proto.getContent_markdown_lines();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content_markdown_lines, 10));
            Iterator<T> it = content_markdown_lines.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            AdvisoryInsightContentViewModelPostContentCta post_content_cta = proto.getPost_content_cta();
            AdvisoryInsightContentViewModelPostContentCtaDto advisoryInsightContentViewModelPostContentCtaDtoFromProto = post_content_cta != null ? AdvisoryInsightContentViewModelPostContentCtaDto.INSTANCE.fromProto(post_content_cta) : null;
            AdvisoryInsightCta primary_cta = proto.getPrimary_cta();
            return new AdvisoryInsightContentViewModelDto(new Surrogate(content_markdown, contentful_id, advisoryInsightContentViewModelDashboardHighlightDtoFromProto, disclosure_markdown, advisoryInsightContentViewModelAudioDtoFromProto, advisoryInsightContentViewModelAssetDtoFromProto, icon, arrayList, advisoryInsightContentViewModelPostContentCtaDtoFromProto, primary_cta != null ? AdvisoryInsightCtaDto.INSTANCE.fromProto(primary_cta) : null, proto.getTop_line_text()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryInsightContentViewModelDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AdvisoryInsightContentViewModelDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryInsightContentViewModelDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<AdvisoryInsightContentViewModelDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.AdvisoryInsightContentViewModel", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryInsightContentViewModelDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryInsightContentViewModelDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryInsightContentViewModelDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "advisory.proto.v1.AdvisoryInsightContentViewModelDto";
        }
    }
}
