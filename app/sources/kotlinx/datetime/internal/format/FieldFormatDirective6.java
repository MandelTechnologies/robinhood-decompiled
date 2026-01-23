package kotlinx.datetime.internal.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.formatter.Formatter4;
import kotlinx.datetime.internal.format.formatter.Formatter6;
import kotlinx.datetime.internal.format.formatter.FormatterOperation5;
import kotlinx.datetime.internal.format.parser.Parser6;
import kotlinx.datetime.internal.format.parser.ParserOperationKt;

/* compiled from: FieldFormatDirective.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"Lkotlinx/datetime/internal/format/UnsignedIntFieldFormatDirective;", "Target", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "field", "", "minDigits", "spacePadding", "<init>", "(Lkotlinx/datetime/internal/format/UnsignedFieldSpec;ILjava/lang/Integer;)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getField", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "I", "Ljava/lang/Integer;", "maxDigits", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class FieldFormatDirective6<Target> implements FieldFormatDirective<Target> {
    private final FieldSpec7<Target> field;
    private final int maxDigits;
    private final int minDigits;
    private final Integer spacePadding;

    /* JADX WARN: Multi-variable type inference failed */
    public FieldFormatDirective6(FieldSpec7<? super Target> field, int i, Integer num) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.field = field;
        this.minDigits = i;
        this.spacePadding = num;
        int maxDigits = field.getMaxDigits();
        this.maxDigits = maxDigits;
        if (i < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is negative").toString());
        }
        if (maxDigits < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + maxDigits + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public /* bridge */ /* synthetic */ FieldSpec getField() {
        return this.field;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public Formatter4<Target> formatter() {
        FormatterOperation5 formatterOperation5 = new FormatterOperation5(new FieldFormatDirective7(this.field.getAccessor()), this.minDigits);
        Integer num = this.spacePadding;
        return num != null ? new Formatter6(formatterOperation5, num.intValue()) : formatterOperation5;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public Parser6<Target> parser() {
        return ParserOperationKt.spaceAndZeroPaddedUnsignedInt$default(Integer.valueOf(this.minDigits), Integer.valueOf(this.maxDigits), this.spacePadding, this.field.getAccessor(), this.field.getName(), false, 32, null);
    }
}
