package bonfire_crypto.proto.p042v1.crypto_migrations.p043v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailAssetsResponseDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailResponseDto;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
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
import rh_server_driven_ui.p531v1.AlertAction;
import rh_server_driven_ui.p531v1.AlertActionDto;
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.DataRowStacked;
import rh_server_driven_ui.p531v1.DataRowStackedDto;
import rh_server_driven_ui.p531v1.InfoBanner;
import rh_server_driven_ui.p531v1.InfoBannerDto;
import rh_server_driven_ui.p531v1.TextButton;
import rh_server_driven_ui.p531v1.TextButtonDto;
import rh_server_driven_ui.p531v1.Timeline;
import rh_server_driven_ui.p531v1.TimelineDto;

/* compiled from: CryptoMigrationsDetailResponseDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004<;=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0087\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010¢\u0006\u0004\b\u0006\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108F¢\u0006\u0006\u001a\u0004\b8\u00107R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006?"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponse;", "Landroid/os/Parcelable;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Surrogate;)V", "", "id", "title", "subtitle", "Lrh_server_driven_ui/v1/InfoBannerDto;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lrh_server_driven_ui/v1/TimelineDto;", "timeline", "", "Lrh_server_driven_ui/v1/DataRowStackedDto;", "detail_rows", "Lrh_server_driven_ui/v1/ButtonDto;", "footer_buttons", "Lrh_server_driven_ui/v1/AlertActionDto;", "help_alert_sheet", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;", "assets_detail", "Lrh_server_driven_ui/v1/TextButtonDto;", "footer_text_buttons", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/InfoBannerDto;Lrh_server_driven_ui/v1/TimelineDto;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/AlertActionDto;Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;Ljava/util/List;)V", "toProto", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Surrogate;", "getTitle", "getSubtitle", "getBanner", "()Lrh_server_driven_ui/v1/InfoBannerDto;", "getTimeline", "()Lrh_server_driven_ui/v1/TimelineDto;", "getDetail_rows", "()Ljava/util/List;", "getFooter_buttons", "getAssets_detail", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class CryptoMigrationsDetailResponseDto implements Dto3<CryptoMigrationsDetailResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoMigrationsDetailResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoMigrationsDetailResponseDto, CryptoMigrationsDetailResponse>> binaryBase64Serializer$delegate;
    private static final CryptoMigrationsDetailResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoMigrationsDetailResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoMigrationsDetailResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final InfoBannerDto getBanner() {
        return this.surrogate.getBanner();
    }

    public final TimelineDto getTimeline() {
        return this.surrogate.getTimeline();
    }

    public final List<DataRowStackedDto> getDetail_rows() {
        return this.surrogate.getDetail_rows();
    }

    public final List<ButtonDto> getFooter_buttons() {
        return this.surrogate.getFooter_buttons();
    }

    public final CryptoMigrationsDetailAssetsResponseDto getAssets_detail() {
        return this.surrogate.getAssets_detail();
    }

    public /* synthetic */ CryptoMigrationsDetailResponseDto(String str, String str2, String str3, InfoBannerDto infoBannerDto, TimelineDto timelineDto, List list, List list2, AlertActionDto alertActionDto, CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : infoBannerDto, (i & 16) != 0 ? null : timelineDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : alertActionDto, (i & 256) != 0 ? null : cryptoMigrationsDetailAssetsResponseDto, (i & 512) != 0 ? CollectionsKt.emptyList() : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoMigrationsDetailResponseDto(String id, String title, String subtitle, InfoBannerDto infoBannerDto, TimelineDto timelineDto, List<DataRowStackedDto> detail_rows, List<ButtonDto> footer_buttons, AlertActionDto alertActionDto, CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto, List<TextButtonDto> footer_text_buttons) {
        this(new Surrogate(id, title, subtitle, infoBannerDto, timelineDto, detail_rows, footer_buttons, alertActionDto, cryptoMigrationsDetailAssetsResponseDto, footer_text_buttons));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(detail_rows, "detail_rows");
        Intrinsics.checkNotNullParameter(footer_buttons, "footer_buttons");
        Intrinsics.checkNotNullParameter(footer_text_buttons, "footer_text_buttons");
    }

    @Override // com.robinhood.idl.Dto
    public CryptoMigrationsDetailResponse toProto() {
        String id = this.surrogate.getId();
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        InfoBannerDto banner = this.surrogate.getBanner();
        InfoBanner proto = banner != null ? banner.toProto() : null;
        TimelineDto timeline = this.surrogate.getTimeline();
        Timeline proto2 = timeline != null ? timeline.toProto() : null;
        List<DataRowStackedDto> detail_rows = this.surrogate.getDetail_rows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(detail_rows, 10));
        Iterator<T> it = detail_rows.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataRowStackedDto) it.next()).toProto());
        }
        List<ButtonDto> footer_buttons = this.surrogate.getFooter_buttons();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer_buttons, 10));
        Iterator<T> it2 = footer_buttons.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ButtonDto) it2.next()).toProto());
        }
        AlertActionDto help_alert_sheet = this.surrogate.getHelp_alert_sheet();
        AlertAction proto3 = help_alert_sheet != null ? help_alert_sheet.toProto() : null;
        CryptoMigrationsDetailAssetsResponseDto assets_detail = this.surrogate.getAssets_detail();
        CryptoMigrationsDetailAssetsResponse proto4 = assets_detail != null ? assets_detail.toProto() : null;
        List<TextButtonDto> footer_text_buttons = this.surrogate.getFooter_text_buttons();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer_text_buttons, 10));
        Iterator<T> it3 = footer_text_buttons.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((TextButtonDto) it3.next()).toProto());
        }
        return new CryptoMigrationsDetailResponse(id, title, subtitle, proto, proto2, arrayList, arrayList2, proto3, proto4, arrayList3, null, 1024, null);
    }

    public String toString() {
        return "[CryptoMigrationsDetailResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoMigrationsDetailResponseDto) && Intrinsics.areEqual(((CryptoMigrationsDetailResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoMigrationsDetailResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 M2\u00020\u0001:\u0002NMB\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n¢\u0006\u0004\b\u0015\u0010\u0016B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010&R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b<\u00100\u001a\u0004\b:\u0010;R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\bB\u00100\u001a\u0004\bA\u0010?R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010C\u0012\u0004\bF\u00100\u001a\u0004\bD\u0010ER\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010G\u0012\u0004\bJ\u00100\u001a\u0004\bH\u0010IR&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010=\u0012\u0004\bL\u00100\u001a\u0004\bK\u0010?¨\u0006O"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Surrogate;", "", "", "id", "title", "subtitle", "Lrh_server_driven_ui/v1/InfoBannerDto;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lrh_server_driven_ui/v1/TimelineDto;", "timeline", "", "Lrh_server_driven_ui/v1/DataRowStackedDto;", "detail_rows", "Lrh_server_driven_ui/v1/ButtonDto;", "footer_buttons", "Lrh_server_driven_ui/v1/AlertActionDto;", "help_alert_sheet", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;", "assets_detail", "Lrh_server_driven_ui/v1/TextButtonDto;", "footer_text_buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/InfoBannerDto;Lrh_server_driven_ui/v1/TimelineDto;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/AlertActionDto;Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/InfoBannerDto;Lrh_server_driven_ui/v1/TimelineDto;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/AlertActionDto;Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_crypto_proto_v1_crypto_migrations_externalRelease", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Lrh_server_driven_ui/v1/InfoBannerDto;", "getBanner", "()Lrh_server_driven_ui/v1/InfoBannerDto;", "getBanner$annotations", "Lrh_server_driven_ui/v1/TimelineDto;", "getTimeline", "()Lrh_server_driven_ui/v1/TimelineDto;", "getTimeline$annotations", "Ljava/util/List;", "getDetail_rows", "()Ljava/util/List;", "getDetail_rows$annotations", "getFooter_buttons", "getFooter_buttons$annotations", "Lrh_server_driven_ui/v1/AlertActionDto;", "getHelp_alert_sheet", "()Lrh_server_driven_ui/v1/AlertActionDto;", "getHelp_alert_sheet$annotations", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;", "getAssets_detail", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;", "getAssets_detail$annotations", "getFooter_text_buttons", "getFooter_text_buttons$annotations", "Companion", "$serializer", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoMigrationsDetailAssetsResponseDto assets_detail;
        private final InfoBannerDto banner;
        private final List<DataRowStackedDto> detail_rows;
        private final List<ButtonDto> footer_buttons;
        private final List<TextButtonDto> footer_text_buttons;
        private final AlertActionDto help_alert_sheet;
        private final String id;
        private final String subtitle;
        private final TimelineDto timeline;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (InfoBannerDto) null, (TimelineDto) null, (List) null, (List) null, (AlertActionDto) null, (CryptoMigrationsDetailAssetsResponseDto) null, (List) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(DataRowStackedDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(ButtonDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(TextButtonDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.banner, surrogate.banner) && Intrinsics.areEqual(this.timeline, surrogate.timeline) && Intrinsics.areEqual(this.detail_rows, surrogate.detail_rows) && Intrinsics.areEqual(this.footer_buttons, surrogate.footer_buttons) && Intrinsics.areEqual(this.help_alert_sheet, surrogate.help_alert_sheet) && Intrinsics.areEqual(this.assets_detail, surrogate.assets_detail) && Intrinsics.areEqual(this.footer_text_buttons, surrogate.footer_text_buttons);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            InfoBannerDto infoBannerDto = this.banner;
            int iHashCode2 = (iHashCode + (infoBannerDto == null ? 0 : infoBannerDto.hashCode())) * 31;
            TimelineDto timelineDto = this.timeline;
            int iHashCode3 = (((((iHashCode2 + (timelineDto == null ? 0 : timelineDto.hashCode())) * 31) + this.detail_rows.hashCode()) * 31) + this.footer_buttons.hashCode()) * 31;
            AlertActionDto alertActionDto = this.help_alert_sheet;
            int iHashCode4 = (iHashCode3 + (alertActionDto == null ? 0 : alertActionDto.hashCode())) * 31;
            CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto = this.assets_detail;
            return ((iHashCode4 + (cryptoMigrationsDetailAssetsResponseDto != null ? cryptoMigrationsDetailAssetsResponseDto.hashCode() : 0)) * 31) + this.footer_text_buttons.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", banner=" + this.banner + ", timeline=" + this.timeline + ", detail_rows=" + this.detail_rows + ", footer_buttons=" + this.footer_buttons + ", help_alert_sheet=" + this.help_alert_sheet + ", assets_detail=" + this.assets_detail + ", footer_text_buttons=" + this.footer_text_buttons + ")";
        }

        /* compiled from: CryptoMigrationsDetailResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Surrogate;", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoMigrationsDetailResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoMigrationsDetailResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoMigrationsDetailResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailResponseDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoMigrationsDetailResponseDto.Surrogate._childSerializers$_anonymous_$1();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, InfoBannerDto infoBannerDto, TimelineDto timelineDto, List list, List list2, AlertActionDto alertActionDto, CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto, List list3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 4) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str3;
            }
            if ((i & 8) == 0) {
                this.banner = null;
            } else {
                this.banner = infoBannerDto;
            }
            if ((i & 16) == 0) {
                this.timeline = null;
            } else {
                this.timeline = timelineDto;
            }
            if ((i & 32) == 0) {
                this.detail_rows = CollectionsKt.emptyList();
            } else {
                this.detail_rows = list;
            }
            if ((i & 64) == 0) {
                this.footer_buttons = CollectionsKt.emptyList();
            } else {
                this.footer_buttons = list2;
            }
            if ((i & 128) == 0) {
                this.help_alert_sheet = null;
            } else {
                this.help_alert_sheet = alertActionDto;
            }
            if ((i & 256) == 0) {
                this.assets_detail = null;
            } else {
                this.assets_detail = cryptoMigrationsDetailAssetsResponseDto;
            }
            if ((i & 512) == 0) {
                this.footer_text_buttons = CollectionsKt.emptyList();
            } else {
                this.footer_text_buttons = list3;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_crypto_proto_v1_crypto_migrations_externalRelease */
        public static final /* synthetic */ void m745xd7d33af6(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 2, self.subtitle);
            }
            InfoBannerDto infoBannerDto = self.banner;
            if (infoBannerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, InfoBannerDto.Serializer.INSTANCE, infoBannerDto);
            }
            TimelineDto timelineDto = self.timeline;
            if (timelineDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimelineDto.Serializer.INSTANCE, timelineDto);
            }
            if (!Intrinsics.areEqual(self.detail_rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.detail_rows);
            }
            if (!Intrinsics.areEqual(self.footer_buttons, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.footer_buttons);
            }
            AlertActionDto alertActionDto = self.help_alert_sheet;
            if (alertActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, AlertActionDto.Serializer.INSTANCE, alertActionDto);
            }
            CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto = self.assets_detail;
            if (cryptoMigrationsDetailAssetsResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, CryptoMigrationsDetailAssetsResponseDto.Serializer.INSTANCE, cryptoMigrationsDetailAssetsResponseDto);
            }
            if (Intrinsics.areEqual(self.footer_text_buttons, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.footer_text_buttons);
        }

        public Surrogate(String id, String title, String subtitle, InfoBannerDto infoBannerDto, TimelineDto timelineDto, List<DataRowStackedDto> detail_rows, List<ButtonDto> footer_buttons, AlertActionDto alertActionDto, CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto, List<TextButtonDto> footer_text_buttons) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(detail_rows, "detail_rows");
            Intrinsics.checkNotNullParameter(footer_buttons, "footer_buttons");
            Intrinsics.checkNotNullParameter(footer_text_buttons, "footer_text_buttons");
            this.id = id;
            this.title = title;
            this.subtitle = subtitle;
            this.banner = infoBannerDto;
            this.timeline = timelineDto;
            this.detail_rows = detail_rows;
            this.footer_buttons = footer_buttons;
            this.help_alert_sheet = alertActionDto;
            this.assets_detail = cryptoMigrationsDetailAssetsResponseDto;
            this.footer_text_buttons = footer_text_buttons;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, InfoBannerDto infoBannerDto, TimelineDto timelineDto, List list, List list2, AlertActionDto alertActionDto, CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDto, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : infoBannerDto, (i & 16) != 0 ? null : timelineDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : alertActionDto, (i & 256) != 0 ? null : cryptoMigrationsDetailAssetsResponseDto, (i & 512) != 0 ? CollectionsKt.emptyList() : list3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final InfoBannerDto getBanner() {
            return this.banner;
        }

        public final TimelineDto getTimeline() {
            return this.timeline;
        }

        public final List<DataRowStackedDto> getDetail_rows() {
            return this.detail_rows;
        }

        public final List<ButtonDto> getFooter_buttons() {
            return this.footer_buttons;
        }

        public final AlertActionDto getHelp_alert_sheet() {
            return this.help_alert_sheet;
        }

        public final CryptoMigrationsDetailAssetsResponseDto getAssets_detail() {
            return this.assets_detail;
        }

        public final List<TextButtonDto> getFooter_text_buttons() {
            return this.footer_text_buttons;
        }
    }

    /* compiled from: CryptoMigrationsDetailResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CryptoMigrationsDetailResponseDto, CryptoMigrationsDetailResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoMigrationsDetailResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoMigrationsDetailResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoMigrationsDetailResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoMigrationsDetailResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoMigrationsDetailResponse> getProtoAdapter() {
            return CryptoMigrationsDetailResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoMigrationsDetailResponseDto getZeroValue() {
            return CryptoMigrationsDetailResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoMigrationsDetailResponseDto fromProto(CryptoMigrationsDetailResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            InfoBanner banner = proto.getBanner();
            DefaultConstructorMarker defaultConstructorMarker = null;
            InfoBannerDto infoBannerDtoFromProto = banner != null ? InfoBannerDto.INSTANCE.fromProto(banner) : null;
            Timeline timeline = proto.getTimeline();
            TimelineDto timelineDtoFromProto = timeline != null ? TimelineDto.INSTANCE.fromProto(timeline) : null;
            List<DataRowStacked> detail_rows = proto.getDetail_rows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(detail_rows, 10));
            Iterator<T> it = detail_rows.iterator();
            while (it.hasNext()) {
                arrayList.add(DataRowStackedDto.INSTANCE.fromProto((DataRowStacked) it.next()));
            }
            List<Button> footer_buttons = proto.getFooter_buttons();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer_buttons, 10));
            Iterator<T> it2 = footer_buttons.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ButtonDto.INSTANCE.fromProto((Button) it2.next()));
            }
            AlertAction help_alert_sheet = proto.getHelp_alert_sheet();
            AlertActionDto alertActionDtoFromProto = help_alert_sheet != null ? AlertActionDto.INSTANCE.fromProto(help_alert_sheet) : null;
            CryptoMigrationsDetailAssetsResponse assets_detail = proto.getAssets_detail();
            CryptoMigrationsDetailAssetsResponseDto cryptoMigrationsDetailAssetsResponseDtoFromProto = assets_detail != null ? CryptoMigrationsDetailAssetsResponseDto.INSTANCE.fromProto(assets_detail) : null;
            List<TextButton> footer_text_buttons = proto.getFooter_text_buttons();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer_text_buttons, 10));
            Iterator<T> it3 = footer_text_buttons.iterator();
            while (it3.hasNext()) {
                arrayList3.add(TextButtonDto.INSTANCE.fromProto((TextButton) it3.next()));
            }
            return new CryptoMigrationsDetailResponseDto(new Surrogate(id, title, subtitle, infoBannerDtoFromProto, timelineDtoFromProto, arrayList, arrayList2, alertActionDtoFromProto, cryptoMigrationsDetailAssetsResponseDtoFromProto, arrayList3), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoMigrationsDetailResponseDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new CryptoMigrationsDetailResponseDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoMigrationsDetailResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CryptoMigrationsDetailResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoMigrationsDetailResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoMigrationsDetailResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoMigrationsDetailResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoMigrationsDetailResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailResponseDto";
        }
    }
}
