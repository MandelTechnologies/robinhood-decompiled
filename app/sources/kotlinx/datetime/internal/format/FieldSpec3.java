package kotlinx.datetime.internal.format;

import kotlin.Metadata;
import kotlinx.datetime.internal.format.parser.AssignableField;

/* compiled from: FieldSpec.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lkotlinx/datetime/internal/format/Accessor;", "Object", "Field", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "getter", "container", "(Ljava/lang/Object;)Ljava/lang/Object;", "getterNotNull", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.Accessor, reason: use source file name */
/* loaded from: classes14.dex */
public interface FieldSpec3<Object, Field> extends AssignableField<Object, Field> {
    Field getter(Object container);

    Field getterNotNull(Object container);

    /* compiled from: FieldSpec.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.Accessor$DefaultImpls */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <Object, Field> Field getterNotNull(FieldSpec3<? super Object, Field> fieldSpec3, Object object) {
            Field field = fieldSpec3.getter(object);
            if (field != null) {
                return field;
            }
            throw new IllegalStateException("Field " + fieldSpec3.getName() + " is not set");
        }
    }
}
