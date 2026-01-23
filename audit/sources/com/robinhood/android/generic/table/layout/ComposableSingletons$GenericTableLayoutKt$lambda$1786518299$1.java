package com.robinhood.android.generic.table.layout;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.android.generic.table.TestCell;
import com.robinhood.android.generic.table.layout.GenericTableLayoutScope;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GenericTableLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt$lambda$-1786518299$1, reason: invalid class name */
/* loaded from: classes10.dex */
final class ComposableSingletons$GenericTableLayoutKt$lambda$1786518299$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$GenericTableLayoutKt$lambda$1786518299$1 INSTANCE = new ComposableSingletons$GenericTableLayoutKt$lambda$1786518299$1();

    ComposableSingletons$GenericTableLayoutKt$lambda$1786518299$1() {
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
            ComposerKt.traceEventStart(-1786518299, i, -1, "com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt.lambda$-1786518299.<anonymous> (GenericTableLayout.kt:205)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt$lambda$-1786518299$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$GenericTableLayoutKt$lambda$1786518299$1.invoke$lambda$7$lambda$6((GenericTableLayoutScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        GenericTableLayoutKt.GenericTableLayout(null, null, null, (Function1) objRememberedValue, composer, 3072, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(GenericTableLayoutScope GenericTableLayout) {
        Intrinsics.checkNotNullParameter(GenericTableLayout, "$this$GenericTableLayout");
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(new TestCell("Header " + i));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
        ArrayList arrayList2 = new ArrayList(20);
        for (int i2 = 0; i2 < 20; i2++) {
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            ArrayList arrayList3 = new ArrayList(20);
            for (int i3 = 0; i3 < 20; i3++) {
                arrayList3.add(new TestCell(i2 + ":" + i3));
            }
            arrayList2.add(new GenericRow(string2, arrayList3, false, null, null, 28, null));
        }
        GenericTableData genericTableData = new GenericTableData(immutableList, extensions2.toImmutableList(arrayList2));
        StickyColumn.StickAtStartAfterOnScreen stickAtStartAfterOnScreen = new StickyColumn.StickAtStartAfterOnScreen(3, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(55)), false, 4, null);
        ComposableSingletons$GenericTableLayoutKt composableSingletons$GenericTableLayoutKt = ComposableSingletons$GenericTableLayoutKt.INSTANCE;
        GenericTableLayoutScope.DefaultImpls.m14999tableY3c_0f4$default(GenericTableLayout, Constants.SdidMigrationStatusCodes.ALREADY_SDID, genericTableData, stickAtStartAfterOnScreen, null, false, null, null, null, composableSingletons$GenericTableLayoutKt.m14983getLambda$2008755447$lib_generic_table_externalDebug(), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        GenericTableLayoutScope.DefaultImpls.item$default(GenericTableLayout, null, composableSingletons$GenericTableLayoutKt.m14984getLambda$537609156$lib_generic_table_externalDebug(), 1, null);
        ArrayList arrayList4 = new ArrayList(20);
        for (int i4 = 0; i4 < 20; i4++) {
            arrayList4.add(new TestCell("Header " + i4));
        }
        ImmutableList immutableList2 = extensions2.toImmutableList(arrayList4);
        ArrayList arrayList5 = new ArrayList(20);
        for (int i5 = 0; i5 < 20; i5++) {
            String string3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            ArrayList arrayList6 = new ArrayList(20);
            for (int i6 = 0; i6 < 20; i6++) {
                arrayList6.add(new TestCell(i5 + ":" + i6));
            }
            arrayList5.add(new GenericRow(string3, arrayList6, false, null, null, 28, null));
        }
        GenericTableLayoutScope.DefaultImpls.m14999tableY3c_0f4$default(GenericTableLayout, Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, new GenericTableData(immutableList2, extensions2.toImmutableList(arrayList5)), new StickyColumn.StickAtEndUntilOnScreen(5), null, false, null, null, null, ComposableSingletons$GenericTableLayoutKt.INSTANCE.getLambda$1420524992$lib_generic_table_externalDebug(), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        return Unit.INSTANCE;
    }
}
