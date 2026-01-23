package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AllocationBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class ComposableSingletons$AllocationBarKt$lambda$150110749$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AllocationBarKt$lambda$150110749$1 INSTANCE = new ComposableSingletons$AllocationBarKt$lambda$150110749$1();

    ComposableSingletons$AllocationBarKt$lambda$150110749$1() {
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
            ComposerKt.traceEventStart(150110749, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$AllocationBarKt.lambda$150110749.<anonymous> (AllocationBar.kt:88)");
        }
        Color.Companion companion = Color.INSTANCE;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new AllocationSection(Constants.SdidMigrationStatusCodes.ALREADY_SDID, 0.2f, companion.m6716getBlack0d7_KjU(), null), new AllocationSection(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, 0.2f, companion.m6724getRed0d7_KjU(), null), new AllocationSection(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET, 0.2f, companion.m6717getBlue0d7_KjU(), null), new AllocationSection(Constants.SdidMigrationStatusCodes.MISSING_PARAMS, 0.2f, companion.m6728getYellow0d7_KjU(), null), new AllocationSection(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION, 0.2f, companion.m6721getGreen0d7_KjU(), null));
        long jM6727getWhite0d7_KjU = companion.m6727getWhite0d7_KjU();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$AllocationBarKt$lambda$150110749$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$AllocationBarKt$lambda$150110749$1.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AllocationBarKt.m15574AllocationsIsometricBarwC_cr3g(immutableList3PersistentListOf, Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, jM6727getWhite0d7_KjU, (Function1) objRememberedValue, null, 0.0f, composer, 3504, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String str) {
        return Unit.INSTANCE;
    }
}
