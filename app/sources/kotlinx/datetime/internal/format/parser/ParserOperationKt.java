package kotlinx.datetime.internal.format.parser;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ParserOperation.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a_\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Output", "", "minDigits", "maxDigits", "spacePadding", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "setter", "", "name", "plusOnExceedsWidth", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "SignedIntParser", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;Ljava/lang/Integer;)Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Target", "", "withMinus", "spaceAndZeroPaddedUnsignedInt", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;Z)Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Object", "Type", "receiver", "value", "position", "nextIndex", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "setWithoutReassigning", "(Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/Object;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ParserOperationKt {
    public static final <Output> Parser6<Output> SignedIntParser(Integer num, Integer num2, Integer num3, AssignableField<? super Output, Integer> setter, String name, Integer num4) {
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(name, "name");
        List listMutableListOf = CollectionsKt.mutableListOf(spaceAndZeroPaddedUnsignedInt(num, num2, num3, setter, name, true));
        if (num4 != null) {
            listMutableListOf.add(spaceAndZeroPaddedUnsignedInt$default(num, num4, num3, setter, name, false, 32, null));
            listMutableListOf.add(new Parser6(CollectionsKt.listOf((Object[]) new ParserOperation[]{new PlainStringParserOperation("+"), new NumberSpanParserOperation(CollectionsKt.listOf(new NumberConsumer6(Integer.valueOf(num4.intValue() + 1), num2, setter, name, false)))}), CollectionsKt.emptyList()));
        } else {
            listMutableListOf.add(spaceAndZeroPaddedUnsignedInt$default(num, num2, num3, setter, name, false, 32, null));
        }
        return new Parser6<>(CollectionsKt.emptyList(), listMutableListOf);
    }

    public static /* synthetic */ Parser6 spaceAndZeroPaddedUnsignedInt$default(Integer num, Integer num2, Integer num3, AssignableField assignableField, String str, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return spaceAndZeroPaddedUnsignedInt(num, num2, num3, assignableField, str, z);
    }

    public static final <Target> Parser6<Target> spaceAndZeroPaddedUnsignedInt(Integer num, Integer num2, Integer num3, AssignableField<? super Target, Integer> setter, String name, boolean z) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(name, "name");
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return spaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths(z, setter, name, iIntValue2, iIntValue);
        }
        Parser6<Target> parser6SpaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths = spaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths(z, setter, name, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            iIntValue2++;
            parser6SpaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths = new Parser6<>(CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new Parser6[]{spaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths(z, setter, name, iIntValue2, iIntValue2), Parser5.concat(CollectionsKt.listOf((Object[]) new Parser6[]{new Parser6(CollectionsKt.listOf(new PlainStringParserOperation(PlaceholderUtils.XXShortPlaceholderText)), CollectionsKt.emptyList()), parser6SpaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths}))}));
        }
        if (iIntValue3 > iIntValue) {
            return Parser5.concat(CollectionsKt.listOf((Object[]) new Parser6[]{new Parser6(CollectionsKt.listOf(new PlainStringParserOperation(StringsKt.repeat(PlaceholderUtils.XXShortPlaceholderText, iIntValue3 - iIntValue))), CollectionsKt.emptyList()), parser6SpaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths}));
        }
        return iIntValue3 == iIntValue ? parser6SpaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths : new Parser6<>(CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new Parser6[]{spaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths(z, setter, name, iIntValue3 + 1, iIntValue), parser6SpaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths}));
    }

    private static final <Target> Parser6<Target> spaceAndZeroPaddedUnsignedInt$numberOfRequiredLengths(boolean z, AssignableField<? super Target, Integer> assignableField, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (z) {
            listCreateListBuilder.add(new PlainStringParserOperation("-"));
        }
        listCreateListBuilder.add(new NumberSpanParserOperation(CollectionsKt.listOf(new NumberConsumer6(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), assignableField, str, z))));
        return new Parser6<>(CollectionsKt.build(listCreateListBuilder), CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Object, Type> Object setWithoutReassigning(final AssignableField<? super Object, Type> assignableField, Object object, final Type type2, int i, int i2) {
        final Type typeTrySetWithoutReassigning = assignableField.trySetWithoutReassigning(object, type2);
        if (typeTrySetWithoutReassigning == null) {
            return ParseResult.INSTANCE.m28858OkQi1bsqg(i2);
        }
        return ParseResult.INSTANCE.m28857ErrorRg3Co2E(i, new Function0<String>() { // from class: kotlinx.datetime.internal.format.parser.ParserOperationKt.setWithoutReassigning.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Attempting to assign conflicting values '" + typeTrySetWithoutReassigning + "' and '" + type2 + "' to field '" + assignableField.getName() + '\'';
            }
        });
    }
}
