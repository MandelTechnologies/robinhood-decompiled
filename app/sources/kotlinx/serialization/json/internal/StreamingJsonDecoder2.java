package kotlinx.serialization.json.internal;

import com.robinhood.android.optionchain.chainsettings.logging.OptionChainCustomizationLogging;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.UStrings;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: StreamingJsonDecoder.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/json/Json;)V", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeElementIndex", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeInt", "decodeLong", "", "decodeByte", "", "decodeShort", "", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes, reason: use source file name */
/* loaded from: classes14.dex */
public final class StreamingJsonDecoder2 extends AbstractDecoder {
    private final JsonReader lexer;
    private final SerializersModule serializersModule;

    public StreamingJsonDecoder2(JsonReader lexer, Json json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
    }

    @Override // kotlinx.serialization.encoding.Decoding2, kotlinx.serialization.encoding.Decoding
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.Decoding
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException(OptionChainCustomizationLogging.UNSUPPORTED_TOAST_IDENTIFIER);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoding2
    public int decodeInt() {
        JsonReader jsonReader = this.lexer;
        String strConsumeStringLenient = jsonReader.consumeStringLenient();
        try {
            return UStrings.toUInt(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            JsonReader.fail$default(jsonReader, "Failed to parse type 'UInt' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new ExceptionsH();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoding2
    public long decodeLong() {
        JsonReader jsonReader = this.lexer;
        String strConsumeStringLenient = jsonReader.consumeStringLenient();
        try {
            return UStrings.toULong(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            JsonReader.fail$default(jsonReader, "Failed to parse type 'ULong' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new ExceptionsH();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoding2
    public byte decodeByte() {
        JsonReader jsonReader = this.lexer;
        String strConsumeStringLenient = jsonReader.consumeStringLenient();
        try {
            return UStrings.toUByte(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            JsonReader.fail$default(jsonReader, "Failed to parse type 'UByte' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new ExceptionsH();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoding2
    public short decodeShort() {
        JsonReader jsonReader = this.lexer;
        String strConsumeStringLenient = jsonReader.consumeStringLenient();
        try {
            return UStrings.toUShort(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            JsonReader.fail$default(jsonReader, "Failed to parse type 'UShort' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new ExceptionsH();
        }
    }
}
