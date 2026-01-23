package kotlin.reflect.jvm.internal.impl.types;

import com.plaid.internal.EnumC7081g;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections._Collections3;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.text.StringsKt;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.SimpleType, reason: use source file name */
/* loaded from: classes23.dex */
public abstract class KotlinType4 extends KotlinType5 implements SimpleTypeMarker, TypeArgumentListMarker {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public abstract KotlinType4 makeNullableAsSpecified(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType5
    public abstract KotlinType4 replaceAttributes(TypeAttributes typeAttributes);

    public KotlinType4() {
        super(null);
    }

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            StringsKt.append(sb, "[", DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, it.next(), null, 2, null), "] ");
        }
        sb.append(getConstructor());
        if (!getArguments().isEmpty()) {
            _Collections3.joinTo(getArguments(), sb, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 2) != 0 ? ", " : ", ", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 4) != 0 ? "" : "<", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 8) == 0 ? ">" : "", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 16) != 0 ? -1 : 0, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 32) != 0 ? "..." : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 64) != 0 ? null : null);
        }
        if (isMarkedNullable()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
