package com.robinhood.curatedproductdiscovery.p291ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: NewProductsLandingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.curatedproductdiscovery.ui.ComposableSingletons$NewProductsLandingFragmentKt$lambda$-1141434637$1 */
/* loaded from: classes15.dex */
final class C33037x211ed3c8 implements Function2<Composer, Integer, Unit> {
    public static final C33037x211ed3c8 INSTANCE = new C33037x211ed3c8();

    C33037x211ed3c8() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1141434637, i, -1, "com.robinhood.curatedproductdiscovery.ui.ComposableSingletons$NewProductsLandingFragmentKt.lambda$-1141434637.<anonymous> (NewProductsLandingFragment.kt:86)");
        }
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (it.hasNext()) {
            ((PrimitiveIterators6) it).nextInt();
            arrayList.add(NewProductCardData.INSTANCE.getMock());
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.curatedproductdiscovery.ui.ComposableSingletons$NewProductsLandingFragmentKt$lambda$-1141434637$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C33037x211ed3c8.invoke$lambda$2$lambda$1((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.curatedproductdiscovery.ui.ComposableSingletons$NewProductsLandingFragmentKt$lambda$-1141434637$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C33037x211ed3c8.invoke$lambda$4$lambda$3((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        NewProductsLandingFragmentKt.NewProductsLandingContent(arrayList, function1, (Function1) objRememberedValue2, composer, 432);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
