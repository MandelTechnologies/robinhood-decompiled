package futures_onboarding_value_props.proto.p463v1;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: LottieInfoDto.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: futures_onboarding_value_props.proto.v1.LottieInfoDto$Surrogate$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0, reason: use source file name */
/* loaded from: classes18.dex */
public /* synthetic */ class LottieInfoDto6 implements JsonAnnotations2 {
    private final /* synthetic */ String[] names;

    public LottieInfoDto6(String[] names) {
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
