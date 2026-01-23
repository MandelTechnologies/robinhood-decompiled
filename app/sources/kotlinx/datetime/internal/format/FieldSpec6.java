package kotlinx.datetime.internal.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty4;
import kotlinx.datetime.internal.format.FieldSpec3;

/* compiled from: FieldSpec.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lkotlinx/datetime/internal/format/PropertyAccessor;", "Object", "Field", "Lkotlinx/datetime/internal/format/Accessor;", "property", "Lkotlin/reflect/KMutableProperty1;", "(Lkotlin/reflect/KMutableProperty1;)V", "name", "", "getName", "()Ljava/lang/String;", "getter", "container", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySetWithoutReassigning", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.PropertyAccessor, reason: use source file name */
/* loaded from: classes14.dex */
public final class FieldSpec6<Object, Field> implements FieldSpec3<Object, Field> {
    private final KProperty4<Object, Field> property;

    public FieldSpec6(KProperty4<Object, Field> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.property = property;
    }

    @Override // kotlinx.datetime.internal.format.FieldSpec3
    public Field getterNotNull(Object object) {
        return (Field) FieldSpec3.DefaultImpls.getterNotNull(this, object);
    }

    @Override // kotlinx.datetime.internal.format.parser.AssignableField
    public String getName() {
        return this.property.getName();
    }

    @Override // kotlinx.datetime.internal.format.parser.AssignableField
    public Field trySetWithoutReassigning(Object container, Field newValue) {
        Field field = this.property.get(container);
        if (field == null) {
            this.property.set(container, newValue);
            return null;
        }
        if (Intrinsics.areEqual(field, newValue)) {
            return null;
        }
        return field;
    }

    @Override // kotlinx.datetime.internal.format.FieldSpec3
    public Field getter(Object container) {
        return this.property.get(container);
    }
}
