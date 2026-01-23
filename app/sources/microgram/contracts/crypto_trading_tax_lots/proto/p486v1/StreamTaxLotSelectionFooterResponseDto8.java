package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$Surrogate$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0, reason: use source file name */
/* loaded from: classes14.dex */
public /* synthetic */ class StreamTaxLotSelectionFooterResponseDto8 implements JsonAnnotations2 {
    private final /* synthetic */ String[] names;

    public StreamTaxLotSelectionFooterResponseDto8(String[] names) {
        Intrinsics.checkNotNullParameter(names, "names");
        this.names = names;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return JsonAnnotations2.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof JsonAnnotations2) && Arrays.equals(names(), ((JsonAnnotations2) obj).names());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Arrays.hashCode(this.names) ^ 397397176;
    }

    @Override // kotlinx.serialization.json.JsonAnnotations2
    public final /* synthetic */ String[] names() {
        return this.names;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonNames(names=" + Arrays.toString(this.names) + ")";
    }
}
