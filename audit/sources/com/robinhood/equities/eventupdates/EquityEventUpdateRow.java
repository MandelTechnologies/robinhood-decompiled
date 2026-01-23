package com.robinhood.equities.eventupdates;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: EquityEventUpdateRow.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EquityEventUpdateDto;", "update", "j$/time/ZoneId", "zoneId", "Landroidx/compose/ui/Modifier;", "modifier", "", "EquityEventUpdateRow", "(Lcom/robinhood/arsenal/proto/v1/idl/EquityEventUpdateDto;Lj$/time/ZoneId;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EquityEventUpdatePlaceholderRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-equity-event-updates_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdateRowKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class EquityEventUpdateRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEventUpdatePlaceholderRow$lambda$5(Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityEventUpdatePlaceholderRow(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEventUpdateRow$lambda$4(EquityEventUpdateDto equityEventUpdateDto, ZoneId zoneId, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityEventUpdateRow(equityEventUpdateDto, zoneId, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityEventUpdateRow(final EquityEventUpdateDto update, final ZoneId zoneId, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        Object objM28550constructorimpl;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Composer composerStartRestartGroup = composer.startRestartGroup(419858469);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(update) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(zoneId) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(419858469, i3, -1, "com.robinhood.equities.eventupdates.EquityEventUpdateRow (EquityEventUpdateRow.kt:28)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Object created_at = update.getCreated_at();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(created_at);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                Function0 function0 = null;
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM;
                        Instant instant = Instant.parse(update.getCreated_at());
                        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
                        objM28550constructorimpl = Result.m28550constructorimpl(localDateFormatter.format(Instants.toLocalDate(instant, zoneId)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                        objM28550constructorimpl = null;
                    }
                    objRememberedValue = (String) objM28550constructorimpl;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, update.getTitle(), (String) objRememberedValue, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.f2779x59907a3d, (DefaultConstructorMarker) null);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-242916302);
                if (update.getS3_url().length() > 0) {
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(update);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdateRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityEventUpdateRow.EquityEventUpdateRow$lambda$3$lambda$2(navigator, context, update);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function0 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierFillMaxWidth$default, bentoBaseRowState, false, false, false, 0L, function0, composerStartRestartGroup, BentoBaseRowState.$stable << 3, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdateRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityEventUpdateRow.EquityEventUpdateRow$lambda$4(update, zoneId, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object created_at2 = update.getCreated_at();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(created_at2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            Function0 function02 = null;
            if (!zChanged) {
                Result.Companion companion3 = Result.INSTANCE;
                LocalDateFormatter localDateFormatter2 = LocalDateFormatter.MEDIUM;
                Instant instant2 = Instant.parse(update.getCreated_at());
                Intrinsics.checkNotNullExpressionValue(instant2, "parse(...)");
                objM28550constructorimpl = Result.m28550constructorimpl(localDateFormatter2.format(Instants.toLocalDate(instant2, zoneId)));
                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                }
                objRememberedValue = (String) objM28550constructorimpl;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState((BentoBaseRowState.Start) null, update.getTitle(), (String) objRememberedValue, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.f2779x59907a3d, (DefaultConstructorMarker) null);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-242916302);
                if (update.getS3_url().length() > 0) {
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierFillMaxWidth$default2, bentoBaseRowState2, false, false, false, 0L, function02, composerStartRestartGroup, BentoBaseRowState.$stable << 3, 60);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEventUpdateRow$lambda$3$lambda$2(Navigator navigator, Context context, EquityEventUpdateDto equityEventUpdateDto) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new PdfRendererIntentKey(equityEventUpdateDto.getS3_url(), equityEventUpdateDto.getTitle()), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    public static final void EquityEventUpdatePlaceholderRow(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-184590562);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-184590562, i3, -1, "com.robinhood.equities.eventupdates.EquityEventUpdatePlaceholderRow (EquityEventUpdateRow.kt:67)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-1107055730, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdateRowKt.EquityEventUpdatePlaceholderRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1107055730, i5, -1, "com.robinhood.equities.eventupdates.EquityEventUpdatePlaceholderRow.<anonymous> (EquityEventUpdateRow.kt:71)");
                    }
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), new BentoBaseRowState((BentoBaseRowState.Start) null, "Update placeholder", "Update date", (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.f2779x59907a3d, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer2, BentoBaseRowState.$stable << 3, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.equities.eventupdates.EquityEventUpdateRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityEventUpdateRow.EquityEventUpdatePlaceholderRow$lambda$5(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
