package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentAllocationsBarDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentAllocationsBarSectionDetailsDto;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponentType;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerAllocationsBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAllocationsBarKt$lambda$1174035363$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerAllocationsBar3 implements Function2<Composer, Integer, Unit> {
    public static final InvestmentsTrackerAllocationsBar3 INSTANCE = new InvestmentsTrackerAllocationsBar3();

    InvestmentsTrackerAllocationsBar3() {
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
            ComposerKt.traceEventStart(1174035363, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAllocationsBarKt.lambda$1174035363.<anonymous> (InvestmentsTrackerAllocationsBar.kt:24)");
        }
        InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel = new InvestmentsTrackerAllocationsBarViewModel(new InvestmentsTrackerComponentAllocationsBarDetailsDto("Your assets", "$242,000.00", CollectionsKt.listOf((Object[]) new InvestmentsTrackerComponentAllocationsBarSectionDetailsDto[]{new InvestmentsTrackerComponentAllocationsBarSectionDetailsDto(Constants.SdidMigrationStatusCodes.ALREADY_SDID, "#ff0f0fff", 0.2d), new InvestmentsTrackerComponentAllocationsBarSectionDetailsDto(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, "#ffff00f0", 0.1d), new InvestmentsTrackerComponentAllocationsBarSectionDetailsDto(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET, "#fff0f0f0", 0.4d), new InvestmentsTrackerComponentAllocationsBarSectionDetailsDto(Constants.SdidMigrationStatusCodes.MISSING_PARAMS, "#ffff0000", 0.3d)}), null, 8, null), Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, InvestmentsTrackerComponentType.ALLOCATION_BAR, "", new SecurityFilter(false));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAllocationsBarKt$lambda$1174035363$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerAllocationsBar3.invoke$lambda$1$lambda$0((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerAllocationsBar4.InvestmentsTrackerAllocationsBar(investmentsTrackerAllocationsBarViewModel, (Function2) objRememberedValue, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        return Unit.INSTANCE;
    }
}
