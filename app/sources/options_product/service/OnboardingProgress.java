package options_product.service;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: OnboardingProgress.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Loptions_product/service/OnboardingProgress;", "Lcom/squareup/wire/Message;", "", "number_of_segments", "", "current_segment", "segment_progress", "", "unknownFields", "Lokio/ByteString;", "<init>", "(IIFLokio/ByteString;)V", "getNumber_of_segments", "()I", "getCurrent_segment", "getSegment_progress", "()F", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class OnboardingProgress extends Message {

    @JvmField
    public static final ProtoAdapter<OnboardingProgress> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "currentSegment", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int current_segment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfSegments", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int number_of_segments;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "segmentProgress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float segment_progress;

    public OnboardingProgress() {
        this(0, 0, 0.0f, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29518newBuilder();
    }

    public final int getNumber_of_segments() {
        return this.number_of_segments;
    }

    public final int getCurrent_segment() {
        return this.current_segment;
    }

    public final float getSegment_progress() {
        return this.segment_progress;
    }

    public /* synthetic */ OnboardingProgress(int i, int i2, float f, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingProgress(int i, int i2, float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.number_of_segments = i;
        this.current_segment = i2;
        this.segment_progress = f;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29518newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OnboardingProgress)) {
            return false;
        }
        OnboardingProgress onboardingProgress = (OnboardingProgress) other;
        return Intrinsics.areEqual(unknownFields(), onboardingProgress.unknownFields()) && this.number_of_segments == onboardingProgress.number_of_segments && this.current_segment == onboardingProgress.current_segment && this.segment_progress == onboardingProgress.segment_progress;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.number_of_segments)) * 37) + Integer.hashCode(this.current_segment)) * 37) + Float.hashCode(this.segment_progress);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("number_of_segments=" + this.number_of_segments);
        arrayList.add("current_segment=" + this.current_segment);
        arrayList.add("segment_progress=" + this.segment_progress);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingProgress{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OnboardingProgress copy$default(OnboardingProgress onboardingProgress, int i, int i2, float f, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = onboardingProgress.number_of_segments;
        }
        if ((i3 & 2) != 0) {
            i2 = onboardingProgress.current_segment;
        }
        if ((i3 & 4) != 0) {
            f = onboardingProgress.segment_progress;
        }
        if ((i3 & 8) != 0) {
            byteString = onboardingProgress.unknownFields();
        }
        return onboardingProgress.copy(i, i2, f, byteString);
    }

    public final OnboardingProgress copy(int number_of_segments, int current_segment, float segment_progress, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OnboardingProgress(number_of_segments, current_segment, segment_progress, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardingProgress.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OnboardingProgress>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.OnboardingProgress$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OnboardingProgress value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getNumber_of_segments() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getNumber_of_segments()));
                }
                if (value.getCurrent_segment() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getCurrent_segment()));
                }
                return !Float.valueOf(value.getSegment_progress()).equals(Float.valueOf(0.0f)) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getSegment_progress())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OnboardingProgress value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNumber_of_segments() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNumber_of_segments()));
                }
                if (value.getCurrent_segment() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCurrent_segment()));
                }
                if (!Float.valueOf(value.getSegment_progress()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getSegment_progress()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OnboardingProgress value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Float.valueOf(value.getSegment_progress()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getSegment_progress()));
                }
                if (value.getCurrent_segment() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCurrent_segment()));
                }
                if (value.getNumber_of_segments() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNumber_of_segments()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingProgress redact(OnboardingProgress value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OnboardingProgress.copy$default(value, 0, 0, 0.0f, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingProgress decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                float fFloatValue = 0.0f;
                int iIntValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OnboardingProgress(iIntValue, iIntValue2, fFloatValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
