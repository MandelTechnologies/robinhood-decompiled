package rh_server_driven_ui.p531v1;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ChartAxisDto.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: rh_server_driven_ui.v1.ChartAxisDto$Surrogate$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0, reason: use source file name */
/* loaded from: classes25.dex */
public /* synthetic */ class ChartAxisDto7 implements JsonAnnotations2 {
    private final /* synthetic */ String[] names;

    public ChartAxisDto7(String[] names) {
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
