package microgram.p507ui.routing;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonAnnotations;

/* compiled from: RouterApi.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: microgram.ui.routing.RouterApi$Inbound$Teardown$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0, reason: use source file name */
/* loaded from: classes14.dex */
public /* synthetic */ class RouterApi5 implements JsonAnnotations {
    private final /* synthetic */ String discriminator;

    public RouterApi5(String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.discriminator = discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return JsonAnnotations.class;
    }

    @Override // kotlinx.serialization.json.JsonAnnotations
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof JsonAnnotations) && Intrinsics.areEqual(discriminator(), ((JsonAnnotations) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
    }
}
