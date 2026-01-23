package identi.service.p471v1.models_workflow.p472v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.Info$ScreenParams;
import identi.service.p471v1.models_workflow.p472v1.InfoDto6;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: InfoDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006;:<=>?B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0099\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b2\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b3\u00100R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001b¨\u0006@"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Surrogate;)V", "", "title", CarResultComposable2.BODY, "primary_cta_text", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "primary_cta_callback", "secondary_cta_text", "secondary_cta_callback", "close_btn_callback", "header_title", "header_body", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "image", "primary_cta_deeplink", "secondary_cta_deeplink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/Info$ScreenParams;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Surrogate;", "getTitle", "getBody", "getPrimary_cta_text", "getPrimary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "getSecondary_cta_text", "getSecondary_cta_callback", "getClose_btn_callback", "getHeader_title", "getHeader_body", "getImage", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "getPrimary_cta_deeplink", "getSecondary_cta_deeplink", "Companion", "Surrogate", "CallbackDto", "ImageDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto, reason: use source file name */
/* loaded from: classes21.dex */
public final class InfoDto6 implements Dto3<Info$ScreenParams>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InfoDto6> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InfoDto6, Info$ScreenParams>> binaryBase64Serializer$delegate;
    private static final InfoDto6 zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InfoDto6(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InfoDto6(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getBody() {
        return this.surrogate.getBody();
    }

    public final String getPrimary_cta_text() {
        return this.surrogate.getPrimary_cta_text();
    }

    public final CallbackDto getPrimary_cta_callback() {
        return this.surrogate.getPrimary_cta_callback();
    }

    public final String getSecondary_cta_text() {
        return this.surrogate.getSecondary_cta_text();
    }

    public final CallbackDto getSecondary_cta_callback() {
        return this.surrogate.getSecondary_cta_callback();
    }

    public final CallbackDto getClose_btn_callback() {
        return this.surrogate.getClose_btn_callback();
    }

    public final String getHeader_title() {
        return this.surrogate.getHeader_title();
    }

    public final String getHeader_body() {
        return this.surrogate.getHeader_body();
    }

    public final ImageDto getImage() {
        return this.surrogate.getImage();
    }

    public final String getPrimary_cta_deeplink() {
        return this.surrogate.getPrimary_cta_deeplink();
    }

    public final String getSecondary_cta_deeplink() {
        return this.surrogate.getSecondary_cta_deeplink();
    }

    public /* synthetic */ InfoDto6(String str, String str2, String str3, CallbackDto callbackDto, String str4, CallbackDto callbackDto2, CallbackDto callbackDto3, String str5, String str6, ImageDto imageDto, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : callbackDto, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : callbackDto2, (i & 64) != 0 ? null : callbackDto3, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : imageDto, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8);
    }

    public InfoDto6(String str, String str2, String str3, CallbackDto callbackDto, String str4, CallbackDto callbackDto2, CallbackDto callbackDto3, String str5, String str6, ImageDto imageDto, String str7, String str8) {
        this(new Surrogate(str, str2, str3, callbackDto, str4, callbackDto2, callbackDto3, str5, str6, imageDto, str7, str8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Info$ScreenParams toProto() {
        String title = this.surrogate.getTitle();
        String body = this.surrogate.getBody();
        String primary_cta_text = this.surrogate.getPrimary_cta_text();
        CallbackDto primary_cta_callback = this.surrogate.getPrimary_cta_callback();
        Info$ScreenParams.Callback callback = primary_cta_callback != null ? (Info$ScreenParams.Callback) primary_cta_callback.toProto() : null;
        String secondary_cta_text = this.surrogate.getSecondary_cta_text();
        CallbackDto secondary_cta_callback = this.surrogate.getSecondary_cta_callback();
        Info$ScreenParams.Callback callback2 = secondary_cta_callback != null ? (Info$ScreenParams.Callback) secondary_cta_callback.toProto() : null;
        CallbackDto close_btn_callback = this.surrogate.getClose_btn_callback();
        Info$ScreenParams.Callback callback3 = close_btn_callback != null ? (Info$ScreenParams.Callback) close_btn_callback.toProto() : null;
        String header_title = this.surrogate.getHeader_title();
        String header_body = this.surrogate.getHeader_body();
        ImageDto image = this.surrogate.getImage();
        return new Info$ScreenParams(title, body, primary_cta_text, callback, secondary_cta_text, callback2, callback3, header_title, header_body, image != null ? (Info$ScreenParams.Image) image.toProto() : null, this.surrogate.getPrimary_cta_deeplink(), this.surrogate.getSecondary_cta_deeplink(), null, 4096, null);
    }

    public String toString() {
        return "[ScreenParamsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InfoDto6) && Intrinsics.areEqual(((InfoDto6) other).surrogate, this.surrogate);
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
    /* compiled from: InfoDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002HGB\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b8\u0010,\u001a\u0004\b7\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b:\u0010,\u001a\u0004\b9\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010)\u0012\u0004\b<\u0010,\u001a\u0004\b;\u0010\"R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010)\u0012\u0004\b>\u0010,\u001a\u0004\b=\u0010\"R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010?\u0012\u0004\bB\u0010,\u001a\u0004\b@\u0010AR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010)\u0012\u0004\bD\u0010,\u001a\u0004\bC\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010)\u0012\u0004\bF\u0010,\u001a\u0004\bE\u0010\"¨\u0006I"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Surrogate;", "", "", "title", CarResultComposable2.BODY, "primary_cta_text", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "primary_cta_callback", "secondary_cta_text", "secondary_cta_callback", "close_btn_callback", "header_title", "header_body", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "image", "primary_cta_deeplink", "secondary_cta_deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getBody", "getBody$annotations", "getPrimary_cta_text", "getPrimary_cta_text$annotations", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "getPrimary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "getPrimary_cta_callback$annotations", "getSecondary_cta_text", "getSecondary_cta_text$annotations", "getSecondary_cta_callback", "getSecondary_cta_callback$annotations", "getClose_btn_callback", "getClose_btn_callback$annotations", "getHeader_title", "getHeader_title$annotations", "getHeader_body", "getHeader_body$annotations", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "getImage", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "getImage$annotations", "getPrimary_cta_deeplink", "getPrimary_cta_deeplink$annotations", "getSecondary_cta_deeplink", "getSecondary_cta_deeplink$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$Surrogate, reason: from toString */
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String body;
        private final CallbackDto close_btn_callback;
        private final String header_body;
        private final String header_title;
        private final ImageDto image;
        private final CallbackDto primary_cta_callback;
        private final String primary_cta_deeplink;
        private final String primary_cta_text;
        private final CallbackDto secondary_cta_callback;
        private final String secondary_cta_deeplink;
        private final String secondary_cta_text;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (CallbackDto) null, (String) null, (CallbackDto) null, (CallbackDto) null, (String) null, (String) null, (ImageDto) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.body, surrogate.body) && Intrinsics.areEqual(this.primary_cta_text, surrogate.primary_cta_text) && this.primary_cta_callback == surrogate.primary_cta_callback && Intrinsics.areEqual(this.secondary_cta_text, surrogate.secondary_cta_text) && this.secondary_cta_callback == surrogate.secondary_cta_callback && this.close_btn_callback == surrogate.close_btn_callback && Intrinsics.areEqual(this.header_title, surrogate.header_title) && Intrinsics.areEqual(this.header_body, surrogate.header_body) && this.image == surrogate.image && Intrinsics.areEqual(this.primary_cta_deeplink, surrogate.primary_cta_deeplink) && Intrinsics.areEqual(this.secondary_cta_deeplink, surrogate.secondary_cta_deeplink);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.body;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.primary_cta_text;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CallbackDto callbackDto = this.primary_cta_callback;
            int iHashCode4 = (iHashCode3 + (callbackDto == null ? 0 : callbackDto.hashCode())) * 31;
            String str4 = this.secondary_cta_text;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            CallbackDto callbackDto2 = this.secondary_cta_callback;
            int iHashCode6 = (iHashCode5 + (callbackDto2 == null ? 0 : callbackDto2.hashCode())) * 31;
            CallbackDto callbackDto3 = this.close_btn_callback;
            int iHashCode7 = (iHashCode6 + (callbackDto3 == null ? 0 : callbackDto3.hashCode())) * 31;
            String str5 = this.header_title;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.header_body;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ImageDto imageDto = this.image;
            int iHashCode10 = (iHashCode9 + (imageDto == null ? 0 : imageDto.hashCode())) * 31;
            String str7 = this.primary_cta_deeplink;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.secondary_cta_deeplink;
            return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", body=" + this.body + ", primary_cta_text=" + this.primary_cta_text + ", primary_cta_callback=" + this.primary_cta_callback + ", secondary_cta_text=" + this.secondary_cta_text + ", secondary_cta_callback=" + this.secondary_cta_callback + ", close_btn_callback=" + this.close_btn_callback + ", header_title=" + this.header_title + ", header_body=" + this.header_body + ", image=" + this.image + ", primary_cta_deeplink=" + this.primary_cta_deeplink + ", secondary_cta_deeplink=" + this.secondary_cta_deeplink + ")";
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$Surrogate$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, CallbackDto callbackDto, String str4, CallbackDto callbackDto2, CallbackDto callbackDto3, String str5, String str6, ImageDto imageDto, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.body = null;
            } else {
                this.body = str2;
            }
            if ((i & 4) == 0) {
                this.primary_cta_text = null;
            } else {
                this.primary_cta_text = str3;
            }
            if ((i & 8) == 0) {
                this.primary_cta_callback = null;
            } else {
                this.primary_cta_callback = callbackDto;
            }
            if ((i & 16) == 0) {
                this.secondary_cta_text = null;
            } else {
                this.secondary_cta_text = str4;
            }
            if ((i & 32) == 0) {
                this.secondary_cta_callback = null;
            } else {
                this.secondary_cta_callback = callbackDto2;
            }
            if ((i & 64) == 0) {
                this.close_btn_callback = null;
            } else {
                this.close_btn_callback = callbackDto3;
            }
            if ((i & 128) == 0) {
                this.header_title = null;
            } else {
                this.header_title = str5;
            }
            if ((i & 256) == 0) {
                this.header_body = null;
            } else {
                this.header_body = str6;
            }
            if ((i & 512) == 0) {
                this.image = null;
            } else {
                this.image = imageDto;
            }
            if ((i & 1024) == 0) {
                this.primary_cta_deeplink = null;
            } else {
                this.primary_cta_deeplink = str7;
            }
            if ((i & 2048) == 0) {
                this.secondary_cta_deeplink = null;
            } else {
                this.secondary_cta_deeplink = str8;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.body;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.primary_cta_text;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str3);
            }
            CallbackDto callbackDto = self.primary_cta_callback;
            if (callbackDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CallbackDto.Serializer.INSTANCE, callbackDto);
            }
            String str4 = self.secondary_cta_text;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str4);
            }
            CallbackDto callbackDto2 = self.secondary_cta_callback;
            if (callbackDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, CallbackDto.Serializer.INSTANCE, callbackDto2);
            }
            CallbackDto callbackDto3 = self.close_btn_callback;
            if (callbackDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, CallbackDto.Serializer.INSTANCE, callbackDto3);
            }
            String str5 = self.header_title;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.header_body;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str6);
            }
            ImageDto imageDto = self.image;
            if (imageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ImageDto.Serializer.INSTANCE, imageDto);
            }
            String str7 = self.primary_cta_deeplink;
            if (str7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str7);
            }
            String str8 = self.secondary_cta_deeplink;
            if (str8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str8);
            }
        }

        public Surrogate(String str, String str2, String str3, CallbackDto callbackDto, String str4, CallbackDto callbackDto2, CallbackDto callbackDto3, String str5, String str6, ImageDto imageDto, String str7, String str8) {
            this.title = str;
            this.body = str2;
            this.primary_cta_text = str3;
            this.primary_cta_callback = callbackDto;
            this.secondary_cta_text = str4;
            this.secondary_cta_callback = callbackDto2;
            this.close_btn_callback = callbackDto3;
            this.header_title = str5;
            this.header_body = str6;
            this.image = imageDto;
            this.primary_cta_deeplink = str7;
            this.secondary_cta_deeplink = str8;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, CallbackDto callbackDto, String str4, CallbackDto callbackDto2, CallbackDto callbackDto3, String str5, String str6, ImageDto imageDto, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : callbackDto, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : callbackDto2, (i & 64) != 0 ? null : callbackDto3, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : imageDto, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getPrimary_cta_text() {
            return this.primary_cta_text;
        }

        public final CallbackDto getPrimary_cta_callback() {
            return this.primary_cta_callback;
        }

        public final String getSecondary_cta_text() {
            return this.secondary_cta_text;
        }

        public final CallbackDto getSecondary_cta_callback() {
            return this.secondary_cta_callback;
        }

        public final CallbackDto getClose_btn_callback() {
            return this.close_btn_callback;
        }

        public final String getHeader_title() {
            return this.header_title;
        }

        public final String getHeader_body() {
            return this.header_body;
        }

        public final ImageDto getImage() {
            return this.image;
        }

        public final String getPrimary_cta_deeplink() {
            return this.primary_cta_deeplink;
        }

        public final String getSecondary_cta_deeplink() {
            return this.secondary_cta_deeplink;
        }
    }

    /* compiled from: InfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto3.Creator<InfoDto6, Info$ScreenParams> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InfoDto6> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InfoDto6> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InfoDto6> getBinaryBase64Serializer() {
            return (KSerializer) InfoDto6.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Info$ScreenParams> getProtoAdapter() {
            return Info$ScreenParams.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InfoDto6 getZeroValue() {
            return InfoDto6.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InfoDto6 fromProto(Info$ScreenParams proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String body = proto.getBody();
            String primary_cta_text = proto.getPrimary_cta_text();
            Info$ScreenParams.Callback primary_cta_callback = proto.getPrimary_cta_callback();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CallbackDto callbackDtoFromProto = primary_cta_callback != null ? CallbackDto.INSTANCE.fromProto(primary_cta_callback) : null;
            String secondary_cta_text = proto.getSecondary_cta_text();
            Info$ScreenParams.Callback secondary_cta_callback = proto.getSecondary_cta_callback();
            CallbackDto callbackDtoFromProto2 = secondary_cta_callback != null ? CallbackDto.INSTANCE.fromProto(secondary_cta_callback) : null;
            Info$ScreenParams.Callback close_btn_callback = proto.getClose_btn_callback();
            CallbackDto callbackDtoFromProto3 = close_btn_callback != null ? CallbackDto.INSTANCE.fromProto(close_btn_callback) : null;
            String header_title = proto.getHeader_title();
            String header_body = proto.getHeader_body();
            Info$ScreenParams.Image image = proto.getImage();
            return new InfoDto6(new Surrogate(title, body, primary_cta_text, callbackDtoFromProto, secondary_cta_text, callbackDtoFromProto2, callbackDtoFromProto3, header_title, header_body, image != null ? ImageDto.INSTANCE.fromProto(image) : null, proto.getPrimary_cta_deeplink(), proto.getSecondary_cta_deeplink()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InfoDto6.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InfoDto6(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CALLBACK_UNSPECIFIED", "EXIT", "ACTION", "DEEPLINK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto */
    public static final class CallbackDto implements Dto2<Info$ScreenParams.Callback>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallbackDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CallbackDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CallbackDto, Info$ScreenParams.Callback>> binaryBase64Serializer$delegate;
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

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.CallbackDto.CALLBACK_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto$CALLBACK_UNSPECIFIED */
        /* loaded from: classes14.dex */
        static final class CALLBACK_UNSPECIFIED extends CallbackDto {
            CALLBACK_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Callback toProto() {
                return Info$ScreenParams.Callback.CALLBACK_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InfoDto6.CallbackDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.CallbackDto.EXIT", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto$EXIT */
        /* loaded from: classes14.dex */
        static final class EXIT extends CallbackDto {
            EXIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Callback toProto() {
                return Info$ScreenParams.Callback.EXIT;
            }
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.CallbackDto.ACTION", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto$ACTION */
        /* loaded from: classes14.dex */
        static final class ACTION extends CallbackDto {
            ACTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Callback toProto() {
                return Info$ScreenParams.Callback.ACTION;
            }
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.CallbackDto.DEEPLINK", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto$DEEPLINK */
        /* loaded from: classes14.dex */
        static final class DEEPLINK extends CallbackDto {
            DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Callback toProto() {
                return Info$ScreenParams.Callback.DEEPLINK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Callback;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto$Companion, reason: from kotlin metadata */
        /* loaded from: classes14.dex */
        public static final class Companion implements Dto2.Creator<CallbackDto, Info$ScreenParams.Callback> {

            /* compiled from: InfoDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto$Companion$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Info$ScreenParams.Callback.values().length];
                    try {
                        iArr[Info$ScreenParams.Callback.CALLBACK_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Info$ScreenParams.Callback.EXIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Info$ScreenParams.Callback.ACTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Info$ScreenParams.Callback.DEEPLINK.ordinal()] = 4;
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
            public ProtoAdapter<Info$ScreenParams.Callback> getProtoAdapter() {
                return Info$ScreenParams.Callback.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CallbackDto getZeroValue() {
                return CallbackDto.CALLBACK_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CallbackDto fromProto(Info$ScreenParams.Callback proto) {
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

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$CallbackDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$CallbackDto$Serializer */
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<CallbackDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CallbackDto, Info$ScreenParams.Callback> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.Info.ScreenParams.Callback", CallbackDto.getEntries(), CallbackDto.INSTANCE.getZeroValue());

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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE_UNSPECIFIED", "ALERT", "SECURITY_AND_PRIVACY", "HOURGLASS_LOADING", "PROMPT_ATTEMPT", "SECURE_LOCK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto */
    /* loaded from: classes14.dex */
    public static final class ImageDto implements Dto2<Info$ScreenParams.Image>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ImageDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ImageDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ImageDto, Info$ScreenParams.Image>> binaryBase64Serializer$delegate;
        public static final ImageDto IMAGE_UNSPECIFIED = new IMAGE_UNSPECIFIED("IMAGE_UNSPECIFIED", 0);
        public static final ImageDto ALERT = new ALERT("ALERT", 1);
        public static final ImageDto SECURITY_AND_PRIVACY = new SECURITY_AND_PRIVACY("SECURITY_AND_PRIVACY", 2);
        public static final ImageDto HOURGLASS_LOADING = new HOURGLASS_LOADING("HOURGLASS_LOADING", 3);
        public static final ImageDto PROMPT_ATTEMPT = new PROMPT_ATTEMPT("PROMPT_ATTEMPT", 4);
        public static final ImageDto SECURE_LOCK = new SECURE_LOCK("SECURE_LOCK", 5);

        private static final /* synthetic */ ImageDto[] $values() {
            return new ImageDto[]{IMAGE_UNSPECIFIED, ALERT, SECURITY_AND_PRIVACY, HOURGLASS_LOADING, PROMPT_ATTEMPT, SECURE_LOCK};
        }

        public /* synthetic */ ImageDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ImageDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.ImageDto.IMAGE_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$IMAGE_UNSPECIFIED */
        static final class IMAGE_UNSPECIFIED extends ImageDto {
            IMAGE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Image toProto() {
                return Info$ScreenParams.Image.IMAGE_UNSPECIFIED;
            }
        }

        private ImageDto(String str, int i) {
        }

        static {
            ImageDto[] imageDtoArr$values = $values();
            $VALUES = imageDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(imageDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InfoDto6.ImageDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.ImageDto.ALERT", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$ALERT */
        static final class ALERT extends ImageDto {
            ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Image toProto() {
                return Info$ScreenParams.Image.ALERT;
            }
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.ImageDto.SECURITY_AND_PRIVACY", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$SECURITY_AND_PRIVACY */
        static final class SECURITY_AND_PRIVACY extends ImageDto {
            SECURITY_AND_PRIVACY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Image toProto() {
                return Info$ScreenParams.Image.SECURITY_AND_PRIVACY;
            }
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.ImageDto.HOURGLASS_LOADING", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$HOURGLASS_LOADING */
        static final class HOURGLASS_LOADING extends ImageDto {
            HOURGLASS_LOADING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Image toProto() {
                return Info$ScreenParams.Image.HOURGLASS_LOADING;
            }
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.ImageDto.PROMPT_ATTEMPT", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$PROMPT_ATTEMPT */
        static final class PROMPT_ATTEMPT extends ImageDto {
            PROMPT_ATTEMPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Image toProto() {
                return Info$ScreenParams.Image.PROMPT_ATTEMPT;
            }
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/InfoDto.ScreenParamsDto.ImageDto.SECURE_LOCK", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$SECURE_LOCK */
        static final class SECURE_LOCK extends ImageDto {
            SECURE_LOCK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Info$ScreenParams.Image toProto() {
                return Info$ScreenParams.Image.SECURE_LOCK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams$Image;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto2.Creator<ImageDto, Info$ScreenParams.Image> {

            /* compiled from: InfoDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$Companion$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Info$ScreenParams.Image.values().length];
                    try {
                        iArr[Info$ScreenParams.Image.IMAGE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Info$ScreenParams.Image.ALERT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Info$ScreenParams.Image.SECURITY_AND_PRIVACY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Info$ScreenParams.Image.HOURGLASS_LOADING.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Info$ScreenParams.Image.PROMPT_ATTEMPT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Info$ScreenParams.Image.SECURE_LOCK.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ImageDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ImageDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ImageDto> getBinaryBase64Serializer() {
                return (KSerializer) ImageDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Info$ScreenParams.Image> getProtoAdapter() {
                return Info$ScreenParams.Image.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ImageDto getZeroValue() {
                return ImageDto.IMAGE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ImageDto fromProto(Info$ScreenParams.Image proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ImageDto.IMAGE_UNSPECIFIED;
                    case 2:
                        return ImageDto.ALERT;
                    case 3:
                        return ImageDto.SECURITY_AND_PRIVACY;
                    case 4:
                        return ImageDto.HOURGLASS_LOADING;
                    case 5:
                        return ImageDto.PROMPT_ATTEMPT;
                    case 6:
                        return ImageDto.SECURE_LOCK;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: InfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$ImageDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$ImageDto$Serializer */
        public static final class Serializer implements KSerializer<ImageDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ImageDto, Info$ScreenParams.Image> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.Info.ScreenParams.Image", ImageDto.getEntries(), ImageDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ImageDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ImageDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ImageDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ImageDto valueOf(String str) {
            return (ImageDto) Enum.valueOf(ImageDto.class, str);
        }

        public static ImageDto[] values() {
            return (ImageDto[]) $VALUES.clone();
        }
    }

    /* compiled from: InfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$Serializer */
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<InfoDto6> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.Info.ScreenParams", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InfoDto6 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InfoDto6 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InfoDto6((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto$MultibindingModule */
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.InfoDto$ScreenParamsDto";
        }
    }
}
