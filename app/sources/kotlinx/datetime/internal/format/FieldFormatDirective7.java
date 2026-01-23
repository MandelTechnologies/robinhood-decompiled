package kotlinx.datetime.internal.format;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [Target] */
/* compiled from: FieldFormatDirective.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective$formatter$formatter$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class FieldFormatDirective7<Target> extends FunctionReferenceImpl implements Function1<Target, Integer> {
    FieldFormatDirective7(Object obj) {
        super(1, obj, FieldSpec3.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Target target) {
        return (Integer) ((FieldSpec3) this.receiver).getterNotNull(target);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Object obj) {
        return invoke((FieldFormatDirective7<Target>) obj);
    }
}
