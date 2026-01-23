package kotlinx.datetime.internal.format;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.formatter.Formatter4;
import kotlinx.datetime.internal.format.formatter.FormatterOperation4;
import kotlinx.datetime.internal.format.parser.AssignableField;
import kotlinx.datetime.internal.format.parser.Parser6;
import kotlinx.datetime.internal.format.parser.StringSetParserOperation;

/* compiled from: FieldFormatDirective.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0013B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective;", "Target", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "field", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "values", "", "", "name", "(Lkotlinx/datetime/internal/format/UnsignedFieldSpec;Ljava/util/List;Ljava/lang/String;)V", "getField", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "formatter", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "getStringValue", "target", "(Ljava/lang/Object;)Ljava/lang/String;", "parser", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "AssignableString", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class FieldFormatDirective3<Target> implements FieldFormatDirective<Target> {
    private final FieldSpec7<Target> field;
    private final String name;
    private final List<String> values;

    /* JADX WARN: Multi-variable type inference failed */
    public FieldFormatDirective3(FieldSpec7<? super Target> field, List<String> values, String name) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(name, "name");
        this.field = field;
        this.values = values;
        this.name = name;
        if (values.size() == (field.getMaxValue() - field.getMinValue()) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + values.size() + ") in " + values + " does not match the range of the field (" + ((field.getMaxValue() - field.getMinValue()) + 1) + ')').toString());
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public /* bridge */ /* synthetic */ FieldSpec getField() {
        return this.field;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final FieldSpec7<Target> getField() {
        return this.field;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStringValue(Target target) {
        int iIntValue = this.field.getAccessor().getterNotNull(target).intValue();
        String str = (String) CollectionsKt.getOrNull(this.values, iIntValue - this.field.getMinValue());
        if (str != null) {
            return str;
        }
        return "The value " + iIntValue + " of " + this.field.getName() + " does not have a corresponding string representation";
    }

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective$AssignableString;", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "", "(Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective;)V", "name", "getName", "()Ljava/lang/String;", "trySetWithoutReassigning", "container", "newValue", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective$AssignableString */
    private final class AssignableString implements AssignableField<Target, String> {
        public AssignableString() {
        }

        @Override // kotlinx.datetime.internal.format.parser.AssignableField
        public /* bridge */ /* synthetic */ String trySetWithoutReassigning(Object obj, String str) {
            return trySetWithoutReassigning2((AssignableString) obj, str);
        }

        /* renamed from: trySetWithoutReassigning, reason: avoid collision after fix types in other method */
        public String trySetWithoutReassigning2(Target container, String newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            Integer numTrySetWithoutReassigning = FieldFormatDirective3.this.getField().getAccessor().trySetWithoutReassigning(container, Integer.valueOf(((FieldFormatDirective3) FieldFormatDirective3.this).values.indexOf(newValue) + FieldFormatDirective3.this.getField().getMinValue()));
            if (numTrySetWithoutReassigning == null) {
                return null;
            }
            FieldFormatDirective3<Target> fieldFormatDirective3 = FieldFormatDirective3.this;
            return (String) ((FieldFormatDirective3) fieldFormatDirective3).values.get(numTrySetWithoutReassigning.intValue() - fieldFormatDirective3.getField().getMinValue());
        }

        @Override // kotlinx.datetime.internal.format.parser.AssignableField
        public String getName() {
            return ((FieldFormatDirective3) FieldFormatDirective3.this).name;
        }
    }

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective$formatter$1 */
    /* synthetic */ class C461631 extends FunctionReferenceImpl implements Function1<Target, String> {
        C461631(Object obj) {
            super(1, obj, FieldFormatDirective3.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Object obj) {
            return invoke((C461631) obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Target target) {
            return ((FieldFormatDirective3) this.receiver).getStringValue(target);
        }
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public Formatter4<Target> formatter() {
        return new FormatterOperation4(new C461631(this));
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public Parser6<Target> parser() {
        return new Parser6<>(CollectionsKt.listOf(new StringSetParserOperation(this.values, new AssignableString(), "one of " + this.values + " for " + this.name)), CollectionsKt.emptyList());
    }
}
