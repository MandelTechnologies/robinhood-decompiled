package kotlinx.datetime.internal.format;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.formatter.Formatter4;
import kotlinx.datetime.internal.format.formatter.FormatterOperation2;
import kotlinx.datetime.internal.format.parser.NumberConsumer3;
import kotlinx.datetime.internal.format.parser.NumberSpanParserOperation;
import kotlinx.datetime.internal.format.parser.Parser6;
import kotlinx.datetime.internal.math;

/* compiled from: FieldFormatDirective.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B7\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lkotlinx/datetime/internal/format/DecimalFractionFieldFormatDirective;", "Target", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "field", "Lkotlinx/datetime/internal/format/FieldSpec;", "Lkotlinx/datetime/internal/DecimalFraction;", "minDigits", "", "maxDigits", "zerosToAdd", "", "(Lkotlinx/datetime/internal/format/FieldSpec;IILjava/util/List;)V", "getField", "()Lkotlinx/datetime/internal/format/FieldSpec;", "formatter", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "parser", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.DecimalFractionFieldFormatDirective, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class FieldFormatDirective2<Target> implements FieldFormatDirective<Target> {
    private final FieldSpec<Target, math> field;
    private final int maxDigits;
    private final int minDigits;
    private final List<Integer> zerosToAdd;

    /* JADX WARN: Multi-variable type inference failed */
    public FieldFormatDirective2(FieldSpec<? super Target, math> field, int i, int i2, List<Integer> zerosToAdd) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(zerosToAdd, "zerosToAdd");
        this.field = field;
        this.minDigits = i;
        this.maxDigits = i2;
        this.zerosToAdd = zerosToAdd;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final FieldSpec<Target, math> getField() {
        return this.field;
    }

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.DecimalFractionFieldFormatDirective$formatter$1 */
    /* synthetic */ class C461621 extends FunctionReferenceImpl implements Function1<Target, math> {
        C461621(Object obj) {
            super(1, obj, FieldSpec3.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ math invoke(Object obj) {
            return invoke((C461621) obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final math invoke(Target target) {
            return (math) ((FieldSpec3) this.receiver).getterNotNull(target);
        }
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public Formatter4<Target> formatter() {
        return new FormatterOperation2(new C461621(this.field.getAccessor()), this.minDigits, this.maxDigits, this.zerosToAdd);
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public Parser6<Target> parser() {
        return new Parser6<>(CollectionsKt.listOf(new NumberSpanParserOperation(CollectionsKt.listOf(new NumberConsumer3(this.minDigits, this.maxDigits, this.field.getAccessor(), this.field.getName())))), CollectionsKt.emptyList());
    }
}
