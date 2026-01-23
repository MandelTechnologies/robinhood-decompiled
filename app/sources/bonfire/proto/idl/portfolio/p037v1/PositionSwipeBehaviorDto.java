package bonfire.proto.idl.portfolio.p037v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.portfolio.p037v1.PositionSwipeBehaviorDto;
import bonfire.proto.idl.portfolio.p037v1.PositionSwipeTypeDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PositionSwipeBehaviorDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004@?ABB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¡\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u0017J\u001d\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u000e\u0010\u001cJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u000f\u0010\u001eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0010\u0010\u001eJ\u001d\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0012\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b:\u00109R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b;\u00109R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b<\u00109R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b>\u0010$¨\u0006C"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehavior;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Surrogate;)V", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeTypeDto;", "swipe_type", "", "actuation_percentage", "", "", "text", "text_color", "background_color", "background_opacity", "alert", "deeplink", "", "show_loading_indicator", "logging_identifier", "(Lbonfire/proto/idl/portfolio/v1/PositionSwipeTypeDto;FLjava/util/Map;Ljava/util/Map;Ljava/util/Map;FLjava/util/Map;Ljava/lang/String;ZLjava/lang/String;)V", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/robinhood/models/serverdriven/experimental/api/MarkdownText;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Lcom/squareup/moshi/Moshi;)Lcom/robinhood/models/serverdriven/experimental/api/MarkdownText;", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "(Lcom/squareup/moshi/Moshi;)Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "(Lcom/squareup/moshi/Moshi;)Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "toProto", "()Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehavior;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Surrogate;", "getSwipe_type", "()Lbonfire/proto/idl/portfolio/v1/PositionSwipeTypeDto;", "getActuation_percentage", "()F", "getText", "()Ljava/util/Map;", "getText_color", "getBackground_color", "getAlert", "getDeeplink", "getLogging_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PositionSwipeBehaviorDto implements Dto3<PositionSwipeBehavior>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PositionSwipeBehaviorDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PositionSwipeBehaviorDto, PositionSwipeBehavior>> binaryBase64Serializer$delegate;
    private static final PositionSwipeBehaviorDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PositionSwipeBehaviorDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PositionSwipeBehaviorDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PositionSwipeTypeDto getSwipe_type() {
        return this.surrogate.getSwipe_type();
    }

    public final float getActuation_percentage() {
        return this.surrogate.getActuation_percentage();
    }

    public final Map<String, ?> getText() {
        return this.surrogate.getText();
    }

    public final Map<String, ?> getText_color() {
        return this.surrogate.getText_color();
    }

    public final Map<String, ?> getBackground_color() {
        return this.surrogate.getBackground_color();
    }

    public final Map<String, ?> getAlert() {
        return this.surrogate.getAlert();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PositionSwipeBehaviorDto(bonfire.proto.idl.portfolio.p037v1.PositionSwipeTypeDto r3, float r4, java.util.Map r5, java.util.Map r6, java.util.Map r7, float r8, java.util.Map r9, java.lang.String r10, boolean r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r2 = this;
            r14 = r13 & 1
            if (r14 == 0) goto La
            bonfire.proto.idl.portfolio.v1.PositionSwipeTypeDto$Companion r3 = bonfire.proto.idl.portfolio.p037v1.PositionSwipeTypeDto.INSTANCE
            bonfire.proto.idl.portfolio.v1.PositionSwipeTypeDto r3 = r3.getZeroValue()
        La:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L10
            r4 = r0
        L10:
            r14 = r13 & 4
            r1 = 0
            if (r14 == 0) goto L16
            r5 = r1
        L16:
            r14 = r13 & 8
            if (r14 == 0) goto L1b
            r6 = r1
        L1b:
            r14 = r13 & 16
            if (r14 == 0) goto L20
            r7 = r1
        L20:
            r14 = r13 & 32
            if (r14 == 0) goto L25
            r8 = r0
        L25:
            r14 = r13 & 64
            if (r14 == 0) goto L2a
            r9 = r1
        L2a:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L2f
            r10 = r1
        L2f:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L34
            r11 = 0
        L34:
            r13 = r13 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L44
            r14 = r1
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L4f
        L44:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L4f:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.portfolio.p037v1.PositionSwipeBehaviorDto.<init>(bonfire.proto.idl.portfolio.v1.PositionSwipeTypeDto, float, java.util.Map, java.util.Map, java.util.Map, float, java.util.Map, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PositionSwipeBehaviorDto(PositionSwipeTypeDto swipe_type, float f, Map<String, ?> map, Map<String, ?> map2, Map<String, ?> map3, float f2, Map<String, ?> map4, String str, boolean z, String str2) {
        this(new Surrogate(swipe_type, f, map, map2, map3, f2, map4, str, z, str2));
        Intrinsics.checkNotNullParameter(swipe_type, "swipe_type");
    }

    public final MarkdownText<GenericAction> text(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> text = getText();
        if (text != null) {
            return (MarkdownText) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(MarkdownText.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(GenericAction.class)))).fromJsonValue(text);
        }
        return null;
    }

    public final ThemedColor text_color(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> text_color = getText_color();
        if (text_color != null) {
            return (ThemedColor) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(ThemedColor.class)).fromJsonValue(text_color);
        }
        return null;
    }

    public final ThemedColor background_color(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> background_color = getBackground_color();
        if (background_color != null) {
            return (ThemedColor) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(ThemedColor.class)).fromJsonValue(background_color);
        }
        return null;
    }

    public final GenericAlertContent<GenericAction> alert(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> alert = getAlert();
        if (alert != null) {
            return (GenericAlertContent) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(GenericAlertContent.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(GenericAction.class)))).fromJsonValue(alert);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PositionSwipeBehavior toProto() {
        return new PositionSwipeBehavior((PositionSwipeType) this.surrogate.getSwipe_type().toProto(), this.surrogate.getActuation_percentage(), this.surrogate.getText(), this.surrogate.getText_color(), this.surrogate.getBackground_color(), this.surrogate.getBackground_opacity(), this.surrogate.getAlert(), this.surrogate.getDeeplink(), this.surrogate.getShow_loading_indicator(), this.surrogate.getLogging_identifier(), null, 1024, null);
    }

    public String toString() {
        return "[PositionSwipeBehaviorDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PositionSwipeBehaviorDto) && Intrinsics.areEqual(((PositionSwipeBehaviorDto) other).surrogate, this.surrogate);
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
    /* compiled from: PositionSwipeBehaviorDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0089\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012'\b\u0002\u0010\f\u001a!\u0012\u0004\u0012\u00020\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0018\u00010\t\u0012'\b\u0002\u0010\r\u001a!\u0012\u0004\u0012\u00020\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0018\u00010\t\u0012'\b\u0002\u0010\u000e\u001a!\u0012\u0004\u0012\u00020\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0018\u00010\t\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012'\b\u0002\u0010\u0010\u001a!\u0012\u0004\u0012\u00020\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016B±\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R?\u0010\f\u001a!\u0012\u0004\u0012\u00020\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R?\u0010\r\u001a!\u0012\u0004\u0012\u00020\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b:\u00100\u001a\u0004\b9\u00107R?\u0010\u000e\u001a!\u0012\u0004\u0012\u00020\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b<\u00100\u001a\u0004\b;\u00107R/\u0010\u000f\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00101\u0012\u0004\b>\u00100\u001a\u0004\b=\u00103R?\u0010\u0010\u001a!\u0012\u0004\u0012\u00020\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00105\u0012\u0004\b@\u00100\u001a\u0004\b?\u00107R\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010A\u0012\u0004\bC\u00100\u001a\u0004\bB\u0010&R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010D\u0012\u0004\bG\u00100\u001a\u0004\bE\u0010FR\"\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010A\u0012\u0004\bI\u00100\u001a\u0004\bH\u0010&¨\u0006L"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Surrogate;", "", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeTypeDto;", "swipe_type", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "actuation_percentage", "", "", "Lcom/robinhood/idl/serialization/StructSerializer;", "text", "text_color", "background_color", "background_opacity", "alert", "deeplink", "", "show_loading_indicator", "logging_identifier", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionSwipeTypeDto;FLjava/util/Map;Ljava/util/Map;Ljava/util/Map;FLjava/util/Map;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/portfolio/v1/PositionSwipeTypeDto;FLjava/util/Map;Ljava/util/Map;Ljava/util/Map;FLjava/util/Map;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_portfolio_v1_externalRelease", "(Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeTypeDto;", "getSwipe_type", "()Lbonfire/proto/idl/portfolio/v1/PositionSwipeTypeDto;", "getSwipe_type$annotations", "()V", "F", "getActuation_percentage", "()F", "getActuation_percentage$annotations", "Ljava/util/Map;", "getText", "()Ljava/util/Map;", "getText$annotations", "getText_color", "getText_color$annotations", "getBackground_color", "getBackground_color$annotations", "getBackground_opacity", "getBackground_opacity$annotations", "getAlert", "getAlert$annotations", "Ljava/lang/String;", "getDeeplink", "getDeeplink$annotations", "Z", "getShow_loading_indicator", "()Z", "getShow_loading_indicator$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Companion", "$serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final float actuation_percentage;
        private final Map<String, Object> alert;
        private final Map<String, Object> background_color;
        private final float background_opacity;
        private final String deeplink;
        private final String logging_identifier;
        private final boolean show_loading_indicator;
        private final PositionSwipeTypeDto swipe_type;
        private final Map<String, Object> text;
        private final Map<String, Object> text_color;

        public Surrogate() {
            this((PositionSwipeTypeDto) null, 0.0f, (Map) null, (Map) null, (Map) null, 0.0f, (Map) null, (String) null, false, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.swipe_type == surrogate.swipe_type && Float.compare(this.actuation_percentage, surrogate.actuation_percentage) == 0 && Intrinsics.areEqual(this.text, surrogate.text) && Intrinsics.areEqual(this.text_color, surrogate.text_color) && Intrinsics.areEqual(this.background_color, surrogate.background_color) && Float.compare(this.background_opacity, surrogate.background_opacity) == 0 && Intrinsics.areEqual(this.alert, surrogate.alert) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && this.show_loading_indicator == surrogate.show_loading_indicator && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier);
        }

        public int hashCode() {
            int iHashCode = ((this.swipe_type.hashCode() * 31) + Float.hashCode(this.actuation_percentage)) * 31;
            Map<String, Object> map = this.text;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, Object> map2 = this.text_color;
            int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, Object> map3 = this.background_color;
            int iHashCode4 = (((iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31) + Float.hashCode(this.background_opacity)) * 31;
            Map<String, Object> map4 = this.alert;
            int iHashCode5 = (iHashCode4 + (map4 == null ? 0 : map4.hashCode())) * 31;
            String str = this.deeplink;
            int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.show_loading_indicator)) * 31;
            String str2 = this.logging_identifier;
            return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(swipe_type=" + this.swipe_type + ", actuation_percentage=" + this.actuation_percentage + ", text=" + this.text + ", text_color=" + this.text_color + ", background_color=" + this.background_color + ", background_opacity=" + this.background_opacity + ", alert=" + this.alert + ", deeplink=" + this.deeplink + ", show_loading_indicator=" + this.show_loading_indicator + ", logging_identifier=" + this.logging_identifier + ")";
        }

        /* compiled from: PositionSwipeBehaviorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Surrogate;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PositionSwipeBehaviorDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionSwipeBehaviorDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionSwipeBehaviorDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionSwipeBehaviorDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionSwipeBehaviorDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionSwipeBehaviorDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionSwipeBehaviorDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionSwipeBehaviorDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionSwipeBehaviorDto.Surrogate._childSerializers$_anonymous_$2();
                }
            }), null, null, null};
        }

        public /* synthetic */ Surrogate(int i, PositionSwipeTypeDto positionSwipeTypeDto, float f, Map map, Map map2, Map map3, float f2, Map map4, String str, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.swipe_type = (i & 1) == 0 ? PositionSwipeTypeDto.INSTANCE.getZeroValue() : positionSwipeTypeDto;
            if ((i & 2) == 0) {
                this.actuation_percentage = 0.0f;
            } else {
                this.actuation_percentage = f;
            }
            if ((i & 4) == 0) {
                this.text = null;
            } else {
                this.text = map;
            }
            if ((i & 8) == 0) {
                this.text_color = null;
            } else {
                this.text_color = map2;
            }
            if ((i & 16) == 0) {
                this.background_color = null;
            } else {
                this.background_color = map3;
            }
            if ((i & 32) == 0) {
                this.background_opacity = 0.0f;
            } else {
                this.background_opacity = f2;
            }
            if ((i & 64) == 0) {
                this.alert = null;
            } else {
                this.alert = map4;
            }
            if ((i & 128) == 0) {
                this.deeplink = null;
            } else {
                this.deeplink = str;
            }
            if ((i & 256) == 0) {
                this.show_loading_indicator = false;
            } else {
                this.show_loading_indicator = z;
            }
            if ((i & 512) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.swipe_type != PositionSwipeTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, PositionSwipeTypeDto.Serializer.INSTANCE, self.swipe_type);
            }
            if (Float.compare(self.actuation_percentage, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 1, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.actuation_percentage));
            }
            if (self.text != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.text);
            }
            if (self.text_color != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.text_color);
            }
            if (self.background_color != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.background_color);
            }
            if (Float.compare(self.background_opacity, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 5, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.background_opacity));
            }
            if (self.alert != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.alert);
            }
            String str = self.deeplink;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str);
            }
            boolean z = self.show_loading_indicator;
            if (z) {
                output.encodeBooleanElement(serialDesc, 8, z);
            }
            String str2 = self.logging_identifier;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(PositionSwipeTypeDto swipe_type, float f, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, float f2, Map<String, ? extends Object> map4, String str, boolean z, String str2) {
            Intrinsics.checkNotNullParameter(swipe_type, "swipe_type");
            this.swipe_type = swipe_type;
            this.actuation_percentage = f;
            this.text = map;
            this.text_color = map2;
            this.background_color = map3;
            this.background_opacity = f2;
            this.alert = map4;
            this.deeplink = str;
            this.show_loading_indicator = z;
            this.logging_identifier = str2;
        }

        public final PositionSwipeTypeDto getSwipe_type() {
            return this.swipe_type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(bonfire.proto.idl.portfolio.p037v1.PositionSwipeTypeDto r3, float r4, java.util.Map r5, java.util.Map r6, java.util.Map r7, float r8, java.util.Map r9, java.lang.String r10, boolean r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r2 = this;
                r14 = r13 & 1
                if (r14 == 0) goto La
                bonfire.proto.idl.portfolio.v1.PositionSwipeTypeDto$Companion r3 = bonfire.proto.idl.portfolio.p037v1.PositionSwipeTypeDto.INSTANCE
                bonfire.proto.idl.portfolio.v1.PositionSwipeTypeDto r3 = r3.getZeroValue()
            La:
                r14 = r13 & 2
                r0 = 0
                if (r14 == 0) goto L10
                r4 = r0
            L10:
                r14 = r13 & 4
                r1 = 0
                if (r14 == 0) goto L16
                r5 = r1
            L16:
                r14 = r13 & 8
                if (r14 == 0) goto L1b
                r6 = r1
            L1b:
                r14 = r13 & 16
                if (r14 == 0) goto L20
                r7 = r1
            L20:
                r14 = r13 & 32
                if (r14 == 0) goto L25
                r8 = r0
            L25:
                r14 = r13 & 64
                if (r14 == 0) goto L2a
                r9 = r1
            L2a:
                r14 = r13 & 128(0x80, float:1.794E-43)
                if (r14 == 0) goto L2f
                r10 = r1
            L2f:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L34
                r11 = 0
            L34:
                r13 = r13 & 512(0x200, float:7.175E-43)
                if (r13 == 0) goto L44
                r14 = r1
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L4f
            L44:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L4f:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.portfolio.p037v1.PositionSwipeBehaviorDto.Surrogate.<init>(bonfire.proto.idl.portfolio.v1.PositionSwipeTypeDto, float, java.util.Map, java.util.Map, java.util.Map, float, java.util.Map, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final float getActuation_percentage() {
            return this.actuation_percentage;
        }

        public final Map<String, Object> getText() {
            return this.text;
        }

        public final Map<String, Object> getText_color() {
            return this.text_color;
        }

        public final Map<String, Object> getBackground_color() {
            return this.background_color;
        }

        public final float getBackground_opacity() {
            return this.background_opacity;
        }

        public final Map<String, Object> getAlert() {
            return this.alert;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final boolean getShow_loading_indicator() {
            return this.show_loading_indicator;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }
    }

    /* compiled from: PositionSwipeBehaviorDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto;", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehavior;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PositionSwipeBehaviorDto, PositionSwipeBehavior> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PositionSwipeBehaviorDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionSwipeBehaviorDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionSwipeBehaviorDto> getBinaryBase64Serializer() {
            return (KSerializer) PositionSwipeBehaviorDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PositionSwipeBehavior> getProtoAdapter() {
            return PositionSwipeBehavior.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionSwipeBehaviorDto getZeroValue() {
            return PositionSwipeBehaviorDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionSwipeBehaviorDto fromProto(PositionSwipeBehavior proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PositionSwipeBehaviorDto(new Surrogate(PositionSwipeTypeDto.INSTANCE.fromProto(proto.getSwipe_type()), proto.getActuation_percentage(), proto.getText(), proto.getText_color(), proto.getBackground_color(), proto.getBackground_opacity(), proto.getAlert(), proto.getDeeplink(), proto.getShow_loading_indicator(), proto.getLogging_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionSwipeBehaviorDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionSwipeBehaviorDto.binaryBase64Serializer_delegate$lambda$4();
            }
        });
        zeroValue = new PositionSwipeBehaviorDto(null, 0.0f, null, null, null, 0.0f, null, null, false, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$4() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PositionSwipeBehaviorDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PositionSwipeBehaviorDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.portfolio.v1.PositionSwipeBehavior", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PositionSwipeBehaviorDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PositionSwipeBehaviorDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PositionSwipeBehaviorDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PositionSwipeBehaviorDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.portfolio.v1.PositionSwipeBehaviorDto";
        }
    }
}
