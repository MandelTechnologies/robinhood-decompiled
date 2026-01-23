package com.robinhood.android.crypto.costbasis.details.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import nummus.p512v1.CostBasisBottomSheetDto;

/* compiled from: CryptoCostBasisDetailsListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.costbasis.details.list.ComposableSingletons$CryptoCostBasisDetailsListComposableKt$lambda$601418833$1 */
/* loaded from: classes2.dex */
final class C12833xd54ea493 implements Function2<Composer, Integer, Unit> {
    public static final C12833xd54ea493 INSTANCE = new C12833xd54ea493();

    C12833xd54ea493() {
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
            ComposerKt.traceEventStart(601418833, i, -1, "com.robinhood.android.crypto.costbasis.details.list.ComposableSingletons$CryptoCostBasisDetailsListComposableKt.lambda$601418833.<anonymous> (CryptoCostBasisDetailsListComposable.kt:411)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState = new CryptoCostBasisDetailsListViewState(false, companion.invoke("Title"), companion.invoke("Subtitle"), Boolean.FALSE, new BreakdownCardState(companion.invoke("Deposited on 9/12/25"), "1,234 DOGE", "3 DOGE", "43 DOGE", new CostBasisBottomSheetDto("Sheet title", "Body markdown")), extensions2.persistentListOf(new CostBasisLotRowData(Constants.SdidMigrationStatusCodes.ALREADY_SDID, "12 DOGE", "$23,332", "9/12/2025"), new CostBasisLotRowData(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, "11 DOGE", "$2,332", "9/13/2025")), null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.list.ComposableSingletons$CryptoCostBasisDetailsListComposableKt$lambda$601418833$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposableContent(cryptoCostBasisDetailsListViewState, (Function0) objRememberedValue, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
