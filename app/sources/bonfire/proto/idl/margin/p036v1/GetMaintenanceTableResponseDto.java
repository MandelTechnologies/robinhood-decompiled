package bonfire.proto.idl.margin.p036v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.margin.p036v1.GetMaintenanceTableResponseDto;
import bonfire.proto.idl.margin.p036v1.MarginTableColumnDto;
import bonfire.proto.idl.margin.p036v1.MarginTableRowDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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

/* compiled from: GetMaintenanceTableResponseDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0087\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Surrogate;)V", "", "account_number", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "header", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto;", "rows", "crypto_header", "crypto_rows", "Lbonfire/proto/idl/margin/v1/MarginTableColumnDto;", "columns", "sort_by", "sort_direction", "", "margin_health_state", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toProto", "()Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Surrogate;", "getAccount_number", "getHeader", "()Ljava/util/List;", "getRows", "getColumns", "getSort_by", "getSort_direction", "getMargin_health_state", "()Ljava/lang/Integer;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetMaintenanceTableResponseDto implements Dto3<GetMaintenanceTableResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetMaintenanceTableResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetMaintenanceTableResponseDto, GetMaintenanceTableResponse>> binaryBase64Serializer$delegate;
    private static final GetMaintenanceTableResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetMaintenanceTableResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetMaintenanceTableResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final List<UIComponentDto> getHeader() {
        return this.surrogate.getHeader();
    }

    public final List<MarginTableRowDto> getRows() {
        return this.surrogate.getRows();
    }

    public final List<MarginTableColumnDto> getColumns() {
        return this.surrogate.getColumns();
    }

    public final String getSort_by() {
        return this.surrogate.getSort_by();
    }

    public final String getSort_direction() {
        return this.surrogate.getSort_direction();
    }

    public final Integer getMargin_health_state() {
        return this.surrogate.getMargin_health_state();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetMaintenanceTableResponseDto(java.lang.String r2, java.util.List r3, java.util.List r4, java.util.List r5, java.util.List r6, java.util.List r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Le
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        Le:
            r12 = r11 & 4
            if (r12 == 0) goto L16
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L16:
            r12 = r11 & 8
            if (r12 == 0) goto L1e
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L1e:
            r12 = r11 & 16
            if (r12 == 0) goto L26
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L26:
            r12 = r11 & 32
            if (r12 == 0) goto L2e
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L2e:
            r12 = r11 & 64
            r0 = 0
            if (r12 == 0) goto L34
            r8 = r0
        L34:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L39
            r9 = r0
        L39:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L48
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L52
        L48:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L52:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.margin.p036v1.GetMaintenanceTableResponseDto.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetMaintenanceTableResponseDto(String account_number, List<UIComponentDto> header, List<MarginTableRowDto> rows, List<UIComponentDto> crypto_header, List<MarginTableRowDto> crypto_rows, List<MarginTableColumnDto> columns, String str, String str2, Integer num) {
        this(new Surrogate(account_number, header, rows, crypto_header, crypto_rows, columns, str, str2, num));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(crypto_header, "crypto_header");
        Intrinsics.checkNotNullParameter(crypto_rows, "crypto_rows");
        Intrinsics.checkNotNullParameter(columns, "columns");
    }

    @Override // com.robinhood.idl.Dto
    public GetMaintenanceTableResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        List<UIComponentDto> header = this.surrogate.getHeader();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(header, 10));
        Iterator<T> it = header.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIComponentDto) it.next()).toProto());
        }
        List<MarginTableRowDto> rows = this.surrogate.getRows();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
        Iterator<T> it2 = rows.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MarginTableRowDto) it2.next()).toProto());
        }
        List<UIComponentDto> crypto_header = this.surrogate.getCrypto_header();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_header, 10));
        Iterator<T> it3 = crypto_header.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((UIComponentDto) it3.next()).toProto());
        }
        List<MarginTableRowDto> crypto_rows = this.surrogate.getCrypto_rows();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_rows, 10));
        Iterator<T> it4 = crypto_rows.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((MarginTableRowDto) it4.next()).toProto());
        }
        List<MarginTableColumnDto> columns = this.surrogate.getColumns();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(columns, 10));
        Iterator<T> it5 = columns.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((MarginTableColumnDto) it5.next()).toProto());
        }
        return new GetMaintenanceTableResponse(account_number, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, this.surrogate.getSort_by(), this.surrogate.getSort_direction(), this.surrogate.getMargin_health_state(), null, 512, null);
    }

    public String toString() {
        return "[GetMaintenanceTableResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetMaintenanceTableResponseDto) && Intrinsics.areEqual(((GetMaintenanceTableResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetMaintenanceTableResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\u0094\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b4\u0010.\u001a\u0004\b3\u00101R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b6\u0010.\u001a\u0004\b5\u00101R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b8\u0010.\u001a\u0004\b7\u00101R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010/\u0012\u0004\b:\u0010.\u001a\u0004\b9\u00101R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010+\u0012\u0004\b<\u0010.\u001a\u0004\b;\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010+\u0012\u0004\b>\u0010.\u001a\u0004\b=\u0010$R1\u0010\u0013\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010?\u0012\u0004\bB\u0010.\u001a\u0004\b@\u0010A¨\u0006E"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Surrogate;", "", "", "account_number", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "header", "Lbonfire/proto/idl/margin/v1/MarginTableRowDto;", "rows", "crypto_header", "crypto_rows", "Lbonfire/proto/idl/margin/v1/MarginTableColumnDto;", "columns", "sort_by", "sort_direction", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "margin_health_state", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_maintenance_table_v1_externalRelease", "(Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Ljava/util/List;", "getHeader", "()Ljava/util/List;", "getHeader$annotations", "getRows", "getRows$annotations", "getCrypto_header", "getCrypto_header$annotations", "getCrypto_rows", "getCrypto_rows$annotations", "getColumns", "getColumns$annotations", "getSort_by", "getSort_by$annotations", "getSort_direction", "getSort_direction$annotations", "Ljava/lang/Integer;", "getMargin_health_state", "()Ljava/lang/Integer;", "getMargin_health_state$annotations", "Companion", "$serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final List<MarginTableColumnDto> columns;
        private final List<UIComponentDto> crypto_header;
        private final List<MarginTableRowDto> crypto_rows;
        private final List<UIComponentDto> header;
        private final Integer margin_health_state;
        private final List<MarginTableRowDto> rows;
        private final String sort_by;
        private final String sort_direction;

        public Surrogate() {
            this((String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (Integer) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(MarginTableRowDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new ArrayListSerializer(MarginTableRowDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
            return new ArrayListSerializer(MarginTableColumnDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.header, surrogate.header) && Intrinsics.areEqual(this.rows, surrogate.rows) && Intrinsics.areEqual(this.crypto_header, surrogate.crypto_header) && Intrinsics.areEqual(this.crypto_rows, surrogate.crypto_rows) && Intrinsics.areEqual(this.columns, surrogate.columns) && Intrinsics.areEqual(this.sort_by, surrogate.sort_by) && Intrinsics.areEqual(this.sort_direction, surrogate.sort_direction) && Intrinsics.areEqual(this.margin_health_state, surrogate.margin_health_state);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.account_number.hashCode() * 31) + this.header.hashCode()) * 31) + this.rows.hashCode()) * 31) + this.crypto_header.hashCode()) * 31) + this.crypto_rows.hashCode()) * 31) + this.columns.hashCode()) * 31;
            String str = this.sort_by;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sort_direction;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.margin_health_state;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", header=" + this.header + ", rows=" + this.rows + ", crypto_header=" + this.crypto_header + ", crypto_rows=" + this.crypto_rows + ", columns=" + this.columns + ", sort_by=" + this.sort_by + ", sort_direction=" + this.sort_direction + ", margin_health_state=" + this.margin_health_state + ")";
        }

        /* compiled from: GetMaintenanceTableResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Surrogate;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetMaintenanceTableResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.margin.v1.GetMaintenanceTableResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetMaintenanceTableResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.margin.v1.GetMaintenanceTableResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetMaintenanceTableResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.margin.v1.GetMaintenanceTableResponseDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetMaintenanceTableResponseDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.margin.v1.GetMaintenanceTableResponseDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetMaintenanceTableResponseDto.Surrogate._childSerializers$_anonymous_$2();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.margin.v1.GetMaintenanceTableResponseDto$Surrogate$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetMaintenanceTableResponseDto.Surrogate._childSerializers$_anonymous_$3();
                }
            }), null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, List list, List list2, List list3, List list4, List list5, String str2, String str3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.header = CollectionsKt.emptyList();
            } else {
                this.header = list;
            }
            if ((i & 4) == 0) {
                this.rows = CollectionsKt.emptyList();
            } else {
                this.rows = list2;
            }
            if ((i & 8) == 0) {
                this.crypto_header = CollectionsKt.emptyList();
            } else {
                this.crypto_header = list3;
            }
            if ((i & 16) == 0) {
                this.crypto_rows = CollectionsKt.emptyList();
            } else {
                this.crypto_rows = list4;
            }
            if ((i & 32) == 0) {
                this.columns = CollectionsKt.emptyList();
            } else {
                this.columns = list5;
            }
            if ((i & 64) == 0) {
                this.sort_by = null;
            } else {
                this.sort_by = str2;
            }
            if ((i & 128) == 0) {
                this.sort_direction = null;
            } else {
                this.sort_direction = str3;
            }
            if ((i & 256) == 0) {
                this.margin_health_state = null;
            } else {
                this.margin_health_state = num;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_maintenance_table_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.header, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.header);
            }
            if (!Intrinsics.areEqual(self.rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.rows);
            }
            if (!Intrinsics.areEqual(self.crypto_header, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.crypto_header);
            }
            if (!Intrinsics.areEqual(self.crypto_rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.crypto_rows);
            }
            if (!Intrinsics.areEqual(self.columns, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.columns);
            }
            String str = self.sort_by;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
            String str2 = self.sort_direction;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str2);
            }
            Integer num = self.margin_health_state;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, num);
            }
        }

        public Surrogate(String account_number, List<UIComponentDto> header, List<MarginTableRowDto> rows, List<UIComponentDto> crypto_header, List<MarginTableRowDto> crypto_rows, List<MarginTableColumnDto> columns, String str, String str2, Integer num) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(rows, "rows");
            Intrinsics.checkNotNullParameter(crypto_header, "crypto_header");
            Intrinsics.checkNotNullParameter(crypto_rows, "crypto_rows");
            Intrinsics.checkNotNullParameter(columns, "columns");
            this.account_number = account_number;
            this.header = header;
            this.rows = rows;
            this.crypto_header = crypto_header;
            this.crypto_rows = crypto_rows;
            this.columns = columns;
            this.sort_by = str;
            this.sort_direction = str2;
            this.margin_health_state = num;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, java.util.List r3, java.util.List r4, java.util.List r5, java.util.List r6, java.util.List r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r1 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r12 = r11 & 2
                if (r12 == 0) goto Le
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            Le:
                r12 = r11 & 4
                if (r12 == 0) goto L16
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L16:
                r12 = r11 & 8
                if (r12 == 0) goto L1e
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L1e:
                r12 = r11 & 16
                if (r12 == 0) goto L26
                java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            L26:
                r12 = r11 & 32
                if (r12 == 0) goto L2e
                java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            L2e:
                r12 = r11 & 64
                r0 = 0
                if (r12 == 0) goto L34
                r8 = r0
            L34:
                r12 = r11 & 128(0x80, float:1.794E-43)
                if (r12 == 0) goto L39
                r9 = r0
            L39:
                r11 = r11 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L48
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L52
            L48:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L52:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.margin.p036v1.GetMaintenanceTableResponseDto.Surrogate.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<UIComponentDto> getHeader() {
            return this.header;
        }

        public final List<MarginTableRowDto> getRows() {
            return this.rows;
        }

        public final List<UIComponentDto> getCrypto_header() {
            return this.crypto_header;
        }

        public final List<MarginTableRowDto> getCrypto_rows() {
            return this.crypto_rows;
        }

        public final List<MarginTableColumnDto> getColumns() {
            return this.columns;
        }

        public final String getSort_by() {
            return this.sort_by;
        }

        public final String getSort_direction() {
            return this.sort_direction;
        }

        public final Integer getMargin_health_state() {
            return this.margin_health_state;
        }
    }

    /* compiled from: GetMaintenanceTableResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetMaintenanceTableResponseDto, GetMaintenanceTableResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetMaintenanceTableResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMaintenanceTableResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMaintenanceTableResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetMaintenanceTableResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetMaintenanceTableResponse> getProtoAdapter() {
            return GetMaintenanceTableResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMaintenanceTableResponseDto getZeroValue() {
            return GetMaintenanceTableResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMaintenanceTableResponseDto fromProto(GetMaintenanceTableResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            List<UIComponent> header = proto.getHeader();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(header, 10));
            Iterator<T> it = header.iterator();
            while (it.hasNext()) {
                arrayList.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it.next()));
            }
            List<MarginTableRow> rows = proto.getRows();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
            Iterator<T> it2 = rows.iterator();
            while (it2.hasNext()) {
                arrayList2.add(MarginTableRowDto.INSTANCE.fromProto((MarginTableRow) it2.next()));
            }
            List<UIComponent> crypto_header = proto.getCrypto_header();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_header, 10));
            Iterator<T> it3 = crypto_header.iterator();
            while (it3.hasNext()) {
                arrayList3.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it3.next()));
            }
            List<MarginTableRow> crypto_rows = proto.getCrypto_rows();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_rows, 10));
            Iterator<T> it4 = crypto_rows.iterator();
            while (it4.hasNext()) {
                arrayList4.add(MarginTableRowDto.INSTANCE.fromProto((MarginTableRow) it4.next()));
            }
            List<MarginTableColumn> columns = proto.getColumns();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(columns, 10));
            Iterator<T> it5 = columns.iterator();
            while (it5.hasNext()) {
                arrayList5.add(MarginTableColumnDto.INSTANCE.fromProto((MarginTableColumn) it5.next()));
            }
            return new GetMaintenanceTableResponseDto(new Surrogate(account_number, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, proto.getSort_by(), proto.getSort_direction(), proto.getMargin_health_state()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.margin.v1.GetMaintenanceTableResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMaintenanceTableResponseDto.binaryBase64Serializer_delegate$lambda$5();
            }
        });
        zeroValue = new GetMaintenanceTableResponseDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$5() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetMaintenanceTableResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetMaintenanceTableResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.margin.v1.GetMaintenanceTableResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetMaintenanceTableResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetMaintenanceTableResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetMaintenanceTableResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetMaintenanceTableResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.margin.v1.GetMaintenanceTableResponseDto";
        }
    }
}
