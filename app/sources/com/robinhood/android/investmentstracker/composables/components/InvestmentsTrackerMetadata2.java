package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentMetadataDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentMetadataDetailsRowDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerDisconnectedDataDto;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponentType;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerMetadataViewModel;
import com.singular.sdk.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: InvestmentsTrackerMetadata.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerMetadataKt$lambda$-1165705469$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerMetadata2 implements Function2<Composer, Integer, Unit> {
    public static final InvestmentsTrackerMetadata2 INSTANCE = new InvestmentsTrackerMetadata2();

    InvestmentsTrackerMetadata2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165705469, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerMetadataKt.lambda$-1165705469.<anonymous> (InvestmentsTrackerMetadata.kt:39)");
        }
        InvestmentsTrackerComponentType investmentsTrackerComponentType = InvestmentsTrackerComponentType.METADATA;
        ColorDto colorDto = ColorDto.COLOR_FLARE;
        InvestmentsTrackerMetadataViewModel investmentsTrackerMetadataViewModel = new InvestmentsTrackerMetadataViewModel(investmentsTrackerComponentType, new InvestmentsTrackerComponentMetadataDetailsDto("Header", (List<InvestmentsTrackerComponentMetadataDetailsRowDto>) CollectionsKt.listOf(new InvestmentsTrackerComponentMetadataDetailsRowDto("Left text", "Right text", Constants.SdidMigrationStatusCodes.ALREADY_SDID, "Bottom left", "", new InvestmentsTrackerDisconnectedDataDto("Disconnected", new ThemedColorDto(colorDto, colorDto), Constants.SdidMigrationStatusCodes.ALREADY_SDID)))), Constants.SdidMigrationStatusCodes.ALREADY_SDID, new SecurityFilter(false));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerMetadataKt$lambda$-1165705469$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerMetadata2.invoke$lambda$1$lambda$0((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerMetadata4.InvestmentsTrackerMetadata(investmentsTrackerMetadataViewModel, (Function2) objRememberedValue, null, composer, 48, 4);
        InvestmentsTrackerMetadataViewModel investmentsTrackerMetadataViewModel2 = new InvestmentsTrackerMetadataViewModel(investmentsTrackerComponentType, new InvestmentsTrackerComponentMetadataDetailsDto("Header", (List<InvestmentsTrackerComponentMetadataDetailsRowDto>) CollectionsKt.listOf(new InvestmentsTrackerComponentMetadataDetailsRowDto("Left text", "Right text", Constants.SdidMigrationStatusCodes.ALREADY_SDID, "Bottom left", "", null))), Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, new SecurityFilter(false));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerMetadataKt$lambda$-1165705469$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerMetadata2.invoke$lambda$3$lambda$2((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerMetadata4.InvestmentsTrackerMetadata(investmentsTrackerMetadataViewModel2, (Function2) objRememberedValue2, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }
}
