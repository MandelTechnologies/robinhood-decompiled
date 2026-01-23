package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.internal.format.formatter.Formatter4;
import kotlinx.datetime.internal.format.formatter.Formatter5;
import kotlinx.datetime.internal.format.parser.Parser5;
import kotlinx.datetime.internal.format.parser.Parser6;
import kotlinx.datetime.internal.format.parser.SignParser;

/* compiled from: FormatStructure.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lkotlinx/datetime/internal/format/SignedFormatStructure;", "T", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "Lkotlinx/datetime/internal/format/FormatStructure;", "format", "", "withPlusSign", "<init>", "(Lkotlinx/datetime/internal/format/FormatStructure;Z)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/FormatStructure;", "getFormat", "()Lkotlinx/datetime/internal/format/FormatStructure;", "Z", "getWithPlusSign", "()Z", "", "Lkotlinx/datetime/internal/format/FieldSign;", "fieldSigns", "Ljava/util/Set;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SignedFormatStructure<T> implements NonConcatenatedFormatStructure<T> {
    private final Set<FieldSpec4<T>> fieldSigns;
    private final FormatStructure<T> format;
    private final boolean withPlusSign;

    /* JADX WARN: Multi-variable type inference failed */
    public SignedFormatStructure(FormatStructure<? super T> format2, boolean z) {
        Intrinsics.checkNotNullParameter(format2, "format");
        this.format = format2;
        this.withPlusSign = z;
        List listBasicFormats = FormatStructureKt.basicFormats(format2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listBasicFormats.iterator();
        while (it.hasNext()) {
            FieldSpec4 sign = ((FieldFormatDirective) it.next()).getField().getSign();
            if (sign != null) {
                arrayList.add(sign);
            }
        }
        Set<FieldSpec4<T>> set = CollectionsKt.toSet(arrayList);
        this.fieldSigns = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    public final FormatStructure<T> getFormat() {
        return this.format;
    }

    public String toString() {
        return "SignedFormatStructure(" + this.format + ')';
    }

    public boolean equals(Object other) {
        if (!(other instanceof SignedFormatStructure)) {
            return false;
        }
        SignedFormatStructure signedFormatStructure = (SignedFormatStructure) other;
        return Intrinsics.areEqual(this.format, signedFormatStructure.format) && this.withPlusSign == signedFormatStructure.withPlusSign;
    }

    public int hashCode() {
        return (this.format.hashCode() * 31) + Boolean.hashCode(this.withPlusSign);
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public Parser6<T> parser() {
        return Parser5.concat(CollectionsKt.listOf((Object[]) new Parser6[]{new Parser6(CollectionsKt.listOf(new SignParser(new Function2<T, Boolean, Unit>(this) { // from class: kotlinx.datetime.internal.format.SignedFormatStructure.parser.1
            final /* synthetic */ SignedFormatStructure<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Boolean bool) {
                invoke((C461691) obj, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(T t, boolean z) {
                for (FieldSpec4 fieldSpec4 : ((SignedFormatStructure) this.this$0).fieldSigns) {
                    fieldSpec4.isNegative().trySetWithoutReassigning(t, Boolean.valueOf(z != Intrinsics.areEqual(fieldSpec4.isNegative().getter(t), Boolean.TRUE)));
                }
            }
        }, this.withPlusSign, "sign for " + this.fieldSigns)), CollectionsKt.emptyList()), this.format.parser()}));
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public Formatter4<T> formatter() {
        return new Formatter5(this.format.formatter(), new C461681(this), this.withPlusSign);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean formatter$checkIfAllNegative(SignedFormatStructure<? super T> signedFormatStructure, T t) {
        boolean z = false;
        for (FieldSpec4<? super T> fieldSpec4 : ((SignedFormatStructure) signedFormatStructure).fieldSigns) {
            if (Intrinsics.areEqual(fieldSpec4.isNegative().getter(t), Boolean.TRUE)) {
                z = true;
            } else if (!fieldSpec4.isZero(t)) {
                return false;
            }
        }
        return z;
    }

    /* compiled from: FormatStructure.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.SignedFormatStructure$formatter$1 */
    /* synthetic */ class C461681 extends FunctionReferenceImpl implements Function1<T, Boolean> {
        final /* synthetic */ SignedFormatStructure<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C461681(SignedFormatStructure<? super T> signedFormatStructure) {
            super(1, Intrinsics.Kotlin.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
            this.this$0 = signedFormatStructure;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t) {
            return Boolean.valueOf(SignedFormatStructure.formatter$checkIfAllNegative(this.this$0, t));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C461681) obj);
        }
    }
}
