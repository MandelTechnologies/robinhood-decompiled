package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.disclosures.lib.p107ui.DisclosureText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShortEventContractDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ShortEventContractDisclosure", "", "modifier", "Landroidx/compose/ui/Modifier;", "onOpenEventContractDisclosure", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.ShortEventContractDisclosureKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ShortEventContractDisclosure {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortEventContractDisclosure$lambda$2(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        ShortEventContractDisclosure(modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ShortEventContractDisclosure(final Modifier modifier, final Function0<Unit> onOpenEventContractDisclosure, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onOpenEventContractDisclosure, "onOpenEventContractDisclosure");
        Composer composerStartRestartGroup = composer.startRestartGroup(-338449601);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenEventContractDisclosure) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-338449601, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.ShortEventContractDisclosure (ShortEventContractDisclosure.kt:10)");
            }
            int i5 = i3;
            int i6 = C16594R.string.short_event_contract_disclosure;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i5 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ShortEventContractDisclosureKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortEventContractDisclosure.ShortEventContractDisclosure$lambda$1$lambda$0(onOpenEventContractDisclosure, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            DisclosureText2.DisclosureText(i6, modifier2, (Function1) objRememberedValue, composerStartRestartGroup, (i5 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ShortEventContractDisclosureKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortEventContractDisclosure.ShortEventContractDisclosure$lambda$2(modifier, onOpenEventContractDisclosure, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortEventContractDisclosure$lambda$1$lambda$0(Function0 function0, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }
}
