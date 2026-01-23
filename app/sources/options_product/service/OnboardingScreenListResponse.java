package options_product.service;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: OnboardingScreenListResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Loptions_product/service/OnboardingScreenListResponse;", "Lcom/squareup/wire/Message;", "", "screen_list", "", "Loptions_product/service/OnboardingScreenResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getScreen_list", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class OnboardingScreenListResponse extends Message {

    @JvmField
    public static final ProtoAdapter<OnboardingScreenListResponse> ADAPTER;

    @WireField(adapter = "options_product.service.OnboardingScreenResponse#ADAPTER", jsonName = "screenList", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<OnboardingScreenResponse> screen_list;

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingScreenListResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29519newBuilder();
    }

    public /* synthetic */ OnboardingScreenListResponse(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingScreenListResponse(List<OnboardingScreenResponse> screen_list, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(screen_list, "screen_list");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen_list = Internal.immutableCopyOf("screen_list", screen_list);
    }

    public final List<OnboardingScreenResponse> getScreen_list() {
        return this.screen_list;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29519newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OnboardingScreenListResponse)) {
            return false;
        }
        OnboardingScreenListResponse onboardingScreenListResponse = (OnboardingScreenListResponse) other;
        return Intrinsics.areEqual(unknownFields(), onboardingScreenListResponse.unknownFields()) && Intrinsics.areEqual(this.screen_list, onboardingScreenListResponse.screen_list);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.screen_list.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.screen_list.isEmpty()) {
            arrayList.add("screen_list=" + this.screen_list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingScreenListResponse{", "}", 0, null, null, 56, null);
    }

    public final OnboardingScreenListResponse copy(List<OnboardingScreenResponse> screen_list, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(screen_list, "screen_list");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OnboardingScreenListResponse(screen_list, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardingScreenListResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OnboardingScreenListResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.OnboardingScreenListResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OnboardingScreenListResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + OnboardingScreenResponse.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getScreen_list());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OnboardingScreenListResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                OnboardingScreenResponse.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getScreen_list());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OnboardingScreenListResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OnboardingScreenResponse.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getScreen_list());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingScreenListResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OnboardingScreenListResponse(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(OnboardingScreenResponse.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingScreenListResponse redact(OnboardingScreenListResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getScreen_list(), OnboardingScreenResponse.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
