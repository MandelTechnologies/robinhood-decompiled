package com.robinhood.android.feature.margin.maintenance.table;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import bonfire.proto.idl.margin.p036v1.MaintenanceTableActionDto;
import com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableState4;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.squareup.wire.AnyMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ActionDto;

/* compiled from: MarginMaintenanceTableComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$3$1$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginMaintenanceTableComposable7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MarginMaintenanceTableState4.Success $this_with;

    MarginMaintenanceTableComposable7(MarginMaintenanceTableState4.Success success) {
        this.$this_with = success;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bonfire.proto.idl.margin.p036v1.MaintenanceTableAction invoke$lambda$1$lambda$0(ActionDto actionDto) {
        AnyMessage concrete;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
            return null;
        }
        return (bonfire.proto.idl.margin.p036v1.MaintenanceTableAction) concrete.unpack(MaintenanceTableActionDto.INSTANCE.getProtoAdapter());
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1545641911, i, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarginMaintenanceTableComposable.kt:76)");
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(this.$this_with.getHeader());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$3$1$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMaintenanceTableComposable7.invoke$lambda$1$lambda$0((ActionDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(40010095);
        SduiColumnsIdl.SduiColumn(persistentList, (Function1) objRememberedValue, bonfire.proto.idl.margin.p036v1.MaintenanceTableAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer, 48, 0);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
